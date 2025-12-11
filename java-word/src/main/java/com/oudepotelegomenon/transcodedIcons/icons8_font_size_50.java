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
public class icons8_font_size_50 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.0f, 5.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.3f, 0.0f, 6.6f, 0.0f, 10.0f, 0.0f);
generalPath.curveTo(11.448039f, 5.1808934f, 12.887637f, 10.364019f, 14.319824f, 15.549316f);
generalPath.curveTo(14.947166f, 17.80964f, 15.583853f, 20.067112f, 16.222656f, 22.324219f);
generalPath.curveTo(16.586311f, 23.63271f, 16.949612f, 24.941298f, 17.3125f, 26.25f);
generalPath.curveTo(17.801699f, 27.990234f, 17.801699f, 27.990234f, 18.300781f, 29.765625f);
generalPath.curveTo(18.989677f, 32.952248f, 19.132885f, 35.751682f, 19.0f, 39.0f);
generalPath.curveTo(16.36f, 39.0f, 13.72f, 39.0f, 11.0f, 39.0f);
generalPath.curveTo(10.34f, 36.03f, 9.68f, 33.06f, 9.0f, 30.0f);
generalPath.curveTo(6.36f, 30.0f, 3.72f, 30.0f, 1.0f, 30.0f);
generalPath.curveTo(0.34f, 32.97f, -0.32f, 35.94f, -1.0f, 39.0f);
generalPath.curveTo(-3.97f, 39.0f, -6.94f, 39.0f, -10.0f, 39.0f);
generalPath.curveTo(-6.9656787f, 25.907227f, -3.7069254f, 12.91903f, 0.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(4.0f, 11.0f);
generalPath.curveTo(3.34f, 14.96f, 2.68f, 18.92f, 2.0f, 23.0f);
generalPath.curveTo(3.98f, 23.0f, 5.96f, 23.0f, 8.0f, 23.0f);
generalPath.curveTo(7.34f, 19.04f, 6.68f, 15.08f, 6.0f, 11.0f);
generalPath.curveTo(5.34f, 11.0f, 4.68f, 11.0f, 4.0f, 11.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 40.5625f, 19.625f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.9500391f, -0.02835938f, 1.9000782f, -0.05671875f, 2.8789062f, -0.0859375f);
generalPath.curveTo(5.4375f, 0.375f, 5.4375f, 0.375f, 7.0791016f, 2.105957f);
generalPath.curveTo(8.644557f, 4.7208643f, 8.788542f, 6.1208434f, 8.730469f, 9.140625f);
generalPath.curveTo(8.7208f, 10.030078f, 8.711133f, 10.919531f, 8.701172f, 11.8359375f);
generalPath.curveTo(8.676035f, 12.756329f, 8.650898f, 13.676719f, 8.625f, 14.625f);
generalPath.curveTo(8.604697f, 16.02879f, 8.604697f, 16.02879f, 8.583984f, 17.460938f);
generalPath.curveTo(8.548699f, 19.766212f, 8.499403f, 22.07031f, 8.4375f, 24.375f);
generalPath.curveTo(1.5436282f, 25.409704f, -3.4285512f, 25.97536f, -9.5625f, 22.375f);
generalPath.curveTo(-11.163648f, 19.172705f, -11.045731f, 15.8499975f, -10.5625f, 12.375f);
generalPath.curveTo(-9.125f, 10.375f, -9.125f, 10.375f, -6.5625f, 9.375f);
generalPath.curveTo(-3.5440476f, 9.151604f, -0.5823556f, 9.200778f, 2.4375f, 9.375f);
generalPath.curveTo(2.4375f, 8.385f, 2.4375f, 7.395f, 2.4375f, 6.375f);
generalPath.curveTo(-1.1925f, 6.705f, -4.8225f, 7.035f, -8.5625f, 7.375f);
generalPath.curveTo(-8.8925f, 5.725f, -9.2225f, 4.075f, -9.5625f, 2.375f);
generalPath.curveTo(-6.309482f, 0.45241264f, -3.7615118f, 0.05117703f, 0.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(-4.5625f, 15.375f);
generalPath.curveTo(-4.5625f, 16.365f, -4.5625f, 17.355f, -4.5625f, 18.375f);
generalPath.curveTo(-2.9125f, 18.375f, -1.2625f, 18.375f, 0.4375f, 18.375f);
generalPath.curveTo(1.0975f, 17.055f, 1.7575f, 15.735f, 2.4375f, 14.375f);
generalPath.curveTo(0.00952689f, 14.375f, -2.19157f, 14.875857f, -4.5625f, 15.375f);
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
        return 5.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 49.351043701171875;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 40.60036087036133;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_font_size_50() {
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
       icons8_font_size_50 base = new icons8_font_size_50();
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
       icons8_font_size_50 base = new icons8_font_size_50();
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
        return icons8_font_size_50::new;
    }
}

