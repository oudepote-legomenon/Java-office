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
public class icons8_numbered_list_50_5 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image261edec5881987e39dc0f68a9b355b49;
private static BufferedImage getImage261edec5881987e39dc0f68a9b355b49() {
    BufferedImage result = (image261edec5881987e39dc0f68a9b355b49 != null)
        ? image261edec5881987e39dc0f68a9b355b49.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(828);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACNUlEQVR4Xu2YzUtVQRjGHyIzbRG5iUTaSKuWRgq1qEhtW9BObZW06H8QgnYucllguolAEElFBEVXbRXaJCJcWgnRl2BQ9Pk8vHO6c+65IJxzj9zJ+cEP7p0Z3jkvc86cOS8QiUQipIU+oh/pJzqV7g6DC3SD/vGcSY0IhIewi39F37vfQSYyREfc7woCTsTnSCTSRhfpT6Sfp0aq2AuwuQpRgQWsl8gtZCcuS81ViAosUL1EumBbc+2kjVZzaK5CVGDB6iUiztHb9G5JKrbmKMxBiQTDaXqGnqrtiEQi/wdX6Sr9ANvH1+g1f0AIXKbfYdvuZ/rV/VbbJW9c0zMFu/B1egK2/e66tnFvXNPTQ2/Sbvf/OH0HS+RxMshxj76EvTDLULGTT4pCHKPTsCT26Hmvr9e1H4a63XOjJJ7BAn1D9gSq4LUTlmXuRFR8eAELsk8H0t3/0LKXfWsNIycn6TwsCVVR+tLd4fAE1SXVlqv3SOKyN67pmUb2Hk18XR0WiRxp2mEVR71HntIHri0oOugOsg/6lusLhjHYhb+FHUN07krKPlqZYLhBR2FJJGzCErnvtYlOegfZMk6jVGzNUQidfvV8rMOSWEK6dBlMge4KqsG+wN74Kg8lHGbJdBAF0HeIPqou0m1YwOdev1ZHZ7Kyi9iaI1cRe4KuIP1gz8ICv/Hamp4x2EXrwKhj9Bz97dp0ewWDbqlJ+gvVJf4B+5Zv9cYFg7a9fnqdnq3pi0QikUgu/gJxZXbPJWXJGQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image261edec5881987e39dc0f68a9b355b49 = new WeakReference<>(result);
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
BufferedImage image261edec5881987e39dc0f68a9b355b49=getImage261edec5881987e39dc0f68a9b355b49();
if (image261edec5881987e39dc0f68a9b355b49 != null) {
    g.drawImage(image261edec5881987e39dc0f68a9b355b49, 0, 0, null);
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
	private icons8_numbered_list_50_5() {
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
       icons8_numbered_list_50_5 base = new icons8_numbered_list_50_5();
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
       icons8_numbered_list_50_5 base = new icons8_numbered_list_50_5();
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
        return icons8_numbered_list_50_5::new;
    }
}

