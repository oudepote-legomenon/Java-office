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
public class quick_print implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image99592308f5de71f53a629b270b52aa30;
private static BufferedImage getImage99592308f5de71f53a629b270b52aa30() {
    BufferedImage result = (image99592308f5de71f53a629b270b52aa30 != null)
        ? image99592308f5de71f53a629b270b52aa30.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(7856);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAQAAAAEACAYAAABccqhmAAAWy0lEQVR4Xu2d+68d1XmGaf8C/1wZyT82l7ZWSxtCUHwQSaMIkroqFYlomwNBpcURJpBCwanqpqktOYpMnWxCIOEoUJRwC0mbOFxSThyskNgxF2OUAvY+vgFtlOAY0rQqQtP97s3Ye96Z2d+e25q1Zt5HeiTreK/ZM/N931pzW7PPOEMIIYQQQgghhBBCCCGEEEIIIYQQQgghhBBCCCGEEEIIIYQQQgghhBDCc3791874DdldOd5CJOCEkd2S4y1EAk4Y2S053kIk4ISR3ZLjLUQCThjZLTneQiTghJHdkuMtRAJOGNktOd5CJOCEkd2S4y1EAk4Y2S053kIk4ISR3ZLjLUQCThjZLTneQiTghJHdkuMtRIJRkry9iNxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJww");
    imageData.append("ltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltxeuIXjYcnthUjACWPJ7YVbOB6W3F6IBJwwltzeYnjwuTUjF8j1IzcbPjByORCxrrz+LLZ5gVzD+8uC42HJ7YVIwAmT57p3n/vOz/3z9kvfTNzFqcTePkwWw4mRkSwl9t3ylNi38X7GPl9ADBALjk+eHG8hEiBJ/vLyy/4QiXX/vXdvevS7D928+/vLd+5/at8e+MLzP3k1I1GlJ8ZxQswQO8QQsURM1QGIU4ySZe1wMnpPj9ornFCyc64Mk0cTyIG1nB+iIyC4w9OH6Ag8EoCTQkq4MpzkSHyKoY4hJIaT3vzqkUsjn8wIsJRlRC4tDSe5tcB5J1pgOLmajl4ah3Iqdula5BxyDzm4hvNT1Ax28ps7e2mow3jpnyvDSW6qQ6iL4eReMXpZ7Fze4VL67MpwkrvrOa9FDqOdtWo46UHxIInun8uuiFxGTiO3V3He957hZKTHDuIdJ2UXRa73+8hgODmnxyGSRnrZV5H7qIE1XB+dZTi5VbeUsTOk7LNLwy7fYhxOHshZzthwKeVpl4ddegBpOLmwh8Mc3lApZb6ombAvGA4nh/s6x5eynKidBa6rIBhObnnwBkkpi7vI9eU1WOGMjZBSlneR68xLjh1ZWTh6+FAkpaxX1BbXm3e8eOzI8shISlm7y1xv3pGx0lLKmuR68w5eYSllfXK9eQevsJSyPrnevINXWEpZn1xv3sErLKWsT6437+AVllLWJ9ebd/AKSynr8fjRw+oApOyb");
    imageData.append("Rw8Po8PDF8ZPBHK9eQevvJSyuBjtj6wcGhX984lHgrnevIM3REo5vxjtVw5NRvssud68gzdISjnbyWh/MDXaZ8n15h28cVLKbK3RPkuuN+/gjZRSnrbIaJ8l15t38AZLKePRvlzRqwOQMkCPHVl5c7RPF3JZud68g3eClH2zrtE+S6437+CdIWUfxGh/eFjvaJ8l15t38I6Rsqvigh5e1dXUaJ8l15t38E6Ssmu6Gu2z5HrzDt5ZUnbBNkb7LLnevIN3nJQhOz0Rxwe53ryDd6CUoZk3EccHud68g3emlKHo22ifJdebd/BOldJnqz6a61quN+/gHSylj5aZiOODXG/ewTtaSl8MbbTPkuvNO3inS9m2oY72WXK9eQfvfCnbsImJOD7I9eYdHAgpXdrkRBwf5HrzDg6IlE3b1dE+S6437+DgSNmEvjya61quN+/gQElZp21OxPFBrjfv4IBJWdW+jvZZcr15BwdPyrJOHs3t72ifJdebd3AQpSyizxNxfJDrzTs4oFLOYwgTcXyQ6807OLBS5qnRvrhcb97BQZaS7dKjua7levMODraUsAsTcXyQ6807OPCy32q0r1euN+/gBJD98/SjuRrt65brzTs4GWR/7PpEHB/kevMOTgrZbfs0EccHud68gxNEdlON9u3I9eYdnCiyO/Z9Io4Pcr15ByeNDFtNxPFLrjfv4ASSYarR3k+53ryDE0mGY/xobldG+0P790X/sfOe6Nk7d0T7b7oxenrrxmjflRfMFJ/BZ9EGbbEMXm6bcr15ByeV9N+uTMR5fvnb0YEvbome+MTF0Z6Lz4oef8/qWsSysEwsG9/B3+tSrjfv4OSSftqViTg/ue/26Km/+2j0ww/+ZqpwmxLfhe/Ed/P6NC3Xm3dwokm/7MJoj1HYddHnGXcGro4MuN68gxNOtm9XJuLgvBzn6VyEvoh1wzryetcp15t3cPLJ9uzKRBwUVZ3n9E2LdW2qI+B68w5OQunWroz2");
    imageData.append("EFfh9166kCqwUMS6Yxt4u6rI9eYdnJDSjV0Z7SFuveGqOxdUqGJb6rqdyPXmHZyYsjm7OBEHV9Z9uLhXt9imOu4acL15ByeprN8uTsTp2qifZ9WjAa437+BklfXYxdE+FrfQQrrIV1Vsa9nbhlxv3sGJK8vbh4k4uFre1CE/lotbc8/ctCk6cOuW8QU5uG3rluiqDVcmxN/i/8dn0QZtm1y3MncKuN68g5NYFrcvE3FQAFwYVd176bpxAT//vZ2p74vN6wD4c7FYFpaJZfP3VbVoJ8D15h2czHI++zDaT4un57gYyopDahToCz/alfqeLIt2ANPiO/BddZ6yYF/w9+TJ9eYdnNhytn38/bu6ih+H6GXus8cdwA3X/U103bXXFOoApsV31/Vk4rydANebd3CCy7RdmYhTxjqKf97Cx9EULpweO7oSvXT8SPTSi0ej/3z5ePT1++6Jbr3lCwnxN/wfPoPPog3aznNEVldHME8nwPXmHZzs8rRdmIhTxarn/PNcOEPBjgv+zWLP8ruPPDQu+GnxN/5cLJaFZVqdQR0XNK3t43rzDk76vtvn0X7aqsU/vn/+TP79c1w/mVX0dYnvwHfx98diHas+zzCrE+B68w4ugL7apUdzq4p73mVHxvETdPfnP0GHYnz5pWOpQm1afOfRI8PU+sRinatsc95zAlxv3sGF0Ce7NBGnLvHUW9kr5rjtlnc7D/u5SuHv+t6jpw7/8W/+/3nFOuQ9oIV1L3vrEPss64lBrjfv4KIIzVdP/qKUvzjxSnTilZ9J8sANf55K7nlE4WQd8uM8HBfpuBCLiILni4BVOgGIdcq6RoBtKNsJ4FSCl8f15h1cUKEp6uPnux9MJfU84mp4VvFXHfVjZ90FqGLe0QC2pezdD55AxPXmHVxQoSnq4fXXTkZ71781ldCWebfCjh9dSRVcWe/+6l2pDgB/48+VFevK6w/LdAK4HjB9KsD15h1cUKEp6uG5vy+e7FmH/Tis");
    imageData.append("Pn7scKrIqsjFH8ufqyLWmU8Jyp4OTJ8KcL15BxdUaIrqnHzqB6kktswr/iZu7XHhN9EBQKx7HZ3Ad85bHf343yYPPnG9eQcXVGiK6uy/4n2pJJ7l+LZXxtX+JoofcuE31QFAbANvF7Z1nluEu85fHd1x7pnR4J1nRnd+aEEdQFNOT8QR1fjpQ/ekEtky6z5/3Yf903LhN9kBQGwLbx+2mfdD7O5R4d/77knhT/vY0g51AHWaNe1WVOOJS85OJfQss2514bFbLqK6fPaZp1OFH4v/48/XJbaJtzPricFvrlsd3XJOuvjh7R/4fXUAVbV+/06Up+joP77CTef9uI3GxVOnbXUAkG8RYtvjU4FHRuf5t+UUPrnINecVXHC+2NREHHGaZ6/901SRz5KfeUenXMd9/lm22QFg23jg2X/HjuiuN8/z53SZa84ruPDa1MVEHDHhlwcPpAp8lpg+y/vyxYpP+M1jmx0AxDbydn/1sgu5yC3Xct15AxdhGzY12mcpJhzc9vFUkc+S5/M3fegfu/dHj6cKPxb/x59vQj4VwC2+jCKf5RLXnTdwMbqyrYk4VeFn50N1zx+9JVXkeWaN/k0f+sdmzQOIrTofYB6zHhCCBY8CTnDdeQMXZtO2Pe22Kry8EMXz6lzks+TRH7dguVCasq0OAJOFZh2VljgKWM+15wVcoE3Y1mifZVV4eSFa5Bl3THPl9q5Gf+i6A8ibIJQlbvNlFHqefp4GcLHWadujfZZV4eWF6DxPtcXijbrTbV2d+8e66gBQ+Fn3/mf56GArF/ks/TwN4KKtqu+/iFMVXl5o4s01XOSz5Fd3u7jyP23WVODYOqYEw7zzfMtnf/h9LnJL/+4GcAGXNZTfv6sKLy80D3xxS6rI88QkmOm2iC8XT9M22QHgPL/qYIVn/jMKPc+ruf5ahwu5iL6P9llWhZcXmlmPs+bJh/8uL/7FNtEBjN8POONFoUUseBrwANdf63BRW4b+izhV4eWF");
    imageData.append("ZpH3/fGMP9eH/7DuDmCe14UX8al/38lFPssVrr/W4QLPM2siTohWhZcXknhTDRd5nrhQyO1dXv2P/Zc7vpIq/Fj8H38+T3RedRb+tLee/xYu9Fmu4hpsFS70aUMf7bPsM0Ve/MEP/+CeOBeVC7noWf48i/n9TZ+mFnwoaIFrsFVGhX6CC7/Lv3/XZ4rM/sPPbU/vN7xTn4vLhVzwLH8+ts7zfMuHP7OJi3yWi1yDrTIq+KV4tG96Io4P9pljX/lsqtDz5AuAdb7ks4go8i8MPh9t27o1+qdPfWos/o2/5XUAWFeXR60FLwRu5hpsldG5/cKsRx67Zp85fPPmVKHnyY//Vn23f1k/u21bdM1VG6ONGz6WEH/D/01/Nu9d/01b8LHg7VyDrTPaiO28UV21zxSZ/+9DB7DzW/+aKnz2kzfcEH3yxhujSz784eiajRtP+el/2Bzd/Pkdp3z4wZ2n/PGex1N5UcWCHYB/7wcYbcSqkU/yhnXRPlOkA9i2dUtC6xd56/bwyqHo+ms/kSr4aTdc8VfRH1/4gejC978/+uAFF5QWHcamv70+emzXo6l8YZe+dFtq38CMQs/Tvw4ADHvSCfSZIh3AVRuuTIjz7TL33cv6yEPfSRX8tBf/yUXRWb+zNlr7trdH569blyrqMl580UXm0QGKnfcNzCj0PP3sAMBw0gl0+nSgz4TUAdx399dSRQ8/csmfRee+4+xx4ceue9e5qWIu69KXb0vlzLSd7gBiRhu6ZjjpCJZ5B4Runwm5A7jio5dH71m3kCh8dQACnVUqSLPsMyF1APEpAM7z119w4anD/Sx1CtBjOECWfaZIB8AXue6/1/1FwMv+4iPR2b93Vqrgp/3d3/ptXQTsMxwgyz5TpANo8zZgPE33a3fdmSp49r3nnXdq9NZtwB7CwbCsCi8vJJ/eujFV6Hm20QFkPb6LTuBdf/COVOHjb/g/3sY2LNgB+PcgUMhwMCyrwssLyf033Zgq9Dz5");
    imageData.append("UeAmf/4Lzpqm+8zTT0RfvvWWaOun/3Es/o2/8efaMuhHgUOHg2FZFV5eSOKXfbjQ80xNBmroZSBNTtN15bc3b+Qin+Ui57CoAAfDsiq8vJDEYT0Xep48Hbju14EVefuu7wY9HTh0OBiWVeHlhaQPLwQZn+cfGaaWHbJBvxAkdDgYllXh5YVmlVeC4e25XNBFdD1N14XBvxIsdDggllXh5YVmlZeClv1NgLam6bqw4AVA/14KGjocEMuq8PJCs8prwWGR04AunefnGfxrwUOHA2LZd4r+LDj/MMg8pwFlfmUnRDvxwyChw0GxFFG0d/1bU4WeJ58GWHcDyv7KTogWPPz386fBQoeDYimi6OC2j6cKPc+sHwfNeirQ+jXdLtqJHwcNHQ6KZUi88cYb0f/86lfRf//ytejEKz9LiL/h//CZovx894OpQp8lPxY8fTEw6/HdPljw8V/o58+Dhw4HxtJnUMyvvXoy+ul/vTx+NTuve574LNqg7bwdQpHTAH4oCOJQf9bju1234MM/OvxvCg6MpY+8/vr/jQu4jkNoLAPLwjJnUeQ0APJRQJ8tMfrr8L8pODiWPoHRGsXK61iXWHbeEUHRuwF7/jp9FNBXC47+UFf/m4KDY+kLOIevY8S3xHfgu7KY9/0A31y3OrrlnDOjx5Y+l1p+38Q+yCjwWWr+f5NwgCx9AOfqvF5Ni+9krJ8Ke+S81dFt55xOZjzz/tz+fall90Vse8Hn/uEi56yoEQ6SZdu0UfyxWZ3AE5ecnSr8Xeevju46N5XIY+/72IdSy+2L2HbeH4Z69r9pOEiWbYLbdrw+rsU6TDN9FLB7VPhfX5dK4pSP3317arldF9vM+2EOFzlfRc1woCzbpMitvabEOjD7r3hf9K2FyXl+RhKnxGEwZsHxsrsqtrXEof+TnKuiAThYlm3R5qE/y6cCx/f9gJPXFJNg+nA9ANtYcMJP7ALnqmgADphlW+DBGV6XtsS6MDuvv5wT2LTr");
    imageData.append("nUCF4te0X1dw0CzbgtejbZn/fe1k9KX3vo0T2fQb112eWnZXxLbx9s7hiYHe+uMODpplW/B6tG3Wk4LDXQ9yMs8lCqVLRwLYlpLFD/XMv0s4eLKaJW51je3K6UCFw36oQ3/XcABlNVEABae5nhKFE/LdAax7heJfGejQ3z0cRFndkre9xqJdiM8JYJ3LbvNgct6v5/3bgAMp6/GxpR2c5IXEqUQIpwRYx7KnPVMucl4KR3BAZX1W7QQwotYxgSjrF3nxN/5cUbFuFUb92EXOSeEQDqqs1wpXw0+J6bOYQ8/LnlcU/FUbrkyIv/Hn5hXrUmJKb5aa5982HFxZv3V0ArBsR1BXB1Bj4UMVvw9wkGUz1tUJQNxlwBt18Vpt/p4sq3QA+A58V9k7Gzmq+H2BAy6bs+o1gSxx2w0FOuv2YdEOAMvCMivc0pvlIuegaBEOvmxWdAI1XDjLFMvFIfrDn9k0LmAcssO8DiD+f3wWbdC2qXUbTG71LXL+iZbhBJXNixG25kNq310Z6D6/n3BySjfWdP88BB8Y6Ak/IbIZFcf6weTwmAsndLFNmtgjhMWoUFYNJiMlF1GoatQXoiijolkY+WRGQYUi1n2Bt0sIUYBRES0OJhfOuMB8dWWgK/xC1AuKauRyRsH54vJAhS9Es4yKbO3IpYEfFwuxDksD3dYTwj2DyV0DFKDLziAuel3VF8IXBpMjg6sHk6vuKxmFW9aVwWSZWLZGeiFCYDC5nYg7Cbh2sHnk9sHkPH2W+Aw+izZoq9t3QgghhBBCCCGEEEIIIYQQQgghhBBCCCGEEEIIIYQQQgghhBBCiDb4f+TVve56PvW+AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image99592308f5de71f53a629b270b52aa30 = new WeakReference<>(result);
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
BufferedImage image99592308f5de71f53a629b270b52aa30=getImage99592308f5de71f53a629b270b52aa30();
if (image99592308f5de71f53a629b270b52aa30 != null) {
    g.drawImage(image99592308f5de71f53a629b270b52aa30, 0, 0, null);
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
		return 256.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 256.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private quick_print() {
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
       quick_print base = new quick_print();
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
       quick_print base = new quick_print();
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
        return quick_print::new;
    }
}

