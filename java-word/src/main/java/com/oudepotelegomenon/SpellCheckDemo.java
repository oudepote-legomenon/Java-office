package com.oudepotelegomenon;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.text.*;

import org.languagetool.*;
import org.languagetool.rules.RuleMatch;

public class SpellCheckDemo {

    private JTextPane textPane;
    private Highlighter.HighlightPainter redPainter;   // spelling
    private Highlighter.HighlightPainter bluePainter;  // grammar/style
    private JLanguageTool langTool;

    // Store matches so right-click can find them
    private List<RuleMatch> lastMatches;

    public SpellCheckDemo() {
        JFrame frame = new JFrame("Spell Checker + Suggestions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 450);

        textPane = new JTextPane();
        textPane.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        redPainter = new DefaultHighlighter.DefaultHighlightPainter(new Color(255, 120, 120));
        bluePainter = new DefaultHighlighter.DefaultHighlightPainter(new Color(120, 150, 255));

        langTool = new JLanguageTool(Languages.getLanguageForShortCode("en-US"));

        JScrollPane scroll = new JScrollPane(textPane);
        frame.add(scroll);

        // Spellcheck on typing
        textPane.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                runSpellCheck();
            }
        });

        // Add right-click menu
        textPane.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger() || SwingUtilities.isRightMouseButton(e)) {
                    showSuggestionsMenu(e);
                }
            }
        });

        frame.setVisible(true);
    }

    private void runSpellCheck() {
        SwingUtilities.invokeLater(() -> {
            try {
                Highlighter highlighter = textPane.getHighlighter();
                highlighter.removeAllHighlights();

                String content = textPane.getText();
                lastMatches = langTool.check(content);

                for (RuleMatch match : lastMatches) {
                    int start = match.getFromPos();
                    int end = match.getToPos();

                    if (match.getRule().isDictionaryBasedSpellingRule()) {
                        highlighter.addHighlight(start, end, redPainter);
                    } else {
                        highlighter.addHighlight(start, end, bluePainter);
                    }
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    private void showSuggestionsMenu(MouseEvent e) {
        int pos = textPane.viewToModel(e.getPoint());
        if (lastMatches == null) return;

        for (RuleMatch match : lastMatches) {
            if (pos >= match.getFromPos() && pos <= match.getToPos()) {
                List<String> suggestions = match.getSuggestedReplacements();

                JPopupMenu menu = new JPopupMenu();

                if (suggestions.isEmpty()) {
                    JMenuItem noItem = new JMenuItem("(No suggestions)");
                    noItem.setEnabled(false);
                    menu.add(noItem);
                } else {
                    for (String s : suggestions) {
                        JMenuItem item = new JMenuItem(s);
                        item.addActionListener(ev -> replaceText(match.getFromPos(), match.getToPos(), s));
                        menu.add(item);
                    }
                }

                menu.show(textPane, e.getX(), e.getY());
                break;
            }
        }
    }

    private void replaceText(int start, int end, String replacement) {
        try {
            Document doc = textPane.getDocument();
            doc.remove(start, end - start);
            doc.insertString(start, replacement, null);
            runSpellCheck();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SpellCheckDemo::new);
    }
}
