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
public class icons8_language_30 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image3ec28064586a6c5092af27a2cccc1d9d;
private static BufferedImage getImage3ec28064586a6c5092af27a2cccc1d9d() {
    BufferedImage result = (image3ec28064586a6c5092af27a2cccc1d9d != null)
        ? image3ec28064586a6c5092af27a2cccc1d9d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(992);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAACsElEQVR4Xt2WW08aQRSA/Qvt7/KhL31o/0GT/oC2sbYa1BhFNDZYYy1Yq1wjbQqIlooWtUUqpqbSohEKXgrhEhAQWC6nnFnZwM5yCbsv7SRfdnb27Pl2Tk420zOiXLo1Om/olQrM19PJwOCj32E4i6VFg3kwH98hODAQX7piQDSY5/8Qv9twgXLZTK3zkVy8bNmCkVkttc5HlDicysGSeauB0Tk99E+p69Y2yRWbSTLxeSIDwy+1DQwpNSBTLrPzGQ08Hp+H59OLsOf1SyeukbqBv77hPoJHY6/g5CJGPRMtjmcZmDPYYHX7gFofru54VmelpMjXXxF4ILcO3Rty3GnF3We224Ji3OnbD5tkZxbnPrdzw9oOPJG/hpPLOCV1/IjCgM4Pg6ZwS/p0Ibg/+LFXUIwkCxXQWp1ErtSYwbi+S+ZWp4eKRanMGIKx1WRbZKZIazGX1O2FPoWaSJ9OLsC8cZ10fjfSluJkvgynfxLg8YVIafunFkh5VSt2UJnsoFCbSOd3I20pxjnuDulTqEBt+gTHAh3cjbSlOJZhwHXkh5+hSLWLi5SwmTQYK0JtOI9zlLCtuB1C0hnHFVQqnBfimTIlFCUWkiKffTkiPDwrQI5hv+DNTpqK60rcTIpE0yUiM7gz4L1kyPxbIE/FUeJ2J5A9XwQG9AEqCbK4myaifLECE2tJeH+QJffZ6n9AbqPjOXEnZ66HE5YBfIGfBPEEC0TkvWDI/eR6CpgSW25jtQL8eE7cycBAITHu6LpQ11W8UfsYycUmD1vWZgN3jhWQXHwcZhvpPFECrSvDsbKfhfJNISzfs9KKp+0pKJXZ5KuH19RHBePsDyUQLUorVm2nwXWaJ7ywN5YT0e9lyLMvVcbrulu0uFv+HTGeHPiniW7gTiCdDDwj8c9NYsB8fwFWwGGYUwbCywAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image3ec28064586a6c5092af27a2cccc1d9d = new WeakReference<>(result);
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
BufferedImage image3ec28064586a6c5092af27a2cccc1d9d=getImage3ec28064586a6c5092af27a2cccc1d9d();
if (image3ec28064586a6c5092af27a2cccc1d9d != null) {
    g.drawImage(image3ec28064586a6c5092af27a2cccc1d9d, 0, 0, null);
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
		return 30.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 30.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_language_30() {
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
       icons8_language_30 base = new icons8_language_30();
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
       icons8_language_30 base = new icons8_language_30();
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
        return icons8_language_30::new;
    }
}

