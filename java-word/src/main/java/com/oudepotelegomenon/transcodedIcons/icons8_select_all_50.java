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
public class icons8_select_all_50 implements RadianceIcon {
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
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(16.5f, 0.0f, 33.0f, 0.0f, 50.0f, 0.0f);
generalPath.curveTo(50.0f, 16.5f, 50.0f, 33.0f, 50.0f, 50.0f);
generalPath.curveTo(33.5f, 50.0f, 17.0f, 50.0f, 0.0f, 50.0f);
generalPath.curveTo(0.0f, 33.5f, 0.0f, 17.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(247, 241, 219, 255)) : new Color(247, 241, 219, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 16.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.475f, 0.495f, 2.475f, 0.495f, 5.0f, 1.0f);
generalPath.curveTo(5.0f, 2.65f, 5.0f, 4.3f, 5.0f, 6.0f);
generalPath.curveTo(4.01f, 6.33f, 3.02f, 6.66f, 2.0f, 7.0f);
generalPath.curveTo(2.0f, 8.32f, 2.0f, 9.64f, 2.0f, 11.0f);
generalPath.curveTo(2.969375f, 10.814375f, 3.93875f, 10.62875f, 4.9375f, 10.4375f);
generalPath.curveTo(6.4534373f, 10.220938f, 6.4534373f, 10.220938f, 8.0f, 10.0f);
generalPath.curveTo(9.0f, 11.0f, 9.0f, 11.0f, 9.125f, 14.3125f);
generalPath.curveTo(9.027316f, 17.194183f, 8.6822f, 19.271198f, 8.0f, 22.0f);
generalPath.curveTo(8.33f, 22.99f, 8.66f, 23.98f, 9.0f, 25.0f);
generalPath.curveTo(9.99f, 25.33f, 10.98f, 25.66f, 12.0f, 26.0f);
generalPath.curveTo(11.67f, 26.99f, 11.34f, 27.98f, 11.0f, 29.0f);
generalPath.curveTo(8.03f, 29.0f, 5.06f, 29.0f, 2.0f, 29.0f);
generalPath.curveTo(2.0f, 30.65f, 2.0f, 32.3f, 2.0f, 34.0f);
generalPath.curveTo(1.34f, 34.0f, 0.68f, 34.0f, 0.0f, 34.0f);
generalPath.curveTo(0.0f, 22.78f, 0.0f, 11.56f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(248, 242, 223, 255)) : new Color(248, 242, 223, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 27.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(7.26f, 0.0f, 14.52f, 0.0f, 22.0f, 0.0f);
generalPath.curveTo(21.67f, 0.99f, 21.34f, 1.98f, 21.0f, 3.0f);
generalPath.curveTo(14.4f, 3.0f, 7.8f, 3.0f, 1.0f, 3.0f);
generalPath.curveTo(0.67f, 2.01f, 0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(59, 149, 228, 255)) : new Color(59, 149, 228, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.0f, 14.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(6.6f, 0.0f, 13.2f, 0.0f, 20.0f, 0.0f);
generalPath.curveTo(20.33f, 0.99f, 20.66f, 1.98f, 21.0f, 3.0f);
generalPath.curveTo(13.74f, 3.0f, 6.48f, 3.0f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(48, 166, 235, 255)) : new Color(48, 166, 235, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.495f, 0.99f, 0.495f, 2.0f, 1.0f);
generalPath.curveTo(2.625f, 3.5625f, 2.625f, 3.5625f, 3.0f, 6.0f);
generalPath.curveTo(5.64f, 5.67f, 8.28f, 5.34f, 11.0f, 5.0f);
generalPath.curveTo(11.0f, 6.32f, 11.0f, 7.64f, 11.0f, 9.0f);
generalPath.curveTo(10.34f, 9.0f, 9.68f, 9.0f, 9.0f, 9.0f);
generalPath.curveTo(8.67f, 9.99f, 8.34f, 10.98f, 8.0f, 12.0f);
generalPath.curveTo(5.36f, 11.67f, 2.72f, 11.34f, 0.0f, 11.0f);
generalPath.curveTo(0.0f, 7.37f, 0.0f, 3.74f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(72, 179, 235, 255)) : new Color(72, 179, 235, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 45.0f, 29.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.65f, 0.0f, 3.3f, 0.0f, 5.0f, 0.0f);
generalPath.curveTo(5.0f, 6.93f, 5.0f, 13.86f, 5.0f, 21.0f);
generalPath.curveTo(4.34f, 20.67f, 3.68f, 20.34f, 3.0f, 20.0f);
generalPath.curveTo(2.6666667f, 18.333334f, 2.3333333f, 16.666666f, 2.0f, 15.0f);
generalPath.curveTo(1.34f, 14.67f, 0.68f, 14.34f, 0.0f, 14.0f);
generalPath.curveTo(0.0f, 13.34f, 0.0f, 12.68f, 0.0f, 12.0f);
generalPath.curveTo(0.99f, 11.67f, 1.98f, 11.34f, 3.0f, 11.0f);
generalPath.curveTo(2.652133f, 9.024632f, 2.652133f, 9.024632f, 2.0f, 7.0f);
generalPath.curveTo(1.34f, 6.67f, 0.68f, 6.34f, 0.0f, 6.0f);
generalPath.curveTo(0.0f, 4.02f, 0.0f, 2.04f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 38.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(3.0f, 1.66f, 3.0f, 2.32f, 3.0f, 3.0f);
generalPath.curveTo(3.99f, 3.33f, 4.98f, 3.66f, 6.0f, 4.0f);
generalPath.curveTo(5.67f, 4.99f, 5.34f, 5.98f, 5.0f, 7.0f);
generalPath.curveTo(2.03f, 7.0f, -0.94f, 7.0f, -4.0f, 7.0f);
generalPath.curveTo(-4.0f, 8.65f, -4.0f, 10.3f, -4.0f, 12.0f);
generalPath.curveTo(-4.66f, 12.0f, -5.32f, 12.0f, -6.0f, 12.0f);
generalPath.curveTo(-6.0f, 8.7f, -6.0f, 5.4f, -6.0f, 2.0f);
generalPath.curveTo(-3.525f, 2.495f, -3.525f, 2.495f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(60, 128, 224, 255)) : new Color(60, 128, 224, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 16.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.475f, 0.495f, 2.475f, 0.495f, 5.0f, 1.0f);
generalPath.curveTo(5.0f, 2.65f, 5.0f, 4.3f, 5.0f, 6.0f);
generalPath.curveTo(4.01f, 6.33f, 3.02f, 6.66f, 2.0f, 7.0f);
generalPath.curveTo(2.0f, 8.32f, 2.0f, 9.64f, 2.0f, 11.0f);
generalPath.curveTo(2.99f, 11.33f, 3.98f, 11.66f, 5.0f, 12.0f);
generalPath.curveTo(5.0f, 13.32f, 5.0f, 14.64f, 5.0f, 16.0f);
generalPath.curveTo(3.35f, 16.66f, 1.7f, 17.32f, 0.0f, 18.0f);
generalPath.curveTo(0.0f, 12.06f, 0.0f, 6.12f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 33.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(5.61f, 0.0f, 11.22f, 0.0f, 17.0f, 0.0f);
generalPath.curveTo(17.0f, 0.99f, 17.0f, 1.98f, 17.0f, 3.0f);
generalPath.curveTo(11.39f, 3.0f, 5.78f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(41, 129, 227, 255)) : new Color(41, 129, 227, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.0f, 20.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(5.28f, 0.0f, 10.56f, 0.0f, 16.0f, 0.0f);
generalPath.curveTo(16.0f, 0.99f, 16.0f, 1.98f, 16.0f, 3.0f);
generalPath.curveTo(10.39f, 3.0f, 4.78f, 3.0f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(63, 163, 230, 255)) : new Color(63, 163, 230, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 41.0f, 15.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.32f, 0.33f, 2.64f, 0.66f, 4.0f, 1.0f);
generalPath.curveTo(4.0f, 2.32f, 4.0f, 3.64f, 4.0f, 5.0f);
generalPath.curveTo(5.65f, 4.67f, 7.3f, 4.34f, 9.0f, 4.0f);
generalPath.curveTo(9.0f, 5.65f, 9.0f, 7.3f, 9.0f, 9.0f);
generalPath.curveTo(2.8476562f, 9.097656f, 2.8476562f, 9.097656f, 1.0f, 9.0f);
generalPath.curveTo(0.0f, 8.0f, 0.0f, 8.0f, -0.09765625f, 6.1523438f);
generalPath.curveTo(-0.06510417f, 4.1015625f, -0.03255208f, 2.0507812f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(77, 168, 231, 255)) : new Color(77, 168, 231, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 46.5f, 11.875f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.5f, 0.125f, 2.5f, 0.125f, 3.5f, 1.125f);
generalPath.curveTo(3.5408077f, 3.1245837f, 3.5425436f, 5.1254525f, 3.5f, 7.125f);
generalPath.curveTo(1.85f, 7.455f, 0.2f, 7.785f, -1.5f, 8.125f);
generalPath.curveTo(-2.16f, 5.815f, -2.82f, 3.505f, -3.5f, 1.125f);
generalPath.curveTo(-2.5f, 0.125f, -2.5f, 0.125f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(253, 245, 225, 255)) : new Color(253, 245, 225, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 50.0f, 4.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.0f, 2.97f, 0.0f, 5.94f, 0.0f, 9.0f);
generalPath.curveTo(-1.65f, 8.67f, -3.3f, 8.34f, -5.0f, 8.0f);
generalPath.curveTo(-5.0f, 5.69f, -5.0f, 3.38f, -5.0f, 1.0f);
generalPath.curveTo(-1.125f, 0.0f, -1.125f, 0.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 39.0f, 5.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.6661191f, -0.042721f, 3.333829f, -0.04063832f, 5.0f, 0.0f);
generalPath.curveTo(6.0f, 1.0f, 6.0f, 1.0f, 6.0625f, 4.0625f);
generalPath.curveTo(6.041875f, 5.031875f, 6.02125f, 6.00125f, 6.0f, 7.0f);
generalPath.curveTo(4.68f, 6.67f, 3.36f, 6.34f, 2.0f, 6.0f);
generalPath.curveTo(2.0f, 5.34f, 2.0f, 4.68f, 2.0f, 4.0f);
generalPath.curveTo(1.01f, 3.67f, 0.02f, 3.34f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 178, 235, 255)) : new Color(68, 178, 235, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 38.0f));
// _0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(3.042721f, 2.666119f, 3.0406384f, 4.333829f, 3.0f, 6.0f);
generalPath.curveTo(2.0f, 7.0f, 2.0f, 7.0f, -0.5625f, 7.0625f);
generalPath.curveTo(-1.7690625f, 7.031563f, -1.7690625f, 7.031563f, -3.0f, 7.0f);
generalPath.curveTo(-3.0f, 5.68f, -3.0f, 4.36f, -3.0f, 3.0f);
generalPath.curveTo(-2.34f, 3.0f, -1.68f, 3.0f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(62, 129, 224, 255)) : new Color(62, 129, 224, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.0f, 41.0f));
// _0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.64f, 0.0f, 5.28f, 0.0f, 8.0f, 0.0f);
generalPath.curveTo(8.0f, 1.32f, 8.0f, 2.64f, 8.0f, 4.0f);
generalPath.curveTo(5.69f, 4.0f, 3.38f, 4.0f, 1.0f, 4.0f);
generalPath.curveTo(0.67f, 2.68f, 0.34f, 1.36f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(79, 138, 223, 255)) : new Color(79, 138, 223, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 15.0f));
// _0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 2.64f, 3.0f, 5.28f, 3.0f, 8.0f);
generalPath.curveTo(1.68f, 8.0f, 0.36f, 8.0f, -1.0f, 8.0f);
generalPath.curveTo(-1.0424173f, 5.6670523f, -1.0409293f, 3.3329744f, -1.0f, 1.0f);
generalPath.curveTo(-0.67f, 0.67f, -0.34f, 0.34f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 164, 231, 255)) : new Color(68, 164, 231, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 16.0f, 5.0f));
// _0_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.31f, 0.0f, 4.62f, 0.0f, 7.0f, 0.0f);
generalPath.curveTo(7.0f, 1.32f, 7.0f, 2.64f, 7.0f, 4.0f);
generalPath.curveTo(4.36f, 4.0f, 1.72f, 4.0f, -1.0f, 4.0f);
generalPath.curveTo(-0.67f, 2.68f, -0.34f, 1.36f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(93, 188, 233, 255)) : new Color(93, 188, 233, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 27.0f, 41.0f));
// _0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.31f, 0.0f, 4.62f, 0.0f, 7.0f, 0.0f);
generalPath.curveTo(7.0f, 1.32f, 7.0f, 2.64f, 7.0f, 4.0f);
generalPath.curveTo(4.69f, 4.0f, 2.38f, 4.0f, 0.0f, 4.0f);
generalPath.curveTo(0.0f, 2.68f, 0.0f, 1.36f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 136, 223, 255)) : new Color(76, 136, 223, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 26.0f));
// _0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.33f, 2.97f, 2.66f, 5.94f, 3.0f, 9.0f);
generalPath.curveTo(1.68f, 9.0f, 0.36f, 9.0f, -1.0f, 9.0f);
generalPath.curveTo(-1.0976562f, 2.8476562f, -1.0976562f, 2.8476562f, -1.0f, 1.0f);
generalPath.curveTo(-0.67f, 0.67f, -0.34f, 0.34f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(63, 145, 228, 255)) : new Color(63, 145, 228, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 27.0f, 5.0f));
// _0_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.31f, 0.0f, 4.62f, 0.0f, 7.0f, 0.0f);
generalPath.curveTo(7.0f, 1.32f, 7.0f, 2.64f, 7.0f, 4.0f);
generalPath.curveTo(4.69f, 4.0f, 2.38f, 4.0f, 0.0f, 4.0f);
generalPath.curveTo(0.0f, 2.68f, 0.0f, 1.36f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(90, 187, 233, 255)) : new Color(90, 187, 233, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 26.0f));
// _0_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(3.0f, 3.31f, 3.0f, 5.62f, 3.0f, 8.0f);
generalPath.curveTo(2.01f, 8.33f, 1.02f, 8.66f, 0.0f, 9.0f);
generalPath.curveTo(-1.3662367f, 6.2675266f, -1.128426f, 4.018011f, -1.0f, 1.0f);
generalPath.curveTo(-0.67f, 0.67f, -0.34f, 0.34f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(63, 146, 227, 255)) : new Color(63, 146, 227, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.495f, 0.99f, 0.495f, 2.0f, 1.0f);
generalPath.curveTo(2.3333333f, 2.6666667f, 2.6666667f, 4.3333335f, 3.0f, 6.0f);
generalPath.curveTo(3.66f, 6.33f, 4.32f, 6.66f, 5.0f, 7.0f);
generalPath.curveTo(5.0f, 7.99f, 5.0f, 8.98f, 5.0f, 10.0f);
generalPath.curveTo(3.35f, 10.33f, 1.7f, 10.66f, 0.0f, 11.0f);
generalPath.curveTo(0.0f, 7.37f, 0.0f, 3.74f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 40.0f));
// _0_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.475f, 0.495f, 2.475f, 0.495f, 5.0f, 1.0f);
generalPath.curveTo(5.0f, 1.99f, 5.0f, 2.98f, 5.0f, 4.0f);
generalPath.curveTo(4.01f, 4.33f, 3.02f, 4.66f, 2.0f, 5.0f);
generalPath.curveTo(2.0f, 6.65f, 2.0f, 8.3f, 2.0f, 10.0f);
generalPath.curveTo(1.34f, 10.0f, 0.68f, 10.0f, 0.0f, 10.0f);
generalPath.curveTo(0.0f, 6.7f, 0.0f, 3.4f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 50.0f, 19.0f));
// _0_24
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.0f, 1.65f, 0.0f, 3.3f, 0.0f, 5.0f);
generalPath.curveTo(-1.65f, 4.67f, -3.3f, 4.34f, -5.0f, 4.0f);
generalPath.curveTo(-5.0f, 3.01f, -5.0f, 2.02f, -5.0f, 1.0f);
generalPath.curveTo(-1.125f, 0.0f, -1.125f, 0.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
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
		return 50.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 50.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_select_all_50() {
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
       icons8_select_all_50 base = new icons8_select_all_50();
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
       icons8_select_all_50 base = new icons8_select_all_50();
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
        return icons8_select_all_50::new;
    }
}

