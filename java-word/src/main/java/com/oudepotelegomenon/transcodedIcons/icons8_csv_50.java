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
public class icons8_csv_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef692242d4c228aa1384cb6f1494a1d5e;
private static BufferedImage getImagef692242d4c228aa1384cb6f1494a1d5e() {
    BufferedImage result = (imagef692242d4c228aa1384cb6f1494a1d5e != null)
        ? imagef692242d4c228aa1384cb6f1494a1d5e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1184);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADQElEQVR4Xu2aW08TURDH+WA+gglGEy+RmMiWa4JYGgn2ErkIgqWtoHKxEdqtBWylpdwEbaFAgvogieAFUQyK8KIfQR98GHeGnk3ZBVPingXNmeSfZmb27Jnf7pxz9qF5ecL+IZNCrmMW2eHiIUl2JIsDdqt2Ti4mBR0t5eFrv+yjnh9GyyI7oTTkAuW3WTuv4YYgdQn3z/T2AhgtBLmVCpoDwxtk/fsmjK+kCUYKOtu08xtmZoCgcYcxC4Q7jJkgXGHMBuEGcxggaIbDHBYImqEwhwmCZhgMb5Dk6jNY+7bxR3mT/QRTEnDWauvL2XiDHETFQfuitr6cjSfIQYQ1YC3a+nI2AWKwBAgzAWKwBAizXEBmvs6Bb9YPVQ/qoTzggJ7FkBr3zNwD62ATVMou8KR6KV4bvQHWoSaQlyLkT22kyEfFVid09zcFJLmpfEL02yG/VVKFUJi7PNC4K24buk7x0r6r5DdOdJAffjVM/vGbJfDk84xuDlNAmpRisIiTvgrwPw9D7N04TH56CtE3oztxb4VSaAxG3k8qsQSNqR/zUa463EB+51wf+Rf9tbr7mwOytQCnfJVUhFdpoeyc/0WY4hd6bLpxCIy583et5DMw50i77lomriCP3o6pbTP6YWpXbuzjNLUK5q5EW3a1zMT6NMUL2izUmri20O9elHVzmAIiL0V3QNokSG3N6fLuZK8KWtRdA3GlvVju7J1qimMLFnVZ93wY2eIKgr3PCk1+SevyqF5lBzvRXk7XZK8B28NmimEe39yZ25d0Y7PFFQTbh4FElCerzTNhjrUZ215xW0bfEXPTb01mR9tPXEFwsZ/urKJC6oZb9fmMZrfmaVfD61h7DS7HyT+XaTF2xuwnviDbuA561LdSGXSBK+GBgeVhpdAYVA800PaMhyHmi7pqYHZ7nsbhmip0l6ljh1biunubCoJvxRF3");
    imageData.append("Q0GrRS0Kn25H+r7qo3CrjbzeOUeY2EFa2F6252ZhLkhGibXHdD7g+YEHIrYTbga4mPEN4eeKdgxu34GXEbpOm9PKNBDeEiDMBIjBEiDMBIjBEiDMBIjBEiDM/isQXn/hOIiwhr8DCdnzpaDTeySk1KKtT9hRtt9/VvtICncDiwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef692242d4c228aa1384cb6f1494a1d5e = new WeakReference<>(result);
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
BufferedImage imagef692242d4c228aa1384cb6f1494a1d5e=getImagef692242d4c228aa1384cb6f1494a1d5e();
if (imagef692242d4c228aa1384cb6f1494a1d5e != null) {
    g.drawImage(imagef692242d4c228aa1384cb6f1494a1d5e, 0, 0, null);
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
	private icons8_csv_50() {
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
       icons8_csv_50 base = new icons8_csv_50();
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
       icons8_csv_50 base = new icons8_csv_50();
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
        return icons8_csv_50::new;
    }
}

