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
public class icons8_select_all_50_4 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 11.0f, 27.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(9.24f, 0.0f, 18.48f, 0.0f, 28.0f, 0.0f);
generalPath.curveTo(28.0f, 0.99f, 28.0f, 1.98f, 28.0f, 3.0f);
generalPath.curveTo(18.76f, 3.0f, 9.52f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 121, 216, 255)) : new Color(0, 121, 216, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 11.0f, 14.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(9.24f, 0.0f, 18.48f, 0.0f, 28.0f, 0.0f);
generalPath.curveTo(28.0f, 0.99f, 28.0f, 1.98f, 28.0f, 3.0f);
generalPath.curveTo(18.76f, 3.0f, 9.52f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 121, 216, 255)) : new Color(0, 121, 216, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 11.0f, 33.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(7.92f, 0.0f, 15.84f, 0.0f, 24.0f, 0.0f);
generalPath.curveTo(24.0f, 0.99f, 24.0f, 1.98f, 24.0f, 3.0f);
generalPath.curveTo(16.08f, 3.0f, 8.16f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 121, 216, 255)) : new Color(0, 121, 216, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 11.0f, 20.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(7.92f, 0.0f, 15.84f, 0.0f, 24.0f, 0.0f);
generalPath.curveTo(24.0f, 0.99f, 24.0f, 1.98f, 24.0f, 3.0f);
generalPath.curveTo(16.08f, 3.0f, 8.16f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 120, 217, 255)) : new Color(0, 120, 217, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 41.0f, 38.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 1.98f, 3.0f, 3.96f, 3.0f, 6.0f);
generalPath.curveTo(1.02f, 6.0f, -0.96f, 6.0f, -3.0f, 6.0f);
generalPath.curveTo(-3.0f, 5.01f, -3.0f, 4.02f, -3.0f, 3.0f);
generalPath.curveTo(-2.01f, 3.0f, -1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(99, 112, 122, 255)) : new Color(99, 112, 122, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 38.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(3.99f, 3.0f, 4.98f, 3.0f, 6.0f, 3.0f);
generalPath.curveTo(6.0f, 3.99f, 6.0f, 4.98f, 6.0f, 6.0f);
generalPath.curveTo(4.02f, 6.0f, 2.04f, 6.0f, 0.0f, 6.0f);
generalPath.curveTo(0.0f, 4.02f, 0.0f, 2.04f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(98, 111, 121, 255)) : new Color(98, 111, 121, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 38.0f, 6.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.98f, 0.0f, 3.96f, 0.0f, 6.0f, 0.0f);
generalPath.curveTo(6.0f, 1.98f, 6.0f, 3.96f, 6.0f, 6.0f);
generalPath.curveTo(5.01f, 6.0f, 4.02f, 6.0f, 3.0f, 6.0f);
generalPath.curveTo(3.0f, 5.01f, 3.0f, 4.02f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(98, 111, 121, 255)) : new Color(98, 111, 121, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 6.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.98f, 0.0f, 3.96f, 0.0f, 6.0f, 0.0f);
generalPath.curveTo(6.0f, 0.99f, 6.0f, 1.98f, 6.0f, 3.0f);
generalPath.curveTo(5.01f, 3.0f, 4.02f, 3.0f, 3.0f, 3.0f);
generalPath.curveTo(3.0f, 3.99f, 3.0f, 4.98f, 3.0f, 6.0f);
generalPath.curveTo(2.01f, 6.0f, 1.02f, 6.0f, 0.0f, 6.0f);
generalPath.curveTo(0.0f, 4.02f, 0.0f, 2.04f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(98, 111, 120, 255)) : new Color(98, 111, 120, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 34.0f, 41.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(99, 109, 119, 255)) : new Color(99, 109, 119, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 13.0f, 41.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(102, 114, 123, 255)) : new Color(102, 114, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 41.0f, 34.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(99, 109, 119, 255)) : new Color(99, 109, 119, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 34.0f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(96, 109, 118, 255)) : new Color(96, 109, 118, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 41.0f, 13.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(97, 110, 118, 255)) : new Color(97, 110, 118, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 13.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(97, 109, 118, 255)) : new Color(97, 109, 118, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 34.0f, 6.0f));
// _0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(97, 110, 118, 255)) : new Color(97, 110, 118, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 13.0f, 6.0f));
// _0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(98, 108, 120, 255)) : new Color(98, 108, 120, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 30.0f, 41.0f));
// _0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(3.0f, 1.66f, 3.0f, 2.32f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(98, 111, 123, 255)) : new Color(98, 111, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 26.0f, 41.0f));
// _0_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(3.0f, 1.66f, 3.0f, 2.32f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(102, 114, 125, 255)) : new Color(102, 114, 125, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 22.0f, 41.0f));
// _0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 0.99f, 2.0f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(1.01f, 3.0f, 0.02f, 3.0f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(104, 115, 123, 255)) : new Color(104, 115, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 18.0f, 41.0f));
// _0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 0.99f, 2.0f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(1.01f, 3.0f, 0.02f, 3.0f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(100, 112, 123, 255)) : new Color(100, 112, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 41.0f, 30.0f));
// _0_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 2.67f, 1.02f, 2.34f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(98, 111, 123, 255)) : new Color(98, 111, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 30.0f));
// _0_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(2.67f, 0.99f, 2.34f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(1.34f, 3.0f, 0.68f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(99, 112, 124, 255)) : new Color(99, 112, 124, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 41.0f, 26.0f));
// _0_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 2.67f, 1.02f, 2.34f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(102, 114, 124, 255)) : new Color(102, 114, 124, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 26.0f));
// _0_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(2.67f, 0.99f, 2.34f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(1.34f, 3.0f, 0.68f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(102, 114, 124, 255)) : new Color(102, 114, 124, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 21.0f));
// _0_24
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 0.99f, 2.0f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(1.01f, 3.0f, 0.02f, 3.0f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(104, 115, 123, 255)) : new Color(104, 115, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 21.0f));
// _0_25
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(3.0f, 1.66f, 3.0f, 2.32f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(103, 114, 123, 255)) : new Color(103, 114, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 42.0f, 17.0f));
// _0_26
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.66f, 0.0f, 1.32f, 0.0f, 2.0f, 0.0f);
generalPath.curveTo(2.0f, 0.99f, 2.0f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(1.01f, 3.0f, 0.02f, 3.0f, -1.0f, 3.0f);
generalPath.curveTo(-0.67f, 2.01f, -0.34f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(98, 111, 123, 255)) : new Color(98, 111, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 17.0f));
// _0_27
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(3.0f, 1.66f, 3.0f, 2.32f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 3.0f, 1.02f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(100, 113, 123, 255)) : new Color(100, 113, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 30.0f, 6.0f));
// _0_28
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(2.67f, 0.99f, 2.34f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(1.34f, 3.0f, 0.68f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(100, 113, 123, 255)) : new Color(100, 113, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 26.0f, 6.0f));
// _0_29
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(2.67f, 0.99f, 2.34f, 1.98f, 2.0f, 3.0f);
generalPath.curveTo(1.34f, 3.0f, 0.68f, 3.0f, 0.0f, 3.0f);
generalPath.curveTo(0.0f, 2.01f, 0.0f, 1.02f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(102, 114, 124, 255)) : new Color(102, 114, 124, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 21.0f, 6.0f));
// _0_30
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 2.67f, 1.02f, 2.34f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(101, 114, 124, 255)) : new Color(101, 114, 124, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 17.0f, 6.0f));
// _0_31
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.0f, 1.98f, 0.0f, 3.0f, 0.0f);
generalPath.curveTo(3.0f, 0.99f, 3.0f, 1.98f, 3.0f, 3.0f);
generalPath.curveTo(2.01f, 2.67f, 1.02f, 2.34f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(100, 113, 123, 255)) : new Color(100, 113, 123, 255);
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
        return 6.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 6.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 38.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 38.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_select_all_50_4() {
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
       icons8_select_all_50_4 base = new icons8_select_all_50_4();
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
       icons8_select_all_50_4 base = new icons8_select_all_50_4();
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
        return icons8_select_all_50_4::new;
    }
}

