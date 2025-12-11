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
public class icons8_color_dropper_100 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image39f2b992bf7f7775b70371ec876d3b43;
private static BufferedImage getImage39f2b992bf7f7775b70371ec876d3b43() {
    BufferedImage result = (image39f2b992bf7f7775b70371ec876d3b43 != null)
        ? image39f2b992bf7f7775b70371ec876d3b43.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2408);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAAG10lEQVR4Xu2dWcwlQxiGX4x9X8e+3JjgwiBEECZxIxFbCEGYIW7FlkhwMRUmrqzhxoWIuEDsxi4YMdZYholdLAkRCcnYIsZarzpFVX3V53T36T796/6e5E3+/9TX3Tnfe6pr7XMARVGUNtnf6gqrFVafWP1s9aPVB1ZPWV1itcAHK+1xqNWzVn+V1NNWB/1zpNIoG1rdCpnwMvrT6jqreVAaYb7VS5CJDrV2pPT1UKwtW0GZip2s3odM7h9W91qdarXjv9Hu79OsHoKrGelxNEVrSk1oBhvpNKlvWS0M4oo4BHkzeftSKrIz8mY8YLVpEDeJLSE7Aaw5B4RBynh423kX0oz7rNYP4sqyBeT5HosilEJ2sfoIzZnhOQzynDpOmcCuyJtxP6Yzw8NaEZ734rhYCaEZH0OawTajCTPIYsTnfiIuVjy7wU1/pGY8aLVBEDcteyI+PzsNSkKRGby9cHTeJKxpHL/4a3wfFyuzNIOkhvwQFw+bPaw+hTRjOZq9TYXsjvhaH8bF/YZJPcvqNqs74abKOfImRWY8gnZqhudMxNfjNMog4MDuDciEr7E6x+qzTFnbZhB2EsJrXhoX9xPOzKaj4kl6FO2bwTWRdLJxvyiih2xvtRoy4eP0pNVGPLhFNoassc9HET1kO6t3IBPO5dSrM69TL6N9M9iz4uAyvTZXHnvLtlarIN/04/gv4Rdmyn+xOmZU3gY0g2sm6XVvCYP6xtZWb0K+6dAMzyxNoRmckEyv9yLa61bPCTgflL7pnBmeWZhCMzghmV6Hi1XsdPQW3ofTNz3ODE+bpvDTn2szOG/lx0G95SLEb5o9l0lmeNowhWakYw1vBlcge88FiN84e1nbRBHjadIUmsGNDen5OD0yCDMI16XTBLC/P2tTaMbDkOfhYtdgzPDcA5mIWZrCET4nJNPjaQaXgwfHZnD7a9OEvA03");
    imageData.append("vV6WOqbQDM6Bpcdx5ZErkINlE7gReZoY7p/iOKUsVUwpMoPrK4M2w3MVZHKo19G8KTSDE5JpHM2oUit7i4FMTiiO5Ku2KenM7K9Wx6G4Af8cbs188BjI5OT0GqptdC6qKZyQTF/nYhdXAwePgUzOT1bHWj2XKavT+0prSqovrPbyBwwZA5kcmrFoVM79t0WmVG1TikxRM0YYyOTwcbIjghjCLvELkLGvwG2CLkvu9kVxOXjwGMjE5MzwFJnCtoCboMuSM2UNBjgSDzGQSRlnhqfIFD4VNa0pJgwYEgYyGWXM8BSZwgWjzYO4SSxDfDxndweHgUxkFTM8RaasRDlTOLWfzghwz9egMJAJrGOGp8gUvsayImgGF7/S484Ng/qOgUzANGZ4xpmSqylFZrAL3ev18RADmYAmzPBwbio9P8WGPuwSF5nxHuKnb3uNgUxAOOiblsPhdp6n1/DiJ59bi/jpz611cLNC79fHPQYyAU3WDJ6H50uvkYrrKVyjT1/nMvEOGAgGMgGzMINd2bT3lNMquB2Sg8BAJmAWt6mlo3Luv02fJw/Fxa5BmzGLmmGCGMLeV26NniuDVSYk/9cYyAR0YUbIQqvz4bYZHZyU9RoDmahZ3qaUAAOZKDWjIwxkotSMjjCQiVIzOsJAJkrN6AgDmSg1oyMMZKLUjI4wkIlSMzrCQCZKzegIA5koNaMjDGSi1IyOMJCJUjM6wkAmSs3oCAOZKDWjIwxkotSMjjCQiVIzOsJAJkrN6IjLIRPV9UrfYFkM+RCL1oyOON7qN6gZc4Kj4B58DBPF/xcFMdOgt6kKcB/r14gT9bvVyWHQFGjNqMA6cN8xGyaKbUhTz9hpzajIGZDJujKKqI+aUZH14L7zKUwWn2KdFwbVRM2owdGIk7XWau8ooh5qRk2uRZywu+LiWmgDPgW8PYVJOyEurozWjCngbnDeonzS2LOaH0VUQ82YkhMRJ47P1dVlEdSMqUkfYLkhLi4NjU1H");
    imageData.append("+GpGRU5CnDzervaJIspxNuTcF7U0DFLGwy9U+RZxAqv+xBvHKcsgZ4X5/2VBnDIBPmu3EnESee9fEAZNgOOUVyFrBee+zgvilAnwU70cMpFLgpgi2PtiW3E38r8rzjaE5UpJOIF4O2QibwqDEva1uhGu95UeF+obqyNHxyglMZCJ5O9frBvEeHj7YpuStg858SeFBvOtB02SjhG+hGtPUpZAxubEXwQ43R2i1GE1ZFKvD8o563tzJsaLXVtOs1wDNwjM1SylAnw2+zvIRNMU1pTcz/dQz8Cts/NbQJWGORB5U77KvMZxyinuMKVNikwJxS/60oZ6hvD2lY7UvThOyTX2SsvkTLkD7hfIlI6gKfwiL3ZzDdzgUVEURVGUOcTfISfYYRNWKf8AAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image39f2b992bf7f7775b70371ec876d3b43 = new WeakReference<>(result);
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
BufferedImage image39f2b992bf7f7775b70371ec876d3b43=getImage39f2b992bf7f7775b70371ec876d3b43();
if (image39f2b992bf7f7775b70371ec876d3b43 != null) {
    g.drawImage(image39f2b992bf7f7775b70371ec876d3b43, 0, 0, null);
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
	private icons8_color_dropper_100() {
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
       icons8_color_dropper_100 base = new icons8_color_dropper_100();
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
       icons8_color_dropper_100 base = new icons8_color_dropper_100();
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
        return icons8_color_dropper_100::new;
    }
}

