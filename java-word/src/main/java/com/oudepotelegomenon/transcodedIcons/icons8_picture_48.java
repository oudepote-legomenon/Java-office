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
public class icons8_picture_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imaged38837ad42124afa220f060f794404cf;
private static BufferedImage getImaged38837ad42124afa220f060f794404cf() {
    BufferedImage result = (imaged38837ad42124afa220f060f794404cf != null)
        ? imaged38837ad42124afa220f060f794404cf.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1032);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAACzklEQVR4Xu2YTWsTURiFbxJjJjX/QJfqQo1VKm03FRRU0E03unBjN4LfKFLUppA/YWlV0IV24VeNIm4KrYWKQnWVpYsuRKna2BgNVhd9nRs7aXPOnWQGGzKLOfDAMLkneWZ4bxhGqTBhwoQJs9YpZ9Wmnxn1sDyoSjbSYkq2y+PFQbUFPY3R8uWMKhi+qLVopwG1EX0py3eevyAA2G730ZdSDsbYuFFEX4qhFCjQl4KFoIG+FCw0nWxc/kyelqXCU5tc5Vifo3XLoC8FC81GC8vv6RoqF2FYq0FfChaajb7zeAFL357ROgf0pWDBD/m+mORPxOh8PfTY0AXMP6F1DuhLwYJXvl6OyK1dltxst+SLfYyfu2EcoYlTtM4BfSlY8Epu/3q5vi1ZYWxfgj53pbqJc63bxO+Or6vKO+hzuG4tQF8KFhoxdykiIztr5TU30kn5dNH7KHkFfSlYqIf9bCKP9iZI3uFBT6KyBnv/A/pSsFCP10d5dJA3x8yjNNsXr4DnG4G+FCy48fFCVIbTLIwM70jKh/PRmu7nczGZ6k7Jy66UzJ3197eLvhQsmCgNKBntdh8d5F6XJaVr/7rF/oi86tkgk52pCtP28UK/972CvhQsmJjqjZNkI3RH74e3h5JVeYeZA0n5McC/YwJ9KVhAZs9EZWg7CzZCd2YOWyTvkO+16LdMoC8FC6sp2mNwt9MiOS+MtreRNOJlU6MvBQurGT/if3Q0t9NtMmEQRrxsavSlYMHh/ckoiXlhxB6d8T0s60ajTY2+FCxoFq5E5E6H/9EZsnnesfKP45V6mxp9KVjQvDi48qDmh7Hd/uUd3DY1+lKwEDTQl4KFoIG+FCwEDfSlYCFooC8FC0EDfSnljPqOpQDR+NWifpVtKAYC/eIZfSmLV9VWe/E8lltORhV+ZdVm9DVGv4fXr7IDMU62g77znuXDhAkT");
    imageData.append("Joyf/AVq3nmiClPgTAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imaged38837ad42124afa220f060f794404cf = new WeakReference<>(result);
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
BufferedImage imaged38837ad42124afa220f060f794404cf=getImaged38837ad42124afa220f060f794404cf();
if (imaged38837ad42124afa220f060f794404cf != null) {
    g.drawImage(imaged38837ad42124afa220f060f794404cf, 0, 0, null);
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
	private icons8_picture_48() {
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
       icons8_picture_48 base = new icons8_picture_48();
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
       icons8_picture_48 base = new icons8_picture_48();
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
        return icons8_picture_48::new;
    }
}

