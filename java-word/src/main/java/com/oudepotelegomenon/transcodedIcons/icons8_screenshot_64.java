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
public class icons8_screenshot_64 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image69d767e261b794cc19009c0f672d85f9;
private static BufferedImage getImage69d767e261b794cc19009c0f672d85f9() {
    BufferedImage result = (image69d767e261b794cc19009c0f672d85f9 != null)
        ? image69d767e261b794cc19009c0f672d85f9.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(932);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAChElEQVR4Xu2XPW4UQRBGSwREThFgAdorAAFwB5BAEBFxBU4BEVdwgo1AAkRCzhGISPgXXACIkPjpYnek4fWWp3u6mvaaftKTpS1/X9eOxrtjkU6n0+l0Oh2bX4kSzinhnBLOLYthoSXhnBLOKeHcshgWWhLOKeGcEs4ti2GhJeGcEs4p4dyyGPfCyrjv615YGfd93Qsr476ve2Fl3Pd1L6yM+77uhZXZtH07nc4BZ9M+VNz3dS+sjPu+7oWVcd/XvbAy7vu6F1bGfV/3wsq471tSyOz3v8eyWL2eq+Ys+LvFlBQyywtwa/V6rpqz4O82hcvwAuyMZjlq7lDwTuI3l6LmDjxHgueCN4O3g/eC94Mvgq+C3yR+YzlqXnu0T3u1X8/R8/RcPb8ZZ4IvJV76X6rnnxYHWJzCM4lzLXwqDrA0ha8S51r4RRxgaQrMpPgj+DB4LXgquCXLW/h68HHw55qMuo6peRYpBxJmpnwbPP8naXMx+FHirF4sMp4XwwNTYGY/9c0fX8Ym2Zb4IjyX+CKM58Vw4RSYsdTbXr+ycrgk9p/DOouZU8iM5YMhkMkTibssi5lTyIzl5SGQyQ2JuyybwCUsTwyBTBYSd1k2gUtYHh0CmehXJLssm8AlLE8OgUwWEndZNoFLWG7EZ8CcQmYsd4dAJvpkyC7LYuYUMmOpzwFnV5lU9Inw0DwHqG+Cx5axSfRb44PEHftZzJxCZqZ8LdN3woXge4mzUxYzp5CZFPXPYS94RZbP/PoVqT+vBh9J3m0/tpg5hcy0tBgWWo7hrKXFsNByzGfMWvlJHGCp5Zi7mLXyjjjAUssx+gGmF6HVnaDn6vlz/9fodDqdTqfzH/Aba6scQEiCyMYAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image69d767e261b794cc19009c0f672d85f9 = new WeakReference<>(result);
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
BufferedImage image69d767e261b794cc19009c0f672d85f9=getImage69d767e261b794cc19009c0f672d85f9();
if (image69d767e261b794cc19009c0f672d85f9 != null) {
    g.drawImage(image69d767e261b794cc19009c0f672d85f9, 0, 0, null);
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
		return 64.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 64.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_screenshot_64() {
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
       icons8_screenshot_64 base = new icons8_screenshot_64();
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
       icons8_screenshot_64 base = new icons8_screenshot_64();
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
        return icons8_screenshot_64::new;
    }
}

