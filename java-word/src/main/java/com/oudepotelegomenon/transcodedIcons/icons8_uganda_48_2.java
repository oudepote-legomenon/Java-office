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
public class icons8_uganda_48_2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image5e15e3f40a04067724e6120ca8bc391b;
private static BufferedImage getImage5e15e3f40a04067724e6120ca8bc391b() {
    BufferedImage result = (image5e15e3f40a04067724e6120ca8bc391b != null)
        ? image5e15e3f40a04067724e6120ca8bc391b.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2712);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAHuUlEQVR4Xu2Xe1ST5x3HyQUEJIRAEkxIIAmQKxByJaCUhptK5SLO2yjCoIha63Ao3jiiiCKooIxKcYA4D+NYtTql1q4VFOncvDC3HUpF0GLtGKe1zrZrEYTvHth2zkTUUhD2R77nPOdJ3vc9z/N83uT9PL/XysoSSyyxxBJLLPn/ib09g5nMdGKXc3nCeqGHZ5uXTNGt9FH/U6MzIMAUiODgl2A0Gu+p1eo2uVzeKBZL3hYIhPs4HNcNTKZzPIPBkA0fdEJCpdJabe0ceh2d2GBz+eALRRB5SiFV+EDl64//BTCZTNBqtVCpVPDy8oa7uwdcp/HBcmbDfioDdGub76ysKG2kfUiGLiftddIMpNk8PuvoQ6fb6SkUSunw41Y0Gh129gyMEwDI4v/TrP7dU6iDrY9Gt/mUzHOByXKucXbm7OFy3TKEQtFCDw8Pk1QqlZMxFYO9WCw2CIXi6Gl84TI2h1fGcuZedGCyviQ3GeRmD447KQDk3BRyjSOcWGxwXfkQkHkknt6QyRXw81NDp9NDo9FCqfKBt1QOD7EXeG7ucOHwyNpc8FwArisbOg0f86LFyHxdhqJtfv215dq+c8dNvZfPBve2XjT3Xn1/eu/pw/qBimJf5GbJsDJFhKhwN3h5TiKA3NMa0RGOj36RzkX+RjeU75LgaIUC546pcfV9LW7+IQBftMxAT6cZjz6bjr5OA3pv++HhLTm+b5egq1mIjxtc8UGNU19Rtu3DlAXUAbOJCi+RFZyZVFCo4wNgZ+8ANmsEgCizNZLmOyJz2dgAPnrHCacq7VC9m46ibBo2r6IiP4tGPtP7czPpvatfsxtIXsjEwlguYma6ISxEBKPeG0rlkwBajRxBJm/MCvPA/GgeEhew+1MXOfbHRtAnHqBkKx1Vu6xxtMweZw+zyHWuuP47AW42SfC3Zjn+0eqD+6263vufmHq/");
    imageData.append("+tjQ9+CGeuDWJRX++K4Mpw+JUbGbj7x1HKxY4ojnAmxf7YbSVRIcXi7DqRW+aFiuRfOqALSvm47uzSG4lxeEr0r0uF/liwfHZfjmQ7KIxrEBPPjEBz23tXj4aQAe3jbg6zY1RgUw09cai2SOSOexsY5YaCf5b75FLFRLLHSGWKiJWOgvxEK3iIU6iYVuEwt1EAu1EwvdIBa6TCxUL2bjlM4Rh8OmoCyOioIEGrJTxh8gxjwCwMvEQvOIhdKcfjzAB0SjR4mFaubGo6pwF7JTZ2NjUjyyNX7IFdCwV0/DoXm2OJnphIY9XFyrJQAXngNQJ8Nv94qwfwUf2eFsJAkcEEEb4SEeL4D3EhJR9+4ZVFZWQSESY2VyEgoKClEYG4edxEKlxELVxELHiIXOEAs1knmaNd5oi1Tizlx/3H3VgLtLdGh/xReXAuU4LfNCFbFQAbFQJrHQq0Sj4SNp9AkALxFKTTIcjPBFbYwGby8yoj4xCFfSQnA9ORCt88kkET7o0D0O0Hjk6BBAXt526I0G5OTkDAGUvrkfxWr/EQGuEI22EI12EAt1EAt1EAu1Egs1EY2eEv9QgKl0zBYwMEPChsx9dDuxVOKBUBUfS/UcNDbUDwEsXZoOqVyGtPQ07MjPHwI4sCn7xQGMVylRUXlwCKC6+hCmT5+BmWFmZCmU2Je7DZXlZSjytEW1wBHHuaMEEPPwhtQFoUIHcOxfIIA5NHwIYPPmHGRkrCbn3LHebEZh3Fxs35H/2E7sJ+EjXi9CZrg3SuOUqFnsj9pEA36ToEP5T3yRPUuBxCBvqDx/QCkxEoBULkVQkC/mRGmwJMGI9JQgrFoegoSFgYgI08LH50mAwVooJSUVVVUHUVy8F6mpqchbthwlOwvwsjl0zKXEUwHodDrcyTMQGsxBehIfu3KevxN/3+E38Pk1+aPms5L+I2UCbPo5F/FRTCilUxBo0iGO3PWUlBRkZq7BDPLLjUct9FSAyGDr/vEuJbZk");
    imageData.append("0AYS51LIzklFsJEGhTcNXPaPBxAKXaBWMRCopX87fP0TWgud+BVroPZNLn69zw1vFUhQnCvFtvVK5KzxR+56A7Zm6ch3X+RtUGL7BimKt4n6Snfw+55ZSjwL4MoZLdrqA9B9eQa+ayEAnWMDGGsp8VSAJbGOWBXFQU44H7uDxTigl+GIeoSdOMiEO+QhvhPtg7s/leLzNDHaVgtwbYsrzhcxcbJsEgBCWWQnnjr2UmKwFjpgY4M9zhRs8aRijYb0M6koSqWjYusYAdYSwcxhYLbXCABPlBJjASCvlIXkNXITaSvJK+Va0m8mBhqshfazpqBGzURdJNm1l7jhT1litBfL0F2rImW5Bt+cM5Kmx5fH/NBSokLDOrKG+R4o0vOw1vUZO/FEAbywUuK/AOsErEf7NewvjkVyr5xf4Hrg98m8jX9+jbf45lLBrM4MYWT3GlHk39d6LO5aKcjrSuMfupswrf6zWO5fW8wuXU1KVs9xp0kC2K2jnX8n2mbO8OOjTdsbVlMuLbKJeW82peSIifLRL6WUrsJp1J48W+rAeAD8jDEVGW60r4fPOyFpmmcV3BhjndsYaVd3MZxx7ZLZpfPqS7x7103uPa067/5bRtXALaOOQGhxw6Dov2yU9DUEun9bF8K9cyKcdeHEK3ZbT8ZYMYaPa4klllhiiSWWTFb+BYu8lfncAhJ4AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image5e15e3f40a04067724e6120ca8bc391b = new WeakReference<>(result);
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
BufferedImage image5e15e3f40a04067724e6120ca8bc391b=getImage5e15e3f40a04067724e6120ca8bc391b();
if (image5e15e3f40a04067724e6120ca8bc391b != null) {
    g.drawImage(image5e15e3f40a04067724e6120ca8bc391b, 0, 0, null);
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
	private icons8_uganda_48_2() {
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
       icons8_uganda_48_2 base = new icons8_uganda_48_2();
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
       icons8_uganda_48_2 base = new icons8_uganda_48_2();
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
        return icons8_uganda_48_2::new;
    }
}

