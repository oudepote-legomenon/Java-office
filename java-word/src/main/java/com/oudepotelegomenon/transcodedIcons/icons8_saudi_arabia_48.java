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
public class icons8_saudi_arabia_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagebdb15e778f112fcff50bb63987e2e4f9;
private static BufferedImage getImagebdb15e778f112fcff50bb63987e2e4f9() {
    BufferedImage result = (imagebdb15e778f112fcff50bb63987e2e4f9 != null)
        ? imagebdb15e778f112fcff50bb63987e2e4f9.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1752);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAE6klEQVR4Xu3We0xTVwDH8YtQKCCPxjZOxDF5M8AClYJSoDwKlAKtFRoolQItyMO2WCiPtihQKi1QBES0IkZRYwAHTOdrupk9dVv8Y2b6z7L947I/tixZlphtJstvlyVLTOOWmBkey/0mJ705Sc+9n+TcnhIEFRUVFRUV1VpJGUL3lCbu9SpNHPKVc972r9n1kLE/4wlLk/NLUHsBXjcXIdgswubOvB+ZBsHjQD3/vY0tmRe9W3jDHs0peqImuYioig1zXXZFcssK/cw9O+w3mjAGdAkbPuUc+ClTwajPAEubg+cBr3Xlg9mRC4YhC376THjreKA1pWKDaieIfWwQ5fFPCWnMI0Icc5UojnAQe6JqCFksm6jn0Fzv+7LRROQ6glCr6zzhlhYCEoBXBAAJAFEcBUIUQX5GghCT13uin20oi/2GJmff8VImnfOtT7EHNqUdYLVkl25uz+MGdQojlwdTnxPJNGQnMZpz8/1UmTXeSq6DLuPc8iiJ+35DbjjceCFwff6VAUijQQLgKWfDex+5vioFgQ08MHVZ2GIg1zcVI9gowpZOIVjtAjC0fPjX8eCzjwuvskTQiuJAAf43gMSBSrzRXYJgUxH89fz1B0gfqcOFz29g/O4spj+9AslkG6K6JEjoLEOEthBBNeT3KlLgWbIMWYOA8/ev49IXt/Dwydc4/fESVGf7cGBmANLhFrSeGgD34F402LrQcbQPHeP9iG8SIbg2A4HkwywDAmpS4K9OXT1ArEWGibtzOP7BPPquT6N76STCO0qQ0VsN+XAbuk7YcWDIjIPDh2CaGIDcokXDiAkdzgH4V3ExuXgejremIR7WosppWnkAd1AJ6VQ77LdncPOre7j25SewLZ1BxagBvecnENWQjx37RdAOmrG9mg/L1FEoBvTQTPQgTleM5uOHYZt1wnrZCcc751YekHusGe8+vodT");
    imageData.append("5PZxfrgAzaUhpPVX4+AZGwp66zB2cQozc5dgd45hqyINjnOTfwFUjk6ktsuQ16vC7J0r6JmdRP+ic+UBJc5WaOeHMfb+LAwL46ic7sap25dhvjCO7rOjaB49hP22ThhG+qA60oZKi46c60aZVQOptRl7bRq0nbFj6uY8LAurAHjROeCuTgbHVI6NSi7oMjbExjpsr8pEQoMIHI0YFf06lB/Ron7MiMMzY7DOnoBl/iRuPvhobQD+7RyIUOciurEA29R8KB3tCNPkQ2itR8FgI8ZvXFz7gBedA/7qXYg3liKkrXB9Alb1IPsbwGjLXt+AIGMhOhYnYLt2Fj2XT0I12Y3dRjk2K3nrA+C6hViNfCSTv/OSnkYoLXooejRQ9OlQ2tNE/r2QIrpJCGbt7rUL+Kct5CtLQEyjEAq7HjNX5zAydxqCPtX6ATy/hXwUSYjUChGjL16fgDX9DlCA/wwoivmOXrrjlo9ipyOgNr2a0ZCez9QXJAYZ8qO2mkURy4NlFCRsahUUB+iz1Rtb0810He8YCVh0U3MekYDfVweQF26liePjXedfusxMD6KKHUvI3qwkJNF2oiTyKiGOfESOp68C4C4I/9UtO/S+621XJnl8qHtFnMSzIsFIr0oc81WlzAc2pt9larMebzHk/bDNVPTz1q7CZyTgD5Yh9yeGhv+tX33aAx9l8rxXRZLFU8qWEAXhXq7LUlFRUVFRUa1WfwKSuqhEwCzSOwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagebdb15e778f112fcff50bb63987e2e4f9 = new WeakReference<>(result);
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
BufferedImage imagebdb15e778f112fcff50bb63987e2e4f9=getImagebdb15e778f112fcff50bb63987e2e4f9();
if (imagebdb15e778f112fcff50bb63987e2e4f9 != null) {
    g.drawImage(imagebdb15e778f112fcff50bb63987e2e4f9, 0, 0, null);
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
	private icons8_saudi_arabia_48() {
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
       icons8_saudi_arabia_48 base = new icons8_saudi_arabia_48();
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
       icons8_saudi_arabia_48 base = new icons8_saudi_arabia_48();
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
        return icons8_saudi_arabia_48::new;
    }
}

