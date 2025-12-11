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
public class outline1 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image2977c4da004ffcd2e1f6eec226a1959d;
private static BufferedImage getImage2977c4da004ffcd2e1f6eec226a1959d() {
    BufferedImage result = (image2977c4da004ffcd2e1f6eec226a1959d != null)
        ? image2977c4da004ffcd2e1f6eec226a1959d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(6280);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAfQAAAH0CAYAAADL1t+KAAASLklEQVR4Xu3dT4zd87/HcWt/409aEhY3saiGRhNL0oTEQtCy4K5EEGJDiIWVWt3EXCIRKzYkTdSqZYEIRpAUqyaVm0HDaKNII0pr5P4k93tzupjM+Z5R9XF+8X2/vo9H8l6o75mJzDvvZ+kxc0YHAJR3Rv8XAIB6BB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgAB");
    imageData.append("BB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoBPjjTfe6O6///7u2muv7S688MLujDPOMGZmJrtx3XXXdQ888EC3uLjYXyMoS9Ap7/jx490tt9wyc7iNOZ254447uhMnTvTXCsoRdEpbWVnprr766pkjbcxfma1bt/ZXC8oRdEq76667Zo6zMS1z77339tcLShF0yvroo49mjvLGjRu71157rTt69Gj/cThpsht79+49uSv9/fn444/7j0MZgk5Z99xzz9Qxvvjii7vvvvuu/xis68iRI92GDRumdmjyRjmoStAp6/LLL586xrt37+4/Aqe0a9euqR3atGlT/xEoQ9Ap66yzzpo6xj/99FP/ETilyX/RWbtD55xzTv8RKEPQKWvtIZ4MtLBHpLC9lOUQMw/2iBS2l7IcYubBHpHC9lKWQ8w82CNS2F7KcoiZB3tECttLWQ4x82CPSGF7KWseh/j333+f+ut/9w952bNnz9Tn2759+8wz85x33nln6vNdf/31M8/Mcz799NOpz3fNNdfMPDPP+fbbb6c+X4v+x4SqbC9l/d1D/Oqrr54M6lq33nrrzMed5wj6fGetgwcPdl988cXUr52OU31MqMT2UtbfOcRvvfXW6uvef//91V//dwdW0Oc3k59rvtaWLVtOfn/2b775ZurX/0z/40JVtpeyWg/x8vJyd955562+bvPmzat/b8eOHTMfd54j6PObq666avXzPPHEE6u/Pvlxun9F/+NCVbaXsloP8Q033DD1ujPPPLM7cOBA/zGK+Pzzz2d24emnn+4/9of6r4WqbC9ltRziyfd7779u8gM6qO3uu++e+ppeeuml/Uf+UH8foCrbS1kth/izzz6bes2NN97Y");
    imageData.append("f4SCTpw40Z1//vlTX9tjx471H1tXyx7BENleymo5xPv27Zt6zcLCQv8RirrpppumvraHDh3qP7Kulj2CIbK9lNVyiD/44IOp17z88sv9Ryjq3nvvnfranu7/wtayRzBEtpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDvLy83O3cuXN19u/f33+EogSdsbO9lOUQs9bS0lK3uLi4OisrK/1H1mWPSGF7KcshZh7sESlsL2U5xMyDPSKF7aWslkPsz9Dpa9kjGCLbS1kth9i73HMtLCx027ZtW53Dhw/3H1lXyx7BENleymo5xIKey7vcGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg7x8vJyt3PnztXZv39//xGKEnTGzvZSlkPMWktLS93i4uLqrKys9B9Zlz0ihe2lLIeYebBHpLC9lOUQMw/2iBS2l7JaDrE/Q6evZY9giGwvZbUcYu9yz7WwsNBt27ZtdQ4fPtx/ZF0tewRDZHspq+UQC3ou73Jn");
    imageData.append("7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcTLy8vdzp07V2f//v39RyhK0Bk720tZDjFrLS0tdYuLi6uzsrLSf2Rd9ogUtpeyHGLmwR6RwvZSlkPMPNgjUtheymo5xP4Mnb6WPYIhsr2U1XKIvcs918LCQrdt27bVOXz4cP+RdbXsEQyR7aWslkMs6Lm8y52xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEAt6LkFn7GwvZbUcYkHPJeiMne2lrJZDLOi5BJ2xs72U1XKIBT2XoDN2tpeyWg6xoOcSdMbO9lJWyyEW9FyCztjZXspqOcSCnkvQGTvbS1kth1jQcwk6Y2d7KavlEC8vL3c7d+5cnf379/cfoShBZ+xsL2U5xKy1tLTULS4urs7Kykr/kXXZI1LYXspyiJkHe0QK20tZDjHzYI9IYXspq+UQ+zN0+lr2CIbI9lJWyyH2LvdcCwsL3bZt21bn8OHD/UfW1bJHMES2l7JaDvGHH3449ZqXXnqp/whF3XPPPVNf");
    imageData.append("2y+//LL/yLpa9giGyPZSVssh/uSTT6Ze88QTT/Qfoajrrrtu6mt76NCh/iPratkjGCLbS1kth3jyvzatfc2VV17Zf4SCvvrqq5l9OH78eP+xdfVfB1XZXspqOcQnTpyYed19993Xf4xCjh071l1zzTVTX9Mrrrii/9gf6u8DVGV7Kav1EN92220zr528ierFF1/s3n333alvTrLeTP4tf60jR47MPDPPOXjw4NTnm7zZq//MPOfrr7+e+nyTv+4/M8/p/6fxyT9v/5n15q233uqeffbZ7rLLLpv5er7wwgtTH/NU+q+FqmwvZbUe4smbpTZs2DDz+tOdybcYXWvyG4H+M/OcRx55ZOrzPfPMMzPPzHP67yt48sknZ56Z5zz99NNTn+/RRx+deeavzOQ3Z39F//VQle2lrL9ziCf/Frhp06aZj3E6I+jznXkG/dZbb+1+/fXXqY/3Z/ofA6qyvZT1dw/xzz//3D300EMzH+fPRtDnO/MI+gUXXNA9//zzUx/ndPU/FlRleylrXod48qaqvXv3dk899dTJeD788MOnnFdeeWXq9fv27Zt5Zp6zZ8+eqc83+fPj/jPznDfeeGPq87355pszz8xz3nvvvanPN/nn7T+z3jz22GPdc889d/KbBf0d89oj+KfZXspyiJkHe0QK20tZDjHzYI9IYXspyyFmHuwRKWwvZTnEzIM9IoXtpSyHmHmwR6SwvZTlEDMP9ogUtpeyzj777KlD/MMPP/QfgVP67rvvpnbo3HPP7T8CZQg6ZW3evHnqGO/evbv/CJzSrl27pnZoy5Yt/UegDEGnrMk3F1l7jC+++OLu+++/7z8G65r8UJ2LLrpoaocef/zx/mNQhqBT1oEDB6aO8WQuueSS7vXXX+9+/PHH/uNw0tGjR09+N7qNGzfO7M/kB/dAVYJOaXfeeefMUTamZR588MH+ekEpgk5px48fP/nnnv3jbMxfma1bt3a//fZbf72gFEGnvF9++aXb");
    imageData.append("vn37zJE25nTm9ttvP/kbQ6hO0Inx9ttvdzfffPPMwTZmvdmxY8fMT3qDygQdAAIIOgAEEHQACCDoABBA0BmE//216/7rtmPGlJr//s9j/VWGf4ygMwgrv/xfd9fGo8aUmvv+42h/leEfI+gMgqCbiiPoDImgMwiCbiqOoDMkgs4gCLqpOILOkAg6gyDopuIIOkMi6AyCoJuKI+gMiaAzCIJuKo6gMySCziAIuqk4gs6QCDqDIOim4gg6QyLoDIKgm4oj6AyJoDMIgm4qjqAzJILOIAi6qTiCzpAIOoMg6KbiCDpDIugMgqCbiiPoDImgMwiCbiqOoDMkgs4gCLqpOILOkAg6gyDopuIIOkMi6AyCoJuKI+gMiaAzCIJuKo6gMySCziAIuqk4gs6QCDqDIOim4gg6QyLoDMb/fPQvY0rN0r5/9dcY/jGCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCA");
    imageData.append("oANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAI8P8q1kuy5+dpkgAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image2977c4da004ffcd2e1f6eec226a1959d = new WeakReference<>(result);
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
BufferedImage image2977c4da004ffcd2e1f6eec226a1959d=getImage2977c4da004ffcd2e1f6eec226a1959d();
if (image2977c4da004ffcd2e1f6eec226a1959d != null) {
    g.drawImage(image2977c4da004ffcd2e1f6eec226a1959d, 0, 0, null);
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
		return 500.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 500.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private outline1() {
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
       outline1 base = new outline1();
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
       outline1 base = new outline1();
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
        return outline1::new;
    }
}

