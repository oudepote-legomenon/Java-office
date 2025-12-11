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
public class icons8_align_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image890091d659d556c630e07114f3ec7a2f;
private static BufferedImage getImage890091d659d556c630e07114f3ec7a2f() {
    BufferedImage result = (image890091d659d556c630e07114f3ec7a2f != null)
        ? image890091d659d556c630e07114f3ec7a2f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1284);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAADi0lEQVR4Xu3X2VITQRQGYMt9F8V9RxTUJ9FrvccqywVQVFRQ2fd9c1cUFN9EyqdgT4CQEEIW7n/7MNNhOOnOJDWEUKn8VX01Fz1fzflPJdu2ZZNNatLQMTBaXtWM+2WVuFtU8pc/3/IRAEQB90rAn2/5ZAHpTsYBdtdPYG/jJPY1TeFAyzQOts7gcLsLRzrcONo1i2PdczjeO48TfR6cGljAmQ9enP3ow/nPi7jwxY9L35Zw+XsAV34sI/9nENeGQyj4FUbhSNh1c2TlFr/fcVSAPQ0GYH+zATjUpgecfm8Azn0yABe/qgHXRyJ0XPx+x+GAXXUSMCkAUwIwLQAzAuBCTqdbAGaR2zMnAPM42e8RgAUB8AqATwAWBcAvAEvIGwwIwDKuDgUFIITC32Hc+BPZ+BGNBYwLgDFGBKAxIgCNkQ5AY0QAGiMC0BilFSB7oALQGBGAxogAsgcqAI0RAWiMCEBjxO93nHgAXZFVAF2RNx2ws9YAyCKrALoiqwC8yPx+x7ED8E2U06kH8E2UN5gWwFhMkRPZRLIHdpuI3+84iQB0RVYBdEXeNMCOGgPAi6wC6IqsAsgi8/sdJ1GArsgqgK7ImwbQFVkF0BVZBSgYDrn5/Y7DAdur9QC+iXJ7OEBf5PyhoFv04Da/33E4gD/f8skC0p2MAxRPAKWTwJMpoGwaeDYDPBen3AW8dAOvZoEKcSrngDfzwDsPULUAVItT6wXqfED9ItAoTpMfaF4CWgJA2zLQLk5HEOgKAd3i9ISBXnH6IkB/BK6BFST/j00FKDEBTwkwbQBeWACvLYC3BPAYgBoLoIEDAnpAb2QNwd/PNhzw2A7gNgAVFgB9BQmoJYDPADRKgDitFkBnyESETYQErCD5EdYBSglgjpEElKsA5hhFAd71gCYLgMZoFSC/QqoAxQSYXANQD1YB5leQABojCaAeSACN");
    imageData.append("URTgTwcgkSKbgLhFNgE0RhJAY5RSwKNxAyB7oAVoNlHcItttolQAlEVOZBOZY6TbRFRkCbB+Bf5+tlEBHBfZwSbi72ebuABLkaMA13pApQWgLXISm4i/n2044KEJUBXZySZaV+SUA8wecEBMkRPZRJYeKDeRLPKGAcagLrICYFtk1SaK95MijOT/sXHAAx2AbyJzjHQAZZEDsUUmwOoYheDuW0Hy/9g4gD/f8skC0p0MAPT/k4A7RcWj/Hk22WRI/gOfQc0P94PnVAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image890091d659d556c630e07114f3ec7a2f = new WeakReference<>(result);
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
BufferedImage image890091d659d556c630e07114f3ec7a2f=getImage890091d659d556c630e07114f3ec7a2f();
if (image890091d659d556c630e07114f3ec7a2f != null) {
    g.drawImage(image890091d659d556c630e07114f3ec7a2f, 0, 0, null);
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
	private icons8_align_48() {
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
       icons8_align_48 base = new icons8_align_48();
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
       icons8_align_48 base = new icons8_align_48();
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
        return icons8_align_48::new;
    }
}

