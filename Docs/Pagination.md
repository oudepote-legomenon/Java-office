# Pagination Implementation Guide

## Overview

Java-office implements a Microsoft Word-like pagination system where documents are displayed as distinct pages with visible boundaries and gaps. This feature is **not built into JTextPane** by default, which normally displays content as a continuous scrolling area.

The pagination system provides:
- **Visual page boundaries** with white pages on a gray background
- **A4 page dimensions** (595 × 842 pixels at ~96 DPI)
- **Automatic page breaks** when content exceeds page height
- **Manual page break support** via document attributes
- **Page margins** (top and bottom)
- **Page gaps** for visual separation

## Why Custom Implementation?

### JTextPane's Default Behavior

By default, `JTextPane` provides:
- ✅ Rich text editing
- ✅ Styled text support
- ✅ Unlimited vertical scrolling
- ❌ **No concept of pages**
- ❌ **No automatic page breaks**
- ❌ **No visual page boundaries**

### The Challenge

To create a word processor, we need:
1. Content to flow across multiple distinct pages
2. Visual page boundaries (like printed paper)
3. Automatic overflow from one page to the next
4. Respect for margins and page dimensions
5. Support for manual page breaks

## Architecture Overview

The pagination system consists of three main components:

```
┌─────────────────────────────────────────────────┐
│           JTextPane (Text Editor)               │
│  ┌───────────────────────────────────────────┐  │
│  │      PagedEditorKit (Custom EditorKit)    │  │
│  │  ┌─────────────────────────────────────┐  │  │
│  │  │  PagedViewFactory (ViewFactory)     │  │  │
│  │  │  ┌───────────────────────────────┐  │  │  │
│  │  │  │  PagedRootView (BoxView)      │  │  │  │
│  │  │  │  - Layout paragraphs into     │  │  │  │
│  │  │  │    pages                      │  │  │  │
│  │  │  │  - Handle page breaks         │  │  │  │
│  │  │  │  - Calculate page heights     │  │  │  │
│  │  │  └───────────────────────────────┘  │  │  │
│  │  └─────────────────────────────────────┘  │  │
│  └───────────────────────────────────────────┘  │
└─────────────────────────────────────────────────┘
             ↓ rendered on top of ↓
┌─────────────────────────────────────────────────┐
│      PagePainter (Background Component)         │
│  - Draws white page rectangles                  │
│  - Draws gray borders                           │
│  - Positions pages with gaps                    │
└─────────────────────────────────────────────────┘
```

## Component 1: PagedEditorKit

### Purpose

`PagedEditorKit` is a custom `StyledEditorKit` that replaces JTextPane's default view rendering system with our paginated version.

### Implementation

```java
public class PagedEditorKit extends StyledEditorKit {
    @Override
    public ViewFactory getViewFactory() {
        return new PagedViewFactory();
    }
}
```

**Key Concept**: An `EditorKit` in Swing is responsible for:
- Creating views that render document content
- Handling document I/O
- Managing document editing behavior

By overriding `getViewFactory()`, we provide custom view creation logic.

### PagedViewFactory

The `ViewFactory` determines which `View` class to use for each element type:

```java
private static class PagedViewFactory implements ViewFactory {
    public View create(Element elem) {
        String kind = elem.getName();
        if (kind != null) {
            switch (kind) {
                case AbstractDocument.SectionElementName:
                    return new PagedRootView(elem);  // ← Custom pagination logic
                case AbstractDocument.ParagraphElementName:
                    return new ParagraphView(elem);   // ← Standard paragraph
                case AbstractDocument.ContentElementName:
                    return new LabelView(elem);       // ← Standard text
                case StyleConstants.ComponentElementName:
                    return new ComponentView(elem);   // ← Embedded components
                case StyleConstants.IconElementName:
                    return new IconView(elem);        // ← Icons
            }
        }
        return new LabelView(elem);
    }
}
```

