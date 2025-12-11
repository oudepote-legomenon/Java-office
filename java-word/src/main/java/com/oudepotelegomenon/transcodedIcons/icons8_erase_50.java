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
public class icons8_erase_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagec319d2f8822212b4441dadc1a134b0ea;
private static BufferedImage getImagec319d2f8822212b4441dadc1a134b0ea() {
    BufferedImage result = (imagec319d2f8822212b4441dadc1a134b0ea != null)
        ? imagec319d2f8822212b4441dadc1a134b0ea.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1120);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADD0lEQVR4Xu3X7UtTcRQHcKmoIPoDov+q8E8oiG2QWcRm3jszkrbmnHfBfNjUW5rMWQYWtRdOl7nWG6GHF/agLh31IhTDXji00+8szhi/uYe7+7DfwC+cV7vb73zYj8s5LS1H0Re7FPTaJWXd4Q5m7bKiyrJ8gn9G6LCGT7PG122dCkSmEzA2k4S22wNgk4I7V+8MnOOfFzKIsLmDG+13ByG5/A3efdrI19L7DHT6HzGMsis8plWOnrS7gxl2leD18moBUYyR+v5jXL7R8/z3hQghWJPwcPYtxNMrkOYgWKkP30EOjIuJ4REzCx/z1VSYcoimwlRDNAWmVoTQGESwg/MItQaEkJh6EUJh9CKEwBiFaCjGaASVpRiHI3CKTbEbbOAzFEFVHpMBuQ8xwR3dUzP+wLXuUOqy0w9+9UVJE0ZVPP35UAzOZm3dA4ArAN9bzUGEyxeZkgNqbuTpHFy5FYCh6fmSJoyqchj1WRJwn+H7qynFiK8/tuB3DmDq1VJDMOHYHLCrvcb3WDWHIaiiFmNwn8HlzNGlePg+K6YSwlrMCttn1uA6W85w0+T7rJjWaPS40xeerISgiiGmIwCDsURJE0YUvh0d7gfAZrksbpx8r2WjBWE2BhH4qrcEYRamIQijMQ1FFDDxlC6MEAiqejFCIai0YoREUNWKqRuBcfoiE2YiqKphCghZ2dSMuOkZvujyhfe/ZH+VHGxGlcPoQmDY6DEx8XzhgD/QzOIxBYTUr/06UTp6I0+iLxf/8oeZXTQ14z6DCFu9/wTF6Rm+JPnHcptbuyWHmV2jMwnA5azu61Qc9gPHOvyRxZ7Q5F52+0/JYWYVvljwBYObpm4Epd2rnnH1jrzpCT22BLP6cxu6FHUPrzWuCHw/umIVxlQExWyMJQiKWRhLERSjMQ1BUIzCNBRB0YsRAkGpFyMUgqIVIySCUitGaASl");
    imageData.append("GqYpEJQb94bPskbTOJsVD5q4z8j9ao59FhMeQclj2KCJUzOuAOOz8we4nOU3zWZBUHBqxhUAr5Hrfnjc6R26wD9zFI35B1oRV2dLoJsVAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagec319d2f8822212b4441dadc1a134b0ea = new WeakReference<>(result);
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
BufferedImage imagec319d2f8822212b4441dadc1a134b0ea=getImagec319d2f8822212b4441dadc1a134b0ea();
if (imagec319d2f8822212b4441dadc1a134b0ea != null) {
    g.drawImage(imagec319d2f8822212b4441dadc1a134b0ea, 0, 0, null);
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
	private icons8_erase_50() {
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
       icons8_erase_50 base = new icons8_erase_50();
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
       icons8_erase_50 base = new icons8_erase_50();
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
        return icons8_erase_50::new;
    }
}

