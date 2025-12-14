# Lists Implementation Guide

## Overview

The Java-office word processor implements three types of lists that are not natively supported by JTextPane:
- **Numbered Lists** (1., 2., 3., ...)
- **Bulleted Lists** (• item)
- **Checkbox/Ticked Lists** (✓ item)

This document explains the implementation approach, key challenges, and how the list system works.

## Core Concepts

### Why Custom Implementation?

JTextPane doesn't provide built-in list support like Microsoft Word or LibreOffice. Lists are not part of the standard `StyledDocument` API. Therefore, a custom solution was needed that:

1. Adds list markers (numbers, bullets, checkmarks) as regular text
2. Automatically continues the list when the user presses Enter
3. Allows ending the list by pressing Enter on an empty list item
4. Supports applying list formatting to existing text selections
5. Properly removes list markers when toggling off

### Implementation Strategy

The implementation uses a **text-based approach** where list markers are inserted as actual characters in the document, combined with **KeyListeners** to provide automatic list continuation behavior.

## Architecture

### 1. Commands and Toggle Groups

Each list type has a toggle command:

```java
public static Command numberedListCommand;
public static Command bulletedListCommand;
public static Command tickedListCommand;
```

All three commands belong to the same `CommandToggleGroupModel`, ensuring only one list type can be active at a time:

```java
CommandToggleGroupModel paragraphToggleGroupModel = new CommandToggleGroupModel();

numberedListCommand = Command.builder()
    .setIconFactory(list_order_svgrepo_com.factory())
    .setToggle()
    .inToggleGroup(paragraphToggleGroupModel)
    .build();
```

### 2. List Markers

List markers are defined as Unicode string constants:

```java
private static final String BULLET = "\u2022 ";  // • (bullet point)
private static final String TICK = "\u2713 ";    // ✓ (checkmark)
// Numbers are dynamic: "1. ", "2. ", "3. ", etc.
private static int listCounter = 1;  // Tracks current number in numbered lists
```

### 3. KeyListeners

Each list type has a dedicated KeyListener that handles automatic list continuation:

```java
private static java.awt.event.KeyListener numberedListKeyListener;
private static java.awt.event.KeyListener bulletListKeyListener;
private static java.awt.event.KeyListener tickedListKeyListener;
```

These listeners are **attached to the page when a list starts** and **removed when the list ends**.

## Detailed Implementation

### Numbered Lists

#### Starting a Numbered List

When the numbered list command is toggled **ON**:

**Case 1: No text selected** → Start a new list at cursor position

```java
if (start == end) {
    listCounter = 1;
    doc.insertString(page.getCaretPosition(), "1. ", page.getInputAttributes());
    listCounter++;
    page.addKeyListener(numberedListKeyListener);
}
```

**Case 2: Text selected** → Convert selected lines to numbered list

```java
Element root = doc.getDefaultRootElement();
int startLine = root.getElementIndex(start);
int endLine = root.getElementIndex(end);

// Iterate backwards to avoid offset issues when modifying text
for (int i = endLine; i >= startLine; i--) {
    Element line = root.getElement(i);
    int lineStart = line.getStartOffset();
    
    // Skip if line is beyond the selection end
    if (lineStart >= end && i == endLine) continue;
    
    // Calculate list number for this line
    int listNumber = (i - startLine) + 1;
    
    // Insert number at the start of the line
    doc.insertString(lineStart, listNumber + ". ", lineAttributes);
}
```

**Key Points:**
- Uses `getDefaultRootElement()` to access document structure
- `getElementIndex(offset)` returns the line number for a given character position
- Iterates **backwards** to prevent offset shifts when inserting text
- Formula `(i - startLine) + 1` ensures sequential numbering (1, 2, 3...)

#### Continuing a Numbered List (Enter Key Behavior)

The `numberedListKeyListener` handles Enter key presses:

```java
numberedListKeyListener = new java.awt.event.KeyAdapter() {
    @Override
    public void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            evt.consume(); // Prevent default Enter behavior
            
            JTextPane page = getFocusedPage();
            StyledDocument doc = page.getStyledDocument();
            int caretPos = page.getCaretPosition();
            
            // Find which line the caret is on
            Element root = doc.getDefaultRootElement();
            int lineIndex = root.getElementIndex(caretPos);
            Element lineElement = root.getElement(lineIndex);
            int lineStart = lineElement.getStartOffset();
            
            // Get text from line start to caret position
            String lineText = doc.getText(lineStart, caretPos - lineStart);
            
            // Check if line contains only "X. " (empty list item)
            if (lineText.trim().matches("\\d+\\.")) {
                // End the list
                doc.remove(lineStart, caretPos - lineStart);
                numberedListCommand.setToggleSelected(false);
                page.removeKeyListener(numberedListKeyListener);
            } else {
                // Continue the list with next number
                doc.insertString(caretPos, "\n" + listCounter + ". ", page.getInputAttributes());
                listCounter++;
            }
        }
    }
};
```

