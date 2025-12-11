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
public class bullet_list_svgrepo_com_1 implements RadianceIcon {
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
g.transform(new AffineTransform(0.4166666567325592f, 0.0f, 0.0f, 0.4166666567325592f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(225.882f, 1298.412f);
generalPath.curveTo(350.456f, 1298.412f, 451.765f, 1399.72f, 451.765f, 1524.294f);
generalPath.curveTo(451.765f, 1648.8679f, 350.45602f, 1750.1759f, 225.88202f, 1750.1759f);
generalPath.curveTo(101.308f, 1750.176f, 0.0f, 1648.868f, 0.0f, 1524.294f);
generalPath.curveTo(0.0f, 1399.7198f, 101.308f, 1298.412f, 225.882f, 1298.412f);
generalPath.closePath();
generalPath.moveTo(1920.0f, 1411.352f);
generalPath.lineTo(1920.0f, 1637.2351f);
generalPath.lineTo(677.647f, 1637.2351f);
generalPath.lineTo(677.647f, 1411.3531f);
generalPath.lineTo(1920.0f, 1411.3531f);
generalPath.closePath();
generalPath.moveTo(225.882f, 733.707f);
generalPath.curveTo(350.456f, 733.707f, 451.765f, 835.01495f, 451.765f, 959.589f);
generalPath.curveTo(451.765f, 1084.1631f, 350.45602f, 1185.4719f, 225.88202f, 1185.4719f);
generalPath.curveTo(101.308f, 1185.47f, 0.0f, 1084.162f, 0.0f, 959.588f);
generalPath.curveTo(0.0f, 835.01404f, 101.308f, 733.706f, 225.882f, 733.706f);
generalPath.closePath();
generalPath.moveTo(1920.0f, 846.647f);
generalPath.lineTo(1920.0f, 1072.5289f);
generalPath.lineTo(677.647f, 1072.5289f);
generalPath.lineTo(677.647f, 846.647f);
generalPath.lineTo(1920.0f, 846.647f);
generalPath.closePath();
generalPath.moveTo(225.882f, 169.0f);
generalPath.curveTo(350.456f, 169.0f, 451.765f, 270.30798f, 451.765f, 394.88202f);
generalPath.curveTo(451.765f, 519.45605f, 350.456f, 620.765f, 225.882f, 620.765f);
generalPath.curveTo(101.308f, 620.765f, 0.0f, 519.456f, 0.0f, 394.882f);
generalPath.curveTo(0.0f, 270.308f, 101.308f, 169.0f, 225.882f, 169.0f);
generalPath.closePath();
generalPath.moveTo(1920.0f, 281.941f);
generalPath.lineTo(1920.0f, 507.824f);
generalPath.lineTo(677.647f, 507.824f);
generalPath.lineTo(677.647f, 281.94f);
generalPath.lineTo(1920.0f, 281.94f);
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
        return 0.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 70.41666412353516;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 800.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 658.8233032226562;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private bullet_list_svgrepo_com_1() {
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
       bullet_list_svgrepo_com_1 base = new bullet_list_svgrepo_com_1();
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
       bullet_list_svgrepo_com_1 base = new bullet_list_svgrepo_com_1();
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
        return bullet_list_svgrepo_com_1::new;
    }
}

