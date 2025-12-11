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
public class icons8_theme_48_1 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageeaf51f0b985355e44cb9f95762dd6cd3;
private static BufferedImage getImageeaf51f0b985355e44cb9f95762dd6cd3() {
    BufferedImage result = (imageeaf51f0b985355e44cb9f95762dd6cd3 != null)
        ? imageeaf51f0b985355e44cb9f95762dd6cd3.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1796);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAFDElEQVR4Xu2ZXWwUVRTHp4adXWpJBIwKEWOJCgFUHggmjdrd7to+UL6kJooaNRFDfBDwgQdAY4ImSozEmNAisSQKidHQGkCIqTKzW9oKohA/MBo0RqEFtfhRbLvA9njOLMWZ/53tzO7ONpj0n/xzu7PnzvmduffOztxq2pjGNKZARMlwJaUij5CpN1JS7+LP33P7O5nhIfY/7LPsb/jYfm43kxlaTgfHT8XzjKrI0K5h4LVZsDDl7Wxxh/jvlXyuCjx/yUT7tDCDr+fkfylQBZtHK6WvoSNaCPMFKkqF7uCE36oAqj/Zu5AWb0/S7KYzVntgb70So9gMf04H9RmYNxDxVVrMCfqVpC4W+MotfYo/2rNUiXXxH2RE7sb8RYnhl/GJL7gkc/Wi5pQCL17CI4GxOcxFhOYgR0EiY9w8v1d+2HOaehR4sRzH2NzWf6F2bSLy5CVeVOVk3RLx5CM7gBHI2tTfQKa8xCd5EU96uG0ardkTpYbWhVYrnzFGFizCi40Pcy/kzNE4pU+9S+mTO+zHL3IRtyKXL1HbhMk8df5G+PrWJYq72m5SgKQIueKzm05bbS74oY4pDP4e9ff3W754bAHGvIBsvsSVr8Nkq3fHFHjxszwSGOvHQ13TaeDsl5fhxUOHZjrj+NaKbL7EHb/DhA98UK/Ai+U4xno6VUGDv7U74MWZY3XOOP7BRDZP8a/iLCVhMtgRuHB8hQIvPv/jJmcsP0shn6e409OYUJxrDXz28Y1KrJcHfzUUePFg72GI1U8in6e401uYcNhShFzxBp420hYCLx7o61bgLZ/rdcaa+qfI5ykuIIUJg/ZA3ykVni3HHbH8+I18nuKqf8aEQTvdvUuBF6e7WzC2Dvk8RfIs4pI0SGeO1irwYjn+X5x+gki7Cvk8xcN2HhOWws3NzYodMSm9Adl8iQtIYzLLW0NED5YR1WjZ");
    imageData.append("9s2QGpOHEd5ZgP42cvkWF9CLySz4ezTVjYUXgfC2Avbxa2YEuXyLT/AVJrOuOMKLHypTwPy69r4o1dTUXHYdf7Y2Br7WdGTKSzwCrZiMEi7wYjmOsT69tP5eZwG10fwfG9xkvbRjwhKMwMPLqhwFsE8gS0EiIxzFZNaCRXjxtsLXwFPL73IUEIvFvkCWgiTbG64LWYqQKx6/dOWLgBevfmIejoCJLAVrpOehoLxu5Vwcgd3IUbAoOW4+JvRvvZOnYYI6tfHWDp4ReZSPnca4l1bdjgXsQI6ixIu5A5N6Wz/gdhsko/wGa6fBFrt57SycQluwX1HidRBTAT3cHroTzzMs/v5Je+zWDbfhCLyMfYoWJ2pRIHOZFz72t4vaw9Pt8e9svAVHYD32KVqyDU5+n07zLGDXpkpHAdFo9BnsE4h4LSwi2Q5HYDcbobnYf1i8sFfYY/e/Pg1H4HHsE5h4AW5QYN1s6qbrIk6WT5H3W3tssnEqroH7sV+g4qSvKsBu5vdYbmutrclObRIlI4/xsTMYd2T79Y4C4vF4AnMGLgZZxdMpgzCF+PjOyTiF5mO+koinwgK3K5qvf3h/Yo+9gOrq6pmYq2Sijquv4yK2kWzAusB52tS7W165udpeQCKRGP1//Fm7eKbexFDnFEg3Z6ffTjIqrq2qqpoAIzB6/+xDWc891tQKv8ZtG/snBv0ze/vVe6zHEjO8kZzb5WV858kIvLTy2fbd/0MM3nupgBF/BK9YMfzz7D4u4Dn8bkxXuv4Fk4XZEkqp3gUAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageeaf51f0b985355e44cb9f95762dd6cd3 = new WeakReference<>(result);
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
BufferedImage imageeaf51f0b985355e44cb9f95762dd6cd3=getImageeaf51f0b985355e44cb9f95762dd6cd3();
if (imageeaf51f0b985355e44cb9f95762dd6cd3 != null) {
    g.drawImage(imageeaf51f0b985355e44cb9f95762dd6cd3, 0, 0, null);
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
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_theme_48_1() {
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
       icons8_theme_48_1 base = new icons8_theme_48_1();
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
       icons8_theme_48_1 base = new icons8_theme_48_1();
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
        return icons8_theme_48_1::new;
    }
}

