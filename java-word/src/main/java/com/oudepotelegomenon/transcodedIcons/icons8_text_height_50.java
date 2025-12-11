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
public class icons8_text_height_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image924a7a84415b01e0d45a5d0e5f541702;
private static BufferedImage getImage924a7a84415b01e0d45a5d0e5f541702() {
    BufferedImage result = (image924a7a84415b01e0d45a5d0e5f541702 != null)
        ? image924a7a84415b01e0d45a5d0e5f541702.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(892);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACZUlEQVR4Xu2ZTWsTQRjHI/gBvPgZPHgoCN57b43foFCwuwmoFzHJTrasL/jSt33Dqti0sbQWSlojeSlUS0mI2pxUpJ9DwUsk0Y77FBY2k93M7iwtVJ4f/C87z87Mb2d2DzuJBIIgyJlDyhl6WrU+nmZSxGrK2YURdi5+JEl9YpxUrrDXB0ir9kF2tkifLpVPLZJiUDlrjLJzYUnm6pPXlPpfJz/HcztX2fY+QGRuuULfNQ/per1NC2+bQ7NaOTiu9aa0922gzi/b+9+P68OIuBLOilAIV8YVKTcO6U1tsQuDDIuzel1WZKXcGqjzi/1mN5QIKxFKxhV5VWpQWTF7k4p1ka1xmVKMe5mZ5U6QCFvvxXkX5+88WvrNEwmS4Mq4IvmFta5EzE223UsckZRqXJIU/Wi1+jlQhCcxVAZEcnOvKQzi17mXOCKArJqfnLGO/ETCSgTKuJ9fOW9sJRL0nKfvAeKKSEQfS6lWi/38jmWrI0lS23Um98EbZvI/fNo3r2vlC94xQhFXJCr9IrUG2y4MigiCIjxQRBAU4YEigqAIDxQRBEV4oIggKMIDRQRBER4oIgiK8Dgpkf/qd1DsH3RROEkRIKxMJAlN087fyOiXZWJMOLHTefuLrBjdzGyxFyQiE/OXk7ak6BbcB/ez/fLgyUSSAODpw+Ru3V/sTJvrvfmVKi1sN2lp72ufBASOJNZqbfps4z19/HKL3n1S6KSI8Ud0lYJkIksAQdsobOJuN1ZGSAIAkdsPXvT0Yo2K5OHzUiwRINLRWxCwx9Oq3WIPMqNEzpv7bL9RSYY9DEUQBDkz/ANlnz2smUUW7AAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image924a7a84415b01e0d45a5d0e5f541702 = new WeakReference<>(result);
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
BufferedImage image924a7a84415b01e0d45a5d0e5f541702=getImage924a7a84415b01e0d45a5d0e5f541702();
if (image924a7a84415b01e0d45a5d0e5f541702 != null) {
    g.drawImage(image924a7a84415b01e0d45a5d0e5f541702, 0, 0, null);
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
	private icons8_text_height_50() {
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
       icons8_text_height_50 base = new icons8_text_height_50();
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
       icons8_text_height_50 base = new icons8_text_height_50();
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
        return icons8_text_height_50::new;
    }
}

