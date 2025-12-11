package resources.icons;

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
public class icons8_share_48_(1) implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee717baa660a1cf90a34b447f80ca356e;
private static BufferedImage getImagee717baa660a1cf90a34b447f80ca356e() {
    BufferedImage result = (imagee717baa660a1cf90a34b447f80ca356e != null)
        ? imagee717baa660a1cf90a34b447f80ca356e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1796);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAFC0lEQVR4Xu1YXWwUVRRu/KERTBCwoJYSJU0QWpY2KIbE6ItPvvjiqkFMYGa6YGTb2V2l7c4sYwTbatMiDVgbf0JSJbGVmGbrkoDhURc1LsiWlNKSWosi3RaahRUTkus5022zc2a6O9vZWavpl5y0ac/fPXfuufd8BQULWMD8QmmIFW4+PVldcWoivDE0frMsGLv5eM+18Lrjf7pLQwOFVH9eYdO3seLNp2+crTx1nTlOjLPy3hhb3zPGIHlW2nWVrT32e2T10ZFiajcvMFX5tMmzRzuvsJKjv0VKD82znXA6nXc/81XfwczJj7LiT0bY+tZwC9pQP3nHDq9UInjk9wRRuvJ09wVTyT/U8Stb1/ID40V5lBelJsGtrKZ+bcdOd32R4JE6IPG/YQEMpTJ41VTyK48Ms1UfDKg2qoAP3iO1v/ZG3QoaxxZAwFdBxmcSSMqmnj9MJb+i7TIraunX2CYlVuWRX6HxcgaXy3UvVP1jg8CqPPF59I6Z5JcdHGKPHQjfofYzIsofYSwa3xJcLmUxbHNIF0wVqZ+rkbkNXaNeM8kvbR5kSxuiXrDjweeA3h8uQvoGY9I85gSshlHy8LdbglfyKopyD+rhJYV9PlPy9zcORAqU6KJp35wovQkHOkH9g/TmZCeMPhusHFddX0518ZLCPp8u+fsOXNRdZHx1vQOqfskgTjvVzQq8R95GnUKgn7ELUd1pbOiKLlrVMbyn6PDw98sPXY4/0DoUh+S/W9J0cc905Y2w26eshHgRGo/3Si9TXVNQWyXpNlj5dMlbhboIUR7UxBSlsTm1WLXPa5O/ZfTZ5BrJz+kvsogjVC8t1Bs25ZJSBQ4s1bMLkPBebfHk27s8ft3ZmRUCPg9Sk4dWOd1t8gH1zqGHWpQaqJ4h8JGFbxttBaSdVM9uwFkQtAuQR6CId1E9HbiawFZS/cmcXSpZYLvP");
    imageData.append("twQKF9cW0r+F6ukA1feTrfuC6uQLsIAvtcWUa6mODlDx45pVw1ZSnXxBEAMu7Q5I3VRHB1CKZr1tNsFVE3hKW0zpF6qjAyjGUo1cXuVBqpMv4MVGFjBGdXSg/d+pKLNe/3bD7XYXar8G+TbV0eH/sADN+8fOt08mzOkT4rxv973Q9jXDIb2iF+bc4Fgin8RUKjHmCMUSDhhVt3SeZ883dzPOp6Q/xEhMbQ0O30hDj9hKTGUixso+678+a/x/m5iyHB+3LbPx1KiIAwu1twrL8StPTpwxY4yjIk5b1N4qLMd3hMbjZoxxzsVRkdpbheX4YBw3Y4xDOsy5k9TeKizHh1Z5xoyxyjC8P6jfQouwHF/t82aMmweZyjDkGJbjmyWmHt7/Y8LpbzfuxRbgbOpYU/5pXyJT/FRiTIdMxFTJ/jDb5mvAIecSsgfUfq4QavwVMIcMbd/byMraz6ZN3ogY08CImFrT+NPEs1In4zz7Ut4lcgLZAyv0Hz4UwUddKo3Ce/ex5945xta2RiayIcbSAmdicN6b+rCaEdwNmNpwhqV2swF1oeJVWHWdv6lHWzDnczjSKoIof0iDzQSFARxnWJBdOEnhSxIrjIK/q9OVGNid1NEM61o/8mFbKRxYxEv4rKWBcyDXwPeLNJ4t4D3KcqT7cMAwSCQrQR8gba/X1S2jcWwH0n3ImCHpRBPLKGADib/LvaU8Qv3mHciYIXsBidVCYl3w85yA5ACOp1MjKhIF55L/q62qDjxpimVbwH8A/wAiNxPYUAx+MQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee717baa660a1cf90a34b447f80ca356e = new WeakReference<>(result);
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
BufferedImage imagee717baa660a1cf90a34b447f80ca356e=getImagee717baa660a1cf90a34b447f80ca356e();
if (imagee717baa660a1cf90a34b447f80ca356e != null) {
    g.drawImage(imagee717baa660a1cf90a34b447f80ca356e, 0, 0, null);
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
	private icons8_share_48_(1)() {
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
       icons8_share_48_(1) base = new icons8_share_48_(1)();
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
       icons8_share_48_(1) base = new icons8_share_48_(1)();
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
        return icons8_share_48_(1)::new;
    }
}

