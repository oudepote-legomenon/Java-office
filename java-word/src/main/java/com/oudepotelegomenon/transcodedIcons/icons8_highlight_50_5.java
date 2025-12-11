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
public class icons8_highlight_50_5 implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 35.13720703125f, 0.077392578125f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.7580888f, 1.2111392f, 6.016913f, 3.3793025f, 8.675293f, 6.1726074f);
generalPath.curveTo(9.164493f, 6.65085f, 9.653691f, 7.1290917f, 10.157715f, 7.621826f);
generalPath.curveTo(13.094195f, 10.61923f, 14.559042f, 12.72956f, 14.862793f, 16.922607f);
generalPath.curveTo(13.813721f, 18.77417f, 13.813721f, 18.77417f, 12.108887f, 20.547607f);
generalPath.curveTo(11.460327f, 21.233389f, 10.811768f, 21.91917f, 10.143555f, 22.625732f);
generalPath.curveTo(9.390903f, 23.383701f, 8.638252f, 24.14167f, 7.862793f, 24.922607f);
generalPath.curveTo(7.0211964f, 25.7837f, 6.1796f, 26.644794f, 5.3125f, 27.531982f);
generalPath.curveTo(2.5356104f, 30.34815f, -0.26555175f, 33.138744f, -3.074707f, 35.922607f);
generalPath.curveTo(-4.05476f, 36.897633f, -5.0345793f, 37.87289f, -6.01416f, 38.84839f);
generalPath.curveTo(-8.38622f, 41.208763f, -10.761395f, 43.56601f, -13.137207f, 45.922607f);
generalPath.curveTo(-6.867207f, 46.25261f, -0.597207f, 46.582607f, 5.862793f, 46.922607f);
generalPath.curveTo(5.862793f, 47.91261f, 5.862793f, 48.902607f, 5.862793f, 49.922607f);
generalPath.curveTo(0.5059716f, 49.996727f, -4.8505516f, 50.051197f, -10.207764f, 50.087402f);
generalPath.curveTo(-12.030408f, 50.102493f, -13.853015f, 50.12297f, -15.675537f, 50.148926f);
generalPath.curveTo(-18.294361f, 50.185287f, -20.912706f, 50.202328f, -23.531738f, 50.215576f);
generalPath.curveTo(-24.755318f, 50.238804f, -24.755318f, 50.238804f, -26.003616f, 50.262497f);
generalPath.curveTo(-31.74665f, 50.26421f, -31.74665f, 50.26421f, -33.87651f, 48.40132f);
generalPath.curveTo(-34.29254f, 47.913345f, -34.70857f, 47.42537f, -35.137207f, 46.922607f);
generalPath.curveTo(-34.920643f, 46.281944f, -34.704082f, 45.64128f, -34.480957f, 44.9812f);
generalPath.curveTo(-32.618305f, 39.26239f, -32.618305f, 39.26239f, -32.387207f, 33.297607f);
generalPath.curveTo(-32.109272f, 29.54551f, -31.734276f, 29.086008f, -29.312988f, 26.434326f);
generalPath.curveTo(-28.674742f, 25.734043f, -28.036493f, 25.03376f, -27.378906f, 24.312256f);
generalPath.curveTo(-26.639145f, 23.523672f, -25.899385f, 22.735088f, -25.137207f, 21.922607f);
generalPath.curveTo(-24.29819f, 21.023165f, -23.45917f, 20.12372f, -22.594727f, 19.197021f);
generalPath.curveTo(-20.264362f, 16.730164f, -17.913881f, 14.288716f, -15.539307f, 11.864746f);
generalPath.curveTo(-14.553958f, 10.85246f, -13.57585f, 9.83308f, -12.604736f, 8.807129f);
generalPath.curveTo(-11.182864f, 7.3064094f, -9.739509f, 5.8297386f, -8.289551f, 4.356201f);
generalPath.curveTo(-7.4438453f, 3.4802027f, -6.59814f, 2.6042042f, -5.7268066f, 1.7016602f);
generalPath.curveTo(-3.137207f, -0.07739258f, -3.137207f, -0.07739258f, 0.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(-22.137207f, 45.922607f);
generalPath.curveTo(-18.137207f, 46.922607f, -18.137207f, 46.922607f, -18.137207f, 46.922607f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(25, 24, 19, 255)) : new Color(25, 24, 19, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 28.0f, 7.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(4.003744f, 1.836924f, 6.719579f, 4.491179f, 9.75f, 7.625f);
generalPath.curveTo(10.256601f, 8.140625f, 10.763204f, 8.65625f, 11.285156f, 9.1875f);
generalPath.curveTo(12.528039f, 10.453834f, 13.764653f, 11.726315f, 15.0f, 13.0f);
generalPath.curveTo(13.573543f, 16.258663f, 11.832958f, 18.402485f, 9.3046875f, 20.890625f);
generalPath.curveTo(8.589258f, 21.59961f, 7.873828f, 22.308594f, 7.1367188f, 23.039062f);
generalPath.curveTo(6.390352f, 23.768671f, 5.6439843f, 24.498281f, 4.875f, 25.25f);
generalPath.curveTo(3.7438476f, 26.367617f, 3.7438476f, 26.367617f, 2.5898438f, 27.507812f);
generalPath.curveTo(0.7309923f, 29.343134f, -1.13237f, 31.173618f, -3.0f, 33.0f);
generalPath.curveTo(-7.003744f, 31.163076f, -9.71958f, 28.508821f, -12.75f, 25.375f);
generalPath.curveTo(-13.256601f, 24.859375f, -13.763203f, 24.34375f, -14.285156f, 23.8125f);
generalPath.curveTo(-15.528039f, 22.546167f, -16.764652f, 21.273685f, -18.0f, 20.0f);
generalPath.curveTo(-16.573542f, 16.741337f, -14.832958f, 14.597515f, -12.3046875f, 12.109375f);
generalPath.curveTo(-11.231543f, 11.045898f, -11.231543f, 11.045898f, -10.136719f, 9.9609375f);
generalPath.curveTo(-9.390351f, 9.231328f, -8.643985f, 8.5017185f, -7.875f, 7.75f);
generalPath.curveTo(-7.1208982f, 7.004922f, -6.366797f, 6.259844f, -5.5898438f, 5.4921875f);
generalPath.curveTo(-3.7309923f, 3.6568658f, -1.86763f, 1.8263808f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(251, 210, 78, 255)) : new Color(251, 210, 78, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 34.81640625f, 0.01953125f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.948127f, 1.2159263f, 6.218521f, 3.311922f, 8.996094f, 6.2304688f);
generalPath.curveTo(9.485293f, 6.708711f, 9.974492f, 7.186953f, 10.478516f, 7.6796875f);
generalPath.curveTo(13.414996f, 10.677092f, 14.879843f, 12.787421f, 15.183594f, 16.980469f);
generalPath.curveTo(14.1345215f, 18.832031f, 14.1345215f, 18.832031f, 12.4296875f, 20.605469f);
generalPath.curveTo(11.781128f, 21.29125f, 11.132568f, 21.977032f, 10.464355f, 22.683594f);
generalPath.curveTo(9.711704f, 23.441563f, 8.959053f, 24.199532f, 8.183594f, 24.980469f);
generalPath.curveTo(7.341997f, 25.841562f, 6.5004005f, 26.702656f, 5.633301f, 27.589844f);
generalPath.curveTo(2.8564112f, 30.406012f, 0.05524904f, 33.196606f, -2.7539062f, 35.98047f);
generalPath.curveTo(-3.7339594f, 36.955494f, -4.7137785f, 37.93075f, -5.6933594f, 38.90625f);
generalPath.curveTo(-8.065419f, 41.266624f, -10.440595f, 43.62387f, -12.816406f, 45.98047f);
generalPath.curveTo(-6.5464063f, 46.31047f, -0.27640626f, 46.64047f, 6.1835938f, 46.98047f);
generalPath.curveTo(6.1835938f, 47.97047f, 6.1835938f, 48.96047f, 6.1835938f, 49.98047f);
generalPath.curveTo(-6.356406f, 49.98047f, -18.896406f, 49.98047f, -31.816406f, 49.98047f);
generalPath.curveTo(-31.816406f, 49.32047f, -31.816406f, 48.66047f, -31.816406f, 47.98047f);
generalPath.curveTo(-24.858458f, 44.338924f, -19.705915f, 42.333786f, -11.816406f, 42.98047f);
generalPath.curveTo(-11.816406f, 42.32047f, -11.816406f, 41.66047f, -11.816406f, 40.98047f);
generalPath.curveTo(-11.156406f, 40.98047f, -10.496407f, 40.98047f, -9.816406f, 40.98047f);
generalPath.curveTo(-9.55666f, 40.396202f, -9.296914f, 39.811935f, -9.029297f, 39.20996f);
generalPath.curveTo(-7.7317505f, 36.824856f, -6.322995f, 35.22856f, -4.4101562f, 33.308594f);
generalPath.curveTo(-3.7488673f, 32.644726f, -3.087578f, 31.98086f, -2.40625f, 31.296875f);
generalPath.curveTo(-1.7166016f, 30.614962f, -1.0269531f, 29.933046f, -0.31640625f, 29.230469f);
generalPath.curveTo(0.3732422f, 28.533087f, 1.0628906f, 27.835703f, 1.7734375f, 27.117188f);
generalPath.curveTo(2.4347265f, 26.458477f, 3.0960157f, 25.799767f, 3.7773438f, 25.121094f);
generalPath.curveTo(4.382559f, 24.518135f, 4.9877734f, 23.915176f, 5.611328f, 23.293945f);
generalPath.curveTo(7.1835938f, 21.980469f, 7.1835938f, 21.980469f, 9.183594f, 21.980469f);
generalPath.curveTo(9.183594f, 21.320469f, 9.183594f, 20.66047f, 9.183594f, 19.980469f);
generalPath.curveTo(9.843594f, 19.980469f, 10.503593f, 19.980469f, 11.183594f, 19.980469f);
generalPath.curveTo(12.14193f, 17.27231f, 12.14193f, 17.27231f, 12.183594f, 13.980469f);
generalPath.curveTo(10.542591f, 11.612169f, 9.168842f, 9.981156f, 7.1210938f, 8.042969f);
generalPath.curveTo(6.642207f, 7.5370116f, 6.1633205f, 7.0310545f, 5.669922f, 6.5097656f);
generalPath.curveTo(4.052823f, 4.842227f, 4.052823f, 4.842227f, 1.1835938f, 2.9804688f);
generalPath.curveTo(-2.108248f, 3.022133f, -2.108248f, 3.022133f, -4.8164062f, 3.9804688f);
generalPath.curveTo(-4.8164062f, 4.6404686f, -4.8164062f, 5.300469f, -4.8164062f, 5.9804688f);
generalPath.curveTo(-5.806406f, 5.650469f, -6.7964063f, 5.320469f, -7.8164062f, 4.9804688f);
generalPath.curveTo(-3.6651835f, -0.02541736f, -3.6651835f, -0.02541736f, 0.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(-21.816406f, 45.98047f);
generalPath.curveTo(-17.816406f, 46.98047f, -17.816406f, 46.98047f, -17.816406f, 46.98047f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(20, 18, 11, 255)) : new Color(20, 18, 11, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 32.9375f, 15.1875f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.0209374f, 0.4021875f, 1.0209374f, 0.4021875f, 2.0625f, 0.8125f);
generalPath.curveTo(1.7725899f, 6.7556562f, -0.81270164f, 9.8475f, -4.9375f, 13.8125f);
generalPath.curveTo(-7.9105644f, 16.13294f, -8.989372f, 16.917847f, -12.75f, 16.5f);
generalPath.curveTo(-13.471875f, 16.273125f, -14.19375f, 16.04625f, -14.9375f, 15.8125f);
generalPath.curveTo(-14.401264f, 10.047965f, -12.591837f, 7.1642046f, -8.292969f, 3.3554688f);
generalPath.curveTo(-3.7476306f, -0.23921046f, -3.7476306f, -0.23921046f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(42, 24, 13, 255)) : new Color(42, 24, 13, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 17.6875f, 43.6875f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.763125f, 0.433125f, 1.52625f, 0.86625f, 2.3125f, 1.3125f);
generalPath.curveTo(2.3125f, 1.9725f, 2.3125f, 2.6325f, 2.3125f, 3.3125f);
generalPath.curveTo(9.2425f, 3.3125f, 16.1725f, 3.3125f, 23.3125f, 3.3125f);
generalPath.curveTo(23.3125f, 4.3025f, 23.3125f, 5.2925f, 23.3125f, 6.3125f);
generalPath.curveTo(10.7725f, 6.3125f, -1.7675f, 6.3125f, -14.6875f, 6.3125f);
generalPath.curveTo(-14.6875f, 5.6525f, -14.6875f, 4.9925f, -14.6875f, 4.3125f);
generalPath.curveTo(-4.849426f, -0.9041302f, -4.849426f, -0.9041302f, 0.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(-4.6875f, 2.3125f);
generalPath.curveTo(-0.6875f, 3.3125f, -0.6875f, 3.3125f, -0.6875f, 3.3125f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(2, 2, 2, 255)) : new Color(2, 2, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 33.0f, 2.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(4.3765755f, 0.44914737f, 6.862258f, 3.3469124f, 9.8125f, 6.3125f);
generalPath.curveTo(10.32748f, 6.799121f, 10.842461f, 7.2857423f, 11.373047f, 7.7871094f);
generalPath.curveTo(12.832031f, 9.238281f, 12.832031f, 9.238281f, 15.0f, 12.0f);
generalPath.curveTo(14.824219f, 14.355469f, 14.824219f, 14.355469f, 14.0f, 16.0f);
generalPath.curveTo(10.0f, 16.0f, 10.0f, 16.0f, 6.984375f, 13.375f);
generalPath.curveTo(5.895917f, 12.2599945f, 4.818093f, 11.134529f, 3.75f, 10.0f);
generalPath.curveTo(3.195703f, 9.427656f, 2.6414063f, 8.855312f, 2.0703125f, 8.265625f);
generalPath.curveTo(0.7043588f, 6.8525696f, -0.64905614f, 5.4274125f, -2.0f, 4.0f);
generalPath.curveTo(-1.34f, 2.68f, -0.68f, 1.36f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(231, 231, 231, 255)) : new Color(231, 231, 231, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 7.0f, 28.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(4.0737605f, 1.6101053f, 6.765071f, 4.538223f, 9.75f, 7.625f);
generalPath.curveTo(10.256601f, 8.140625f, 10.763204f, 8.65625f, 11.285156f, 9.1875f);
generalPath.curveTo(12.528039f, 10.453834f, 13.764653f, 11.726315f, 15.0f, 13.0f);
generalPath.curveTo(14.67f, 13.99f, 14.34f, 14.98f, 14.0f, 16.0f);
generalPath.curveTo(10.441472f, 16.480883f, 9.2488165f, 16.187067f, 6.3242188f, 13.988281f);
generalPath.curveTo(5.019043f, 12.66377f, 5.019043f, 12.66377f, 3.6875f, 11.3125f);
generalPath.curveTo(2.8044922f, 10.442383f, 1.9214844f, 9.572266f, 1.0117188f, 8.675781f);
generalPath.curveTo(-1.0f, 6.0f, -1.0f, 6.0f, -1.3554688f, 3.2304688f);
generalPath.curveTo(-1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(235, 235, 235, 255)) : new Color(235, 235, 235, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 33.0f, 17.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(-0.49660543f, 5.7937303f, -3.9088886f, 8.216405f, -8.125f, 11.8125f);
generalPath.curveTo(-10.0f, 13.0f, -10.0f, 13.0f, -13.0f, 13.0f);
generalPath.curveTo(-12.84826f, 7.9925685f, -10.097928f, 5.724524f, -6.6914062f, 2.453125f);
generalPath.curveTo(-4.238201f, 0.34552148f, -3.3067482f, 0.0f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(239, 79, 79, 255)) : new Color(239, 79, 79, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.0f, 36.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(1.1492627f, 0.9542181f, 2.2943053f, 1.9135205f, 3.4375f, 2.875f);
generalPath.curveTo(4.075586f, 3.4086719f, 4.7136717f, 3.9423437f, 5.3710938f, 4.4921875f);
generalPath.curveTo(7.0f, 6.0f, 7.0f, 6.0f, 8.0f, 8.0f);
generalPath.curveTo(1.5f, 11.0f, 1.5f, 11.0f, -3.0f, 11.0f);
generalPath.curveTo(-2.5251064f, 6.8842564f, -1.9789757f, 3.6361666f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(226, 226, 226, 255)) : new Color(226, 226, 226, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 34.81640625f, 0.01953125f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(3.948127f, 1.2159263f, 6.218521f, 3.311922f, 8.996094f, 6.2304688f);
generalPath.curveTo(9.485293f, 6.708711f, 9.974492f, 7.186953f, 10.478516f, 7.6796875f);
generalPath.curveTo(13.3754635f, 10.636738f, 14.842287f, 12.824108f, 15.183594f, 16.980469f);
generalPath.curveTo(14.523594f, 16.980469f, 13.863594f, 16.980469f, 13.183594f, 16.980469f);
generalPath.curveTo(12.16247f, 15.32666f, 11.166716f, 13.657146f, 10.183594f, 11.980469f);
generalPath.curveTo(8.805027f, 10.305182f, 7.3647056f, 8.6790495f, 5.8710938f, 7.1054688f);
generalPath.curveTo(5.132461f, 6.303672f, 4.393828f, 5.501875f, 3.6328125f, 4.6757812f);
generalPath.curveTo(1.2262224f, 2.6308498f, 1.2262224f, 2.6308498f, -2.109375f, 3.2226562f);
generalPath.curveTo(-3.0026953f, 3.4727345f, -3.8960156f, 3.7228124f, -4.8164062f, 3.9804688f);
generalPath.curveTo(-4.8164062f, 4.6404686f, -4.8164062f, 5.300469f, -4.8164062f, 5.9804688f);
generalPath.curveTo(-5.806406f, 5.650469f, -6.7964063f, 5.320469f, -7.8164062f, 4.9804688f);
generalPath.curveTo(-3.6651835f, -0.02541736f, -3.6651835f, -0.02541736f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(9, 9, 8, 255)) : new Color(9, 9, 8, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 30.0f, 4.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(5.3333335f, 5.3333335f, 10.666667f, 10.666667f, 16.0f, 16.0f);
generalPath.curveTo(15.34f, 16.0f, 14.68f, 16.0f, 14.0f, 16.0f);
generalPath.curveTo(13.67f, 16.66f, 13.34f, 17.32f, 13.0f, 18.0f);
generalPath.curveTo(12.564297f, 17.49211f, 12.128593f, 16.984219f, 11.6796875f, 16.460938f);
generalPath.curveTo(5.083658f, 7.8424644f, 5.083658f, 7.8424644f, -4.0f, 3.0f);
generalPath.curveTo(-2.68f, 2.67f, -1.36f, 2.34f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(70, 64, 43, 255)) : new Color(70, 64, 43, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.0f, 25.0f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(5.3333335f, 5.3333335f, 10.666667f, 10.666667f, 16.0f, 16.0f);
generalPath.curveTo(15.34f, 16.0f, 14.68f, 16.0f, 14.0f, 16.0f);
generalPath.curveTo(13.67f, 16.66f, 13.34f, 17.32f, 13.0f, 18.0f);
generalPath.curveTo(12.38125f, 17.255566f, 12.38125f, 17.255566f, 11.75f, 16.496094f);
generalPath.curveTo(7.518865f, 11.518844f, 3.0216148f, 7.1738095f, -2.0f, 3.0f);
generalPath.curveTo(-1.34f, 2.67f, -0.68f, 2.34f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 61, 42, 255)) : new Color(68, 61, 42, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 29.0f, 24.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(-1.105466f, 4.971856f, -4.0296826f, 7.708765f, -10.0f, 8.0f);
generalPath.curveTo(-10.625f, 5.625f, -10.625f, 5.625f, -11.0f, 3.0f);
generalPath.curveTo(-10.34f, 2.34f, -9.68f, 1.68f, -9.0f, 1.0f);
generalPath.curveTo(-8.67f, 1.66f, -8.34f, 2.32f, -8.0f, 3.0f);
generalPath.curveTo(-8.33f, 3.99f, -8.66f, 4.98f, -9.0f, 6.0f);
generalPath.curveTo(-8.071875f, 5.525625f, -7.14375f, 5.05125f, -6.1875f, 4.5625f);
generalPath.curveTo(-3.0f, 3.0f, -3.0f, 3.0f, 0.0f, 2.0f);
generalPath.curveTo(0.0f, 1.34f, 0.0f, 0.68f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(53, 33, 17, 255)) : new Color(53, 33, 17, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 12.0f, 20.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.curveTo(0.99f, 0.33f, 1.98f, 0.66f, 3.0f, 1.0f);
generalPath.curveTo(1.7103482f, 2.3756285f, 0.37310708f, 3.707664f, -1.0f, 5.0f);
generalPath.curveTo(-1.66f, 5.0f, -2.32f, 5.0f, -3.0f, 5.0f);
generalPath.curveTo(-3.0f, 5.66f, -3.0f, 6.32f, -3.0f, 7.0f);
generalPath.curveTo(-3.66f, 7.0f, -4.32f, 7.0f, -5.0f, 7.0f);
generalPath.curveTo(-5.33f, 8.98f, -5.66f, 10.96f, -6.0f, 13.0f);
generalPath.curveTo(-6.66f, 12.01f, -7.32f, 11.02f, -8.0f, 10.0f);
generalPath.curveTo(-6.349082f, 5.707614f, -3.2624543f, 3.1206086f, 0.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(35, 32, 25, 255)) : new Color(35, 32, 25, 255);
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
	private icons8_highlight_50_5() {
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
       icons8_highlight_50_5 base = new icons8_highlight_50_5();
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
       icons8_highlight_50_5 base = new icons8_highlight_50_5();
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
        return icons8_highlight_50_5::new;
    }
}

