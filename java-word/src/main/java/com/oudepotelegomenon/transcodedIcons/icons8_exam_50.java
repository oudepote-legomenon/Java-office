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
public class icons8_exam_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef57ff1a38f81782943eff65f7c25133d;
private static BufferedImage getImagef57ff1a38f81782943eff65f7c25133d() {
    BufferedImage result = (imagef57ff1a38f81782943eff65f7c25133d != null)
        ? imagef57ff1a38f81782943eff65f7c25133d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1096);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC/0lEQVR4Xu2a3UsiURTA+8P2LSvqKYKi96CXjYigsodKMCrMfViCMM0HH3Zh96Fol5I+IFkWUtLoa6Myy1pKc6P8IHOzPOu50aRnWtFp7p2W9QcHx3POMOfnzHVGsKKizD9Ej9n+Rj862cMlzJNzvSbrW3pMLvSM2gz97x1py8evSbUjKwO9ZjvoTZMD9LiqgyLjH77cAAdQxP7ZCb3vBMjwFgmcnMHidx87M90mm5EeXzVEiCDcZUSJIFxlRIog3GREiyBcZLQQQVSX0UoEUVVGSxFENRneIt9WN8EfPC0Ytk9z7KbZbbJ20PmKhrdIKZGdxUXnKxqeIqWAM+AsdL6i+W9Frg8PWaiNUJHE7i546upY4LaaCBXZbm+HfaORBW6riTCR+OYmuKuq4Ob0FFJnZ2w7trFB2xQjTGTPYIDdvr6n9wMDsNffn9PxMoSIpKNRcNfUQNTrlXLRtTVwV1fD7dVVTqdyhIiEZ2bA29gImfv7p2QmA77mZghNTT3lXoAQke2ODgiOj9M0HFutsNXWRtOK4C6SjsfZwo5vbdESJHZ2YEWng9vLS1oqGe4iv5aWYLW+HjJ3d7TELi9vQwNE5udpJY/IwgIELRaazoO7iH9oCPYHB2lawj88zO4rhfjpcMCPzk6azoO7CC7o89lZmpaIOJ3ga2qi6Tw0F/kdicBKZSUkg0FakkienLCeVDhMSxKai1y4XGzIYuJieVnaL7a+LqvTQLlcuIoc22zs6zXq8xUM7DmemJD2w2+63Lp/ZAQ2WlvzcviYkwtXEXwEORobo2kZ2FPocUXzS2u9pQVC09M0LQPv7tj7N7QVyd4jPLW1cOXx0IoM7MFe3Oc5NBVJx2JsUV4fHdGSDPzFiL24NpTCTQQXIw6XOj+nJRmpUOihN/uqFG4i1wcHD59yIkFLMvBMsLMXCNBS0XATSWYvqZ2uruef");
    imageData.append("sQjYg724j1K4iYimLPJIWURlyiKPlEVURhURXn/hKCVwhheJ6E12nd5kG3kdYdfR+cq8Zv4AAylRpa+X4A4AAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef57ff1a38f81782943eff65f7c25133d = new WeakReference<>(result);
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
BufferedImage imagef57ff1a38f81782943eff65f7c25133d=getImagef57ff1a38f81782943eff65f7c25133d();
if (imagef57ff1a38f81782943eff65f7c25133d != null) {
    g.drawImage(imagef57ff1a38f81782943eff65f7c25133d, 0, 0, null);
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
	private icons8_exam_50() {
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
       icons8_exam_50 base = new icons8_exam_50();
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
       icons8_exam_50 base = new icons8_exam_50();
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
        return icons8_exam_50::new;
    }
}

