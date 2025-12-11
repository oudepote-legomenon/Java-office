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
public class icons8_width_100 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee98ea90f03d59efcbe1edc6d8c1583d5;
private static BufferedImage getImagee98ea90f03d59efcbe1edc6d8c1583d5() {
    BufferedImage result = (imagee98ea90f03d59efcbe1edc6d8c1583d5 != null)
        ? imagee98ea90f03d59efcbe1edc6d8c1583d5.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(3984);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAALdElEQVR4Xu1dC1QU1xme5JSmPdYca9O0adJjm5zjsWnTntSqTUqICAr4IIAo8VU1VlFEUBRFISkRFST4DDFRaoiKKFXxAeEhSDVWk3h8N4AgKPIQEJddwUdi1Nv/n2V3Z+7MLqvshcW53znfAWbu//Hf75/Zmbl3Z0YQODg4ODg4ODg4ODg4ODg4ODg4ODg4ODhsgBDy5I0bN/4KnAyc2traOhiW/YBuZzcwGISmtLS05ACr4Pca4CFgGKz7Md2ewwIwfwx4dglIpATvGuFnCPj3BB1jE3q9/rcQfI4WlLAK2vyZjuMQBPBtqYpfNLfaXRSo7rNouIqIjAaDoeXKlSu/p+O1DPBuLO2TNZ45c+YDOl4V0HgLHWyNFRUVxRDyU1pDi8BjRovKx5Q16nS6O4MGDRpK68gADZ+BXe4eHWyLwcHBCyH0aVpLawDfBtHeII8eOUMO5n2Nxw/FunXr1n0IoS/TWmZAI386qLamgcyevppMnRBPLpRcUohmZGSkQagnraU14NkU7Q0WY/BrYSJ3ZRQpvMvOzs6E0EDgD2k9EdAohA7atfOQWXT9ml0K0cLCws8hdBywN62nJeDZJ+1N+raDZu+SEnYovDt8+HCuYPSuD60nQl00317RfrSeltBB716h9UR0UPRVWk9L6KB3/Wk9EUxENQIm3jER1QiYeMdEVCNg4h0TUY2AiXdMRDUCJt6xEMVRYxysNBgML8LvT9HrnRWQq8vt27d/DZ70tSdvFt45VBQLAOs/azFCbAv6d4C74XenvWa5efPmc5DfZqCByjsTNiyrp/aO9M4MR4m2zQcgFO2RbR2cavnPzgHYiLwhPz2dryTvu8B5dBzCUd7J0FFRHOOHZTGg84BuRxM6f6+4uPgtOoeuAmxEr7QYociVZn19Pc5nuEjjO+qdVMuMjoj26dPntZaHGLpHXr16tRaHrek8");
    imageData.append("ugKQTz6dny1CUU7Cz5+b4jvineDogvTv3z+4trbW6gxjY+N1crWuUbHcuK7Ri86jswF760tqe7WtvNtyr66rqxOPh4/qneDogpSUlJyDreUavdzEvJwviY9HJBnqFkGO//ecYj38z/l0Hp0NyMOPzgunGkYOXSTmvX1rviJvE3U6XWt1dbXXo3jHpCC2uHljFnF/PdwcvyYpQ9EGuJbOo7MBe0gondfO7QXmvJEJy9KIXm+gcxcJ8d83Nzcfo5e3512nFUSnayZL30uVdchaPPzPb+FncxfzVguVl7TfJs6dvR6Oe9Y/wmi2512nFKSutoGEBq9RdMbeeGehWkGQ40bHklKVmVM1tucd84J8878KEuT/T1kHhg2PtTvemSjt91Bv6JPko3eUV5Tq8ZBme94xLcgXh0+TEZ4LLcV4fS4Z/34BmbjisF3xzkZpvwMj9pCpyWeJu9sC8zIP17nicYaOs6ah1ndmBcF5d8835pnbDXkzkkzdcJ7M/Q95bAqCfQlOryXDfN4zLzf1yWBQfqOE1lDru8MLgmcdiSu2yxIc5hNLZu6oEztAFwRPIfFUsjtw2OD5ioIgZ+/Tk+GjE2V9XhTxMbl27brCcFveObwgDfXXxLMOaWIjxq4moVkt5uTFgsQflbXpjhwTuVfWp7D878hb01Jkbd6ZGE8qK2rs8s7hBblYfoVMCoqTJeQ/cwsJK7grSxwZkqmDg6J8N+9O9HBfRGZsrVL0K/zQAzJ20X5Z24AR0eTUyVKb3jm8IF8eP098vaMsicDZx9sxuWRu0QNF0tLk5+Tc6pYMP3Rf0R8pJyV9RdxdLcdPL/ioy8k+ruod7W2HCzLp7WXiccD09xC3+WTyulOKJLXG6akVxMNjsdkXHJ1I+WQ/+4JIOXRYjOqurFXO2t1EvH2XyzwKGBnTOQXx8U8gIXt1iqS0zjl53xLfKRsVfjEviO/kj0lY3h1FQlpneOE9EjAnXeEX84Igvf3ixTMoOimt");
    imageData.append("Ek8ARk34UOaRl7vlWoZJQUaPipENp3t6RpMZWy4pktMaZ+1qJF6j5JcBONq95dMctgVB0ZysY+KpnWmZu2sEmbz6hCJJrXB6aiVsmEssfsAGu3HDPlXvaG8dUhBcduLrYuI33JIEXosELclWvRYJzb5JRo5bRzyGRHVL+vivFPcAul/ISYnH5Ncg8BGVn/uVTe+YFARZWVFNpoxfYSkK0G/6pyT84HeKpKVtuiPxilxWjKL7ZGxkpqwNfpyfPV1ml3dMCoLEAbWFERtkifkErIRTYr05eengYneldHAxLB9Obd/ZJFuPt/tdqpSPY7XnHZOCIA0GA1mduFOWII5dzdheoyhIfNw2cQq0OzD1X9mKguC1lzdcg0n7uiRyI7nepFP4Yo93TApi4u6MImpOZAGZknzusZkPmb71sjg6IS0G9sfaXAitodZ3pgVB4l2nOJdgThoO9sMDk+yOdyZK+40jE0PesJxZ4nje/swvFDE02/OOeUGQZReqyIQxSy1FkdCeeGehtN9S2jufTmuo9b1TCoLEb/uFzVyr6Iy98c5AtYKMD3xf9V59a2zPu04rCLJZpyfLYrfIOrRqpTL+6NGjhf369ftHV3LPnj3pdF470uRflJsXul6cJaXbmVhTU1NLL2vPOyYFqaysvKjT6RRfNDPxs82fE/e/hYtXsPiICXp9ZmbmDsGYVJdxzZo1a+m88JrC0814kvJB/Har31rU6/Xfb9q06ZO0tDTFF83b845JQVA0KChoQV1dHT4LSrEeWV5WRc6fLVcsRy5fvhyfioNJDRCMj5jodJaXl79K54W8UHqZnD+nnjeyqampNTIycilojHOqgkDouIEDBwaWlZV9Q6+3xYaGBl2vXr0mYbxg6yEsnQDI5zidny3W1tY2BAQERAhte1l6enoq3cZe7wQWBQH29/f3f/bUqVOH6DbWmJyc/FFbLPJ5WTKdDHwEH/T/Lp2jGktKSs737dt3mmDJPaC0tDSabvcw");
    imageData.append("3smSMaGjBWmTeaqgoCAFruDv021NhP/z4MCBA7va4pB+wC6/cQdym4Z3dtH5SnnkyJGDPXr0mChYch8JfNpB3snhQNEnk5KSZsBn8wW6/eXLl6sWL168rC3GxN9IYrsUe/fu9YC8S3GjkeZdVVVVnZCQkCTI83YXjMchR3pnAQPRl11dXWdFR0eviImJiffx8QkX5B1C/kEW4Rx4yc3NLSQqKiouNjZ2pZW8/wI0PzeRgXeMRAUB78PDB5zRHfIG/kLSztmAjy5Uy9sH+IKknQgm3jERtQAfLfvLNv6EWufMwLxxw3lOsJE3E++YiGoETLxjIqoRMPGOiahGwMQ7JqIaARPvmIhqBEy8YyKqETDxrrW1dTYdJL2BXu3G/6KiohzBlqhGAF5Mo73B72iZvNuamqvwLi8vb59gyzu1h8lXXKwmgb7vinfYnjxRohCVzGeoi2oE4MWbtDew14hPtMZi4MMU6PU4jyLY8u7WrVsv3FB5CAt+s8LaBE1ERMT7glFU06+vIIS43DC+H0ThkRr1ev3dAQMGzBSM3v2J1jMDGh+gg60RB9xcXFzGC0bRLp3PcAa0qDyq3RoLCwuzBKNvyBcpKQvaHlXUTAvQxAqHhoa+K1hEzc+O0ipgL3kC/NtGe0WztLS0WDIxFwT8ESUlB4gObGpquk4LmajT6W7HxcUlCpZi4ICbfW+MecyBRTl9+nQivh+E9g3n33HPkBQDafU5jjKsWrXq+dzc3H/X1NRcNR1X6uvrm+CsKtfV1TVEsAhihZ+RR3Pgy1rWr1+fnJWVtScnJ2dfSkrKRskxw8QhwkNOzP0M6NezZ8+JvXv3/rsgF0Piuy9+JWnPIcfvBKNHtG+4EeOe8VDFMAFnxPB1CiMEi6CvYDyr4m9rax/oH74fBD38o2A8gNs+ZjwEsKKPVFUODg4ODg4ODg4ODg4ODg4ODg4ODg5G+D/gkifYZSOxgQAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee98ea90f03d59efcbe1edc6d8c1583d5 = new WeakReference<>(result);
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
BufferedImage imagee98ea90f03d59efcbe1edc6d8c1583d5=getImagee98ea90f03d59efcbe1edc6d8c1583d5();
if (imagee98ea90f03d59efcbe1edc6d8c1583d5 != null) {
    g.drawImage(imagee98ea90f03d59efcbe1edc6d8c1583d5, 0, 0, null);
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
	private icons8_width_100() {
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
       icons8_width_100 base = new icons8_width_100();
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
       icons8_width_100 base = new icons8_width_100();
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
        return icons8_width_100::new;
    }
}

