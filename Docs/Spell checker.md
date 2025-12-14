# Spell Checker Implementation Guide

## Overview

Java-office implements a real-time spell and grammar checking system using **LanguageTool**, an open-source proofreading library. This feature is **not built into JTextPane** or Swing's text components, requiring a custom integration.

The spell checker provides:
- **Real-time error detection** as you type
- **Red wavy underlines** for spelling errors
- **Blue wavy underlines** for grammar and style errors
- **Context menu suggestions** with right-click correction
- **Debounced checking** to avoid performance issues
- **Multi-page support** across all document pages
- **Toggle on/off** functionality
- **Error count** in status bar

## Why Custom Implementation?

### JTextPane's Default Behavior

By default, `JTextPane` provides:
- ✅ Rich text editing
- ✅ Styled text support
- ✅ Document editing
- ❌ **No spell checking**
- ❌ **No grammar checking**
- ❌ **No error highlighting**
- ❌ **No correction suggestions**

### The Challenge

To create a professional word processor, we need:
1. Real-time error detection without blocking the UI
2. Visual error indicators (wavy underlines)
3. Correction suggestions via context menu
4. Efficient checking that doesn't slow down typing
5. Support for multiple languages
6. Distinction between spelling and grammar errors

## Architecture Overview

```
┌──────────────────────────────────────────────────────────┐
│                    Application Layer                      │
│  ┌────────────────────────────────────────────────────┐  │
│  │  Spell Check Toggle Command (UI Control)          │  │
│  │  - Start/Stop spell checking                      │  │
│  │  - Toggle button in status bar                    │  │
│  └────────────────────────────────────────────────────┘  │
│                          ↓                                │
│  ┌────────────────────────────────────────────────────┐  │
│  │         SpellCheckerService (Core Logic)          │  │
│  │  ┌──────────────────────────────────────────────┐ │  │
│  │  │  JLanguageTool (LanguageTool Library)        │ │  │
│  │  │  - Analyzes text for errors                  │ │  │
│  │  │  - Returns RuleMatch objects                 │ │  │
│  │  └──────────────────────────────────────────────┘ │  │
│  │  ┌──────────────────────────────────────────────┐ │  │
│  │  │  Timer (Debouncing)                          │ │  │
│  │  │  - Delays checking until typing stops        │ │  │
│  │  │  - Prevents lag during rapid input           │ │  │
│  │  └──────────────────────────────────────────────┘ │  │
│  └────────────────────────────────────────────────────┘  │
│                          ↓                                │
│  ┌────────────────────────────────────────────────────┐  │
│  │      Highlighter API (Error Visualization)        │  │
│  │  ┌──────────────────────────────────────────────┐ │  │
│  │  │  UnderlineHighlightPainter                   │ │  │
│  │  │  - Draws wavy red underlines (spelling)      │ │  │
│  │  │  - Draws wavy blue underlines (grammar)      │ │  │
│  │  └──────────────────────────────────────────────┘ │  │
│  └────────────────────────────────────────────────────┘  │
│                          ↓                                │
│  ┌────────────────────────────────────────────────────┐  │
│  │      errorsMap (Error Storage)                    │  │
│  │  Map<JTextPane, List<RuleMatch>>                  │  │
│  │  - Stores errors for each page                    │  │
│  │  - Used for context menu suggestions              │  │
│  └────────────────────────────────────────────────────┘  │
│                          ↓                                │
│  ┌────────────────────────────────────────────────────┐  │
│  │   Context Menu (User Interaction)                 │  │
│  │  - Right-click on error shows suggestions          │  │
│  │  - Click suggestion to replace error               │  │
│  └────────────────────────────────────────────────────┘  │
└──────────────────────────────────────────────────────────┘
```

## Component 1: LanguageTool Integration

### What is LanguageTool?

**LanguageTool** is an open-source proofreading software that:
- Detects spelling mistakes
- Finds grammar errors
- Suggests style improvements
- Supports 25+ languages
- Provides correction suggestions
- Uses rule-based pattern matching

### Maven Dependency

```xml
<dependency>
    <groupId>org.languagetool</groupId>
    <artifactId>languagetool-core</artifactId>
    <version>6.6</version>
</dependency>
```

