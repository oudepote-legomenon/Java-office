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
public class textformat_superscript_svgrepo_com implements RadianceIcon {
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
generalPath.moveTo(43.6445f, 28.1406f);
generalPath.curveTo(44.6992f, 28.1406f, 45.3555f, 27.4609f, 45.3555f, 26.4766f);
generalPath.lineTo(45.3555f, 10.4453f);
generalPath.curveTo(45.3555f, 9.2735f, 44.6524f, 8.5703f, 43.5039f, 8.5703f);
generalPath.curveTo(42.4727f, 8.5703f, 41.957f, 8.9453f, 41.2773f, 9.4375f);
generalPath.lineTo(37.5273f, 11.9922f);
generalPath.curveTo(36.8711f, 12.4375f, 36.5898f, 12.8594f, 36.5898f, 13.375f);
generalPath.curveTo(36.5898f, 14.1484f, 37.1758f, 14.7344f, 37.9024f, 14.7344f);
generalPath.curveTo(38.3711f, 14.7344f, 38.6758f, 14.5937f, 39.1445f, 14.2657f);
generalPath.lineTo(41.8633f, 12.4375f);
generalPath.lineTo(41.9336f, 12.4375f);
generalPath.lineTo(41.9336f, 26.4766f);
generalPath.curveTo(41.9336f, 27.4609f, 42.6367f, 28.1406f, 43.6445f, 28.1406f);
generalPath.closePath();
generalPath.moveTo(12.7305f, 47.4297f);
generalPath.curveTo(13.9024f, 47.4297f, 14.4649f, 46.9609f, 14.9336f, 45.6719f);
generalPath.lineTo(17.9336f, 37.375f);
generalPath.lineTo(31.7617f, 37.375f);
generalPath.lineTo(34.7851f, 45.6719f);
generalPath.curveTo(35.2305f, 46.9609f, 35.8164f, 47.4297f, 36.9883f, 47.4297f);
generalPath.curveTo(38.2539f, 47.4297f, 39.0976f, 46.6797f, 39.0976f, 45.5078f);
generalPath.curveTo(39.0976f, 45.1094f, 39.0273f, 44.7578f, 38.8398f, 44.2422f);
generalPath.lineTo(27.8476f, 14.9922f);
generalPath.curveTo(27.3086f, 13.5391f, 26.3476f, 12.8359f, 24.8476f, 12.8359f);
generalPath.curveTo(23.3945f, 12.8359f, 22.4336f, 13.5391f, 21.918f, 14.9688f);
generalPath.lineTo(10.9024f, 44.2656f);
generalPath.curveTo(10.7149f, 44.7813f, 10.6445f, 45.1328f, 10.6445f, 45.5313f);
generalPath.curveTo(10.6445f, 46.7031f, 11.4414f, 47.4297f, 12.7305f, 47.4297f);
generalPath.closePath();
generalPath.moveTo(19.082f, 33.7891f);
generalPath.lineTo(24.7773f, 18.0157f);
generalPath.lineTo(24.918f, 18.0157f);
generalPath.lineTo(30.5898f, 33.7891f);
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
        return 152.0642852783203;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 122.43285369873047;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 495.87139892578125;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 555.13427734375;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private textformat_superscript_svgrepo_com() {
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
       textformat_superscript_svgrepo_com base = new textformat_superscript_svgrepo_com();
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
       textformat_superscript_svgrepo_com base = new textformat_superscript_svgrepo_com();
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
        return textformat_superscript_svgrepo_com::new;
    }
}

