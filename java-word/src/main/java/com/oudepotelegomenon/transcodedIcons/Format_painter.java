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
public class Format_painter implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee1754c29971231a88fe965fd393fb9d5;
private static BufferedImage getImagee1754c29971231a88fe965fd393fb9d5() {
    BufferedImage result = (imagee1754c29971231a88fe965fd393fb9d5 != null)
        ? imagee1754c29971231a88fe965fd393fb9d5.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(6852);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAQAAAAEACAYAAABccqhmAAAT20lEQVR4Xu2dfZMc1XWH9RH0EebfkDiRUxkbEJJGAukKMEIIITBGqsaOAeN1kKmyixCcTIVU4kqVrbI7iZM4zqaCwYRghLEJLwGvhU14NWu9oNgYMoaVMQa69BEm92q2xeh078z09Nvp289T9VS5AO/2bPdv+txzb/ddtw4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAoETMzgOHrENt7jD7h92P7DgkjxcACsSGbSDDp8He1mvcF8BAHi8AFIQN2gYZPC1uvGiX+wJwbpDHDQAFYHSX/7EMAwDKwOgu/2MZBgAUjWlG+c8wAKAMTDPKf4YBAGVgmlH+MwwAKBobtI4MnhYv2nSlDH9sR34OAJgDG7SDMnha/MhHd8rgxx6UnwMA5sAGbVkGT4Nbt10rQz/usvwcAJAR08zyP7YjPw8AZMA0s/yPZRgAkAfTzPI/lmEAwLyYZpf/sR35uQBgBkyzy/9YhgEA82CDdlgGT4OXbL9ehnySh+XnAoAp2KCtl8HT4qbNV8mQT3O9/HwAMAEbtEAGT4sfPf9SGfBpBvLzAcAEjB/lfyzDAIBZMX6V/7EMAwBmwfhV/scG8nMCQArGr/I/lmEAwCzI4Glx85Y9MtSZlJ8TAAQ2aLtl8LR4/gWXJ0Kd0d3y8wLAGDZoizJ4Gty+4xMyzPO4KD8vAIxhw3Zahk+DW3p7ZZjn8bT8vACwivG7/I9lGACQhvG7/I9lGACQhvG7/I9lGAAgMe0o/2MZBgCMY9pR/scyDAAYxzRr44+8snEIQIxp1r5/Rcn+gQAO06x9/4qS/QMBHKZd5X8swwAA087yP5ZhALQb087yP5ZhALQb087yP5ZhALQX0+7yP5ZhQIWEt+zqWQ9a+ykGVs5HVRg/Nv7IKxuHlMxqsA9bhzN62rrI");
    imageData.append("l0HJmGbv+1eU7B9YEqvBH6QEPItL1p782ZAT48e+f0XZkX8fmB8b2A3W5ZQw5/GQlTc7F4Wh/B+XYUBBhKO7vivhZYCLcBAyLCgGQ/k/LsOAAghH4ZehLVr35cKXQB4M5X+aHfl3gtkJqwl/LF8CeTCU/2kyDJiTcDS1J0NatoOQnsB82KAtyeBp8OJLrpOhrNIl+XeC6bgQroZRBrQK2ewlK8bPff+KkjtKRsJRd14Gs0p78phgAsbPff+KMpB/L1gbG75OSiCrluXcWTB+7vtXlJSUGQhHq/VkIOuwJ48NUjCU/7PIMGAGQh13/1je8TgLhvJ/FgP5d4MkLnQpQaxLXvU+C4byfxYZBkwh1HX3j+3J44QxDOV/FhkGTCDUdfeP7cvjhDEM5X8WA/n3gxHhaN6/rLX+eeTtTpMw7dr4I680ldYgrHbJbxZZyDUJ0459/4qSptIahPWt+psmXwBrYdq1719R7pZ/x7YT1rPmf1b5AlgLQ/k/jwwDBKHO5l8sszdrYZSW/1u3XTOwQXPK8GmQYcAYod7mX2xfHjOs013+b7xo1yEbNKcMnxYZBqwS6m3+xQbymGGd+vJ/w6oyeFpkGLBKOHo5pwydJjvymGGd7vI/PsYuwwDVuHClBE6TvNItDaN444/NW/acvbvaoC2mhE+LrX/1VDjayEOGTpO8zSkNo3vfv7Pja/e/U4KnxdavMAv1zv07XWOSpdtpGKX7/m3dti9RWtugnU4JnwZb/cKJcPSOfxk6TfblMcO65pT/MV2GASoJ63/l1yS5+6+FaUj5H+P+WUrwtNjaYcBqyGTwtBjI44VVTIPK/5guwwBV2IDtTgmdFln6uxamYeV/TJdhgCpCvUt/XVXSkccLq9ig9WXwtNhNKf9j3L9LCZ4W+/J4fSbUvfQ3kMcLYxjd+/6t2bRx/y4leFps1WITF7KU4GlwzQoS1p0Jf0cGT4tbeldPfWLLBu1wSvi02JHH6ys2aIdTwle3");
    imageData.append("bsvxNW8gsO7MF4Daff/Ov+CyQB6vxIYsSAmeFlux4izUufSXDUFnwTS0/I9x/01K8LTYimFAqHPpbyCPEwSm4eV/TJdhQK2Eo1JbBrBOW7sOIxOm4eV/TJdhQG2E+sp/5vtnxTS8/I9x/21K8LTo9TAg1LX0dxDS9JsN40n5H9NlGFALq6GTQaxDmn5ZMIo3/rhw4xWZy2YbsoMpwdNiII/XB0JdS3/XXDAGKRjd+/515PFOw/1/UoKnxcwVTRMI9Sz9DeSxwQSM4n3/bPk/95jZBm05JXxa9GpsGupZ+stKv6wYz8r/mC7DgMoIdSz9peM/D8az8j/G/X9TgqfFuYcB4WiqzS22WXQXvdAtwe2Ho0BW1gRb/d0ykFXKMt95MJ6W/zFdj4YB4WhrraWUi3+Srix3XwruC6OUL4Sw/rl/Hu+dF+Np+R/T9WQYEBY3v+7CshiOKoSO/D3zENa/9LeUL7ZWYDwt/2Pcz0gJnhanDgPCUXOtzKW17me7Lxc3hZepIokJ6537D+TxQAZMAzb+yEu3oRuHhOWHP82lcNRD6MnjSSOs962/rPHPg1G+75883nnpNnT/wLD+Z+rH+wcdeXyOsL65f6b78mKU7/snj3de3M9KCZ4WUy/kcHQXlhd93Q7CD/oHrjqpa+6fjn8RmBaU/zHdBg0DwnrL6iwOUv5Z2bovHMKfF9OS8j+m26BhQFj9uL8puvAXVhm2GtOS8j/G/cyU4Gnx7DAg1LGiTqvB2CmFPJgWlf8xXeXDgLC+MXUTzL0mBFaxQevJ4Glx0+arCi//Y7q6hwG9UGfjT4OpjVKYE9Owff+Kwv3slOCpcMcWU/eUn1ZzLwcHgWngvn9F0VW6f+B99z00fGTxH+TF33bp+BeNaei+f0XRVbh/4A0HFoZHX33jjC8899Lwvr/9MxmENkrHvwxMS8v/GPc7ZADr9odHXjz7BRD7zJNPDBfv+owMRZsM5LmDAjAtLv9juoqGAX9615cT");
    imageData.append("4R/3v+791+E3brtWhsN3+/KcQQGYlpf/MV0lw4AtvSuHz710IhF66U9fOTF86B+/IkPiq1OfkIQ5MS0v/2Pc75JhrMOvHPpmIuyTdP2Be+6+XQbGJwchTb/yMJT/Z+nWPAzYs/eTiYDP6g+///Dwm18MZHh8MZDnCgrAeLbxR166NW8c8sB3H0sEO6tu2tDT/kAgzxfkxHiy719RdGvcP/CmW76QCPO8uv7AA1/7KxkgHwzkOYMcGE/2/SsK9ztlMKsybdovr88eecbH/kAgzxvMgaH8T6VbwzDg7r/+eiK8Rfrkg9/xrT8QyPMGGTGU/6l0Kx4GzDrtl1c3LPCsPxDIcwcZMJT/qbjfLUNapt/4p28nwlqmbtrQo/5AIM8fzICh/J9It6JhwPh6/6r1aFlxIM8fTMFQ/k+kW9EwoIhpv7y6/oAHw4JAnkOYwMLn/vywdajNz9x65/DCjZcnguKjB2//i0QY6zLuD6QEq0kG8jqHFGzQ1svgafGG/QuJoPioa/yVMe2XVw8eOw7k9Q4CG7RABk+LOy/9eCIsPlr2tF9eXX+gwdOGgbzmYYwFyv9avfSyjycCp9UGP3YcyOse1lH+a/Df7nkoETTNNvix40Be/61ngfK/Vuuc9strQ5cVBzIDrWaB8r9Wf/DYkUSwmmYDHzsOZA5aiwyeFvcf+JNEWHxT07RfETZsWXEgs9A6bNB2y+BpcdeVBxKB8cmq1vtXbcMeOw5kJlqFDdqiDJ4Gb/3sXcNNm69IhMYns77mq2m6acOG9Afa+0pxG7bTMnwaDG78fCIwPtmkab+8NuCx43ZuKrJA+V+bGtb7V2kDHjtekvnwngXK/1ps8rRfXpUvKw5kRrxmgfK/FjWu969apY8dt2cosED5X4vTdvdpmwofOz4os+IlC5T/levrtF9elT123I4txm3YBjJ8GvzjT38hERxfrPo1X01T0W5GHZkXr7BB2yCDp8Wr934qERwfvG7PFcN3lvvD");
    imageData.append("nx//UeLCx3NV8NhxT2bGK2zQDsngafCzC18abrt4TyI8Prj0nRuH0U9vPeOpn311+OqJ5cSFj+da42PHfZkZr1ig/K/U2z591dnwjzs4+u3h8VdPJi58/MCalhX3ZWa8YYHyv3JPPnlTIvyx775yx/D1Y48kLnw814ofO+7L3HjDAuV/pX7tL69LhD7Nt5f/hv7ADFb02HFP5sYbFij/K/Njl14+fOsntyTCPsmVn/09/YEZLHlZcUfmxgsWKP8r9f6/258I+Cy+98rnz/QH5EWP51rSbkYDmRtvsEE7KIOnxe07rkkEqMl+6oYrE8HOqusPvHb8icSFj+da8GPHh2RuvMEGbVkGT4M333LH8PwLdiZC1GTHp/3y6voDJ088l7jw8VwLeuy4I3PjBTZoHRk8Le679uZEgJrsnbftTYS4CN88+i9MG04x57Li2vefLI0Fyv9K3LplZ+bGXxZdf+CNY/+ZuPDxXOd87Lgnc+MNhm2/K8GGtC9DW4auP8C04XQzPHa8KM+lNxi2/a4EG8yODGrZuv4A04bTneGx4448n95g2Pa7EmwgD8uAViXLiqc7YTejvjyXXmGDtiSDp8GLL7nOm/LfhrAnQ1m1rj/AsuLpiseOB6HPbwGyQVsvg6fF3ta93ryI0QZwWQayLnnseDZdf+Bbd94UyHPpFTZogQyeFi/ceIUXr1+yoTsoQ6hBHjueqjc3oDWxQTssg6fBS7Zf78r/jjzepmGDtt56WoZPi28vbR/+8rm7h8eOH5MXP776Rk+eT68wisv/Lb2rvXj3mg3ZIRk6Lb73/PXDXz/+O2dceao3/MWL/ywD0Gb9nfaLMZT/pRLVMO2Xxbf/+8NnvwBif7W0b3jylYdlGNrmaau/jb8YQ/lfKjZkSzJ0Wnz3J7sS4R/3/378uTYPC/ryXHqHofwvlUjBtN+avnzT8O0nPpQIvfTUk380dP2BlID4rL+P+45jKP9LxQZtkAieEt/50dZE2Cfp");
    imageData.append("+gP/+/K9Mii+ulueSy+xQVuUwdPg9h2fcOV/o7djjipa7z+P779wIBHwWXX9gRNHvX7s2P9pvxgbttMyfBrcuu2aRpdgkfJpv988fUEi2Fl9/dk7fO0PNPrGMzM2aLtl8LS48aJmv3HFhmxRhk6L7/3PvkSY59X1B157/qsyQE220dddJgzlfynYkG2QodNk2rRfXl1/wINpw3ZM+8UYyv9SiBRP+/32x5clwlukgyM3Nrk/0Pim88wYyv9SsCELZOjUOOO0XxE2cFlxo286mTGU/4UTjRp/g0TwlJh12i+vrj/QoGXFPXk+vcZQ/hdOpHjab3y9f9W++fTl2vsD7Zn2c9igbZDB0+LmLXsa+fBFNFrv7/W0X17dsmKl/YGOPJ9eY4N2SAZPgzvMflf+N3IFVqR42u/dZ/ckwliX8bJiRf2BvjyX3mPDNpDh0+DWbftOy2NtApH29f4lTPvl9a1HLh7+/JlvyTBWbbum/RyG8r9wIkWv+ZKWPe03l4+eN1y558PDlX//w+Hg8P7hiZeelsGsykCeS+8xlP+FEime9nv/xU9WNu2XxVP/8Qdnwj/u64/ePjx2rNJhQeOfNJ0LQ/lfGJHy9f7vLG1KhK92v/+7ifDHvnXvpuFrT31ZBrUse/J8eo+h/C+UiGm/zK7ctyERfOmb95vhyedLfW25N5vMZMIGrS+Dp8Wmlf+R8td8/eapbiJ8dXvq4d9LhH2Srj9wfPl5Gd68usZfR55PgExENe7uM81pr/mqxcc+aPxl9ZePf6nI/kBfnkuATETap/00Nv6++/uJYGfR9Qd+sfR1GeasDo62bdoPiidivX823bRfSqjn8VcP7snTHwjkuQTIRKR0dx+n1sbfqfunN/6y+sYjN2ftD7RrvT8UT6R82k9j42/StF8RumnDGfsDPXk+ATIRKd7dR2Xjz7py73yNvyy6/sCUZcWNm2IGZUQ0/jJ76qEPJcJapm7aMKU/0L71/lAskfLSX+WK");
    imageData.append("vxzTfnl1y4rH+gN9eT4BZiYahV/twz5FvuG3SE89kFzvX6Wry4ob+3IZUECkPPxaH/X99Q/KbfxlsFGrS0ER0egpP7Vlv/O3R7Ynw6fAMqb95pBpP5hONHqHv2vwOV3oFyPlwXeqnfPPuN6/RDvyXLeOSPF6dcyh1tK/xsafsLGvlS+MaDR+TV482HhVLve1nnow33r/gjxtZdovUvymGpxfrV3/slf8ZbA9u/tMIqL890+lC37OlP4VrPibwXa+5iuNqAGNLMymhnf7p6mk9Hf2ZA5aib1YdsuLB5utyrf7Wk99T03Xn/X+MZHiTSowu2rH/W7Bj46uP42/cSLKf298/4UDesf9M7zgsyJZ8RcTUf7748s36XzG//H0d/vXJHP+40SU/96otulX84M+Y9L1l0SU/16odrGPnvAz7pdElP9eSPin6sK/QV7/rSdS/MoqnE2V4X/sPC1P+DkJ/1pEil9XjdNVGX431adjlZ+T8K9FNHqsNXFRYQNU2u3Pu5lHwS6vMOZfm4jyv5G65/rVzfO7B3v03PWdfXm9gyCi/G+W9q6vreR3y3oVjfWdiyu82GM6EeV/c7TBd+v61dz1Hz1vVOrrueO7cf7iCsGfnYjyX71uPb+KO77r6Ls7vXuCT0/oByuj0LOkdx4iyn8d2ru7G9M73U497qWdpa/ms3dwN2ZP072fz93dXdjPlPb1P7jjGnlLK6Ow9627V7jT5yf64KWWWJI2bOq04dEqU3UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAKCN/wd50s6Jkepk6QAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee1754c29971231a88fe965fd393fb9d5 = new WeakReference<>(result);
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
BufferedImage imagee1754c29971231a88fe965fd393fb9d5=getImagee1754c29971231a88fe965fd393fb9d5();
if (imagee1754c29971231a88fe965fd393fb9d5 != null) {
    g.drawImage(imagee1754c29971231a88fe965fd393fb9d5, 0, 0, null);
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
		return 256.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 256.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Format_painter() {
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
       Format_painter base = new Format_painter();
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
       Format_painter base = new Format_painter();
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
        return Format_painter::new;
    }
}

