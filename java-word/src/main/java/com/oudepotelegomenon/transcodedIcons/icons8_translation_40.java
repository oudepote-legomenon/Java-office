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
public class icons8_translation_40 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image547822ac5979da349ba3449201dc146e;
private static BufferedImage getImage547822ac5979da349ba3449201dc146e() {
    BufferedImage result = (image547822ac5979da349ba3449201dc146e != null)
        ? image547822ac5979da349ba3449201dc146e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1008);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAYAAACM/rhtAAACu0lEQVR4Xu2Ve1NSQRTA/YR9gj5IltMfTdEfko9KqRkVa0isYTJBkEKCrBk1KR81AUOJmlgCKvfK5XFFTuyFu9DuBfa+nB6emd8wc3bPnt/cfdDT8zfElf4xOA/IvsyBinkRTOVCUC8XgmQzLTVkX+bQ0kxLDdmXObQ001JD9mWOds1kEbWQ6/y/gqw887+TBGaCK9SYjKmCkdg2HAoilUfsHwvQN2iHXus4JA9y1LiMaYKeNxFp8YdP5+FIOKXGHZ6wND45s0CNyUz443Dpqlc1TILbaQ5ujk5JEqNTc5DmS3jsY2wHemv5vqFJ+J7lqVpZ7vLtENyaTUP/fI4ZZkFZ0vJgWpK02JzwIb4DiVQWrg8/knKB5U2qRo+cakHE3lEe7js8+KZeG5hobL0Psnn6fOqR0ySIyJyUYdD+nHpWyHq9csyCh4UKpGq3dC2+C67AEtwYcUgy6Nw5fYvw+EUQrOMuaauNlGMWJL8S4p7DDZ+3flBzjZRjFkTvG7rBNqcX3OFVSOxlqTnd5NZ3y9AakWSJklGCSZCVdnIDL3NQEKu/CQrlKtzx00Ikhgm2k0PMrglYrFBuirpW89RcEkMEO8khvh6IWGpuvSn7JSVSc0l0C3aTGwlycNb4aKnjClhr25ov1RNipQpDrziqxjDBbnKI19Ei/mLhWFHKbbRcGO+GQNV0FFQDKra4M9SirfzkKlhmbJGXcq5IHueSmVOqpq2g2kDF5IKt2N+eYJE0X8F5dHtLjVtdrf3YQnVxJUwVfL9VwoKdIhStb70Spgmiy8AXz0gXxUDHgKw3XRC9cWoCHQdyDVMFo/sibo62mhxHJFrex+VvynNMERwOcNIbJ8eTJeWv49ss4Dlc7TigY0HOMUXQ/6nZGP3nKjVG3F1oPuIoplfovz5TBI3kQlAv/77geUD2/SPjF9QFQwjge4T1AAAAAElF");
    imageData.append("TkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image547822ac5979da349ba3449201dc146e = new WeakReference<>(result);
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
BufferedImage image547822ac5979da349ba3449201dc146e=getImage547822ac5979da349ba3449201dc146e();
if (image547822ac5979da349ba3449201dc146e != null) {
    g.drawImage(image547822ac5979da349ba3449201dc146e, 0, 0, null);
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
		return 40.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 40.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_translation_40() {
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
       icons8_translation_40 base = new icons8_translation_40();
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
       icons8_translation_40 base = new icons8_translation_40();
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
        return icons8_translation_40::new;
    }
}

