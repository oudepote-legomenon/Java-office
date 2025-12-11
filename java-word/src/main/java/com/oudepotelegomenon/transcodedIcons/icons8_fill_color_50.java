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
public class icons8_fill_color_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image63f718e793c3f9d3e1f90390b56b2a09;
private static BufferedImage getImage63f718e793c3f9d3e1f90390b56b2a09() {
    BufferedImage result = (image63f718e793c3f9d3e1f90390b56b2a09 != null)
        ? image63f718e793c3f9d3e1f90390b56b2a09.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1448);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEBUlEQVR4Xt3XX0xTVxwHcJZl0c3s3QeTvezNFxceJLw0/XNLSXAPhkYNCrZih8WFiVIKUZAQI/bSsiwxU9qOLDgcoDFLFuVPwiJCW5j7Y4yJf4iKUYyaqcgfoUDPfr8uV+FXw3r/tbd+k99Lzzn33s8995zbm5UlIfX1bWvdvP+cmw9upm2ZFcY+qPb4T0JNurytObQ5s/K+Yty+oIk2Z1YQw/t7AROravaX0uaMCQB2upuDS40nf2KIcfHBPbSP5uM+4d+GiIHRG+xllDE+cC7m5gOxam9rMe2r2SxHvAIEFmK+a/8lVtMcnM2IDeBdCKEmoTovDS3VeH+Y0TRmNUTGYJJBaB4jBqFZDCJq+MCiGITmMHIQmsEogUg7RkmEUG8wzSnCqIEQ6i0mqC5GTYRQqmNSgRBKNYzbE7DG3xO/q48QanI+xjouDi7WeoPTinw2u5paN8CdmesNX4vRk6ldimJgNho8ga45nG56olSUYpjDLW393b3DCSdIZeFN7OoZWpS1Zg772vrgIAkHT3XJnhl4tOpP+DvT9mgtL1mYM86KTUPmPDbe0MCi/f3pr74+dqeykg3mWWLtdqedXu+q6bB95QlxHHt4/HjigdNRgLleXMwuAyZgd35Gr3fVnC1x+LSCmeB5htfyc8ne0/Q6k4oWMLIRQtKJUQwhJB0YxRFCUolRDSEkFRjVEULUxIhBhPX6Ly9aLGvo76KiBkYM4jedbm3YaHw0bDCU0zbRURIjIDp3lZ6i53lXwgZDBUBiEZPpWSgn52PaLjpKYMQi/ua4dQD4Z3z/fjaanz8HoEraR1LkYMQiMDAb1ZG8vOg0jEUMjH85lJv7Ke0nKVIwUhC4NmA2nt8vL2evW1oYYiJmczRkNB6gfSVHDEYKAhMyGPaMmM0LUx5PHIJ1b98+FuG4iS6r9UPaX3KSwUhFYODu37xbVvYG");
    imageData.append("EZ8VQMHvC2GTaSvtLysdNse3eKHjdXVsvqdnBeJBY+N/W2zx3u/puP9LxGDQw8JemmpqWgHBum23L41wXJiOkR38nsGPsz8LC9mdgwfj9ZfVyq7Abx0lDp72TyawNs7e2L49ShFYz48eZYBkIZ3uczpOds44nZu6i3YP/Grd8RTrfJFt4Meyr7+g/ZLJ1ezsj+DRmXnsciUghPpjy5bXsIZcdKymMqLXb8Q7/grWHgUIdctmY/B4XaBjNZWIXp+NENxuKUCosdJS3L0u0bGaytWCgk8AMjdx6FACAGvW68VHC9/yR+hYzQXWiG/UYolOHju2EuLzsTGHg8FmMDui062n4zSX+D9ejhvEFyK+BJ/U1rKJqip2vbAwCsj5YaOxgI7RbHD3gp3pG1gLN+ExisIsvABEN24Gy/v9C7ZanU/viTyGAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image63f718e793c3f9d3e1f90390b56b2a09 = new WeakReference<>(result);
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
BufferedImage image63f718e793c3f9d3e1f90390b56b2a09=getImage63f718e793c3f9d3e1f90390b56b2a09();
if (image63f718e793c3f9d3e1f90390b56b2a09 != null) {
    g.drawImage(image63f718e793c3f9d3e1f90390b56b2a09, 0, 0, null);
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
	private icons8_fill_color_50() {
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
       icons8_fill_color_50 base = new icons8_fill_color_50();
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
       icons8_fill_color_50 base = new icons8_fill_color_50();
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
        return icons8_fill_color_50::new;
    }
}

