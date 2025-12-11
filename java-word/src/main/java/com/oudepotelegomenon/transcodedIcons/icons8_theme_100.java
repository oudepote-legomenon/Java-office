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
public class icons8_theme_100 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageb9b12f4ac3bcb1e3f83b665108e09e2c;
private static BufferedImage getImageb9b12f4ac3bcb1e3f83b665108e09e2c() {
    BufferedImage result = (imageb9b12f4ac3bcb1e3f83b665108e09e2c != null)
        ? imageb9b12f4ac3bcb1e3f83b665108e09e2c.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2928);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAAIW0lEQVR4Xu3ZPY9cZwHF8Y2dCCyk8LK7dgqkCGgpEBIdEtRIFEBDREoqxAegSIWEeGnhI/CSQIAGCaeABiGgQE7i7DoUgEiNKADFnlnvDvus/Syzv7lzz8zcvXNn5TnSv/Gec1/O8XjnXu/sbLXVVltttdVWW221Rk2++pvJOvH8WyEL6xvPvynaOxx/5vm/T97rn69dFtY3nn8TtH/44Is3D0fjmwej1z78zuSGP1+rLKxvPP/QOh/jcDw5Y+hRLKxvPP+QmhljE0axsL7x/ENp7hhDj2JhfeP5h1AcY8hRLKxvPP+6tfAYQ41iYaI/ybzoX6eWHmOIUSxM9CeZF/3r0spjrHsUCxP9SeZF/zrUeYx1jmJhoj/JvOjvW5c2RqXvUSxM9CeZF/19arkxRv+Z/bM5HIxu9/aaxcJEf5J50d+Xlhlj/3D8zv7d+x87Lfrb/mwufX1SLEz0J5kX/X1olTFqdvBRLEz0J5kX/ZetZ383/vqqY1QNOoqFif4k86L/MnXj9tH3dn40mbzvtw9ni4N5Y1QNNoqFif4k86L/slTH2PnhI9pGSWNUDTKKhYn+JPOi/zLkGG2jLDpG1dpHsTDRn2Re9HfVvDGaRll2jKq1jvL2zkuTNiw0YV48fxfdeO3oW0+1jDE9yqpjVK1tFAsTC0+YF8+/qvbvPfjSM784PrH8Jq7/9GSy9+boBx5jGd38y/2PLv7wOBqX/6P3GAvJwsTCE+bF86+i+pyxf3c8eeaXJzMDTHPtlZPJ7utHj//mjl/yWIvouYN3n98/GP9ttvgmylfuB1/wGAvLwsTCE+bF8y8rH/raRrkwRmXJUdY6RpGFiYUnzIvnX0aO0TZK4xjVfzj+hsdu0trHKLIwsfCEefH8i2reGOclT43SNsY54ZMyyBhFFiYWnjAvnn8RpTEqZZT3/Orh8e6dMEZlziiDjVFk");
    imageData.append("YWLhCfPi+ZMWHaNw9tX2rdEn9g9Gf/Bnc2GUQccoslDRn2Re9Ldp6TEeP2d88K+T968yyuBjFFmY6E8yL/rnaffO6MVVxqhadpS910ffH3yMIgsT/UnmRX+Tzp7Af3Iy+cCf8u+CpjGqFh2lfAG4/rOTxndfs/Q4RpGFif4k86JfTb8OeerHk9ZR2saoSqPUMerX5fZReh6jyMJEf5J50T+tpndT80ZZZIyqs1EOR3/0GI7RPsoaxiiyMNGfZF70VzWNMW+UZcao8pMyb4zmUdY0RpGFif4k86K/qG0MR1lljKo6Shrj4ihrHKPIwkR/knnRv/fGwxeuvZzLKVx/9aS82n7RYyyjW4ejj5eHR4/dyOlfkmd///BrHqNXWZjoTzIv0976nPGhPx9Nrr3cUMgU9XXI6e+C/966d/TZ6eMsqvqc0fTua4bTMW78+vg7HqN3WZjoTzIv1edDX9sovptaZRQf+lpHGWqMIgsT/UnmpXgco20UxzjnYPTv/bfGn/b8TXKM1lGGHKPIwkR/knmZN0bTKHPHqIUu8EmZN8b5MaZHGXqMIl/+iYUmzEvbGJUyytM/bx/jvNCWUdIY58c4G+X4ZPAxiixMLDxhXiyjifLVdvfe0edPv6L+05810TTKomM8YjQun9zp/GCyMLHwhHmZLcNy//+c8fhV+tKjLDvGWp8zkixMLDxhXmYLmS519qFv6VHujr58ZccosjCx8IR5mS2lljk7RtWio5TfOU+/uthb4o0co8jCxMIT5mW2mPYxqtIo069DfPc1y4aOUWRhYuEJ82I5p2P849bb9z/idTVp73D0ydMy/+Uxmt5NzR9lg36BN8nCxMIT5oUx4idD+UlpGmP+KBv8yaiyUNGfZF66jFFVR2kbY3aUKzBGkYWJ/iTz0nWMqucOHnyuPDw6QBPlv4N374y+4jE2UhYm+pPMy+WM8eg5o+nd1wyb8DpkGVmY6E8yL5c1Rv2nr3WUqzZGkYWJ/iTz");
    imageData.append("on8ZlW9j5VuZ35waRylj3D7+rsfYeFmY6E8yL/oXlZ8MuTDKVfxkVFmY6E8yL/oXURrjwiivnFzdMYosTPQnmRf9SYuO8YjReO+N0Qse40rJwkR/knnR36Zlx7gSzxlJFib6k8yL/nl6IscosjDRn2Re9DfpiR2jyMJEf5J50a+e6DGKfPknFpowL5M3by3Fu9/8VCv6E+ZFf1fsO8rCxMIT5sULTliY6E+YF/1dse8oCxMLT5gXLzhhYaI/YV70d8W+oyxMLDxhXrzghIWJ/oR50d8V+46yMLHwhHnxghMWJvoT5kV/V+w7ysLEwhPmxQtOWJjoT5gX/V2x7ygLEwtPmBcvOGFhoj9hXvR3xb6jLEwsPGFevOCEhYn+hHnR3xX7jpp92LqI/iTzoj/JGxT9SeZFf5J50R9lYaI/ybzoT/IGRX+SedGfZF70R1mY6E8yL/qTvEHRn2Re9CeZF/1RFib6k8yL/iRvUPQnmRf9SeZFf5SFif4k86I/yRsU/UnmRX+SedEfZWGiP8m86E/yBkV/knnRn2Re9EdZmOhPMi/6k7xB0Z9kXvQnmRf9URYm+pPMi/4kb1D0J5kX/UnmRX+UhYn+JPOiP8kbFP1J5kV/knnRH2Vhoj/JvOhP8gZFf5J50Z9kXvRHWZjoTzIv+pO8QdGfZF70J5kX/VEWJvqTzIv+JG9Q9CeZF/1J5kV/lIX1jRec8OWf6E+YF/1dse8oC+sbLzhhYaI/YV70d8W+oyysb7zghIWJ/oR50d8V+46ysL7xghMWJvoT5kV/V+w7ysL6xgtOWJjoT5gX/V2x7ygL6xsvOGFhoj9hXvR3xb6jLKxvvOCEhYn+hHnR3xX7jrKwvvGCExYm+hPmRX9X7Hurrbbaaqutttpqqz71PxnqOCVhBxHEAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageb9b12f4ac3bcb1e3f83b665108e09e2c = new WeakReference<>(result);
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
BufferedImage imageb9b12f4ac3bcb1e3f83b665108e09e2c=getImageb9b12f4ac3bcb1e3f83b665108e09e2c();
if (imageb9b12f4ac3bcb1e3f83b665108e09e2c != null) {
    g.drawImage(imageb9b12f4ac3bcb1e3f83b665108e09e2c, 0, 0, null);
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
		return 100.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 100.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_theme_100() {
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
       icons8_theme_100 base = new icons8_theme_100();
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
       icons8_theme_100 base = new icons8_theme_100();
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
        return icons8_theme_100::new;
    }
}