**Document Structure Hierarchy**:
```
Document Root (Section Element)     → PagedRootView
    ├── Paragraph Element            → ParagraphView
    │   └── Content Element          → LabelView
    ├── Paragraph Element            → ParagraphView
    │   └── Content Element          → LabelView
    └── ...
```

### PagedRootView: The Heart of Pagination

`PagedRootView` extends `BoxView` and overrides layout methods to implement page-based positioning.

#### Constants

```java
private final int pageHeight = 842;        // A4 height in pixels (~11.7 inches @ 96 DPI)
private final int pageGap = 20;            // Vertical space between pages
private final int marginTop = 70;          // Top margin (~1 inch)
private final int marginBottom = 70;       // Bottom margin (~1 inch)
```

**Dimensions Explanation**:
- **A4 Paper**: 210mm × 297mm
- **At 96 DPI**: 794 × 1123 pixels (used in App.java for page size)
- **At 72 DPI** (used internally for layout): 595 × 842 pixels
- **Usable Height**: 842 - 70 - 70 = **702 pixels** per page

#### Method 1: layoutMajorAxis() - Positioning Content

This method is called by Swing to position child views (paragraphs) along the Y-axis.

```java
@Override
protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {
    super.layoutMajorAxis(targetSpan, axis, offsets, spans);

    int usablePageHeight = pageHeight - marginTop - marginBottom;  // 702 pixels
    int totalOffset = marginTop;      // Start at top margin
    int currentYOnPage = 0;           // Track Y position within current page

    for (int i = 0; i < getViewCount(); i++) {
        View v = getView(i);
        int viewHeight = spans[i];    // Height of this paragraph
        AttributeSet attrs = v.getElement().getAttributes();
        boolean isPageBreak = (attrs != null && attrs.getAttribute("PAGE_BREAK") != null);

        // Check if we need a page break
        if (isPageBreak || (currentYOnPage > 0 && currentYOnPage + viewHeight > usablePageHeight)) {
            // Move to next page
            int remainingOnPage = usablePageHeight - currentYOnPage;
            totalOffset += remainingOnPage;              // Fill rest of current page
            totalOffset += marginBottom + pageGap + marginTop;  // Add spacing
            currentYOnPage = 0;
        }

        offsets[i] = totalOffset + currentYOnPage;
        currentYOnPage += viewHeight;
    }
}
```

**Visual Representation**:

```
┌────────────────────────┐
│     Margin Top (70)    │
├────────────────────────┤
│                        │
│  Paragraph 1 (100px)   │  ← offsets[0] = 70
│                        │
│  Paragraph 2 (50px)    │  ← offsets[1] = 170
│                        │
│  Paragraph 3 (200px)   │  ← offsets[2] = 220
│                        │
│  Paragraph 4 (400px)   │  ← Would exceed page (220 + 400 > 702)
│                        │     So PAGE BREAK occurs
│  (Page break here)     │
├────────────────────────┤
│   Margin Bottom (70)   │
└────────────────────────┘
      Page Gap (20)
┌────────────────────────┐
│     Margin Top (70)    │
├────────────────────────┤
│                        │
│  Paragraph 4 (400px)   │  ← offsets[3] = 70 + 702 + 70 + 20 + 70 = 932
│                        │
```

**Algorithm Step-by-Step**:

1. **Initialize**: Start at `totalOffset = marginTop` (70)
2. **For each paragraph**:
   - Get its height from `spans[i]`
   - Check if it fits on current page: `currentYOnPage + viewHeight <= usablePageHeight`
   - **If it fits**: Position at `totalOffset + currentYOnPage`
   - **If it doesn't fit**:
     - Fill remaining space of current page
     - Add bottom margin, gap, and top margin of next page
     - Reset `currentYOnPage = 0`
     - Position paragraph at start of new page
3. **Update**: `currentYOnPage += viewHeight`

**Page Break Triggers**:
1. **Automatic**: Content exceeds `usablePageHeight`
2. **Manual**: Element has `PAGE_BREAK` attribute

#### Method 2: getPreferredSpan() - Calculating Total Height

This method tells Swing how tall the entire document should be.

