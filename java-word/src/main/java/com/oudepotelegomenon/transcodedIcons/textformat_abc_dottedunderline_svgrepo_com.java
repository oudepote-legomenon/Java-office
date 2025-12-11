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
public class textformat_abc_dottedunderline_svgrepo_com implements RadianceIcon {
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
generalPath.moveTo(20.6063f, 37.8f);
generalPath.curveTo(21.4605f, 37.8f, 22.0833f, 37.2127f, 22.0833f, 36.3052f);
generalPath.lineTo(22.0833f, 33.7427f);
generalPath.lineTo(22.1545f, 33.7427f);
generalPath.curveTo(23.2933f, 36.2518f, 25.6245f, 37.8178f, 28.5784f, 37.8178f);
generalPath.curveTo(33.4363f, 37.8178f, 36.6214f, 33.9563f, 36.6214f, 27.9951f);
generalPath.curveTo(36.6214f, 22.0338f, 33.4184f, 18.1723f, 28.614f, 18.1723f);
generalPath.curveTo(25.7134f, 18.1723f, 23.3645f, 19.7561f, 22.2613f, 22.2295f);
generalPath.lineTo(22.1723f, 22.2295f);
generalPath.lineTo(22.1723f, 13.1364f);
generalPath.curveTo(22.1723f, 12.1755f, 21.5673f, 11.5527f, 20.6775f, 11.5527f);
generalPath.curveTo(19.7877f, 11.5527f, 19.1827f, 12.1755f, 19.1827f, 13.1364f);
generalPath.lineTo(19.1827f, 36.3052f);
generalPath.curveTo(19.1827f, 37.2305f, 19.7522f, 37.8f, 20.6063f, 37.8f);
generalPath.closePath();
generalPath.moveTo(47.4408f, 37.8178f);
generalPath.curveTo(50.9464f, 37.8178f, 53.9358f, 35.8959f, 54.9501f, 33.1733f);
generalPath.curveTo(55.0568f, 32.8708f, 55.1104f, 32.5861f, 55.1104f, 32.337f);
generalPath.curveTo(55.1104f, 31.5718f, 54.5765f, 31.038f, 53.8291f, 31.038f);
generalPath.curveTo(53.153f, 31.038f, 52.797f, 31.3049f, 52.4056f, 32.0878f);
generalPath.curveTo(51.4624f, 34.1165f, 49.8611f, 35.2197f, 47.4587f, 35.2197f);
generalPath.curveTo(43.9885f, 35.2197f, 41.7108f, 32.4615f, 41.7108f, 28.0129f);
generalPath.curveTo(41.7108f, 23.5997f, 43.9885f, 20.7704f, 47.4587f, 20.7704f);
generalPath.curveTo(49.7543f, 20.7704f, 51.4092f, 21.8558f, 52.3698f, 23.9378f);
generalPath.curveTo(52.7438f, 24.6852f, 53.0994f, 24.9521f, 53.758f, 24.9521f);
generalPath.curveTo(54.5233f, 24.9521f, 55.0568f, 24.4539f, 55.0568f, 23.6709f);
generalPath.curveTo(55.0568f, 23.4574f, 55.0036f, 23.1905f, 54.9326f, 22.9591f);
generalPath.curveTo(54.0426f, 20.2365f, 50.9999f, 18.1723f, 47.3873f, 18.1723f);
generalPath.curveTo(42.0847f, 18.1723f, 38.6324f, 22.0694f, 38.6324f, 28.0306f);
generalPath.curveTo(38.6324f, 34.0275f, 42.1201f, 37.8178f, 47.4408f, 37.8178f);
generalPath.closePath();
generalPath.moveTo(6.3527f, 37.8f);
generalPath.curveTo(9.0575f, 37.8f, 11.62f, 36.323f, 12.6876f, 34.0453f);
generalPath.lineTo(12.741f, 34.0453f);
generalPath.lineTo(12.741f, 36.3586f);
generalPath.curveTo(12.7766f, 37.2305f, 13.3639f, 37.8178f, 14.2002f, 37.8178f);
generalPath.curveTo(15.0544f, 37.8178f, 15.6416f, 37.2305f, 15.6416f, 36.2874f);
generalPath.lineTo(15.6416f, 24.5073f);
generalPath.curveTo(15.6416f, 20.6636f, 12.83f, 18.1902f, 8.3457f, 18.1902f);
generalPath.curveTo(5.0181f, 18.1902f, 2.2599f, 19.6493f, 1.2278f, 21.9092f);
generalPath.curveTo(1.0321f, 22.3541f, 0.9075f, 22.7812f, 0.9075f, 23.1549f);
generalPath.curveTo(0.9075f, 23.9378f, 1.477f, 24.4361f, 2.2599f, 24.4361f);
generalPath.curveTo(2.8116f, 24.4361f, 3.2209f, 24.2404f, 3.5056f, 23.7421f);
generalPath.curveTo(4.4665f, 21.6957f, 5.979f, 20.7526f, 8.2745f, 20.7526f);
generalPath.curveTo(11.015f, 20.7526f, 12.6343f, 22.2829f, 12.6343f, 24.7564f);
generalPath.lineTo(12.6343f, 26.2512f);
generalPath.lineTo(6.9578f, 26.5715f);
generalPath.curveTo(2.4913f, 26.874f, 0.0f, 28.8848f, 0.0f, 32.159f);
generalPath.curveTo(0.0f, 35.5578f, 2.598f, 37.8f, 6.3527f, 37.8f);
generalPath.closePath();
generalPath.moveTo(27.9022f, 35.2197f);
generalPath.curveTo(24.5568f, 35.2197f, 22.1723f, 32.3548f, 22.1723f, 28.0129f);
generalPath.curveTo(22.1723f, 23.6531f, 24.5568f, 20.7882f, 27.9022f, 20.7882f);
generalPath.curveTo(31.3543f, 20.7882f, 33.5252f, 23.582f, 33.5252f, 27.9951f);
generalPath.curveTo(33.5252f, 32.4437f, 31.3543f, 35.2197f, 27.9022f, 35.2197f);
generalPath.closePath();
generalPath.moveTo(7.0645f, 35.3265f);
generalPath.curveTo(4.68f, 35.3265f, 3.0785f, 34.0275f, 3.0785f, 32.1056f);
generalPath.curveTo(3.0785f, 30.2372f, 4.5732f, 29.0094f, 7.3314f, 28.8136f);
generalPath.lineTo(12.6343f, 28.4755f);
generalPath.lineTo(12.6343f, 30.3262f);
generalPath.curveTo(12.6343f, 33.1377f, 10.1608f, 35.3265f, 7.0645f, 35.3265f);
generalPath.closePath();
generalPath.moveTo(45.3945f, 48.9929f);
generalPath.curveTo(46.5687f, 48.9929f, 47.5298f, 48.0319f, 47.5298f, 46.8575f);
generalPath.curveTo(47.5298f, 45.683f, 46.5687f, 44.7221f, 45.3945f, 44.7221f);
generalPath.curveTo(44.2199f, 44.7221f, 43.2589f, 45.683f, 43.2589f, 46.8575f);
generalPath.curveTo(43.2589f, 48.0319f, 44.2199f, 48.9929f, 45.3945f, 48.9929f);
generalPath.closePath();
generalPath.moveTo(53.8648f, 48.9929f);
generalPath.curveTo(55.0393f, 48.9929f, 56.0f, 48.0319f, 56.0f, 46.8575f);
generalPath.curveTo(56.0f, 45.683f, 55.0393f, 44.7221f, 53.8648f, 44.7221f);
generalPath.curveTo(52.6902f, 44.7221f, 51.7295f, 45.683f, 51.7295f, 46.8575f);
generalPath.curveTo(51.7295f, 48.0319f, 52.6902f, 48.9929f, 53.8648f, 48.9929f);
generalPath.closePath();
generalPath.moveTo(36.9243f, 48.9929f);
generalPath.curveTo(38.1164f, 48.9929f, 39.0595f, 48.0319f, 39.0595f, 46.8575f);
generalPath.curveTo(39.0595f, 45.683f, 38.1164f, 44.7221f, 36.9243f, 44.7221f);
generalPath.curveTo(35.7497f, 44.7221f, 34.7887f, 45.683f, 34.7887f, 46.8575f);
generalPath.curveTo(34.7887f, 48.0319f, 35.7497f, 48.9929f, 36.9243f, 48.9929f);
generalPath.closePath();
generalPath.moveTo(28.4538f, 48.9929f);
generalPath.curveTo(29.6461f, 48.9929f, 30.5892f, 48.0319f, 30.5892f, 46.8575f);
generalPath.curveTo(30.5892f, 45.683f, 29.6461f, 44.7221f, 28.4538f, 44.7221f);
generalPath.curveTo(27.2794f, 44.7221f, 26.3185f, 45.683f, 26.3185f, 46.8575f);
generalPath.curveTo(26.3185f, 48.0319f, 27.2794f, 48.9929f, 28.4538f, 48.9929f);
generalPath.closePath();
generalPath.moveTo(19.9835f, 48.9929f);
generalPath.curveTo(21.1757f, 48.9929f, 22.1189f, 48.0319f, 22.1189f, 46.8575f);
generalPath.curveTo(22.1189f, 45.683f, 21.1757f, 44.7221f, 19.9835f, 44.7221f);
generalPath.curveTo(18.8091f, 44.7221f, 17.8481f, 45.683f, 17.8481f, 46.8575f);
generalPath.curveTo(17.8481f, 48.0319f, 18.8091f, 48.9929f, 19.9835f, 48.9929f);
generalPath.closePath();
generalPath.moveTo(11.5132f, 48.9929f);
generalPath.curveTo(12.7055f, 48.9929f, 13.6664f, 48.0319f, 13.6664f, 46.8575f);
generalPath.curveTo(13.6664f, 45.683f, 12.7055f, 44.7221f, 11.5132f, 44.7221f);
generalPath.curveTo(10.3387f, 44.7221f, 9.3778f, 45.683f, 9.3778f, 46.8575f);
generalPath.curveTo(9.3778f, 48.0319f, 10.3387f, 48.9929f, 11.5132f, 48.9929f);
generalPath.closePath();
generalPath.moveTo(3.0251f, 48.9929f);
generalPath.curveTo(4.2173f, 48.9929f, 5.1605f, 48.0319f, 5.1605f, 46.8575f);
generalPath.curveTo(5.1605f, 45.683f, 4.2173f, 44.7221f, 3.0251f, 44.7221f);
generalPath.curveTo(1.8506f, 44.7221f, 0.8897f, 45.683f, 0.8897f, 46.8575f);
generalPath.curveTo(0.8897f, 48.0319f, 1.8506f, 48.9929f, 3.0251f, 48.9929f);
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
        return 165.03857421875;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 800.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 534.8599853515625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private textformat_abc_dottedunderline_svgrepo_com() {
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
       textformat_abc_dottedunderline_svgrepo_com base = new textformat_abc_dottedunderline_svgrepo_com();
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
       textformat_abc_dottedunderline_svgrepo_com base = new textformat_abc_dottedunderline_svgrepo_com();
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
        return textformat_abc_dottedunderline_svgrepo_com::new;
    }
}

