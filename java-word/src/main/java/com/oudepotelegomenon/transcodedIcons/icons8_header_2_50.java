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
public class icons8_header_2_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef5502aa622cac4ffb87e11ad11d134c6;
private static BufferedImage getImagef5502aa622cac4ffb87e11ad11d134c6() {
    BufferedImage result = (imagef5502aa622cac4ffb87e11ad11d134c6 != null)
        ? imagef5502aa622cac4ffb87e11ad11d134c6.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(972);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACoUlEQVR4Xu2Xu4vUUBjFVyvFB2JjoaAgNjaChfgq/CvEYmFlNg8UBBdZc29mIRY2suTeCayFaLlosSCCICwWgo0W1oKiriIIYuEqW/go1i93MnFyksxuTDYZh3vgV8zkO+fmzCQ3M2NjWlpaWlpaWiMki8vVLGxHnsHZPJlcXkN/iMnFE5zNk+d5m8M1LS6uk3eRvEsWE1+jrGXilcnkgsGleckLdqK/8SJTU/5WOnlGfED/AJYNV55PBGUMKeooYs90DlGBj+grwO04LOOgopYi6lJK+wrhymkVljoQ8d8U4XJlknf2DFcRJt/TpRYYXJy1nM5pen3C4p1xuukfYXYS4Q5HESbehScc7lw401N4CWF+DJNPh6HI/EVvbjseQ4Ulc3c2Jj81WmTC87bge4NEmfdxDQWTPxstUlS0zgNcIyrS7DdSRNGllfnMUevgm8NaxOT+OczvYya3CJ3cLfrKnHXB5WP0dzOqKUIf6gE6n8+Y30X8Mq4G+3KLVEEVRax2cNBk4jVm93GzO5g+UBlli9hcnKKcL5jbl7804cldahgPVkmZIuS/QP4fmBlnM/HNdvwj/YbUUFX8S5HxK7PbyDuPWQnof4rZDk4mjKmhCilaxHb9vXTzvsCcBEy8sXlwGL0DiqjAcDdaE9pR3qb9xYpQiWPhgw0zgMVJz9+NXqWMYUWdzxHD9Y/T/Hf0xzlM/g7XGPSjsvEirfbsfmuNnSl1P2QJjT3qKKJ+djD5DH0xTN5rTd/Ygb5MpcwRdRSxHGGgJ/YycWfgpYTCgB4bX2R1E20oL9HTRTwvVCJUOqSeIpYrjuL8X8RD2mat9WI6stVcESYv43wJVhorQlvqHM6XoMEiXNzF+RI0WITJBZwvwQgV0dLS0tLS0hoh/QERxvfHYS3cKAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef5502aa622cac4ffb87e11ad11d134c6 = new WeakReference<>(result);
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
BufferedImage imagef5502aa622cac4ffb87e11ad11d134c6=getImagef5502aa622cac4ffb87e11ad11d134c6();
if (imagef5502aa622cac4ffb87e11ad11d134c6 != null) {
    g.drawImage(imagef5502aa622cac4ffb87e11ad11d134c6, 0, 0, null);
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
	private icons8_header_2_50() {
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
       icons8_header_2_50 base = new icons8_header_2_50();
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
       icons8_header_2_50 base = new icons8_header_2_50();
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
        return icons8_header_2_50::new;
    }
}

