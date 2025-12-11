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
public class icons8_pdf_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image108ea670360ed2b5ab3180a2d3385b60;
private static BufferedImage getImage108ea670360ed2b5ab3180a2d3385b60() {
    BufferedImage result = (image108ea670360ed2b5ab3180a2d3385b60 != null)
        ? image108ea670360ed2b5ab3180a2d3385b60.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(952);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACk0lEQVR4Xu2azUsbQRTA/cN62l0VRO969aY1WEQJCNJIL14UD36AB0+eRBRBc5SeTBpIqNWkDWhiaoxGpE1CTNIm2dd9T2ZJpotN6MxmhfnBI/uYzO77ZedjF9LXp3hFhAzjTUjT/DIirOvBiKa95a8phZCuByIjI/WL6emK6LDODdYPBaea9p6/rnBQ5Nznq4IEUCQxNQXh/n75MrJFikdHcLO8zO7MB/76wnBDBJJJ+TJuiUiXcVNEqozbItJkeiEiRaZXIsJleikiVEa2SG59HQqHhy9GfHLyedM0jHd8fR0jW6TL+MjX1zEyRboBa8Ba+Po6RokIRokwlIhgpIvU8nkoxeNQjMWgkk6D2WjYbY1yGZ5SKShYbfjZrNVaegJUs1koRKNtgX2ckC5ivQa3rfXR0VESQ75vb7e1RYaH4e7gwO6b2dri9wm7L49rIum1NUj4/XQcGxsDME1b5Nx6nb3e2KDdGR83foRC1JeJfB4fh6uVFYpaLsdd4RnXRJ4uL6FZrUJ4cJDy2v29LXJlPS8h15ublMdnZihnIqnV1dZTOuKqCN6FT0NDlP96ePhLpHh2Rjl+x2w2vSmCkz27s+M4tJhI9faWcox6qeQ4tPgFgeGaCAscWj/DYWp7SeR3oeA42Xu+an2dn6c7Uslk7DZeBFckkh0YoGWaiSQXF6FsvXtg4JBzwjURmiMcvEhud5fyLxMTlHtyjvxLBJdVnDuY5/b2qP3VieBQwv0DjxOzs2DW69TuKZFvCwuQmJtz3MgeT06o8AufD5KBAOSDwbZHmPzxMfW9299v6eWMdBG3UCIMJSIYJcJQIoJRIgwlIhglwlAighEiIusvHN0E1vBfIqe6blix5JEw+PoUXuYPea+mLjG+k8sAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image108ea670360ed2b5ab3180a2d3385b60 = new WeakReference<>(result);
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
BufferedImage image108ea670360ed2b5ab3180a2d3385b60=getImage108ea670360ed2b5ab3180a2d3385b60();
if (image108ea670360ed2b5ab3180a2d3385b60 != null) {
    g.drawImage(image108ea670360ed2b5ab3180a2d3385b60, 0, 0, null);
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
	private icons8_pdf_50() {
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
       icons8_pdf_50 base = new icons8_pdf_50();
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
       icons8_pdf_50 base = new icons8_pdf_50();
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
        return icons8_pdf_50::new;
    }
}

