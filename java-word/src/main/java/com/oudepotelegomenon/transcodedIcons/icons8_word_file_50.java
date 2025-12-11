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
public class icons8_word_file_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image3b0bbaf57e7aa1dad5f90cb089d576ce;
private static BufferedImage getImage3b0bbaf57e7aa1dad5f90cb089d576ce() {
    BufferedImage result = (image3b0bbaf57e7aa1dad5f90cb089d576ce != null)
        ? image3b0bbaf57e7aa1dad5f90cb089d576ce.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1164);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADMklEQVR4Xu2a6U8TQRTA+cP86Edp0URFjR+MMTEqiYSoPSQFqqQRlaCAYELwAONB8OrWciiFQAsFIkI5FaWSlsNSOeQs5blvTJd2ltYSd7aL2V8yCfN2mnm/zOx7bUJamsoe4oDRti/dYL3CZOitNo2eO0/vyYR0PZd3NN8e0lW6VqQeGgMHWqMNNAabid5XclDk0j3nKjAARbJKXZBh5Pi/rWxlWIvUtvmh8NkQORmtgTPT+0uGHCKto6vsZeQSYS4jpwhTGblFmMmkQoSJTKpEJJdJpYikMqxFbtWPwWOHL+G4cMdJmqbW8PYinV/SsBbZzUjXWR10fknDUmQ3YA6YC51f0qgiEqOKRFBFJGbPiGxtAXQMTIGlthcC8+Lt9oSId2YJcsrb4bDJDmWvBmBlLUQvUb4InsS54lYwP+qGwEL8bRQv4g8sk649NbdMP4pB8SIdninILGggJ5MIxYvUt41Ddlk7HRaheJGH9hEwVbvpsAjZRIKLa+AL/KLDApOzSzten9KX/XDz6Uc6LIK5CNZ8rP1a/L3AD0efj14C6xubcPCqDTzf5uhHUFjTC5VvPHRYBHORU5b3cLnCCcPeINQ2jUJ2qfi+f/UvkMrUPuCnH4H+vgueNI/RYRHMRfDKhMN/7szgRJD8LN0IhWPWNPdOEpE6x5eYOII9hHNN0GERzEWimeMbGibs+xH7rlS89pB48Yu+mDhyrKARnHwJ/huyioQ2wyRhPJlo8OvHcXOjqMyurm+S9SPff8bEd0JWESQzvwFcg9PCHJM9lPuOvAcZ/Au/uLwuPBubnCcFYmllQ4jFQ3aRs7cdYO/yCnOUOpJnJ0InrzcB17n9PtjdXjhT1CLMEyG7iKm6C6ptw8K8iO8RWGKR5y2f4fSND8Kp5D1wQ0ndJ2FtImQXqeFLMJZjBHsMXque0Vkyx1PJKe+ArJI2uFvf");
    imageData.append("T67auG8h+uNxkV0EewYmiFcot6oTdJVOvqNvt3Q8jSpuiD+lHugemYn6ZGJkF0GsfF84ca2JVKnpYOKv58mSEhEWqCIRVBGJUUUi/FcirP6FYzcDc/gnEY3Rul+j5yyKGHwudH4qSuY3W9hCnARf9rEAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image3b0bbaf57e7aa1dad5f90cb089d576ce = new WeakReference<>(result);
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
BufferedImage image3b0bbaf57e7aa1dad5f90cb089d576ce=getImage3b0bbaf57e7aa1dad5f90cb089d576ce();
if (image3b0bbaf57e7aa1dad5f90cb089d576ce != null) {
    g.drawImage(image3b0bbaf57e7aa1dad5f90cb089d576ce, 0, 0, null);
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
	private icons8_word_file_50() {
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
       icons8_word_file_50 base = new icons8_word_file_50();
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
       icons8_word_file_50 base = new icons8_word_file_50();
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
        return icons8_word_file_50::new;
    }
}