### Imports

```java
import org.languagetool.JLanguageTool;
import org.languagetool.Languages;
import org.languagetool.rules.RuleMatch;
import java.io.IOException;
```

### Initialization

```java
JLanguageTool langTool = new JLanguageTool(Languages.getLanguageForShortCode("en-US"));
```

**Language Options**:
- `"en-US"` - American English
- `"en-GB"` - British English
- `"es"` - Spanish
- `"fr"` - French
- `"de"` - German
- And 20+ more languages

### Checking Text

```java
String text = "This is a sampel text with erors.";
List<RuleMatch> matches = langTool.check(text);

for (RuleMatch match : matches) {
    System.out.println("Error: " + match.getMessage());
    System.out.println("Position: " + match.getFromPos() + " to " + match.getToPos());
    System.out.println("Suggestions: " + match.getSuggestedReplacements());
    System.out.println("Rule: " + match.getRule().getDescription());
}
```

**Output**:
```
Error: Possible spelling mistake found
Position: 10 to 16
Suggestions: [sample, sampler, samples]
Rule: Spelling rule

Error: Possible spelling mistake found
Position: 27 to 32
Suggestions: [errors, eros, erose]
Rule: Spelling rule
```

### RuleMatch Object

The `RuleMatch` class provides:

| Method | Returns | Description |
|--------|---------|-------------|
| `getFromPos()` | int | Starting character position |
| `getToPos()` | int | Ending character position |
| `getMessage()` | String | Error description |
| `getSuggestedReplacements()` | List\<String\> | Correction suggestions |
| `getRule()` | Rule | The rule that was violated |
| `getRule().isDictionaryBasedSpellingRule()` | boolean | True if spelling error |

## Component 2: SpellCheckerService

### Purpose

`SpellCheckerService` is a custom class that manages the entire spell-checking lifecycle:
- Controls when checking occurs
- Debounces typing to prevent lag
- Stores error information
- Updates visual highlights
- Manages multi-page documents

### Class Structure

```java
private static class SpellCheckerService {
    private final JLanguageTool langTool;
    private final Timer checkTimer;
    private boolean isRunning = false;

    public SpellCheckerService() {
        this.langTool = new JLanguageTool(Languages.getLanguageForShortCode("en-US"));
        // Timer to delay checking until the user stops typing
        this.checkTimer = new Timer(1000, e -> checkAllPages());
        this.checkTimer.setRepeats(false);
    }

    public void start() { ... }
    public void stop() { ... }
    public void triggerCheck(JTextPane page) { ... }
    private void checkAllPages() { ... }
    private void clearAllHighlights() { ... }
}
```

### Fields Explained

**`langTool`** - The LanguageTool instance
- Initialized once and reused
- Configured for English (en-US)
- Thread-safe for repeated use

**`checkTimer`** - javax.swing.Timer for debouncing
- Delays checking by 1000ms (1 second)
- Only fires once per trigger (`setRepeats(false)`)
- Prevents checking on every keystroke

**`isRunning`** - Boolean flag
- `true` when spell checking is enabled
- `false` when disabled
- Controls whether checks occur

### Method 1: start()

Enables spell checking:

```java
public void start() {
    if (!isRunning) {
        isRunning = true;
        triggerCheck(getFocusedPage());
    }
}
```

**Flow**:
1. Check if not already running
2. Set `isRunning = true`
3. Trigger initial check on current page

### Method 2: stop()

Disables spell checking and clears all highlights:

```java
public void stop() {
    if (isRunning) {
        isRunning = false;
        checkTimer.stop();
        clearAllHighlights();
    }
}
```

**Flow**:
1. Check if currently running
2. Set `isRunning = false`
3. Stop the timer (cancel pending checks)
4. Remove all error highlights from all pages

### Method 3: triggerCheck()

Requests a spell check with debouncing:

```java
public void triggerCheck(JTextPane page) {
    if (isRunning && page != null) {
        checkTimer.restart();
    }
}
```

**How Debouncing Works**:

