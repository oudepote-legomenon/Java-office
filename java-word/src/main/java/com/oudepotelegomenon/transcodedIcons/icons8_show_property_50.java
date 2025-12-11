package com.oudepotelegomenon.transcodedIcons;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class icons8_show_property_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image47148538d74e6cc1623c2e2e0e82870e;
private static BufferedImage getImage47148538d74e6cc1623c2e2e0e82870e() {
    BufferedImage result = (image47148538d74e6cc1623c2e2e0e82870e != null)
        ? image47148538d74e6cc1623c2e2e0e82870e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1476);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEG0lEQVR4Xu2Z3U9TZxzHzS53tdvd7o/Y7sxcFrG8DDW7MOoW3SQxm85pN2WMCdtkYTQTBhsTetohLwNsywi1VE5Loa0UCmipgsViFahS3toB4+X09bs+p6O2Z4sxtrYlOd/ke9Gn53n6++T38pyku3bx4vVydUFE7b4gEgt3lqndXI4wiLi/UERhJ5nEzOXgQdJpHiTTzINkmv8X5HyFuOqyVOF1zM5hJ5jESmLmcpCMlNa2dG1hh4jESmLmcvAg6RIPkmniQTJNPAhRm3kdA1Pxj5A1kXol6SbnPksJgSysBrCyGfzP2qzbn3STc5+lhEAySTxIpikhEL7ZX8B8s/MgaVJCIHyzv4D5ZudB0qSEQJLZ7HXGdWidQRjmEXX3pBtKrQw9bWdAS/dD13AQ5s4zeGhpBbPhjvtdmdrou1h5tYzL8VwgyWx2+3IgaqvdBkNnIXobDuCOrhyPbWoszQ5j3qGH41YzTPKT0Ehyce9mDfzeyDTTmsaCsh6jjsvxXCDJVsDP4G6fiA3SbqbgY9bA+AIYnHBBoXdANTgN52Ik8LVlB0yKT6BvOQz3EwsLIu8Z6OdypByE2VjG0J+nYWw/jtUlO7s2OrmIo2VavH/xBo5VGHGkTAfL1FJ0TygUxP0hMQuuppXpB/FuejAgK2BLhgARjT9yY39xN07+chs/qjzRXmL8Ic5uwHnvOjSUAO1Xiwa4HCkD8TF/sxDDSmG03olO/WzEicphNvhy5RI+r+5FceM4Rh4x7PeBQAh251/R510P+kBT2SG6XlCQchBSGqPdX7EgsRDzng28V6TCdx0uFiT7yDm8+XYe3tqTD+GvBkiNa/hCbEGVzBpzWiQzNCUI3qD27kkpyMK0CbR4H9ussbLNeFiQim4PyjoesxDbPiysYeE+/c2KYok5bh+RuetsUENl30kpSGxGSIlta8GzyYJ8q5j7");
    imageData.append("NyPCpxmpNbBrBVVmVCkyJCNE0R7pOhdXXqerjfi40hztkbPVOnzTNMF+LpU/CQ8CNYZtC9Hn56Z0kR4RZ52IQmyDcP/aSqarGzsxOGbHkHUK+pFxqJo+C4/eAjDrkak1Me2JTK2a2yi//nRqFbfO4ND3vShtGAlnNAIxO6GMTK3aD5vjIIgKL0veKKyQvPsyLZXTp5qV/eeJm661fqmmDjzU/3HUt7I4yQZ46/4iPvihFwdj7pH8r1X46doYtrwBBAM+TJquBMOZCCquHLrEZUibuupyX9VQOS2kzkmAPmYVXvZmn0eHIXyzD5GbPdJL5JXlZvtHjFaSu9xTL3iHe1ZGSCPeu08ryZsJ39h+q+aS32lTsYG7wu9aD0YbYWw7vkWLBQGayqnr+z3/Ne7+jFJJSckrEaAcuUaS5yKBh8fqhlaaZ6Hrs4rUdVmvc/fE6h9WX8uxlVg73AAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image47148538d74e6cc1623c2e2e0e82870e = new WeakReference<>(result);
        return result;
    } catch (IOException ioe) {
    }
    return null;
}


	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
// _0_0_0
BufferedImage image47148538d74e6cc1623c2e2e0e82870e=getImage47148538d74e6cc1623c2e2e0e82870e();
if (image47148538d74e6cc1623c2e2e0e82870e != null) {
    g.drawImage(image47148538d74e6cc1623c2e2e0e82870e, 0, 0, null);
}

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 50.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 50.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_show_property_50() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
    public boolean supportsColorFilter() {
        return false;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Color filters on raster content not supported");
    }

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static RadianceIcon of(int width, int height) {
       icons8_show_property_50 base = new icons8_show_property_50();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       icons8_show_property_50 base = new icons8_show_property_50();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return icons8_show_property_50::new;
    }
}

