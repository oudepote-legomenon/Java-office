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
public class icons8_design_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image8f4068275c028c09ece7e05fca8f9dc5;
private static BufferedImage getImage8f4068275c028c09ece7e05fca8f9dc5() {
    BufferedImage result = (image8f4068275c028c09ece7e05fca8f9dc5 != null)
        ? image8f4068275c028c09ece7e05fca8f9dc5.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2324);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAGlklEQVR4XuWa6VNTVxjG023aTj+040y/dqb/QKczzlg/2LGV3JCwJQqRxY4z1m1aBSuLQBKIyL6qVJSQBKGilQClrbKFzT1Y3EastIqCVGQqVqktVYnk7XmvXkxOFu9NCGr7zDzDzc25h/Ob95z3LDci0f9JSqXplVBVU5pc2/gO/d0LI4SQq5pqwlRNINc09ym1rXPoMrOh7oUL36Dv8dbjSNQoNK2TqfsGISqz64Fc3XxhtmCOMcyHPQzTYgkImCQGcj1iEYtTTs2d+xpd1q3sIbR116GwZRxyfhybNZiegAA5afSDvshI62hSEoxpNDC0bh2clEisFobp4gXjCoJzxnejEJ5ufuhPmIovEzNytMW2n2PjbPdKSuDe1q3THs/KegRDIkM/5yBPEBiR6OxuiM457LfIlK9PylEV6iFzRw0Ulxjg1tZtDiBojAzpZtfpZ6fFByKGQOQeuOWXblaR/dV2VZEBTG090HdtHIqN9VBYbIQxCmZMrQYcM81S6et0HR4hCprHYVnuYYjJPQK5B285wC3N6JicCZiy7clbEKKWQPw6OsHaHcyNxETA8QMi0UsOlXiC4JxWOwx5B/5wuKc1XYcl6W0Qsdls9QWmdFuKlo2E+QmEWxgyZvqUSivpWk10PSKc7HCeUO0bcgJw5/ym2wSgHVZv7yWRufm4mzWdEzppmvXSIN3X8VOqIiN0nR5wAmFhhgmMoYEdMxfXx9owGpZFiz6g6xIpk9vflqtbzkRmdj7I/uGmU6PdWVs3Qv7eYa+9GTMIYTbIrAPHNtnMHVWgLqn0CIMJIDe9yHZEIlHQdU3LWxh7x1f2Y1fjlZrtIeD2HkC3ExhViRHaey85gdR3nALMZuVxyTl0XU7yBSZ5zwAQAIjTX3hqZMy6wDCzXma9ciJ5GsITTH0ngSjSw664lDy6LrfyBoaF0DTDRmM/+9lT");
    imageData.append("N3MVCdr2MByELi9+l309vCQEBhu9OK0V4h9D2N+nsxkfCM44ZlJJAkCI0m08upM7CYHJ/t75+y/KzhLAlul5xlQWGckXAn3VkmrDbOYTBCchMPbOaLgBS7Rm0Oy/xkYmId9gbdMH2YRAtFdIH7YaZO6zk1B5C5N38NHkWd54CMzGEBg4vsmpwa7sFwhO3sI8gUh2arAr+xWCk1CY5xKCE1+Y5xqC09NgXggITu5gvIAAzGZ15VGf0f9j1kTDCIUY7EkFsyEYNhXqfNoCzIg4mIR8vdVsEA6ha+yY0c2ZT2rYERXBTnY85wl7COyOmv3D7AqA7G2eXWTadDKZkGUHDYGTJq4AcDnjaaHpV/kKwRmXM9z1rMMIhRg6qXIJ4cobKi7w3pz5JH9CxO/+hd2c4ZbAr5GpLw5MEgIx2CMcIqn6MvvZb92srigwjWxPea9iyZiwYTZLKiy3uloB2Bv3M7g5S6q+5HAfT2fozZlPMhVJtAhx5Rh/CLIbfFivi4xxtQJwZYyA47077FETnpvNyDxjKhETCCn0d8c5NdiVr55IYSHaKqSL8Xl6BUADuPPm+hH23AwPAX3uZrpk8Xu7sxhrV6UCju4Nh6mxaqeGe4Lg5C0MHgJy1z7B7FSJ82uyw+7f7c2ArsoQON+yFv75rdwJwBMEJ29hOOOZM74FEPxKo3jj/DfL1cyfZxvWwcSZbBhq3wCWb5dCd1UYTAzvdIAYPJFCVrEymzsITt7C4JnzstwjEJXVTbrcDWGR2ZEqXq1Pl0yO/7SFBUH/fTobemuj4cyBlaSbVT2CsKQAJoL6kkBeh2dCYewhuPKCuplOw/QfrvrcxkFwvta5ETqNwXDoGwVc7IwVBMEJD7rxwBsb45ytHI1vAfCVBl0OD9zx4B0P4On6p7VmmWxVQSJj+/1omgME579OZ5IuFs5C1BVJCujn+UhIZPD9jP1nzGhk3iEpucW0UNv9Kl33tOTy4BFGFmYbaE93ALjbmwnn");
    imageData.append("G2Nhb17YfeNmZqqhWJJPPytEQmAEQ6xdLpk3/9MQmPdJKIQqIuByRxqMHU+H43tW2fTp0sldamZip4opLVUz79PPeiMhMLwhUMrwIAtCcCaRgYIEZopksMGyVPGGwgTmLfoZX8UHRhDESqVkzsfiEBsH8RFxmDxkdPXyoLV02ZmWJxhBEKgYZVA1AiwICLGFK4LOrYkOWUCX8adcwQiGQIWGBg9GRshqV6yQvkt/N1uyT82YYhWalkmFunkvvrCly7qUViR6mb73rMRFhv0hj5BIPI/CyOBkxzsS/xX9C7Dd/yXQX5FfAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image8f4068275c028c09ece7e05fca8f9dc5 = new WeakReference<>(result);
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
BufferedImage image8f4068275c028c09ece7e05fca8f9dc5=getImage8f4068275c028c09ece7e05fca8f9dc5();
if (image8f4068275c028c09ece7e05fca8f9dc5 != null) {
    g.drawImage(image8f4068275c028c09ece7e05fca8f9dc5, 0, 0, null);
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
	private icons8_design_50() {
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
       icons8_design_50 base = new icons8_design_50();
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
       icons8_design_50 base = new icons8_design_50();
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
        return icons8_design_50::new;
    }
}

