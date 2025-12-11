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
public class icons8_subscript_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef017182e57a50b826a863716752be2ed;
private static BufferedImage getImagef017182e57a50b826a863716752be2ed() {
    BufferedImage result = (imagef017182e57a50b826a863716752be2ed != null)
        ? imagef017182e57a50b826a863716752be2ed.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1180);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADPUlEQVR4Xu2ZS2gTURRAix8Uly50oQvBhSiCKC7UhYggiCs3RVcqJPMptCpYMp8Ep5Yu0tp5k2mLJbS1VltrtdpqRautxZB+oAut4mchulTqVjCYfsb7hEK8SZrJzGs7yhy4EDL3Xe6Z93IzJCUlPj4+Pv8kgmqcKYs0JMsi5uhKhBCOjeCeHMEpRlXFlWsz0ZY+a7lDa+i2eMWwcE+OoCKh2rZUf+KddePhmNX6IGEr7g1PWXRNZnQ8msjKyxc9Q6+s631J9iK9L6YsQTHnaGE7QZvAIlJdexrn5Qu6I0si0twzDCJGqqLCXIdzMPlEaB1aD+djONlQLtbEU0siUtXYPSuoZh++ngu3IqIS201rNHY+Yytyvrp5BiZIOqga5/D1XLgVoYhh82so2sZOZGH8whh8KV66uglfzwULESFMKpmOXyewEPEEvojX8EW8hi/iNXwRr+GLeA1fxGv4IgXQNG1NIGTs5MLmIUHS9wSU2GacwxSWItD8Kl42TvEyGYS1P2ntzOBk8p6TY+U0D691DUsRXiFJ3HzuIAN0x/B6VzAVkcn37KbzBVHxelewFyHzsO4pvOZ5yTgclMhROG61EL8yRSBnurT07mpcwzGMRcaCqn4Av08BEQnvihgxduA8x7AUOatp6/F7C/Aq2Y9FQO4gznMMS5HFEGT9BBYRJGMbznPMcojQcQuj9/nfu0G+4DxXLIcIDIAavBucQi7gPFcspQjPx9dCjXiWhGyM0ms43zF82NxeQCTOa/ENeJ0dgiFzK9z1cSwBu/MhoOkbcX7RQLGTgmp0Cao5TQuXX25K3xqYyBKpbrozyyuxOUGJzYhhcxJyq+0+L9ERDDfhWw6JpN2fcgsCTY1XRtvmGjsHra4nk1kCmdE78sZqvZ+walv6/zQCU+YIrofhZf04jNUUEpiHD3sd0+NUFmmYUOtvWqT9cVFh");
    imageData.append("RwS+K/ZBwz8yJejOwK4ew7mugbtF8J+YdkJUzQR9HMf1FqB3G2p/RMfprd3j6Bk4RT+NjlNaUPUtOM/zwIS6jURm4Vh9XixEqX4vrrPiwDf1a3SsCgfLZy1WQGOfshotFF4UgWnVAc0NFROCYu7Cdf4LfgPyCqiBkN+UBQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef017182e57a50b826a863716752be2ed = new WeakReference<>(result);
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
BufferedImage imagef017182e57a50b826a863716752be2ed=getImagef017182e57a50b826a863716752be2ed();
if (imagef017182e57a50b826a863716752be2ed != null) {
    g.drawImage(imagef017182e57a50b826a863716752be2ed, 0, 0, null);
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
	private icons8_subscript_50() {
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
       icons8_subscript_50 base = new icons8_subscript_50();
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
       icons8_subscript_50 base = new icons8_subscript_50();
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
        return icons8_subscript_50::new;
    }
}

