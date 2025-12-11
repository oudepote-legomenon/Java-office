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
public class icons8_move_selection_to_top_row_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image942d5848664093a0c5aa672f3bfdf92d;
private static BufferedImage getImage942d5848664093a0c5aa672f3bfdf92d() {
    BufferedImage result = (image942d5848664093a0c5aa672f3bfdf92d != null)
        ? image942d5848664093a0c5aa672f3bfdf92d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1060);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC4klEQVR4Xu2W3U/TUBiH+au85prEO+BSMDEYBQJG/MCgIGAUTEQJYCJo0HGhW+KUKLI53UC2wrZIYBuySTc6PoVAEI1oCL72nRnhfJRWNrCQ8ybPze/8TttnbZaTkyPGpFNV21x5qrLGc9govdzYRYhgmJtXCMVnLuhSUlED1Y13mVwL7OIeOudx/moTlF+qZ3IeefknoaCo7BsjgovK8rousbkV8IbjTK4FdnEPnfMIxmYglFhkch6327uhUIgsCxEm52FqEfdo9PCL+CcSUH69HWwOH7PGw5QiKFFR3wEl1S1w+koL2F0jTIfGdCI7JdIYkTGVCE/CqExWRAqKSuGNZ1gX51AQBkYnieytmg0Gw/DinQRltW2MAC3z0Nqf6r+XRonruNXMNTzG3JPHxbpmvsix3OOwF/Lyi8Efmdr1TdCk34y8sApnq2qZaxql4ETpOiHiDcl1Y/LcBhiYte8bqU9r5yTnl+Bcw33mgXcDZQbUX3/nhBLzkPyySmRagz3fRGI4qyLTs4sw8VkhcH4IEg/+SP2c6M6nqSRsbf3evs5/F+FNVJ4hRHpdEl1hRogIESGy+wgRIWJWkTvWgKeqYwiyRac7CbYgKdL2UgJ7eI3pZkKjxU8eUVCkoecjPFdvlA36pn7A0xGFEGm1+8A5/Yvp7pV7r2JwwxIgD40octM6DoOLkDV4b4TuZEKnWxEi/4QQMciBibiUn/DMr2zTF11jOplwYCL7jRAxG0dfpPqBBE22kC63VFCazrXALu6hcx6prpXNeVzrDqgiflKkxzne/bg/vOlQ/1306PXK0PV6jMm1wC7uoXMeFmcEbO4ok/PA3hNHSCZE9uP0mx7s4h4jk/HpV4gYGCGiM0IkPULEwAiRIykSmFQ2cVGP2OxS6uHoXAvs4h465xGMJSEc/yujB0ozIkPhRLEvEpdwQQ8pkhj3RuJf");
    imageData.append("6VwL7OIeOufhjcgLal+mcy3UfishctjnD9wTTYsOHAksAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image942d5848664093a0c5aa672f3bfdf92d = new WeakReference<>(result);
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
BufferedImage image942d5848664093a0c5aa672f3bfdf92d=getImage942d5848664093a0c5aa672f3bfdf92d();
if (image942d5848664093a0c5aa672f3bfdf92d != null) {
    g.drawImage(image942d5848664093a0c5aa672f3bfdf92d, 0, 0, null);
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
	private icons8_move_selection_to_top_row_50() {
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
       icons8_move_selection_to_top_row_50 base = new icons8_move_selection_to_top_row_50();
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
       icons8_move_selection_to_top_row_50 base = new icons8_move_selection_to_top_row_50();
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
        return icons8_move_selection_to_top_row_50::new;
    }
}

