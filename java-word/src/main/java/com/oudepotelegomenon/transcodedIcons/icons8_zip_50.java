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
public class icons8_zip_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image4d887f833013726104b236192d6a4617;
private static BufferedImage getImage4d887f833013726104b236192d6a4617() {
    BufferedImage result = (image4d887f833013726104b236192d6a4617 != null)
        ? image4d887f833013726104b236192d6a4617.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(960);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACl0lEQVR4Xu2a/0sTYRzH/cP6sR/cTlcZ+EuEYAS7zebSbJiEVkaik3JNcjNxNzNT+p4stUkz90NgYRll9VsEFYVBQRtk9mmfh+66u6fTjZ7nmYvnDS847rn73Od1t+e5+2FVVTIVFM1XvSOhKiEeaKqSuuSt8duvySWa6uoaD3jW73buz7FG87kh2aRAwufutF+XeVAkdXxfHrIXgTUoMhfpKMjU8pfhLfL+9QosT4+RJ6Op1afs12cWESIY7jKiRLjLiBThKiNahJtMOUQwzGXKJYJhKlNOEQwzGd4iz9PX4N3q8qbMDrSTl+aoXwna+ys6vEVKIeF1Zez9FR2eIqWAPWAv9v6KjhRhjBTRI0UYI0X0bCWSnx+EZ/Gjf+Xn4jDk7kXhyYVWeDNx0jjnxUjIOOZVogO+zgxQde1wF/k83U+9uHR+LMRg7U6YbC/2eo1zJoK7LMeNB2rhw/UzVG2hIrl0FB5HgwYzXQ2kufnTjWTcSeTK4d3wcvQYpLsbyfjsiQaqtlARMxsP4nAjVA9Jv7sg0E/2OYlcbdtLtr/fHyLHT7bsoeqZESqyOtJOms6G/zS9lQjKJ/0KTLXWUfXMCBPBO4t3dexQjWXyOolMtdTBp1t9sBRp/v1TPEDVNCNMBOcHNrQUCVj2O4lYJ7sH1m6HqZpmhIh8mztPVp7LzR7IpwctY04ieHym5yA8KtyAL6mzVE07QkSyfSpp9mnsCDXmJKLPkWLhLoKrE6462OzDc02WpXhjIV45IiuxNsvv3cx6ZqhyRD7e7KU+TXTwieCcwe23k93GOfiJgi9De63N4C4iCimiR4owRorokSKMkSJ6pAhjpIie/0qE1184SgF7+EcRZafmc/VsCwq92PuT2c75BZOwIG9VyjBiAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image4d887f833013726104b236192d6a4617 = new WeakReference<>(result);
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
BufferedImage image4d887f833013726104b236192d6a4617=getImage4d887f833013726104b236192d6a4617();
if (image4d887f833013726104b236192d6a4617 != null) {
    g.drawImage(image4d887f833013726104b236192d6a4617, 0, 0, null);
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
	private icons8_zip_50() {
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
       icons8_zip_50 base = new icons8_zip_50();
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
       icons8_zip_50 base = new icons8_zip_50();
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
        return icons8_zip_50::new;
    }
}

