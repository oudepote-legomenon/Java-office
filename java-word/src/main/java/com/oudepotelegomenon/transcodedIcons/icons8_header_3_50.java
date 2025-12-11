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
public class icons8_header_3_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagea2abbca6d8f4507ea46c36981d6e8c12;
private static BufferedImage getImagea2abbca6d8f4507ea46c36981d6e8c12() {
    BufferedImage result = (imagea2abbca6d8f4507ea46c36981d6e8c12 != null)
        ? imagea2abbca6d8f4507ea46c36981d6e8c12.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1104);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADBElEQVR4Xu2YT6hMURzHH/mXEguhsLEgUWyUFEkWLJTwKOKVd++ZeeqJx5t77h26lv7MnN+MsngrWcjCQiGJhZSNEDsLIYWFRJFeCuN3zpu5zXznznuTXnfu6Hzq29S9v9/3nu+dc/+dnh6LxWKxWCyWSSd74sICx1cbhSz1OlIdyPhqT8ajzf1+aSHWjksmoEPCp/tNklTA2jgyXnFNU29VWFvDCWgt778kpHrDv5Vx9IprTveFNA89mnB9OhNjUHF99QBr49BnD3trwlpNf45WYt2EkvTRlWorejWQdJCsX1qNdW1J0qg+FvpFdE0QLZ6KfWE4Cz0NnQziSnrEgwv1Rc4X/F4+68d423XWb/SKerzSbvQ0dCIID/Smk1OrcF8N7t0pfPUH/arjIqw3JB0kDMOpuC0ODvsE/YwkXcVaQ9JB2oWn3GX0GxsXjWCtIcVBbqCfkaQhrDWkMciAVMs4yA/009LPIaw3pCnI4GB5pr4r8YX+Dr2MJN3GnojWQeg1N3oTSc9Z7G0niBvQdlF9leGT9pC9XuqHHnpE45H03smVl6BPRKsgkyE8Vj3CUw7WtxK/ntwbyBeWokcDaQ/C/8RF4Z2di/1NpD2IkVRf+XcAPRroiiCRVBl9IjoVpJ7eMJyhrwE3X97AUymvL2z0iiRVH/YbWgXhO8kXEfOx1Cz1FHtrwmO1y+Hhc3N4wHfRb0zqgxAj07FnvCCJP0fqEUOF+a1ux46ntmB9aoNoeIo9Rk8jSUexNtVBeHo9R8/q2I5jbaJB9CKCCEdm4/Y4zPuWr36hp5GkfVifaBAnKK5n37f8pD6o36twf41MUFzMg32GfmZc/PV45OT5RdiTeJA6/8/6s1YENKxvqcIv7udtOQ55hfUdvSJJdQd9DZ0K8k/iu5gjC8vR19A1QST9FIHagZ4R3RCEx/jClaV16NdAkkumeuFB");
    imageData.append("yOI29r7Gc/0TDhj0je9at/h3F/dNQ68UUZmi36+ER5v0wrVe29IL2XppNHuKVrS72mKxWCwWi+V/4i/QnjwcnPZrkQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagea2abbca6d8f4507ea46c36981d6e8c12 = new WeakReference<>(result);
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
BufferedImage imagea2abbca6d8f4507ea46c36981d6e8c12=getImagea2abbca6d8f4507ea46c36981d6e8c12();
if (imagea2abbca6d8f4507ea46c36981d6e8c12 != null) {
    g.drawImage(imagea2abbca6d8f4507ea46c36981d6e8c12, 0, 0, null);
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
	private icons8_header_3_50() {
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
       icons8_header_3_50 base = new icons8_header_3_50();
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
       icons8_header_3_50 base = new icons8_header_3_50();
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
        return icons8_header_3_50::new;
    }
}

