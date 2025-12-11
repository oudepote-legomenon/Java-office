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
public class icons8_fill_color_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image5f1a736ac578dd8b6aca089f40a426aa;
private static BufferedImage getImage5f1a736ac578dd8b6aca089f40a426aa() {
    BufferedImage result = (image5f1a736ac578dd8b6aca089f40a426aa != null)
        ? image5f1a736ac578dd8b6aca089f40a426aa.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1560);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAEWUlEQVR4Xu1Ya2xLYRhGBBE/XMIYbV0ihB8i+OcHPwQ/6RaXEJyzLITWTCZ66jIJMyGYzWWZS4JFMBHMZrasgmG1nVZ1O2c9Z5rFbbURFpcQ8Xm/TpNz3nZr13ZdI32SJ1nP5f2e53zv+73ft379EkgggQT+O9gEKZsXpFx8Pe5BCOnPC/JRmygTyrg0scRgGLzMuHOe3sht1BtNRSkG070Uo+l5ioFrzi8uqfCJjzsT+q3mBSD2mt7AfU8xckRJMPO7oLjkIRYfFyZWGk1J8KVLVYINJhHMnE41mDNXb9+7vPyRtRyLxuwTE6nb9o4EoS6vcAPXAUb2L8/YOdl33+VyDYacv4nFdsWYm4B0Ofvvi9tWbs5KVt6rq3s71CZK97HIYIypCRDeRg2kbt01TXnd6XQO40W5GosLlTzvPPZZu2mEMmavAMS3UwPLMrhxvms2t3s4iHiKRfWUDZcqqls1TMG7iYxOOWZUAXlf5Z2BLVwW/W2X5THQpOxYTLhsPF/22KNhf7ZqmVPt49Mm4PEjhn4Lt7RzmTT92JR9eAMvSi+xiEjZcLH8gUfLEuB3MJPt1q0bgnVEBGhShzvrwEz2nTxPqp7V+4mIlN6Z6DRBYDbk9zpmIdYRNqwOx+T84hsfV2Tu9vYAaiQj5zjJv1xCbltqSK1D8BMUDhUzASbYP1Afec4ZqYOwnh6hTnRPh3X+DR2g2mojuUWXyKrMPaouTMmac8iOI6fIkQtXSNH12+RKWZXXXLWVJ1an6Ce2KypnwksN++RN8tpRWFdIsLtcs22C/AEPQr94cWklyS44Rxgux89MIOIY3VE5E76U8mjSp2B93aJekOdCsHYcPBAf8w5SUvGAFF695Z0h87FCsu1gHknfnUvWZO3zphx+Jxj9Z4JpaZ3EJmGdAcE3vZoFTaoDB401hbN3K1UzoWFqQqoJWOfLcLC+");
    imageData.append("onDmjjqdNMwhrNcPsNZ/xIH6kAdgRXquKOqfQTs3bNBaAgTqA0p5VA8U8UFVPWiZ/VizCpD/hf7BYkvIgjP0eEr1QAGvV6cRW481q0A3axDAgYPGjIJ8EcQP8OnxTEhbjAx0KPUGBO9yjYZifuEXvJcJH+6GxWIZqNTimbhhljqFWKK83yUcjpYRELQOD9JbhNS9R094WMcHHTM7LAMUMTMhSFUWtzvgLhRSZlHYBihiYKKGnvDwuD60atPSIzJA0VsmYKPI00UDj6cEbV4RG6CIuglYJGobG4PuNKGRXY2KAYpomYDVpqnW6R6L4wcCNK7aqBmgiNiEIMv1gqD6F013oDvRqBqgCNcE5PxruyhOwvG6A21cUTdA0VMTvCB56AkPxwkGSKFvSvFQ1L/wM2EjZBOC3GZrkGbi90MBzECp2gBbip+JCEFNCNJnOOHNwe+FijYNkwx1cAeEfwGWeXTrQir+HqErE7A9+GoXm+fj5+MStJuC6BP0PAHL5Cf4+xbfIE/FzyWQQAIJ/F/4C4DGb+CHK35vAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image5f1a736ac578dd8b6aca089f40a426aa = new WeakReference<>(result);
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
BufferedImage image5f1a736ac578dd8b6aca089f40a426aa=getImage5f1a736ac578dd8b6aca089f40a426aa();
if (image5f1a736ac578dd8b6aca089f40a426aa != null) {
    g.drawImage(image5f1a736ac578dd8b6aca089f40a426aa, 0, 0, null);
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
	private icons8_fill_color_48() {
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
       icons8_fill_color_48 base = new icons8_fill_color_48();
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
       icons8_fill_color_48 base = new icons8_fill_color_48();
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
        return icons8_fill_color_48::new;
    }
}

