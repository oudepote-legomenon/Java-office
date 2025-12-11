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
public class icons8_h3_64 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 55.0f, 11.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.6475594f, 1.7277913f, 5.361367f, 2.9448674f, 7.4375f, 6.375f);
generalPath.curveTo(8.135438f, 9.632044f, 7.886968f, 11.79327f, 7.0f, 15.0f);
generalPath.curveTo(5.4375f, 17.375f, 5.4375f, 17.375f, 4.0f, 19.0f);
generalPath.curveTo(4.825f, 19.61875f, 5.65f, 20.2375f, 6.5f, 20.875f);
generalPath.curveTo(9.081034f, 23.441368f, 9.414016f, 25.399391f, 9.5f, 29.0f);
generalPath.curveTo(9.275573f, 33.08215f, 8.771235f, 35.846527f, 6.0f, 39.0f);
generalPath.curveTo(0.57086986f, 42.85232f, -4.5354247f, 43.05039f, -11.0f, 42.0f);
generalPath.curveTo(-14.034608f, 40.50073f, -16.070868f, 38.780956f, -18.0f, 36.0f);
generalPath.curveTo(-18.9375f, 32.625f, -18.9375f, 32.625f, -19.0f, 30.0f);
generalPath.curveTo(-16.03f, 29.67f, -13.06f, 29.34f, -10.0f, 29.0f);
generalPath.curveTo(-9.01f, 30.65f, -8.02f, 32.3f, -7.0f, 34.0f);
generalPath.curveTo(-3.70924f, 33.620956f, -3.70924f, 33.620956f, -1.0f, 32.0f);
generalPath.curveTo(-0.8333333f, 28.5f, -0.8333333f, 28.5f, -1.0f, 25.0f);
generalPath.curveTo(-2.9682288f, 23.03177f, -6.3480873f, 23.337517f, -9.0f, 23.0f);
generalPath.curveTo(-8.67f, 20.69f, -8.34f, 18.38f, -8.0f, 16.0f);
generalPath.curveTo(-7.195625f, 15.79375f, -6.39125f, 15.5875f, -5.5625f, 15.375f);
generalPath.curveTo(-4.716875f, 14.92125f, -3.87125f, 14.4675f, -3.0f, 14.0f);
generalPath.curveTo(-2.1016917f, 10.947275f, -2.1016917f, 10.947275f, -2.0f, 8.0f);
generalPath.curveTo(-4.330719f, 7.5812945f, -4.330719f, 7.5812945f, -7.0f, 8.0f);
generalPath.curveTo(-9.336308f, 10.39859f, -9.336308f, 10.39859f, -11.0f, 13.0f);
generalPath.curveTo(-13.31f, 12.34f, -15.62f, 11.68f, -18.0f, 11.0f);
generalPath.curveTo(-17.814302f, 7.0075197f, -17.200224f, 5.242377f, -14.625f, 2.125f);
generalPath.curveTo(-10.244395f, -1.144582f, -5.198547f, -0.8342393f, 0.0f, 0.0f);
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
        return 9.85541820526123;
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
		return 44.194969177246094;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_h3_64() {
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
       icons8_h3_64 base = new icons8_h3_64();
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
       icons8_h3_64 base = new icons8_h3_64();
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
        return icons8_h3_64::new;
    }
}

