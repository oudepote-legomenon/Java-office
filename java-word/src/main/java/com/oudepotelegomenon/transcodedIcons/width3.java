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
public class width3 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image00c90e12c2165d80c654adcccc3ca716;
private static BufferedImage getImage00c90e12c2165d80c654adcccc3ca716() {
    BufferedImage result = (image00c90e12c2165d80c654adcccc3ca716 != null)
        ? image00c90e12c2165d80c654adcccc3ca716.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(10080);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAdT0lEQVR4Xu3db6zt2VkXcMoM60JxptLOndtGeGVIjamJLyBo6YAJg9WABgShMUI0/kGltDSKUmKaxsQXxkgCqSIitrTV+gIjsY0vpNiAGgGR6ZQa0DfFGK3IaNsoxAAdXNtzTxl+z+/ee+45e+39rPV8Xnwy7Xfac35777XW+e619p9Pe+SRRz4NAKglBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAAKwvBADA+kIAo7XWHu+e6r62+6Pda27duvWS7f8OVnR3/H9x91Xd13e/z/jnHEIAIzz22GOf3he613Uf6D7Z/frGr939d193+N9u//8wuRf1sf013fu7X9kZ/893P9r9MeOfUwkBHFu7eLbzzM6idy//rnvV9ufAjPqz+1f28fxTO+P8Xp7tvmT7c+DYQgDH0hexO9072sWzm+0i9yD/u/sD258JM+lj+Pd3H98Z3w9ymDPv6uXhFdufCccSAripvnA92n1L97Gdhe1h/HL3e7Y/H2bQx+7v7v7Pzrh+GJ/ovrV7dPvz4aZCADfRLrb7P7izkF3XR/qzoMe2vwcy6+P2s7qf3xnP1/Wh5liAIwsBXEdfnF7WfVfbf4HfTb11+/sgsz5m37wzjo/hvb0Qf97298F1hAAeRjvedv/9PNcXvbb93ZBRH6uP9DH7P3bG8bE4FuAoQgBX1Y6/3X8/r93+fsioXXzGxXb8juBYgBsJATxIu9mr+6/rLdvrgIz6WP2OnfE7incLcG0h");
    imageData.append("gHu5+2E+39g9t7MQjfb92+uBjPpYfdvO+B3t8G6Dtzoq42GEAPa002737/nB7TVBRn2s/qOd8XsqjgW4shDAC7Wxr+5/GAoAU+hj9T074/fUvFuABwoBHJx5u3+PAsAUWo4CcOBYgPsKAfRF4wu7n9xZUM5JAWAKLU8BuPRz3ZdvrxNCQF0tz3b/HgWAKbR8BeCSYwF+kxBQT8Lt/j0KAFNoeQvAgWMBPiUE1NJybvfvUQCYQstdAC45FkABqKrl3u7fowAwhTZHAbjkWKCwELC2Sbb79ygATKHNVQAOHAsUFQLW1ebZ7t+jADCFNl8BuORYoJgQsJ4233b/HgWAKbR5C8AlxwJFhIB1TLzdv0cBYApt/gJw4FiggBCwhjb3dv8eBYAptDUKwCXHAgsLAXNra2z371EAmEJbqwBcciywoBAwp8W2+/coAEyhrVkADhwLLCYEzKett92/RwFgCm3dAnDJscAiQsA82rrb/XsUAKbQ1i8AlxwLTC4E5Fdgu3+PAsAUWp0CcOBYYGIhILdWY7t/jwLAFFqtAnDJscCEQkBOfXLd6d7RPb8z+bI4XNs7u/fv/LubUgCYQhtTAD7Qvb3ln//vunXr1iu29wk5hYBcJtru/9nu6cM1tzELoALAFNrA8d//+QXdT+z8+0wcC0wiBOTR5tjuD5O9DVwAIbs2ePxP9KTAsUByIeD82jyv7n9v97k71z90AYTM2onGf89e2iZZJ7xbIKcQcD4TNftPbffvaSdaACGjduLx3xwLcE0h4DzapNv9e9qJF0DIpJ1h/E/05MGxQCIh4LTa5Nv9e9oZFkDIop1x/DfHAjyEEHAaEzX2+27372lnXADh3FqC8d8cC3AFIWC8ttB2/56WYAGEc2lJxv9ETzIcC5xJCBinLbjdv6clWQDhHFqy8d8cC3APIeD4JmviD7Xdv6clWwDhlFrS8d8cC7ARAo6rLb7dv6clXQDhFFri8T/ZkxHHAoOFgONoRbb7");
    imageData.append("97TECyCM1iYY/82xAI8oAEfXB+yj3Ru6j+0M5kye7Z7aXv8xtDEL4C90PwwT+O8tjt+bOmoBuNR/7hd3z+z8vkw+0X1r9+j2+rmZEHB9reB2/542pgBAZUMKwIFjgbpCwMNrhbf79zQFAI5tWAG41BwLlBMCrm6y5nzjV/dfVVMA4NiGF4BLzbsFyggBV9Ns999TUwDg2E5WAA4me3LjWOCaQsD9Ndv9D9QUADi2kxaAS22i9c6xwMMLAfsma8Qn2+7f0xQAOLazFIBLzbHAkkJA1Gz3P5SmAMCxnbUAHEz2JMixwBWEgN/QJtr+amfa7t/TFAA4trMXgEttonXRscD9hYDpmu5Zt/v3NAUAji1NAbjULo4F7IxOLATV9cHymu6DOwMpk493b2xJPxmrKQBwbOkKwEH/w/pIv7Zvafk/+fRD3Zdsr7+6EFTVJtrWaom2+/f06/venesGru/7t/MskzbR+ulY4DeEoBrb/cfXr/OtO9cPXN9f286zjJpjgamEoJI2z3b/VF+E0a/1q3duB3B9X7udZ1k5FphHCCpoE21XteTb/Xv6AvDift2/tHN7gIf3f/ucemw7z7JrE62zVY8FQrCyNs9X9R6a6ZCv6j2Vfv3ft3O7gIf3D7bzaybt4iuHs++0Hr5y+E1top3WYwjBqprt/pPqt+G3NbsAcFO/vMKzU8cCOYVgNc021Nn02/QNO7cTuLo/vZ1XM2vW41RCsIpmuz+FftvesnObgQd763Y+raI5FkghBCtotvtT6bfxj7eLt95s7wMgOsyVb9jOo9U4Fji/EMysP0h3uh/ont95ELM4XNu7updvr39lfbK/ot/m72mKANzLYW783cNc2c6flbWLdfsdLf+6/e7VHpsQzKjZ7p9Gv/2f2X1F9+buu9vFpwZCVYc58OZ2MSc+aztfKmmOBU4uBLNpvqoXYAmTfTLr9F85HIJZ9D+mv6VdNOjs20bltvsBbqLNcyzwfTN+SNOlEMyg");
    imageData.append("3+kv757ZeUAyWfaFIwCn0OY4FvjgrK8NCEF2d5/5//TOg5DF4YyoxKv7AUY7rKUt/7sFnjn8bdpee3YhyK7f0X9n587PosSHRwCcWsv/IULfs73m7EKQWb+Df2fL+eDb7gc4gZb3WODwmoBXba83sxBk1u/cv7dzp5+T7X6AEzusuS3nscDf315rZiHI6u7bQ35x5w4/B6/uBzizlu/D3/7n4W/V9jqzCkFW/Y79/J07+xxs9wMk0nJ9/Pvv2F5fViHIqt+pT+/c0afkw3wAkkr0IUKv3V5bViHIql18VOb2jj6lv9Gc9QOkdViju7++s36f0ldtryurEGTVLl75ub2jT+1nui/dXhsA59XX5qe6Z3fW7VOb5og4BFn1O/VzWp4Xeni/P0AC7eKTYd/Z8vx9eGJ7jVmFILN+x/77nTv7XLwmAOBM2sV2/xu7j++sz+fyzPY6MwtBZu3iK3+3d/i5ORYAOKGWZ7t/603ba80sBJn1Z9sv7nfwf92508/tsPX07lm/EAJgBi3fdv8LfbT77O01ZxaC7Pod/Idbzgf/4PDJgG9q3i0AcDSHNbXl2+5/ocPfpGle/X8pBDPod/Rf3XkAMnEsAHAELe92/wu9ZXvdMwjBLNrFM+1f3XkgsnAsAHBNLfd2/6XD36C/uL32WYRgJv2O/8LumZ0HJRPHAgBXdFgrW+7t/kuHXYkv2l7/TEIwm/4M+5H+ILy+5ftWqC3HAjvaxec7QEnb+VBdm2O7/1BMDgVl+id1IZhVLwJP9gfk7S33dlHpY4F+21/a/dnufd1/6X5l5z6CSg5z4DAXDnPim7qXbudNBW2O7f7DtR2ucZlvgQ3B7Pof11c3xwKp9MfkM/pt/Sst/y4NnNthjnx7lQ8Ya3Nt9z+1vf7ZhWAFL/hWqF/ceSAz+bnuy7fXv5J28az/R3ZuO3Bv/7q7s51PK2lzbPcv/YmvIViJY4Hz6rfpsXbx2oftbQYe7MPd49t5Nbtmuz+N");
    imageData.append("EKzIscB59NvyQzu3E7i6f7adV7NqtvvTCcGqHAucVr8NX7lz24CH94e282s2zXZ/SiFYnWOB02i5vrkRZvbB7fyaRbPdn1oIqugP9hd0P7EzGDKZspH2a/7tO7cFuKa+BrxyO88ya/Ns9/9s9/T2+qsIQSU+RGiMfq3fvHMbgOt7w3aeZdWv9TUt/3b/Mh/mcxMhqKhdvFXtu7pP7gyUTN7bS8vnba8/m36df3Pn2oHr+87tPMumX+PL2iTraPe52+uvKASVebfAcbSL87TtdQPX957tPMuiXWz3v6Hl3+4v8+r+qwpBdd4tcHP9ut6zc73A9f3gdp5l0C6+kO0nd643kylfS3UKIeBCcyxwbU0BgGNLVQCa7f4lhIDfrHm3wENrCgAcW4oC8IId0ud2rjGT0q/uv6oQEDkWeDhNAYBjO3sBaLb7lxMC7q05FriSpgDAsZ2tADTb/csKAQ/WHAvcV1MA4NhOXgBs968vBFyNY4F7awoAHNtJC0Cz3V9CCHg4zbFA0BQAOLaTFIBmu7+UEHA9zbHApzQFAI5taAGw3V9TCLg+xwIXmgIAxzasADTb/WWFgJu7Vfwrh9uYAvBj3dMwgQ+0OH5v6ugFoP/MO90PtPzrVMmv6j2FEHA8reixQBtTAI6+AMIILfn4t93PpRBwXBWPBVryBRBGaonHf7PdzwuEgDFaoXcLtMQLIIzWEo7/5tX97AgBY7UCxwIt4QIIp9ISjX/b/dxPCBhv9WOBlmgBhFNrScZ/s93PA4SA02mLHgu0JAsgnEM78/hvtvu5ohBwem2xY4F25gUQzqmdafzb7udhhYDzWOlYoJ1pAYQM2hnGf7PdzzWEgPNqCxwLtDMsgJBFO+H4b7b7uYEQkEOb+FignXABhGzaCca/7X6OIQTkMeuxQDvBAghZtcHjv9nu50hCQD5tsmOBNngBhMzaoPHfbPdzZCEgr/7H9dV9Yj2zM+Ey+UT3kZ38phQAptDGFID/3H1s");
    imageData.append("J8/k2e6p7f1BXiEgt4mOBY5NAWAKbUwByMx2/6RCwBzaPMcCx6IAMIVWqwDY7p9YCJhLm+PdAsegADCFVqMAeHX/AkLAfIocCygATKGtXQBs9y8kBMyrrX0soAAwhbZuAbDdv5gQML+25rGAAsAU2noFwHb/okLAGhY8FlAAmEJbpwDY7l9cCFhLW+dYQAFgCm2NAmC7v4AQsKY2/7GAAsAU2twFwHZ/ISFgXZMfCygATKHNWQBs9xcUAtbX5jwWUACYQpuvANjuLyoE1NHmOhZQAJhCm6cA2O4vLgTUMtGxgALAFFr+AmC7n/8vBNTU8h8LKABMoeUuALb7+ZQQUFvLeyygADCFlrMA2O4nCAEkPRZQAJhCy1UAbPdzTyGASy3XsYACwBRangJgu5/7CgFstRzHAgoAU2jnLwC2+7mSEMCeW7duPdIXldd3H9tZcE7hH2+vCTLqY/VdO+P3FD7evbF7dHtNsCcEcD+9CDzZF5i3d8/vLEAjvW17LZBRH6vfvTN+RzrMxXd2L99eC9xPCOAq2umPBf7c9hogoz5Wv2ln/I5iu59rCwFc1SmPBfrveuX290NGfbx+/nb8DmC7nxsLATysExwL/Nvt74TM+pj9Nzvj+Bhs93M0IYDr6kXg1X1hemZn0bqpP7j9XZBZH7Ov3RnHN/Vs99T2d8F1hQBuYsCxwD/c/g6YQTveuwFs9zNECOAYjnQscHiR4WdvfzbMoM+BF/fx++M74/qqbPczVAjgmG5wLPDPu8e3Pw9m0sf/Y30cv29nfD+I7X6GCwEc291jgT/f/bedhW7ro+3iLX8v2v4cmNSL+pj+Mw8x/g9HaLb7GS4EMEpf1D6z+7p2sa35M+3iy4aeu/uf39297vC/2f7/YAV3x//Xt4vXBnzo7tg/zIEP350Th7lh/HMyIQAA1hcCAGB9IQAA1hcCAGB9IQAA1hcCAGB9IQAA1hcCAGB9IQAA1hcCAGB9IQAA1hcCAGB9IQAA");
    imageData.append("1hcCAGB9IQAA1hcCAGB9IQAA1hcCAGB9IQAA1hcCAGB9IQAA1hcCuHT79u1XPfnkk9/Wva37of7ffxjI7e5c/dvdX+5+13Zew6UQQF80vrovIh/ufh2YW5/P/6H7I92LtnOd2kJAXX2xeLx733YBAZZwmNsv2c576goBNT3xxBMve9Kzflja3d2AJ7bzn5pCQD19YfiMvij8yHaxANbT5/q/unPnTtuuA9QTAurpC8Jf2i4SwNK+bbsOUE8IqKUvBC/pnttZIIBF9dL/v5544onful0PqCUE1NIXgz+xXRyAEv7kdj2glhBQS18E/snOwgCs759u1wNqCQG13L59+z/uLAzA4vrc/0/b9YBaQkAtfRH4xHZhANbX5/4vbdcDagkBtfRF4JPbhQGo4c6dO5++XROoIwTUogBAXQpAbSGgFgUA6lIAagsBtSgAUJcCUFsIqEUBgLoUgNpCQC0KANSlANQWAmpRAKAuBaC2EFCLAgB1KQC1hYBaFACoSwGoLQTUogBAXQpAbSGglhEFoP/M9/d/fi9wHH1O/Ysnd+baTSkAtYWAWkYUgO51298DXF+fp1+zM89uTAGoLQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJTABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqUQAgPwWAEUJALQoA5KcAMEIIqEUBgPwUAEYIAbUoAJCfAsAIIaAWBQDyUwAYIQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJT");
    imageData.append("ABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqUQAgPwWAEUJALQoA5KcAMEIIqEUBgPwUAEYIAbUoAJCfAsAIIaAWBQDyUwAYIQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJTABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqUQAgPwWAEUJALQoA5KcAMEIIqEUBgPwUAEYIAbUoAJCfAsAIIaAWBQDyUwAYIQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJTABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqUQAgPwWAEUJALQoA5KcAMEIIqEUBgPwUAEYIAbUoAJCfAsAIIaAWBQDyUwAYIQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJTABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8");
    imageData.append("FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqUQAgPwWAEUJALQoA5KcAMEIIqEUBgPwUAEYIAbUoAJCfAsAIIaAWBQDyUwAYIQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJTABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqUQAgPwWAEUJALQoA5KcAMEIIqEUBgPwUAEYIAbUoAJCfAsAIIaAWBQDyUwAYIQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJTABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqUQAgPwWAEUJALQoA5KcAMEIIqEUBgPwUAEYIAbUoAJCfAsAIIaAWBQDyUwAYIQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJTABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqUQAg");
    imageData.append("PwWAEUJALQoA5KcAMEIIqEUBgPwUAEYIAbUoAJCfAsAIIaAWBQDyUwAYIQTUogBAfgoAI4SAWhQAyE8BYIQQUIsCAPkpAIwQAmpRACA/BYARQkAtCgDkpwAwQgioRQGA/BQARggBtSgAkJ8CwAghoBYFAPJTABghBNSiAEB+CgAjhIBaFADITwFghBBQiwIA+SkAjBACalEAID8FgBFCQC0KAOSnADBCCKhFAYD8FABGCAG1KACQnwLACCGgFgUA8lMAGCEE1KIAQH4KACOEgFoUAMhPAWCEEFCLAgD5KQCMEAJqGVQA/lT3OcBx9Hn6jU/GeXZjCkBtIaCWQQUAmIACUFsIqEUBgLoUgNpCQC0KANSlANQWAmpRAKAuBaC2EFCLAgB1KQC1hYBaFACoSwGoLQTUogBAXQpAbSGgFgUA6lIAagsBtSgAUJcCUFsIqEUBgLoUgNpCQC29APzqdlEA1tfn/vPdi7ZrAnWEgFr6AvDR7cIArK/P/V/YrgfUEgJq6YvAT20XBmB9fe7/9HY9oJYQUEtfBP7WdmEASvjO7XpALSGglr4IvGZnYQDW96Xb9YBaQkA9t2/f/pc7iwOwrh/3AkBCQD19Ifgi7waAGg5zvfu923WAekJATX1BeP12oQDW0+f6G7bzn5pCQF19Yfj22z4YCJZ0mNvdd2znPXWFgNr6AvEV3Ue2iwcwrz6nf777yu18p7YQQF8wbvXF4i90P9r92nYxAfI7zN3ux7pv7v/91naeQwjghfrC8XhfQF7V//ll3dNAel92d86+ZDuf4YVCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQA");
    imageData.append("wPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPpCAACsLwQAwPr+H4OrHbhGmnZvAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image00c90e12c2165d80c654adcccc3ca716 = new WeakReference<>(result);
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
BufferedImage image00c90e12c2165d80c654adcccc3ca716=getImage00c90e12c2165d80c654adcccc3ca716();
if (image00c90e12c2165d80c654adcccc3ca716 != null) {
    g.drawImage(image00c90e12c2165d80c654adcccc3ca716, 0, 0, null);
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
	private width3() {
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
       width3 base = new width3();
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
       width3 base = new width3();
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
        return width3::new;
    }
}

