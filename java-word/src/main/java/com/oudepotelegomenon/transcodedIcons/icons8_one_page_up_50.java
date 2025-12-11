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
public class icons8_one_page_up_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee658fc219453fe71e2978dd0d80f8edf;
private static BufferedImage getImagee658fc219453fe71e2978dd0d80f8edf() {
    BufferedImage result = (imagee658fc219453fe71e2978dd0d80f8edf != null)
        ? imagee658fc219453fe71e2978dd0d80f8edf.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1020);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACxElEQVR4Xu3Wy24SYRjG8d5Cb8G999DEXoC68wbqvqCM2i7qqQQUKlKg0nKy9gCl1RBIU22oMxwCYtSWaALWAsF6SNyY2EUX8zofCQS+OTDAfNOhmX/ypAkseH+ZlHZkRO+cNemkrxlcjEmxzdP+G076Ev45xLvpzmSmA/nTh+H9EyVm8qRZo4thjU+ZK/hnEc3kyWS9ySrQP0GRPVj9CDOhAiDMpIO+jH8esZSGmMMHsJqqQiRbb2AMDuYq/plEIgUp/wV1Me6do68vcr94B/W7dkjfGGrWNUpZlsZ7WYgu/wvslWDzw3fewvkKRAs13rFSwyF9YUxW7xhlXQSl536V5h0sNiFIz5gmRKm+HNYakDs2H3hiWd7RQhOD9IRRGnJYO25ASpU6THEYOU/GHDmAu9zXr32zyJuNm2khA8Z5huV+XsTvb0UKgpKLCWV/wMKbiugc8TL3VFKA/qPA729FEoKSi+k2BDG4mTH8/lakISglMJqAoAbFaAaCGgRzZpC93CfB+SLbjfe9iRzvWKmpDjn+/QcWwwnRPVuLwz3nMtz3hHnHSk11iJxep9/D4+dx3rFS0yEk0yFqQ1LvivhLHQ0FJF0owvXbc/jLHWke0kRM3LLjb3WkaUg7YmghOKIbZDe3D6FEb/+mEIegX2wcgfa5XBXdWoKGYOwtrOergsMRxCFCT0KJ4QiikNK3OhEEGo4gCmFZgOWXu7wjlBiOIApBsZwmuLHDOwQtus2Ibi6wBVbfFjyJMoLDEcQhKLEnI1WS+4LYSBZ4x0qNOAQlhJFKs39HUDhGKk1DUO0YqTQPQTUxUg0FBIW+zaQaGki3zhXEEoy1DpQ7TUJmnCtHfqZuMLqYcbmjXMwofn+rs4JM2wNZ/JaB0iEDpEOkakI8K7ETtTbrXj2dsvkz+C0DRdmWLlAWr1n1PfJO4LfoDXv/Af2stC2G");
    imageData.append("LByvAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee658fc219453fe71e2978dd0d80f8edf = new WeakReference<>(result);
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
BufferedImage imagee658fc219453fe71e2978dd0d80f8edf=getImagee658fc219453fe71e2978dd0d80f8edf();
if (imagee658fc219453fe71e2978dd0d80f8edf != null) {
    g.drawImage(imagee658fc219453fe71e2978dd0d80f8edf, 0, 0, null);
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
	private icons8_one_page_up_50() {
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
       icons8_one_page_up_50 base = new icons8_one_page_up_50();
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
       icons8_one_page_up_50 base = new icons8_one_page_up_50();
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
        return icons8_one_page_up_50::new;
    }
}

