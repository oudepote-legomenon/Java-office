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
public class icons8_general_91 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image5ff34b729af93e77fd75fdfa7612970e;
private static BufferedImage getImage5ff34b729af93e77fd75fdfa7612970e() {
    BufferedImage result = (image5ff34b729af93e77fd75fdfa7612970e != null)
        ? image5ff34b729af93e77fd75fdfa7612970e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(3708);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAFsAAABbCAYAAAAcNvmZAAAKpklEQVR4Xu2dB6wtRRnH/yr23hJFwacENSoYMVhi4MUGdqNGjUbN89l7rxF5BgVrRBTFeq8+sMVo7IoSNBiMvTcU82xgryBWdH5v77yzZ76Z2Ta7Z29yf8k/4d3z7eye/5mdnflmZpG22GKLzc/lnQ5zupvTQ512ON3T6dZOV1+EbdGXKzo9zulzTv9y+l9CFzv90Gnd6RHaMr8T+zk9zen3ssa2ET/M6U6PVPWDbZHgRk5fkjWwr/7i9Ganm2qLJW7n9AdZw0roAqdDNQKPcvqM026nWwSfzZU7qjIkNKmu3zh9wuk0p3c5fdLpJ5G4lE5SYV6t5RP80+lYp0vXg2YGRl8oaw7i4Xeq0+H7oi08EO/ldIrTebJleL3GH1CCV8mewOtbqrpOcyNn9M+dti9CG7me0zmy5aA/OR20CB1Gzmivfzsd73S5jWNWzZ2UNvo7TtdfhDbSZHTuzugEBoYnyOnH6lZjxuAIp7/JXhv6ptO1FqGNXMfp+7LloD873WYROoxdsifwor0L/+b1H1Vt2BU0Pbka3dXoyWr0/k7/lT0JwsjbOn038lldU9fyXBvd1Wi+/yRGw61kT4I+Xou5rNNL1TzcPdnpyhvHjAXXyyAjPD/qavQ1la5IxY2GSzn9SPZk1JyDa3HAF/2GbGxde5yO2ogvzQ2dzpc9J+pqNN/7DNly0ChGe7gtY23z550uWYsD+trHqOp7h/FelHWCP6AQV1G8UqCuRsOLZMtBQ4zmTnmqqrJvEny2xJtkT4yeVA+qwaiyKf9Ab6EUa7LlI3oQXY3mDrlItixGnzyj+nCg07laLuvmSxE1aGt/JnsBdK22LcKW4FZM1RD02EXoIO4nWzb6paov2ZU3ypZFJ+Hu9aAOcA0/lS2TUWuSo2UPQORILlGL8/Dg/JhsPPqH040Xob2h+fitbPl/dTqkFtcWrpl+c1he");
    imageData.append("32F4ymj0dzXkxd8hexB6dD1I1UV/dOOzUNQS8sAl4PkQlo9IlPXh9rJl8cNdrR7UkrDpiOnJ+6Ij8Ev8SvYgaoMf+jYZvXMjbigYwAMrPMdH6kEdeYBsedydXWljNDrbH5DiPrIH+Yuaymh4juw56AUdUA/qyINky/zAUkQzbY1GeMLAKcu7ZQ9E34v8rV5w2NwM4cuy52DGZAj0kMIyyXFTidqQM5opOLKM4d+fsPfIDHSnuIjwwCaVMnybbN+ffzPlNQRm2Hl4h9f9snpQghsobzSDvldGPmt158RuuTYqYTgz4mG5X1+K6A8zNGHZ/JC5a76l4s8yxDQcRsP2yOcc14oPyh7shakYEP7df5a7+CZeJ1sm+ZkS3EzxPA+Gc47LLEL3/vfTVXXjwnhUNxrI88fKbjUeIM8bm0DFTLpfXAy9g/BzH9PXcJYRhOXddyliGLnB2C9UPRvWla7NCF9iM1dfk40lJdyKh2n5QG+0ZwzDfyBbVt+cRQxyPrSl4Tnaih+BpiXGe2XjWYHVmseoykN8RVXXMKS04TGzt9UDCkAP5P2y52kS02257icz8OExz1iKKEBJw2NTVKmaNATSEMepmlsNzxeK7/B6NefsY8+bpyxFFKKU4bGM4lh5ciDPwmAtZjoDKZqcthnBd8qW0akZ6UIJw9dkjy1+K0ZgfEGWkXWCpJdZ5Uqeugs0M+G1j1lRBhv+bNnjWMk0d+ji8f3Ca79uPWgMhhi+XfYYpurmvqL0FbLXzfNnEvoazsTEr2WPyaYsVwyrXGMzQC+pB41Nk+Gp3PQbZOPPVfVDzA16KLHRNHmY0ZuQkD6GM3QOY9E96kEzgP76p2SvE7FIdSV0MfyFkRgv8txzITc1yHQZ03oro43hOaOJKTlsH0LOaJqPYusDh5AzPMxh10V+fbTBQUdyRlMhHrgIXT05w2Nip8AqFnDGaDK65NRgMdoazox/uDKrDqM+htv7hR+MwJRzsMXB8FjSyess");
    imageData.append("5Y0mweOT9XtULQzKxQ+Ba920RsMLZC88/BKpgU9sSI8Y1vdZB5KDXsVnZc/lrzHWdZ0VTUbXv0xoeMpoLwYY19gXPQyWIrB4MzyHv7bZG91kVih6KU/ce6T0zMjnMbG8eajhDKDOky3bX1PjMoVVk6vRa0o/NKlFXaeyWOfyEHV/eB6k9NoZxBaX2dfonNG+19G2l1LXp5WeAUes0N2laqCReoCSUWQl6/tUmRmW4cWAhWVss6aN0Z4uhu9WlZy6q/KGezErfraqu2TN6cMb/44t3gl1vtORmjldjPa0Mdwb7Tla8TRnCZ2pFuv2Vk0foz3Pkz3GKzTaw0OtTS1tqz+qWl0QW6M+K4YY/SzZY7xSRnvurfy+nzZiuTKJ/9J99lFYldEeVlDFloLl9DtVbfmDNZ8t440MMTrXB29rtOf+ShvOAn92d9GFo61nK+Lsm4qQIUY/XPYYr65Ge0h3xtaDIIb2bddmz45c4r/JaIjN4w0x2kOzkOo7ky6l57OpGGo0sJYwPJbt06RRh8LEQ8pw+tqbxvDY/peuRsPjZY9HJfIckKvhrEWf89uC9lKiRntoP8+RLQex/u+qi9De7FCVZwnLR/REuuZRJqOk0R62arOzOCwPfVFlZqzpgaQMJzcyO8NLNR0x7qJ0noM8RtOy3TYws5IynHXbszF8jBodQjlh2V5nOV1pEdob8tEXy5aPhvaAijBmjfbkBjZeX1AZw8l7pAxfV5nv04u5GO1VqoazHjss22tNZb5XJ6ZoOp4vW3aTmIhlM+lQcvmYt2jCofyqa/R7VA27U3mO01XG8Nz85ts0geFzMNo/qHKJJabGSmTqctcyag3PnfjtKmN0rulYlz1HbhRInqNEYukY2bK92A1W3HDSjqkvNXWNDpkik7dLtmyv1y7ChkP7F9tmgVZVo0NIx6Yqw4dUJs9xnGzZXryBoQhsSwsLR3Mx2rND6VEgeY4Shp8gW7YXd+ZgzpAtmBd7tzUhRymj");
    imageData.append("PTuVNrzUsDv2HhHEnXWHWlxnaCcvkC34sHpQT0ob7cmNAnNtfxd4Q1pYNmJg1RuyamGBmD/0CTyW0Z5cnuNUlTH8ZNmyEevDe8Eb0MLCSHkOYWyjPeyTTBnOnvKh56FJ+rZs2c+tB3WBGhBLbx5YD+rAVEZ7cnmOEl3WWNqCjkNvYnOBfbbETW20JzfsfquGNYkMqsIymcPsTWzDJ6/p7DIPuCqjPbk0wynqb3hsnnRtKaIjByve9pHwadN3XbXRntwaFh52fQyPvZaIwc8gTpMtFDEczk28zsVoT+7lWyepm+E8t2LPs6PqQX3gf7zAmo2wYMTWB7Zd0HPx7K+qPQxjvdY1vdGeY2Wvx6ttnoNrj+0WY5Vrm7u9EZbfpvIPiJHbHlWvxYw1O17rWp3Rnlyeo2lDP7WfHyU8DjGcLwajs5zhTVrX6o32HC97fV6MEGMDH+5YElthPKLTkGtSe0G6lfXK4cmaRLJ9LkZ7UnkORJeXbiPvidqp6lWisdQF4k5mMmMUtql6aKaSPnUx4kz9/xLmQCrP0UVMMIzOoU4vV7XtLWyn2ZxJ23jtfdHz5URZA9uI7/xidevFFIGn8AGqan2JCdcpwSy6hW3uVC92Jsx+W96cubPTV2WNrYtdCrzZbFPsr5k71PLDVfXHd6uaqScti8F0f0vMaW4xFf8HQvXK9COF47UAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image5ff34b729af93e77fd75fdfa7612970e = new WeakReference<>(result);
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
BufferedImage image5ff34b729af93e77fd75fdfa7612970e=getImage5ff34b729af93e77fd75fdfa7612970e();
if (image5ff34b729af93e77fd75fdfa7612970e != null) {
    g.drawImage(image5ff34b729af93e77fd75fdfa7612970e, 0, 0, null);
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
		return 91.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 91.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_general_91() {
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
       icons8_general_91 base = new icons8_general_91();
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
       icons8_general_91 base = new icons8_general_91();
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
        return icons8_general_91::new;
    }
}

