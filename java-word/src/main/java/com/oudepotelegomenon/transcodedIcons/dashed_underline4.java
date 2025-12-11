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
public class dashed_underline4 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image0730412c705b2be3361f77ab7256bf0c;
private static BufferedImage getImage0730412c705b2be3361f77ab7256bf0c() {
    BufferedImage result = (image0730412c705b2be3361f77ab7256bf0c != null)
        ? image0730412c705b2be3361f77ab7256bf0c.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(12612);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAYgAAAGkCAYAAAArLbJrAAAkvElEQVR4Xu3dCZgU5bn2cWfYGRCQZVTWQQREFDDGKNHDouCS5QOVREQMGmPMQXIwMYYvMSh6jMaYqJioJIBGRXEDCaAo6glJ0KMJgihnRGQTiQzDzgDOWt/7CH19c55nNKWZt2vpf1/X7wLuGWbqfauq766u7urDgiA4DAAAzQQAAAgTAAAgTAAAgDABAADCBAAACBMAACBMAACAMAEAAMIEAAAIEwAAIEwAAIAwAQAAwgQAAAgTAAAgTAAAgDABAADCBAAACBMAACBMAACAMAEAAMIEAAAIEwAAIEwAAIAwAQAAwgQAAAgTAAAgTAAAgDABAADCBAAACBMAACBMAACAMAEAAMIEAAAIEwAAIEwAAIAwAQAAwgQAAAgTAAAgTAAAgDABAADCBAAACBMAACBMAACAMAEAAMIEAAAIEwAAIEwAAIAwAQAAwgQAAAgTAAAgTAAAgDABAADCBAAACBMAACBMAACAMAEAAMIEAAAIEwAAIEwAAIAwAQAAwgQAAAgTAAAgTAAAgDABAADCBAAACBMAACBMAACAMAEAAMIEAAAIEyA+ampq8nfs2NHhjTfe+NLChQu/9uijj46eOXPmZffff/93f/Ob34yfOnXqhLvuuus/xJ133jmxLpmv33333d+/5557rnb/93uzZ8++bPHixRcUFxd/effu3UdXV1c30r8byVNZWdloy5YtnZYuXTro8ccf/+aMGTMuv++++67KbCuyDXzatpLZXjLbyr333vu9Bx988Dvz5s0bs3z58sFuWzlStkn9e5FeJkB0tm7dWjht2rQrL7vsspnf/OY3Z48aNeqJ4cOHP9+3b9+3Onbs+EHbtm23tWjRYm+TJk0+atSoUUWDBg2q8vPzq/Py8mo+jXyPfG/Dhg0rGzduXN6yZcs9hYWFW4477rj/GTp06Evnn3/+0/L7rrjiiofnzJnzgwMH");
    imageData.append("Dhyhlw3x8+abb/abPHnylNGjRz8q6++CCy54asiQIS/37Nlzdbt27UoLCgrKPuu2ktleMttK8+bN97Vp02bHscce++5ZZ521WLZJ+V2XX375jGeeeWac21Za6eVCepgA2bVt27Z2Y8aMeaRbt27rpQSkADI78mFu9WST/E65Q+jUqdOmgQMH/m3t2rWn6uVFtNwj+f6DBw/+r65du27o0KFDSdOmTQ9ke1vJlIg80JBtpXfv3sXuKHewXlYknwmQHRUVFY3lsF92NL0DxoXcEVx//fXTqqqq2unlR3bt3bu3pRwtZLsMwpLlcke7L7nl7K6XHcllAmTHL3/5y2v1ThZXI0aMeM8t8/F6DMiO7du3t5endfR6iaMBAwa8XV5efooeA5LJBPDvrbfe6nv44Yfv1jtXXMlRzsqVK+93y87J7OzLmz59+rflqUe9XuLq7rvvXu6Wu2EdY0HCmAD+TZo06VY5aah3rDj77W9/u9otez89FvhVVlbWftiwYS/o9RFn55xzjlv04Gw9FiSPCeCfvEoprs8lf5IJEyZUuWU/V48Ffn344Ye9k3T0IL7whS+4RQ9m6LEgeUwA/8aNG/eA3qni7uqrr65xy/4VPRb4tXnz5j7yclO9PuLsUEHM02NB8pgA/iWxIMaPH+8WnYLINncE0UteTqrXR5wdKoiFeixIHhPAPwoCYZWUlPQ48sgjP9TrI84OFcRzeixIHhPAPwoCYW3durV7ly5dNur1EWeHCmKRHguSxwTwj4JAWKWlpUXyLnu9PuKMgkgPE8A/eRWT3qnijpPU0ZCCcLd1en3EGQWRHiaAfxQEwuIIAlEyAfyjIBCWFIRcmE+vjzijINLDBPAviecgKIhocJIaUTIB/OMIAmEluCB4mWsKmAD+URAISwoioU8xPavHguQxAfyjIBBWgk9SL9BjQfKYAP5REAhLCqJ79+5r9fqIs0MFMV+PBcljAvhHQSAsVxDdevTosUavjzg7VBB/");
    imageData.append("1GNB8pgA/lEQCIuCQJRMAP8oCIQlBXHMMce8p9dHnPEUU3qYAP5REAhLCiKh5yA4SZ0CJoB/FATCSvC1mCiIFDAB/KMgEFaCC4IPDEoBE8A/CgJhURCIkgngHwWBsBL8PggKIgVMAP8oCISV4FcxURApYAL4R0EgrAS/D4KCSAETwD8KAmFt27ata8+ePVfr9RFnFER6mAD+URAIi4JAlEwA/ygIhCUF0atXr3f0+ogzCiI9TAD/KAiERUEgSiaAfxQEwqIgECUTwD8KAmFJQfTu3btYr484oyDSwwTwj4JAWBQEomQC+EdBICwKAlEyAfyjIBAWBYEomQD+URAIi4JAlEwA/8aNG/eA3qnijoKIBgWBKJkA/lEQCGv79u1djjvuuP/R6yPOKIj0MAH8oyAQFgWBKJkA/lEQCIuCQJRMAP84SY2wKAhEyQTwj4JAWBQEomQC+JfEghg/frxbdAoi23gVE6JkAvhHQSAsCgJRMgH8oyAQFgWBKJkA/lEQCItzEIiSCeAfBYGwKAhEyQTwj4JAWBQEomQC+Mcb5RAWBYEomQD+URAIi4JAlEwA/ygIhEVBIEomgH8UBMKSgujTp88qvT7ijIJIDxPAPwoCYUlBHH/88W/r9RFnFER6mAD+URAIyxVE5759+76l10ecURDpYQL4l8SXuVIQ0ZCCOPHEE9/U6yPOKIj0MAH8oyAQ1o4dOzr169dvhV4fcUZBpIcJ4B8FgbAoCETJBPCPgkBYFASiZAL4R0EgLAoCUTIB/KMgEJYURP/+/Zfr9RFnFER6mAD+URAIi4JAlEwA/ygIhOUKouOAAQPe0OsjziiI9DAB/KMgEBYFgSiZAP5REAhLCuKkk05aptdHnFEQ6WEC+EdBICwpCHeH+3e9PuKMgkgPE8A/CgJhSUGcfPLJf9PrI84OFcQCPRYkjwngHwWBsCgIRMkE8I+CQFgJfoqJgkgBE8A/CgJhURCIkgngHwWBsBL8KiYKIgVM");
    imageData.append("AP8oCITF+yAQJRPAPwoCYXGpDUTJBPCPgkBYFASiZAL4R0EgLCkInmJCVEwA/ygIhMU5CETJBPCPgkBYCX4VEwWRAiaAf0ksiPHjx7tFpyCyjYJAlEwA/ygIhEVBIEomgH8UBMLiJDWiZAL4R0EgLF7miiiZAP5REAhLCqJfv34r9PqIMwoiPUwA/ygIhEVBIEomgH8UBMKiIBAlE8A/CgJhcQ4CUTIB/KMgEBYFgSiZAP4lsSB4J3U0eB8EomQC+EdBICwKAlEyAfyjIBCWFMQXkvmRoxRECpgA/lEQCEsK4uSTT/6bXh9xRkGkhwngXxILgpPU0UhwQfCZ1ClgAvhHQSAsCgJRMgH8oyAQFgWBKJkA/lEQCCvBJ6kpiBQwAfxLYkFwkjoaFASiZAL4R0EgLAoCUTIB/KMgEBYFgSiZAP5REAgrwSepeR9ECpgA/lEQCGvnzp1Hf/GLX3xdr484oyDSwwTwj4JAWBxBIEomgH8UBMKiIBAlE8A/CgJhJfgkNQWRAiaAfxQEwqIgECUTwD8KAmFREIiSCeAfBYGw+MAgRMkE8I+CQFgUBKJkAvhHQSAsKYgBAwa8oddHnFEQ6WEC+EdBICwKAlEyAfyjIBAWBYEomQD+jRs37gG9U8UdBRENzkEgSiaAfxQEwpJrMSX0ndRczTUFTAD/KAiEJQVxyimnvKbXR5xREOlhAvhHQSAsCgJRMgH8oyAQFpf7RpRMAP8oCITFpTYQJRPAPwoCYfEqJkTJBPCPgkBYriA68T4IRMUE8I+CQFi8UQ5RMgH8oyAQFk8xIUomgH8UBMKiIBAlE8A/CgJh8SomRMkE8I+CQFgUBKJkAvhHQSAsCgJRMgH8oyAQFgWBKJkA/lEQCEsKIqFXc6UgUsAE8I+CQFgUBKJkAviX4II4T48FflEQiJIJ4B8FgbASXBBc7jsFTAD/ElwQPMWUZXyiHKJkAvhHQSAsPjAIUTIB/KMgEJYUxJe+9KX/1usj");
    imageData.append("ziiI9DAB/KMgENauXbuOOvXUU1/V6yPOOEmdHiaAfxQEwnIFceTAgQOX6vURZxREepgA3uV961vfelDvVHHHq5iiIQVxxhln/Fmvjzg7VBDP6rEgeUwA7ygIhLZ79+7CwYMH/5deH3FGQaSHCeAdBYHQ9uzZ02Ho0KEv6fURZxREepgA3iWyIMaPH09BRICCQJRMAO8SWRBXXnklBREBKYghQ4a8rNdHnFEQ6WECeJfIgrj00kt5FVMEEnyS+jk9FiSPCeBdIgviG9/4BgURgSS+k9otr1t0jiDSwATwL4nvg/ja177mFp2CyLbS0tIuffr0WaXXR5x9+ctfdovO+yDSwATwL4kFMWzYMLfoFES2ffjhh8d06tRpk14fcTZ48GC36MF8PRYkjwng32WXXTZT71Rxd8YZZ7hFpyCybdOmTb1at269U6+PODvrrLPcogfP6LEgeUwA/5JYECeccIJb9OCreizwa8OGDcc1bdr0gF4fcXbuuee6RQ+e0GNB8pgA/iWxINq2besWPRipxwK/1q5de3yDBg2q9PqIswsuuMAtevCQHguSxwTwTwoiLy+vRu9YcVdVVTVWjwV+rV69um/StpXLL7/cLXpwtx4LkscE8C+pBbFr166f6LHAr7fffruvXg9x94Mf/MAtenCNHguSxwTwzz3CmpHEgiguLn5SjwV+vfXWW4kriClTprhFD87UY0HymAD+ffvb356exIJYuHDhOj0W+LVs2bKT9HqIu7vuusstenCkHguSxwTw76qrrroviQVx++23V+ixwK85c+aM1Osh7h577DG36EGeHguSxwTwb9KkSbcl7ZUpYvTo0W7x2fGz6fzzz39ar4e4e+WVV+SyLGYsSB4TwL/f//734xs3blyud6y469Onj1v84Gg9HvjTokWLvXo9xN3mzZsP6HEgmUwA/15//fVBBQUFZXrHirv8/PygsrLyx3o88Eevg7hr1KhRUF1d/bYeB5LJBPBvx44d");
    imageData.append("hUm7fELGm2++uUaPB37s2rWrlZ7/uCsqKnKLHvxcjwXJZAL45x5hNTjiiCO2650rCX73u99V6fHAj4cffvgSPf9xd+hCfXI5VzMeJI8JkB1t27bdpneuJLjkkkukIDrp8aD+DRo06E96/uPu0ksvdYseFOqxIJlMgOxo3779Vr1zJUG7du1q3O0GPR7ULzfHecccc8x7ev7j7mc/+5lb/KClHg+SyQTIjt69exfrnSsJ5P0ba9aseUqPB/Vr+fLlJ3Xo0KFEz3/cTZ8+XY4wW+jxIJlMgOz47ne/e7/euZJixowZ/+3G0FWPCfVn0qRJt+bn51fruY+7JUuWlLjlL9DjQTKZANmxePHiYXrnSoozzjhD3lF9sR4T6kdVVVXj73znO7/T854Ee/bskU+Sa6LHhGQyAbKjtLS0UO9cSZGXlxfs3r17YsC7qr1YtWpV/y5dumzU8x53xx57rFv84DonX48JyWQCZId7lNhQ72BJMn369FcCnkrw4oUXXhiWxGt1jRkzxi1+wGeGpIgJkD1JvBPIKCoqqnRjaKPHhH/d6NGjH9XznQT33HOPPPU4So8HyWUCZE/Pnj1X650sSYqLi2/XY8K/Rl7emtQHDitXrlzuxtBbjwnJZQJkz8yZMy/TO1mSjBw5Uq7a2VqPC5/fvffe+z09z0kg12CqqKiQD5Ti/EOKmADZ8+qrr345qY8WhZysLikpmazHhc9n9+7drdu0abNDz3MSnHLKKfJg4VE9JiSbCZA97733Xv/CwsItemdLkquvvro44GmFenHrrbdOatiwYaWe4yRw20G1GwNPOaaMCZA9+/fvP2LkyJFz9M6WJPLBR+4o4j/02PDZbN26tfDMM898MalHlLNmzSp34/iiHheSzQTInpqamvxrrrnm13pnS5oJEybIyUk+SOhfMGPGjMuTWg7yOSHbtm3br8eE5DMBsusnP/nJbUm9Y6htw4YN/67HhnDKyspaJPXaXGLQoEFuGMFi");
    imageData.append("PS4knwmQXXPmzBnfrFmz/XqnS5oePXqUVVVV9dPjwz931VVX3afnM0nuuusuN4yglx4Xks8EyK7du3d36dq16wa90yXRL37xi5fcmJrqMeKT3XHHHT9M+hHkxo0b9+pxIR1MgOxL8tMLtckd3TvvvMPHTYb07rvv9jrhhBNW6nlMkgEDBrihBHfqsSEdTIDsu/baa2fqHS+pioqKdu7bt2+4HiP+t4qKiiYTJ068U89f0tx0003y8taz9fiQDiZA9pWWlnbXO16SjRkzZklNTc0Repz4/6ZNm3alvERYz13SuCPG99x4OPeUUiZANFq2bLlH73xJJU813XjjjY8HXO21TgsXLjyvXbt2pXrekqZ79+6BeyDwYMDnP6SWCRCNJ5544nK9AyaZPDp+4IEHprqxNdJjzWXLli07qU+fPqv0fCXRlClT5Iq+N+kxIj1MgGhs27atRxpe7lqbHEksWrToOwEXcPvYunXrioYOHfqSnqckkovzlZSU/MON60g9TqSHCRCN6urq5vIxk0l/yaMm41mwYMG3a2pqOugx55I33nhjwNlnn71Iz09SjR0rnwsUPKfHiXQxAaLz/PPPf6tFixZ79c6YBtdff/0fysvL++ox5wL5hLh+/fqt0HOSZH//+9/l6q3H67EiXUyA6Lg70HYnnXTSMr0zpoFcpfTUU09duW/fvs563Gn24osvntmtW7f1aToyPP30093Qgof1WJE+JkC0rr322kR+3GQYcifZtGnTA6+++qp8eLEZe9pccsklDzdu3Lg8TeUgnnzySTl6OFmPF+ljAkTLHUUc3qhRowq9U6aJHE3cfPPNvyorK+umx590coXepUuXDjzttNNeSVsxiC5dugRVVVUL3Vjb6bEjfUyA6LmjiERfvC0MufM8+eST/7Zo0aKxlZWVqXhTXXFx8XFTp06dcPjhh+/W402LX/3qV/K5D9fosSOdTIDouUfWHdJ8J1Nb8+bN940YMWLua6+9NlLP");
    imageData.append("Q1Ls27ev4Pbbb//RwIEDl+rxpUlhYWGwd+/eNW7Mx+o5QDqZALHQ4Oabb75B76BpJUcT8s5ieaXP66+/fmYd8xFL1dXV+T/96U//s2fPnqsLCgrK0viUUm3Tp093ww5u1fOA9DIB4mH58uUj0nT5jbDkTrZz587vr1mzptf+/fsPd3fCjfXcRKm8vLzprl27Ws2aNeviXCiFjP79+8u5h516PpBuJkA81NTUNB47duxTuXIHVBd5mm3ChAlTFy1adN7KlSvP2rFjRx83L1m/7o/7ve1ffvnlIfPmzfv66NGjH5WT7HpZ027JkiV85nQOMgHiY926dV/Nz8+v1jtrLpKXi8pJ7R/+8Id33HLLLZPnzp17VWlp6TF6zurD7t27W8v7F2699dZJkydPniKlkEtHC9r555/vpiV42mmh5wrpZgLEi7sznKp32Fwnd9RydCGFcc455zz3la98ZYE72nrotttu+/Gf/vSnMzdv3tx5//79zeUcgZ5PdwSSV1lZ2UhK4N133+05f/78r9544403SAmcd955C+XnDRo06E/du3dfm4tHCpor5sA9UNnl5m6UnkuknwkQL/IcfOvWrXfqHRcHSVkIOdKSowx5VZSUR6tWrXbJvH0S+bqc45Hvl/edyP/P/Cz9O3LZj370I7cZBoudhnrbRPqZAPGzfPny4fIUh955AZ+6desWuCMtOTHdXW+TyA0mQPy4o4jWF110UU6fsEZ2NWzYMHjttdf2u+3vCr09IneYAPG0cePGM+RpEb0jAz7cdtttcr2luwI+yyOnmQCxlTd37tzxekcG6tvw4cNr3O0Ft821r2M7RA4xAeJtyJAhK3iqCb7I5TRKSkr2BlytFY4JEG9lZWW9i4qK1usdG6gPixcvrnLb2fV6u0NuMgFiL+/NN98cw/kI1LdJkya5zSt4sI5tDjnKBEiEgqnupndw4PO68MILg+rqajnvcFQd2xtylAmQDDU1Nc1PO+201XpHBz6r");
    imageData.append("YcOGBeXl5f9w21UvvZ0ht5kAyVFRUdGxV69emzlpjc/r1FNPDcrKyqQceDMcDBMgWXbs2HFeUVHRFr3jA/9M3759g127dr3ttqMT9HYFCBMgcfJKSkpGFRQUVOk7AOCTdO/eXV7O+r7bfv5NtqE6tivgMBMgkfK2b98+uEWLFh/pOwJAO+qoo4K1a9e6zSY4TbadOrYn4GMmQHJ98MEHo5o1a1bOOQl8kuOPP75m3bp1chmNPnr7ATQTINmKi4t/WFhYuE3fMQDDhw+Xq7N+6LaTkXq7AepiAiTfhx9+ePmgQYOW6zsI5K6rrrpKPlN6WcAH/+AzMAHS4cCBAwPHjh27VN9RILfk5eUFd955Z1BTUzPLbRcD9HYCfBoTIDXy3J3CUe6R43v6TgO5oaCgIJg/f76cb3jCaVPHNgJ8KhMgfWbPnv2EfLSmvgNBevXr1y9YtWqVfJb0w3p7AMIyAVKp2erVqyd27Nhxh74jQbrIJ8FNmTKlqqKiYoVb71+tY1sAQjMBUqtBWVnZ2Ouuu26JvlNBOshRw4oVK8rduv5pwPkG1AMTIPW6r1q16sc9evTYqe9gkExy1HDjjTcGlZWVS9z6PdtpWMd6Bz4zEyAnyAnspu5O5XV9Z4Nk6d+/vxw1uFUaLHSa1LGugc/NBMgtJSUlIwYNGrQ2Pz+/Wt/5IL66desWPPLII/uqqqpWuvX4Rb1egfpgAuSe6urqUxYvXvzbrl27luk7IsTL0UcfHdx33301FRUVr7p193+dDnp9AvXFBMhZ+ZWVld9YsGDB7E6dOlXoOyZEq3379sGvf/3rmgMHDrzj1tVEp28d6xCoVyZAzmtTU1PTwx1RTHePVrnoX8Rat24d3HLLLcHevXs/cutmhNMp4CQ0ssQEQIYriqKnnnrqld69e+/lCrHZdfrpp9f84Q9/KN+3b1+JWxeTncZ6/QC+mQDQXFEMW7Zs2aIJEyZ80Lx5c3NnhvrRtm3b4JprrglWr14t");
    imageData.append("HwH6gvMTp4FeH0C2mAD4BPISyhHl5eU/e/nll58+99xzOaqoJ0OHDg0ef/zxCnd7Ljh4tHCh07yOdQBklQmAEI5yBu3bt2/UtGnT3u7Vq5e508Mna9So0celcMcdd8gnu8m5hWnOmU7XOuYaiIwJgM9APq5SHul2LykpeXrGjBnVF110UdCuXTtzp5jrOnfuHFx55ZXB3Llzgz179sgVVl8PDr5/oWXA+QXElAmAf9ERNTU1E999992/zZw5838uvvjifxQUFOTcm/CaNm0aDBkypObuu+/e6eZitZuTt93cPBUcvEYSnwONRDABUI/kkfGZlZWVv3V3kg8sXLhw/g033PDO0KFD97Vs2TI15y/atGnz8VNG1113XYU7Qli/cePG+dXV1Q8EB586usJpW8fcALFnAsCTfKfQOcO52D2ivmLXrl0//stf/rLk5z//+f5Ro0bV9OzZM2jWrJm5A44LeepMrpj69a9/PXBFVzNv3ryKzZs3F7ux/NyN6UpnnHPWoXHKePUcAIliAiCLGjlHO32Cg+8MPtm58MCBA//pHoU/99e//nX9rFmz9t1222013//+94MLL7wwGDhwYFBUVBQceeSRQatWrYImTZqYO/Iw5Aqo7igm6NChQ9ClS5dATrTLz3ZFFUycOPHjE8iPPfZY8Oc//7l6/fr1O8rLy+XSFrc6I50vHFre450ip5kaF5AKJgBiTN4TIO8kvtR51FnubKyuri756KOPdrgjkj1btmzZ68pl7+rVq8tWrFhRtnLlyrI1a9aUbdq0qay0tHRvWVnZnsrKSvmktVJns7PWKQ4OnjR+0vl355hDv0v/fiCnmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECY");
    imageData.append("AAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECBIctWrTo7IceemisePjhhy+ZPXv2N59++unz58yZM1LMnTt3xDPPPPN/RObvf/zjH7+2YMGCr8yfP/+r8vd58+Z9PfM9Qv6t1f4ZmZ9dm/zO2j7p98vXnnrqqQtE7e+Tvz/xxBOjZPnF448//g3592OPPXaReOmll4a68ebr8WdDdXV1/tKlSwc+8sgjY4Qs18KFC88TmfnLzGlmXjPjzYxfz6dWe/4/j3/2c2T5ZLmELNOTTz55ocjM+6xZsy4WixcvPsuNubGeg2yoPc+yLLKNyHy+8MILw2S55M/nn39++HPPPXfOs88+e658rfb2W3tby/y79vaa+XftLLO9ZrbJT1N7e838X8llHjPbrmyrmW04M6cvvvjimW58DfV4Ub9MkOuKi4t7H3300Zvz8vJqRH5+fnWTJk0+atmy5Z7DDz98t2jVqtWuNm3a7GjduvVO+bv8ecQRR2xv37791nbt2pW2bdt2W+br8uenyfyMzM+uTX5nbbV/v/y/zP+Vr7Vo0WKvqP198vfmzZvva9q06QHRrFmz/fJvGU/jxo3Lu3Xrtt6NeZyeg2xYsmTJv5144olvyvwKWa4OHTqUFBYWbsnMX2ZOM/MqWWbsma8LPad6fj+PT/oZtXP53bJcQparoKCgTMh6kPE0bNiwUnTu3Pl9N+ZJeg6yYefOna179+5d3KBBgyohyybz2bFjxw86deq0Sf6U7f2oo476h8y93n5rb2uZf3+S2ttdZnusS2aO9PYqan+PbK+ZbVX+FJk57dKly0Y3vhv0eFG/TJDr7rzzzomHuWnJBVKAbsyP6TnIhltuueUnsqPrZUord9ut5yAb1q1bVyTrWS9PGrjbPj1e1C8T5LqZM2depjfENHO3x/UcZMPkyZOnyJGDXp60cjcpYzMPvm3YsKFrigsikjnNJSbIda+99topekNMsyCigrjp");
    imageData.append("ppt+Jk956OVJK3fbq+cgG7Zu3do+xQVRrceL+mWCXPf+++931htimgURFYQ8lSfPKevlSSt3+7ueg2zYvn37ESkuiDI9XtQvE+S6LVu2FOoNMc2CiArigQceGCcnKPXypJW7PajnIBtSXhCb9HhRv0yQ6zZv3ny03hDTLIioIOSljPJKGb08aeVu9+g5yIaUF8QGPV7ULxPkuvXr13fTG2KaBREVhLzWXl5OqZcnrdztd3oOsiHlBfGBHi/qlwlyHQWRHfKGLHnNvV6etHK3P+g5yIaUF4S8v8SMGfXHBLmOk9TZIe+YzrGCmK3nIBtSXhDr9XhRv0yQ6z744IOOekNMsyCigsjBI4hn9BxkQ8oL4l09XtQvE+S6TZs2ddIbYpoFFERWuNtCPQfZkPKCKNbjRf0yQa7buHFjF70hpllAQWSFu72g5yAbUl4Qq/R4Ub9MkOvk2jV6Q0yzgILICnf7s56DbCgtLW1HQeDzMkGuW7NmTQ+9IaZZEFFB5ODLXJfpOciGlBfEaj1e1C8T5Dq5uJneENMsiKgg5LMF5HLZennSyt1W6DnIhpQXxFo9XtQvE+Q62aH0hphmQUQFIR8wk2MF8Yqeg2xI+TmIdXq8qF8myHXyASt6Q0yzIKKCkE8Fkw+Z0cuTVu72op6DbEh5QazX40X9MkGu41pM2XHPPfdcLZ9yp5cnrdztJT0H2bBt27a2KS4ILrXhmQly3auvvnqq3hDTLIioIG6++ebrc+zzIF7Tc5ANcumYFBfEVj1e1C8T5Dr5gHS9IaZZEFFByCfKpfWOqy5BRK9ikgc8aZ1nd9uix4v6ZYJct3Tp0oGZHUr+TDs35of0HGTD1KlTJ8hTTHp50iqI6HLfq1at6pM5UtPLlGSHCmKeHi/qlwkQNHQeDg4+4vurM8uZ5tzn3P8vkJ9R2z/7el3kktGfhf7/8ntkHA86zwYHL/8wIrBzkA2dndudJ4KD8/374H/PQ2ZZ9TyFpcddl0/6");
    imageData.append("etj51vNbO5/uPOI8HRws4aLAzkE2NA8OLs/i4OD6lmWRZaw9VvlT5ro2PSefh56ffzandX2vbBci82+ZUxnLHKdvYMeLemQCfKylM8Dpc+jv+bW+llfH90vmk/z+z6JBrb/X/jmZ5W3qdDpEjyWbZDnbOAWH/p4Za+1lFXo+6hpTmO8NS89nZk5rz6ueX503clo47ZxmgV3ObJL1XRQcXN9SGDIOyWuPWf8fTc/RZ6Hn5tPmtfb/kVwesGW+Ln/KnBY57QO7jKhnJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAEP8Pc9bHvSS5LW4AAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image0730412c705b2be3361f77ab7256bf0c = new WeakReference<>(result);
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
BufferedImage image0730412c705b2be3361f77ab7256bf0c=getImage0730412c705b2be3361f77ab7256bf0c();
if (image0730412c705b2be3361f77ab7256bf0c != null) {
    g.drawImage(image0730412c705b2be3361f77ab7256bf0c, 0, 0, null);
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
		return 392.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 420.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private dashed_underline4() {
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
       dashed_underline4 base = new dashed_underline4();
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
       dashed_underline4 base = new dashed_underline4();
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
        return dashed_underline4::new;
    }
}