```
User types "H"     → Timer starts (1000ms countdown)
User types "e"     → Timer RESTARTS (back to 1000ms)
User types "l"     → Timer RESTARTS (back to 1000ms)
User types "l"     → Timer RESTARTS (back to 1000ms)
User types "o"     → Timer RESTARTS (back to 1000ms)
User stops typing  → Timer counts down...
                   → After 1000ms: checkAllPages() runs
```

**Why This Matters**:
- Without debouncing, spell check would run on EVERY keystroke
- For a 100-word document, this could be 500+ checks per minute
- Debouncing reduces this to ~6 checks per minute (one every 10 seconds)
- Dramatically improves performance

### Method 4: checkAllPages()

The core spell-checking algorithm:

```java
private void checkAllPages() {
    if (!isRunning) return;

    totalMistakes = 0;
    errorsMap.clear();

    for (JTextPane page : pages) {
        Highlighter highlighter = page.getHighlighter();
        highlighter.removeAllHighlights();
        
        try {
            // Get all text from the page
            String text = page.getDocument().getText(0, page.getDocument().getLength());
            
            // Check with LanguageTool
            List<RuleMatch> matches = langTool.check(text);
            
            // Store matches for this page
            errorsMap.put(page, matches);
            totalMistakes += matches.size();

            // Highlight each error
            for (RuleMatch match : matches) {
                Highlighter.HighlightPainter painter;
                
                // Choose color based on error type
                if (match.getRule().isDictionaryBasedSpellingRule()) {
                    painter = SPELLING_ERROR_PAINTER;  // Red wavy underline
                } else {
                    painter = GRAMMAR_ERROR_PAINTER;   // Blue wavy underline
                }
                
                highlighter.addHighlight(match.getFromPos(), match.getToPos(), painter);
            }
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
    updateStatus();  // Update status bar with error count
}
```

**Algorithm Step-by-Step**:

1. **Check if enabled**: Return early if spell checking is off
2. **Reset counters**: Clear error count and error map
3. **For each page**:
   - Get the page's highlighter
   - Remove existing highlights
   - Extract all text from the document
   - Pass text to LanguageTool for analysis
   - Store the returned `RuleMatch` list in `errorsMap`
   - Add to total mistake count
   - For each error:
     - Determine if it's spelling (red) or grammar (blue)
     - Add a highlight at the error's position
4. **Update UI**: Refresh status bar with new error count

### Method 5: clearAllHighlights()

Removes all error highlights:

```java
private void clearAllHighlights() {
    for (JTextPane page : pages) {
        page.getHighlighter().removeAllHighlights();
    }
    totalMistakes = 0;
    errorsMap.clear();
    updateStatus();
}
```

Called when spell checking is disabled.

## Component 3: Error Storage

### errorsMap - Global State

```java
private static final Map<JTextPane, List<RuleMatch>> errorsMap = new HashMap<>();
```

**Purpose**: 
- Maps each page to its list of errors
- Enables context menu to find which error was clicked
- Persists error information between checks

**Structure**:
```
errorsMap = {
    page1 → [RuleMatch(pos: 10-16, word: "sampel"), RuleMatch(pos: 27-32, word: "erors")],
    page2 → [RuleMatch(pos: 5-10, word: "teh")],
    page3 → []
}
```

### totalMistakes - Global Counter

```java
private static int totalMistakes = 0;
```

**Purpose**:
- Tracks total errors across all pages
- Displayed in status bar
- Updated after each check

## Component 4: Highlighting System

### Highlight Painters

```java
private static final Highlighter.HighlightPainter SPELLING_ERROR_PAINTER = 
    new UnderlineHighlightPainter(Color.RED);
    
private static final Highlighter.HighlightPainter GRAMMAR_ERROR_PAINTER = 
    new UnderlineHighlightPainter(Color.BLUE);
```

**Singleton Instances**:
- Created once at startup
- Reused for all highlighting
- Red for spelling, blue for grammar

### UnderlineHighlightPainter

This is a custom `Highlighter.HighlightPainter` that draws wavy underlines. See [Wavy underline.md](Wavy%20underline.md) for detailed implementation.

