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
public class icons8_invert_colors_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image09aaadb69067be13aae7884db8069cc7;
private static BufferedImage getImage09aaadb69067be13aae7884db8069cc7() {
    BufferedImage result = (image09aaadb69067be13aae7884db8069cc7 != null)
        ? image09aaadb69067be13aae7884db8069cc7.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2100);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAF7klEQVR4Xu2Ze2xTVRzHMT74QzTGBP4x/qHhD8MfxoS13cD1MewobPeWAXfQrl3Zo2Ud7fpa15el3dYxNmDdm8eGLjEiIGrE8FpigABGEgNmgBgV/Usl6l8ocxvtPZ4zEeF3Rnvvtm4j4Zt8/lnbez6/3XPv+Z175817HGHhyuwLX1ern4V/f6Rit9vnW4Otv8lUzEmO456Enz8ysXibrnq29aKcFUVjUiWzG37+SKTMFTla17IX7Tt8DOltUSRTMgmpotAFvzeno68O1vta+9DO/kPowtUfkSUQR8WWAMJnJSmRFxTB78/J6M1+o3f7HhRp6+dJEf8VQmAMdlwMOyJRsFnwd3Mqeqt/qSvWk6yNdfHn7xZxfyGWQBtSr61ISFXszRx10SL4+zkRttz7nC3c9pcjEudPX/7uXhEPFhJHlb5dSL5KNypTsheWLrU8DY8z67HUxa57mnr4T05ffKAIWAhhk6cZ5bxVNCZTMN3wOLMagy2039fSh/o/PEEVMVEhBJ01TC5+XqpgdPB4sxKdJbCmbvteFO14hyogVSEEbamDx1PsdraCWQyPO6MxmRwv1ETiI45onD9/5QZVQLpCzP44ymMNY/jiH1rCcc/A489YKr2xa+5YN3/swmVKXkghhPLaFrLyj0pVTDs8/ozEaAttI4teH165oTgEykM2Vr2N8LXCy+SMGo6T0XDV/sXupt6kv7nn3qKXCig+EauLNyfxWflZoeAWwPEyFnNd8w1HfQd/+tK3lPREQOmJqPTtRMvV68gU64HjZSR49faRKbX/yClK+GFA6Yehs/47xSQqVg7HndYYDJ5FzvrOhHdbNyWbCiicCs16M55i7E8ZvYttckfPOBu6+MGLVynZVEDZVFR4W1F2npa0MA44/rQEL3yveZv3oObe9yjRdEDZdBSZ3AiflT+z8/NfhB5TDl4zhpz4Aj83");
    imageData.append("9AMlmg4omg6zvw1f+NyoRM60Qo8ppdjik/ta9qGOd49QkkKAokIoNpONGDuWlat9GfpMOhZv7Lp9666UbUgqoKQw2nC7v3FUomTj0GdS0Vudr5Id346+DyhBodCSwuAqfYg0lVKN5nnoJTqljq2HnY1d/Nmvv6cEhQIFhUKulZwVa0Zxu18BvURnS3jXLU9jJyUnBigohlUbqpLZKvYc9BKVUlfwJT9exXvf/5SSEwOUE4OummzAChNTelqp3xL0kbuV0J7qYUA5MZAejDxGkspZFfQTHFNN+ICzoVNQh5sKKCeW5fncsERRYIZ+glPmjA7iLjcJxcQCxcSiXK0fxmclCP0Ep9wZ/czRMPuF5K7aOCxRFrqhn+AY7eF+F97KQjGxQDGx5KxYOyJVFZRCP8EpqQ6Wk7vW4MUrlJwYoJgYKurGL3aUJS+UQD/BIU9JvC17UfvAR5ScGKCcGDZUhcjqPrJYo5kP/UTFGmr93ROb2p0LyolhJWdOyvK0J6CX6BhtoXayDzn55RAlKBQoJ5TxaZWnvSNVFKyHXqLDVUcWuBq7E/7tvZSgUKCgUFhjDZKp2F+m7WG3yR4eICv8oVPnKUkhQEEhlLmb8dlg70iUjAn6TDoKReQpG24endEO/swkumAomQ7S9aoYwxg+G1/g4Z+APlOKwVq3zNPUy9fGuijRdEDRdGjIwzql9pY0l3kFekxLDPZQLZliwdY9ou5iUDQVd1/PjU2pSRSS0ppwjLytdTd08J9/9Q0lPRFQdiJIl5u/voI8Nh3Fix8Dx81IcHtf5W7qSTrqO/mBjwcpcQiUhhhr6sf35zIV84dEXpgDx8toSjZ7llQFWn4lLQw5OwdPnKUKSFdIqbMJqdeVJ0kLglfvo2+8qVkIx5mxlNgCQXxHu00KctS3Jxu7BtCB42fRufueuPwv3zYuv7a8Ft+VjGQvzstU2ksz/johVXS2wGazN3bN1diV8O/oR+R1nKOhM0n2M/IC3d+5");
    imageData.append("K4uH8fxPkP9+tlJ7U6Zkds/4NBIbvcUnL9kSipqckYObXNHjeFHzZSkLq2WqgtUZu6U+zhzLPzUMJv45ItpUAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image09aaadb69067be13aae7884db8069cc7 = new WeakReference<>(result);
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
BufferedImage image09aaadb69067be13aae7884db8069cc7=getImage09aaadb69067be13aae7884db8069cc7();
if (image09aaadb69067be13aae7884db8069cc7 != null) {
    g.drawImage(image09aaadb69067be13aae7884db8069cc7, 0, 0, null);
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
	private icons8_invert_colors_50() {
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
       icons8_invert_colors_50 base = new icons8_invert_colors_50();
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
       icons8_invert_colors_50 base = new icons8_invert_colors_50();
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
        return icons8_invert_colors_50::new;
    }
}

