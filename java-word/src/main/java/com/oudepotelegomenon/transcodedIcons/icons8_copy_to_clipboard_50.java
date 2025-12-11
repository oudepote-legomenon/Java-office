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
public class icons8_copy_to_clipboard_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image96043d1d058a0a2e0e8a6acf26e3c9d9;
private static BufferedImage getImage96043d1d058a0a2e0e8a6acf26e3c9d9() {
    BufferedImage result = (image96043d1d058a0a2e0e8a6acf26e3c9d9 != null)
        ? image96043d1d058a0a2e0e8a6acf26e3c9d9.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1096);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC/0lEQVR4Xu2YT2sTQRjGe/Hgwaufw6s3v4KmOYh4qW7iwQqlaHYTqtASYhKzGyvN1j8lHqpV1KqQVBSLTWJqKlqoFrGmKQXFFhShFQVL03Gf6sLuuyHJNm6IYV740fDM8M7zsDNbZjs6HKoTvdG9HlG54ZGUdUGU17S/o9DovJaurtPhPR5RXvJIcsErKoeBICozgqSUMEbnO1qvLnt2ZYYOHcslXL5qXAz13gz1ByaMnPRHXmpPoNjTE9ut98Nvr6QsdgeiM3Q+etC+FeiCJ6PHuio75Irkh92/Zq8f+VmNswP9Zc00M+IV5U1BkhXaU9tqce0pbdL56EH7UuAlkzgYpj1rVl51TxfvHGc/smeqEr4QNpkC2hYqC2LsHu2pnZVxLcwWnY8etC8FXuCJ9qxZz9XOF8W7gqUhpVKQ7TCiFsYXd+n9vJLcCY3OqzuI5gWejB7rqkaDaGz9Nb6sPYXlP79ly9NomSCx2HmLMbugB+1LcTzIg+SAxZhdHib7LX0pjgdZm/KxZCLIuvtiFoO1ONUns6Qa3O5B+1IcD9IseBAexCF4EB7EIXgQu0G+PZPYu9Q5E+8fh1hpOmnRAXSMU30xo7KFp4pFL4wH2eTtcMkXvXrAiD9yZR/1biq7QbCYGL1mQh1Ls/UNZtEBdIxTfX5phaWzsxYdGsao7pdH8tS7qXYaBAabRTr3mgXiyQL1bioepMKCTuFIEBxc/Uw0i/zcB6beSr2h3k1lNwjeQnShZrDw6csa9W4qu0HaZmvxIA3Ag1SjbYK0zVurbf6PtM3W4kEagAepBm52uPjQxZzk49fvOPAr1Lup7AbB9RS3OLqYk7xd+szGJwsl6t1UdoO0zdbiQRqAB6lGyx72nOp6NDd6tLw60c3qYf7JYGu+fqeG3ftzaudqNuFi9XD/ktCaW8tu4fMlD7JDHA2C5jq4L+gLUqBj");
    imageData.append("nOrY9zjEVIeGMaOWGEv9+yD4Ko4Pymisg0sPbnBGTQc6xqmOw4s3EdWhYYzq/ujIIPXyX9dvHoON8payt4EAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image96043d1d058a0a2e0e8a6acf26e3c9d9 = new WeakReference<>(result);
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
BufferedImage image96043d1d058a0a2e0e8a6acf26e3c9d9=getImage96043d1d058a0a2e0e8a6acf26e3c9d9();
if (image96043d1d058a0a2e0e8a6acf26e3c9d9 != null) {
    g.drawImage(image96043d1d058a0a2e0e8a6acf26e3c9d9, 0, 0, null);
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
	private icons8_copy_to_clipboard_50() {
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
       icons8_copy_to_clipboard_50 base = new icons8_copy_to_clipboard_50();
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
       icons8_copy_to_clipboard_50 base = new icons8_copy_to_clipboard_50();
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
        return icons8_copy_to_clipboard_50::new;
    }
}