```java
@Override
public float getPreferredSpan(int axis) {
    if (axis == View.X_AXIS) {
        return super.getPreferredSpan(axis);  // Width handled normally
    }

    // Calculate total height by simulating page layout
    float totalContentHeight = 0;
    for (int i = 0; i < getViewCount(); i++) {
        totalContentHeight += getView(i).getPreferredSpan(View.Y_AXIS);
    }

    int usablePageHeight = pageHeight - marginTop - marginBottom;
    if (totalContentHeight == 0) {
        return pageHeight;  // Empty document = 1 page
    }

    // Simulate layout to count pages
    int numPages = 0;
    float heightLeft = 0;
    
    for (int i = 0; i < getViewCount(); i++) {
        View v = getView(i);
        AttributeSet attrs = v.getElement().getAttributes();
        boolean isPageBreak = (attrs != null && attrs.getAttribute("PAGE_BREAK") != null);
        float viewHeight = v.getPreferredSpan(View.Y_AXIS);
        
        if (isPageBreak || (heightLeft > 0 && heightLeft + viewHeight > usablePageHeight)) {
            numPages++;
            heightLeft = 0;
        }
        heightLeft += viewHeight;
    }
    numPages = Math.max(1, numPages);

    // Total height = all pages + gaps between them
    return (float) numPages * pageHeight + (numPages - 1) * pageGap;
}
```

**Formula**:
```
Total Height = (numPages × pageHeight) + ((numPages - 1) × pageGap)

Example with 3 pages:
= (3 × 842) + (2 × 20)
= 2526 + 40
= 2566 pixels
```

**Why Simulate Layout?**

We must count pages to determine total height, because:
- Manual page breaks affect page count
- Content distribution isn't uniform
- We need to account for margins and gaps

## Component 2: PagePainter

### Purpose

`PagePainter` is a transparent `JComponent` layered **behind** the `JTextPane` that draws:
- White rectangles representing paper
- Gray borders around each page
- Proper spacing between pages

### Layer Structure

```
┌─────────────────────────────────────┐
│     JScrollPane (Scroll Container)  │
│  ┌───────────────────────────────┐  │
│  │   JLayeredPane                │  │
│  │  ┌─────────────────────────┐  │  │
│  │  │  PagePainter            │  │  │  ← Background layer
│  │  │  (draws white pages)    │  │  │
│  │  └─────────────────────────┘  │  │
│  │  ┌─────────────────────────┐  │  │
│  │  │  JTextPane              │  │  │  ← Foreground layer
│  │  │  (transparent bg)       │  │  │     (text on top)
│  │  └─────────────────────────┘  │  │
│  └───────────────────────────────┘  │
└─────────────────────────────────────┘
```

### Implementation

```java
public class PagePainter extends JComponent {
    private final JTextPane textPane;
    private final int pageWidth = 595;
    private final int pageHeight = 842;
    private final int pageGap = 20;

    public PagePainter(JTextPane textPane) {
        this.textPane = textPane;
        setOpaque(false);  // Transparent background
    }

    @Override
    public Dimension getPreferredSize() {
        return textPane.getPreferredSize();  // Match text pane size
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Dimension prefSize = textPane.getPreferredSize();
        if (prefSize.height == 0) return;

        // Calculate number of pages needed
        int numPages = (prefSize.height + pageGap) / (pageHeight + pageGap);
        if (prefSize.height % (pageHeight + pageGap) > 0) numPages++;
        numPages = Math.max(1, numPages);

        int y = 0;
        for (int i = 0; i < numPages; i++) {
            // Center horizontally
            int x = (getWidth() - pageWidth) / 2;
            if (x < 0) x = 0;

            // Draw page background
            g2.setColor(Color.WHITE);
            g2.fillRect(x, y, pageWidth, pageHeight);
            
            // Draw page border
            g2.setColor(Color.LIGHT_GRAY);
            g2.drawRect(x, y, pageWidth - 1, pageHeight - 1);

            y += pageHeight + pageGap;
        }
    }
}
```

