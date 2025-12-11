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
public class icons8_theme_48 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image8b2655a896990002bd070636eb883b04;
private static BufferedImage getImage8b2655a896990002bd070636eb883b04() {
    BufferedImage result = (image8b2655a896990002bd070636eb883b04 != null)
        ? image8b2655a896990002bd070636eb883b04.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(3568);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAKO0lEQVR4Xu2Yd1SUVxrG3SS72Y0x2bNRoogVlRKQPkOLMbZ1Y3Y11USNxEVdYsHYokmM5GiK0axiwRY10ZWgCEgdQXoHgygqysxIGcpUygCaIJo8+95vZmD4mEHUtD94zrmHf/hefvflvc99vq9fvz71qU8/u7xzblp65jX7eeVqtwtzmpOFuc3XhTlatSCnqU2Qpf1emKWtEWQ2FntkNB5xT29aIMhsGsWv8avruQtNf/XKb17tlddS5JXb/JNXXjPoJzzZymFLC2E2rSwtCBgeGU1wT2+Ee1oj3FLqf3JJbkhyTtbMfC0cD/Nr/6LyKGx+yrugJdgrv6XVO78FtAGYhc82AZ/aANeUBrgk18PlbD2czmguupxRevH/zs8v4A8+Ba3LvApaGhl4r+CzeoZ3TtLQBtRwTFDddoxXreP/yZ9NXrmtFj4FLYneBa2g7puEf720EJsaNuFjrT8WydZgUlE6PFj3e4JP1GC8SI3xCSrQBvBMrHIX/28/sDzzWh19Cltqu8AbbYDBv3QpFwfaA7C7bRE2N8/DSvUr8Kt5Ab75oi7wrnz4MwxezcE7xCnZBvBMtHwDn+G+5ZPf4kvgTT3Bs7VSvh6ft/rhk5a38H7DbCxRzMKcqumYctm/G7xHjBbeR5oh+FIJpy0VcPhGRvBc9/FMjAL20fIf7U7XPctnuWd5F95wppnX3g1emNWI5Yq5WKt5Das1r2IpwbPuv1Q+GRNLp8D1rLoD3i1CgwkHf4DP3hYIvlDAaYMUdoEXYLdPSvBKglfALkoO20j5tX4P4k6CgptWBK3wuQs8O7SCzHrMlr4D/9oXsaBmBubKpnPwU8uehUfRXLgkKjvGxm1HHYT/VUOwVQnXTTI4rrsGmyVFsF6er4M/zcHDJqIOY0/W+vG5eqXn0vGId2FrtjH82uJwXLnijtYLT+JyvhCrsiM7HEeQ");
    imageData.append("2QDfnATMIuiZ1yfhBclETLrmC+FlAcannIZzoko38yIamY1SuARVwPmjcg6edX+Mfx6Gz0uBXWRNB/y48FqMOVlbwGfrlQj8E2P4NedO4kfJQ/jx6sO4U/xH3M77M9rTHsOatLAOu3RPVpLbxMD7/Dx4lkyAS+HrcEyKhFNCHQfvzA5svBz2H16C/Upa75bAdul5jFmYh5Fz0jBsQQpswqs74Kn7GBNWg9GhNWP5fD3K61yrAx3cdgM8W1eK3HGn5BHcuUDw5x5Fe/Zf0J7cHxcSfDq9Po0OaZICrqJaOMfJ4Bxfw8G7JKk5eM7r4xWw3XeVOp4L63/nYPT8TIx4IwVDZyVg9NZibgPjTunhT9TA+ttqjD4uC+Az9ig6sBnG8J45TWjOfwq3Cx/F7Xxa2dT91Mdw68zjaIweQpdUfRevd01WEzQbGZXRRdXp9Q5R1OXgEoxYlA6r10Swmp+E0VuKMC6sguC5ue+ED63GqP9VHeUzmpV3wY1pfMfxzG7EpTQh2jOo6+mPoT2lPwffFvMEiiN9CVpDm+h6UXXzeg5e7/WxNEYRMtidLIdtmBQ2316HzYkK6n6Nbu4ZfJge/rgMI49W5fM5zcqroDWb7zieOY1YkRzGQd8S0YofgLboJ9B26kksjzvBbYDFBHPwbHQ6Lyojr4+qhe2pam7ZnNLPPcGzubcO5UYHI49VYcQ3lXI+p0n5FNxw4sMb7FKQrkKgKBTFp73RGDEYxeG+WBYTCrezSh08zb+bOXhRJ7wDB2/s9XVm4UcRPHUfw7+ubOGzmhRB7zYFzy3ukJLLJMvhnlgL96Q6HXwaXUyG0TEHz+aeD2/k9X/fJ8OH74nx2eLzCFyWD9/tpTT33Oiw7mP44fI7fNbuAh6iXF9nKqAZp0tBRgNtRMOB6zpvGJ1OeIPjdMBzc28afmpIOXYvESM4oBRf+H+HTeRKH7whgveWYh38kQpYHa7Q8nG7id6iPIzhlx+7iIzFIRD/Kwhn");
    imageData.append("/bbjP4e/u2uuNwXfEdBMwLOxWb2iGNsWFmPrwiJ8+nYuguamYv3rcZi/II7gKzHsMG3gq3IZn7eb9G9VHPyyb86j7p8bUfPiBlRNfx/lU9dC/PxKBOzLNQvPdd8cfKwBnu6AKD088/owGTa8nYnNftnU+SwEzUvlur/mlUgEvByGYV9JYXWoHEMPSHP4vN1E43LCMDapC4Ih+8cHHHzFtHWQTl6DsonvIm72Zz3ner3XE3yVY6xy8vgkRX+7aOUUu2iFzJ4PT15vHVqJgMWp+PDNRFpnsH52PNa8GoUVs77Fm3PDYXVQgqEHy2G5//pBPm830ct4MduAkDy/dMYGAn+P6zyDZ92/OiEQ3z2/ipxGY9YuO7ye4I1r20Yqp3KOE6F3HMNFdbwSXlvOcR1f/UoEVr4UjsCZoXhnxhE4B2Vh6H4JLA9cx+B9kiXG9UyKzoBGF4sbkDRnKySTVhH4Kq7zDP6Kz1KcfnkTxWKVSXhjr7cPVz1uXNsmWjOgu11Wc3Y58msJPDbnYc5bEVg88xhmvxkKp48yYLn3Kgc/ZL8Ug/ZIxxjXMylhrrbNkOsX7svioNkq9V2OywRf4hkAv53pXXJ9N7vUez0bG+PaBD/VrNcfrcCIQ2IM318Kq72XMTTkig6eus/gB4dIJMa1zIps8hazSyHZpUeqEv670hHz6maco01EzfoY84NT4XJGbh7e2OujlVW2Mcqp7D9he6pu2riIWpkuXerhdQGNZZxOrz8k1R3aAzQ2B3WdH0wvOBZ7JB/xWU1KmN3c0PElgeUaisZuiZQkE6rhQulSB6++L683DW90UZHX6+2SDu11dmgxhOAH7xHf+dtOiRWf1aQIvIr/DcctlQ5sMhsZ9QN5vSHX3xN8iARP7xYf43OalSBLm96rbziGXJ+ganeIV250i60bOD5SYeEQqwgk+O+7eX2XaKyH1wU0lnF08MzrGTw7tAx+L4OXtPfq8BokyG4K4eDv9g2HvN5RpP7e");
    imageData.append("UdTVKpnsIhWB5uFZru8l/B4JLHaVbePX71HumdrZHPxdcr2jSHWH7PJF/vNMNtEyS4PX9x6+vBv8oN3iyqe3XezPr9+jvHM0A6jzN3vK9dwHqHh1IP9Zg2yjap8y5fXcSwmD10VjDGMBjcF/pYdnjsPgQ1jnxe0WO67e3zdS6vznLNebgufmXqT6kv+MsQh8lUmv78z1ZuClOvjdYgwMvraCX7fXYtmFXkqKTMGPF6k+ZR92+c8YNDZCPmFseO0tc/AjvtY7ziGd45iCH7SzLJhf954lENU/QeA7nJI0cjqwPziJVFn0cyL/94xlH143nHy+/t68XsrNPQe/hzq/s+xIvyA8xK/9q2jcyZoj9+31BD9ol3hHT//dX1xjTtTK78frLfaUtVnsLFvIr/eryzqsuuXudtntoioZuFPiwq/1m4jAY3qGN/L6ELGW4NfZB135E7/Ob6bhx6pGjTpeVd+z10sUNPMbhxwoG8h//nchtokRRyuPEric1m2CVxF8LrlNsOUB8ZR+QemP8J/pU5/6dP/6P08go48VuRItAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image8b2655a896990002bd070636eb883b04 = new WeakReference<>(result);
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
BufferedImage image8b2655a896990002bd070636eb883b04=getImage8b2655a896990002bd070636eb883b04();
if (image8b2655a896990002bd070636eb883b04 != null) {
    g.drawImage(image8b2655a896990002bd070636eb883b04, 0, 0, null);
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
	private icons8_theme_48() {
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
       icons8_theme_48 base = new icons8_theme_48();
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
       icons8_theme_48 base = new icons8_theme_48();
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
        return icons8_theme_48::new;
    }
}

