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
public class icons8_uppercase_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image5d22389bc8430d1474e56572c7c38c08;
private static BufferedImage getImage5d22389bc8430d1474e56572c7c38c08() {
    BufferedImage result = (image5d22389bc8430d1474e56572c7c38c08 != null)
        ? image5d22389bc8430d1474e56572c7c38c08.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1044);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC10lEQVR4Xu2ZXWvTUBjHhxeK4KcQL7wXwRtBRP0C4iewSTphF4VpkqYzguhcX3LSboJl61q26nCyuhdfikJhOplT8EK88t673W5d6bZ4nqztmtMsnJN1d88PHkrOec6/+bVpAycDAwiCIAjSBwY167ykWTdOoiA/omUvseP9KMj1iEg6eSTrxDmJgnzZsNfY8b4Uze0ReTBWqC+u/nH6VdNvv7pvBvmDidx6qrDc03OcgjzIPVJkxC43tWRxmy01Wao/n/vcCdJTpV22x61UqZ6fr/mKzFV/OnS+0bPmYF1jdmXdzYbXoD7ICRSZeff94CvTiCXp1rPuUuLkX/enCn10/BXbR8d/JEi56Sdiz3x0FMPeZNe01rnykN1ey/a450HXQ06gSHp6xYka2b+eyRbs5QFvpKjkGtsnqfZtmtGcXFjtEYFPM6KTcXYN4CfC9gBSnEyoqWIjUGR4dGpH0sgTz2QLXpF75sQ5Otccm1z0iIzmK46i23u0brJrAF4RWbNuyTTnaX7BX8S9pGhF4pkrnskWvCJA1MjV2nlw3PWvtT00lD3D9gO8IndM87Siky03j/3X6r6PmKZ5yjPZQkTkrpa50M6D48P7iH2Z7W3DKwJAju99hAcRkTCIiBwLFOEERURBEU5QRBQU4QRFREERTlBEFBThBEVEQRFOUESUaCK7wYpEVOs62xcG2CfwEzlq/0AYWU9flDVrBPa6INgqve+IRI3cnqKTumzYb2AvKxbLnGXXBwEnGdGtqzR3XDHIphwn+6Wlb252cXnNgWN3nM5DX2gpSbOG4eRjj/M7afpNlD9sdCSgKrXfzovXNeeh/XI3Gs82ae8WmxGEottVWbf21WSxkZutOvOffnny4RjGYR76oJ/N4AL2uu5zbmxPVb4IX9Pwm0sWlnqy/Ar6oJ/N4CLMowY2IwjhRw3sZhwvYR7+sBlB");
    imageData.append("iD78CbUZhyAIgiAc/AfxC8K7ywbRhgAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image5d22389bc8430d1474e56572c7c38c08 = new WeakReference<>(result);
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
BufferedImage image5d22389bc8430d1474e56572c7c38c08=getImage5d22389bc8430d1474e56572c7c38c08();
if (image5d22389bc8430d1474e56572c7c38c08 != null) {
    g.drawImage(image5d22389bc8430d1474e56572c7c38c08, 0, 0, null);
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
	private icons8_uppercase_50() {
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
       icons8_uppercase_50 base = new icons8_uppercase_50();
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
       icons8_uppercase_50 base = new icons8_uppercase_50();
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
        return icons8_uppercase_50::new;
    }
}

