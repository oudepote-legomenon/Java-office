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
public class icons8_height_100 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image2b02060579e8401b13277fe3d7cd121e;
private static BufferedImage getImage2b02060579e8401b13277fe3d7cd121e() {
    BufferedImage result = (image2b02060579e8401b13277fe3d7cd121e != null)
        ? image2b02060579e8401b13277fe3d7cd121e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1240);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAADa0lEQVR4Xu2du24VQRBEOyDkkQMSASlCiK8ABAE/geQvsZzyiAiwJZBA/AiOCQCBHICJiHkHMG3flWdn9j7mdu11z04dqSRre9eq6ZJ22g52RAghhJB62An6GfTPuQ6CbsvEuSH5wj3rUCYOA3HIdtB3yRfvTU28skgjnEkvkNPjftC3me4lNbJhrkl/P9JxWgcHUsCdoC8zWTbNs0HvJd+M9ZrW1gXlrxp0oV3zPie1El5IHkYnra0Lyl81IBb8QPIQUuk964DwVxX6GtCFqm4ltVXQPWKVf72su59Y/TWF7g3vJG/+PH0MOn/0JBmF55I3fZleHT1J4GxJ3uzXK17TZwmQ60E/pN/kT0EXkmuqc5KPw7+CbgoZpHTO16Zr8+MG64bdNTgNRNFauvF3AS6j1F/1lI6Ve5I3PX4FpbWOoVfcblSfR6m/6ild8F/pN/Vlv5w1PUbvjWt/+uVBSv1VT+mcvy8nDfog+Ri7KBC9V5/pam/65UFK/TXH5aCHQY+CLiY1ZVEgyiU5flZ/h/5MRmZZIGTDMBBnMBAj6DkfHQjan3vQYyU6ELQ/96AXzECMoOd8dCBof82BDoQYYSDOYCDOYCBG0HM+OhC0P/egx0p0IGh/7kEvmIEYQc/56EDQ/poDHQgxwkCcwUCcwUCMoOd8dCBof+5Bj5XoQND+3INeMAMxgp7z0YGg/TUHOhBihIE4g4E4g4EYQc/56EDQ/tyDHivRgaD9uQe9YAZiBD3nowNB+2sOdCDECANxBgNxBgMxgp7z0YGg/bkHPVaiA0H7cw96wQzECHrORweC9tcc6ECIEQbiDAbiDAZiBD3nowNB+3MPeqxEB4L25x70ghmIEfScjw4E7a850IEQIwzEGQxkw1wNehL0NOhKUlOWBaKf9Xssx79DPxdIEkrn/Ldy0mzrRzD3++VBSv1VT8lYqWdL6add");
    imageData.append("44brp19jFgWi98a13/3yICX+JkHpgp9J3vStqJ7WOvSetLYb1edR6q96Suf8TX9qvNRfk/Bj/A4ZegUNHU0xdC1+xREgPNDFGTzyaASsc/7Yh4JZ/VUHYqzksXlAUAvmwZIgUHP+WEevovw1CQ8ndsjdoK8z6c+EEAJkR1b7O+K0dSAN/B2iG266cM86lInDQByyLf1R1auaeGURQgiZDv8Bn3FEBtJ6KBkAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image2b02060579e8401b13277fe3d7cd121e = new WeakReference<>(result);
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
BufferedImage image2b02060579e8401b13277fe3d7cd121e=getImage2b02060579e8401b13277fe3d7cd121e();
if (image2b02060579e8401b13277fe3d7cd121e != null) {
    g.drawImage(image2b02060579e8401b13277fe3d7cd121e, 0, 0, null);
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
		return 100.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 100.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_height_100() {
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
       icons8_height_100 base = new icons8_height_100();
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
       icons8_height_100 base = new icons8_height_100();
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
        return icons8_height_100::new;
    }
}

