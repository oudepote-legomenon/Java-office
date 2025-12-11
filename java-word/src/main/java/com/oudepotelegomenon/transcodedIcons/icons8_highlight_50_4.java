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
public class icons8_highlight_50_4 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 39.02734375f, 5.203125f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.1615686f, 1.2771486f, 4.8723593f, 3.1565018f, 6.9726562f, 5.796875f);
generalPath.curveTo(6.946546f, 10.870935f, 3.696204f, 13.698995f, 0.34765625f, 17.109375f);
generalPath.curveTo(-0.75633895f, 18.260635f, -1.8592093f, 19.412975f, -2.9609375f, 20.566406f);
generalPath.curveTo(-3.4931593f, 21.12022f, -4.025381f, 21.674034f, -4.5737305f, 22.244629f);
generalPath.curveTo(-6.3889756f, 24.183044f, -8.049156f, 26.229532f, -9.714844f, 28.296875f);
generalPath.curveTo(-12.664942f, 31.731426f, -15.871082f, 33.702232f, -19.914062f, 35.691406f);
generalPath.curveTo(-22.106548f, 36.74868f, -22.106548f, 36.74868f, -24.0625f, 38.453125f);
generalPath.curveTo(-26.027344f, 39.796875f, -26.027344f, 39.796875f, -29.777344f, 39.484375f);
generalPath.curveTo(-30.849844f, 39.2575f, -31.922344f, 39.030624f, -33.027344f, 38.796875f);
generalPath.curveTo(-33.027344f, 34.679676f, -32.51866f, 33.74158f, -30.222656f, 30.5625f);
generalPath.curveTo(-28.872704f, 28.56845f, -27.81474f, 26.500893f, -26.714844f, 24.359375f);
generalPath.curveTo(-24.143757f, 19.679682f, -20.989992f, 16.332903f, -17.027344f, 12.796875f);
generalPath.curveTo(-16.373789f, 12.210352f, -15.720234f, 11.623828f, -15.046875f, 11.019531f);
generalPath.curveTo(-13.711544f, 9.839171f, -12.366559f, 8.669634f, -11.011719f, 7.5117188f);
generalPath.curveTo(-9.684969f, 6.365177f, -8.382456f, 5.189999f, -7.1054688f, 3.9882812f);
generalPath.curveTo(-6.5021877f, 3.4301171f, -5.898906f, 2.8719532f, -5.2773438f, 2.296875f);
generalPath.curveTo(-4.74625f, 1.7915626f, -4.215156f, 1.28625f, -3.6679688f, 0.765625f);
generalPath.curveTo(-2.0273438f, -0.203125f, -2.0273438f, -0.203125f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(204, 219, 56, 255)) : new Color(204, 219, 56, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 17.0f, 23.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.0f, 0.0f, 2.0f, 0.0f, 3.65625f, 1.609375f);
generalPath.curveTo(4.2646875f, 2.3157814f, 4.873125f, 3.0221875f, 5.5f, 3.75f);
generalPath.curveTo(6.1084375f, 4.4460936f, 6.716875f, 5.1421876f, 7.34375f, 5.859375f);
generalPath.curveTo(8.879769f, 7.844608f, 9.972397f, 9.71872f, 11.0f, 12.0f);
generalPath.curveTo(7.517447f, 14.970413f, 4.099557f, 16.993834f, 0.0f, 19.0f);
generalPath.curveTo(-0.639375f, 19.5775f, -1.27875f, 20.155f, -1.9375f, 20.75f);
generalPath.curveTo(-5.0730543f, 22.650335f, -7.53676f, 21.732609f, -11.0f, 21.0f);
generalPath.curveTo(-11.0f, 16.890314f, -10.4980135f, 15.962093f, -8.214844f, 12.785156f);
generalPath.curveTo(-6.298141f, 9.968651f, -4.75187f, 6.9557314f, -3.1484375f, 3.953125f);
generalPath.curveTo(-2.0f, 2.0f, -2.0f, 2.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(57, 73, 78, 255)) : new Color(57, 73, 78, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 17.0f, 23.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.0f, 0.0f, 2.0f, 0.0f, 3.65625f, 1.609375f);
generalPath.curveTo(4.2646875f, 2.3157814f, 4.873125f, 3.0221875f, 5.5f, 3.75f);
generalPath.curveTo(6.1084375f, 4.4460936f, 6.716875f, 5.1421876f, 7.34375f, 5.859375f);
generalPath.curveTo(8.879769f, 7.844608f, 9.972397f, 9.71872f, 11.0f, 12.0f);
generalPath.curveTo(9.02f, 12.99f, 9.02f, 12.99f, 7.0f, 14.0f);
generalPath.curveTo(3.7f, 10.7f, 0.4f, 7.4f, -3.0f, 4.0f);
generalPath.curveTo(-2.01f, 2.68f, -1.02f, 1.36f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(104, 158, 55, 255)) : new Color(104, 158, 55, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 8.0f, 38.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.621875f, 1.04875f, 3.7937136f, 1.6493131f, 5.25f, 4.125f);
generalPath.curveTo(5.4975f, 4.74375f, 5.745f, 5.3625f, 6.0f, 6.0f);
generalPath.curveTo(3.0851722f, 6.8096743f, 1.5388678f, 7.21846f, -1.3125f, 6.0625f);
generalPath.curveTo(-1.869375f, 5.711875f, -2.42625f, 5.36125f, -3.0f, 5.0f);
generalPath.curveTo(-1.125f, 1.125f, -1.125f, 1.125f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(205, 219, 55, 255)) : new Color(205, 219, 55, 255);
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
        return 5.0;
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
		return 41.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 40.65033721923828;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_highlight_50_4() {
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
       icons8_highlight_50_4 base = new icons8_highlight_50_4();
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
       icons8_highlight_50_4 base = new icons8_highlight_50_4();
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
        return icons8_highlight_50_4::new;
    }
}

