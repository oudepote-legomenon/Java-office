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
public class icons8_united_arab_emirates_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image8b89c9c4cda6546f51f3cf37f1f66544;
private static BufferedImage getImage8b89c9c4cda6546f51f3cf37f1f66544() {
    BufferedImage result = (image8b89c9c4cda6546f51f3cf37f1f66544 != null)
        ? image8b89c9c4cda6546f51f3cf37f1f66544.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1680);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAEtElEQVR4Xu2Ve0xbZRiHSwu0jEtGRykobYVKR1voOkvLZRvXyqVSFrINixCDzRRcgoDIzUxZUhBhg2nidYoSiGICmTKWiGLmEhKyopQCWSjMC7AS2hUYFgjtenn9iol/nJi4IDAw50netPn69ff+nuQkh0DAwcHBwcF5SIBA8Mae7UlMBw6IVmi0WiuLdc3G4Uw7RCKTIz7e5khNBYdUajujynXkVWfdj2461X24/plG1gVpXlidlInN2VU0BAJNQyK9PU4mz834+sIyjQYWFgscfD44JRJwJiSAMz0dHDIZyN5VQmJLPoibcyGy8SSwVTIIqZMC7XzCXb+quB5KyVOveZQIjqJYN+yeHeM6kWgdJJFAS6HA1gWSwK8yDrxKReBeHAVEJXeZWMj9llIYdd7rRaGYsA1Cns/yuSR5aBf2nNBHJML2C/CA+HwEkPN54FMoAP8i8Qq9LP77kKqkutC6zKwn6zJCsD3+CYYqg02tjCv1Pisc9Mzl2ImZLMDe2R2BYgnQS48BozoF2G9mAK8hG4SXcldELXma6Ja870Qtiq+OXDz9Jb8p54uIxpO97IasW0xV+lLwhVSgVsQDEgAkAHtM4AxEt+ZB7DsFEHM5H0StChBcPA28phwIb5QDqz4DcIH/nUBfRys0f/y6NfvDc8v7UsC+ugr29XWwb1jAZrFYzGurv6p/GVPX918ZljQr5vaVgN1qBfsD219js8Pa6hoYjIbFAfXNkVc/VQ1HvPK0nlLAc26ngF/24TVs/20VMJlMMDs7CzqdDkZGRuDGjzdWOq523a668tZYguo5PbM6xbkVgZjaUzP17zdPtLW1WbH9d1RgcHAQhoaGQKsdA93UFPw+M2PW/XZnekin0XSq+zQ11y5PK7vq9PJPSu6nfvCSOfG9F8w5n5XPv9xdr/toqHt4VK+7dVevX9BqtdDf3w/t7e07");
    imageData.append("+wj9m8Ds3NzmnVWUY7PZNsdut//96RqHwwFOp3NzXN8NBgPgArjAXhEoSkuDCpnMUlJUPNqoUv38zdWvJ0zGe3/sGwFZcjIkxsaCWHgUIrlcYIeGQchjjzuZDObM8WPH1ZWVleqBgQH9fhMAWgAN/Pz8wMvLC9zd3V1jCgsL0xYUFIx3dnYubIdAR0fHikAgmMT23xEBIsp0DZlMBh8fH6DRApfi4uPHq2tqRvv6+u7Mz8+bH0bAaDQuNTQ0aDgczoSnp+cDVya2/64I+PtTgR4UBAwmE9hsNvB4PJBIJItyuVynVCrHysrKNFVVVSPl5eU/KRSKkeTk5Inw8PCF4OBgoFKp4O3tDUhgMxPb/5EJCIVCiI6OhliUFxMTAyKRCNAjsvkbKg8s1AEX2LcCG0zmuj0iQuMQCn9AD2sPSKWfQ1JK71nBkcXMyCizKCpqfc8JTFIokwZf30bzwYMn0C0S9h4WHosV9ASDkRYYGPjGIeqh60jA+EgEbhKJ/VPu7iew51sBLeEggXNubm7daNnCDghsYHfuKB4eHpFoeYW/v38vjU43/AeBOZTVjCIDsTt2lYCAgHBUTIFeTA2oaA+SmBCLxUY0FpcAn893cLnce+gtfpvBYPTQ6fRa9B8RNgcHBwcHB2ff8yc44hECBSw4UgAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image8b89c9c4cda6546f51f3cf37f1f66544 = new WeakReference<>(result);
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
BufferedImage image8b89c9c4cda6546f51f3cf37f1f66544=getImage8b89c9c4cda6546f51f3cf37f1f66544();
if (image8b89c9c4cda6546f51f3cf37f1f66544 != null) {
    g.drawImage(image8b89c9c4cda6546f51f3cf37f1f66544, 0, 0, null);
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
	private icons8_united_arab_emirates_48() {
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
       icons8_united_arab_emirates_48 base = new icons8_united_arab_emirates_48();
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
       icons8_united_arab_emirates_48 base = new icons8_united_arab_emirates_48();
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
        return icons8_united_arab_emirates_48::new;
    }
}

