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
public class icons8_cube_64 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image657f790aff7e21569984b8c495d8ed98;
private static BufferedImage getImage657f790aff7e21569984b8c495d8ed98() {
    BufferedImage result = (image657f790aff7e21569984b8c495d8ed98 != null)
        ? image657f790aff7e21569984b8c495d8ed98.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1392);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAD3ElEQVR4Xu2X3WvWZRjHh3RQR9GBQhEKbs65F/dMzU0cjaT3LHyJxJecL9tauTASggKTSMKQKISSQUU51HhI3eams61NJxnGCHl2sNP+Ac/Ek6JP9/W4qz386j54dt8/vA5+H/jwPNf9+z67vvfvbBUVGRkZGRkZGf/H4z1g2gPMLH6HR5O9o7HkAFh38VvuJXSl9BIq34QS01s0D6reZmFlN4VUu1V3g7jsDab1c2k3i5K5+4V0SbVbbReIVXtZ6D4L8n1FFzM1abzteZJqt4ZOEOV7zi2q76BQPOuIvCiQ1Lo17QdRZ1mU209BznL7mFkda1EEUum2Zh+IpWeyyJ0VZp/FWRSJ6N1a9oCYPG91i5rbKciz5j1u0c7ARRGJ2m19O4g6fzzJu/p93S4WuWfTmjHstHYum7bXQdT5k2vgfF9neQmasaz2LZsNu0DU+VP3AsRjJS8hmbFEcLdnd4Co8/GroPoylgju9sJ2EHX+zF1c9WUsEdxt4zYQdf5iAlRfxhLB3Ta9BqLOJ8ZB9WUsEdxt66sg6vylu7jqy1giuNu2rSDqfPJnUH0ZSwR327EZRJ173cVVX8YSwd12bwJR56/HQPVlLBHcbe8rIOr8rbu46stYIrhb58sg6vz9KKi+jCWCu3W/BKLOfT+B6stYIrhbz4sg6nzGXVz1ZSwR3O3g8yDq/MMVUH0ZSwR3O/QciDrn3cVVX8YSwd3eewZEnc+NgOrLWCK42wdPg6jzBXdx1ZexRHC3wxtA1HnwMqi+jCWCu330FIg6D7mLq76MJYK7HW0DUefLl0D1ZSwR3O3YkyDqfGUYVF/GEsHdjreCqPOou7jqy1giuNvn60HUeXwIVF/GEsHdTqwDUeer7uKqL2OJ4G5ftYCo8/WLoPoylgju1rsWRJ1/cRdXfRlLBHf75gkQdb4xwN+/DoLoy1giuNt3q0E8");
    imageData.append("3cAjMt+8SOdN9xJ+K3kBmpn7lR2Cu/U1Md23Ck41MZlv4SE5m+rn4NTA3B+V5+Lcr+wQ3O1ME4+dbeSPszlwDk608YCc/36BQ5qZfTb/JRHRLkmTubLI56jNN3LbSX4lvf95LueNgUsioV2SJnNl07+S5nP13DnfAOfr+bD0WfGsIcKSFIjabaCOjf11/DlQD86ef8/vzXGWRCZ6t+EaOoZrwfnXUB1bimf35nhL5oF28JnMBzFSw5GRFeC8e6mW1tnvcZeUiXbwmcwHM1rNybHlMFbN7eLn8hSWRCC1bkcqWDBRzY9O1GTGAql2m1jCg5OVTF6vcv8cGTfZPRpTS3n4RiW3nFg22TsjIyMjIyOjyD8UBU8D70WLWgAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image657f790aff7e21569984b8c495d8ed98 = new WeakReference<>(result);
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
BufferedImage image657f790aff7e21569984b8c495d8ed98=getImage657f790aff7e21569984b8c495d8ed98();
if (image657f790aff7e21569984b8c495d8ed98 != null) {
    g.drawImage(image657f790aff7e21569984b8c495d8ed98, 0, 0, null);
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
		return 64.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 64.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_cube_64() {
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
       icons8_cube_64 base = new icons8_cube_64();
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
       icons8_cube_64 base = new icons8_cube_64();
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
        return icons8_cube_64::new;
    }
}

