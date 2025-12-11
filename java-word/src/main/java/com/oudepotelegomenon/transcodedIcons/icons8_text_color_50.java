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
public class icons8_text_color_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagec06573f853044914735966bf0929d0d6;
private static BufferedImage getImagec06573f853044914735966bf0929d0d6() {
    BufferedImage result = (imagec06573f853044914735966bf0929d0d6 != null)
        ? imagec06573f853044914735966bf0929d0d6.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1904);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAFW0lEQVR4Xu1YW0wcZRSmajTGxNuD8d0YffGa6IMvmmrigy8mivHBpmnKzCwYLBSancvCItcNy86FDfd7uZSyAo2CZSm3ti8FtdaWxETjpdY3L/FBBXZZxnNm3WTmzNCysMsuhC/5ks3OOf9//pnv//4zk5NzgH2OPLd8mOUV9+2YJygMzcs6uERtubiqLcLX9/zrxFO+zhVWUDYKSusfp7lZA1bSnoAi9f6JK/q5i8uOHF9Y1j8sb1pl+EABzc8aMLwinfi4dZUWT1nT8smGy6NdpvlZAyjuW3/Xp7bCKbvHL+vw5GKuEv9jdIyMg/OoT6KsBiZNslq4oYdmrhnE34n/DXmVBdeyctOjrIoqrbLqHLuEd95g1/gly1Opbg7FXFLjHB0n43CSla99TOck9Sqyrm3Mcq0rvsj1497Ao3SsjMHlUZ6Ky2rRUmxRdStYrczD0xKKq9tWzNdQXgWe4BrLB47R8TIGRlDKi6qsshoOf2VIinMHnssTlefx95mpLy0LrWoaiblENUzHyxjgEPzO322VVXBgCmX1e06OfggJMb81DoYtMR2jC4a88vnmR+iYu47NZCXJ/VFGVLoTcayg9pQpgxFzzPj8DZBXY4Th5SPmMTMClpe9J6n+ocB8jxZh3Oo7iThOkN91SVp0bP66ZcGVwWFwL23SPGZGAG71fUP3Z5bi0HZhg8eOepWHE3GFXu1BlBEehubY9pAhryheN4+7q2CFhqcNWX1ulRXaLizwCo3Pl9RFX/u4JRafUD7KSwi8T+N3DeBWFcU17RZZIYtAami7tngHG0ZWNA6ts5J6jsbvGsCVfqCyMtsujd/MhltH5nRWVFY/KPE/QHPSDtYdeMZJVlbbpQAbhmvBAasNj85/o6MRoCHQjLQDFlHpJCu0XbRaGp8AK2q9HmXAYsPIcnVwHQ7HEI1PO1we9Ucqq4Tt3u7O");
    imageData.append("sryaC4djFGPNuS1nZ3VOUFaKiwP305y04bigPouyGjy/ZCkGO1xquxSs2/cQ7AebDY/OXddxgTDu2zQnbYCTuKqk1i4rtN18SVuk8RScpCz5OqzdMLJMHYiyojpE49MG2Jg/BXqsskKitaLF0niKzWy4ZXhG50T1n8JC7T6ak3IkLJTKCm2XE+MvUVslteHROXAvUV1nRfktOm/KAQdddUlNu+0Dw8iFq9CaXEyKmEPH8cj9YBbKaTpvygGyuin3TtgKSBWbzlxAef2d6/XeS+dOGVzuhhdQEkNTX9gKSBVDs9fAhtUYSPhNOn/KALKqLanttG3SVFMMnI64RKWTzp8yQEf7i9w7aZsYO1q6kbdK2g0jg4PTuOn/8nq999AadgxwkhfhiYDT2GWFVgovWM1wvryRDDHHyYZDM1/jImPQ6rxO69gxGEH2ldZ12CaNd7uyjrZMc+6ExJ4bDlttGMn7+yKw0Faas2NA13pL6ZuwTYgfFDhJ+8O5270TnLth5P9d9J+5uSN306xtg+HVlwxZhe2ygk42ykFHS3O2CpBPn1M3jGcMXIvBm+OrNGfbAD3Xl9Z12g7BeLfbGMGOluZsFXmC/J5TN4x01/esgfSCNGfbALf6Vemzu1Xiq/pOPnviNy3smGk3jNT6zxsvaeBed9G8pMGJgZfjbmXfkGidcNIv0ZxkAXsMumG7DZ+dNoxkg5G0V2hO0oA77v+osiVK+yQkfiaFiUSakyxwDByLjo88UdkaZQRVoTlJQj8Ek9ykh5iZaKE0K1nEzyj72Cbe2p4rHiALcLTD/dqRjlMVe4lYM11HDl441i2snwzVruwFYq1YM12HsRAMmP55Vt8LxFr3/0L2hbT2zWY/QJbgP393NHeqmzYiAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagec06573f853044914735966bf0929d0d6 = new WeakReference<>(result);
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
BufferedImage imagec06573f853044914735966bf0929d0d6=getImagec06573f853044914735966bf0929d0d6();
if (imagec06573f853044914735966bf0929d0d6 != null) {
    g.drawImage(imagec06573f853044914735966bf0929d0d6, 0, 0, null);
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
	private icons8_text_color_50() {
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
       icons8_text_color_50 base = new icons8_text_color_50();
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
       icons8_text_color_50 base = new icons8_text_color_50();
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
        return icons8_text_color_50::new;
    }
}

