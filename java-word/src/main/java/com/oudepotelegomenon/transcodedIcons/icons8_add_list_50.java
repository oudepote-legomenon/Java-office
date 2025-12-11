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
public class icons8_add_list_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagea1532ebde03d1918b6ba3e37e89901b0;
private static BufferedImage getImagea1532ebde03d1918b6ba3e37e89901b0() {
    BufferedImage result = (imagea1532ebde03d1918b6ba3e37e89901b0 != null)
        ? imagea1532ebde03d1918b6ba3e37e89901b0.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1768);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAE90lEQVR4Xu2ay08bVxSH6aLqpv9DV/0nqu7SVap0101FjGkllJJGAiX4QUtIiKiQTRbkwSOeccCJjUxCTAwxtnkWB1zjQggmQYBoCCIEEiU4JOHh1+mcKznyXMMwY801qsQnncUwIP8+7j33HiQKCo74H6Gv5781mDk9k6rnPEbTjdP0ZzJBb7ZcON/QFm92dG+pXYIMGOt5MJi4avpzVQdFGu3ubWAAivAdvWC8nAcZ1iKLy6vQ93CCrIzOZLlEf75q5EMEYS6TLxGEqUw+RRBmMvkWQZjIHIYIorrMYYkgqsocpgiimgxrkZHwNCwsvZAsi9NDLk2d6UYZnU82rEWUlJBlmM4nG5YiSsAMmIXOJ5sjEZU5EkkjKZJKwYe5OUjGYvQb1WEqghLBY8dgxW4nz3gn0CeN0toPpiK4EisOB+ysr5Pnre2drDtAae0HU5F8wlQkubsLq04n7Lx8SZ6VrogSmIqke+RFezt5VtojSmAqgqfW5sxMXk6tZkcPQ5E84vt7OunwBrx0PtlIicSiUZitrIR3jx6R541372E49FhhTcNgKPKp4ok4zK4uQmD+H+h5PAz+Jw8h/CwCrkAweacvOEznk42UyNbyMoSOH4fXfj95Xn31BrgOj+yyufrBPSQEHp4Eu38IqpzXoKS1CoqtBjhtvwgVd+ug3FkLJW1VoOF0UGqr+XiSqygtaSn5nM55IFIiSCqRoL+kCFyBtrF7oOUNYHSZwBKyg2fRB/6lAVE5Z7qgfrAFfm41xoTvfV7YovuGzirJQSLY8Lmyuf0BLrqvw6nb1dA20ZEVfq/qWfBCjedKUsPr4hr+nIbOuy9SIri1xk+cgPUHD8iznK1l6+ojW8k9FCYS5R21cH/OkxX4oLoauInbLVnE6b+nM++JlAg2+1OdDjYjEfL8JroJvX+NS5YvMAm+0SmovWchK7GfRHht");
    imageData.append("Ehaj/5Ki36XLPNCSKuL1H3/izn5F585CSiRXVjbWSE+0TTqzwqULBdLQ79LlW+qHso7aXS2vb6dzZyEpkuMY3zhkJ41NB1MqgnV7qhO3WEprrfiazi5CSkTRGF/Pg3c0Av5gBH6x/g5cyJEVKhcRrFL7he1Ci05HZxchJaJkjJ8XKjL/HDzjQbKt9jpicxWp62+EYt4wSmcXISWSCyNzYfjNUSMKktnY6Xq7vfHpZ+h39AHQNGbDS3SVzi5CbZHuqSE4J9zYmUEyf/tyyfz51gkn9kmMzi5CbRGcncqEsUNNEZwGhO0apbOLUFsk/GyazE6ZQfYqJT1yZcQKxTcN83R2EWqLvH7/FoTbmMxOdKBcRYxdppiW01vp7CLUFkEqOy+TAZAOlIsInn7ChZjQcBU/0NlFsBDpfzoGJbY/yABIB1MqYh5oJifWmYYzX9DZRbAQSSQTcNZZB5d6r2YFUyJy54kbVyOusegL6dxZsBBB5teWhAY1kimWDiinuoXV/PXW+V2h37oLoOAzOncWKKL2v3C4BkNxb3A62dTrSmHjm4V+wQGQDrtf4UqcEiSE2zzy47XqL+nMe2Iw8d8ZTJY6Nau2sf363YFQEKvhfudsMW9Mljv/TOEASIfOLGxs7AncTkW8wS1bIl/g3xM4iuMUiwNgXV8TNAdvkRubG7dDQ8AKlV3mGJ5O2NikJ+Rsp8MCR3GcYnEAJIF5fUxrNUS1Vv0C3hN4xEqdTv8BafWVTeZnl3IAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagea1532ebde03d1918b6ba3e37e89901b0 = new WeakReference<>(result);
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
BufferedImage imagea1532ebde03d1918b6ba3e37e89901b0=getImagea1532ebde03d1918b6ba3e37e89901b0();
if (imagea1532ebde03d1918b6ba3e37e89901b0 != null) {
    g.drawImage(imagea1532ebde03d1918b6ba3e37e89901b0, 0, 0, null);
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
	private icons8_add_list_50() {
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
       icons8_add_list_50 base = new icons8_add_list_50();
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
       icons8_add_list_50 base = new icons8_add_list_50();
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
        return icons8_add_list_50::new;
    }
}

