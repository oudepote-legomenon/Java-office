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
public class icons8_candy_cane_pattern_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageaa0857479084560244c8c384bbabec7f;
private static BufferedImage getImageaa0857479084560244c8c384bbabec7f() {
    BufferedImage result = (imageaa0857479084560244c8c384bbabec7f != null)
        ? imageaa0857479084560244c8c384bbabec7f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1540);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAETElEQVR4Xu2aWU9TURDH/Sh+FCO2t9XiQouyiFosGlRaoLTiBlaW6IMidUncAImxImhppCAJjyoYlrgEBVSMqBF3fVD0Qcf+r56T9tj03gcN88Akkz7ccybz69lmzpxFixZkQf6/RNdpi+Muq1/olQ02V+v2FUugJytXaTsPbfarGvY77aJNZ5GWk9w/WbvzrCWiHXRPg7tUtdVYU5gv22xzZMVztUrVjlD4qvovpddlLR/MyiKhN20WinjsdH7bcl1DoY204WwwRb3HvNRS5tC/tyd0YJVF9lc1ut4mbYUDTio+FUixtflMkI5XuWSb7gKNbqWxA4Wvqv9SBMhcUxN9PXKEHhQV0UjOGvo6Pkb0eVbXnts95D5XTeeGIxSb6iNfpI5C0Saaez+jf//5/iVNVgdo2OGgjwcO6LagLyoqaMhioTexTmnr0fQYbWnbS3V9Ybo+PUCh3mbaen4fTT+9K9u87oro/V76/dKWaZAvhw/rHfA7XlhIo04nzU3cYQNjCNK10e7EdILznGEMQbDILpbYaWzdWhovKJAwXKbZ7OULNLRsmTkQLLJvj+6zhcHIYAPICHKqfLUVIOjAGQa7WY/T4lX9l7K70VO+v26T7MAVRt/qd2QvVf2XAhDs51cHo6xhAIJloPovRYC4W3axhsGhaQqkbbSDiluqWcBMPRmjkrY91NB/nPqfDtD++NFEBBCgg7Xr81T/pQiQ7sk4tY5cYjMyKgx8hK+q/1IQAPoSsVPZxRBrGEMQPerc4aCGWFjCcJpmYs2YAsGO8P3DC9YwiJozgnQV21cjFEcHzjDNARfV1ru3qP5LwbE/sNJCP94+Zw1jeI6IMP6hv4I1jGmQkWwHTQSrdKMcYZBpmgL5VF+fgMme95GZ2Fml+wF/BMyMz6eH8dfybMWq/1KSU10uMOlGxjAfSQbhDGMIguFCoxmv9y+Y");
    imageData.append("iaCfzZoxBMECulpkoyGrNS3MfI+MWDOmQLC1veuLsYXByJgGQSfOMLgEzAhSU7dpazhx/AujXGEQRiGcUv2XgkDMfTpADx+PsIYxPNlFYuVp3c0aBnfNpkCQvCCJmXoyOu8w0UQ/wLQOX6LYZK9uFxfnSAJV/6UIEKSTnGEMEysk9EjsQ4kEnxtM8jQzBMG8O+HPodL2fVTT06RfwTT2n2CzZsTImALBjvDs2T22MBgZQxBcQ4oDkTMMKmcZQeK5mi+Wr8kOXGHwZ5/xZltU/6WIMP5VpJ01jOGBKEBQTJntuMAWBgVaUyCvAgE9N57PkUGZb9TlTFsGRHkQZULVfynJGSJnGMMwXk11OcCkm2amQdIpdjNRyMeh6TmdWuxH1NwczJVtkGkO/ilcqopLwPbS3+1w11weLkuxBUXlTNhCgfaG3ZpiIyOI+oQjRXO1Sjyr0C+6E4rnFuoTDDzLEN+h0XzN85edP4rnHqIdAkDVFhTPRkQbPCcx/YRjQRbk38kvJ1oh7SOwtncAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageaa0857479084560244c8c384bbabec7f = new WeakReference<>(result);
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
BufferedImage imageaa0857479084560244c8c384bbabec7f=getImageaa0857479084560244c8c384bbabec7f();
if (imageaa0857479084560244c8c384bbabec7f != null) {
    g.drawImage(imageaa0857479084560244c8c384bbabec7f, 0, 0, null);
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
	private icons8_candy_cane_pattern_50() {
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
       icons8_candy_cane_pattern_50 base = new icons8_candy_cane_pattern_50();
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
       icons8_candy_cane_pattern_50 base = new icons8_candy_cane_pattern_50();
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
        return icons8_candy_cane_pattern_50::new;
    }
}

