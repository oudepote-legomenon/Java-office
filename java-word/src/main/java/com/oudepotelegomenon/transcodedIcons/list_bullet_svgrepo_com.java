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
public class list_bullet_svgrepo_com implements RadianceIcon {
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
generalPath.moveTo(7.3398f, 16.7617f);
generalPath.curveTo(8.9804f, 16.7617f, 10.2929f, 15.4492f, 10.2929f, 13.832f);
generalPath.curveTo(10.2929f, 12.1914f, 8.9804f, 10.8789f, 7.3398f, 10.8789f);
generalPath.curveTo(5.7226f, 10.8789f, 4.3867f, 12.1914f, 4.3867f, 13.832f);
generalPath.curveTo(4.3867f, 15.4492f, 5.7226f, 16.7617f, 7.3398f, 16.7617f);
generalPath.closePath();
generalPath.moveTo(17.6992f, 15.707f);
generalPath.lineTo(49.7149f, 15.707f);
generalPath.curveTo(50.793f, 15.707f, 51.6133f, 14.8867f, 51.6133f, 13.832f);
generalPath.curveTo(51.6133f, 12.7539f, 50.793f, 11.9336f, 49.7149f, 11.9336f);
generalPath.lineTo(17.6992f, 11.9336f);
generalPath.curveTo(16.6445f, 11.9336f, 15.8242f, 12.7539f, 15.8242f, 13.832f);
generalPath.curveTo(15.8242f, 14.8867f, 16.6445f, 15.707f, 17.6992f, 15.707f);
generalPath.closePath();
generalPath.moveTo(7.3398f, 30.9414f);
generalPath.curveTo(8.9804f, 30.9414f, 10.2929f, 29.6289f, 10.2929f, 27.9883f);
generalPath.curveTo(10.2929f, 26.3477f, 8.9804f, 25.0352f, 7.3398f, 25.0352f);
generalPath.curveTo(5.7226f, 25.0352f, 4.3867f, 26.3477f, 4.3867f, 27.9883f);
generalPath.curveTo(4.3867f, 29.6289f, 5.7226f, 30.9414f, 7.3398f, 30.9414f);
generalPath.closePath();
generalPath.moveTo(17.6992f, 29.8867f);
generalPath.lineTo(49.7149f, 29.8867f);
generalPath.curveTo(50.793f, 29.8867f, 51.6133f, 29.043f, 51.6133f, 27.9883f);
generalPath.curveTo(51.6133f, 26.9336f, 50.793f, 26.1133f, 49.7149f, 26.1133f);
generalPath.lineTo(17.6992f, 26.1133f);
generalPath.curveTo(16.6445f, 26.1133f, 15.8242f, 26.9336f, 15.8242f, 27.9883f);
generalPath.curveTo(15.8242f, 29.043f, 16.6445f, 29.8867f, 17.6992f, 29.8867f);
generalPath.closePath();
generalPath.moveTo(7.3398f, 45.1211f);
generalPath.curveTo(8.9804f, 45.1211f, 10.2929f, 43.7852f, 10.2929f, 42.168f);
generalPath.curveTo(10.2929f, 40.5273f, 8.9804f, 39.2148f, 7.3398f, 39.2148f);
generalPath.curveTo(5.7226f, 39.2148f, 4.3867f, 40.5273f, 4.3867f, 42.168f);
generalPath.curveTo(4.3867f, 43.7852f, 5.7226f, 45.1211f, 7.3398f, 45.1211f);
generalPath.closePath();
generalPath.moveTo(17.6992f, 44.043f);
generalPath.lineTo(49.7149f, 44.043f);
generalPath.curveTo(50.793f, 44.043f, 51.6133f, 43.2227f, 51.6133f, 42.168f);
generalPath.curveTo(51.6133f, 41.0898f, 50.793f, 40.2695f, 49.7149f, 40.2695f);
generalPath.lineTo(17.6992f, 40.2695f);
generalPath.curveTo(16.6445f, 40.2695f, 15.8242f, 41.0898f, 15.8242f, 42.168f);
generalPath.curveTo(15.8242f, 43.2227f, 16.6445f, 44.043f, 17.6992f, 44.043f);
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
        return 155.41285705566406;
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
		return 489.17431640625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private list_bullet_svgrepo_com() {
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
       list_bullet_svgrepo_com base = new list_bullet_svgrepo_com();
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
       list_bullet_svgrepo_com base = new list_bullet_svgrepo_com();
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
        return list_bullet_svgrepo_com::new;
    }
}

