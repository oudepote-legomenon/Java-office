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
public class icons8_undo_50 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagee439967def910101f0e9291ec5b941c6;
private static BufferedImage getImagee439967def910101f0e9291ec5b941c6() {
    BufferedImage result = (imagee439967def910101f0e9291ec5b941c6 != null)
        ? imagee439967def910101f0e9291ec5b941c6.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(1724);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAE1klEQVR4Xu1YW2xTdRgfXuI1+qAhRh80xkTjgw/GSyIP+KAJsvacNUsdc0wBGWOBYRC1PZflzLquozJlYyLDKCFogIUMXM+lG+5OBm5uBosEgreRiIOByoPQ0649fl9Jl55v3QVCuzbpL/leev7nnP+v3/f7ft//5OXlkEMOOSSDRWq728orHP09q2B3HL6fFZRBhtf66bWsAWTiQVZQA4ygGKzoP0qvZwWWvic/xPLKqeKanmB500h2ElkqyI9CJkaLa3t1j++isX5HIPuIMKL2JGhirMTTF6qTLxkfa/9mHxGGU59mBW38rS0D4c3K3zESWUeE4ZXnWF67vOqT78Ne5Z9JEllFxMKpixlBvVK2dWjCq5pJTBIRtJOMIL9yM8PiVJ+3Ov1PLJa6b6N7um5YeOU1hlf1tU0jEa9qJpBIBDKWuhCUEDSXLiunVjDvH3qY7nFWAIlCeFB43efHo3Tz6Yha37hRfeCcwX3zu1HeOBwtlDqCMEFMwJ6226T2hXS/ScFyyhtwQ6Sy+cS8kEgWWBHc178ZRa7OIJa6lZPfpvueAkjjM5DOS7RDZUKgTjd+eRLLLsKISuOsGrrmGerY8rp+8IzpybgOjhnC3j9uavB7R2NlhYZL3xcPcd+oYavyh0DD+/LyjAV0/yawDu0xWHi2xNOr1/muGSCNVIu96KPOq5XNPyUlVX3gT6NAUMOwR4HufQqwU0BmzhS7e3QUIH1YqnykwNn6gIVve9bKKTxsdtRWpYU27To95f2OPb8i4Qgr+F6mz5iC+KQL/47uPnQhLUQSsWbND7czvLwBBtXw2m3DE9QKVjcMRlhRDcxaYoj42cP+4WG95uD5tBKJgxXkl1he/a9yh9kS8M+FTjbBcL5l9J6keHVT+z3g4j2F1R26q/WvtBNBWJ2KBbITrdp/1pQVMO0oVM0AXT8tllSqd4DbKraq");
    imageData.append("dh07S7qJILBTldT2BhOJiECM4ZQIaouunxZYs5CZlgJRC63YMpB2Ihau7SnsaK7Wc5NE0F9sol+3OOVSun5G2O0tt0K9foUPTDcRBCsqv7yz82dTeZVu7g8xnPwpXTsHGAtgnGmASaCXXkk1QA+7y7YOmkRf1jAEvqK10bVzBogvn/6WaoAe6t70HjHpZN3240DE30fXZjSsvNy0sv5YOJFI7EOIoHXQtRkNVtTaKz4bMWlkRf2xCGh2D12bsbBvbLkLzDnogLE+kUiRu+sqjjR0fcYCfGQViNp0xHB/ewFnrijjlF+k6zMSSyT1PhhHzq9vDpg61ru7TqE+xuc0b803JEm6pUBQ/K+7OvXEMxIOkcU13Tq05G30nowDZgJJ4GEqPufF44PdZ7Cs9Hze9wi9L2MAR9k7URNYTpgJSgIPXDjEwjDpofemHOABjpkCDFaAf7gRWyyM7kEUNmqCHrlxvsKxBLRx2i5130vfk3LgfLbM3RNc7um7Ml2g2VWAwWGLTfYBBEmsbhiK4BfQfKf8OH1HWoBE8OMB3dxcA8up1BvLxGXwjUX0+WnDjRLB7oTCRk1gOc1bJuK4XiJodugT+AEEP+GisOdFExRIpLxx2NjwxYnksTMAR9cfjZX1RyM4dqBjs6J6EX0io1osHMi6YNw+MnNo3+EAGPscxPteyArHziGHHHK4YfwPYcTn7LFGd2YAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagee439967def910101f0e9291ec5b941c6 = new WeakReference<>(result);
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
BufferedImage imagee439967def910101f0e9291ec5b941c6=getImagee439967def910101f0e9291ec5b941c6();
if (imagee439967def910101f0e9291ec5b941c6 != null) {
    g.drawImage(imagee439967def910101f0e9291ec5b941c6, 0, 0, null);
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
	private icons8_undo_50() {
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
       icons8_undo_50 base = new icons8_undo_50();
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
       icons8_undo_50 base = new icons8_undo_50();
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
        return icons8_undo_50::new;
    }
}

