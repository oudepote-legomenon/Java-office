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
public class icons8_fill_color_48_1 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image61ab698c236ce68d2a259517eb45e873;
private static BufferedImage getImage61ab698c236ce68d2a259517eb45e873() {
    BufferedImage result = (image61ab698c236ce68d2a259517eb45e873 != null)
        ? image61ab698c236ce68d2a259517eb45e873.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1424);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAD9ElEQVR4Xu2US08TURiGXbkzutK4U7FAgaL4JxRFUbBeinhhYaKJxlu8Ehl1ISbeMJqgG4wuRLEqgqKA4i2AFESjiUsTlUuZdtrpFE00OZ/nO50p7YGWdnqhjbzJk5DOCXmfvHNmxozpTCf1Mu/y0DtDnWzLv6XM5Z+lRWad+zY4r2YYDHXuz2knUfDCJeS3OGHOhe/AJG66v2bf9s7nz6VkCtqcQkG7C5ZR0k5iyXOnsLRNggKkHUkjCSy/pFWCpYgmwUTSQMLUQss/cwKVYDCJQBG6hilVJUwtIruw+c98aBL+NQJEUk4i94komJ46gIESqki4NUwtjtSQyG0ShbwnDkDGJBx+iWCR4DXw7JRKYPncZhGQvGafRFiRCdaYMgljo13IeSxCThMVQDSRUBLjXquxNfKSLYHljY0jkPMYERlMQhXJCycS4pInTSLroV3IfjQCRqTRh18kxBpYThOZeA3fa4VnZydSIstqF6gAZCNUgImoEoEiutd4nkAJg3VIyLTaIeuBDyahikS0xiSXPHCNuEsYGmj5+8OQaUXGJPxrRCgS0RqqSG5znCQyaHlDA/0nCEqEE+Feq3ESfpHwa2ivFZ6NSSLj7pCw+N4QMAIkmAgvoee14i/5BJ9c3RIL6wcPUgFAFiOqiN41jDF8cnVJLLozKC2qH4SMep8EEwm7RrCI7jWCRMbWwLNRSSy4M/CFSgBKhBKJeo1JRCZbI6eJXuzzqkSdbOM7B+XMSdeOropR8mnbL0glOiq8sODUd8/cy8Nv+M7jcrpKsrytUMjHraOQKtyolDv4nmFzulKyvNmhkP4tozDV1B6PsrwWJrHdQ/rLvDBV1B7VWV5LFZV4vc1DPli8kGxiLq+l6hiVKJfJh00KJIvaw+74lNfCJLbIpG+jAonm2qE4l9eCEq/KZNK7QYFEkbDyWqqOiJZXm92kd70H");
    imageData.append("4s21A1Jiy2tBiY5NbmIr9UC8uLovSeW1MIkNLmJbJ0OsXNnrjKj8x63eSwj/u+6gxEuzi/SslUEvEZcvlzP7Lcqf/jLlb1+5x8g/153KQ6LlxXqJvC92Q7TU7ImsPKZ3o9LQRz+vKvf45zGFSZRSidW0WITU7I6ivFkx2cz062eml53i+1sx8ediCkq0lzhJd5ELJqNmtyPi8hh6T67bSuh9CaCnRK7lz8UclGhb5yRdq1wQiou7oiuP6SmWf/B3p2et+yd/Li6p3E8lih2kq1ACnos7R6Iuj+kucg9009eOIzECGJRoXeMgnSsk0NBbHtNZKFV3raQLBtBZ6DrLn4trTuyxl1tLHb9bi0Rybqf9Ef88mnwxw8zO5VI1ZUClGn/jz01nOv9r/gH4lL/Rit04ewAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image61ab698c236ce68d2a259517eb45e873 = new WeakReference<>(result);
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
BufferedImage image61ab698c236ce68d2a259517eb45e873=getImage61ab698c236ce68d2a259517eb45e873();
if (image61ab698c236ce68d2a259517eb45e873 != null) {
    g.drawImage(image61ab698c236ce68d2a259517eb45e873, 0, 0, null);
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
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_fill_color_48_1() {
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
       icons8_fill_color_48_1 base = new icons8_fill_color_48_1();
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
       icons8_fill_color_48_1 base = new icons8_fill_color_48_1();
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
        return icons8_fill_color_48_1::new;
    }
}

