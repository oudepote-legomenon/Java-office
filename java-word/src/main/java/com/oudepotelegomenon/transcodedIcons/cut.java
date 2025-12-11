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
public class cut implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageb03b78e1dfe8ba72c3a21990b348ae1e;
private static BufferedImage getImageb03b78e1dfe8ba72c3a21990b348ae1e() {
    BufferedImage result = (imageb03b78e1dfe8ba72c3a21990b348ae1e != null)
        ? imageb03b78e1dfe8ba72c3a21990b348ae1e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2344);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAGpklEQVR4Xu1aa0xUVxC2rx/tn/ZH2/Sd2L9Nmyb90x9Na1LdJ/rDFGOtVSu1VTSNbbQaayupyt7du2hVFEReCtYIFVCslmqLQdi9d1keC8tjBeWhIipYrQp793U6c/Vs7x4WXJBl0fglk1zuzs7Od86ZM3POMGXKIzxA0JlsL6mMwidqo2UlCj7jO1Zv0kJrsnykMwmimrMGZqVUS5/uqh9EwWd8B59ZVVzVh+z3Jg2SksjjMOomtdEaSMxz+bLEG+T39gA5RqUtQDKFGyQxr9WLOiAcfoe1E3OoDdYdOl707jzd/7/zw0hqRT/Rg67WKGxl7cQUGqN1tsZk9WVYrwedLWx0kw1HusnXuc1elKTS86TA6Q5+nl71D9Fygh++O4u1N1ZM5yrfgAFdo+GEkjizaIvjxcbhRGMUqmEg3w9++b3d9qd0JrF7fUl3gDq5o6JPHnGQM7CEzBAbKfiM73A2qN664s6Azix0TEsqf1Lhz6gRv8XytNZoTQPxzdtZ6954+Gxgx8lukl5+YYh8ldVAcGmrjNaFIUZmGASV1iT4ils8snN77bcI/q02WH6OLyh4gurhM4zWJgh2X17NLVm3uNlDYFRgViwfK22OBjPN9ufjTIJjzrYaqbThGum4HhhW8q298u8NIYHA0V6c1STRUV6e7/KCs39PIeQxVhffweydWrHf5aX6X2Q2ShrOwrOqkUAmwQstCZkNUmOvZ4jj4UhoDNZFrB0ZMPqH1/zWEVwus1JskooT5rJ6FGrOMg+3Yqq/uvAc0RmFYlbvXphhrHxFbxLPJeY63a19viGOKyX7dA/BZacxWOJZO0HoeVv5+pKuIBEdL/hghNWsHgUsOQ0uvWCcFHUSvRlmcBSgJJbljBMJBET/vpUH2oOBjslPw1nXs3oUsD43zNvlGKT6iXktXiC3j9UbDlEhgYDt85vZ22rc1LHk");
    imageData.append("P3oIkLut4sWprO50Q/WbMBsDhrKe4AzGb6/1wnZZxuqGQ9RIICCAXgNH/JgX0LHSNj9JyHJK4HA/xMOC6Zz9WRR8hnfXErKbpKOgQ4mY/7pMYAYJzFQma1sJ9Wb7y1EjQaE1irlzU+ukUpdPdu7oGT+s/S4/5g3Y1QgK7FZeyDV+/IySUJLRop4x/BIbDYmcyjGSQGBVC0F+CbdVpaNHWn0kt/qmLPjMElDKdwfPAmEBlqUlWWl7wkhQaHjhHRj1K59nNEg04UUqphO9GFfkp6J2ea+HmVmBNiecBEXcJsurkAxPwMgGluQ0S5uOXSRYRKaCJB/vId8XdhBaAVDh/rwEJKwkt+qS7NCh2r47ZDhxXUxIKAHB/wGQyYAYuQAj7UGB2eqAYPfMT3cEyWw+flGeif3i5RDHMFhBnyzLbvTGjMRI0OP2axQGP0tzyJUxzB4psF8Ncaz+okQWpNeT5XudZFKSoFCl2F6HmRrAmSioDk9iaU4jabniHeL4pCFBodooTtXzwpn5aXWSo0caMwnY1uewticcmCTh8FOLZCrbb4eQKKrrIwl7HOTHojbSzJCaVCQokAzsTM6ZKbbA0uw7JFwQF5CT5CSKsv3k+RASGjzvTyYSCDlP8GLnkqyGAF1OGOBwFA0SwZOeYibkcgaq67WsrZgBSYDD54CEh42JYsXSws8oCUoORWW0rGZtTjjUnO0tHS/2hCPBSjgSi3bXh1QAMcEMk+1dcAJLd5IHx0/WcaVgtmdJrDrQStr7/eRQzdXYkbk7E5DdG4ZNiJGQoDq/UTKcZTn7W+MCLFHgBzJ0ZrEbnP0Xnm+OpkQ5YLss118jkYgqGSwaIdGdQMNL9zZ7+ZO9JK3yWgRFoxAsGu/OhA9vO4D4BSTxbX5LWBJRIUPL+MWZTvevdQNDSvWRhJbxaw66QpId5hkg07lgV53beY/rnnEhEzxY5bu8eNSlDo7lYKXlLKuUtpEMxFXtwrQJIBPRUReCfKSj");
    imageData.append("LiY6cCCVtY0IktldPxg1Mve6fNAmV7yg4qtevN/Lh6iTmcjroKiSYS/o5u6sjeCCrn6A6ifmtXpGc0EXNTKxuDKdtrX8uUjJFNojJBOrS+xxJ6MO01bQmsRT4doK2DPUm4SKkLbCnrG3FXAjgcqh6cs9joH7bivIjR5QKGoObfRAnGxRdqKwswUj8ouy0XOoSbpj/D4aPUgmjh+HRg9tvf1Q0jVi6w2OtW1s621tUce4tN5mJtmf0TKtty1lXSSc4BEgbOsNMRmbodgZG0lgOZfpOMvbrI2Hoz2NeGj+YYDigf8XDhYP/D/VPEIM8R/VRCnWMI/lFwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageb03b78e1dfe8ba72c3a21990b348ae1e = new WeakReference<>(result);
        return result;
    } catch (IOException ioe) {
    }
    return null;
}


	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.03779527544975281f, 0.0f, 0.0f, 0.03779527544975281f, -0.0f, 3.6909448681399226E-5f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0_1
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(35.279998779296875f, 0.0f, 0.0f, 35.279998779296875f, 9618.0f, 13968.0f));
// _0_1_0_0_0_0_0_0_1_0
BufferedImage imageb03b78e1dfe8ba72c3a21990b348ae1e=getImageb03b78e1dfe8ba72c3a21990b348ae1e();
if (imageb03b78e1dfe8ba72c3a21990b348ae1e != null) {
    g.drawImage(imageb03b78e1dfe8ba72c3a21990b348ae1e, 0, 0, null);
}
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

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
        return 363.51495361328125;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 527.9244384765625;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 66.67086791992188;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 66.67086791992188;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private cut() {
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
       cut base = new cut();
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
       cut base = new cut();
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
        return cut::new;
    }
}

