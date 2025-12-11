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
public class icons8_highlight_50 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 36.1953125f, 0.62109375f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.9570038f, 0.5345813f, 5.982849f, 2.7124627f, 8.6796875f, 5.4414062f);
generalPath.curveTo(9.445391f, 6.1404004f, 9.445391f, 6.1404004f, 10.2265625f, 6.8535156f);
generalPath.curveTo(13.027132f, 9.635162f, 13.800035f, 11.019134f, 13.8515625f, 15.003906f);
generalPath.curveTo(12.755613f, 18.537115f, 11.91014f, 19.907494f, 9.1796875f, 22.316406f);
generalPath.curveTo(6.3577075f, 24.926739f, 3.6954918f, 27.532507f, 1.1796875f, 30.441406f);
generalPath.curveTo(0.6099219f, 31.094961f, 0.04015625f, 31.748516f, -0.546875f, 32.421875f);
generalPath.curveTo(-1.633957f, 33.712463f, -2.692461f, 35.02775f, -3.71875f, 36.367188f);
generalPath.curveTo(-8.189342f, 42.07961f, -12.48895f, 43.068882f, -19.570312f, 43.941406f);
generalPath.curveTo(-20.766563f, 44.08578f, -21.962812f, 44.230156f, -23.195312f, 44.378906f);
generalPath.curveTo(-23.690313f, 44.873905f, -23.690313f, 44.873905f, -24.195312f, 45.378906f);
generalPath.curveTo(-12.645312f, 45.708908f, -1.0953125f, 46.038906f, 10.8046875f, 46.378906f);
generalPath.curveTo(10.8046875f, 47.038906f, 10.8046875f, 47.698906f, 10.8046875f, 48.378906f);
generalPath.curveTo(-4.7053127f, 48.378906f, -20.215313f, 48.378906f, -36.195312f, 48.378906f);
generalPath.curveTo(-35.195312f, 44.378906f, -35.195312f, 44.378906f, -33.257812f, 42.503906f);
generalPath.curveTo(-30.098465f, 39.24882f, -29.42748f, 35.771915f, -28.695312f, 31.378906f);
generalPath.curveTo(-27.43135f, 23.79514f, -24.684284f, 20.40469f, -19.070312f, 15.441406f);
generalPath.curveTo(-18.394682f, 14.828216f, -17.719053f, 14.215025f, -17.02295f, 13.583252f);
generalPath.curveTo(-15.091309f, 11.835765f, -13.1466f, 10.104399f, -11.1953125f, 8.378906f);
generalPath.curveTo(-10.292969f, 7.5771093f, -9.390625f, 6.7753124f, -8.4609375f, 5.9492188f);
generalPath.curveTo(-7.151858f, 4.797802f, -5.837899f, 3.651865f, -4.515625f, 2.515625f);
generalPath.curveTo(-1.9933027f, 0.34403977f, -1.9933027f, 0.34403977f, 0.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(-0.1953125f, 2.3789062f);
generalPath.curveTo(-0.65421873f, 2.8378124f, -1.113125f, 3.2967188f, -1.5859375f, 3.7695312f);
generalPath.curveTo(-4.7890625f, 6.9726562f, -7.9921875f, 10.175781f, -11.1953125f, 13.378906f);
generalPath.curveTo(-7.2353125f, 17.338907f, -3.2753124f, 21.298906f, 0.8046875f, 25.378906f);
generalPath.curveTo(4.95827f, 21.944214f, 8.593441f, 18.746202f, 11.8046875f, 14.378906f);
generalPath.curveTo(8.126368f, 9.852746f, 4.393824f, 5.9846563f, -0.1953125f, 2.3789062f);
generalPath.closePath();
generalPath.moveTo(-14.1953125f, 15.378906f);
generalPath.curveTo(-14.630103f, 19.488453f, -14.630103f, 19.488453f, -11.7890625f, 22.175781f);
generalPath.curveTo(-10.767801f, 23.170515f, -9.736093f, 24.154613f, -8.6953125f, 25.128906f);
generalPath.curveTo(-7.90834f, 25.88881f, -7.90834f, 25.88881f, -7.1054688f, 26.664062f);
generalPath.curveTo(-5.810899f, 27.911558f, -4.504235f, 29.146479f, -3.1953125f, 30.378906f);
generalPath.curveTo(-2.2053125f, 29.388906f, -1.2153125f, 28.398907f, -0.1953125f, 27.378906f);
generalPath.curveTo(-2.147701f, 25.372782f, -4.106691f, 23.373981f, -6.0703125f, 21.378906f);
generalPath.curveTo(-6.6258984f, 20.806562f, -7.181484f, 20.234219f, -7.7539062f, 19.644531f);
generalPath.curveTo(-9.196656f, 18.184399f, -10.69275f, 16.777412f, -12.1953125f, 15.378906f);
generalPath.curveTo(-12.855312f, 15.378906f, -13.515312f, 15.378906f, -14.1953125f, 15.378906f);
generalPath.closePath();
generalPath.moveTo(-21.820312f, 21.878906f);
generalPath.curveTo(-22.604063f, 22.703907f, -23.387812f, 23.528906f, -24.195312f, 24.378906f);
generalPath.curveTo(-22.585207f, 28.452667f, -19.65709f, 31.143976f, -16.570312f, 34.128906f);
generalPath.curveTo(-15.796875f, 34.88881f, -15.796875f, 34.88881f, -15.0078125f, 35.664062f);
generalPath.curveTo(-13.741479f, 36.906944f, -12.468998f, 38.14356f, -11.1953125f, 39.378906f);
generalPath.curveTo(-7.644594f, 36.950638f, -7.644594f, 36.950638f, -5.381592f, 33.426758f);
generalPath.curveTo(-4.9201045f, 30.998955f, -4.9201045f, 30.998955f, -7.6523438f, 28.363281f);
generalPath.curveTo(-8.758131f, 27.272131f, -9.8773f, 26.194418f, -11.0078125f, 25.128906f);
generalPath.curveTo(-11.56791f, 24.57461f, -12.128008f, 24.020313f, -12.705078f, 23.449219f);
generalPath.curveTo(-17.05352f, 18.748102f, -17.05352f, 18.748102f, -21.820312f, 21.878906f);
generalPath.closePath();
generalPath.moveTo(-25.195312f, 29.378906f);
generalPath.curveTo(-26.85874f, 31.042336f, -26.555794f, 33.161476f, -26.757812f, 35.441406f);
generalPath.curveTo(-26.841602f, 36.360508f, -26.92539f, 37.27961f, -27.011719f, 38.226562f);
generalPath.curveTo(-27.072304f, 38.936836f, -27.13289f, 39.64711f, -27.195312f, 40.378906f);
generalPath.curveTo(-23.753044f, 41.302807f, -20.77665f, 41.690327f, -17.195312f, 41.378906f);
generalPath.curveTo(-16.535313f, 40.388905f, -15.875313f, 39.398907f, -15.1953125f, 38.378906f);
generalPath.curveTo(-16.671452f, 36.875927f, -18.151304f, 35.376595f, -19.632812f, 33.878906f);
generalPath.curveTo(-20.456524f, 33.043594f, -21.280233f, 32.208282f, -22.128906f, 31.347656f);
generalPath.curveTo(-23.840294f, 29.26394f, -23.840294f, 29.26394f, -25.195312f, 29.378906f);
generalPath.closePath();
generalPath.moveTo(-30.195312f, 43.378906f);
generalPath.curveTo(-31.185312f, 44.863907f, -31.185312f, 44.863907f, -32.195312f, 46.378906f);
generalPath.curveTo(-31.205313f, 46.048904f, -30.215313f, 45.718906f, -29.195312f, 45.378906f);
generalPath.curveTo(-29.525312f, 44.718906f, -29.855312f, 44.058907f, -30.195312f, 43.378906f);
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
        return 0.62109375;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 50.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.37890625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_highlight_50() {
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
       icons8_highlight_50 base = new icons8_highlight_50();
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
       icons8_highlight_50 base = new icons8_highlight_50();
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
        return icons8_highlight_50::new;
    }
}

