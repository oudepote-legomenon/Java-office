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
public class icons8_nef_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image05310686579d1e75afba7a5bb9832a0a;
private static BufferedImage getImage05310686579d1e75afba7a5bb9832a0a() {
    BufferedImage result = (image05310686579d1e75afba7a5bb9832a0a != null)
        ? image05310686579d1e75afba7a5bb9832a0a.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(944);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACi0lEQVR4Xu2a30/TUBTH+cN89NF18qz/gS++6TqiJj5gYowaeYEYNBoTNVES7YYixGHFOGSCYghDMib+ADMMo2Pr1m499tzmLqUtyxbv7Yq53+Sb7dzT5pzPen/0YQMDQkdIJ5LpYzFZOcfFCSUtJVJnvDW5KJZIXRocmjRPD7+psbYkpyCeTIMkpy966zIXgpwaVvWrk2VgbQS5MJ6FQQKj8IXhDbJc2IEH02tw0oaJy6nL3vrMFAYIijtMWCDcYcIE4QoTNgg3mH6AoJjD9AsExRSmnyAoZjC8QSbUAiytlzp66PZ7cmjG5ednvf11Ld4gvTh2Xsl4++taPEF6MfaAvXj761oChLEFCJUAYWwBQtUJZFzVYHXLgFyx3h6b+lIjY3fUComf5qokdvv+Oyc3s+Jc6/bIzJ6vDneQh9n99qvE3bdOc5+/N0j8aH6fxJlVvX0N1YQNh7mVn4Y3BaOvNV+dUEFyxUZHkELJhLFZjfjGlPOrU5APG/V27toLf53QQCwLQDcsuP6yDB+/BYPktw3f/RREXdN9Oa9DAdn8Y5JPZakK84V6IMiv3SY8W6wS33x18IlEBiRrN1+pt2DDnj5zX4NB3MJNwg1CZTQtX41QQRbsOY5rBKcYfkd5QUpaE2bzOvHI9MEnslttQXHHhPXf/ukXKsiivS5wS0WVa61AkPyWv8nITS3cqTDe3muS+MiCLP9wQPAwPAwEn9SnzQbxkwUnF1kQPB8aphUI4hZtPDIgt+xF+9humL6OoO/NVcgY5jAezWgkdnss4+xaeJ877mSuIGFagFAJEMYWIFQChLEFCJUAYWwBQvVfgfD6C0cvxh7+CURKKselROpKJGz34u1PKMr6C9QqOQPHFv+pAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image05310686579d1e75afba7a5bb9832a0a = new WeakReference<>(result);
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
BufferedImage image05310686579d1e75afba7a5bb9832a0a=getImage05310686579d1e75afba7a5bb9832a0a();
if (image05310686579d1e75afba7a5bb9832a0a != null) {
    g.drawImage(image05310686579d1e75afba7a5bb9832a0a, 0, 0, null);
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
	private icons8_nef_50() {
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
       icons8_nef_50 base = new icons8_nef_50();
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
       icons8_nef_50 base = new icons8_nef_50();
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
        return icons8_nef_50::new;
    }
}

