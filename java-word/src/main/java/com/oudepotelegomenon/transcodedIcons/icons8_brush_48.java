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
public class icons8_brush_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image027c31f9cc7b724ad0a68bc8d7a98f6b;
private static BufferedImage getImage027c31f9cc7b724ad0a68bc8d7a98f6b() {
    BufferedImage result = (image027c31f9cc7b724ad0a68bc8d7a98f6b != null)
        ? image027c31f9cc7b724ad0a68bc8d7a98f6b.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1260);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAADeElEQVR4Xu2XXUhTYRzGp9inZGIT06x5tvCqD9AiE2MIzSiKLmKbmtVdEUVhBBGS88orwZsgsyLNiiCyFMsurCiidBpedBFIGi0qBDXSaRTU0/9sbm7/czbddvYhnAcetr3nPe/7e96Pc95pNKpUqVIVitC1U4e2dWNoLzrGryW8XPAtmU40aYDm5f8WVQg/eI8XSwhZ+MUSIih8oofAi+NatOVMSoDlfI1CPCw5wtuImzBoS0f3gY8S0GBOlJlwwQ/Y7Og0SiG9sCnA1SRpebxnwgs/UAf0VEgBr68EnuwD7DX0PVV6PZ4h8LQ6wwvv8eM9QGsmcEcHdO0Gei+4y1+dkILHM8QP02rBYcr8OXX50Bx8MLfvkEJzu0IUVfK+FNdEabrOUbjUObxJg+HNSZg3RL/NvZQ4sJyjPRMoy81wbJuFn/XI1mQ4myxScI97z0tBgzlaIXBQlw6r3u7cm4URGnnfEMFnoha4EWADB7LSIWDTJBN8HxmiQw7xrAq4mU5BVgF3qY0HhQS5TAru61s545wjbEGjSYJF/9UTIKwQ3LfXS6E9btHOoMO4kXNEJIKu9w0QUQhxYzcHmIFowIuCVcjnAcIO8fq0FFx0a7YzKvAe0TL6wAOEFeJNNR0tkv3h7+VPoMMk8D4VFcE2cPiwQ4gb+/4W4FEx8PzoEPrq1/D+FBfM+goOHlEItwdjAi8KFmE7h+YOMUTs4EWhXDjFgeW8wBCxg4fRmEIb2Eb+y2EDeZ4QsYF3gwuH6RH6ngMuxHIhHCbtJDrPaXlfigpVWakEcJZG/BOHCtW+IT4XLJkZLU0z8P4UFcyGQhr1IQ4SicUQdIqdHjWmRe8lJQoWQwEtlykOENTl+jOozNPRfbvo90kK303ff/vXE95hf3aUl414XLYIDglgcLfxdkShIl9LbV0kfyH3w5ybwesoLhqlKzKAwTwD");
    imageData.append("s24tb4dLPMnyMsUF8waBRuqPD9x32sC9rIxZaOTtxE0EU+cFswg9NOUrXOVmfUmAENMLGf2YiYDsc3AGK7v2ViZAg2+duIuWi9MHrtZbTjNB1775wYv/zGjD+94fd/kFsOh/0eclWlZm13LyG3nxEWso5vfHXQT30h9Uxq5HoqGA35sQIrDSgAc11yYWGhNu2XDBmldGsM8IepyAx1yPUatQI75leV1VqlSpCkv/AcSTwvAiu/32AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image027c31f9cc7b724ad0a68bc8d7a98f6b = new WeakReference<>(result);
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
BufferedImage image027c31f9cc7b724ad0a68bc8d7a98f6b=getImage027c31f9cc7b724ad0a68bc8d7a98f6b();
if (image027c31f9cc7b724ad0a68bc8d7a98f6b != null) {
    g.drawImage(image027c31f9cc7b724ad0a68bc8d7a98f6b, 0, 0, null);
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
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_brush_48() {
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
       icons8_brush_48 base = new icons8_brush_48();
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
       icons8_brush_48 base = new icons8_brush_48();
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
        return icons8_brush_48::new;
    }
}

