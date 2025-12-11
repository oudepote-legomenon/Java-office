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
public class icons8_concept_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image5272f69f75e06dbcc61514ad2cfdce11;
private static BufferedImage getImage5272f69f75e06dbcc61514ad2cfdce11() {
    BufferedImage result = (image5272f69f75e06dbcc61514ad2cfdce11 != null)
        ? image5272f69f75e06dbcc61514ad2cfdce11.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1212);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADVUlEQVR4Xu2aS08TURiG/WEuWXhZYHSHykbUGDdGAy0xERMTIKWEgIkhvUQKeGlBozSpSqE2FAsESbRCWVCwGiFQSCm3cimdz3mn0suUlpkwc6YmfZIvOTnnPTPfw5mZbjhzpsx/hM5oPatvsehUKaPFVW8w3RXfUxV0LebHj9ptic6XzrjSxctQvdFKeoOlQXxfxYHIsxcDu6QCELE6PlB9KwMZtUXmfy+Re3RKOJk6g/mJ+P6KwUIEqC7DSgSoKsNSBKgmw1oEqCKjhQhQXEYrEaCojJYiQDEZtUVGJgM0F14sWma7S/jRrDOY7on7k4zaInKK78Ur7k8yaorIAT2gF3F/kimL8BzsbdHygo/CgTcU/vFWGCf2t8UxSWgish9fpxlfG7mtF8nTVUnj/dVCYYy5oK+d9ndj4m1FYS6yFQ3TyKtr5HdcpchME3FrNqJoj1AYY87vqBIyyEqFqQhOAg1+c92m5FpXWkBcydUuPnNLyEo9GaYieJxwEsUksmX89ioKjnaIL3MszETwYuP5Xw025zVdqCLTTTTE75HyAWAmgi8SXubsd0KoDSfRuj1VGGetIet5XkkrP0fFl8uDmUg40M9/ma7nSmz/azAZTxXY9uVksAd7T4KxSHWuyM4EEZfgJbZThTHmsjJjfSUmsjQ3TN6eK7ki0V7+U7bACxykCmPMZWW83Zf5vR7x5fJgJrK7tUKD5nO0Md+eK7P5KRPCOGsNWeyJby5nMgVgJgImnfcp8PGOZBFksUcKTEViK0FyW84Ln9WTRCLTjXz2Ar9nNrNeBKYiIPTVRp9tl2hv0VRQBGvIICsV5iIclxQelylnTUGRqYEbQgZZqTAXATuxP6nHZr4tTyQWahPWkJGDJiLA31dDvyYe5olgzt93MzMnEc1EJp0PKPSlNk8Ec1iTi2Yi5sZOaqm1HVtYk4tmIr0d7+h1");
    imageData.append("p4f87lBOYQ5rctFMxGFy0/vucQrNbOYU5rAmF81Exoa+09MGO424ZtOngTHmxoYD4viJaCZymDjk//KDZNR1p9+NVl2PcBpYk4tmIoBLcvyj5E2LYMxxnDgmCU1FjohGNoQ6DSUhogRlkSPKIgqjiIha/8Ihp9DDqUT0BmuF3mBuLo2yVoj7K1PK/AWCTjuNbEtrhAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image5272f69f75e06dbcc61514ad2cfdce11 = new WeakReference<>(result);
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
BufferedImage image5272f69f75e06dbcc61514ad2cfdce11=getImage5272f69f75e06dbcc61514ad2cfdce11();
if (image5272f69f75e06dbcc61514ad2cfdce11 != null) {
    g.drawImage(image5272f69f75e06dbcc61514ad2cfdce11, 0, 0, null);
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
	private icons8_concept_50() {
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
       icons8_concept_50 base = new icons8_concept_50();
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
       icons8_concept_50 base = new icons8_concept_50();
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
        return icons8_concept_50::new;
    }
}

