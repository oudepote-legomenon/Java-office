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
public class icons8_align_100 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagea79e8b981d0c3308f05a37a6f8a74baa;
private static BufferedImage getImagea79e8b981d0c3308f05a37a6f8a74baa() {
    BufferedImage result = (imagea79e8b981d0c3308f05a37a6f8a74baa != null)
        ? imagea79e8b981d0c3308f05a37a6f8a74baa.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(944);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAACjUlEQVR4Xu3bsWlcQRRG4a3CJShRWVYJCp2rHBUgVIASh8a4FCdPqfgWFhbuRffN/AdO9sPMvBMue7ncyY8//49bug/NGEDdh2YMoO5DMwZQ96EZA6j70IwB1H1oxgDqPjRjAHUfmjGAug/NGEDdh2YMoO5DMwZQ96GZv5dfxy2Pp/fz+vP9n+8djwH06pFnMkGGmSDDTJBhJsgwE2SYCTLMMwa5egS6n8Tx9PbgfRPkG0mQYSTIMBJkGAkyjAQZRoIMI0GGkSDDSJBhJMgwEmQYCTKMBBlGggxjySD+IKVXjzyTCTLMBBlmggwzQYaZIMNMkGEmyDDPGMQ/6Kj70IwB1H1oxgDqPjRjAHUfmjGAug/NGEDdh2YMoO5DMwZQ96EZA6j70IwB1H1o5vnx47jl68vv+EW/XzkGUC+0u36/cgygXmh3/X7lGEC90O76/coxgHqh3fX7lWMA9UK76/crxwDqhXbX71eOAdQL7a7frxwPVPer4/vVfTkeqO5Xx/er+3I8UN2vju9X9+V4oLpfHd+v7svxQHW/Or5f3Zfjgep+dXy/ui/HA9X96vh+dV+OB6r71fH96r4cD1T3q+P71X05HqjuV8f3q/tyPFDdr47vV/fleKC6Xx3fr+7L8UB1vzq+X92X44HqfnV8v7ovxwPV/er4fnVfjgeq+9Xx/eq+HH+QUi+0u36/cgygXmh3/X7lGEC90O76/coxgHqh3fX7lWMA9UK76/crxwDqhXbX71eOAdQL7a7frxwDqBfaXb9fOf5BR92HZgyg7kMzBlD3oRkDqPvQjAHUfWjGAOo+NGMAdR+aMYC6D80YQN2HZgyg7kMzBlD3oRkDqPvQjAHUfWjGAOo+3Mcn11gL325vfawAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagea79e8b981d0c3308f05a37a6f8a74baa = new WeakReference<>(result);
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
BufferedImage imagea79e8b981d0c3308f05a37a6f8a74baa=getImagea79e8b981d0c3308f05a37a6f8a74baa();
if (imagea79e8b981d0c3308f05a37a6f8a74baa != null) {
    g.drawImage(imagea79e8b981d0c3308f05a37a6f8a74baa, 0, 0, null);
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
		return 100.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 100.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_align_100() {
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
       icons8_align_100 base = new icons8_align_100();
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
       icons8_align_100 base = new icons8_align_100();
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
        return icons8_align_100::new;
    }
}

