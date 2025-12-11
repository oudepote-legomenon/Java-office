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
public class wrap_Text_icon implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image673aff528765ba530a68889bff5fd6b5;
private static BufferedImage getImage673aff528765ba530a68889bff5fd6b5() {
    BufferedImage result = (image673aff528765ba530a68889bff5fd6b5 != null)
        ? image673aff528765ba530a68889bff5fd6b5.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(3564);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAQAAAAEACAYAAABccqhmAAAKOUlEQVR4Xu3dQagddxXH8YNGCBg0UKgFswjqQmjAIgULCSRQIQWFFzWLQIuJRKHQRdxl4SJgQRdddNFFwU0iTwjYRRdduOiiiyAiLroQDDRIBRddiAQJqFi0nv+bvJB3fv+ZO3Pfu2/+957vHz4t/LgzcwP3/N+dM3Pnb+d//G0DkJMEAPKQAEAeEgDIQwIAeUgAIA8JAOQhAYA8JACQhwQA8pAAQB4SAMhDAgB5SAAgDwkA5CEBgDwkAJCHBADykGCIj8+5b7qLAGbzXfdsrM9lSFDj49Pup+6B+wRAE/7sXoj1OoUENT5+VTk4gDZcjjU7lgSRj+9XDgigHffdk7F2x5Ag8vHbygEBtOVarN0xJIh8/LNyMABtuRVrdwwJImMCANbBrVi7Y0gQGacAwDpY2SkATUCgbatrAu68iMuAQMtWdxlw50XcCAS06HBuBHr0Ym4FBlpwuLcCA9hMEgDIQwIAeUgAIA8JAOQhAYA8JACQhwQA8pAAQB4SAMhDAgB5SAAgDwkA5CEBgDwkAJCHBADykABAHhIAyEMCAHlIACAPCYYYDwUFWnC4DwU1HgsOtOhwHgtuLAwCtGx1C4MYS4MBrVvd0mDG4qDAOljZ4qAsDw6071as3TEkiIwJAFgHt2LtjiFBZJwCAOtgZacANAGBtq2uCbjzIi4DAi1b3WXAnRdxIxDQosO5EejRi7kVGGjB4d4KDGAzSQAgDwkA5CEBgDwkAJCHBADykABAHhIAyEMCAHlIACAPCQDkIQGAPCQAkIcEAPKQAEAeEgDIQwIAeUgAIA8JAOQhAYA8JBji46g77V50lwHMYss9HetzGRLU+Djirlu3AMEnAJpwz52N9TqFBDU+blcODmB+H7utWLNjSRBZ93U/HhRAO8o38+OxdseQIPJxp3JAAG15JdbuGBJExnJgwDq4GWt3DAkiYwIA1sHK");
    imageData.append("JgBOAYD2rewU4KXKwQC0Y3VNwJ0XmW1XDgpgfuUy4IVYs2NJUGPcCAS06K47F+t1CgmGWHcr8BnrTguuAJjFBXcq1ucyJACQhwQA8pAAQB4SAMhDAgB5SAAgDwkA5CEBgDwkAJCHBADykABAHhIAyEMCAHlIACAPCQDkIQGAPCQAkIcEAPKQAEAeEgDIQ4Ih1j0U9LR1C4ZeBjCLLfd0rM9lSFBjPBYcaNE9dzbW6xQS1Pi4XTk4gPmVhUG2Ys2OJUFk3df9eFAA7Vjd0mDG4qDAOljZ4qAsDw60b2XLgzMBAO1b2QTAKQDQvpWdApSFQOPBALRjdU3AnReZbVcOCmB+5TLghVizY0lQY9wIBLTorjsX63UKCYZYdyvwGetOC64AmMUFdyrW5zIkAJCHBADykABAHhIAyEMCAHlIACAPCQDkIQGAPCQAkIcEAPKQAEAeEgDIQwIAeUgAIA8JAOQhAYA8JACQhwQA8pAAQB4SAMhDgiE+jrmzpuuVA9ifsgjvWfcN9/lYe6siQY11jwW/4f5l+mhiAAfvI3fbXXVPxJo8KBLUPHwj8Q0COBzlD+9b7muxNvdLgsi6ryfxDQGYx2/cl2OdLkuCyFgcFGhN+UbwE3ck1utUEkTG8uBAq951T8WanUKCyJgAgJaV9QGXngQkiIxTAKB1H9qSk4AEkY9LlQMCaEv5JnAs1u8iEtT42K4cEEBbbsfaXUSCPj6uu/uVgwJox4uxdodIMMTHUfecu2i6ZjmA/XnZveHumRb2WH9zx2Pt9pEAwPys+0NbbvqJBT7G63F/fSQA0A7rmvBTL8WXU/VR3wIkANAWH6es+3FQLPQh1+J+aiQA0B7rTgk+rhR6n/fjPmokANAm667ExUIfcjLuI5IAQJusey7HlCsEl+M+IgkAtMvHtUqh93kzbh9JAKBdPk5UCr3Pnbh9JAGAtln3459Y7DUfxm0jCQC0zcd7lWKveRC3jSQA0Dab8IzOuG0kAYC2");
    imageData.append("+bgZC71P3DaSAEDbmACAxJgAgMSYAICGWbe8188fFmr5/+n4mv14uF8p9pq4bSQBgOVYt3ZmWcFHCtG63/aP+onuIsYEALTnYZFLET7mjh3EYh5MAEBbfGzF4usx6Zl9NcYEALTFFv/13/VO3HYqYwIA2uHjZCy8AQvvz1/EmACAdljX6Zfi6zHqST1DjAkAaIN1D+mY8ry+V+M+pjImAKANPr4Xi26Br8Z9TGVMAEAbbHzzr3gvbr8MYwIA5mfTmn/FpbiPZRgTADA/m9b8K0t2HY37WIYxAQDzsunNv9fiPpZlTADAvGyG5t8uYwIA5mUzNP92GRMAMB+bqfm3y5gAgPnYTM2/XT7erRynKm4bSQCgn83Y/Nvl4/3KcWoW/u5AAgD9bMbmX2HdQ0fGrhK88HcHEgDoZzM2/wob/9yB4q24fSQBgDqbuflX2PhVgYrrcftIAgB1Nn/z7/nKcYY8F/cRSQBA2czNPx/HbfyioEWZgBY+f1ACAMpmbP5Z1/grDxSNxxjyetxPjQQAlM3U/PPxRfe7yjEWeSbuq0YCAHvZDM0/6045rlr3VT7uf5G34/76SABgLzuk5p+PL7jz7jX318q+xyj3CJyK++4jQR8fX3dvu3+4/wFr4t/u9+4H8TM9hk1v/s1t1Ln/o39fDGp8/MjG330EtGrbfSp+vofY9ObfnP7ojsV/wxAJIh/PuP9UDgasoxvxMz7EpjX/5vTARjb+9vz7YhBZ/2KHwDoqp7CfjZ/zGh8nKtu3qHw7fyG+/zEkiHz8vXJAYJ2di5/zGh+XKtu2phT/xfjex5Ig8vHfykGBdfad+Dmv8fHDyrYtue/OxPc9hQSRjw8qBwbW2ahzZR/lP3HbVvzBnYzveSoJIh8/qxwcWFcfxM94H+tuwS3NtbiPOZW/+tdsxH3+Y0gQ+XjC/aXyRoB1dD5+xof4eLOyjzmUwr/hnorvcT8kqPHxJfenypsC1kUpoMvxs72Ij2cr+zos");
    imageData.append("5dtHuQz5ki15d+EiEvTx8RnruqK/cL8G1sQvrfvK/GT8TI9l3fl2LM4+5arZzX0otx1fsW7iOZCv+UMkALCXj5dNC71PuSx3Iu6jVRIA2MumNwMn3W04JwkAKJvWDCy/5Fv51/eDIAEAZdObgd+K+2iRBADqbFoz8J24fYskAFBnG9gMlABAnW1gM1ACAP1sw5qBEgDoZxvWDJQAwDDboGagBACG2QY1AyUAMMw2qBkoAYDFbEOagRIAWMw2pBkoAYBxbAOagRIAGMc2oBkoAYBxbAOagRIAGM/WvBkoAYDxbM2bgRIAmMamNQO34/ZzkgDANDatGXg3bj8nCQBMY9OagUwAwKax8c1ATgGATePjK9Zd648FH+1rMc+DJgGA5fh4pVLwj3s1bjM3CQAsz7rVs8r1/scL/yN3Nb62BRIA2B8fR6y7P+DCw/83dfPP4yQAkIcEAPKQAEAeEgDIQwIAeUgAIA8JAOQhAYA8JACQhwQA8pAAQB4SAMhDAgB5SAAgDwkA5CEBgDwkAJCHBADy+D9Cezd2DJBLnAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image673aff528765ba530a68889bff5fd6b5 = new WeakReference<>(result);
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
BufferedImage image673aff528765ba530a68889bff5fd6b5=getImage673aff528765ba530a68889bff5fd6b5();
if (image673aff528765ba530a68889bff5fd6b5 != null) {
    g.drawImage(image673aff528765ba530a68889bff5fd6b5, 0, 0, null);
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
		return 256.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 256.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private wrap_Text_icon() {
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
       wrap_Text_icon base = new wrap_Text_icon();
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
       wrap_Text_icon base = new wrap_Text_icon();
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
        return wrap_Text_icon::new;
    }
}

