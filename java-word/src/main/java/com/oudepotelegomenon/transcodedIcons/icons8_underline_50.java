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
public class icons8_underline_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image4f284e0bc8e262fd921c31157e007cb1;
private static BufferedImage getImage4f284e0bc8e262fd921c31157e007cb1() {
    BufferedImage result = (image4f284e0bc8e262fd921c31157e007cb1 != null)
        ? image4f284e0bc8e262fd921c31157e007cb1.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1528);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEQUlEQVR4Xu2Zy28bVRTGU1GQEF0gxApUVuyoUP8AFrCoYNNlKlUgVaLOjJOWpCmlmUeKmzgBktqemcTk3SZ2EmSc1HHTpiV9kRYayqMqLwkhIdFdxSLqhiaxk/hyPiNX6IwGzzgppNL8pE+yNPd855yZe6+vx1VVPo8IsmLslRSjyau4jxM8zo1QE/cpS1C35utbevNK5/CiGx1pH1yWVENwHycwFjHcx0moBTVxn7LUNnd9deLktMhe+9mVTk19Ibw2ghju4yTUgpq4T1nkZvNGY/vASuTUWTF85obNuKTx81+LrrHPhBpJrHptBDGIhQf3LQm5UQNqQU3cpyySGn2N5qUZ1MzfkJQnKKmpczgva9YCjUlKSmwf93ECYxGDWHhw35KQu1gD1YKauI9r5Cbj1X9r5GjHyaUa1TjO49yCWHhw3382ghp4nGf8RlziN+IVvxGX+I14xW/EJX4jXvEbcYnfiFf8RlziN+IVvxGX+I14RWoyX4HZ1Jw9CaR2jizT7+kPeZxbEAsP7gtNzf1UbAQ18DjPBDRjJ8wmrnxvSwS1dKcKdD3J49wia8ZoK3lwX2ji8u1iI/tV82Ue5xnpcORZmCXP3bQlgszkBRHUrLtVVWILjy2P2CJr1h94JcR9oeTZ+b8bCUWf4ZEVIevWvfgns7ZEUGr2O0pmrsmquYvHlYOe9uuITV28ZfOF4uMXBeVe4HEVE9SNbLMxtsYTlRSOp1eDuvlLY2P0SR7rBMbKuvlruCft6Ksbo2uSbk7w2IrBy7SgZq5mrv5oSwalL90W77T05KjhTHUo9ASP52AMTZlMfUvvMtYB94NOUy5qdDWgxN7k8RVTF4pvk1XjvtNchsZmboqD78dzNOe/CRyNvcQ9SgRVcwc9vW8PHo/nxmacX5VaoxcEef351rsnnuIe66JGjX10gAqdvPqDLWlJqdlbQosk");
    imageData.append("8nS312o16xJtrfWSFttdFH2mwq7gmh5N5j91WBfQacpx4Fh3rkYx2nkd6wY7By3oex2DWVtiruHslyLcM1FoCPct0o62AjW09i229aQLuMbHc3UMTtHTMBf2hYyneR0bQvHPHzVWGJicsyXfKA1Mfo4ttxBQY3t4/g2FjhT9uMOjDt8r6xHWWVC3VgKq8THPu+GEQqGttJucqzvWlR/KXLcVU6mGMtdEXXNXnjaC6erq9GM870NBkvofpy+yBBaukTzveA5zI8QaiZnil6qkWSO4UTzfQ4caqaVFudQY7l+uZN1gPRwK9+XgQVNW5v7/KXQyfYG25hSezqG2vlznUFYk6IyUpZMrLxx3f2R6XmDnQwOIoUPjeK0e2c59/zf2K9EXaUdro7t7p3j0pqmCLffIB0NLUENr72Jx+tA1WtC/1yixMGK4z6ZC1qLPS0r0DUy9B/+T02ccEt9+r/s5Pt7H51GD5vTcZhav1xG82djM4vX6bEb+Au0jbCtvOoF9AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image4f284e0bc8e262fd921c31157e007cb1 = new WeakReference<>(result);
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
BufferedImage image4f284e0bc8e262fd921c31157e007cb1=getImage4f284e0bc8e262fd921c31157e007cb1();
if (image4f284e0bc8e262fd921c31157e007cb1 != null) {
    g.drawImage(image4f284e0bc8e262fd921c31157e007cb1, 0, 0, null);
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
		return 50.0;
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
	private icons8_underline_50() {
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
       icons8_underline_50 base = new icons8_underline_50();
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
       icons8_underline_50 base = new icons8_underline_50();
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
        return icons8_underline_50::new;
    }
}

