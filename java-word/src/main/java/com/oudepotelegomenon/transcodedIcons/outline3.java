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
public class outline3 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagefd99a07fbea24c9cc67b1eb27a3df848;
private static BufferedImage getImagefd99a07fbea24c9cc67b1eb27a3df848() {
    BufferedImage result = (imagefd99a07fbea24c9cc67b1eb27a3df848 != null)
        ? imagefd99a07fbea24c9cc67b1eb27a3df848.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(6180);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAfQAAAH0CAYAAADL1t+KAAAR4klEQVR4Xu3dMYic9brHcYWAsUqhmIhgYSFBK0lxOzekEUQTSGFU5IiN2tlcELHYKmhvqUaEECIKgmF3JSEsVtpZaKEGFJvdiORqLkYbydw7C2edeUfj+Pf18D6/9/OBh8NmZneEeXy+JLvm3DQBAMq7qfsLAEA9gg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AA");
    imageData.append("gg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0AEggKADQABBB4AAgg4AAQQdAAIIOgAEEHQACCDoABBA0Ilx4cKFybPPPjvZ3t7e+fimm276R6er+3jf09V9vO/p6j7e93R1H+9rbrvttsnDDz/cfTkob/HfIijm6tWrk+PHj+8e7FOnTu38eveQ9z1d3cf7nq7u431PV/fxvqer+3ifM92XWdevX5/7GCpa/LcICvnmm28mBw8enDvWTz311M5j3SPe93R1H+97urqP9z1d3cf7nq7u433Oa6+9tvs6P/744+Sxxx7b2SWobPHfIijkxIkTC8d6//79O491f73v6eo+3vd0dR/ve7q6j/c9Xd3H+5zPP/985zWuXbs2OXTo0M6vPfnkk51/Aqhl8d8iKOKTTz5ZONR33333zvfS4Y98/fXXO//7yy+/TB588MG5/fn44487z4Y6BJ2ynnvuubljfODAgcnly5e7T4PfdeXKlckdd9wxt0PTnYKqBJ2ypr8bnz3GZ8+e7T4Fbuj06dNzO3Tvvfd2nwJlCDpl3XLLLXPH+Icffug+BW5o+p84zu7Qvn37uk+BMgSdsmYP8XSghT0ihe2lLIeYPtgjUtheynKI6YM9IoXtpSyHmD7YI1LYXspyiOmDPSKF7aUsh5g+2CNS2F7K6uMQ//rrr3MfP/LIIwtft89566235l7vmWeeWXhOn5P+eufOnZt7vRbdrwlV2V7K+ruH+L333ps8/vjjc7/26KOPLnzdPuc/Hbz01/voo492X+unn36aXLx4cebVl9P9mlCV7aWsv3OINzY2Jnv27FmIwtGjRxe+bp/znw5e+utdunRp97Wef/75yd69eydra2sz/wR/rvs1oSrbS1mth/iLL77Y+RvB/v1599133+5jx44dW/i6fc5/");
    imageData.append("Onjprzf9XfnUhx9+uPtr0/f222+/nfvnuJHu14SqbC9ltR7ihx56aO7zbr311slnn33WfRqF3HXXXXPv6fQ9XlbrHsHQ2F7KajnEW1tbC5/39ttvd59GMW+88cbC+zp9r5fR/TyoyvZSVsshPn/+/NznHDlypPsUijp8+PDce7vsD8i17BEMke2lrNXV1blZxpkzZ+aO9yuvvNJ9CkWdPHly7r2dvtfLEHRS2F5G5c0335w73t0f4qKuU6dOzb2304+XIeiksL2MiqDnEnTGzvYyKoKeS9AZO9tLWS3fQxf0XK1Bb9kjGCJBp6yW31kJeq7WoEOK5a4gDJCgM0vQGbvlriAMkKAzS9AZu+WuIAyQoDOrNei+h06K5a4gDJCgM6s16C17BENkeymr5RALei5BZ+xsL2W1HGJBzyXojJ3tpayWQyzouQSdsbO9lNVyiAU9l6AzdraXsloOsaDnEnTGzvZSVsshFvRcgs7Y2V7KajnEa2trk5WVld3Z2NjoPoWiBJ2xs72U5RAza3t7e7K5ubk704+XYY9IYXspyyGmD/aIFLaXshxi+mCPSGF7KavlEG9tbTX9sSy5WvYIhsj2UlbLIfZT7rnW19fnfuBx+vEyWvYIhsj2UlbLIRb0XH7KnbGzvZTVcogFPZegM3a2l7JaDrGg5xJ0xs72UlbLIRb0XILO2Nleymo5xIKeS9AZO9tLWS2HWNBzCTpjZ3spa3V1dW6WIei5BJ2xs72MiqDnEnTGzvYyKoKeS9AZO9vLqAh6LkFn7GwvZfkeOrNag96yRzBEgk5ZLb+zEvRcrUGHFMtdQRggQWeWoDN2y11BGCBBZ5agM3bLXUEYIEFnVmvQfQ+dFMtdQRggQWdWa9Bb9giGyPZSVsshFvRcgs7Y2V7KajnEgp5L0Bk720tZLYdY0HMJOmNneymr5RALei5BZ+xsL2W1HGJBzyXojJ3tpayWQyzouQSdsbO9lNVyiNfW1iYrKyu7s7Gx");
    imageData.append("0X0KRQk6Y2d7KcshZtb29vZkc3Nzd6YfL8MekcL2UpZDTB/sESlsL2U5xPTBHpHC9lJWyyHe2tpq+mNZcrXsEQyR7aWslkPsp9xzra+vz/3A4/TjZbTsEQyR7aWslkMs6Ln8lDtjZ3spq+UQC3ouQWfsbC9ltRxiQc8l6Iyd7aWslkMs6LkEnbGzvZTVcogFPZegM3a2l7JaDrGg5xJ0xs72Utbq6urcLEPQcwk6Y2d7GRVBzyXojJ3tZVQEPZegM3a2l1ER9FyCztjZXsryPXRmtQa9ZY9giASdslp+ZyXouVqDDimWu4IwQILOLEFn7Ja7gjBAgs4sQWfslruCMECCzqzWoPseOimWu4IwQILOrNagt+wRDJHtpayWQyzouQSdsbO9lNVyiAU9l6AzdraXsloOsaDnEnTGzvZSVsshFvRcgs7Y2V7KajnEgp5L0Bk720tZLYdY0HMJOmNneymr5RCvra1NVlZWdmdjY6P7FIoSdMbO9lKWQ8ys7e3tyebm5u5MP16GPSKF7aUsh5g+2CNS2F7Kcojpgz0ihe2lrJZDvLW11fTHsuRq2SMYIttLWS2H2E+551pfX5/7gcfpx8to2SMYIttLWS2HWNBz+Sl3xs72UlbLIRb0XILO2Nleymo5xIKeS9AZO9tLWS2HWNBzCTpjZ3spq+UQC3ouQWfsbC9ltRxiQc8l6Iyd7aWs1dXVuVmGoOcSdMbO9jIqgp5L0Bk728uoCHouQWfsbC+jIui5BJ2xs72U5XvozGoNessewRAJOmW1/M5K0HO1Bh1SLHcFYYAEnVmCztgtdwVhgASdWYLO2C13BWGABJ1ZrUH3PXRSLHcFYYAEnVmtQW/ZIxgi20tZLYdY0HMJOmNneymr5RALei5BZ+xsL2W1HGJBzyXojJ3tpayWQyzouQSdsbO9lNVyiAU9l6AzdraXsloOsaDnEnTGzvZSVsshXltbm6ysrOzOxsZG9ykUJeiMne2lLIeYWdvb");
    imageData.append("25PNzc3dmX68DHtECttLWQ4xfbBHpLC9lOUQ0wd7RArbS1kth3hra6vpj2XJ1bJHMES2l7JaDrGfcs+1vr4+9wOP04+X0bJHMES2l7JaDrGg5/JT7oyd7aWslkN85syZuc959dVXu0+hqJMnT869t9P3ehktewRDZHspq+UQnz9/fu5zjhw50n0KRR0+fHjuvb148WL3Kb+rZY9giGwvZbUc4ukPxXU/b/rH8NT2+uuvL7yv0/d6Gd3Pg6psL2W1HuLpD0x1P/fll1+efPXVV92nMnDT9+yll15aeD+n7/Gyup8LVdleymo9xNO/7rX7uX9lTpw4Mff13nnnnYXn9Dle76/P9D9JXFb3c6Eq20tZq6urc/NXvPvuu5M9e/YsHPNl5p8I0I3G6y0/e/fu/ct/P3/3a0BVtpfR+vTTTyeHDh1aOOh/Nn0GaJnxesvN9L2cvqd/VffrQFW2l9E7d+7c5Iknnpjcc889C8f996avAC07Xu+PZ/qeTd+76XvYqvs1oSrbC4yaoJPC9lLW3/keOvybPSKFoFOW31kB/MYVpCxBB/iNK0hZgg7wG1eQsgSdPvgeOilcQcrat2/fXNC/++677lPghra3t+d2aLpTUJWgU9b9998/d4zPnj3bfQrc0OnTp+d2aLpTUJWgU9YLL7wwd4wPHDgwuXz5cvdp8Lum/29st99++9wOvfjii92nQRmCTllffvnl5Oabb547yHfeeefkgw8+mFy5cqX7dNjx/fffT95///3J/v3753Zn+nf7X7p0qft0KEPQKe3YsWNzR3mZmf4feHR1n9PneL1+5596vaeffrr7ZaEUQae0a9euTQ4ePLhwnG80/1QQ/mi8Xr/zT7zeAw88MPn555+7XxZKEXTKu3r16uT48eMLR/qP5p8Iwo3G6/U7fb/edHemOwTVCToxLly4sNQfwfcdhD8br9fv9PV6R48e3dkZSCHoABBA0AEggKADQABBB4AAgs4g/PLT9cl/");
    imageData.append("/9f/GFNuprsLQyDoDMLP/3t98q/93xtTbqa7C0Mg6AyCoJuqI+gMhaAzCIJuqo6gMxSCziAIuqk6gs5QCDqDIOim6gg6QyHoDIKgm6oj6AyFoDMIgm6qjqAzFILOIAi6qTqCzlAIOoMg6KbqCDpDIegMgqCbqiPoDIWgMwiCbqqOoDMUgs4gCLqpOoLOUAg6gyDopuoIOkMh6AyCoJuqI+gMhaAzCIJuqo6gMxSCziAIuqk6gs5QCDqDIOim6gg6QyHoDIKgm6oj6AyFoDMIgm6qjqAzFILOIAi6qTqCzlAIOoMg6KbqCDpDIegMwvX/v4mXv/7VmHIz3V0YAkEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEH");
    imageData.append("gACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAQQdAAIIOgAEEDQASCAoANAAEEHgACCDgABBB0AAgg6AAT4P85loEWK6qDYAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagefd99a07fbea24c9cc67b1eb27a3df848 = new WeakReference<>(result);
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
BufferedImage imagefd99a07fbea24c9cc67b1eb27a3df848=getImagefd99a07fbea24c9cc67b1eb27a3df848();
if (imagefd99a07fbea24c9cc67b1eb27a3df848 != null) {
    g.drawImage(imagefd99a07fbea24c9cc67b1eb27a3df848, 0, 0, null);
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
	private outline3() {
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
       outline3 base = new outline3();
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
       outline3 base = new outline3();
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
        return outline3::new;
    }
}

