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
public class width implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagec8a838c416a7dc5fe1a2ab8961b17eb0;
private static BufferedImage getImagec8a838c416a7dc5fe1a2ab8961b17eb0() {
    BufferedImage result = (imagec8a838c416a7dc5fe1a2ab8961b17eb0 != null)
        ? imagec8a838c416a7dc5fe1a2ab8961b17eb0.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(9176);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAaq0lEQVR4Xu3dfaxtd13n8VtERi06E6szRkkkGZVqe77nXi+lNrFyjWJFpkVtT/febW/bAbxjKwUfSqmKeKfFPkBE0Wgo4BM+gXGSQUYGEO0AZqL4FBMNxmcB8R9UIhoFbX+u5eVYXWuV9p7z23t/11qvV/JOSGnvPffcvdf+nN86D0eOAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAM7e3Vz7u2F75gt2ry5fuXF2+fHdVLjh+qnx899+DKTpxojx2Z1XObx/7bReuSnj8A5N2dFlOxLK8rulvm0qnv296Q/PvPOPIkXJO97+FsWte7L9kZ1le/zCP/39oemPTFR7/wGTEXnlSc+F7y8BF7+F65+6ifF7314EximvLE5rH//8ZeJw/XL96dFEu6v46AKMRJ8u5O6tyd3NB+/DARe6R+mB7PNr9NWFMdq4px5vH8l8MPL4fqQd2l+W+868v53V/TYDUmgvYVU3vGbiwnU1/13Rx99eGMWhPsZrH7wcGHtdn0wd2luXUkdPlMd1fHyCVo9eUz20uWm8auJAdtD+9+NryKd3fBzJrP9Gveez+2sDj+aD9xs6qXNL9fQC27vjl5ZOai9TpOPPJTN2L16HaXZY7u78fZBarcnP3cVyhB5tee2yvfHr39wPYiqhz3P+x+uATbyyf0P19IadyTvOY/aOBx3Gt3BYAtqv97P7mo/O3DlygqrezKM/s/v6Q0YXL8uTu43cdNSPgXb5aANioQ352/4FqhsY93bcDMtpdlVu6j9815qsFgM2IVbm8uej86cCFaK2130Cl+7ZARs0L8su7j98N9FexKM9vv8tm9+0BOJRNHvcPtihv7r5NkFHzeH1V7/G7odwWAKpZ52f3");
    imageData.append("n03tdxLsvm2QUTNWX919/G44Xy0AHM62jvuHMgAYiwQDYD+3BYCzs4Zv5nPoDADGItEA2M83EQI+tizH/UMZAIxFwgHQ5rYAMCzTcf9QBgBjkXQA7Oe2AHBGxuP+oQwAxiL5ANjPbQGYq8zH/UMZAIzFSAZAm9sCMDfZj/uHMgAYixENgP3cFoCpG8tx/1AGAGMxwgGwn9sCMDVjO+4fygBgLEY8ANrcFoCpGONx/1AGAGMx8gGwn9sCMFZjPu4fygBgLCYyAPZzWwDGYgrH/UMZAIzFxAZAm9sCkN1UjvuHMgAYiwkOgP3cFoBspnbcP5QBwFhMeADs57YAbNtUj/uHMgAYixkMgDa3BWBbpnzcP5QBwFjMZADs57YAbMocjvuHMgAYi5kNgP3cFoB1iZPl3OYJdnfzRPvwwJMvTZfd2vSC/j8/bAYAY7GOAXDillIuf1H/nyfrgd1lue/868t53fcJcEBjOO6/+Nml3PSaUl76zlKuvKP//x82A4CxWMcAuOy2Ul72y6Xc+rpSLr25//8ny20BOKwxHPc3b2O5+u5S7vqlMxeoNgOAOVvnAGi79x2lPOsHSjl+ff/fS5bbAnC2xvLZ/U/7llJe9HMPXZgMAFj/ANjvjreU8tXf2f93k+WrBeDRGttxf/eiZAAwd5saAPu5LQAjN9bj/qEMAOZs0wOgzW0BGKGxH/cPZQAwZ9sYAPu5LQAjMYXj/qEMAOZsmwNgP7cFIKkpHfcPZQAwZxkGQJvbApDIFI/7hzIAmLMsA2A/twVgy6Z63D+UAcCcZRsA+7ktABs29eP+oQwA5izrAGhzWwA2YC7H/UMZAMxZ5gGwn9sCsCbNg/aqpvcMPKDT9EXPKeW5P9q/MNRoHQOg6b3tDxqRstc8Vt898Pg9VLUHwH7f/NOlfPFN/d8vWR9oPgA4deR0eUz3WgtpzPG4f6g1DQBptq1rALS5LQCHMOfj/qEMAKlu6xwA+7ktAGdpTp/d/2gz");
    imageData.append("AKS6bWIA7OerBeAROO5/+AwAqW6bHABtbgvAAMf9j5wBINVt0wNgP7cF4KMc9z+6DACpbtsaAPu5LcBsOe4/uwwAqW7bHgBtbgswK477D5YBINUtwwDYz20BJs9x/8EzAKS6ZRoA+7ktwOQ47j98BoBUt4wDoM1tASYhTpZzmwfI3c0D5cMDD540XXZrruP+oRZ3999uSQfvv317/3mWqdNvLuXyF/Xf7mQ90H6r5vOvL+d1r//MmOP+ut34ff23X9LBa0/8us+zjLktwGjEXnlSswjfOvAASVN73L96aSl33d9/smXtG3+y/+eQdPC+7r7+8yxr9769lBuaDwK+8Lr+nyNTO8vyrqOLclH3dYGJ89n96+2et4/inqA0inZXpdzx1v7zLHu+WoB0YuY/qndTXXln/88l6ex7+u3959eY+iY/cpht89n9m639iCX7EaCUvfaj/2/73/3n19jy1QJsheP+7XXTD/X/nJIefdd/b/95NebcFmBjwnH/1rv2u/t/ZkmP3NfcMY6v+jlIbguwNj67P1f/41WlHLu2/z6Q1K899m8/8p/qi/9+7VcL3PiK/LcKfbXASPhmPnk7/aZSnvmdZ4ZP9/0h6cwL/zO+dYbXhjf7JkIcUozluP9H+k+AOfVdv1TKzT9y5vSjHQSXvUCab1e8uJTlPaV8/atLufMX+s+XOeW2AGfNZ/dL0jTy1QI8KidOlMfuLsqLw3G/JE2qsdwWaHrFJXvlE7uvT6zRBXvl8dk/yc9xvyQdrpHcFvi1OFn+c/d1ijVof4BD8w5/48BfQooc90tSvUZyW+A3209C775eUdlHj/277/wUTfGb+UhShrJ/E6GdRXll9/WKio4ty2c27+i/777jt53jfknaTIlvCzx49JpytPu6RSXNO/iugXf61prTN/ORpCwl/iZCr+2+blHJ7rL8wcA7fCv57H5J2m7pvlpgVf7mgr3yuO5rF4d0fFU+rffO3kIXP7uUm14z/W/T");
    imageData.append("KUlj6dbXlXLpzf3r9VZalC/svn5xSLvXlKf03tEbzGf3S1Le0ny1wKpc2X394pB2VuWpvXf0Bmu/XaeP+iUpd8/6/v71e5PtLsvJ7usXh9R+dmX3Hb3pvvR5pdz+v/oPOEnSdnvRG8/8fIXudXvjrcrl3dcvDun45eWTmnfuP/be2Ruu/Yld7deizv0Hd0hShu65v5TrXp7nR45fuCj/tfv6RQXNO/f/d9/Z2+qiG0s5dZ/bApK0rZ77o2e+D0v3+rzF/uzIkXJO97WLCmJRbhp4h281twUkabOlOe7vd1f3dYtK2p+61LyD3zfwTt9q7W2BK+8s5SVv6z9QJUl1uvv/lXLNS0s5muS4v9OHLlyV/9J93aKi5p18RdODA+/8ree2gCStp4TH/f++Rbmp+3rFGjTv7NO9d36i3BaQpDolPu7/t72m+zrFGu0uyu3NO/2fBv4iUuS2gCQdvOTH/Q+1KN9z5HR5TPc1ijVrXmS/uPkLeHfvLyRRbgtI0tmV/rj/TO9tuqL7usQGHT9VPr5ZYM9vfwjDwF9Qmk7cUsptP9t/oEuSzvTiny/lK2/rXz+T9ZGmVzzpivLJ3dcjtiSuLU/YWZbXD/xlpWnutwXueXspt/x4KV9zRylPfW4pFz+rlCffIM23p/z35rnwDaU88ztK+YYfnu+PFh/Ncf+yvO3CRfn87usPSTR/QV8Wbgukqv1ztj9B8ZKv678vJD3URc0geM4PNs+Zd/SfR1NtLMf9zQdwV3dfb0jIbYE8tR/1t986uftnl/TwPe1bSnnJxL/duON+1sptge3W/njOp93a/zNLeuTaWwNT/PHjjvvZqHBbYCtd9V39P6ekR99X3d5/Xo05x/1shdsCm639Rkjt6Ub3zyfp7Hrea/vPr7HluJ8U3BbYTJflf7JLo+jSm/vPr7HkuJ+Uji7LieYv/XcGHghpar9M6Fk/ML7bAu1w8dG/VK9ve0P/eZa95//EKL7y589jUa73I3xn");
    imageData.append("6IK98ridVbmteRB8aOCBkaax/WyBm36o/2eQdPBu+L7+8yxrI/ne/R/ZXZR7m9eAx3dfF5iZY8vymc0D4rUDD5I0tR9Rt19ON4YvDTr58v7bL+ngXXVn/3mWrXvuL+W65rl/LPlx/86y3N9cTy/ovg4wc+GrBaq095L+2y3p4D399v7zLFM+u59J8NUCh+/KO/pvr6SD135Sbfd5liGf3c8kuS1w8AwAqW7ZBoDjfmbBVwucfQaAVLdMA8Bn9zMrbgucXQaAVLcMA8BxP7PmtsCjywCQ6rbNAeC4H/4NtwU+dgaAVLdtDQDH/TDAbYGHzwCQ6rbpAeC4Hx4FtwX6GQBS3TY1ABz3wwG4LfBQBoBUt00MAMf9cAhuC5zJAJDqts4B4LgfKhrLjxxuv7/4On7k8DoGwM6q/G7zPj0lZa95vL6z+/g9bOsYAO2P6l29zI/qhbWY622BtQyAZXlL9/0LGcWivLr7+D1stQeA437YgDneFjAAmLPMA8BxP2zBnL5awABgzjIOAJ/dDwnM4baAAcCcZRsAjvshkanfFjAAmLMsA6A97n/6C/u/VrIc9zNPU70tYAAwZ9seAI77YUSmdlvAAGDOtjkAHPfDCE3ptoABwJxtYwA47ocJmMJtAQOAOdvkAHDcDxM05tsCBgBztqkB4LgfJmystwUMAOZs3QPAcT/MyNhuCxgAzNm6BoDjfpix5sn1ZU3v7j7hMnXRjaVcenP/nx82A4CxWMcAuORU03P6/zxZ721e+K/uvj+ASsZyW6B2BgBjsY4BkDzH/bBJY7gtUDMDgLGY0wBw3A9bNIavFqiRAcBYzGQA+Ox+yGAOtwUMAMZi4gPAcT9kNOXbAgYAYzHVAeC4H0ZgircFDADGYoIDwHE/jMnUbgsYAIzFhAaA434Ys6ncFjAAGIspDADH/TAhY78tYAAwFiMfAI77YYrGfFvAAGAsRjoAHPfDHIzxtoABwFiMbQA47ocZGtNtAQOAsRjR");
    imageData.append("AHDcD3M2ltsCBgBjMYIB4LgfeEj22wIGAGOReQA47gceVtbbAgYAY5F0ADjuBx5ZxtsCBgBjkWwAOO4Hzl6m2wIGAGORZQA47gcOLcNtAQOAsUgwABz3A/VcsFcet7MqtzUXlw8NXHDW36L8fPdtgox2FuWVvcfvZvrI7qLc2zxXH999mwAOLa4tT2g+Gn/9wMVnrTW/54933xbIaHdZ7uk+fjfQ2y5clM/vvi0A1W38tsCqfGv3bYCMmsfqDb3H7/py3A9s3iZvCzS/zyXd3x8yasbxE5vH7IPdx3DlHPcD29feFthdlZ8ZuEjV6vd9hMOYxKq8feBxXCvH/UAuO1eXL28uTu8euGAdqp1lubH7e0FmF67K07qP4wq9rxnaV3d/L4AU/uW2wLK8MOrdFvhFH/0zRu0nrg48ng+S435gPGrcFthdlj84tlc+vftrwxjEyXJuMwLe1X1cn2WO+4FxOsRtgV9vvxNh99eDMTl6Y/lPsSq/MPD4fqQc9wPj194WiEV5QXNR+8DAha7bh5qPmu74nKeX/9D9dWCUTpfHNCPgG5vH9l8OPN67/W3TXY77gUlpfyBJc3F7dtMbmt7b9E/tRa95wX9/MxDe3Pzv551/fTmv+9/BFLQv6s0QeE7zWP+55rH+nqYHPtpfNP3f9vF/fFU+rfvfAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAd1wV75jJ1luXFnVf7nzqK8cndZ7pOUv1iVlzTP3VPHrimf3X1eAzysWJQvimV5W9MDTUXSqPuV3UX5iu7zHOBfNR/xP679SL+5YDw4cBGRNOYW5Web5/jju897YOYu2SufuLMs9/cuGpKm1G+ff305r/v8B2arnNNcGH5y4GIhaXq9oz3t614FgBnaXZXrBi4SkibazrK8sHsdAGam/UiguSD8SfcCIWnCLcpfN8/9T+1eD4AZiVW5vHdxkDT5dpfl67vXA2BG");
    imageData.append("mo8EXt29MEiaRW/qXg+AGdlZlncNXBgkTbzmuf/+7vUAmJHmQvC+7oVB0ix64MSJ8tjuNQGYieYi8MGBC4OkGXR8r/zH7jUBmIkwAKTZZgDAjIUBIM02AwBmLAwAabYZADBjYQBIs80AgBkLA0CabQYAzFgYANJsMwBgxsIAkGabAQAzFgaANNsMAJixMACk2WYAwIzFGgbApTeXctkLJNXqxC3951mNDACYsVjDADj1qlJe9suSavXNP9V/ntXIAIAZCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqfAQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACgujAApPQZAEB1YQBI6TMAgOrCAJDSZwAA1YUBIKXPAACqCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqfAQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACgujAApPQZAEB1YQBI6TMAgOrCAJDSZwAA1YUBIKXPAACqCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqfAQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACgujAA");
    imageData.append("pPQZAEB1YQBI6TMAgOrCAJDSZwAA1YUBIKXPAACqCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqfAQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACgujAApPQZAEB1YQBI6TMAgOrCAJDSZwAA1YUBIKXPAACqCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqfAQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACgujAApPQZAEB1YQBI6TMAgOrCAJDSZwAA1YUBIKXPAACqCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqfAQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACgujAApPQZAEB1YQBI6TMAgOrCAJDSZwAA1YUBIKXPAACqCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqf");
    imageData.append("AQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACgujAApPQZAEB1YQBI6TMAgOrCAJDSZwAA1YUBIKXPAACqCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqfAQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACgujAApPQZAEB1YQBI6TMAgOrCAJDSZwAA1YUBIKXPAACqCwNASp8BAFQXBoCUPgMAqC4MACl9BgBQXRgAUvoMAKC6MACk9BkAQHVhAEjpMwCA6sIAkNJnAADVhQEgpc8AAKoLA0BKnwEAVBcGgJQ+AwCoLgwAKX0GAFBdGABS+gwAoLowAKT0GQBAdWEASOkzAIDqwgCQ0mcAANWFASClzwAAqgsDQEqfAQBUFwaAlD4DAKguDAApfQYAUF0YAFL6DACguljDADh2spQn3yCpVsdP9p9nNTIAYMZiDQNA0jgyAGDGwgCQZpsBADMWBoA02wwAmLEwAKTZZgDAjIUBIM02AwBmLAwAabYZADBjYQBIs80AgBkLA0CabQYAzFgYANJsMwBgxmJR/rp7UZA0jy6+tnxK95oAzERzEfjD7kVB0iz6hyNHyjndawIwE81F4B0DFwZJ0++Pu9cDYEaai8BdAxcGSVNvVX6sez0AZmT3mvKU3oVB0uTbXZSv7V4PgJlpLga/2L04SJpwq/J7J06Ux3avBcDMfPQU4B97FwlJ02xVLu9eB4CZikV5fu8iIWly7S7Kvd3nPzBzzcXhdNOD3QuGpGm0syiv3NsrH9d97gO0I+CqnWV5f/fCIWnU/VXzvD7Vfb4D/DtxspzbXCxeGIvyWwMXEkljaVV+b3dZ7rxgr3xq93kO8DHt7pXP");
    imageData.append("ai4klzZjYNl+BCEpd7urct3Oqjz16LI8sft8BgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMvtn1fgcNEaHtdEAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagec8a838c416a7dc5fe1a2ab8961b17eb0 = new WeakReference<>(result);
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
BufferedImage imagec8a838c416a7dc5fe1a2ab8961b17eb0=getImagec8a838c416a7dc5fe1a2ab8961b17eb0();
if (imagec8a838c416a7dc5fe1a2ab8961b17eb0 != null) {
    g.drawImage(imagec8a838c416a7dc5fe1a2ab8961b17eb0, 0, 0, null);
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
	private width() {
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
       width base = new width();
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
       width base = new width();
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
        return width::new;
    }
}

