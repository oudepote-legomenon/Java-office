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
public class rotate_right implements RadianceIcon {
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
g.transform(new AffineTransform(14.285714149475098f, 0.0f, 0.0f, 14.285714149475098f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.7265f, 25.1056f);
generalPath.curveTo(8.2656f, 24.8477f, 8.5f, 24.4493f, 8.4765f, 23.793f);
generalPath.curveTo(8.4062f, 22.9493f, 7.4452f, 21.7774f, 7.4452f, 18.6603f);
generalPath.curveTo(7.4452f, 13.6446f, 10.6796f, 10.129f, 15.7421f, 10.129f);
generalPath.lineTo(15.8124f, 10.129f);
generalPath.lineTo(15.8124f, 13.3399f);
generalPath.curveTo(15.8124f, 15.1915f, 17.2656f, 15.6134f, 18.6718f, 14.5587f);
generalPath.lineTo(25.0702f, 9.8946f);
generalPath.curveTo(26.1484f, 9.1212f, 26.1484f, 8.2071f, 25.0702f, 7.4103f);
generalPath.lineTo(18.6718f, 2.7227f);
generalPath.curveTo(17.2421f, 1.6444f, 15.8124f, 2.0665f, 15.8124f, 3.9649f);
generalPath.lineTo(15.8124f, 7.4103f);
generalPath.lineTo(15.7187f, 7.4103f);
generalPath.curveTo(8.9921f, 7.4103f, 4.5156f, 11.9337f, 4.5156f, 18.6368f);
generalPath.curveTo(4.5156f, 21.1446f, 5.0312f, 23.2071f, 5.7578f, 24.4493f);
generalPath.curveTo(6.1562f, 25.129f, 7.0f, 25.4571f, 7.7265f, 25.1056f);
generalPath.closePath();
generalPath.moveTo(45.4609f, 54.3556f);
generalPath.curveTo(49.4689f, 54.3556f, 51.4844f, 52.4337f, 51.4844f, 48.3321f);
generalPath.lineTo(51.4844f, 25.1524f);
generalPath.curveTo(51.4844f, 21.0508f, 49.4689f, 19.129f, 45.4609f, 19.129f);
generalPath.lineTo(22.2343f, 19.129f);
generalPath.curveTo(18.2265f, 19.129f, 16.2109f, 21.0508f, 16.2109f, 25.1524f);
generalPath.lineTo(16.2109f, 48.3321f);
generalPath.curveTo(16.2109f, 52.4337f, 18.2265f, 54.3556f, 22.2343f, 54.3556f);
generalPath.closePath();
generalPath.moveTo(45.3905f, 50.5821f);
generalPath.lineTo(22.3046f, 50.5821f);
generalPath.curveTo(20.6874f, 50.5821f, 19.9843f, 49.9259f, 19.9843f, 48.2618f);
generalPath.lineTo(19.9843f, 25.2227f);
generalPath.curveTo(19.9843f, 23.5587f, 20.6874f, 22.9024f, 22.3046f, 22.9024f);
generalPath.lineTo(45.3905f, 22.9024f);
generalPath.curveTo(47.008f, 22.9024f, 47.7107f, 23.5587f, 47.7107f, 25.2227f);
generalPath.lineTo(47.7107f, 48.2618f);
generalPath.curveTo(47.7107f, 49.9259f, 47.008f, 50.5821f, 45.3905f, 50.5821f);
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
        return 64.50857543945312;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 23.49142837524414;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 670.98291015625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 753.01708984375;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private rotate_right() {
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
       rotate_right base = new rotate_right();
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
       rotate_right base = new rotate_right();
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
        return rotate_right::new;
    }
}

