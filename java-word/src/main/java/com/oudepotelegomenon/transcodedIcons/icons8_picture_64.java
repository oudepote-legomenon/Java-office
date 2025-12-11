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
public class icons8_picture_64 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagea731e1e7b81484e14a7e2399d58c2077;
private static BufferedImage getImagea731e1e7b81484e14a7e2399d58c2077() {
    BufferedImage result = (imagea731e1e7b81484e14a7e2399d58c2077 != null)
        ? imagea731e1e7b81484e14a7e2399d58c2077.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1960);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAFhklEQVR4Xu1a+08bRxDmp/6zhEoUR2oUCAEnAQoYExnzsHkUMCY2fqQBbDBphVtUqSpOgJggB2jaBNKG/pBWbSCk7XRnz2uf5872sZx5+Vb6JN/u7O58387O7Z2vpsYqVrGKVaxiFatUbWluDnzSXTvS0VU7st99bRSqAY66sV+7ro22I/ca/EENqgXIvYb92MOL6MprSOx+uPD48c0/sPsOclhl1+r2pZ8+wLO3/xbYCGz+/h9vj377SoiwhwLwCzrRRYQZ5IWt4H1pBDCTPOJSCWA2eRzPNAEG7s7CQNucpt4sVII8tkkJEHi0Cf7QRkGdXn//zDpMTT/R9D8pKkVeWoD7Nx5w28jyL7k62p9n2LpRcDb4ILGjHcMoKkleWgDfdIrb9rVGc3UY/uot0H/nK27j861q+hsFddZs8tICLGTeQ19zGPpa8gJQ9N2OgKs5xG1pmxFQZytB3rAAPv8qD2WfP5UntHOkQMeeY/tIwa4iGPZ12nwwFXiqtSWgzlaKvGEB0GnRjisviCHC3/wMQ50xcNZPgqN+gt8NgvOZXPviziGPBNHfH1zXjF/K2UqSNywAIrL8Ctxsz/Owzwrge/CUJzrRV41Rz3fcBgXA7eC2P4RoMp809UCdrTT5EwlAEU0qWd7x6SisBIfhz20P/P3SC0/mvNBbr4wVmN3S9CsG6uxZkEdIC+DpTXD7pH8Y4MBTgPWFYd5WKkmqQZ09K/KIsgLgnhZt6tucOAscpAvJI473PTwyMEIWtw9LjkOdPUvyiPICMGf1HD+xADrjUGfPmjyirADF4HUucXu9LbAWz24B1UGJgjp7HuQR0gKIoy5PggFMgl6WBD2QmhsumwSps+dFHmFYgNxtUHUO4OeDIrfBMc8Kt1l88R5cN4Osr3IbpM6eJ3mEIQGmgms5Q3oQwgeioa44PynygxDb3zPxF7l2zAGu");
    imageData.append("W/mD0GIsnZscnS8gz5A+0CefZuQfE79OSx5hSAA8vdGjMB5wRIIrB+wTCqbgPjsKJ2KbfOLzXnkBQwJQiIchV+NM0UfdgfY5vmXQljp7UcijH1ICiMdhPN6KOvpGSNz3Q4GUZlL1WGaQz/x2DJm3x5r6UhB+SAngtE1xW0yMoo72x4SH1xj2dFKB05Lf2juEqb7HSiJm8Lu/5nV0LAq1H1IC4Osw+lRH+/MEx/Z7pfb889eHMNQa4XM6Gsahp2GC//beiZYUgfohJYAe1G+EqLN00mLkMwcfYePN8YnIO29Ngy0ZBttyGHrZ71IiUD8QpgkgQJ2lk+qRR2cxfB11YyyUx8DbuwSx9B+641Hy1xn5z36IcFxPhlidX1cE6oeAqQJQZ+mkxch77FEllG1fsvyihLK7JQLf7/xlmLxaBEeTkqOECNQPNUwTQJY8Oonz9rRMQv/zBYZFcLUEswQewtb+kWHyahG6m3zcdtAeyUWTHkwRQJa8WHkk796MQ//LhIKtBAzeDedEWMu8A0+rYutkq4v7nZKmwLzQlRUBX8nNb+iLcGoBZMlrVl6QF2CRMGCf4TY8NxhYeQqMhM7GSd4Xt5ReJJxKgIqRz8K9GpMmrxbhi8Z8XqEiSAsgS75o2FPymwvQc1tZPQcLZSNhXwy4HTqyItDtICWALHnDK8/IO7LkO5smpFaeAiOh4+Y4H3OwY15egMtIXgBFaLNPgNsdlxPADPKlwh6FEWHf2Th+qrAvhQaGobTytsqwAGdCvqXy5NVwPcu/6CkpwFUkL1BWgKtMHlFSgKtOHlFUAE97/p8cgYI3Pve07ZcFeCcoKoBoQCPa8V5rvqNe+2WBmoeo0whQLVALwD+V/fxRUGN0VXFjVnnsRu5V/bF0d+1IG/9cPisCj4QqwR5y5p/LW8UqVrGKVaxilaot/wMpqDXfHynlSAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagea731e1e7b81484e14a7e2399d58c2077 = new WeakReference<>(result);
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
BufferedImage imagea731e1e7b81484e14a7e2399d58c2077=getImagea731e1e7b81484e14a7e2399d58c2077();
if (imagea731e1e7b81484e14a7e2399d58c2077 != null) {
    g.drawImage(imagea731e1e7b81484e14a7e2399d58c2077, 0, 0, null);
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
		return 64.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 64.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_picture_64() {
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
       icons8_picture_64 base = new icons8_picture_64();
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
       icons8_picture_64 base = new icons8_picture_64();
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
        return icons8_picture_64::new;
    }
}

