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
public class save_as implements RadianceIcon {
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
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(8.0f, 0.0f, 0.0f, 8.0f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(3.0f, 88.0f);
generalPath.lineTo(3.0f, 7.0f);
generalPath.curveTo(3.0f, 4.0f, 4.0f, 3.0f, 7.0f, 3.0f);
generalPath.lineTo(93.0f, 3.0f);
generalPath.curveTo(96.0f, 3.0f, 97.0f, 5.0f, 97.0f, 8.0f);
generalPath.lineTo(97.0f, 93.0f);
generalPath.curveTo(97.0f, 95.0f, 97.0f, 97.0f, 93.0f, 97.0f);
generalPath.lineTo(12.0f, 97.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(144, 177, 222, 255)) : new Color(144, 177, 222, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(44, 61, 96, 255)) : new Color(44, 61, 96, 255);
stroke = new BasicStroke(1.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(3.0f, 88.0f);
generalPath.lineTo(3.0f, 7.0f);
generalPath.curveTo(3.0f, 4.0f, 4.0f, 3.0f, 7.0f, 3.0f);
generalPath.lineTo(93.0f, 3.0f);
generalPath.curveTo(96.0f, 3.0f, 97.0f, 5.0f, 97.0f, 8.0f);
generalPath.lineTo(97.0f, 93.0f);
generalPath.curveTo(97.0f, 95.0f, 97.0f, 97.0f, 93.0f, 97.0f);
generalPath.lineTo(12.0f, 97.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.0f, 6.0f);
generalPath.lineTo(6.0f, 87.0f);
generalPath.lineTo(13.0f, 94.0f);
generalPath.lineTo(94.0f, 94.0f);
generalPath.lineTo(94.0f, 6.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(78, 126, 194, 255)) : new Color(78, 126, 194, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.0f, 62.0f);
generalPath.curveTo(24.0f, 62.0f, 24.0f, 64.0f, 24.0f, 66.0f);
generalPath.lineTo(24.0f, 97.0f);
generalPath.lineTo(76.0f, 97.0f);
generalPath.lineTo(76.0f, 66.0f);
generalPath.curveTo(76.0f, 64.0f, 75.0f, 62.0f, 72.0f, 62.0f);
generalPath.lineTo(28.0f, 62.0f);
generalPath.closePath();
generalPath.moveTo(38.0f, 66.0f);
generalPath.curveTo(45.0f, 66.0f, 44.0f, 69.0f, 44.0f, 69.0f);
generalPath.lineTo(44.0f, 87.0f);
generalPath.curveTo(44.0f, 87.0f, 45.0f, 90.0f, 38.0f, 90.0f);
generalPath.curveTo(32.0f, 90.0f, 33.0f, 87.0f, 33.0f, 87.0f);
generalPath.lineTo(33.0f, 69.0f);
generalPath.curveTo(33.0f, 69.0f, 32.0f, 66.0f, 38.0f, 66.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(153, 153, 153, 255)) : new Color(153, 153, 153, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 85, 85, 255)) : new Color(85, 85, 85, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.0f, 62.0f);
generalPath.curveTo(24.0f, 62.0f, 24.0f, 64.0f, 24.0f, 66.0f);
generalPath.lineTo(24.0f, 97.0f);
generalPath.lineTo(76.0f, 97.0f);
generalPath.lineTo(76.0f, 66.0f);
generalPath.curveTo(76.0f, 64.0f, 75.0f, 62.0f, 72.0f, 62.0f);
generalPath.lineTo(28.0f, 62.0f);
generalPath.closePath();
generalPath.moveTo(38.0f, 66.0f);
generalPath.curveTo(45.0f, 66.0f, 44.0f, 69.0f, 44.0f, 69.0f);
generalPath.lineTo(44.0f, 87.0f);
generalPath.curveTo(44.0f, 87.0f, 45.0f, 90.0f, 38.0f, 90.0f);
generalPath.curveTo(32.0f, 90.0f, 33.0f, 87.0f, 33.0f, 87.0f);
generalPath.lineTo(33.0f, 69.0f);
generalPath.curveTo(33.0f, 69.0f, 32.0f, 66.0f, 38.0f, 66.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
shape = new Rectangle2D.Double(17.0, 4.0, 66.0, 10.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 0, 0, 179)) : new Color(255, 0, 0, 179);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
shape = new Rectangle2D.Double(17.0, 14.0, 66.0, 42.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(238, 238, 238, 255)) : new Color(238, 238, 238, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5
shape = new Rectangle2D.Double(8.0, 9.0, 6.0, 6.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(44, 61, 96, 255)) : new Color(44, 61, 96, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_6
paint = (colorFilter != null) ? colorFilter.filter(new Color(187, 187, 187, 255)) : new Color(187, 187, 187, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.0f, 47.0f);
generalPath.lineTo(79.0f, 47.0f);
generalPath.moveTo(21.0f, 35.0f);
generalPath.lineTo(79.0f, 35.0f);
generalPath.moveTo(21.0f, 24.0f);
generalPath.lineTo(79.0f, 24.0f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.0f, 80.0f);
generalPath.lineTo(90.0f, 32.0f);
generalPath.curveTo(90.0f, 32.0f, 94.0f, 33.0f, 96.0f, 36.0f);
generalPath.curveTo(98.0f, 38.0f, 98.0f, 41.0f, 98.0f, 41.0f);
generalPath.lineTo(55.0f, 87.0f);
generalPath.lineTo(44.0f, 90.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(207, 145, 0, 255)) : new Color(207, 145, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(51, 51, 51, 255)) : new Color(51, 51, 51, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.0f, 80.0f);
generalPath.lineTo(90.0f, 32.0f);
generalPath.curveTo(90.0f, 32.0f, 94.0f, 33.0f, 96.0f, 36.0f);
generalPath.curveTo(98.0f, 38.0f, 98.0f, 41.0f, 98.0f, 41.0f);
generalPath.lineTo(55.0f, 87.0f);
generalPath.lineTo(44.0f, 90.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(89.0f, 36.0f);
generalPath.lineTo(49.0f, 80.0f);
generalPath.lineTo(51.0f, 81.0f);
generalPath.lineTo(91.0f, 37.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(238, 238, 238, 255)) : new Color(238, 238, 238, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.0f, 90.0f);
generalPath.lineTo(48.0f, 89.0f);
generalPath.lineTo(45.0f, 85.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(51, 51, 51, 255)) : new Color(51, 51, 51, 255);
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
        return 18.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 18.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 774.14404296875;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 766.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private save_as() {
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
       save_as base = new save_as();
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
       save_as base = new save_as();
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
        return save_as::new;
    }
}