**Quick Summary**:
```java
private static class UnderlineHighlightPainter implements Highlighter.HighlightPainter {
    private final Color color;

    public UnderlineHighlightPainter(Color color) {
        this.color = color;
    }

    @Override
    public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
        // Draw wavy line under the error
        // See Wavy underline.md for full implementation
    }
}
```

### Adding Highlights

```java
Highlighter highlighter = textPane.getHighlighter();
highlighter.addHighlight(startPos, endPos, painter);
```

**Parameters**:
- `startPos`: Character position where error starts
- `endPos`: Character position where error ends  
- `painter`: The custom painter that draws the wavy line

### Removing Highlights

```java
highlighter.removeAllHighlights();  // Clear all highlights
```

Called before each new spell check to remove old highlights.

## Component 5: Context Menu Suggestions

### Triggering the Menu

Context menus are shown when the user right-clicks on an error:

```java
page.addMouseListener(new MouseAdapter() {
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger() || SwingUtilities.isRightMouseButton(e)) {
            showSuggestionMenu(e, page);
        }
    }
});
```

### showSuggestionMenu() Implementation

```java
private static void showSuggestionMenu(java.awt.event.MouseEvent e, JTextPane page) {
    // 1. Convert mouse coordinates to document position
    int pos = page.viewToModel2D(e.getPoint());
    
    // 2. Get errors for this page
    List<RuleMatch> errors = errorsMap.get(page);
    if (errors == null) return;

    // 3. Find which error was clicked
    RuleMatch clickedError = null;
    for (RuleMatch error : errors) {
        if (pos >= error.getFromPos() && pos <= error.getToPos()) {
            clickedError = error;
            break;
        }
    }

    // 4. If an error was clicked, show suggestions
    if (clickedError != null) {
        final RuleMatch finalClickedError = clickedError;
        JPopupMenu popupMenu = new JPopupMenu();
        List<String> suggestions = clickedError.getSuggestedReplacements();

        if (suggestions.isEmpty()) {
            // No suggestions available
            JMenuItem noSuggestions = new JMenuItem("No suggestions");
            noSuggestions.setEnabled(false);
            popupMenu.add(noSuggestions);
        } else {
            // Add each suggestion as a menu item
            for (String suggestion : suggestions) {
                JMenuItem item = new JMenuItem(suggestion);
                item.addActionListener(actionEvent -> {
                    try {
                        // Replace the error with the suggestion
                        page.getDocument().remove(
                            finalClickedError.getFromPos(), 
                            finalClickedError.getToPos() - finalClickedError.getFromPos()
                        );
                        page.getDocument().insertString(
                            finalClickedError.getFromPos(), 
                            suggestion, 
                            null
                        );
                    } catch (BadLocationException ex) {
                        ex.printStackTrace();
                    }
                });
                popupMenu.add(item);
            }
        }
        popupMenu.show(page, e.getX(), e.getY());
    }
}
```

### Algorithm Breakdown

**Step 1: Convert Coordinates**
```java
int pos = page.viewToModel2D(e.getPoint());
```
- `e.getPoint()` returns mouse X,Y coordinates
- `viewToModel2D()` converts to character position in document
- Example: Mouse at (150px, 80px) → Character position 42

**Step 2: Retrieve Errors**
```java
List<RuleMatch> errors = errorsMap.get(page);
```
- Look up errors for the clicked page
- Returns `null` if no errors on this page

**Step 3: Find Clicked Error**
```java
for (RuleMatch error : errors) {
    if (pos >= error.getFromPos() && pos <= error.getToPos()) {
        clickedError = error;
        break;
    }
}
```
- Check if click position falls within any error's range
- Example: Click at position 12, error spans 10-16 → Match!

**Step 4: Build Menu**
```java
List<String> suggestions = clickedError.getSuggestedReplacements();
for (String suggestion : suggestions) {
    JMenuItem item = new JMenuItem(suggestion);
    item.addActionListener(actionEvent -> { ... });
    popupMenu.add(item);
}
```
- Get suggestions from the `RuleMatch`
- Create a menu item for each suggestion
- Attach click handler to apply the correction

