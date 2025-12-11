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
public class icons8_cv_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image632371a2c0ecca68a6f2c658f6cbedc9;
private static BufferedImage getImage632371a2c0ecca68a6f2c658f6cbedc9() {
    BufferedImage result = (image632371a2c0ecca68a6f2c658f6cbedc9 != null)
        ? image632371a2c0ecca68a6f2c658f6cbedc9.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1256);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADdklEQVR4Xu2a609ScRjHfdOLXvS2v6l3lZcXressoBeVmZYH2Spt05AEuoCaVipWbKW0NbVpigJeQCtN5yUvNXOUuTnQwhvwdJ6z4eDhIrDDwfJ8t8/87Xee8+z58uPr3PxlZKRIFwtUh6WM5rlUrlmVMGo3+7MJ92jdnlbudeUhKaOel8rVgzJGcwKRMBq7RK6Zw2e0PqUarpEe6NVlnrfqs4picb+84EV5qaItmEvFFQ72BGby8ysPBvrhWibXzF5WqOy0HnvQvhHIxZmCZ4xLFl1WRV91zubH+pOeWNy8U+pjh4ZgZIzaK5GrNbQn+1XTsqfkpfXYg/al4Cy9+uNK2nNX9VXl9M+8ugB/LDdiorynDBkKYb9CPglT2Ux7sllpYc34aT32oH0pOAvORHvuKltV9sDMa0lYQ0okI5wZhjVTpM0K9JPJ1dm4R+viNsLOgjMFzxiXqBGfay4iqqrGsMEQWbGWReMvLKtZR3Ati1CHYA/aNwDvRqJJ+7QlbLBEwR7RJJiR1m572GCJ0ma207Y7EszI9rYXDC2dcOW2LmzA3cgr0YPB9J7rEU2CGUm1RCMB7Vsjfp8X3MtfOHDNlwQ1suIcBcvLU9BRe4QD17jHhwQz4nE7oevZUZgyX4UN52OOSXMedNUfA8/qD1qesAQzMmF9AEOmc+yxGIJoBIfpLEzYHtLyHY19dUbk9/pmSJ1gRj60MTDdc40YMbB7+dyzaFpYWonIxtZ2SJ1gRvBE8NNP9ETilWBGAhnBXGw4azgmu//BjKBWnJ/Bajy981vLajzD7fEhQY0sLK3B2/55qDYNc+D6+681WhYiGvK0hn1zi/2DsWMKCvU2KDeOwqN3sxy4xr2mzmmuJpJoyNMWdq/PD7o3Y3CrYQhM426w/IQQTOMu7pmercHaZJVyI+ZPi6B4Yof22fUwEwHaZz2gqBuEnpFF");
    imageData.append("+nrcSqkR/HxL6x1Q17MQNjyl1rwAJQ0O7p1klFIjyy4Pl4Ey4wiomsdjgjVYu+xaD+lBQ56WsK+sbkDrwLeEwHeCRUOetrALJdFIQPvCCAaShpQvBA07BpKGlC/EsEeTaIRnpdSIGPY4EMMeTaIRniUaCei/NUL/SSkUvBtJN0kbiffCgFAkfWEAr0vY4rjCIRQ4i1WfeZfOuavwAgteZOllX94LJH2pRlSa9BcLX2uS8qdxyAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image632371a2c0ecca68a6f2c658f6cbedc9 = new WeakReference<>(result);
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
BufferedImage image632371a2c0ecca68a6f2c658f6cbedc9=getImage632371a2c0ecca68a6f2c658f6cbedc9();
if (image632371a2c0ecca68a6f2c658f6cbedc9 != null) {
    g.drawImage(image632371a2c0ecca68a6f2c658f6cbedc9, 0, 0, null);
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
	private icons8_cv_50() {
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
       icons8_cv_50 base = new icons8_cv_50();
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
       icons8_cv_50 base = new icons8_cv_50();
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
        return icons8_cv_50::new;
    }
}

