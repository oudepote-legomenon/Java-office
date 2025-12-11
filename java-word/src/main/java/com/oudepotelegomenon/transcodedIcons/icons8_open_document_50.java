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
public class icons8_open_document_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imaged0597c2a66e57b73671d60bbf420bcef;
private static BufferedImage getImaged0597c2a66e57b73671d60bbf420bcef() {
    BufferedImage result = (imaged0597c2a66e57b73671d60bbf420bcef != null)
        ? imaged0597c2a66e57b73671d60bbf420bcef.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1200);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADTElEQVR4Xu2a/0sTYRzHpV/6uX/AH/oL+geCfuiH6Ms0LAwK+kagYEVE7ctps4yaWy4kMeepFIRaJKi7O1fZLObcLAtTp6Spq1Cx/Fp+n9une04W+dzNu9o9N0Z7wZuN29jzft2e554bLC0tRZKhtzjSDbYqPYnobVW1/GM5PiYR9DZ6Dz8YVNQ6l9ROUdmjMPpsg4324uOqTlSEBJX1LDjqGKBKasjLkBZ54X0HH0e+gsleA0ZrlR8fXzW0EEEQl9FKBEFURksRBDEZrUUQRGQSIYJQXSZRIghVZRIpglBNhrTIY/YVDAXHtozT7QPUQV9MP8P7KYa0yMYtirLwdwA/8H6KISnyN6ApWHD3gQ/vp5iUiMqkRKL8NyK9o+Pg7RtRLXMLy/gQAsRFFpZXhcHVSmg9jA8hQFxEK4iLxPONxDr7UhAXiWeNIBmlEBfRipRIFDmRydmf8GVyRrWsrIXwIQRedwXgYaN7CO+nGDmRkYkpYZ2oFXTxkMLfNwyeD8PzeD/FyIloRdKJGCr9oDOxksktaVvH+ylGTiSeqSU1ja46fHCu9C1QdcFNQcdySIrEs9ilFjYSyavoBVvL3KagY0RF1CYlIoecCJrr+K1HPLlc3pEYkXhuGqVypSJB34jaJGxq/SuB0Wno/vRdlLxST0yR08WtYR3F7MWTYXTuxnuLICXi6RmHDIoTbXoosUTw922EiRwyMifw3iJIiSBYfxAy8zkw1QZFxeWSX/8ZdBS3rjMyl/DOkpAUQVSz/XDkmgsKn46JysbK9YYJ/gS41jJMrB3vGxPSIpEIgP1JN2TfaIWixklRaTw3m75BVuHzVX5aNpjN5m1435iQFkGg3+4U3QnHb7XBbeeUqHw0Fuc0HCt6yUuwHfvOc9vxrluihQhicSUkXLFOWtuhmJ0RSVi5Gf41TyST4gYPGJgdeE9ZtBJBTM8v");
    imageData.append("wymLG87Y/Xzx2T9EZuGsvROyCloWD+qb0/GOioiK4H+/UDOV9eySu2sg5O0ZDje3D4SPml2Qc6/rt0hu2Xs4THHh/SZmF95PMQZ79U6DlbaQzp3qhvsuX68PxdH0JpBJsZGLdD9coANovxA2QrxbUsAv6GxBgA96jr+eVKDNTumG9wtiqpFdpi8+UwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imaged0597c2a66e57b73671d60bbf420bcef = new WeakReference<>(result);
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
BufferedImage imaged0597c2a66e57b73671d60bbf420bcef=getImaged0597c2a66e57b73671d60bbf420bcef();
if (imaged0597c2a66e57b73671d60bbf420bcef != null) {
    g.drawImage(imaged0597c2a66e57b73671d60bbf420bcef, 0, 0, null);
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
	private icons8_open_document_50() {
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
       icons8_open_document_50 base = new icons8_open_document_50();
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
       icons8_open_document_50 base = new icons8_open_document_50();
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
        return icons8_open_document_50::new;
    }
}

