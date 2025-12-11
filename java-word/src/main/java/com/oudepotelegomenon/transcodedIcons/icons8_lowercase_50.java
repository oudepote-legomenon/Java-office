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
public class icons8_lowercase_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image8049e241cbbc49bf37a9de1c4299ae06;
private static BufferedImage getImage8049e241cbbc49bf37a9de1c4299ae06() {
    BufferedImage result = (image8049e241cbbc49bf37a9de1c4299ae06 != null)
        ? image8049e241cbbc49bf37a9de1c4299ae06.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1112);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADCklEQVR4Xu2Zz2vTYBjHd1YEPfgXCP4Dil49eBLEix4EYShr0u4giqt9k5TOTdTVuSRvFbW2s1hwTqE/kKnDw2a34i56mBOvevEfENHaH8T36aikT5ukTbJuwvuB55Lnx/f9pm/IGzo0xOFwOJztQiTaWYFokUEEaGF93wgq9P3FiQdVcjvzaysDNEAL6/tGKJpYm559aRRLn7c0QAO0sL5vmI3E6FxdkDTDKroZhmu4zhwwc6BG8kufDPbT1wRJlQNEPY5DlOkXKyOQw/UQMAtmwuyBGXn4YskQZK1y7sr0blwDWG1BuwUK48ldIpsJs+3qfKG1wJj+tB6U9RzOt3BjBBAVPRdLzNWc6jwDw+OpYnNbiZJ6GudbuDUiEP1MUKa1qUcF2zrPCIpehodSlLTfVtsKcG0Etheb3Xz4mRbO+8YIoYc2H+aZIzhnxq0RAGaDBmjh3MDxYmRHwY3sNPwwIka0Y/jN7ykUfQVrOOKnkXS+5Dkm7s73rNuGn0agL7uwZqiZhY7IFMv/ZuMchJ5907duG34bCd9K/2Evyq+hKC23gh1nfpg1oDak0A1zTYDojXR+pS/dNvw0ks6VYJGNEXLnoDmPNaAWesw17OWaHWM3oR/dNrCIFyPNBUp6FuexRjcjgkIPsOubnxtuTgpYxI2RELm/r3XEPy/R/R35HowA7LP5qOuTAhZxY8QJrGFlxBNYhBuxAWtwI3ZgEW7EBqzBjdiBRbgRG7AGN2IHFvnvjFwIx/eIZOYEO+R9szICOaiBWtzfC4KsHmbnp7go6z87jMh0VSDq8PC4thf39QQbflJU6HqAaI2grNevxjOVVO5dhxG4BjmogVrogV48rxtiRD3F+r4LkmqEb85WtCevjOdvP5pml4zJe/ON0Wiiym5WTZToIp7hSEDSrl2aTFYfF1aN3PJ6hwEcUAO10AO9eF43oO7y");
    imageData.append("9WT12eKHjnnmKCxvGDT7uvkL4RmOgAjbszX8h41TQE8/RnrVGLuRqrgzAt8NkjrlKlgvntcNNxp4BofD4XC2jb8UIVw6XLZ6VwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image8049e241cbbc49bf37a9de1c4299ae06 = new WeakReference<>(result);
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
BufferedImage image8049e241cbbc49bf37a9de1c4299ae06=getImage8049e241cbbc49bf37a9de1c4299ae06();
if (image8049e241cbbc49bf37a9de1c4299ae06 != null) {
    g.drawImage(image8049e241cbbc49bf37a9de1c4299ae06, 0, 0, null);
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
	private icons8_lowercase_50() {
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
       icons8_lowercase_50 base = new icons8_lowercase_50();
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
       icons8_lowercase_50 base = new icons8_lowercase_50();
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
        return icons8_lowercase_50::new;
    }
}

