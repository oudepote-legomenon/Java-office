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
public class icons8_english_40 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image2b16eefe9bad2a4ff74273fc7c7b26e2;
private static BufferedImage getImage2b16eefe9bad2a4ff74273fc7c7b26e2() {
    BufferedImage result = (image2b16eefe9bad2a4ff74273fc7c7b26e2 != null)
        ? image2b16eefe9bad2a4ff74273fc7c7b26e2.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1448);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAYAAACM/rhtAAAEB0lEQVR4Xu1Ya09TSxTtf/OND9Rr1MRcMdeoiRJyMTEmaIx+0JB4fVxEjZIYzc31FQQ0GpSHFhUptCgoYgsa1EYRUgp9nb67PHvXOZ7HtLTYD5J0JStpTmf2rLPmzJ49Y7OVUUYZixz/tbugZ4v9LapOdGFd3YOCSf36liwxkJ6Z283HXSe7efz/257hUc0BjmPr3l2NuM8HPcKxDFoGIzjZPlcQCRQseuYMk34TzO3y8d6rCJREBnNOJwa3boWzshJtpy7D9nxdJVwbN8Jnt+s1MtyTCZzrCliCmUlYqMALjwMY/5ZAOhbDRGMj+pYuxejBg4hPT/Ms2G7e7cWH06c5qPvQIYubASWN2wNhS+BSCBSuhUZH8aqqCv0VFZi8cwfIZLg/C/y7oQfemSRmHQ4Mbt4M5/r1mLp/XxMoMPw5jn875W4SihFIrr2fSiCTTMJ77Rocy5bhTXU1ol6vfki02kdgo4/zn4dzeDSiQJkNLMhNQqEChWvKxARe79kDx4oVLDKTTmvjxNT/SQ9pY4Gic1NPkN309/UV5SZhPoHnuwMYU781mj6axv6VKzG0cyfCY2P60PgwncTFx0HuYxFI1Ls5Xl+f181bP9wk5BPIrsUziE1O4m1tLS8EWhDpREKLJ1zTa5EKFBRu0uqmVZ7PTYJMoOaaiumODgysWYOX27YhMDys9Sewa0+yrhUskCjcjPj88Bw7ltNNgkwguZbw++E+fJif0YykIhGtj8y1ogQKspv+/G7KBFJ754YNcG3aBH9vr6F9LtcsAinXlAIygb8KzoMUrFTUCywVWaAI/Ltx8QgsFfWBS8Xff5HMl2auPg9hKpAydJylmm3LFq7ZKAETChEo0s7A2rWcpih1UQozj2lIM7kEnlKTdI8nitTPPVxas80p2QYygc3OMIJRXQAViZkZvKur4zaeo0eh+LPj0KZg1pBT");
    imageData.append("oMw1rtm2bzfUbLTNne0I8P8ygRSrQS0qxHaoQe1LDvavXs1JnEo9mZsWgTLXZDUbuSYKBSIhl0DBZpfVzdjXrxipqeEZoTIvGlIMW59BILn2zeRaRFKzmUutQgUSZW5mUil8uXGDxxjasQNhjwcffUlcUrdBFvjHkXaLa5aabXw8e5ByWYvVYgQK0oGM4ukRcrtZoGP5cjYjFk/h0r0h2FrsbwwNZTXba2+c39480EIFEmVu0iL81NTEY9PndPP6Q2MeNNds9JatBRw/CcUKFJR9m3z0VNNY76qKrEBLzaYofORsLODISSQsVCCxocvqZjIYRMe+/bC1nr3ys2Z78QIRtchsezm/a3oSfkWgILkZ0rmplVude2txveUpXzv8VV/ctQexVFcfxD+Pd6L5yYh2FWO+qimjjDIWG74DO973DZ/9s/oAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image2b16eefe9bad2a4ff74273fc7c7b26e2 = new WeakReference<>(result);
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
BufferedImage image2b16eefe9bad2a4ff74273fc7c7b26e2=getImage2b16eefe9bad2a4ff74273fc7c7b26e2();
if (image2b16eefe9bad2a4ff74273fc7c7b26e2 != null) {
    g.drawImage(image2b16eefe9bad2a4ff74273fc7c7b26e2, 0, 0, null);
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
		return 40.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 40.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_english_40() {
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
       icons8_english_40 base = new icons8_english_40();
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
       icons8_english_40 base = new icons8_english_40();
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
        return icons8_english_40::new;
    }
}

