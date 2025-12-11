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
public class icons8_powerpoint_file_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image91e84b58c24bd925f549235b45c7e1c1;
private static BufferedImage getImage91e84b58c24bd925f549235b45c7e1c1() {
    BufferedImage result = (image91e84b58c24bd925f549235b45c7e1c1 != null)
        ? image91e84b58c24bd925f549235b45c7e1c1.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(888);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACYklEQVR4Xu2az08TQRTH+cM82VK89KYHPXiwUCwVJRolelATxa4mJpxMDP68mBBIFA4cIE25yOqm0sY2/kh7QGpsK1ClaGmp7dfOak33sa5b2emUZD7Ju8yb3XmfzO6+OWxPj2QfofrdB9T+g6M84tWgZy7m7w3SNbmg+lxXtaC3mlTOlJyO2EkPYoE+RP3uK3Rdx2EiidDwNjjARNKhIcSHDkHjLcNbZCs8hewj5dfODLiv0fUdoxMieB/lL9MpEe4ynRThKtNpEW4yIkS4yIgScVxGpIijMrxF8k/GUVyYtIzUWOB30/SM0Ppsw1uknYj6exdpfbbhKdIOrAZWC63PNlLEYaRIEyniMEJEUhM38Ob2+V2RuhfC2ssw6rUaveSfCBHJRWbwYXpiVzARbdiL19cDqHxZp5dZIkTEip3NApI3RxC/fAK1sv3bdp0I40fpG5ZHj2H12UOa+itdKcLILc4ievYwUK/TlClCRNL3FVQKn+mwgfJGHmq/C9u5DE2ZIkSEFViIP6fDBurVqj6vmE7SlCnCRDKzj+mwgT87kv9IU6YIE4ldOm75/OcijXfk3BHLOa0IE2HxaX6apnSq37ewfOEoMjPWu9aKMJH0g1t4MdiHNXXBkNv5uoGkcrrRR3yoVcqGnBXCRDbfxZENP9VlWANcmbqrH120U14kxoK6UDsIFWGUsqtYmbyDt+MX9c/yuhbZP2etVhGnkCJNpIgUMUeKNPkfEdY7iqkEHd4TQkRY77B7hrKLEBEeSJEmUsRhHBHh9QtHO8Fq2JPI0oDLveRzKV0RjVpofZJu5ictkkjBLSqDhQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image91e84b58c24bd925f549235b45c7e1c1 = new WeakReference<>(result);
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
BufferedImage image91e84b58c24bd925f549235b45c7e1c1=getImage91e84b58c24bd925f549235b45c7e1c1();
if (image91e84b58c24bd925f549235b45c7e1c1 != null) {
    g.drawImage(image91e84b58c24bd925f549235b45c7e1c1, 0, 0, null);
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
	private icons8_powerpoint_file_50() {
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
       icons8_powerpoint_file_50 base = new icons8_powerpoint_file_50();
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
       icons8_powerpoint_file_50 base = new icons8_powerpoint_file_50();
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
        return icons8_powerpoint_file_50::new;
    }
}

