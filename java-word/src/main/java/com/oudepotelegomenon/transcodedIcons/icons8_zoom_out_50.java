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
public class icons8_zoom_out_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image344bbc6c5ddf8d34c6fb5e6eb056deb3;
private static BufferedImage getImage344bbc6c5ddf8d34c6fb5e6eb056deb3() {
    BufferedImage result = (image344bbc6c5ddf8d34c6fb5e6eb056deb3 != null)
        ? image344bbc6c5ddf8d34c6fb5e6eb056deb3.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1968);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAFjUlEQVR4Xu1ZW0wcVRiu13h5MMbEy4PPXl5NTDRq9NFLfdP44pPRGI0xDS07syBrA9TuznAtXdjdmd3lWroL5b6AAray3CpysaH1SVuNT8ZEaAkMMIz/NxTD/liR2ZntpOmXfJmwM2f+/5tz/ss5HDhwG/uHz5e4V/SHXxYkxSPKSlQsjw0UVMbTuApSRBUDkXyPrL6E5/hYV0CU1GcFWQ2LsnqNRBjHQsmV2vYRvX5gymgYPG/gGkyO6Pgd98Wy6FVBVkL5xyPP8HfdFHjLQ0+QY83EzUCsU2tLXzQmfr1mzP9p3JC4n0wvGIFop4ZxxMbDgdjj/N05A33Rt71ydKkkdHo1NXdll8P/h32zl43i2oTmldVFjxQ5yG04DjJ6SAhENqO94/rcH/ouB/dDjFd7x3S8zyMrn3NbjsEUIav6mYmfdjmVDdvHLxl4b07EYDnhy9ktYpvtYySG4sYjKW9y27YBgY2YwHLiDthJtWdMp+y3KFZGHuM+2AJkJwR2tjGxF2fp/SV1CWS0eu5D1kC+x5SnZq1lp/2yb+ayucRQn7gvWQHFDnWCG3SS/miHRnbruC+WYbYdVLFR7LgxJ4mi6S2LLn0UCt3DfbIEyiCvoK3Yq2LbzcnflrG8jHw59CL3yRLQ6KFH4oZywdK6xIoQUA5znywBXWxt24ijKfdGDLYNb5AQhftkCd6K2GCculduZCff/1S0TP6unYz1TxpUu/q5T5bgLYunm76e3mVkJ59/9aBl8nftJOx6y2Oj3CdLuGVm5JaJEUq/R0pvUtaiVmWFuu087pMlXN+D57yOjF+5atYRmpEXuE+WYFZ22mOj0nJjTjI5ukB7e3XR5/PdzX2yDBwUYI/NjTnFOaJf7UAHHOS+ZAVRDj2NbhR7bG7UCfb+8AuWlX7ErzzFfckaOO0orsvNfqS4tpU6Xwf2IwCObLzUBau9");
    imageData.append("Y7uM20mlJ61T7fgrTwo+yn2wBYIceY5mZVmQVPOggDtgB7FVwBLOl9TXuX1bsJWC1eWyeNdGuH0I1dY8KOCOZENTBE5RAspn3L4tEP3Ka/SVVqqaevTU5IKRmrpohDuGDcwMllm2MYOYUGk5macnTokQ/OG3yMDayVMpHQLAPmJVYzcZVldEObpYQoHZM/2zmTK5k3tx8MLvRkkosYqYEPyRN7h9W5AvKe+RiI2aU6nNbRFgTUvfJi2BVZyq48iGnqnH18QeG0Vzrw4AFRvF7nqd2KQPEnMssMWA8iHyePjM0D8CwODpARKhaFhuO59Hvkfxwh4bbQV2dsHksB7v3zqNxxUNoLnjM0/j1UU870id2AYZ+IS+th7t+jZDBAU5RKz/1ykg2gnssbE9RddKrU2qoCKexhV/43fct7Xt+DeIsiogc8S6z2WIUMzgVnRKi+/yMa4Dfe2jRL2hbzRDBERBhCipH/Ax7oJh3CFIkUpat+vNA+MZIiAKM0RCPubDXIV3Eom7zP/1ydH1lsGJDBFNA2OGSFkLx0F8nKuAgCNHWwrKY2utQ1MZIiCKBG6IUqSIj3MVto5Ble6CipiWGJnOENH6zZSBGfIEwlV8nKvg84UeoHU/UlgeX0syEcnh7w3MEKXLWj7OVfAcDz1EKXaqqLpeaz87kyGijUSZIiS1iZbdnXysayB8FXzYW6bOfHmiSescncsQ0X5uxiisiGskosvxYpUNsJxIxKXik81a1+h8hoiO72aNL6rqNYqLlG1H+E6B2orCosqG1Z6xC5kiaGaKqho0r6yc9fli9/FxrgMVuwHqYjNEdKXnjaMnGmkm1PN5UsODfIwrQT1SdWldq4a9BERgZrDMSMSPSAD8edeiQI4+STGwBDE1LSmjqLphVaCYEY7VP8KfdT0ghraSVTjd9vgV76GyxP38mdvIAf4GDZ6RGIwqIvwAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image344bbc6c5ddf8d34c6fb5e6eb056deb3 = new WeakReference<>(result);
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
BufferedImage image344bbc6c5ddf8d34c6fb5e6eb056deb3=getImage344bbc6c5ddf8d34c6fb5e6eb056deb3();
if (image344bbc6c5ddf8d34c6fb5e6eb056deb3 != null) {
    g.drawImage(image344bbc6c5ddf8d34c6fb5e6eb056deb3, 0, 0, null);
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
	private icons8_zoom_out_50() {
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
       icons8_zoom_out_50 base = new icons8_zoom_out_50();
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
       icons8_zoom_out_50 base = new icons8_zoom_out_50();
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
        return icons8_zoom_out_50::new;
    }
}

