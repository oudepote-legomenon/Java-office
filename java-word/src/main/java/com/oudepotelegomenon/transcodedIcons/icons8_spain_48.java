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
public class icons8_spain_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image77a00bf9461a57dd9fe9d6787f6758d6;
private static BufferedImage getImage77a00bf9461a57dd9fe9d6787f6758d6() {
    BufferedImage result = (image77a00bf9461a57dd9fe9d6787f6758d6 != null)
        ? image77a00bf9461a57dd9fe9d6787f6758d6.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2032);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAFvElEQVR4Xu2Xa0xTZxzGCzhoS6G0lNKW0gunV9oJCkUBlSnZkrngotG4OOdlm0YdRo2XOabCRGUi4IggF4WKDBklCgXkIqVcBGnLxRB1kujUORXjphE1k4nyrMOYLKgfVMR+OL/kSU7OyXnf83vP5f8/FAoJCQkJCQmJgxDv6cnezRR9ne5FZOVyFPWFvtqLRv+gvxoDQh51KiejMzACXdqp6Ar64O8OVcQVK6GzWkTBFW18TZaZo4qv9gz4rNRdOt5ACXQdOfZbZ8V7rPOr6NzHmxlCJLGkyOAoUMjToMI/CM0BIehUTPq/ADrs2zZ5GKziCWgXaNHoo0AVUwoD3R96umAwh8a7nE7jNqRQfXN/onHX5FB5UYUUtufIeV8FUChOuxmSqAQqd9/IY5TPXb2wksbFaAgU0AXIovGQRvPFTjef4aTax85w9xvKY4r6ir2J1jJfVekJoSa9SRT0bQcRssiq0EXblOERz9IZGD6jTRoyt1YUFFsq0OQc4MjbUrzEd753FyCW6o2R1z8mApnufshnilHkLcMxrhK19vOaxcGwBoTCqpgMW2AkOrTThmNTR+CUffwa+/Ff+FrkcJRIZkpACji8wHdMIVJV/iiMFqFuiQTdm6S4mhaAe3oC/YeU6C8IxO3MIPTt0ODqOjUuLFTi15lyWCZKUe0teXcCyzV0xM9yR/YGd5QmecKUyUJ3oQ8uG33R3yQAbEIM2SQY6iAw1KnAE6sETyx+eNzOxWAbC/fN7rhR4YqzGa5oXk9D2TwG8qd4IjWAhSQmZ1QF1vFYzwtsXOCMpJVuyNn86gLXTaJhgb5KV1woccHpQ844meWEmjQnlCY+jTHeBVVr6aj5io262Xw0fCTByWlytOveh00V8mIBRRhM2vGonKKA4RMRDi/gIGc1HXtiXd5c4B+LBLerxLiSL8S5Q1zcLGfgmvHlAsdT");
    imageData.append("nNCYOQ7WPBrOHGHgt6NM3Kxh416T/Q62CzDQKMGDShkeVCmHM9AQgIFWIW5U83C22Act2SyUJzOQF0d9QwEbgfu1atw3SdH0pRqm+UrUzJWg/GM/1Cz2em2BQYsIg1apPbKnsS/QWxEYaCdwpVaFu2UynE+Uo3OrGNb0MNiylTi9l4HeIy6w5bo4rsCjTh0u9JSj76AS9fM0aFhBoKc6C60tzWisMOLMz66oSqM6rsDv9tXu3LsNvVs1OLpqKoybJ6AuKQ4dVWY0Go7DkuyDoviVaN7n7JgCt0rsxStxIy4WRMC8eBIM8yOxLH4NWvYnoKlSj4Z1vij+cS1qt49zTIG71WHDj9Al43SYl6pgWiZDyawolM3hI58nRNdBGfKXzkFdooMKXGqOQrdpJvrMkTCv1sG0nMCJFTEonSGG3k+CMwYpyop+QEumg74D/9WBP1t1GLCo0N8yEb3GJThVsxum9XNhiotB62E+CtPlMGXQHESg3NdesIQYqJLg4XECD6sVGDypemEr8awSN+Sw0JD5DgQSF9GQEsPG/ul86EOkKJarX9qNdgWHoydyIs5+qMH52QTOfSFAz1ovdCfQYUsfN/af0cUcj1Ftp3PZXGQp2MiY5IHcmXSULHND3XY3WA68vkDZLg/sW+iBuFDG8wJj9T+g9xbjmFaC+ulS2OYR6P1GhmsJctxKV+BOvgp39Jrh3MpU4/pOe3WPlaEuRoaC8QT2sMUvb6fHSmA02mlSwHEF6NyhbR5+l9JYAcZ8X9UOg0A9v0oQHNHqH0JYVTrvZ+kOnhLYpQ6PtslCF1pEwRva+Npks4+iqNJT0lVCF957JwKbqNytiUyFdOT+18FA5YvyafxPM6i8LaluvJJkN25XGpV7ezQEtrjz++NoHPPIOceEHAafU8hURBu8iNhyjnJXvUCT2ygKqrBIQy1Wedhlqyrirk079WnU4X+0EbqeWlFwo4GvydP7KDZle8mnxVMoziPHJSEhISEh");
    imageData.append("IXlX/AtSQMU0TM2xMQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image77a00bf9461a57dd9fe9d6787f6758d6 = new WeakReference<>(result);
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
BufferedImage image77a00bf9461a57dd9fe9d6787f6758d6=getImage77a00bf9461a57dd9fe9d6787f6758d6();
if (image77a00bf9461a57dd9fe9d6787f6758d6 != null) {
    g.drawImage(image77a00bf9461a57dd9fe9d6787f6758d6, 0, 0, null);
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
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_spain_48() {
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
       icons8_spain_48 base = new icons8_spain_48();
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
       icons8_spain_48 base = new icons8_spain_48();
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
        return icons8_spain_48::new;
    }
}

