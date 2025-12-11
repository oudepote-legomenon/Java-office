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
public class superscript_svgrepo_com implements RadianceIcon {
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
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.3181f, 6.04842f);
generalPath.curveTo(17.6174f, 5.75945f, 18.1021f, 5.79767f, 18.3524f, 6.12997f);
generalPath.curveTo(18.5536f, 6.39707f, 18.5353f, 6.76978f, 18.3088f, 7.01579f);
generalPath.lineTo(15.2643f, 10.3227f);
generalPath.curveTo(14.9955f, 10.6147f, 14.9248f, 11.0382f, 15.0842f, 11.4017f);
generalPath.curveTo(15.2437f, 11.7652f, 15.6031f, 12.0f, 16.0f, 12.0f);
generalPath.lineTo(20.0f, 12.0f);
generalPath.curveTo(20.5523f, 12.0f, 21.0f, 11.5523f, 21.0f, 11.0f);
generalPath.curveTo(21.0f, 10.4477f, 20.5523f, 10.0f, 20.0f, 10.0f);
generalPath.lineTo(18.2799f, 10.0f);
generalPath.lineTo(19.7802f, 8.37041f);
generalPath.curveTo(20.6607f, 7.41399f, 20.7321f, 5.96504f, 19.95f, 4.92665f);
generalPath.curveTo(18.9769f, 3.63478f, 17.0925f, 3.48621f, 15.929f, 4.60962f);
generalPath.lineTo(15.3054f, 5.21165f);
generalPath.curveTo(14.9081f, 5.59526f, 14.897f, 6.22833f, 15.2806f, 6.62564f);
generalPath.curveTo(15.6642f, 7.02296f, 16.2973f, 7.03406f, 16.6946f, 6.65045f);
generalPath.lineTo(17.3181f, 6.04842f);
generalPath.closePath();
generalPath.moveTo(4.7433f, 8.33104f);
generalPath.curveTo(4.37384f, 7.92053f, 3.74155f, 7.88725f, 3.33104f, 8.25671f);
generalPath.curveTo(2.92053f, 8.62616f, 2.88726f, 9.25845f, 3.25671f, 9.66896f);
generalPath.lineTo(7.15465f, 14.0f);
generalPath.lineTo(3.25671f, 18.331f);
generalPath.curveTo(2.88726f, 18.7415f, 2.92053f, 19.3738f, 3.33104f, 19.7433f);
generalPath.curveTo(3.74155f, 20.1128f, 4.37384f, 20.0795f, 4.7433f, 19.669f);
generalPath.lineTo(8.50001f, 15.4948f);
generalPath.lineTo(12.2567f, 19.669f);
generalPath.curveTo(12.6262f, 20.0795f, 13.2585f, 20.1128f, 13.669f, 19.7433f);
generalPath.curveTo(14.0795f, 19.3738f, 14.1128f, 18.7415f, 13.7433f, 18.331f);
generalPath.lineTo(9.84537f, 14.0f);
generalPath.lineTo(13.7433f, 9.66896f);
generalPath.curveTo(14.1128f, 9.25845f, 14.0795f, 8.62616f, 13.669f, 8.25671f);
generalPath.curveTo(13.2585f, 7.88725f, 12.6262f, 7.92053f, 12.2567f, 8.33104f);
generalPath.lineTo(8.50001f, 12.5052f);
generalPath.lineTo(4.7433f, 8.33104f);
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
        return 96.24199676513672;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 116.20700073242188;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 603.7579345703125;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 554.2196655273438;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private superscript_svgrepo_com() {
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
       superscript_svgrepo_com base = new superscript_svgrepo_com();
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
       superscript_svgrepo_com base = new superscript_svgrepo_com();
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
        return superscript_svgrepo_com::new;
    }
}

