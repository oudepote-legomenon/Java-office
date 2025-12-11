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
public class icons8_send_to_printer_40 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagece68e99687ad34c40ae004f8c3d6072f;
private static BufferedImage getImagece68e99687ad34c40ae004f8c3d6072f() {
    BufferedImage result = (imagece68e99687ad34c40ae004f8c3d6072f != null)
        ? imagece68e99687ad34c40ae004f8c3d6072f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(812);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAYAAACM/rhtAAACKklEQVR4Xu2Xyy8DURjFrfx5dp47kYiKpUWZIl4bI6q1IFSkK2yqhAgWItGwIJFoRMSClI1HEGoh+PRcmXH7dcq92tGiJzlJM3d6zm9up5Nvysr+iyral0g2Xy+4AGUu3wqXAGV5zRCpmAPy9WzmfdpCiIo4oIpKgLKKEnBsPp72aJEBLY8txPnXbLkO+PzySt7xbWoZ3bPhLOMY1nBONrkOCN0/PlGDuU6tU4c2XGv4SBzD2mf6EUDo/PKBantWyTd9Sr7ZBNX1rYljX+nHAKG940uq6V0TxmcV5QzY2OYXIapa3DoRVhWy0cF7laULqCtlwMqurvLmjuCwxxe4xRdky48MN8z7PL7gTcp+MNmAns6g3zsYTs6s7FJ0I55mhPBHSL6MbN4HhjYznATkB2Bq55zgCgH4DrkjdtIGxNbykwoJCKfdm8UAeH0WoavEXPECAq6oAbn/DmB19yr1Ry8ywnN1XyoT2bxPG9CYiFH9YEwE8pLvGlnINEKxjD5twMj6voCsSl2t9fTP1chCJrJ5nzZgoVwCzNW/H3AgFKUmI5AxDrlh9AxMzusBNneM2AEYLN2y1YE+LUBckbWDCDpIXOfdFqDHCJIZ0txB2W4C8i5HQAyH2QZWC1DW3X0y46dScWRlMy0nG+D7wBr4GFgx8mPMxgI/2QkwX3ICBIMXI78xMmQD4gUF7wDYSfnfJf9J3BByeZfjS9NXchOQd31L/F7Kp3nXr9MbxAWIfQnnq/UAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagece68e99687ad34c40ae004f8c3d6072f = new WeakReference<>(result);
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
BufferedImage imagece68e99687ad34c40ae004f8c3d6072f=getImagece68e99687ad34c40ae004f8c3d6072f();
if (imagece68e99687ad34c40ae004f8c3d6072f != null) {
    g.drawImage(imagece68e99687ad34c40ae004f8c3d6072f, 0, 0, null);
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
		return 40.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 40.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_send_to_printer_40() {
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
       icons8_send_to_printer_40 base = new icons8_send_to_printer_40();
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
       icons8_send_to_printer_40 base = new icons8_send_to_printer_40();
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
        return icons8_send_to_printer_40::new;
    }
}

