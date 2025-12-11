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
public class icons8_english_80 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagec1205d5c1f0856eea530de84e448e466;
private static BufferedImage getImagec1205d5c1f0856eea530de84e448e466() {
    BufferedImage result = (imagec1205d5c1f0856eea530de84e448e466 != null)
        ? imagec1205d5c1f0856eea530de84e448e466.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(2564);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAFAAAABQCAYAAACOEfKtAAAHSklEQVR4Xu2c+W8TRxTH879xVRzhFGcFCCT4IQhBpYI4JA5VAqkUSksvoVZNQaW0HFUFgoQrtIHEOSBpEghJIeVoQkKIYyd2fL/6jXnr2fF4PXvZRpqv9EUJGXtnv/vx7MzOS2pqtLS0tLS0tLS0tLS0tN43nbnWAcV89noHXLjTC2sON0Dt3qu+mo7ZMmuWpamd+Hq/XHeyCS7f7S3IhswCLKVgJA3nAtPw6bVJ30zCkGZOnJAaf0YSX++HG3qjEE9mjGNOtrdD5+rVrB/NC2tzAd7asg3i4+NGo2LKZN+n+0UcPm8MFRzIC5OqIcDvmsLwfDxpHCsdi8HQqVPQMnt2/tOwak0uQPymfckSGL1yxXiBlfyikVTpAEXqph49gocbNpiGkUe7d0No+HU+QHL/vn0Vo5FUqQCRun856jLJJLysr4fWOXOMfALz58PIxYssgJl4Mhdgw/aPTel2LFsG401NxhtZidHY6g2NpEoEKFIXHRqCv7duNeXSs20bzLx8abQxAsR/goEAdK5aZXqBHRoDT2NwvKGwY3ZMKmeAX98OwT9jeerwZJCwwAcfGDm0zpvHSMyk0/l2wAV44XY3+4/k1BQ8PX7cFKKdsfHNVArO3J8q6KSqSeUK8I+HEZhJ5KmLjYxA386dpvPv2rwZpgcGjDa8jABxjocEIUmoYGurYxrTLmgk+R3gt3fCMPSGoy6rscZGaFu4MH/O2bst3nXTiYSpHS8M8PyNLqjBySK+8c/ZsQzHNFQlaCT5GaBIXWJiAvr37zed54N16yDUnftUWmlwNA5bj93OB4jGu2qlaCT5ESAb60bNNOGNsn3pUtO5DR49CqlIxNROVCx7AfCmg++L2ZkCJOOdtdw0krwOUKQOzweD4s+nY8UKmLh3z2hTTE+zN5xvskMAvXfRANFSGleu9I1GklcByqjjl2LkJ4cOQXIy");
    imageData.append("f3yZeOp4WwZINtEYDvtGI8mLAEXqZEuxttpapX4/y1KHNx7xGGilANEijRMtLZ7TSHITIFI3KFAnXYrt2gXxsTFTO1GxpJw63soBkkUaxbHELo0/3cvTSHIaoEhdsaXYf+fO5Wb/FrKijrftANEijXg3w+WfWxpJdgNk1L02U1dsKRZ98cLUTpQKdbwdBUjmaUwEg2wwdkxjOGV8bSdApC7KUSddis2dC89Pn2ZEWunZGzXqeLsKEO0ljSTVAEXqpEuxTZuKLsVIdqnj7TpAcgGNBw86plE1QF5OlmIoXNLZpY63ZwGiZTS2O6DRToDSpdjatRDq6jK1E+WGOt6eBkguoPHAAVs0qgbodCnmljreLECVTaVySjXAapDyrlw59d4FyH8EqsVicHyA1WYWoNhRbTXrAF1aB+jSOkCX1gG6tA7QpY0Aq81iR/kOV5v1RNqF9ErEpViAXj1MYA8349aPymWbO+2LF7PHUSSvApQ9bGAFQq9esZ+PhVNQz20pOLEnT2O+uhWCAeHhpkzhvj54uH696YSwzk7c3FENsMS2BlPi7Vt4vHev6ZhtixYZT4NoS+Gz64XnpWLXAapQV2xzh+rsRKkGyD82s1T2GBhYYMECU5CP9+xhAaOc0ug4QFXqIri5s2WLqeNinV0ym8HdJzPG96oBYj/Eh7hWig0PQ+/27aa+dCxfblQkOKHRUYBK1KXTbPsQa+uos7I6O7zyPzbnrjzJToBkVRozqVRBv9DsQWw0ytqMhvJ9KmVbAapSh5s7vTt2mDrI6uwGB402sqtNchIg2g6NU/390LVxo6mPWJUV7ulhP6dPxbESNCoHqEIdjTWlNndwC1M23pCcBkhWpRFnBLjdyc8IxC3Q4WAKfvir+OP/kgGqUoeDMW4YiVeUr7MrVtJBJrkNEG2HxsnOzoKCo566OmOctqLRMkAl6kA+3+LHFJRVURGZ5EWAZFUaU9PTBWUq4kxBRqM0QFXqWJ3dkSOmg7I6");
    imageData.append("u/v3jTalqONN8jJAtB0aZTA8xrnqu61YkcaCAFWpC2KdnVC5OnD4MCRDoXwbm78CQfI6QLIqjbLJN1ZbvG1uNtogjd//Gc4HqEqdylIM5eSXcEh+BYg+eSPE+lZSRSbf/L5zMpWB+mvdUPPFhU4l6lidXYml2GQ0Db84/DUwkp8Bkn9tm4bQTGkaZZNv/uao9DRGdSnmhDrepHIEiFalUTr5fjc9O3s1YB0gW4pJ6uz4pRhSd77NGXW8SeUKkKxKo2zy3bRuQ5EAZXV2kqUYXkG8kmKnnJhU7gDRqjTKJt8FAUrr7ISl2HQsA5c63FPHm1SJAMm/tavRyE++TQGq1Nn1jyTgy5veUMebVMkA0ao0Yo14Y91HuQCldXbCUgypu9wZKTigVyZVOkCyCo3GXVicfYtLMaTulA/U8SZVS4DoUjQaAVJw4lIskp0f/v7AP+p4k6opQHIxGo0AZb7U1Aebjt5ky5VymI7LfxJkpnbi6/32h580sj8BI+Yk/hkZLS0tLS0tLS0tLS0tLS0tLUv9DygeRQJLwlgvAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagec1205d5c1f0856eea530de84e448e466 = new WeakReference<>(result);
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
BufferedImage imagec1205d5c1f0856eea530de84e448e466=getImagec1205d5c1f0856eea530de84e448e466();
if (imagec1205d5c1f0856eea530de84e448e466 != null) {
    g.drawImage(imagec1205d5c1f0856eea530de84e448e466, 0, 0, null);
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
		return 80.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 80.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_english_80() {
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
       icons8_english_80 base = new icons8_english_80();
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
       icons8_english_80 base = new icons8_english_80();
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
        return icons8_english_80::new;
    }
}

