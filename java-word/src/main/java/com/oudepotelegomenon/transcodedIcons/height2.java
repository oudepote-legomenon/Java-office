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
public class height2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image0b15cd383b761ef9a45c84318b83462e;
private static BufferedImage getImage0b15cd383b761ef9a45c84318b83462e() {
    BufferedImage result = (image0b15cd383b761ef9a45c84318b83462e != null)
        ? image0b15cd383b761ef9a45c84318b83462e.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(10228);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAdwElEQVR4Xu3df8ylaXnQ8Vl+WDSpSm1t4q+g0kLcPefddaLtmoBDAqWEslLru+/7zrK4aWGllIWApSpsYaDyq0uxbULjikXBVhNTTRaLCrRAoSbVxJD4R2uqsRI1JLRU24aU1Lq3z2FYMz7PObs78173c57rXJ9P8k1N3c6cOfdz3/czs9fuXrgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB0sr6r/bHVne3ZQ8+95bT9hdXl9tTxXwMAHIDhov/j65P27vVp++xQm3TSPjP8z+99xh3tq8f/twBAMhfvbU8eLvYrQ1+aXPrb+/z6rJ2NfxwAIInN7+aHy/xjWy75x2x11n7owoV20/jHBAAW7NKl9qSj0/bR8cV+XZ21vz3+cQGABVudtvsnF/r19/AtZ+154x8bAFigm4/b04fL+7e3XOg30mcvvqj9vvHPAQAszPqkfXjLRX6erox/DgBgQY5O2l/ecoGfty8NP+43jn8uAGABbj9uv3e4rH9lywV+/k7avx7/fADAAgwX9dsmF3dkZ+1F458TANij4MG/XRkIBIAl6TD4t6sr458bANiDToN/uzIQCAD71nXwb1cGAgFgv9a9B/92ZSAQAPZjpsG/XRkIBIB9mHHwb1dXxp8JAOho5sG/XRkIBIC57GXwb1cGAgFgHut9Df7tykAgAPS158G/XRkIBICeFjD4t6sr488KAARYyODfrgwEAkC0RQ3+7cpAIADEWi9t8G9XBgIBIMZCB/92ZSAQACIsePBvV1fGvwYA4DosfPBvVwYCAeBGpRj825WBQAC4Messg3+7MhAIANcn2eDfrgwEAsD12PwR+pYLNaxbL7d29sD0fx/d6qy9ZfxrAwC2mGPw");
    imageData.append("7/Rdrf3gp1t73uum/3/BGQgEgMcyx+DfN31na2//2dYe+PnW3vhQa0eXp39NaAYCAeDRrWcY/HvlP7h6+T/Sne+Y/jXhGQgEgO3mGPx77uuu/tH/tS8Ab//41T8VGP+1wRkIBIBtev8b/zZ/1P+Gh/7/y/+RvvvvT//6Dl0Z/5oBoLS5Bv/GF/8jGQgEgJnNPfi3KwOBADCj9R4G/3ZlIBAAZrCvwb9dGQgEgBnsc/BvVwYCAaCjfQ/+7cpAIAB0spTBv11tBgI3/72A8Y8ZmoFAAKpZL2jwb1cGAgEg0NIG/3ZlIBAAAi1x8G9XBgIBIMBSB/92ZSAQAM5p6YN/uzIQCADnsE4w+LcrA4EAcAOyDP7tykAgANyATIN/uzIQCADXIdvg364MBALA45R18G9XBgIB4HFYJx7825WBQAB4FNkH/3ZlIBAAHsUhDP7tykAgAGxxKIN/uzIQCAAjhzb4tysDgQBwjfUMg3/f8/7phbyPTuYYCDxtd4y/YwBYlK8M/n1pyyUW1j4G/3ZlIBAALhz24N+uDAQCUNqhD/7tykAgAGVVGfzblYFAAEpaFxr825WBQABKqTb4tysDgQCUUnHwb1cGAgEooerg364MBAJw8KoP/u3KQCAAB21t8G9nBgIBOEgG/x49A4EAHCSDf4+dgUAADorBv8fXlwcC//r01xacgUAA+jP4d33d/yEDgQAcgLXBv+vOQCAAqRn8u7EMBAKQmsG/G89AIAApGfw7XwYCAUjH4F9MBgIBSGVt8C8sA4EApGDwL7YvDwR+1/Q7CM5AIADnY/Avvu/+8en30KEr47UEgMfF4F+fDAQCsFgG//pmIBCARVob/OuegUAAFsXg3zwZCNzu6S9oX7U6ay8eev/6pH1m+DV8bujXJaXovw39wrB/f2h1Z3v2hQvtpvEeZ8EM/s2XgcBrtZuGZ++lw+f97JZfg6Sc/duhZ413Owtk8G/eDARe9bR72lOGz/nBLZ9dUv4e");
    imageData.append("Xn/5NyL+NGCxDP7tp+oDgRfvbU9en7WPTz6zpEPrgfH+ZyHWBv/2VuWBwOFz/diWzyrpADs6bXePzwD2zODffqs6EHh0uf359dU/Hhx/VkmH2a8P983XjM8C9sjg3/6rOBC4Om0f2fIZJR12V8ZnAXti8G8ZVRsIvHjWvnb4PL+75TNKOux+eXwesAcG/5ZVpYHA1Um7a/LZJJVodbn9qfGZwMzWBv8WV5WBwKOT9qYtn0tSgVZ3tueOzwRmZPBvmVUZCFyftPdu+VySCuSfBtgzg3/LrcJA4PD8vW/LZ5JUobP2svGZwEwM/i27CgOBXgCkwnkB2A+Dfzk69IFALwBS4bwA7Mfa4F+aDnkg0AuAVDgvAPMz+JerQx4I9AIgFc4LwPwM/uXrUAcCvQBIhfMCMC+Dfzk71IFALwBS4bwAzMfgX+4OcSDQC4BUOC8A81kb/EvfoQ0EegGQCucFYB4G/w6jQxsI9AIgFc4LwDw2f7Q7+fKD+9bXt/ZXfqBfx29r7e73tHbfB4aL8BPTy3GfvfWjrb3ifa29ZPh837Hls0d26VXT7z661Vl7y/gZ6qHHC8CzXtnayx+UFNltL5nutXPnBaC/OQb/5u62u1p78Ztbu/KvppfxnH3fT7X2/O9t7ehs+hmT99u3nLQ/PX6WovV4AXj+903XSdL5uvhXp3vt3HkB6GvzR7nDF/3ZyRd/IG1eBF72d6cPa+/e9XNXf6d/gBf//2t12n56/DxF8wIg5cgLQELrGQb/ltBmOG78wPbqnZ+c5R/JW0pdBwK9AEg58gKQzByDf0vqu947fWij2ww5/qU3TX/uA67rQKAXAClHXgCSGb7gfzn5wg+4zb+B8Pv/xfTBjeyV8/wb+ZbWm8fPVhQvAFKOvAAkMny5z5p82QX6tjdOH9yoNn/f//Z7pz/nobc6bb9x83H7mvEzFsELgJQjLwCJDF/uP5582QXaDOVt/pG88cMb0Wt+YvrzVWl10l41fsYi");
    imageData.append("eAGQcuQFIIsr7Qmb37VNvuwibf55/PHDG9F3vHX6c1VpeJ4+Mn7MIngBkHLkBSCJzX/QZfJFF+rOTv9EwHNeM/25CvX58XMWwQuAlCMvAEmsi/79/0d60f3Thzei2182/bkK9fDFe9uTx8/aeXkBkHLkBSCJdfEXgF4XQJcNkKhLl9qTxs/aeXkBkHLU5fzzAhBvfdyeMfmiC9XrAuiyAfL0hfFzFsELgJSjLuefF4B4x8fticOX+1uTL7tIvS6ALhsgTz87fs4ieAGQctTl/PMC0MfRWfunky+7SL0ugC4bIEmr0/ba8TMWwQuAlKMu558XgD5Wd7bnTr7sIvW6ALpsgBx9cX13+8PjZyyCFwApR13OPy8A/Qxf8M9MvvAC9boAumyAHL1t/GxF8QIg5ajL+ecFoJ/1cfuTw5f8hcmXfuD1ugC6bIDl9++f/oL2VeNnK4oXAClHXc4/LwB9rTf/SOBZ+83JF3/A9boAumyABXd02v7Tbaftj4yfqUheAKQcdTn/vAD0d+vlduvwZf/y5Ms/0HpdAF02wFI7ax+77bh93fhZiuYFQMpRl/PPC8A8Nv9N99Vpu3/40n91sggHVq8LoMsGWF6/NPzO/+4LF9pN42eoBy8AUo66nH9eAOa1+de5Ht3Znj98+VeGPjgcwB/e/G5vb522/z55KM5ZrwugywY4bb84+U7m7LQ9tDpr7x+eg9ffetL+3Ph56c0LgJSjLuefF4DaMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMF");
    imageData.append("YAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9V");
    imageData.append("zvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHY");
    imageData.append("APEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4RLtMFYAPEy7T+UuWcf4TLdAHYAPEyrb9UOecf4TJdADZAvEzrL1XO+Ue4TBeADRAv0/pLlXP+ES7TBWADxMu0/lLlnH+Ey3QB2ADxMq2/VDnnH+EyXQA2QLxM6y9VzvlHuEwXgA0QL9P6S5Vz/hEu0wVgA8TLtP5S5Zx/hMt0AdgA8TKtv1Q55x/hMl0ANkC8TOsvVc75R7hMF4ANEC/T+kuVc/4dhHbTcOh+89FJe93qpP3o0Wl7cJ8ND8EvTR6Kc9brAui0AX5u/J3M3fA8/J3Vabt3eCa+cfy09OYFQMpRp/PPC8AcLt7bnjxc+K8avvT/OlmEA6vXBdBlAyys4UXg3w3/847x89OLFwApR13O");
    imageData.append("Py8A/a2P2zOGg/Yzky//QOt1AXTZAMvtn108bn9g/CxF8wIg5ajL+ecFoK/V5XZx+KJ/bfLFH3C9LoAuG2DJnbT/cPGsfe34mYrkBUDKUZfzzwtAP0fH7Y8OX/LnJl/6gdfrAuiyAZbfz1+61J40fraieAGQctTl/PMC0M9wuH5o8oUXqNcF0GUD5OgN42crihcAKUddzj8vAH2sztrtky+7SL0ugC4bIENn7TdXl9tTx89YBC8AUo66nH9eAPoYvtyfnHzZRep1AXTZAEk6Omv3jZ+xCF4ApBx1Of+8AHRwpT1h+HL/1+TLLlKvC6DLBkjS6rR9ZPyYRfACIOWoy/nnBSDerZfbN0y+6EL1ugC6bIA8/er4OYvgBUDKUZfzzwtAvOGLfdbkiy5UrwugywbI08PHx+2J42ftvLwASDnqcv55AYi3urM9e/JFF+rb3jh9eCP65pdNf65CPbz5t0mOn7Xz8gIg5cgLQBKrs/bMyRddqOO3Tx/eiJ7z6unPVagvjJ+zCF4ApBx5AUhi80e1w5f7W5Mvu0gvf3D68Eb07W+Z/lyF+pnxcxbBC4CUIy8AiQwH609NvuwCHZ219taPTh/eiF79wenPV6XVaXvt+BmL4AVAypEXgESOTtq3TL7sAr3gb04f3Kje+cmycwBfvOWsff34GYvgBUDKkReAZIYv+JOTL/yA2/zu/w0PTR/cyO79e9Of99AbXibfNX62ongBkHLkBSCZ4UK8efiSf2fypR9oL/3h6UMb3Q9+urUX/q3pz33Afa7nfxbYC4CUIy8ACQ1f8A9PvvQD7NvfevVyHj+0PXr7xwv9EwFn7Wz8TEXyAiDlyAtAQpvfva0P+D8JvPlj/83v/Oe6/B/pnZ9o7Y43TT/PQXXWPj5+nqJ5AZBy5AUgqaPTdvfki0/e5uLf/FH8/R+aPqhz9tqfbO05900/3wH0O5u/hTR+lqJ5AZBy5AUgrXbT8GV/avLlB/cXv2c4fF/fr83v");
    imageData.append("uE/f2dor3tfaD3xs+oDuszd9uLXvfO/VfwnRC98w/eyR3f7y6Xcf3kl79/gp6qHHC8Dmhex1/0RSZH/2JdO9du68AMxjjoHAb/U7r+5t/lHE2++dfvfBdR38u1aPFwBJSfICMJ85BgJf8xPTS0txXX739DsP76Sdjp+dXrwASIXzAjCfb7qr/f7hS/8fk0UIbPPH05sBufHFpfP3/T/d2m13Tb/z4D61+VtG42enFy8AUuG8AMxrjoHAl7xnennp/L3gb0y/6+D+9+qutho/Mz15AZAK5wVgbu2m1Wn7xGQhAtv8LnXzu9XxBaYb774PTL/nDj0wflp68wIgFc4LwPwMBObq0Ab/ruUFQCqcF4D9MBCYp0Mb/LuWFwCpcF4A9sNAYI4OcfDvWl4ApMJ5AdgfA4HL7xAH/67lBUAqnBeAfTIQuOQOdfDvWl4ApMJ5AdgvA4HL7JAH/641fIYf2/K5JFXopL10fCYwMwOBy+uQB/+uNXyON08+l6QS3XLWnjc+E5iZgcBldeiDf9fa/A5gy2eTVKBbL7dvGJ8J7IGBwOV06IN/1xp+B/D1w+f5P1s+o6TD7j+PzwP2xkDgEqow+DfW+7mTtLxWZ+0d47OAPTIQuN+qDP6NDQfB7cPnenjLZ5V0iJ20//nMl7Y/ND4L2DMDgfuryuDfNsNz94HJZ5V0kB2dtleMzwAWwEDgfqo0+LfN0+5pTxk+3y9s+cySDqjh8n9wvP9ZEAOB81dp8G+XZ9zRvnr4nA9t+eySDqMfOT5uTxzvfRbFQOCcVRz822VzOBydtfuGz/v5Lb8GSTn7xVtP2wvH+52FMhA4T1UH/x7L5m9FDS+h9wz98+Hz/8rQl7b8uiQtsy+uz9p/HPbvjw//7zsuXWpPGu9xFs5AYP8qD/5dr1vvaX9wdbk9VdJy2/ytvPHeJSEDgX2rPvgHwIIZCOyXwT8AFsxAYI8M/gGweAYCYzP4B0AacwwEvvofTS/LQ8zgHwBp");
    imageData.append("GAiMyeAfAOkYCDx/Bv8ASMhA4Hky+AdAWgYCbyyDfwCkZyDw+jP4B0B6BgKvL4N/ABwMA4GPP4N/ABwQA4GPJ4N/ABwcA4GPnsE/AA6WgcDdGfwD4GAZCNyewT8ADp6BwGkG/wAowEDgtRn8A6AMA4FX2/ytCoN/AJRiILC1yw9MP3N4Bv8AWJLqA4EG/wAoq/JAoME/AAqrORBo8A+A8qoNBBr8A4CvqDQQaPAPAL6iykCgwT8AGKkwEGjwDwAmDnsg0OAfAOxwqAOBBv8A4DEc4kCgwT8AeAyHNhBo8A8AHqdDGgg0+AcAj9thDAQa/AOA65R9INDgHwDcoMwDgQb/AOAGZR0INPgHAOeUcSDQ4B8AnFuugUCDfwAQJMtAoME/AAiWYSDQ4B8ABFv6QKDBPwDoZMkDgQb/AKCbZQ4EGvwDgM6WNhBo8A8AZrKkgUCDfwAwk6UMBBr8A4CZLWEg0OAfAMxuvwOBr/qH07++Qwb/AGBsXwOBBv8AYM/2MRBo8A8A9mzugUCDfwCwEHMOBBr8A4DFaDcNF+entlymYW1+13/Pj07/9+GdtHePf3UAwA5zDATOkME/ALhecwwEds3gHwBcvzkGAjtm8A8AbtQcA4EdMvgHAOfT/98Q2CH/xj8AOK9kA4EG/wAgSpqBQIN/ABAnyUCgwT8AiLbwgUCDfwDQx6IHAg3+AUAvCx0INPgHAL0tbiDQ4B8A9LewgUCDfwAwl4UMBBr8A4B5LWIg0OAfAMxtzwOBBv8AYF/2NhBo8A8A9mdPA4EG/wBg32YeCDT4BwDLMOtAoME/AFiKmQYCDf4BwNJ0Hwg0+AcAy9N5INDgHwAsVaeBQIN/ALBsXQYCDf4BwNIFDwQa/AOALFZn7R1bLvPrbvhxXjz+sQGAhbr5uP2e4QL/9PhCv85+ZPzjAgALt7rcnnp02v7Nlov9sTtp77twpT1h/GMCAAk87Z72lOEl4D3Dpf67k0t+S6vT9htHZ+2v");
    imageData.append("jX8cACCh1Vl75vAi8OBwyf/a+NL/Sv9l+Gvecttx+7rx/y0AkNzxcXvicMn/mVtP2wtXJ+346KR9y83H7U+M/zoAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABgif4v0jcXNfKJ0x8AAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image0b15cd383b761ef9a45c84318b83462e = new WeakReference<>(result);
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
BufferedImage image0b15cd383b761ef9a45c84318b83462e=getImage0b15cd383b761ef9a45c84318b83462e();
if (image0b15cd383b761ef9a45c84318b83462e != null) {
    g.drawImage(image0b15cd383b761ef9a45c84318b83462e, 0, 0, null);
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
	private height2() {
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
       height2 base = new height2();
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
       height2 base = new height2();
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
        return height2::new;
    }
}

