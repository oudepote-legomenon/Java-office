# Wavy Underline Implementation Guide

## Overview

Java-office implements **wavy underlines** (similar to Microsoft Word's squiggly lines) to highlight spelling and grammar errors. This visual feedback system is **not built into JTextPane or Swing's Highlighter API** by default.

The system provides:
- **Red wavy underlines** for spelling errors
- **Blue wavy underlines** for grammar/style errors
- **Multi-line support** when errors span multiple lines
- **Pixel-perfect positioning** under the error text
- **Non-intrusive highlighting** that doesn't interfere with text editing

## Why Custom Implementation?

### JTextPane's Default Highlighting

Swing's built-in `Highlighter` API provides:
- ✅ Simple rectangular highlighting
- ✅ Background color changes
- ✅ Position tracking as text changes
- ❌ **No wavy underlines**
- ❌ **No custom drawing patterns**
- ❌ **Limited to solid colors/rectangles**

### The Challenge

To provide Word-like spell checking, we need:
1. Underlines that appear **below** the text (not background highlighting)
2. **Wavy pattern** to distinguish from regular underlines
3. **Different colors** for different error types
4. **Multi-line support** for errors spanning line breaks
5. **Automatic positioning** that updates as text changes

## Architecture

### Component Interaction

```
┌─────────────────────────────────────────────────────┐
│           SpellCheckerService                       │
│  - Detects errors using LanguageTool               │
│  - Creates RuleMatch objects                        │
└───────────────┬─────────────────────────────────────┘
                ↓
┌─────────────────────────────────────────────────────┐
│           JTextPane.getHighlighter()                │
│  - Manages all highlights in the document          │
└───────────────┬─────────────────────────────────────┘
                ↓
┌─────────────────────────────────────────────────────┐
│     UnderlineHighlightPainter (Custom Painter)      │
│  - Implements Highlighter.HighlightPainter          │
│  - Draws wavy lines at calculated positions         │
│  - Handles single-line and multi-line cases         │
└─────────────────────────────────────────────────────┘
                ↓
┌─────────────────────────────────────────────────────┐
│           Graphics2D                                │
│  - Renders the actual wavy pattern                 │
│  - Uses arc drawing for wave effect                │
└─────────────────────────────────────────────────────┘
```

## Implementation Details

### 1. The UnderlineHighlightPainter Class

Located in [App.java](../java-word/src/main/java/com/oudepotelegomenon/App.java) (lines 319-360), this custom painter implements Swing's `Highlighter.HighlightPainter` interface.

#### Class Structure

```java
private static class UnderlineHighlightPainter implements Highlighter.HighlightPainter {
    private final Color color;

    public UnderlineHighlightPainter(Color color) {
        this.color = color;
    }

    @Override
    public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
        // Main painting logic
    }

    private void drawWavyLine(Graphics g, int x1, int y, int x2, int y2) {
        // Draw the actual wavy pattern
    }
}
```

#### Constants Used

```java
private static final Highlighter.HighlightPainter SPELLING_ERROR_PAINTER = 
    new UnderlineHighlightPainter(Color.RED);

private static final Highlighter.HighlightPainter GRAMMAR_ERROR_PAINTER = 
    new UnderlineHighlightPainter(Color.BLUE);
```

### 2. The paint() Method - Core Highlighting Logic

This method is called by Swing's rendering system to draw the highlight.

```java
@Override
public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
    try {
        // Convert document positions to screen coordinates
        Rectangle r0 = c.modelToView(p0);  // Start of error
        Rectangle r1 = c.modelToView(p1);  // End of error
        
        if (r0 == null || r1 == null) return;

        g.setColor(color);
        int y = r0.y + r0.height - 1;  // Position at bottom of text

        // Check if error spans multiple lines
        if (r0.y == r1.y) {
            // CASE 1: Single line error
            drawWavyLine(g, r0.x, y, r1.x, y);
        } else {
            // CASE 2: Multi-line error
            
            // First line: from error start to end of line
            drawWavyLine(g, r0.x, y, (int) bounds.getBounds().getMaxX(), y);
            
            // Middle lines: full width of text area
            for (int lineY = y + c.getFontMetrics(c.getFont()).getHeight(); 
                 lineY < r1.y; 
                 lineY += c.getFontMetrics(c.getFont()).getHeight()) {
                drawWavyLine(g, (int) bounds.getBounds().getMinX(), lineY, 
                            (int) bounds.getBounds().getMaxX(), lineY);
            }
            
            // Last line: from start of line to error end
            drawWavyLine(g, (int) bounds.getBounds().getMinX(), 
                        r1.y + r1.height - 1, r1.x, r1.y + r1.height - 1);
        }
    } catch (BadLocationException e) {
        // Position is invalid, skip drawing
    }
}
```

#### Key Concepts

**Document Positions vs. Screen Coordinates**

```
Document Model:          Screen View:
┌─────────────┐         ┌─────────────────────┐
│ Text in     │         │                     │
│ JTextPane   │  →→→→→  │  Rendered text at   │
│ (offsets)   │         │  (x, y) coordinates │
└─────────────┘         └─────────────────────┘
   modelToView()
```

- **`p0`**: Character offset where error starts (e.g., position 45)
- **`p1`**: Character offset where error ends (e.g., position 52)
- **`modelToView(p0)`**: Converts offset to Rectangle with (x, y, width, height)

**Example**:
```java
// Document has "The quik brown fox"
//              012345678901234567
//                  ↑    ↑
//                 p0=4  p1=8 ("quik")

Rectangle r0 = modelToView(4);  // r0 = {x:30, y:10, width:5, height:16}
Rectangle r1 = modelToView(8);  // r1 = {x:55, y:10, width:5, height:16}

// Draw wavy line from x=30 to x=55 at y=26 (10 + 16)
```

**Y-Position Calculation**

```java
int y = r0.y + r0.height - 1;
```

This places the underline **at the bottom of the text**:

```
┌──────────┐
│  Text    │  ← r0.y (top of text)
│          │
│          │  ← r0.height (text height)
└~~~~~~~~~~┘  ← y = r0.y + r0.height - 1 (underline position)
```

### 3. Single-Line Error Handling

For errors on one line:

```java
if (r0.y == r1.y) {
    drawWavyLine(g, r0.x, y, r1.x, y);
}
```

**Visual Example**:

```
Text:   The quik brown fox jumps
            ~~~~
            ^   ^
           r0.x r1.x

drawWavyLine(g, r0.x, y, r1.x, y);
```

### 4. Multi-Line Error Handling

For errors spanning multiple lines (rare but possible):

```java
else {
    // First line: from error start to end of line
    drawWavyLine(g, r0.x, y, (int) bounds.getBounds().getMaxX(), y);
    
    // Middle lines (if any)
    for (int lineY = y + lineHeight; lineY < r1.y; lineY += lineHeight) {
        drawWavyLine(g, (int) bounds.getBounds().getMinX(), lineY, 
                    (int) bounds.getBounds().getMaxX(), lineY);
    }
    
    // Last line: from start of line to error end
    drawWavyLine(g, (int) bounds.getBounds().getMinX(), 
                r1.y + r1.height - 1, r1.x, r1.y + r1.height - 1);
}
```

**Visual Example**:

```
Line 1: The quik br-    ← bounds.getMaxX() = right edge
            ~~~~~~~~
            ^       ^
           r0.x    MaxX

Line 2: own fox jum-    ← Full line width
        ~~~~~~~~~~~~
        ^           ^
       MinX        MaxX

Line 3: ps over         ← End of error
        ~~~
        ^  ^
       MinX r1.x
```

**Line Height Calculation**:

```java
int lineHeight = c.getFontMetrics(c.getFont()).getHeight();
```

`FontMetrics.getHeight()` returns:
```
Height = Ascent + Descent + Leading

Example:
  Ascent  = 12px (height above baseline)
  Descent = 3px  (height below baseline)
  Leading = 1px  (spacing between lines)
  ─────────────
  Total   = 16px
```

### 5. The drawWavyLine() Method - Drawing the Wave Pattern

This is where the actual wavy pattern is created:

```java
private void drawWavyLine(Graphics g, int x1, int y, int x2, int y2) {
    for (int x = x1; x < x2; x += 4) {
        g.drawArc(x, y, 2, 2, 0, 180);        // Upper arc
        g.drawArc(x + 2, y, 2, 2, 180, 181);  // Lower arc
    }
}
```

#### How It Works

**Arc Drawing Basics**:

```java
drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
```

- **x, y**: Top-left corner of bounding rectangle
- **width, height**: Size of bounding rectangle
- **startAngle**: Start angle in degrees (0° = 3 o'clock)
- **arcAngle**: How many degrees to draw

**The Pattern**:

```
Step 1: x=0
┌─┐
│ │ 2x2 box
└─┘
 ︶  ← Arc from 0° to 180° (upper semicircle)

Step 2: x=2
  ┌─┐
  │ │ 2x2 box
  └─┘
   ︵  ← Arc from 180° to 361° (lower semicircle)

Step 3: x=4
    ┌─┐
    │ │
    └─┘
     ︶  ← Upper arc again

Result:
 ︶ ︵ ︶ ︵ ︶ ︵ ︶ ︵
```

**Iteration Explanation**:

```java
for (int x = x1; x < x2; x += 4) {
    // x1 = starting position
    // x2 = ending position
    // x += 4 = move 4 pixels right each step (2px arc + 2px arc)
    
    // Example: x1=10, x2=50
    // x = 10: draw arcs at 10 and 12
    // x = 14: draw arcs at 14 and 16
    // x = 18: draw arcs at 18 and 20
    // ... continues until x >= 50
}
```

**Arc Parameters Detailed**:

```java
g.drawArc(x, y, 2, 2, 0, 180);
//        │  │  │  │  │   │
//        │  │  │  │  │   └─ Draw 180° (half circle)
//        │  │  │  │  └───── Start at 0° (right side)
//        │  │  │  └────────  Height = 2 pixels
//        │  │  └─────────── Width = 2 pixels
//        │  └────────────── Y position (baseline)
//        └───────────────── X position

g.drawArc(x + 2, y, 2, 2, 180, 181);
//        │      │  │  │  │    │
//        │      │  │  │  │    └─ Draw 181° (slightly more than half)
//        │      │  │  │  └────── Start at 180° (left side)
//        │      │  │  └───────── Height = 2 pixels
//        │      │  └──────────── Width = 2 pixels
//        │      └─────────────── Y position (same baseline)
//        └────────────────────── X + 2 (shifted right)
```

**Why 181° instead of 180°**?

Using `arcAngle = 181` instead of `180` ensures slight overlap, preventing gaps in the wave pattern due to rounding errors.

### Visual Representation

#### Detailed Wave Anatomy

```
Pixel-level breakdown of wavy line:

Position: x=0
┌──┐
│  │ ← Bounding box (2x2)
└──┘
 ︶   ← drawArc(0, y, 2, 2, 0, 180) draws this

Position: x=2
  ┌──┐
  │  │ ← Bounding box (2x2)
  └──┘
   ︵  ← drawArc(2, y, 2, 2, 180, 181) draws this

Position: x=4
    ┌──┐
    │  │
    └──┘
     ︶

Combined result:
 ︶ ︵ ︶ ︵ ︶ ︵ ︶ ︵
```

#### Color Coding

```
Spelling Error (RED):
The quik brown fox
    ~~~~           ← Red wavy underline

Grammar Error (BLUE):
They is going home
     ~~            ← Blue wavy underline
```

## Integration with Spell Checking

### Step-by-Step Flow

**1. Error Detection**

```java
// SpellCheckerService.checkAllPages()
List<RuleMatch> matches = langTool.check(text);
// matches contains errors with positions
```

**2. Painter Selection**

```java
for (RuleMatch match : matches) {
    Highlighter.HighlightPainter painter;
    
    if (match.getRule().isDictionaryBasedSpellingRule()) {
        painter = SPELLING_ERROR_PAINTER;  // Red wavy
    } else {
        painter = GRAMMAR_ERROR_PAINTER;   // Blue wavy
    }
    
    // ... apply highlight ...
}
```

**3. Applying Highlight**

```java
highlighter.addHighlight(
    match.getFromPos(),        // Start position (p0)
    match.getToPos(),          // End position (p1)
    painter                    // UnderlineHighlightPainter instance
);
```

**4. Automatic Rendering**

Swing's rendering system automatically calls `painter.paint()` when:
- The component is repainted
- The text scrolls
- The window is resized
- The document changes

### Data Flow Diagram

```
User Types
    ↓
Document Listener Fires
    ↓
SpellCheckerService.triggerCheck()
    ↓
Timer (1 second debounce)
    ↓
checkAllPages()
    ↓
LanguageTool.check()
    ↓
RuleMatch objects created
    ↓
Determine painter (RED or BLUE)
    ↓
highlighter.addHighlight(start, end, painter)
    ↓
Swing rendering system
    ↓
UnderlineHighlightPainter.paint() called
    ↓
drawWavyLine() draws the pattern
    ↓
User sees wavy underline
```

## Technical Deep Dive

### 1. Coordinate System

JTextPane uses three coordinate systems:

**Document Offsets** (Model):
```
Character positions: 0, 1, 2, 3, ...
Example: "Hello" → H=0, e=1, l=2, l=3, o=4
```

**View Rectangles** (View):
```
Each character has a Rectangle:
- x: horizontal position
- y: vertical position
- width: character width
- height: line height
```

**Screen Pixels** (Graphics):
```
Actual pixels on screen where drawing occurs
```

**Conversion**:
```java
// Model → View
Rectangle rect = textPane.modelToView(offset);

// View → Model
int offset = textPane.viewToModel(point);
```

### 2. Why BadLocationException?

```java
try {
    Rectangle r0 = c.modelToView(p0);
} catch (BadLocationException e) {
    // Handle gracefully
}
```

**When it occurs**:
- Document was modified between highlight creation and painting
- Position is beyond document length
- Document is being restructured

**Why it's safe to ignore**: The highlight will be recreated on the next spell check cycle.

### 3. Performance Considerations

#### Efficient Drawing

```java
for (int x = x1; x < x2; x += 4) {
    // Only draws what's needed
    // Skip calculation: x += 4 is faster than x++
}
```

**Why x += 4?**
- Each wave segment is 4 pixels wide (2 upper + 2 lower)
- Skipping pixels would create gaps
- x += 4 draws continuously

#### Clipping

The Graphics object is automatically clipped to visible area:

```
┌────────────────────┐
│ Visible Viewport   │  ← Only this area is drawn
│                    │
│ [wavy line here]   │
│                    │
└────────────────────┘
      ↑
  Scrolled content below is not rendered
```

### 4. Anti-Aliasing

For smoother curves, you could enable anti-aliasing:

```java
public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                       RenderingHints.VALUE_ANTIALIAS_ON);
    // ... rest of paint code ...
}
```

**Trade-off**: Smoother appearance vs. slightly slower rendering.

## Advanced Scenarios

### Handling Different Font Sizes

The wavy line automatically adjusts:

```java
int y = r0.y + r0.height - 1;  // Scales with font height
```

**Small Font** (10px):
```
text ← 10px tall
~~~~   ← underline at y + 10
```

**Large Font** (20px):
```
TEXT ← 20px tall
~~~~   ← underline at y + 20
```

### Handling Bold/Italic Text

The painter doesn't care about font style:

```java
This is **bold** text with errors
         ~~~~     ← Works the same
```

### Handling Different Colors in Text

Wavy underlines are drawn **after** text rendering, so they appear on top of any text colors or backgrounds.

## Example Scenarios

### Scenario 1: Single Word Error

```
Document: "The quik fox"
Error: "quik" at positions 4-8

Steps:
1. modelToView(4) → Rectangle{x:25, y:5, width:5, height:14}
2. modelToView(8) → Rectangle{x:48, y:5, width:5, height:14}
3. y = 5 + 14 - 1 = 18
4. Same line (y values equal)
5. drawWavyLine(g, 25, 18, 48, 18)
6. Result: ~~~~~ drawn from x=25 to x=48 at y=18
```

### Scenario 2: Multi-Line Error (Unlikely but Possible)

```
Document: 
"The quick br-
own fox jumps"

Error: "brown" spans two lines (positions 10-15)

Steps:
1. modelToView(10) → Rectangle{x:65, y:5, ...} (line 1)
2. modelToView(15) → Rectangle{x:15, y:21, ...} (line 2)
3. Different y values (5 ≠ 21)
4. Draw first line: (65, y:19) to (rightEdge, 19)
5. Draw last line: (leftEdge, 35) to (15, 35)
6. Result: wavy lines on both lines
```

## Code References

### Key Files

- **App.java**: Main implementation
  - Lines 98-99: Painter constants
  - Lines 319-360: `UnderlineHighlightPainter` class
  - Lines 321-325: Constructor
  - Lines 327-350: `paint()` method
  - Lines 352-358: `drawWavyLine()` method
  - Lines 274-300: Highlight application in `checkAllPages()`

### Related Components

- **SpellCheckerService**: Lines 241-315
- **Error detection**: Lines 274-300
- **Painter selection**: Lines 285-289

## Advantages and Limitations

### Advantages ✅

1. **Non-Invasive**: Doesn't modify document content
2. **Automatic Updates**: Positions update when text changes
3. **Multi-Line Support**: Handles errors spanning lines
4. **Color Coding**: Different colors for different error types
5. **Performance**: Only draws visible portions
6. **Integration**: Works seamlessly with Swing's Highlighter API

### Limitations ❌

1. **Fixed Pattern**: Wave size and frequency are hardcoded (4px cycle)
2. **No Customization**: Can't easily change wave amplitude or frequency
3. **Basic Graphics**: Uses simple arcs, not smooth Bézier curves
4. **2-Pixel Waves**: Small at large font sizes
5. **Color Only**: Can't have different wave styles (dotted, dashed)

## Alternative Approaches

### Approach 1: TextAttribute.UNDERLINE (Built-in)

```java
SimpleAttributeSet attrs = new SimpleAttributeSet();
attrs.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
```

**Pros**: Built into Java  
**Cons**: Only straight underlines, not wavy

### Approach 2: Custom View Rendering

Override `ParagraphView.paint()` to draw underlines.

**Pros**: More control  
**Cons**: Complex, requires custom EditorKit

### Approach 3: Overlay Component

Draw wavy lines on a transparent overlay component.

**Pros**: Complete freedom  
**Cons**: Hard to sync with text positions

**Decision**: Using `Highlighter.HighlightPainter` provides the best balance of simplicity and functionality.

## Future Enhancements

Potential improvements:

1. **Configurable Wave Size**: Allow adjusting amplitude and frequency
2. **Smooth Curves**: Use `QuadCurve2D` or `CubicCurve2D` for smoother waves
3. **Wave Styles**: Different patterns (dotted, dashed, thick, thin)
4. **Animation**: Subtle animation to draw attention
5. **Tooltip on Hover**: Show error message when hovering over underline
6. **Color Themes**: Customizable colors for different error types
7. **Accessibility**: Alternative indicators for color-blind users

## Debugging Tips

### Visualizing Positions

Add debug output to see what's being drawn:

```java
public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
    try {
        Rectangle r0 = c.modelToView(p0);
        Rectangle r1 = c.modelToView(p1);
        
        System.out.printf("Drawing underline: p0=%d, p1=%d, x=%d to %d, y=%d%n",
                         p0, p1, r0.x, r1.x, r0.y + r0.height - 1);
        
        // ... rest of paint code ...
    }
}
```

### Testing Wave Pattern

Test the wave drawing in isolation:

```java
public static void main(String[] args) {
    JFrame frame = new JFrame("Wave Test");
    JPanel panel = new JPanel() {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            drawWavyLine(g, 10, 50, 200, 50);
        }
    };
    frame.add(panel);
    frame.setSize(400, 200);
    frame.setVisible(true);
}
```

### Common Issues

**Issue**: Underlines don't appear  
**Cause**: Painter not being called  
**Fix**: Verify highlight was added: `highlighter.getHighlights().length > 0`

**Issue**: Underlines in wrong position  
**Cause**: `modelToView()` returning null or incorrect values  
**Fix**: Check for null and verify document positions

**Issue**: Jagged or broken waves  
**Cause**: Rounding errors in arc drawing  
**Fix**: Use `181` degrees instead of `180` for slight overlap

**Issue**: Performance issues with many errors  
**Cause**: Too many highlights  
**Fix**: Implement highlight recycling or limit visible errors

## Summary

The wavy underline implementation demonstrates how to:

1. **Extend Swing's Highlighter API** with custom painting logic
2. **Convert document positions to screen coordinates** using `modelToView()`
3. **Draw complex patterns** using basic Graphics primitives (arcs)
4. **Handle multi-line scenarios** with proper coordinate calculations
5. **Integrate with spell checking** for visual error feedback

This relatively simple implementation (≈40 lines of code) provides professional-quality error highlighting that rivals commercial word processors, showing the power of understanding Swing's component architecture.

## Contributing

When modifying wavy underlines:

1. Test with various font sizes (8pt to 72pt)
2. Verify multi-line error rendering
3. Check performance with 100+ errors
4. Test with different text colors and backgrounds
5. Ensure underlines don't interfere with text selection
6. Verify proper cleanup when errors are fixed
7. Test with right-to-left languages (if supported)

The wavy underline system is tightly coupled with spell checking, so coordinate changes with the `SpellCheckerService` documentation.
