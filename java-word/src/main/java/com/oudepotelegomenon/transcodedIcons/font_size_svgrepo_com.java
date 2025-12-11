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
public class font_size_svgrepo_com implements RadianceIcon {
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
g.transform(new AffineTransform(33.33333206176758f, 0.0f, 0.0f, 33.33333206176758f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -336.0f, 0.0f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 336.0f, 0.0f));
// _0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.0f, 12.0f);
generalPath.curveTo(21.5523f, 12.0f, 22.0f, 12.4477f, 22.0f, 13.0f);
generalPath.lineTo(22.0f, 19.0f);
generalPath.curveTo(22.0f, 19.5523f, 21.5523f, 20.0f, 21.0f, 20.0f);
generalPath.curveTo(20.5946f, 20.0f, 20.2456f, 19.7588f, 20.0886f, 19.4121f);
generalPath.curveTo(19.4807f, 19.785f, 18.7654f, 20.0f, 18.0f, 20.0f);
generalPath.curveTo(15.7909f, 20.0f, 14.0f, 18.2092f, 14.0f, 16.0f);
generalPath.curveTo(14.0f, 13.7909f, 15.7909f, 12.0f, 18.0f, 12.0f);
generalPath.curveTo(18.7654f, 12.0f, 19.4807f, 12.215f, 20.0886f, 12.5879f);
generalPath.curveTo(20.2456f, 12.2412f, 20.5946f, 12.0f, 21.0f, 12.0f);
generalPath.closePath();
generalPath.moveTo(8.00003f, 4.0f);
generalPath.curveTo(8.73237f, 4.0f, 9.38095f, 4.47279f, 9.60506f, 5.17f);
generalPath.lineTo(13.9521f, 18.694f);
generalPath.curveTo(14.1211f, 19.2198f, 13.8318f, 19.783f, 13.306f, 19.952f);
generalPath.curveTo(12.7802f, 20.121f, 12.217f, 19.8318f, 12.048f, 19.306f);
generalPath.lineTo(10.6639f, 15.0f);
generalPath.lineTo(5.33612f, 15.0f);
generalPath.lineTo(3.95205f, 19.306f);
generalPath.curveTo(3.78305f, 19.8318f, 3.21981f, 20.121f, 2.69402f, 19.952f);
generalPath.curveTo(2.16823f, 19.783f, 1.87899f, 19.2198f, 2.048f, 18.694f);
generalPath.lineTo(6.39499f, 5.17f);
generalPath.curveTo(6.6191f, 4.47279f, 7.26768f, 4.0f, 8.00003f, 4.0f);
generalPath.closePath();
generalPath.moveTo(18.0f, 14.0f);
generalPath.curveTo(16.8954f, 14.0f, 16.0f, 14.8955f, 16.0f, 16.0f);
generalPath.curveTo(16.0f, 17.1046f, 16.8954f, 18.0f, 18.0f, 18.0f);
generalPath.curveTo(19.1046f, 18.0f, 20.0f, 17.1046f, 20.0f, 16.0f);
generalPath.curveTo(20.0f, 14.8955f, 19.1046f, 14.0f, 18.0f, 14.0f);
generalPath.closePath();
generalPath.moveTo(8.00003f, 6.71232f);
generalPath.lineTo(5.97898f, 13.0f);
generalPath.lineTo(10.0211f, 13.0f);
generalPath.lineTo(8.00003f, 6.71232f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(9, 36, 75, 255)) : new Color(9, 36, 75, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
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
        return 62.63325881958008;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 133.3333282470703;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 670.7003173828125;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 537.3666381835938;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private font_size_svgrepo_com() {
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
       font_size_svgrepo_com base = new font_size_svgrepo_com();
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
       font_size_svgrepo_com base = new font_size_svgrepo_com();
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
        return font_size_svgrepo_com::new;
    }
}

