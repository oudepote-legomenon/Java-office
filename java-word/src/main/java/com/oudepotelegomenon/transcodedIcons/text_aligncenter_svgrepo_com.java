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
public class text_aligncenter_svgrepo_com implements RadianceIcon {
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
generalPath.moveTo(6.1679f, 11.3594f);
generalPath.lineTo(49.8085f, 11.3594f);
generalPath.curveTo(50.8165f, 11.3594f, 51.6133f, 10.5859f, 51.6133f, 9.5781f);
generalPath.curveTo(51.6133f, 8.5937f, 50.8165f, 7.8203f, 49.8085f, 7.8203f);
generalPath.lineTo(6.1679f, 7.8203f);
generalPath.curveTo(5.1601f, 7.8203f, 4.3867f, 8.5937f, 4.3867f, 9.5781f);
generalPath.curveTo(4.3867f, 10.5859f, 5.1601f, 11.3594f, 6.1679f, 11.3594f);
generalPath.closePath();
generalPath.moveTo(14.8164f, 23.6406f);
generalPath.lineTo(41.1601f, 23.6406f);
generalPath.curveTo(42.1679f, 23.6406f, 42.9648f, 22.8672f, 42.9648f, 21.8594f);
generalPath.curveTo(42.9648f, 20.875f, 42.1679f, 20.1015f, 41.1601f, 20.1015f);
generalPath.lineTo(14.8164f, 20.1015f);
generalPath.curveTo(13.832f, 20.1015f, 13.0351f, 20.875f, 13.0351f, 21.8594f);
generalPath.curveTo(13.0351f, 22.8672f, 13.832f, 23.6406f, 14.8164f, 23.6406f);
generalPath.closePath();
generalPath.moveTo(6.1679f, 35.9219f);
generalPath.lineTo(49.8085f, 35.9219f);
generalPath.curveTo(50.8165f, 35.9219f, 51.6133f, 35.125f, 51.6133f, 34.1406f);
generalPath.curveTo(51.6133f, 33.1563f, 50.8165f, 32.3828f, 49.8085f, 32.3828f);
generalPath.lineTo(6.1679f, 32.3828f);
generalPath.curveTo(5.1601f, 32.3828f, 4.3867f, 33.1563f, 4.3867f, 34.1406f);
generalPath.curveTo(4.3867f, 35.125f, 5.1601f, 35.9219f, 6.1679f, 35.9219f);
generalPath.closePath();
generalPath.moveTo(14.8164f, 48.1797f);
generalPath.lineTo(41.1601f, 48.1797f);
generalPath.curveTo(42.1679f, 48.1797f, 42.9648f, 47.4063f, 42.9648f, 46.4219f);
generalPath.curveTo(42.9648f, 45.4375f, 42.1679f, 44.6406f, 41.1601f, 44.6406f);
generalPath.lineTo(14.8164f, 44.6406f);
generalPath.curveTo(13.832f, 44.6406f, 13.0351f, 45.4375f, 13.0351f, 46.4219f);
generalPath.curveTo(13.0351f, 47.4063f, 13.832f, 48.1797f, 14.8164f, 48.1797f);
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
        return 62.667144775390625;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 111.71857452392578;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 674.6657104492188;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 576.5628051757812;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private text_aligncenter_svgrepo_com() {
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
       text_aligncenter_svgrepo_com base = new text_aligncenter_svgrepo_com();
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
       text_aligncenter_svgrepo_com base = new text_aligncenter_svgrepo_com();
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
        return text_aligncenter_svgrepo_com::new;
    }
}

