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
public class icons8_height_100_ implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imaged10857fba26007b99e13623fe9759b29;
private static BufferedImage getImaged10857fba26007b99e13623fe9759b29() {
    BufferedImage result = (imaged10857fba26007b99e13623fe9759b29 != null)
        ? imaged10857fba26007b99e13623fe9759b29.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(3028);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAAIqElEQVR4Xu2de2xcxRnFhyjmnxREEZFQhESBNgH+QRW0KkkKdiC283AweT+MFZO0oKp+JDh2E6AGVBciQDJObBTAakuAkDS2LOGSBJIQ6EOK6zrhYUyMn3jN2vixG8cF8Uin3+fN7l2f2XUc8N5ZduZIR4rj3Xu/+Z2dnZm93rlCWFlZWZmn/v7+S4aHh7eS/00eIcsEN7eR27q1r6/vB8hDq/x+/89Onz7tiVC0Eaa2dxODW5CLFlExM6koHxZpmn0+3+mOjo7rkY/rokDexOJMdUtLy3uE5HJk5JqoiBuwKNO9cuXKXEJzCbJyRVTAr7GgUx91ytVLH5HJt+YltLmN3FZsf1VV1XOEZh6yckXDgVnVmIJe/NMBpfhE9W5qK7a/pqbmVUKzhnwp8oq5qIBfYUH8qlmzLPF7yNrlj8qWU1F7CAdyHfKKuWhA/wkW5KY/bumSS9J/F4K0OLVYfvRhu/I4N52ZmblZBAK5EXm5IiriDSzKDX/a0yfXrnhMeeWuurtEerp7lce74aamppMiEIaeHsLiXkJ2dR0yNOSTefeXhUJIua1w1MGf+Xf8GHxeLD0wMHAmIyOjQDiB6JlpsXiV+hkJi4yVt5e+5PSK2fly/TONMmfnydF/B///DyV/Vp4XK3u93oGNGzduE04YyWMJaVBhYeGVtbW1u9vb21uHhoa+wKInyziLW1Pyhix4S46a/x3+u0izoMkyt7Gtra11//79r8yYMWO9cMJYJnT2DhCvUu8STnEX7OnTp2e3trZ+jADYbx1pkPPmFISA3/2b3aEwgl6Wt8d5K5uTL988dFw5Drujo6MdQE6Gue36VupRNFUEZhhp5BVCLTqqp0yZsrahoeEfCI/d9H6rXHhnUQj2otVlMv/w10og+Ye/kYvXlYcel55SKN89eUo5HruxsfF4UlLSWqzjAs1tTCXfIAJtTxzR");
    imageData.append("5OBRhMbu6uyRy5c8HIKcuvAR+du6YSWMoHP/NiLTFjszsGUZD8mOdo9yXPbRo0dfFokGcjJ05syZFRTI/xDYwMCgvC/nyRDcO5K3yPv29CghoO/f2yvvSCkOPW9D9hNyoH9QCYTPuW/fvseohIuwJmPFszSC898IsGTJg1UhqMmzC+S9z36gwI/mDc830zjijDkPFT83ekw8j8/n+5pW2DlYl5Gi2crVBKkXIbF3VdY6YZCz/viOAv18Xlf69phj7KqoVc7D5ll7aWnp7VifUZJSJlEYJxAO+/W6f8mUsHUFz54Q9kS9fNNfQ8fhY75W+3flfGyasnfMmjVrBtZpjCiMLQiF3fifZpma/EAIYsY9lTL/yFkF9IR99Kxcsn5X6Hiptz8g6483Kedl19TU/IVKi69r5G6JALQhEJ4N8awoCC99SanMPfC5CvkCnXfwC5me+XjouJkLt8n2tm4lkJ6ens+otHRh2iBPA+k1CIMGd5mzzoEWySlzN8lVW19TgKP5MfxYfH64+Vx8TqwjLS0tj0rUf33cTY2MjNyEIHgBh9AiOWXuZiUA9PnCCPq9d1uUQLKzs4upxAysOaFFr8xrEcTQoE8Wbaoc/cgDwaExADQ+Hs3nKNpcOXpOrGPBggX5IrAKN2ssoca3IIzx/G0DweOMZxpD+oTzschlUHJiK9osK5rdCKS6uvoV4QRiVg+RUk4lCPUIJZpjHQhfOpg2bVqWCIRh1hgS1Lm/CX4d4URyLANpbm5+f+bMmRuE0zv0XBOPB0kppxCUTPIBehv7BGEFPdmB8JW+pqamE9u3b38aPobnSwdmrUPOJ4Q32YEI9bpG0PxHbhc7lViNCgHGOBC+0pdMvkrYnhFZCDCGgVhNRAjQBqJZCNAGolkI0AaiWQjQBqJZCNAGolkI0AaiWQjQBqJZCNAGolkI0AaiWQjQBqJZCNAGolkI0AaiWQjQBqJZCNAGolkI0AaiWQjQBqJZCNAGolkI0Aai");
    imageData.append("WQjQBqJZCNAGolkI0AaiWQjQBqJZCNAGolkI0AaiWQjQBqJZCNAGolkI0AaiWQjQBqJZCNAGolkI0AbiomTgG1RLyQf5TgMILxaBsL1e7yCfk5zJNWBdRsrv9/+QQjiCsCJ5sgMJN9Vw2OfzmfU1aJQMfAuXb4qiAIrkWAbC7u/vP9HQ0JCEdRojglCMUMZzrANhHzp0aJcw9TuGBKAdgYxnNwI5t5MDb2pp1ncNaez4McLgfUe2FFS4t9fJpsh7ncyfP593A+JdRs0RDaA/RRDxshtQVlZWkTBtJwfqIdchiAnvl7WtTgkAPZH9su7Nirxf1rkewmuUaVh3Qms4whgSJzvKBReNZk2DCUARAmHr3HNx7969LwknELN6iIzDXUmN3w2I9+0dHBwcQDhst/ftXbRoUfj9P8zaczFcXq/35xTMlwjJrZ2t6dxf5ebm/l44YZi3Kymqs7PzHl17v+/cubNCOGEsFabtJBdNXV1dTyEwdizvjlBXV1cjnDBWkq8YW5XBklJe5PF4ahEa26X7h/xobEXfc1Ej59JbwKvkHvI3COC7ejLvsPNdze0je8h76Oc5yEKr6JU9lQqrwKJj4Xi5B1UE72AOyEaL3Aoj6Hi7S1vQ3d3dVcjGdVEhv8TCYu14vI9h0OXl5byzqb4pM48ZWJQbjsc7fbL5pmaE5Rbk5Jp4AMeiKp6plnfeNv4nrd93c/sqyquVQHp7ewdFYMY2HVm5IgpEWWHzVBMbkIheMK9QCcTn830lAoHMRlauKGIPKTejh1TuqFEC4T8tEoFAMpGVKzo3D1cKM9X19fU8hnAgq5CVK6JAfhHpMyhTXVBQUCICgfDmzHpEhezAwkz0sWPHDgrnY5hbAZN74hWqx+N5AQs0xfwOwWGEXdzSN8sKV1lZWQ7Nw//JA5vf7z+LhSeSuX3cTl53wLUU9s1jyegTr1B5URRenGnmMPSt1KOIrynwPJwHttVCLTqRzO3jdnJ77bUUKysr");
    imageData.append("k/R/qv01AOuMKRsAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imaged10857fba26007b99e13623fe9759b29 = new WeakReference<>(result);
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
BufferedImage imaged10857fba26007b99e13623fe9759b29=getImaged10857fba26007b99e13623fe9759b29();
if (imaged10857fba26007b99e13623fe9759b29 != null) {
    g.drawImage(imaged10857fba26007b99e13623fe9759b29, 0, 0, null);
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
	private icons8_height_100_() {
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
       icons8_height_100_ base = new icons8_height_100_();
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
       icons8_height_100_ base = new icons8_height_100_();
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
        return icons8_height_100_::new;
    }
}

