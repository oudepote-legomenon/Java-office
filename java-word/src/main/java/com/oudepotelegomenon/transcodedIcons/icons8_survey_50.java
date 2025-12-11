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
public class icons8_survey_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image3fa1e58f069fa32ac339486e906991cb;
private static BufferedImage getImage3fa1e58f069fa32ac339486e906991cb() {
    BufferedImage result = (image3fa1e58f069fa32ac339486e906991cb != null)
        ? image3fa1e58f069fa32ac339486e906991cb.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(980);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACqElEQVR4Xu2azU8TQRiHuXjw4NV/iDuJtByMN3BbSbRNQ5RdIUYxBkthFw/9IGoiQcVoxYsSkhpNgVprwDQhPWhbRU1I/DiIUROkZZi3yjL7tmkHtjslZp7kl252Zt99n8z0tNPW5hCn+kJHPapxx6MZPxRVX6e/t+Eenneg6T4bPOJR9XceTX/pVY3jEEU1MopmFGEMz3eUpQnPoWS4s2ch4uqvl2vDfXeHhwZm2Zw+P/KKrkA+EBg7vFMPrr2aUTgzEMrg+VAD162RbuiJ7ZGL+bBrJBXr2nh968TverlweahMmyZsvKpeUjTdwDXpVhunq1TC86EGrosDvSQjx4K4ZkNS0a4X+Qcnya/5c3UTHA1amoLQLVRW1LGHuCb9r8xQmS08H2rgujjQC/SEazZkMepO5+NKVUGcWiIVGZXK9I+7dup5Nd0N9/A8bhHaC/TE9siFXRGarX+Nr9JVWP17rVetRktENt7cJ38+JCwxIterGttroAauC+9yTKT8vUgwT55lqhrba2afZ3DZyruEimxulsjUTIL4LoarGmwU/6UImXr0tFIDI1zEKaQIRoo0CSmCkSJNQopgeESKH9fMrH3+Zhmzi1ARNXTDzMS9x5YxuwgXSa8USDyRJrHpXRGQYiV5wyJcZPRmnFyJTpMYsyKwzdhtxxsWoSKJ1LKZpZW3ljG7CBVxEimCkSJNQopgeETWs1kzPwsFy5hdhIqk29vN5Px+y5hdhIt8HRwk73t7Sc7nM+/nAgGLJG9YhItk3W6y3NFhEYFtxm473rAIFfk0OWnmy9ycZcwuQkWcRIpgpEiTkCIYKdIkpAjmvxap9enNqTj66a2VkSK8BwZEZd8HBuC4xCLHEQ5RgV4WIp1XcZ8NgQMscJAlSR8+CNn3oRpJi9gGrVUhtmYQAoAAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image3fa1e58f069fa32ac339486e906991cb = new WeakReference<>(result);
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
BufferedImage image3fa1e58f069fa32ac339486e906991cb=getImage3fa1e58f069fa32ac339486e906991cb();
if (image3fa1e58f069fa32ac339486e906991cb != null) {
    g.drawImage(image3fa1e58f069fa32ac339486e906991cb, 0, 0, null);
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
	private icons8_survey_50() {
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
       icons8_survey_50 base = new icons8_survey_50();
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
       icons8_survey_50 base = new icons8_survey_50();
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
        return icons8_survey_50::new;
    }
}

