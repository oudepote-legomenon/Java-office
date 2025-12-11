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
public class icons8_find_50_2 implements RadianceIcon {
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
g.transform(new AffineTransform(0.10000000149011612f, 0.0f, 0.0f, -0.10000000149011612f, 0.0f, 50.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(131.0f, 490.0f);
generalPath.curveTo(57.0f, 473.0f, 8.0f, 409.0f, 8.0f, 331.0f);
generalPath.curveTo(8.0f, 216.0f, 111.0f, 138.0f, 216.0f, 173.0f);
generalPath.curveTo(255.0f, 186.0f, 261.0f, 185.0f, 275.0f, 170.0f);
generalPath.curveTo(283.0f, 161.0f, 290.0f, 149.0f, 290.0f, 143.0f);
generalPath.curveTo(290.0f, 138.0f, 321.0f, 103.0f, 360.0f, 66.0f);
generalPath.curveTo(417.0f, 10.0f, 434.0f, 0.0f, 452.0f, 5.0f);
generalPath.curveTo(481.0f, 14.0f, 486.0f, 19.0f, 495.0f, 48.0f);
generalPath.curveTo(500.0f, 66.0f, 490.0f, 83.0f, 434.0f, 140.0f);
generalPath.curveTo(397.0f, 179.0f, 362.0f, 210.0f, 357.0f, 210.0f);
generalPath.curveTo(351.0f, 210.0f, 339.0f, 217.0f, 330.0f, 225.0f);
generalPath.curveTo(315.0f, 239.0f, 314.0f, 245.0f, 327.0f, 284.0f);
generalPath.curveTo(366.0f, 403.0f, 257.0f, 518.0f, 131.0f, 490.0f);
generalPath.closePath();
generalPath.moveTo(244.0f, 457.0f);
generalPath.curveTo(369.0f, 386.0f, 330.0f, 199.0f, 186.0f, 183.0f);
generalPath.curveTo(101.0f, 173.0f, 20.0f, 245.0f, 20.0f, 330.0f);
generalPath.curveTo(20.0f, 378.0f, 55.0f, 437.0f, 98.0f, 459.0f);
generalPath.curveTo(147.0f, 485.0f, 196.0f, 485.0f, 244.0f, 457.0f);
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
generalPath.moveTo(94.0f, 406.0f);
generalPath.curveTo(66.0f, 378.0f, 60.0f, 364.0f, 60.0f, 330.0f);
generalPath.curveTo(60.0f, 296.0f, 66.0f, 282.0f, 94.0f, 254.0f);
generalPath.curveTo(122.0f, 226.0f, 136.0f, 220.0f, 170.0f, 220.0f);
generalPath.curveTo(204.0f, 220.0f, 218.0f, 226.0f, 246.0f, 254.0f);
generalPath.curveTo(274.0f, 282.0f, 280.0f, 296.0f, 280.0f, 330.0f);
generalPath.curveTo(280.0f, 364.0f, 274.0f, 378.0f, 246.0f, 406.0f);
generalPath.curveTo(218.0f, 434.0f, 204.0f, 440.0f, 170.0f, 440.0f);
generalPath.curveTo(136.0f, 440.0f, 122.0f, 434.0f, 94.0f, 406.0f);
generalPath.closePath();
generalPath.moveTo(241.0f, 401.0f);
generalPath.curveTo(305.0f, 336.0f, 261.0f, 230.0f, 170.0f, 230.0f);
generalPath.curveTo(79.0f, 230.0f, 35.0f, 336.0f, 99.0f, 401.0f);
generalPath.curveTo(122.0f, 424.0f, 137.0f, 430.0f, 170.0f, 430.0f);
generalPath.curveTo(203.0f, 430.0f, 218.0f, 424.0f, 241.0f, 401.0f);
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
        return 0.800000011920929;
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
		return 49.20000076293945;
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
	private icons8_find_50_2() {
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
       icons8_find_50_2 base = new icons8_find_50_2();
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
       icons8_find_50_2 base = new icons8_find_50_2();
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
        return icons8_find_50_2::new;
    }
}

