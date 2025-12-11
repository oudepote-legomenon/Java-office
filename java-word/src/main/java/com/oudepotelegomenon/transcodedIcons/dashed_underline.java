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
public class dashed_underline implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image95d26c11e6fe0964afb2447bbb851e0d;
private static BufferedImage getImage95d26c11e6fe0964afb2447bbb851e0d() {
    BufferedImage result = (image95d26c11e6fe0964afb2447bbb851e0d != null)
        ? image95d26c11e6fe0964afb2447bbb851e0d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(12132);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAV4AAAGHCAYAAAD4Gjr9AAAjU0lEQVR4Xu3dCXhV1bn/cZkRsaKIolbBoqjVUi94HS/O4tiqKFwnsAUVBEQqoCCzCKKAyiRgQcUrWgpXrpZqkUESVCrCtY4oBBXlGmZkiJCQZN+1/kn+D/d9oz3tyVpr73O+eZ7PA/xIst+11z5vdvbZwwFRFB0AAPBHBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBQAAt1QAAHBLBYiHLVu2NJw9e/aNt9xyy8zTTjvto+OOO27dT3/6028qc+yxx37dtGnTL1u1arWiQ4cOz0+fPr3T+vXrm8jvicy0adOmRjNnzrzlpptueunnP//5J3ZbsduE3E4qtpUmTZp81aJFiw/stvLKK69cu3v37p/I7wm3VAD/1qxZc1Jubm7r3r17j2nUqNGmatWqlR5gpiZd9vscdthhW8ePH987Pz//dLOs6nLZSJatW7c2WrlyZcsBAwY8bLcVOef/LLutnHDCCWtefPHF28wP7X8xy6ovl42qowL4NWvWrPZ2D6Wqmu0PqVevXoFp7n3NMuvKGpAMmzdvPvyKK654vXr16iVyfqtSzZo1902ZMuVps8yasgZUDRXAn7y8vBOPOuqob+WG78ohhxyyt6io6DpZB5Lh5JNPXiXn1JUaNWoUf/nll6NlDagaKoA/S5YsuUBu8K599dVXo2QdiL+VK1eeIefStTFjxphFRzVkLUifCuDPM88881u5sbuWm5u7StaB+Bs/fvw9ci5dGzBggFl09AtZC9KnAvjzxBNP9JIbu2sLFy7cLutA/A0bNmywnEvXyhvvLbIWpE8F8OfJJ5+8V27sri1YsGCHrAPxN2jQoIfkXLpW3njvlLUgfSqAP9Om");
    imageData.append("TessN3bXFi1atFnWgfgbPHjwMDmXrpU33ptkLUifCuCPvUBCbuyuvfnmm+tlHYi/gIcarpa1IH0qgD/z5s27Wm7srpnG+7WsA/E3YsSIB+VculbeeC+XtSB9KoA/8+fPbyM3dtdovMn02GOP9ZVz6Vp5471K1oL0qQD+LFy48BK5sbtG402msWPH3ifn0rXyxnutrAXpUwH8MU3wQrmxu2aW+Y2sA/EX4tTD8sZ7vawF6VMB/Alx5RpvriUTjTezqAD+BGq862QdiL9x48b1lHPpWnnj/ZWsBelTAfyxt4KUG7trptl/IetA/E2YMKGHnEvXyhvvlbIWpE8F8CdE483JyVkt60D8TZo0qZucS9fKG28bWQvSpwL4Y5rg+XJjd43Gm0w03syiAvgT4hivabxrZB2Iv4kTJ3aXc+kajdcdFcCfEKeTmca7VtaB+AvYeC+TtSB9KoA/IRovb64lU8BDDZfIWpA+FcCfxYsXXyQ3dtdovMlE480sKoA/ixYtulhu7K7ReJMp4KEGGq8DKoA/7PEiVQH3eC+VtSB9KoA/HONFqiZPntxVzqVrnNXgjgrgT6DG+6WsA/E3derUu+RcusaVa+6oAP4EarxfyToQf08//fSdci5dK2+818hakD4VwJ8QjZf78SZTwMbLTXIcUAH8CfHmGvfjTaaAhxq4EboDKoA/IU4nM83+f2QdiL8pU6Z0kXPpGo3XHRXAHxovUhWw8V4na0H6VAB/aLxIFY03s6gA/tB4kaqAjbetrAXpUwH8CdF4eeZaMgW8gILG64AK4E+gxstZDQlE480sKoA/gRov5/EmUMDGe4OsBelTAfwJdB4vjTeBaLyZRQXwJ1Dj5VBDAgV8c62drAXpUwH8CdR4eXMtgWi8mUUF8CdE4+V0smQK2Hjby1qQPhXAnzfD3CSHPd4ECth42eN1QAXwJ1Dj5RhvAgW8SQ6N1wEVwB8aL1JF480sKoA/gRovp5MlUMD78d4oa0H6");
    imageData.append("VAB/lixZcoHc2F2j8SbT73//+zvkXLrGebzuqAD+5OTknC83dtdovMkUsPFeL2tB+lQAf3Jzc1vLjd01Gm8yBWy83BbSARXAn6VLl/6b3NhdM413nawD8UfjzSwqgD8hGi+Pd0+mgI2XR/84oAL4E6jxfiHrQPxNmzats5xL18obL08ZdkAF8IfGi1RNnz69k5xL18ob7zWyFqRPBfCHxotUPfPMM7+Vc+laeeO9StaC9KkA/tB4kaqAjfdKWQvSpwL4E+J0MhpvMgVsvFfIWpA+FcCfEI03JydnrawD8RfwGO/lshakTwXwh8aLVNF4M4sK4A/HeJGqgKeT0XgdUAH8CbHHS+NNpoAXUNB4HVAB/KHxIlUBbwvZRtaC9KkA/nCoAakKeCP0S2UtSJ8K4E+Ixsuba8kUsPFeImtB+lQAfwI13jxZB+IvYOO9SNaC9KkA/oQ4xkvjTaaATxm+QNaC9KkA/tB4karJkyd3lXPpGo3XHRXAn0CNd42sA/EXsPGeL2tB+lQAf2i8SFXAxnuBrAXpUwH8CfTm2mpZB+KPY7yZRQXwJ0TjNXvZn8s6EH8Bz2q4UNaC9KkA/tB4kSoab2ZRAfx56623zpMbu2s03mSi8WYWFcCfQHu8n8k6EH8Bj/FeKGtB+lQAf2i8SBWNN7OoAP6EOJ3MLHOVrAPxx+lkmUUF8IfGi1TReDOLCuAPjRepovFmFhXAHxovUsUx3syiAvgTqPHy5loC0XgziwrgT05OzvlyY3eNPd5kCth4L5C1IH0qgD80XqQqYOPl7mQOqAD+hDjUsHTp0k9lHYi/gI23tawF6VMB/KHxIlU03syiAvhD40WqAjZeDjU4oAL4Q+NFqgLeJIfG64AK4E+Ixsuba8lE480sKoA/3CQHqeJQQ2ZRAfwJtMdL402ggI33AlkL0qcC+EPjRaoCNt4LZS1InwrgD40XqQp4k5wLZS1InwrgT6Ar12i8CUTjzSwqgD80XqTqqaee");
    imageData.append("ulvOpWs0XndUAH9ovEgVjTezqAD+BGq8nMebQJMmTeom59I1Gq87KoA/Id5c48q1ZKLxZhYVwB8aL1JF480sKoA/NF6kauLEid3lXLpG43VHBfAnROPlGG8yBWy8F8lakD4VwJ9Ab65xVkMCBTzUcImsBelTAfyh8SJVARvvpbIWpE8F8IfGi1QFPI+3jawF6VMB/KHxIlU03syiAvhD40WqaLyZRQXwh8aLVAU8xnu5rAXpUwH8CdR4P5d1IP5ovJlFBfCHxotUBTyPl8brgArgD40XqQrYeDnG64AK4A+NF6kK2Hgvk7UgfSqAPzRepCrgMV4uoHBABfCHxotUBWy8XDLsgArgT6DGy+lkCUTjzSwqgD80XqQq4AUUNF4HVAB/aLxIFY03s6gA/uSGuR8vjTeBaLyZRQXwh8aLVE2ePLmrnEvXaLzuqAD+0HiRqilTpnSRc+kajdcdFcAfGi9SNXXq1LvkXLrGebzuqAD+BHpzjfN4Eyhg4+WSYQdUAH8CNV72eBOIxptZVAB/aLxIVcBjvDReB1QAf2i8SFXAsxpovA6oAP7QeJGqgOfxcncyB1QAfwI13lWyDsQfjTezqAD+0HiRKm6Sk1lUAH9ovEhVwMZ7sawF6VMB/KHxIlUBDzXQeB1QAfwJ0XiXLl36qawD8Rew8XKowQEVwJ9AjfcTWQfij8abWVQAfwI13o9lHYi/gOfxcq8GB1QAfwI1XvZ4EyjgHi+N1wEVwB8aL1IVsPFyHq8DKoA/gRovb64lUMDGyyXDDqgA/tB4kaqJEyd2l3PpWnnjvVzWgvSpAP7QeJGqgI33ClkL0qcC+EPjRarGjx9/j5xL12i87qgA/tB4kSoab2ZRAfyh8SJV48aN6ynn0jWO8bqjAvhD40WqAjZezmpwQAXwh8aLVAVsvJzH64AK4E+IxssTKJIpYOPl7mQOqAD+hGi8ZplrZR2Iv4Bvrl0ga0H6VAB/QjTeBQsWfCvrQPwFbLz/");
    imageData.append("JmtB+lQAf0I03ldfffU7WQfiL+ChhrNkLUifCuBPiMb70ksv7ZV1IP4ef/zx38m5dG348OFm0VELWQvSpwL4k5ub21pu7K4988wzJbIOxN+oUaMekHPp2tixY82io6ayFqRPBfDnrbfeOk9u7K5NmjSpVNaB+HvooYcGybl0bfLkyWbRUUNZC9KnAvjzzjvvnCM3dtfK92JULYi3QYMGPSTn0rXnnnvOLDo6UNaC9KkA/rz77rtnyo3dtREjRkSyDsTfgAEDHpZz6dof//hHs+iohqwF6VMB/HnvvffOkBu7awMHDoxkHYi/fv36PSLn0rV58+ZFsg5UDRXAnxUrVrSSG7trXbp0MYuOaslaEG8PPPDAKDmXri1atCiSdaBqqAD+hGi811xzjVl0dIysBfF2//33Pyrn0rVly5ZFsg5UDRXAnxCNt2XLlmbRUVtZC+Ktb9++j8m5dO2DDz7gDBhHVAB/Vq5c6b3xNm7c2Cw6miBrQXyVlpZW79KlyxQ5l67l5eUVy1pQNVQAf95//33vjbdatWpRcXFxjqwF8VVYWFjv7LPPXibn0rXvv/++QNaCqqEC+GN+lWtlGmGp3OBd27BhwxpZC+Jr165dh9avX3+XnEeXjjjiCLPo6AtZC6qGCuDPp59+GqTxrly5kjuUJch3333X0Pd2csYZZ5hFRzNkLagaKoA/a9eu/ZeaNWvukxu9a7Nmzdoga0F8bdu2zXvjveGGG8yiefqEKyqAPxs3bjypUaNGm+RG79qDDz64zSy/iawH8bR69eoT5Ry6dt9995lFRw1kLagaKoA/e/fubXDuuee+LTd619q0abPPLP+3sh7E09SpU++Sc+jauHHj7Klk3KfBERXAq2rmV7o5cqN3zexl2xeV3aWR9SCGWrZsuVLOoWt/+tOfdppl15W1oGqoAH61b99+ltzofdi1a9cgWQviqXr16iVy/lxbs2aNvV64pqwFVUMF8Ktz587T5Ebvw/LlyxfL");
    imageData.append("WhA/RUVFtX2/sWYVFBQ8JmtB1VEB/Jo8eXI3udH78Mgjj+yRtSB+3njjjcvl3LlWfnXjEFkLqo4K4FdeXt7JcsP3oXXr1mbxUXVZD+KlW7duk+TcuXbttdfa9wAGy1pQdVQAv8yvknXkhu9DzZo1o8LCwjtlPYiVarfffvtzcu5cGzFihL1HQ6dK6kEVUQH8C3EMz3r99dfXy1oQHzt37jz0zDPPfFfOm2sLFy60h6GayHpQdVQA/xo3bpwvN34funfvbs/n5Z3rmLIXToS4snH79u3cHMcxFcC/cePG9ZQbvw8nnHCCfdT7rbIexEOIh6E2b97cLDpaJ2tB1VIB/MvLyztJvgB8sIc4Nm7c+IisB/Fw6aWXLpBz5tptt91mFs3xXddUAP9M82sa4iR56/HHH/9bxKWhsWPP3w2xTYwfP94snsNPrqkA/hUUFDRq1qxZnnwR+NC4ceNS83GsrAlhhTiNzFq+fPkOWQuqngrgn2l8tW666aaX5IvAl5UrV74ka0I43333XaMQ92do2LBhVFJS8qysB1VPBQjj7rvvfkq+EHxp27atfZOttqwJYZi9zjNr1apVJOfJtU6dOtkLJ3rKelD1VIAw5s2b10G+EHyxF1Ps3r17gKwJYdx5551Pyzny4bXXXttlln+BrAdVTwUIw/yKV0u+EHx64YUX/iviNoDB7dmz58AQb6oddNBB0d69e782NdSQNaHqqQDhnHjiiavlC8KXI488cpdp/k1lTfCrV69eT8i58aFdu3Zm8dFsWQ/cUAHCWbVqVYtQlw9bI0eOtA/BrCbrgh/btm07/Be/+MWHcl58ePHFF+3x3UNlTXBDBQjH/KpXv0GDBtvli8KX+vXr2183/13WBT8mTZrULcQP3lq1akU7d+78RtYDd1SAcEpLS2t07Nhxhnxh+DRhwoTlppbDZW1wr2nTpl/K+fDhiiuuMIuP+st64I4KENaYMWMGh9jrqVC3bt3SPXv2nCnrgls9");
    imageData.append("e/YcJ+fClz/84Q/2bmTXyJrgjgoQ1oYNG04KcUeq/bVp02a3qaWprA1ufPvtt8ccd9xx6+Q8+GCfNlFUVPR+xHncXqkA4R166KHb5AvEt4ULF86MOL3MC3t5cKjfcoYNG2ZKiH4ra4JbKkB4K1eubC1fIL4dfvjhhXv37r1Y1oaqZe+5W6dOnb1y/ftg31TLz8+392TmEVCeqQDxcMQRR2yULxTfOnbsaN/pPkjWhqphmt7RDRs23CLXuy8dOnSwp5DxploAKkA8mF8BR4X69XN/8+fPHxWxR+RE27Zt/zPkHJvfrLaYOlrJuuCeChAPn3322ZUHHnjg9/LF4lvdunX3rF+/nne8q9hjjz3WN8SNcCqcddZZpowox6gla4N7KkB8NGvW7Av5ggmhXr16xYWFhcfJ+vDPefvtt8+tUaNGsVzPPs2cOdMeZmgva4MfKkB8LFmypKN8wYRy2mmnbTLN95eyRvxjNm3adMTZZ5+9TK5fn8xc2vvuLpG1wR8VIFaqNW/e/HP5wgnBHou8+OKLP6mkRqRow4YNje0NzkMe17Xmz59vz2S4SNYHf1SAeFm8ePEtIW4T+EOOP/743WZv6WBZJ36c3dM9//zzc+T69K1NmzamnOjliGO7QakA8VJUVNTENLsgVzVVxu6ttW3b9o09e/acLGtF5VasWPGvoQ8vWOYHePThhx/ap43Y7qvqhD8qQPzk5uZ2lS+ikGzzPe+8897Pz8+/WtaK/2vt2rXNTjrppM/kOgyhc+fOpqToQVkj/FMB4ql58+b58oUUmj0Esm7dOm6o8wO++eabn9p1FPqYrlWvXr1ow4YNm01dR8s64Z8KEE/r168/7yc/+ckO+YKKg0cffXRKSUkJN9EuZ9ZF9YkTJ3aPwz03KgwdOtSUFg2StSIMFSC26v7mN7/5i3xBxYHdo7vlllte3bRp0zmV1J1VzF7ucT169JgQ+jzd/bVo0SIqLCy0e7uNZb0IQwWIr6KiokPk");
    imageData.append("iyoubPM9+OCDdy5YsOAmWXe2MGO/1O7lxukslLp160Yff/yxfUPtWFkvwlEB4i0nJ6dz6Pv1/j0tW7b877y8vHOjLLjHQ0lJSY1ly5adfe211/5XHI7lShMmTLBXqN0v60ZYKkC8lZaWHt6uXbvgpyb9PQcddNDu/v37jzUN+Hw5hkyRn59/VO/evcfY+1nI8cfBVVddFZntxd7k/DBZO8JSAeKvqKjomNq1a8du70qye4CNGjXadOqpp35q9grt88PVWJKooKCg3m233fYfTZo0+SpOhxX2Z9Z7tHHjxl0Rx3VjSQVIhg0bNrSye5XyBRdn9m5rpgFfvnPnTnu8MVGPkTc1H/rRRx+d1qlTp+lyXHH05z//ucjUfascB+JBBUiMOqNHj35OvuDizu4F2wsKhg0bNnjWrFk9tm/ffnwlY4uF4uLimvPnz28zcuTI/tddd93cuJyT+/f07dvXlB/Z+ygn6odbNlEBkqOkpOTo5s2bb5UvvCSwDax27dqFp5xyyqf2ctq77rrrpdWrV/+rHKNvhYWFdWbOnHnLZZdd9saZZ575buPGjfOT0Gwr3Hzzzfa47qyIh1fGmgqQLGav7JAmTZpsSlJz+DEVx4WHDx8+cN26dc22bdt25K5duw4vKio6yDSUtM+SsGch7Nmz52Czp91o8+bNR+bn5zf+61//etavf/3rV0LemLwqXHzxxfZ83dVmnM3luBEvKkDybNmy5ar69esXyhdiJqhoxPYxOfZX/ilTpnSZOnXqXU8//fSd06ZN6/zss8/+5oUXXugwe/bsm+fOndt+zpw57V966aWbTHbrjBkzOk6fPr2T/Vz7NfZrhw4dOsQ0qEUNGjTYnpRDB6mwF0ns3LnTNl17Gp/aRhAvKkAybdy48bIDDzwwyNNqfbPN0rJXh9m9VPuU3nr16hWYHz67LPumo30jzx7KsOc8Z0pz/SHmNx77tOCtZju4Vm4XiCcVILlWrVp1V9wvrkDVOuyw");
    imageData.append("wyIz78URF0kkigqQbLm5ucPtHqB8gSLz2HN133///Y1m3u+U2wHiTQVIvgULFoxM+htF+HHNmjWL1q5dax/hc4VRU24DiDcVICPUeO+990bWrFlTvWCRfGeccUa0adOm78w8/7ySuUcCqACZIz8//+YmTZok8jxfVO7KK6+MCgoKPjbze7GcbySHCpBRqu3YseP6Cy+8MBZPKkZ6OnXqVLpv3743zbyeVMlcI0FUgMxTXFzcrGPHju/JFzKSwR4yGjlypL0i7VMznzzpIwOoABmr1vDhw9+257vKFzbiq3nz5tGKFSt2m/kbXsmcIqFUgIxW74svvuh2wgknbJcvcMTP3XffXbpnz57FZt7uqGQukWAqQObbt2/f6QMHDlwiX+iIhyOOOCKaN2+emapoScT9dDOSCpA1qi9evPjPxxxzzM5Mv6Q2SX71q19Fmzdvtpf/dq1kzpAhVIDs8v3339/YvXv3D2UDgF+nnnpqtGDBgi2lpaXTzbycJ+cJmUUFyEonr1u3rn/r1q1j+eywTHb00UdH06dPj0pKSl4283CWUaeS+UGGUQGyWs233npr4emnn76Hww9uHXzwwdGIESNKCgoK7HPRulcyF8hgKgDMr7sXLF68eE6LFi22yIaB9NStWzfq0aNH6bZt25abdT3GOEiuf2Q+FQDl6ppffy9dvnz50FatWn0vGwj+MT/72c+i0aNHR1u3brX3WLB7uCdUss6RJVQACPaBiYd88MEHb9966632OWmqqaBy1apVi66++urotddes8dwv4/KzsflWWg4QAXAjzhmx44dz7744ouLTzvttJ2y0aBMw4YNo379+hV/8803n5h19qpxfSXrEllMBUAK7IMn2+Xl5Q3u06fPxmOOOUY1n2xjDyX06tUrysnJ2VlcXDw1Ktu7PbWSdQccoALgH1DDaGRc9Mknn6wZNmxYqb1XrGxKmcgeRjjnnHOiRx55JDJjtzewyTPr4ULjSKNuJesK+P9U");
    imageData.append("AKThQKP7li1bls6dO3fFHXfc8e3xxx9fLJtWEtWoUSP65S9/GZkxlb7wwgvbt27d+jcz1r8agyLOvcU/SAVAFbHN6BKjz+7dux/86KOPpowfP/6L66+/fp+9aEA2tjixe7OnnHJK1KFDh8jUXLpixYpvCwsLnzdjGWj0M9obh1QyZiAlKgAcsXvDTaOyx9W03LFjx8i//OUvW8eNG1fau3fvqF27dtFZZ50VHXXUUaoRutCgQYOoRYsW/++sg65du9qLGaLnn3++NDc3t3TXrl32XglPGedGZcdpmxkHVzIm4J+iAiAAu3d8otHJmGn2Lpd//fXXny9btmzNq6++umbWrFlfPPvss+smTZr0P6NHj944dOjQbaZZ7zYNc2/Hjh33tW/fvuT2228v6datW3GfPn0KhwwZUmA+77unnnpq04wZM9bPmTPnq3nz5q1dunTpmry8vDUFBQVrzHJWGx8Yrxm9jeOjsmPWsjagyqkAiKF6xlFR2SNvzjauicqadB9jqPGwMcJ4KCo7FGDv7HVjVHazGXuhQsOIN7wQIyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilAgCAWyoAALilgmz01VdfNenbt+9j3bp1m3TPPfeM79279xjr3nvvfbJnz57jJJv36tXrifvuu29sxedaffr0Gb0/m9nPqbD/51ZGfr2tyar4Xvt/js3vv//+Rys88MADox588MERAwYMeLhfv36P2Mz+aTP7d/u1I0aMeNCMt7Ecvw8bNmw40tbdo0ePCZatd+TIkf2twYMHD+vfv/9IO6aKcdqabe2W/T/7+fuz/y/Xl1xPFetIfl3F");
    imageData.append("OpVf80NzVdn3qli+/f+K72e3izFjxvQ24z1Yjt+17du3N7Drsnv37hPtNjx8+PCBkydP7vr444//btiwYYPtdlFRt90uBg0a9NDQoUOHWHb9Dxw4cLj9HMuuc/s5+49V2n/brGxbtOy8VWyTdnlDhgwZamuxy7TLs8uo2Fbt95gwYUIPM5ZacmyZSAXZ6Mknn7y3Ro0axdWqVSu1qlevXmJV/LsyFZ/jkq1JZvv/X2Vq1qy5T2YV36dWrVpFZrzj5fh9eOihhwbZGirWn63J1mNV1JzK+OSYfoz8/FS/rjLye+z/ffb/e+3atQvNeB+W43dt3rx5V9t1WbF+7d/r1q27p06dOnv3X8cV7L8rI8f4Y35s3UgV37+ilsqWZes1Y3lEji0TqSAb2Z/EB5hVkQ3Mx2o5fh/sHpBtCLKeTGQ+tsrxuzZnzpwbZB1JZD6ekWPLRCrIRjNmzOgoN4BMZT5el+P3wf46m0WNd7Mcv2uLFy++SNaRROZjuhxbJlJBNnr55ZevlxtApjIf/eT4fRg1atQDWdR435fjdy03N7e1rCOJzMc0ObZMpIJsNHfu3OuyqCl0luP3wb7RY48HynoykfnIkeN3zTbeTNiGIxpv9qDxujdx4sTuWdR4/ybH7xqNN1lUkI2yrPHeIcfvw9ixY+/LonX8uRy/azTeZFFBNsqyxnunHL8PWXaMd5Ucv2s03mRRQTai8bpnT+7PonW8Uo7fNRpvsqggG9F43bNXzWXROl4mx+8ajTdZVJCNbOOVG0CmMh9d5fh9ePjhhwdkQmNIhfl4R47fNRpvsqggG2VZ47XXw6t14Jq9d0AmNIZUmI+lcvyu0XiTRQXZKMsa771y/D5kWeOdL8fvGo03WVSQjWi87mVZ450rx+8ajTdZVJCNaLzuZVnj/ZMcv2s03mRRQTai8bqXZY33LTl+12i8yaKCbJRljZc31xwzHx/J8btG400WFWSjLDuP9245fh+yrPF+KMfvGo03");
    imageData.append("WVSQjbKs8XaT4/fBPoEii9bxe3L8rtF4k0UF2SjLGu8Dcvw+2OdsZdE6fleO3zUab7KoIBvNnj37RrkBZCrz8aQcvw9ZdqhhkRy/azTeZFFBNsqyPd4Rcvw+2B9u9oGGsp5MZD76yPG79s4775xjHyQpa0ka8zFGji0TqSBLHW28aewzdkZld5eaHZU9/+l540XjWWOcMSwq+3X9vqjsBXZ/OftY717l7N/t/9m/94zKziTYn83saV32/+2f+//bst+74vv3jcqWZx/Z098YaAyPyjbQSVFZjba+l6OyK6Zyo7JjjPaddftgy7XG18a35XmrSI/fh/pR2Xg+i8puFP60MdgYGZU9WXZIVDY+O84B5ezj6CvY3H69XS+/i/7vurPr1L5peNd+7D0p7PHs7uXs/3cpz+2/7dfaebLLHBKVzatlnxD8WFQ211OM30dlD2D8D2OW8Z/lXjEWRmWXB9snTth1bR9y+ZpxVKTH71oDY6qxIyp75pu9X4Tdhu32OzEq+4Fr16ndnuy47fjvicrWnV0fFeuqIrPry95QybLr0647m9nPsevcrn87D3Y+7PezrwG7ndr1aZczKCqbX/tnxfzZP0dFZdurvZHQGuPLqKze3VFZzc0iPbaMowIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIA");
    imageData.append("gFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC4pQIAgFsqAAC49b+j1ZV3LEn2TAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image95d26c11e6fe0964afb2447bbb851e0d = new WeakReference<>(result);
        return result;
    } catch (IOException ioe) {
    }
    return null;
}


	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.03779527544975281f, 0.0f, 0.0f, 0.03779527544975281f, -0.0f, 3.6909448681399226E-5f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0_0_0_0_0_0_1
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(26.459999084472656f, 0.0f, 0.0f, 26.460357666015625f, 5869.0f, 9677.0f));
// _0_1_0_0_0_0_0_0_1_0
BufferedImage image95d26c11e6fe0964afb2447bbb851e0d=getImage95d26c11e6fe0964afb2447bbb851e0d();
if (image95d26c11e6fe0964afb2447bbb851e0d != null) {
    g.drawImage(image95d26c11e6fe0964afb2447bbb851e0d, 0, 0, null);
}
g.setTransform(transformsStack.pop());
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
        return 221.82046508789062;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 365.7449035644531;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 350.02203369140625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 391.0299072265625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private dashed_underline() {
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
       dashed_underline base = new dashed_underline();
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
       dashed_underline base = new dashed_underline();
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
        return dashed_underline::new;
    }
}

