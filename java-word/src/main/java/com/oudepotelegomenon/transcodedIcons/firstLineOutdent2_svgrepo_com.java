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
public class firstLineOutdent2_svgrepo_com implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image9eafdb1977231d7a8d33f88821547b4f;
private static BufferedImage getImage9eafdb1977231d7a8d33f88821547b4f() {
    BufferedImage result = (image9eafdb1977231d7a8d33f88821547b4f != null)
        ? image9eafdb1977231d7a8d33f88821547b4f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(4124);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAYAAAAGACAYAAACkx7W/AAAL3klEQVR4Xu3cbaj2azrH8Z+m5LEmkihEmKYQbYlQU4hQCqmRNKhpkBpJHlL7IomSiEiImkSEmqSIjpiUCSHKQ0KSSJEkUdr+52x3uzlPY+/7f69jrfNa1+dT3zfTvo9j/a8X5/FuEoDb9TlHl/l/BOBx++ajF+IAANyM9zz62bz4+DsAADfiU47+LC89/g4AwA346rzzw+8AANyAH8368DsAAI/Ya4/envXRdwAAHrHXH/1X1gd/7vK//z0Aj8D3ZH3o31WXF/8JANfsg49+Nesj//91Gf8QgOv1uUf/lPWBf7kuAeBqfWvWh/2VdgkAV+e9j34u66P+NF0CwFX51KO/zPqgP22XAHA1vjbrQ362SwC4Cj+W9RF/li4BYGsfc/T7WR/wZ+0SALb1ZVkf7rvqEgC29L1ZH+277BIAtvIhR7+R9cG+6y4BYBuff/SvWR/rji4BYAvflvWR7uwSAB7U+x79YtYHurtLAHgwn370t1kf5/voEgAexNdlfZTvs0t4xZ47eqOkp+41YfaTWR/k++7yyGo1DsD8A0p6+RyAl3zc0R9n/Y30bFWaOQDSuRyAF3151t9Gd1OlmQMgncsBSL4/6++iu6vSzAGQznXLB+DDjt6W9TfR3VZp5gBI57rVA/AFR/+R9ffQ3Vdp5gBI57rFA/DtWX8H9VVp5gBI57qlA/Dqo1/O+huot0ozB0A6160cgNcd/UPW71d/lWYOgHSuWzgAX5/1u3V/VZo5ANK5HvsB+Oms36z7rdLMAZDO9VgPwMcf/XnW79X9V2nmAEjneowH4CuzfqcerkozB0A612M7AD+c9Rv1sFWaOQDSuR7LAfjwo7dn/T49fJVmDoB0rsdwAL7o6L+zfpv2qNLMAZDOde0H4LuyfpP2qtLMAZDOda0H4P2Ofi3r92i/Ks0cAOlc13gAPvPon7N+i/as0swBkM51");
    imageData.append("bQfgm7J+g/au0swBkM51LQfgVUc/n/Xv1/5VmjkA0rmu4QB84tFfZf3bdR1VmjkA0rl2PwBvyvo367qqNHMApHPtfAB+POvfq+ur0swBkM614wH4qKM/yPq36jqrNHMApHPtdgBen/Vv1HVXaeYASOfa6QB86NHvZP0bdd1VmjkA0rl2OgBP/FDWv1PXW6WZAyCda8cDMLwh69+q66zSzAGQzrXrARg+9uhPs/7Nuq4qzRwA6Vw7H4An3pL179b1VGnmAEjnuoYDMLw569+u66jSzAGQznUtB2D4tKO/z/oN2rtKMwdAOtc1HYDhvY7emvU7tG+VZg6AdK5rOwBPPJ/1W7RnlWYOgHSuaz0Aw+cd/XvWb9JeVZo5ANK5rvkADB909FtZv0v7VGnmAEjnuvYD8MT3Zf027VGlmQMgneuxHIDhS7N+nx6+SjMHQDrXYzoAw2uP/ijrd+rhqjRzAKRzPbYD8MRPZP1WPUyVZg6AdK7HegCGr8n6vbr/Ks0cAOlcj/kADJ989DdZv1v3V6WZAyCd67EfgOE9jn4h67frfqo0cwCkc93CAXjiW7J+v/qrNHMApHPd0gEYPvvoX7L+Duqr0swBkM51awdg+MCjX8/6W6inSjMHQDrXLR6AJ7476++hu6/SzAGQznXLB2D4kqy/ie62SjMHQDrXrR+A4aOPfjfrb6O7qdLMAZDO5QC85Eey/j569irNxgH4PUlPnQPwzt6Y9QF7iOqRBXAVPunoL7I+yvfZJQA8iHc/+pmsD/N9dQkAD+obsz7O99ElADy4zzr6x6yPdGeXALCFDzj6lawPdVeXALCV78z6WHd0CQDb+eKj/8z6aN9lzweALX3k0W9nfbjvqucDwNZ+MOvjfRc9HwC291VZH/Bn7RIArsL4v6P5k6wP+dkuAeBqvOroLVkf8zNdAsDV+YasD/rTdgkAV+kzjv4u68P+SrsEgKv1/kdvzfq4v5IuAeDqfUfWB/7luox/CMD1");
    imageData.append("+8Kjf8v60L+rLu/4VwA8Ch9x9JtZH/v/q8uL/wSAx+QHsj74c5cn/zEAj8tXZH30HQCAG/EJR3+Y9fF3AABuwLsd/VQcAICb9eY4AAA363VHfx0HAOAmvfrol+IAANysy/w/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMA71NELkqQtqzQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjQaw+eFkqQ9qjR6TpK0dQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABP430kSVvXpo5ekCRtWaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4v");
    imageData.append("lCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRGD4vlCTtUaXRayRJWwcAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHfuOUnStrUaC16QJG1XpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6A");
    imageData.append("JO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWaOQCStGeVZg6AJO1ZpZkDIEl7VmnmAEjSnlWewv8AaIFy0vzd5oMAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image9eafdb1977231d7a8d33f88821547b4f = new WeakReference<>(result);
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
BufferedImage image9eafdb1977231d7a8d33f88821547b4f=getImage9eafdb1977231d7a8d33f88821547b4f();
if (image9eafdb1977231d7a8d33f88821547b4f != null) {
    g.drawImage(image9eafdb1977231d7a8d33f88821547b4f, 0, 0, null);
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
		return 384.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 384.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private firstLineOutdent2_svgrepo_com() {
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
       firstLineOutdent2_svgrepo_com base = new firstLineOutdent2_svgrepo_com();
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
       firstLineOutdent2_svgrepo_com base = new firstLineOutdent2_svgrepo_com();
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
        return firstLineOutdent2_svgrepo_com::new;
    }
}

