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
public class icons8_edit_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image821c1be5693111d3c14a0fbab673c06d;
private static BufferedImage getImage821c1be5693111d3c14a0fbab673c06d() {
    BufferedImage result = (image821c1be5693111d3c14a0fbab673c06d != null)
        ? image821c1be5693111d3c14a0fbab673c06d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1448);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEBklEQVR4Xu3a/08bdRzHcab+Qf5g/HkrrZFsjJGFLMxMmfJlJkZHnO1sa7oIHXGMXgsCCaUtdDCwil+YsNgVynduy9hogS2Q+oMLGcMNBiiZrbQv7915TXtXHaXtcdG+k+cv5K75PPh8erkE8vJyI+2whw69Ma1QdLAq1ciUQtFyU6l8TXiNrAcGw0vT+fmtU/n5kYXS0lCgogK+kpIgh4lMq1QfCq+X5bhcrpctmpp7X5dV7jzW6/GMYWItV1eDMLLfGa/B8IpJY1zSN9igrW8Ha/oyAUL5jh8P0m4J75XPAAfqLjDXPzPZMTH3ANfG/dBetokwdMy44zUsvF0WU8Idpzrm8oje1BEixOLKdrRkmPkTJ0Lcd8ch/Ix9HyDvwIC12FHLWPBF21fhuQcbMQj1w5gvdswe63SgBwCXMvYB2kttr2rqrQelqndw9K2RO/c/js97e+HcjZ4zN4fsR3YC7OcwMpbIJasr7P/laQKG3xl6ALBKZXPc74GDmGyT5zmpFDV19ePJ7yFshRBXBP7xJgx3FGEjYAbWr2B1qRm15ibUt3+D+J2h40YPAEZds0iP5gSIzuxgB8ZnBB8uVWIE36+LLTCaG8HvzNTCMgwmB5hPjQF6qiUg9hcSj2ASEHzPd6YxQt8ZHeP48+IFxp0UQbM/kAhmR5mkOyEswNZw3xkzLjINkwbhcYof6SEv3gm+zZ8tGHYU7gxai68a/mkn+JEW8jfCcXRXCG/nMXi6K2/9607wIx0kdcSstwE3WF+1cM1JRxrI3hCbwQg8t+bOCtecdLIP2TuC7pcJJD0EJQNI+ghqnyGZQdDrTM/A+EnhmpNO5iGZQVBNV/pBL5rCNSedzEKeI4bshVhfahAtPBUERS+a0kOCYYz1ncsYgpIewiE83VXw2A5nDEFJCyFEV2VKiLu7QFCSQjy9GritBZgdrBQtPBFh");
    imageData.append("jr4o7mYn+CSDPFp7gla9Cv5vz0QxK74abtHOjCAoySCs1wWnsQjbM7W423cKnvYC+K9XIbKWeJyGHIUpIyjJIL2Wckw438P2HWO01YnzGLYfxvKMIYbw2I/A3XkaG3+ERfe/KEkg8/fn0axVYmVUF4NQs9+VRY/ZTP/ptBCUJBC1uhqnSouwdbs2AULH7N61D/BTW0FaCCrrkKfPwlC8eRSvHyyE5qOyKGZlTI/JrnI464rRqlPBfVWdFoLKOuT7/r4ogu/tk8e4Y6ZCt+kdTLg78XD1oeievZR1SNX75TEE7cwn6rOYW/CJrku3rEJWN36LLr6i6l109zixth0UXZOpsgp5tL7JtSX6eTbKKkTKchC5lYPIrRxEbuUgcuv/C2np+RGEkVspQbT1tkbCyDH60zn9H4Bwzf/Z+QsMZmh+2Km+iQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image821c1be5693111d3c14a0fbab673c06d = new WeakReference<>(result);
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
BufferedImage image821c1be5693111d3c14a0fbab673c06d=getImage821c1be5693111d3c14a0fbab673c06d();
if (image821c1be5693111d3c14a0fbab673c06d != null) {
    g.drawImage(image821c1be5693111d3c14a0fbab673c06d, 0, 0, null);
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
	private icons8_edit_50() {
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
       icons8_edit_50 base = new icons8_edit_50();
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
       icons8_edit_50 base = new icons8_edit_50();
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
        return icons8_edit_50::new;
    }
}

