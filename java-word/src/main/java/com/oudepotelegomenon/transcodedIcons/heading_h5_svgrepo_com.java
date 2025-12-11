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
public class heading_h5_svgrepo_com implements RadianceIcon {
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
generalPath.moveTo(14.09f, 14.19f);
generalPath.curveTo(14.442f, 14.46f, 14.82f, 14.69f, 15.22f, 14.879999f);
generalPath.curveTo(15.64f, 15.075999f, 16.097f, 15.175999f, 16.56f, 15.169999f);
generalPath.curveTo(17.07f, 15.183999f, 17.57f, 15.044999f, 18.0f, 14.7699995f);
generalPath.curveTo(18.378f, 14.516999f, 18.594f, 14.084f, 18.57f, 13.629999f);
generalPath.curveTo(18.59f, 13.179999f, 18.373f, 12.752999f, 18.0f, 12.499999f);
generalPath.curveTo(17.594f, 12.225999f, 17.11f, 12.089999f, 16.62f, 12.109999f);
generalPath.lineTo(16.150002f, 12.109999f);
generalPath.curveTo(16.015001f, 12.123999f, 15.880001f, 12.149999f, 15.750002f, 12.189999f);
generalPath.lineTo(15.340002f, 12.339998f);
generalPath.lineTo(14.8600025f, 12.569998f);
generalPath.lineTo(13.840002f, 11.999998f);
generalPath.lineTo(14.120002f, 6.999998f);
generalPath.lineTo(20.520002f, 6.999998f);
generalPath.lineTo(20.520002f, 8.919998f);
generalPath.lineTo(16.210003f, 8.919998f);
generalPath.lineTo(16.0f, 10.76f);
generalPath.curveTo(16.222f, 10.683001f, 16.45f, 10.622001f, 16.68f, 10.58f);
generalPath.curveTo(16.915f, 10.543f, 17.152f, 10.526f, 17.39f, 10.53f);
generalPath.curveTo(17.852999f, 10.526f, 18.314f, 10.587f, 18.76f, 10.71f);
generalPath.curveTo(19.17f, 10.825f, 19.558f, 11.015f, 19.9f, 11.27f);
generalPath.curveTo(20.23f, 11.518001f, 20.497f, 11.84f, 20.68f, 12.21f);
generalPath.curveTo(20.892f, 12.632f, 21.002f, 13.098f, 21.0f, 13.57f);
generalPath.curveTo(21.007f, 14.066999f, 20.89f, 14.559999f, 20.66f, 15.0f);
generalPath.curveTo(20.435999f, 15.417f, 20.126f, 15.782f, 19.75f, 16.07f);
generalPath.curveTo(19.357f, 16.369999f, 18.913f, 16.597f, 18.44f, 16.74f);
generalPath.curveTo(17.943f, 16.904f, 17.424f, 16.992f, 16.900002f, 17.0f);
generalPath.curveTo(16.112001f, 17.023f, 15.327002f, 16.89f, 14.590002f, 16.61f);
generalPath.curveTo(14.006002f, 16.372f, 13.468002f, 16.033f, 13.000002f, 15.610001f);
generalPath.lineTo(14.090002f, 14.190001f);
generalPath.closePath();
generalPath.moveTo(11.0f, 17.0f);
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
generalPath.lineTo(11.0f, 7.0f);
generalPath.lineTo(11.0f, 17.0f);
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
        return 233.33326721191406;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 600.2333374023438;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 334.1000671386719;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private heading_h5_svgrepo_com() {
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
       heading_h5_svgrepo_com base = new heading_h5_svgrepo_com();
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
       heading_h5_svgrepo_com base = new heading_h5_svgrepo_com();
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
        return heading_h5_svgrepo_com::new;
    }
}

