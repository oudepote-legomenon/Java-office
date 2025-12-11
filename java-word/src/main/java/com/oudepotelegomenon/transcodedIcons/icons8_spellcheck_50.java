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
public class icons8_spellcheck_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagebaff93d2cbdf9244669d5789ac27c208;
private static BufferedImage getImagebaff93d2cbdf9244669d5789ac27c208() {
    BufferedImage result = (imagebaff93d2cbdf9244669d5789ac27c208 != null)
        ? imagebaff93d2cbdf9244669d5789ac27c208.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1444);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEBElEQVR4Xu2ZR4gUQRSGfzMYEUFFwYsRw8WDggq7ehXE7EFwFQQDrgnxICJiQsSDBwOIKBhRMBwUDCDoRRQv5iyCioIK5pzq36q3U1Ove2Z2t6enD/vDB7NVr6rf2+6qev0aaFazmpWW1hh+G/4F/DIs9+wyrQ6GD9BBCG8M7eqtM6zZ0M6HTBbjLOsytOMhZ+qtM6oBhr/Qjof8MfRxYzKpzdBOx7HajcmcWhteQjscx1NDy7qRGdMEaGeLMa5uZMZ0CtpRcsfwNaKdHK4bmSH1MPyEdpQsMRyNaCffDF2RIa2EdpLwJO+Jwo/dImRId6EdJKddfxvYEz3sJzecTcU1Bto5YYZntzOiXxju2VVMe6EdI8y32nt2oyNshB2eXUXU0fAR2jGyx7OjWhieuL6Q98gPOnXNhXZKqPLsROuh7YSZnl3qugLtEHmG6FN7ELStcNGzS1UDoZ0RNnh2oa5D2xMmm/08u9S0FdoZgf/5OC2Dthc2enapiAniK2hHyFXPLkrdYQ/KcBx5YWiVMy2/+IYXOiGUclKfgx4njPfsyi6e2KEDhP9p5l3FNAt6rHDCsyureiO6QpIUkp+VXaugL540K1Bm8XR+BH3hpLkPe62yqQr6oknz3DAHZQ5kP/SFk+S4oTOs2hqmw75F8g59dvD3IddHmwari+EL9MWTYjtyd4Hbe1yC6fPYMMmNKVnzoScS1nl2DdVDwzHYIJifbUFuXr50LTYMhi3FkiGwr883PTuWoaJyu0hdgw5A6O/ZNVTMoOW9XYL4bpiHws6xbwGsrQRTVMOgnReYASchyRboWFXQV0jVyAUzMb9Laxt0AMJCz66x4qKVNcE7UYq4ZpkhUPSBY3k0sD4QKX4CeAsdAPlh6JYzbbS4A3E+rolCj5OIzp6HHcMKDhPNW+7vqZ5dnuQiUZz07JqiI7Dz1YYdMZJCBisz");
    imageData.append("fV3bUtd2UIxCnYUOQEjqO8cD2Pm4OxWT1NBYvRzptXM3YzvPGSWW/vkJIAyAvENyX56kgNHJa1sLHdgUWH8If/viWM7BuZT4LTAMQNjl2TVVYSDT3N88yWtc2wjkasi8K6EKBsKTMwxAGOXZNVXho8XS0D7XRvjcv3a/dzubUENh+yMfrUvQAZALSDapY+7EeXli+6qBvStyXe5Ucdur1AIOhB1pSnZGph3h9su7dNvBsyNK3H7Zzzlit980xANRHmOmHaH4qPUKGz2xTsCxzNvi7lhqYhZLZ5huVOd3FdRY2IOZdTF+vsiE5GMqg2HaUag0xD7eCQbBMZvyuysrrg//yzDTDp7YPOxYMCfcnbiwZU3wTjCIcG1lQsxiS6kNcE1k5nGKExctdyCeIfcMnxz8OsYtln2RC/s/4c14i9jyNLoAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagebaff93d2cbdf9244669d5789ac27c208 = new WeakReference<>(result);
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
BufferedImage imagebaff93d2cbdf9244669d5789ac27c208=getImagebaff93d2cbdf9244669d5789ac27c208();
if (imagebaff93d2cbdf9244669d5789ac27c208 != null) {
    g.drawImage(imagebaff93d2cbdf9244669d5789ac27c208, 0, 0, null);
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
	private icons8_spellcheck_50() {
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
       icons8_spellcheck_50 base = new icons8_spellcheck_50();
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
       icons8_spellcheck_50 base = new icons8_spellcheck_50();
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
        return icons8_spellcheck_50::new;
    }
}

