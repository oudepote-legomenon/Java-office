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
public class icons8_quote_96 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 19.0f, 11.482421875f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.696416f, -0.00700928f, 1.392832f, -0.01401855f, 2.1103516f, -0.02124023f);
generalPath.curveTo(4.4073095f, -0.03881383f, 6.70303f, -0.02720107f, 9.0f, -0.01367188f);
generalPath.curveTo(10.598961f, -0.01636701f, 12.19792f, -0.0202496f, 13.796875f, -0.02526855f);
generalPath.curveTo(17.145992f, -0.03116269f, 20.494682f, -0.0226038f, 23.84375f, -0.00390625f);
generalPath.curveTo(28.134787f, 0.01888377f, 32.42482f, 0.00576017f, 36.71582f, -0.01819611f);
generalPath.curveTo(40.017002f, -0.03265667f, 43.31795f, -0.02804703f, 46.61914f, -0.01768494f);
generalPath.curveTo(48.20117f, -0.01501834f, 49.783226f, -0.0182851f, 51.365234f, -0.02760315f);
generalPath.curveTo(53.5774f, -0.03777366f, 55.787952f, -0.02226378f, 58.0f, 0.0f);
generalPath.curveTo(59.887188f, 0.00477356f, 59.887188f, 0.00477356f, 61.8125f, 0.00964355f);
generalPath.curveTo(65.0f, 0.5175781f, 65.0f, 0.5175781f, 67.40515f, 2.2042236f);
generalPath.curveTo(69.36146f, 5.041882f, 69.50637f, 6.6194577f, 69.51758f, 10.048828f);
generalPath.curveTo(69.53019f, 11.156777f, 69.54279f, 12.264727f, 69.555786f, 13.40625f);
generalPath.curveTo(69.54769f, 14.597988f, 69.53959f, 15.789726f, 69.53125f, 17.017578f);
generalPath.curveTo(69.53699f, 18.859325f, 69.53699f, 18.859325f, 69.54285f, 20.738281f);
generalPath.curveTo(69.54557f, 23.333992f, 69.53819f, 25.929731f, 69.521484f, 28.52539f);
generalPath.curveTo(69.500084f, 32.502575f, 69.52128f, 36.47795f, 69.546875f, 40.45508f);
generalPath.curveTo(69.544235f, 42.975914f, 69.53911f, 45.49675f, 69.53125f, 48.01758f);
generalPath.curveTo(69.539345f, 49.209316f, 69.54745f, 50.401054f, 69.555786f, 51.628906f);
generalPath.curveTo(69.543175f, 52.736855f, 69.53057f, 53.844803f, 69.51758f, 54.98633f);
generalPath.curveTo(69.5144f, 55.960217f, 69.511215f, 56.9341f, 69.507935f, 57.9375f);
generalPath.curveTo(68.84751f, 61.29217f, 67.71333f, 62.484596f, 65.0f, 64.51758f);
generalPath.curveTo(62.94951f, 64.93562f, 62.94951f, 64.93562f, 60.744873f, 64.82544f);
generalPath.curveTo(59.49658f, 64.782394f, 59.49658f, 64.782394f, 58.22307f, 64.73848f);
generalPath.curveTo(57.328323f, 64.69265f, 56.43358f, 64.64683f, 55.51172f, 64.59961f);
generalPath.curveTo(53.587955f, 64.560455f, 51.66412f, 64.524765f, 49.740234f, 64.49219f);
generalPath.curveTo(46.726917f, 64.42269f, 43.720978f, 64.33178f, 40.710693f, 64.17847f);
generalPath.curveTo(27.646963f, 63.38876f, 27.646963f, 63.38876f, 16.271973f, 68.93701f);
generalPath.curveTo(12.93246f, 72.10919f, 9.942117f, 75.513435f, 7.1304474f, 79.15947f);
generalPath.curveTo(6.7573996f, 79.60764f, 6.384352f, 80.055824f, 6.0f, 80.51758f);
generalPath.curveTo(5.67f, 80.51758f, 5.34f, 80.51758f, 5.0f, 80.51758f);
generalPath.curveTo(5.0f, 75.23758f, 5.0f, 69.95758f, 5.0f, 64.51758f);
generalPath.curveTo(3.1025f, 64.600075f, 1.205f, 64.68258f, -0.75f, 64.76758f);
generalPath.curveTo(-6.365323f, 65.01173f, -6.365323f, 65.01173f, -9.156128f, 62.838867f);
generalPath.curveTo(-11.419015f, 59.99007f, -11.505803f, 58.589684f, -11.517578f, 54.98633f);
generalPath.curveTo(-11.530187f, 53.87838f, -11.542795f, 52.77043f, -11.555786f, 51.628906f);
generalPath.curveTo(-11.547689f, 50.43717f, -11.539592f, 49.24543f, -11.53125f, 48.01758f);
generalPath.curveTo(-11.535077f, 46.789745f, -11.538904f, 45.561913f, -11.542847f, 44.296875f);
generalPath.curveTo(-11.545568f, 41.701164f, -11.538189f, 39.105423f, -11.521484f, 36.509766f);
generalPath.curveTo(-11.500081f, 32.53258f, -11.521279f, 28.557205f, -11.546875f, 24.580078f);
generalPath.curveTo(-11.544231f, 22.05924f, -11.539107f, 19.538404f, -11.53125f, 17.017578f);
generalPath.curveTo(-11.539347f, 15.82584f, -11.547443f, 14.634102f, -11.555786f, 13.40625f);
generalPath.curveTo(-11.543178f, 12.298301f, -11.530569f, 11.1903515f, -11.517578f, 10.048828f);
generalPath.curveTo(-11.514396f, 9.074942f, -11.511213f, 8.101055f, -11.507935f, 7.0976562f);
generalPath.curveTo(-10.225808f, 0.5850343f, -5.945197f, 0.01503812f, 0.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(9.0f, 20.517578f);
generalPath.curveTo(9.0f, 25.797579f, 9.0f, 31.077578f, 9.0f, 36.51758f);
generalPath.curveTo(11.64f, 36.51758f, 14.28f, 36.51758f, 17.0f, 36.51758f);
generalPath.curveTo(16.494688f, 37.300037f, 15.989375f, 38.0825f, 15.46875f, 38.88867f);
generalPath.curveTo(14.819062f, 39.900585f, 14.169375f, 40.9125f, 13.5f, 41.95508f);
generalPath.curveTo(12.850312f, 42.964413f, 12.200625f, 43.97375f, 11.53125f, 45.01367f);
generalPath.curveTo(9.913047f, 47.170597f, 9.913047f, 47.170597f, 10.0f, 48.51758f);
generalPath.curveTo(13.313623f, 48.93554f, 13.313623f, 48.93554f, 17.0f, 48.51758f);
generalPath.curveTo(21.246786f, 44.918377f, 24.44513f, 39.926178f, 25.348145f, 34.378906f);
generalPath.curveTo(25.678558f, 29.668175f, 25.328293f, 25.27782f, 25.0f, 20.517578f);
generalPath.curveTo(19.72f, 20.517578f, 14.44f, 20.517578f, 9.0f, 20.517578f);
generalPath.closePath();
generalPath.moveTo(33.0f, 20.517578f);
generalPath.curveTo(33.0f, 25.797579f, 33.0f, 31.077578f, 33.0f, 36.51758f);
generalPath.curveTo(35.64f, 36.51758f, 38.28f, 36.51758f, 41.0f, 36.51758f);
generalPath.curveTo(40.494686f, 37.300037f, 39.989376f, 38.0825f, 39.46875f, 38.88867f);
generalPath.curveTo(38.81906f, 39.900585f, 38.169376f, 40.9125f, 37.5f, 41.95508f);
generalPath.curveTo(36.85031f, 42.964413f, 36.200626f, 43.97375f, 35.53125f, 45.01367f);
generalPath.curveTo(33.913048f, 47.170597f, 33.913048f, 47.170597f, 34.0f, 48.51758f);
generalPath.curveTo(37.313625f, 48.93554f, 37.313625f, 48.93554f, 41.0f, 48.51758f);
generalPath.curveTo(45.246784f, 44.918377f, 48.44513f, 39.926178f, 49.348145f, 34.378906f);
generalPath.curveTo(49.67856f, 29.668175f, 49.328293f, 25.27782f, 49.0f, 20.517578f);
generalPath.curveTo(43.72f, 20.517578f, 38.44f, 20.517578f, 33.0f, 20.517578f);
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
        return 7.4442138671875;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 11.443608283996582;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 81.111572265625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 80.55638885498047;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_quote_96() {
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
       icons8_quote_96 base = new icons8_quote_96();
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
       icons8_quote_96 base = new icons8_quote_96();
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
        return icons8_quote_96::new;
    }
}

