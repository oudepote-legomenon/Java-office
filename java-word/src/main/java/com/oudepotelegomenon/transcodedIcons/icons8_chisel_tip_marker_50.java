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
public class icons8_chisel_tip_marker_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imaged22c1352e8d976ee8b243289652f29e9;
private static BufferedImage getImaged22c1352e8d976ee8b243289652f29e9() {
    BufferedImage result = (imaged22c1352e8d976ee8b243289652f29e9 != null)
        ? imaged22c1352e8d976ee8b243289652f29e9.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1696);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEwElEQVR4Xu2Y2W8bVRTGU0ElhHiAB3hEwB+AhHjiAYQEgocsVZFCaYooSCVISAhQJWInboeSQDoztuO4ramdGRtCFkiatM0i2iSKGgSt05QqtElKCaBmaWOP98RZPB7P4V4HS+4dp3iZhIzUT/pePMs5P91z75zjoqL7yk7nD1gN2OTvmtL5Dxr1nl0MeMoYGHjfUkte14RSENFDnRD9vEubMOkQ0H8t6SilMZhMEJqD0THca+79loTwhhGkdrcCZB3mFGDQc5VWinx+WwhD6I28eHbokuw/3An+vVaQ2jaC2aYr85nR8TqG6L0wJi+KAIsrEmQLM3zAsj1WporlXtIbuVhPCiJlLcEcZG1PVBudwVMDvyTugtAajI5pqjW5utZCawklhJZgDA2u6dEbMzAfWlECaAkGbfDViVsCTM0FtA2jYzmYnPUnQbDngstKgDxhtvRoJkE0C5MJRJMwG4FoCqbSbt+JQaZmfQqIlDVxAOgY/pPDlm/FhfAq3LwTUkBsxsqoDpP8opv46PDYZDIZ/EHcKhhVy0zP8jzt6IiF077omoOpMnLPob2R+G16XpGMdmAAdtSYnZec3YOiIgktweiM3D60N6Q5/5IyAa3AUJT94Rqzy9M38qsycAZvWxg9w31Ve6IlFlyOK4Nu4EJhItE4BAw/gL/iWMb/APBvwm4jjFeYF8h8M0pn5p/Bo6x78m9FsP9yoTAbrYz0/SgIexthosIUOr2/4VEy54yqMTn7GpvPxiJkkCytNkxeEGgef0XPcvL0nYAyQA4uFCZVZj5UZt49jXD9bXMwawiKoh5Ex+3NjnM/S+SL83GhMLe9Ybj6njUxsS8HCKwqtulT3E95IquKl+brfGHmA0tQZ2uLUSx3IScI/Zf848l+6vJ6P6Wmc4WZ9S8iiNYYqo4hinI9ROZ6T+kYzmwwuyR/VFQkooazhZm6");
    imageData.append("5YEjx5pjBpNzMGcIrKp611OHTE7PydZeOYBODTIRNRxazQxzY37d3UPuBOrr5Goj78DzD5ljVgqWHH3yjz2mhXqGl+3t/aA2zEJ4BVr7RyScKB7QMhl1Em4097xK5pa1MISwi50LVTaJga7LQFu/A7VgcEkNua+DwfJNHCX6OyrhcpxsuvW040U885B55aR0CLlnPPkVDZ0ZA8baAraWXgjk0KKQvvbXbWCaOmPVJucSGgc+xsc7GV8VZYJIuRCYGV8EXN2D8X/rvRWfiGRs1XQviHxh8D19P12RcetfbXZe1DNNz5JxVVU2ELnA4J5sFDWYdSeSZ7+3iuHfwUMZGVdV5QKRDcz0vB9wg4m7ZVRKNHX8+CNkzE2Rt/hom1BCw6K+XZZPX1UkvZExDN3QDLbmniSMN7IGnQMXE7jBRGX0Yw3reJqMtenyldSXCmXsjLCbFZfrzkA2KxM7OQx/vmmSvmD4JbOrK546TlF/9jL5/i0VPG/f6SumKxFQ2P+WdW3NOgDQpwRIQQhljCQUMwzuAFCrP47K6MPyjo4HyPf+bwoX1z+GSo0WSmkx+K5NFLmRuyG+RhClCALdQz67LYUPAV8Z0+YtoeXwR644no81B5EuTwnzAgK6kgQopSVvMXOEvEczgiLYgfZDOdpDB8lr96Wy/gF0HfKAUpg7wQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imaged22c1352e8d976ee8b243289652f29e9 = new WeakReference<>(result);
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
BufferedImage imaged22c1352e8d976ee8b243289652f29e9=getImaged22c1352e8d976ee8b243289652f29e9();
if (imaged22c1352e8d976ee8b243289652f29e9 != null) {
    g.drawImage(imaged22c1352e8d976ee8b243289652f29e9, 0, 0, null);
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
	private icons8_chisel_tip_marker_50() {
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
       icons8_chisel_tip_marker_50 base = new icons8_chisel_tip_marker_50();
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
       icons8_chisel_tip_marker_50 base = new icons8_chisel_tip_marker_50();
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
        return icons8_chisel_tip_marker_50::new;
    }
}

