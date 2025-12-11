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
public class icons8_wav_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image5bc014fa0a595559429b7a0e8cb64cc0;
private static BufferedImage getImage5bc014fa0a595559429b7a0e8cb64cc0() {
    BufferedImage result = (image5bc014fa0a595559429b7a0e8cb64cc0 != null)
        ? image5bc014fa0a595559429b7a0e8cb64cc0.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1384);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAD10lEQVR4Xu2a+U8TQRTH+atEEeNtS7wVbzARxWgg8RZRFOVGDmOjKC1QLssRLhEotJwq5RCIVISigKCA3BBFUAHHfW8yK9kYA3GnoNmXfNN5b3d23mfnvVl+wMFBsX/IzLFqZ5NW7cNJRUatyku6Jhcr0alulum3zdTnHp2SWyadmph1LsQUp/aXriu7AUhdtts0GUshcgtAGouuEnPcVv4wvEHG+ptJR0OyAONCinXqQOn6spk9QMC4w9gLhDuMPUG4wtgbhBvMUoCAyQ6zVCBgssIsJQiYbDC8QbqtWWS0t+mPaij0oR9N7Zaz0vwWbLxBFqNinapSmt+CjSfIYgQ5QC7S/BZsCojMUkCYKSAySwFh9juQ1qrLpDhhL3lVdh79Lx8eot9QeBr9yZ4Y9CvS3MQ5by3XMAaa6LyLsfbnV9C35BwX72syetNnl5+zA0jlRZIQsIKUJLqi39MYgH6WZjP6fdYQ9I0Je8Q5pSkHMAZ6U+2Lsa666+inhDkLfjLGcu6pMdZWdYk/SL81FBfL1qjQbzadQV8f6EhmhvTCm/ZFv/axpzgnLXIdybyzEeM1eScwBjvH4CbfPyBzI0kkMXgV+qPt0fxBpvu0uFhSsBO+yQrDETGhEVs0aTR64RiA4P7P3TRhS44HSQxaSQp0u8RnpUetx2t9zSFkoktDdyh0NfkxSneIKwjIELkWF53qi8VyyI1xQb/D4keqMt1xPNQWifeyEoLegvJLDvmVaPmjQ3itpfwC6Wm4hWPoEel63ECg/jFZWwS+5cYiugtNxd6kKH43ltn3wQSaRP5JvPaxJYyYk/fjeLxTg9egqdluWcvoGJ4hXY8bSE2eJy4KJxf8Qt9AScBuwFtnjQ8q0O7Ae77260h9/ikcd9b64bXB1tvoG/VwenngGMpMuh43ENszH1zUlLQPf6d7tVheBdqd2DulqQfx");
    imageData.append("vrnhRMGnDTxfAATXZ4Xr0OAZwkFQonelOzkQbz+QwdfhmBDsQkb0BoxVprsL9e9Ey8NIy2PYFok+9FS54TCWHe7AvKP5Sex2BIDGh5chXYsryLeBOCEhR0yqTGhYiFlLaY2D3r3wxxj75lRnH0OfHbmp4WsI+3awHgJZcunRLBU3EBA7OuE7An7vyyAxIThKIVaVQU+wtqc+4jxDBD3xPnXfR7+r/oY4r6OG9o5UXEHgT40RWxQ2Mfizw3r0Qex4BSDwYQfZvPEOOo+davARZfNmhmhMKq4g9pQCwkwBkVkKCDMFRGYpIMwUEJmlgDD7r0B4/QvHYgQ5/BWIOVa1SXhA2HIQ5CLNT7HlbD8BPQANEmrkh7QAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image5bc014fa0a595559429b7a0e8cb64cc0 = new WeakReference<>(result);
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
BufferedImage image5bc014fa0a595559429b7a0e8cb64cc0=getImage5bc014fa0a595559429b7a0e8cb64cc0();
if (image5bc014fa0a595559429b7a0e8cb64cc0 != null) {
    g.drawImage(image5bc014fa0a595559429b7a0e8cb64cc0, 0, 0, null);
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
	private icons8_wav_50() {
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
       icons8_wav_50 base = new icons8_wav_50();
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
       icons8_wav_50 base = new icons8_wav_50();
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
        return icons8_wav_50::new;
    }
}

