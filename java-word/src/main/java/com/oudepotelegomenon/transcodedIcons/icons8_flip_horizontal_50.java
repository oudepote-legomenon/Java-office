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
public class icons8_flip_horizontal_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagecb84e907f8fccf1e9cde1dba49bbf0f7;
private static BufferedImage getImagecb84e907f8fccf1e9cde1dba49bbf0f7() {
    BufferedImage result = (imagecb84e907f8fccf1e9cde1dba49bbf0f7 != null)
        ? imagecb84e907f8fccf1e9cde1dba49bbf0f7.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1600);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEd0lEQVR4Xu2a709TVxjHcS/0hdE3xvjSxBe+MnHxtf+CL5cssxTQZVviCHG0vfe2sBazstCflnVj0nNuoV1bww9ZsSLlx2STzYyNRCczLrpOsixjkjkcEG7vvb1n5xQu6r3MFXpbbhc+yfMGknueT849z/eepFVVO+ygCdXd9IGaTtOryr9XDK+HmENGYGmpgdRSdcjsUP5f91R30kdrAcXWAItwLubg3o42CRUlYoDU8VqWiuNdyDUkLvChb2Mo/WgMvdfrXKkIkWpIncQCaWPIIp3vcQrsd5fRyKPx9dK3CKraZQhRp+rC1BTeAYkacAmJOwMvCOhaxG63v0IE8A7crQGUaE/5xb4fB1XN61akPlC/xwhNxlpIz9axlPDBcFD6/P41VdMblS5EzgDzPiMwN+AROn82zGTd45ek1INhVbMvq20VqYPMQbI4foUW3+yy8Z4vLqFrP6dVTRZS2yLyBmg8bIDmdiO0cO9Em7PtX7HoemZU1dxmqqwiBtB4DB/eGA4x8d14C/fprQhK/zKmamorVRaR06z5BD7ACTJCz/c6syQDSIgpmymmSiqyGmJMmgjQA2187E6/qgGtSnORZxlA3yYCTYNesXcmqVpY69JM5LUe++58BrBUBo9R0X7VL/Xfu6pasFRVtIgh0rh3LQPmsITgTAdR8qch1UKlri2LnI7W78cCFBZYONtt5UgGpB5uLsS0rE2LkIuMAZhacAYsvxVp5kgGDGVGVA8udxUsUgfpI/jwBrEAfy7uyGfAcEbbEVpM/adIPgMAfYVMIFzI1NeKfBMA+XVW+Ath4xvi6oecxYQvMqN4lE6cYa2T+i7mJpmaSo8ddIe5DeyjXcBEu0OjNh878f7Frkk9V7M/fJNywX9/taxt7AkscoV2AwkX8of70dCXU+i6zqq1Iy5Q7pBD2b8K2gePWL1skPFA3g16uOmZ");
    imageData.append("ByiXyyG98ElscKUgERnmYugQ7QEtWGrZ2RHjJqdnEC+IyueWnU2LyNgD0f34VaOsXrjgaI9wo19PoxUuq3x+2diyiEyjO7KX8oAGm5eda/KHhcHxW+jp4rJynZJTtIiM3d6zm0yNJl84Y/VA8XLqhjT/5KlyvZKhmYgMuVjhB57C4/A2mXTR5Jg4N/9Eua7maC7yPJQHnsSvW5oIsX3D/OxvfyjX14ySisisZVGCCAWjyey9h7NIUnZSJGURkWHc4Bg+PzEsJHph72oWSdoolVVExuYGh2k3bMfhyn3YEc+SLBKKzKJtEZFhnPAgWRyH6+KFj6I8ySIuyyt7LIhtFZEhH6j5LPKx845Ad3Zk8ntpeYVT9vpSdCEiUx8I7FnNInbW5gsLybFvpIW/l5Q9b4iuRGTkLMLhepfxADGRuiE+/vMvZe8voEuRdRDaRYRs3vDUWhYJv/7+WOmQR98iz7Eerq6Q9PFnSYFkUUWKyFBeeBxPuTjeoZy/q5//4X4mH64VJyJDezqP4vPD4ruR4MEXvYJviHrl2UUPLlW0iAzd2n3A6uqs3B/V/O/5B16HG/rucSG1AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagecb84e907f8fccf1e9cde1dba49bbf0f7 = new WeakReference<>(result);
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
BufferedImage imagecb84e907f8fccf1e9cde1dba49bbf0f7=getImagecb84e907f8fccf1e9cde1dba49bbf0f7();
if (imagecb84e907f8fccf1e9cde1dba49bbf0f7 != null) {
    g.drawImage(imagecb84e907f8fccf1e9cde1dba49bbf0f7, 0, 0, null);
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
	private icons8_flip_horizontal_50() {
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
       icons8_flip_horizontal_50 base = new icons8_flip_horizontal_50();
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
       icons8_flip_horizontal_50 base = new icons8_flip_horizontal_50();
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
        return icons8_flip_horizontal_50::new;
    }
}

