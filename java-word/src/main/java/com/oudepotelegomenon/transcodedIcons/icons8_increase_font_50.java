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
public class icons8_increase_font_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image72972ca8bedcaa2b770b13ac530b09eb;
private static BufferedImage getImage72972ca8bedcaa2b770b13ac530b09eb() {
    BufferedImage result = (image72972ca8bedcaa2b770b13ac530b09eb != null)
        ? image72972ca8bedcaa2b770b13ac530b09eb.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1988);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAFm0lEQVR4Xu1ZSWwbZRRO4AocECDBgQsHlgMIEJuQEAeucOuFRYgmnnHTlKRJXHvGSZzNWe1Z3LhO7Ox7QlZlT6matFCgLSilPXCibEKtQEKcsnt4b9KJZt7YydgxclT5k56s0bz3/+/98/3f/2aclZVBBhlkcF/DxonsiVL5q/2M5eWprCwlm8YeKdhLpZ/d/l6lPjIR28LjCsOJUcYlvkFjjwxyOOlFSFLpn7+qTK7cimuOuvZ1m0topPFHBpBcdbE3vE4TpyZ2zyp2t/znkaUXJHdb6JwxJU5taPE60EtQGF54hY6RdrBO/0tIq4GFa3sJj128oYSGL6g2emHVUExJbWQdiqml46QdkFQNpVVkbFnd2DaXtNM8sGQoROiaUeyl8i90nLQDaPUrJqdP1hsajbJuaZnlxcFyqX9bf29gAeklKigQdKy0we70vUxphVZQGVq3ccLpXJfwEZwfmxPLNw33i7xAL5dQScdLG5Drxd42A60G56+pK85wvueYIt9jSLHOqa8Nhfg6phU7L9+m46UNwPXfhK5ZQ5Jyz9w9ib3nw8urjW2TBp/+ue/UYllOfkE/XlqQ65JfRSkdJLTifT2bLCeGND9oXSqKa8Nreh+00zWta0CvMv2YiQDHpUZ9LAH2QH1JXcSQIMqunRe34Zx4X/PDlgQLHl763lBIU/uUwrrln/RjJgJ8okXe8MaZho41/MVr6mMJdrf0u9g9Y0gOZZflpK08T/NDmp/H43kAEv4nOHje4Ns3+61KL3up+Kx+XKvA2I6Jy+pY+JtUIXA+vKbSatFIK5Rd2Dcr1B+KG6IyjFZY3bJmc4kc9beCFBUiNJbUGdUK7fPKEPBeLKL+DCd9vCvDRn8UAXiyt6i/FaSkEJj8D2wA9UntHXRnxOepvybDXUSGe2a+2ZVqt/wMjdGDbmq0WIVQn30FgOX9r++q1XVD");
    imageData.append("UlLPPG7eO9RfA0jyjUbY4PoYNDw8GV50UH899BtbM2dD5yYuhLYgeK2/f6AAwM0mRwxa8b7uTYaXWqi/BjzJi71GlUNriKj0WqX+euhX36odQDclGw87qXvOEKTJLmzcD2iEhlze/6Yqw+d/MMR2T1/B1j7KOKWnaYyGlBeiJUNpFUt2KeLJMFp+xTnovcRCGqMh5dSCQ9DvqG830crbMqqccMuXqD9FPBmuax3HtuYq9ddAN/AhN7tKqztij5FWaAVVKLtCJ8jye/saJ4h5pQGTDKOaoaodd5x9is4aD7EKoT4xAY/+LZxsiLQamuwmYlSGsbB8T3AdDtp8Om88JF2IjZNE4J6JVqmyWuwK3PIVOm88JFnILq3wrKAJpMo6JtVkotBwPklnjwVMPOGmkeWEt3GSoUUjrVJq8BZ5sqx5AzYoS+ePBbqp42xsI6BXkqHyDdPkKTbvuS+i8CJmajpTBCWb5eW7cu//RyvN2sYvKXCo7nzGyY/TLA6NXVoJUfpihFZQ1bJFFcmq5ZUFtqkM4/XJsrMbcN7k0DwODRsvBuDUNKmV9pEBv5SYzosDDN8gcc9RGUarCY7sgLB8SfM4FLCtAM7+FehbME2odru8dJfGWAWM+2NTm7kbbhtbwQXazvH4H6UxSYNxiu+otCKNHhp2u6AUrTTGKiDZKuiGTU8av4HlAb2gU/iUxiQNoFWzs9GsVla63YOgdQqxFqmqeXjHzgfmaUxSUGnllv4O9JppFYHHj93ucUfDwzTOKo4dG3kQqPlvrG44PKp+O9465ZEfoXEJg3WK7yKtRpbMK1bbMgb7Q75MYxIFvBkOl8vmbnji4k0F3/EZzv8hjUkYsCLB/PLgDv7vQe1URXAD1KeExiQKGOMT7Ibp+GiF1a1RWKxpGpMwoJA++memZvjJJ9nvUXrYi5uewK/2dPy9P085aQYpSOMyyCCDDO5f/AfJSCIQqDfCyAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image72972ca8bedcaa2b770b13ac530b09eb = new WeakReference<>(result);
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
BufferedImage image72972ca8bedcaa2b770b13ac530b09eb=getImage72972ca8bedcaa2b770b13ac530b09eb();
if (image72972ca8bedcaa2b770b13ac530b09eb != null) {
    g.drawImage(image72972ca8bedcaa2b770b13ac530b09eb, 0, 0, null);
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
	private icons8_increase_font_50() {
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
       icons8_increase_font_50 base = new icons8_increase_font_50();
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
       icons8_increase_font_50 base = new icons8_increase_font_50();
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
        return icons8_increase_font_50::new;
    }
}

