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
public class icons8_view_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image97c7efdf76ed94dab9a45f1e45d78a53;
private static BufferedImage getImage97c7efdf76ed94dab9a45f1e45d78a53() {
    BufferedImage result = (image97c7efdf76ed94dab9a45f1e45d78a53 != null)
        ? image97c7efdf76ed94dab9a45f1e45d78a53.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1612);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEgUlEQVR4Xu2a21MaVxzH0870oX9N/4E+5rX/QF8705e+9DITMNqS0baTcktIKuG2C2qQO4JyUZYUQyqgJkqJaTSNiVGJY7Qak3oDl1/POR1pOZvRZdgFOsNn5vumw/fj7vmdcxgvXOjwP0KhZT5WamwKWaK1xbrUli/oz5QFhcZ65TvDQNk0PHYgdZAMdGkZUKptKvpzJQeLGJ2jhyADWITxxqFL1wQZuUWWV18C9+sD8mQuqa199OdLRjNEMLLLNEsEI6tMM0Uwssk0WwQji0wrRDCSy7RKBCOpTCtFMJLJyC2Sni3AHyvFM2P1xMimeUlt+ZLuJxq5ReoJ6jJJ9xONnCL1gDvgLnQ/0XREJKYjckpHRGLaVuTouASFxWcQ4qZgYIQD1j8B/vE05PKPYe/tPv3j7SdSKpUhmZkDdH2Gb68PQL+PA3s0C47xaTAFU9BndMFltJP74ukaIbM72j4ir9/8BYbBEeg1DsNIdgnmX/Hw259QkzxKYqEIWkcIevtvw/O1DfK7wWSu3BYi+4dHoLZ6QT8UgZnioUCATn6LBzaSgZ5rdljb2IJErsD3u6IOup9opBKxBxOgZoLwYLMkKH1WLOG78KPJBfHMPO/jspN0P9FIIfL0RZG89+mnO4Ki52Xu1QlZNyZPrNJykcFQkixkuqTYBKYeg8owCC0VKZ+coOnkgOj8iqCg2MysH5I7CRNIzNH9RNOoyPbuHjmC59b2BQXrSZ/RDTedY4t0P9E0KvKiuElE8LtOl6snGjSO9Y7gM7qfaBoV2dzeJSLTxQNBuXryg9kLN26PLtH9RNOoCD6K4InFPdoQlBMb/DS79SxYvOMFup9oGhXBmNwRsMdzgoJigwdFt94O7olMmu4nGilEZgtL5FyFpw9d8rzgI4vWEUZHm1Dr9xG+UgEd64db/jukGF32rPjuLZDROxD+pfUimI2t");
    imageData.append("HXLitceykN+uCAq/K6Ozy0iCBQ0bIF8HmdzRR3Q/0UglgsFHlSs3h8DgjEN6eVdQ/DQzxSNg0IERPwlLMAmx6d/B7OdAqWUqXRrmM7qjKKQUwWzt7IHNG4fLOhYMw3HwpB+SxRzPr0IwswimQIqsp6tmD/To7XDLO0FEcJhQCpRqawV1+obueS5Si5yC7xnhZAatnQCobgyS4zo+5g+PpcjNked5eLKyDt06O1gCXFXGEUnjfYlXaGw/0V3PRC4RsSw8eY7WBwtseLIqMxSfQq+d7QQ9VaNKpXqf7vxOWi2Cuf9w6Z/JFblXlXElcvj1LCvVjOtzs/kDureAdhDBoF29gp5CxRnPVGW8d2bxRllCky32lc77Id29hnYRwVddDRNYRaXL7uR0Vcafuo+vCcdo3fxMd6+hnUS8aENE49eKBkDJhwT+HQB30XmOfUN3r6FdRIZGU8eeiSyHFzdaL/6ea47jwOQcETH5OLyG1unuNWARuf6Fo57gDt3XHd/jTnhxo80xglLu7XceKDQMr1BbP6W714CmwkW0CV1tjzAXq8UA3kN/5E+UatvXCh3z0X8qd2gb/gbg9fYYDkPgqwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image97c7efdf76ed94dab9a45f1e45d78a53 = new WeakReference<>(result);
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
BufferedImage image97c7efdf76ed94dab9a45f1e45d78a53=getImage97c7efdf76ed94dab9a45f1e45d78a53();
if (image97c7efdf76ed94dab9a45f1e45d78a53 != null) {
    g.drawImage(image97c7efdf76ed94dab9a45f1e45d78a53, 0, 0, null);
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
	private icons8_view_50() {
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
       icons8_view_50 base = new icons8_view_50();
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
       icons8_view_50 base = new icons8_view_50();
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
        return icons8_view_50::new;
    }
}

