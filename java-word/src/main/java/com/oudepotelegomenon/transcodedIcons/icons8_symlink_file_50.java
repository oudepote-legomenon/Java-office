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
public class icons8_symlink_file_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagea00ce45d1c9da5873912099ba6a37066;
private static BufferedImage getImagea00ce45d1c9da5873912099ba6a37066() {
    BufferedImage result = (imagea00ce45d1c9da5873912099ba6a37066 != null)
        ? imagea00ce45d1c9da5873912099ba6a37066.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1068);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC6klEQVR4Xu3a/UtTURzH8f6wfvRnMwJ7wDAsEDQignRb+ZCWm3cTs8Bsc0WQhgWRT3eJhs7U0lpprQwqs9W0zM2H8nHTT/d7x0LPhrh577l3sTecX7aj97y8O+fuB/ftS5dCFduc+w3WxmJVhq1RNAr2QvaaqlRsdZSX1t0JNTS3Lys9JAyMNicMQmMZe13FI0h9U9sKVIggzvsuGGs4YNSGfPZNoXvAI9+ZIsFRyV5fsXhAKNUxvCCUqhieEEo1DG8IpQpGCwilOEYrCKUoRksIpRhGbUj/izf4OOnfcThaRPmhWSTYz7Lr23VqQxIZ0lr62PXtOjUhiURroLWw69t1aYjCpSHR0hCF4w4Jb2ziZpsXJscwjPbnOw6aMzG1wP6KuHGHUMHFVeTXuJFpEpF/3YPC+rG4I9PUibcTs+yPx00TCBXF5ApPYe4IwOqajxkpAaF8P3/jwAXprlzzxCBSBrK2Hsb5hiHkVPXB3D4bg0gZSHXzKxyu6MHlRzMxgJSBuEf9OFjiQtkDf8zi6e5E94yuIcurIRyt7MbphrEYhKU9gOMW6QCojhwAuoa0Dk7giPSRsnQEtyGqO4M4YR1AQW1/5DSTMLqGFNb1o6B+lLkbczhVO4w8oReBhZUtzxmdQhaX1uTjtqTFtw1yxu5F9qUufP/1599cwhTUuvUJ+eSPbOCtHyva8LTxn737wU6XMVOzS+zLceMKGf8alCGCGIEI4jxyzG7YWkbZqQnHFTIztyxDKh5OyxBT0xccKn0s/+X3GlcIlWt+gnO3PsiQPNsgbrR62SlJxR1y2zWOY1d6pX0SQNZFEe8ng+yUpOIOoeM1u7wLJ6+OSCdYJ0LhDXZKUnGHUD2eb/JeySoR2beSThMIJdx7LT9T6CuLEmkGCYc3UXX3JYa80+xbSaUZhCJM14gP66G97xNNIdFW1sLsSwmnC4gS");
    imageData.append("pSHR/iuIWv/CkcigNewJYhCcGQbBYdHHcGaw60un5/4CDlE9/Es0ghwAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagea00ce45d1c9da5873912099ba6a37066 = new WeakReference<>(result);
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
BufferedImage imagea00ce45d1c9da5873912099ba6a37066=getImagea00ce45d1c9da5873912099ba6a37066();
if (imagea00ce45d1c9da5873912099ba6a37066 != null) {
    g.drawImage(imagea00ce45d1c9da5873912099ba6a37066, 0, 0, null);
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
	private icons8_symlink_file_50() {
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
       icons8_symlink_file_50 base = new icons8_symlink_file_50();
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
       icons8_symlink_file_50 base = new icons8_symlink_file_50();
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
        return icons8_symlink_file_50::new;
    }
}

