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
public class icons8_add_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image58a1ac6a81a31354bb0c99a5238dbdd1;
private static BufferedImage getImage58a1ac6a81a31354bb0c99a5238dbdd1() {
    BufferedImage result = (image58a1ac6a81a31354bb0c99a5238dbdd1 != null)
        ? image58a1ac6a81a31354bb0c99a5238dbdd1.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(976);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAACpElEQVR4Xu2Yu24UMRSGI24FJZeKy0tERFClQ5FmkD3FCBR6XgFEs12gDxGseINF45ESoKHgGUDhARKouNUkDZx/dtP83ln2eMaTXWk+6Zd24/XxP87YPj4rKz09PY3JR/nZ1Nk7SWmepqUpEme/yPff8vm4knyWv+1XbfKbe0V2ezAYnOE4nWNKc0PMPRd9S0v7VyfzVR7m2UaRXee40dkY5VfFxFAMHPnGdEIM0ct0N73C40RBZm5T9IuNNJU8xM+kyB7weK2xOnx0Xt7j1zxw25IxXmEsHr8R8u+9KDP0ngeLJmffYUz2EUQ1812aP5GzH2R3u8B+1HTx2tQJi5v9qJBF9ZCDdi9zn33NhXX2ssz+Dz9g15IdL2SLlc5DP9jpSCZyh/3NBKdj00OK4XaNKi+76U32WUuVHkwJpBHD7Voh7WCfU0GShTyFA2jFcLtakm8haWS/Hsgqvc4BYrg9RLIW1tivxzgl9jtrxXB7kJx9wn495EfO6xgghtuD5Owb9usxvnhM6awUw+1BcvYz+/XQpMptwXHrhIOV/Xpo9v+24Li1cvYP+/VY+gdY/ldo6Rfx0m+jC3yQibfH7NcDRSfuGCKG24NUZLfYrweSOVkHh15npRhu10o8HcxdzUPqygG0YrhdL7PFPmtZtAsN9v9kL7nGPmdSlfs40KnJbLO//3J3lF9ahEs9So5Bl3qAWiUH7FqJy3L2pQK1Sg7alWT2X7AfNbiHykOUHDy+zNv1j+vn2E8QKLRWBVdvkDiSmd9rrbh7wqTIG31nwmvT2sxPA7XKOLuT+d54wc7LpG66gwPGN6JUFcNsY9vmcaKD0xFpR0juNO5jttQnbAwmCeAa6jbI2XHxwM0O6cg4JZHPzn5CG1JiZJVzJ2Y9PT0z+QejYGvHfJ3XXAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image58a1ac6a81a31354bb0c99a5238dbdd1 = new WeakReference<>(result);
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
BufferedImage image58a1ac6a81a31354bb0c99a5238dbdd1=getImage58a1ac6a81a31354bb0c99a5238dbdd1();
if (image58a1ac6a81a31354bb0c99a5238dbdd1 != null) {
    g.drawImage(image58a1ac6a81a31354bb0c99a5238dbdd1, 0, 0, null);
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
	private icons8_add_48() {
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
       icons8_add_48 base = new icons8_add_48();
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
       icons8_add_48 base = new icons8_add_48();
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
        return icons8_add_48::new;
    }
}

