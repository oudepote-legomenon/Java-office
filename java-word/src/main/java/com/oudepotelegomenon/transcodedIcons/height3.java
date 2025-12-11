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
public class height3 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagea9d5185c88c88fe0cc6a87a1d937e136;
private static BufferedImage getImagea9d5185c88c88fe0cc6a87a1d937e136() {
    BufferedImage result = (imagea9d5185c88c88fe0cc6a87a1d937e136 != null)
        ? imagea9d5185c88c88fe0cc6a87a1d937e136.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(11096);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAgSklEQVR4Xu3dbYym13kX8LHzzP3sztRe1tn1eEX7CVdBUSrxoVEhtlOkNgSUglJaSoVoVMQ7TZ1EUGgqFFlIfECISq0CJZSSxA6ED0VENOIDTYn6gmhCW9tJUANfUlTRULxgW2wqVMcTzt0O6vb4PN6dOdc5z/3y+0l/TWJv5n6eO57r/Md77T0HBwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQBv3DsPw+7fb7VvTx7dvNps3p792Lf9FAMACHB4eviEd+P805X+lfKWQp1Pek37pcf6/BQDm56vSwf4jKaeFQ/8VSUXhi+nj2/NPAgDMxNHR0Y2z7+xfcdDfIWNZeF/++QCA6bsvHeLPFA738+Sv558UAJiwdHj/aOFAP29e2mw235B/bgBggrbb7VuGu/w9/7vIs+lTbvJrAADTsjk8PPx84SCvybvyiwAAE5IO6/cUDvDavHB0dPRQfi0AYALOtv5fLBzgEXkyvx4AMAHpkP5I4eCOyulms3ksvyYAsEfjI33HQ7pwcEdmXAgc8msDAPuxSYfzZwoHdngODw+fyC8OAOzB0Gbxb1duWQgEgD27dOnS1wztFv92xUIgAOzT4eHhTxQO6NaxEAgA+3K2+Jcfzr1iIRAA9qDb4t+uWAgEgM6Gvot/u2IhEAB62dPi365YCASAHva0+Lcrp9vt9pvz1wgABNrz4l8xqZD88vjS8tcKAMRI5+1+F/9eJX5kMAC0MG7dFw7eqeSFy5cvf3X+mgGACmeLf7cKB+9kMu4m5K8bAKgwscW/nfGEQAAIMsXFv1eJJwQCQIB0pk528a8YTwgEgEoTX/zblVsWAgHgguaw+LcrFgIB4ILmsvi3K54QCADnlA7Pt+QH");
    imageData.append("6txy9oRAC4EAcJeGdHh+Pj9Qg3MzXePvFv56aCwEAsBd6rH4l67xjnSpTfrPz+Z/LzgWAgHgTjot/j2TLnXveL3xwT3pv58Wfk1YLAQCwB10WPw7TYf+o7dfM/21Jwu/LjQWAgFgh06Lfx/Or3t0dPRQ+usvFH5tWCwEAkBZj8W/54+Pj0/yC4/S33tX4deHxkIgAGR6LP5tt9vvza97GwuBANBTx8W/TX7t21kIBICOOiz+vZwO90fy65YMFgIBoL0ei3+pYPxQft1dLAQCQHubHot/6TqvzS/8agYLgQDQTjoI350fjNG5w+LfLl0WAsd/25BfGAAW7Wzx78XCwRiZOy7+7dJjITDlyfy6ALBoHRb/xif+3dXi3y5D+4XAUwuBAKxGj8W/lA/l1z0vC4EAEKfHE/9u7nri33kNFgIBoF6PJ/4d/vaP+o3SZSHQEwIBWKyOT/z7rR/1G6XHQqAnBAKwWHNY/NtlaL8Q6AmBACzPXBb/drEQCADn12Pxb+eP+o0yWAgEgLvXY/Hvgk/8Oy8LgQBwNzou/r0mv3YLFgIB4C50WPy76x/1G2WwEAgAu/VY/Ds8x4/6jWIhEAB267L4d3DOH/UbZbAQCACvtKDFv10sBALA7Za2+LeLhUAAuM0SF/92GSwEAsByF/92sRAIAAtf/NtlsBAIwJqtYPFvFwuBAKzT0dHRjfGQKhxckfn0wZ4X/3bZbDaPptf3cuE1h8VCIACTkw6op/IDKzjj4t/X59edknE3ofC6QzP+yYP8ugCwF2eLf63/ONxkFv9exWuHxguBKc8eWAgEYAJWufi3S3qtjxdef2gsBAKwdyte/NtlXAj8dP4egmMhEID96fTEv8ku/u2y2WzeOFgIBGCpOj3xb9KLf7v0WAj0hEAAulvbE/8uYFwIvJm/p8h4QiAAvfVY/Lt5MJPFv13SPXpH4X2FxkIgAN30WPwbD8/8ujN072AhEIAl6LT496l0qXvza8+RhUAA");
    imageData.append("FsHi3/lZCARg1iz+XZiFQABmy+JfBQuBAMySxb9qFgIBmBeLfzEsBAIwKxb/4lgIBGAWLP6FsxAIwOT1Wvx7IL/wklkIBGDSLP41YyEQgGnqtPj39MHCF/92OVsIPC3ck7BYCATg3Dot/j2SX3dN0j34cOG+hGZBC4FjURSRaeeeA+bN4l8fx8fHJ4OFwFe4cuXK77l+/fqfS/nXKf/12rVrX3rwwQe/IiLTTvp6PU1fr7+ePv5Syg+m//yNB0rBrFj868hC4O94/etfP6Sh8X0p/zsfLCIyz6Sv559PH/9Q/vXOBFn8685CYHLjxo30zcK1n82Hh4jMP6kEvJS+vh/Pv+6ZkE6Lf4t/4t95rf0JgVevXr2SBsR/zoeGiCwrqQT8QP71z0R0WvxbxRP/zmvciSjcr9BMdCHwnjQYPp4PChFZXlLRfzmVgG/JhwB7ZvFv71b5hMA0EP5kPiREZLlJBeBXHn744W0+C9gfi38TsMaFQP/qX2R9SV/335PPAvbE4t9krGohMA2Cr8sHg4gsP6kA/Ew+D9gDi3/TsqaFwDQE/mY+GERk+Ulf+18el3/zmUBnFv+mZy0LgdeuXfuH+WAQkXXk5OTkDflMoKN0ML85PxiiY/HvQnotBG7yC/eUvgv4WD4URGQ1+aZ8JtBPOgeGz+QHQ3As/l1Qj4XAlHfl1+3p2rVrP1kYCiKyjuz930KulsW/yeuxEPjC0dHRQ/mFe1EARFYdBWAf0tC/MVj8m7weC4EpT+bX7UUBEFl1FIB9SEP/qcJBEBmLf0E6LASe7mshUAEQWXX2MndW7Wzx77RwEITF4l+oxS4EKgAiq44C0NlmsPg3O0tdCFQARFYdBaCnNOTfXRj8obH418QiFwIVAJFVRwHo5eyJfy8WBn9kLP41ssSFQAVAZNVRAHrp8MS/U4t/bfVYCEz/Hz6WX7cVBUBk1VEAeujxxL+UD+bXJdy4EPh84d5H5tmDTguBCoDIqqMAdNBj");
    imageData.append("8W/8vf9Ppvx4q6Rr/Fj6+HfSx29P7+m+/E3uU3pNr0t5PL2+H0wfP5q/9uD8t/zeN0iXhcAWBSB9zn93/fr1bxORsLwj/zoLigLQ2tBh8W8P+b8p/2zca8jfb0/pNfzxlGcKr2/u6bIQ2KIApGH1gfw6wMVduXLlav51FhQFoKWzJ/61XvzbZ34jfUf8F/L33cH96br/pvB6lpTmC4EKAEyfAjBTQ/sn/k0i6TB+In/vrRwfH5+ka34ufw0LTPOFQAUApk8BmKEeT/ybUlIJ+K78HjSQLjX8XH7tBafpQqACANOnAMzP+OCYZwsDfcm5Nf6WR34jIqVrfH/huovOdrt9Z34foigAMH0KwMyk74b/TD7IV5J/nN+LQA8M7f8I3uSS/ln6Ynrvl/KbEUEBgOlTAGYmDe6fzgf5SnIrvf3L+f2IsNls/nLheqtIKgHfkd+PCAoATJ8CMC9XhhX93n8hb8tvSIR0CH68cK21pMmfCFAAYPoUgBnZbrd/uDDA15T35vckQioAv1q41lryufx+RFAAYPoUgBlJB9WfLgzw1SS9/x/O70mE9Ll/M7/WivJcfj8iKAAwfQrAjKRh/fbCAF9TWhwAVwvXWVNu5jckggIA06cAzMhms3mkMMDXlBYHwNoLwGfyGxJBAYDpUwDm5f5h3f+6usUBsPYC8FR+QyIoADB9CsDMHB4efqIwxNeSFgfAqgvAuFeS35AICgBMnwIwM2lof1s+xFeUFgfAagtAOvx/7cCDgGC1FID5uScN71/Ih/lK0uIAWHMB+Iv5zYiiAMD0KQAzlIb361JeyAf6CtLiAFhlARgffpTe+z35zYiiAMD0KQAztd1u/0ga5Lfywb7wtDgA1lgAfj697/vyGxFJAYDpUwBmLH0X9wdSfqUw4JeaFgfA2grAuPV/lN+EaAoATJ8CMH+X01B/b8r/LAz7paXFAbCWAvAfttvtW/M334oCANOnACzHazabzWNp0P/A4eHh+9PH");
    imageData.append("f5Hy0X0lvYb/MbzyEKpNiwOgSQFI7/+TQ+G+dMxT46OTz37S4dfmb7o1BQCmTwGgiXT4/ORQOBgr0+IAaFIA0nfbq/4CUABg+hQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAA");
    imageData.append("FIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIA");
    imageData.append("sRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSA");
    imageData.append("wlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFACaUAAUgMJQqIoCALEUAJpQABSAwlCoigIAsRQAmlAAFIDCUKiKAgCxFIDlGNKh89Z0+Lwv5cfSAfzje86v54diQFocAE0KQMrPFO5Jt6Tr/8v08f2bzeavpP/8uvxNt6YAwPQpAPN3Xxr0T6Qhf7NwCC0tLQ6AVgVgavmPKX8sf/OtKAAwfQrAjKXv7v5gOvy/UBj2S02LA2AtBeD/55+n93yc34RoCgBMnwIwU9vt9o+mYf4bhQG/5LQ4ANZWAMZ8Kr3v+/MbEUkBgOlTAGYofdf/hjTE/09hsC89LQ6ANRaAr6R/hv5teu/35DcjigIA06cAzM+9aYD/p3ygryQtDoBVFoAx44JgfjOiKAAwfQrAzKTv3L4jH+QrSosDYLUFIP2z9MX0/i/lNySCAgDTpwDMTBran8wH+YrS4gBYbQEYk/55+s78hkRQAGD6FIB5uZKG9pfzIb6itDgAVl0AUj6S35AICgBMnwIwI5vN5tHCAF9TWhwAay8An81vSAQFAKZPAZiRNKz/VGGAryktDoC1F4Cb+Q2JoADA9CkAM5KG9bcXBvhqcnh4+MP5PYmQPvdv5tdaUZ7L70cEBQCmTwGYkc1m81hhgK8p783vSYRULH61cK21xG8BwEopAPNyfxrYLxeG+FrytvyGREgF4OOFa60lT+b3I4ICANOnAMzMiv8Y4K2DRn9mPd3Tv1S43ioyPlcivx8RFACYPgVgZsY/t50P8ZXkR/J7EeiB9PmfL1xz0Un/LP3aQaNSpQDA9CkA8zM+CvjpfJgvPLeOjo5u5DciUrrG");
    imageData.append("3ypcd9HZbDZ/Nb8PURQAmD4FYIbS4H4kDfDTfKAvNek71T+b34MG0mUOfyq/9oLzdHrPr8lvQhQFAKZPAZipNMA/VBjqS8z78vfe0PhbAZ8tvIal5fTSpUtvyt98JAUApk8BmKnj4+OTYdm/b/2l9B35d+Xvu4P70nU/Vng9S8oH8zcdTQGA6VMAZmy73X5vYbjPPV9K+dHLly//3vz99pRew7ek/GLh9c09z6fy+GD+fqMpADB9CsC8bdJAf6Yw5EOTviP+RPr40Yb5QLrGE+njt6b3dJS/yX1KJev3pXxPen1/P72+JwuvPSzpGl8YCvc/Mum9vDN/jy20KADpc37i5OTkO0UkLH8+/zoLigLQw9lCYOuHAzV5WAy/49KlS1+T7vOLhXsfmaaLf7drUQBEZDZRAHpJ3zn+UGHYR+Y0fefo/9CG0v+HP1G475Fpvvh3OwVAZNVxXnT02qHxQmA6oH45XWfIL0y9VK7ekt/vBmm++Hc7BUBk1VEAeuqxEDj+Pn1+XaoN6b5+Pr/Xwemy+Hc7BUBk1VEAOuuxEHjr8uXLX51fmIs7W37M73Noei3+3U4BEFl1FIDeejwhcPy96vy6XMzZ4t+t/B4H51MHnRb/bqcAiKw6CsA+DB2eEGghMEaPxb9UCr8+v24PCoDIquOM2IezJwTeLBwGYbEQWG+Ji3+3UwBEVh0FYF/SAf2OwmEQGguBVRa5+Hc7BUBk1VEA9mj8kcEWAidqqYt/t1MARFYdBWCfejwh0ELg+S158e92169f/1hhKIjIOvJN+Uygsw5PCLQQeE4dFv9e3tfi3+3SAHh/YSiIyApycnLyhnwm0N/4hEALgRPRY/FvLH35dffh+vXr35cPBRFZftLX/pcfeOCB+/OZwB5YCJyMHot/z6XrPJBfeB/G7wDywSAiy08qAD+dzwP2Z1wI/HThsIiMhcA76LH4N5a9/Lr7lAbB5/LhICLLTvq6/2v5LGCPNpvNGwcLgXvT");
    imageData.append("cfHv3vza+5SGwbfmw0FElptr16594eGHH97ms4A9sxC4P2tZ/CtJQ+Hj+ZAQkeUlfef/cioAb8tnANPQYyHw8wcWAn+XNS3+lYzLQH4rQGT5SV/n359//TMhFgK7W9Xi3y733Xffa9Nw+Kl8YIjI/JO+tl9K2euDx7g7FgI7WuPi36s4TEPib6TczAeIiMwz6ev535+cnHxD/sXORFkI7OPo6OjGsMLFvzu5evXqlTQ0vjsNj3+VPv6XlBfH3zsUkcnnpWvXrn0xffyFlH+Q8mj+9c0M9FgITEXjsfy6a5LuwUfyexKcyS7+ATBdzRcCU549WOlC4Nni32nhnoRlyot/AEyYhcBmLP4BMGkWAhuw+AfA5FkIjLXWJ/4BMEM9FgLX8oTAsezk7z04Fv8ACNN8IXD8PfGDhS8Erv2JfwDMkIXAahb/AJglC4EVLP4BMFsWAi/G4h8As2ch8Pws/gGwBBYCz8HiHwCLYSHwrln8A2BRLATeBYt/ACyOhcBXZ/EPgMWyELibxT8AlqzXQuAmv/CUWfwDYPF6LASmvCu/7oRtLP4BsAY9FgJfmMtCYHqt7ym8/tBY/ANgEs4WAk/zgyoyc1gIPFv8ezF/7cF5+sDiHwBTkQ6mDxUOq9BMfSGwx+JfKhlvyq8LAHtzfHx8Mqx4IXCz2Xxj/nqjY/EPgEnqtBD47vy6E5Be1vDZwmuNjMU/ACZrlQuBnvgHwOqt7QmBR0dHNwZP/AOAPk8ITEXjsfy6+5Bey0fy1xYcT/wDYDaaPyEw5TMHe14IPHviX+s//mjxD4D5WMFCoCf+AUBBl4XA8eE7+YV7GDzxDwDKlroQeLb41/qJfxb/AJivJS4EDhb/AOCOFrUQaPEPAO7SghYCLf4BwDl0WQg8Ojp6KL9wpMHiHwCcT4+FwJSn8utGsfgHABfUYSHwtNVC4GDxDwAurNdC4JBfuMbZj/q1+AcAF9VjITBd44n8uhU2gx/1CwDVeiwE3opa");
    imageData.append("CBws/gFAjLksBFr8A4BgnRYC35xf9zyG9ot/42u0+AfAqowLgc8XDsXIXPgJgT0W/1I+mF8XABYvHYCPFw7F6FzkCYFdFv+Oj48fzC8MAGswHrStFwJfPO+PDB4s/gFAWz0WAs/zI4Mt/gFAJx0WAscfGXxXC4FD+8U/T/wDgDO9nhD4qguBPRb/PPEPAG7T4wmBw6svBKa/3X7x78AT/wDgd+nxhMAXdz0hcHx8cOHXh8biHwAU9FgIHApPCBz/lED667cKvzYyFv8AYJcOC4GveELg+KcECr8uMhb/AOAOei0E/taPDD5b/Mv/fmgs/gHAXeixEHj2I4O7PPHvwOIfANyVHguBt1IJ+HuFvx4ai38AcA6dFgJbx+IfAJxXh4XAlrH4BwAX1GMhsEks/gFAhR4LgQ1i8Q8AKo0Lgc8UDtnJxuIfAATYbDaPDvNZCHz6wOIfAMSYyULgy5cuXXpT/toBgIub/EKgxT8AaGDiC4HPH1j8A4AmJrsQuN1u35m/WAAgyEQXAscn/r0mf60AQKCJLQSOP17YE/8AoINxIfD5wmG8j3wwf3EAQCPp4H28cBj3znPHx8cP5q8NAGhnM+x5IdAT/wBgD/a8EOiJfwCwL3taCDz1xD8A2K99LARa/AOAfRv6LgRa/AOAiei2EGjxDwAm5Gwh8DQ/sINj8Q8ApiYd0B8uHNpRsfgHAFN0fHx8MrRbCLT4BwBTNbRZCHze4h8ATNu4EPjpwiF+4fhRvwAwA5vN5o1D3ELguPjnR/0CwBykg/sDhcP8vHlpLBP55wYApuur0gH+dOFQP0/ek39SAGDijo6OHkqH+C8VDvY7Zfztg7+dfz4AYD7GfxPwj4a7/KmBh4eH/z19/BP5JwEAZigd6q9P+Scpz+WH/vDb3/H/Ysrj6Zce5f9bAGD+7k0H/ddut9tvTh/fttlsHkl/7Wr+iwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    imageData.append("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIAp+n/QJa3IkbUI7QAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagea9d5185c88c88fe0cc6a87a1d937e136 = new WeakReference<>(result);
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
BufferedImage imagea9d5185c88c88fe0cc6a87a1d937e136=getImagea9d5185c88c88fe0cc6a87a1d937e136();
if (imagea9d5185c88c88fe0cc6a87a1d937e136 != null) {
    g.drawImage(imagea9d5185c88c88fe0cc6a87a1d937e136, 0, 0, null);
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
		return 512.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 512.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private height3() {
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
       height3 base = new height3();
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
       height3 base = new height3();
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
        return height3::new;
    }
}

