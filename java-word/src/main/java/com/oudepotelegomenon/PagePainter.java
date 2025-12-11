package com.oudepotelegomenon;

import javax.swing.*;
import java.awt.*;

/**
 * A component that paints page outlines behind a JTextPane to give a paginated appearance.
 */
class PagePainter extends JComponent {
    private final JTextPane textPane;
    private final int pageWidth = 595;
    private final int pageHeight = 842;
    private final int pageGap = 20;

    public PagePainter(JTextPane textPane) {
        this.textPane = textPane;
        setOpaque(false);
    }

    @Override
    public Dimension getPreferredSize() {
        return textPane.getPreferredSize();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // The number of pages is determined by the text pane's preferred height
        Dimension prefSize = textPane.getPreferredSize();
        if (prefSize.height == 0) {
            return;
        }

        int numPages = (prefSize.height + pageGap) / (pageHeight + pageGap);
        if (prefSize.height % (pageHeight + pageGap) > 0) numPages++;
        numPages = Math.max(1, numPages);

        int y = 0;
        for (int i = 0; i < numPages; i++) {
            int x = (getWidth() - pageWidth) / 2;
            if (x < 0) x = 0;

            g2.setColor(Color.WHITE);
            g2.fillRect(x, y, pageWidth, pageHeight);
            g2.setColor(Color.LIGHT_GRAY);
            g2.drawRect(x, y, pageWidth - 1, pageHeight - 1);

            y += pageHeight + pageGap;
        }
    }
}