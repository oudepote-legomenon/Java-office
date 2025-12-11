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
public class icons8_preview_64 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image673da4dbda547e0e1c6a4c12d58ce51b;
private static BufferedImage getImage673da4dbda547e0e1c6a4c12d58ce51b() {
    BufferedImage result = (image673da4dbda547e0e1c6a4c12d58ce51b != null)
        ? image673da4dbda547e0e1c6a4c12d58ce51b.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2728);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAHxUlEQVR4Xu1aC1BUZRRenX0AZoY2AgtaouUMlYb7QJTEKbNsxLLSsjGGtIczzahpk1k+0mmanHJsHGbUwZymGcupJlPy1bKshMC9yyKPXUlBWHbZBY23uzAKwnbO3QeX35XXvewl4Js5s3D/c///nO+e//zn/+8VicbgHxF27dIIe+Yx+NUMsaRHVmvnkuMLigh7xma5TdsFBNjAwAw/RvMllNye6YJx6uU23dOkHYJAbtNMAYNug3EnFAaDhGznE0D0PCQAyO4YNiSAEUvcT0WXQLbxDS8B4PxGuS2zaliQAEatRKMCMS9ZEbAiwq6ZDr+VEHlN4TU6JakbMAhFgPv/YUCCkAS4rwlMQiAJkNsuxnpywMvs62G1WTMEywmBJCC6QjMJHO0E2U22CUZCIAlAgIO/QLi3gWyHsZ9nViGPwLX3oP1OQEnwRwAMnuKniPEr8NQuoCPsPntDlPX8ZJjzJ5lc0IsACZnkvUMCfwTA4JvAMUM/RY99sPvsD8JqL0yNrNYtZkcAKxIo7Je8Z0jgjwChAQT8OUbAGAFjBAhHwKyys7KpNzTRgZOMsJ42CUwADH6cXJaGVGzaLiyEum0SmAB8KpE27apASXhNxjKRyzWu2yaBCRAaYwSMETCSCUjUiYNjL8klampusJqKgiVHRqoITgD8/RIYcGQQspudzLwQK/ULJEp6n1RJmaQqqlOqol1skaioComKTpUq9ctEItd4wQmAwb8CIxoHISVYQ3j7ESvyEsDpLLejVNfEhXTJ3DXF55I2Xzubsqc8fWGy8VBQHH0AyLkA7Xc8esbQ77MM8moBCeCMGJMUnDmMDslUdNPyjaXnNYbGcpPF6TJaHOaSKsfGq/ZbD/e4R2GYBFGQAmRU4n0hKbnNooTs0B46QwG+CZgQnzMVHMhGJ+asLsrINjbVoeMmi6MdfreXlbnumfM9AOQF");
    imageData.append("LaI/h0hoB0LKpWoqhlThFbwSkKgLAscpqZLuWLfneo7bcXjqVc66UnPrfFK9N+D0gWi4CSTYmWQ5VOCPANc4eGoncK5/fNDCdr7+isXxBKndH0iU+ljozwl5JF80PzeYbOcFfBEgUea9iWH/3IbSrG7nHZ1Gq/MFUncgkCrzXkNSIRK+INt4gT8CmCWNvVm5n9gytzA3wLyFpez6hHjaWlhxq33TfnOPZW6wgksndg/O/wbTqi1IqZ/mtZE3+CMgypqhjrBnbutDPomsvvgY6kNRsx4N3nHImo9PPj23wbXlgLk9bEnBXri+bbCCxRL2D38/ziRFJfWt10be4I+AgQIMOw/reV1xpaOTFf4/kHpcAGOkQ5RZMdeQbZzAmQBYv7GIUScbKa/zKFfMzmWkKhfANHhXitMijlKQbZzAlQCxIn8hGrbriLXQR0CVo8N08+YDpC4XyOLyHmUIUFLryDZO4EoAPJm30LAfz92wewk4RzfYwND3uYosNneWbyDYREEivAvX97KG5w5/BOBbWj9Jr4fACrAVz/KkCuojJOAvfWOrl4C1O8pr8BpXAWcPsm2F/2uhJkhjX+MMfwTIbdq0e5Y8UpiXnNrVYgX1ARp7Jq/B4SWgxOwowJCVKfXRgxY1NQN3hmxbIdc0AQn72dc4wx8BiOmW7NDeZErdpYmoJ1XTq5CAtFM3qn0rgMVhYffFC6AS9ETGTrKJE+5HQH8hUeTOQ8O2flfpS4KwBHYZKhonkbpcAOM85Z4W+jfINk7gSgCGKYTmvzGvFxX1WAatra+QmlwAc387lsQhKjqcbOME7gQwldrPMjXtLCi71YHO7z9ud81MutwAWdsweKHyYX/xTvcYFA3Xi9nj8gI+CBCr6HgMz+Rd5UwUpP5a40pYb+p6MEGfDdWbZtACGyzsX6bIW8yEP5Tc5NicIbdp4pEA5uUEB8DGRRukppsvmZp9yyFshX8i9QYOmGIQEUwZDJsuspUzoqy5wRHM");
    imageData.append("J7KZxWG1uifJ9v7CnQyp2zNXFBphGezOBRbHKlJ3IIBl70sm+8O2mGzjDfilRgR+l0Ou9QOU0KPZTAGz9MN/LvsSYpWjrcTcFk+O2R9Axl/rOQtIJdt4B36yEl6jfZus+AYqwStzzyAJyrXGYkN5S5eHBKfJ0ur7NrBv4OkS/anUc4SOOYbUGNaADL4Ln9zkxYaytNPuPQJzOmRxphaamx4i9dmQKvWzYb6f9pTCv0NuMUMOaMApRuoOa4Ajr2LiQkeilxcW7TlqLaWutnTiAanJ4thXXNky26cMyQ1K36Wgewyc7cBzQNz+YlNQbM4j/1sSRApDCEYDOGBzl7HU7cmJhmvRSZcL560pzpn2YkGOzH2K3OJpx1r/6xCFIYLdjV8S3O8edgJRgfmekBtc42EeL8IzPpCT+IoMoqMCfgvBqb/BiW8gYpJEMbr7niGwSRCrqflwzykvadB34L8xFgI+EiC/uIXe4SaSbhwdJDCnz/QZdB4c3oCX8KR41JDAHI+znPdilJDgGs+8K4SE6S/xjQoS8JQInK+C5FnfFwmSuLw5ZPuIQD9JsDBb50SdmGwfEeiLBO97Su+bpRGJ3kiAtmeZPYSaeoZ9fcTBTQKGO1WPxRFzEapPzyc3zaIF7oPbEQ1PJODqcJepLFVUHf4N4Z9M6o5czCmaAM5/BkT8AaF/WKzIV5MqY/DgP2zD2Ll1CIj2AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image673da4dbda547e0e1c6a4c12d58ce51b = new WeakReference<>(result);
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
BufferedImage image673da4dbda547e0e1c6a4c12d58ce51b=getImage673da4dbda547e0e1c6a4c12d58ce51b();
if (image673da4dbda547e0e1c6a4c12d58ce51b != null) {
    g.drawImage(image673da4dbda547e0e1c6a4c12d58ce51b, 0, 0, null);
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
		return 64.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 64.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_preview_64() {
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
       icons8_preview_64 base = new icons8_preview_64();
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
       icons8_preview_64 base = new icons8_preview_64();
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
        return icons8_preview_64::new;
    }
}

