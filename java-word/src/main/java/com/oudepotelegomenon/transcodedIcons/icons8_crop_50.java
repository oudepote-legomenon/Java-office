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
public class icons8_crop_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee90ed0ca1d54866426ff92d39c3689dc;
private static BufferedImage getImagee90ed0ca1d54866426ff92d39c3689dc() {
    BufferedImage result = (imagee90ed0ca1d54866426ff92d39c3689dc != null)
        ? imagee90ed0ca1d54866426ff92d39c3689dc.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1028);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACyklEQVR4Xu2aQWjTYBTHq0cFRT15myevXj0IOwoyt4MycAO7KSo6cNLNpJmSDlfXJpvbDrXrEnEqOHcQGWsr6kRtnfMklN28CILoRfC2zU5i/p2D7OXbkpWu/TLzhz8tL7zwfoQk3/deAgFfHlIoma8PJfKRjSwk5+poXjUUjo8dCxjGDhpnqlTo6Ifl6JPCAstdd98bgKV5Wy3x9oMDoqL/LMG4EUBQcO6HYbBcKxDo2qC2n8bWFW8gYfXeOVHVL9O4o3gCEQf0FlHRlgFDjzmKJ5AedeyQoGhnaHyNGqX0kcae6XrqjqE3430ThSUKYAU5r8x00rxK+mxk8sqJ/vQ+WjNTTVJ29qSUMajbYjPGrYmCDcAK0tz7wpZXaQOG1sxU043sx47ReUN9/muN5cefjejkvA3AChJ99s2WV0kDBFeG1syUD+KDuLcPYrUHQTJzp3tfFVtiuQWrLw7li30Oj9/2gdwSzduMW2Pvfl9KfLIBlAXSIKWDDeFMhPqC+vqtCVKkAFaQ1ujLcZq3GZ+6OfUVMBSgLJD1tJVLFFlO7cIvYHBlKIAnQFZWsdqXkPpwt2dBuuP6YUHVi6urWM+CQIBZ/e85EEHRg+b29CiNewpEiOvt2BSZ90UbPeYpEBPiOGBoHPIEiNB/v47GqLgHKT1iFX3RCYZrECGW2mveD9/dNAq4BoHkkUd7aIwlLkH+vbHDllM4ijsQMa41l9N34g5EupM6CBhyCkdxA9I9PH1VluWdNNetuAG5Pvz0T9fIVCeuTDnGfgabM+w0WUbfDE1Amge7Hmm4AamlUR+tmSknkFoadfkgPNkH4c3/L8hGU91KGH0zNAHR0WQZ8xkMm2ge6nIPghdPwj5br6TRBERHE+1ZljFswuSM5pWcZK+8a6KqLFGqIR+EN20rEIw0MJ9h2TsgUjqI+QyGTUxL2Vl8B0Dztq3+");
    imageData.append("ApLB+JyvhpxXAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee90ed0ca1d54866426ff92d39c3689dc = new WeakReference<>(result);
        return result;
    } catch (IOException ioe) {
    }
    return null;
}


	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
// _0_0_0
BufferedImage imagee90ed0ca1d54866426ff92d39c3689dc=getImagee90ed0ca1d54866426ff92d39c3689dc();
if (imagee90ed0ca1d54866426ff92d39c3689dc != null) {
    g.drawImage(imagee90ed0ca1d54866426ff92d39c3689dc, 0, 0, null);
}

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
        return 0.0;
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
		return 50.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_crop_50() {
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
        return false;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Color filters on raster content not supported");
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
       icons8_crop_50 base = new icons8_crop_50();
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
       icons8_crop_50 base = new icons8_crop_50();
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
        return icons8_crop_50::new;
    }
}

