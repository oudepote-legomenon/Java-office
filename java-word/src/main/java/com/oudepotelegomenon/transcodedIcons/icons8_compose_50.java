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
public class icons8_compose_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image422167e08c80ea731a6a8e5828c47206;
private static BufferedImage getImage422167e08c80ea731a6a8e5828c47206() {
    BufferedImage result = (image422167e08c80ea731a6a8e5828c47206 != null)
        ? image422167e08c80ea731a6a8e5828c47206.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1436);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAD/klEQVR4Xu2Y709TZxTHfTMT98Js/ismvppxkVKXkJqJKzFmw6gvfOGK8ceglI6NIjETaqWSQbHQCcUfOKkGLFJYBlRpRVtNqqISlV4VmhjRTBAtkK/3PAbCHgvtLW1vY/pJzpub+9x7PjnPOS/OihWfE7rKBnPJcZtXzig2Wt18XpKhD/15pgOX3T5ZoqWjD9pKK/i8JEMi9MH/wpAlAo9HMyL/47MWudDtAfVNKsJ0yoESkw3LHgCRROZ+wjdmqiKuAbCYCP8slRHXdcuIJDGSKpLKAXBcHAB6cQDoxdwWxpIDIFYRemY524Huaz5ZotUZZQBIEaEPysUjIcp1y4ikmIxIpGcZkQSQEYn0LCOSAGQRue33skgksojcCfix7lsVcjZvQYVBh4f3A/wrkpFFhFB9n8tk1itUKCvYhLbavQh4LuLtxCv+1ZiQTeTokd/xTZYKN9q0EP7Ros+2C38d3oxafTZc9kMIv5vgjyyJbCKPhodYJYI9RZj0V7B4c7MCQ+0/o6s+B67GPEkysokQjjoNeht3zouM9v4C18nvMHghH71NW+BzFmN2Jswfi4isIgHvJdjKVWIlDiPk1qK/KRe3nXuA8Wa8FWrR36KG/0pJTDKyilBj1+mVuNeuYZW44diB8JiViUiVkVWEcNkLccWSg8G2n+YFFgaTsUeXkV1kOjwlNvY21hOUNC9CMfWsDu7TefB1Us+85z/BkF2ECL+fhL+zhF2jeGViEqHNHq1g5oLWmIkUIWZnp3Gr69e4ZaKK0IqFXlgYtItNtAixHJmoIpFY7LotV4SIVybtRAhJMk4tkxkWQrC0dqWXCCFVZnhEwN3gC+ki/ACgNWYiRQgpMlfbDogiIWkikQYA7WITLUJ8lCmNKtMvyrgdBzFgVK/i85UELZGTIULEKtNt/xEmc+nTliPar/n8YiaZIgQ1tK9T91Hm");
    imageData.append("6acyLx/Xo6K6BsXi7dAZG/61/Gb5ks8xJpItQixWmfEnooS5BpXW8/Dce4byGvv00dKq8ZO796/h84wKidBqn+Z5soJG7EPhOa5dKkKf/QcmwyTESlQ1/o1A8DUejE1i8EEIuqoGmAoNYzfXrv2Cz3VJIg2ARMcJezsCIy/YdOp3FMLVtH2+EoHgKyYxNDqB+nNdMBgb0LM1LzywcaOBzzWtaG1VrzSZy4LUEwPidWISz9+g7owT5aKEcKwagkYDb3b2CH827Wiu1qzWGxu7y8zN03SdqBIkERQlpkwmhIqK4FEoJvlzaQlNpz9KK19STxiqrKwSJEExlJ8/41Eqr/Jn0hbbjn1fUWP35KrDQkEBQlot7pNEVtbMgEKxgX8/rbmjVq8UG7v8ulI5QtfJK1ZiTuIDQd+tJwkhOncAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image422167e08c80ea731a6a8e5828c47206 = new WeakReference<>(result);
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
BufferedImage image422167e08c80ea731a6a8e5828c47206=getImage422167e08c80ea731a6a8e5828c47206();
if (image422167e08c80ea731a6a8e5828c47206 != null) {
    g.drawImage(image422167e08c80ea731a6a8e5828c47206, 0, 0, null);
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
	private icons8_compose_50() {
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
       icons8_compose_50 base = new icons8_compose_50();
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
       icons8_compose_50 base = new icons8_compose_50();
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
        return icons8_compose_50::new;
    }
}

