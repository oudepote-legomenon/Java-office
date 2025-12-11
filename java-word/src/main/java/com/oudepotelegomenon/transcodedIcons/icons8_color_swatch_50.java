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
public class icons8_color_swatch_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image2c515e941561d6a1503c72822094f54c;
private static BufferedImage getImage2c515e941561d6a1503c72822094f54c() {
    BufferedImage result = (image2c515e941561d6a1503c72822094f54c != null)
        ? image2c515e941561d6a1503c72822094f54c.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2584);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAHWklEQVR4Xu2a2VOTVxiHYeqfUG29dbSAbbUzjsKokNYOOyi7aAFRJCokIKuAhEBIpGVfDIhIFFRAFi1lyYLKFlQWFWlkVBSXKlqdCnqLw9tzYhPgHEK+LNQb35nnkuT35HeWTD4sLD4PPaWO/BUFTgKvIifBEcSpQqfMhkJHQUebrW1Hq51dQ6utbSXiSOumTTuabW2/Iv/+k06Ri2htoWOmsMgpcxQBYtcsqPIpg4agc/D73gZoCbsEt0NDYSgoCG4EBECXmxvItm4FJDaDUCExEcKGfN3/ZcACLIudhe7oE+/C4c/4iEFxoA2Gkm7Cg8zHMCZ8Mo83eXnzeJ2bC09SU2GEzYYuV1dos7PD9CAxF/K9lmwKHIU/oGXTW+IsgqbgGriVPEwFJyFFSJ7y+dAfGAjtmzcDakfZsmnTevJ9zTZ8Fn8ZEhChNf+hblcVjKSqqMC6IIPr4rlAANd8fLDMNF5ynSzWMjKHSZPvLFyJBPrK3LOhL1ZJBdUHGVgfD+LiQM5iqZebdMOGlWQeoyb/Z/6qIsfMsWq/E6BKG6VCMoEMyoQXQiF0u7vjQ+Fx28aN35C5DJrUXZI12dvzWmoDT8M9wUMqIFPIkEx5nZMD1319QfrLlhZZDGs1mY/RpPxSvjItWDJefKgFepPv/EOGMwQyoCE8y+dM9qdtB2mUw3hrBOtrMueigzc2L0jSm8e+CFczn0O3aAK6U4bfkgGZQoZjyl/53MmpszHwtioa+pJdQRZl39PJN+AA4AVXHhOGngNFxuOPEv+hTBkxSoYMyASNhIbXEg5cid0GMq6DgMy74KTulnzPC5ZMN6H7Ya6EFiOaIUPqg5TQ8LhkL27lg4yzRd89A5ZpQZJrxyPaaQETmiGDLoYuCQ3q/cJ16AYLC0syvXb4wRK39JAzIE9/RIWnMKAZMqwu9Elg/j4VAfJoFkij7Z3J");
    imageData.append("/NpJC67sOcGR06F1wLQZMvBCMJHQMCTwRqeY/VUyv3pSgyts0HEL7Wn3qcCLwqAZMjSJIRKYifKDaK84gCLagf7WjPZGVk54Ex2UAfqaIYObIqGhJ8kZt5JBeqAjV3K3Ok5JhWTMIs2Q4U2VwNzNDsQn2Mg8CX5Q9Qq0P2ZaeffogAbQk3JnipTQJWKKBOZ5GRvf9jN/xLK+nCNy2kuwpxq6hC+ocIbSkzxMfZ0xtwRmsvowKGJ+BDnXwVMrgm7yJGP3x0KQzZhbQkNvkgtIOfYJc0Qkp0ojpVQgU5jbzFJIYAbTvfCGL58VCapsOhl1mQpjKppmlkICMyzyxbd84xwRiVwS00UFMQfK5DvvnuVzp8gQ5uDPrJ14w8u1Ii7hdYp9KdeBV/TK7MQXj0+eHciafP8wDcyNqsUbZPnWMq2Ia3jdxT1JSiqEqWCJ9Ob3UDpaAUshc+eSB0gLrBtmG9lfWxGUcJUKYgpxxeNTWEIjgqkZzHpHhjGFoXpHkOZbnZwVYdcm+UW1UWGMRdMEKWLuZnoldqgRq9nj121/7Q73Aw3AK3xJhTKUuU0sJGKuZt6N8UBR/C3I861mL0SXvfXLXcNrZ+J+fUgFMwSyCV0i5mhmYoiDlpX1THvR6uVaETyu+2vvhvMGqXBMWaiJxUQw5weMb2ZU6o83+vA8iY8idUI/bisVkAm6mtAngqkeOGaUTG+lHT56M0kPC5cD9WvRMQzxvz2igi7GYk0wETGmmZc3o0BWYI03uhXpoR4k0hmc2EWF1YW+JpiKYAxp5maDM26jk8yvHZewOjc39gVIzHlChSaJL2EmwVQEw6SZ1yOxIC+0AVmhtSOZf86AJdr0vbvjrlDBjWnCUBGMvmb6a7bhS7CbTE6N+76675DMNFeoogQMbcIYEYyuZp4ow/C+mJblrdH3A93HwSeYx8FGOJL71KQmjBXBkM28UcXDFfH6hU8qXcPidy5zCa9V+kW3w9GCCaObMEUEo2lm");
    imageData.append("6v5RUJ7Zol5SBv2IjQff9ujr/f3A2A58xBotYYqIWqZfNNVf8xO+/B61Zq817LGCZtwPnF/jEd3Usq9wENIuTVEBmUKGY0qJqhzYF1IgsdivRVFos4bMZ9D48DtWBQgUY3tyr8HRxjdUSCaQAZlQcKsUQs8lgndp5LhXSaRpj9404y2UrvQXKHp2HbsKcWefUkH1QYbUR3pPLgRUHAavUk63Z0WUef9DAh8AARlyYYBAPh1WNAgp9czbIYPqIveWWL2UUAvT3qWcDP96/y/IHGabQP7ldUiod6egA9jHb0Ny3SsqOAkZmCR7oAQiLvLAp4yLJbp8xYfWke+7ZLMzU+6E2ulC+wdCcvqAU3EPjtS+BH7zO70i4rsVkHWjCBKkQgipSkDhOeAljlTuEHM9LWCRBzhLOf4CqZV6yWXIRxAzgcLLEJLbB+ElN+GgeAQiTqggplUA0c3pcLAxFfacTQC/8ijwFnNmkMAIXkI+5Rxr8nU/6fiL2pcjGU9EImrrJDog6v0z5B1epZEdKHA9WjYn0QZOwJ+8Rzl79sfnzzM7/wIHp1rQczLXPwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image2c515e941561d6a1503c72822094f54c = new WeakReference<>(result);
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
BufferedImage image2c515e941561d6a1503c72822094f54c=getImage2c515e941561d6a1503c72822094f54c();
if (image2c515e941561d6a1503c72822094f54c != null) {
    g.drawImage(image2c515e941561d6a1503c72822094f54c, 0, 0, null);
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
	private icons8_color_swatch_50() {
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
       icons8_color_swatch_50 base = new icons8_color_swatch_50();
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
       icons8_color_swatch_50 base = new icons8_color_swatch_50();
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
        return icons8_color_swatch_50::new;
    }
}

