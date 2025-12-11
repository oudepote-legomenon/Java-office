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
public class icons8_color_mode_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee97deea34fe0dd6b91e7bab4b9c9df26;
private static BufferedImage getImagee97deea34fe0dd6b91e7bab4b9c9df26() {
    BufferedImage result = (imagee97deea34fe0dd6b91e7bab4b9c9df26 != null)
        ? imagee97deea34fe0dd6b91e7bab4b9c9df26.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2696);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAHrUlEQVR4Xu2YeVBU9wHHX2zSv6hWRYuKTUQOuSEcBY9gbIKa1mQ0kCCMjakZJmIOa0JFYkOn06jTiDEEEZQImGIoiBEUSxRZAwmRwHLswnIv7AF7sQvLuSD22/cWWNe3x3vrkb/4znz+YYb3Pp8fvJndRxBzm9vcHnogkuYJvHaG8rwiExrdIwrr3Hfwal23a2pcXp4a2LRtUrNxm2bguT80qTdsLdSs23qof92WEOp36Nf52dceHOPY5hdzrMU3SiLwiQLf6zU0ekSg3n0HuG7bUePyCgY2bsNA2B+hee4laNZvhXrtZqhDwqEKekGiDNx0tD84zJF+3ce+3oBY+67AN9I7A3ZNtPvHoNV3JywGmJHvD36BDNgEVcDzUPiHTSh915+WrglaTL/PY5k49M2d3UG71cLAN0AGgCnAmrzSPwxK3w1QeK+HwnNtv2zN76Lo93tkQ0DsU9KQtzLEIX9GT/CbYB3ATh5y9xCQAZC5Bp5GWNiT9Ps/1DgeqXai0LhyaehbsDXANvkg9DkHotfJ/6oibokd3eOBlhFQ+9TxVWUlJd5f4IECbJTvc3oWmnccMHppHgcc4uH/EimulRknXW4h2ekmrnil2Bxgs/w+B+iuEdOUEOl0H5uW4V0dfcqjCilulZiNKPb83KYAm+TjHDB+lbiPsRIimu7FajlB1YszvKpV6V7VMInwOMk+gKW8eq8DxooIc6iHigl7uh/jMv1q08/61iLD+yeYiyhy/8wkoMk/Gt1/SYaq6BaG20XQaYf1jHcIMVxcCs3+RCh8NpjKv03Kf0NYI43uZ3VnvBsdv/Svm8j048JaxGX3E4YA0f5kjHT3YmJi0iI6krHOHqjjPrwnH0s+sBcJq4xcJCbJiJV0T4vLerbhGAnO+deDMcLzBJTniszK3odu4j4G07JI+eUYzSfYcpTuaXZJBOaR8pLsgEaw");
    imageData.append("ibidLrQqOm6FMf4nGMkjWDGcR4iRRDB/AMwJ4oXmBPJABTBFXNnXzFp2fFyHMTOMlL+MkVyCFaO5RDDd12TZgY2JVABTxBn/n6DoHGItSjE6Nm5gZHRMz7BSgOHcX2L4K4IR7VdEPN3XZDkB/EuzAdYivj3QblF2dOye7MiokewIxaieoWGKET3asu0YyiEY0eYQBXRfk+UE8JpyAvmGAEsRgmK55VO1JDpEMaxnUDvLEAZ5mRg6RzCiPUc00H1Ndj6Qp54OsB4hbx1kJWssOjA4ixaagVkGoRHXQJtJMDKYSajovibLCuJPnQ+aDbAcoVEOWzjVISNZY1Et1JpBA/3qAQMquQTaMwQjg2cIHd3XZHbbb0zY7bgBJvqUWqunala0X2NAqVJDQaHsh0IhAQQvGhE+TYsxm6mf3aH7moyUU//q1RtggtuiuE9UrbknaixLieplSVE5hUIFGUmfXKmnV6aAQsrF/5qeZ44QhDP/C82PKOMviCgDE1n/FTKI9utFZfJp2V7ZtKy0j0IOSa8c4l4ZxFIZVF0XcJe3jjlCEM6j+5psYWR54cLXysFE9LE6g6yxaJ8VUZG0DyJJH3okvegWU0ghFEkxxI/D3YZA5ghBeD7d12SLX+ckLI7igAmHGPJjBE8yI0uK6mVNRXuMRCm6eiTopOgWo4Oku+M2Jmu8MMX1YY4QhB+k+5psaQwnZGn0d2BD1BGuXrbHzKlSonrZGdEOoQjtFF09aCNp7ezWM8CNwmS1E+7UrGGO4G8JovuaGZ5YtquiZ9muSrDhn7nNM6cqnpGdERVOi7bNiLaQ3wkE7V1opmjrRFNrB6R1h6H7fgkmqlawiRABLN/mOe7+/qjj7h/AhqV/bcBHpULDqVKiBlm9aCf4pCyvpR08QRsam9vQ0NSKf/zwH3x64/cYr1jANuITuqfFOf6pasXTe6omntnzI6zxm4ONmH+8E78+0YVXvu5CaX0H+HrR9mnR5lbUN7Wgnt+C");
    imageData.append("Op4AXF4zSmp/RMz1z+Fx5QN4XovHv1hE3OVv1KFt0wq6p9Wtjr2dtjq2GpZwSOAZ5Bee7MKiFCEcTnXj1fxOHL/Zjsu3W1DBbUYltw6Xqytx4rtLiCn9DJ6XD8C96IAhwKv0ID4te9F6ROPaL+h+jPPYU7XIbW+tigR0lic2mcjbp3ZjSVoPlp7ugUOGCMvOirH8SwlWX9gL57w4uBS8A9fC97Dmm/0mAd7XD5HR5iPucH36URtg+5d6ah7v1kV4vVsHY1YebmYt75jFPsC3LBHJ5eEmEVO1bpF0L5vm+37jab/9jaD47d8ENsmvzJbaFOBXfhjJnM3GEal0H5sXGZn/i4D45m9X/b3VZvmnz/faHOB/62PyedmCsYoFVx/Jq0VqS5Ka7OYf77hqq/wz/+57oID1FYdu5nPCHs3LXcOSOE+S8mm2yK+68AABnI9PhXGSHs3Jm5t9ivB1+1PdKlbyeTLWAT5lif1+Nz96uAeW7RzPiheR8qkOZ8U6a/LO+XI2ATqv6wmpHqVJi+j3eexzzBavcMwSH1mZLRGbk3cpUFgMcL9yQOR57cMjbtfjl9Ov+/MvCfNW5cqCnXJ7E5zyZAXO+TKec4FC7Voom3LKfVu3+us4tXP+vgaXi+8VuF16P96z+IMgAsQT9MvMbW5zs33/B6F1LYKj/zvpAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee97deea34fe0dd6b91e7bab4b9c9df26 = new WeakReference<>(result);
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
BufferedImage imagee97deea34fe0dd6b91e7bab4b9c9df26=getImagee97deea34fe0dd6b91e7bab4b9c9df26();
if (imagee97deea34fe0dd6b91e7bab4b9c9df26 != null) {
    g.drawImage(imagee97deea34fe0dd6b91e7bab4b9c9df26, 0, 0, null);
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
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_color_mode_48() {
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
       icons8_color_mode_48 base = new icons8_color_mode_48();
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
       icons8_color_mode_48 base = new icons8_color_mode_48();
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
        return icons8_color_mode_48::new;
    }
}

