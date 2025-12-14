# Text Wrapping Implementation Guide

## Overview

Java-office implements **automatic text wrapping** (word wrap) in JTextPane, a feature that is **not enabled by default** in Swing's text components. This ensures text flows naturally within the page boundaries, similar to Microsoft Word or other word processors.

The system provides:
- **Automatic line breaks** when text reaches the edge
- **Word-level wrapping** (not character-level)
- **Respect for page margins** and boundaries
- **Dynamic reflow** when the window is resized
- **No horizontal scrolling** required

## Why Custom Implementation?

### JTextPane's Default Behavior

By default, `JTextPane` behaves like this:

```
Without wrapping:
┌────────────────────────────┐
│ This is a very long line that just keeps going and going →│
└────────────────────────────┘
                              ↑
                    Horizontal scrollbar appears
```

**Default Characteristics**:
- ✅ Rich text support (bold, italic, colors)
- ✅ Styled paragraphs
- ✅ Embedded components
- ❌ **No automatic line wrapping**
- ❌ **Text extends horizontally forever**
- ❌ **Requires horizontal scrolling**

### The Challenge

For a word processor, we need:
1. Text to **wrap** at the right margin
2. **Automatic reflow** when resizing
3. **Word boundaries** respected (don't break mid-word)
4. **No horizontal scrollbar** needed
5. Work with **styled text** (fonts, colors, sizes)

### Why JTextPane Doesn't Wrap by Default

JTextPane is designed for **code editors** and **console outputs** where:
- Long lines should remain on one line
- Horizontal scrolling is acceptable
- Line integrity is important (e.g., log files)

**Word processors** have different needs:
- Text should flow like printed pages
- Fixed page width
- Reading comfort

## Architecture

### Component Hierarchy

```
┌─────────────────────────────────────────────┐
│           JTextPane                         │
│  ┌───────────────────────────────────────┐  │
│  │   WrapEditorKit (Custom EditorKit)    │  │
│  │  ┌─────────────────────────────────┐  │  │
│  │  │  WrapColumnFactory (ViewFactory) │  │  │
│  │  │  ┌───────────────────────────┐  │  │  │
│  │  │  │  Custom ParagraphView     │  │  │  │
│  │  │  │  - Override size calc     │  │  │  │
│  │  │  │  - Force minimum = 0      │  │  │  │
│  │  │  │  - Enable wrapping        │  │  │  │
│  │  │  └───────────────────────────┘  │  │  │
│  │  └─────────────────────────────────┘  │  │
│  └───────────────────────────────────────┘  │
└─────────────────────────────────────────────┘
```

### How Swing Text Layout Works

**Normal Flow** (without wrapping):

```
1. Document contains text
        ↓
2. Views calculate preferred size
        ↓
3. Parent container asks: "How wide do you want to be?"
        ↓
4. View responds: "I need 1000 pixels for this line"
        ↓
5. Container says: "OK, I'll give you 1000 pixels"
        ↓
6. Result: Very wide component, horizontal scrolling
```

**With Wrapping** (our custom implementation):

```
1. Document contains text
        ↓
2. Views calculate preferred size
        ↓
3. Parent container asks: "How wide do you want to be?"
        ↓
4. Custom View responds: "My minimum width is 0"
                         "I'll fit in whatever space you give me"
        ↓
5. Container says: "I'll give you 400 pixels (page width)"
        ↓
6. View breaks text across multiple lines to fit
        ↓
7. Result: Text wraps, no horizontal scrolling
```

## Implementation Details

### 1. WrapEditorKit Class

Located in [WrapEditorKit.java](../java-word/src/main/java/com/oudepotelegomenon/WrapEditorKit.java) (lines 1-67), this custom EditorKit replaces the default view creation.

```java
public class WrapEditorKit extends StyledEditorKit {
    private final ViewFactory defaultFactory = new WrapColumnFactory();

    @Override
    public ViewFactory getViewFactory() {
        return defaultFactory;
    }
}
```

**Key Concept**: By extending `StyledEditorKit`, we:
- Keep all rich text features (bold, italic, colors)
- Only change how text is laid out (wrapping behavior)
- Override `getViewFactory()` to provide custom views

### 2. WrapColumnFactory Class

The `ViewFactory` creates appropriate `View` objects for each element type:

```java
class WrapColumnFactory implements ViewFactory {
    @Override
    public View create(Element elem) {
        String kind = elem.getName();
        if (kind != null) {
            if (kind.equals(AbstractDocument.ContentElementName)) {
                return new LabelView(elem);
            } else if (kind.equals(AbstractDocument.ParagraphElementName)) {
                return new ParagraphView(elem) {
                    // CUSTOM WRAPPING LOGIC HERE
                };
            } else if (kind.equals(AbstractDocument.SectionElementName)) {
                return new BoxView(elem, View.Y_AXIS);
            } else if (kind.equals(StyleConstants.ComponentElementName)) {
                return new ComponentView(elem);
            } else if (kind.equals(StyleConstants.IconElementName)) {
                return new IconView(elem);
            }
        }
        return new LabelView(elem);
    }
}
```

**Element Type Mapping**:

| Element Type | View Type | Purpose |
|--------------|-----------|---------|
| `ContentElementName` | `LabelView` | Individual text runs |
| `ParagraphElementName` | **Custom `ParagraphView`** | **Paragraphs (wrapping enabled)** |
| `SectionElementName` | `BoxView` (Y_AXIS) | Document root container |
| `ComponentElementName` | `ComponentView` | Embedded Swing components |
| `IconElementName` | `IconView` | Embedded icons |

### 3. Custom ParagraphView - The Heart of Wrapping

The magic happens in the anonymous `ParagraphView` subclass:

```java
return new ParagraphView(elem) {
    @Override
    public void setInsets(short top, short left, short bottom, short right) {
        super.setInsets(top, left, bottom, right);
    }

    @Override
    public int getFlowSpan(int index) {
        return super.getFlowSpan(index);
    }

    @Override
    protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {
        r = super.calculateMinorAxisRequirements(axis, r);
        r.minimum = 0;        // ← KEY LINE #1
        r.preferred = 100;    // ← KEY LINE #2
        return r;
    }
};
```

#### Understanding Major and Minor Axes

**For Vertical Text Flow** (standard English):
- **Major Axis** = Y (vertical) - primary flow direction
- **Minor Axis** = X (horizontal) - line width

```
Major Axis (Y) ↓          Minor Axis (X) →
Line 1 text wraps here    ←─────────────────
Line 2 continues below    
Line 3 and so on...       
```

#### The calculateMinorAxisRequirements() Method

This method is **crucial** - it determines how wide a view wants to be.

**SizeRequirements Object**:

```java
class SizeRequirements {
    int minimum;    // Smallest acceptable width
    int preferred;  // Ideal width
    int maximum;    // Largest acceptable width
    float alignment; // Alignment (0.0 = left, 0.5 = center, 1.0 = right)
}
```

**Default Behavior** (without our override):

```java
protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {
    r = super.calculateMinorAxisRequirements(axis, r);
    // r.minimum might be 500 (widest word)
    // r.preferred might be 1000 (full line width)
    // r.maximum might be Integer.MAX_VALUE
    return r;
}
```

**Our Custom Behavior**:

```java
protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {
    r = super.calculateMinorAxisRequirements(axis, r);
    r.minimum = 0;        // Accept ANY width (even very narrow)
    r.preferred = 100;    // Suggest small width (forces wrapping)
    return r;
}
```

### Why This Works

#### The Negotiation Process

When Swing lays out components, it negotiates sizes:

**Step 1: Parent asks child views for size requirements**

```java
// Container asks ParagraphView:
SizeRequirements req = paragraphView.calculateMinorAxisRequirements(X_AXIS, null);

// Default ParagraphView would say:
// req.minimum = 500  "I need at least 500 pixels"
// req.preferred = 1000 "I prefer 1000 pixels"

// Our custom ParagraphView says:
// req.minimum = 0    "I can work with ANY width"
// req.preferred = 100 "I'd like 100 pixels"
```

**Step 2: Parent allocates space**

```java
// Container has 400 pixels available (page width)
// It allocates: paragraphView.setSize(400, height);
```

**Step 3: View adjusts to fit**

```java
// ParagraphView sees it has 400 pixels width
// It wraps text to fit in 400 pixels:

Without wrapping (minimum = 500):
┌────────────┐
│ This is a long line that extends... │ ← Needs 1000px
└────────────┘                             ← Gets clipped/scrollbar

With wrapping (minimum = 0):
┌────────────┐
│ This is a  │  ← Fits in 400px
│ long line  │  ← Wraps automatically
│ that ext...│
└────────────┘
```

#### Setting minimum = 0: The Key Insight

```java
r.minimum = 0;
```

This tells Swing:
- "I can shrink to **zero width** if needed"
- "I won't demand horizontal space"
- "I'll adapt to whatever width you give me"

**Result**: The parent container doesn't need to expand horizontally, so no horizontal scrollbar appears.

#### Setting preferred = 100: Encouraging Wrapping

```java
r.preferred = 100;
```

This suggests a small width, which:
- Encourages wrapping even when space is available
- Ensures text doesn't take up more width than necessary
- Helps with consistent layout

**Note**: The actual value (100) is somewhat arbitrary - it's just a hint. The container will allocate based on available space (e.g., page width of 595 or 794 pixels).

### 4. How Wrapping Actually Happens

The `ParagraphView` class (from Swing) has built-in wrapping logic:

```
ParagraphView Internal Flow:

1. Receive allocated width (e.g., 400 pixels)
        ↓
2. Get child views (LabelView for each text run)
        ↓
3. Layout children horizontally:
   - Place first word
   - Place second word
   - Check if next word fits
   - If NO: Start new line
   - If YES: Continue on same line
        ↓
4. Calculate total height needed (number of lines × line height)
        ↓
5. Report height back to parent
```

**Example**:

```
Text: "The quick brown fox jumps over the lazy dog"
Available width: 200 pixels

Layout process:
Line 1: "The quick brown"      ← 180 pixels (fits)
        Try "fox": 180 + 45 = 225 pixels (exceeds 200)
        → Start new line

Line 2: "fox jumps over"       ← 195 pixels (fits)
        Try "the": 195 + 40 = 235 pixels (exceeds 200)
        → Start new line

Line 3: "the lazy dog"         ← 185 pixels (fits)
```

### 5. Integration in App.java

The custom EditorKit is applied when creating pages:

```java
private static JTextPane createPageWithText(String text) {
    JTextPane page = new JTextPane();
    page.setEditorKit(new WrapEditorKit());  // ← Apply wrapping
    page.setPreferredSize(PAGE_SIZE);
    page.setBorder(new CompoundBorder(
        new LineBorder(Color.LIGHT_GRAY, 1),
        new EmptyBorder(MARGIN, MARGIN, MARGIN, MARGIN)
    ));
    // ... rest of setup ...
}
```

**Effect**:
- Every `JTextPane` page uses `WrapEditorKit`
- Text automatically wraps within page boundaries
- No horizontal scrolling needed

## Visual Examples

### Example 1: Long Line Wrapping

**Input Text**:
```
"This is a very long sentence that contains many words and will definitely need to wrap when displayed in a fixed-width container."
```

**Without WrapEditorKit** (default JTextPane):
```
┌────────────────────────────┐
│ This is a very long sentence that contains many words and will definitely need to wrap when displayed in a fixed-width container. │
└────────────────────────────┘
   ← Content extends beyond visible area
   ← Horizontal scrollbar appears
```

**With WrapEditorKit**:
```
┌────────────────────────────┐
│ This is a very long        │
│ sentence that contains     │
│ many words and will        │
│ definitely need to wrap    │
│ when displayed in a fixed- │
│ width container.           │
└────────────────────────────┘
   ✓ All text visible
   ✓ No horizontal scrollbar
```

### Example 2: Window Resize Behavior

**Initial Width (400px)**:
```
┌──────────────────────┐
│ The quick brown fox  │
│ jumps over the lazy  │
│ dog.                 │
└──────────────────────┘
```

**Wider Window (600px)** - Text reflows:
```
┌───────────────────────────────┐
│ The quick brown fox jumps     │
│ over the lazy dog.            │
└───────────────────────────────┘
```

**Narrower Window (200px)** - More wrapping:
```
┌──────────┐
│ The quick│
│ brown fox│
│ jumps    │
│ over the │
│ lazy dog.│
└──────────┘
```

## Technical Deep Dive

### 1. View Layout Process

Swing's text layout follows this sequence:

```
1. Layout Request
   Container: "I need to display this component"
        ↓
2. Size Negotiation
   Container → View: getMinimumSize()
   Container → View: getPreferredSize()
   Container → View: getMaximumSize()
        ↓
3. Size Allocation
   Container → View: setSize(width, height)
        ↓
4. Internal Layout
   View arranges its children within allocated space
        ↓
5. Painting
   View draws itself and children
```

### 2. FlowView Layout Strategy

`ParagraphView` extends `FlowView`, which implements line-breaking logic:

```java
// Simplified FlowView algorithm
void layout(int targetSpan) {
    int currentX = 0;
    int currentLine = 0;
    
    for (View child : children) {
        int childWidth = child.getPreferredSpan(X_AXIS);
        
        if (currentX + childWidth > targetSpan) {
            // Doesn't fit on current line
            currentLine++;
            currentX = 0;
        }
        
        // Place child on current line
        child.setPosition(currentX, currentLine * lineHeight);
        currentX += childWidth;
    }
}
```

### 3. Word vs. Character Breaking

By default, `ParagraphView` breaks at **word boundaries**:

```
Good (word break):
┌──────────┐
│ The quick│  ← Breaks after "quick"
│ brown    │
└──────────┘

Bad (character break):
┌──────────┐
│ The qui  │  ← Breaks mid-word
│ ck brown │
└──────────┘
```

**How it works**:
- `LabelView` represents individual text runs (words)
- `ParagraphView` arranges `LabelView` objects
- Breaking happens between `LabelView`s, not within them

### 4. The Role of setInsets() and getFlowSpan()

These overridden methods maintain compatibility:

```java
@Override
public void setInsets(short top, short left, short bottom, short right) {
    super.setInsets(top, left, bottom, right);
}
```

**Purpose**: Ensures paragraph indentation and spacing work correctly.

```java
@Override
public int getFlowSpan(int index) {
    return super.getFlowSpan(index);
}
```

**Purpose**: Returns the width available for child views (accounts for insets).

**Note**: These methods are overridden but delegate to `super`, maintaining default behavior while signaling intent to customize the view.

## Interaction with Other Features

### 1. Text Wrapping + Pagination

```
Page boundaries:
┌────────────────────┐
│ This is line one   │  ← Wraps at page width (595px)
│ This is line two   │
│ This is line three │
│ ...                │
│ (Page break)       │
└────────────────────┘
     Gap (20px)
┌────────────────────┐
│ Continued text...  │  ← Still wraps at page width
└────────────────────┘
```

Both features work together:
- **WrapEditorKit** handles horizontal wrapping
- **PagedEditorKit** handles vertical pagination

### 2. Text Wrapping + Margins

```
Page with margins:
┌────────────────────────────┐
│ ┌──────────────────────┐   │ ← Margin (72px)
│ │ Text wraps here      │   │
│ │ within the margin    │   │
│ │ boundaries           │   │
│ └──────────────────────┘   │
└────────────────────────────┘
```

The `EmptyBorder` margins reduce the available width, causing wrapping to occur earlier.

### 3. Text Wrapping + Styled Text

```java
// Bold text in a paragraph
StyledDocument doc = textPane.getStyledDocument();
SimpleAttributeSet bold = new SimpleAttributeSet();
StyleConstants.setBold(bold, true);
doc.insertString(0, "Bold text ", bold);
doc.insertString(10, "normal text", null);
```

**Result**:
```
┌────────────────────┐
│ Bold text normal   │  ← Wrapping respects styling
│ text               │
└────────────────────┘
```

Each styled run is a separate `LabelView`, and wrapping occurs between them.

## Performance Considerations

### 1. Reflow Efficiency

When the window is resized, Swing must:
1. Detect size change
2. Request new layout
3. Calculate line breaks
4. Reposition all text views
5. Repaint the component

**Optimization**: Swing caches layout calculations and only reflows when necessary.

### 2. Large Documents

For very large documents:

```
Without wrapping:
- One very long line
- Simple to calculate
- But bad UX (horizontal scrolling)

With wrapping:
- Many lines
- More complex layout
- Better UX (no scrolling)
```

**Trade-off**: Slightly more CPU for layout, but much better user experience.

### 3. Font Changes

When font size changes:

```java
page.setFont(new Font("Arial", Font.PLAIN, 24));
```

This triggers:
1. Recalculate preferred widths
2. Re-layout all paragraphs
3. Adjust line breaks
4. Repaint

**Impact**: Minimal on modern hardware, even with thousands of lines.

## Dimensions and Calculations

### Page Width Calculation

```java
// App.java
private static final Dimension PAGE_SIZE = new Dimension(794, 1123);  // A4 @ 96 DPI
private static final int MARGIN = 72;  // 1 inch margins

// Effective text width:
int textWidth = PAGE_SIZE.width - (MARGIN * 2);
// = 794 - 144 = 650 pixels
```

**Text wraps at**: ~650 pixels (accounting for margins)

### Example: Character Capacity

With average character width of ~8 pixels:
```
650 pixels ÷ 8 pixels/char = ~81 characters per line
```

This varies based on:
- Font family (monospace vs. proportional)
- Font size
- Character mix (W vs. i)

## Code References

### Key Files

- **WrapEditorKit.java**: Complete implementation
  - Lines 1-67: Full class
  - Lines 10-61: `WrapColumnFactory` class
  - Lines 27-50: Custom `ParagraphView` with wrapping logic
  - Lines 42-49: `calculateMinorAxisRequirements()` override

- **App.java**: Integration
  - Line 2943: `page.setEditorKit(new WrapEditorKit())`
  - Lines 87-89: Page size and margin constants

### Related Swing Classes

- `javax.swing.text.StyledEditorKit`: Base class for rich text
- `javax.swing.text.ParagraphView`: Handles paragraph layout
- `javax.swing.text.View`: Base view class
- `javax.swing.text.ViewFactory`: Creates views for elements
- `javax.swing.SizeRequirements`: Size negotiation

## Advantages and Limitations

### Advantages ✅

1. **Simple Implementation**: Only ~60 lines of code
2. **Reuses Swing's Layout**: Leverages built-in `ParagraphView` logic
3. **Maintains Rich Text**: All styling features work normally
4. **Dynamic Reflow**: Automatically adjusts to window size
5. **Word-Level Breaking**: Doesn't break mid-word
6. **Performance**: Efficient even with large documents

### Limitations ❌

1. **No Hyphenation**: Words never split across lines
2. **No Custom Break Points**: Can't specify preferred break locations
3. **Limited Control**: Can't easily customize wrapping algorithm
4. **No Right-to-Left**: Not optimized for RTL languages
5. **Fixed Strategy**: Always wraps at word boundaries

## Alternative Approaches

### Approach 1: LineWrapKit (Deprecated)

Older Swing versions had `LineWrapKit`, but it:
- Was removed in newer Java versions
- Had limited functionality
- Didn't work well with styled text

### Approach 2: HTML Rendering

Use `JEditorPane` with HTML:

```java
JEditorPane pane = new JEditorPane("text/html", 
    "<html><body width='400px'>Text here</body></html>");
```

**Pros**: Automatic wrapping  
**Cons**: Limited styling, HTML quirks, slower rendering

### Approach 3: Custom Layout Manager

Write a custom `LayoutManager` for wrapping:

**Pros**: Complete control  
**Cons**: Very complex, error-prone, reinventing the wheel

**Decision**: Overriding `calculateMinorAxisRequirements()` provides the simplest, most reliable solution.

## Debugging Tips

### Visualizing Layout

Add debug output to see layout decisions:

```java
return new ParagraphView(elem) {
    @Override
    protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {
        r = super.calculateMinorAxisRequirements(axis, r);
        System.out.printf("Before: min=%d, pref=%d, max=%d%n", 
                         r.minimum, r.preferred, r.maximum);
        r.minimum = 0;
        r.preferred = 100;
        System.out.printf("After: min=%d, pref=%d, max=%d%n", 
                         r.minimum, r.preferred, r.maximum);
        return r;
    }
};
```

### Testing Wrapping

Create a test with known content:

```java
JTextPane pane = new JTextPane();
pane.setEditorKit(new WrapEditorKit());
pane.setText("A ".repeat(100));  // 100 words
pane.setPreferredSize(new Dimension(200, 400));
// Should see multiple lines of "A A A A..."
```

### Common Issues

**Issue**: Text doesn't wrap  
**Cause**: Wrong EditorKit or not applied  
**Fix**: Verify `page.getEditorKit() instanceof WrapEditorKit`

**Issue**: Wrapping too aggressive  
**Cause**: Container width too small  
**Fix**: Check page size and margins

**Issue**: Wrapping breaks mid-word  
**Cause**: Very long words (URLs, etc.)  
**Fix**: This is expected behavior; consider hyphenation for improvement

## Future Enhancements

Potential improvements:

1. **Hyphenation**: Break very long words with hyphens
2. **Custom Break Points**: Allow soft hyphens (­) or zero-width spaces
3. **Justification**: Full text justification (expand spaces to align right edge)
4. **Hanging Punctuation**: Extend punctuation beyond margin
5. **Widow/Orphan Control**: Prevent single lines at page breaks
6. **Configurable Strategy**: Choose between word, character, or custom breaking
7. **RTL Support**: Better handling of right-to-left languages

## Summary

The text wrapping implementation demonstrates:

1. **Minimal Override Strategy**: Only override what's necessary (`calculateMinorAxisRequirements`)
2. **Leverage Existing Code**: Use Swing's built-in `ParagraphView` wrapping logic
3. **Size Negotiation**: Understand how Swing's layout system works
4. **The Power of Zero**: Setting `minimum = 0` enables flexible width
5. **Rich Text Compatibility**: Maintain all styled text features while adding wrapping

This elegant solution (~60 lines) transforms JTextPane from a code editor component into a proper word processor, enabling the familiar text wrapping behavior users expect.

## Contributing

When modifying text wrapping:

1. Test with various window sizes (narrow to wide)
2. Verify behavior with different font sizes
3. Check performance with large documents (10,000+ words)
4. Test with mixed styling (bold, italic, different sizes)
5. Ensure compatibility with pagination system
6. Test edge cases (very long words, special characters)
7. Verify no horizontal scrollbars appear

The wrapping system is foundational to the word processor's usability, so changes should preserve the core behavior while adding enhancements.

---

**[Next: Pagination →](Pagination.md)**