**Step 5: Apply Correction**
```java
page.getDocument().remove(fromPos, length);
page.getDocument().insertString(fromPos, suggestion, null);
```
- Remove the error text
- Insert the suggestion at the same position
- Document automatically triggers a recheck via `DocumentListener`

## Component 6: Document Integration

### Triggering Checks on Document Changes

Every page has a `DocumentListener` that triggers spell checking:

```java
page.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    public void insertUpdate(javax.swing.event.DocumentEvent e) {
        if (bulkEditDepth == 0) {
            updateStatus();
            checkPageOverflow(page);
            spellCheckerService.triggerCheck(page);
        }
    }

    public void removeUpdate(javax.swing.event.DocumentEvent e) {
        if (bulkEditDepth == 0) {
            updateStatus();
            spellCheckerService.triggerCheck(page);
        }
    }

    public void changedUpdate(javax.swing.event.DocumentEvent e) {
        if (bulkEditDepth == 0) {
            updateStatus();
            spellCheckerService.triggerCheck(page);
        }
    }
});
```

**Events**:
- `insertUpdate()`: Text inserted (typing, pasting)
- `removeUpdate()`: Text deleted (backspace, cut)
- `changedUpdate()`: Attributes changed (bold, italic, etc.)

**bulkEditDepth Guard**:
- Prevents triggering during programmatic edits
- Only checks on user-initiated changes

### Triggering Checks on Focus

When a page gains focus, spell check is triggered:

```java
page.addFocusListener(new java.awt.event.FocusAdapter() {
    @Override
    public void focusGained(java.awt.event.FocusEvent e) {
        lastFocusedPage = page;
        updateStatus();
        spellCheckerService.triggerCheck(page);
    }
});
```

This ensures errors are highlighted when switching between pages.

## Component 7: UI Toggle Control

### Command Setup

```java
public static Command spellCheckCommand;

spellCheckCommand = Command.builder()
    .setIconFactory(icons8_spellcheck_50.factory())
    .setToggle()
    .build();

spellCheckCommand.setActionRichTooltip(
    RichTooltip.builder()
    .setTitle(bundle.getString("cmd.spellCheck"))
    .addDescriptionSection(bundle.getString("cmd.spellCheck.description"))
    .build()
);

spellCheckCommand.setAction(e -> {
    if (spellCheckCommand.isToggleSelected()) {
        spellCheckerService.start();
    } else {
        spellCheckerService.stop();
    }
});
```

**Toggle Behavior**:
- Click once → Enable spell checking
- Click again → Disable spell checking
- Button shows selected state when active

### Status Bar Integration

The spell check toggle appears in the status bar:

```java
JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
statusLabel = new JLabel("1/1 | Words: 0");

statusBar.add(statusLabel);
statusBar.add(
    spellCheckCommand.project(CommandButtonPresentationModel.builder()
    .setFocusable(false)
    .setPresentationState(CommandButtonPresentationState.SMALL)
    .build())
    .buildComponent()
);

mainFrame.add(statusBar, BorderLayout.SOUTH);
```

**Visual Layout**:
```
┌─────────────────────────────────────────────────────┐
│                  Document Area                      │
│                                                     │
└─────────────────────────────────────────────────────┘
┌─────────────────────────────────────────────────────┐
│ 1/2 | Words: 123 | Mistakes: 5  [🔍 Spell Check]  │ ← Status Bar
└─────────────────────────────────────────────────────┘
```

### Status Updates

The `updateStatus()` method updates the status bar:

```java
private static void updateStatus() {
    int currentPage = pages.indexOf(lastFocusedPage) + 1;
    int totalPages = Math.max(1, pages.size());
    int wordCount = getWordCount();
    
    String status = String.format("%d/%d | %s: %d", 
        currentPage, 
        totalPages, 
        bundle.getString("statusBar.words"), 
        wordCount
    );
    
    if (spellCheckCommand.isToggleSelected() && totalMistakes > 0) {
        status += String.format(" | %s: %d", 
            bundle.getString("statusBar.mistakes"), 
            totalMistakes
        );
    }
    
    statusLabel.setText(status);
}
```

