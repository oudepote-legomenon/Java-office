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
public class icons8_project_setup_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image1ff5477133adab84c1ef2189c4168458;
private static BufferedImage getImage1ff5477133adab84c1ef2189c4168458() {
    BufferedImage result = (image1ff5477133adab84c1ef2189c4168458 != null)
        ? image1ff5477133adab84c1ef2189c4168458.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2116);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAF/ElEQVR4Xu1ZbUxTVxjGbckWl3382tdvt2V/luzPsmT7sWUOCoJEnWwzW4zJsiXLzJZJWz7M6raoQFtolQl4C/TeWyqgQ0VGoR+UYhkUEGgBlQ9lWiYYARWF0dLed+dcVqSnKFXagkmf5Emanvee+zz3vOd9z21jYqIIH6RCWpiXVmbFlKexFtlP9DtkzCOjjordYFDFbapXCWJ1RXGvkuOhhDxN014qr4XTdAvkZWrdOanqb8mYh4b+qOA9AxXfo6cEYCgWeA2UgMOfjerEDj2V8BYZHwrIxeyUpeY8DPVNAaPQuXOEtJKMeSjoVYKP9ap4d/vJHd4rHXtgrDeT57DtR2g98TkYVPEzRkrwNnndo0AikTyRk0ony9MYM0ot6Gwe4Y1UMy0gEzMzMiF9OFvIvkletyzqmU+eRSZudtbs5HwGSNqqvvCgmD6AmHXk9csBic6UitS7soWq56R7mJdkYrZRJqY95YVmj808DEO9U7yRi12TYD7TB1TW6VlpKu2ViRgRxMA6ZHgDmuO3bKH6I3JuP+ipuK9NpYlzo470AAM+OjtFgOI4nH7k9Q9Clkj9LnrqXG66xi0VMbNI3OTRA6dcdtsYL/5+xOkmR9fIxYwzR6jm8jLKPLlidkAiMT9F3mMBJvWmmvZTOwLEk2ykN9/VU7EqQ1HstmBoLBB8qshQXdLmGzwDjpvQVHuB39T4s0+wvXUU9H90Q21FBz9+sXtyYQyn3El1M3Q0OaHv3A3ITS9DD0P9Pal/AQ3qpG67bleAcJItJ1KmDMUJc6aSRFcwrCnY4ZaL1FBR2ACDPbf8njg2c/yoxYNXC1UuJ1qxTrmIuYOevBsbIlfIYRuFw/sq3SjeRupfQAOd2GuvW96I9di2fwetqR6YZCFYjjgYyJewoJbXeC90TSwI0x4xzqHcv5GTWirw6VDuVj4tFaoPosrFWesH");
    imageData.append("F2JtpsuADcpEtCnvh9IXF2v3QziNYDrtLODq1Nt2fV4Y2uB4JZCJ90ktGGis8PDPla7B3tt8PE47mVjjrNxe+SQZ64dwGxlqY0CRoVl4wlWlzUgY20Dq8EGRrn0ZGz/XdJWPP6vrB1Qkpsm4AITbiL2BgcL9lffS6nejB3XwAlLHYkhF9Ky1boCPb7Nc4VdUIilaT8b5IdxGhmxswIqgDW4mdfiAUu6VNbkizm5myT2CmuIHpBYMvEfy962xPTLiYPmqRefWgH/VMs2hc9Z4tpBO8OmQSEqfQR08C1et5iWqllysMa5K1RofYCFXTENF0dJ95ATV9H8fYf/JTWO7ZCJ2Oi9D627SXfSLxcSNc/X6yAQLbJ4Gyo8YeeH36+yGKjvUlneABY332++N+To73ivBdfZwGUG81svijQrKvWUoPeaboyrrJOdoffBZq/HMebSa7BxapRHfWUu+3FkrnEYwW84w0NPIgvs6C9MjLFQeYQEdBrnygiVOv9Xo9HvQ//SbLSx5PajTb7iNkOQm5kuyRsFOLH4fwWmH30fQKfkQeuV9g9S5LCJtZDGVmazX8uf8IZF/Q0ylFaS+oLGaRsoUGmCUdXyvUGZqXSt6Z19NI206BiryUWXL13gLf1G4Sg8IvyL1BY3VNLKY/I8eVNyHpL6gETUSYkaN+BA1EmJGjfgQNRJihsXIqCMDRnsyHk8j1xzp0KXbxZnppFk8KSJnKdsy1d/4nfuxMdJVuxMsbPKMmd7sutq2F24N5cFkvwwumHbf1VPxc63HU4atx7aufSNmJsllLU9xu8dUATe4fUkJxuIEF16hNW3EWLLpMhZ55+/8gMl9vNb9K3+jNW1EXxw/ZtFseaBAboIBkzppbm0boQSTtqovAyYmeaUt0zt+Pocjvw8VV2wEpdZfaFMHTBxprtiIgRIo2k/tDFvKBMsVG8H/C+LNPjV8KGDySHLFRjDMdLLeeiyFc40Glt9IMSRGalnB82Ymeaip");
    imageData.append("bBt3vWc/cON0wI3CzZAYwaguSlxv0WwtMagEHlQAPGe122eayz+bjhRDZsQHQ9HGF+opQRLiN5GmXrXxNVJPFFFECP8BRPX9p6eNN0gAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image1ff5477133adab84c1ef2189c4168458 = new WeakReference<>(result);
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
BufferedImage image1ff5477133adab84c1ef2189c4168458=getImage1ff5477133adab84c1ef2189c4168458();
if (image1ff5477133adab84c1ef2189c4168458 != null) {
    g.drawImage(image1ff5477133adab84c1ef2189c4168458, 0, 0, null);
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
	private icons8_project_setup_50() {
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
       icons8_project_setup_50 base = new icons8_project_setup_50();
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
       icons8_project_setup_50 base = new icons8_project_setup_50();
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
        return icons8_project_setup_50::new;
    }
}

