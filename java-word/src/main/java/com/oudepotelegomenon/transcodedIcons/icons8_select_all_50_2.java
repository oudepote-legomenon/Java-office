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
public class icons8_select_all_50_2 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.9453125f, 5.8046875f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.0182292f, 0.06510417f, 4.0364585f, 0.13020833f, 6.0546875f, 0.1953125f);
generalPath.curveTo(6.0546875f, 0.8553125f, 6.0546875f, 1.5153126f, 6.0546875f, 2.1953125f);
generalPath.curveTo(11.994688f, 2.1953125f, 17.934687f, 2.1953125f, 24.054688f, 2.1953125f);
generalPath.curveTo(24.054688f, 1.5353125f, 24.054688f, 0.8753125f, 24.054688f, 0.1953125f);
generalPath.curveTo(30.109375f, 0.0f, 30.109375f, 0.0f, 32.054688f, 0.1953125f);
generalPath.curveTo(34.054688f, 2.1953125f, 34.054688f, 2.1953125f, 34.25f, 4.140625f);
generalPath.curveTo(34.184895f, 6.158854f, 34.119793f, 8.177083f, 34.054688f, 10.1953125f);
generalPath.curveTo(33.394688f, 10.1953125f, 32.734688f, 10.1953125f, 32.054688f, 10.1953125f);
generalPath.curveTo(32.054688f, 16.135313f, 32.054688f, 22.075312f, 32.054688f, 28.195312f);
generalPath.curveTo(32.714687f, 28.195312f, 33.374687f, 28.195312f, 34.054688f, 28.195312f);
generalPath.curveTo(34.25f, 34.25f, 34.25f, 34.25f, 34.054688f, 36.195312f);
generalPath.curveTo(32.054688f, 38.195312f, 32.054688f, 38.195312f, 30.109375f, 38.390625f);
generalPath.curveTo(28.091146f, 38.32552f, 26.072916f, 38.260418f, 24.054688f, 38.195312f);
generalPath.curveTo(24.054688f, 37.535313f, 24.054688f, 36.875313f, 24.054688f, 36.195312f);
generalPath.curveTo(18.114687f, 36.195312f, 12.174687f, 36.195312f, 6.0546875f, 36.195312f);
generalPath.curveTo(6.0546875f, 36.855312f, 6.0546875f, 37.515312f, 6.0546875f, 38.195312f);
generalPath.curveTo(0.0f, 38.390625f, 0.0f, 38.390625f, -1.9453125f, 38.195312f);
generalPath.curveTo(-3.9453125f, 36.195312f, -3.9453125f, 36.195312f, -4.140625f, 34.25f);
generalPath.curveTo(-4.0429688f, 31.222656f, -4.0429688f, 31.222656f, -3.9453125f, 28.195312f);
generalPath.curveTo(-3.2853124f, 28.195312f, -2.6253126f, 28.195312f, -1.9453125f, 28.195312f);
generalPath.curveTo(-1.9453125f, 22.255312f, -1.9453125f, 16.315313f, -1.9453125f, 10.1953125f);
generalPath.curveTo(-2.6053126f, 10.1953125f, -3.2653124f, 10.1953125f, -3.9453125f, 10.1953125f);
generalPath.curveTo(-4.140625f, 4.140625f, -4.140625f, 4.140625f, -3.9453125f, 2.1953125f);
generalPath.curveTo(-1.9453125f, 0.1953125f, -1.9453125f, 0.1953125f, 0.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(1.0546875f, 5.1953125f);
generalPath.curveTo(1.0546875f, 14.435312f, 1.0546875f, 23.675312f, 1.0546875f, 33.195312f);
generalPath.curveTo(10.294687f, 33.195312f, 19.534687f, 33.195312f, 29.054688f, 33.195312f);
generalPath.curveTo(29.054688f, 23.955313f, 29.054688f, 14.715313f, 29.054688f, 5.1953125f);
generalPath.curveTo(19.814688f, 5.1953125f, 10.574688f, 5.1953125f, 1.0546875f, 5.1953125f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(196, 178, 255, 255)) : new Color(196, 178, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.9453125f, 5.8046875f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.0182292f, 0.06510417f, 4.0364585f, 0.13020833f, 6.0546875f, 0.1953125f);
generalPath.curveTo(6.0546875f, 0.8553125f, 6.0546875f, 1.5153126f, 6.0546875f, 2.1953125f);
generalPath.curveTo(11.994688f, 2.1953125f, 17.934687f, 2.1953125f, 24.054688f, 2.1953125f);
generalPath.curveTo(24.054688f, 1.5353125f, 24.054688f, 0.8753125f, 24.054688f, 0.1953125f);
generalPath.curveTo(30.109375f, 0.0f, 30.109375f, 0.0f, 32.054688f, 0.1953125f);
generalPath.curveTo(34.054688f, 2.1953125f, 34.054688f, 2.1953125f, 34.25f, 4.140625f);
generalPath.curveTo(34.184895f, 6.158854f, 34.119793f, 8.177083f, 34.054688f, 10.1953125f);
generalPath.curveTo(32.404686f, 10.1953125f, 30.754688f, 10.1953125f, 29.054688f, 10.1953125f);
generalPath.curveTo(29.054688f, 8.545313f, 29.054688f, 6.895313f, 29.054688f, 5.1953125f);
generalPath.curveTo(19.814688f, 5.1953125f, 10.574688f, 5.1953125f, 1.0546875f, 5.1953125f);
generalPath.curveTo(0.7246875f, 6.5153127f, 0.3946875f, 7.8353124f, 0.0546875f, 9.1953125f);
generalPath.curveTo(-1.2653126f, 9.525312f, -2.5853126f, 9.855312f, -3.9453125f, 10.1953125f);
generalPath.curveTo(-4.140625f, 4.140625f, -4.140625f, 4.140625f, -3.9453125f, 2.1953125f);
generalPath.curveTo(-1.9453125f, 0.1953125f, -1.9453125f, 0.1953125f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(112, 197, 255, 255)) : new Color(112, 197, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 30.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(6.93f, 0.0f, 13.86f, 0.0f, 21.0f, 0.0f);
generalPath.curveTo(21.0f, 0.99f, 21.0f, 1.98f, 21.0f, 3.0f);
generalPath.curveTo(14.07f, 3.0f, 7.14f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(146, 61, 255, 255)) : new Color(146, 61, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 17.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(6.93f, 0.0f, 13.86f, 0.0f, 21.0f, 0.0f);
generalPath.curveTo(21.0f, 0.99f, 21.0f, 1.98f, 21.0f, 3.0f);
generalPath.curveTo(14.07f, 3.0f, 7.14f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(78, 86, 255, 255)) : new Color(78, 86, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 24.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(6.93f, 0.0f, 13.86f, 0.0f, 21.0f, 0.0f);
generalPath.curveTo(21.0f, 0.66f, 21.0f, 1.32f, 21.0f, 2.0f);
generalPath.curveTo(14.07f, 2.0f, 7.14f, 2.0f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(111, 71, 255, 255)) : new Color(111, 71, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 34.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.1953125f, 6.0546875f, 2.1953125f, 6.0546875f, 2.0f, 8.0f);
generalPath.curveTo(0.0f, 10.0f, 0.0f, 10.0f, -1.9453125f, 10.1953125f);
generalPath.curveTo(-3.9635417f, 10.130208f, -5.981771f, 10.0651045f, -8.0f, 10.0f);
generalPath.curveTo(-8.0f, 9.34f, -8.0f, 8.68f, -8.0f, 8.0f);
generalPath.curveTo(-5.69f, 7.34f, -3.38f, 6.68f, -1.0f, 6.0f);
generalPath.curveTo(-0.67f, 4.02f, -0.34f, 2.04f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(194, 37, 255, 255)) : new Color(194, 37, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 34.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.66f, 2.31f, 3.32f, 4.62f, 4.0f, 7.0f);
generalPath.curveTo(6.97f, 7.495f, 6.97f, 7.495f, 10.0f, 8.0f);
generalPath.curveTo(10.0f, 8.66f, 10.0f, 9.32f, 10.0f, 10.0f);
generalPath.curveTo(3.9453125f, 10.1953125f, 3.9453125f, 10.1953125f, 2.0f, 10.0f);
generalPath.curveTo(0.0f, 8.0f, 0.0f, 8.0f, -0.1953125f, 6.0546875f);
generalPath.curveTo(-0.13020833f, 4.0364585f, -0.06510417f, 2.0182292f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(174, 45, 255, 255)) : new Color(174, 45, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 34.0f, 6.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(6.0546875f, -0.1953125f, 6.0546875f, -0.1953125f, 8.0f, 0.0f);
generalPath.curveTo(10.0f, 2.0f, 10.0f, 2.0f, 10.1953125f, 3.9453125f);
generalPath.curveTo(10.130208f, 5.9635415f, 10.0651045f, 7.981771f, 10.0f, 10.0f);
generalPath.curveTo(9.34f, 10.0f, 8.68f, 10.0f, 8.0f, 10.0f);
generalPath.curveTo(7.34f, 7.69f, 6.68f, 5.38f, 6.0f, 3.0f);
generalPath.curveTo(3.03f, 2.505f, 3.03f, 2.505f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(41, 101, 255, 255)) : new Color(41, 101, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.9453125f, 5.8046875f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.0182292f, 0.06510417f, 4.0364585f, 0.13020833f, 6.0546875f, 0.1953125f);
generalPath.curveTo(6.0546875f, 0.8553125f, 6.0546875f, 1.5153126f, 6.0546875f, 2.1953125f);
generalPath.curveTo(3.7446876f, 2.8553126f, 1.4346875f, 3.5153124f, -0.9453125f, 4.1953125f);
generalPath.curveTo(-1.2753125f, 6.1753125f, -1.6053125f, 8.155313f, -1.9453125f, 10.1953125f);
generalPath.curveTo(-2.6053126f, 10.1953125f, -3.2653124f, 10.1953125f, -3.9453125f, 10.1953125f);
generalPath.curveTo(-4.140625f, 4.140625f, -4.140625f, 4.140625f, -3.9453125f, 2.1953125f);
generalPath.curveTo(-1.9453125f, 0.1953125f, -1.9453125f, 0.1953125f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(42, 102, 255, 255)) : new Color(42, 102, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 27.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(5.28f, 0.0f, 10.56f, 0.0f, 16.0f, 0.0f);
generalPath.curveTo(16.0f, 0.66f, 16.0f, 1.32f, 16.0f, 2.0f);
generalPath.curveTo(10.72f, 2.0f, 5.44f, 2.0f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(125, 65, 255, 255)) : new Color(125, 65, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.0f, 21.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(5.28f, 0.0f, 10.56f, 0.0f, 16.0f, 0.0f);
generalPath.curveTo(16.0f, 0.66f, 16.0f, 1.32f, 16.0f, 2.0f);
generalPath.curveTo(10.72f, 2.0f, 5.44f, 2.0f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(98, 77, 255, 255)) : new Color(98, 77, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 18.0f, 42.0f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(4.62f, 0.0f, 9.24f, 0.0f, 14.0f, 0.0f);
generalPath.curveTo(14.0f, 0.66f, 14.0f, 1.32f, 14.0f, 2.0f);
generalPath.curveTo(9.38f, 2.0f, 4.76f, 2.0f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 36, 255, 255)) : new Color(193, 36, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 18.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 4.62f, 2.0f, 9.24f, 2.0f, 14.0f);
generalPath.curveTo(1.34f, 14.0f, 0.68f, 14.0f, 0.0f, 14.0f);
generalPath.curveTo(0.0f, 9.38f, 0.0f, 4.76f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(112, 71, 255, 255)) : new Color(112, 71, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 18.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 4.62f, 2.0f, 9.24f, 2.0f, 14.0f);
generalPath.curveTo(1.34f, 14.0f, 0.68f, 14.0f, 0.0f, 14.0f);
generalPath.curveTo(0.0f, 9.38f, 0.0f, 4.76f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(112, 71, 255, 255)) : new Color(112, 71, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 18.0f, 6.0f));
// _0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(4.62f, 0.0f, 9.24f, 0.0f, 14.0f, 0.0f);
generalPath.curveTo(14.0f, 0.66f, 14.0f, 1.32f, 14.0f, 2.0f);
generalPath.curveTo(9.38f, 2.0f, 4.76f, 2.0f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(30, 106, 255, 255)) : new Color(30, 106, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 34.0f));
// _0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 2.64f, 2.0f, 5.28f, 2.0f, 8.0f);
generalPath.curveTo(1.01f, 8.0f, 0.02f, 8.0f, -1.0f, 8.0f);
generalPath.curveTo(-0.67f, 5.36f, -0.34f, 2.72f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(173, 45, 255, 255)) : new Color(173, 45, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.0f, 41.0f));
// _0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(2.31f, 0.33f, 4.62f, 0.66f, 7.0f, 1.0f);
generalPath.curveTo(7.0f, 1.66f, 7.0f, 2.32f, 7.0f, 3.0f);
generalPath.curveTo(4.36f, 3.0f, 1.72f, 3.0f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(194, 37, 255, 255)) : new Color(194, 37, 255, 255);
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
        return 5.8046875;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 5.8046875;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 38.390625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 38.390625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_select_all_50_2() {
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
       icons8_select_all_50_2 base = new icons8_select_all_50_2();
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
       icons8_select_all_50_2 base = new icons8_select_all_50_2();
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
        return icons8_select_all_50_2::new;
    }
}

