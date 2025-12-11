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
public class dotted_underline4 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image135ed657d28422ddf59ae2a4fc1b8fab;
private static BufferedImage getImage135ed657d28422ddf59ae2a4fc1b8fab() {
    BufferedImage result = (image135ed657d28422ddf59ae2a4fc1b8fab != null)
        ? image135ed657d28422ddf59ae2a4fc1b8fab.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(14132);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAYgAAAGTCAYAAAAyUoV+AAApLklEQVR4Xu3dCbwU1bXv8YAgyKAgCOLApF4QjQLGOSohSkx8V40jz1zNcI1Jrno1mhszXRHjDEajxEQjAecpxjHvKohoUARFxAMqkUEGReZ5OBw4p95eOc17fNY6xqpdp+ldVb/+fL6ffPL3sLtW76peXUNXfyGKoi8AAKCZAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJkB5bdq0qc2nn37abebMmQdPmzat39tvv92/IVOmTDnsrbfe+tKkSZOOfOONN46S/33zzTcPl1z/7dSpU/tXVVX1f//99/vPnTu379KlS3tXV1d3rKur20k/P7Kjtra22YoVK/aaNWvWQW5++8k867nfZtu6MnHixKNff/31Y8TkyZOPaGh9cetd/xkzZvSfPXv2oYsXL+61bt26vbdu3draPWcTvQwoNhOgcW3cuLHV888/f8qwYcN+csMNN/z8Bz/4wR++9KUvvdWuXbtVzZs3r2natGmtaNKkSd32vuCmpiH677bZNk6LFi2q995774/POOOMJ6+55poht91220/dm8U3XcNop5cNYdm8eXPLCRMmHHf77bdfdtNNN131y1/+8rqBAweO69ix4zJZV3baaaetDa0veh3RGlpXZKxWrVpt6Nq16/zjjz/+1R/96Ed3XXfddb+87777rnQfMo51y9NULx+KxwRIz33ya/rCCy98");
    imageData.append("7bTTTnv6uOOO+1uXLl0WyUapN9wdQd4QOnXqtOToo4+eeMopp7w4f/78fnp5UVnLly/vcM455zwmb9Q9evSYK80gzht/OUjj6Nmz55wTTzxx7CuvvHJGxF5FoZkA6axfv7717rvvvkJveKGQN57LLrvsUdfEdtPLjh3L7THsfPrppz+l5ygkrVu33rx27dr99bKjGEwAP3V1dU1eeumlr3bo0GG53shCdPbZZ7/nlru3rgM7hvsg0fbMM8/8s56XELk90NXr1q272C13M10H8s0E8DNnzpyeRxxxxGS9cYXstddem+yWnRPZFXDbbbddrucjZDfeeON8t9yddB3INxPAz/jx4wdU6jyDr+uuu67GLfsAXQvKTy5S0PMRspNPPtktdvR1XQfyzQTw88QTT5ylN6rQXXLJJbVu2YfpWlB+ei5Cd9hhh7nFjiboOpBvJoCfe+655/t6owqdaxB1btn/pGtBecn5Kj0XoSs1iGW6FuSbCeDn3nvv/Xe9UYWu1CDu17WgvFyDaKrnInSlBrFK14J8MwH8PPbYY+fojSp0pQbxgK4F5afnInSlBvGJrgP5ZgL4+etf//oNvVGFjgZROXouQldqEFW6DuSbCeBn7NixJ+qNKnQ0iMrRcxG6UoN4XdeBfDMB/IwbN26g3qhCV2oQD+paUH56LkJXahB/03Ug30wAPy+//PJX9EYVOvYgKkfPRehoEMVkAvjJcIPgKqYK0HMRulKDeFXXgXwzAfzQIJCEnovQlRrEeF0H8s0E8EODQBJ6LkJHgygmE8BPhhsE5yAqQM9F6GgQxWQC+KFBIAk9F6GjQRSTCeCHBoEk9FyEjpPUxWQC+Mnw9yBoEBWg5yJ0XOZaTCaAHxoEktBzEbpSg3hN14F8MwH8ZLhBcBVTBei5CF2pQbyh60C+mQB+Mtwg7tO1oPz0XISu1CDkJ2pNLcgvE8APDQJJ6LkIXalBvKnrQL6ZAH5oEEhCz0XoSg1iiq4D+WYC");
    imageData.append("+Mlwgxita0H56bkIHQ2imEwAPy+99NJX9UYVulKDGKVrQfnpuQhdqUG8retAvpkAfmgQSELPRejYgygmE8APDQJJ6LkIHSepi8kE8JPhnxwdpWtB+em5CF2pQUzSdSDfTAA/NAgkoecidHxRrphMAD80CCSh5yJ0pQYxUdeBfDMB/NAgkISei9CVGsTrug7kmwnghwaBJPRchI49iGIyAfzQIJCEnovQcQ6imEwAPzQIJKHnInTcrK+YTAA/NAgkoecidDSIYjIB/NAgkISei9DxPYhiMgH8jBkz5iS9UYWu1CD+pGtB+em5CB3nIIrJBPBDg0ASei5Cx1VMxWQC+Mlwgxipa0H56bkIHd+DKCYTwE+Gz0HQICpAz0XoSg3iNV0H8s0E8EODQBJ6LkJHgygmE8APDQJJ6LkIHQ2imEwAPzQIJKHnInScpC4mE8BPhn8wiKuYKkDPRei4zLWYTAA/GW4Qo3QtKD89F6ErNYi3dB3INxPAT4YPMY3StaD89FyErtQg3tZ1IN9MAD80CCSh5yJ0pQbxjq4D+WYC+KFBIAk9F6ErNYhpug7kmwnghwaBJPRchK7UIN7VdSDfTAA/NAgkoecidKUGMV3XgXwzAfzQIJCEnovQlRpEla4D+WYC+MnwZa6jdS0oPz0XoeMQUzGZAH5oEEhCz0XoOEldTCaAHxoEktBzEToucy0mE8BPhhvEKF0Lyk/PRehoEMVkAvjJcIMYrWtB+em5CB0NophMAD80CCSh5yJ0NIhiMgH80CCQhJ6L0JUaxFRdB/LNBPCT4QZxn64F5afnInQ0iGIyAfzQIJCEnovQ0SCKyQTwk+EGMVrXgvLTcxE6vgdRTCaAHxoEktBzEToaRDGZAH4y3CBG6VpQfnouQkeDKCYTwA8NAknouQgdDaKYTAA/NAgkoecidDSIYjIB/NAgkISei9DRIIrJBPDD70EgCT0XoaNBFJMJ4IcGgST0XISOBlFMJoAfGgSS0HMR");
    imageData.append("OhpEMZkAfmgQSELPRehoEMVkAvihQSAJPRehKzUIfnK0YEwAPzQIJKHnInQ0iGIyAfzQIJCEnovQ0SCKyQTwQ4NAEnouQsc5iGIyAfxkuEGM1rWg/PRchI4GUUwmgJ8Mf5N6tK4F5afnInQcYiomE8APDQJJ6LkIHQ2imEwAPxxiQhJ6LkJXahBVug7kmwnghwaBJPRchK7UIGboOpBvJoCfDDcIfpO6AvRchI4GUUwmgB8aBJLQcxG6UoN4T9eBfDMB/NAgkISei9CVGsT7ug7kmwngJ8MNYrSuBeWn5yJ0NIhiMgH80CCQhJ6L0JUaxAe6DuSbCeCHBoEk9FyEjgZRTCaAnww3CM5BVICei9DRIIrJBPBDg0ASei5CR4MoJhPADw0CSei5CB0NophMAD80CCSh5yJ0pQYxU9eBfDMB/NAgkISei9CVGsTfdR3INxPADw0CSei5CB17EMVkAvihQSAJPReh4xxEMZkAfmgQSELPRei4F1MxmQB+aBBIQs9F6GgQxWQC+BkzZsxJeqMKHQ2icvRchI4GUUwmgB8aBJLQcxE6btZXTCaAHw4xIQk9F6HjJHUxmQB+aBBIQs9F6GgQxWQC+KFBIAk9F6GjQRSTCeCHBoEk9FyEjnMQxWQC+KFBIAk9F6HjKqZiMgH8cBUTktBzEToaRDGZAH5oEEhCz0XoOMRUTCaAHw4xIQk9F6GjQRSTCeAnww3ifl0Lyk/PReg4xFRMJoAfGgSS0HMROhpEMZkAfmgQSELPRehoEMVkAvihQSAJPReh4xxEMZkAfmgQSELPRej4JnUxmQB+MtwguIqpAvRchI4GUUwmgB++B4Ek9FyEjkNMxWQC+Mlwg+AQUwXouQgdJ6mLyQTw8+KLLw7SG1XoaBCVo+cidKUGMUPXgXwzAfzQIJCEnovQ0SCKyQTwQ4NAEnouQschpmIyAfxwDgJJ6LkIHSepi8kE8EODQBJ6LkJHgygmE8BPhg8xcZlrBei5");
    imageData.append("CB3fgygmE8APDQJJ6LkIXalB/F3XgXwzAfxk+BATDaIC9FyErtQgPtR1IN9MAD/cagNJ6LkIHXsQxWQC+KFBIAk9F6HjHEQxmQB+aBBIQs9F6GgQxWQC+KFBIAk9F6HjEFMxmQB+MtwgRutaUH56LkJXahCzdR3INxPADw0CSei5CF2pQczRdSDfTAA/NAgkoecidKUGMVfXgXwzAfzQIJCEnovQ0SCKyQTwk+EGMUrXgvLTcxE6GkQxmQB+aBBIQs9F6DgHUUwmgJ8M32pjlK4F5afnInTsQRSTCeCHBoEk9FyEjgZRTCaAHxoEktBzEToaRDGZAH4yfLvvUboWlJ+ei9DRIIrJBPCT4T2IP+laUH56LkJXahAf6TqQbyaAnww3iJG6FpSfnovQ0SCKyQTwk8XLXC+++GL2ICpEz0XoOMRUTCaAnyw2iIsuuohzEBWi5yJ0fA+imEwAP1lsEBdccIE0iPt1LSg/PRehKzWIWboO5JsJ4CeLDeKcc86RBvGgrgXlp+cidEcccYRb7Oh9XQfyzQTwk8UGceqpp0qDeFjXgvLTcxG6Y4891i12NE3XgXwzAfxksUEMGjRIGsQjuhaUn56L0A0YMMAtdvSmrgP5ZgL4eemll76qN6rQHX/88dIgHtW1oPz0XITuxBNPdIsdvarrQL6ZAH7GjRs3UG9UoTvkkEOkQTyma0H56bkI3de//nW32NGzug7kmwng5+WXX/6K3qhC16FDB7foNIgdrba2tqmei9CdeeaZbtGjEboW5JsJ4CeLDULU1NTQIHaw6urqlnoeQve9733PLXr0Q10L8s0E8JPVBrF06VIaxA62bNmyjnoeQnfFFVe4RY9O0LUg30wAP1ltEB988METbvmb6npQPlVVVV/U8xC6oUOHukWPDtC1IN9MAD9ZbRDjx4+XK1O66HpQPiNHjvyenofQ3X777W7Ro310Lcg3E8BPVhvEHXfcscQtv1zDaGpCeZx//vn363kI");
    imageData.append("3SOPPCJXvNEgCsYE8OM+iQ9o0qRJnd6wQnfeeefVuuX/37oelM+RRx45Sc9D6CZOnEiDKCATwM+ECRMGNG3atFZvWKHr06ePW/zo33Q9KJ/DDjtsip6H0H3yySc1btn31rUg30wAP2+99dbxzZs3r9EbVuhcU5NLXa+JOFG9Q2zdurVZ375939HzEDK3Xke1tbVVbvk76nqQbyaAnw8++ODI9u3br9QbVxbMmDHjXVfDLromNL45c+b03H///WfpOQhZjx493KJHw52ddT3INxPAz6JFi3odfPDB0/XGlQX33HPPVldDG10TGt/o0aO/3bZt27V6DkJWulHfxboW5J8J4Gfjxo3tzjrrrCf0xpUF5513nishkvtumLrQuK699tr/ztrFDBdccIFb9Og/dC3IPxPAT11dXdNLLrnkTr1xZYHck8ktP58Qy0zOP/z0pz+9Wb/+obv66qvlCiYaRAGZAP4uv/zy2/TGlRXvvPPOIl0PGteCBQu69u/f/2392odu5MiRW9zyX6jrQf6ZAP6uuOKKW7N2+GCba6+9NtL1oHFNnTq1XxbXj/Hjx69yyy+3czU1Id9MAH933nnnpS1bttykN7AsOProo10J0Sm6JjSep59++jT9umfB6tWrZ7jlly/MmJqQbyaAv/fff//Qzp07L9YbWBa4T7bRkiVLntc1ofFk8QtyBxwg9+eLxjktdD3IPxPA35YtW3bu0aPHXL2RZcVdd90lX4baT9eF9Gpqappn8fDSt771Lbf40Qu6HhSDCZDOfvvtN1tvZFnRtWvXOve4TNeE9LJ6CfRvf/tbt/jRMF0PisEESKd3794f6I0sS959991Rro7Wui74W7JkSacuXbos0q91FkyaNMmVEO2la0IxmADpnH322Y/rjSxLBg8evN7V0U3XBX/Dhw+/skWLFtX6tQ6d3INp06ZNka4HxWECpDNx4sQv6w0tS+Rk9bJly67UdcHP5s2bW3z3u9/9UxbPPxx+");
    imageData.append("+OGuhEhuw2LqQjGYAOnIN6r1hpY1Z555prwpcGO2RvDKK6+c0KpVqw36Nc6Ciy+WL9dHk3VNKA4TIL3WrVuv1xtb1ixZsuTHui4k97Of/exG/dpmxQMPPOBKiI7XNaE4TID0vv/979+jN7asufDCC2dFnItIZdOmTS3btGmzTr+2WSC/E7Js2TK5B1NLXReKwwRIb9KkSUfpDS5r5Jj5zJkzf61rQ3wdOnRYrl/XrDjhhBNcCdGLTjNdF4rDBEhv7ty5B2Xx50e1Xr16rdmyZctxuj58vj/+8Y8XNmvWbIt+TbPi9ttvd2VE8i05UxuKwwRIb82aNV379Onznt7osujWW2/9H10f/rl33nmn74EHHvh+Fq9c2mbevHlyfeupujYUiwmQXl1dXbMsn5zcnrzJVVVV3atrRMOqq6tbfOMb3/hrlptDv379XCnRG4781qipEcVhAjSOu++++yc77bTTVr3xZVH37t1Xb9y4katZYnj00UfP1a9f1gwdOlROTsslTKY+FIsJ0DgWL17c+4ADDvhQb3xZNXjw4Ndqa2t76jrx/40dO/ZE/bpl0fTp0+V7MNfo+lA8JkDjOeaYY17XG19WySGTn/zkJ2N0jaj3+uuvH+P2tD7Sr1vW9OzZU35+Vm63sreuEcVjAjSeJ5988gK9AWaZNIkrr7zyfV1n0a1evXq3U0899Zk8XLk2ZMgQV1L0sa4RxWQCNK7mzZvX6I0wy6RJXHvttc+52nbVtRbRunXr2mT5t8i3Jzfn+/TTT+X8w7/oOlFMJkDjyvrdXRsin5RvuOGG0VHBf2Vs4cKF+1x22WW369cnq84//3xX1j+uXjK1ophMgMY1b968PnpDzANpEpdeeunzdXV1zXXNRTB//vyucjlrFm/j/VmmTJkiew9n6lpRXCZA46qpqWnXr1+/qXpjzAM53HTMMcdMW7NmTS9dd565pthEbsiY5e86aF/+8pddadEEp6uuF8VlAjS+p59++oKd");
    imageData.append("d955s94o80LeLCdPnnyue+PM9S/RrV27dtcnn3zyjN122221fg2y7s9//rNc2nqdrhnFZgI0PvcJe/+87kVsI5+mf/WrX/1u6dKlubx3kxxS+s53vjMqq7/t8M907do12rJlyxJX52G6bhSbCVAel19++R/1hpk3cl6iW7du8x5//PH/1PVn2XXXXffLgw8+eHqeDilt75ZbbnFlRlN03YAJUB7V1dVt8/oG0xC51fWCBQsOqqury+Qv023dunWnZcuWdTz99NOfyvO8de7cOXJ7uLWu5g76NQBMgPIZNGjQOL2B5pnsUZx22mlPjx8//purVq36onsNmujXJDTr169v/eKLLw76xS9+cX2eG8M2994r92GMHtWvAyBMgPJZuXLlPnn4tq2PQw455N2rrrpqxPz58/vq1yUEixcv7jxkyJBrzjvvvId23XXXNXr586hv376R21OSb8Z3068HIEyA8rrxxhuv0RtqUUhz7NKly6IvfvGLVffdd9+/uzeniv9a2cyZM3sdddRRb8i5kzxfadYQt2cn33sY6jTVrwsgTIDy+uSTT7685557fqo31iKSQzjSLP7yl798c86cOfstWrSo++rVq/favHnzrnV1dY31ptVky5YtLVatWtVBrkSaO3dujzfffPPwU0455fks/+JbWmeccYZ7aaKpTscGXjPgH0yA8rvjjjuuLfKb02eRPYyuXbvOHzx48CPDhw+/8u67775Ifrrzscce+5b7tHvy9OnTv7RgwYL9ly9f3mXt2rXtN2zYsKv733YrVqzo5Bpv1w8//PDACRMmHO/+/hz5d/LvR4wYcfHPf/7zG44//vhX5dBREc4rfB63pxTNnj3brYrRpXrdBLZnApTfpk2b9snjl63KQZrGLrvsslH2uuRnPI888shJAwYMGD9o0KAXTz755P/52te+9sLAgQPHHXvssa/179//7R49esyVRlDUcz1x/Nd//ZdbDaNXowxcNIDKMgF2jGef");
    imageData.append("ffYyveEC5da9e/do9erVcu6hm14nAc0E2HF69+49R2/AQLk0a9Ysmjx58ia37l3m7KTXR0AzAXacmTNnnpanu4EibDfddJNb7SL5LY+99LoINMQE2KHa/vrXv36QE6cot5NOOimqra3d7NY5flccsZkAO5bbaDsdccQRs/QGDTQWuZ3G4sWL5W6tbfT6B/wzJsCOt2LFigFuI16iN2ygMYwdO1aag3whzqx7wD9jAlTGlClT/r1ly5ab9MYNpPGzn/3MrV7R6053vc4Bn8cEqJjmf/jDH27mfAQay1lnnSX3Wlrj1q0+DaxvwOcyASpHbo197rnnvqA3dCApOSldXV0tzaGfXs+AuEyAytq0adOBffv25aQ1vB111FHR+vXrl7r16d/0+gUkYQJU3urVqwccdNBBc/WGD3yegw8+OFq5cuUGtx79t5Pr3whH+ZkAQWiyfPnyr/fs2fNj/QYAfBa3vkSLFi1yq0/0e6dFA+sVkIgJEI6FCxd+b/fdd1+r3wgArUuXLtHcuXPlNhoj9XoE+DIBwuI2+h927tx5mX5DALbp06dPNG/evLVuffmts6tehwBfJkB4Pvroo3/r3r37Qv3GAAwaNEjuzupWk+gSp71ed4A0TIAwrVy58qRu3bpxuAn/zw9/+MNoy5YtcuvuXnp9ARqDCRCumpqaA88555y3+TJdsbn5j2677bY695CfhTtRrydAYzEBwlZbW9tt6NChL/CLacXUunXr6Lnn5I7d0bPOCXr9ABqTCZAJnR9++OGn9JsH8u3QQw+Nqqqq5JCSfMdhjwbWC6BRmQDZMWvWrIs7deq0nkNO+Sa/BHfNNddEmzdvlrPR1+j1ACgXEyBTmmzcuPFfL7zwwg/1mwryQfYapk2btsXN9YvOgAbWAaBsTIBMOvrdd9+9zu1NsCeRE9v2Gmpqaha7+f3PiENKqAATILN23rx5879eccUV8/WbDbKlb9++stfgpjT6yOns7NTAfANlZwJk");
    imageData.append("XuvJ7tG/f//l+o0HYevevXs0evRo+W7DPDePP4poDKgwEyAftm7deurjjz8+Zq+99qrRb0QIi5uj6Pe//31dTU3NEjd3I5zeej6BSjABcmUf1yi+/sADD0yVH67Xb0yorD322CP6zW9+E23cuLHWzdW9znFO0wbmEagIEyCXmrlGcfrdd9+9VO76qd+osGO1a9cuuv7666N169bJdxpkj2HniMaAAJkA+eYaxTlPPPHE5N69e6/Tb1wor2OPPTYaNWpU3YYNGz52c/G801/PDxASE6AQ2tfV1V343nvvjfz2t79d06pVK/NmhsbRoUOH6Mc//nHkXmv3skdVzlDnaw3MCRAcE6BQ5LcDDt+8efMlDz300OoBAwaYNzj4GThwYPTII49E1dXV8iM+tzpHO/tHHEpChpgAhdZp6dKljw8bNmx1nz59tnILj/iaN28effWrX60bPnx43Zw5cza613K58x8NvMZAZpgAcFo6v128ePHzbs/i08GDB0cdO3Y0b4pFt++++0YXXXRR9NRTT9WtW7duoXvN5DarDzlfcZo08LoCmWICYDutnG84F9XV1V06f/78+0aMGLHy5JNPjnbZZRfzhpl3LVu2jOQw3C233BJNnz691r0mM9xr83Pn+1H97zLs0sBrCGSWCYDPIJ+I2zhdnf1qa2sHT5kyZe5dd931j182O+aYY6I2bdqYN9Wsat++/T/OI1x55ZXRgw8+GM2YMUO+4Sw3zXvL+abTw9nTadbAawXkggmAhOR2EHIC9lnXND5cuHDhrDFjxswbNmzY8nPPPbemV69edSHvbcihM7lj6qmnnhoNGTKk7plnntnsaljs9g7muJo+dF5zLozqD7vp2oFcMwGQklyl0yGqv5Tz187v3JvtXRs2bPjjggULnnrjjTeqHn744bU333xz7WWXXVZ31lln/WPvo0ePHtGee+4Z7bbbblGLFi3MG3kccgfUtm3bRp06dYq6du0aueb0j7HPPvvs");
    imageData.append("6PLLL4+GDx8ePfroo1vcMiz7+OOP36qpqXnSLd9I5/fOXbKsUf2P8RwR1X95TdcGFIoJgDKRPQ1pHIdG9c3j9Kj+UI04y/mO8ytntPOS2xuZUl1dPWPNmjWzli5dOs81l49nzZq1uKqqatn06dNXzJ49e9knn3zy6YoVK+a65jNt69atr7h/93RU/4Y/PKo/NyBXEV3gnL3dc53mDHQOdNo7zSO7rAAiGgTCIec4pInIG3aLqP6Er5AT5du0boDk8ndyCEj+nfx7OS8gezJcSQSkYAIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYYI8W7ZsWcdNmza11Hm5rVu3rk11dXULnTekrq6uic58bNmypdmKFSt2j1NvbW1tU/nbDRs2tNL/Lamky79169adkv6bhsg469evb63zHWHVqlXtNm/evLPOG9IYtW6T5LWTv9WZD3mNly5duoesM/q/NUSeN+7fIjwmyKMFCxbs27Fjx2VfcOWKJk2a1G2voWxb7h6/0+PFNW/evG4tWrSo/qzn/SzNmjXb4v791U6sjV9bs2bNrrvsssvGhp53W6bzbUrP6/VmMnfu3B577LHH0obG/qznlf9fqvf7ery4pkyZctgBBxzwoR5bP+/2/3275x2ox4tL1qttz6ufu6Hn3D53j1F6vLimTZt2aNOmTWsbGn/bczSUlZ73Rj1eXC+//PJXtq/rs2rUSq/zf0ee6zMqxwR5NHz48Ct33nnnzXqljsM93nV20WPGceutt16hx4vLPf7qdNBjxlFVVfVFPV5c7vGms4ceM44PPvigtx4vLvdYpseL64knnjhr+zfM");
    imageData.append("JNxjkR4vrhEjRly8fSNOwj0WOs30mHFcddVVN+nx4nKPsY7XnuLVV189VI8Xl3s87Oyqx0TYTJBHQ4cOvbp58+Y1eqWNwz2qHK9DF6NHj/62Hi8u93jV2VePGYcc8tDjxeUec5299JhxzJw5s5ceLy73kL0XM2YcKRuE9/PefPPNP02xXkmDaK7HjGPYsGE/0ePF5R4vO7vpMeOYNGnSkXq8uNzjSWd3PSbCZoI8kk962x/qScI93tbjxTVjxoyD9HhxRfUbVBs9ZlzbH1ZIIqp/A/HakP/+97//S4rnrdXjxfX000+flmJ+t+rx4kq5B7FAjxfXxIkTj9bjxRXV75l6HUKU8wkp5neEE+s8DcJhgjy6//77z2/VqtUGvdLGEaVoELNmzdpfjxeXe9wfeW7IIsWGPDLyPASRskEs0ePF9dxzz/2v1q1br9djxuEea/R4cY0cOfJ7bdq0WafHjCNK0SBS7qk9p8dLIsX83uxwsjpjTJBHTz755Bkp3kC8G8T06dMP1uPFFaU4iSlSbMjDI89PeikbxGt6vLief/75U1K8UX+ix4vroYceOm+33XZbrceMwz3m6/HiSnmup1IN4gY9FsJngjx64YUXvta2bdu1eqWNI0rRIN54442j9HhxRZVrELdElWkQz+jx4kq5ByHnAsyYcfzlL3/55u67775CjxlHlKJByFVMery4IhoEEjBBHv3tb387LsUnPe8G8eqrrx6vx4vLPUZHKS4L1OPF5R63O7G+s6GlPPQh5z7MmHGkbBDeh7bGjBlzUqdOnZboMeOIUjSIyZMnH6HHiytK2SD0eHG5x01RivUZlWGCPJLr5Nu1a7dKr7RxRCkahDQmPV5cUf05CO9jtnq8uNzjrsjzst6UDUKuFjNjxpGyQazU48Ule4h77bXXJ3rMOKIUDSLl1USVahCyZ+q9PqMyTJBH7733Xp/27duv1CttHFGKBpFyQ34gSnGSWo8XV5SiQaQ8xCSX15ox");
    imageData.append("40jZIFbr8eKSQz377rvvAj1mHFGKk9Rvvvnm4Xq8uCIaBBIwQR7NmTOnZ4cOHZbrlTaOKEWDmDp1aj89Xlzu8WDk+UUqoceLK6pcg/D+RP3ss8/+a4rLTb33IORkcbdu3ebpMeOIUjSId955p68eLy73eF6Pl4QeL66Iq5gyyQR5tHDhwn22v9VGElGKBpHyKqaHIs8vUgk9XlxR/fXqn3v/poakbBCz9XhxPfPMM6e2bNlykx4zjijFOQipt3v37h/pMeOIUjSId9999xA9XlxRigYh933S48UV1TcIzkFkjAnyaNGiRV0q0SBS3vJC9iAq0SDuiCrTIN7T48X11FNPnZ7iVirel7nK91yK1CDkpnt6vLgi9iAyyQR5VKkG8fbbb/fX48UVVa5BVOoQk9zzyowZh1xumuKWFx/r8eKSBtGjR4+5esw4ohQNIuWhS2kQXp/k5ZvUery43GNYlOKcGirDBHn08ccf712JBpHycsRKHWL6U+R576mUVzHN0OPFJV+ElDuG6jHjiFLcrE/ObVWiQbz11ltf0uPFFdXfaqMSDeK2KMU5NVSGCfKoUg0io3sQ8rxe94BK2SBm6vHiSrkH4X2Iaf78+V3322+/2XrMOKIUDSLleiUNwutQT8pDTHLo0usLmKgcE+SR3Le/ElcxpTxJLd+D8N4l1+PF5R73RZ57ECkPMXk3iJTnIObp8eKSDx7777//LD1mHFGKq7Ya4Somrz0IoceLK6r/Aqb3Bx5UhgnySI4Vp7glgneDSLkhyxu11yc9keKNWg4xVeJmfd4NIuUhJu9P8rNnz94vxSEm7wZRye9BpJhfuceX9wceVIYJ8mjChAlfrsStNuSTrR4vrihFg5CfG02xIcu5D69DTCkbxBw9Xlwpfw9irR4vrnHjxg3s3LnzYj1mHFGKBiE3J9TjxRWluIpJflZVjxdXxEnqTDJBHsltmVN8kWpq5LliDxky5Bo9XlxRii/KySE1PV5cUf0x");
    imageData.append("6nZ6zDjki2MpGsQ8PV5c0iBSPK/371Ck/D0I7wZxxx13XKrHi8s9/k/kuT7LT8rq8eJyj1t9nxeVY4I8SvmTo3J9fkc9ZhyXX375bXq8uNzj0cjzpnmvvPLKCXq8uKL6n6Rsr8eMQ67PT/FG7X0V0+OPP352iuf1/kW566+//hcpDm15/+ToDTfc8HM9Xlzu8ULkebJ47NixJ+rx4nKP30Se9aJyTJBHcpVLinv1eDeIBx988Ft6vLii+t/w9dqQU17l4n2ISe55leKNWn6oyIwZR8oGsU6PF9edd955SYo9CO+fHJU9Jj1eXFH9HoTXG3XKe4txL6YMMkFOya7ti1H9p1QxLQa5u6g0BzkXoMeLSzYIOYchJ2BlLPkymH4eIbmQZfu786Hzq8iOl4Q8r9wAT8aSWvRz6lo/KPlu5H+Vyz7OpKj+eaVm/bzb6txGXhM59yB/e0xkx4tLfkNbrvraVsP06LNf623ktZbnPy+y48Ule1rPRvGeb1v98pxS7+ORHS8ueYN/J6pfVz5vfZbnlOWT10X+/teRHS8JeV45PCbr1efVvG29et/5QenfI0NMkHNy+aaI80lGPr17fZJW5M22k9O2gf+2PVkmuXqoS1T/Ruv7Jr2N3C6jj7Nv9PmfGOWTrOwlyW9Rp31eeX17RfU1N3TMedv4Uu+upb/ds4G/S0rGlRr2iOLteclyft6cxCWvdZx1SpZRnlOWUf+3pGQsWVfirKNyqFKeU/5e/7ek5Fv2/Zyu0efXLOudPK/MS9r1ChVgAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABA");
    imageData.append("mAAAAGECAACECQAAECYAAECYAAAAYQIAAIQJAAAQJgAAQJgAAABhAgAAhAkAABAmAABAmAAAAGECAACECQAAECYAAECYAAAAYQIAAMT/BYkygdvWFZNsAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image135ed657d28422ddf59ae2a4fc1b8fab = new WeakReference<>(result);
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
BufferedImage image135ed657d28422ddf59ae2a4fc1b8fab=getImage135ed657d28422ddf59ae2a4fc1b8fab();
if (image135ed657d28422ddf59ae2a4fc1b8fab != null) {
    g.drawImage(image135ed657d28422ddf59ae2a4fc1b8fab, 0, 0, null);
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
		return 403.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private dotted_underline4() {
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
       dotted_underline4 base = new dotted_underline4();
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
       dotted_underline4 base = new dotted_underline4();
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
        return dotted_underline4::new;
    }
}