**Key Points**:

1. **Transparent**: `setOpaque(false)` ensures text shows through
2. **Synchronized Size**: Returns `textPane.getPreferredSize()` to stay in sync
3. **Page Calculation**: Divides total height by `(pageHeight + pageGap)`
4. **Centered Pages**: `(getWidth() - pageWidth) / 2` centers horizontally
5. **Drawing Order**: White fill first, then gray border on top

### Visual Effect

```
Background (gray from container):
╔═══════════════════════════════════════╗
║                                       ║
║  ┌─────────────────────────────┐     ║  ← White page
║  │ Page 1                      │     ║
║  │                             │     ║
║  │ [Text rendered on top]      │     ║
║  │                             │     ║
║  └─────────────────────────────┘     ║
║            (gap - 20px)              ║
║  ┌─────────────────────────────┐     ║  ← White page
║  │ Page 2                      │     ║
║  │                             │     ║
║  └─────────────────────────────┘     ║
║                                       ║
╚═══════════════════════════════════════╝
```

## Integration in App.java

### Setting Up Pagination

```java
// Create a page with pagination support
private static JTextPane createPageWithText(String text) {
    JTextPane page = new JTextPane();
    page.setEditorKit(new WrapEditorKit());  // Text wrapping (separate feature)
    page.setPreferredSize(PAGE_SIZE);        // A4 size: 794 × 1123
    page.setBorder(new CompoundBorder(
        new LineBorder(Color.LIGHT_GRAY, 1),
        new EmptyBorder(MARGIN, MARGIN, MARGIN, MARGIN)  // 72px margins
    ));
    page.setBackground(Color.WHITE);
    // ... event listeners ...
}
```

**Note**: The app currently uses `WrapEditorKit` instead of `PagedEditorKit`. This suggests pagination is primarily visual (via `PagePainter`) rather than using the full `PagedEditorKit` layout system. This is a simpler approach suitable for the multi-page design.

### Multi-Page Document Structure

The application uses **multiple JTextPane instances** for pages:

```java
private static List<JTextPane> pages = new ArrayList<>();
private static final Dimension PAGE_SIZE = new Dimension(794, 1123);  // A4 at ~96 DPI
private static final int MARGIN = 72;  // ~1 inch
```

Each page is a separate `JTextPane`, arranged vertically in a panel.

## Key Technical Concepts

### 1. View Hierarchy in Swing Text

Swing's text component architecture:

```
Document (Data)
    ↓
Element (Structure)
    ↓
View (Visual Representation)
    ↓
Renderer (Actual Drawing)
```

**View Types**:
- `BoxView`: Container for other views (horizontal or vertical)
- `ParagraphView`: Renders a paragraph
- `LabelView`: Renders text content
- `ComponentView`: Embeds Swing components
- `IconView`: Displays icons

### 2. Major vs Minor Axis

- **Major Axis**: Primary flow direction (Y for vertical, X for horizontal)
- **Minor Axis**: Perpendicular direction

For `PagedRootView`:
- Major axis = **Y** (vertical stacking)
- Minor axis = **X** (horizontal width)

### 3. Layout Delegation

```java
@Override
protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {
    super.layoutMajorAxis(targetSpan, axis, offsets, spans);
    // First, let parent calculate natural layout
    // Then, modify offsets to insert page breaks
}
```

**Strategy**: 
1. Call `super.layoutMajorAxis()` to get natural layout
2. Modify the `offsets` array to insert gaps for page breaks
3. Leave `spans` (heights) unchanged

### 4. Z-Order Layering

```java
JLayeredPane layeredPane = new JLayeredPane();
layeredPane.add(pagePainter, JLayeredPane.DEFAULT_LAYER);     // Back
layeredPane.add(textPane, JLayeredPane.PALETTE_LAYER);        // Front
```

This ensures text appears on top of the page background.

### 5. Coordinate Spaces

**Screen Coordinates**: Absolute pixel positions  
**Component Coordinates**: Relative to component's top-left  
**Document Offsets**: Character positions in the document

