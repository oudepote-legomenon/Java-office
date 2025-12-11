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
public class icons8_brush_96 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image63a673653e417986488bc9dce7e1e90e;
private static BufferedImage getImage63a673653e417986488bc9dce7e1e90e() {
    BufferedImage result = (image63a673653e417986488bc9dce7e1e90e != null)
        ? image63a673653e417986488bc9dce7e1e90e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(5860);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAAQ80lEQVR4Xu1cB3RUVRq+701mMvXNpENCMmnSwYIUQeltEQU9rrvisXdR4Bwrq7K4a18WBV2VIyqgiKso0mQJkNASiDQBIdICoSUhhVCTkGRm///ed6dcM2nArjO875zv5OTOnffm/ffe//7tXUI0aNCgQYMGDRo0aNCgQYMGDRrqwwDgO8ANwAPA48AC4ArgK8AO3q4aLiVuBm4GuhuhC7gU2J59TcPFwgb8lKgClggp7eEwZk3tGJ29tnebvbk3Jh7OvCFh9xvto9Z1shlWQ59zal/8O8ZzFQ0tQivgNsIEWn1bK2vmkcEpZ08OT3MH4q/9ncdTzfp16nfqgH/yvaCGpiMBuA/o1ktSQUbPhDxR2A1xSLR5JX4XeBro9LuyhkaBaofOfJNO2rN7gPOEKODGWDYsrS7WoPsJrwGc4X95DQ0B1Dz5gbCZf3jPAGeZKNymcknP+F/wOsCzQIPfXTQExFOEbbZn1/Vuky8KtbnUSeQoXg94k3AfDfWgHbAS6J6YHpktCrMlTDTqNuL1gA/430qDCFQ9WUB3fLhusyjIlrKzzcAtomf8b6dBxL2ECaoSbPsjoiBbyiSjDj1mvO7j/rfT4AuFsJCCe3ScZY0oxIuhSZb24HWBI/1vqcEXU4hq9RQOSakShdhS7h+YXEaYM4YDEO9/Sw0cGDy7AHS/1ylmkyjEi+GElIjVeF3gFr87avBDBtAdY5C3igK8GJYOTaszetXPBOGeGlT8mTAB1Wb2StgvCvFi+GJa5Fr12iVAi99dNVBEAouA7n6Rpku68eb0STwINu0pvDbwIf/bauCYA3QbZOlA4ZDU86IQW8q8/s5iuOZ+vDZwIWH+hQYBGCJGAdUs6B6/SxRiS7nlpqSjOKDqtTF5Y/W7qwaKFGA50D0i1rxaFGJLOaNr7GaY6mh2ovCzgQ6/u2qgwDDzDqJaPSeGpdSI");
    imageData.append("gmwuDw5KPnWtQsMNmIpE4c8CGn3uqUGFjjCd7A4Dh2v/gORSUZjNYdHQlAuPJdlzZHU1AU8QLQXZID4mTFDnVvZqs1cUaFOJ9v3f20blwCAeUa+HnAuM8b2ZBn+8RpigLnzQJfYnUahNIQr+9XZRG4xeCwe5HtjX90ahAr3YQFquV98gTFh1r7WPalGMf1rnmJ8EwW8nIRhcw4hkKnAcsJqw2Pwa4F7gGaIKkTDPcidwNvBJYBp+uR6g/f0+Yd9zTUiNaLaztaJXQn6MQYfC5oLHQbgbKHtvE/zoB1wNrCXeB20OcVCWAYcRL3DDnaV+7nosSWmW8PcOcJZdzSwbHsksJWyw61uZQQ0MUnHzrVIvUSemSv2f5mU/7By7ZXvfpMIDg1JOHh2SismSgtnXxG15zGlfnWTS50C/87w/cBHwKuB89f+al9Ij14sCbohTO0ZvlCVq0dDvE7aKIkgI4gbChO/qYQ9fc2BQMq0+KB6aUvVsakSmzMw6GqPf3i+xSBQU54GByaWDo82riLcizTOgoLs3iv0Dcf/AlPK2Fj06UHwwUf11Zj81NPEV0N0rInydKAzkjn7Ow7Dx/Yp94O+BfQOSK8Q+vtzZz3k81qDLxf7Iqyz6HLFPIM67rtU2mPU0MEfYihpPQkzP1wdUF+5b4iz1DgByV3/ncbC3D2K/yDB5Z+GQlGqxjy/LhqXV3t7aihVpdD8ZHG1aLvbx6z88zTUm3pZFmKpB4WP+FisjQh7XASsIe+jqF9MiNojC4czuk7hXUr1NUBG5pcPSXGIfkZPbRqL6oEId3cqaKX6OhD2lPD7cU7mGaut1wjbvkEcnwkxJtyR53HjX3W2UgDb63OtabyLqZtvbYcour6ePyDfbR2FChA7Cs6kOvwGGQT2oV1cWYQE0LD2/IoA2+zGg22aStpcuspdfky6jJUP19rVK+NpAAbKPusagekD/wH1jpGldUwbhcafCC2SrFnaP341tc69ttZOvKMJC");
    imageData.append("xk71t4U8sNSbzjqjnuwp+cF+wpXlcCPvH27AQaDWC6iFLWhuisJEvt0+xqNaBkSZm2Re9nQYM7G/TiKFDyYpuCpoAp4wU9Ws/raQBz4o1bdhOnKo4BvlCBc+5/RxRqxGpmWBuOEeGpRcbx3+xPQI3DSpgzQQBqGxlQBmbbVNJ9MQtA/fIleAlcOBD/o90A2mXsnuOdb9ovA5F71u/gX2BawkdoPQ8sDGPyUKFPlSegTOamrpwJ6wHq0ZsY8vt/ZNOgZq5yT2J8xDvqIwlbAHP7d8imWTKHSRGVMsv8Ig0IS2BQYBVsIZUaDIN9pHYSSSqqNu9vDsxqyjye0ieY0mxpWSPb8uxIFvDeJD100fZ8oShR2Ia6dZ8mG10BmL6uhYoD2hQzQOAtXpnRXDhsYGAfYX7qgtJ1dAshyrganOfXSkYYUo5Ma47n3Lfr4SwMPdXBSgZPDdjtEYPqDxoy6KYX1Dg7C9X1KRT7nI/d6fGnp4kKhWzW199ctF4TaVy/9h2S2pMZ4koy43kIk6o2sszmzqJ4A62tDQxjw+NYIXTKEjiO+BhRwwjkKFf2d//TJRqM3lly+ZMR5P7f8OVkNOoBn+addYtLLoYPWNMgU0UXHDBrX2M/YDzvP+7NDAZKKqnbsG6X8UhdlSThtnRIeJmp69wBMWhco58+pYfBuFqqOh0YH9hKU943cRNRJLmGce9MANbTphwnc9eqshQxTixfLle8LRE6Yr69YGAnjvdIxBFUNN1FFxloCDoOYS8Pe+6nmKIAVmib4g7GFqXxxjvOTC53zkFuox0xX2cANZLswnEHWw7kqw1TsIr7XzFM+ijxK0QA8Xz0XAB6n+51jTGlFol5q39tGj6UlX2qS2UQGjqPck2GjZOfKRROU3g/BNNxrgw8+xX1AC03Q0gwT658ycl8wbRGFdDtZlOtx9uuh45qrms6vjtovC5RwWY+aD4JqQ4vBL0LzbOZo7ZpgYCjq0BdJsFThMxWumWXeI");
    imageData.append("groUnDfJsm3qWNM6sb1mlcPVOUWmr3/C4Fes7dPmkCh8JJijroHRJh4RdU1Mj/CkKEfGmfF4GWx/wee5ggLXEzWcqw8jB36dYzsoCuhS8N2xRrTtcTN1HfpaOSR+XrXCUds6SqLHCWDeeN/A5JPiAHD+IcZMI6LAusmq2nKEyfjaELYN8TxZEADj+TR3GmmTthQvsJeIgrkUnPGMGfUzjfP07hS2Uvycs3yRctZkYAVTkQZ5B9ZrisLnHOFVR7Xjku08WYN+Q0sLvv4vyAK6nXFyNszAalEgu2bZCi6sdNSI7c3hd3/zOl7XpMuZtascdWIfX+6bayuSZVq3477WHh7QR0B11MNh5OqIc7H30YIDNF4PD31AFMQTow2ok12dnPJq8bOm8udPbIckNQjXPkleA7q+SYP57atmrJSjtv9zqf6brS9Lh6XWtA73bODIXt5HCw7QI7tu7hm2wndmTrw7nB9q5H5iVPMDb8iiBfZy2FMK8BrRdmkTrLAqbJ/2tPEnmOEl4+8wBFRFyHuHGbhgqxb3iA94tg/sFSU6ib2UDZzkfbTgQD+iqgdQQ+urVzqqZzxjwmwTDRMM7R7WqPB/+dx21ACCvqmrt+/55Y4LkYpEs1bw2b7SRfZSbH/toXBcVXRmpyfIDfoYaJ464yQ6QcIk6eiu/s6A9f8+Thjmp4MuM4YVBDRr1TpSwgAYjUJe35bqa5coGF/mfmTNh9lMK95wAHk7T8yD+jmRp2bMpjxJrSA6sN3by5mnliqnxeuJLPPZlE06aW9+gIxaCagin0KsLupzBRX6Em8xkzs+WtrQmL6GfaNQJ5Ni7O+wStvKltjLsf3hmz2niVQtfpNlzOa9YkGVRhMtXVPlrMY2Yl/mf2UrDtORQvyuSZb2bbkpsVAcAKRFJ2FADu/bW32moAN1ZDDJXrFEqRAF4cvShcoZo57kY3/FLG0/u0w5g+0znzehLU5n+eT7jKuwbdPH1nxYCbQcPbmVvA6s");
    imageData.append("qgvi9Rrjphm2gzp1pcFML321XZSnoAtzBS+kR2I4A2NFGDm1e54oyEBjMiCs0uoV9kpRCJzoMMVFSDT+rofBKvpeKcb2DR9SQVNVxvcO+OwkbMT01Z9Yh5RbmWE/L16vqdw123bMYpTooXv03rJUkGLWb8T9gbcBn/M8TRAikbATY92fPGv+TbiAs0c7HdfvFVs/se7BtkP/Vkpg5VBLJDFGzqnJdNRWZThqwPqhAxWuJ3tA558Ur9VcLnnLggNAo6ICURXeyx4juPEs0A3LvfCzF8y5ohMG+p1HLmu+VIN16L2ajRK+9eI2hUt5p5cqp7C9d0cdX1FlebOt+0RhNpewwtCn4PWneAhfD8Je0B5AQugAvTDC3m6hMwtfbLixS1jWcVAzU8ca0UKis++p25gNj+YmqCP6yg8M2lHYMA9j+8Qx4Z7o5rxJFx9VhftX6NUVRljaEX9nyAITMlh+wo9mcYOpiVYITQ0O7sb0O/gMtSmtZRqDh5lZsm0mU0dL37agNUJ9i+ZWTxybby/vmCxnT3va5DFpkanxnkDbahJCs70pwGAdPyPN3baNvJabkP2u9oQAzq6aat2GbQfn2Yq5X9A5Rc4CZ4r6EaDK6o5+yzbrQCxeqJw2q5ssmrW8/Y1HjDzRghXYcfyHXUkYRVQVc265/RwK5dUHwnlBVB3MVurRnlmmVIJJmoftNpO043wG64uzOkqRMLZTx/cNkZgPAFVGPWe4z7E9X7CQOG7uvJaIXMFnNmOyBhMl5TD7a9ZOt6BnSr3lO/vrab4Y1VFSLAsboLoCwdFiXSzG4tYRZtk2z7DlicJHPjHKQFcZbtg7Prfu5e3pCUzFAb/1/pwrD1ghQdUKCHwV937bxErZqI4wZnNNmszV1NkVUyw/o/Dee8q4SfK+8Vjz9V/NG0XBI/Pm2HB/of2mq6sJOfsvJv4+L64ALIW/ovEyYcLgPJ/9AZupI3p6kurVqGKqVzjqhvfwtFGOGagPuBm3");
    imageData.append("iWZZsA4+Ye/TPyqV4MBxB0s7n42wVYCDwF+GQLrAM+WWUt2UJ0xrUHCJsRK3WCgxVMH9iYolylnfxM/0cUbaF3MGx+Yrx3l7f+8Gj6sgpE3O5gJPEHmUMJ3seQF7wh8NK0/8oJyyW6TdvE3lue0z2UoBf2AH1oUqFmbhlC9WzoE6oxHMsaO9uQF8p4AwfwODg93pXTXUCzy4lMZ5bugYlmnUs9eVfPn07UywuR9b8TOq5x0WaSu2dWvLjgBG7/nCKrYqMPzMY0ckBCrc/hfgZ7VxYkSVWj0preT16Acc/045aQgjh7EN9H0Ohrk/e960Ve1f++Pbls0ofDRFk+NkakkRlqlDh1BDE4DHvOA7uf2J+gIHmqKlC+0nzvzHXgV7AFVLMAj7YQ84WbRAqQDVQ19rHdItzFNtfdcgT5wJS2QCnZiioQFYiHrI3ajeNMfsLbaSSPmOT9le0C5Rpi/3GQ3kl6oMO82KgcmJUVPMIyBH+FxTQzOAWTWPOgJdzveE6vl/M+eioF8cQyuise0cOGU7sW33bNtRnygnriANLQSaqncTdhwMPx7G/eRoFpDL/dCKGTRaBjP+DtaGZqvZqB2KejnQkzCh1pQttpdUZjhqrCZ2UgpstHRzxgHo5JR5TAn9iaBNJf4egfsBCpbmikfewDxj2JyLeInKpPs8AT3MF4fEWy2/J6D3ijmBuoJvlAIerrijLwtJ5PzLmu8TJ9LO5rxMWAKkFhCvigBWznrBvNHH2frI7xsaLinQlucOF4YVaMLfh2iOBlUlc7ACN1cTYSdXceFj2jLVt5OGyw+s2ZwIvEX8QIMGDRo0aAgl/Bca/S2MLx5YDgAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image63a673653e417986488bc9dce7e1e90e = new WeakReference<>(result);
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
BufferedImage image63a673653e417986488bc9dce7e1e90e=getImage63a673653e417986488bc9dce7e1e90e();
if (image63a673653e417986488bc9dce7e1e90e != null) {
    g.drawImage(image63a673653e417986488bc9dce7e1e90e, 0, 0, null);
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
	private icons8_brush_96() {
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
       icons8_brush_96 base = new icons8_brush_96();
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
       icons8_brush_96 base = new icons8_brush_96();
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
        return icons8_brush_96::new;
    }
}