**Regex Explanation:**
- `\\d+\\.` matches one or more digits followed by a period
- Example: matches "1.", "2.", "42." but not "1. hello"
- Used to detect empty list items

#### Ending a Numbered List

When the toggle is turned **OFF**:

```java
// Remove the key listener
page.removeKeyListener(numberedListKeyListener);

// If text is selected, remove numbering from all selected lines
if (start != end) {
    Element root = doc.getDefaultRootElement();
    int startLine = root.getElementIndex(start);
    int endLine = root.getElementIndex(end);
    
    for (int i = endLine; i >= startLine; i--) {
        Element line = root.getElement(i);
        int lineStart = line.getStartOffset();
        String lineText = doc.getText(lineStart, line.getEndOffset() - lineStart);
        
        // Use regex to find and remove "1. ", "2. ", etc.
        java.util.regex.Matcher matcher = 
            java.util.regex.Pattern.compile("^\\d+\\.\\s+").matcher(lineText);
        
        if (matcher.find()) {
            doc.remove(lineStart, matcher.end());
        }
    }
}
```

**Regex Pattern:**
- `^\\d+\\.\\s+` matches:
  - `^` - start of string
  - `\\d+` - one or more digits
  - `\\.` - a literal period
  - `\\s+` - one or more whitespace characters
- Example: matches "1. ", "2.  ", "42.   "

### Bulleted Lists

#### Implementation

Bulleted lists follow the same pattern as numbered lists but use a constant marker:

**Starting a bulleted list:**

```java
bulletedListCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
    boolean makeBulleted = bulletedListCommand.isToggleSelected();
    
    if (makeBulleted) {
        if (start != end) {
            // Apply bullets to selected lines
            for (int i = endLine; i >= startLine; i--) {
                Element line = root.getElement(i);
                int lineStart = line.getStartOffset();
                String lineText = doc.getText(lineStart, line.getEndOffset() - lineStart);
                
                // Only add bullet if line doesn't already start with one
                if (!lineText.trim().startsWith("\u2022")) {
                    doc.insertString(lineStart, BULLET, lineAttributes);
                }
            }
        } else {
            // Start new bulleted list
            doc.insertString(page.getCaretPosition(), BULLET, page.getInputAttributes());
            page.addKeyListener(bulletListKeyListener);
        }
    }
}));
```

**KeyListener for bullets:**

```java
bulletListKeyListener = new java.awt.event.KeyAdapter() {
    @Override
    public void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            evt.consume();
            
            String lineText = doc.getText(lineStart, caretPos - lineStart);
            
            // Check if line contains only the bullet (empty list item)
            if (lineText.trim().equals("\u2022")) {
                doc.remove(lineStart, caretPos - lineStart);
                bulletedListCommand.setToggleSelected(false);
                page.removeKeyListener(bulletListKeyListener);
            } else {
                // Continue the list
                doc.insertString(caretPos, "\n" + BULLET, page.getInputAttributes());
            }
        }
    }
};
```

**Removing bullets:**

```java
if (lineText.trim().startsWith("\u2022")) {
    int idx = lineText.indexOf(BULLET);
    if (idx == 0) {
        doc.remove(lineStart, BULLET.length());
    }
}
```

### Checkbox/Ticked Lists

Checkbox lists work identically to bulleted lists, but use the checkmark character (`✓`):

```java
private static final String TICK = "\u2713 ";

tickedListCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
    boolean makeTicked = tickedListCommand.isToggleSelected();
    // ... same logic as bulleted lists but with TICK instead of BULLET
}));
```

## Key Technical Concepts

### 1. Document Element Hierarchy

```
StyledDocument
    └── Root Element (Section Element)
            ├── Paragraph Element (Line 0)
            ├── Paragraph Element (Line 1)
            ├── Paragraph Element (Line 2)
            └── ...
```

**Important Methods:**
- `doc.getDefaultRootElement()` → Returns the root container
- `root.getElementIndex(offset)` → Returns line number for character position
- `root.getElement(lineNum)` → Returns the element (line) at that index
- `element.getStartOffset()` → Character position where line begins
- `element.getEndOffset()` → Character position where line ends

### 2. Why Iterate Backwards?

When modifying text in a loop, **always iterate backwards** when possible:

```java
// GOOD - Backwards iteration
for (int i = endLine; i >= startLine; i--) {
    doc.insertString(lineStart, "• ", attributes);
}

// BAD - Forward iteration would cause offset issues
// for (int i = startLine; i <= endLine; i++) { ... }
```

**Reason:** When you insert text at line 3, all subsequent lines shift their offsets. If you iterate forwards, you need to recalculate offsets. Backwards iteration avoids this problem.

### 3. Event Consumption

```java
evt.consume();  // Prevents default Enter key behavior
```

This is **critical** because:
- Without `consume()`, pressing Enter would create TWO newlines (one from default behavior, one from our code)
- The custom KeyListener needs exclusive control over Enter key behavior

### 4. Toggle Group Behavior

