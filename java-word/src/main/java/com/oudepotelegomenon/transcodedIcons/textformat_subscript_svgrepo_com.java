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
public class textformat_subscript_svgrepo_com implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(14.285714149475098f, 0.0f, 0.0f, 14.285714149475098f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.4844f, 42.332f);
generalPath.curveTo(10.6563f, 42.332f, 11.2188f, 41.8633f, 11.6875f, 40.5742f);
generalPath.lineTo(14.6875f, 32.2774f);
generalPath.lineTo(28.5156f, 32.2774f);
generalPath.lineTo(31.539f, 40.5742f);
generalPath.curveTo(31.9844f, 41.8633f, 32.5703f, 42.332f, 33.7422f, 42.332f);
generalPath.curveTo(35.0078f, 42.332f, 35.8516f, 41.582f, 35.8516f, 40.4102f);
generalPath.curveTo(35.8516f, 40.0117f, 35.7812f, 39.6602f, 35.5937f, 39.1445f);
generalPath.lineTo(24.6016f, 9.8945f);
generalPath.curveTo(24.0625f, 8.4414f, 23.1016f, 7.7383f, 21.6016f, 7.7383f);
generalPath.curveTo(20.1484f, 7.7383f, 19.1875f, 8.4414f, 18.6719f, 9.8711f);
generalPath.lineTo(7.6563f, 39.168f);
generalPath.curveTo(7.4688f, 39.6836f, 7.3984f, 40.0352f, 7.3984f, 40.4336f);
generalPath.curveTo(7.3984f, 41.6055f, 8.1953f, 42.332f, 9.4844f, 42.332f);
generalPath.closePath();
generalPath.moveTo(15.8359f, 28.6914f);
generalPath.lineTo(21.5312f, 12.918f);
generalPath.lineTo(21.6719f, 12.918f);
generalPath.lineTo(27.3437f, 28.6914f);
generalPath.closePath();
generalPath.moveTo(46.8906f, 48.2617f);
generalPath.curveTo(47.9219f, 48.2617f, 48.6016f, 47.5821f, 48.6016f, 46.5977f);
generalPath.lineTo(48.6016f, 30.5664f);
generalPath.curveTo(48.6016f, 29.3945f, 47.8984f, 28.6914f, 46.7266f, 28.6914f);
generalPath.curveTo(45.6953f, 28.6914f, 45.2031f, 29.0664f, 44.5f, 29.5586f);
generalPath.lineTo(40.75f, 32.1133f);
generalPath.curveTo(40.0937f, 32.5821f, 39.8359f, 32.9805f, 39.8359f, 33.4961f);
generalPath.curveTo(39.8359f, 34.2695f, 40.3984f, 34.8555f, 41.125f, 34.8555f);
generalPath.curveTo(41.5937f, 34.8555f, 41.8984f, 34.7148f, 42.3672f, 34.3867f);
generalPath.lineTo(45.0859f, 32.5586f);
generalPath.lineTo(45.1797f, 32.5586f);
generalPath.lineTo(45.1797f, 46.5977f);
generalPath.curveTo(45.1797f, 47.5821f, 45.8594f, 48.2617f, 46.8906f, 48.2617f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());

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
        return 105.69142150878906;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 110.5471420288086;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 588.6171264648438;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 578.9057006835938;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private textformat_subscript_svgrepo_com() {
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
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
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
       textformat_subscript_svgrepo_com base = new textformat_subscript_svgrepo_com();
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
       textformat_subscript_svgrepo_com base = new textformat_subscript_svgrepo_com();
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
        return textformat_subscript_svgrepo_com::new;
    }
}

