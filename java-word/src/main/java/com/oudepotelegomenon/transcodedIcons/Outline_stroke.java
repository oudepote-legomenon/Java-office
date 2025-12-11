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
public class Outline_stroke implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image673c0c8f1f3cfaab08bc5e729fb41713;
private static BufferedImage getImage673c0c8f1f3cfaab08bc5e729fb41713() {
    BufferedImage result = (image673c0c8f1f3cfaab08bc5e729fb41713 != null)
        ? image673c0c8f1f3cfaab08bc5e729fb41713.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(14676);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAqx0lEQVR4Xu3dCbBk113fcRtwDEUl4BBsKqwBG0wItkEQAgGiQtPdGglSVApRQIhTKYclC4SYBDuERWAHvIBtYpN4F9J094wHSKgQhEMAUSmKsjXdPZZYyiC8YssyXmQs25K1zEvfWaQ75/V757737u1zzr2fX9WnqNiWpmde6vy/Gs1Ij3qUmZnZho1mZ6657vQf/7XwPzczM7OebjJdfs94tjw3nq1+4/jNdzw2/O/NzMysZ1sf/u+9cPyXO5XRbPmrV7xi8Zjwf2dmZmY92Wi+/L768RcBZmZmPd9kuvr+Tce/5ldEgJmZWY82mS5/KHL8H46AK2+55ZPCP97MzMwK2/qo//sNh35v88UviwAzM7OCN5qvnrnrwDchAszMzMrcoY//RZPZ6rQIMDMzK2iT6eKHw4N+GKPp8nUiwMzMrICNZ4v/EB7yoxABZmZmmW88X/7H8IC35JQIMDMzy3AdHv9LTl13+vQnht+umZmZJdpouvyRDQe7CydFgJmZWQabzFbP2nCoOzOZLW+4/vqdTwg/h5mZmW1p2z7+l4xmy9eKgMx35wM7V8M2vfVjO9/+5rt3fgz2cvcrX/rrH3rpC/9PzIef++wbPvzTz3pNE/e84LnXhe9f37c+xNeHh3mbREDmu/P+nR3Yprd/dGfn7Htgs4/86L/b2bnqKa2794f+xZ+F71+fN5qufio8yEnMl68RAZkufJyhawKAvXR1/CtDCoBsjv8lIiDPhY8zdE0AsEmXx78ylACYzFY/vesAZ2HxahGQ2cLHGbomAAh1ffwrQwiA9ZF9zu7Dm491nLxKBGS08HGGrgkA6rZx/Ct9D4DRbPG88ODmafGc8LNbooWPM3RNAHDJto5/pc8BMJ4un7v70OZo8ReTE8snhp/fEi18nKFrAoDKNo9/pa8BMJkt/8vuQ5uldzr+mS18nKFrAoBtH/9K");
    imageData.append("HwNgPF/9zIZDm6N3Hj+1+KLw81vihY8zdE0ADFuK41/pWwCMp6uf3XBoc/QOxz/ThY8zdE0ADFeq41/pTQDs7Dx6PF++eMOhzdE7js3OfGH4XbBMFj7O0DUBMEwpj3+lFwGwPv6T2fIlGw5tjhz/3Bc+ztA1ATA8qY9/pfgAqP7Kf7b6hQ2HNkfvGN90298JvwuW2cLHGbomAIYlh+NfKToAquM/XfzXDYc2O6PZ8u2OfyELH2fomgAYjlyOf6XYAFgf//VRfWl4aHPk+Be28HGGrgmAYcjp+FeKDICCjv/a264+efYLwu+CZbzwcYauCYD+y+34V4oLgAu/4O9lGw5tjhz/Ehc+ztA1AdBvOR7/SlEBcP7v+S9/ccOhzdGfHZ/e9jnhd8EKWPg4Q9cEQH/levwrxQRAYcf/m25802eH3wUrZOHjDF0TAP2U8/GvFBEAF36r33/bcGizM5kt/tTxL3zh4wxdEwD9k/vxr+QeANdfv/MJ4/nyNeGhzdRHJ7PV09eOdWH94/BN62/jitHs7JNGJ1d/+9jpxaeFP17WwsLHGbomAPrlo8/+gV3HNkf3PfMZfxq+f7msOv6j2fK1Gw4tj7h/7c3j2eLXJvPl88ez1TPGJ89+3dee/oNPCX88reHCxxm6JgD6o4S/8q+c+9av33nL77zhJeH7l8Mu/JX/6pc2HDyaeWBtMZotnlf97MHxm+94bPhjbHssfJyhawKgH0o6/m8++7ad1V07zw7fv9S77vTpT1z/Fe2NG44ah/eRtVOTk4trr7zllk8Kf8yttvBxhq4JgPKVdvyrz5xbAFTHfzRb3rThgNGa1V3r//ui0ezs08Iff3uUAGD7BEDZSjz+lZwCwF/5p7D6/fF8+S3h12LQCx9n6JoAKFepx7+SSwD4K//UFmdHs8V11W+5DL82g1v4OEPXBECZSj7+lRwCoDr+k+livvsokcCy+l0E4ddoUAsfZ+iaAChP6ce/kjoAzv+0/3R5");
    imageData.append("YsMhIp1z53825qbbHh9+vQax8HGGrgmAsvTh+FdSBkD1q9FH0+XrNhwgsrD6wGS6/J7B/W2B8HGGrgmAcvTl+FdSBcCFX/C3mu0+OuRmMlv+9jWnb/2s8GvY24WPM3RNAJShT8e/kiIA/D3/As2X75qcWH5D+LXs5cLHGbomAPLXt+Nf2XYAOP5Fe3Dt+uqf0hh+XXu18HGGrgmAvPXx+Fe2GQBXvGLxmPVfSf6PDYeFsvzPK2+45ZPDr29vFj7O0DUBkK++Hv/KtgLA8e+d3z0+fcPfCL/OvVj4OEPXBECe+nz8K9sKAL/Vr5eWV83f8ITwa138wscZuiYA8tP341/ZVgAcmy7/wfpgfGjDEaFsd3zTjW/67PDrXfTCxxm6JgDyMoTjX9lWAFRbH4srqt9bvuGIULTFH01O/8HfDL/exS58nKFrAiAfQzn+lW0GQLXJicVXioAemi7fML7ptk8Nv95FLnycoWsCIA9DOv6VbQdANRHQW79e/dMdw693cQsfZ+iaAEhvaMe/kiIAqo1Orr5qfTA+uOGIULDJbPmy8Gtd3MLHGbomANIa4vGvpAqAasdOnvmK9dF4f3hEKNtkuviu8Gtd1MLHGbomANIZ6vGvpAyAaqPZ2aeNRUDf3HP1iTNfEn6ti1n4OEPXBEAaQz7+ldQBUK2KgMls+b4Nh4Ry3fa1p//gU8KvdRELH2fomgDYvqEf/0oOAVDNzwT00ovCr3MRCx9n6JoA2C7H/4JcAqDa5MTqqX4moFcerH6dR/h1zn7h4wxdEwDb4/g/IqcAqHb1fPkUEdAfo9ny1uL+7YHh4wxdEwDb4fhfLrcAqHbs1PJLx9Ple8JjQplG88W/DL/GWS98nKFrAqB7jv9uOQZAtWPTxZevj8d7w2NCkd5/1Y1v/Izwa5ztwscZuiYAuuX4b5ZrAFQbzxdPXh+POzccFEozX/1M+PXNduHjDF0TAN1x/PeWcwBUm8zf9GXj2equXQclTx9d");
    imageData.append("+78d+r21xWi2fPv6/z443v3t5+yvrp3d/rjw65vlwscZuiYAuuH47y/3AKh2fLr6uwVFwE+Gn7+LHb/5jsde/Nsk37t2au3uDZ8lK5P54ifC70eWCx9n6JoAaJ/jH1dCAFQr7BcGXh9+/q535Q23fPJotrhuMlv+9obPk4nVB/7xa37/r4efPbuFjzN0TQC0y/FvppQAqFbSrwmYzFY/HX7+bW18cvE162P7W+FnysFovnpm+HmzW/g4Q9cEQHsc/+ZKCoBq1T9jflxIBIxni+eEn3+bq35GYJzdj9Xij8LPmd3Cxxm6JgDa4fgfTGkBUG00O/uk8Xz5rt3HJUPT5QvCz7/NXTlf/K3157h51+dK64rwc2a18HGGrgmAo3P8D67EAKh21ak3fXExEZD4t8BV/yS+0Xz1c7s+VyKT2fIl4WfMauHjDF0TAEfj+B9OqQFQ7fzPBMwWfxEemByNZovnhZ9/2xtNlz8Sfq5E3nvFKxaPCT9fNgsfZ+iaADg8x//wSg6AapMTyyeWEgGT+fL54eff9qpfnBh+riSmq+PhZ8tm4eMMXRMAh+P4H03pAVDt+KnFF62Pyjt3HZk8vTD8/NveOphu3PC5ti3ff1Vw+DhD1wTAwTn+R9eHAKh2zWz1+evD9tYNhyZHSY/f+KbbPnU0W/7xhs+1RYuz4efKZuHjDF0TAAfj+LejLwFQ7djszBeuj8s7dh+bLCWNgNHs7NPWn+GBDZ9rWx6qfodC+LmyWPg4Q9cEQHOOf3v6FADVjt20+Lz1cXnLhoOTndFs8d8ftbPz6PD7sK1Vvxo//ExbNV19W/iZslj4OEPXBEAzjn+7+hYA1a4+efYL1gfmbbsOTobO/5a4RBFw7PTi08YJ/x0C6+/7y8LPlMXCxxm6JgDiHP/29TEAql38mYA/D49OlqbLl6eKgOqfVrjr82zP74WfJ4uFjzN0TQDsz/HvRl8DoFpJvzBwNF39VPj5t7HxTbc9fv3t3x9+");
    imageData.append("nq2YLt8Tfp4sFj7O0DUBsDfHvzt9DoBq45O3fu44958JWB/C6t92GH72bW39Gf7Xrs+0JVfecPbTw8+TfOHjDF0TAJs5/t3qewBUyzwC3l39Y43Dz7zNjear79zwubZiMjvz98PPk3zh4wxdEwC7Of7dG0IAVDs+ve1z1gfnjvAAJXZn9W83DD/rtnfxbwOc2/D5OjeZrZ4efp7kCx9n6JoAuJzjvx1DCYBqFyPgz8IjlMid4/niyeFnTLXqX9O74TN2bh0Azwo/S/KFjzN0TQA8wvHfniEFQLVrTt/6Wen/KXjL907mb/qy8LOl3PozndzwObdg8ZzwsyRf+DhD1wTABY7/dg0tAKpdNX/DExJGQHbHv9r6c12/4bN2Lst/NXD4OEPXBIDjn8IQA6Baogh47/imM38v/Cw5bDJdfs+Gz9u9+fI14WdJvvBxhq4NPQAc/zSGGgDVqgjY4t/7/stcj3+18Wz1HRs+c+cms9Xp8LMkX/g4Q9eGHACOfzpDDoBq1a8JGE+XfxIeppZlffyrrX8MvnnD596Gm8PPknzh4wxdG2oAOP5pDT0Aqp3/bXDz5R9uOE5t+Mtj08WXh99mbpucXFy74bN3b7r8zfCzJF/4OEPXhhgAjn96AuDCLv5e+Nt3Haij+eDkxOIrw28rxwmA2sLHGbo2tABw/PMgAB7Z8dOrzxy3FwEfXLsi/DZynQCoLXycoWtDCgDHPx8C4PK1FAF3j06uvir8c+c8AVBb+DhD14YSAI5/XgTA7l2MgNt2Hatmijv+1QRAbeHjDF0bQgA4/vkRAJt37ez2x60P1GLXwdrf3VdPz351+OcqYQKgtvBxhq71PQAc/zwJgL13MQLO7DpamxV7/KsJgNrCxxm61ucAcPzzJQD231U3vvEzxrPF2V2H63JZ/IK/Y7MzX/ionZ1Hh/95k5UYAEf5/u678HGGrvU1ABz/vAmA+K684eynj2bLW3cdrws+lMO/0379Oa4YXwiR");
    imageData.append("VxzmKJYWANVvrxzPVh8Yz5evvP76nU8I//sjLXycoWt9DADHP38CoNn2iIAPjU8uvib8325745Nnv279Wf6qdlRfftAIKCkAjp088xXnj//FP8dktnpVqxEQPs7Qtb4FgONfBgHQfFUErA/PGy8enjyP/8NH8WD/lr1SAiA8/o9YvLq1CAgfZ+hanwLA8S+HADjYLv7CwN/J4fgfmy++fv1ZPrz7GD7sReEfs9dKCIDxI3+bY/efp9LW3w4IH2foWl8CwPEviwAoc6PpmX843v/4XzqKLw7/2E3LPQBGs7NPW//v37/rjw/Nl685cgSEjzN0rQ8B4PiXRwCUtwZ/5R+K/kxAzgHQ+PhfctQICB9n6FrpAeD4l0kAlLVDHP/zJrPFz4d/rvpyDYDJidVTxwc5/heNZsvXHjoCwscZulZyADj+5RIA5WxyYvkN6+N2T3jsmhrNVz8X/jkvLccAqI7/ZLZ8364/pqHJdDG/7vTpTwz/vNGFjzN0rdQAcPzLJgDK2FGP/yV7RUBuAXD1fPmUoxz/mpNX3nLLJ4V//n0XPs7QtRIDwPEvnwDIf+PZ6hvHLRz/mheG30ZOAXDs1PJL1//5e3b9bw/v1IEiIHycoWulBYDj3w8CIO91cPwvmC5fUP92cgmA8Xzx5JaP/yXNIyB8nKFrJQWA498fAiDfjearf7Q+XB/ZcMxaMZkvn3/p28ohADo8/ueNpsvXNYqA8HGGrpUSAI5/vwiAPDeenxmtj9bHwiPWtksRkDoArj5x5kvW/+87d/33LWsUAeHjDF0rIQAc//4RAPltNF2Mx1s4/jU/mTIAtnX8L5nMVqf3jYDwcYau5R4Ajn8/CYC8dmy2nKyP1L3h0dqC393wn3VvuvyTLn/afy/7/kxA+DhD13IOAMe/vwRAPkt4/IdpvvjlK16xeEz4dRAAbF2uAeD495sAyGOT+fLqseOfwq/sioDwcYau5RgA5Rz/b3D8D0kApJ/jn9ZotvzV");
    imageData.append("yyIgfJyha7kFgOM/DAIg7cbT1fGx45/caLr838dvvuOx578o4eMMXcspABz/4RAA6eb45+XhCAgfZ+haLgHg+A+LAEiz0XR11frofDw8QqRV/RZBAcDW5RAAjv/wCIA0O3Z68Wnj2eqN4QEiqfvH88W3CgC2LnUAOP7DJADSrYqA0Wx564ZDxPZdOP7VwscZupYyABz/4RIAaXflDWc/XQQk9+B4tvqOh78o4eMMXUsVAI7/sAmA9KsiYH2Ezmw4THTv8uNfLXycoWspAsDxRwDkMRGQxIOj+eo7w6+FAGDrth0Ajj8VAZDPLkbAYsOhon0PTqaL7wq/BucXPs7QtW0GgOPPJQIgr107u/1xYxHQtQfX/mn4Y//wwscZuratAHD8qRMA+e346dVnrg/U7RsOF0f34Gi+/O7wx/yyhY8zdG0bAeD4ExIAeU4EdCJ+/KuFjzN0resAcPzZRADkOxHQqgcns9U/C3+MNy58nKFrXQaA489eBEDeOx8B8+UfbjhoNNf8+FcLH2foWlcB4PizHwGQ/8Y33fZ4EXBoD62P/9PDH9N9Fz7O0LUuAsDxJ0YAlLHzETBb/NGGA8feHhpPF/88/LGMLnycoWttB4DjTxMCoJyJgAM5N5ovvy/8MWy08HGGrrUZAI4/TQmAsnbV/A1PGM2Wf7zh4PGIwx//auHjDF1rKwAcfw5CAJQ3EbCvc5Pp6vvDH7MDLXycoWttBIDjz0EJgDJXRcB4uvyTDQdwyM6NZ4t/Ff5YHXjh4wxdO2oAOP4chgAod9ecvvWzRMDDzo3ni38d/hgdauHjDF07SgA4/hyWACh7x6e3fc76+N2x4SAOSXvHv1r4OEPXDhsAjj9HIQDK38Aj4Nxouvw34Y/JkRY+ztC1wwSA489RCYB+7GIE/PmGA9ln7R//auHjDF07aAA4/rRBAPRn45O3fu54OBFwbjJb/tvwx6CVhY8zdO0gAeD40xYB0K9djIC3bDiYfXJuPF/9");
    imageData.append("QPh9b23h4wxdaxoAjj9tEgD927GbFp837m8EVL/V7wfD73OrCx9n6FqTAHD8aZsA6OcuRMDirRsOaNEms9Wzwu9r6wsfZ+haLAAcf7ogAPq7vkXAVo5/tfBxhq7tFwCOP10RAP3eNbPV5/ciAuaL7f3/0/Bxhq7tFQCOP10SAP3fhQhYvm3XUS3FdPGfwu9TpwsfZ+japgBw/OmaABjGSo2A0Wz5o+H3pfOFjzN0LQwAx59tEADD2eTE8onj+fJd4ZHNVZLjXy18nKFr9QBw/NkWATCsjWZnn1REBMyX/zn87Ftb+DhD1y4FgOPPNgmA4S3/CFj9WPiZt7rwcYauVQHg+LNtAmCYOx8Bs+W7dx/ftEazxY+Hn3XrCx9n6NpHbvjFXYc2R+f+yTfuvPn2d+46JJRJAAx3V5160xePM4qALI5/tfBxhi7dc8tv7Oz8yNN3Hdvc+Cv//hEAw14uETCZL34i/GzJFj7Q0JXzx/95P5R9ADj+/SQA7OoTZ75kfYTvDI/yFv1k+JmSLnykoQsPH//MA8Dx7y8BYNVSRcBotnhe+FmSL3yooW2XHf+MA8Dx7zcBYJe27QiYzJfPDz9DFgsfa2jTruOfaQA4/v0nAKy+8Xzx5PF0+Z7wWLduunxB+G1ns/DBhrZsPP4ZBoDjPwwCwMJtIQJeGH6bWS18tKENex7/zALA8R8OAWCbduzU8kvHs9VdG473kYzmq58Lv63sFj7ccFT7Hv+MAsDxHxYBYHvt6vnyKZPZ8n3hET+sIo5/tfDxhqOIHv9MAsDxHx4BYPttcmL11DYiYDJb/Hz458524QMOh9Xo+GcQAI7/MAkAi62KgPURf3941A/gReGfM+uFjzgcRuPjnzgAHP/hEgDWZKPZ2acdKgLmyxeHf67sFz7kcFAHOv4JA8DxHzYBYE134Ago8fhXCx9zOIgDH/9EAeD4IwDsILsQAasP7Dr2gcls+ZLwjy1m4YMOTR3q+CcIAMefigCw");
    imageData.append("g+7YyTNfsW8ETJcvf9TOzqPDP66YhY86NHHo47/lAHD8uUQA2GG2TwS8oujjXy182CHmSMd/iwHg+FMnAOywm5xYfOVlETBfvrL4418tfNxhP0c+/lsKAMefkACwo+xCBCw/2JvjXy184GEvrRz/SscB4PiziQCwo+74qcUX9eb4VwsfedikteNf6TAAHH/2IgDMgoUPPYRaPf6VjgLA8Wc/AsAsWPjYQ13rx7/SQQA4/sQIALNg4YMPl3Ry/CstB4DjTxMCwCxY+OhDpbPjX2kxABx/mhIAZsHChx86Pf6VlgLA8ecgBIBZsPDxZ9g6P/6VFgLA8eegBIBZsPAAMFxbOf6VIwaA489hCACzYOERYJi2dvwrRwgAx5/DEgBmwcJDwPBs9fhXDhkAjj9HIQDMgoXHgGHZ+vGvHCIAHH+OSgCYBQsPAsOR5PhXDhgAjj9tEABmwcKjwDAkO/6VAwSA409bBIBZsPAw0H9Jj3+lYQA4/rRJAJgFC48D/Zb8+FcaBIDjT9sEgFmw8EDQX1kc/0okABx/uiAAzIKFR4J+yub4V/YJAMefrggAs2DhoaB/sjr+lT0CwPGnSwLALFh4LOiX7I5/ZUMAOP50TQCYBQsPBv2R5fGvBAHg+LMNAsAsWHg06Idsj3+lFgCOP9siAMyChYeD8mV9/CsXA8DxZ5sEgFmw8HhQtuyPf2UdAI4/2yYAzIKFB4RyFXH81x74+R/defPt79z1QEOXBIBZsPCIUKZijv8rf2bn/73lQzvf/jv3wVZ9y+n77rvmVfc+BNt0fPrxbwvvbjYLDwnlKen433X3h3de/+6Hdq55/b2wXSfXXg7bde38I98d3t1sFh4TylLa8a8+swAgCQFAAgKATpR4/CsCgCQEAAkIAFpX6vGvCACSEAAkIABoVcnHvyIASEIAkIAAoDWlH/+KACAJAUACAoBW9OH4VwQASQgAEhAAHFlfjn9FAJCEACABAcCR9On4VwQASQgA");
    imageData.append("EhAAHFrfjn9FAJCEACABAcCh9PH4VwQASQgAEhAAHFhfj39FAJCEACABAcCB9Pn4VwQASQgAEhAANNb3418RACQhAEhAANDIEI5/RQCQhAAgAQFA1FCOf0UAkIQAIAEBwL6GdPwrAoAkBAAJCAD2NLTjXxEAJCEASEAAsNEQj39FAJCEACABAcAuQz3+FQFAEgKABAQAlxny8a8IAJIQACQgAHjY0I9/RQCQhAAgAQHAeY7/BQKAJAQACQgAHP8aAUASAoAEBMDAOf6XEwAkIQBIQAAMmOO/mwAgCQFAAgJgoBz/zQQASQgAEhAAA+T4700AkIQAIAEBMDCO//4EAEkIABIQAAPi+McJAJIQACQgAAbC8W9GAJCEACABATAAjn9zAoAkBAAJCICec/wPRgCQhAAgAQHQY47/wQkAkhAAJCAAesrxPxwBQBICgAQEQA85/ocnAEhCAJCAAOgZx/9oBABJCAASEAA94vgfnQAgCQFAAgKgJxz/dggAkhAAJCAAesDxb48AIAkBQAICoHCOf7sEAEkIABIQAAVz/NsnAEhCAJCAACiU498NAUASAoAEBECBHP/uCACSEAAkIAAK4/h3SwCQhAAgAQFQEMe/ewKAJAQACQiAQjj+2yEASEIAkIAAKIDjvz0CgCQEAAkIgMw5/tslAEhCAJCAAMiY4799AoAkBAAJCIBMOf5pCACSEAAkIAAy5PinIwBIQgCQgADIjOOflgAgCQFAAgIgI45/egKAJAQACQiATDj+eRAAJCEASEAAZMDxz4cAIAkBQAICIDHHPy8CgCQEAAkIgIQc//wIAJIQACQgABJx/PMkAEhCAJCAAEjA8c+XACAJAUACAmDLHP+8CQCSEAAkIAC2yPHPnwAgCQFAAgJgSxz/MggAkhAAJCAAtsDxL4cAIAkBQAICoGOOf1kEAEkIABIQAB1y/MsjAEhCAJCAAOiI418mAUASAoAEBEAHHP9yCQCSEAAkIABa5viX");
    imageData.append("TQCQhAAgAQHQIse/fAKAJAQACQiAljj+/SAASEIAkIAAaIHj3x8CIO7Hb71/52dXD9CiZ9z88T+85qZ730iLbrz37eHB43IC4Igc/34RAHG/+dZzO2ffs0OLVnftPDt8/+xou3b+sR8IDx6XEwBH4Pj3jwCIEwDtEwDtTwDECYBDcvz7SQDECYD2CYD2JwDiBMAhOP79JQDiBED7BED7EwBxAuCAHP9+EwBxAqB9AqD9CYA4AXAAjn//CYA4AdA+AdD+BECcAGjI8R8GARAnANonANqfAIgTAA04/sMhAOIEQPsEQPsTAHECIMLxHxYBECcA2icA2p8AiBMA+3D8h0cAxAmA9gmA9icA4gTAHhz/YRIAcQKgfQKg/QmAOAGwgeM/XAIgTgC0TwC0PwEQJwACjv+wCYA4AdA+AdD+BECcAKhx/BEAcQKgfQKg/QmAOAFwkeNPRQDECYD2CYD2JwDiBMD9jj+PEABxAqB9AqD9CYC4wQeA40+dAIgTAO0TAO1PAMQNOgAcf0ICIE4AtE8AtD8BEDfYAHD82UQAxAmA9gmA9icA4gYZAI4/exEAcQKgfQKg/QmAuMEFgOPPfgRAnABonwBofwIgblAB4PgTIwDiBED7BED7EwBxgwkAx58mBECcAGifAGh/AiBuEAHg+NOUAIgTAO0TAO1PAMT1PgAcfw5CAMQJgPYJgPYnAOJ6HQCOPwclAOIEQPsEQPsTAHG9DQDHn8MQAHECoH0CoP0JgLheBoDjz2EJgDgB0D4B0P4EQFzvAsDx5ygEQJwAaJ8AaH8CIK5XAeD4c1QCIE4AtE8AtD8BENebAHD8aYMAiBMA7RMA7U8AxPUiABx/2iIA4gRA+wRA+xMAccUHgONPmwRAnABonwBofwIgrugAcPxpmwCIEwDtEwDtTwDEFRsAjj9dEABxAqB9AqD9CYC4IgPA8acrAiBOALRPALQ/ARBXXAA4/nRJAMQJgPYJgPYnAOKKCgDHn64J");
    imageData.append("gDgB0D4B0P4EQFwxAeD4sw0CIE4AtE8AtD8BEFdEADj+bIsAiBMA7RMA7U8AxGUfAI4/2yQA4gRA+wRA+xMAcVkHwD2/++u7Dm2OHnj183fu+tA9u44J5REAcQKgfQKg/QmAuKwDIDy0OfJX/v0iAOIEQPsEQPsTAHEC4Agc//4RAHECoH0CoP0JgDgBcEiOfz8JgDgB0D4B0P4EQJwAOATHv78EQJwAaJ8AaH8CIE4AHJDj328CIE4AtE8AtD8BECcADsDx7z8BECcA2icA2p8AiBMADTn+wyAA4gRA+wRA+xMAcQKgAcd/OARAnABonwBofwIgTgBEOP7DIgDiBED7BED7EwBxAmAfjv/wCIA4AdA+AdD+BECcANiD4z9MAiBOALRPALQ/ARAnADZw/IdLAMQJgPYJgPYnAOIEQMDxHzYBECcA2icA2p8AiBMANY4/AiBOALRPALQ/ARAnAC5y/KkIgDgB0D4B0P4EQJwAeJ7jzyMEQJwAaJ8AaH8CIG7wAeD4UycA4gRA+wRA+xMAcYMOAMefkACIEwDtEwDtTwDEDTYAHH82EQBxAqB9AqD9CYC4QQaA489eBECcAGifAGh/AiBucAHg+LMfARAnANonANqfAIjLOgA+8pu/8p1t+8u3/OnXv+v+nafCJs9d3f+D4cHjcr/05w/98Jvv2bmO/d3+vp0rVu/deWoTt9218/jw/bOjTQDEZR0AZtveta+/71h48Aj8xse/PPxxM8ttAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACI");
    imageData.append("EwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcA");
    imageData.append("zGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANCAArIAJgDgBYFabAGhAAFgBEwBxAsCsNgHQgACwAiYA4gSAWW0CoAEBYAVMAMQJALPaBEADAsAKmACIEwBmtQmABgSAFTABECcAzGoTAA0IACtgAiBOAJjVJgAaEABWwARAnAAwq00ANHLn2jto0es+dvc1r7rvAVr0ynsfCg8elxMAZrUJAJI4ee+uxxm6JgDMahMAJCEASEAAmNUmAEhCAJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9oEAEkIABIQAGa1CQCSEAAkIADMahMAJCEASEAAmNUmAEhCAJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9oEAEkIABIQAGa1CQCSEAAkIADMahMAJCEASEAAmNUmAEhCAJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9oEAEkIABIQAGa1CQCSEAAkIADMahMAJCEASEAAmNUmAEhC");
    imageData.append("AJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9oEAEkIABIQAGa1CQCSEAAkIADMahMAJCEASEAAmNUmAEhCAJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9oEAEkIABIQAGa1CQCSEAAkIADMahMAJCEASEAAmNUmAEhCAJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9oEAEkIABIQAGa1CQCSEAAkIADMahMAJCEASEAAmNUmAEhCAJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9oEAEkIABIQAGa1CQCSEAAkIADMahMAJCEASEAAmNUmAEhCAJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9oEAEkIABIQAGa1CQCSEAAkIADMahMAJCEASEAAmNUmAEhCAJCAADCrTQCQhAAgAQFgVpsAIAkBQAICwKw2AUASAoAEBIBZbQKAJAQACQgAs9q++bfue9Lx19/3Ytima05//NeO33jfCrbp6lMf/erwDcxl/x9RG5NdV6iuTgAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image673c0c8f1f3cfaab08bc5e729fb41713 = new WeakReference<>(result);
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
BufferedImage image673c0c8f1f3cfaab08bc5e729fb41713=getImage673c0c8f1f3cfaab08bc5e729fb41713();
if (image673c0c8f1f3cfaab08bc5e729fb41713 != null) {
    g.drawImage(image673c0c8f1f3cfaab08bc5e729fb41713, 0, 0, null);
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
	private Outline_stroke() {
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
       Outline_stroke base = new Outline_stroke();
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
       Outline_stroke base = new Outline_stroke();
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
        return Outline_stroke::new;
    }
}

