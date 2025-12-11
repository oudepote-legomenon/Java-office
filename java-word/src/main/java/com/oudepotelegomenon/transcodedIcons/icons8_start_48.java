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
public class icons8_start_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image0b5deb68e98eb5bfd49aeb7347f34730;
private static BufferedImage getImage0b5deb68e98eb5bfd49aeb7347f34730() {
    BufferedImage result = (image0b5deb68e98eb5bfd49aeb7347f34730 != null)
        ? image0b5deb68e98eb5bfd49aeb7347f34730.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2644);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAHiElEQVR4Xu2YWWxbRRSGK6A88NjCA2qApnRJ0yWLszhxEme1s9jZWmcVKiCIVImKB1Cp+tBFogtqKagNpAjxChJVWyRaJFQhQKpAICHoJlI7dhzH+5L42klqp4kP59zGJnd8r+3bJH3KL40UJc7MN+Mz/zlz1qxZ1apWtWSBwfA0p+stC7V0Hw63dF3mmrvuhZr2TnBNe2e5xj2zIW3nRFDTeZdr6LwcrO84zNV3KOHo0afYeZ64Ztq6Xwrrek6H9D32sK4bwi3dEGruwmGAUBOOxr049gCnxaHpBNwAjg4I1rdDsK5tfLK27ZRf3ZHFzrviChkML4Rbe74I6XqjYX0PyIfnNwDB2laYqNZHJ6v1QyG17nl2nRVRuK2vb0rfGwjre2Gp8JM1OKr1OHQwUdXiD1S09LDrLZtgYGBtuLXvy6lWAl9e+Ek1vwEczTBR0XQRFIq17PpLEugGngu39v6w4vCV/AbAr9Jedyh0z7Ecj6VHJy8PPoDQNoQbrW4Bi7oZxhAwgOCZwAdUjRAo10KgTHMDcg3Psjyy9ThhQ/Azd+5BXNO37uAmmmTA41BqwF/aMMTyyBKefH8m8JPaTpikkFkIG0t1cwI+rpEKbQI+oG4BH0Gnhgd/ST0Eiuq6Wa6MxLW/tn6qtceXDt6r6QBzjQ7Ga/WJmDerm1h+GFFpEidvRVBjWT04EToVvL+4DrxFNQGHQi3fYsnnU8FzCO+sbwPHkRMQHbNhvOsSF9ZcJbaBhkTYjJQ1QMRqA/uhY2BTIqgEvK+4FnxFteBV1HzG8qXUdEd/VrokRfCe80MAsRgPSGETdxtzVSODjxsob0jEvAmheeH/Os+cB1tJnSS8T1ED3kJ1dEKhepnllBSVB6ngPQ3t4Dh2MgFPorCJW6W5Upv4fVwmDJl4zJtKFzZAwjnGDx4BB0KLwfsKq8FboAZvXtUpllNU");
    imageData.append("VGSF9N3jUvB0Ya1dr8P89Mz/ECgKm7jP04VlxW9g4cIa8cQXa35qCkw4r4egxeDzq8Czu9JORSPLmySqKqXgySodCMnd+FkAMBfkwEIbWPB5urCsKGziF9aEkHMcJ/j75LUfwVqoFoX35lXSBsCVV1nC8ibpUUksDk9Wae15E2Jzc4LF3Z8MggutMe7zdGFZUdjE3caOP7vOfS74O81pwjU8impReM+uCvDsVB1ieZMUbu66IgZPScqHl9Q79JVg4Yh5FKwU24uSlFWlhel/7iQ+M/33bbCU1iWs0o8XdqSklv/fxXJ+PAj2giopeHDvKL/E8iaJazbcFYOnJGXHEJn68y/Bou5zg+BBe1ycYSlJjaLrUNjQyRO8t0wjsEoHhpELgRcrdPN3sOyuEIX37CgHV27ZbZY3SQgfEIOnJEUlwkOfX7Cotf9tzKy0gYzLA95tvLgBc9c+wVyzbg8Yd5WJwrtzy8C9XeljeZPENRqiYvCUpKgwi0WjgkUtdfQokQfPZ1jcgFEldKtYJArDO5VS8DhKIyxvkhA6KgZPSWoUAWORiGBRi6YNJmTCk1V60W2MlcKMPReegn93KCXgleDKKUm/gVBjZ0AMnpLUGAJGbeOCRSmE/AQuA56sktzG3NEvmOsBXmpjrlICvhRc20rShxDfPRCBpyTlwBAK//aHYFH3p0PgqmyUBU8+70C3sX94RjAX98tNMCOsBDw4txSnv8S4gSti8JSkyG1cWLssVmTEAhYClgHvRZ835qlgZtgomGv86CmwE7gIvGtrMbi2FKW3Ub5vIwJPSYrcxqLvhtjDh4KFXWfRv7HCzASektQYuoz9+GnBHLG5ebiPh+CUhgfHZsUHLG+SqOkkBh/3eXsFnvKl74SLR2fBduAgn2EpSUnB08kTvGXfft5xFsv/zWUMnxJJeOdmHNlFxSxvkqiYC9a228Tg40nK3LQHa5mQAIDs1XX2AmbYGj5JkU3yY+HCUsxT2NiPf5QE");
    imageData.append("T+4zXK4BZyr4VxVjsGZNZt086piJwcetkl5StnfeT6qJSFQeUI1v7nkDX10NYMTPj7T38Rf2wX0T+3E+dCwD78JYzqPTl4AH56aCkyynpKjdt9AxS4KPu804lsf8aYpsImPNz/MX15xTnBo+uzBiy8rbwHKmFLX7pODJbegZSC8p6/73+HJarqicNr91gId3pYLfVAj2jfkXWL60Cmo06xDcJwa/2G3oJWWq0YP/26sZfRux2VnwfX0JhjEL2xA65ckjvCM73+/YqpD/qCdRrzIVfNxt6CVFjxEj3hvHibN8QopYx3h3om8ngtk7+NOvvHXex2/Vgm7j2J4JfAHYs/MNLJcsIfjFVPBseUBuM4olsWlXOV+YDWNtQ+WBBQclqVQ+z8I7NuYPsjyyRe9QBL+aDl7qGShdmKWFvwZq9TMsz2OJGq2YoK4/MfhX8r93vKhYnuZuXNTyRvihFYfHsFm2kxcT9SoR3rfc8PaNBd4lX9hMxRXXrad2n69QHVkyPCYp8nlbVu46dp0Vlz+vdgN1zDx5FTbZ8JsKbVQeyM6wKyEqsqjpRH0ban1Q98CdUxpw5yijrm2lUQQPOLcU3aJ6nkpiqiozLsxWtapVpdR/mHuj292aGIgAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image0b5deb68e98eb5bfd49aeb7347f34730 = new WeakReference<>(result);
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
BufferedImage image0b5deb68e98eb5bfd49aeb7347f34730=getImage0b5deb68e98eb5bfd49aeb7347f34730();
if (image0b5deb68e98eb5bfd49aeb7347f34730 != null) {
    g.drawImage(image0b5deb68e98eb5bfd49aeb7347f34730, 0, 0, null);
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
	private icons8_start_48() {
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
       icons8_start_48 base = new icons8_start_48();
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
       icons8_start_48 base = new icons8_start_48();
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
        return icons8_start_48::new;
    }
}

