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
public class icons8_object_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image8287dab6274f5b2ba0e1ed0c4e56365f;
private static BufferedImage getImage8287dab6274f5b2ba0e1ed0c4e56365f() {
    BufferedImage result = (image8287dab6274f5b2ba0e1ed0c4e56365f != null)
        ? image8287dab6274f5b2ba0e1ed0c4e56365f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1676);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAEsUlEQVR4Xu2Ya0xTZxjHiZ/mx+3DTC+4tTMTXLZkyfxgYiRLdCPjYocwlswoDqPZB6OLC5WVWm1h7MqIoTXMKXPRjRSIBTlVQaHLKtlm1ARdKAGpbGYhUejlkC0LY8/e5yyHHJ5z6YXqNOs/+SUNp33f3/+c9z2nNCcnm2yyyeaRyivnvU+U+jveLvZ3+oq5zlAJ1zmLCK/9HWeKOe+Oot7Tj9PP/eep8HqXM2kbk42V+DtBC1YmWsJ1vI+foeNIY3LHSnKdt1z07xlPaZ9Pz4R+oqJJcL24x7uSjocxfgbLTR7+lq7257kVjvEn6fGMpdDfZWQid1ColFF5oRu2X+KgetAvgK8r+3zCMYUCwIr/WnTWa6Djmty8kxUAXc0wGA6Pf0ePZyS4BJjAVRSxnOuCqgEOdg6eUwSL4HtkBRhs6V0pGGx7TBz3mZboKpM7/odYQGcdBqMrXCidOyNh8nbxzGvJS0uoXQlW4oA47tPuOIfyCwXwKthD96RzLzl4txE3LC4bKqvGG33dMnmhANvYeHcyu+Nlory0AGJ0TX5IPdIOm7RanHz7QK9MVA28ClRepLC3dxdb+2G1Arram39lbEPjfV6cGDcrFVUD30vFRV78KjQqlZcVwKXkGB+iLmmFXfKxTBZ4tccPZk/070QFdDU3wPBB+DXqk3JYAV6cPBNL6IW28CJx9QKMutA09Uk50gJ4n6eiaiht4g0dQZm4ZgGG3jXxOXVKKex7zagogLdGPLNUlqJ09ou4M/Bs612ZeMIC1hvzxvpfZA/ApINfzKQi+JDa3dcDJ9q/hpHmJhhv+gS+PdUGe/vPLsgrPcjWnh6WSSdTADEcmviReiUd/FYpSuztOgXdrS1wr7EeZhtci4g0NkDg6BGobT8pe4ht6j4P5qMxmXSyBXBDr3TeLqduSeX4cY/5yMkvfh9p+lgmrcbYpx/B");
    imageData.append("sbZW2NrTLhR4/sSkTJgil16Mvi4UzXHAMuqnGHA4lvEu18bZBqeXb3D9SQWTJc4INrthd/M1WOVZyhX4l1xnuIW6Kia6Y5svftD+GxVKlzFbPXy59YBMOtUCeuvNeb1rLJf6yhLZYoGZss3zM5XlV/l9e4b4eucclUoE+wx8v98G3xRVQTD/ORjKy5NJp1oAYU/oa9RXFixAmIpUbQtE7XUJr8rtQweB21UNF9atE6SlUOl0CuisbEM33qmgzouiUEAAr8p0ZcX1cO17kzFytn+w7gdfmQWCa9bIxDNaoAY39EhMc0NTcSWmy1+fmtjzzkj/W2/e7V/70hyVVYJKp1sAMRyeOEa9F0JltaCSWlDppRTQ20enqPdCqKQWVFILKp1OAYMtxAu/YCx1CT3oAuxBFk/6pxcqqQWV1MLkiQ9Q8UQFUhIXQyW1oJJa4Njmlvh69s/8pUQF9LY0xMVQSS2opBbSOYQinvhFWgBvkWmLi6GSWlBJLeg8mKfc/MusQIAtlYjBOfkuPZ5WqKQWVFILOs99S6Rsc4CKqkEl1bi8enWAznNfM1NhWT+zxdJPhSlUlHI5Ly84lJ+/kY7/wJKoCBV+aMRp1Io89OI0tMgjI07DihTgZsfNyQoU0OPZZJNNNv+v/ANK4DkESZThUQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image8287dab6274f5b2ba0e1ed0c4e56365f = new WeakReference<>(result);
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
BufferedImage image8287dab6274f5b2ba0e1ed0c4e56365f=getImage8287dab6274f5b2ba0e1ed0c4e56365f();
if (image8287dab6274f5b2ba0e1ed0c4e56365f != null) {
    g.drawImage(image8287dab6274f5b2ba0e1ed0c4e56365f, 0, 0, null);
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
	private icons8_object_48() {
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
       icons8_object_48 base = new icons8_object_48();
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
       icons8_object_48 base = new icons8_object_48();
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
        return icons8_object_48::new;
    }
}

