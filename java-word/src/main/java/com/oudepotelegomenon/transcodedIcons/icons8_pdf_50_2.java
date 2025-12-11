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
public class icons8_pdf_50_2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image686e3c91abfbc345328053bb8637036d;
private static BufferedImage getImage686e3c91abfbc345328053bb8637036d() {
    BufferedImage result = (image686e3c91abfbc345328053bb8637036d != null)
        ? image686e3c91abfbc345328053bb8637036d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1076);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC8ElEQVR4Xu2azUsbQRTA/cN62o2fGBFBEAQVL4oxWlConlqMSvDrJl5EL3rwIiriTQwoySa2UZIYNR9SEptUGlOrxCRtktd9YyN0aNNdsrNjYX/wIJs32X2/nZmdSUhNjcF/hMtkeuUShDcsQhLFPY8gWOhrMsEliu88ZvOPwPDwo9YhnxvkGwVOQXhLX1dzUMRvtWaBASgSHBwEqbaWvQxrkW+7uxCfny/3jI2+vmboIQKXl+xl9BJhLqOnCFMZvUWYyfAQYSLDS0RzGZ4imsqwFkksLsLd9nbFOBsYeFo0TabXdH2KYS2iMhx0fYphKaIGrAFroetTjCHyi7TTCSmHA0rFIp1SBVeR28NDcDc1gaelBW729ui0KriKRBcWIDQ5CZGZGRLVwF0kPDUFYbsdorOzdFoVXEWSm5tw2tsLfnkduF5bo9Oq4CpyHwiQhUyqr4c7r5dOq4KrSDGfh+PWViJTyGTotCq4iiAhmw1Ourvpt1XDV6RUgg8dHWTTl43H6awquIrc+3xkWPn6+yE0MUGnVcFVJDo3B8HRUXi4uCC98hAM0k0Uw03kezoN7sZGuD06Isc4V/wWC5QKBaqlMriJxFZX4aSri8wTJJ9KwXFbG8SWl6mWyuAiUsxmSdGfd3bIMT56cVjhNgWHWHh6mswZEnJPfVxagq+S9Cz9J7iIxFZWyCTHLQpOdHwtnwfet7dDwGolMri+ROWvsRjnY2Nkc1lpG6OrCK7kWJi7oQE8zc1wPj4O1+vr5OmFvVTmy/4+eMxmCAwNQergAB5jMbKFwV78G7qIYCFnIyNPd16+21hgMZejm/1GLpkk0iiEvYXyiY0NutkzzEVw7GMxePdxrGNBmUiEblYRfBD8S5y5iK+vj6wX+C0QN4c3+PMOA5iLnPb0gLezE6S6OvhUYWhUC3ORXCIBya0tyFxd0SlNYS6iF4ZI");
    imageData.append("GUNEYwyRMoaIxhgiZfDDrP7CoSawhqpEnKJoksP+QsJE12fwkvkJPqr2KYe4ZOoAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image686e3c91abfbc345328053bb8637036d = new WeakReference<>(result);
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
BufferedImage image686e3c91abfbc345328053bb8637036d=getImage686e3c91abfbc345328053bb8637036d();
if (image686e3c91abfbc345328053bb8637036d != null) {
    g.drawImage(image686e3c91abfbc345328053bb8637036d, 0, 0, null);
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
	private icons8_pdf_50_2() {
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
       icons8_pdf_50_2 base = new icons8_pdf_50_2();
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
       icons8_pdf_50_2 base = new icons8_pdf_50_2();
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
        return icons8_pdf_50_2::new;
    }
}

