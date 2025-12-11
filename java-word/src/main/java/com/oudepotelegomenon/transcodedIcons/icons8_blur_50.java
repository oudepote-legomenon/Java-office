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
public class icons8_blur_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image068facdb8813f7721d36a13092329699;
private static BufferedImage getImage068facdb8813f7721d36a13092329699() {
    BufferedImage result = (image068facdb8813f7721d36a13092329699 != null)
        ? image068facdb8813f7721d36a13092329699.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1764);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAE80lEQVR4Xu1Z628UVRRvNRo18Yt/gF9MTIx/gMaoxO87M9vqgvEJLUKLUsQq3XmsG5fSFqGCUiRQo1FqIzVpS3ceJaFtVMiGrZQmoBQN1NZHW0obKo/uc67nLF3NnimU3Z19NPJLfsnkzr3nnDtnzr3nnltScgf/M7i8vQ8hafuyAy9pnwii9jFtX1ZwyvojMJEoJ2kxp1t7lL5fNuBlTXul6fvwq9t/CAuyrtL3ywIOUV8B3jC9HX8wJD5jG+1X9BBkY7BiVzC6w7jMkJUfnYjxsnGqpISV0r5FC0HSOV7S41u7JhOTQNZ3TTFe1mOcW3PQ/kUJr9d7l1MxzlbtHTKTk0hy/Z6TJkzyF+xDxxUd4Ku/DBOJNPZMp0wC2eCfZoKiR2A5fomOKyqsW/fjPYKs/V5z4IzFG0lu3H/axD7Yl44vGnCiXl2m9Iab1FnLBJLEd2We3hCsYlV0fFHAtbnjftg3pjbdwhtJQh8G+8q0w9vzAJVTcHCSWgdfOtKkzlgMp1zwSpgTtS1UTkHBv9f9IPwqczWtZyxG34wQR7hJzuFYKq9gSMcbSaJXymFM0XhlhXfgPliFZvALU2OXYs2B0xArxizGF5Wbd/CSWlPmOZKWN5JciJUIZMdvUbl5Be4FkKpPbNyfvjeShH2FORV90uXtuJfKzxs4Ua2EiUSb/Ol7I0kcizIgN6ug8vMGMGCkepGcKl1WtwyZgmKcK0hmzIvqc7B8xjGrpYaly0RmDLIKcl4RJMNfAWcMalSmXN0ciIKHD1M9OYWjrudhXtTinkPjFoMypeebcYYyUTbVlzPActm4ytcXosZkww/1y2ylry+Msqm+HIGV4nL59mc/W4zJlptaf8JkciovQe+Q9acxMBsWOThlSzx44XFYkNWnqF7bIUhqy+s7joWpEXbxNZDNi/oeqtdW4FkbjqqXar84ZzHALtZ+");
    imageData.append("PoK/14zL1XE31W8bOEl/EutT2w5ftBhgF7d1X8Q9hfFu9Qmq3zZAyl27amvfPFVuN1f6js7DafMdqt82wJc6uKY5kHVKshTX7AyY8Ht9SfXbBqfSO7Bh77BFcTZs/e5v9tXxKyltqMOpGP1Uv22Ar9Rd1XLKYkw2HBoLs5GJSErb+pYhXIa7qH7bgHcd8Gv9W8+1g2OXoix4IZTStnpnAI/AubtTwWDHQKTGZMqWo3MsbjJ2KHg1pd31QY6DnVOMx3Fp9HVOWIzKhIOjITZ7Nc6ae/9r83VOJpZfp6I+RvXbCsizxtMp+9yM6AX0RufJayntWMRwysYY1Ws7HG71XSyuZVJsSBKND0dNdoLERiPIXCgR1VK9tuNG+UefeHPfcNr7SVvgSmKFMsETx3+dt7zfsG8Y05O/UAfVmxNAUvcCZsDS16MWYxbj5FyMXQ+biQn8BqsUToj2EdtHITZUkxPVcqovp+DcWqPTY0S83/5pMYqy/+w88w9fY5/2z1neIVEGxF4U0vcGqifnwEyYl/R2LOXUHTxvMe52iWNRhqBo7QW8yYLToqwq+Ju9sTsYq+++/awYKyeVu4IxHAsfRM7LqXApYBkHgnQYGFu7ezBW13aBbdeslz3Y5m47z9bCpLEv3vLysvoslVdgsFKHpD0PxvUIkoY3Umb5+0dCL9YPXEfiM7ZBHISwz42gLgIv3ApYXRdE/zN46cmL6mYkPmNbUVTe7yAP+Aep/uQBvLw+hwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image068facdb8813f7721d36a13092329699 = new WeakReference<>(result);
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
BufferedImage image068facdb8813f7721d36a13092329699=getImage068facdb8813f7721d36a13092329699();
if (image068facdb8813f7721d36a13092329699 != null) {
    g.drawImage(image068facdb8813f7721d36a13092329699, 0, 0, null);
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
	private icons8_blur_50() {
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
       icons8_blur_50 base = new icons8_blur_50();
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
       icons8_blur_50 base = new icons8_blur_50();
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
        return icons8_blur_50::new;
    }
}

