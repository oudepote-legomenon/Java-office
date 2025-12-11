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
public class icons8_zoom_in_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imaged7e6a3ca7972974262ec32339a9dae75;
private static BufferedImage getImaged7e6a3ca7972974262ec32339a9dae75() {
    BufferedImage result = (imaged7e6a3ca7972974262ec32339a9dae75 != null)
        ? imaged7e6a3ca7972974262ec32339a9dae75.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2020);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAFsklEQVR4Xu1ZW0wcVRiu13h5MMbEy4PPXl5NTDRq6qPV+qbpi09GYzTGNLTszIKsDbR2d4ZbSxd2d2Z3uZTSXSj3BRSwLQuUilxs2vqkrcYnYyK9BKYwHP9vKIb9wW6Z2aWTpl/yZcLOnPn/b875L+ewbds9bB4+X+Jh2R9+U1I0j6xqUbki1l9UFU/jKikRXQ5ECj2q/gae42NdAVnRX5ZUPSyr+jUSIQ6EkvO1bcNmff+EaBg4K3ANJodN/I77cnn0qqRqocKDkZf4u+4IvBWh58ixo8TlQKzDaE1fEOO/XxOzf4v/Je4n0+dFINphYByxcU8g9ix/95aBvuj7XjV6pSx0fCE1c3mdw7fD3ulLorQ2YXhVfc6jRHZyG3kHGd0tBSLL0Z4xc+Yvc52DmyHG6z2jJt7nUbWvuK28wRKh6uaJ8V/WOeWEbWMXBd67JWKwnPDlci1ilW2jJIbixqNo73LbOQMCGzGB5cQdyCX17lGTst+cXBV5hvuQEyA7IbCdxkQ2TtP7y+oSyGj13AfHQL7HlKemN5edPvpCFq9u32ld+b1bsXfqkrXEUJ+4L46AYoc6wQ1mo10hoD/abpDdOu6LbVhtB1VsFDtuLBudCEHR9JZHr3waCj3EfbIFyiBvoa3IVrE3ohMhZ/64juUlCtXQ69wnW0Cjhx6JG7odOhEC7q9LzEsBbQ/3yRbQxda2DttKuU6FBFuHlkiIxn2yBW9lbCBO3Ss3spZwdCNu37HLEoIrv7dK/q61jPWdEVS7+rhPtuAtj6ebvptcZ2Qt4axd8netJex6K2Ij3CdbuGtm5K6JEUq/e/ffoaxFrco8ddsF3CdbuLkH3/I6Mnb5qlVHaEZe4z7ZglXZaY+NSsuNZaMTIcmR87S31+d8Pt+D3CfbwEEB9tjcWDbaFTJD9Ovt6ICD3BdHkNXQi+hGscfmRm9Fu0J6");
    imageData.append("fvoNy8rc69de4L44Bk47Suu2Zj9SWttCnW8e9iMAjmy81AXrPaPrjOeSWnfapNrxT4ESfJr7kBNIauQVmpXrkqJbBwXcgVwQWwUs4UJFf4fbzwlWUrB+vTzeuRRuG0S1tQ4KuCNOaInAKUpA+5Lbzwlkv/Y2faX56qZuM3XmvEhNXBDh9iGBmcEycxoziAmdlpN1epIvEZI//B4ZuHHkWMqEALCXWN3YRYb1eVmNzpVRYHZP/mqlTO5kNg6c+1OUhRILiAnJH9nB7ecEhYq2i0Qs1RxLLa+KAGuae5dpCSzgVB1HNvRMPb4m9tgomtk6AFRsFLubdWKZPkgsb4EtB7RPkMfDJwb/EwAGj/eTCM3Aclv7PPI9ihf22GgrsLMLJofMeN/KaTyuaACtHZ91Gq/P4fm81IlVkIHP6Wub0c4fMkRQkEPE4q1OAdFOYI+N7Sm6VmptUkWV8TSu+Bu/435O246NIKu6hMwR6zqVIUKzglszKS1+yMe4DvS19xHNht6RDBEQBRGyon/Mx7gLQtwnKZEqWreLR/vHMkRAFGaIhHzGh7kKHyQSD1j/61Oji80D4xkimvpHhUxZC8dBfJyrgIAjR5uLKmI3WgYnMkRAFAlckpVICR/nKqwcg2pdRZUxIzE8mSGi5fsJgRnyBMLVfJyr4POFHqN1P1xcEb+RZCKSQz8KzBCly1o+zlXwHAw9QSl2ouRQvdF2cipDRCuJskQoehMtu/v5WNdA+jb4pLdcn/rmcJPRMTKTIaLt1JQorowbJKIz78XKCbCcSMTF0iNHjc6R2QwR7aenxdfV9QbFRSpnR/j5ArUVxSVVDQvdo+cyRdDMlFQ3GF5VO+nzxR7h41wHKnb91MVmiOhMz4p9hxtpJvSzBUrD43yMK0E90qH9dS0G9hIQgZnBMiMRPyMB8OddiyI1+jzFwBWIqWlOiZJDDQsSxYx0oP4p/qzrATG0lazG6bbHr3l3lyce5c/cwxbgX4W/U0gb");
    imageData.append("TGZ6AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imaged7e6a3ca7972974262ec32339a9dae75 = new WeakReference<>(result);
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
BufferedImage imaged7e6a3ca7972974262ec32339a9dae75=getImaged7e6a3ca7972974262ec32339a9dae75();
if (imaged7e6a3ca7972974262ec32339a9dae75 != null) {
    g.drawImage(imaged7e6a3ca7972974262ec32339a9dae75, 0, 0, null);
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
	private icons8_zoom_in_50() {
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
       icons8_zoom_in_50 base = new icons8_zoom_in_50();
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
       icons8_zoom_in_50 base = new icons8_zoom_in_50();
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
        return icons8_zoom_in_50::new;
    }
}

