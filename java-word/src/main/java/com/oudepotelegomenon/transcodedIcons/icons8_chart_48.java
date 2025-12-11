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
public class icons8_chart_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef47dfcebf980e39bd8e9f78bf3cd1002;
private static BufferedImage getImagef47dfcebf980e39bd8e9f78bf3cd1002() {
    BufferedImage result = (imagef47dfcebf980e39bd8e9f78bf3cd1002 != null)
        ? imagef47dfcebf980e39bd8e9f78bf3cd1002.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1132);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAADGUlEQVR4Xu2ZvW/TUBTF+w8gVCEGvrqQdIAVKvGxswELSC0zfwKMCLbCXCiwsRHSMpSlNAjYERJFICTAoYCAVKJSEyERHFUPX4cnHj/buVYSOww+0lEVX/u8c26fb5xkbKxAgQIF/ls8eWv2rtT9asBWrd4xebK7pr+48r5dpq9UEPM1z9+gcO4MPDz6ZPbQnwrpfERsVPT8Cv2pGMW2Saa/SX8qKLLz/NOQPG75ubUVkseHVac/FRTIMsDs0popTVdNeaZqri59jNSF9KeCAjaANTJMivltJ+6EnDy3EB7j+vSnggJZBth35l5+AXjc0prhca3+0OuYg5deme0n75qJs1Vz7UHGW4jHLZMMavXLj1tmYvaLOTq/bj5sRuuW9KeCAlkEkO5PXW+EAW4/+xGpu6Q/FRTIIoDt/qG5Rth91l3SnwoKDDuA2/0rQRDWSfpTQYFeAdLMcRp0u7/sResk/amgQK8x6s7x0nR3DPbiWnPLHAtuWnfvk1yf/lRQoFcAd47vOF0xL775kXNc3gpMu5OHdSHXpz8VFEjaQvLvP/Bnjo+fqpjdF1fNkfmGuf/m1z/nWWOy9w/P/d37rFPfkv5UUCApgDvHpfPyV15P3WiYhdftiEHufdapb0l/KigQFyBujkvn40JITfa+O3lcrZEESJrjcSGkZvc+uy/MPYA2xxni+VffHL/Zfc3uC3k9SX8qKMAAYkLMyA0pYeIMSAi5oXddWDXjwU0uN7rc8HI+9eOud0l/KijgjlHZy7abSXPc8uV6JxytdszKEyfPiSPXpz8VFHADiGkxL29GEoaLk/udN7ryjP5GJ+T69KeCAjYA976tJy0slMcLecyQDytJz/u9rhfSnwoK2AD9zvFB6/SnggI2QFz30xgYtE5/KihgA8R1P42BQev0p4ICbgB2P42BQev0p4ICNkBc99MYGLROfyoo");
    imageData.append("YAPkRa5PfyoowAWyJtenPxW1ut+kyOjY15e7/mJUaDSUr/rpT0XNa0+ueP53iuVOz99YfvezRH+pIL+MyI8Lo9lOflM637f5AgUKFMgFvwEBkiCvGtFfrwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef47dfcebf980e39bd8e9f78bf3cd1002 = new WeakReference<>(result);
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
BufferedImage imagef47dfcebf980e39bd8e9f78bf3cd1002=getImagef47dfcebf980e39bd8e9f78bf3cd1002();
if (imagef47dfcebf980e39bd8e9f78bf3cd1002 != null) {
    g.drawImage(imagef47dfcebf980e39bd8e9f78bf3cd1002, 0, 0, null);
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
	private icons8_chart_48() {
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
       icons8_chart_48 base = new icons8_chart_48();
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
       icons8_chart_48 base = new icons8_chart_48();
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
        return icons8_chart_48::new;
    }
}

