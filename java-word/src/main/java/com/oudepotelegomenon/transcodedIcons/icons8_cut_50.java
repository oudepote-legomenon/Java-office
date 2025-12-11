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
public class icons8_cut_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagecb91b003034af2b1d953cd8724e01ac3;
private static BufferedImage getImagecb91b003034af2b1d953cd8724e01ac3() {
    BufferedImage result = (imagecb91b003034af2b1d953cd8724e01ac3 != null)
        ? imagecb91b003034af2b1d953cd8724e01ac3.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2408);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAG10lEQVR4Xu1aa0xURxSmSfujP/pImjZ9xuj/Nk380camWdi9u1CtIBAR0WpUwGDUCipPBQoiuLtAk9ZCfRR2xWiF8FBrU61aEPahPMpTW1cFa9SKSmKV5bqy03PuOuvd2bu4oPsw8UtOdnLvuZPzzcw5M3POhoQ8xzMEg1z+XltY2EKjQpGGgu1WjnuX1QtaGEJDPzNxXJtBobCbVSq+a968URRs4zN41wqkZrHfBQ1ISMgLMPJFaOzZxYttt/PzibWsjFjLyx0C7Vt5eWQA3qEOzFghfsP2E3CYFIpvTUql7d+srEfGexDUAd37Bo4rZfsJKGAmYo0cNz68aZPT2DvFxeRSSgrpj4/nUbD9X0mJ8/2NnBwC3423yeXz2P6mCs16/XTNRt1GTbr+QFnWnlPlmXtbPQnoHVVvqPrY+XH7zJkvwehetiQn26mR1zMyCPiEDZ5bYAmVGuXyMmhfwGfXMzOdZM4nJdnh+eBJmexFkT2TRmnqgZe16foKTbruwfaCOmvdrhbSpDNKSuWWegIk7EB6hUsnYKQSR/auWi0Yd7uggIBDP4Bn28QGImHQVeO7EdBB3bvbthGcyTaOU4j7nAy2ZureKM3Y0/Vd7n7ecMxCLP13PMrxhh6i3ljtTgKBo90TF8fTUR5YtMgGxjVLObIQEJTKFnR4qt8zfz5GMy2r6w0cJPT9lUUNfH/HsJvhLAmYiXFJEghw8ibLihXO5WIOD+eBXDyrRwEOnnAaQjHVtyQm4qw0snqPQ/nXVa/DTHQjiYHOm26Gi+X3xl6BhHpDdQrbjxMwwicuJCc7ieDSgaUSzupRwOhHoA7Vx28NSuVJVm8iPHUSCBhN3bklS5yO3hkZaQX/2MzqUYDz53WBDtXvT0jAfUXP6nmCT0ggwLDVZ2bPHqOb3+W1a3FWRk8rFDNYXXyG71CHEumYG2n7LSr+GKsr");
    imageData.append("BZ+RQMB6/wCj1o3sbMGw0dJS0gsODDN1G3xlsSki4tV2jnvNFBb2FTwb6YXAgDqUyJXUVPQR0hC3sprtWwyfkqCAveCnjshI/p5WKxh3Dwx9uEfYgCRufLiT2yzwDN9REhJk9rB9I/xCAtESEfEmLJmrGHpHRecrJIZnLhRK0pP8vWwZAV8hVUn5heK+/UaCAsLqh0BmuDsmhqcbnrdyJS0NZ4w0538PG5bOTg3xOwkKvIOAQcdgKdn7Fiy4j06NRxI8sgytXk3OL18u7OZiEv+sW4fBgfTuqHUa5CCjSwsICTFMcvnnsOYrgdQlMNIKbd4M7eYv5t7vjI52krm8Zo0wE31VB10MO1r7J4Edm1QW1dsCRmIi1MWkzGieE23tjI4hF1euJCaVivTX/Opi2NmuW2RXSRPZsbWRBCUJipqEVdNOfBlrNXBK0q07Ik2iuCm4SVDgzOxOKbFUbKnnBzocBj9zJChoREIyPcZrLiT+ODwgLK19PxwXCAYtCYqHZPrKs2rsO4odPnGuZ4SUZdagsYIcqjG7kkh/FJ6DBpQI3NrsdDmxRA7vPS0mITwDIhvYvgKGiTa75l/OCstsX4VjaYlJUMF9hu3T76DOLkWCFSkSeO8WnwACApfwq3cNv6xIkajSHiZ/dY+ITgABIOPNhugNCbGOT8nAAVIG562dZpVqEE60Y3hEwbSPt0eU4w2PJ+FTMiaZ7H0w7ORUDo19O+sezYSwT+jStOn6q0hit/qgJAmfkIHb4EcwEze7Y2P5kcJCt6P6RCI+xjtIiI/x+qGKonqvgsITk2lTKt+CUb0GF6sHkhervDy/XayeiAyQqO6MiuLpNRZ/LYmJ40ZHxlG46mIbr7/+uOpOiYwz+ZCTIxiFiYXuuDjepFDcwmRc66xZr2ACAkZ7ESYkMDHhj+TDpMmAgWvOzJkzRg3DSASGjcKan87q+jsdNCkyQoJu6VI2QbeJ1aOA63AuLEO/Jei8JvMspEy9IiOV");
    imageData.append("xMbCJ6tHgX6DOlTfX0nsx5LBQs6kygoc1youK2BggFnSsLregJYVftxaP+ZNWQHJeCwreCz0yOVqLO5QPWyjwT4r9Gx+wkKPUHpTqYYwHUpHGY8lWGYzc9xFIFmOgm230ltiIqZVLz2l0tt2ofT2Ta21dmczObTXTI783O4meKXWeJoZGNUYHNnhh3sJChY+hWLowoU8yuCqVa7F0OxsoRgKPhbF9jdVaNbXTAMj12szdPsmXQylwFIzO+KeBA+RMIvoS2q2n4ADHdkklxfgnwHQ4fHPAW5/GMjNFYKB8IcBjsuTCghBA3DmT2Hdn4JoZscw2xUVNYqCbeEZx7UYQ0M/Yb8LWrSHh7+DRVEY/VQU8IcFZpnsbVbvOZ7DHf8DCWEu7pdcm2gAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagecb91b003034af2b1d953cd8724e01ac3 = new WeakReference<>(result);
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
BufferedImage imagecb91b003034af2b1d953cd8724e01ac3=getImagecb91b003034af2b1d953cd8724e01ac3();
if (imagecb91b003034af2b1d953cd8724e01ac3 != null) {
    g.drawImage(imagecb91b003034af2b1d953cd8724e01ac3, 0, 0, null);
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
	private icons8_cut_50() {
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
       icons8_cut_50 base = new icons8_cut_50();
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
       icons8_cut_50 base = new icons8_cut_50();
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
        return icons8_cut_50::new;
    }
}