The `CommandToggleGroupModel` ensures mutual exclusivity:

```java
CommandToggleGroupModel paragraphToggleGroupModel = new CommandToggleGroupModel();

numberedListCommand.inToggleGroup(paragraphToggleGroupModel);
bulletedListCommand.inToggleGroup(paragraphToggleGroupModel);
tickedListCommand.inToggleGroup(paragraphToggleGroupModel);
```

When one list type is activated, the others are automatically deactivated.

## Limitations and Trade-offs

### Current Limitations

1. **No Nested Lists**: The implementation doesn't support multi-level indentation
2. **No Auto-numbering Updates**: If you delete a line in a numbered list, subsequent numbers don't renumber automatically
3. **Text-Based Markers**: List markers are part of the text content, not metadata
4. **No Hanging Indent**: Text doesn't wrap with proper indentation under the list marker

### Why This Approach?

This text-based approach was chosen because:

✅ **Simple to implement** - No need to create custom Views or modify rendering pipeline  
✅ **Reliable** - Works with standard Swing components  
✅ **Compatible** - Can be saved/loaded like regular text  
✅ **Familiar** - Behaves similarly to simple text editors

❌ **Not as sophisticated** as dedicated word processors  
❌ **Requires manual marker management**

## Code References

### Key Files
- **Main Implementation**: [App.java](f:\Java-office\java-word\src\main\java\com\oudepotelegomenon\App.java) (lines 1407-1750)
- **Command Definitions**: Lines 177-179
- **KeyListener Definitions**: Lines 216-218
- **Constants**: Lines 218-220

### Key Methods
- `numberedListCommand.setAction()` - Line 1407
- `bulletedListCommand.setAction()` - Line 1555
- `tickedListCommand.setAction()` - Line 1635
- `numberedListKeyListener` creation - Line 1504
- `bulletListKeyListener` creation - Line 1622
- `tickedListKeyListener` creation - Line 1713

## Future Enhancements

Potential improvements to consider:

1. **Nested Lists**: Detect Tab key and increase indentation level
2. **Auto-Renumbering**: Update numbers when items are added/deleted
3. **Custom Paragraph Views**: Use proper paragraph styling instead of text markers
4. **Undo/Redo Support**: Better integration with document undo manager
5. **List Styles**: Different bullet types (○, ■, ►) and numbering formats (A, B, C or i, ii, iii)

## Contributing

When modifying list functionality:

1. Always test with both single-line and multi-line selections
2. Verify Enter key behavior (continue and end list)
3. Test toggling lists on/off multiple times
4. Check interaction with other formatting (bold, italic, etc.)
5. Ensure KeyListeners are properly attached and removed

## Example Usage Flow

### User Scenario: Creating a Numbered List

1. User clicks "Numbered List" button → Toggle selected
2. "1. " appears at cursor position
3. `numberedListKeyListener` is attached to the page
4. User types "First item" then presses Enter
5. KeyListener intercepts Enter, inserts "\n2. "
6. User types "Second item" then presses Enter
7. KeyListener inserts "\n3. "
8. User presses Enter again (on empty "3. ")
9. KeyListener detects empty item, removes "3. ", deselects toggle, removes listener
10. User continues typing normal text

### Internal Flow

```
User Action          →  Event Handler              →  Result
─────────────────────────────────────────────────────────────────
Click "Numbered"     →  Command.setAction()        →  Insert "1. "
                                                      Attach KeyListener
                                                      listCounter = 2
                     
Press Enter          →  KeyListener.keyPressed()   →  Check line content
                                                      Insert "\n2. "
                                                      listCounter = 3
                     
Press Enter          →  KeyListener.keyPressed()   →  Detect empty "2."
(on empty line)                                       Remove marker
                                                      Detach listener
                                                      Deselect toggle
```

## Troubleshooting

### Common Issues

**Issue**: Pressing Enter creates double newlines  
**Cause**: Missing `evt.consume()` in KeyListener  
**Fix**: Ensure all KeyListeners call `evt.consume()`

**Issue**: List numbers don't update when deleting items  
**Cause**: Numbers are static text, not dynamically calculated  
**Solution**: This is a known limitation; manual renumbering required

**Issue**: List markers disappear when applying formatting  
**Cause**: May be selecting and overwriting the marker  
**Solution**: Be careful not to select the marker when formatting text

**Issue**: Multiple lists interfere with each other  
**Cause**: Toggle group not working properly  
**Solution**: Verify all commands use `inToggleGroup(paragraphToggleGroupModel)`

## Summary

The list implementation in Java-office uses a pragmatic, text-based approach that:

- Treats list markers as regular characters in the document
- Uses KeyListeners to provide automatic list continuation
- Leverages the StyledDocument element hierarchy to work with lines
- Ensures only one list type is active through toggle groups
- Provides a familiar user experience despite JTextPane's limitations

While not as sophisticated as full-featured word processors, this implementation provides reliable, easy-to-maintain list functionality that integrates well with the rest of the application.
