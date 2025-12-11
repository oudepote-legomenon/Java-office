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
public class icons8_go_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.10000000149011612f, 0.0f, 0.0f, -0.10000000149011612f, 0.0f, 48.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.0f, 385.0f);
generalPath.curveTo(220.0f, 355.0f, 189.0f, 330.0f, 180.0f, 329.0f);
generalPath.curveTo(172.0f, 329.0f, 177.0f, 324.0f, 193.0f, 318.0f);
generalPath.curveTo(233.0f, 304.0f, 227.0f, 282.0f, 183.0f, 278.0f);
generalPath.curveTo(147.0f, 275.0f, 145.0f, 273.0f, 145.0f, 240.0f);
generalPath.curveTo(145.0f, 211.0f, 149.0f, 204.0f, 168.0f, 202.0f);
generalPath.curveTo(180.0f, 200.0f, 190.0f, 203.0f, 190.0f, 209.0f);
generalPath.curveTo(190.0f, 215.0f, 183.0f, 220.0f, 175.0f, 220.0f);
generalPath.curveTo(167.0f, 220.0f, 160.0f, 227.0f, 160.0f, 235.0f);
generalPath.curveTo(160.0f, 245.0f, 171.0f, 250.0f, 195.0f, 250.0f);
generalPath.curveTo(228.0f, 250.0f, 230.0f, 248.0f, 230.0f, 215.0f);
generalPath.curveTo(230.0f, 186.0f, 225.0f, 178.0f, 204.0f, 169.0f);
generalPath.curveTo(152.0f, 150.0f, 101.0f, 184.0f, 99.0f, 239.0f);
generalPath.curveTo(98.0f, 266.0f, 96.0f, 269.0f, 93.0f, 250.0f);
generalPath.curveTo(90.0f, 236.0f, 78.0f, 214.0f, 64.0f, 200.0f);
generalPath.lineTo(41.0f, 175.0f);
generalPath.lineTo(66.0f, 132.0f);
generalPath.curveTo(102.0f, 71.0f, 161.0f, 40.0f, 240.0f, 40.0f);
generalPath.curveTo(363.0f, 40.0f, 440.0f, 117.0f, 440.0f, 241.0f);
generalPath.curveTo(440.0f, 295.0f, 435.0f, 313.0f, 412.0f, 351.0f);
generalPath.curveTo(396.0f, 375.0f, 365.0f, 405.0f, 343.0f, 417.0f);
generalPath.lineTo(304.0f, 439.0f);
generalPath.lineTo(250.0f, 385.0f);
generalPath.closePath();
generalPath.moveTo(354.0f, 299.0f);
generalPath.curveTo(374.0f, 283.0f, 380.0f, 270.0f, 380.0f, 241.0f);
generalPath.curveTo(380.0f, 195.0f, 353.0f, 167.0f, 308.0f, 167.0f);
generalPath.curveTo(234.0f, 167.0f, 214.0f, 282.0f, 283.0f, 310.0f);
generalPath.curveTo(316.0f, 323.0f, 325.0f, 322.0f, 354.0f, 299.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(284.0f, 256.0f);
generalPath.curveTo(275.0f, 219.0f, 286.0f, 198.0f, 312.0f, 202.0f);
generalPath.curveTo(331.0f, 204.0f, 335.0f, 211.0f, 335.0f, 240.0f);
generalPath.curveTo(335.0f, 269.0f, 331.0f, 276.0f, 313.0f, 278.0f);
generalPath.curveTo(296.0f, 281.0f, 289.0f, 275.0f, 284.0f, 256.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());

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
        return 4.099999904632568;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 4.09999942779541;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 39.900001525878906;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 39.900001525878906;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_go_48() {
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
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
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
       icons8_go_48 base = new icons8_go_48();
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
       icons8_go_48 base = new icons8_go_48();
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
        return icons8_go_48::new;
    }
}

