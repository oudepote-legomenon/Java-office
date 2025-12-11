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
public class icons8_apk_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageec903a1486c0e0c6b7b9407b5752aa9c;
private static BufferedImage getImageec903a1486c0e0c6b7b9407b5752aa9c() {
    BufferedImage result = (imageec903a1486c0e0c6b7b9407b5752aa9c != null)
        ? imageec903a1486c0e0c6b7b9407b5752aa9c.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1044);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC1klEQVR4Xu2ay07bQBSGebCubCMeAPEU3XSB6LKVuumO2wIEAoEQICEQsKlgAXQDIeXaSi13BAoKsEu4JL6fzjlmrGRM21idcWg1v3SkuWR8/s/2zPEiLS1a/5BylvUqZxhvVcSmaX76YhivxZxKlDPN9/m2Nu9bR0dFdrBrA7tRsGEY78S80oUgX9vbq9XubpAdCPKjqws2W1vVw6gGKe/vQ2FsjD+ZD2J+acoCBKUcJisQ5TBZgiiFyRpEGUwzQFDSYZoFgpIK00wQlDQY1SDFmRko7ez8Nr53dkZF07LeiP4almqQlPFZ9NewVIKkCfSAXkR/DUuDSA4NwqVBJIcG4foTiLOwAMHtLYUzN1c35x8dQXB1BcH1NQRnZ+CurkK1p4fm7JGRaF2xWN+/uaG2mEc5iLe7G39OePl83Vws246bPvskIePj49GA50XX2dqibnB6msiRCQje0fD+HiAMITg/fxbEHh0FZ34+6vg+VHt760H6+yGsVOga9sREIod6kL4+MoIAYakE4cPDL0HwlUKj1B8ergNxl5ao6R8eJnNkAeJMT0detrchuLiITA4NPQuCdzr6sUdQtSBBocDeqQBs9qUr5sgExF1bIy/u8jL4e3vUxldIBPHZex8+PkZttqdwLgbhQhD2pMQcmYD4BwfkwZmcBHdlhdre+noCBBWyDY+wuB8SIE+HgZfLJXJkAoL7QpR/cpIAcaamEmtjEPYknMVFauKhwY9nMZSB2IODkRHXBf/4mDY8mSmXEyC02cX1tacWMx/e3VEXocTfKgXBQogKLi+jMXakoikyziBTgbA+Hhgo8QhXDoLFj3ywQsbHsCqjnNnZ1CC4z0hYS7Ks7JgMk/O7T2NY+HBsYCA2h4H1RlyPmz6efxrjfb6+NpSBZB0ahEuDSA4NwqVBJIcG4dIgkkODcP1XIKr+wpEm0MNfgWyY");
    imageData.append("psXi4wsJS/Sn9ZL1Ex/dil5wMWPZAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageec903a1486c0e0c6b7b9407b5752aa9c = new WeakReference<>(result);
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
BufferedImage imageec903a1486c0e0c6b7b9407b5752aa9c=getImageec903a1486c0e0c6b7b9407b5752aa9c();
if (imageec903a1486c0e0c6b7b9407b5752aa9c != null) {
    g.drawImage(imageec903a1486c0e0c6b7b9407b5752aa9c, 0, 0, null);
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
	private icons8_apk_50() {
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
       icons8_apk_50 base = new icons8_apk_50();
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
       icons8_apk_50 base = new icons8_apk_50();
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
        return icons8_apk_50::new;
    }
}

