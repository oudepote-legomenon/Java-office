package com.oudepotelegomenon;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RectangularShadingDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("MS Word Style Shading");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextPane textPane = new JTextPane();
            //textPane.setEditorKit(new WrapEditorKit());
            textPane.setText("This is line 1\nThis is line 2\nThis is line 3");

            // Use custom editor kit with shading support
            textPane.setEditorKit(new ShadedEditorKit());

            JScrollPane scroll = new JScrollPane(textPane);
            frame.add(scroll, BorderLayout.CENTER);

            JButton shadeBtn = new JButton(new AbstractAction("Shade Selected") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int start = textPane.getSelectionStart();
                    int end = textPane.getSelectionEnd();
                    if (start != end) {
                        SimpleAttributeSet sas = new SimpleAttributeSet();
                        sas.addAttribute("shading", Color.YELLOW); // custom attribute
                        ((StyledDocument) textPane.getDocument()).setCharacterAttributes(start, end - start, sas, false);
                    }
                }
            });

            frame.add(shadeBtn, BorderLayout.SOUTH);

            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    // Custom EditorKit that knows how to paint shading
    static class ShadedEditorKit extends StyledEditorKit {
        private final ViewFactory defaultFactory = new ShadedViewFactory();
        @Override
        public ViewFactory getViewFactory() {
            return defaultFactory;
        }
    }

    // Factory to create custom views
    static class ShadedViewFactory implements ViewFactory {
        @Override
        public View create(Element elem) {
            String kind = elem.getName();
            if (kind != null) {
                if (kind.equals(AbstractDocument.ContentElementName)) {
                    return new ShadedLabelView(elem);
                } else if (kind.equals(AbstractDocument.ParagraphElementName)) {
                    return new ParagraphView(elem);
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

    // Custom LabelView that paints rectangular shading
    static class ShadedLabelView extends LabelView {
        public ShadedLabelView(Element elem) {
            super(elem);
        }

        @Override
        public void paint(Graphics g, Shape a) {
            AttributeSet attrs = getAttributes();
            Color shade = (Color) attrs.getAttribute("shading");
            if (shade != null) {
                Rectangle alloc = (a instanceof Rectangle) ? (Rectangle) a : a.getBounds();
                g.setColor(shade);
                g.fillRect(alloc.x, alloc.y, alloc.width, alloc.height);
            }
            super.paint(g, a);
        }
    }
}
