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
public class icons8_picture_80 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imaged33826d8306e4c1da9f86d00ec78881f;
private static BufferedImage getImaged33826d8306e4c1da9f86d00ec78881f() {
    BufferedImage result = (imaged33826d8306e4c1da9f86d00ec78881f != null)
        ? imaged33826d8306e4c1da9f86d00ec78881f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1316);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAFAAAABQCAYAAACOEfKtAAADpElEQVR4Xu2W/UtTURiA/fuyDyFKRFMS8pdICzMyTVITlhkRUr/4SaZJal/LNHWwpaHLprKWGsIW2tSyNr/WF9Xbzr0t9Jzt7N3ONvP6PvAwtnvv2TnPDvcuLY0gCIIgCILY05y/2ggkXr6fFpDAQQEVoYCKUEBFKKAiFFARCqgIBVSEAiqiFLDXbWwxUECJGCigRAwUUCIGCigRAwWUiIECSsRAASVioIASMVBAiRgooEQMFFAihtQH9AA8XwKYXAV4swnwNqC/Tvr1z9lx4ZpoJmNM9/a1RiKpAfvfAdgWAUaW9FfLAsDr9eACv0SWHR+cF8eKJDsXMyb77q1zYXPjx+LFkJSATz0A9k8AswFxMRing7tnABGRncPO5a/HyOZmX9Hnyo8bEoNyQMt7gAkfgHNdf9Xe+8UJx+pUcIy+4C4ZWdbHY+MzHX79M3ZsalW8LlbZ2OHWkJKAVq84oUQ6I9nBsmOJkK0Ng1LAaPee3SxbGwalgMneBTspWxsGpYAOn/jFRvGVj19teJQC8l8aixMr36DBMgeF9Ta4a18Qjv8PYkh5wOH5dbj+yAXHTQNw7HL/PyvbHTD+4atw/k6KIWUBh+Z8UNXhgNwt0XhP1A5pu3E2zPXRnA38hr7pZahuG4Hsi53QMODSPuPPi0UMSQ3IFmB2fYTSpjEhlsyyVjuMegPCeOG0enxw47EDcio6Yd+pxm2evGYGq9snXIMVQ1ICutZ+ajup6OawEAdr/pVBaLG5g09DcReNLwe0HVZgeihE491f1AymzlFw+n8I40QTQ0IDTn7+rj0YCuosQpB4Zbv3xcKm9qPcG3NDya0BLQofKppZZR1wZ3hOmLNMDAkJOLYYgPreGcg3DQoBEmFuTT9klncLUeKR/QCj3g0hVjgxKAW0edag9r4T8mqeCYtOhlmXzHDwzG0hSqxmFLdq983pjV9C");
    imageData.append("tJQG5BeYGvvgSGkXpBc2CWFiNa+qC8xOrxDO4AF1E7Ub0wsboaLFCo4V8T8ohl0bMOTRsu5ghNgfKryHz7UJ/x0x7PqAzOzKJ3CouE2IEo9b/ztiMERAzerQblS/Nx443Qx1PS/55YbFOAH/ml3VCxln24Uo8YjBcAFDZpY/UL43YjBsQGYO240l8e9GDEoBL/SsGloMFFAiBgooEQMFlIiBAkrEQAElYqCAEjFQQIkYlAISFFAZCqgIBVSEAipCARWhgIpQQEUooCIRA5J4+X4EQRAEQRDE3uIPCfNY+k7U4RkAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imaged33826d8306e4c1da9f86d00ec78881f = new WeakReference<>(result);
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
BufferedImage imaged33826d8306e4c1da9f86d00ec78881f=getImaged33826d8306e4c1da9f86d00ec78881f();
if (imaged33826d8306e4c1da9f86d00ec78881f != null) {
    g.drawImage(imaged33826d8306e4c1da9f86d00ec78881f, 0, 0, null);
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
		return 80.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 80.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_picture_80() {
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
       icons8_picture_80 base = new icons8_picture_80();
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
       icons8_picture_80 base = new icons8_picture_80();
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
        return icons8_picture_80::new;
    }
}

