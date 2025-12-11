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
public class icons8_html_filetype_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image36b9ed99c1c6edfefb13381cdad068ed;
private static BufferedImage getImage36b9ed99c1c6edfefb13381cdad068ed() {
    BufferedImage result = (image36b9ed99c1c6edfefb13381cdad068ed != null)
        ? image36b9ed99c1c6edfefb13381cdad068ed.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1044);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC10lEQVR4Xu2aW08TURDH+WA+ouLlAY0mXlhaEFHAAkIv4AVIS6FcBKRSLNtSpLTcikHBFgoYCU+EIEYxJojCi34EffBh3Bk5m2YftMRzupCcf/LPnpmd7plfds4+NS9P6hhJCbtOFIccLhFWQo5k0ZC9yrinECmqo6U00vjLnmj/wdvFISdYwy7Qrs3GfbkLQeqmvT/T+yvA2wjSmVJzAyMa5NP3L/B8M00wiur0GPfnplyAoITD5ApEOEwuQYTC5BpEGIwZICjuMGaBoLjCmAmC4gYjGiT5fhW2v+381b5kkGAsQ85aY39ZSzTIYVyk2t8Y+8taIkEOY+wBezH2l7UkCGdLECYJwtkShMkIEn07DdHNKX2DsYN4cX8ZZj6+pLXRWDe/u0Dr+FZC/21yN025sYzc1IdZys19TokFKWizQr5b0Tc4215KcWpvCRoTPlpn+qS7mOoG10YoLvBaYeHrEuX8q2HK4TPY8+6MPqQc1psG4l8dhvqJVijsKqdc5cgDsI97qK5nJajDPducpNy9mQ4ddnFv+eiAsJz1aT3lMkewLdWvg7Sn/JSzHNSh53aS5oDgLKOzBWma7abc5d4qsEWbabzOeEsoxnxi+4U5IEb/C8Qx6YVTrRaoibVQ8/F3M1RzN+6mK340TAGp0jZEn/ZYsgKxjTbB+Y4bNFZ4JrrSg3DOV6aPXHg9Zg4Ii7MdrTLVBRe6b0FkY4Lu4fkoDzdAZzpA8cBa5HiAXB+ohSv9Njob7Bme+T7oe63SGr9qxwLkUm8lKIE6WpcEHXQ/sjEOAe1N4Jp9yRjItSc12lt0QrX2YRACUqiNB842iy8+uk1xJgiODOZiW38OMNX1VEBF5D6tO5cG4Waogd7O8HqcaltfPaZ7ePgxZr7qrxYDYpYlCJME4WwJwiRBOFuCMEkQzpYgTBKEs7mAiPoLx2GMPfwfSNie");
    imageData.append("r6hO35Gw1ouxP6mjrN9WEcm4KhRCxwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image36b9ed99c1c6edfefb13381cdad068ed = new WeakReference<>(result);
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
BufferedImage image36b9ed99c1c6edfefb13381cdad068ed=getImage36b9ed99c1c6edfefb13381cdad068ed();
if (image36b9ed99c1c6edfefb13381cdad068ed != null) {
    g.drawImage(image36b9ed99c1c6edfefb13381cdad068ed, 0, 0, null);
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
	private icons8_html_filetype_50() {
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
       icons8_html_filetype_50 base = new icons8_html_filetype_50();
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
       icons8_html_filetype_50 base = new icons8_html_filetype_50();
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
        return icons8_html_filetype_50::new;
    }
}

