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
public class icons8_redo_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image1080a19e6a8dc99d31f076551a61f64f;
private static BufferedImage getImage1080a19e6a8dc99d31f076551a61f64f() {
    BufferedImage result = (image1080a19e6a8dc99d31f076551a61f64f != null)
        ? image1080a19e6a8dc99d31f076551a61f64f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1792);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAFCElEQVR4Xu2Ye0xbVRzH8RVNjDHxEZOpiYlG/zDR+IcxJib7Y5rM0N5bJDCGe5EM3BRmssW194FlbKUMWSKIMmeURDYnUzdGe+/tYOMhRJaNbdnW+EKmzMxNYbAlOvqgPf5+ZcXLr+Xh1sJt0k/y+wPu75x7vvec3+M0IyNNmjRpFgKzoJRx7zTfQ/+fcnCi1m2R1VM5ds999FlKwcueXk5SmEVSvSZ7ywP0ecqAQtbVnWL5FZ1+XlIHMkXXw9QnJUAhxTvPskrXZRQT4CXlAuzO49TP8ESFvKddYduVEbaqqhvEqENmWXua+hoavRC0KnWErdlxNMiJymim1fUs9TcsVMiEmFG2tuY4ivnbZGt5kY65YRbbO2432zxPmGzq85zkfjmRxkva91SITkyIk9RrJkFdTNc0Z6BILTIL6nqLrHRAegzA12HJsnhCJsRcYevqToY4UfWbROVVusYZMQsHH4JgqzeLyni2vdVX9EFfWNjzKyv7+g9W4RqKedl82Fv1p8MgOAhisul648IJSiEMGFu2td0n7DkX+SJ00oWyko+9KCbEC0o+XfckGAO8qNbBFo5v/PQHGDgaM9FCGqbl1dW9QYinETjuz9D1X4fdAiKasko9AbnpfMwkUXO2DEWOl7h3kEl7f0uolR+4FPO+qFW6R9iKykhtucTJ2lN09ZPwolIKTkH7VxdiJnG6hmFLz7DcrUfGaIAm0qYLdqz2rzu7/HBSzvNW7TG69kkgrS2BiULW3ediJtnU8BPLKtUC0C4MQuALnFV9zmLbfz+d42aJV0fQMLEsd0T6r37MoHTcJHa7/VZw8hbWHB/XT4ABXlR3IgQ7FQABxRg/dGwiiSfE0fwXyy0/jB9x9o4Yox+PFA7ST1K880wYYuafhFbUGaBCth34k+VsaYOdUI7lWNvupf4xgNqjUGzCehGlEOyc6A7/7+Jz");
    imageData.append("E+iFlO+/yLLLWkGE1vnKpkN3U98YlgrqgxgbctPvU3Yjv6LLz8vKF9Q/mUSFYEZ87d1WPydpytIS9U7qFxezzbU6S/b4sZ+JitjyzcVIBrHYlCepfzJBIWuqv2MWWYMUq+0rKuq7g/pMC1z4a1Zu7/bpd+PtXV4GMfMz9U02kasufECIy89ycvbdRp/PCARSc+H7x6bEx1r4G5rDBuqbbKBSd0HiqcmAwkyfzQova11v1p+eEh+rqnp8kG6d1DfZQHLJpP+bMxDQh/DCrxdSMHErq6W+hgYW3FiwozeoF4LC4Jxq1NfQcIJbXuZoH9MLsTYOMLyNQSW/i/obFqzasCthx8H/qjp2mVjpMTVTf8Nyvc+6jI2hflewPbHI0C6n0m+xsCMfLXd0+PW3QNwVaNagbVYUFEvHGBJe8jyKl3pr4y9TdgX7HbxkQbyoKbMzUOGrssva/E73cIyY3PIj/sgxsykFhk8A+MXx4rKyqieg77uix6wEYwYSABy1MRDlwToDBUwyi27rTEbfMy/gD8bQrF0trO0LUTFoePG37R5g6z88GSmaK5zfXpvO8hydPuyb6DvmDZOkvgQLuAptih/vyVTMXE3+cjDSQdP555WJnVH7MWY2f95/Q79pGUIIgjHDCUolZrM8R4dvY8OPTF80ZzPDCImStVl9hBfddZysDmMHkLetc6ygujeM/diGXWfZhk+8ce2N2hPGEhIFiyJnc78AaVrERtMiaYctkqdnJoPGs53OkyZNmjRp/gVTHelvtwpU3AAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image1080a19e6a8dc99d31f076551a61f64f = new WeakReference<>(result);
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
BufferedImage image1080a19e6a8dc99d31f076551a61f64f=getImage1080a19e6a8dc99d31f076551a61f64f();
if (image1080a19e6a8dc99d31f076551a61f64f != null) {
    g.drawImage(image1080a19e6a8dc99d31f076551a61f64f, 0, 0, null);
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
	private icons8_redo_50() {
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
       icons8_redo_50 base = new icons8_redo_50();
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
       icons8_redo_50 base = new icons8_redo_50();
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
        return icons8_redo_50::new;
    }
}

