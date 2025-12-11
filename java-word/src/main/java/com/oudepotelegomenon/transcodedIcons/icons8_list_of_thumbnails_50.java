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
public class icons8_list_of_thumbnails_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image677834440ba508bc76dfb733a8c019d2;
private static BufferedImage getImage677834440ba508bc76dfb733a8c019d2() {
    BufferedImage result = (image677834440ba508bc76dfb733a8c019d2 != null)
        ? image677834440ba508bc76dfb733a8c019d2.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2240);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAGV0lEQVR4Xu2Z+1MTVxTH/RP8E/wT+BPyW6dFRGfaGWutgO0URBhUQBBxGmq1DjjWIog8NCPgA9+tPNQICUkg4VUUUASLEN7vPCBZsnmc3nuTrMvd4O7m0bGOX+Y7gTvDOeez997dezbbtn1Kqk2PL63PTDDJce3heD0dR0w5ZYbk3CudxuOVnSapzq3o7ED/F0fHCilc2BNlEryoyJZkw/k0uJ7+FdBxxJRdrlcWqrrd1RozSHXOZQNkV+gVdKyQwiC4QDDUbG1TLcDf98nvcw/OhQ1y5vZLRjcPINXRB3FYgOhNa0xBTIsAs06UciHWIMOxBelZAlh1AXTGDMT4P1xa7PMysN3/VQgTMA2SV1KtQFZSVvBSEIUC6VsGmHEADKwKIWiQvN9UOwR5imuSuQR8EAwxdSUDJi6lgv3hWTJmbb4I6tMp4Hh2KTQICoaCajeZnyAgGkSPlo/D7V+xXh+AjQUYpID4IAXFVXF0nvzi6otcgiAIH8LvNJi/rYSGo3tI4fdyvwZby0UBiFTxQfBeYL1+CFp2BKQPASIqDDJw+ShMVfAh/B5HMA+zd5PCsRuO7YHR2lMRg4za6PI3C4OGBfKmPFMAEfRYaSrcObKLg3l8cl/EIMZF/1Jyezcbz9K8M/TSEpUYCPboHz/BzcydAZBvIwaRatkg/RfSYLLqyJY2V2ZBT/EP0Fi4D54WJYUNUlTX53owZAWplgWCD4DBZSPHdBwxYRBcmFxLBvmsj00JBY3JCSealHJNxxFTUnWe4vvqXKVcJ6nydtCxQmp3YZPxmyK1+7tzOkaK957RuHYVNMneI7iolGsnPMfunmWk+kDNccAXgI4VUrsLm00ZVwahpMUqyYW3zRAuCC7u2UQrSHVUQFp6B2FgpB3OP7HEFGR6bRY9CFl4tTwcXZB/xp7B0syfqDGoR66Dtfm7MD7+FK5qpqMG");
    imageData.append("8tysgZHVtzC0/Io7lthcNjL2cnEwOiDelRsEANZ16HjaBWC5Rf6+YRiPGshbyxgH4GQmAZjXYGfmuLHuud7IQPByIhDOfi4osDNkbAzNFF5mNEigT1BsMhrjpSDigwyvjPhjuxf8+bAtdwF8LPjQj3G2SwDy8++q7XQefLTnEgRBStVL4Fxo8Adlp96DoOB4zLdSD7c63glBUIOTX1IDfOMxLkFAfJC2yXZYdCwBs97/HgR5nZkCs20y5NLChYfIo+US8Gfkug5NMyoY1rSIINAwMK9Ikq6hzqgtrXfWcX9s7xr4LHf8F8rewuXsne8XgIiK3iOe5cAesaIe3fYXd7Xq9dHbI4NL/k3u8XmAYe3olxWwbKxwY4ZpY+Qg2hd90DfcAezyTQIwOqYG3cteqHi+EDUQbONsN3TMmMiewLJuWMmYbroj5NISFQ0SdK3ODM29Q4LxaIEEjWdnwbEIXXM9m8ajBrKVow3yIcsDKWjuwIXJNR1HTBgEFybXkkESCxrjEk8+Vsg1HUdM+BSLi5JtVdZ2OtanraSqnDjBVZBgOo6YVKlf7FAdjlfIdlaitBlJqcnvoNelFNNxxHT90JdKuu+XYgxDxwqpg9dOmM63VQruGFu5rv9e2CBNp/Yz9LvkDzliEPVEG4zbJmB2fQ60U/r/DmSwCR2RzOizMTIQtbkNeub6SE8Q1ITVTMY06KAXcxAMgYU/IwGZXpshcZxuBnyedXTwsZCjA5aDdZCZiikIngkMMRDhjFgCRQOLgq0GDo/OXjLk9Xmh1ayNKohHUyGE4TlskK7ZHlhlVsFtU3OnXh/qEK0bNtRTvw65tKT2IzSIo7EEzOWHgGm5wBW+9KgEvLqqkCCi/QgfBB/eiJhAp4i91kqGXB4X2UMCEIkdIh+EQJSlkRfkk5fTgVWXwrsbSqjL2AmtZw6Cp71SACLaIfJBVpj3PYFnA/XVGyNob9i5MfzSgAaRqiAIH4JzeTo0ZCVwzw78vT+L");
    imageData.append("ll3YS0s3ZSAvBvDbjKAm7dNkLHjMjgSkrejAxkSZ8GsL7OELP0J9hv+rC2z85j9skKDxrRbfrRh09zKhZidazxHt6SQXDcD3QPFBqE2P//if7GIg2N1nD4QHknI135hWd8pNv3fdypk3f3GFC3LnaKKnHcF8yJqi/ezj/L2uR3l7XbJA9tfkJPPffks1HUdMuCBycJRpfGqmY33Wx65/ARbLIUo6Os7YAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image677834440ba508bc76dfb733a8c019d2 = new WeakReference<>(result);
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
BufferedImage image677834440ba508bc76dfb733a8c019d2=getImage677834440ba508bc76dfb733a8c019d2();
if (image677834440ba508bc76dfb733a8c019d2 != null) {
    g.drawImage(image677834440ba508bc76dfb733a8c019d2, 0, 0, null);
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
	private icons8_list_of_thumbnails_50() {
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
       icons8_list_of_thumbnails_50 base = new icons8_list_of_thumbnails_50();
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
       icons8_list_of_thumbnails_50 base = new icons8_list_of_thumbnails_50();
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
        return icons8_list_of_thumbnails_50::new;
    }
}

