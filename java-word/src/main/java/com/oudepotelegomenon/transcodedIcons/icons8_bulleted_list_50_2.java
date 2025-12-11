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
public class icons8_bulleted_list_50_2 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 23.62109375f, 21.8671875f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.4028223f, -0.00193359f, 1.4028223f, -0.00193359f, 2.8339844f, -0.00390625f);
generalPath.curveTo(4.310283f, 0.00189453f, 4.310283f, 0.00189453f, 5.8164062f, 0.0078125f);
generalPath.curveTo(6.796738f, 0.00394531f, 7.7770705f, 7.813E-5f, 8.787109f, -0.00390625f);
generalPath.curveTo(9.723614f, -0.00261719f, 10.660117f, -0.00132813f, 11.625f, 0.0f);
generalPath.curveTo(12.91942f, 0.00169189f, 12.91942f, 0.00169189f, 14.23999f, 0.00341797f);
generalPath.curveTo(16.378906f, 0.1328125f, 16.378906f, 0.1328125f, 18.378906f, 1.1328125f);
generalPath.curveTo(18.378906f, 2.4528124f, 18.378906f, 3.7728126f, 18.378906f, 5.1328125f);
generalPath.curveTo(15.926155f, 6.359188f, 14.328328f, 6.246966f, 11.589844f, 6.2304688f);
generalPath.curveTo(10.6488285f, 6.2272463f, 9.707812f, 6.2240233f, 8.738281f, 6.220703f);
generalPath.curveTo(7.7534375f, 6.212324f, 6.768594f, 6.203945f, 5.7539062f, 6.1953125f);
generalPath.curveTo(4.761328f, 6.1908007f, 3.76875f, 6.186289f, 2.7460938f, 6.1816406f);
generalPath.curveTo(0.29030466f, 6.169834f, -2.1653647f, 6.1533666f, -4.6210938f, 6.1328125f);
generalPath.curveTo(-5.0032816f, 4.476666f, -5.335045f, 2.8082423f, -5.6210938f, 1.1328125f);
generalPath.curveTo(-4.004233f, -0.48404825f, -2.2303321f, 0.00291901f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 18.0f, 34.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(7.92f, 0.0f, 15.84f, 0.0f, 24.0f, 0.0f);
generalPath.curveTo(23.67f, 1.65f, 23.34f, 3.3f, 23.0f, 5.0f);
generalPath.curveTo(15.74f, 5.0f, 8.48f, 5.0f, 1.0f, 5.0f);
generalPath.curveTo(0.67f, 3.35f, 0.34f, 1.7f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 19.0f, 11.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(7.26f, 0.0f, 14.52f, 0.0f, 22.0f, 0.0f);
generalPath.curveTo(22.33f, 1.65f, 22.66f, 3.3f, 23.0f, 5.0f);
generalPath.curveTo(15.08f, 5.0f, 7.16f, 5.0f, -1.0f, 5.0f);
generalPath.curveTo(-0.67f, 3.35f, -0.34f, 1.7f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.0f, 33.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.6754298f, 0.28604898f, 3.3438535f, 0.61781234f, 5.0f, 1.0f);
generalPath.curveTo(5.0f, 2.65f, 5.0f, 4.3f, 5.0f, 6.0f);
generalPath.curveTo(3.35f, 6.0f, 1.7f, 6.0f, 0.0f, 6.0f);
generalPath.curveTo(-0.38218766f, 4.3438535f, -0.713951f, 2.6754298f, -1.0f, 1.0f);
generalPath.curveTo(-0.67f, 0.67f, -0.34f, 0.34f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 11.5625f, 10.9375f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.2065625f, 0.0309375f, 1.2065625f, 0.0309375f, 2.4375f, 0.0625f);
generalPath.curveTo(2.4375f, 1.7125f, 2.4375f, 3.3625f, 2.4375f, 5.0625f);
generalPath.curveTo(0.7875f, 5.3925f, -0.8625f, 5.7225f, -2.5625f, 6.0625f);
generalPath.curveTo(-2.9446876f, 4.4063535f, -3.276451f, 2.7379298f, -3.5625f, 1.0625f);
generalPath.curveTo(-2.5625f, 0.0625f, -2.5625f, 0.0625f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.0f, 22.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.65f, 0.33f, 3.3f, 0.66f, 5.0f, 1.0f);
generalPath.curveTo(4.67f, 2.65f, 4.34f, 4.3f, 4.0f, 6.0f);
generalPath.curveTo(2.35f, 5.67f, 0.7f, 5.34f, -1.0f, 5.0f);
generalPath.curveTo(-0.67f, 3.35f, -0.34f, 1.7f, 0.0f, 0.0f);
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
        return 8.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 10.9375;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 34.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 28.0625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_bulleted_list_50_2() {
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
       icons8_bulleted_list_50_2 base = new icons8_bulleted_list_50_2();
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
       icons8_bulleted_list_50_2 base = new icons8_bulleted_list_50_2();
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
        return icons8_bulleted_list_50_2::new;
    }
}

