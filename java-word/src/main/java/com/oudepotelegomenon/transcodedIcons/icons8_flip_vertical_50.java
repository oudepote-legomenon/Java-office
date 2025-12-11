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
public class icons8_flip_vertical_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image36751e78dab260c5073f4d84b2ef8187;
private static BufferedImage getImage36751e78dab260c5073f4d84b2ef8187() {
    BufferedImage result = (image36751e78dab260c5073f4d84b2ef8187 != null)
        ? image36751e78dab260c5073f4d84b2ef8187.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1876);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAFR0lEQVR4Xu2ZXUxbVRzAmVOj0ahxxsS4mJglJiY+mJjFxJf5pE/6ZB/M+kWmuDiThQH33hbY3XRbWT9AEIHb+1HKasEOsGyMFcpAJzAWRKdMFtiwzIVsugVlG12/r+fUFA+3hd7b3kKJ+yX/pIV7z/n/cvI/Hz0FBff5H4FXUU8mPhdR+NLnDQdhonWJzyoaJ9D/bRj0RuurhJEZTHxXMWWDGpp4DX1mQ6C3cN+UW7ihxHc1iw1pOaITfSbvKTVS2wgTE62saT6X+FshR5xTM1hMZSVeQp/Na3RmhgMifAoRXsMSLPps3oJVWbcSZiZcf8ydJFLsOsxrGCy804ptRd/JS3QmpsbMuALeofEkEfMAxX/S+mkAyFSj7+QdxRb6aZ2ZvffT5BXeO5xaxDrqAKOCB96n9j2DvptX4Cb6wOFGZyAaja4o0uvr53c79gdAvZDou3lDianlMTDdLoxeuMRDVhLpmz3D1w81w6K/ragnH0fbyAvA4rfvYF1LMBSOpBXx/OblP7Trg2q6rBhtY90poqiHyqu569+d/zkukU4ERs23DA8WyD8VLvJhtK11BTfTH1R+3hy+FwiKFjk108sX2nQhJYvtQttaN0iSfADUhs9zdiy2ZCFCBIaxvwnWyu8Kl2Iz2ua6AGpDobewkdt3/aiHKJET06d5LYNH1FbsPbTNdaGi2jbh9g5Hl1mIFIFxyFMXA7UyWcAXbELbXVMws/VtsABG5/++I/QQLeKeOsWDnXFUzZS+hba9poCZaqTt1OC/860AsSIwyO6aSKGNGEbbXjMIE/s62FfxN27OCx3iSBE5/usJHm7xlRT2BtrHmgBmqp7mjt6QUCCBFBEYOrcxrGWIHrSPnINV0S+D80bs6twfwvyXkCrS+ksnr6bBqDAlr6B95RRwjHU2Obv/W/1SIFUERkm7IajlcCfaV84oN1lfJMBM");
    imageData.append("dXl2Tpj7MjIRsY+7YK1E1VTpNrTPnACm28ZqriO4bBlPQSYiMPa2fQZHpQHtU3ZKTA3PgvN4cGLKJ8w7iUxFmPNOuK6EdlL659C+ZQUUuOGotS0Qi6Ubj8xF+nxn+D1fHQgomTID2rdskLXHngB7qrs/TEwJc05JxiIgGkfsYDOJL2pse59Cc5AF+PPnoS8dwUgkaVuVkmxEPD4vX9RSEZT9Z1aStD0CFsBbQ+MXhfmuSDYiMGq/53gti/+lcBU/iuaSFbjRuoestYeCoRUX8iSyFTk94+V32XRBFVP2MZpLxihcrs1gq36tf3g8fYUjZCsCwzxghcfhuR0k+SCaU0bgRloJdrnhRX9AmOuqyCHSfdkDRPCwmsaVaE7S4flN5dW26e7BUUmjAZFDBIahrwEevGbgkRpNTRKEmXlXb2YjC3cWhXmmRS6Rrume+HFYSePvoLlJosJiG2v3nBU33wqQSwTGwZ66aCGn+xHNTTS4iX4THJxiN+cXhDmKQk6RjsmT8S2+ii3bgeYoClDgA46u/rAwQbHIKQKjvMsSBoU/gOaYFnj/B4+xczduCfMTjdwiX190x0dF0j0kvP9jXD2rHpzSIbcIDKzzaEj0PWTi/s937bowN0nkQsRxoT3+I4Woe0idhbV9YXdnNRqQXIjAKD5+JKjhcA7NOQm9pfl5eP936cpVYV6SyZUIN9YGRyWiovAX0NyXkbj/k7yMpyBXIr2z/avfQxJH7Ft0JtZvaHKGm5wn/dmGobE1BDabI4n2wdQ5stuxP1TabvBnGx+1VIY1LOZX2YktqEMcwkRtJ4x0laxhposS7WvosiIVjVXJGVqK2I463Cef+Ads7SOicNGZJwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image36751e78dab260c5073f4d84b2ef8187 = new WeakReference<>(result);
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
BufferedImage image36751e78dab260c5073f4d84b2ef8187=getImage36751e78dab260c5073f4d84b2ef8187();
if (image36751e78dab260c5073f4d84b2ef8187 != null) {
    g.drawImage(image36751e78dab260c5073f4d84b2ef8187, 0, 0, null);
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
	private icons8_flip_vertical_50() {
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
       icons8_flip_vertical_50 base = new icons8_flip_vertical_50();
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
       icons8_flip_vertical_50 base = new icons8_flip_vertical_50();
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
        return icons8_flip_vertical_50::new;
    }
}

