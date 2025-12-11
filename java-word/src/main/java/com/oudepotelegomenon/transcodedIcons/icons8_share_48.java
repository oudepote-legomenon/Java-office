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
public class icons8_share_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image1c960606f9367e887c8bc2ac8b3514ba;
private static BufferedImage getImage1c960606f9367e887c8bc2ac8b3514ba() {
    BufferedImage result = (image1c960606f9367e887c8bc2ac8b3514ba != null)
        ? image1c960606f9367e887c8bc2ac8b3514ba.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1240);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAADaklEQVR4XmNgGAWjYOgDvZ2fxQx2v2/R2/H2vM7Wt1+0Nr3+orH+5Tm1tS+bldY+F0NXP6iA8d4PoYa73n/S3/nuv+62t/+1N7/+r7nh1X/1tS//q6568V9p2bNPioufhaDrGxQA4vh3/3A5Xnn58/+KS579l1/45J/03MeDyxOgZIMv5OGOX/T0v8z8x/+lZj/6KDH3mSi6OQMGQGmeaMfPefRfYubD/6JT7zehmzNgQG/n2wukOF5s2oP/wpPvnUM3Z8CA7ta3n0lxvMjk+/8FJ9z7hG7OgIDQ+no2nQ3Pf5DieKEJ9/7z99z5iG4WXUFaWhprSmFNXGxmyQOjRZdJcrxA753/vJ23ByYJhYaGMoMcnlJYfRdI/0/Mq/xv37WWJMfzdd3+z91xsxHdbFoDxuSCKt+UguoLIIfDcHJB9f+wvOr/aosfkuL4Dzz1N0TQLaAZSC2odgE6/Ayyw5ExKBbcq6aBKimCjudpv/mPs/VmELodNAFpRdU2wBA+gO5gLPhfbFbpNt2+Q2XgSgqH40EhTxfHp+XXmgMdvhmLQzFwcmHN7pTiWmOYXlANC6qkhCfdOyvYf+8zsLT5zNt16ywozVOUbIhpJSblVeqkFNSsAoUoukMxcfWR1MJae3R7aAIItRKVlz394tSw+Gh8dtlfTIeih3j1CVBmRreDZoCEVuJ/14qp4AyJ7mgwLqi5nFxUHQo0khHdDpoBUluJcjPv/A/LqQYXjfAQL6i5DqTj6uvrmdDNpzkgp5VoXrcCHAtAh98DORxUcaGbSzdATitRvuvUr7j04hxQUwHdPLqDId1KBAHtza8+keL4QdFKRAYaG16dJ8XxoBpTqun44ElCoEqKFMeDqnuj8iWDJxODaljwUAaRjhdou/w/NAvk+EFSjIIAaBwGNJRByPHAVuJ/+4KJg6sigwHQOAy+ViJP+43P5oWz");
    imageData.append("B2dTAgaIaSUO2sYcqYCS5jQxrV66AVI7NHZLT5fja3sN2NgoMV1Kn+ZZ/4Gt3v+4HD8YxkZxdurD82v+m2x7Sdjxg2FsFNuwisukjcQ7frCMjSIPbJmtukaS4wfV2ChoaFFv86sfpDh+tNVLbUBOq3fAxkaxAXJavQMxNooTkNrqpfvYKDGAhFYv/cZGSQWEWr10GxulBBDT6h0Fo4BGAADwG6QcntR3DAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image1c960606f9367e887c8bc2ac8b3514ba = new WeakReference<>(result);
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
BufferedImage image1c960606f9367e887c8bc2ac8b3514ba=getImage1c960606f9367e887c8bc2ac8b3514ba();
if (image1c960606f9367e887c8bc2ac8b3514ba != null) {
    g.drawImage(image1c960606f9367e887c8bc2ac8b3514ba, 0, 0, null);
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
	private icons8_share_48() {
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
       icons8_share_48 base = new icons8_share_48();
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
       icons8_share_48 base = new icons8_share_48();
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
        return icons8_share_48::new;
    }
}

