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
public class selection_pane_icon implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image39e001b671e850c9e528f31803c5470f;
private static BufferedImage getImage39e001b671e850c9e528f31803c5470f() {
    BufferedImage result = (image39e001b671e850c9e528f31803c5470f != null)
        ? image39e001b671e850c9e528f31803c5470f.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(15596);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAHQAAACECAYAAABBCA8+AAAteElEQVR4Xu19aZhWxbXu1wQckmjikOg95iQOaE7ibERoMMcbBdTEOOUkJ4jmPopAzn2iyQ8zqGiu6DGKiDHJjaAxRqPilJwkGlFRI5AoDqAoKiLKIAoK0t/Q/mj4UbfeNdWq/XUDdm/bc5/n+1HP3rtq1XpX1RpqVe39dVcajUZo1DtDozNecS+l7u8763IFrdQX6FE6C8+NRqfV8bUzp1VeLfwmfr3Fr3R2gllneC8W3PO1Yc9a3oNwne9lNNTWeC8+yz09K59UB/7+SvfvuXvj2cLvK36l0aiHej1ZVx0ATuMQsA7L6ixYjV1ZoKK1cH/Us3XRs1habskt/DLxyUOZmQCTS8t9J0qdrp1UzwISENoccAonbnBKQ1euhyAabui+hV8qfiUTQBrZKlId1UMAWIIwqiPum5Bw92SJJBRoRbgiLwjJQiRBWvjl4Fe0Q12tAgWd6gIq7pwESPQUxwv1XNAX/RJPEpQGCt4FqxR+LXzp3wf8imZNLIASJ8Z1Y8yW4Jl7t7dQIrTgm9rV4pzQWtfCLxW/YlZAjQyYmIsAhTYTXITR4q3SBqADIx7SNwrJzyJcC78Jo7f4lcwKVCBZiEkAChNgxhZFgoow2Bd1KigBJWsyYcETPDAIaUtY/NzCLw+fkyLrhA4qAHdKQiTLMHAF9WAoWLCJZ+pvvIROQ0QLv1z8igkhi68y5oJ7eRYAZFrKWIUr0hioDIQzNLVCwRDrKgN/xVWjYzk2rJhyrN2vxPNUuY/1y2M91VGJ9VNBMzrW8/PKqa7NrlxAx7wjH+qntPF5itIl/P4ev6ehgwVrqKv2UaRjJ2sf934RtqJCS/9iO+pNaDyT9anwqOs7Pk86JlQmVybf6k1JrFyveFUaFI56Up7S4joVxsD1SenKO/Hw+P09fsURhTpldNOB25IFJOFEKP+s/R0fpgdtnWJ+kX/CyPvl");
    imageData.append("bZvH10nuXDY9lhmhEUvnq7hOD41XY92r18cy3eqL5T1cl0pf9JN6XK3N1YGX76981Uj6e/z2HPtXanU+esLCjL0NrmBQr9XiPYqrE1rccz9f70qNS6MmfKWP0TeEb0359A1fvSxT1FK9Z0WRYrRA8aIoVZ7SJR6gSYrj/vyMezaURItn9tBj+338SoNSyWJ2wQLg4vqssZpSajAV+qJFkVXZAl8MOWJV9HahmzWjl/gaHosKwySnyWdPJQUuhVfBa51ytZ7oxTvJY1npVJaB3/WJznkuisnRz+P3paKbVXN5R8TxnLMo30mZ88JedH1pBy8LIU7ownMZ+Brq1MNIabg3j9OJb74mDxV682x4Irerd7NitY96PoyE+Wno7+/x+7aKd3V2YXVz5/IIEQgjuEcYATNze35O4UGvjSwUaB360HpC/JR/oukNPhIXSkYyZXVfyGuLiqbnZmWbwr0XCz17fnoGrSZI/T1+P/909MchQkMAWwVrPGk/hQItaFNLkytSarIa5kMCNvBcdwkBhwx77VMCPmWZU9hDTVkSLnFPnuaU0qCQK4pYCgVzOE795N6VZCzKhxMtbwQWcvt5/H7+KcvNiAHgiRr6rGCpaEhQYfEGALxo4fZ0kqbzK6ACT9C7+97gL5f9JimKvKropawgKFYnn++7UdbS5qTHaM2zuQ+H4uvNWHQ71N/j9/PPIVdLg0MCuS8RsDvXKHzUyM05++J6Ch3Wl8MAh41U5zM14m2ZnaMz+t7h0xo6FUlRQZFZKBXFidJRb2Ez82rpo/dyNQVLImQe7rB0X9rf41cstNvrM9Z4sgpdnLWOzxT1rUGDMzChseOqggVxcaFBwzGFm2b63uLTaU/cMmCt80kO37vQWAjJRYV7ry2GU1OyeCNlwJRACWa8X6mRop/H7+efFeoYUwd1YesMoUQIAsGVgUCja4YXxBc9a0QfDR/UT2n7iK/HfF6ZXjEpgcG9eBiUohltIZSqou0gwq7e");
    imageData.append("250XCw0lRVOKCv3gx+/nXzxUASXWCyMucOfcyvgFLdfxcRT3U15E6+szGu0DflrXN3ydSPYm8UibfJ54rwj2UqUtKrLZUzlJSl7u21LG7E6K+nn8fv4rTamzpsd6mtFTvK+ntYBLLdSIB0KB40N9Je2OgDU6PREaou87vm4XUiY73faTnLzIs4VJoaGwq4rCNfVr2qpISVGgsIeNz3QejH2oHwfJ/sGOnwvPv0uKcgY1egZwQVEKDBATmtsU1AMhBNPeS+obELShC30uUG/xdUOv3qPh0CvBDgmgKAqVxa1JrkBvHBx61fMTbTpOvJ7q9UVAf4/fzz9vWyiWw+0ByAuuT585TvOxE4UGOrpKIQGM6J74+BDAA9JjrjyUpNJXfH3LkU55NEQmz8yUJcUURjTpxEeVpue35uXaL+MJDMbStzz9PX4//ynL7fSAnaIcFkQXdF2kDYSEdUWAbaE2BQNQhCBBRQBf+oBPJ0W0bXGe6BRo3gclQBnLb3P1XomqQJzXJo/VhKop3PoDimV6sDC638fv579C1kHuilCQwgOFBdJ+bKe9D9dxWOWwQYzlCEtDSh5uuB+1gTZrh6B87Su+vo9Mnseh0YdZDaF4rlffDo3lMzPP5dMkDc9QED/zYbz0pWfHXw1EnrF9Qunv8fv5pxfcDNLIFnIqysgLUqSxegim64LycusEJQPKT641Fqqv+CnLddmohV+Z8KVpDSR8UurtrDily/pIP7n3NOm9amqnfehVx5Fx9ff4lT+F3GJntoBUiBFAwcgshAVVBSarY8tRqzM+KrQIk9qSwH3B5+wS70OhMJ7kFHJZibQ+QhlQjvLvWBM6V8wUhaCflqRAuornstenNnsLQ4kWDudZjv4ev5//pFBShBBL5wQmjHwdMRPXdwCJeZHe1UV+tQbChLPgPuAj3GLtyt6AiCLNg/Q+TnyG37E21LGmWns3fZdqGHa8CSungxw+5PbX+P382z6UKgHkwDl2O1DH");
    imageData.append("lADM/dMZZAasghAdwGtiqWJZRNd3fIRbTKRmqboWeoWo99IaWsBvxPDbifBLSvL9wK+wvREF5kkX90O2DaX29/j9/LOHyjs239EzhjWZAMqkG+srhgsfenyosGfl1Ud8PaHxpzbFydY3I1Cs4s+dMyfDb6z6c9bH7jWhAn87ePAY3K5fA6Zx9M/4PU97faYps+59insmPnfsZj9Fx1B196x8Up2m2yntbmQfTPUVX99y0KTLd0Ka4bJyCuui4I8adUz4+9/n5fir/mIKyopLmCzTlXrdo3Jypp9x9t/4PRaFXCy4akk1ADiN87rIFpRZjV1ZoKK1cH/Up4WfTkmEb6L78PCHD28PI0ceHeZET83wV/7ZvDq9Yktbn8w4qI0VrEeQW4vPpdzx88GCMKZKjfe4h1vLURUfM7GABORcPg8nbnKVhq5cD0E03ND9h4jfPnxYGDGiPRw7emSYO/exDL8BT4WiJINNHionSKRcVbDz0O6Soh7wP4jx08GCCSCNTdkq6iAALEEY+UNmWIlanwkFWhGuyGv4iKFhRJzM4VTaC1e+b29395j4+NweJ3/4CK5vbwc992mP1xGRp/VHX9AKD7Qn3sNokjBOjzty5DFRqeypOn4oFR7I3ggP5TNbuqd9rdzDk2nbIh66hfErPj+XO/+2beHDYAWMpaYZK3dKAiR6OtIq1HPRlNyFGxQZ6HBSRppgnvShpDh6HgGFidKhmAKt0o8g5XZnEFAunpOSwQtGAX68CVeFDgunjfl34jdyFCvVj1+VmjxR1+Pmj83SPnTz41d8317W/Fc0a2IBlDgxrhljtgTP3Lu9hRKhBd/UntJqPKsCujZuDBu7YonXTRs30XXjxi6uR9m0MXR1dcU2uRcaesZ1k9BtRFuqBy34pvZNwrOLnlUmMqCo5DfffDOcdtoYkgmJ0tx5c7Pxd67k8KtrqSVHLtNFG/8cQrYtmxl/Vlfy/FfMCqiRARNzF8tdmylOhNGSrNIN");
    imageData.append("QAdGPLivhlOvHFKCTLhXbndt1keMQe/R1iV0pkBVLPHgvnQq0+CkSOV48603w9ixUOqwMGok1lRsadz4V/6Jlei9tXBUSL+bkZOizY1f8U05Jc5/JbMCVYgsxCQAhYmkJBJUhOHDY7U6ACVrMmHBEzz0XDK28frZzgrxXkiKjErYhCIKIBooib2MFCWe17UJShSlk7KTNydj2cQ4Xck4VC5dYxX/zTffikr9NoX8UaMRfudm46/Hfar3Uj6sTx5LP2hyBws9jT/NNT+XOf+cFFkncWsSgDslIZJlGLiCejAULNjEM/U3XnXOLlGyCSelSVglBbBSVAneM62feZ1TNkoX84DCtb/xikVlZQ9Vw2L81VAqwm87wq94qh9/3NKwEjVBglL5Jxb608QtjV/xM4WXNP/yYyV0UotRjaPgXp4FAJmWubwwKdIYqFpqDf1SZkfJyggo1K+XEmZlYjnEaoGSmK5rkwu5eKb6nMaUrp5KytUosJHH2OBIAcMq4mNN1fCLfeo8rKl+/Cv9iVJKlNJ3uZsfv21F6i4DLmn+7SyXGmqqfRTp2JAUHqVgaSwAX4nWW5UU1JvQeI40muX6tVETpKQsUdwm9j4KpwVPYwU4BXqvloJ6Mxo8d2EN5cnTLLc7fITf08eeRlnxyOip87Cl8eMnpWKPql7KZ7n+YKGn8Ss+z12580/bFlNGNx24LVlAEk6E8s/dhBim57VBX/L6iWxSBrypoBBb/7I2TZyany3U4l7bIg+tV9l4DW3vER+eSkqNWyjep87Nx0/HhHLGC4XKEeSWxl8sZc5/pVrjoycszNjb4AoGtWo13qO4OqHFPffz9a5UudSrwlf6KL0p1CZPwx1PZFKiT3iSkopeZ8UphbwNa6nw9/1rdR4XFMoht2d8Db8Izwi/UKofP4dfHC6k34duafyKD5qy57+SxeyCBcDF9VljNaXUGlr1Wih6aqGhomhVFHJjKONJTEoreiBCrD7zFeugJE2q");
    imageData.append("OKcoLZsswSoqnxXHbzcanBSNSJGiJ3wodcLECQGHD6ORKNlbGhmXrKn8TRE+Etv8+BWf7kue/4p9Tqgu74g4nnMW5Tspc82+ikypHbwshDih65IU6dqlXgTlwEOcklgZnMV6halyNfv1bdYOXhZ6ndFsRMhleSADjhC3Fv+iiy4kj+YtzWPZ+Bsr/2JnuVsav38ue/4r3tXZhdXNncsjRCCM4B5hBMzM7fk5hQe91rNQoHXoQ/vQdihUJtqteWlf6UNul/NK3q4kz+PnjFZ4dVfQh9azqgv97wP/okmTyKtHjx4Z5sREyY9/9a3jaR3d0vgVP81vounr/NPRH4cIDQFsFazxpP0UCrSgTS1NrkipyWqYDwlYx3PNJQQNOinCgTltFbDWycEBTR5Nblr7vCJy5aCtoETZ0tAaiHApyRRtj0xpmyS0NewA//3iw1P5mBBrqj9RaoQ1d1+4xfErvh7glzn/lOVmxADwRHV95g6eqYYE+0SxJhtc4yHhSNJ0/dIbXgEv7W6ySMF0nzzNEhrnSal+kykL4RtHf7w3dXQS1unUaSNnuZBPPbQ3+BdNupDGgDV1zjxeU7d2/Nmcgt7d93X+OeRqqXNIIPclAnbnKoWPKrk5Z19cT6HD+nIY4LCR6nymRrxj6NC3Kj7z5Anzh+hQAodTrGNQVMo+Jex6BVMYVo/0CkiKId5RYZoh0sGCrqG9wL/oYngqzn5xoD9nq8ffU4ZaxvxnP/hN54JsKb5OX/2oNVEGJjR2XGVhxRcXGiQcc5abr12siDT5umZZHSUtOuGsTPVEOy4s8OPiQjMpHR6KcFe3d6t9wedEqT0pdSvGr/jF+Spj/lmhjrFlaHpPnSGUCEEguDIQaHTN8IL4omeN6KOhjs5yNTSqIrpchrrRh+LkLTzJuPJEGw15kky89VP65HmsUJab3o/6pKiX+LSm4kDfb2k2M36bN52rEudfPFQBJdYLIy5w59zK9CttEpAY+dgutL4+");
    imageData.append("o6nJi+mhMlE8YTx5stbZRPLE8XvQruSFXbqV0ONA5aP3XTL5Up/RdInMyHL19Vnf8bGmUvjFMSE8dTPjV/xUV978V5pSZ02P9TSjp3hfS2sBl2qoEg+EAseH+kraHQGrVfcekibDhTmdNFKCr0/FJzD+nibeK855KoVNDZlRGSojJ0UwrMSjL/iTJPvFlgae2tP4bY5ovsqdf5cU5Qyq9AzggqIUGCCmNG5TUA+EEEx7L6mvR0E55LYXJiufQH5RzV6QKUrDYywWsguelU+0Hu5zPZSriQYrVOXYPP6LL77E9LLuUqYuIVsNVL+TwnLCx4RIlJrHnxKdXCFlzD9vWyiWw+3ZrcmNaylW00dIcG8NDXR0lUICGNG9rgkuvPBinYcSzXJt8kgxnEmSYiis6esufsXGyYmERjlcMEW4w/ukYNSJx+mrMSkanlQRPeE/Of+JDP+7EyeSIWpSp/31RbldpZ4+Z8GaWhh/sZQ5/9lvWxJgQ5TDguiCrou03nPm5QrqtE0ADBS8RNAR7ujPyia/dm0SJbEiNKFJnieTrGuaFpl49cikYOFFisIXCzwB6mnd4fOa2B4980XDf/iRR0xRfRl/ls1qKWn+K2Qd5K6899HwQGFBPcziurQRLYSq2RGWhpQ83HIYoTbQSrtasU9W+DQnhUe08Scmqlw/6V3pnpTG3oy+Ptz6fakdPsSiYUq9zOPjIP5iKBNfHsZy5RVXZPjfnTiBXqfdfMvNvR6/hUmqK3f+6QU3g9SzRIYKbWILghRprB6C6bqgvNw6QckA87PD+S4Ob6wEKC4pg4pOpFdUkcbq/SG+8nKhlk6LmJ/JQZ916klRVObq9KUCh9ChlOBAyYo/8/bbqe2kk07s9fjtWmWllDn/KSmSzmwBqRAjgFKWpu26CPM1WR1bjlqd8VGhRZgU6pLCVHnFxIauULqEV25Xr9aQrHxw5fCabT3UaMQYVDb9fhd18594PJx88omW6NwSPXD82eMC");
    imageData.append("1vtf/PLaDP/kk08imt/fckuvxp/aksLKmv+kUBJEiKVzAkthIIGJxRFIAvAhJ6dPdfRiecRQ51E8WXwv3mXPrAgNw02Jj4bljXz1ITfj4QrGU43Z5ghJXubH5Gf0sSN5fdQtR5Rz1qxZVIfzWo8/cya8tD2MHz+uV+NX/OTRnrZv82/7UKoEkAOv67lhUSCiZyBlzv3kvFGBVRCiA3iV6PSbIl7X2Kv0xXW2BrrEqKikPOnJT4JMkWoIss5ib0lrqHxJgDVSowWUi+O7x+Y8lo1//PizqR1K9Pj4PQwME0p/v+NXfF5Xy51/9lB5x+Y7esawJhNAmXRjfcVw4UOPDxU8gT7d121AKvazCNzL71ZIAYWtgS/p9zLNNPotMO5VHo8/5rRvh9deey2NWa4IvcBHOCYDFCP6xS9+QX2h8Pc7fnvWuSxx/u31mabMuvcp7pn43LGb/RQdQ9Xcs/JJdZpu69WUI5PtlccT73/MpJOeFJK1RWXoNoh4ybtW1Cnf4pVkaaRty5jTxoTlr7/uxpaPHwkQ8GfOnGnRAYkSEibgP7twwfsav+L79rLmn0IuFly1pCoAnMZ5XWALyqzGrixQ0Vq4P+rTwk+nJMI30X14+DCQCy748Rbxb47JDyIIviuCQhF+z5ZQDOO54ILzm7C3Bp9LueOXn+QzY6rUeI97uLUcVfFeiAUkIOfyeThxk6s0dOV6CKLhhu4/RPyfnP/jrcbH+gpvPPmkr1OEwAuGUSOPDtOunhpep1D9/vE/iPHTwYIJII1N2RrqIAAsQRj5Q2ZYiVqfCQVaEa7IC0KqRf7/gj9t6tSgv09FCJ4+fUZYtozX3P7A39rx27aFD4MVMJaqZmzcKQmQ6OlIq1DPRVPyxJMEtYEWrFL4/XfGR8J0Wkycbrn55g8Fv4jTE35FsyYWQIkT46oxZkvwzL3bWygRWvBN7c0WZ3Ut/FLxK2YF1MhWkpiL1RTaTHARRkuyyrQvsoERD+mL/ZUI");
    imageData.append("08IvF7+SWYEKJAsxCUBhIglJgoowfHgsoASUrMmEBU/wkKMttCUsfm7hl4fPSZF1ErcmAbhTEiJZhoErqAdDwYJNPFN/4yV0GiJa+OXiy4+V0AnWkRhzwb08CwAyLWWswhVpDFQGwhmaWqFgiHW18LWuHHw7y6WGqmofRTrWWfu494uwFRW6WC8F9SY0nsn6VHjUtfDLxKdtCz0AqJsO3JYsIAknQvln7e/4MD1o9duY5tLCZ95l4Fc6qnz0hIUZextcwaDa0RHvUVyd0OKe+/l6Vzq41DqEr/Qx+prw7VA+Lfyy8CtZzAax0zhc3IcLWBml1EqX0aeipxYaKpqsit4uaNhp4ZeJX9HNqrm8I+K4zFmU78QgVaIvtlk7eFkIcUIXnlv45eJXvKuzC6ubO5dHiEAYwT3CCJiZ2/NzCg98hWA+FGi4QB9aT4if8m/hl4VPR38cIjQEsFWwxpP2c9fXNvQTa6G+HCbIsuo8ILa0qksI6jxYXBF2Wvil4lOWmxEDwBPV9Jk7eKZYuBcsWBhu+t1N4Y9//GN4/fUVXG88mF7/eASl7EWeoHf3ij9+/Pjwta99Lbz66qs94iuGfSIpOGXgdzf+mXfcEb7whS+EK664wtX3H/7WjJ9DrpYahwRyXyIAGFwb9x3k5px91cLFP704fOxjHwuVSoVLWyW0xevBBx8cnnn6aeGXQgEK8bbMrsr8esDfa++9I9+2sGDhgm7xKewQf+2b+BnfXuCvffvt8PTTT4XFL75oOIo/evRoGus///NnPzD8rZ3/nvCzH/ymc0G2FF+nr34A9K1vfSu0tbEiv/SlL4XvfOd/hRNPPDHsuusuVLfDjjuEhx56SHi50KDhiMINP/eEvzcptBIWLnimCZ+eKaTxvR2XFfj1Bv/hhx8m3MMPP9zqFP8v994bjjrqqHDdddd9YPj2vJn5p+ce8FmhjjF1kOfUGUKxEIsXLyZPbGtrC7/5zW+IhoSMbStWrAhHHvll");
    imageData.append("mhAoOAmqgqTjL+onAnWHrwpdsIC/17FJUDwZqMcnHsrTlfeDPxsKbWOFdjf+Dxp/S/O/JXzxUAVER+2gBe6crGzaNdMoFB5y8CFUx8dR3A9l3ry/hx122CHsvMvO4Z131nG9o3n33fXRex8Ml112Wbjnnj+Et956q1v8ffbZhz00hlyPT7ziWrH0laVhxozpYdq0q8MzzywwfPMIL1e8x9cFN954Y/jZz34WZs26P6xZw7h+/HfffU+YPHkyGSzw77zzznDXXXeGlaveIJ74nctdd90Vnpz/FCmpOP4NGzaERx55NFx++X+G39/6+7B8OecUmSyxz/PPLyLezz//QuiIIXTu3HnhyilTws9/fm147LHHNjv/Ov7u8FEqTamznm7oaYbEeo33l19+OU30TjvtFN6MykhrQEfoIB7SX9Ns6stp98+vvTZ8/OMfJ4PQdXfQoEHhBz/4QRP+3vuwhz7zzDMZPqLA4UOGpLVbymc/+9nw7HPPNeGvXLkyDBs6VPCAywVGd2dUlo6/I14znrKkoNz/178S/lVXXUXPZ40bJ33SGK+99ufE08YWS9uAAeErX/lKWBuNh+SJE94Rxzd58qXUfv4F54dh7cNy3FjGjh0beW9w85fG74vH1/l3SVFSoA6QJydX1OyHZxvwMUcfEx599FFrU1APhBCE57uiRX7kIx+hgr8efeWVU8K4ODHbbbcd8Zo69aoMf6+996LJWRDXUMV/OyYsI44cQfT77bdfuPCCC8JPf/rTcOihh1Hd4MGDY6b9uuG/8847YcQIpv8fu+8eJkyYECZNupDCKXgPiBN+3733CWZHuPrqq8N//O//IPo99tgjKnBqLFPCkqWvED4pNCoactPYxGhuv31mGBDHNSAaDBKnS6KXn3XWWeHTn/404Rz/1a+GDe++S3LVoqNMvnQy1X90++3DJz/5SZLroosmhQMPPNDm9vobrpd5LTiKGr7D9/PP2xaK5Qg77NbkxtUUeuHy");
    imageData.append("/PKWQ9NZZ47LLPgzn/lMOP3008Ntt95Gk+jDC++5aiQ4aH/1q1+5cFILt912W1yPB5Cnvv3O24aPNRShD2uo4iNcgscBBxwYVr2xyjDeXrs2DBUv/NGPfmT4CH2o22nnncMLL7yQhbJvfOMb1PbVONl+/EiKkPBB6cXxXz31aupz9rizbc3q6NgQdtxxR6o/77zzhD/jP/XUk+Hj2AlERd9www3GD2Ed9Ntuu13Em53hjx41mvBPPfXUJnxbi+noUMciHkz17iMxEKQB16nRx2aL4XJ/429/G9qHtcew0sbKFQXvGMPORRdfTBapCQIGhra99tpLDMXzqoXPf/7z1H/OY/ozhLqsoW0ccgXzlFNOIT43wHprklRgYLHcfPPN1HbcscdyWywnn3wy1U2ZciWPxQyVQzH63H333cxfxv/II48Q7pDDh3AfN+apU6eyQs8eZ/hPxS0OZN89RgCsh3SIIPjA+slPfkJ9JkyYaPiXikIRPYrzjygBfOweivj+vjh+VXCFrIPclfc+FBbEteHqpJSOVMdhFbQAqIYlLy8J06dPD9/65jdlDWHFnn7GGcwz0l8/YwbV7bLLLuGEE04IX//61+MVBfcnUj28EWus4tMaGidqARIewd9zzz2JDn9biPsqrxPC8OHDCWO33XezkPS5uK6i7uHZsyVs+eUAls9XP/6HIi0wDh9yeNP4r4rLAtoQTnX8M6bz2EYecwzxzpebjnDrrbdSnyFHDDF89tC2MPG7E5vwH/3b34h+/wP2b8Lvbv71CBH14E0vuFmIWpbIUKFNbGEiijRWXwur31hNk6uJweLF2JxX6e/jad3AgVhHB9h6iucBA/ge1qz8/LYFzxuiLAMHDjKD0f5YB/kKXgOpbNgQ151YBg3ahmgXLVokyZaOR66YqML4Z8/mHIG2LYXxa1KkaygK1mTUjRlzGk0+1+tc1mxfu8cenzHcyZMvobpzzjmnCX/evHnUtv/++zfhq8xal5UO");
    imageData.append("GIYezlMFd07ZFAtHjABKWVo1LHv11fDSSy+H9evX2wCSVXaExS8ujhM8kKzsnnvuofrbZ95OQh599NEFDJeIFfBVoU/HkKv4Bx50IPF96CGsO2y9RXzvdYcdxsnS3ffczTQyGZvDhzebQpW34KuHjotrqOLj9y6gP+KII5rwQYPohUgzcuRIw08K/V4T/ry5c0WhBzThJw/lcXc3/qRQEkSIpXMCSy5/yCGHEOBll/0nMWAQDRu1uGdbFbYZxJ70TMxQ0R/7NzzjqPAtSeE7aggTLBAy05eXvEwJleKrQrGGKv4Z3zmD6i6I2S0PKuGvX7cuvLLklbDstddM7rPGnUX0Z599dhoPrpHfE08+ESaMn5CigrTTwULs8y9f+Jem8UOhaBsX+Sr+kleWRCW3UfLz+mspw1aeY8aMoT4/+jF+Q8N1l2LbEpV87jnnZrS4Yh9PCo0ht4if6aQwfp1/24fS5GKinUA1PTd0dboP3SVmjtgcK3P0W736DcrOIOznPve5JEi8auJz3PHHx8l/l/phjbj33r9Q+o7QOf+J+YavWS4ODRT7d7/7HfHYZpttwqz77zeLX7duPfGFXMDXgd95x53EA/W//e2NAXtr8H9j1RsxUz4g34LI+B9/4gmix0nYS4sXZ+Of6rYtOi7Uf/GLX6Q+X/7yl+Oec43hX/fr6+xU7X7IK/iTL+Gk6JxzodB8/ueIhx4QQ25386+8Pb7Of/JQecfmO3rFwpv4WiUrPOiggy2rxdsHZJ/HxKRg56hk1GFveVPMgn3oWfTcorDrrp+idhxKjB41iiYCisT6euZZZ2b43kM9/ve+9z2qRz/s2zwuIsDChQvTgCM+9qqkoAofqiM0DooGgedPRXk4AqTxr41bIN1iwXCQbMGb0TbFPBRZbpL1+eefpywXPDF2bKH2+Kd/onGBnt7OiDygv/TSS4kWayjxcPjZGir8/fhNiQV96Zht26JbFj0nzI+fJEWWNHpdDI1nnnmm");
    imageData.append("vG1pMy/AJENJf4uZmt+a8LFeLTw2Zw6d8dKEiUFgDztt2jQOGQ5/38GDqf3ZZ5/N8LE1OD+GyYMOOogsH/jbx0nEhh57TQo/xCfhY6M/ZMgQSp7AE6dVo0aPirnAS2l87vqHP9wTviTrLwq8C/jXTLuGnieMH2/9+Bguevbjj1N02HXXXYlm0KCBYdiwYZRI6fj1CoVi/N///veb8B//x+PUH+MzDLS7+c90I/j6TCEXC656UgeAncYxQfT6plbw2lhwdvl0DIm33nYbZXM4l80tRuK8Pqulod/TT4dVcb3tCz5+QLRg4bOUAXvcnvDfeGMlZc3AT3Q947+5enVYtXJVj/h8ZUVZfZTlueee4zPqHsavWFvC39L4u8OXn+QzY6okl5Z7uDWEgAVQPQvI3pSY+3CSxXyloSvXQxCil/W6hV8uPh0smABCyFaR6qgeAsAShBEOmZOQcHfnJQAHrQhX5AUhWYgkSAu/HHzbtvBhvALG0iGg4s5JgETP4Hk9F92SJJ5kVTbQglUKvxZ+3/ErmjWxAEqcGGNNYMZsCZ65d3sLJUILvqm92eKsroVfKn7FrIAa2UoSc7GaQpsJLsJoSVaZ9kU2MOIhfZHEiDAt/HLxK5kVqECyEJMAFCaSkCSoCMOHxwJKQMmaTFjwBA/NRKmPYvFzC788fE6KrJO4NQnAnZIQyTIMXEE9GAoWbOKZ+hsvodMQ0cIvF19+rIROsI7EmAvu5VkAkGkpYxWuSGOgMhDO0NQKBUOsS/FxXbNmTViz9i3aw9H9mrfC22+v7Rf8D3v8ZeHbWS41dKj2UaRjjbWPe78IW1Ghi/VSUG9C45msT4VHHeM/8OCDdEKip056AoXvcnDuOnHihLB48QtN/MvC/7DHXxY+bVvoAUDddOC2ZAFJOBHKP2t/x4fpQavfxjQXYOCPIEKRePW27777UsE3QnquioIDf/4Aunz8D3v8ZeFXcGyGoycszNjb4AoGOB7D9zJUr3VC");
    imageData.append("i3vu5+tdkRfM1Q3CV/oYfVX4blA+otC2Ch3KF/FxYH2QfEA1dOiwDwSfnj/E8ZeFX8liNoidxuHiPlzAyiilVrqMPhU7s8W9XM2KqB+sScMO0z7wwAOkMHx60h0+3org8H9g9GD85WmPv2zZMvro+5JLLgm//r+/Dv/4x7zwrn5l5/DxHewdd9wRFj33PE0IvoG98sorwjXXXEMvFDY3/iVLloQZM2aEaVdPC08/JT/1KHH8zfx6N/8V3ayayzsijsucRflODNJB9FmbhAxqx72FECd04VnxH5j1AHkoPg7rCR+fVkLpf/rzn5lH5H/J/7kkbLvdthaWteBzz5WrVmZ4UDjazj//fHoTomu19hl7+lj2LIe/YsVK+mCsyJ+/A362tPGXNf8V7+rswurmzuURIhBGcI8wAmbm9vycwgNfKd4XwgFo+c0I+Lg+8VnX0MGD93F8cnxdTx959BHC//2tt7JCoiF8+9v/HqZMmUJfJ+y+225Ed9JJJ2X4l8iL5Y999KPhE5/4RJgwYXyYNGkSv+wWRf3mhhsMf+3aNWH4cP6u9/P77UdfSlx80cXh0EMPoYRtH/oOeHkp41eavs4/Hf1xiNAQwFbBWk/az11f29TS5IqUmqyG+ZCAVTx3uISAQ4a99hF8Dbn7DIaHNuPfcsst1I7PRBFO0YZ3jccffzx9ReHx//Rf/0VKhgHgFZ/i69d2eHGNT008vv6y7NRvnGq4l1/O3wHjZfOKlert/BL8iCP4O+Af/vCHpYy/rPmnLDcjBoAnquozd/BMNSSosPwGANfURnRSTyl7kSfoq2kNRVh9cv788OST88P8eL3vvvvCD887L2y//fakJPqEcgv4+Opv5512In4vv/yy4U+WkHvkkUc24es3t4cdepiN/xT5rhefoRKtGz++6YWXHnvscU34vRm/3vd1/jnkaqlySCD3JQKAwbVxv4HcnLMvrqfQYX05DHDYSHUpFEmIsMzO0XVIyKUvENI+");
    imageData.append("VMOprnPf/LdvhnfXr8/wV69eHWZMnx7O/f65sf3fyNPwWxZ8iY++L730omHgywXwmTBxYhM+kiLgwxt1/HvuuRfxwHfA9A3wCSfQZ6r4phh/+Bhtu+++WynjZ/q+z3/2g990LsiW4uv01Y9aA2VgQmPHVRZWfHGhQcMRhZucftYDs/ibnG23pe+E8LsZXI8/7jhKYv5631/DuxiMw589++HwqU/hOyUxhDZ89zuQPtxWw8Anp4qP35TwtzznNuFja4Q2/ZYHEw+j0IMO+vZXvgXm74kH0hU0mPC+jp/GVML8s0IdY8vQ9J46QygRgkBwZSDQ0LPyEBBf9KwRfTR8UD+lraWDhb2R5W4lPmjR538edRR9+4ufNyi+fttDIVfw9aeC+DiriD/Xvofd33DwHTDq8PF1d/hljl9p+zr/4qEKKLFeGHGBO+dWpl9pk4DEiPspL6L19RmN9gE/ratFD8Ua2kbblq3BX7F8BU02ftjjP/UEL/xiTUM1PgRTfP2R0Ln0tV2Oz1/btdH3sIp/xhnyHfCFk5rw169bH43lpZjl4jvgvo+/rPmvNKXOerqhpxkS65vifUdaC7hsCBuIh/TXNJv6StpdRcLCoSJhMg5CLnno3rJt2QI+Ml3dxvzyl780fOwb9SeEKPjFueJPxtd2UWkIuUX8eX9Pn08q/k033UR128asGL8RVWx8EI7sGm2nnHKq1Pdt/GXNv0uKEgMmlsW3KKgCA8SE5jYF9UAIQbT3kvoqBK3qQp/o8KtqTBA8dGvxTz9trHjpgHDQwQeHo/71X+kHU/i8VJX94uIXDR8HCxRyzz2nCR//69MrVPHPwXfAbYxB3wGPTN8B42v5hQsXmmx9GX9Z88/blg51ewAiZsOtk+vD5fnlLWiie9PRVQoJZEG4Jz4+BPCANN3OQ0kqwH/wwYdokgYP3ner8detWxe3MWfKr8LZI/Hh9/33z7Ifz2INVfzLyENjyKUv1nP8f8j3sOjn8bGP");
    imageData.append("/TF9B3xgGNCGj8IrtIVCNr1o0SIZY9/HX9b8Z79tSYA1WbBTbLYYLve2qIOxFtRpmwCkviIECep5SekDPqwZx3CvvPLKB4qP74DZI+Fl/33G7/ErZB3kriykhgcKC2CC9g2pjsMKhw1iLEdYGlLycMNhhNpAm7XD8vjawi8Pn15wM0g1W8ip0Ca2IEiRxuohmK4LykufuT2tE3KFoC38UvFTUiSd2QJQWBhipKBmIdymA0hWx5ajVme8tb8Ik9qSwC38cvCTQkkQIQawPQNMGPk6YsYDoLAgAIl5gV7vcY38NuDPtohALXxP2zd8UygxB5B1iHV6bujqlCkBmPunM8gMWAUhOoBvEEsVy3ICtvDLwWeFyjs23zG3NAkNYl2esS8Ekt2n0KPPWbvyauE38estvm1bNGXmq/vkUOshnKTRWRsdQ3W4Z6bzdXysla50L2m28c+uLfze4tPRH94fqiVtqOZWxOsCW5C3Gr3nttQntxjUi3XhWSzNW3ILv1x8+Uk+M6ZKjfe4h1vLURUfM7GABIQ2B5zCiRuc0tCV6yGIhhu6b+GXiv//AI3Mt3dq5Y2cAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image39e001b671e850c9e528f31803c5470f = new WeakReference<>(result);
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
BufferedImage image39e001b671e850c9e528f31803c5470f=getImage39e001b671e850c9e528f31803c5470f();
if (image39e001b671e850c9e528f31803c5470f != null) {
    g.drawImage(image39e001b671e850c9e528f31803c5470f, 0, 0, null);
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
		return 116.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 132.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private selection_pane_icon() {
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
       selection_pane_icon base = new selection_pane_icon();
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
       selection_pane_icon base = new selection_pane_icon();
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
        return selection_pane_icon::new;
    }
}

