package com.oudepotelegomenon;

import javax.swing.text.*;

/**
 * A custom EditorKit that provides a paginated view of a document.
 */
public class PagedEditorKit extends StyledEditorKit {
    @Override
    public ViewFactory getViewFactory() {
        return new PagedViewFactory();
    }

    private static class PagedViewFactory implements ViewFactory {
        public View create(Element elem) {
            String kind = elem.getName();
            if (kind != null) {
                switch (kind) {
                    case AbstractDocument.SectionElementName:
                        return new PagedRootView(elem);
                    case AbstractDocument.ParagraphElementName:
                        return new ParagraphView(elem);
                    case AbstractDocument.ContentElementName:
                        return new LabelView(elem);
                    case StyleConstants.ComponentElementName:
                        return new ComponentView(elem);
                    case StyleConstants.IconElementName:
                        return new IconView(elem);
                }
            }
            // default to text display
            return new LabelView(elem);
        }
    }

    /**
     * A custom root view that lays out its children (paragraphs) into pages.
     */
    private static class PagedRootView extends BoxView {
        private final int pageHeight = 842;
        private final int pageGap = 20;
        private final int marginTop = 70;
        private final int marginBottom = 70;

        public PagedRootView(Element elem) {
            super(elem, View.Y_AXIS);
        }

        @Override
        protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {
            super.layoutMajorAxis(targetSpan, axis, offsets, spans);

            int usablePageHeight = pageHeight - marginTop - marginBottom;
            int totalOffset = marginTop;
            int currentYOnPage = 0;

            for (int i = 0; i < getViewCount(); i++) {
                View v = getView(i);
                int viewHeight = spans[i];
                AttributeSet attrs = v.getElement().getAttributes();
                boolean isPageBreak = (attrs != null && attrs.getAttribute("PAGE_BREAK") != null);

                if (isPageBreak || (currentYOnPage > 0 && currentYOnPage + viewHeight > usablePageHeight)) {
                    // This view doesn't fit on the current page, or it's a manual break.
                    // Move to the next page.
                    int remainingOnPage = usablePageHeight - currentYOnPage;
                    totalOffset += remainingOnPage; // Space to fill the current page
                    totalOffset += marginBottom + pageGap + marginTop; // Add margins and gap
                    currentYOnPage = 0;
                }

                offsets[i] = totalOffset + currentYOnPage;
                currentYOnPage += viewHeight;
            }
        }

        @Override
        public float getPreferredSpan(int axis) {
            if (axis == View.X_AXIS) {
                // Width is fixed to the page width (minus margins, handled by JTextPane)
                return super.getPreferredSpan(axis);
            }

            // Calculate total height by simulating the layout
            float totalContentHeight = 0;
            for (int i = 0; i < getViewCount(); i++) {
                totalContentHeight += getView(i).getPreferredSpan(View.Y_AXIS);
            }

            int usablePageHeight = pageHeight - marginTop - marginBottom;
            if (totalContentHeight == 0) {
                return pageHeight;
            }

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

            return (float) numPages * pageHeight + (numPages - 1) * pageGap;
        }
    }
}