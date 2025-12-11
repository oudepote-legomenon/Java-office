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
public class wave_underline implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image363920f0ae870b19f0a8dbd4a08cbfd2;
private static BufferedImage getImage363920f0ae870b19f0a8dbd4a08cbfd2() {
    BufferedImage result = (image363920f0ae870b19f0a8dbd4a08cbfd2 != null)
        ? image363920f0ae870b19f0a8dbd4a08cbfd2.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(5888);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAMMAAADKCAYAAAAYcPRiAAARCElEQVR4Xu3de3BOdxoHcAmiGyJuDUHWNRuXtKuYJVNs3UKJTRpjZ23LYk1KtDtWx21qp9vUulWritpuIiJCsVIEqevqoBiWzYWZlhiUidc1kpBELu9vf7/wavo8b3LOe5K0eX/PY+bzzzfn9+Q9OefxnvupJ4SoxxgT9VDAGFUoYIwqFDBGFQoYowoFjFGFAsaoQgFjVKGAMapQwBhVKGCMKhQwRhUKGKMKBYxRhQLGqEIBY1ShgDGqUMAYVShgjCoUMEYVChijCgWMUYUCxqhCAWNUoYAxqlDAGFUoYIwqFDBGFQoYowoFjFGFAsaoQgFjVKGAMapQoKvk5OTI9u3bX68nZ7kqHh4e9qioqL1yTGNYwx1t3759bGBg4EU4n5Cnp2dZbGzsUjieEhTo6Nq1a7+EC9/IsWPHsmAddyPnYYBqbjhvVbHZbJthHSpQoKNt27aNgwvdyI4dOwSs42527twZDufLSHp6+iNYhwoU6Gj9+vWT4EI3okMzpKSkjIHzZSQtLa0I1qECBTqKj4+fDBe6ER2aITU19VU4X0a4GTS3YcOGiXChG9GhGfbv3x8K58uI3EwqhHWoQIGOEhIS/gQXuhFuBnpQoKNNmzb9ES50Izo0w759+0bA+TIim+EhrEMFCnSUlJT0OlzoRnRoBiv7DLIZ8mAdKlCgI6r7DFaaISMj4wGsQwUKdJSYmDgBLnQjhJvhHqxDBQp0xM1gHjeD5qhuJu3du3cUnC8jmZmZd2EdKlCgI6pnoK18M8hmuAPrUIECHXEzmMebSZqjupn01VdfjYTzZUQ2w31YhwoU6IjqDjQ3g2tQoKONGze+ARe6EcLNwOcZdEb1DLSVZuAz0JrjbwbzZDPkwzpUoEBH3Azm8YV6muNmMI9v+9Qc1Wawcp6Bm0FzVA+tWmwG3kzSGdWTbhabgXegdUb1tk+LzcDfDDqj");
    imageData.append("2gxWrlrlZtAc1Qv19uzZMxrOlxHeTNIc1WbYvXt3GJwvI9wMmqPaDPzN4BoU6IibwTy+Nklz3AzmZWRk5MI6VKBAR9wM5nEzaI6bwTxuBs1RfQo3N4NrUKCjdevWTYEL3YgOzWDlpBs3g+a4GczjZtAc1c0kbgbXoEBH3AzmcTNojjeTzONm0BzVZrByNInPQGsuLi7uz3ChG9GhGSxeqMfNoDNuBvN4M0lzVDeTLDYDP1FPZ9wM5nEzaI43k8zjZtAcN4N5vM+gOW4G8/hokuZ4n8E8bgbNcTOYx82gOW4G8/iBAJrjZjCPm0Fz3AzmcTNojuol3NwMrkGBjqg+ECAlJWUMnC8j3Aya42YwL51fVqI3bgbzZDMUwDpUoEBHVB9Jb7EZCmEdKlCgI/5mMI+bQXPcDObxZpLmqB5a3bVr1+/gfBnhHWjNWWmGL7/8UsA67mbnzp3hcL6McDNozkozbNmyRcA67iY5OTkSzpeRzMxMfqebzqzsMyQkJAhYx91Yef91VlZWDqxDBQp0tHnz5vFwoRtZu3atgHXczeLFi+fB+TKSnZ19FdahAgU6Sk1NdflhWosWLRKwjruZOHHiBjhfRh48eHAM1qECBTo6ffp0CFzoRt5++205VPjAWu6kd+/eZ+F8GSkqKtoO61CBAh1dvHixB1zoRsaOHSuHighYy514e3s/gvNVFV9fXzlMbIR1qECBjm7dutUOLngjL730khwq/g1ruRMPDw87nK+qvPDCC3KYWA/rUIECHRUWFjaBC95Io0aNRGlp6VFYy53AeTISFhYmh4lYWIcKFOjIbrd7wgVvxuXLl8/AWu6irKzM5XmeMWOGHCrUYTRUjwIU6AoueDPi4uIewzruIisrqwucHyNPDyeHw1pUoEBXru5MKuPGjZNDhdqrRPXquujo6DVwfoycPXtWwDqUoEBXS5YsmQsXvpHmzZsLuYnVB9ZyB35+frfg/FRF7SMVFxcLWIcSFOjKZrO5");
    imageData.append("fERJSU1NdbtLmmUDe8D5MBISEiKHiiuwFiUo0FV+fn4LuAKYERkZKYeL+rBeXRYbGzsVzoeR999/Xw4Vw2EtSlCgs4YNGxbDlcBIgwYNxP3795fBWnUZnAczMjMz7XJsI1iLEhToLDQ09CBcCcyYNm1aGaxVVx04cGA4/PxGunbtqvaNbLAWNSjQWXp6+iC4Ipghv1FETk7OTFivLmrSpEk+/PxG5s+fL4fSvQzDAQW6gyuCWUOHDi2V471gvbrkzJkzfeHnNuLp6SmuXr0qYC2KUKC7V1555TRcIczav39/nb1WSZ1xbtq0aS78zEZee+01OVwcgvUoQoHusrKyfgtXCLOebi4NhjXrghEjRuyDn9eMI0eOyOHiZViPIhRQ4OXlVQJXCrNatWpll/8LN4Y1f04ff/zxX+HnNEN+S6odZ3WmDdWkCAUU5ObmtoErhitatmxpLy0trRM3/iQlJb0OP58ZHh4ejssvOsGaVKGAiu7du38PVxBXeHt722VT/QrW/SlZeXGjw8SJE2UJ4bZX5dYGFFAht/07wxXEVermma1bt/4D1v4phIWF7Yafxyy5qSdu3rwpy4iGsC5lKKBk+vTpR+CKYkVAQMD9GzduqIt70O+oacePH3/Z09OzDH4GV+zatUuWErNgbepQQIyn3P5/DFcWK9S3ROfOnW0lJSW1ckmD3CRr2rx58/vw97oqKipKlhNue59GbUIBNY8fP24OV5jqatCgQcmnn346Lzs7u1r7FJcvX+68dOnSOY0aNSqCv8OKgQMHisLCQm6ESqCAorNnz86AK05NUd8YqjnefPPNf165cqWjOjkGf79DXl6eT0xMzN+8vLweu3ozv5GePXuqCw7lrxFt4O9lT6CAqh07drh8Z5i7kJtv4vr163I2xRA43+wHKKAsLi7uP3BFcnd9+/YVNptNXZ7dC84v+zEUUJeenj5f3cMAVyp3NGrUKJGfr17eKbrB+WQYClj5RW/enTp1KoUr");
    imageData.append("l7tQ11B9+OGHQs6Herx8nb7Sti5BAXtCrkgBcqfX5Tvjfm7BwcEiLS1NzoKIg/PEqoYC9mOZmZlb+/TpU6NHdmqDn5+f+Oyzz9QTLtR2kT+cD2YMBcwp/0OHDh0PDAxEK+HPTV1a8d5774m8vDy1k/yWk8/OTEIBq1KL06dPH42MjLTXr18frZg/pf79+4uNGzc6TqIlOvmszEUoYKZ4FBQUvKEex6iO2KgHcMGVtaap2zMHDRokli9fLr777jv5EcQlqYeTz8YsQgFzmWdRUdHaEydOnFu4cKE9PDxctG3bFq3MrgoICBARERHigw8+UA8yU3fY3ZK/a5uknpUPPwOrAShg1aIeNhYgTX/06FHOt99+Kw4ePCji4+PFJ598Uv5qrAULFohZs2aJOXPmlG/rL1myRKxcuVJs2LBBfP311+rJ3+rtObKEUK+gjZHaS5VewsFqDgpYrWsgnjSMuuS7t9Ra8LmAOgEFFBUXFzc8dOjQ0OTk5LFyh9Qb/ryuunr1aoeMjIwXy8rK3Orxl3UVCiiRO8DT1BWlcHtdkZs2S+H0Vpw/f77nqlWr3lq/fv3UvLy8lvDnrlqzZk00/KyKusp19erVNfKZqUIBFW3atLkJVyhoyJAharsdjTWjf//+J2E9h2PHjr0OpzejX79+p2AtqF27dupQqwccy4yhQHcPHz5s4soDiCdMmKCu70F1KiN3moPM3IsQEhKibkI2vWM8YMCAY7BGZfz8/Oxy08/0jUUdO3a84u/v/zA/P78D/BklKNCdlafOJSQk/A/WcSYnJ6cZHFuVoKAg9cwiw+39KVOmrINjjQwdOlQONf6GgI+vl5uOq+A0VKBAZ4mJiRPgSmOGj4+POtM7HtarqLS0tH7jxo0fwrFGJk+erK4lQvUcHjx44AvHmHXy5Ml9sF5FsnmbO3u4QNu2bR/eu3fv13B63aFAV+p2y8p2ls2Ijo5W/4tXulnTs2fP83CMWRkZGf+C9RxatWp1");
    imageData.append("B05vlrqWSv5rCms6DB8+/AAcU1FMTIx6jEal86wbFOjq3XffXQgXtivU5RB37tyZDesqFy9eDITTu6J9e3VeDb8oJD09/UU4ravkZs8dWFex2Wyt4bTOtGjRoqyoqKhOPl+2pqFAR1beiexMaGiogLWVDh06XIXTumr27Nl3Yd2aeDSMr6+vOqP9e1i7S5cuWXBaZ8aMGaPmeRMcryMU6Cg+Pn4yXMhWyf+tEyrWvn379vNwGqtkrT/URt2ZM2eq6zuefeaVK1f+BU7jjLoAUV0eIv9V+/yIO0CBjqqz3Q1166ZuJ/5hO1pu4lyH01j1tHb5EaDBgwfX2MMJ1D3dcge/fIWW3xKN4M8ro66dEoTe6IMCHcGFXF2JiYnqGup62dnZ/mbOKbhCroD71fOVYF5dw4YNy1afOTg4OBP+zJlOnTqJgoIC9S473oHWxdSpU2PhgnbmnXfeQVllmjVrJrZv3z6pR48eF+DPnGndujXKaoK6n6K27qVISUmRfz4xHf49dYYC3Zh5NOPIkSPVkyRyVqxYsQz+rLp69eql7kUoCwgIqNGnbai6drv99oULFyLgz6orLCxM/umEeocd+nvqDAU6MXtoMikpSU7+5Hi8s5NQ1fH0f9h+cpv9ufr169dYQyQnJ6u65a+fGjFihOX31EFPd5rV/dRB8O+pOxToZNSoUXvhwoa8vb3Vg7bUwi8fc/jw4Ro78hQSEqL+935WOz4+fgWcxgr1OBj5Tfbs3dTFxcVN4TRWffTRR7KkWAf/lhSgQCdwQTszfry6ykLEVhzn4+Nj+kK+qjx9eaC6kedZ7cDAwFtwOldt3bpV1R1Yse7cuXO/gNO5avTo0ap5b1SsSwkKdLFs2bLZcGE7s2fPHjm5+E3FsXKFqPZJuuHDh6u61+DnkvsP3atzBKp79+7qMOmzb4UKPKqziaeOHt25o05W032bDwp00bt373NwgUPqmUNyE0PAsUp4ePgJOL0rzpxRr0v78beC");
    imageData.append("w/z581Ph9GZt2qROBotXYE1l3759pk6mQf7+/o6Ta6/CmpSgQBdyP2D8vHnzCtVhULjwHaKjo+Wk4gAc6wCnNysyMlLVVU+zQDUdrLwxSF2WLb8VcmGtisLCwlw6wagaITMzU33eBbAWNSjQjVx5ItatW5fXo0cPtCJ88803chLhB8c4JCYmLodjjMiV3PG/rLpkFNV0KCgoCFQ773B8ZYKCghybMV1hLcBz2rRpd+F4ZyZNmuR4gckwJ3XIQYHGfE+ePHkhIiLCrt6BrLaR5b5BlfcSKKGhoYVwJaqMWrmPHj0qh4m/wzrOFBUVBXbr1s3wcKt6/dS9e/fUUan+sEZlTpw4sUXtX8BaijpHoZ7FJP+pM+nqaR1oPEUoIKBxbm5u1IEDB9RJJXVYBv4cei4qKuoRXKGgdu3aiXPnzsnJxVwnNSolG/L5RYsWPXC2Oae+ZVatWqX2a9SFdl3gWBO6pKWl/Xf16tVC7qeIzz//XN07IWNRIP3WyfSkoYA5d+rUqd3BwcHoKJCXl1f5Q8Hu3r2rjvCMhOPMKikpGX348OHvFy9eLBTZrOr8R5782WI4bTWQPVJkBgpYldpcunTpC3VNUExMTPn7lG02m4zL34Xg62R6K34hvSi1cvIzVotQwBhVKGCMKhQwRhUKGKMKBYxRhQLGqEIBY1ShgDGqUMAYVShgjCoUMEYVChijCgWMUYUCxqhCAWNUoYAxqlDAGFUoYIwqFDBGFQoYowoFjFGFAsaoQgFjVKGAMapQwBhVKGCMKhQwRhUKGKMKBYxRhQLGqEIBY1ShgDGqUMAYVShgjCoUMEYVChijCgWMUYUCxqhCAWNUoYAxqlDAGFUoYIyq/wOwXxdjGxAmcgAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image363920f0ae870b19f0a8dbd4a08cbfd2 = new WeakReference<>(result);
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
g.transform(new AffineTransform(26.461538314819336f, 0.0f, 0.0f, 26.46039581298828f, 7920.0f, 12177.0f));
// _0_1_0_0_0_0_0_0_1_0
BufferedImage image363920f0ae870b19f0a8dbd4a08cbfd2=getImage363920f0ae870b19f0a8dbd4a08cbfd2();
if (image363920f0ae870b19f0a8dbd4a08cbfd2 != null) {
    g.drawImage(image363920f0ae870b19f0a8dbd4a08cbfd2, 0, 0, null);
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
        return 299.3385925292969;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 460.23309326171875;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 195.02362060546875;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 202.0157470703125;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private wave_underline() {
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
       wave_underline base = new wave_underline();
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
       wave_underline base = new wave_underline();
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
        return wave_underline::new;
    }
}