**Output Examples**:
- `"1/1 | Words: 0"` - Empty document
- `"1/2 | Words: 234"` - Spell check off
- `"1/2 | Words: 234 | Mistakes: 5"` - Spell check on

## Complete Workflow

### User Scenario: Typing with Spell Check Enabled

**User Action** → **System Response**

1. **User enables spell check** (clicks toggle button)
   - `spellCheckCommand.isToggleSelected()` → `true`
   - `spellCheckerService.start()` called
   - `isRunning` set to `true`
   - Initial check triggered on current page

2. **User types "H"**
   - `DocumentListener.insertUpdate()` fired
   - `spellCheckerService.triggerCheck(page)` called
   - Timer starts (1000ms countdown)

3. **User types "e" (within 1 second)**
   - `DocumentListener.insertUpdate()` fired
   - `checkTimer.restart()` called
   - Timer resets to 1000ms

4. **User continues typing "llo"**
   - Each keystroke restarts the timer
   - No spell check runs yet

5. **User pauses (1 second passes)**
   - Timer fires
   - `checkAllPages()` executes
   - LanguageTool analyzes "Hello"
   - No errors found (correct spelling)
   - No highlights added

6. **User types " wrld"**
   - Timer restarts on each keystroke
   - After 1 second pause...

7. **Spell check runs**
   - LanguageTool analyzes "Hello wrld"
   - `RuleMatch` found: "wrld" at positions 6-10
   - Suggestions: ["world", "weld", "wild"]
   - Red wavy underline appears under "wrld"
   - Status bar shows "Mistakes: 1"

8. **User right-clicks on "wrld"**
   - `mouseReleased()` event fired
   - `showSuggestionMenu()` called
   - Click position converted: position 8
   - Error found at positions 6-10 (contains position 8)
   - Popup menu appears with:
     - "world"
     - "weld"
     - "wild"

9. **User clicks "world"**
   - `actionListener` triggered
   - Document removes "wrld" (positions 6-10)
   - Document inserts "world" at position 6
   - `DocumentListener` fires again
   - Timer starts for recheck

10. **After 1 second**
    - Spell check runs
    - Text is now "Hello world"
    - No errors found
    - Red underline removed
    - Status bar shows no mistakes

### Internal Data Flow

```
User types "wrld"
        ↓
DocumentListener.insertUpdate()
        ↓
triggerCheck(page)
        ↓
checkTimer.restart()
        ↓
[1 second delay]
        ↓
checkAllPages()
        ↓
getText() → "Hello wrld"
        ↓
langTool.check("Hello wrld")
        ↓
Returns: [RuleMatch(6, 10, "wrld", ["world", "weld"])]
        ↓
errorsMap.put(page, [RuleMatch(...)])
        ↓
highlighter.addHighlight(6, 10, RED_PAINTER)
        ↓
updateStatus() → "Mistakes: 1"
        ↓
Red wavy underline appears on screen
```

## Performance Optimization

### 1. Debouncing

**Without Debouncing** (bad):
```
User types:  H  e  l  l  o
Checks run:  ✓  ✓  ✓  ✓  ✓  (5 checks)
```

**With Debouncing** (good):
```
User types:  H  e  l  l  o  [pause]
Checks run:                    ✓     (1 check)
```

**Performance Gain**: 80-95% reduction in checks

### 2. Highlight Reuse

```java
// GOOD - Reuse painters
private static final Highlighter.HighlightPainter SPELLING_ERROR_PAINTER = 
    new UnderlineHighlightPainter(Color.RED);

// BAD - Create new painters every time
highlighter.addHighlight(start, end, new UnderlineHighlightPainter(Color.RED));
```

Reusing painters saves memory and object creation overhead.

### 3. Early Returns

```java
private void checkAllPages() {
    if (!isRunning) return;  // Skip if disabled
    // ... rest of logic
}
```

Prevents unnecessary work when spell checking is off.

### 4. Bulk Edit Protection

```java
if (bulkEditDepth == 0) {
    spellCheckerService.triggerCheck(page);
}
```

Prevents checking during programmatic edits (loading documents, applying styles).

## Internationalization (i18n)

### Supported Languages

The application supports multiple UI languages, but **spell checking is English-only** currently:

