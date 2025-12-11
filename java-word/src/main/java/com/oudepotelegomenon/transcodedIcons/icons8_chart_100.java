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
public class icons8_chart_100 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image728b9aa8a7ec5b11770706ec6344e276;
private static BufferedImage getImage728b9aa8a7ec5b11770706ec6344e276() {
    BufferedImage result = (image728b9aa8a7ec5b11770706ec6344e276 != null)
        ? image728b9aa8a7ec5b11770706ec6344e276.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(4220);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAAMJElEQVR4Xu1da1RU1xXW9Pmj/VHbdKkx1bZp0viI79YXIGqjiGJSRUEQfIFEk2CyNGp9xdQmNhpdvqJoK8xFzZJqbaKJD3yLDwiiUdcyGmAGUKNGUMBEMjO6e/YZZhz2mYE7w7137uD91voWw9w79+69vzmve84+06yZAQMGDBgwYMCAAQMGDBgwYMCAAQPqoHxv66crD7TaXpndqgp5N7vlzsqDrZ+j5xlQCSzgJ+4eaHkcXzvEaFnOBIE6zG5ZgcfoZ5sM4GLWj62W9L52iynJZpGW2c2m3YznbWZTEWOFzWL6nhNfs/fwmN0s7WKvl+JnrBapD16DXtcfoBhMlGP4mpcMKoZLlFZZ9LNBDTCbnmeBnW23SPtsZulb9hcaQybOPfZ3r71EmgXm9D/S+/kDXk1RIR6xkp4fdIBrW37FvtGvMSHyaEBVYC7jq3DV9Etqh1w0IMhden7QgH1jW7Jv8BIlSoKvZFVgDbt3Gny1yec6nzfgohBObqPn6x5QKP2aibAB638aKK3paIek9XDl309SO70Be1PYgFMxWDtz+/bhp9rQ83ULgIVPsLo8gX0zv6GBCTSZKHfsJZmpAFk/oHZ7Au9psQacCVFZy23BJUap9IzdUX8LwdAXTaegZMvvqP1NCjZzxsv8Gyg4r0+yaqzSXmwaQ/0IemDxZ23FKupwsJB9iVZgNUv9CkrggIy1Fduok8FH007WG/wp9c8TKkKiIytCRl6tCBlVVh46MoIeDxjg0r9+zsYUB0XngpRm0wH0ifpJgUJUhI4CB0eW0uMBAZYM5sQ+wang5yG4svIn1F936E4Q3q01S1kenGkiZNVXPd1irKYcoowsLQ+LHkKPa45gbsDlkvXAllO/NYecxooN+KKp8d5YfHQ5rPtbAoyPCIFh3V6AwR2eDwjx3mjD+rmJUHxsuWCnN7LOyl+p/5qioboR");
    imageData.append("SjJ+z745d6nhlDWF6bB61jgY0rEDDOzdE9qPi4a2qVOgzcxpASHeG21AW9CmNbPHQU1RhmA3JY6pAjp4rE8Q3m7IGIGjGDPiImBw547Q9o0UaL75Q2i2db0uiLagTWjbzLihskRhPBmwMUp9jRXrEk71YKxALBmDu3SCXyyZLwREL2yxZB4XZe2cBMF+zzQlucci4HA8tTVViIbWJbYZWCXgt9A9AE8uegsGRA2FyO5dhPpdDc6ZPB6s9ioouXcT0gu/gK57sgRR2k6fAhGd2kPx8RWCH5SsE1Puy1Ni1YGP0KmRnogNONbT7tXUs8mJEBXaF47t+xi+q74F8PCe5nzwoBoWXzgFzd0EeSJzLQxitq6flyj44YmsPVlL4xIQQFlmG7nzGYlDQljjObpOyUAxqu5cF4IUCKIo7qWkQ/xomDA0VPDDyYc1txhvOgWpgdKMp2h8NIcvY47h3TvzHo3T4fCoCF4yaGACRSwp3dyqr3avJ8HwHp0FP5xEMZyCIAM+NsE5cF+mXbH+xm6m0+Fh3bvKrqZuXS/ipO8rzU2sTXHah7aizdQPb8SFFI2Zo280+IIED4Z5IxUE/6cB8UQUIiXpTUieOF11USzVN/wWhJP1NmmcNIOvq0P8FeTyhTxIGDsFxselQM7+3cJxJZn9yX8aJ4jFdIrGSRPwdVOCMfXTH0FulF2BFQvmQGnhRbh5rRA2LnsXLnyeI5ynFNGmxgkiARRnar+U1G6W5lBDGqKvglSWX4U1ixeAtabC9d5D1vCmvb8YLp/PE85XgkoIwkrJTBov1cGqq/2iIfXTV0G8EUXBkoJVGT3WWB7evUMBQaTPaLxURe20LC7NpIbUS6UEQT6wV8KH7y6EoktnhWOVFdeE93xhYwXhvS2F1hLLAi5epkbIoT+C5B7ZC7H9w/i5yNj+oZB3dD8/ZrdV8iqt4MQhV+/r020SvDsjFT4/li1cSw4P7dreaEGQVnNmLxo31WAvkZKpAXLo");
    imageData.append("jyAxTIDUhRthdsZZzpQ5aTA6LNR1/MbVr+C9SR3hg1d7wKp35kP+cYcQ2M58XXZZuF5DVKYN4ZxE46YabBbpAw8GNEh/BMFzZqcXuATB1+6fw5KxcvqfYUnSC/Dl+VzX+9/fv817Z+4dAjlUShA2YH6fxk018PwMD0Y0RL8FcYpRS/o5b6P4m6z0rPnHQo/HvFEpQViMPqZxUw08IYYaIINqCeKNKMQrk/tDyqQw2aIM6dRBGUEspnM0bqrBZjFZRAMaptKCnD64HWJDe/L/kXHhIa4GH4kipE57EZIn9Kvzfn28mH9CEUFYT6uYxk014IQMNUAOlRYktm9H2L/8N640gOy1IRA/sH+dz6MoWHWtfHuu7O6wQoJ8Q+OmGuTOf1AqLQj+vZvtlpeR3drrNe/cLoNVi+bxQSU95k6cTVREEItUQ+OmGvQkCE2Wqe+al86dhu2b1gvv0/sFnyDuVdbVHfDw/tfMGRv7e53/T41zMtCCIHdtzYD8nAPC++73U0QQjassV6POxXADF8WDgUgtBTmXewQmRg2EhMgQzskvD4Ivv8jlxz5KWy3cx/1+CgmiXaPu3u3FklEHD6yCcU5qKUjSyMHw980DYMl//8K5KCMcpsYME65PqZQgmnZ73QeGWCLcoZcSMn54f5cYTk6ICheuT6mYIFoODPluCs4b8zYEV42wNuS7a7ppQwItCKuy/knjphpwpR41QA4fJ0FYCZlI46YatHz8HqyCaPr4XcsJqmAUhMWmGvLTfkTjpgogb8zT1vyY7daCOJutIB5sF6aDrWidYJQnPi6CMH5K46YKuBhnYsttZ2KhDgsSwF68gRol0G9BvMyH4N+6j04aEmSAcH1KhQSZQWOnCrBkCGI4efENapRAfwTBGUOcJeSiMKbMXgejQhwzhmP7tYd9y9pyIZD7Vv3J9XAxZXQELEp/NA5ZsDEcXosfIVyfUglBNFsGZD0TUyUI4Sol4wTDKP0RBB+bjwkL5eci");
    imageData.append("R4eGwukjjkfpudlbYGxod9ex+AH9XHPpOHuYEh0BicPCOKfGRIL58jnh+pQKCHKSxk011C9Iw8kt/giiNRstiFl6hcZNNTBBdgpCOHnxTdE4QipIpA+LrbXgvaobENmjm9+C8OU/pRtb0Liphpq8uOdYO1IhiHFWXqOOS/vbpSa7HA6PGgo52buEwASKmBoxYMRQl33tXk+G4T27CH54Iz7BoDFTHY6eVkwWYyVnwbhPbMUbrE6jqnN6QfWJ3oKxSEw9rpOw884seGlQuC4SdtCGl1iHAG1y2tdQwg4RowZKtram8QoIcCc2lyBMjOoTfQSDkZgHLqS0TUmE4SF94Oie/8G3VTeFQKlNvCeWDBTjGWaL0y6e0tarB6TNHy/44YmsulpN4xIwYJKKnN3hMCmfJ31Of5RF5Swp4SMw6bOrq8ekFfGeeG/3koHETC9M+jTnyEr6vI3JSzQuAYXdbEqhhnoiJuVjyjGmHrsHQE9s8Z4jLXrdXHkJn5o+SJQLx8YBplOCsYSYjI9J+XzjAFZSsGqgAQkU0RbsdKBtb8XL3DjALOUAQHMaD10Aije3lbNECB3FpHysEjD1uEN84LfWQBuwzUCbsGTIEYNvrWGRfkvjoCvYLBmjqOHeiG0K5oFjTwYzdGn9rhXx3mgDNuByNgpAsjbzIe4hSf3XJXCPQupAUyMTZCn1W7fA9sTWJPZZ9EybxfQR9zE/JtKaH3uVDZbLbAVjPG5XpRvUbvG3lzrTBOja4o8LUfu0wnomVtiuSneo3QTzgAengpNmKRtuZv3M6V/QCYLg072siAvOBR930G1isZpCUVAM25mYwO+tKBe8vrWYlntwUvd09KZMSwO2SZmasBWbRthk7KulF/KtxkukaOpHkwIOpJizJ6nzuiOOwM3p7aj9TRL4qIH/XIVFuiUEIsDkJZj/XEUTrKIaAt/eySKtxbkEGhityWy4j4/QNZ3x0ytq92x8m9fZHoKlJnHalXGlLnaD");
    imageData.append("0xvw28mCNE3OU2MFeBL3tnqsSoScnbC9AYpMz+KuOox7cGmmh4D6xNprfMY4Awq3/IHe77FAfRsv+wJcJ2s1m3rbLZmTcYcEzL3AhBgb/2FJqdzxg174w5LsNf6wJDuG5/BzLdIkXPgMcPiH9LqPHZQSxIBCqG8nbAMGDBgwYMCAAQMGDBgwYMCAAQMGfMT/ARkcFzjUxgLWAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image728b9aa8a7ec5b11770706ec6344e276 = new WeakReference<>(result);
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
BufferedImage image728b9aa8a7ec5b11770706ec6344e276=getImage728b9aa8a7ec5b11770706ec6344e276();
if (image728b9aa8a7ec5b11770706ec6344e276 != null) {
    g.drawImage(image728b9aa8a7ec5b11770706ec6344e276, 0, 0, null);
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
	private icons8_chart_100() {
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
       icons8_chart_100 base = new icons8_chart_100();
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
       icons8_chart_100 base = new icons8_chart_100();
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
        return icons8_chart_100::new;
    }
}

