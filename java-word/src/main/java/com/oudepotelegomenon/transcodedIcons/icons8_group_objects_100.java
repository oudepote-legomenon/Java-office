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
public class icons8_group_objects_100 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image2509f2c80aa3f86d7863e729b87e3162;
private static BufferedImage getImage2509f2c80aa3f86d7863e729b87e3162() {
    BufferedImage result = (image2509f2c80aa3f86d7863e729b87e3162 != null)
        ? image2509f2c80aa3f86d7863e729b87e3162.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1128);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAADFUlEQVR4Xu2QMY7gMAzE9v+f3mucZlwkZG4HsGMC02lESD8/h8PhcDgcDocuvy+zO3kvDSYX0OxO3kuDyQU0u5P30mByAc3u5L00GLqAzq8OvZfOT9AFdH516L10foIuyPmv5Q46P0EX5PzXcgedn6ALcv5ruYPOT9AFOf+13EHnJ+gCOr869F46P0EX0PnVoffS+YlcQLM7eS8NJhfQ7E7eS4PJBTS7k/fSYHIBze7kvTT/jT9bvAn1/9SFi1H/T124GPX/1IWLUf+PFWavnRZ1rxVmr50Wda8VZq+dFnWvFWavnRZ1rxXanqXtu6h7rdD2LG3fRd1rhbZnafsu6l4rtD1L23dR91qh7Vnavou61wptz9L2XdS9Vmh7lrbvou61QtuztH0Xda8V2p6l7buoe63Q9ixt30Xda4W2Z2n7LupeK7Q9S9t3Ufdaoe1Z0vc2T7E9jRXaniV9b/MU29NYoe1Z0vc2T7E9jRXaniV9b/MU29NYoe1Z3vps3/Y0Vmh7lrc+27c9jRXanuWtz/ZtT2OFtmd567N929NYoe1Z3vps3/Y0Vmh7lrc+27c9jRXanuWtz/ZtT2OFtmd567N929NYYfbaodi+7WmsMHvtUGzf9jRWmL12KLZvexorzF47FNu3PU1dOGh7rc/2NHXhoO21PtvT1IWDttf6bE9TFw7aXuuzPU1dOGh7rc/2NHXhoO21PtvT1IWDttf6bE9TFw7aXuuzPU1dOGh7rc/2NHXhoO21PtvT1IWDttf6bE9TFw7aXuuzPU1dOEhvO0+xPU1dOEhvO0+xPU1dOEhvO0+xPU1dOEhvO0+xPU1duBj1/9SFi1H/T124GPX/1IWL8Wf/ycU0u5P30mByAc3u5L00mFxAszt5Lw0mF9DsTt5Lg6EL6Pzq0Hvp/ARdQOdXh95L5yfogpz/Wu6g8xN0Qc5/LXfQ+Qm6");
    imageData.append("IOe/ljvo/ARdkPNfyx10foIuoPOrQ++l8xN0AZ1fHXovnZ/IBTS7k/fSYHIBze7kvTSYXECzO3kvDSYX0OxO3ktzOBwOh8PhcKjxD0fRhvjL1JoEAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image2509f2c80aa3f86d7863e729b87e3162 = new WeakReference<>(result);
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
BufferedImage image2509f2c80aa3f86d7863e729b87e3162=getImage2509f2c80aa3f86d7863e729b87e3162();
if (image2509f2c80aa3f86d7863e729b87e3162 != null) {
    g.drawImage(image2509f2c80aa3f86d7863e729b87e3162, 0, 0, null);
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
		return 100.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 100.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_group_objects_100() {
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
       icons8_group_objects_100 base = new icons8_group_objects_100();
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
       icons8_group_objects_100 base = new icons8_group_objects_100();
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
        return icons8_group_objects_100::new;
    }
}

