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
public class icons8_png_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image63968cf87779b0de8bca61969e05bdc4;
private static BufferedImage getImage63968cf87779b0de8bca61969e05bdc4() {
    BufferedImage result = (image63968cf87779b0de8bca61969e05bdc4 != null)
        ? image63968cf87779b0de8bca61969e05bdc4.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1080);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC8UlEQVR4Xu2ay09TQRTG+cNcurRFlsZlazduunNj1MTENyVG40ZQpBKCUaDpAyqCVIq0RkAhAoEEIorQN31A6YMe5sz1tOXWkDbeua1mvuTL7ZmZzpzfnXvmdtG2Nql/SOcsnjMGs+uKIHuMZvdl9ZpCZDC5b3RYRgsXrb4Drc0goN3iAaPZc129ruZCkAtWX/ZW9y5obQS5ZgtCB4dxiYURDbK0GoV+xxqcZzDtJvdN9fqaSQ8QlHAYvUCEw+gJIhRGbxBhMM0AQWkO0ywQlKYwzQRBaQYjGmTYuwFfliOn+uqDAH9ptpudVnV+dUs0SCM2mFxT6vzqlkiQRow5YC7q/OqWBNHYEoQkQTS2BCGdBvJsJAaTwTQEFvdhej4Djvd7cO95iPfd7w3B7NcM+BcycLtHGd/njPE2vFbP0zMchRk2bmHlAD7MpcHWp8yhGwguqlYoVoDOFyHosofLbYNjCT5+fDbF47fsSnMggFqdzQJZ3zrkd3kvXeSx92PqBMjq5uEfQYYn9spj5tluDLHY6UvWrKMbyOJ6lsd0dzGpapCjI4CH/WEYm0nymEB2onkef/62XzO32rqCzC0f8NjP6oVAKNnJT2lwTik7gCDVoN1D0Zq51dYF5Mdunn8uFEtQKgH0OmLlRNe+H8KvSB6iiQJ/dAgEkydhTY36k7C5neOmmtIdhFQ8KsFEUHlsCGTjZ463oWg8guCJR7rLTjo8+Uju6do60QVkaycHA6Nx6HoZLvcRCPY9GojwncITDYUgj1kb6clghH8nuKTANA2EaqTaBLIdzvMYHzESFXsyo5xytIstDYL1gfErb0KhgAoIHgAorK13gVQZtqVB8O2e/P2eIRBsW9nI8rZq6Q6CBethp02/O17ThwWMfa/HKyeQ3RXnbU/fnDxu8WWKu+NjN2aE/cyx2Su1RhYKoqclCEmCaGwJQpIg");
    imageData.append("GluCkCSIxpYgpP8KRNRfOBox5vBXIMZLrrNGk/tOS5jlos5PqpV1DDXSfR7BtP2JAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image63968cf87779b0de8bca61969e05bdc4 = new WeakReference<>(result);
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
BufferedImage image63968cf87779b0de8bca61969e05bdc4=getImage63968cf87779b0de8bca61969e05bdc4();
if (image63968cf87779b0de8bca61969e05bdc4 != null) {
    g.drawImage(image63968cf87779b0de8bca61969e05bdc4, 0, 0, null);
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
	private icons8_png_50() {
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
       icons8_png_50 base = new icons8_png_50();
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
       icons8_png_50 base = new icons8_png_50();
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
        return icons8_png_50::new;
    }
}

