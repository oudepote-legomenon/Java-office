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
public class strikethrough implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagefe085c9d4c457892802a1a5cc6d8ad2c;
private static BufferedImage getImagefe085c9d4c457892802a1a5cc6d8ad2c() {
    BufferedImage result = (imagefe085c9d4c457892802a1a5cc6d8ad2c != null)
        ? imagefe085c9d4c457892802a1a5cc6d8ad2c.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(15044);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAr3ElEQVR4Xu3dd5ysRZXw8UPOUSQqKAYwgAFdRVRQEXUxYc6KiCCKuphh9ZoWFMG8BFEURQR9TYABRLhrAgQRRRDhRWEVRQwYQAVF99TU5XLnnJq53dNPd1ed53c+n+8/Z2b6qVNPTXf1E+qRf/3rXwIAAPrFJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5");
    imageData.append("BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAItG4jdpR7a6eofZWB6g3qXepo9Qn1cnqLHW++on6pfqzuln9Vf1eXa2uUD9S56lvqtPVF9WJ6lh1iHq5eqraSW2t1rDtmjaXAACgNRorqbuox6pXqw9L/nD+jUq/UIM/qEvU19Xx6lD1IsmThA1tTePmEpibxlrqPpJnkAepNy9AmnG+RD1RPVu9pvA7g1qk9lUPU5vb9mKyJH/L2E29trCvbvGWebx1Hm+bx9vn8V/zOHge6RtMSfpZGsPpDfalak/1dPV4tat6kOT/kW3UlmojtaZawfYXsBAaa6sHqOdJHo+fUxerG8V/4Lbm12qxOlLyEYRHqtvZPuiKS8CT/Gb2cfWPwg6rSZpZPlOtaGvAeGhsIXlsXFnYH5gtHUL9nfqFukDyG/d71CslT4jTxGED28foN40V1L3V6yV/ON4kfmxF9yd1rvqg5C+OW9t+WgiXwK00VlcflXz+x+6Qml2qdrT1oFsaz5d8SM/2P0aT3ux+oD6mXib5297qtv8Rl+SjaenLzHHqV4UxApFr1OclH3F8sCzgf8QlkGmso84sdHorrle72bowOsmHIE8p9DnG5+/q++pD6sXqvmolu2/QprQvJZ8+Sqe70jfd1r501SAdGfmueq/k03Jr2362XAKpH2WNJR1pO7g16ZzY7rY+jEby+Tnb15i8dHHXMerRahW7");
    imageData.append("n1A3yR/6T1aflnx1vd2/GM116h1qC9v3S/eBTSD1m/xnoTNblc63rmlrxMJoPEL9s9DPmK70ZpeuxXiCLOBQKCZHY0P1OnVVYT+ie+nIwNvsfpjZFzbRdxqbSz58bjuxZYtsnRie5NNCVxb6F3VJ922fpB5u9yGmR2N7yUds/lLYZxi/94u5G8ftpL7TOLrQca27QW1ka8VwNPYr9C3qdo7kWxS5DXEKJB/m30Py4jp232DyPjRr/9gd1meSL+6K9u3/Fq+09WI4klf4sv2KNlykniVcODgRkg/zp6vTryzsC0zXo5fuJ7vj+kxjr0JnRXGhrRfD0fhhoV/Rlv8v+S6CVe3+xegkn0JNR1E5zF+vs5fuL7sD+0zjO4XOiuQ+tmYMRvKdIbUvBIXBpbXcH2T3MxZG8qH+/5C8hoPta9Rn5iiA25F9pXG3QidF8z5bNwajsV2hP9G2NKFLSyJzC+EIJN+/nxZusv2Len1kZt/ZndlXGocVOimadN80b3YLIHkpUtufiOF76m52n2N+kp/z8BHhttgWnTmzD+1O7SONVSQ/hMF2UkRPsvVj+YQJQHTpnPX+wt0Cy5X6SPLjdNNzHWw/og0/ndmXduf2kcaTCh0U1cm2fiyfMAHoi9PUxnb/I5P8wKZ0a6XtN7QlLa29otvBfaRxaqGDoko7fhPbB5ifMAHok/Ro2dvaMdBnGutJXkiGC2FjuHlmv9od3TeSH+fat0H9KtsPmJ8wAeibdFHbhnYc9JHkhZR4Il8sf5zZt3Zn943GgYXOie4i2w+YnzAB6KN0ceD6diz0icZBwkV+Ef1iZv/aHd4nki9mSQuD2M7pgx1sf2BuwgSgr9Kjade14yE6jdXVCYX+QAyXzOxnu+P7RGOXQsf0xQdtf2BuwgSgz76l1rJjIiqNzSRPfGw/II5zZ/a13fl9ovGJQsf0RbqFh+VQByRMAPruLOnBY4Y1dpD8CHFbP2I5Y2Z/2wHQF5Kvau37etVP");
    imageData.append("sf2CMmECAJF32XERicbThPfEvvj8zD63g6AvNPYtdErffMn2C8qECQBEblY72rHROsnXQr1ZuNivT46b2fd2MPSFxnmFTumbdPvjZrZv4AkTAGQ/UWvY8dEqjTXVpwt1IraZa8DcgOgDje0LHdJXr7H9A0+YAOBW77bjo0UaG6jzC/UhvkNmxoAdFH2g8b5Ch/TVxbZ/4AkTANwqnQp4sB0jLZH8eOtvF2pDPxw4Mw7swIhOYzXhIRbWv9l+wmzCBACzpZUCm3xwkMZK6pRCTeiP/WfGgh0c0Wk8vdAZfXeE7SfMJkwA4D3ejpMWaBxbqAX98vyZsWAHR3Qapxc6o++ukx7c4zwKYQIAb2YxlZZoHFyoA/2z28x4sAMkMo2tJJ+/s50Bkafb/sKthAkAymbeSFug8fJC+9FPt5sZE3aQRKaxqNARyL5i+wu3EiYAKPsfO1ZqpPEM4T5/ZL9ZOi7sQIlKY0V1ZaEzkKUjI1vYfkMmTAAwt4fY8VITjV3VjYV2Y/n+KvlRyD9WZ6uvqE+pYyQvJf85yaeV0x0VF6rL1S+l7hUVl65o6QZLVBqPLHQEZnu97Tdk0vYE4DPqqCGlC8VOUqdKXgc/LZx1ibpK/Vb4NrmsE+x4qYXktf3/XGgzbpW+/FymPiv5KPGT1F3UarY/ByV5dcXN1UPVCyVfe5EWXEqPmP6j+DZMSqp166XttA2PSuPEQmdgtkttvyGTticA97b1jEryCnL3Uk9Rb1AflfzUvGsL248ufcBWtzqg5IV+ri60t+/SCqhnqVeq+6s1bd+Nm8Ym6vHqHeobMrkjBm+d1Q7bsIg0NlR/K3QGvHBrnXdBmAAMTPKDth6nPqJ+U2hPRE+2/TBtGicU2tlX10v+hv88taHtq2nTWEX9m3qF5CNvPy/UMKo00Vhp1nZtQyISrn4dxtG2/5C6hQnAQkhedGZn9f8k9h04J9nap0njqYU29tFXJU9Gm7vNWfJpiNdIPrI26v/O");
    imageData.append("aWpdtw2biEjyxRm2Q1D2B6nwcOa0CROAkWlsq45Tfy+0sXU3qLVszdOgsank6zRsG/sija90gd72tm9apbGx2kudLMOdLkgXfx6mVravOfO6NhGN5ItgbKdgfs+y/dh3wgSgM5InAuliKNvO1lWxlob0d5nfdC3Gu9WWtk8ikXz9zR7qYzL3qYJ07ceRy+sLl4hG44hC52B+p9t+7DthAtApyec83ymjH9qsyfG2zkmTfMW5bVd06aK+9IC3DWx/9IHGFurf1WPVY9Sd7e/MxSUikfzEq3RI2w4YzC+9Kd/e9mefCROAsdB4uMS5Te1yW98kSV7pdJq3mE1Duj11B9sXGIxLRKLxnMKAqcXiQq4mB9n+7DNhAjA2kicBUe7SmcoV5pLvOz+z0J6o0kRnf7Wi7QsMziUikXyvpx04NbhJ3VXqPvx5me3PPhMmAGOl8QTJh3Jt21vzKFvbJEi+fcy2Jaq0+t7mtg8wPJeIQuNOUu9qZV9e0sZ0X6b9WU12sv3aV8IEYOwkX+Vs296aN9m6xk3yinPDXBneqvTF6ZW2fiycS0Sh8fbCAKrFnkvaeEDhZzX5sO3XvhImABMh7T+u+1Rb07hJvtrbtiOadFU7X0g65hIRSF585BeFQVSDNIuduVpV8lEK+/Oa/EmmsExmjYQJwERobCP5f8TW0Ipf25rGSWNrabu/BnGW2sTWjtG5RASSb4mwg6gWsx67q3FR4Xdq8hzbv30kTAAmRvK93LaGlkxsIS2Njxe2H8l7xCxfi+64RASS13y2A6kWLzRtfVvhd2ryddu/fSRMACZG485S7/U7g7iDrWkcNO4udV9IPKq32JrRLZdoncZtpd5DYqlds24TkvpXKkxvxFvZfu4bYQIwUVL/bbLzeYCtZxyk7i86o3qDrRfdc4nWabyqMJhq8VXb3iVtnms5x1q80ba5b4QJwERpPL9QRyseb+vpmsb9CtuN4gBbL8bDJVqncXFhQNViL9veJW3+");
    imageData.append("YOF3a3KFWsG2u0+ECcBESX4Smq2jFS+29XRN8lPu7HYjeKmtFePjEi3TeGBhQNUiPaGquEqYxq6F36/NQ227+0SYAEyUxorS7r3tYz1ipvHQwjYjONjWivFyiZZpHFMYVLU4zbZ3mXanB6NcV/ibmhxr290nwgRg4qTdJwYebmvpktS7wukoviQs6ztxLtEqjbUk37duB1YtXmTbbNr/ycLf1CQ9sKWK551PgzABmDhp9xa3Q2wtXZG8ToLdXusuVevZWjF+LtEqjT0LA6sW6fD/bWybTfufWvi72jzftrsvhAnAxGm8tlBLCxbZWrqicWhhey1LD/XZxtaJyXCJVml8qzC4anG6ba+lsY7U/0S0s2y7+0KYAEyc1L2g13xeb2vpgsbK6prC9lr2OFsnJsclWiT1Hxbb27a5ROPLhb+tSVoT4I623X0gTAAmTmO7Qi0tGMsDazSeWNhWyz5ha8RkuUSLNN5ZGFy1SIf/N7JtLtF4ceHva/Nm2+4+ECYAE6exY6GWFrzE1tIFjVML22rVb9VtbY2YLJdojdR/WOxrts1z0dhU6l8C9WfSwzUBhAnAxGk8ulBLC15gaxmVxhbqH4VttWrmiaiYLpdojcYTCoOrJkMtCqLxncJr1OZhtt3RCROAidN4WqGWFuxsaxmVxkGF7bTqLFsfpsMlWqNxcmGA1SLN2Ic6zKXxusLr1OY42+7ohAnAxGm8qFBLC4b6n18ejRUkr8Zpt9OidKHzXW2NmA6XaInGZlL3YbEzbJuXR+q/oDG5Xq1j2x6ZMAGYOKn7uR5zudbWMSqNhxW206ojbX2YHpdoicbrCwOsJvvYNg9C48eF16rNrMcaRydMACZO4/BCLbU7y9YxKo33FrbTonRB9B1sfZgel2iJxmWFQVaLoQ//L1PXIYXXq803bLsjEyYAE6dxSaGW2v23rWNU0sYXgkH07tRh7VyiFRoPKQywmnzdtnlQUvdDjZZ1J9v2qIQJwERp3KlQ");
    imageData.append("Rwv2s7WMQmOrwjZadLPa1taH6XKJVmh8rDDIarKvbfOgJF/088vCa9bmbbbtUQkTgInSeEWhjhbczdYyCo19Ctto0WdsbZg+l2iBxrrqhsIgq0U6/L+xbfcwNI4qvG5trpKePMFLmABMlMYZhTpqd7GtY1Qany9sp0X3s7Vh+lyiBVL/inln2jYPS9pZBGVX2/aIhAnAxGhsK/mCMVtH7d5qaxmF5EXO0sNy7HZa0/nECN1wiRZonFsYZDUZeSlQjVWl7scb3+J42/aIhAnARGisJPX/f89le1vPKDQeWthGiw6ytaEOLlE7jXsWBlhN0sUum9h2L4TGSYXXr81f1Lq27dEIE4CJ0HhDof0tuMzWMiqNgwvbadHWtjbUwSVqp/GewgCryVm2zQul8czC69dooKcdtkyYAIyd5Mn9jYX2t+C/bD2j0vheYTutOdvWhXq4RM0kHxb/TWGQ1aSz24A01lM3FbZRm2/btkcjTADGSmMd9f1C21uQjoJtamsahcbqUvcqp4Pa39aGerhEzTSeUhhgNUmH/7t+Izi9sJ0ahV7fW5gAjI3kie7ZhXa34t22plFp3L+wndakJ5t2cjoU4+ESNdP4SmGQ1WSxbfOoNPYrbKdGB9u2RyJMAMZCY0N1fqHNrUi3I3f+ISf13+k0iB/aulAXl6iVxu0lf8O2g6wmL7XtHpXk54CnmbTdVm1+LoHXBBAmAJ3T2FhdWGhvSw6zdXVB48jCtlrzQVsX6uIStdJ4Y2GA1aTzw/+30DivsL0a7WbbHoUwAeiM5JUu91K/LbS1JdeoDW19XdA4p7C91jzN1oW6uESNJL9h/LQwwGryP7bdXdE4qLC9Gn3Ktj0KYQLQCY3t1LcLbWzRHra+LkheCyFdWGi315rNbG2oi0vUSOMRhcFVm5fZdndF4x6F7dXor2p92/4IhAnASDR2kLy8dYsr/JWcaGvsisbdC9trzeW2LtTHJWqk8cnCAKtJOvw/1tmuxuWF");
    imageData.append("7dZoH9v2CIQJwNA0NlWvVhcV2tSya9VGtt6uaDy7sM3WHGvrQn1cYhAaq6n7qX3VMepMtXiM/iZ+gNUktW/xmKU3HbvdGqXzoosDavlK9dT2xRP2HYnzbd+6Wny9Xar9dOcgrhBfFxbuC+pNanfp8Fozl5iPxprqfdLG4jQAAET0A3V/+xk9LJeYi8ZO0s5haAAAIksrRb5drWo/rwflEiUa/yH134MPAEDfpLU0FvRANpewJF/8xCF/AADq9CH72T0Il5j1Q5FVpN0HdAAA0BdDL8TmErN+KLKosBEAAFCXq9Q69nN8Pi4x64ciVxY2AgAA6jPU6pQusfQHIhsVXhwAANRpqKeyusTSH4g8qvDiAACgTmfYz/L5uMTSH4gcWHhxAABQpz+oFezn+VxcYpkJQITnUQMA0Cfr2c/zubjEMhOA9OQu+8IAAKBeAz+R1SWYAAAA0CwmAAAA9BATAAAAeogJAAAAPcQEAACAHmICAABADzEBAACgh5gAAADQQ0wAAADoISYAAAD0EBMAAAB6iAkAAAA9xAQAAIAeYgIAAEAPMQEAAKCHmAAAANBDTAAAAOihTiYARxZeGAAA1Gs9+3k+F5dYZgLwhsILAwCAOl2nVrCf53NxiWUmALsVXhwAANTpa/azfD4usfQHIrcpvDgAAKjTwfazfD4uMeuHIj8rbAAAANRnD/s5Ph+XmPVDkTcVNgAAAOpylVrHfo7PxyVm/VBkZXVBYUMAAKAO/1S72s/w5XEJS2M7dWNhgwAAYPqOsJ/dg3CJEo391D8KGwUAANNznlrbfm4PwiXmovEAdWlh4xH9Uf2hcTeIrwsAEMPf1SK1sv28HpRLzEdjDfVedVOhMVH8RIZYSKFWGtsXagMAtO8Hagf7vj8slxiExmrqfmpfdYw6Uy2eR7pAwRZQq/1tva3S+HGhvtqlNi+u0Pni29qK1PbFjbhWfPtbk67GXjyin4p/3dZ8Q3xdWJgvSL4rb3e1qX2v");
    imageData.append("XyiX6JrGg8QPjFr9SYa8jaJmkg8P2Rprd5StowYa9y60tRX3tvXUSmMbdU2hhpZcaOsalsaTC6/bmgfaulAXl+iaxkcKA6NWH7Dtb5nGtoUaa5euX1jd1jJtwgRgYiTfefTbQh0t2dnWNQyNzQqv2Zq32bpQF5foksba6s+FgVGjdJpiG1tD6ySfK7K11u6Zto5pEyYAE6Wxg+TJoK2lFZ+zNQ1L2j8NcIGtCXVxiS5pvLAwKGp1mm1/BNLmUx2r2xfCBGDiJJ8+bPWC43Tb9Ea2pmFofKLwuq3Z3NaFerhElzS+XRgQtbpC/IUXEVwovtba3axuZ8fTNAkTgKnQOKRQTyueaOsZhuSLrO1rtuZFti7UwyW6Im2ef0Y9DrRjapqECcBUaKwp+ap6W1MLDrf1DENi3Mr7eVsX6uESXdF4V2EwAIO6zI6paRImAFOj8fRCTS34rq1lGBorStvXQSTXS6A7q6JxiS5orKJ+XRgMwDAebMfWtAgTgKmR/FCyFt9P0kpta9l6hqHx1cLrtuYlti7UwSW6oLFHYRAAw/qwHVvTIkwApkraPaL4MFvLMDTeWHjN1oy8LgLGwyW6oHFKYRAAw0oLM61px9c0CBOAqdK4e6GuFrzQ1jIMjYcXXrNFLApUIZcYlcbmwpMD0Z3n2jE2DcIEYOqkzdMAi2wdw5D8/JV0Ht2+bms+amvD9LnEqKTN+85RrzPtGJsGYQIwdRpnFGqr3TG2jmFpfKbwuq35i1rf1obpcolRaVxe2PnAQqUVGu9gx9mkCROAqdN4d6G22n3V1jEsafcuCOt1tjZMl0uMQmPnwk4HRrXIjrVJEyYAU6fxgkJttbvY1jEsyUuq/7Xw2q35vdrA1ofpcYlRaHy8sNOBUaU10Vew422ShAnA1Gnct1Bb7f5g61gIjS8WXrtFh9raMD0usVAa60k+z2N3ONCFXeyYmyRhAjB1GqtLexcY32TrWAiN5xVeu0XpSEZVy3z3mUss");
    imageData.append("lMRYtxr1+pgdc5MkTACqoPHjQn01+6etYSE01pd2H4xkHWvrw3S4xEJpfLewo4GupFuh1rbjblKECUAVpM07ATo5fSUxVgVM0sO+7mHrw+S5xEJobFfYyUDX9rRjb1KECUAVNM4u1Fe7VWwdC6Gxd+G1W3WOWsnWiMlyiYXQeG9hBwNd+4Yde5MiTACqoHFRob7arW7rWAiN20p710DM5z9tjZgslxiWxqrqt4WdC4zDnewYnARhAlAFjZ8V6qtdZ6euJMaiQLdI1zTcx9aIyXGJYWk8rbBjgXF5mx2DkyBMAKqg8ZtCfbXr7HG4GjsVXr9lP1Kr2ToxGS4xLI3TCjsVGJer1Ip2HI6bMAGogrS3IE4ntwEuS+O8wnZadritEZPhEsPQ2FLyFZ12hwLjtKsdi+MmTACmTmPlQm21+5WtY1Qazylsp2Vpue9n2joxfi4xDI1FhZ0JjNvxdiyOmzABmDqNTQu11e4iW8eoJF939cvCtlp2o3qYrRXj5RKD0lhBXVnYkcC4pRUn17VjcpyECcDUSZvffMfyNEuNNxa21bo/qO1srRgflxiUxq6FHQhMyt52TI6TMAGYOo0TC7XV7tO2ji5IviXwb4Xtte4XwlLBE+MSg9L4VGHnAZPyHTsmx0mYAEyV5PP/1xVqq90RtpauaHyksL0I0loPt7H1onsuMQiNDSXm7BNt2caOzXERJgBTpbFLoa4WLLK1dEVj+8L2orhUbWVrRrdcYhAa+xd2GDBph9ixOS7CBGCqNA4r1NWCp9tauqRxUmGbUVyt7mlrRndcYhAaFxZ2FjBp6XzhRNYTFyYAU6Oxorq8UFcL7m7r6ZLGHSX20dh02ufBtm50wyWWR2OHwk6qWVpu8tGSDyGi7LGS78W1fdeCR9sxOg7CBGBqNF5QqKkF6YN5ZVtP1zQOLWw7krT40xNt3RidSyyPxhGFHVSzL9ga4GksLvRdC06ytYyDMAGYCo01JB/psTW14Pu2nnHQ");
    imageData.append("WE/aXCJ5GOkLSprodPJkRWQuMR/J/4ytXYm7h60Dnsa+hb5rQfqWtYGtp2vCBGAqNA4v1NOKj9t6xkVjv8L2IzpXbW3rx8K4xHw0nl3YITVLTylc1dYBT2Mj9fdCH7ZgP1tP14QJwMRpPKtQS0teY2saF8m3SV5SaENEfxSWDu6ES8xH48zCzqjZB2wNmJvGlwt92ILv2lq6JkwAJkrytUZpxUdbS0seZesaJ43dC22I7Fi1vu0HDM4l5qKxtbR3odgOtg7MTeO5hT5sxT1sPV0SJgATo/EoycvC2jpakk5NrWVrGzeNrxXaElm69iGdvpzI3UDRuMRcNN5e6Pya/cjWgPlprCPtPW71Fu+y9XRJmABMhORz2f8o1NCa02xtk6Bxd2n3f3gUP1QPt/2B+blEicZK0t6VuBM7/xaJxmcKfdmCX8kYb7kSJgBjpbGF+mSh7a16ua1xUqTfC7V9Tnp0kaDkC/N3Ua9Rxy3xIXWA5PesFezfzPp7myjR+PclnduK9A1iM1sHlk/jyYX+bMVjbT1dESYAYyH5DSw92e76Qrtbdmdb6yRJu9fzdCGt/XKCeoDtlwg0Nld7q5PVDYX6l3WF5FO7K9rXmXktmyjR+GzhhWv2ZVsDBqOxuuSrbG2ftuCztp6uCBOATmlsrF6hriq0t3WX2XonTWMTdW2hbX1zjuS7SZpeP0DjvmqROl8Wdi1e+rvN3evahCX5sZNpRmVfsGZjXX87OsmHkWyftuBGGdNTxIQJwMgkTy6fpk6Vdm85HcR7bO3ToPG4Qtv66peSjzQ1cXpAY1P1FHWUdHf6PU227zZrO3bDluRzCfaFapYWKlrd1oHBSV462fZrK8Zy7lWYAAxNYzX1IPUqyUcRW7+yf1A7276YFo0jC+3ru4vVO9ROMseh8UnSWEHyxZsvlvzlKx22t23uSnrtdZdu2zbGktxZ9kVqdrStAcORvKhIq0uLXmDr6YIwAZiT5IuE00V8O6pnSF69");
    imageData.append("72zJR2RsW6K70PbPNGmsKfnRuradyNL7XPrQTYvcpccrr2b7sEvp9dU91B7qQHWK+l2hXeN0wtL22Aaaxj6w8Me129HWgeFJe898WNa9bD2jkrYnAOki3jsM4C5qO3V/9RC1m3q85MP2z1P7qFdKXpP9U+pbkg8rRj6cP6zn2rEzbZLPH7d2Gnda0gXkacKUjli9RfLYTxPbe6ot1fpSWHNA8hMr0zMZbi/5Az79zWPUS9X71VfVT9XN4rc5DdvNtNsWYoo6pvCHNfuJrQELI/kDwPZvKzo/ByttTwAwGelcbZUXm0m7T1SsVbr6/hp1tfqzLOzCvGk6YmZc2IGyzIBZS/2p8Ic1O8jWgYWRfF7q54U+bkG6+rnTN2JhAoDlq3rtEckXwdk2o59+NTMm7CBZZrDsWfijmqVDK1vaOrBwGocV+rkVnT4/XJgAYH7py9J6dtzURvIiMbbt6KcN3QBZZqB8s/AHNTvD1oDRSH4gi+3nVnzR1jMKYQKA+R1qx0yNJF+wmW7DtO1H/+zoBsiSQbJN4ZdrV93FNxFoXFbo6xakC9M2tvUslDABwNwuV2vaMVMryad3v1uoA/2yuxscSwbIOwu/XLN0EcbEn7zVB5KvhLX93YoDbD0LJUwAUJauGm/uziPJKzGO835z1O8ZpYGR7gFPVzfaX67ZsbYOdENj20J/t+KHtp6FEiYAKDvYjpVWSL7ts9X1PjC6vUuD4gmFX6zdzrYOdEfjwkKft2IHW89CCBMAeOn/YlU7Vloied2HdCubrQ3xHVAaEOkJQ/YXa/YzWc4jDzEajdcV+r0VH7D1LIQwAcBsaZXD7e04aZHkRaB+UqgRsS2yA2EzaW9Vr7fYAY1uaWwl7S10cYu0zObI39KECQBulc77P8mOkZZJfujbeYVaEddhdhC8vvBLtWvi6U6t0/h2oe9b8VRbz7CECQCytN7Ic+z4iEBjbfW1Qs2I6Wg7AFq75esbdhBjPDReVuj/VnzJ");
    imageData.append("1jMsYQKAbB87NiLRWFWdWKgb8Zyw7I5vce33vewAxnhobCL50KfdBy1I7d7M1jQMYQKADm8rrZnkB9t8oFA/Yjll2Z3+scIv1OwvssxzjTF+GqcX9kMrXmvrGYYwAeizNIEM/c2/ROPV0t41YRjc4lt29LqSn25kf6Fmx9sBi/HSeGFhP7TiElvPMIQJQF+lNf4fY8dDX0h+JPzPCv2C9n3vlp384sIPa/dIO1gxXpKfhZ1uf7L7ohUPsDUNSpgA9FF6vO+97FjoG8nPuf90oX/Qtstu2cHnFn5Ys/SY2hXtQMX4aXyhsD9acbStZ1DCBKBvzlFb2HHQZ5K/KKZTr7av0KZfKblH4Qe1O8QOTkyGxtML+6MV6XDu2ramQQgTgL74q3qNWsmOAaTukXuqHxX6De25Xs1c6GF/ULtt7cDEZGisKXng2H3Sij1tTYMQJgB98C11V7vvMZvGGupDhf5DW/6m5JTCD2p2jh2QmCyNTxb2Syveb+sZhDABiCxNaF8unFYcisZuwtGAlqXHWM9c6GJ/ULOX2IGIydJ4XGG/tOJkW88ghAlAVGcKq4kumMZKaj/hqYItSrd1N7Xj0iGLDewgxGRprKJ+X9g/LfimrWcQGnctvBbala4H2Vd4kFgnJN8h9G51U6GvUaejVVNv5J+2Aw/ToXFMYf+0YEFPB5T8Taflax+QpS8RH1Zb2n2M0WncRX2x0O+oTzqSK+cXflCr3e2Aw3RoPLywf1qw4Ae5SL5IzL4e2pCOdL5VbWL3K7qn8Qj1zcJ+QB0uWLKf5PDCD2t0jVrZDjRMh+T1wn9Z2E+1u4utZVAa7yu8Hup2qdpHrWH3J8ZPYwd1vHBqoDYzj7NOsWvhhzU62A4uTJe09/joq20Nw9B4auE1Uaez1GOFc/xV0NhcvV3auuYsqs/Lkv+LW3bOdwq/VJPfqfXtoMJ0SV4TIK0mZfdXrR5naxiGxgrq64XXRR2ulnxh033tvkMdJK8hsLdw");
    imageData.append("++C0fEatsnR/LNkpuxR+sSavsAMJdZB8C5DdXzX6sG37Qmhsqf5YeH1M3s2Sl+x9o7qP3Veom8ZOkk+rtXgqsUUfFbPC5bI7402FP6jBYllmxoK6SP5WXPuqYD9V69i2L5S0/VTE1qXJV3owzfPVxnbfoD2SryfaWf23+nVhn2Ph0qOsT5Q5Jsh2R9T2Rv5l4eKd6kmeBHywsP9qcJa6o23zqCQ/GCXdS263h+6kC8d+qD4heX3+XYQvA6FJvt023WGUTuUwGViYdGv/qep16k62j2f1t0uI7KX+XHjRSUqzljQA+GdviORze1cV9uc03KD2lzFeBKaxlXBNQFfStSSnqUPVc9T2wv9/r0n+YrGdeoXkp5BeVxg3ELlS8p0WaWGr9LCmgd/zXGJJx99B8u2Bk56BpWfNpwVm5p21oF4aq0oeiOnC0kn/w6YrjL+k3iwTGkOS36TSExKPUt8Tbnf6u+TJV/oWkm7d/V/J3+LTh/tx6h2S39Cfph6i7qzWsv0KWJJPFaTbCtPRoHR0eNpfVKchPY45vc+k0yXPVLez/TQMl5j1Q5GV1Y6SZ+T/Kfmft2tvUc9W9xEO94ejsanki312GaOdZQyH+RdCY3V1v0IbW5Y+qB8g+X80PT48rfa2ldpM3Uato1aTIb55AKOSPCFIY/HJkj9H0u1tV6h/iv/gbE16LPX3JX+zf4N6guTJcqcPrHIJAABapbG2eqB6kTp4yYdoWpXwfyXfOWI/bKchtSOd9rpA8lHLtDz1gZI/6NOkptMP+rm4BAAAEUk+qn0HyUcN0yH0dDHvAZLvgkvXnxyhPq4+J/lpeelUZjqFle4kulbyIfj04Z1Oc/1W/VxdtuR3zpV819pXJP99emz6kZJfO10flRamSqcw0pGzWbfjTYtLAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjP");
    imageData.append("JQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAAgPhcAgAAxOcSAAAgPpcAAADxuQQAAIjPJQAAQHwuAQAA4nMJAAAQn0sAAID4XAIAAMTnEgAAID6XAAAA8bkEAACIzyUAAEB8LgEAAOJzCQAAEJ9LAACA+FwCAADE5xIAACA+lwAAAPG5BAAAiM8lAABAfC4BAADicwkAABCfSwAA");
    imageData.append("gPhcAgAAxOcSAAAgvv8DP897MU3ii0oAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagefe085c9d4c457892802a1a5cc6d8ad2c = new WeakReference<>(result);
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
g.transform(new AffineTransform(5.21484375f, 0.0f, 0.0f, 5.21484375f, 9165.0f, 13515.0f));
// _0_1_0_0_0_0_0_0_1_0
BufferedImage imagefe085c9d4c457892802a1a5cc6d8ad2c=getImagefe085c9d4c457892802a1a5cc6d8ad2c();
if (imagefe085c9d4c457892802a1a5cc6d8ad2c != null) {
    g.drawImage(imagefe085c9d4c457892802a1a5cc6d8ad2c, 0, 0, null);
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
        return 346.3937072753906;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 510.8031921386719;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 100.91338348388672;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 100.91338348388672;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private strikethrough() {
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
       strikethrough base = new strikethrough();
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
       strikethrough base = new strikethrough();
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
        return strikethrough::new;
    }
}

