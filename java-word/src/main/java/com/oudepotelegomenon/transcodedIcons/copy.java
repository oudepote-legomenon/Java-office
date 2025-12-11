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
public class copy implements RadianceIcon {
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
g.transform(new AffineTransform(0.78125f, 0.0f, 0.0f, 0.78125f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(589.3f, 260.9f);
generalPath.lineTo(589.3f, 290.9f);
generalPath.lineTo(371.4f, 290.9f);
generalPath.lineTo(371.4f, 260.9f);
generalPath.lineTo(268.9f, 260.9f);
generalPath.lineTo(268.9f, 773.9f);
generalPath.lineTo(386.09998f, 773.9f);
generalPath.lineTo(386.09998f, 469.90002f);
generalPath.lineTo(495.8f, 370.80002f);
generalPath.lineTo(697.9f, 370.80002f);
generalPath.lineTo(697.9f, 260.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(225, 240, 255, 255)) : new Color(225, 240, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(516.1f, 371.1f);
generalPath.lineTo(393.19998f, 470.90002f);
generalPath.lineTo(393.19998f, 817.7f);
generalPath.lineTo(763.6f, 817.7f);
generalPath.lineTo(763.6f, 371.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(225, 240, 255, 255)) : new Color(225, 240, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(752.7f, 370.8f);
generalPath.lineTo(774.5f, 370.8f);
generalPath.lineTo(774.5f, 806.6f);
generalPath.lineTo(752.7f, 806.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(495.8f, 370.8f);
generalPath.lineTo(773.1f, 370.8f);
generalPath.lineTo(773.1f, 392.59998f);
generalPath.lineTo(495.8f, 392.59998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(495.8f, 370.8f);
generalPath.lineTo(517.6f, 370.8f);
generalPath.lineTo(517.6f, 495.09998f);
generalPath.lineTo(495.8f, 495.09998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(397.7f, 488.7f);
generalPath.lineTo(382.30002f, 473.30002f);
generalPath.lineTo(495.80002f, 370.80002f);
generalPath.lineTo(511.2f, 386.2f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(382.3f, 473.3f);
generalPath.lineTo(517.6f, 473.3f);
generalPath.lineTo(517.6f, 495.09998f);
generalPath.lineTo(382.3f, 495.09998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(382.3f, 479.7f);
generalPath.lineTo(404.09998f, 479.7f);
generalPath.lineTo(404.09998f, 828.30005f);
generalPath.lineTo(382.3f, 828.30005f);
generalPath.closePath();
generalPath.moveTo(404.1f, 806.6f);
generalPath.lineTo(774.5f, 806.6f);
generalPath.lineTo(774.5f, 828.39996f);
generalPath.lineTo(404.1f, 828.39996f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(447.7f, 545.1f);
generalPath.lineTo(709.2f, 545.1f);
generalPath.lineTo(709.2f, 566.89996f);
generalPath.lineTo(447.7f, 566.89996f);
generalPath.closePath();
generalPath.moveTo(447.7f, 610.5f);
generalPath.lineTo(709.2f, 610.5f);
generalPath.lineTo(709.2f, 632.3f);
generalPath.lineTo(447.7f, 632.3f);
generalPath.closePath();
generalPath.moveTo(447.7f, 675.8f);
generalPath.lineTo(709.2f, 675.8f);
generalPath.lineTo(709.2f, 697.6f);
generalPath.lineTo(447.7f, 697.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(109, 158, 232, 255)) : new Color(109, 158, 232, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(251.6f, 763.0f);
generalPath.lineTo(382.3f, 763.0f);
generalPath.lineTo(382.3f, 784.8f);
generalPath.lineTo(251.6f, 784.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(251.6f, 240.1f);
generalPath.lineTo(273.4f, 240.1f);
generalPath.lineTo(273.4f, 784.80005f);
generalPath.lineTo(251.59999f, 784.80005f);
generalPath.closePath();
generalPath.moveTo(687.3f, 240.1f);
generalPath.lineTo(709.1f, 240.1f);
generalPath.lineTo(709.1f, 370.8f);
generalPath.lineTo(687.3f, 370.8f);
generalPath.closePath();
generalPath.moveTo(273.4f, 240.1f);
generalPath.lineTo(382.3f, 240.1f);
generalPath.lineTo(382.3f, 261.9f);
generalPath.lineTo(273.4f, 261.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(578.4f, 240.1f);
generalPath.lineTo(709.10004f, 240.1f);
generalPath.lineTo(709.10004f, 261.9f);
generalPath.lineTo(578.4f, 261.9f);
generalPath.closePath();
generalPath.moveTo(360.5f, 196.5f);
generalPath.lineTo(382.3f, 196.5f);
generalPath.lineTo(382.3f, 305.4f);
generalPath.lineTo(360.5f, 305.4f);
generalPath.closePath();
generalPath.moveTo(382.3f, 283.7f);
generalPath.lineTo(578.4f, 283.7f);
generalPath.lineTo(578.4f, 305.5f);
generalPath.lineTo(382.3f, 305.5f);
generalPath.closePath();
generalPath.moveTo(534.8f, 196.5f);
generalPath.lineTo(600.2f, 196.5f);
generalPath.lineTo(600.2f, 218.3f);
generalPath.lineTo(534.8f, 218.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(360.5f, 196.5f);
generalPath.lineTo(425.9f, 196.5f);
generalPath.lineTo(425.9f, 218.3f);
generalPath.lineTo(360.5f, 218.3f);
generalPath.closePath();
generalPath.moveTo(404.1f, 174.7f);
generalPath.lineTo(556.6f, 174.7f);
generalPath.lineTo(556.6f, 196.5f);
generalPath.lineTo(404.1f, 196.5f);
generalPath.closePath();
generalPath.moveTo(578.4f, 196.5f);
generalPath.lineTo(600.2f, 196.5f);
generalPath.lineTo(600.2f, 305.4f);
generalPath.lineTo(578.4f, 305.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 110, 177, 255)) : new Color(68, 110, 177, 255);
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
        return 196.5625;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 136.484375;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 408.515625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 510.7030944824219;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private copy() {
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
       copy base = new copy();
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
       copy base = new copy();
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
        return copy::new;
    }
}