The layout system works in component coordinates.

## Manual Page Breaks

### Setting a Page Break Attribute

```java
StyledDocument doc = textPane.getStyledDocument();
int caretPos = textPane.getCaretPosition();
Element paragraph = doc.getParagraphElement(caretPos);

SimpleAttributeSet attrs = new SimpleAttributeSet();
attrs.addAttribute("PAGE_BREAK", Boolean.TRUE);

doc.setParagraphAttributes(
    paragraph.getStartOffset(),
    paragraph.getEndOffset() - paragraph.getStartOffset(),
    attrs,
    false  // Don't replace other attributes
);
```

### Detection in Layout

```java
AttributeSet attrs = v.getElement().getAttributes();
boolean isPageBreak = (attrs != null && attrs.getAttribute("PAGE_BREAK") != null);

if (isPageBreak) {
    // Force page break even if there's room on current page
    // ... move to next page ...
}
```

## Coordinate Calculation Examples

### Example 1: First Page

```
Content:
- Paragraph 1: 100px tall
- Paragraph 2: 150px tall
- Paragraph 3: 200px tall

Layout:
┌────────────────┐
│ Top Margin: 70 │
├────────────────┤
│ Para 1: 100px  │  offset[0] = 70
│ Para 2: 150px  │  offset[1] = 170 (70 + 100)
│ Para 3: 200px  │  offset[2] = 320 (70 + 100 + 150)
│                │
│ (space: 282px) │
├────────────────┤
│ Bottom: 70     │
└────────────────┘
Total: 842px
```

### Example 2: Page Overflow

```
Content:
- Paragraph 1: 600px tall
- Paragraph 2: 300px tall

Usable height per page: 702px

Layout:
┌────────────────┐
│ Top: 70        │
├────────────────┤
│ Para 1: 600px  │  offset[0] = 70
│                │
│ (space: 102px) │
├────────────────┤
│ Bottom: 70     │
└────────────────┘
     Gap: 20
┌────────────────┐
│ Top: 70        │
├────────────────┤
│ Para 2: 300px  │  offset[1] = 70 + 702 + 70 + 20 + 70 = 932
│                │
│ (space: 402px) │
├────────────────┤
│ Bottom: 70     │
└────────────────┘

Calculation for offset[1]:
- Previous page used: 70 (top margin)
- Remaining on page: 702 - 600 = 102
- Fill remaining: 102
- Add bottom margin: 70
- Add gap: 20
- Add top margin of next page: 70
Total: 70 + 600 + 102 + 70 + 20 + 70 = 932
```

## Dimensions Reference

### A4 Paper Sizes

| Unit | Width | Height |
|------|-------|--------|
| Millimeters | 210mm | 297mm |
| Inches | 8.27" | 11.69" |
| Pixels (72 DPI) | 595px | 842px |
| Pixels (96 DPI) | 794px | 1123px |

### Used in Code

| Constant | Value | Purpose |
|----------|-------|---------|
| `pageWidth` | 595px | Visual page width (PagePainter) |
| `pageHeight` | 842px | Visual page height |
| `PAGE_SIZE` | 794×1123px | JTextPane preferred size |
| `MARGIN` | 72px | Page margins (≈1 inch) |
| `marginTop` | 70px | Layout top margin |
| `marginBottom` | 70px | Layout bottom margin |
| `pageGap` | 20px | Space between pages |

### Why Different Dimensions?

- **PagePainter** uses 72 DPI (595×842) for visual rendering
- **App.java** uses 96 DPI (794×1123) for actual editing area
- The difference creates appropriate margins and visual spacing

## Code References

### Key Files

- **PagedEditorKit.java**: Custom EditorKit with pagination logic
  - Lines 1-113: Complete implementation
  - Lines 14-34: `PagedViewFactory`
  - Lines 36-111: `PagedRootView` with layout algorithms

- **PagePainter.java**: Visual page rendering
  - Lines 1-53: Complete implementation
  - Lines 24-53: `paintComponent()` method