```java
this.langTool = new JLanguageTool(Languages.getLanguageForShortCode("en-US"));
```

### Adding More Languages

To support other languages:

```java
// Spanish
JLanguageTool langTool = new JLanguageTool(Languages.getLanguageForShortCode("es"));

// French
JLanguageTool langTool = new JLanguageTool(Languages.getLanguageForShortCode("fr"));

// German
JLanguageTool langTool = new JLanguageTool(Languages.getLanguageForShortCode("de"));
```

### UI Strings

Context menu and dialog strings are internationalized:

**MessagesBundle_en_US.properties**:
```properties
dialog.spellCheck.title=Spelling/Grammar Check
dialog.spellCheck.suggestions=Suggestions
contextmenu.spellcheck.ignore=Ignore
contextmenu.spellcheck.replaceWith=Replace with: {0}
```

**MessagesBundle_es_ES.properties**:
```properties
dialog.spellCheck.title=Corrección ortográfica/gramatical
dialog.spellCheck.suggestions=Sugerencias
contextmenu.spellcheck.ignore=Ignorar
contextmenu.spellcheck.replaceWith=Reemplazar con: {0}
```

## Error Types

### Spelling Errors

**Detection**:
```java
if (match.getRule().isDictionaryBasedSpellingRule()) {
    // Spelling error
}
```

**Examples**:
- `"teh"` → "the"
- `"recieve"` → "receive"
- `"occured"` → "occurred"

**Visual**: Red wavy underline

### Grammar Errors

**Detection**:
```java
if (!match.getRule().isDictionaryBasedSpellingRule()) {
    // Grammar error
}
```

**Examples**:
- `"I has a cat"` → "I have a cat"
- `"She don't like it"` → "She doesn't like it"
- `"Your welcome"` → "You're welcome"

**Visual**: Blue wavy underline

### Style Suggestions

LanguageTool also detects style issues:
- Passive voice
- Redundant phrases
- Wordiness
- Clichés

These appear as grammar errors (blue underline).

## Code References

### Key Files

- **App.java**: Main implementation
  - Lines 98-101: Error storage and painters
  - Lines 241-315: `SpellCheckerService` class
  - Lines 319-360: `UnderlineHighlightPainter` class (see Wavy underline.md)
  - Lines 361-365: Service initialization
  - Lines 2767-2780: Toggle command setup
  - Lines 2953-2980: Document listener integration
  - Lines 3264-3304: `showSuggestionMenu()` method

- **SpellCheckDemo.java**: Experimental prototype
  - Lines 1-125: Standalone spell check demo
  - Simpler implementation for learning

### Key Variables

| Variable | Type | Purpose |
|----------|------|---------|
| `spellCheckerService` | SpellCheckerService | Service instance |
| `errorsMap` | Map<JTextPane, List\<RuleMatch\>> | Error storage |
| `totalMistakes` | int | Error count |
| `SPELLING_ERROR_PAINTER` | HighlightPainter | Red underline |
| `GRAMMAR_ERROR_PAINTER` | HighlightPainter | Blue underline |

## Advantages and Limitations

### Advantages ✅

1. **Professional Quality**: Matches Microsoft Word/Google Docs
2. **Real-time Feedback**: Errors appear as you type
3. **Visual Clarity**: Color-coded underlines distinguish error types
4. **Easy Corrections**: Right-click to apply suggestions
5. **Performance**: Debouncing prevents lag
6. **Extensible**: Easy to add more languages
7. **Open Source**: LanguageTool is free and well-maintained

### Limitations ❌

1. **English Only**: Currently limited to en-US
2. **No Custom Dictionary**: Can't add words to ignore
3. **No Ignore All**: Each instance must be manually ignored
4. **Basic Integration**: No advanced features like thesaurus
5. **Network Required**: Some LanguageTool features need internet (not used here)
6. **Large Library**: LanguageTool adds significant JAR size

## Future Enhancements

Potential improvements:

