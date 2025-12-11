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
public class icons8_chart_80 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image541d20dbe36e493087d07faf72b18ca5;
private static BufferedImage getImage541d20dbe36e493087d07faf72b18ca5() {
    BufferedImage result = (image541d20dbe36e493087d07faf72b18ca5 != null)
        ? image541d20dbe36e493087d07faf72b18ca5.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1528);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAFAAAABQCAYAAACOEfKtAAAEQklEQVR4Xu2Yv2tTURTHq6IODoqOij9AxR9/geAiKCjNb4mL2LGb7SC0eS9p4iIIbi5qqw4OWjooad9LUmtBcXARHKyKFH+hLiq2kw6hjeekCuWY5L6T9+7Nj3s/cCDkfu/x3uM57/vSnh6DwWDoLuJDhR3xbKkQTRd+Y8DnUm9mah/VGWpQLV6m9HNwbK58Kf+tgoGfY5niQq89tZ3qDQTsPCzYleJiZXXgd4lsyaF6AwFHFruOFhC/i6QLv6jeQIjarimgH9Awao3wwI2X5Xi2WKD6jkKFO57O5A+DYZQHxuaW/pnIwOiKiYRTpb1U3zGoccfKmojt3gnbTj6RnXZwnDGw8zq6eIgKdwxb7sWI5Tw9eb6wka51PLLdEXKchc57G0vd30bXugKZ7hhKF45GLPdL0M/TtqKBOy7HRkofksMzm+keL4TT+T1YPBjdY3RNGSrcMWkVDtVyRzCWhVDKvRq23a9QiMFkcmId3VuPZK60FUzjTSjlnKNrylDjjtAptnsdnlHjaBi13DE0PLmz6qCW+zpku6fofkp///P1Edt5BJ2XoWtKUeSONlz2cTI3sYGuUXAUQf8CYiYCXYvf1ZqQsOWMQ8fexVcXmkMpst0RLnoGOu9VNPdgC12rB44x7OmH+Az7r8VhGsiELOHjIJor7qZ7lSPVHVOTR2AsP+GDnq55AY0lNlJ8DwVbpucLckJ8kRgpTeODnR5wxR2L73y5IxQPi0jXOMieEF9UXcxynuE4rB6Rv78dF2F8xqpjBOPEcUccVxxbHF+6xkXmhPgC3Q9fAeCio4n07K4g3RENAFzXomvN0OD9sXV/XYmknePgYN+heMN0rR5e3TFkO/cg7226v1liKXc/vlLVmJDW/HVlxd3cH/Ba0UvXRORyubXQjX3VsU65t1S5I76P1psQKdTsDGvyAHTdZSjcfCzjHKR7OJy4");
    imageData.append("ML0JCjXf1u7YLA1+WZSh855w3sca0dbu6Id6vyzwVQXWXKpvlrZ1R7+o6oy2dMcgUNUZ7eaOfTeHKl6C7vsPlZ2h3B0bgMV5+HG2YXgqYLt1hioCKyDSTp2hikALqCOmgD4xBfSJKaBPTAF9Ygrok64vIB7eS9B9XtGigPRCNPxcUHb+liP7grLztxzZF5Sdv+XIvqDs/C1H9gVl52853AviZy/RbP6Og3tB2frAof+z9YLu8wr3grL1gSP7ANz8svWBI/sA3Pyy9YEj+wDc/LL1gSP7ANz8svWBI/sA3Pyy9YHDPQB+9hJ+8tN1Gn70gcM9QKfrA4d7gE7XBw73AJ2uF4JiL7FaT/9BGt2kF8JNqJteCDehbnoh3IS66YVwE+qmF8JNqJteCDehbnoh3IS66YVwE+qmF8JNqJteCDehbnoh3IS66YVwE+qmF8JNqJteCDehbnoh3IS66YVwE+qmF8JNqJteCDehbnohKPYSuuoNBkNX8Adk4byS452u6QAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image541d20dbe36e493087d07faf72b18ca5 = new WeakReference<>(result);
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
BufferedImage image541d20dbe36e493087d07faf72b18ca5=getImage541d20dbe36e493087d07faf72b18ca5();
if (image541d20dbe36e493087d07faf72b18ca5 != null) {
    g.drawImage(image541d20dbe36e493087d07faf72b18ca5, 0, 0, null);
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
		return 80.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 80.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_chart_80() {
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
       icons8_chart_80 base = new icons8_chart_80();
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
       icons8_chart_80 base = new icons8_chart_80();
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
        return icons8_chart_80::new;
    }
}

