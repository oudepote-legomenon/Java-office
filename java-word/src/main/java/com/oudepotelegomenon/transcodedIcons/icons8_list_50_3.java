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
public class icons8_list_50_3 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image743bf1fd383a9aedd289c0b0c0aa39dd;
private static BufferedImage getImage743bf1fd383a9aedd289c0b0c0aa39dd() {
    BufferedImage result = (image743bf1fd383a9aedd289c0b0c0aa39dd != null)
        ? image743bf1fd383a9aedd289c0b0c0aa39dd.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(936);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAChUlEQVR4Xu2ZP2gUQRTGL/gPay1EG8FCQUWbKApyJ4iE3M5uQM9CsLE4FbQQotmZPTnEJqmFFIqF2MhBRG7f7AkpYpFCxE4CNlZiIzaiooh6vtndWY+XLc5qZ2R+8LjczVfMx5v35u2mVnM4HP/M1LVkC+PJFcbhHF2zgtb13taAy/O+kK8xhozLZ1RjBbj5t8qADmuNMAFrTMgXvoBVq41o0MxVZ8QkxjVypMGGlUedPaf7KhjXyNF6s1F1TNanD9N9FYxrxHicEdPwwv4xn8t5XyQX6ZrD4fgPmImSPT6HEIfHe/h51xPyTK02nKA6o/EjOIVt9+foGJ+1YHhAtUbj8+Qsju8vMRttL0xOo4ml/C75FcwNdlO9scyET7a1Wr0N+nuTxweKzHA4Oaq1CjRwOc0IHrfpWdhB160gPWZcfs0yAot0XbNupK4iysf44QRm4A5u/nd+rJZa3d5mqtLQkbqKKB3jsUPdz44T/MAiv2ld61VkXSst7G8Bj0/QdWvAbPRzI58wG8ujge14kuqNxc9fypUFC2GK6o0lfQbB270s1B1D9Q6Hw1L8G093Ygt+jJfhu7QFC1jDGz5qt19tolqjCSI4ng+J7zE+/m2/sEC1RtMU8S7WGexXf9e7KxvVO63UGIc3VGsV6skwz8gqXTOeIIobmAmBBh6pJ0M081n9RnWadSN1FVE2xmdvF4va+I61ckv9Y5TqNHSkriJKx/igIw96IVxAA7fRyIesRuSyleO8hoXS09nxeH8fXTeW5lx8SHUr/T3gcKk4Zp3B3lGt0WBhP1R3CG58gMdpRRW7lV0La2MWN/2lyEL68gEWvW5/O9UajxpH1KiiwuoCdxjAH0ObnKCZM2b/AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image743bf1fd383a9aedd289c0b0c0aa39dd = new WeakReference<>(result);
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
BufferedImage image743bf1fd383a9aedd289c0b0c0aa39dd=getImage743bf1fd383a9aedd289c0b0c0aa39dd();
if (image743bf1fd383a9aedd289c0b0c0aa39dd != null) {
    g.drawImage(image743bf1fd383a9aedd289c0b0c0aa39dd, 0, 0, null);
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
	private icons8_list_50_3() {
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
       icons8_list_50_3 base = new icons8_list_50_3();
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
       icons8_list_50_3 base = new icons8_list_50_3();
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
        return icons8_list_50_3::new;
    }
}

