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
public class icons8_eraser_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageef2c760a6bfcad8d0e1fa0402159a255;
private static BufferedImage getImageef2c760a6bfcad8d0e1fa0402159a255() {
    BufferedImage result = (imageef2c760a6bfcad8d0e1fa0402159a255 != null)
        ? imageef2c760a6bfcad8d0e1fa0402159a255.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1168);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADM0lEQVR4Xu3X3UvTYRQHcKmoIPoDor+jl7t5H0YQXgbdGMQ2yuyFbbrf1Eqazbn9FjjTqb9yyZxlYFG7cGqmLQgh7cJefElHBaEYduFIT89ZPGM8c2+/tz2DvnCu9tue82EPP86pqPgfZTHZfa0mu7hkdvjiJkGUBEHYxz7DdUjDB0njS8YGEQJDUegbnoDaJj8Y7b6Nyzf9R9jnuQwijA7fSt3tTpiY+QJvP6wka+r9MjS4HxKMuMk9ploI7Tc5fMvkKsGrmYUUIh1jb/+Hsbp6j7Lf5yIUQZqEByNvIBKbhxgDwZqe/QqCp59PDIsYHp9LVllhsiHKCpMPURaYQhFcYxBBDk4ipAIQXGLkIrjCKEVwgVELUVKM2ghaumLMZs8BMsWukIFPVQSt7JhlENoR49tQPDXjD1xp7pi+YHGDW3qe0YRaFYl93BWDs1ltsx9wBWB7KziIsLoCg4JHSvQ8GYWL9R64PzSW0YRalQ0jPZ0A3GfY/gpKOuLztzX4lQAYfDlVEkx3eBTI1V5ke8yb3RC0QjpjcJ/B5czcKDrZPnMmF0JfzDzZZxbhKlnOcNNk+8yZ6lBor8XVPZALQSuMGJsHOsPRjCbUKHw7mh33gMxycdw42V6zphiE1hhE4KteF4RWmJIg1MaUFJHCRKYVYbhA0JKL4QpBq1gMlwhahWJkIzAWVyCoJYJWPkwKIYirRSNuOLvOWl3dfz7Ff2YcrEVlwyhCYMjoEQw+G99mD9SyWEwKYfcWf51obG2Bx6EXkzvsYVoXnZpxn0GEUe4/QWNxdtXY3X2J1bXNjMO0rt7hKOByJvs6pYf8wB6bOzDZ0jGwFV//nXGYVoUvFnzB4KapGEFT1yodsrb1vG7peKQLZuH7OjSK0hZea1wR2H4URS+MpggarTG6IGi0wuiKoFEbUxIEjVqYkiJolGK4QNDIxXCFoCkW");
    imageData.append("wyWCplAM1wiafJiyQNBcu9N1mDQaw9ksfdDEfUbwSgnyWZh7BE0SQwZNnJpxBegfie6QVXnbWH939mTl6aZjhiqH1nXCcKqS7UtWcGrGFeBSk/ddzfVbP86cM84dN1SN6VUEc57tqezzF6t4oVKyyVW5AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageef2c760a6bfcad8d0e1fa0402159a255 = new WeakReference<>(result);
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
BufferedImage imageef2c760a6bfcad8d0e1fa0402159a255=getImageef2c760a6bfcad8d0e1fa0402159a255();
if (imageef2c760a6bfcad8d0e1fa0402159a255 != null) {
    g.drawImage(imageef2c760a6bfcad8d0e1fa0402159a255, 0, 0, null);
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
	private icons8_eraser_50() {
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
       icons8_eraser_50 base = new icons8_eraser_50();
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
       icons8_eraser_50 base = new icons8_eraser_50();
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
        return icons8_eraser_50::new;
    }
}

