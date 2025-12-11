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
public class wordPad implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagea52bf5d3822110c8a629125297f3f037;
private static BufferedImage getImagea52bf5d3822110c8a629125297f3f037() {
    BufferedImage result = (imagea52bf5d3822110c8a629125297f3f037 != null)
        ? imagea52bf5d3822110c8a629125297f3f037.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(7092);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAQAAAAEACAYAAABccqhmAAAUkElEQVR4Xu3de2xU55nH8UqR0FZdbdRoFSlSpEioq1ZatVKrlXal1XYTUUggQJKSGymNQ7ZZErYUkm4Sgw0EyiUYEoy5xoSr7za+YGPHGBtsY4MxvoAv4AsXg7kUEtN/9n/vPJ4M8/C8Y8+Z8Zz3PTPv74+PIr3MnHM8Oec7t/ec+cHo6OgPAMBOygAA2EMZAAB7KAMAYA9lQIcP99Rkfrj7eObYfwFs9/2xII8THZQBHWauyO2a/mn2KAD40TEhjxMdlAEdXvms8Kx8AABsRseEPE50UAZ0QAAAHoUAAFgMAQCwGAIAYDEEAMBiCACAxRAAAIshAAAWQwAALIYAAFgMAQCwGAIAYDEEAMBiCACAxRAAAIshAAAWQwAALIYAAFgMAQCwGAIAYDEEAMBiCACAxRAAAIshAAAWsyoAs1Pz2+UDAGAzOibkcaKDMqDDm+uLa19eXUDVA7AeHQt0TMjjRAdlQIfBWyNTBm8/AIAA3zEhjxMdlAEAsIcyAAD2UAYAwB7KAADYQxkAAHsoAwBgD2UAAOyhDJjQde3eP7YN3Hm6ffDuUwCJrrX/9jPyGDBFGTBh4ebyozNX5I7OSgFIfL59vWt3Rdt78jgwQRkwgQIg50YDJLIdR88vlseBCcqACe9uQQDALrvK296Xx4EJyoAJCADYBgFgEACwDQLAIABgGwSAQQDANggAgwCAbRAABgEA2yAADAIAtkEAGAQAbIMAMAgA2AYBYBAAsA0CwCAAYBsEgEEAwDYIAIMAgG0QAAYBANsgAAwCALZBABgEAGyDADAIANgGAWAQALANAsAgAGAbBIBBAMA2CAATbwGYkZxzb1H6sepP99Ye/PNXNbmR+DizNmvZruNHZqXkDsvlgj0QACbeAvC7jaXn5d8QqXU5p7+QywV7IABMvAUgo6w1Wf4NkWrouvEL37JG5LLdNDs1b2jh");
    imageData.append("lvLGBZ+Xtvx+U5mVktKONr+xrviifGx0QwCYeArA7NT8oda+21Pl3xAN39/dKJfvpm0l5yYdrkRwvv/OM698VjggHx+dEAAmngLwQUZVpdz+aG0pOrtGLt9NOXXd8+U22Mr0qwAEgImnABw4fuFduf3Rau65+TOdHwYeqrmYJLfBVq//5QgCMIoARIRe/vfe+PZxuf2T8c7mo81yPW5BAIIQAD9lwIR4CUDy13UH5bZP1u6KtqVyPW5BAIIQAD9lwIQ4CcBIYUPvPLntk0UfSM1ckXsnxPpiDgEIQgD8lAET4iEAv11TeFlud6x8sK2yUq7PDQhAEALgpwyYEA8BWJPVkC63O1YOn7iYNCNZXWesIQBBCICfMmBCHARgpP7i0C/ldsfKtbt/e2zOyvyhEOuNKQQgCAHwUwZM8HoA3t5U1iy3eSJHGi+93D/83Q/l+ETovAK53ljLO9Xzulyvrd5cX9whHx+dEADG6wH48kjLKrnNE8koPZd8LsLZguVnB56f7vLU4NWH6re3Ddx5huYfnOkdthL9fyk+fXmOjldcE0EAGC8H4PnlOfcinfr70Z6aghPt1/5VjoejY3bazBW59DdZi/5+HZ+3hIMAMF4OwHtfHjshtzcc3452j77fl+PhrM1qTJfrh8SEADBeDkCk8+fpw0Lf/UaW7jp+RP5bOJXnBp+jaw3IbYDEgwAwXg0AnT57KcKpv4ETfOhsM/lvTtCpunI7IPEgAIxXA5Cy/2Sm3NZw6BuD7+8/UtJ0eY7893A2F57ReoYgmIEAMB4NwEhpU98sua0ToU/X6f1/YBkrD57aLW8TDn1SzZcBiQkBYLwYAPpEXm5nOPR1IV/Gq2uLeuRtnFi4We+FQkA/BIDxYgDWZjdGPPU3Ke3hy/+AkarWwefk7cLZWX7+I7k9kFgQAMZrAaCX4HTNPrmdE6GX7qE+wf/scMN2edtwaLLO3JX5V+WyIHEgAIzXAkCfxMttDOfrqo735XLI");
    imageData.append("a385EtXbgPe3VVbLZUHiQAAYrwVge1nrx3Ibw5nglN6o3gYcPtGVFGJZkCAQAMZLAaA54nSRDrmNE+kZuv/EC8tzxr2ox4bcpjR5n3C6r99/4sWUPG3XCwS9EADGSwFYsqO6VG5fOJmVHX+Uy+Hmry/pkPdxgi5BJpc1Wb7AjZmdaqe5vr/dF1blcdENAWC8FIBozpmnaMjlcPTh4Onum/8s7xcOTUOeHsMzBOkXjS5c+etTF6/ee5L+a6Pua/eeOHVh6Jf02Yx8fHRCABivBIA+ee8b/u7v5fZNpGPw7tM0ZVguS9pU0LxO3teJeWuKLstlRSuWv2kQ70J8ZasVAsB4JQDL99Xtk9sWTu7JsWdpZVkSXf5b3teJT/bWZsllRYt+0FQu31amz7lAABgvBIBeptOFIuS2hUNn/cllhTJ3VcHVlsu3/kneP5xvWq/8x/QYvQ1AAIIQAD9lwAQvBOCtDSUR/+LvldsPprzkO7Dlssaz4+j5iL9eJLHaWRGAoFg9ptFCABgvBCCaGXvZtV0LIrm6zJ92Rv4NA1mfezpNLisaCEAQAuCnDJjggQCMNEY49ZfQZwYhljUu+gEQmuYrlxMOXWQkFmcIIgBBCICfMmCC6QDQb8bLbQpn4NbID6P5ielo3wbQb9vLZUUKAQhCAPyUARNMByCjrDVZblM4RY2XXpbLccL3tzbKZTlB4ZDLihQCEIQA+CkDJpgMAL20jnTqL6H7ZNV2Lciv733dqbyTPa8XNlyK6vcF6XLWE003dgLzAIIwD8BPGTDBZADorDu5PV61KH1yZwjSTi+XaaOua/ee1HEJ9okgAIzJANCzstwer9o7zinHERih8xLoK8/5G0o6bETToU3/LBhBABhTAaAz/wZvP5git8ereofuP276F20gNhAAxlQAUg+civiqv6Yt3VntaOYheBsCwBgKwEhFy8Bv5LZ4Hb1lCfG3QJxBABgTAYjmqr9eMHhrZEo08w/AWxAAxkQA");
    imageData.append("NuY1bZTbES9o2rL8eyC+IACM7gDQd//RTP31CvrBkhnJ2ZOeGgzmIACM7gAkwvfh9HWe/LsgfiAAjO4A0A9vyG1w4uqdvz3W2H3jF829wz+btJ6bY/+V63Bq1aH63fLvgviBADA6A0Dfo7f2354qt8EJF76CG6EpwnI9TtR1Xv8Xun+IZUIcQAAYnQGgg1iu3wmaMOTGr/V8tKemQK7LKZrRJ5cH8QEBYHQFgC7eQT+4IdfvREF97zy5vFigqNBbC7k+J7YWt6TI5UF8QAAYXQGgy3fRefxy/U7E8uKcHEWJLiwq1+cEXWp8diqmBscjBIDRFYBorvobEMm1/yK1Yt/JqLdr4RbnPyU+f31JU/mZ/mkVLQPPlp8dmGajynODv/YF97V5a4ra5eOjEwLA6AgAfW9e1tw3S67biVLf/aa7+IEbXfu/f/i7qF6ZfHWsfcJfJeI+3FNzSN7fVr5wHpePj04IAKMjANH84m9ApNf+i8axKM9LoF+7oWsNyuWFsmRHdZ68v62S0spq5eOjEwLA6AjAmqyGdLlep3RcPir1YPRnJi5z+NsECEAQAuCnDJigIQAjDVFO/fW9Z3yO7h9imTE1mZOT6PcM5fJCQQCCEAA/ZcAEtwMQzVV/A744cnaVXJ4b6Hp/FBu5fieu3nnwmJM5CghAEALgpwyY4HYAdle0LZXrdErnnPsNuU1pcv1O/W/miVy5PAkBCEIA/JQBE9wMwMwVuaN0KS25Tidovr7TD9higa5ZJ7fBqSMOLlOOAAQhAH7KgAluBmB2at5oa9/tqRSBiNz49nG6ZJhcnpvoq0o6N4DWrWzPBC75br/vm8735PIkBCAIAfBTBkxwMwA0027OyvyxEEQmn96XK8tzE23rrJTciLeXbk+vdOTypKW7jmfLx95W72w+igCMWhAACPqf7d8UysfeVm9vwisAogyYgADo4XuVcOWPvgj8aWd1Hr0dsBG9ClqUfqzM9+ruinx8dEIAGAQA");
    imageData.append("bIMAMAgA2AYBYBAAsA0CwCAAYBsEgEEAwDYIAIMAgG0QAAYBANsgAAwCALZBABgEAGyDADBuBoDm1y/4vPRUUtrRWoCAF1Py+uW+ohMCwLgZAJr+SmfMyXWC3f7wRUWV3Fd0QgAYNwNApZfrA3h/W2WZ3Fd0QgAYNwMwKyUXAQDFonQEgCgDJiAAoBsC4KcMmIAAgG4IgJ8yYAICALohAH7KgAkIAOiGAPgpAyYgAKAbAuCnDJiAAIBuCICfMmCCmwHAPAAI5YNtlcVyX9EJAWDcDABd/DG7tuvNus7rv6ppu/pvYLe6juu/qmgZePbN9cVNcl/RCQFg3AwAgBchAAwCALZBABgEAGyDADAIANgGAWAQALANAsAgAGAbBIBBAMA2CACDAIBtEAAGAQDbIAAMAgC2QQAYBABsgwAwCADYBgFgEACwDQLAuB2AVYfqR2k93dfuTe2+fh8sduX2gx/l1/cekPuIbggA43YAtpe1XpbrBHs1dt14Te4juiEAjNsBSCs4839ynWCvus7r78h9RDcEgHE9AIUIAAQhAEHKgAkIAOiEAAQpAyYgAKATAhCkDJiAAIBOCECQMmACAgA6IQBByoAJbgdgU0EzAgAPIQBByoAJbgdgz7H2NrlOsFdjN+YBBCgDJrgdgCU7qkf3V184sbuirQ3streqo2FtVqOyj+iGADBuBwDAaxAABgEA2yAADAIAtkEAGAQAbIMAMAgA2AYBYBAAsA0CwCAAYBsEgEEAwDYIAIMAgG0QAAYBANsgAAwCALZBABgEAGyDADAIANgGAWDcDsAHGVWjWbVd6ZmV7fmZlR1gsf3VFw6szz3dL/cR3RAAxu0AZPsOfrlOsFdj140X5D6iGwLAuB0AeuaX6wR71XVe/63cR3RDABi3A/B1VUe2XCfYCwEIUgZMQABAJy8EYGf5eQQgAAEAnTwQgD4EgEEAQCdDAeh7Y13xqT9/VbN7b1VHktwmU5QBExAA0ElHAF5Y");
    imageData.append("ntNFB/yK/Se37q++sODUhaGfy+3wAmXABLcDQN//ynWCvVwKQN+Cz0urPtpTk0nP8Of77zwt1+tFyoAJbgcgp657i1wn2CsW8wBmpeR2zt9QUrti38mth090vVF/0ZvP8OEoAya4HYA1WQ03m3uH/9P3MmyO738UWKyp5+a03RVtxXIfcaBv3pqiJjrg933TuaB94M5Tcj8eT2v/7Wd6b3z7D3LcC5QBE9wOAECkZiTn9NJLejrgs2u7XvWF46dyvx3PwK2Rvys/O/DspoLm5EXpx/Lf2lByvGPwruNg6KQMmIAAgAeMfUr/6d7ajIM1F9+K5D18z9D9H5c1903bWtyy7L0vjxW98lnh2cByaZm9Q/cfefY/fOLiG5mV7e/K5ZigDJiAAIAJL60qaB17SV/dueBM7/BP5H45nv7h78ae4dflnF6zOKMqZ+aK3C65bEKvIC6Jl/5FjZdm+v6tb3tZ62K5XBOUARMQANCNXpZ3X7//Y7kvhkLv30uaLs/YUnT2kz98WVEyd2V+q1yeRAd/383vfsSXQ8uYnZrXTv+OqcAMAgC60Xfzcj8MoGf4ynOD/74ht2kVHfDjPcOPJ9Qz/xHfM//s1Pyxg58gAAwCADrNSM7u7bxy90m+D5b63sNvLjzzCX1oxw/USIV65vcf/P5n/gAEgEEAQKf560tq+f6XVnAm2TfeJ28XqVDP/MWngy/7OQSAQQBAp9QDpx6ZGEYv8+VtIvW7jaXHL9/89pFn/vEOfoIAMAgA6EQz9wL7Hj1j07x9eZtI0MEvv+qb6OAnCACDAIAuNMHn7KVbUwP7Hn1/L28TCTr45Xt+/8E/8ecICACDAIAuNH+f73uf5zenyNs4RQe/0/f8EgLAIACgy/J9dVv5vvdfX0T3/j/Up/2lTX3Twj3zByAADAIAumTVdr0a2O/oQzunByw3/qf9zpeFADAIAOhA7//5STkVLQO/lrcJZ+w9/3Co9/zhX/ZzCACDAIAO9MzN");
    imageData.append("9zuayy9vMxG6vzytN9Jn/gAEgEEAQIePM2t38v1uYQT73fif9kf2zB+AADAIAOjAv/8fvDUy5eXVBQ9P251IqGd+fmJPNBAABgEADfr49/809z/EbRTjP/NH/rKfQwAYBADc9uraoga+z30//1+5HRfqmX8yL/s5BIBBAMBtqQcfnf8fbp8b+55ffNofyff84SAATLj/GQCTxc//p2f1OSvHP5DH/55/8s/8AQgAgwCAm+gS3nRl3sD+Vn6m/1l5mwA6+OmCIHz/jPXBTxAABgEAN8nv/9dmNa6Ttwnczu1n/gAEgEEAwE30az18f6Mr98rb0DUC5Xt+upLPiyl5nfK2sYAAMAgAuImu6x/Y1+gS3vL8/7FP+yM8n3+yEAAGAQC30PX/mntuPrzkNx3Y/N9Dze0PdQ2/WEMAGAQA3JKUdrSC72t0ae/Av4V6zz/ZGX5OIQAMAgBukef/L9zs39dCPfPHYoafUwgAgwCAW/j3/zSll67xT1cFdmuGn1MIAIMAgBvo+/8LV/768Pr/eSd75tIv/EZy9V63IAAMAgBuoB/m5PsZvRo41xecEER0vuznEAAGAQA3yPn/koln/gAEgEEAwA05dd2vyH0tIJYn9kQDAWB+v6msSj5AAJPUV39x6OdyXyMmn/kDEADm0721GW9vKqsAiJUPxfTfANPP/AEIAIBmXnjmD0AAADTSNcPPKQQAQJOisbn95l/2cwgAs/pQ/UY6RfO/twLEzqL0Y/l06e/nl+f0ygPQNASAoXnZ8gECSGQIABPtDzQCxCsEgMFEILANAsAgAGAbBIBJSiurkA8QQCLbXta6WB4HJigDJizOqMqh32kDsMFLqwpa6dRkeRyYoAwAgLuu3nnwmBwzRRkAAHsoAwBgD2XABLpSS0ZZ65IdR88vBkh0W4tblp3uvvlTeRyYoAyYMH9DSa38lBQgkWWUnlsijwMTlAETMA8AbIN5AAwCALZBABicCwC2QQAY+okm+QAB");
    imageData.append("JDJ8BsCsPtywcdmu4/voOm4AiW7JjuqDdG1CeRyYoAwAgD2UAQCwhzIAAPZQBgDAHv8PM5u0MSNXAuQAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagea52bf5d3822110c8a629125297f3f037 = new WeakReference<>(result);
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
BufferedImage imagea52bf5d3822110c8a629125297f3f037=getImagea52bf5d3822110c8a629125297f3f037();
if (imagea52bf5d3822110c8a629125297f3f037 != null) {
    g.drawImage(imagea52bf5d3822110c8a629125297f3f037, 0, 0, null);
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
	private wordPad() {
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
       wordPad base = new wordPad();
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
       wordPad base = new wordPad();
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
        return wordPad::new;
    }
}

