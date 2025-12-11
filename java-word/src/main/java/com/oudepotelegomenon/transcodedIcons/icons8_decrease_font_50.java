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
public class icons8_decrease_font_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image480a746b517ddf488d761de4e4b32c10;
private static BufferedImage getImage480a746b517ddf488d761de4e4b32c10() {
    BufferedImage result = (image480a746b517ddf488d761de4e4b32c10 != null)
        ? image480a746b517ddf488d761de4e4b32c10.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1900);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAFWUlEQVR4Xu1ZS2wbVRRNYAssECDBgg0LPgsQIH5CQl2whV03fIRo4hkTUpImce0ZJ3G+ztfzZty4+ThN6vwT8qX5l6oJhQJtgZZ2wYoihCoqkBCr/DPcO+5YfneS1E6GOKp8pLOIfO97982cd959k4yMNNJII417Gg6JiZ8Ua1/vRFHWJjIy9Eyae6DgLNZ+9Qa69drw2NZsG9UFiW0KHvYazT0wyJLU56FIvXfmkj6+eGNbumpOLTs8Sj3NPzCA4ioLq9uWaeGULDKlO73arQMrL6c3eFPpnLQUTjkwdwXkpeiCrLxEx0g5RHfgBZRV3+zlWMEj56/pzYPnDA6fu8otpsgfXobF+Ok4KQcUVVVYHeZkFR5ZMDa2w6NuNPXNcwtRTk/qYAy/0XFSDlFWf8fi4outbh7eFL3qgiiz/lK1dz3+t75ZlBfT0SDoWCmD0934IpUVMq+8edkhKceyPcr7cH6sji1c534vgDcoeJRyOl7KgFovrG7nZNU/c9l44oLU+IxQ0PgISqxz4htuIY0dZ3SnrN2k46UMoHWQ1RRXpNY1fcdi78TI2tX69nEupnf6e2OxoqQ9Fz9eSpDt0V5GK+0nspIbIquixJrNOGhdygr9bUvxMchjVa1LIK+S+DFTAtgDtUV+XlZou06ZrcM58Y4Zhy0JLnhw/gduIQ2nJnTRq/0SP2ZK4PSqf7DIJFcc2q4oqWs5vqYHzDifz3cfFPxPqP8sF9sz9Z0hL2cxezp+3H0FnA+vGLKa42WFtgv7ZpHGw+IGqA0j8ytblhweJtH4fQM2ftgA0sI+K28G3bMCGi9I6gdRG+bj0QTgzd6g8fuGqKx4t4oddMfZszTetOHTxIa7Jr+NWrVXe4rmxAMNY7ekY8UgyoFXo251hStK7ZrBzfsnjTcBlnytHjY4fYt4eAoyc9H4eOBiC6rbVo7XdSwlSozH");
    imageData.append("PDpWDPBjg6uGdyuk3BhZFWS1hcabwJMcejKLDdeFx7H3+onGxwML6hi7YHkIOxHjd1iIngmT3lIj01ySabuwcd+lGSay5cDrhg2f/ZHLjZy5iK39puBWn6Q5JmxfiFkMldVWtkuxnQ0jc8tOQu/F8mmOCdulBYdgwFVrdavtbJdiOxuuaR3FtuYSjTdBN3AypGNlGLKCzcy6eFkh8yrQdpVOsOW3d6SksJzioMWG0c3Q1Y64TjxBZ7Ud8OrfwMkGSKth2m4ypDaMC8v1hZbhoM2l89oOh6Qy0J5FVnbRj/L0ahfpvDYjKis8K2gBdrFj3HCZTWg4H6ez2wZRUt40ZDXHy8pWwi3y05ITK7BBRTq/bYBeSQNZrVgmt5lVJz837vp0fpugZ4qydlvr/v9kZbJ99CsdDtWNjyXtUVrFnhGVlbJJL0bIvIqWNepIiTKnJLhObRj/RnnBeZNF69gzHDILuus6LW5lfmTALyWW8+IuxBsk7jlqw8iq0NAG3PO/pHXsCdhWwKB/BXtmLRMa3a6s3qY5iQLG/bmh3doNt48s4gNaz/IFHqY5u4bgZm8ZsiKNHhK7XXCYVpqTKKDYCvqFEonfwHJAXtApfERzdg2QVZO73upWiXS7d4PZKWz1kCqaBkFe6gzN2RUMWXnVv4PdVlmF4fVjt3vEVfcgzUsUhw8P3Q/S/Herbrht2Ph2vHbUpz1E85KG6GaHUFZD89Yn5m8Zgf2hXaA5yQJuhoOlmrUbHjt/Xcc7viAF3qM5SQOeSCi3NLSB//egPFoWWgH3KaI5yQLG+BC7YTo+Mr+yFXqv4Bc0J2nAQnroPzNN4t3Dju9RzsKGx/Akp+PH/nkqqZMoQZqXRhpppHHv4j+9LJOG+Z/kkQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image480a746b517ddf488d761de4e4b32c10 = new WeakReference<>(result);
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
BufferedImage image480a746b517ddf488d761de4e4b32c10=getImage480a746b517ddf488d761de4e4b32c10();
if (image480a746b517ddf488d761de4e4b32c10 != null) {
    g.drawImage(image480a746b517ddf488d761de4e4b32c10, 0, 0, null);
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
	private icons8_decrease_font_50() {
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
       icons8_decrease_font_50 base = new icons8_decrease_font_50();
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
       icons8_decrease_font_50 base = new icons8_decrease_font_50();
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
        return icons8_decrease_font_50::new;
    }
}

