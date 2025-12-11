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
public class icons8_xml_file_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageadc6ee61c5f354d14d57ebba42d585b0;
private static BufferedImage getImageadc6ee61c5f354d14d57ebba42d585b0() {
    BufferedImage result = (imageadc6ee61c5f354d14d57ebba42d585b0 != null)
        ? imageadc6ee61c5f354d14d57ebba42d585b0.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1208);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADUUlEQVR4Xu2aW08TURDH+XB4i8EYjbeoXAREKMq9IAUChVJ7oRRqgUqBFttCi7QUyhYWMBSjEAOa4A0ICC/64JPfYNyZzTZliQbi7rKaneSfnjPT7pnfnpk9bdKsLM3+IetccJe1JByMHHIu+n70pYJh8ZqymCFuXy7yG6A+apFcuV493Bt+DP3LoZR4XckNQeomzcAeLEkuBLEmB6FwpBE8KzLDyA3y5fseRDdYfmdSoRXx+pKZEiBossMoBSI7jJIgssIoDSIbzGmAoEkOc1ogaJLCnCYImmQwcoMwmyn4+G3nj3rCePhDMzUWE+d3bJMb5CRyzA//FOd3bJMT5CTCHDAXcX7HNg1EYmkggmkgEksDEex3IOObMagZ74D6CTPMHyxC8usC1I61k5hdFuLbDMVRkQ9T6c/Z2H7y2di+tM8895Q+N/w2dGQd2UHmuMQvWYsh23gX/Oth8K4FaJzvqaV44N0EzVGZSd/oKSff/aGGtK/Y20A+C+s+so7sIHTxsIkSaI7ZoClqpXHX4gDFBDBUVchIvumdJGS38768/mr1gPjWxyiB2+5KuOOuggudBZDYnaOYKzVEsTPGXNoF9HnejPJwHMzN3ofqAUFdd5bzd5lTRbA17cdewORuuR4RDO5Ga9wBF82FcKXrAVy2l6gLpCVuT5fQs9VA2m9MOMmnj3TSq3ctCGW+Jiga1BM87p6qQHSjzWkQoT9QjZMW8rmW+RLrmO2Ba906rpds3C5VkC+5v6AOECyX86Z8uOoopUQyG7iae5yiL8w9erGcSrjfE1h+7lcjkNtXQ7GprVl1gAh90DbTzZWLjsaB9y8ohmWE8/j2LD1qz3bkUa/g+YLlhbEIdxapAgTPDEwAn15CKeEBibECTx1fPtx5g6A4xsbHWKnPQPPnG5FDIDp/M5gYFym2lVAGZOJTnO5wjqUY2P0l8G+E");
    imageData.append("KZkcSxEweywlfa49j96LJzbGsPFxXhlsozmeNZkgmRrlrqcYCDay8LUCv6bg2YG+6e0kDLz2Uz9gDJsa777QEzjG90U/z9AcgZwvBw8Jr6EIiNLSQATTQCSWBiKYBiKxNBDBNBCJpYEI9l+ByPUXjpMIc/grENN8r94wbV9VgzAXcX6aqdl+ASKeOHC/5zkHAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageadc6ee61c5f354d14d57ebba42d585b0 = new WeakReference<>(result);
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
BufferedImage imageadc6ee61c5f354d14d57ebba42d585b0=getImageadc6ee61c5f354d14d57ebba42d585b0();
if (imageadc6ee61c5f354d14d57ebba42d585b0 != null) {
    g.drawImage(imageadc6ee61c5f354d14d57ebba42d585b0, 0, 0, null);
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
	private icons8_xml_file_50() {
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
       icons8_xml_file_50 base = new icons8_xml_file_50();
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
       icons8_xml_file_50 base = new icons8_xml_file_50();
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
        return icons8_xml_file_50::new;
    }
}

