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
public class icons8_spellcheck_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image60aa65d245eeac288119673e1280ed93;
private static BufferedImage getImage60aa65d245eeac288119673e1280ed93() {
    BufferedImage result = (image60aa65d245eeac288119673e1280ed93 != null)
        ? image60aa65d245eeac288119673e1280ed93.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2136);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAGCklEQVR4Xu2Ya0xTZxjHOzc1ikznZSoXNREvINDLaZMlW+K8AqIynAi6KXMzS7YPmw7dknkheJkIAgKitFzaQlHo4haX+WFOrchggkJPWxzetmWZccmyfdg6cVP02XsOnMPpc05v0pYv/pNfSOl5nvf3vuf2gkz2NE/zNAGJUeNIqtN03yOAZxyPyM8SXD/sMWq6z4plpTFq7P9VvdQ9EfcYtpxQ9kQY1d19WHRgxSWp1zi24D7Dljq1YzsWlMKoFmK34D7DFjIBm3tRd9gf1aod0bhXyGPQXFsglvOZHbhfyGOk7IUSYj5hoOw07hfS5MpghJFy3MFi/lCnpuNx35DFQDmWYyEhZIWvkWN6+z/bJTGobQdx35CFrH49lnaRpey7ySS+wtJoAr+ADJ7BvYOeukQ6jAzuxEJCailbgkFt34x/L4KiX8H9gx6y0htFIi5S9p/Z4zQ/TCJn4aHoewFkIY7j/kEPGfQsFkEU88dStosS3zP3SD8q25+lMTdHC/sHNdXKzggycB8WQizkjieT/ZCXdYfatlo4RlBjVNt2SAjzq6pX2f6wLLQ8xx1frbw2U0/ZHg8K20SQ75uEYwQ1ZAI20QoK0FN2A64hk+rC0i6o6Pta6up4XBfw1CgcciwsWlWVNR3X6VX0HpE0wkjZsnFdwEMGOowHFkJWupd5xOI69pEqcbxLrZI+i+sCGmbrQK7VO3hg1wnQp3EdFzK5GwPHuMH6yCC3RuK6gMWoopOwMKZWTb+N67joldZCoXCtytqPcpAalXUrrgtYDBRtwsKClWdXUK/pnobruOjl1peFsi7iyq5+FF1XcF1AwlzXeop2ik+7AKW1BdcJw1yCRPCuQFZEtaITqhM65uHaIcegoDd5O/21iq7tuA6nWtGldZEVIufJw3VDDhH8Fp92fPp1ifRcXIdDxFMEoixV8quY2wHdoTJb");
    imageData.append("hxqFtY8/9Z5Ov/SKepKFSmU7bMtqhBW5n4GyYivMrtsC0fXZvVGmjdcjjRtORBiy1sWZM0ZhL59TI+/82F9ZLMmSOIgu8QpLTqYZlLptMNO8GWY0vgXRJ7MhqmETEHmIrHsDIowbYLp+PUyrybo9pSpzDXbzKVWKTvtQRTGV8g7IzCmHWZ+/412+NgumVmfCi1UZMLlybaEsN3cEdnQbndyqGKqsLqEfbUIHT2ZOmd/yU7RrYUrl6zD5WPoh7Ok2RLJoKKJSfLSuaQjya2DS0XSYVJb2GnYVxZxhflaX0HFXJDogi8VExHdAZXy7CxXyNt+ueQ/yE8vT4IUjq3+S5Xq5sSsT25N9WlUJUY7jCy678MG6Br/lpxIOXzVD6hc7++VLV8OEI6tgfFFqBnZ2CRFrwLIiwfjLjbjOU2Y0bT7pr3xDz3lg8uvfvw/KF6+E8KIVJtyfD7N1IIJOLCxa1bjW9bjWU2Y0Zt/E8vKm9yBCv8Gj/L0H92HVqU95+eeLUmFcYcp13J+PNq49G5/+Ywu+h2NxgxyNbX1QIrdMwLWeEn0i2ymUTz2zB+49/BcablyA6TVZPsuHF6bAuIJkJ+7Ph8ieG5RtgwqGWI5WRh7KY1u/wXXeEmXa5BReNqlf74ZeMgEmDdfPw1Rdhk/y4QXJEJa//C/cn83xOW2RR2Pb+jhRnvnfQbmAsvmX3se13hJlevMGvubTz+TxkzD1nPNJflx+Eow9uKwH92dTPr/lE6Eo+Qzl81qgjOcSlM5rfnx4drPf/99n9zYSN+zK07vgHyLMhZlQ2qldbuXDDi6HMfuX1uP+bErnttg5UVZ2LkczyxGGmOYn+sOD2Zhhee45n/rlTnYSvsiPPbAMxuxdvBb3l5XGXFS6iM5huMhTwhBjIT8tu3CtT9G+O5LI38Ly3EtqmXkHLGnM8S6/b/GPki8yIrmCSPbxogMUs1yA4tkM538rmWmZhWt9DbOrlJJ3eUl5kt+/BEblvZqG");
    imageData.append("+4Y0zK7ySeVH5y3Kx/1CH7IlnlyRXuC3/N5Fh/zaTgc7zK6SyN/yKr9vya1hv2zchtzYzMaM2duEF6T0MG/YsPwkJ/OcH3NgqYl92mipkbiMyf+ajoZLoaGb7AAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image60aa65d245eeac288119673e1280ed93 = new WeakReference<>(result);
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
BufferedImage image60aa65d245eeac288119673e1280ed93=getImage60aa65d245eeac288119673e1280ed93();
if (image60aa65d245eeac288119673e1280ed93 != null) {
    g.drawImage(image60aa65d245eeac288119673e1280ed93, 0, 0, null);
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
	private icons8_spellcheck_48() {
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
       icons8_spellcheck_48 base = new icons8_spellcheck_48();
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
       icons8_spellcheck_48 base = new icons8_spellcheck_48();
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
        return icons8_spellcheck_48::new;
    }
}

