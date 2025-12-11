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
public class icons8_browse_64 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image1d4f0ce629715d701e8ab78e13c73c0a;
private static BufferedImage getImage1d4f0ce629715d701e8ab78e13c73c0a() {
    BufferedImage result = (image1d4f0ce629715d701e8ab78e13c73c0a != null)
        ? image1d4f0ce629715d701e8ab78e13c73c0a.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1764);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAE80lEQVR4Xu2aXW8bRRSGKyQ+r/gFXMEP4Q4BTopUVMFtPtyUVhSEVKcFWaLQFvHRhkpVUorXM7vrJI6dFCWkTpviVJA4cRKgidskTnxZcUlJIkG5mZ5jZGf3zDpZB693Y++Rnot4Z2fO++7M7BllDx3yww8/ShFk661BZWPqmLKxfSxaEPsB7t9q/251/si5sVxLKCbqzHYgpKdbT+sBqm3PCCqFi1TM/0IpPH7nizsZiyTrxedUY8XAJy8JqAHBaOGftz8b/90iuboQCGlvUq2WUZz2FgJqAcysR0fCN/I0uXoQOB37iWq1DEhyiyZeS4KRjT/e+iTxkCboNIFQbJNqtQyasBN0RjbWD5+N/0mTdBqq1TJosk7ReX31t9bQwN80SSehWi2DJuok7ddyMy3d/f/SRJ2CarUMmqTTBL9fyx29MJFt6R7YognXGqrVMmiCDcl/xV26M1KQiySpcYMDr31zkUQbNAWssFMkSRebAKh9dookerFJ2CmSLC42Bb4BvgG+Ab4BvgG+Ab4BvgG+AfRCs+AbcBAMeC+6Lj5gOfERWwLuiZPRVanNfvGsAe9HV8RFnha9fESoqio0AlP7xSV2U3zMsqLL4n67eM6Ak9E18Q1PgWhNEl2JazwhzrB5qS87eMqAEFsUEXVQEmgXNK4Llgvtdzc8Y8BZmMpWUx3RNU3EBwfFyPCwSCaToj8Wk9qUuKreECdYXuq/Ep4woBuevNWUTwwNienpabFy/75Yz+fL5NfWxK+Li+LWxETRHHrfFXXM9r7gugEnYM1H+IBJAIqampoyia7E8tKSGIZZQU04z9LSWFa4bsDXfEISP5vJSEJ3Y3VlRfwwMmLqh6u6OMUeSONRXDUAX3V03dt98pQHsExwnzD29RW/JY1JcdWACzBNjQknYc1TYdWQmZkx9cfUGBRRu2+IrhrQy4dNCeOGR0VV");
    imageData.append("A26O8Xjc1Ode9YFrBhyH97Vx58e1T3f7/TB5+7bJAJxldGwjrhnwIdT2xkSHYP1SMfthhiyDy/ymNLYR1wzAg40xUSxyqJi2tjbR0d5u+29kYX7e1G8P/1Ea20jZAKe/EaLgqc6YKFZ41AAU19HRYftvJDs7a+r3Wz4mjV0CNP9lnAFp2sBJ8EhrTBTLW9zEqAnV8vPdu6Z+v+ST0tglgtHCnbIB+NEAbeA0ChxpjclieUsFVcvo6Kipz0/ZL9K4JbqUwhtlAzDwowHayEku8XFTsljbU0HVkFtels4Gp6I5aVwEpv85k/hS4EcD+H/zeuwJZ9iCKVlMHmt7KswuqVTK1F8fT5rGQ0047aUn71b09fU9rXKeNyadTCSKtT0VtxcZKKKM/RTRtHfpmJ4LnbHXaeJ4sMHanoqsBL77dV2nBmyCwS/Q8TwZMAt0agIebLC23+3NgGueTnsj0O94T0/Ps3Q8zwXU789onE9SAUUjoLbH8haf8kI2K+bm5oqvOtzt6YZnBZw2U4qiPEfH9FxAki9islRALTgwMyEcDj8FMyEMCT+mImywafFbmQNjAgZj7CUwohcS36ZCKDBr7sFufxSWyvMokl4/sCZg4NrlnL8GIs+DAIZLBEgCV4HjcO1lY3sU13AmVBt2TEAz6X0NFXZMgLrhFXpfQ8WeJmjaq/SehotKJsBvj/C1S9s3ZKAJIJoZxcPmeZi2a/jANY/TvmmevB9VxBPicDqP9hYDPQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image1d4f0ce629715d701e8ab78e13c73c0a = new WeakReference<>(result);
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
BufferedImage image1d4f0ce629715d701e8ab78e13c73c0a=getImage1d4f0ce629715d701e8ab78e13c73c0a();
if (image1d4f0ce629715d701e8ab78e13c73c0a != null) {
    g.drawImage(image1d4f0ce629715d701e8ab78e13c73c0a, 0, 0, null);
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
		return 64.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 64.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_browse_64() {
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
       icons8_browse_64 base = new icons8_browse_64();
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
       icons8_browse_64 base = new icons8_browse_64();
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
        return icons8_browse_64::new;
    }
}

