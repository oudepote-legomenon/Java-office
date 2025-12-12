# Experiments

## Overview
This directory contains experimental prototypes and proof-of-concept implementations for testing new features before integrating them into the main Java-office word processor application.

## Purpose
The experiments serve as a sandbox environment to:
- Test new UI components and interactions
- Evaluate third-party libraries and their integration
- Prototype complex features in isolation
- Validate technical approaches before full implementation
- Quickly iterate on design ideas without affecting the main codebase

## Current Experiments

### SpellCheckDemo.java
**Purpose:** Prototype for spell checking and grammar checking functionality

**Features:**
- Integration with LanguageTool for spell and grammar checking
- Real-time error highlighting (red for spelling, blue for grammar/style)
- Context menu with correction suggestions
- Interactive error correction workflow

**Key Technologies:**
- LanguageTool library for language processing
- Swing Highlighter API for error visualization
- Custom popup menus for user interaction

**Status:** Ready for integration into the main editor

---

### TextEditorWithTables.java
**Purpose:** Prototype for table insertion and editing capabilities

**Features:**
- Insert tables with customizable rows and columns
- Editable table cells within the text editor
- Integration with JTextPane's document structure
- Toolbar-based table insertion interface

**Key Technologies:**
- Swing JTextPane for rich text editing
- Custom table insertion logic
- Document model manipulation

**Status:** Experimental - evaluating table editing UX

## Usage Guidelines

### Running an Experiment
Each experiment is a standalone Java application with its own `main()` method. To run:

```bash
# From the project root
mvn clean compile
mvn exec:java -Dexec.mainClass="com.oudepotelegomenon.SpellCheckDemo"
# or
mvn exec:java -Dexec.mainClass="com.oudepotelegomenon.TextEditorWithTables"
```

### Adding New Experiments
When creating a new experimental file:
1. Place it in this directory
2. Keep it self-contained with minimal dependencies
3. Add a `main()` method for easy testing
4. Update this README with a description
5. Document any external libraries required

### Integration Checklist
Before moving experimental code to the main application:
- [ ] Code review and refactoring
- [ ] Remove hardcoded values
- [ ] Add proper error handling
- [ ] Integrate with application settings/preferences
- [ ] Add unit tests
- [ ] Update main application documentation
- [ ] Consider internationalization (i18n)

## Dependencies
Some experiments may require additional Maven dependencies:
- **LanguageTool**: Used in SpellCheckDemo for language processing
- **Swing Components**: Standard Java UI toolkit (included in JDK)

## Notes
- Experimental code may not follow all production coding standards
- Focus is on rapid prototyping and feature validation
- Some experiments may be abandoned if the approach proves unfeasible
- Successful experiments should be refactored before production integration