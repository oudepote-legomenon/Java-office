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
public class icons8_highlight_50_3 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 35.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.255815f, 1.1279075f, 3.2014408f, 2.2618804f, 4.8125f, 4.1875f);
generalPath.curveTo(5.3371487f, 4.811406f, 5.861797f, 5.4353123f, 6.4023438f, 6.078125f);
generalPath.curveTo(6.92957f, 6.7123437f, 7.456797f, 7.3465624f, 8.0f, 8.0f);
generalPath.curveTo(8.496289f, 8.592969f, 8.9925785f, 9.185938f, 9.503906f, 9.796875f);
generalPath.curveTo(10.672516f, 11.195211f, 11.836723f, 12.597224f, 13.0f, 14.0f);
generalPath.curveTo(7.714604f, 20.316692f, 1.9763068f, 26.078218f, -3.9318848f, 31.806885f);
generalPath.curveTo(-4.5705347f, 32.433933f, -5.2091846f, 33.06098f, -5.8671875f, 33.70703f);
generalPath.curveTo(-6.7351294f, 34.549717f, -6.7351294f, 34.549717f, -7.6206055f, 35.409424f);
generalPath.curveTo(-9.234343f, 37.06528f, -9.234343f, 37.06528f, -10.0f, 40.0f);
generalPath.curveTo(-12.849378f, 41.83174f, -15.684375f, 42.447395f, -19.0f, 43.0f);
generalPath.curveTo(-19.33f, 43.99f, -19.66f, 44.98f, -20.0f, 46.0f);
generalPath.curveTo(-21.624144f, 46.19478f, -23.249365f, 46.380596f, -24.875f, 46.5625f);
generalPath.curveTo(-26.232384f, 46.71912f, -26.232384f, 46.71912f, -27.617188f, 46.878906f);
generalPath.curveTo(-30.0f, 47.0f, -30.0f, 47.0f, -32.0f, 46.0f);
generalPath.curveTo(-32.460655f, 42.92897f, -32.48832f, 40.775566f, -30.804688f, 38.101562f);
generalPath.curveTo(-29.796852f, 36.820244f, -28.764036f, 35.55804f, -27.703125f, 34.320312f);
generalPath.curveTo(-25.804634f, 31.917316f, -25.804634f, 31.917316f, -24.464844f, 28.417969f);
generalPath.curveTo(-21.471476f, 22.239035f, -16.212336f, 17.864136f, -11.3125f, 13.1875f);
generalPath.curveTo(-9.385418f, 11.333305f, -7.466977f, 9.470993f, -5.5507812f, 7.6054688f);
generalPath.curveTo(-4.701692f, 6.792312f, -3.8526025f, 5.979155f, -2.9777832f, 5.1413574f);
generalPath.curveTo(-0.79603547f, 3.0737247f, -0.79603547f, 3.0737247f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 61, 222, 255)) : new Color(191, 61, 222, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 34.0f, 3.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.33f, 0.99f, 0.66f, 1.98f, 1.0f, 3.0f);
generalPath.curveTo(-5.6f, 9.6f, -12.2f, 16.2f, -19.0f, 23.0f);
generalPath.curveTo(-17.02f, 25.31f, -15.04f, 27.62f, -13.0f, 30.0f);
generalPath.curveTo(-12.34f, 31.32f, -11.68f, 32.64f, -11.0f, 34.0f);
generalPath.curveTo(-13.647389f, 35.46063f, -14.894484f, 36.0f, -18.0f, 36.0f);
generalPath.curveTo(-18.66f, 37.32f, -19.32f, 38.64f, -20.0f, 40.0f);
generalPath.curveTo(-21.051874f, 38.948124f, -21.051874f, 38.948124f, -22.125f, 37.875f);
generalPath.curveTo(-23.07375f, 37.25625f, -24.0225f, 36.6375f, -25.0f, 36.0f);
generalPath.curveTo(-28.281044f, 36.62036f, -28.281044f, 36.62036f, -31.0f, 38.0f);
generalPath.curveTo(-30.697071f, 37.526913f, -30.39414f, 37.05383f, -30.082031f, 36.566406f);
generalPath.curveTo(-29.663086f, 35.905117f, -29.24414f, 35.243828f, -28.8125f, 34.5625f);
generalPath.curveTo(-28.203419f, 33.60537f, -28.203419f, 33.60537f, -27.582031f, 32.628906f);
generalPath.curveTo(-26.03929f, 30.159767f, -26.03929f, 30.159767f, -25.088623f, 28.095459f);
generalPath.curveTo(-21.448616f, 20.775446f, -16.015547f, 15.5593815f, -10.1875f, 9.9375f);
generalPath.curveTo(-9.197636f, 8.967748f, -8.208695f, 7.9970503f, -7.220703f, 7.0253906f);
generalPath.curveTo(-4.822697f, 4.674175f, -2.415834f, 2.3328705f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(192, 188, 195, 255)) : new Color(192, 188, 195, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 45.0f, 14.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(0.49527296f, 3.5492642f, -1.5620954f, 5.7691183f, -4.3164062f, 8.441406f);
generalPath.curveTo(-5.5858107f, 9.687608f, -5.5858107f, 9.687608f, -6.8808594f, 10.958984f);
generalPath.curveTo(-7.765801f, 11.818145f, -8.650743f, 12.677304f, -9.5625f, 13.5625f);
generalPath.curveTo(-11.318373f, 15.267441f, -13.0699f, 16.976871f, -14.816406f, 18.691406f);
generalPath.curveTo(-15.594436f, 19.446234f, -16.372465f, 20.20106f, -17.174072f, 20.97876f);
generalPath.curveTo(-19.209743f, 22.960415f, -19.209743f, 22.960415f, -20.0f, 26.0f);
generalPath.curveTo(-22.849379f, 27.831743f, -25.684374f, 28.447395f, -29.0f, 29.0f);
generalPath.curveTo(-29.33f, 29.99f, -29.66f, 30.98f, -30.0f, 32.0f);
generalPath.curveTo(-31.624144f, 32.19478f, -33.249363f, 32.380596f, -34.875f, 32.5625f);
generalPath.curveTo(-36.232384f, 32.71912f, -36.232384f, 32.71912f, -37.617188f, 32.878906f);
generalPath.curveTo(-40.0f, 33.0f, -40.0f, 33.0f, -42.0f, 32.0f);
generalPath.curveTo(-42.25f, 29.6875f, -42.25f, 29.6875f, -42.0f, 27.0f);
generalPath.curveTo(-40.0f, 25.1875f, -40.0f, 25.1875f, -38.0f, 24.0f);
generalPath.curveTo(-35.506386f, 25.203814f, -33.31857f, 26.454287f, -31.0f, 28.0f);
generalPath.curveTo(-30.34f, 27.01f, -29.68f, 26.02f, -29.0f, 25.0f);
generalPath.curveTo(-27.011719f, 24.042969f, -27.011719f, 24.042969f, -24.6875f, 23.1875f);
generalPath.curveTo(-20.896252f, 21.593727f, -18.771952f, 20.017212f, -16.300781f, 16.628906f);
generalPath.curveTo(-14.75376f, 14.691646f, -13.023159f, 13.218292f, -11.125f, 11.625f);
generalPath.curveTo(-7.4870257f, 8.545124f, -4.455358f, 5.1929617f, -1.4453125f, 1.5039062f);
generalPath.curveTo(-0.72988284f, 0.75947267f, -0.72988284f, 0.75947267f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(117, 36, 132, 255)) : new Color(117, 36, 132, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 34.0f, 3.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.33f, 0.99f, 0.66f, 1.98f, 1.0f, 3.0f);
generalPath.curveTo(0.4203247f, 3.558728f, -0.15935059f, 4.117456f, -0.7565918f, 4.693115f);
generalPath.curveTo(-3.4110134f, 7.263699f, -6.0492268f, 9.850349f, -8.6875f, 12.4375f);
generalPath.curveTo(-9.599512f, 13.315996f, -10.511523f, 14.194492f, -11.451172f, 15.099609f);
generalPath.curveTo(-16.179392f, 19.759056f, -20.08772f, 24.053623f, -22.99414f, 30.054688f);
generalPath.curveTo(-24.569471f, 33.101345f, -26.716887f, 35.45596f, -29.0f, 38.0f);
generalPath.curveTo(-29.66f, 37.67f, -30.32f, 37.34f, -31.0f, 37.0f);
generalPath.curveTo(-30.419922f, 36.27297f, -30.419922f, 36.27297f, -29.828125f, 35.53125f);
generalPath.curveTo(-29.307344f, 34.86094f, -28.786562f, 34.190624f, -28.25f, 33.5f);
generalPath.curveTo(-27.484297f, 32.525467f, -27.484297f, 32.525467f, -26.703125f, 31.53125f);
generalPath.curveTo(-24.835869f, 28.927614f, -24.835869f, 28.927614f, -23.46875f, 25.40625f);
generalPath.curveTo(-20.442225f, 19.190702f, -15.159895f, 14.737732f, -10.25f, 10.0f);
generalPath.curveTo(-9.255583f, 9.025685f, -8.262085f, 8.050431f, -7.2695312f, 7.0742188f);
generalPath.curveTo(-4.855209f, 4.7067766f, -2.4320319f, 2.349223f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(242, 147, 251, 255)) : new Color(242, 147, 251, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 19.0f, 24.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.9413908f, 1.6675115f, 6.7892814f, 4.2271066f, 10.0f, 7.0f);
generalPath.curveTo(8.68f, 8.65f, 7.36f, 10.3f, 6.0f, 12.0f);
generalPath.curveTo(2.1831577f, 10.44499f, -0.19195732f, 7.964045f, -3.0f, 5.0f);
generalPath.curveTo(-1.125f, 1.125f, -1.125f, 1.125f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(157, 54, 219, 255)) : new Color(157, 54, 219, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 7.0f, 38.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.621875f, 1.04875f, 3.7937136f, 1.6493131f, 5.25f, 4.125f);
generalPath.curveTo(5.4975f, 4.74375f, 5.745f, 5.3625f, 6.0f, 6.0f);
generalPath.curveTo(3.4121227f, 8.587877f, 1.5799214f, 8.627091f, -2.0f, 9.0f);
generalPath.curveTo(-2.66f, 8.67f, -3.32f, 8.34f, -4.0f, 8.0f);
generalPath.curveTo(-4.25f, 5.6875f, -4.25f, 5.6875f, -4.0f, 3.0f);
generalPath.curveTo(-2.0f, 1.1875f, -2.0f, 1.1875f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(162, 46, 183, 255)) : new Color(162, 46, 183, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 23.0f, 36.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.33f, 1.32f, 0.66f, 2.64f, 1.0f, 4.0f);
generalPath.curveTo(-1.91765f, 5.9451f, -3.625373f, 6.452763f, -7.0f, 7.0f);
generalPath.curveTo(-7.33f, 7.99f, -7.66f, 8.98f, -8.0f, 10.0f);
generalPath.curveTo(-8.99f, 9.67f, -9.98f, 9.34f, -11.0f, 9.0f);
generalPath.curveTo(-8.030842f, 3.6555152f, -5.772811f, 1.9982806f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(146, 120, 123, 255)) : new Color(146, 120, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 12.0f, 25.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.99f, 1.32f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(-0.76206845f, 7.561941f, -3.551314f, 11.912668f, -7.0f, 16.0f);
generalPath.curveTo(-7.66f, 15.67f, -8.32f, 15.34f, -9.0f, 15.0f);
generalPath.curveTo(-8.60168f, 14.503711f, -8.20336f, 14.0074215f, -7.7929688f, 13.496094f);
generalPath.curveTo(-4.40115f, 9.146974f, -1.9368402f, 5.164907f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(230, 214, 231, 255)) : new Color(230, 214, 231, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 35.0f, 0.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.273137f, 1.1365685f, 3.2479217f, 2.3109949f, 4.875f, 4.25f);
generalPath.curveTo(5.4009376f, 4.8751955f, 5.926875f, 5.5003905f, 6.46875f, 6.1445312f);
generalPath.curveTo(8.338142f, 8.409739f, 10.18239f, 10.693033f, 12.0f, 13.0f);
generalPath.curveTo(9.059976f, 11.612573f, 6.4453335f, 10.031705f, 3.8125f, 8.125f);
generalPath.curveTo(3.1176953f, 7.6325784f, 2.4228907f, 7.1401563f, 1.7070312f, 6.6328125f);
generalPath.curveTo(-0.23802789f, 4.772321f, -0.71693134f, 3.6530747f, -1.0f, 1.0f);
generalPath.curveTo(-0.67f, 0.67f, -0.34f, 0.34f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(207, 104, 225, 255)) : new Color(207, 104, 225, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 45.0f, 14.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(0.4169423f, 4.2742558f, -2.5056841f, 6.265318f, -6.0f, 9.0f);
generalPath.curveTo(-4.4722133f, 5.56248f, -2.4981894f, 2.8104632f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(132, 40, 145, 255)) : new Color(132, 40, 145, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 7.0f, 47.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(4.0f, 1.0f, 4.0f, 1.0f, 4.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(148, 0, 148, 255)) : new Color(148, 0, 148, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(233, 212, 233, 255)) : new Color(233, 212, 233, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 170, 170, 255)) : new Color(170, 170, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(63, 0, 63, 255)) : new Color(63, 0, 63, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 127, 255, 255)) : new Color(255, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(127, 0, 127, 255)) : new Color(127, 0, 127, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(127, 127, 127, 255)) : new Color(127, 127, 127, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(127, 127, 127, 255)) : new Color(127, 127, 127, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 127, 255, 255)) : new Color(255, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 127, 255, 255)) : new Color(255, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(127, 0, 127, 255)) : new Color(127, 0, 127, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 0, 85, 255)) : new Color(85, 0, 85, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_24
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 0, 170, 255)) : new Color(85, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_25
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_26
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_27
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 0, 170, 255)) : new Color(85, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_28
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_29
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_30
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 191, 191, 255)) : new Color(191, 191, 191, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_31
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 0, 170, 255)) : new Color(85, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_32
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_33
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_34
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_35
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 0, 170, 255)) : new Color(85, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_36
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 0, 170, 255)) : new Color(85, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_37
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_38
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 0, 170, 255)) : new Color(85, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_39
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(127, 127, 255, 255)) : new Color(127, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_40
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_41
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 127, 255, 255)) : new Color(255, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_42
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(85, 0, 170, 255)) : new Color(85, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_43
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_44
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_45
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_46
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_47
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_48
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_49
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_50
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_51
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_52
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(170, 0, 170, 255)) : new Color(170, 0, 170, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_53
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_54
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(127, 0, 127, 255)) : new Color(127, 0, 127, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_55
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_56
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(127, 0, 127, 255)) : new Color(127, 0, 127, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_57
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_58
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_59
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_60
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_61
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 127, 255, 255)) : new Color(255, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_62
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_63
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(127, 127, 255, 255)) : new Color(127, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_64
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_65
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 63, 191, 255)) : new Color(191, 63, 191, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_66
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_67
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 63, 255, 255)) : new Color(191, 63, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_68
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_69
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 63, 255, 255)) : new Color(191, 63, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_70
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_71
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 63, 255, 255)) : new Color(191, 63, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_72
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_73
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 63, 191, 255)) : new Color(191, 63, 191, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_74
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_75
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 63, 191, 255)) : new Color(191, 63, 191, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_76
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);

}

private void _paint1(Graphics2D g,float origAlpha) {
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_77
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 85, 255, 255)) : new Color(255, 85, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_78
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_79
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 63, 255, 255)) : new Color(191, 63, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_80
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 170, 255, 255)) : new Color(255, 170, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_81
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 127, 255, 255)) : new Color(255, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_82
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 127, 255, 255)) : new Color(255, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_83
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 127, 255, 255)) : new Color(255, 127, 255, 255);
g.setPaint(paint);
g.fill(shape);

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
_paint1(g, origAlpha);


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
	private icons8_highlight_50_3() {
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
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
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
       icons8_highlight_50_3 base = new icons8_highlight_50_3();
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
       icons8_highlight_50_3 base = new icons8_highlight_50_3();
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
        return icons8_highlight_50_3::new;
    }
}

