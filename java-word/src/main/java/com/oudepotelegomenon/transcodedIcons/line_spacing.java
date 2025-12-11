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
public class line_spacing implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imaged7eb9e5d1898f0acac3856240aeb4363;
private static BufferedImage getImaged7eb9e5d1898f0acac3856240aeb4363() {
    BufferedImage result = (imaged7eb9e5d1898f0acac3856240aeb4363 != null)
        ? imaged7eb9e5d1898f0acac3856240aeb4363.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(11648);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAh50lEQVR4Xu3dfWxd93kfcL5EpPhOvZh6sxzSJCOKsklGk1hZFKVMoezMTosGcFpvTZomTepEqeM6NdY0xRoDdbMN2Lp2zZJ2UNr/ur6pf88oZGx/FEVbdwgGuKkQBK6HYXParW0qdHHjlztdJrKp36Nr8fKec3nuOR8DH0L+SiIvfzz8/R7qee65XbVarQsAqJYQAADlFwIAoPxCAACUXwgAgPILAQBQfiEAAMovBABA+YUAACi/EAAA5RcCAKD8QgAAlF8IAIDyCwEAUH4hAADKLwQAQPmFAAAovxAAAOUXAgCg/EIAAJRfCACA8gsBAFB+IQAAyi8EAED5hQAAKL8QAADlFwIAoPxCAACUXwgAgPILAQBQfiEAAMovBABA+YUAACi/EAAA5RcCAKD8QgAAlF8IAIDyCwEAUH4hAADKLwQAQPmFAAAovxAAAOUXAgCg/EIAAJRfCACA8gsBAFB+IQAAyi8EAED5hQAAKL8QAADlFwIAoPxCAACUXwgAgPILAQBQfiEAAMovBABA+YUAACi/EAAA5RcCAKD8QgAAlF8IAIDyCwEAUH4hAADKLwQAQPmFAAAovxAAAOUXAgCg/EIAAJRfCACA8gsBAFB+IQAAyi8EAED5hQAAKL8QAADlFwIAoPxCAACUXwgAgPILAQBQfiEAAMovBABA+YUAACi/EAAA5RcCAKD8QgAAlF8IAIDyCwE32/XQZ+8amHvXJ0dOf/Azex75hX++5/3/+r6urq7e9M+xvRZWzi/NnTj91OT84pUDUzMv7J+cfhGgag5NH7k6fe/xy/PLZy4urq7tS/fKjUJArWvHHVOTwyd/4PLO2TP/0N274/oqdd2sp/f1ne9Y/e93fPjXvj/9u7TX7NLJSwPDI6+GrxFAxXV3d9d2TRy4duzUuYfTvbMuBFU29cVr3aPnL/6b7v6h19KFvJXuHQO1");
    imageData.append("oePv+9O+Oxf2pu+LfF3/iX9h4vDkS+nXBICb9fT21qaOLT2zdPZC38Z9NGysVXXXv/za4OjZj36t63rFlC7e7fQMjn97YP7dZ9P3ST7ml1cf7R8YfD39OgDQ2O59B7+5uLr2xg+sYXOtovEHPzO4c/bMX6WL1Yyeod2vjq196oH0fZOtek9raHT8lXT9Abi9w7PzX7mxn4YNtooGFx56Ll2krdgxMfOt8Qd/SjsgR3fOzD2frjsAm9VdO3py5Yn6fho22KoZXf3o03GBtm5g/t1X049BNq5ftE+m6w1Ac4ZGx15ZXF2bCJtslYzd/+nTPQNjmfeSR07/8K+kH4vWHZya/Xq61gA0b+7E6c+FTbYq6n3/vkPHrqWLkoXuvsHa2NrjD6Ufk9aM7NrzcrrWADRvcn7x2bDJVkVWff9GvjsPsDv9uGxNffiv/pzWdJ0BaN7606jTjbYKsu77N2IeIDtHl888lq4vAFszMDT8Wthoyy6vvn8j5gGyoQAAyE7lCoA8+/6NmAfIhhYAQHYq1wLIu+/fiHmAbBgCBMhGpYYA29X3b8Q8QOs8DRAgG5V5GmC7+/6NmAdojRsBAbSuMjcC2o6+fyPmAVrnVsAArajQrYC3q+/fiHmA1ngxIICtq8yLAW13378R8wCt8XLAAM2rzMsBF6Xv34h5gNYsrJxfWH8ayy3WFoA39fT21qaOLT2zdPZC38Z9NGysZVCkvn8j5gGyMbt08tLA8Mir6foCVF393im7Jg5cO3bq3MPp3lkXgjIoWt+/EfMA2VlYOb80d+L0U5Pzi1cOTM28sH9y+kWAqjk0feTq9L3HL88vn7lYn5lK98qNQtDpitr3b8Q8AADbIQSdrOh9/0bMAwDQbiHoVJ3Q92/EPAAA7RaCTtUpff9GzAMA0E4h6ESd1vdvxDwAAO0Sgk7TqX3/RswDANAOIegk7ez7d+8YCFke1ucBLjz+YPq5AkCWQtBJ2tX3rx/Kh37mD2v9kyfC");
    imageData.append("7+XBPAAAeQtBp2hn3/+OD/1qbeqL12qHn36+1jM4Hn4/D+YBAMhTCDpBO/v+I/d9YP3wv2Hfx38r/Jm8mAcAIC8hKLrv9P3vaUvfv+/gfG3yF79xUwFQN/bux8KfzYN5AADyEoKia2ff/86ffS4c/nWTv/zXtf6pk+Hv5ME8AAB5CEGRbUffvxHzAAB0shAU1Xb2/RvZ94nfDn83L+YBAMhSCIqoCH3/RsbWPhXeRx7MAwCQpRAUURH6/o2YBwCgE4WgaIrU92/k8NN/VusZ2hXeXx7MAwCQhRAUSRH7/o2YBwCgk4SgKIrc92/EPAAAnSIERVHkvn8j5gEA6BQhKIJO6Ps3Yh4AgE4Qgu02dv+nT3VK37+RfZ/4nVpXd3f4eHkwDwDAVoRgO3Vi37+RsbXHw8fMg3kAALYiBNupE/v+jUx+4W9q/Xcvh4+dB/MAADQrBNtl9OxHfy492PKSdd+/EfMAABRVCLZDGfr+jZgHAKCIQtBuZer7N2IeAICiCUG7DS6+90/SgywP7ej7N2IeAICiCUE7lbHv38jhn/9qG+cB1swDAPCWQtAuZe77N7Lv4u+2cR7gQ19K1xwAbghBO1Sh79/I2AXzAABsvxC0QxX6/o3U5wF23v094bHmwTwAAI2EIG9V6vs38p15gN3h8ebBPAAAtxKCPK33/QfHK9X3b8Q8AADbKQR5qXLfvxHzAABslxDkpcp9/0bMAwCwXUKQB33/xswDALAdQpA1ff/bMw8AQLuFIEv6/ps3duEnwueUB/MAANSFIEv6/pu3Pg8wfSp8bnkwDwBACLKi79+8w5//c/MAALRFCLKg77915gEAaIcQtErfv3Vj9z8RPtc8lGkeYGHl/NLcidNPTc4vXjkwNfPC/snpFwGq5tD0kavT9x6/PL985uLi6tq+dK/cKASt0vdvnXmAzZtdOnlpYHjk1fTzAqi67u7u2q6JA9eOnTr3cLp31oWgFfr+2TEP8Nau/8S/MHF4");
    imageData.append("8qX0cwHgZj29vbWpY0vPLJ290LdxHw0b61bp+2dv/ycvmwe4hfnl1Uf7Bwbbcq0BlMXufQe/ubi6tvfGXho2163Q98+PeYCb1XtaQ6Pjr6SPH4DbOzw7/5Ub+2nYYLdC3z8/bZ0H2Ff8eYA7Z+aeTx83AJvVXTt6cuWJ+n4aNthm6fvnrz4P0Du8J6xHHoo8D3D9on0yfbwANGdodOyVxdW1ibDJNkPfv33MA9S6Dk7Nfj19rAA0b+7E6c+FTXaz9P3bb/yBT4e1yUNR5wFGdu15OX2sADRvcn7x2bDJbpa+f/t9Zx7gvrBGeSjaPEB9+K/+nNb0cQLQvPWnUacb7Was9/3btBlXte/fyF2fv1rJeYCjy2ceSx8fAFszMDT8Wthob0fff/tVcR5AAQCQnaYLAH3/4qjaPIAWAEB2mm4B6PsXRxXnAQwBAmSjqSFAff/iqdo8gKcBAmRj008D1Pcvrv0//nuVmQdwIyCA1m36RkD6/sU3/sBPhrXMQxHmAdwKGKAVTdwKWN+/A3zhb2s7Z06HNc3Dds8DeDEggK3b9IsB6ft3jirNA3g5YIDmbfrlgPX9O0+V5gEWVs4vrD+N5RaPDYA39fT21qaOLT2zdPZC38Z9NGysdfr+natK8wB1s0snLw0Mj7yaPj6AqqvfO2XXxIFrx06dezjdO+tCUNeuvn/d9WKjNvGRXy+0vY/8Qm38/idqu9/3dG3iw18Ov18kd/zIpba1ArZ7HmCjhZXzS3MnTj81Ob945cDUzAv7J6dfBKiaQ9NHrk7fe/zy/PKZi/WZqXSv3CgE7ez70/m2ex4AgK256X/a2fenPLZ7HgCA5r3xi+/2/f8u3dzhdrr7h14vwjwAAJv3xi8GF9/7x+nGDptVpHkAAG5v/c3ouY891NXdEzZ1aMbw8iP/Ob3AACim9Tf9dy//RbqZQ7N6R+54/Y4Pf/lAepEBUDz1f/p/MN3IYatGz33s99OLDIDi6Ro6/r4/Sjdx");
    imageData.append("2Kresf31+/T3pBcaAMXStXNm5S/TTRxaMbLyoYPphQZAsXS9bdehb6UbOLTijg9+yVMCAQquq7tv8LV0A4dW7P2hL/xYeqEBUCxd/ZMnXk43cGjF4L0Pvie90AAolq6hEw9/Ld3AYau6+wbrt5IeSC80AIqla/jUD/1SuonDVg3Mr/3P9CIDoHi6+u9655Hu3h1hI4et2PXQZ381vcgAKJ71NyNnPvJcupFDs3qGdn97+NQ/25leZAAUz/qbQ5/9g/G+g/N/n27osFndfQO1kfs+8E/TCwyAYnrjF0NL33eme0d/fYArbO7wlnp6a7u+72d/Pb24ACium/5n9F2PPtB3ePHbYYOHRrp7asMnf+BSemEBUGwhOPQv/nj38PIPPmswkNvZObvyvwYX3/uu9BoCoPhCcMPw8iPvHFv71G8MHX/fV/vvWrrW3TcYDgAq5PpP+m/bfec/9E+e/B8DR9/9zNiFx384vWYA6BwhqJpw0GVgZOVH/n36cQCgSEJQNenhnQUFAABFF4KqSQ/vLCgAACi6EFRNenhnQQEAQNGFoGrSwzsLCgAAii4EVZMe3llQAABQdCGomvTwzoICAICiC0HVpId3FhQAABRdCKomPbyzoAAAoOhCUDXp4Z0FBQAARReCqkkP7ywoAAAouhBUTXp4Z0EBAEDRhaBq0sM7CwoAAIouBFWTHt5ZUAAAUHQhqJr08M6CAgCAogtB1aSHdxYUAAAUXQiqJj28s6AAAKDoQlA16eGdBQUAAEUXgqpJD+8sKAAAKLoQVE16eGdBAQBA0YWgatLDOwsKAACKLgRVkx7eWVAAtN/CyvmluROnn5qcX7xyYGrmhf2T0y8CVM2h6SNXp+89fnl++czFxdW1feleuVEIqiY9vLOgAGif2aWTlwaGR15NvwYAVdfd3V3bNXHg2rFT5x5O9866EFRNumBZUADk7/pP/AsThydfStcegJv19PbWpo4tPbN09kLfxn00bKxVky5U");
    imageData.append("FhQA+ZpfXn20f2Dw9XTdAWhs976D31xcXdt7Yy8Nm2vVpAuUBQVAfuo9raHR8VfSNQfg9g7Pzn/lxn4aNtiqSRcnCwqA/Nw5M/d8ut4AbFZ37ejJlSfq+2nYYKsmLk7rFAD5uH7RPpmuNQDNGRode2VxdW0ibLJVky5MFhQA+Tg4Nfv1dK0BaN7cidOfC5ts1aSLkgUFQD5Gdu15OV1rAJo3Ob/4bNhkqyZdlCwoALJXH/6rP6c1XWsAmrf+NOp0o62adFGyoADI3tHlM4+l6wzA1gwMDb8WNtqqSRclCwqA7CkAALKjAKjV1yEuTKsUANnTAgDIjhZArb4OcWFapQDIhyFAgGwYAqzV1yEuTKsUAPnwNECAbHgaYK2+DnFhWqUAyIcbAQG0zo2AvitdmCwoAPLjVsAArXAr4DfExWmdAiA/XgwIYOu8GNAG6eJkQQGQLy8HDNA8LwecSBcoCwqA/C2snF9YfxrLLdYfgDf19PbWpo4tPbN09kLfxn00bKxVky5UFhQA7TO7dPLSwPDIq+nXAKDq6vdO2TVx4NqxU+ceTvfOuhBUTbpgWVAAtN/CyvmluROnn5qcX7xyYGrmhf2T0y8CVM2h6SNXp+89fnl++czF+sxUulduFIKqSQ/vLCgAACi6EFRNenhnQQEAQNGFoGrSwzsLCgAAii4EVZMe3llQAABQdCGomvTwzoICAICiC0HVpId3FhQAABRdCKomPbyzoAAAoOhCUDXp4Z0FBQAARReCqkkP7ywoAAAouhBUTXp4Z0EBAEDRhaBq0sM7CwoAAIouBFWTHt5ZUAAAUHQhqJr08M6CAgCAogtB1aSHdxYUAAAUXQiqJj28s6AAAKDoQlA16eGdBQUAAEUXgqpJD+8sKAAAKLoQVE16eGdBAQBA0YWgatLDOwsKAACKLgRVkx7eWVAAAFB0Iaia9PDOggIAgKILQdWkh3cWFAAAFF0IqiY9vLOgAACg6EJQNenhnQUFAABF");
    imageData.append("F4KqSQ/vLCgAACi6EFRNenhnQQEAQNGFoGrSwzsLCgAAii4EVZMe3llQAABQdCGomvTwzoICAICiC0HVpId3FhQAABRdCKomPbyzoAAAoOhCUDXp4Z0FBQAARReCqkkP7ywoAAAouhBUTXp4Z0EBAEDRhaBq0sM7CwoAAIouBFWTHt5ZUAAAUHQhqJr08M6CAgCAogtB1aSHdxYUAAAUXQiqJj28s6AAAKDoQlA16eGdBQUAAEUXgqpJD+8sKAAAKLoQVE16eGdBAQBA0YWgatLDOwsKgPZbWDm/NHfi9FOT84tXDkzNvLB/cvpFgKo5NH3k6vS9xy/PL5+5uLi6ti/dKzcKQdWkh3cWFADtM7t08tLA8Mir6dcAoOq6u7truyYOXDt26tzD6d5ZF4KqSRcsCwqA/F3/iX9h4vDkS+naA3Cznt7e2tSxpWeWzl7o27iPho21atKFyoICIF/zy6uP9g8Mvp6uOwCN7d538JuLq2t7b+ylYXOtmnSBsqAAyE+9pzU0Ov5KuuYA3N7h2fmv3NhPwwZbNeniZEEBkJ87Z+aeT9cbgM3qrh09ufJEfT8NG2zVxMVpnQIgH9cv2ifTtQagOUOjY68srq5NhE22atKFyYICIB8Hp2a/nq41AM2bO3H6c2GTrZp0UbKgAMjHyK49L6drDUDzJucXnw2bbNWki5IFBUD26sN/9ee0pmsNQPPWn0adbrRVky5KFhQA2Tu6fOaxdJ0B2JqBoeHXwkZbNemiZEEBkD0FAEB2FAC1+jrEhWmVAiB7WgAA2dECqNXXIS5MqxQA+TAECJANQ4C1+jrEhWmVAiAfngYIkA1PA6zV1yEuTKsUAPlwIyCA1rkR0HelC5MFBUB+3AoYoBVuBfyGuDitUwDkx4sBAWydFwPaIF2cLCgA8uXlgAGa5+WAE+kCZUEBkL+FlfML609jucX6A/Cmnt7e2tSxpWeWzl7o27iPho21atKFyoICoH1ml05eGhgeeTX9");
    imageData.append("GgBUXf3eKbsmDlw7durcw+neWReCqkkXLAsKgPZbWDm/NHfi9FOT84tXDkzNvLB/cvpFgKo5NH3k6vS9xy/PL5+5WJ+ZSvfKjUJQNenhnQUFAABFF4KqSQ/vLCgAACi6EFRNenhnQQEAQNGFoGrSwzsLCgAAii4EVZMe3llQAABQdCGomvTwzoICAICiC0HVpId3FhQAABRdCKomPbyzoAAAoOhCUDXp4Z0FBQAARReCqkkP7ywoAAAouhBUTXp4Z0EBAEDRhaBq0sM7CwoAAIouBFWTHt5ZUAAAUHQhqJr08M6CAgCAogtB1aSHdxYUAAAUXQiqJj28s6AAAKDoQlA16eGdBQUAAEUXgqpJD+8sKAAAKLoQVE16eGdBAQBA0YWgatLDOwsKAACKLgRVkx7eWVAAAFB0IbhhzyP/7p2D97znN3bOnP7qjn2z17p37AwHHRXS01u7fh18e3Dhof89dv6T/3X03Mc+mF4zAHSOEOzY/47dg4vf+2xP/1A8BGCDnbOr/2ffx3/ze9NrCIDiu+l/xh/8zAO9Q7u/nW700EjP4K7a6Lse/bX0wgKg2N74xd4PfvHM2/a8/fV0g4fNGL7vA1fSiwuA4lp/03fonvEd+4/8fbqpw2Z1v62/tufhf/WR9AIDoJjW3+y8+9Rz6YYOzeq7895/OPTZPxhPLzIAiqfrwE/+/pGe/uGwmcNWDJ94/39KLzIAiqdr9NyP/VK6icNW7ZxZ+av0IgOgeLr63/6PvpZu4rBVvaP7alNfvLY3vdAAKJau3pGJl9NNHFqx9wP/4f70QgOgWOo3/nkt3cChFcPLjzyZXmgAFEtX3+HFb6UbOLRi/KGf/nh6oQFQLF39bz/+l+kGDlvW3V2748Nffnt6oQFQLF2D97znj8ImDlv0tl2Hvp1eZAAUT9feH/rCg929O8JGDlsxdPx9z6UXGQDFs/5m8J73/EW6kUOzenaOvr7nB//tXHqRAVA862/GH/zph7q6");
    imageData.append("e8KGDs0YOvF+LwgE0CHe+MXg4nv/ON3QYbN27Jv51viDP7U7vcAAKKY3fjH+4GcG+w7d83fpxg63090/9PrYhccfTC8uAIrrpv8Zu//Tp3oGx19PN3h4KyOnP/Sl9MICoNhCMHr2oz9Xfy53usnDrQzMr11NryEAii8EdYOL7/2TdKPPy/iDn6lNfOTXC23vI79QG7//idru9z1dm/jwl8PvF8kdP3Kp1ju8J6xzHorU919YOb80d+L0U5Pzi1cOTM28sH9y+kWAqjk0feTq9L3HL88vn7m4uLq2L90rNwpB3XfnAa6lG34e+g7O1yZ/8Rv1V5AjA+MP/GRY4zx09w3WitD3n106eWlgeOTV9PEBVF13d3dt18SBa8dOnXs43TvrQnBDO+cBRu77QDjIaN7+H/+99Vvxpuubh+3u+1//iX9h4vDkS+njAuBmPb29taljS88snb3Qt3EfDRvrRu2cB7jjQ78aDjQ2767PX23bP/1vd99/fnn10f6BwbYUpwBlsXvfwW8urq7tvbGXhs011a55gPo/Kd/5s8+Fg41N+MLf1nbOnA5rmoft7vvXe1pDo+OvpI8LgNs7PDv/lRv7adhgU+YBiq9Kff87Z+aeTx8XAJvVXTt6cuWJ+n4aNthbMQ9QXFXq+1+/aJ9MHxMAzRkaHXtlcXVtImyyjZgHKJ4q9f3rDk7Nfj19XAA0b+7E6c+FTfatmAcojskv/E1t5/R9Ye3ysN19/xtGdu15OX1sADRvcn7x2bDJvhXzAMUx/sCnw5rloQh9/7r68F/9Oa3p4wOgeetPo0432tsxD7D99n/ycmX6/jccXT7zWPrYANiagaHh18JGuxnmAbZP1fr+NygAALKz5QKgzjxA+1Wx73+DFgBAdrbUArjBPED7Va3vnzIECJCNpocAU+YB2qeKff+UpwECZKPppwHeyvo8wC3eeR6qOg9w+PN/Xsm+f8qNgABa1/SNgN6KeYD8fKfvfyqsRR6K1ve/");
    imageData.append("FbcCBmhFk7cCvh3zAPkZu/+JsAZ5KGrfP+XFgAC2rqkXA9os8wDZ0/e/NS8HDNC8pl8OuBnmAbJT7/v3DO0On3ceitz3b2Rh5fzC+tNYbvH5APCmnt7e2tSxpWeWzl7o27iPho21VeYBWtfWvv9E8fv+b2V26eSlgeGRV9PPC6Dq6vdO2TVx4NqxU+ceTvfOuhC0yjxA6/T9m7ewcn5p7sTppybnF68cmJp5Yf/k9IsAVXNo+sjV6XuPX55fPnOxPjOV7pUbhSAL5gG2bt/F39X3ByB3IciKeYDm6fsD0C4hyJJ5gM3T9wegnUKQJfMAmzd24SfC55SHMvX9Adi6EGTNPMDt6fsD0G4hyIN5gMYO//xX9f0BaLsQ5MU8QLTe97/7e8LnkAd9fwA2CkFezANEYxceD489D/r+AKRCkCfzAG/S9wdgO4Ugb+YB9P0B2H4haIcqzwPo+wNQBCFohyrPA+j7A1AEIWiX9XmAgbFKzQPo+wNQFCFopyrNA3yn778rPK486PsDcDshaLcqzAPU+/79dy+Hx5QHfX8ANiME7VaFeYCxNX1/AIolBNuhzPMA+z7xO23s+//wr6RrCwC3EoLtUsZ5gMNP/1kb+/7v1vcHYNNCsJ0GFx56Lj3Y8tCOeQB9fwCKLATbqUzzAPr+ABRZCLZbGeYB9P0BKLoQFMHo6kefTg+6vGQ9D6DvD0AnCEFRdOI8wOQv/3Wtf+pk+Bh50PcHoBUhKIpOnAcYW/tUeN950PcHoFUhKJKx+z99ulPmAfZ94rfD+8yLvj8ArQpB0XTCPIC+PwCdJgRFVOR5AH1/ADpRCIqoyPMA+v4AdKIQFFUR5wH0/QHoVCEosiLNAxx++vlaz+B4+Ht50PcHIGshKLoizAPo+wPQ6UJQdEWYBxh792Phz+ZB3x+AvISgE2znPMC+j/9W+DN50fcHIC8h6BTbMQ+g7w9AWYSgk7RzHuDQz/xhrX/yRPi9POj7A5C3EHSS78wD");
    imageData.append("HGvLPED3joGQ5UHfH4B2CEGnaec8QDvo+wPQDiHoRO2cB8iTvj8A7RKCTtWueYC86PsD0E4h6FTtnAfI2nrff+3xh9LPCQDyEoJO1qnzAPr+ALRbCDpdp80D6PsDsB1CUAadMg+g75+dhZXzS3MnTj81Ob945cDUzAv7J6dfhKI7/I5jfzr7zuUv3XPfue9dOnuhL72uIU8hKINOmAfQ98/G7NLJSwPDI6+m6wud5m07dtQOTR/56uLq2oH0Ooc8hKAsij4PoO/fmus/8S9MHJ58KV1X6HRDo2OvHF0+81h6zUPWQlAmRZ0H0Pdvzfzy6qP9A4OFLe6gVd3d3bWpY0vPpNc+ZCkEZVO0eQB9/9Ysrq7tGxodfyVdVyibehHgXwLIUwjKpkjzAPr+rbtzZu75dF2hrOrtADMB5CUEZVSUeQB9/9YcPbnyZLqmUHb1wcD0ewGyEIKy2u55AH3/1h2cmv16uq5QdvVnB3iKIHkIQZlt1zyAvn82RnbteTldW6iC+n0C0u8HaFUIymw75gH0/bNRH/6rD0Wl6wtVUL9ZUPo9Aa0KQdm1ex5A3z8b9WnodG2hKup3DEy/J6BVIaiCds0D6PtnRwFAlSkAyEMIqiLveQB9/2xpAVBlWgDkIQRVkec8gL5/PgwBUlWGAMlDCKokr3kAff98eBogVeRpgOQlBFWT9TyAvn9+3AiIKnIjIPISgirKah7gu33/ven7JztuBUyVuBUweQpBFdXnAfrvWvq/6TdfM3oGx18fW/vUP0nfN9nyYkBUhRcDIm8hqKqdMyvjO/a94xvpN+Fm9Owcfn1k9UcfSd8n+fBywJSdlwOmHUJQZdf/G9k5e+Yr6TfjW9kxMfP/Rs/92PvT90W+FlbOL0wcnnwp/XpAp6v/s7+f/GmHEFDrGv3Hn/ipvoPz3+h6i+ed947t/9bOmZVL13+9I/37tM/s0slLA8Mjr6ZfH+g09Wn/+sCfnj/tEgLe1H/X0tzQO7//");
    imageData.append("P173hzvv/p7/tvMdZ//L0NL3/ebI6o9+7Po3bHf659k+Cyvnl+ZOnH5qcn7xyoGpmRf2T06/CEVXv8Nf/SY/9ef5e6of7RYCAKD8QgAAlF8IAIDyCwEAUH4hAADKLwQAQPmFAAAovxAAAOUXAgCg/EIAAJRfCACA8gsBAFB+IQAAyi8EAED5hQAAKL8QAADlFwIAoPxCAACUXwgAgPILAQBQfiEAAMovBABA+YUAACi/EAAA5RcCAKD8QgAAlF8IAIDyCwEAUH4hAADKLwQAQPmFAAAovxAAAOUXAgCg/EIAAJRfCACA8gsBAFB+IQAAyi8EAED5hQAAKL8QAADlFwIAoPxCAACUXwgAgPILAQBQfiEAAMovBABA+YUAACi/EAAA5RcCAKD8QgAAlF8IAIDyCwEAUH4hAADKLwQAQPmFAAAovxAAAOUXAgCg/EIAAJRfCACA8gsBAFB+IQAAyi8EAED5hQAAKL8QAADlFwIAoPxCAACUXwgAgPILAQBQfiEAAMovBABA+YUAACi/EAAA5RcCAKD8QgAAlF8IAIDyCwEAUH4hAADKLwQAQPmFAAAovxAAAOUXAgCg/EIAAJRfCACA8gsBAFB+IQAAyu//Ax0p9rNP401hAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imaged7eb9e5d1898f0acac3856240aeb4363 = new WeakReference<>(result);
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
BufferedImage imaged7eb9e5d1898f0acac3856240aeb4363=getImaged7eb9e5d1898f0acac3856240aeb4363();
if (imaged7eb9e5d1898f0acac3856240aeb4363 != null) {
    g.drawImage(imaged7eb9e5d1898f0acac3856240aeb4363, 0, 0, null);
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
	private line_spacing() {
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
       line_spacing base = new line_spacing();
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
       line_spacing base = new line_spacing();
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
        return line_spacing::new;
    }
}

