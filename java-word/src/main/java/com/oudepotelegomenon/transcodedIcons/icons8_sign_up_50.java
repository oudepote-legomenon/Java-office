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
public class icons8_sign_up_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image1448d3883526464472f28d0c0378723c;
private static BufferedImage getImage1448d3883526464472f28d0c0378723c() {
    BufferedImage result = (image1448d3883526464472f28d0c0378723c != null)
        ? image1448d3883526464472f28d0c0378723c.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2464);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAHAUlEQVR4Xu2ae0xTdxTHcY+4zW26LbqZuXeWvdUszjlNpsOChL4R9oeom5M5l4yHo6/b6jrndMBtQV2iMie0RUXZELEPRCIPnQUVASM68TE3JibGJYoYpRT47fwuFMspRYVbLYmf5KS599z++vtyfuf8HpeQkPvcHhKtfRLYdrnKMQ77hgRybdFYCWPPFjP2DvjMkyh3PoGfCWoWLap+GDqvEjO2FrHWViPR2T7GzwQ9Io3jAxhGdWKt/T+Iwpd6vf4B/ExQE5ZcPAI6nw7WDgK2yvXFY/AzQQ9NZhhCDSCiSaK1yrF/CECGwV8/EfLBRZNZqi8YhZ8IeiIVtudAwG4JY2uGpJ6L/UMCEeOYDhG4JNHa/pCqi17G/iGBVGuPo0MJcmL1dH3ZQ9gf9MTE5D0IUUiBoeSGpP4G+/kkIzF7FJu8+aU8+E16TSAX2WTTp0aNJS9Ds3kPqzT9mKI2v4i/d0vojAwCHHRukOqsM7CfL+ick6YwpbEKk5tVmkma0lSTosqeAgL2p6ty3Ns2lHbsyNpPNqwscBlUZpdBmR2L2/BLjLpkJIiohIQ+KdM5XsN+PoHOK6HzzWmK7Ag22fLK6sT1e4vk89uzmKy2WmcTOXP8apfVXyV78uuIQWnuSFWav8Dt+EDLKQg4DELqxUzhs9jPJ0a1ZUKa0twKEZlPr7d89u2b5UK5qyo8nByUR5OG8oabQrrNsb2a0MjQYYjb6yEi3jEckroMJrtjEYxjNPbzyZr4NcMhGkfBdtDrA2HyMRVC2Y0aeRRpSUkhx+fOI4ei+hADkclcVQDizStxm92QYZAPuZDc5+/G0hs6sppVmJtWaczP7IuIGF0lEPxZI5O5r6WlkRsZGeR6erpfMYUWJ4FoFuM2OcRaaxK3cmUc47GPb0CEAPKiHYZUuEdErVTq8ojwmD8xuetK2w1qyxbcbohIu+t9");
    imageData.append("mOhaYZ74HPsGSlc1Mn8ECTzC+75xycanIS/Og63pT4Q/MbQAGNU5bmhb6t1uCDekILnBtiHHoICx/113Od3luceJg2sYUvWO2Lhx3cPJrwgshhaATUyW26DOKfXZKkh0jljIjetS3e4XejkGCQyb5VQIm2w+Y4R5Aa7Hw19xM0TicnacfgqIaKgDES23EOGxltRUQqtZsXTOdRpV/HshtMzS2Rvf5wODIic+VWlyQgQ6OFEK05FfF62cebuR8Ng1liW1s6PJPqHMXThf4ZvDQrV1ApRaIlxqfR37+ESvz3wsRZ050qs63ZGIuqgo975IqatgTuJE3DYHRGMpROMIvh8IBiGi7WB4+F9OofB53GYPUKWyICImfJ9vqIhKgeDkQEVUz5o1FrfZCxBRFKj88JA7T/VWVVj4qYCJoEDJ3QRmxvf5goooF8pctXJ5z4x9K7tjERQQEQ9R+YeeSWHfYOkSIXfRtVNARVAi9I4nYZF4GWb1BOwbDD0iomYHXoQHzzaWr5PBeyLCA5ThDG7BqLOHYt+dkBeb/PY9E9EFd1bF0oWjhHFEY+/twImIlA1IRFVY2FkeRNwEhChhbmkTMXYZ9vVHUInwQGd7EHNFqLX6n0m9CEoRFLo8huSvBUE/YB+GHuFY4r5vqpw5kzQmJPh0uC/jRMhhXy4QnK4MDQ3omQCX/JAzO/F9b+ieO12Ts3/9ivzWuszfCXSM/JuU5NNxLKJmdnRnQCPhgR5AdC3tbauwzxtWZdm4dtk2V/3hi9z289imgn7FcEvx6GhSESlt63cByAcxS/IehfywQylujNHv9t28dGNQmWexSkvHwbJzvQ4F/InxFuF3Kc4XMfqyx2GnWApCzgk1tlex3wPdgxvVlkuFZmcnPnPqS0xvEUvew+3xChcJxn4A8uKUSL2r3/NV2K7q1i7LdTUcvewjwmP1G/M5MY3x8dzODibJNlrdcFu8Q/clNBL0jSz2eUN3ejCsWkry63w6j40W");
    imageData.append("AFrN7kokKOKlRe/QV8lSnW0q9mFYlWmBUZPj7i8aXEQOXSTrVuxw0dJ8VyJBETOOr0HICXy/LwwaS8n2DWUduOPedrj8b0KrGQg+QOcZ3EbAoCeMsDQ5iu9j9PrsRwxKi8tZctan89ROHbtC7FsPddJqZlBZLHSewW0EFKnWNhGEdMq01snY5w1Uq1BWaerEw+p0fTOpsJ0g65b/1goCmmH4DWjRyQvdW96LIEiIfR6SF7MJrMpMnCVnuM5XVzRyh8l0GEEU2kCEgR5I4+/dVeh7QW4Zz9jcYHvpG1vvCXHSJ5I3Js8QXVg4lyH0oM2gtrTDZ6dBk1MPUVJDtILrHwWEjPVdKMO/dG9/O+k/BMBnwVTRwrOTZ4gJFaNYbExKVZpFP2m2PIW/H3TQwwiJxvYhfQEKEfpZsNDonCb+6sI04YIJ+Nn78MT/aBmEiJ+7lQEAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image1448d3883526464472f28d0c0378723c = new WeakReference<>(result);
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
BufferedImage image1448d3883526464472f28d0c0378723c=getImage1448d3883526464472f28d0c0378723c();
if (image1448d3883526464472f28d0c0378723c != null) {
    g.drawImage(image1448d3883526464472f28d0c0378723c, 0, 0, null);
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
		return 50.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 50.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_sign_up_50() {
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
       icons8_sign_up_50 base = new icons8_sign_up_50();
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
       icons8_sign_up_50 base = new icons8_sign_up_50();
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
        return icons8_sign_up_50::new;
    }
}

