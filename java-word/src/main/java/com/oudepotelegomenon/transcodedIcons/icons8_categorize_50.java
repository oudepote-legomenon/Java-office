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
public class icons8_categorize_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image04e875d7ff56ae4d70f70992cbbe24c0;
private static BufferedImage getImage04e875d7ff56ae4d70f70992cbbe24c0() {
    BufferedImage result = (image04e875d7ff56ae4d70f70992cbbe24c0 != null)
        ? image04e875d7ff56ae4d70f70992cbbe24c0.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1668);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEq0lEQVR4Xu1YXU8bRxTlNU/lfyTlj7TGQNWSFB4DtClJpIKztrGB4BZcL4gC+UKqwATakFSoD+BdPuSkgZemaUJpFDVUCUmA59jKg/mQYDpnrDVmZna9u5A2D3ulI+zhzr337J2ZneOyMs/eY+u/OFreG0g2qoGk4haYH1eGP+BjG9b/S6a8V8s2qlpWcQvMjy+8kedgJJTxzcHo5PaIOpNzC8zvVSY2ZGRAIqFl1yjWaUELboH5CT37Qkom0ZpsQhGrKxny/Olb18B8xEm0jjUIOfRsE4rou7N+gv+fE8N8RiaVEXKUqYGxzh/U6S2+MDdAHMQTcuiZTlrAPX7cjSEO4vHjHhEZPCIOzCPiBB4RB+YRcQKPiAPziDiBR8SBeUSc4H8lAmX3rvUIlF3iXeuRvEKc2DgOhdinjK+bKkSq7FAEr/qcgM3XM8+lChGG5HiSFPEjoEFGwjAkx5OkhOKuQeebkvDMM8/sWaI1WaFeSjbzP7zZAp3Xp4x8yMfkzRfSKnzhVLMvOB3yhWeUQyg5lmr2R1LWOfqCN0O9gbG967Ep4Vi1A8zDfBpH4WMbRgsJVYZSe590LuxUR/S9+u7FXH1PHp91pYWxM9/8uu2PaPtnuu9v4fvp2N0c5vvDmjwHOoEilvRV4SXnBIv6M4I4asvNU3wOdAJFNA09Jv42jbSMrhJVzzLgMz/W8fMmqWmfI2e/f0gSWqbgVxWdJYjzUWhayFGmtoxewBPlC3ODa11TOcTjc1SGZy6gEyj465FnhYJbk/8wEsVjjETHPDnb/3uBRLFfbVc6h3h8DuGu9Vv6BZkYmKN/14RCiyHzM7tr+YOpy9WR2b1SnWi/s0FqonOkYeAh/X7QiWK/up6lLV8oJeQQiKA4OkbGB+eE4osh8zMjgsR13UtbViSit9dJdfssaRz8w5SEIyJ4wijuQcmOiH6WRHry");
    imageData.append("RGTFMRJ0/TcNPaLLyZzs+eG/SFVE30eH+RwCkaOgFBHZnojc3siTGHxU6ITMr/nGEzqmk9rY3R1bHTkKrIjQI3aXLy46KXbCikRwYs3+0pJBtrFlMCPycWim3x9OHVombZOvsUzIl1eXLZfTV9dWmF/4p5fs+5GIyDa2DGZEkPjzb+9vF0jcesWKO3f1z0LBMhL4P/zgb4whjmsiso0tgxURY7PjyaI4PGkzEugQOsVI0M4d8qOdRYf5HLaI2EUpIuEf8yTOXT/oBL8n8iQeCyQMv08vp3ddd8QurIicjt3b4TshI/HFlWV6AOgkckskAT/be8Tuxpb5mRHBuY/zH+8Bq+WE0wunGN4rZn62idjd2DI/MyLFe0RWHN4feKPjzW5FghHptknE7saW+dkhIhaXYXcr3LFw17Iigc+4s8nf7P/R7bc2ls6Je+KAREcRCd6veKymfX5XevuFsoOOgJ7gC3OCRe1vpkfil5In+RxQdtAR0BMHeyLD9AZ0B67upTqBMewhxPFFdCEHMyi7Y1GIyniAj20YlB2KQGeYAqTKjylAqgQNVQiFCKUIxciP1XTO72B+ZVg3zcEMncGykPzwVhKYJ1OGvLHO0GVBC4oDVUHtO+NzyTE6T6oMPXvP7F+RjAMJauLSCAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image04e875d7ff56ae4d70f70992cbbe24c0 = new WeakReference<>(result);
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
BufferedImage image04e875d7ff56ae4d70f70992cbbe24c0=getImage04e875d7ff56ae4d70f70992cbbe24c0();
if (image04e875d7ff56ae4d70f70992cbbe24c0 != null) {
    g.drawImage(image04e875d7ff56ae4d70f70992cbbe24c0, 0, 0, null);
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
	private icons8_categorize_50() {
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
       icons8_categorize_50 base = new icons8_categorize_50();
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
       icons8_categorize_50 base = new icons8_categorize_50();
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
        return icons8_categorize_50::new;
    }
}

