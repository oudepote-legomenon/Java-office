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
public class icons8_gif_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image72b5caae622a30147f5cc39f010c2925;
private static BufferedImage getImage72b5caae622a30147f5cc39f010c2925() {
    BufferedImage result = (image72b5caae622a30147f5cc39f010c2925 != null)
        ? image72b5caae622a30147f5cc39f010c2925.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(932);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAChElEQVR4Xu2azU8TQRiH+cM8erStHI3H1l689ObFqImJATUYDWpMtGAURGMChe0CB4X6QWgwBr8Nao3xC7rQWAptl7b7Ou+7LqmzWbKNM9vWzC95DrMzmX2f3c7MHtrTo9JFORDX94Vi2jFJ6OFY+ih/TykJRdOneuPTtcOJTFk0TAIicR3CMf0kf1/hQZFDiUzlzPVVEA2KnBjIQi/JaHJlZIu8er8OI6kVOMhkItH0af7+whKECEa6TFAi0mWCFJEqE7SINJl2iGCEy7RLBCNUpp0iGGEyskXGZ3Ow/NbYk+PnF+nQjMSmEnx9viNbpBVCUW2er893ZIq0AtaAtfD1+Y4SEYwScaJEBKNEnPgV6Uuugv6kCLlvJvw0duDDlypcuJ2nvofZEnz+bsLU/C9qX71nULuZ2YVN15zNBCKCEp++mn99WtTrFvQn16j/xUqZrj1+vkXtG+Puz5KlN9uueQMXmVsqUTHmjgXaoyJcuWvAzcmN3X4vERyPYxHn7XkRiEixVKfC8CfE9yFeIlXTco31QrrI4JhBRWHwyfL9iKcIeyMDt/JE/5D9M/RCushwaoOKsiygNbGwvAWVaoOYmLMXt5dIc2aeFl1zByoyNGGLYM6yp/oguwnb5Qa1tYxdnJdIgw17l6sQd6YLrrkDFbk4kt8VuXZ/na49YzuQH5GOWiOIUahRYYsv7S20a0VSbC04ef2xAj/YgdiVIgieJTV2CDZn8s9J3lUiCG6jo3oBxmYK9BniXL/Mtugk2xQujdqH3rnhNWqjED+HF4GKyESJOFEiglEiTpSIYJSIEyUiGCXi5L8SkfUXjlbAGv5JJHxE2x+Opvs6AlYLX59KJ+c31iJafaX/B5wAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image72b5caae622a30147f5cc39f010c2925 = new WeakReference<>(result);
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
BufferedImage image72b5caae622a30147f5cc39f010c2925=getImage72b5caae622a30147f5cc39f010c2925();
if (image72b5caae622a30147f5cc39f010c2925 != null) {
    g.drawImage(image72b5caae622a30147f5cc39f010c2925, 0, 0, null);
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
	private icons8_gif_50() {
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
       icons8_gif_50 base = new icons8_gif_50();
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
       icons8_gif_50 base = new icons8_gif_50();
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
        return icons8_gif_50::new;
    }
}

