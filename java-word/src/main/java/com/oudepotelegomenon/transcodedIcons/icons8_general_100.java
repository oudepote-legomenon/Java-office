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
public class icons8_general_100 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef6db74e7b055984cdeae3bd250d6c0ee;
private static BufferedImage getImagef6db74e7b055984cdeae3bd250d6c0ee() {
    BufferedImage result = (imagef6db74e7b055984cdeae3bd250d6c0ee != null)
        ? imagef6db74e7b055984cdeae3bd250d6c0ee.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(5776);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAAQs0lEQVR4Xu1dZ3QU1xXG6b04PbFTzkk7SU6ak9g5SY5itLPanVmVndEIkIQkQEIIRBcIDBhjOqaLZnqx6RhTbIwBU40BY3o1iG5jsDEmtsGVl3dnd6TVvbOzs7Oz0oij75zvz+68+96737wyrzZr1oQmuA1er3q3x6/8zSPJaR5RaeWVsvM8ASVVkIJ/SMnM/BZ+vglJADjbIymjBEk5yclMeJuLdJw/O8fjzy5OSwv+CNtqQgJonq78kTt5HTjawPkx6RHlT3lJepGzpycj48fYfhMsIiUl5XOCJI/gTv0YO9kuuTif8NKz2iMFM1RV/SyOswlRkJqV9R1e5ezADnWW8qFkl5i7UgPBv0PjlpJS+CX8Z2OBzxe8hzvsGHWg8+QlZi6O3xEIQv5XBVF5pjYy+TIvmjn4ObcjLMZp7LhIZqit2eAxk9mitRvZlv3H2J5Xz7Ndx8+wDbsPskVrNrDhEx5n7Tv3Zt5ANgmLyX10AKchYQQCga/w4v0CjkyLUJLXNJfUn+AwboQ3M/NewUQMKdiKTV2whJ24+g47d+ODmDx84SqbtWQVS0tXia1a/yhzcDoSgpkYNRSV615Jbo/DugmxxMgvKWe7T5wlTjcjCNexR19iSyevrs442iW2JEZdroOMYzsNjVhilHTpzQ5feos43Iwnr1yPKcaDovwznBbbsCFGKCGSfCNcWu7CNhsCscQoLq9gx16/RhxuxpNXb7Dyiv7EVg1F+byQrv4Cp8U2oP/MjW4kEcXHDWlpmT/HtusTd4QYABi3IRGFmdc6j53cOZI9NrQ8di9DlN/lJaZ84MCBn8FxJBuxxCjtVsmOX36bONyMVtoMR6spHdz4IBwZUM5pyS4dGMs+vTRV457nh7D8gjzyHCav+rZyYX6F40kW4KNPMPnOsFMyqq+9x7r1HURsRfCc4yVDh9cfFAwi1ErE/s3D");
    imageData.append("awQBvne6ik0Y1dVKabkJYz3JHk54QFW/DONKJP4wO/CSceKN68Thsdhv6BhiSyeUDE9A/SlOi6PgEa3FEQMLi/LZzTOT6ogCBKEKi1qT5zG5s3Yl600KtX3KKhynTrtizF2+htiqyY8DYjRPT/+BN139Jf69DuBjj3+Nv4MTAJwyrjsRBAhCTRnbnZcWGqZOJiTlLPTicJyJgqe3L45LJ7QZdsTYd+Y1li4bV8uQj0TEgMFN/oJOg9HikD15r+nYF4z140QA09Kz2eFtI4ggOuG/tu0KSLg6DMjpOL5EkOpT/sIz9iGJh7OgfRd29LX4vjN0PjxyPLEH5GJcSaRd1MQQlcXYLn+pVuBnI3EXf2gDDaSwdsUF7NbZyUQMnW8fn6h1AnC42gzJaTgyu4CBTi7GERwHMKd1sfaWY0db4cHzV5gvM4fY1IbYA+q/cTqsIroYIdumQ1HwLQHdVxwQOLOqJxECCA19t67tyPM1FOWD993X/vM4Lrvgb2sliYNTDLZkOw6fJI62yrkr1hKbQP4yjcVpsIqQGPIibLOOfVHuh8PVAXxL4EBAX0Y2O/7iyDpivF89ifXsXkyejaCj3cOMjIyvc4HfNIiHTV+4gjg5Hg4YPpbY5FXKRymi+kOcDiuwIkaYp5uZjXTAhx18SxgEZKXtC9mH50NVV32LAYC3ySAe1qmiHzv7zi3i5HgINrBd/nLux2mwgjjE0AjzTthGHYAjeWLewwGB86b2siLGRafFCPdSruK44Jto59HTxMHxsqOBILxbvQenIxbiFSPM4dgOAXzYGQRk/gyVdexYRH6vy+xq0y6dDaRKsofGo7A+g0YR59qhUQ+L1xQfwEgATks0xBIjM6eAZbUoJL9znsS2CMJVl+15aFg64+T8AE/L4zgO4PZD9hvySM5/eh2xrVGUp+K0GMGKGDAjOXDUBPIf0NLgrDcg/5Y3bLdw4Dh40qmSAtPI2H7rks7EsXZ54Nxl5s+K0nUXs0tx");
    imageData.append("eiKhDeGIymoSLsxMNSQGxLNiwzbyf4jZLbFdQ0RrSCMZ7SMtzIRFgeEGA7vssSmziWMT4eDRk0gcYd7mJaV/M4PeUKo/69f8ZdlnEEZjpBhAGOg0GgvkTcQEbNsQ4cZ0LzZQQ1E+/6AU/BMXZTf5r5YJiZIqKf81sMnWbt1NnJoID124woKtorePvNrcJPgVP1TFHl/wAf7bRGhn8HM6QYzN+4+SePLadSLPQs8W5zsqQqv95I+wkcgJGlgDmyxR+AtRZmCPvXSsmmQ2Ua7avNN0IYNVQpthJAaw76OjyPO8R/cqzrcpPFKwGzJSjSdokiUKr58rDGzFPelklfDVblStWGVO6xL24pFTxK7OkVUzSBj+0t3A+Y4JIaB4hVAxrfT58r6B/wckQxSjLjg4rPrt90lmneLSdS9oS4VwvLFY0rkX23/WfDxt0txFJBxQVdUv4Lw7AqdF4cW5u4ENdvDcGySzTnLLvqOsRUF7Eq8RYWBywswnWPW12C/J+BkLSHhoi3C+HYWTovC2qsggvGPfIGaEhQ6T5y1mar7xyAS0FcMmTGOvVF8iYaNx6LipxA4X5HWcb8fhlCgw1mMQli1cu5FkNlmEsbJtB49ry0tnLl7Jnly1nm3ae4SduX6TPBuLsDQV5wUWa+N8JwVOiJKiql/zhGfaItl/2BiSWbcTlqRGmXd5Auc7aXBCFN6wn8Dh5Nw2CY/y1jeh+sP50ASRlBKc56QiUVH4/8MNwrCVG7eTTLuVMDwDH4s4D9wvnwhC8Ps4z0lHIqIIovpng+e11SU4424klOQe/QaT9IcoL8X5rTckJAr/GDV4XmtcsQPcxhFV00m6gdA2pgWCf8V5rVfYESU8l264UXPMtLnEAW4ifJ/gNNdSnhGZzwZDPKLASKvB/zUcN30+cYJbaCYGz/8ZV+2DtyKKVwyONPi9hgE5V9uGhh3hBk6c9SRJr06YIvdK6n3YJw0OC6JEZfd+j2r7AbEj3EAzMbSR");
    imageData.append("c7/ix75wDeIVxZeRU69f6fGyavZCkuZIMTyiImMfuA5WRYG5iiXPbiJOiCR0MWElyiunL5L/ks1YYghSMIjz7lqERblAMxKiV8pmc5atJk6I5P6zr2t7QvQwXXo/zDbsOUSeSwbNxNA+/qzOm7sFsXpTwPzicu2LFzsDCGLkte1IwsDcyVjeNU7WMAvYhfl9HG8tG0k1FQme6N40I8Y0EgUmhYzEiGTfwaMdn9SC3Vb9hxktQw3xji0ZmJGiRCsZRoT5bKdEefnUBVZmsg+xcZYMEzHSeG8q18TRIMrWA8cti6GzTVk3dvjCFeJgq4QqCubdo23uCfEOEwO6tsvWb2HHLl/TNvvj/3X6M1uQ36wQ7I+aPCuu/SQwPbv4mU1c0B7EXiS5EP9LFYM+nF9Xw4oYuiNgcVlkz8kKg4WdWZfxy5nf9C0ONfjtOlVoPaT1L+3TqiF9XhxOcICp2eXrN2sH1MBqEhweE6ZiYYcXzq+rEY8YdkQBMfrM3876LdrNuk1eHVMUTBDJ3tos+RBeGuV62BEjUpQiXv/jcJGMFENndy6KL5hLnnWQH/NqalijO1csETGA0LXNLSojYXUaiaGza9VKlpYV/zqrWIQzshp8PsMOnBDDrDcVaFkcVYwaUSY+5aAo8lFBVPKTfThCUsAzMIBmKEQnxMjI6xBTjBpRJqxgvswo2w5ikDfYFz2SPC1NUv6D89hoICRZDLNqKhq78JJiJgqs9udV0UgBTjHVVk0Gsy1tqHE7zIZDrIzaHnntLcfF0Fk+dgn/8DT9hom9768xIVExgGMfn0fC6kxEjLqi0EVrOnkVNRjnq1HCCTGADw1+jIQHZuaXJSyGzvLRi5jXvKQ8gvPXqOCUGMA5y9YQG0Co/6EdwM61y06jFzJvevSSwjkA57NRwEkxgKfefDfqqvM0EGX8cuJcu4xVUjyxjsBwG4QEe1PRCBtnsL0au/ybouvElcS5dtlx1AJeUsyGTOTeON+uhJAk");
    imageData.append("MXSazcbBkEi3SU8T59pl2UhzUWA3F86/qyAkWQwgzD8MGTuF2K+Jh4vS1VFR5puK4tqSItSDGDphWDygRB+19Wfl8ZKyijjXLstGmIpyO1UMdsb+aFAI9SjG3tMXWcvCUhIPpibK5NXEuXZZNmKeqSiCX+mE/dIgEFwoRk38vPqC4XbsXLssHTqL2426Rfq2IAY7Yv/UK6Kd6Aa007U1I0yvtirqQOKJRb/SmvWYupY41y5Lh8xkZqJ4AkoH7Kd6gZvE8IjBHbxxXYp/1ymCKNOeIc61y1ii1PuNEW4SQxDl7bARFOYiPCZHImmiTH2WONcu2w+ewYQoJzzAxptUKbsA+y0pcKMYetrggE2PqKwkz4UpKgW8pDgnSsng6WaifAKTVpG+cxxQFHHEOuu9ARflLXAdE04jHElhdsq1pBayiunriXPtsnhg9G8iEAUuOMBpdAQ8k/d7opyF5RYxdIAoZoeISWoR6zn9OeJcu2w3cDKJQyeIwtPSCqcxYcAZTjgyYENXU9EAqz74S/QcCR9mIKcN6zXjeeJcu2zXv4rEUUuHtx6kBtR/0kjcVzIwfD7fF+veMFeXEhelwklRHq4icdRSvgV37OI02gJ3xFAaQeIHFkfSaTF0hK6xUDYRe2EGWrRjvWZtIM61yzYPjSNxRPCcldIdE9wZm7FxJbetpeOHrDBZYuiIda9WoCWIsok41y6L+ppsSXBihJgbIrco935kBHGsHSZbDB1ggzew24j9MNNblbBes50TpbDPaBJHOD+XmhkcoBkXeEZOYcNOnL5TX2Lo0E4SMjl/OD0XRHmBONcWF+5iakkvEgewuU/9HU5bXIAlktgobE7BDo6HscTQenUOiqEDjiPkQu/E8enMyG3Pes9xRpTO45YS+0CvpLTF6YoLvN5bgI3CQcOwVgo72gobSgwdHo/6TQ9cwWQQNzAjt5RVztlMHBwvYTUMtq3lT1QqcJriAu86dsFGgXCAI3Z2LDa0GDpg");
    imageData.append("ly/vir6M49eZmVfKes/dQpwcD/su2EHshvNYidMTF8KnSZPL4KVgLtt51Pp5uW4RQ4ck5X6bv62v4HTohDVflfPsiwKzltimlk9/djFOS9zgCX8KGwbCVzVstMTOx3SbGDpilpQERCmsNF7cF/OOECtIS1N/E20sC+572miyIR8OhHGjGDpSAq2+yxv6gzhdOrMKOrHK+VuJw80I1Z0/mE9swSHJjm3m4QaH4Ah0wtYv2Pv97I6XteNUQQg4P332stXa8an4+doENqwYOnw+9Xu8FjiM06czq6Cc9Zm3jTjekLzL26Is2hZpB8/EgntEzIa246Yob4e7pHA8DQU461DbfIPTGWawyMqi7l2sdc/hJCwQJq4cP4YpfBlX1H68VbqlZGDAxV+8pBzH6dUZLOoStU2B4ZecDpUkTE2eRXkWjs8RaEPbkjIfR2iV2riSC8XQAVdQCAbDRTphPqXtgInah1/3KWu0Zae5XQdpa4zxszUU5UtJP22UO7ZEMLjtxpSiUuXkXYbJQrirH/Xm6bgoyjd5VfUPHEdSEB4fesgT5cZNYHh++TmYV8Hh3QyfL3iPYHI3uxXCSQ4eB283jQtw87HHL+eGr5QYDnvyUv2y4vWqd+NnGwvgEmLBfkmpTktXfo9tNiFBwIAkf9OXGTjckLzG+IBzFIyZYVtNcBCCX/4XbzOf5uK8j0UIE0rSkDtil25jQngBxf0eKZjBxcmBG6S9mZn34uea0IQmJBP/BwSkw05/KSNqAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef6db74e7b055984cdeae3bd250d6c0ee = new WeakReference<>(result);
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
BufferedImage imagef6db74e7b055984cdeae3bd250d6c0ee=getImagef6db74e7b055984cdeae3bd250d6c0ee();
if (imagef6db74e7b055984cdeae3bd250d6c0ee != null) {
    g.drawImage(imagef6db74e7b055984cdeae3bd250d6c0ee, 0, 0, null);
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
	private icons8_general_100() {
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
       icons8_general_100 base = new icons8_general_100();
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
       icons8_general_100 base = new icons8_general_100();
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
        return icons8_general_100::new;
    }
}

