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
public class icons8_3fr_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image565d296e2e6f892c46599fcab1bd3ad6;
private static BufferedImage getImage565d296e2e6f892c46599fcab1bd3ad6() {
    BufferedImage result = (image565d296e2e6f892c46599fcab1bd3ad6 != null)
        ? image565d296e2e6f892c46599fcab1bd3ad6.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1032);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACz0lEQVR4Xu2az08TQRTH+cM8erStnPU/8OJN2xI18YCJvzX+CCGYmHhQY4hxt1gogq2IBaKiiAq1JKJgQLDbbnfbbrvPfbNM3c4qaePMFs18k2+yndnOe5+ZeTM9tKdH6h/SgXhiXyimHBPiqJIIR9UjbEwhCkXVU719I9bh/rTB2+GYCpF4AsKxxEk2LnchyKH+jHl2pAC8jSAnhrLQS2AUsTCiQd7mv8Od1BIcdGAiMfU0G5+bggBBCYcJCkQ4TJAgQmGCBhEG0w0QFHeYboGguMJ0EwTFDUY0yHAmD69zm7u6b/AFuTQjsUdH2fzalmiQThw6rkyy+bUtkSCdGHPAXNj82pYE4WwJQiVBOFuCUO0Gcv5xAR7M6ZD+aMLoggHXn2gt/e/XavBNqze9umWR9gvJAnxYr8HqtgXrhTrkNiwYXzTIeGyMQEDuZvWWnxNmzYaBp8Vm/0ax3tJftWzSfmlUa7ZpRgMatvs8/7nqixEIyNWUBklnJe7P6rClN0gy2U8VH4gyXybvXkm5K+YFuTauwcNXZfJs1W0494dVEQri9exKhSQzt+IHGX5ZbnmXBbk5UWx+xj52bLRwEKwL1ZnxctWGmjOjtzIlHwjWD265GxPutmNBxt4Z5BnriB0/MJDMktlMatqzrbwgVGs/3ES9ICXT3ZIFp1a8k8BaOAgGf+bAGFW3YlPO7LIgXx0APKUoqBdke6e2EISu2O8sHIQatxcKk6dt7dbIonNMo6aWTd+41IGB0JNns9Q5CJ2ErtVI4o0BM/kKPF+ugF5xt9Z0rvNTazDtnlp4n1we68KphReYVwtfqnAx+au/XRBsw8sUdW9G98URDoKX1+2pEgk+MOkv1KFMkfTTi5D9Hpr+LKHvUjDWQkGCtAShkiCcLUGoJAhnSxAqCcLZEoTqvwIR9ReOTow5/BVIOK7sD0fVM3vCTi5s");
    imageData.append("flJ7WT8BguYzeyjzcMAAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image565d296e2e6f892c46599fcab1bd3ad6 = new WeakReference<>(result);
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
BufferedImage image565d296e2e6f892c46599fcab1bd3ad6=getImage565d296e2e6f892c46599fcab1bd3ad6();
if (image565d296e2e6f892c46599fcab1bd3ad6 != null) {
    g.drawImage(image565d296e2e6f892c46599fcab1bd3ad6, 0, 0, null);
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
	private icons8_3fr_50() {
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
       icons8_3fr_50 base = new icons8_3fr_50();
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
       icons8_3fr_50 base = new icons8_3fr_50();
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
        return icons8_3fr_50::new;
    }
}

