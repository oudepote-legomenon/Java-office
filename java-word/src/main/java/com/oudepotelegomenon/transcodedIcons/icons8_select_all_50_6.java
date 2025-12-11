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
public class icons8_select_all_50_6 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.0f, 4.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(13.86f, 0.0f, 27.72f, 0.0f, 42.0f, 0.0f);
generalPath.curveTo(42.0f, 13.86f, 42.0f, 27.72f, 42.0f, 42.0f);
generalPath.curveTo(28.14f, 42.0f, 14.28f, 42.0f, 0.0f, 42.0f);
generalPath.curveTo(0.0f, 28.14f, 0.0f, 14.28f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 200, 229, 255)) : new Color(186, 200, 229, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 20.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.9755859f, 1.1672363f, 1.9755859f, 1.1672363f, 4.0f, 3.0f);
generalPath.curveTo(4.4541016f, 5.4519043f, 4.4541016f, 5.4519043f, 4.390625f, 8.324219f);
generalPath.curveTo(4.377734f, 9.352246f, 4.364844f, 10.380274f, 4.3515625f, 11.439453f);
generalPath.curveTo(4.318047f, 12.511309f, 4.284531f, 13.583164f, 4.25f, 14.6875f);
generalPath.curveTo(4.231953f, 15.770957f, 4.2139063f, 16.854414f, 4.1953125f, 17.970703f);
generalPath.curveTo(4.148135f, 20.648022f, 4.0823226f, 23.323568f, 4.0f, 26.0f);
generalPath.curveTo(-0.5206665f, 26.024689f, -5.041294f, 26.042854f, -9.562012f, 26.054932f);
generalPath.curveTo(-11.1004305f, 26.059965f, -12.638844f, 26.066793f, -14.177246f, 26.07544f);
generalPath.curveTo(-16.386406f, 26.087547f, -18.5955f, 26.093237f, -20.804688f, 26.097656f);
generalPath.curveTo(-21.839146f, 26.105398f, -21.839146f, 26.105398f, -22.8945f, 26.113297f);
generalPath.curveTo(-27.772257f, 26.113873f, -27.772257f, 26.113873f, -30.0f, 25.0f);
generalPath.curveTo(-30.0f, 24.34f, -30.0f, 23.68f, -30.0f, 23.0f);
generalPath.curveTo(-31.65f, 23.0f, -33.3f, 23.0f, -35.0f, 23.0f);
generalPath.curveTo(-29.034168f, 15.332574f, -29.034168f, 15.332574f, -24.0f, 14.0f);
generalPath.curveTo(-24.0f, 13.34f, -24.0f, 12.68f, -24.0f, 12.0f);
generalPath.curveTo(-22.35f, 12.33f, -20.7f, 12.66f, -19.0f, 13.0f);
generalPath.curveTo(-18.67f, 12.34f, -18.34f, 11.68f, -18.0f, 11.0f);
generalPath.curveTo(-15.9375f, 10.375f, -15.9375f, 10.375f, -14.0f, 10.0f);
generalPath.curveTo(-14.33f, 9.34f, -14.66f, 8.68f, -15.0f, 8.0f);
generalPath.curveTo(-12.03f, 8.0f, -9.06f, 8.0f, -6.0f, 8.0f);
generalPath.curveTo(-5.34f, 6.68f, -4.68f, 5.36f, -4.0f, 4.0f);
generalPath.curveTo(-2.7052903f, 2.6291308f, -1.378491f, 1.2865916f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(217, 231, 247, 255)) : new Color(217, 231, 247, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 43.0f, 7.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.80588007f, 4.7656364f, 0.95051897f, 8.465238f, -1.6523438f, 12.667969f);
generalPath.curveTo(-4.7398357f, 16.081032f, -7.2119813f, 18.646353f, -11.824219f, 19.558594f);
generalPath.curveTo(-14.284658f, 19.562103f, -16.576326f, 19.40985f, -19.0f, 19.0f);
generalPath.curveTo(-17.730469f, 17.015625f, -17.730469f, 17.015625f, -16.0f, 15.0f);
generalPath.curveTo(-12.3125f, 14.75f, -12.3125f, 14.75f, -9.0f, 15.0f);
generalPath.curveTo(-9.0f, 14.34f, -9.0f, 13.68f, -9.0f, 13.0f);
generalPath.curveTo(-15.27f, 13.0f, -21.54f, 13.0f, -28.0f, 13.0f);
generalPath.curveTo(-28.0f, 12.67f, -28.0f, 12.34f, -28.0f, 12.0f);
generalPath.curveTo(-22.72f, 12.0f, -17.44f, 12.0f, -12.0f, 12.0f);
generalPath.curveTo(-12.0f, 11.34f, -12.0f, 10.68f, -12.0f, 10.0f);
generalPath.curveTo(-17.28f, 10.0f, -22.56f, 10.0f, -28.0f, 10.0f);
generalPath.curveTo(-28.0f, 9.67f, -28.0f, 9.34f, -28.0f, 9.0f);
generalPath.curveTo(-25.43789f, 8.804304f, -22.875675f, 8.618194f, -20.3125f, 8.4375f);
generalPath.curveTo(-19.59127f, 8.381426f, -18.870039f, 8.325352f, -18.126953f, 8.267578f);
generalPath.curveTo(-14.226859f, 8.000448f, -10.78889f, 7.991124f, -7.0f, 9.0f);
generalPath.curveTo(-6.9071875f, 8.164687f, -6.9071875f, 8.164687f, -6.8125f, 7.3125f);
generalPath.curveTo(-5.8962426f, 4.704691f, -3.1295516f, 0.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(201, 229, 250, 255)) : new Color(201, 229, 250, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 44.0f, 28.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 5.94f, 2.0f, 11.88f, 2.0f, 18.0f);
generalPath.curveTo(-3.94f, 18.0f, -9.88f, 18.0f, -16.0f, 18.0f);
generalPath.curveTo(-15.0f, 15.0f, -15.0f, 15.0f, -12.9375f, 13.8125f);
generalPath.curveTo(-7.546283f, 10.486005f, -2.560992f, 5.8705816f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(185, 196, 229, 255)) : new Color(185, 196, 229, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 18.0f, 32.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(4.8921275f, 1.2217978f, 6.7888446f, 1.4061402f, 8.6875f, 1.5625f);
generalPath.curveTo(9.681367f, 1.6462891f, 10.675235f, 1.7300781f, 11.699219f, 1.8164062f);
generalPath.curveTo(12.838105f, 1.9072852f, 12.838105f, 1.9072852f, 14.0f, 2.0f);
generalPath.curveTo(14.0f, 2.33f, 14.0f, 2.66f, 14.0f, 3.0f);
generalPath.curveTo(12.669687f, 3.309375f, 12.669687f, 3.309375f, 11.3125f, 3.625f);
generalPath.curveTo(7.005611f, 5.4127655f, 5.589746f, 7.1546197f, 3.0f, 11.0f);
generalPath.curveTo(3.33f, 11.99f, 3.66f, 12.98f, 4.0f, 14.0f);
generalPath.curveTo(-3.75f, 14.125f, -3.75f, 14.125f, -6.0f, 13.0f);
generalPath.curveTo(-6.0f, 12.34f, -6.0f, 11.68f, -6.0f, 11.0f);
generalPath.curveTo(-7.65f, 11.0f, -9.3f, 11.0f, -11.0f, 11.0f);
generalPath.curveTo(-5.0341687f, 3.3325741f, -5.0341687f, 3.3325741f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(198, 221, 243, 255)) : new Color(198, 221, 243, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 37.0f, 4.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.97f, 0.0f, 5.94f, 0.0f, 9.0f, 0.0f);
generalPath.curveTo(9.0f, 5.94f, 9.0f, 11.88f, 9.0f, 18.0f);
generalPath.curveTo(7.68f, 17.67f, 6.36f, 17.34f, 5.0f, 17.0f);
generalPath.curveTo(4.698843f, 17.500237f, 4.3976855f, 18.000473f, 4.0874023f, 18.51587f);
generalPath.curveTo(1.883468f, 21.64899f, 0.28013384f, 23.710882f, -3.5576172f, 24.577637f);
generalPath.curveTo(-6.5230107f, 24.68824f, -9.412807f, 24.61141f, -12.375f, 24.4375f);
generalPath.curveTo(-13.397226f, 24.405918f, -14.419453f, 24.374336f, -15.472656f, 24.341797f);
generalPath.curveTo(-17.984755f, 24.259626f, -20.490866f, 24.144844f, -23.0f, 24.0f);
generalPath.curveTo(-23.0f, 23.34f, -23.0f, 22.68f, -23.0f, 22.0f);
generalPath.curveTo(-22.154053f, 22.017403f, -22.154053f, 22.017403f, -21.291016f, 22.035156f);
generalPath.curveTo(-8.693565f, 22.683073f, -8.693565f, 22.683073f, 2.1875f, 17.5625f);
generalPath.curveTo(5.6372533f, 13.110945f, 6.180783f, 8.513877f, 6.0f, 3.0f);
generalPath.curveTo(4.35f, 3.0f, 2.7f, 3.0f, 1.0f, 3.0f);
generalPath.curveTo(0.67f, 2.01f, 0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(176, 173, 209, 255)) : new Color(176, 173, 209, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 43.0f, 14.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(-0.7637967f, 4.645558f, -3.3108683f, 7.14586f, -6.5898438f, 10.359375f);
generalPath.curveTo(-10.57349f, 13.071095f, -14.378385f, 12.681878f, -19.0f, 12.0f);
generalPath.curveTo(-17.761719f, 10.015625f, -17.761719f, 10.015625f, -16.0f, 8.0f);
generalPath.curveTo(-13.238577f, 7.4720035f, -10.836345f, 7.81401f, -8.0f, 8.0f);
generalPath.curveTo(-7.7525f, 7.4225f, -7.505f, 6.845f, -7.25f, 6.25f);
generalPath.curveTo(-5.5820746f, 3.247734f, -3.6772537f, 0.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(226, 241, 254, 255)) : new Color(226, 241, 254, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 30.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(4.95f, 0.0f, 9.9f, 0.0f, 15.0f, 0.0f);
generalPath.curveTo(15.0f, 0.33f, 15.0f, 0.66f, 15.0f, 1.0f);
generalPath.curveTo(13.35f, 1.33f, 11.7f, 1.66f, 10.0f, 2.0f);
generalPath.curveTo(12.97f, 2.33f, 15.94f, 2.66f, 19.0f, 3.0f);
generalPath.curveTo(19.0f, 3.33f, 19.0f, 3.66f, 19.0f, 4.0f);
generalPath.curveTo(12.666667f, 4.0f, 6.3333335f, 4.0f, 0.0f, 4.0f);
generalPath.curveTo(0.0f, 2.68f, 0.0f, 1.36f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(159, 143, 185, 255)) : new Color(159, 143, 185, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 22.234375f, 35.28515625f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.58265626f, 0.23589844f, 1.1653125f, 0.47179687f, 1.765625f, 0.71484375f);
generalPath.curveTo(-0.5677083f, 3.048177f, -2.9010417f, 5.3815103f, -5.234375f, 7.7148438f);
generalPath.curveTo(-7.359375f, 7.3398438f, -7.359375f, 7.3398438f, -9.234375f, 6.7148438f);
generalPath.curveTo(-8.167214f, 5.5127892f, -7.079992f, 4.3285203f, -5.984375f, 3.1523438f);
generalPath.curveTo(-5.381094f, 2.4910548f, -4.7778125f, 1.8297657f, -4.15625f, 1.1484375f);
generalPath.curveTo(-2.234375f, -0.28515625f, -2.234375f, -0.28515625f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(228, 241, 253, 255)) : new Color(228, 241, 253, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 44.0f, 37.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 2.97f, 2.0f, 5.94f, 2.0f, 9.0f);
generalPath.curveTo(-0.97f, 9.0f, -3.94f, 9.0f, -7.0f, 9.0f);
generalPath.curveTo(-7.0f, 8.34f, -7.0f, 7.68f, -7.0f, 7.0f);
generalPath.curveTo(-4.69f, 7.0f, -2.38f, 7.0f, 0.0f, 7.0f);
generalPath.curveTo(0.0f, 4.69f, 0.0f, 2.38f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(142, 111, 159, 255)) : new Color(142, 111, 159, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 27.0f, 28.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.64f, 0.0f, 5.28f, 0.0f, 8.0f, 0.0f);
generalPath.curveTo(7.505f, 0.639375f, 7.01f, 1.27875f, 6.5f, 1.9375f);
generalPath.curveTo(4.9019713f, 3.7097435f, 4.9019713f, 3.7097435f, 5.0f, 5.0f);
generalPath.curveTo(2.03f, 5.0f, -0.94f, 5.0f, -4.0f, 5.0f);
generalPath.curveTo(-3.67f, 4.34f, -3.34f, 3.68f, -3.0f, 3.0f);
generalPath.curveTo(-0.9375f, 2.375f, -0.9375f, 2.375f, 1.0f, 2.0f);
generalPath.curveTo(0.67f, 1.34f, 0.34f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(203, 218, 240, 255)) : new Color(203, 218, 240, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.0f, 4.0f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.97f, 0.0f, 5.94f, 0.0f, 9.0f, 0.0f);
generalPath.curveTo(9.0f, 0.66f, 9.0f, 1.32f, 9.0f, 2.0f);
generalPath.curveTo(6.69f, 2.0f, 4.38f, 2.0f, 2.0f, 2.0f);
generalPath.curveTo(2.0f, 4.31f, 2.0f, 6.62f, 2.0f, 9.0f);
generalPath.curveTo(1.34f, 9.0f, 0.68f, 9.0f, 0.0f, 9.0f);
generalPath.curveTo(0.0f, 6.03f, 0.0f, 3.06f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(144, 110, 161, 255)) : new Color(144, 110, 161, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.0f, 37.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 2.31f, 2.0f, 4.62f, 2.0f, 7.0f);
generalPath.curveTo(3.98f, 7.0f, 5.96f, 7.0f, 8.0f, 7.0f);
generalPath.curveTo(8.33f, 7.66f, 8.66f, 8.32f, 9.0f, 9.0f);
generalPath.curveTo(6.03f, 9.0f, 3.06f, 9.0f, 0.0f, 9.0f);
generalPath.curveTo(0.0f, 6.03f, 0.0f, 3.06f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(143, 108, 160, 255)) : new Color(143, 108, 160, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 37.0f, 4.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.97f, 0.0f, 5.94f, 0.0f, 9.0f, 0.0f);
generalPath.curveTo(9.0f, 2.97f, 9.0f, 5.94f, 9.0f, 9.0f);
generalPath.curveTo(8.34f, 8.67f, 7.68f, 8.34f, 7.0f, 8.0f);
generalPath.curveTo(7.0f, 6.02f, 7.0f, 4.04f, 7.0f, 2.0f);
generalPath.curveTo(4.69f, 2.0f, 2.38f, 2.0f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(143, 108, 160, 255)) : new Color(143, 108, 160, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 18.0f, 41.0f));
// _0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(3.6875f, 3.0625f, 3.6875f, 3.0625f, 4.0f, 5.0f);
generalPath.curveTo(1.36f, 5.0f, -1.28f, 5.0f, -4.0f, 5.0f);
generalPath.curveTo(-3.0f, 2.0f, -3.0f, 2.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(176, 163, 207, 255)) : new Color(176, 163, 207, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 35.0f));
// _0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(0.69f, 3.31f, -1.62f, 5.62f, -4.0f, 8.0f);
generalPath.curveTo(-4.99f, 7.67f, -5.98f, 7.34f, -7.0f, 7.0f);
generalPath.curveTo(-4.69f, 4.69f, -2.38f, 2.38f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(221, 239, 254, 255)) : new Color(221, 239, 254, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 30.1875f, 21.75f));
// _0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.928125f, 0.0825f, 1.85625f, 0.165f, 2.8125f, 0.25f);
generalPath.curveTo(1.6875f, 2.25f, 1.6875f, 2.25f, -0.1875f, 4.25f);
generalPath.curveTo(-3.375f, 4.5f, -3.375f, 4.5f, -6.1875f, 4.25f);
generalPath.curveTo(-4.364343f, 1.0088327f, -3.8250005f, 0.30000004f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(209, 234, 252, 255)) : new Color(209, 234, 252, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 7.0f));
// _0_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.33f, 0.99f, 0.66f, 1.98f, 1.0f, 3.0f);
generalPath.curveTo(-1.31f, 4.98f, -3.62f, 6.96f, -6.0f, 9.0f);
generalPath.curveTo(-4.8663487f, 4.465396f, -3.3580663f, 3.0997534f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(221, 239, 254, 255)) : new Color(221, 239, 254, 255);
g.setPaint(paint);
g.fill(shape);
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
        return 4.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 4.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 42.4541015625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 42.125;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_select_all_50_6() {
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
       icons8_select_all_50_6 base = new icons8_select_all_50_6();
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
       icons8_select_all_50_6 base = new icons8_select_all_50_6();
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
        return icons8_select_all_50_6::new;
    }
}

