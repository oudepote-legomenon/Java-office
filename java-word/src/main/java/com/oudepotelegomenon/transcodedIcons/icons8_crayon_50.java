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
public class icons8_crayon_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image4c1813281c42c40acaedc78c0ac83cce;
private static BufferedImage getImage4c1813281c42c40acaedc78c0ac83cce() {
    BufferedImage result = (image4c1813281c42c40acaedc78c0ac83cce != null)
        ? image4c1813281c42c40acaedc78c0ac83cce.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1652);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEn0lEQVR4Xu2aX0xbVRzH92Ki8cFEE9+MvprIg0/yunLLHEWWwNMSocw0dY4tUpdBaSFuZdKuvW35Fwz29g/MOIITWqPObcAGU2gLylCQbKJzE5Nlm4FtGev/n+dXdxk7tY62994W4zf5pgm0/f0+95zzO79z0m3b/lfu0rb1Pddo5tqa7e7T5LWj0eh+iX5PwavR6irSWV23LNzJ8NCoH7r6fWEd61xrYB1y+r0Fq78hnCueobPRlVAc7kQAbhN7RwOJJpYLbwmYBpPjZZ3N9afrs7PR1QcQG/35uemElnVGGy2cgv5swehxEFsCZrMQBQ2TKURBwmQLUVAwuULw9uUTRiiIvMIIDcFbUhixIHgjDG6aWrOToWMLJrEheIsKs952DIsLwXuYtDPYm+kt3It0LllLagg09mYdpNHUmjkbnU9WygcEb+yam22uU3ROGcukMxXnCwK75mOOwZDW7Gil88pIfW8f2HW+TJEYNtpiUkNgPHx4pLDc1Fgdz9K5bVof1+7bdeH1nYnZyirwMwxcO3UmJZhYXg0noN83GsWZgNOazm3TOv7WfsUEGYmFN6thzWaDZY0G/HI5XPvqdEpQoS0axH27PWkpYESHkAJGMAiDoatoTPFG/LuKClizWlMgeP9eXy/4mhEMgm87TnS7YwGFAi7v2QP3/2FExBgZwSH43un6xXmQCkYwCLw807GuW/RmJwXM+j5BIJos3Ct0bhlJa+GMeHnG3ztttJgwgkKg9Db3GdJhpgQSE0ZwCBTexXYe90Wwy6QDigEjCgQK+3wdy8W8Y8GUoELDiAbBy2DsiZI2GYZG0k+xXGEEq07p9FHdob3k6UBw4VdoafeIAiM6BMra9MEvvSe+SCY5t7QMzXa34DBekz0mKoTrnfde0FscML14ZT3JTcPM/giBsjL4WaVKC4O92lxVFYzvLEvg4YyOL5i6");
    imageData.append("63UDhva+5ClsY5KbhvmXkUGIxZoawPNMn3p/JR1bULW1doZ8aapVLjCSQnD7DlXjIv/txu2U5HKBkRQC9YlS/XWTxQnnphdSEssK5sGawSOAZBAX5fKnpxhmbbylFfSsE8aC8ymJZQqDJfbTDz2x0fKKuCQQqEmZTOXfsSNyjxyeZmzdOcNs3CcMxo5X6XiiyV9aOrukUiX4ChMkMDr28dMs+NMV0JMOwDsWSN4A4t+w4nmGR5L7hChtRzpNMkzRVEkJrBgMj5TLhyOTCnN5+SYMfDkBzVYXtBzrxbvYeGe/Nzo04gczNxjC84ykECiyNrrnKitD9OZFw9y4E4Lx7xeB7R0ArG7m99nVngNam1upfBJ/uaA1O9p1+EsGC3c0p8uzbDRZXPwUaRnu/nHwYAoE7/EjxuQ005GK1mrqiXdp9BNO9buv0d+VV/m3b68m6yNyj2UfSf6uyQRX6+pgWqEIkWkXH6xR/cDt1RztVaufoL+jIORnmJOXamvjmDxuXNe1WljYvTuCyZORukqqWcO3cvnz9OcKTiRh+0x5efiSUgmB0tIYAhDPT8lkHvJ6uKAtk9Wug8wwzDOkalnJgg+Qp79E/vkN8fmt4MmSkvaHQ/If0F/EtgRASrEkxwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image4c1813281c42c40acaedc78c0ac83cce = new WeakReference<>(result);
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
BufferedImage image4c1813281c42c40acaedc78c0ac83cce=getImage4c1813281c42c40acaedc78c0ac83cce();
if (image4c1813281c42c40acaedc78c0ac83cce != null) {
    g.drawImage(image4c1813281c42c40acaedc78c0ac83cce, 0, 0, null);
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
	private icons8_crayon_50() {
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
       icons8_crayon_50 base = new icons8_crayon_50();
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
       icons8_crayon_50 base = new icons8_crayon_50();
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
        return icons8_crayon_50::new;
    }
}

