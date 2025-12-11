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
public class icons8_play_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image8cf18478a53436e8e88fa7c00a2769dd;
private static BufferedImage getImage8cf18478a53436e8e88fa7c00a2769dd() {
    BufferedImage result = (image8cf18478a53436e8e88fa7c00a2769dd != null)
        ? image8cf18478a53436e8e88fa7c00a2769dd.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(856);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAACS0lEQVR4Xu2ZP0vkQBjGx2TZZEGr46rrz0+ghdZyWt6XsDjR2QhiqZlVwcLC0speuGv8ACvHuZO1UhB3ZhGLxdY/lSCi64uieO+74l52ksxyeeBHmuR9nkkmk5kJY7ly5fo/5Idq3K9o5Ql97YvmL7bRKuFzrJYv9Ck0oP2Ct6JbXticwOdZq7fhXxHqwa+o7aG1k0/4fOtEwr99GhV9AV1rGl9jlXDojghdLa6dfMXXWiES9j2EugEW2VK1gGtkKhL0Q9RhKVQjuE5mogG74g6exiZbOh7E9VJXh3DdI/SZFza+4ZqpioSKAYxUO4Orzc+4dirCYeICjbh8GnLb7QHskahwkF7xKmqvKBrD2Ccx4QBGgCEXPoLL8JIXsZ9xEXOTCH1UWtGj2NOoiKlx1D2wxdYbQ9jbiKhhMnhCncPT+I79exY2Sh61Cw35gnPEFjVIA3VbDNUUzhJLtHg6QJdq4Syx5JajdiZw2ccN4PLWDWqTOEsskeIJ45TlLgtq5l5ibJAYPDp3g7r5YZQYmYbLewi/xRb+JPMhI4YGccrRUSGoJTuVwKZG4NEN3Pl0JnPEvEccHu0xfpDedBoH6IFL6DLTjKW8oOkQJAZyh83+zmZJScP8C/LM5fVsF/U0VBfw6A6Om+xHNfttFRLuAxwuDwtzB/ZsbOGA7wJDI4S3b2uRBO0AjC5VNl+3c3MXh0V3/eJ5aLRYJPQT8gGO22ymbv8PDgh6+vddly13TvbPL6bC7P4YdJUGhL9ygugnzNX76ydfrly57NQj9AtDlqBetOAAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image8cf18478a53436e8e88fa7c00a2769dd = new WeakReference<>(result);
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
BufferedImage image8cf18478a53436e8e88fa7c00a2769dd=getImage8cf18478a53436e8e88fa7c00a2769dd();
if (image8cf18478a53436e8e88fa7c00a2769dd != null) {
    g.drawImage(image8cf18478a53436e8e88fa7c00a2769dd, 0, 0, null);
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
	private icons8_play_48() {
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
       icons8_play_48 base = new icons8_play_48();
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
       icons8_play_48 base = new icons8_play_48();
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
        return icons8_play_48::new;
    }
}

