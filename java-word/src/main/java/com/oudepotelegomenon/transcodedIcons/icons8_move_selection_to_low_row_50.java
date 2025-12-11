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
public class icons8_move_selection_to_low_row_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image589e176b7fa40d1e5d1d294f1a2b5a4f;
private static BufferedImage getImage589e176b7fa40d1e5d1d294f1a2b5a4f() {
    BufferedImage result = (image589e176b7fa40d1e5d1d294f1a2b5a4f != null)
        ? image589e176b7fa40d1e5d1d294f1a2b5a4f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(976);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACpUlEQVR4Xu2W/08SYRzH/dP6uZ+rH1oraQbLzPUNi1ZbazjdWsUqamY5KptMrNAow77AkC+uw4aABspBSJjal5G2OVbxiU8brHueh7tzl+1oz2d7/XDvez9399rddk9LCx+dzmQity2UEM+pIZwUbcFExk/mjcAuriHzBriDcdHByJkEk7lWiQiGkbncjxmxuKHE9EKhHEpmgcwbgV1cQ+Ysqs/wU0jlv5M5C+yFZ7MRSgRPgoopfdsAfDi1g11co2YSuSVYXPlCxszBXnguN8VFuIiK4SJchIvIDxepjSecsnmFTDlTLIESM+IqjIbeUnkjsItryJzF82kRwrMFKmeBPU8kHZeIXBoW/CeuB6HZsA4Ka5RIz3AcAsvQNPT78tB9T1jnInqBi+iNfybiihbAaLlc59pohOpogYtsFi6ikv9fhPz9a6Hft8gUeZQsUV0tUFuUv71pTBXXYOL1gkRkwB2A1NI61f0TzZvGrdjGp0XpGxl7ESEr1GjexnMRmeEiXISLyA8X0SoSyxbLZJk1LJFQNAmm0zbJg6vBMTIBlUqlfh3NIl3nL7r3GI9VTJ0WUKKt4yTsPnC0fmw+2wMvw29gwDW+KZneG07wTcWg19ZXv9Ze03EwtJupe7LA3mGL9YNEpO3IGf/2HQa4YHcocvW2E5wenyS743oK3sko3BzygFGFTLd9CLwBAUbG/dLrPHgGfffd1D1ZGNq7YNe+DummEUVaD5oh/3FNkfni59+fFpnXGPNHZd+MffAJvFv9Sq1DovOF6ue1TOUsUGZLRZBGMnISiO5EEFJGSQLRpQhSk7ly97GiBKJbEeThKwHS7z9ROQtdi2AX15A5Cy7CRfQsouXPLgd2cQ2Zs9D8Zz90ynprZzXEE83E/k5LTCLS7PMLLY9RZc9pI5oAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image589e176b7fa40d1e5d1d294f1a2b5a4f = new WeakReference<>(result);
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
BufferedImage image589e176b7fa40d1e5d1d294f1a2b5a4f=getImage589e176b7fa40d1e5d1d294f1a2b5a4f();
if (image589e176b7fa40d1e5d1d294f1a2b5a4f != null) {
    g.drawImage(image589e176b7fa40d1e5d1d294f1a2b5a4f, 0, 0, null);
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
	private icons8_move_selection_to_low_row_50() {
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
       icons8_move_selection_to_low_row_50 base = new icons8_move_selection_to_low_row_50();
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
       icons8_move_selection_to_low_row_50 base = new icons8_move_selection_to_low_row_50();
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
        return icons8_move_selection_to_low_row_50::new;
    }
}

