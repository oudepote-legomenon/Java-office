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
public class icons8_cube_80 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image29c7649774f96f1789937082ae88e63e;
private static BufferedImage getImage29c7649774f96f1789937082ae88e63e() {
    BufferedImage result = (image29c7649774f96f1789937082ae88e63e != null)
        ? image29c7649774f96f1789937082ae88e63e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2980);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAFAAAABQCAYAAACOEfKtAAAIhElEQVR4Xu2cSVAb2R3GZ5JKMqmkKjnkkEyqklySHJKcshymkpxyzSmZa3LLIVWpGRZtXgZjPAwDNvYEkNQSiH0xMBg87DuoF4GFBAKBwmJkwCCwkIS6JSEh9PIeNZrxvDbYoltCwv1V/U4g6f0/qf/9ve5+7403JEmSJClJAuDNEyQlrhy18bcqPTOrJOjF7ArqHfzvkk5RbvnYDxV6uumKnmG7LK5jSOxKJRNQ6OgW9Df8/yV9rn8R5m/INGSWgqBZ/eBKaPZZFCz6wAk2dxTUTzhDcoIK5GrIgv980vst/PWvtXLVxr8oCcZZ3DbHMk+CXxiHY9oMgXtddr9SRz+VqY3v4u/z2kmmGf+5UssMXa+ePhiwe3iGncawwwtu1D6CRlKkvNz4K/x9L71ySga+gw5FpZb2N5Eb4fn9Y55JL8PuiYFPp7cjSh3DytVkhYIwfw//nMsnGElyK4z/kGtpT9lnDnbGFeEZkyjWvSOgH1hhFQR1kF1hfO/d1tav4x97KZRTQf0eRhJLQf2Mb3zVzzNCKMZ1DhQ2W7zwbG3PLjf+Ef/8jJWsjHwbHqpVKj190DnjOrK/oHgx6Z93R2HsOZAT9IOccuqn+HgyRnmtC9+EZ9f35VrKD2OJf879ZSxJNqin1o2vs/CzOTiG/Lzqsbfw8aW1ciqMf4WD3yppt+2btkK8AlPFo+1D8N+HS244Fhfqvfg4004yNflLONih64Ypz4B9/xgv6KIYcXhjN2oeeeDYyKwy+jf4uC9c790d+75MTX2sJChfE/mEW4ARAy/iovk89gTgiewgV0Pps4mxH+B1pFx5eeBrJ7FEQ+2XdS15LCLEkmSDYo+uf9kj01C+C409cg39B5jnLLcaLS7jOhvDB5ruoCnjxy2ze/CwtsOz9Z/x+pKmLA3941w11QDno14YS0LJjiXJBsaeQ5We8cKaehQa");
    imageData.append("5md4vaIp6w797Ry1UQG/MW/V8Jo7lbEk2dhg7GmcdLrhbMaXqyaL/l0+9l28fkGCP/G/wzPs1u32+e3pp4e8AVwWUG2lHQu7Mi25hWrGfTi34LcCPmq2hjPhJCEUVGMRrBXVjPtwbqE3Uw8+jqgqmUgLtRlJx5giFFRTC70Zhf0wUvxwWXwDJ10A9K2GwO0Hi9wH1Y+CPXN7GXfmPY2T64s15mB+02yg0rwPGhYDICkGxvnUBj+wzhwsbp31k84Ab0CZArMRBHfabf6rhumQ2rhzYlycpBqImNiOgTp6+/hqpelQ27vMWnYzpz/OwjBtGHnMwSgWvtO3Gq23c18xLyUGxhnePALl/Ssh2DsO7zNbITRlwgecLti9AHTNuMIq+KUXtttDNXMHPONSbmCc3tUg+Kh1PvBB9TSbThcS4qALCvl1ZvZGozWgn3bzDMNJuYFxWq374JphOljSZnNPXeClrDjoklbZw6V9ld4UKhvd5Bl1GhdmIGIc9keDcSuqgD1GN7C8//w93lSB7iXXjq8foDGUdK8c1S+wPJPO4kINjDPoDINPepYD6MmC9umnLOpBeKFig+bm3bN7h1eqTIEC2FKqrV6eOa9CWhgY56GDBQVNVg72oP3RZV8EL1osJtf8x7caZzzXa8wcwezxTEmEtDIQMQFpMe/FrlZNBcWeU5t3wqC8e8ml1DPBe0POWIOdb0iipJ2BccaeHgPdiDMCM9hh9cjjXXQlBDfkVUHTr2Zy4xnsc4dFnY5w3Xxife4s0tbAOIPrYVDa6YD90cR2zuz4Er2u2Dvv5mCfY/Ob5wKGGQ/PAKGkvYFxHiz4QF6tmbvZYNmeXGPDuFE4tDMQLWy27qgMUwE16eIVLhYZYyBiYgeABpMrhrLa3Y4FJ+xpvAsV6F6GutexpSCYUOnA+vGLpl9iklEGxhnZOAKaofUw6mmG4bVNdIMc9blGcmNPoaVDhR2LZ06/xCQjDYyDpoVFbfPcNcOUB561");
    imageData.append("PXD6xVaZxe9zZ5HRBsapGFgDRV2OGF5cKrgUBurHnoCSnhXJwPMiGSgQyUCBSAYKRDJQIJKBApEMFIhkoEAkAwUiGSgQyUCBSAYKRDJQIJKBApEMFMilMrBjwccrMNlclIFaeld0A/8mJ+jd4o5Frv/xIa/QZJFqAw0WL7jZOh+UE9QzuUbEh8yR0OpL+Ma5aFMIdONndCvKK1hsUmUguiF/u28tgja1kGmpQrSkA69fNKGFNiqdqV1VyQQap1wx9MgGXrhYpMLAisltoKg0QePokaQutMGFlnop9cxCQZPV/5mD4xUvBsk0EN3ly2u0cgqCWZGpyT/h9aVEaLGhXG38JzysfXe7HKGhJxGeCUJIhoE1Nj8o6lwKwUOVzdGQWRe22PB5oeWuKj1zV0nQXOXERnR8J8Yz4zyIaSB6kuHesPNYoaMDSoKpTYvlrriyyyZ/odQx49cM01zbnIdnSKKIZaCW2gVXDVPwcKWmctTUr/Fxp53Qkn94WO8UtS0E+tZCPGNeFaEGGqxecKvNzsEThDsjlvw/L7QXllxLZsNowJX3r54r9pzXQPQ8NHxdRKYlg/AXdyvjNp14Xu8TEz+6Ummqhz2SQ09gJRJ7zmNgPJYodEy3gjD+BB9Pxgr+Gn4H+6Mtv36G7Vz088x6EYkYqJ96Bq7XW1g5wfzvUm288xUB8OZJ7NHS3lIYewZfEntexcDaORhLHqRZLEm20OZjsDd+CAkSo87o+PYxz7yXGYhiSengehT+4tDcVfN6bD6GCW1/B3vV6EnsmeXHntMM1FAuoIKvkRE081puf4crvgHjh/dtXM9K4FQDq2Y84GaLDfW5bWkDRkwo9uTC2AP7I1fetxoe2Yx+YWDdvB8Ud38ZS6QtQM/QySa0lXQLij2F920gr8Eag2fvoFzHtEqb0CYgtA2yUmeag7MIaRvkc0vaiFuSJEnJ1f8BOp4IF0rURSEAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image29c7649774f96f1789937082ae88e63e = new WeakReference<>(result);
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
BufferedImage image29c7649774f96f1789937082ae88e63e=getImage29c7649774f96f1789937082ae88e63e();
if (image29c7649774f96f1789937082ae88e63e != null) {
    g.drawImage(image29c7649774f96f1789937082ae88e63e, 0, 0, null);
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
		return 80.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 80.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_cube_80() {
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
       icons8_cube_80 base = new icons8_cube_80();
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
       icons8_cube_80 base = new icons8_cube_80();
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
        return icons8_cube_80::new;
    }
}

