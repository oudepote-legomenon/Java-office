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
public class icons8_h2_64 implements RadianceIcon {
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
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 11.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.97f, 0.0f, 5.94f, 0.0f, 9.0f, 0.0f);
generalPath.curveTo(9.0f, 5.28f, 9.0f, 10.56f, 9.0f, 16.0f);
generalPath.curveTo(13.95f, 16.0f, 18.9f, 16.0f, 24.0f, 16.0f);
generalPath.curveTo(24.0f, 10.72f, 24.0f, 5.44f, 24.0f, 0.0f);
generalPath.curveTo(27.3f, 0.0f, 30.6f, 0.0f, 34.0f, 0.0f);
generalPath.curveTo(34.0f, 13.86f, 34.0f, 27.72f, 34.0f, 42.0f);
generalPath.curveTo(30.7f, 42.0f, 27.4f, 42.0f, 24.0f, 42.0f);
generalPath.curveTo(24.0f, 36.06f, 24.0f, 30.12f, 24.0f, 24.0f);
generalPath.curveTo(19.05f, 24.0f, 14.1f, 24.0f, 9.0f, 24.0f);
generalPath.curveTo(9.0f, 29.94f, 9.0f, 35.88f, 9.0f, 42.0f);
generalPath.curveTo(6.03f, 42.0f, 3.06f, 42.0f, 0.0f, 42.0f);
generalPath.curveTo(0.0f, 28.14f, 0.0f, 14.28f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 57.0f, 11.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.2233772f, 1.6450757f, 5.3588066f, 3.7176132f, 7.0f, 7.0f);
generalPath.curveTo(7.824897f, 13.33992f, 7.2383866f, 17.937218f, 3.5039062f, 23.171875f);
generalPath.curveTo(1.1552006f, 26.026924f, -1.2314487f, 28.539066f, -4.0f, 31.0f);
generalPath.curveTo(-4.66f, 31.0f, -5.32f, 31.0f, -6.0f, 31.0f);
generalPath.curveTo(-6.0f, 31.66f, -6.0f, 32.32f, -6.0f, 33.0f);
generalPath.curveTo(-1.71f, 33.33f, 2.58f, 33.66f, 7.0f, 34.0f);
generalPath.curveTo(7.0f, 36.64f, 7.0f, 39.28f, 7.0f, 42.0f);
generalPath.curveTo(-2.24f, 42.0f, -11.48f, 42.0f, -21.0f, 42.0f);
generalPath.curveTo(-19.872147f, 34.105022f, -19.872147f, 34.105022f, -16.8125f, 30.4375f);
generalPath.curveTo(-16.186016f, 29.684687f, -15.559531f, 28.931875f, -14.9140625f, 28.15625f);
generalPath.curveTo(-12.369038f, 25.289202f, -9.842179f, 22.577791f, -7.0f, 20.0f);
generalPath.curveTo(-6.34f, 20.0f, -5.68f, 20.0f, -5.0f, 20.0f);
generalPath.curveTo(-2.6740916f, 16.365768f, -2.8373418f, 13.229116f, -3.0f, 9.0f);
generalPath.curveTo(-5.31f, 8.67f, -7.62f, 8.34f, -10.0f, 8.0f);
generalPath.curveTo(-10.66f, 9.98f, -11.32f, 11.96f, -12.0f, 14.0f);
generalPath.curveTo(-14.97f, 13.67f, -17.94f, 13.34f, -21.0f, 13.0f);
generalPath.curveTo(-18.855799f, 4.8996863f, -18.855799f, 4.8996863f, -15.5625f, 1.4375f);
generalPath.curveTo(-10.344874f, -0.66785777f, -5.545857f, -0.9028139f, 0.0f, 0.0f);
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
        return 0.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 10.097186088562012;
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
		return 42.90281295776367;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_h2_64() {
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
       icons8_h2_64 base = new icons8_h2_64();
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
       icons8_h2_64 base = new icons8_h2_64();
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
        return icons8_h2_64::new;
    }
}

