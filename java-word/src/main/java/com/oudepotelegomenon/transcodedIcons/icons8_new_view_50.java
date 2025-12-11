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
public class icons8_new_view_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee39bcb9f2bbaaea072ebbfa0db45c2e6;
private static BufferedImage getImagee39bcb9f2bbaaea072ebbfa0db45c2e6() {
    BufferedImage result = (imagee39bcb9f2bbaaea072ebbfa0db45c2e6 != null)
        ? imagee39bcb9f2bbaaea072ebbfa0db45c2e6.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1564);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEXUlEQVR4Xu2W/08bZRzHMcYfjT/4R/gH6A8mZj9p1kJ1bMLMzGJICIwRZzQxZMDWZRqnG86yVaa2vdbCCVY2hDk6bK8tbSdrZ9n4VmCDla1AS0fLd7Df7vh4z82d9G6DnlntNes7ef/QPk+v79c9n8/zPAUFeeWV17OlqqOK4upjyonK2kbqUF0jiNkoY/Wx83dQ5hSIijrFrsrac1QTfgU6TNfhV5NL1EYZm/DfAGWuqlO8wYJU1TfiX31noNxDk5BL/vLCz+ThunPNLEj1caXr+1Yjb6LYjTKj7P+CyHMYRL4F5MMTykVuQ+WKUXYW5GgDNtyEXwaj7UZOGWVG2VkQeaPeRfTdhFwTyoyy50HEojyI2JQHEZueTRDfdBBqv8ZYc+epDN0p45kwyvA4CQKJxuLMgx55cXktZTz4IJIyngmjDI+TIBAxKw8iNgkCQTW6tfG48/LNLsA53eyrCz5IxFa5X6dI9CAr4QnobSmBvosVENtY4A6zEhXIUmgU1hbuAZV8WD6LwWGw6ffCKHEE3B0f0DDlLAxaoeX527C+5Gc+CwJBNbq18bjz1AYjrznT8TfaS8zvnW0HwayRMna2vQ+WH9+B2/ZPaKIWSM7r4M/OMujFS5kVejRvxN7A/FYQyE7NPhsKw+T9gGAHQhH6Da8xwSLjDbA0qYDAwGcwO3CShsBZkzTM/Rv1EBo5BatTSrjbVwOujsPMf1tdg+mDZFKLcyNAYIVAhvUp4bdzZPwMWHRvwyZFgtvrA7N7dD6rIGTiL/A6FPCH4QAv7HaOBlTMKs6MXwXXyF24NuRbyQoIRSXB7+0C+0/vgbO1FOaGv+CF3ckTzk/BSveSra0cHI7OjbRAnlazn1YZgCQp8NrPMqWB6p4SUFJcx4IqZmdDq2PSSMt2BHmazR6LJ2D5wRjTF2v3vuWFE+ppjxwIXXGiC9vz4o4g");
    imageData.append("mVC/sQaGf6/mBRPizUgz2Fv2kSatTJ5WaWVCkRkPsyrR2R94AdN1cPBzMGPSOKF666WsgfhutdKNvp95q9yA6XrdfwH1x2aPWrIrKyDJxAZzSs/0n+CFE+rBq4eSFqyoNysgU4MGsNK7ViKE8YIJdXjszMNri1r6+v8OEpy0gYO+U9nxEnrXOQ7Ufyiv+BwG470fb9J9RhE62ZAZK3yNBfnFaOdtl5nwhD8Ad6amwePQgVX/LvRfLucF3c5URA9WrYy06GQ+k1paClDwHFta9We1Tu4BlimfVOLgnQ7D2MwC3PT00DDFgG663MBP8orvPFNORPObL7MA2VYPJnkFhRKyDaMbMt3gEe6zsqr29v3Po7NgoLsCPJ1lcQe+L2rH9ybW/U1scHR9t2qLyGutJdFbV8oT7ksH6dNcZuM+K+uiG7bdrJV1mTSS02aNpILQyrpt+j1xdIWZG2IOPYq+S50i1NKP6DlKi7bIYlJLarjPEZ36Va++QMNdpC+WSQRh1uw+wp2TM/qn5JrN6sJK7tiT9DdO2ioVq8kGWAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee39bcb9f2bbaaea072ebbfa0db45c2e6 = new WeakReference<>(result);
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
BufferedImage imagee39bcb9f2bbaaea072ebbfa0db45c2e6=getImagee39bcb9f2bbaaea072ebbfa0db45c2e6();
if (imagee39bcb9f2bbaaea072ebbfa0db45c2e6 != null) {
    g.drawImage(imagee39bcb9f2bbaaea072ebbfa0db45c2e6, 0, 0, null);
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
	private icons8_new_view_50() {
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
       icons8_new_view_50 base = new icons8_new_view_50();
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
       icons8_new_view_50 base = new icons8_new_view_50();
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
        return icons8_new_view_50::new;
    }
}

