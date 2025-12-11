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
public class icons8_color_dropper_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image1bc32774158f7178c15ccd9908813d30;
private static BufferedImage getImage1bc32774158f7178c15ccd9908813d30() {
    BufferedImage result = (image1bc32774158f7178c15ccd9908813d30 != null)
        ? image1bc32774158f7178c15ccd9908813d30.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1320);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADpklEQVR4Xu2YS08TURSAUWOiC02MiUaNe925Nv4DDNoXC5rwEJS4wBhpC7pBhY1EJQTmUaUReRRpg4omolGh05kpmPBSNEIFXLAAEyMiIbGvud4zYbDeSm0r0w5Jv+QsOjM993xz7505bU5OFvXx3TLt9FLGEi9l6OQZo5en9S4vrT8/1GjeTV6rWfhm0wlc/BeRNQUmOosiU+5S9N5ZLPnu5P/EQt+9tOEk+R3NwVG6XJ42hD4+KIn88FjRite2FsucFfldpRIWiWhaRpHwu8ukaAEyQIZnDItCS94uMkfGSVRCmRmRzQ9wjLGczJNRkpFQAvYM3vzdZK6MkYoEhN9VhgTG4CHzqY6PMR0asOuPRB9LVQJioqMwwjH69uh8qoPXshk/ZUI4EEfrbsjH/kNi2WNB+PEc5CljITmWaqxKRGYflaP5ZxW4AEMYf36YqgTEh67iCM4zP3CvaAc5niooEp8fl68VsSDLGNFoa0FMgYkEyMNN4CjDcXI8VeCoU4dhOcFMkMWAjMAa0ZSrNOZcvPgtocslx1MND3X6KL5rEiwnsqBUZD65z8IbPeShdXnkWKoDGxvfwTAUTRaWjExGJRReUeZGL2OSiyYLlGX6KvBb2oRlzsSc04zEhbuD+62MON3huBlORUYTEpW0uM9mF/3XO8aCr+dCqP/5fZSMjCYlvAtIjkRlRlrNSLMSycgI+D2Dfxn2krnTxr8k1mT6HFgmf30ZpQOgDPXkGKqTqESiMvD+gd6MbDRVJVmJRGSgI4B9Al0zOZ4qwCMWS0zXOccC/XPhmGLjBVzvdNRH8J6RomWgN4MeDXo1cjxVSHUmFIk653jQxoqzL+kCFjeSIVhOqzOx+SQu2rkDkA/aGdgTsJw2rYQCbGyhKe9g9DHVUEsirWQlshIbSFYiK7GBZCWwRG1XVmJjqG56sxf+KKhNsYsFCSsr");
    imageData.append("zkA3TOZOK1bW577WPpKSBLTw0MpnXKKmBm210ELIPf4tptB4oSkJ4Jx9eLuFFkM97xZjil0vNCehUMX6RPrFjEQW/LfQ1J4gqaT5qistQwFuPrZwUkKTMwFYmoVjFkZYauidDMUT0fRM/CkhyQWDDCmkaQkAL6kiC81L7YMLqxISangyGb7sGArAnul5u4i6R7+iq23D2lxO0VyihTILJcgyt59Ohq2ssITlqm2Mz2elhSCOFRsjtFXT/B7yu5pDlsEzI0vg5aYcN7lc23IQ2hJ9reaRl1mURJY08wtrtTkWCfZdAgAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image1bc32774158f7178c15ccd9908813d30 = new WeakReference<>(result);
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
BufferedImage image1bc32774158f7178c15ccd9908813d30=getImage1bc32774158f7178c15ccd9908813d30();
if (image1bc32774158f7178c15ccd9908813d30 != null) {
    g.drawImage(image1bc32774158f7178c15ccd9908813d30, 0, 0, null);
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
	private icons8_color_dropper_50() {
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
       icons8_color_dropper_50 base = new icons8_color_dropper_50();
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
       icons8_color_dropper_50 base = new icons8_color_dropper_50();
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
        return icons8_color_dropper_50::new;
    }
}