1. **Multi-Language Support**: Let users choose spell check language
2. **Custom Dictionary**: Add user-specific words
3. **Ignore Options**: "Ignore All" for repeated errors
4. **Advanced Dialog**: Full spell check dialog like MS Word
5. **Auto-Correct**: Common typos fixed automatically
6. **Grammar Explanations**: Show why something is wrong
7. **Thesaurus Integration**: Suggest synonyms
8. **Style Preferences**: Configure strictness level

## Common Issues and Solutions

### Issue: Spell check doesn't run

**Possible Causes**:
1. Toggle button not selected
2. `isRunning` is `false`
3. Timer not firing

**Solution**:
- Check if toggle button is selected
- Verify `spellCheckerService.start()` was called
- Add logging to `checkAllPages()` to confirm execution

### Issue: Highlights don't appear

**Possible Causes**:
1. Custom painter not working
2. Positions out of bounds
3. Highlighter cleared too early

**Solution**:
- Verify `UnderlineHighlightPainter` is functioning
- Check that `fromPos < toPos`
- Ensure highlights aren't immediately cleared

### Issue: Right-click menu doesn't show

**Possible Causes**:
1. `errorsMap` is empty
2. Click position doesn't match error position
3. Mouse listener not attached

**Solution**:
- Verify errors are stored in `errorsMap`
- Check `viewToModel2D()` coordinate conversion
- Confirm mouse listener is added to page

### Issue: Performance lag

**Possible Causes**:
1. Checking too frequently
2. Timer interval too short
3. Large documents

**Solution**:
- Increase debounce delay from 1000ms to 2000ms
- Check only current page, not all pages
- Disable auto-check, use manual "Check Document" button

## Debugging Tips

### Log Spell Check Execution

```java
private void checkAllPages() {
    System.out.println("=== Spell Check Started ===");
    System.out.println("Running: " + isRunning);
    System.out.println("Page count: " + pages.size());
    
    // ... existing code ...
    
    System.out.println("Total mistakes found: " + totalMistakes);
    System.out.println("=== Spell Check Complete ===");
}
```

### Log Timer Events

```java
this.checkTimer = new Timer(1000, e -> {
    System.out.println("Timer fired, checking all pages");
    checkAllPages();
});
```

### Log RuleMatch Details

```java
for (RuleMatch match : matches) {
    System.out.printf("Error at %d-%d: %s%n", 
        match.getFromPos(), 
        match.getToPos(), 
        match.getMessage()
    );
    System.out.println("Suggestions: " + match.getSuggestedReplacements());
}
```

## Testing Checklist

When modifying spell check functionality:

- [ ] Test enabling/disabling via toggle button
- [ ] Verify debouncing (no lag during rapid typing)
- [ ] Check spelling errors show red underlines
- [ ] Check grammar errors show blue underlines
- [ ] Verify right-click menu appears on errors
- [ ] Test applying corrections via context menu
- [ ] Confirm highlights update after corrections
- [ ] Test with multiple pages
- [ ] Verify status bar shows correct error count
- [ ] Test with special characters and symbols
- [ ] Check performance with large documents (>1000 words)

## Summary

The spell checker implementation in Java-office provides professional-grade spelling and grammar checking through:

1. **LanguageTool Integration**: Powerful open-source proofreading engine
2. **SpellCheckerService**: Custom service managing check lifecycle
3. **Debounced Checking**: Performance optimization via timer
4. **Visual Feedback**: Color-coded wavy underlines
5. **Context Menus**: Easy correction via right-click suggestions
6. **Multi-Page Support**: Checks all pages in document
7. **Toggle Control**: Easy enable/disable in status bar

This implementation demonstrates how to integrate third-party libraries, manage background processing, provide visual feedback, and create intuitive user interactions in a Swing application. While not as feature-complete as commercial word processors, it provides solid spell-checking functionality that enhances the writing experience.

## Contributing

When modifying spell check functionality:

1. **Test with various error types** (spelling, grammar, style)
2. **Verify debouncing** prevents performance issues
3. **Check multi-page behavior** if modifying `checkAllPages()`
4. **Update error storage** if changing data structures
5. **Test context menu** after any highlight-related changes
6. **Consider i18n** if adding user-facing strings
7. **Profile performance** with large documents

The spell checker is a critical feature that users interact with constantly, so stability and performance are paramount.
