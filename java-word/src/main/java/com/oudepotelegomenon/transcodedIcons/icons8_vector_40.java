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
public class icons8_vector_40 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image0736bcf11683e61f06993230a01bc0b6;
private static BufferedImage getImage0736bcf11683e61f06993230a01bc0b6() {
    BufferedImage result = (image0736bcf11683e61f06993230a01bc0b6 != null)
        ? image0736bcf11683e61f06993230a01bc0b6.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(864);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAYAAACM/rhtAAACUUlEQVR4Xu2Vz2sTURDHtyc9FC9qsWr1P/Aq9BZY3Jw8VjyJbbIxCfFgVfYlSEQ8aLLd7RKxpf9BRUFF8Q+QJpv+E6G9VQU9KFVQ1pk1ge3s5uVF94UK7wPDsjOzM9+375emKRQKxeHmcvVtwDOa/1dsZTLntw2j29H1H/D03+v6OZozDBTRfPcl0cYRyNWAgV6p9OubbQfw/Nk1jE7kWy5pCeRq8HX9+9dmM9h33QCfW4YRmMwVslECaf4wa18ywt4DDagpqt5H1RjoFYvcP7h4p3XatJx1sM955r4cJTBvua/7uWtm1Zml9QZwNeD8owNVb2ez7aQ1eK1eP2oy5yGM9mOeOY/KVus4+kcJxBzzln3CtNzH+C3YA6x1sLqYhqHgyEGcD002c3e9s9GYiMABxZo9B3WeQ50O72+OxRJbvQBFd8AsGkPosUKN5mtaMAXTXgPbxdo0OhY4SiwEI75CY/9KwXKv4sBLtxunaEyIcM3BVIBARmNpAZvnHqzndqXiHaGxkfzZEM4znBIaSw+cbucF7PD7NMIlnFrmfMJFTWNpU6iunIE/+WGsTYPnHB4l1C8L+IsN6PmU+hOp1L1jeLAOzrlJcJ15J7Fnqf5kmsZi9HfXK+qXDWzINznmLFB/DBjJBggsU79sQOBNXFrUHwOOlS4kX6R+2eRr3jwea9QfI7wv4e6kftncWG7OwHGzR/0h9HriX1XpQvsl9sYXetEnXfYyEOotlCQJod5CSZIQ6i2UJAmh3kJJkhDqjS/DLFJLCrTfJHsrFArF/8BvlOUNx94y6aYAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image0736bcf11683e61f06993230a01bc0b6 = new WeakReference<>(result);
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
BufferedImage image0736bcf11683e61f06993230a01bc0b6=getImage0736bcf11683e61f06993230a01bc0b6();
if (image0736bcf11683e61f06993230a01bc0b6 != null) {
    g.drawImage(image0736bcf11683e61f06993230a01bc0b6, 0, 0, null);
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
		return 40.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 40.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_vector_40() {
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
       icons8_vector_40 base = new icons8_vector_40();
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
       icons8_vector_40 base = new icons8_vector_40();
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
        return icons8_vector_40::new;
    }
}