- **App.java**: Integration and multi-page management
  - Lines 81-83: Page list and dimensions
  - Lines 2942+: `createPageWithText()` method

## Advantages and Limitations

### Advantages ✅

1. **Visual Clarity**: Users see distinct pages like a real word processor
2. **Print Preview**: WYSIWYG - what you see is what prints
3. **Familiar UX**: Behaves like Microsoft Word or Google Docs
4. **Flexible**: Supports both automatic and manual page breaks
5. **Efficient**: Leverages Swing's existing view system

### Limitations ❌

1. **No Cross-Page Elements**: Tables or images can't span pages
2. **Simple Layout**: No columns, headers, or footers per page
3. **Fixed Page Size**: A4 only, no custom sizes
4. **Manual Coordination**: PagePainter must sync with text pane
5. **No Dynamic Reflow**: Changing margins requires relayout

## Alternative Approaches Considered

### Approach 1: Multiple JTextPane Instances (Current)

**Pros**: Simple, each page is independent  
**Cons**: Content doesn't flow between pages automatically

### Approach 2: Single JTextPane with PagedEditorKit

**Pros**: Content flows naturally, one document  
**Cons**: More complex, requires careful view management

### Approach 3: Custom Component from Scratch

**Pros**: Complete control  
**Cons**: Reimplementing all text editing functionality

**Decision**: The current hybrid approach (multiple pages + visual rendering) balances simplicity with functionality.

## Future Enhancements

Potential improvements:

1. **Dynamic Page Sizing**: Support Letter, Legal, A3, custom sizes
2. **Page Headers/Footers**: Repeating content on each page
3. **Page Numbers**: Automatic numbering
4. **Landscape Orientation**: Horizontal page layout
5. **Cross-Page Elements**: Tables and images spanning pages
6. **Column Layout**: Multi-column page formatting
7. **Smart Page Breaks**: Keep paragraphs together, widow/orphan control

## Debugging Tips

### Common Issues

**Issue**: Text overlaps page boundaries  
**Cause**: Incorrect margin calculations  
**Fix**: Verify `usablePageHeight` matches actual margins

**Issue**: Pages don't align with visual boundaries  
**Cause**: PagePainter and text pane sizes out of sync  
**Fix**: Ensure `getPreferredSize()` matches

**Issue**: Manual page breaks don't work  
**Cause**: Attribute not set on correct element  
**Fix**: Use `setParagraphAttributes()` on paragraph element

### Logging Layout

```java
@Override
protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {
    super.layoutMajorAxis(targetSpan, axis, offsets, spans);
    
    System.out.println("=== Layout Debug ===");
    for (int i = 0; i < getViewCount(); i++) {
        System.out.printf("View %d: offset=%d, span=%d%n", i, offsets[i], spans[i]);
    }
}
```

## Summary

The pagination system in Java-office achieves Microsoft Word-like page display through:

1. **Custom View Hierarchy**: `PagedEditorKit` → `PagedViewFactory` → `PagedRootView`
2. **Smart Layout Algorithm**: Calculates when content exceeds page boundaries
3. **Visual Rendering**: `PagePainter` draws page backgrounds and borders
4. **Margin Management**: Respects top/bottom margins and inter-page gaps
5. **Manual Control**: Supports explicit page break attributes

This implementation demonstrates how to extend Swing's text component architecture to add features not available out-of-the-box, creating a professional word processing experience while maintaining compatibility with standard Swing components.

## Contributing

When modifying pagination:

1. Test with various content sizes (short, medium, very long)
2. Verify page breaks occur at correct positions
3. Check margin calculations match visual page boundaries
4. Ensure `getPreferredSpan()` returns correct total height
5. Test manual page breaks with `PAGE_BREAK` attribute
6. Verify PagePainter draws correct number of pages
7. Check performance with large documents

The pagination system is foundational to the word processor, so changes should be thoroughly tested across different scenarios.

---

**[← Previous: Wrap Text](Wrap%20text.md)** | **[Next: Lists →](Lists.md)**
