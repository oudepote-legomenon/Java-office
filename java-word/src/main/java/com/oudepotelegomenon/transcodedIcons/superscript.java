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
public class superscript implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image57030e07da8274569220667477680c20;
private static BufferedImage getImage57030e07da8274569220667477680c20() {
    BufferedImage result = (image57030e07da8274569220667477680c20 != null)
        ? image57030e07da8274569220667477680c20.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(900);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAACaklEQVR4Xu2YS48NQRTH/14LFiJigdgStkhsC+MTeHwDRGLt8QmwssVOJBLEwnYseiQW4rGwQEjYCDuxMhOP4BzVVeeoc7v7zp253TVJ/ZLforv+1X36Vt/u6gIKhUJOrCLPkO/IBfI9eZFcrUM5c5b8Q/4kX5K/622+qBXBB/iCz9XbN+vtBzGROUfJ4+TWevs2/AXciokVxF7yO/wFHEnasmc75Ha6mrSNzUP4AzTpYrIZB9tPOxuTwhbyFXz7HSzhCbQP8hQY5WOJNjIH2y/Ixz4Qk56N5DP49qfkhv+bF89d2BNrXUxaDsHmtfzrptyHtL+AvwuCE7GT/AF78mDbKMzB5oO/yN0xKTyHzQYn5jrswbQuJoXDsDntNYlOn23kN9gigqNG4RFsLjhP7pBoP1yGLUTrYhKYGdGuvSTR/thEfoEtJqhHoe3X/0pulmi/nIctSHsQ/o2Z7teGOc4grCc/wRYV5F+eRyLdH+S+fIxBOQVb2LieRAasIV/DFtflW3ItMoGnu2mBXR771zMT+LPvCWyRTfLchvtkhYMttEl+L2RH1+My6wtY7C3EE7SsbqETsEV2yX/8LODH6BvYArvkdZ51yIDTsMWNK78EB4WnAR9hCwtWten+4GcswyfiUrgAW5TW1ab7tTwhHISu6XQl0dZRGGw6fQW2GK2Lye5R4I+jXuFFprZPykqiEd6X5oK86tzrJ+UN2CK0LiYFB5vT8kJBL+yCX+pOCwhWEjVwW5oP8rLKHolOj3uwJ9e6mLQ42LyWF82myn60Ly1WEm2EM2m/4KilxWWlj8XdKiYLhUKhUJiAv7qD3glI7m4gAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image57030e07da8274569220667477680c20 = new WeakReference<>(result);
        return result;
    } catch (IOException ioe) {
    }
    return null;
}


	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.03779527544975281f, 0.0f, 0.0f, 0.03779527544975281f, -0.0f, 3.6909448681399226E-5f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0_1
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(35.27083206176758f, 0.0f, 0.0f, 35.27083206176758f, 9653.0f, 14003.0f));
// _0_1_0_0_0_0_0_0_1_0
BufferedImage image57030e07da8274569220667477680c20=getImage57030e07da8274569220667477680c20();
if (image57030e07da8274569220667477680c20 != null) {
    g.drawImage(image57030e07da8274569220667477680c20, 0, 0, null);
}
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

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
        return 364.8377990722656;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 529.2472534179688;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 63.98740005493164;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 63.98740005493164;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private superscript() {
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
       superscript base = new superscript();
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
       superscript base = new superscript();
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
        return superscript::new;
    }
}

