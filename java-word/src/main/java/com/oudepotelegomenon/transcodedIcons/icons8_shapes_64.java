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
public class icons8_shapes_64 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee95d495eed9760c3191b45e4190df11f;
private static BufferedImage getImagee95d495eed9760c3191b45e4190df11f() {
    BufferedImage result = (imagee95d495eed9760c3191b45e4190df11f != null)
        ? imagee95d495eed9760c3191b45e4190df11f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2648);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAHi0lEQVR4Xu1ba2wUVRQW44uoiTG+4vuHf6Tbbelud3f20e2b7QtY+qAtUB5FHrZYSsDyCDSAUiINBW0VKFBsAoVSnlLAUpQIWEhMUAuYgBijJApY1JioQeF4zp2ZTbm3wO52Z3ZBTvJlu7ude77vm3vPnbl39p577sbdCEtYLJbnrVZrrs1mW4Y4iH93I84j/sT3V/D1MuIs/t2Br/X4OtZsNr/At3NbBQp5GoVU4usJfIUgcRqPnydJ0kt8+xEbSPoVRAsS/0cVkpJkhzdKk6F+YSZ0NHnhy535cO5AIVw4UgwXjxbDj4eKoHt3AfuusSYLKl9LYcf0MuIqYjO2aeTzRUw4nc4nkWQD4gqRdjps8ObUVNi7djgT+evxUQGh59go6NzghdllqawtxYhriPWUi88f1sAxni7ZbD8TSYdDgoUz0uHM/pGCqGDxbcdIWFo1BFxOiRmBPaEHc+bxPHQPk8l0v00ubHRmYNLoJDjdHjrhPE61F0DZuCTf0KCCSRx4XrrEoEGDHkAS24gInplrq9/Ogp6uwLt6MGirHwoJLl9v6LTb7Y/y/DQNTDwQE+8jAukpDujakiuQ1BrHt+bBkFSHasJRo9H4MM9Tq7gXk7ZT4hyPE77enS+Q0wsn9xTAsEynOiT26jIcMNFiSkjuazne/QWZ0KsnvMfzDWlg5R2Gia7htHTt8KYRAplwgYaDOlVqNju43e7H0OGLlGTj8hyBRLjRXJvtmyJxKDzB8+93YMN1lGDiqES4fEwkEAkoG5esmrCO59+vwAZfxYavUDfr/qhASBwpoHqgDAW6LonmdfiCpg2lcuqO0uJEgXgosbTKo+Zq4XX7gielN3jSocTZj0eyXoAn+V+Hw/Eir52FSuT09GJdoYcBhKrXU9Vcc3ntLO50Aw7gbbWS6ySvncWdbsAvXaMgOVFeT6DVKF7/HW8AoWKi");
    imageData.append("PCUiSnj9EWUA3dllDnHCwWavIKI/oJUlJd9KXn/EGPDDp0WQliJfx3uzXUGtHN0I+9fJdQBng/28/ogx4K2Z6b7PCGuWZAlCggVdsCkGnOX1R4QBX+3KB7sd39vtEDtvHvs8yW2Hcx2hucP8/mCRmu8Srz8iDFCv203lZRC1cweYS8aw9wsq0gQxwYCGk9ID/ub1h92A9sbhMrlENxhaNjEDDBuawOpwgF2S4FhrniAoUES0Ad5seRUndv58Jl5FXEUF+3xCcf/vONUhgAZc4PWH3QBCfHY2RG3fdp0Bhi2bwZqSwr7f+cEwQVQgUIsg4gyvPyIMMNYtv068ithFi9j3WXht8NNnRYIwf7FvnTLMInEapILHC/dhx3awDJfJv1udIQjzFzSlKgYs5/WHxYD2ibkyISx00VjwBOG9YKyvBxsWQ1r7D3aHifYXFQPG8fp1N+AUYkxaIssZVzldENwXTOPHs/+nW1te3K1AN0Pq5mqf2+x6G7B+9FD5bGCBM7RuEcT2BUPzh2BzuUCSbBDoCjTdVyhnv5vXzkJPA05MK4SMBGXaW7RQEHozxM2cyY4bnecOaNut14LIAl47Cz0NWJIrr9FZvF5W4HiRN0XbVrCky/cLLSv8W4r/rrNQXRKj5xOe47Wz0MuAw1MLwGWXWEEzNtSLAv1ATM0SxtWT5oDzh249LdZUDVHPfhuv2xd6GTAtS67EpgkTBGF+A3tNfH4+a6d2rkcQ3Bvf7JWXxWlBVJIkA6/bF3oYsKt0BEiYw+p0QjQWNEFYADCuXgVW7EVOh3TDfQm6dC4b7+fGiNYGnKwogoKUBJYjbtYsQVAwME2axNqjZ4148QTarlPEX8Sz/xSv+brQ2oD3i5R9OixgUVtbBTHBwLBpI1jdbtYuPTvUWzxtjrpdEntKxa/NUS0N+KK8ENJc8jJXzNIaQUh/EDtnNms3f1gCXPpcnhZpiz7g7XEtDaj2ylU4Pi838GnvVtjWBpbMTNZ+");
    imageData.append("0ztZrB5ke3wPSLS73e77eK19hlYGfDI5H5zqtIeFSxAQAsTULmPc6VKXpkblzB8K6BEZrQyYnKEsc02ZIhAPJczFvvU+wh7EQF7jTaPXwSEHFSoqWDzpUCJ6bSNbTFVyxvH6bhl40GGeeKgweO4cgbAWoMVUyofdv5PXp3sgkUoiY8nIAAMWKp6sFjBsbgFrsm/7y8tz0i0w+eN4FnqIiLG2ViCqJWIXzFcNOIczwEM8N10Cxa8iEubCQoGg5qDls6HyWgNiDs9N84iPj49it51YkKIb14gEdYBx5Qq1Fvxht9uf5TlqGpi4g5LHlZcLxPSEuaRE7QVNPEfNgq65mfOJib7dnXBB3VWyyU+HWXiuIQ+Px/OgVf6ND8RWVwuEwoHBldPVXtCFFAfwnEMaKH4eJbPk5Ai7O+GCAe86LanyWiDyG81zDllg4XsGk/xOiYx1dQKRcCJ28WLVgPM4LT7Ccw9JYIJmSmIeO1YgEHbQ8pnX94TYYp57vwOdNWHDV9nuTtN6kUAEwNjQwO5GketfiJd5Df2JAdjgEXI3bkalkDiSYC4tVYdCKy8i6LDKv/xUu9dtA0mS4nktQQU25rHKP3UVkkQwfsPrlRhey934v8Z/0mAIlyqhv2EAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee95d495eed9760c3191b45e4190df11f = new WeakReference<>(result);
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
BufferedImage imagee95d495eed9760c3191b45e4190df11f=getImagee95d495eed9760c3191b45e4190df11f();
if (imagee95d495eed9760c3191b45e4190df11f != null) {
    g.drawImage(imagee95d495eed9760c3191b45e4190df11f, 0, 0, null);
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
		return 64.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 64.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_shapes_64() {
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
       icons8_shapes_64 base = new icons8_shapes_64();
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
       icons8_shapes_64 base = new icons8_shapes_64();
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
        return icons8_shapes_64::new;
    }
}

