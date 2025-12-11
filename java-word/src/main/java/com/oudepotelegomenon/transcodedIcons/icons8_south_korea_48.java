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
public class icons8_south_korea_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagedeaf416b0d216bd214401496d6cab928;
private static BufferedImage getImagedeaf416b0d216bd214401496d6cab928() {
    BufferedImage result = (imagedeaf416b0d216bd214401496d6cab928 != null)
        ? imagedeaf416b0d216bd214401496d6cab928.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1668);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAEqklEQVR4Xu2X/U9TVxjH/auWLVli5uaWbc2IOtwmOiAIUlYZQ0A0qAziSEHGMOjYMl5kgiJgRcC3oSBSkAFmUaGUtyKZLX0BWtr787P7nOW6u+e5bW8bf9B4T/JJyrkPz/l+n3vOueds22Y0oxnNaEYzmtFegSZJErxOUP1vhoH1jQ3o7u1j/S+LW4N3IRAIsH4tqH5dBiqra6G1/TKM2Mdhbc3LnifLs9VVsPUNwPCDUSivqmHPtaD64xqYmJqG/dlmeO52w4GcPNjY3ITe/hssLlEwB77Z3WkZ4HDOQ+mpSngwNs7iKFR/TAPBYBB2paWLAQqPn4DJ6UfQ2NwK7Z3dLDZROq70wM9NLS8KtOb1Qk19A4ujUP0xDdTUn4PGpla4ffcenD5TB/MLi3DQUgCRSITFJkPOt0fg6awDKq21cKGjU5hpamtncWqo/qgG/nr8BL7IyAaPXJm0g2YIrK9Ddn4hzM0vsFiBYwaks9UQydwLkU+3/4v8Wzorz+25WR4vs7i0LN4CTqWULw/A4vIyHJJN4RunsQpUv6aBra0tSE3PgsdPZ+B4xWkYGhmFtkud8EvzBRYrhYIg1VVBZOfbEHn/LW3kZ9JPVjk2xP6//9YdsR7uj45B1jcFsLC4FPMtU/2aBvzyljYgJ8akZZVVYrdIz7XAVjjMxEcKzVxwNI6YmQlcZ/uycuHv525RrC5brzyuHTY3g0yXbgMKYxOT4PP7wVJUKt4GfS4qT0XGQaq3sjw494vLysVYKJ4+V0P1xzSAhOWq45ug/TjnY04bGVfqXijJt8GOXVcFxfJv5/5MkJwOlm9w+D7r04Lqj2sgKrhgNUSrxX/4uQ3e+bjrf2Dfym+tPJ9OqP6kDUQyUploNVh5Kl7h2LHbLJ9eqP7kDZi2M9FqcMpQ4Qof7LGxfHqh+pM2EDa9x0QreE0fMdFq0BzNpxeq");
    imageData.append("P2kDzqIyJlzhpuUHJlrNVzk3WT69UP1JG7jUbAd3iomJ93z2Cez5+joTrab2/BTLpxeqP66BkPzhGbHzbXTW6YWUtF4YOGwFn2mnACsfT/y7pm75OOJj+ewPJ1ifFlR/TAN/Tj2CZddK1PNJdcMkExgPreorX/yVZ6vwZEb73KRA9WsawM/76PhDkRjPJXjo0jqfhEJhsBwdYiKjYSkdEv+jzoEHuX1Zh+TjtA9yC4rEBw0LR8dKyIBymHPMOaHk5Pdw9Xo//NrSBr9fvsJiUVBNw5SYGlSwAj7DylPxCObEK2WPfGXFsWYcc5BXWMLiFKh+TQMIVgGP0R75Cmn+rlgcKTLz8sWUorEIrokfz0+LHWbHbpsAf6Nwx7z2NRTfcMvFDlHtDPNhcHvWYo6BUP1RDSDKRQPnP96J41UnEf67A7igwnoG/P6AOFpf7OxisWqo/pgG8BKDgyy5XC8Wct25RjGlaGyiYHGwKNfku0DxiXKxePFvGkeh+mMaQHALVS9kXOA37gyyuETp6OoR92AskNvtiTt1FKj+uAaQoycrxCLDS47Xx/fwZME7xh/3hsU9GKcqfa4F1a/LAG5xeFOi/S+L7mt9UbdNCtWvy8CrBNX/+hswmtGMZjSjvZHtH1aFHd496EAaAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagedeaf416b0d216bd214401496d6cab928 = new WeakReference<>(result);
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
BufferedImage imagedeaf416b0d216bd214401496d6cab928=getImagedeaf416b0d216bd214401496d6cab928();
if (imagedeaf416b0d216bd214401496d6cab928 != null) {
    g.drawImage(imagedeaf416b0d216bd214401496d6cab928, 0, 0, null);
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
	private icons8_south_korea_48() {
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
       icons8_south_korea_48 base = new icons8_south_korea_48();
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
       icons8_south_korea_48 base = new icons8_south_korea_48();
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
        return icons8_south_korea_48::new;
    }
}

