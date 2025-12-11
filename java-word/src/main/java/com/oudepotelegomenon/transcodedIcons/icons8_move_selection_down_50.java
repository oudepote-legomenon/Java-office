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
public class icons8_move_selection_down_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image98e8863887bdda5e001311b5b7892c22;
private static BufferedImage getImage98e8863887bdda5e001311b5b7892c22() {
    BufferedImage result = (image98e8863887bdda5e001311b5b7892c22 != null)
        ? image98e8863887bdda5e001311b5b7892c22.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(996);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACs0lEQVR4Xu2a/0sTYRzH/dP82Z/Dn4osQumLIpSS0SJLM7+UQ6fJgjamGWiONCvKWnNuO2Eb6HbzW7uda07XsjArRNQ++TEm3PM85z1SxG08b3j9sPd9Pnf3YoONcSUlIibNVEwtDcSUmzwEZcXqjyW8ZK8HzuIO2evwzB9VnIyeiV9WKzQiWEpz6u6sktkyIvIhvR2Qk0D2euAs7pA9i/172AstpHbIngXOBeNJiRLBg8CRjR9bgDfHG5zFHZ7E1FX4+OkrWTODc8E5dVqICBGOCBEhIkSOjhDJZzy4YH0dSmwnMhtgxKySg9HAPNXrgbO4Q/YsJiIKBONpqmeBc+PSYlQjcn8o5L3S64dCo2kgtEmJtAxFwZeFguHh+xQ094e+CxGzIETMxn8TGQ6nobKh8xDbqETN/A1C5LgIEU6KW6S6+fEy+fXPQ+uIDN7VPXB4ZKi6ZtXcOA+t/W9gcu3XwU2R5+ahpn1sVyNSVX93+lR1Iwy+lAx5+jYM7yILh6+HPTPgnpqD7icTUHkMmcaeIXD74jDikw/P9UqSYWxyhromi7o7fXDyguWnRuRc7XVvxfk6SH3eNGQp8+XgpznZI2PeMNc70zPwApZz36j98FJ6/6d8lupZtPc4ofz0Je1H61+JIEYyehKIqUQQPZmjJBDTiSCkjJEEYkoRJC/T5XpuKIGYVgRxe0KwuLJO9SxMLYKzuEP2LIRIUYqUlpXD2Yv1hlTVWqChyUr1euAs7pA9i8s32qDm6m2qZ1F24gwt0vHA5bx1r2/H7hgEI7rtLrC09VK9HjiLO2TPoqnTDh22R1TPAudabA5FI1I0/zQKEY4IEYMIkXyECEeESFGK4LMdeNAIdW0d5OSfC/KAs7hD9izmU1lYWslRPQuUpkTwKRt8QAUPFBKBuNKlESn0/AYI5cag6+wdAAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image98e8863887bdda5e001311b5b7892c22 = new WeakReference<>(result);
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
BufferedImage image98e8863887bdda5e001311b5b7892c22=getImage98e8863887bdda5e001311b5b7892c22();
if (image98e8863887bdda5e001311b5b7892c22 != null) {
    g.drawImage(image98e8863887bdda5e001311b5b7892c22, 0, 0, null);
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
	private icons8_move_selection_down_50() {
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
       icons8_move_selection_down_50 base = new icons8_move_selection_down_50();
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
       icons8_move_selection_down_50 base = new icons8_move_selection_down_50();
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
        return icons8_move_selection_down_50::new;
    }
}

