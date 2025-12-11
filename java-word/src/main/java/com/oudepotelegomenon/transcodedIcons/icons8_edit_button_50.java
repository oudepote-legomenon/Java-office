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
public class icons8_edit_button_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagebc0b6fa935f74c559f9777a40f10e63b;
private static BufferedImage getImagebc0b6fa935f74c559f9777a40f10e63b() {
    BufferedImage result = (imagebc0b6fa935f74c559f9777a40f10e63b != null)
        ? imagebc0b6fa935f74c559f9777a40f10e63b.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1436);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAD/UlEQVR4Xu2aXUwTWRTHq+vL7oMPPhnf9mWTfdyY7Bp9qKbTdmYo2MYiKA/uh5tsRBFYhRYahkox1lJI1YowpRABgwTixk0aW1nxowxFCRsTXZcN2EQWlcSviPhB2znea1Klt10SN8a5xP6S/9PMPTm/3HtPOklVqiwfl1GD4Ysww6wZVKtXkM+WBJFNm9ZGtNorwxpNAgWGGWYuwjDeCMuuJN+llgs63RbU+PzNbdviM1YrPLLbYbq8HEZ5fh7J/b0kZFp37bPbHcdgrPRX+UVTEyzMM6cTrmIZtDPkOqpo3lNRX+US4VDLaXC4/TDV6EkRwfm3rAyQyLPe/PzPyPVUcLDaWVTt8kFvMAK3pmeh+VQA6txtcIeQwccM35kRtXo1WUNxLE6Rt7jaYqeDEXn83hzg/JcMvjMSGgDSunWfk3UUxeupPGBt8CV6QiNvJRaTuVFQEEcX/iJZR1H83uK9VQ0i+M8MpghkknEgmbGSMhlPsyGN5huylmKERJYP+vhYZ5cbbE3tcPl6NE1ioQweAHbHUcCjmaylGFgi5ONiE+EKWX7UCb8H2pGMHy79mVmmf+Aa4GmGpxpZSzEWSgCSwFlMpm/gmowlTuzef5CspRiZJBaTwRKWBl+srsa1g6ylGKEWfV5I5GKTUmWaxEKZs4EOsDW2Q9uZC4AkEih5ZC3FWGwnyGCZ7m434Gl25Ih1aRynTLk9bJGDIh/Do5mspRj/RwIfv3M+zkjWUoxgC8e9n4RVPt/KxrMSH5qsBC1kJWghK0ELWQlayErQwicpEY1QKNHfpC95Xwn0850uiV6X3oa+D2AivD+t4UxJSgRbWRNZSzF6GnQClpgMV6Q1nCmUSjBIgoV/LpWnNZwptyX8ZUeZxFGL5quT9dr4H/5cGOnbjho9mdY49RIYbxVzrOew8eXjiADnfRyMD5ZCbMafJkC1hEdg");
    imageData.append("VzZXa5/f+K0E5sbqYTzwC1zuNMGVU2Z4dVdMkYhKFgiKnEydBMZrZfb6atlXs6OONyI4T0frYKjbDH8N7H57zKLDFsCDoK9Rf4isoTigUi07YdNFh7p2ykmJZCbOFQO+/FJPAYxfLHsj0e/WOckaVLDnB32xp1KbeCDVpEgk8+RqLQx2mOiWwBhycx7kGTfL98P2FIFZdLRuni2FPveWlx312gTVEj8VctrvNubCtyhFRYWAZR5KAkhdP0NbLTuPBsALlGavjfmaXEsVZhN/HUskYzQZZY9FG0fNTx2vYipFQbeKXEMdxT/mrdmgeSeBdybHkPNw1w59iSAIy8n3qaXQzPVjgfUaAxiN/K3vt+s3k+9Qj6BSLc8x8DNbzXxgZ37ul+TzJYNaLazIV1H6V4hPjdeGSBo3nd/DDQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagebc0b6fa935f74c559f9777a40f10e63b = new WeakReference<>(result);
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
BufferedImage imagebc0b6fa935f74c559f9777a40f10e63b=getImagebc0b6fa935f74c559f9777a40f10e63b();
if (imagebc0b6fa935f74c559f9777a40f10e63b != null) {
    g.drawImage(imagebc0b6fa935f74c559f9777a40f10e63b, 0, 0, null);
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
	private icons8_edit_button_50() {
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
       icons8_edit_button_50 base = new icons8_edit_button_50();
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
       icons8_edit_button_50 base = new icons8_edit_button_50();
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
        return icons8_edit_button_50::new;
    }
}

