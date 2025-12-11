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
public class heading_h2_svgrepo_com implements RadianceIcon {
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
g.transform(new AffineTransform(33.33333206176758f, 0.0f, 0.0f, 33.33333206176758f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0f, 7.0f);
generalPath.lineTo(11.0f, 7.0f);
generalPath.lineTo(11.0f, 17.0f);
generalPath.lineTo(9.0f, 17.0f);
generalPath.lineTo(9.0f, 13.0f);
generalPath.lineTo(5.0f, 13.0f);
generalPath.lineTo(5.0f, 17.0f);
generalPath.lineTo(3.0f, 17.0f);
generalPath.lineTo(3.0f, 7.0f);
generalPath.lineTo(5.0f, 7.0f);
generalPath.lineTo(5.0f, 11.0f);
generalPath.lineTo(9.0f, 11.0f);
generalPath.lineTo(9.0f, 7.0f);
generalPath.closePath();
generalPath.moveTo(17.0f, 15.0f);
generalPath.curveTo(17.51f, 14.59f, 17.6f, 14.38f, 18.06f, 13.95f);
generalPath.curveTo(18.497f, 13.55f, 18.907999f, 13.122f, 19.289999f, 12.67f);
generalPath.curveTo(19.623999f, 12.28f, 19.91f, 11.85f, 20.14f, 11.39f);
generalPath.curveTo(20.34f, 11.0f, 20.445f, 10.568001f, 20.449999f, 10.13f);
generalPath.curveTo(20.454998f, 9.690001f, 20.362999f, 9.252f, 20.179998f, 8.85f);
generalPath.curveTo(20.002998f, 8.465f, 19.742998f, 8.124001f, 19.419998f, 7.8500004f);
generalPath.curveTo(19.073997f, 7.5670004f, 18.676998f, 7.353f, 18.249998f, 7.2200003f);
generalPath.curveTo(17.764997f, 7.0670004f, 17.259998f, 6.993f, 16.749998f, 7.0000005f);
generalPath.curveTo(16.389997f, 7.0000005f, 16.032997f, 7.0330005f, 15.679998f, 7.1000004f);
generalPath.curveTo(15.336998f, 7.1600003f, 15.001999f, 7.2580004f, 14.679998f, 7.3900003f);
generalPath.curveTo(14.3759985f, 7.5200005f, 14.086998f, 7.6850004f, 13.819999f, 7.88f);
generalPath.curveTo(13.532999f, 8.09f, 13.259998f, 8.317f, 12.999999f, 8.56f);
generalPath.lineTo(14.239999f, 9.780001f);
generalPath.curveTo(14.547998f, 9.512001f, 14.882998f, 9.278001f, 15.239999f, 9.080001f);
generalPath.curveTo(15.589999f, 8.880001f, 15.986999f, 8.776001f, 16.39f, 8.780001f);
generalPath.curveTo(16.845f, 8.750001f, 17.296f, 8.886001f, 17.66f, 9.160001f);
generalPath.curveTo(17.97f, 9.438001f, 18.137f, 9.844001f, 18.11f, 10.260001f);
generalPath.curveTo(18.096f, 10.656001f, 17.970001f, 11.040001f, 17.75f, 11.370001f);
generalPath.curveTo(17.465f, 11.823001f, 17.13f, 12.242001f, 16.75f, 12.620001f);
generalPath.curveTo(16.31f, 13.050001f, 15.77f, 13.540001f, 15.16f, 14.050001f);
generalPath.curveTo(14.55f, 14.560001f, 13.75f, 15.110001f, 13.0f, 15.700001f);
generalPath.lineTo(13.0f, 17.0f);
generalPath.lineTo(21.0f, 17.0f);
generalPath.lineTo(21.0f, 15.0f);
generalPath.lineTo(17.0f, 15.0f);
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
        return 100.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 233.09999084472656;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 600.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 333.566650390625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private heading_h2_svgrepo_com() {
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
       heading_h2_svgrepo_com base = new heading_h2_svgrepo_com();
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
       heading_h2_svgrepo_com base = new heading_h2_svgrepo_com();
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
        return heading_h2_svgrepo_com::new;
    }
}

