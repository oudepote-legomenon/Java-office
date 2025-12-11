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
public class icons8_fill_color_96 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageda2432dc21df99aa8a0f440f1bef2bd7;
private static BufferedImage getImageda2432dc21df99aa8a0f440f1bef2bd7() {
    BufferedImage result = (imageda2432dc21df99aa8a0f440f1bef2bd7 != null)
        ? imageda2432dc21df99aa8a0f440f1bef2bd7.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(6708);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAATbklEQVR4Xu1dB3hUVRael0I6CQESEggJID30FqRIJHQEBCId6aKUD1HEgjQrHUFgQSmKIIoiKNLtZVVc0GUXRcUCls911dVd99NVuXv++959uXPeTDKTzCQxzPm+/8tk3q3nvHvvueece8flClGIQhSiEIUoRCEKUYhCFKIQhQhkGMZWwnnCevr3MkIYTxOiIBIx/nmC0PApfX0DIZYlvWipFWEhMeZpwjuEs4TThNcIW+jZTYT+hOru2XymBWB83bp1RXp6ui6Icy6z3IuWOhITXmJvZ2H4nXCCsJTy5hLCeYGeiNLfjfyjRo0SR48eFXfddZdo0KCBKvMCYR0li+T5KjpNoI7/D0xISEgQAwYMELfffrtYt26dePjhh8UDDzwgVq5cKebMmSPy8/NFixYtRFRUFBfIV4Q1VFYOL1wnSvMq0qP8Y8eOSUAQkyZNEhEREaqsFylpFZ63olIj6vAvYWFhYtiwYWLv3r2SKY8//rhYvHixfEO3bdsmjhw5YjMMePbZZ8WyZcvE4MGDRUpKChfGO1TuVEI8q6uVStO9e3exf/9+tzIh5KpVq6oy3qL0SSx/haSb0eE+ffrYjFixYoWoVKmSG1Ojo6NFdna2GD58uBTMk08+6fYGr1q1SvTq1Uum0/J9S1jsMteLMPr8il5mVlaW2Lx5s5sQHnvsMZGRkaHSvEH5Ell7KxzNR2fx9ism9OvXTzHgTcIRwqc64wCMmIYNG4rx48eLTZs22Xn37dsnZs2aJerXr6+n/4lwCJ+rVKkiBayYHBsbK5YsWeImhF27dolatWqpvK9SG6N4oysSdUJH4+PjxY4dOyQDrrvuOtV5TCVqGsGb2MNlCuwA4QddIGlpaWLo0KHiwQcftBmJKSonJ0cKS6VbuHChfPb000+LLl26yO8w2hYtWuQmhEcffVTUqFFD5dtmt7YiEnXwGXS0");
    imageData.append("Xr16cmrB3JyZmak6/yEluZTncZmaSnd6vorwkS6Mpk2bigULFsipafv27SIxMREakxg0aJAbk/Ec3+EZFuB58+a5PcfIwgjBc5e5V6iwVNUwdX35Jt9///3ikUcekbq6xVQwcAelq8szapRNaVYQvlaCwByvdP22bduKQ4cOuTFYYcSIETJNZGSkuPfee92eYcRYI+g3quNyXmlFomqGOefLtxFMwXw+duxYXeX8xTBVzZo8s0aYrydTug+UIKDnY8rhjNeBNQhpY2JixNq1a92eoQ1WWV9R2TV4hRWJoqiTyw3zjZdvMEYD5mMszJqe/jNho8v7iIg1rE0dFlOotJzhHJiOevbsKctPSkqSU5f+rHXr1qruY66LwH7UmTr6ITqsRsOBAwfE1q1bRbdu3fRF9VfCdkrfVMsbAybheWpqqti5c6eD2d5w+PBh0aFDB1k21iC1JwF2795t7xGojgVafRWW4qizaw02GsAM6O7Q+bURgTR7KM+l9PcgvktOThYPPfSQg8lFAVNVnTp1ZLlYNyAU9Wz58uUiPDwczyr8eqBTF+rwGTAEnVejAQzB242dMNt8icqVK0vzBWeur4A6DAGirP79+7s9u/rqq1U9FX490AnTyr2GOeXIeR06vmIKVNcxY8ZIOxKeY9EePXq0NFdw5voKLMRKsNdcc439PdYDjAxLCC+5LjLDXRvDNFHLdQCLpm6SwGcs1mqNwBqA/QBnrq+YP3++LAvQN2pPPPGEbn+CMnBREd64eYapCWGTJW666Sb5ZioGwYrauHFje0pq06aNXMA5g30BrKQoA6MBxjr1/YYNG/AdzNdYlKfzRl4MBBPGb4rJrVq1klZTxSAIZPbs2VKlxHNssqDrF7Uf8ASsAygDu+LVq1fb36sRYphKwEpqUwxvZEWlFMOaijAVYNHFZ9h0YC3VmfzUU09Jc4OlvYhq1aqJW265xW3EFAWk7d27t8wfFxcn1qxZYz+bMGGCPdII71Pb");
    imageData.append("+vDGVjTKQEfR4dq1a8tNGp/7YfGERVT3IWzcuFGasxWzmjdv7mZFLQooq0ePHjIvDIf6SLjqqqt0IQBvUjuvcFXADVt9wzJNw9yMxVBnEjQXmKgVI2BL0k3NeJPnzp1rb6iwj7jyyivdNlyFAUKAIwd5oWkpyyrKhYuTCQH4zGVu2mrzjvwRCcY2uB3lm+yNaWDGDTfcIKcaxQiYpHUzNaYomK7VRg4j5sYbb/RpWoIQ4DJFPkxrWGfUs2nTprmZvjVgjXiZ+nAtoRrv2B+BWlMHvkFn2rVr53AlegL2AHDWYM5GPjAmNzdXbNmyxU4DoWDxVoxq0qSJWL9+vaMsT0DZSkW97bbb7O9vvfVWueCjvIz4SJFfL0FUrmSuPxbg+36W+jSakMA7Wh4J5oXv0fhOnTqJgwcPOphRGLA+DBkyxLao4q3FXK6bKcDA6tWr24LC/gIL9/XXX19ofVOmTJF5uBkbn5Xg26ZEi3fzM8SW3BTRu3acqBTuNkL+TdhAfWzGO11eKNdqpHx7vdnzfQHcjAMHDrTfTkw/0Gzgd8DzZ555Rk5LGnMkYJTja40O3YytbFUARpfyRaTHRVx4cUBN8ePEuuKTUZli5aXVRKe0GBHmXtcL1N9unAFlSX2oUf9F48AoHhVRXMDOA41JCQJ/8T/sShMnTpTfYe8wdepU2yunBwxwYN3Ac6TDWqKbsTH6EEIjBRQRdmFLtxQpBIXjQzLE1KZJIjHKbYp6jvrehjOjtGmwYTpf5Fvry+LoLxBvhKlG7Q8gCKiX+KymE6wX+B/7DJ5fByym7du3l2lr1qwpVWP1DKNWBRngjb+5dbL4QRMC8NXYLLGgbbJIjrYFgQ3mWlcZRWSMMiyjG4Z3MJivAyYKqJa69qLsS9C0lHCKagc0K2X+gLFQTW0K0JCUsAfXjRdfX13HTQjAFySIWc2riMiCdQJqbCfOoGDSFMOy/8MNyDsZTGDOVgzs27ev9DnA1I3/oR3x9J4A");
    imageData.append("gal9CGxUPNwFIyvBGmWtq0eLMyMyHUIA3hpSS3RIjVFC+JX4MpszKhg0iyq7gDcR2gXvXGkAmhH3LeCt5Y76wgA/dseOHe28kydPdhs9GHG1aJrC85pxkeLlgebizPHd+DpibqtkER5mt2W1K4g7a1g35TQwc+ZMR6dKE9gHQN3FAoy/usnBV4DhGMFqWuvcubPUstRz2KdatWopn8VFhokne9VwCEBhe/dUER1hT0lYFwJLVOg96m2BWZl35o+MO+64wzYUXnLJJVIVVs+wOF9xxRXyGfYGm5mGpGN/3zRbCMSyOZyHxSUqz1iDQqGT69HK5RkYEdg9Q9uB5VX3GXsCtC2lzmKzx12lKuQFU83qTtUczFfYkZeqpiOsCe05M/0lONx3o2LsUO+8805Hw8sj4A8OD3O39SA4oCgNCYuzCmvBHgOWWf35jBkzTLMGPb+/S3UH8xWgIVn1niYeRnCm+ko1DfNghfTh6r7d8gz4mNFmqIi3kC6/r3eaiLdsPHjG03MgkEAtzpiW4FHTn8MYCCHgLV/vRQjfjKsjLkk0o8aJj+M5Y32hTMp8DgVAVy6um7C0AQMbmBNFzN/Vo2DBfKJnDVtnh92I5+PAvK8CgjESeP+nT58un0WQEPR6dGA3rY0Cvwjx+W8gM8zJ0AR4A8sjoBVFW4Y8T3M0pgzJNFrHfJlKIQRYdJEH3jx91wwoAaXERIgvaWPG6/t+Ql2RGmua0YmnLTmTC6N+qlI9kqE8A4c1qlt+hYmNEx3MUMCUhDQwyCEggJfDAXM6IriRBws0+AGrK/esrbjUKXBgcpNEJYC5nMleiTLsRSbE/vMGlUfAn9CoUSPZ0a7pseLb8U7TgQJsO2MamuomDHLQfHh5HJgBVPQ3gocR+WcxHjYwyasBWfGOugCsEVZaRIz7RJTW+Ccy8SFXHoE3EuYHtLceLXqfjvZsMtABAeVlmGcJMmh982WUw17EjmJhXu9AaI7/s5OjHPUA2D1b");
    imageData.append("6U9xRnujJGSA1sMbUd4AvzLOKKC9WAxfGeTZVOAJmLNbVjNNGRBgYZF5MItrx2N/Jh4tdBUchYKmKE0VvA7g8zH2aPm+gMWFkywQGxHekPIC6PIIQVR+AoUm9BaezM9wMMEbPhiRKTITzDJgyvDkx4DqnZiYKIO6CCeIP00Yv5LxDOZpXj6A0aYJzidCvL40dPHGlAfATgNmoY1QN8eTIPY+95yob1k2k6LCpcrJGeENcLQo2z78GXpdiKTQorp3gjecWS5rxkC9vGwFpf66fDygjkXgS2TQPUblAYj7V1NBleRksYEW0NNffCFx4qOPRK4VC4QN0vKOnrUSTzjcPx1eMJkX4Y2oC2qqNsLuAVs4nyyqjDRw5vNyASz6llnid5f3MtyJEu9BoQgZ4UwoK0DNRHAX2lWHNJLDr79uM1/h1GefiUH5+Ypp0nPFGeIND19u2m8wquBv1hbcRZw/jBKQDjttXiagrQH/4hkLo3HI1LJlSwcjygLQxtRZ4Makk7926pSD+Qp/O39eDLUO8gGzW1RxMMUbluTYJ+8VcLdFUQRbmYiNDHOUB5weZr40hukx85kwrL5DxuLY2AMJqH9K08lu0UK8cfq0g+kcEEK+Fv12XXaSw7frCfBuxUbavt6tLt+mDLlmxkZ4FsALA2w19DjPWBRJx0tZjgJ4vXBuQLajdWvx5vvvO5jtDX///HMxouCEjLi2CCEgHigtzp7z97t8t2DGIw+cNbxMYGee2X7CPp6xKMLcJiPc9JC+0gKMXyoAq22HDuL4mTMOJvuCadR2JQSElXgSwnvDa4vMyvacj5gff0LXC1VDoQxY5eLWL79pBDLHxMRc4HbxYAJOdxWUm0Mq518+/NDBWH9wG2k0KsphfKPK0kimGHR2ZKZokGSfbf6zy/8QxDTkrREb4WA+MKel6RegdPN4Rp+IMm9GAXgbS8M0gTcfNhrU2SU3V5w4e9bB0OJg2bp1tmaDGFBskM6NzhLNrN0w");
    imageData.append("4aSrePcOZSJ/RoLnnfDoBqbdidJN4Bl9pUpUwAsoBJpIMIWAHa4yenXLyxPvfPKJg5ElwaYdO+z7JBD72b4gnAR2nRTecR8JYfjS+cKZD3SvZd9f0Ztn9Iew2zsebCHgNAvqqJ2VJTdWnIGBwK79+0WSNcIsnHUVfp1CUdQM5TT1YoxT9iZXAEIYqygh8JC+QGHp0qWysY2zs6UWw5kXCJz8+GPRNidHMf889asO76ifJK/wyakR42A+APuUJQBuQyoWBVUIcH6oQ9dQIQMthL/STlmZK2jH+zX1pyHvYDGoL8rrmRHnYD4AE7klgHo8Y3EpqNMRjpeq8wHYTGFTxRlZHJw6d070sU7LEPO/o3405x0rJo2UbaWFnTMfwMEPSwC1eMaSkJsQ9CCmQABTkQo7HJifL5nHGeoPMJIGDx+umP8jtb8d71AJ6FqUO8mLG7RBkj0CGvGMJSVbCDCS+XLNjD/ASFAaS9+BA+X0wRnrK0Zbx1OJ+T9RuzvzjpSQ5EWG3mxOcJFaAujOMwaCsCbIuCHcWuKLa88f3HffffY5gMt79SrWnuCamTMV83+h9ubxDpSUqOylKH9RO8+W1ykFTvmAhSlywu1Zp1AJYioLOyJUHCDUBOHjKL9dx45+2YPmzJ+vmI8QwaBcdUzlb0Md3gK0/tTVdsrv5nkDSamGdiDbn4uXfAFOv6gLN6Civvruuw5mcyyhPYUV8XyB2jeSNzhQZFh3HnnzwsHjZgngY5430AQhnERlOPern/UNBOCQUbvkujTSnj9+3MF0ha20HilNyhXkAxOGNQV7OzsAkwcCBgwzUDfo1+VgYZY33sKRHWhfwp49e+wrDDIyMz16xXYfPCjirHWDsIo3MNBkmL9vIB0vnPkKKQXRcaVy8BsOiv2oEMYvXLbBGVkSIHwEV9qgfJgs3nzvPZv5L544IVILLnB9zBXEUyoWUTXmAcV/jPMeDFarYC+QzgsIFoUb5h1ych5GXH1RYeH+");
    imageData.append("ADtmFYyFnS02a7AdNWtpnmQxzBvVS+MK40KdMQq1rdAXSp/BCwg2zTSse4Ly8vIKPcnuL7ADV9rRjDlz7F2uYVo2S+smdax7omq0Z1+AAtyVlgA8hbUEnRDo+x80oFmzZgHdK+C6fHW2SyIsDJEHDXgDgki4jkekxXkXwEcj7Wudv+GZS5NaGNZiBSMej7UvCdRtKIYZd9OPVxxkkiEpOIvgLSAY58ms9h3lmUub0qkRb6MxgTptg/h97c5qHA0tdTKsILa3h3gOiVRBwJR0Bs9bFoQYmqfQIIT84agPZ6o/GDdunGI+nCpxvLLSIKr7UbQB54Q583HrCp6FmYG5paKC+kI4fbPMYpy83LU4GhKCBKzQQUw9l/FKSpHwg0YXEP+5pnN1cX5MljjSP12MalDZPrhNaabxTOWBcGu6/DGgrl27FhoezoF4Ie2WrTKZehgtVC8UAyKi8VNe5Zbwow7ygicE3apf5SgMOBOgXcR6hMqI5oWWEQ2j9rxrmD/B8p5hXo0ZMC9YMAm/zCR/PwCLM04fejpQjXsdcMRUCxfHXT1loldXRIINaZ8auvCyYfd89913y19hQrSyulbMMDd2d7lKwbB1MdJQg/3GDMNhVxE//haikhMMaD0NU1PCCUT8CtMy+q4FTxiiEIUoRCEKUYhCFKIQhShEf1T6P37gvKPA7hqYAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageda2432dc21df99aa8a0f440f1bef2bd7 = new WeakReference<>(result);
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
BufferedImage imageda2432dc21df99aa8a0f440f1bef2bd7=getImageda2432dc21df99aa8a0f440f1bef2bd7();
if (imageda2432dc21df99aa8a0f440f1bef2bd7 != null) {
    g.drawImage(imageda2432dc21df99aa8a0f440f1bef2bd7, 0, 0, null);
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
		return 96.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 96.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_fill_color_96() {
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
       icons8_fill_color_96 base = new icons8_fill_color_96();
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
       icons8_fill_color_96 base = new icons8_fill_color_96();
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
        return icons8_fill_color_96::new;
    }
}

