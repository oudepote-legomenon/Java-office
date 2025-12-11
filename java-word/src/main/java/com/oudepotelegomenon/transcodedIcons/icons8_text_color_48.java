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
public class icons8_text_color_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image005e9575d00907515fa90243afcc08cc;
private static BufferedImage getImage005e9575d00907515fa90243afcc08cc() {
    BufferedImage result = (image005e9575d00907515fa90243afcc08cc != null)
        ? image005e9575d00907515fa90243afcc08cc.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1040);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAC1UlEQVR4Xu2YTWvUQBzG96KiUlBBFGlV7OaloXrpZ1A8CR568KDgQUFQRFREQRC/gZfF3SRdKHhJ28xsWxSpiIKgiIIg6EfwoiCi4vv6n2y2LM9MutBkkhzyg4cuyTPzf5Kdt26tVlFRkTme1Zn2LN5VybXZWfSXDs9kcxh89QEs/gj9pWL20MOtrsm+YvCBB/jjTnZ2YbvS0LLDExga5ZrhOWxXGugNMwyMom/oMbYrBRRuhB7gOwZW6C9pD7YvHJq8JxVhlXLtznlsXzieyZcwaJJciz3F9oXS3se2eRb7IQU1+Uca8x/wule2YURj/7QipJiwPv1t4PVYF7GfwqC3/0ARUOiYa3aOKq6T2DPspxAaB5e301D5KQU02bfm1OKWO/X7m+ib+IL3aR78azqLe7G/3PEMfgbDRQFNPr/qSThekOfSYF+FQG9yBYNFomW17/ENfkq63/M8H+wrd/x6sJNC/JaD8V+uE+zo+8RnlU8Mo7bF9g90mS/iXIOh4mArkpfWfvT1xK6gNzdoDD+RA6l3WnqAy+iLH+AlenOh7SzvFsdjDCSGxcw4G0N/sx6Oo7cvcQ/92qE3dwGDDHujdP+d7OdiMl9Dr3bERiQFWadon3iN/WulVV8Y9XrnGSnMejUzsWRgHW2IDQgDpBe7gXW0QRP1hRwgnWhBeIN1tCBWGLHSYIAs5BrhBNbLHCp0FQtnJZrMN7Fe5tAx4RUWjtVAbxLCq2gvDndv0ZspvjF/IHH42OER9CdBO/VhqX0sv84d9GcGFb6OBWN9DpxgI/qTaE41N9A3+UnRj9jJb6E/M8RKgQUjmfweeodBfc1K/URi79GbCS07NOVifXWm0T8M+h/huNxPLHthEv2pESuEVChS9GvECPqHEYwGm9f4HfU2+isqiqZ7t9bNU1g/NVhAt7B+arCAbmH91GAB3cL6qcECuoX1");
    imageData.append("U4MFdAvrV1RUyPwHuZDzSSmEc88AAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image005e9575d00907515fa90243afcc08cc = new WeakReference<>(result);
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
BufferedImage image005e9575d00907515fa90243afcc08cc=getImage005e9575d00907515fa90243afcc08cc();
if (image005e9575d00907515fa90243afcc08cc != null) {
    g.drawImage(image005e9575d00907515fa90243afcc08cc, 0, 0, null);
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
	private icons8_text_color_48() {
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
       icons8_text_color_48 base = new icons8_text_color_48();
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
       icons8_text_color_48 base = new icons8_text_color_48();
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
        return icons8_text_color_48::new;
    }
}

