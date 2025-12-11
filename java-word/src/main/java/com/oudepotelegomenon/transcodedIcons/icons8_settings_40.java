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
public class icons8_settings_40 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image55f834b57c7655f98f42661658b6a905;
private static BufferedImage getImage55f834b57c7655f98f42661658b6a905() {
    BufferedImage result = (image55f834b57c7655f98f42661658b6a905 != null)
        ? image55f834b57c7655f98f42661658b6a905.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1968);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAYAAACM/rhtAAAFjUlEQVR4XuVY21MbVRjvi76po86oM/oX6Is++Kbju0/OOOo/0OqTD5WGXADRjlYu2U2opYVKIcluEgq1CCUU5BrECoQClUi5tAREcAgV5DaxmdHj91vcsDm7mwSGUkd/M9/MztnzXfac8/2+7+yxY/8HiFZprtziZVrBGD/voaA8z/eMaPcnZqMb7M5Pm4rgWbTJCbc98Cw//8hRavG+5xGvb6jBqVJHY+V5nnf5+UcOl0OuvX755l98gBijlb3Ezz9SOD/yviLa5ZWb/T+nBQfBGN6Vnap7mdd7oCgubnhUyPd84Lb7fzlbVL/V5L2R1J4/7Tls8nyfxByXI7Ao5HtPQJe3d6ig8/YGrcqvdUJoa7hvXheUmQz1xlgt6Qg2ebnUIr3O290XKIg3XQ5/R9kp74mSfOkFddxllU+7CwI733XM6ALIVQbaZxhsOG1ysWpXOOl53mnxHKfxdvhWxw2BLXDZ5aVW/zDzn+vcptVKuOyBedEmhas+u7odHYmnOZwcvce6vpmgud+y6s+/ZvRhiuAZY93NE2xy7Lc0Hdi4QLbIdq+7wB+DD/iCTxcdm4zHQLD5rB4xtK0am53YYBHaSspINn1rPeUEz6FAhJ0tCrLGmh420j/NYtNxFl/eUgTPGMO7L4vqWSgY0enDJmzDhzruFdt2nFbJxselAKRKX7M9fmM57Yt5mYissJrSZtZwsYst3Flla6uJjDI/u6rMvVTawqLDKzp7WoFvIvhtQ4J3Wr01wQs993klPrjKTxtZODSuCySb9LWOsfOkmy1IxIBY+PioZNW+Ktikzf622zrShWBbsHLh0JjOea6CILGS0z/ubbdW4BsxIBY+PgUgVdEu/d7bEtUFiTOHreKd7lcuV3eytvoRXXDwCd9Zib08T3pRsEtrPc3RP1VlZCsSwuzMjf9wl9UJLRv09UmIh57HB+/q5kFw");
    imageData.append("JpE42uyGL/gsyfe8xMdjCGe+rxhVQDUAKkFG8s4g7Q1DCdEhx+nL3y611DwGcVp8bxGFLHZcGfyDnw9pvNhNFBRNBdhUN5CETz4OU1QUBrvDrZMpA+A00AbvCCuH4ISTXz3F2/jC5n+StmzVaCUj4SkWqOxM2YevisJAF2/DFK6CwMLowGLKQBUR7zxxG+8I24qV4/VVlFl873jElg1eDzwJMlftwxfV6wVe3xTUJq1HI3tVw03VYWVpUxeg0+pLYkt5fRUVH0qPUxW6z+vBFmyq9kE9gl1e5/VNsRvgHl8dNMASa/UTuQQIfqXjsMbrmyLXLUa2IiF4fRXoqD3itZy22O0IzvP6pnAX+nVJEgkbJAklALIVCcHbOGPzPk2rcu+WQZIM900xP5ck7sJgJ2/DFIJV+kRLM+hKzGgGVIJsRULgzEGwcgiu48qQKc30tGhohnzlTDMgSyOiBrmCZHlnEKwkshVnkrqRJLbVaOUgsZm4Yuu2AVGjSPDxpCFjqQseQqmLJ1h9VSe1WgcodVmbBSrwKPR9raN6xzlK7zVqFsoO2Czk0m6Br9AyoSvhnWeU+G4nU3ma2i0NfRmJabuVa8OKIGtoJdGVmJ1JreDMYS5WLltwSsNqN2lYgZxbftoitEw47MhI1NbY1Eqq5Z+jZ1AJ3mEOztyMZlsP1PIDRpemfy42vbjo6C5NlInoSsCTVWeu0qVHVgTPaAZAJdpshaCEwpbLJvcpF7K0S5O8lPHSBJhdO+muUIwrI66OWof7kYH2aUZVaoco5WPVLnzAF3xmvXZmAy7d9MVLtc7WrcGemC4AMxnqnmOkswldSoDXeLuHiur3qx9xWqTj+J2h/PqgKpDt14fo8C9CB7q8vQeKXWL/l/084pHp9xutci0//8iR6Qcm3vHzjxyZfgHT9j7Hz38ooGD0P9FpjJ/3n8TfuKNZYhljISoAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image55f834b57c7655f98f42661658b6a905 = new WeakReference<>(result);
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
BufferedImage image55f834b57c7655f98f42661658b6a905=getImage55f834b57c7655f98f42661658b6a905();
if (image55f834b57c7655f98f42661658b6a905 != null) {
    g.drawImage(image55f834b57c7655f98f42661658b6a905, 0, 0, null);
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
		return 40.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 40.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_settings_40() {
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
       icons8_settings_40 base = new icons8_settings_40();
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
       icons8_settings_40 base = new icons8_settings_40();
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
        return icons8_settings_40::new;
    }
}

