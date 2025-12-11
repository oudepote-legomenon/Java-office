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
public class editShape implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef3333adcb5a2e38029fb3d0033adf6ef;
private static BufferedImage getImagef3333adcb5a2e38029fb3d0033adf6ef() {
    BufferedImage result = (imagef3333adcb5a2e38029fb3d0033adf6ef != null)
        ? imagef3333adcb5a2e38029fb3d0033adf6ef.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(18812);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAA25klEQVR4Xu2dCZCk512f5QMnBeGKCYTEKRMoJ4Xu1Ura6daudnTszPTo8CGtLclYB66QAoPt2AZJliyv8YUxstDMSI4qcUxIlUNMUQ42xsQQDutAtiVblmwJEq4kQAriEBsDLkDQ6W+WRtLT89+do/ub//u9z1P1FJTQb/Vn9n2/37zv9HSfcIKIiIiIiIiIiIiIiIiIiIiIiIiIdIcvv/u5w8xyXpFa4F7IJucVqQXuhWxy3hAGs8l5RWqBeyGbnFekFrgXssl5QxjMJucVqQXuhWxyXpFa4F7IJucNYTCbnFekFrgXssl5RWqBeyGbnDeEwWxyXpFa4F7IJucVqQXuhWxy3hAGs8l5RWqBeyGbnFekFrgXssl5QxjMJucVqQXuhWxyXpFa4F7IJucNYTCbnFekFrgXssl5RWqBeyGbnDeEwWxyXpFa4F7IJucVqQXuhWxy3hAGs8l5RWqBeyGbnFekFrgXssl5QxjMJucVqQXuhWxyXpFa4F7IJucNYTCbnFekFrgXssl5RWqBeyGbnDeEwWxyXpFa4F7IJucVqQXuhWxy3hAGs8l5RWqBeyGbnFekFrgXssl5QxjMJucVqQXuhWxyXpFa4F7IJucNYTCbv3XLs1SrlHshm5xXtRa5F7LJng9hMJv8wqvWIvdCNjmvai1yL2STPR/CYDb5hVetRe6FbHJe1VrkXsgmez6EwWzyC69ai9wL2eS8qrXIvZBN9nwIg9nkF161FrkXssl5VWuReyGb7PkQBrPJL7xqLXIvZJPzqtYi90I22fMhDGaTX3jVWuReyCbnVa1F7oVssudDGMwmv/Cqtci9kE3Oq1qL3AvZZM+HMJhNfuFVa5F7IZucV7UWuReyyZ4PYTCb/MKr1iL3QjY5r2otci9kkz0fwmA2Oa9ILXAvZJPzitQC90I2OW8Ig9nkvCK1wL2QTc4rUgvc");
    imageData.append("C9nkvCEMZpPzitQC90I2Oa9ILXAvZJPzhjCYTc4rUgvcC9nkvCK1wL2QTc4bwmA2Oa9ILXAvZJPzitQC90I2OW8Ig9nkvCK1wL2QTc4rUgvcC9nkvCEMZpPzitQC90I2Oa9ILXAvZJPzhjCYTc4rUgvcC9nkvCK1wL2QTc4bwmA2Oa9ILXAvZJPzitQC90I2OW8Ig9nkvCK1wL2QTc4rUgvcC9nkvCEMZpPzitQC90I2Oa9ILXAvZJPzhjCYTc4rUgvcC9nkvCK1wL2QTc4bwmA2Oa9ILXAvZJPzitQC90I2OW8Ig9nkvCK1wL2QTc4rUgvcC9nkvCEMZpPzitQC90I2Oa9ILXAvZJPzzgR+RnIkcyIiIjXCfoxkLh0cOJI5ERGRGmE/RjKXDg4cyZyIiEiNsB8jmUsHB45kTkREpEbYj5HMpYMDRzInIiJSI+zHSObSwYEjmRMREakR9mMkc+ngwJHMiYiI1Aj7MZK5dHDgSOZERERqhP0YyVw6OHAkcyIiIjXCfoxkLh0cOJI5ERGRGmE/RjKXDg4cyZyIiEiNsB8jmUsHB45kTkREpEbYj5HMpYMDRzInIiJSI+zHSObSwYEjmRMREakR9mMkc+ngwJHMiYiI1Aj7MZK5dHDgSOZERERqhP0YyVw6OHAkcyIiIjXCfoxkLh0cOJI5ERGRGmE/RjKXDg4cyZyIiEiNsB8jmUsHB45kTkREpEbYj5HMpYMDRzInIiJSI+zHSObSwYEjmRMREakR9mMkc+ngwJHMiYiI1Aj7MZK5dHDgSOZERERqhP0YyVw6OHAkcyIiIjXCfoxkLh0cOJI5ERGRGmE/RjKXDg4cyZyIiEiNsB8jmUsHB45kTkREpEbYj5HMpYMDRzInIiJSI+zHSObSwYEjmRMREakR9mMkc+ngwJHMiYiI1Aj7MZK5dHDgSOZERERqhP0YyVw6OHAkcyIiIjXCfoxkLh0cOJI5ERGRGmE/RjKXDg4cyZyIiEiN");
    imageData.append("sB8jmUsHB45kTkREpEbYj5HMpYMDRzInIiJSI+zHSObSwYEjmRMREakR9mMkc+ngwJHMiYiI1Aj7MZK5dHDgSOZERERqhP0YyVw6OHAkcyIiIjXCfoxkLh0cOJI5ERGRGmE/RjKXDg4cyZyIiEiNsB8jmUsHB45kTkREpEbYj5HMpYMDRzInIiJSI+zHSObSwYEjmRMREakR9mMkc+ngwJHMiYiI1Aj7MZK5dHDgSOZERERqhP0YyVw6OHAkcyIiIjXCfoxkLh0cOJI5ERGRGmE/RjKXDg4cyZyIiEiNsB8jmUsHB45krhR+bem6oWpX5PoWkfZhP0Yylw4OHMlcKfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1LSLtw36MZC4dHDiSuVLgA1S1ZLm+RaR92I+RzKWDA0cyVwp8gKqWLNe3iLQP+zGSuXRw4EjmSoEPUNWS5foWkfZhP0Yylw4OHMlcKfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1LSLtw36MZC4dHDiSuVLgA1S1ZLm+RaR92I+RzKWDA0cyVwp8gKqWLNe3iLQP+zGSuXRw4EjmSoEPUNWS5foWkfZhP0Yylw4OHMlcKfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1LSLtw36MZC4dHDiSuVLgA1S1ZLm+RaR92I+RzKWDA0cyVwp8gKqWLNe3iLQP+zGSuXRw4EjmSoEPUNWS5foWkfZhP0Yylw4OHMlc");
    imageData.append("KfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1LSLtw36MZC4dHDiSuVLgA1S1ZLm+RaR92I+RzKWDA0cyVwp8gKqWLNe3iLQP+zGSuXRw4EjmSoEPUNWS5foWkfZhP0Yylw4OHMlcKfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1LSLtw36MZC4dHDiSuVLgA1S1ZLm+RaR92I+RzKWDA0cyVwp8gKqWLNe3iLQP+zGSuXRw4EjmSoEPUNWS5foWkfZhP0Yylw4OHMlcKfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1LSLtw36MZC4dHDiSuVLgA1S1ZLm+RaR92I+RzKWDA0cyVwp8gKqWLNe3iLQP+zGSuXRw4EjmSoEPUNWS5foWkfZhP0Yylw4OHMlcKfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1LSLtw36MZC4dHDiSuVLgA1S1ZLm+RaR92I+RzKWDA0cyVwp8gKqWLNe3iLQP+zGSuXRw4EjmSoEPUNWS5foWkfZhP0Yylw4OHMlcKfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1");
    imageData.append("LSLtw36MZC4dHDiSuVLgA1S1ZLm+RaR92I+RzKWDA0cyVwp8gKqWLNe3iLQP+zGSuXRw4EjmSoEPUNWS5foWkfZhP0Yylw4OHMlcKfABqlqyXN8i0j7sx0jm0sGBI5krBT5AVUuW61tE2of9GMlcOjhwJHOlwAeoaslyfYtI+7AfI5lLBweOZK4U+ABVLVmubxFpH/ZjJHPp4MCRzJUCH6CqJcv1LSLtw36MZC4dHDiSuVLgA1S1ZLm+ZfqcecMH5hv5z0XGsB8jmUsHB45krhT4AFUtWa5vmT57bvzALzXyn4uMYT9GMpcODhzJXCnwAapaslzfMl2ak/8ZN35g2OgtgESwHyOZSwcHjmSuFPgAVS1Zrm+ZLs3Jf/wNgLcAEsF+jGQuHRw4krlS4ANUtWS5vmV6PPn07y2AHAv2YyRz6eDAkcyVAh+gqiXL9S3T48mnf28B5FiwHyOZSwcHjmSuFPgAVS1Zrm+ZDhud/r0FkAj2YyRz6eDAkcyVAh+gqiXL9S3TYaPTv7cAEsF+jGQuHRw4krlS4ANUtWS5vmXnHOv07y2AbAT7MZK5dHDgSOZKgQ9Q1ZLl+padc6zTv7cAshHsx0jm0sGBI5krBT5AVUuW61t2xmZO/2O9BZAx7MdI5tLBgSOZKwU+QFVLlutbdsZmTv9jvQWQMezHSObSwYEjmSsFPkBVS5brW7bPVk7/Y70FkAb2YyRz6eDAkcyVAh+gqiXL9S3bZyun/7HeAkgD+zGSuXRw4EjmSoEPUNWS5fqW7bGd0/9YbwGE/RjJXDo4cCRzpcAHqGrJcn3L9tjO6X+stwDCfoxkLh0cOJK5UuADVLVkub5l6+zk9D/WW4C6YT9GMpcODhzJXCnwAapaslzfsnV2cvof6y1A3bAfI5lLBweOZK4U+ABVLVmub9ka0zj9j/UWoF7Yj5HMpYMDRzJXCnyAqpYs17dsjWmc/sd6C1Av7MdI5tLBgSOZKwU+QFVLlutbNs80");
    imageData.append("T/9jvQWoE/ZjJHPp4MCRzJUCH6CqJcv1LZtnmqf/sd4C1An7MZK5dHDgSOZKgQ9Q1ZLl+pbNMYvT/1hvAeqD/RjJXDo4cCRzpcAHqGrJcn3L5pjF6X+stwD1wX6MZC4dHDiSuVLgA1S1ZLm+5fjM8vQ/1luAumA/RjKXDg4cyVwp8AGqWrJc33J8Znn6H+stQF2wHyOZSwcHjmSuFPgAVS1Zrm85Nm2c/sd6C1AP7MdI5tLBgSOZKwU+QFVLlutbjk0bp/+x3gLUA/sxkrl0cOBI5kqBD1DVkuX6lpg2T/9jvQWoA/ZjJHPp4MCRzJUCH6CqJcv1LTFtnv7HegtQB+zHSObSwYEjmSsFPkBVt+TidcNHL7x6+Mj8S4cPHXjJ8FP9y4cPzL1o+ImzXzD8+N7nD391z8XD+05bHt576mB4zymD4d0nLaz7sRNHfvuhde8+8eg/a7zn5KX1f7fJ3D/KfnzvpcNPjv6sB/a9aPjpcw4PP3PwiuFnz3vp8NFDV6//tzkP17dszG6c/sd6C9B92I+RzKWDA0cyVwp8gKpu5KML1wwfHhXvp/cfHhXyC9fL+d5RoX/sxKMlvhs23zg03yg032g033Q8tP/Fxe7DttmN0/9YbwG6D/sxkrl0cOBI5kqBD3rV9bI/eOXwwbnLhvefccnw3tGpnOWbVa5vmWQ3T/9jvQXoNuzHSObSwYEjmSsFPvy1Ppvr9If2v2T4ybNesH79vpun+p3K9S2T7Obpf6y3AN2G/RjJXDo4cCRzpcAy0Bq8dvjIeVetX5s3V+gs0ZLl+pankuH0P9ZbgO7CfoxkLh0cOJK5UpgsB+2izbV+8yK9j59x6dEX4W1Qnl2Q61ueSobT/1hvAboL+zGSuXRw4EjmSoFFod1xvfT3v3j9lfRPftV9l+X6lifIdPof6y1AN2E/RjKXDg4cyVwpsDS0cBevW7/eb34Nr5bSf7Jc3/IEmU7/Y70F6Cbsx0jm0sGBI5krhYkC");
    imageData.append("0SJtfhf/U73Lj76Ib4NirEWubzlKxtP/WG8Bugf7MZK5dHDgSOZKgUWiZfnw/FXrP9cv+ZX705TrW46S8fQ/1luA7sF+jGQuHRw4krlSYKFoAS5eN/zMuVcMf/X0iyYKsHa5viX36X+stwDdgv0YyVw6OHAkc6UwUS6a1scWrxk+2Lts/e1yWXx6VK5vyX36H+stQLdgP0Yylw4OHMlcKbBkNJ+PLV47/NQ5hy3+Tcj1XTslnP7HegvQHdiPkcylgwNHMlcKLBvNo8W/dbm+a6eE0/9YbwG6A/sxkrl0cOBI5kqBpaO772OL1w0/vf/FFv825PqumZJO/2O9BegG7MdI5tLBgSOZKwWWj+6uzav6u/b2vG3K9V0zJZ3+x3oL0A3Yj5HMpYMDRzJXCiwg3R0/d8HLhvfvvWSi0HRrcn3XSomn/7HeApQP+zGSuXRw4EjmSoFFpG177fob+DSfbc8y063L9V0rJZ7+x3oLUD7sx0jm0sGBI5krhclC0rZs3rL3vlO97p+mXN81UvLpf6y3AGXDfoxkLh0cOJK5UmAp6extPqTnk2e/0Hfvm4Fc3zVS8ul/rLcAZcN+jGQuHRw4krlSYDnpbH344JWdfHX/z+05NHzfuQvDOy9eHL71ysXh9S9fHH7fK5aGL3/t0vCKm5aGl755MFx+22B4/o8c9eBtg2Fv9ajN/z7+582/0/y7TabJft8rjv5Zbxn9mc2f/R/PHf23Tp/874/l+q6NLpz+x3oLUC7sx0jm0sGBI5krBRaUzsbmd/ofmHtR8af+D5+xMHzPoYX1km8K/vJbBsPzbn2izNuy+W8evqX5BmFp/ZuDZqafPcNvALpw+h/rLUC5sB8jmUsHB45krhRYVDp9P3vBdxT5s/5fOenQ8CfPOTR85+ULw1d87+LwordOFnFCf3/kh/prg+v33bG0/6Qjh5/FNd9VunT6H+stQJmwHyOZSwcHjmSuFFhWOl0/1T9c1Kn/p3oLw7e/");
    imageData.append("ZHF47fcvPuWavmD/ZOTPzq0Ovm/f7Rc/j+u/S3Tp9D/WW4AyYT9GMpcODhzJXCmwsHQ6Nh/c8/G9l04UbDabU/6PXbgwfM13jU74b1lieXbR3xi5Ore6NH/CkSNP534olS6e/sd6C1Ae7MdI5tLBgSOZKwUWl+7c5k197j11MFG2WfzlEw8N//35C8PXfdfScOEdEwVZk5/vrSz9+NzK4oWlfzPQxdP/WG8ByoP9GMlcOjhwJHOlwPLSnfmZg1cM7zlpcaJ0M/jBsw4N33D14nDw9ipO+lv1d3prg1v2rQyewz2SnS6f/sd6C1AW7MdI5tLBgSOZKwUWmG7fB+Yumyjd3ba54n/38sLwutctDfu3T5SeTvp4b3X5Z/pry88//P7Dz+B+yUiXT/9jvQUoC/ZjJHPp4MCRzJUCS0y3bvMrfp848/kT5bub/sKpR1+9f+mbPe1v27XBbze/TTB/2wu+jvsmCzWc/sd6C1AO7MdI5tLBgSOZKwWWmW7NxxauGd6/5+KJAt4tf+bMQ8Mbr1scnnerxT9F/6i3uvz2A7ctfjP3z25Tw+l/rLcA5cB+jGQuHRw4krlSYKHp5v3chXle7PeRMxbWi//c2yz+GfrnI+/K8o1ATaf/sd4ClAH7MZK5dHDgSOZKgaWmm/OR8186vOfk3X+xX/MWvLdc3Zz4J8pKZ+efzK0t377vRy/9Ju6nNqnp9D/WW4AyYD9GMpcODhzJXCmw2PT4NuV/9y6/0v+XTj40/MGrLP5d9gsjX7cb7zZY4+l/rLcA+WE/RjKXDg4cyVwpsNz02D4yf9Wo/BcmCrlN//VgYXjxW73qT+R/760uHebemiU1nv7HeguQH/ZjJHPp4MCRzJUCC05jm9/x383y/6neoeHLrrf4s9pfHXy0jbcbrvn0P9ZbgNywHyOZSwcHjmSuFFhyurHNx/h+7Nt3p/ybd+5r3p+/I+/N33W/3F9dPjLLHwvUfPof6y1AbtiPkcylgwNH");
    imageData.append("MlcKLDqd9OHm2v/E3Sn/nziwsP6xtxsUjSb2jDee97/3HJm/nPttp3j6f0JvAfLCfoxkLh0cOJK5UmDZ6VN95LzmBX/tl39z6r/p2kXfva9A9926MDzplb3hSa/qDfe84dyf2/tde7+C+267ePp/Qm8B8sJ+jGQuHRw4krlSYOHpE352l17t/9NnHxpe+XpP/aV6+k0HRt8AzP2tp/7AgS/sfcuF+7n3toqn/0m9BcgJ+zGSuXRw4EjmSoGlp0dt3uTnnpOXJsp51t76woXhwXdNloqW4frp/1VPlP/Yk1/d++s9txxc4f7bCp7+J/UWICfsx0jmZsKX3/3cYWY5b5uw+PS64aOHrh7ec0q77/D3i6ccGr7yezz1ly5P//S0Gw78t31HBl/DfXg8PP3HegswG9hT2eS8IQxmk/O2CcuvdpsP9rnv9IsmCnqWNh/T++I3TJaJluXf/ux/g+J/sqf+wDlfOv0HD57FvXgsPP3HegswG9hT2eS8IQxmk/O2CQuwdtv+VL/3LCwML3jnZJloeR7v9P9kT35N76/OODL/vdyPG+Hp//h6CzB92FPZ5LwhDGaT87YJC7BmH5y7bKKgZ+mtL1oY7vdV/p0w+tn/sTx59O/vOTL/Y9yTxNP/8fUWYPqwp7LJeUMYzCbnbROWYK0+dO5LJgp6Vv7KiUc/wIclouW6ldP/Uxx9E3D6zefef8KRI0/n3mzw9L95vQWYLuypbHLeEAazyXnbhEVYo589/ztae6Of5kN8vvuVvtivS272Z//H8rQbD/z2Oe+49Ku5Pz39b15vAaYLeyqbnDeEwWxy3jZhGdbmowvXDO89tZ1X/P/CKYeGV/te/p1z26d/eNr1B/5P/8jCN473pqf/restwPRgT2WT84YwmE3O2yYsxNr8+N5LJ4p6Fn70tIXhFTdZ/l1zOz/7P5anvm7/l+ZumP+WZm96+t+63gJMD/ZUNjlvCIPZ5LxtwkKsyU/1D08U9Sz8udP9");
    imageData.append("Nb+uOq3T/5M95fvP+ZMzb1q5kuWmm9NbgOnAnsom5w1hMJuct01YirX4yPkvHX7sxMmynrYfOWNh+II3efLvotP42X/knhtWH2ex6eb0FmA6sKeyyXlDGMwm520TFmMNNj/3b+Od/j46Ovn7SX7ddRan/8ZTXv3iiVLTrektwM5hT2WT84YwmE3O2yYsxxr8xFmzf7Of5gV/V75+sjS0G077Z/9P9vTrb58oNN2a3gLsHPZUNjlvCIPZ5LxtwnLsup85eMVEWU/b5n39X3qDJ/8u6+k/v94C7Az2VDY5bwiD2eS8bcKC7LLrv/I340/4a97k53v8Pf9OO8uf/Xv6n57eAuwM9lQ2OW8Ig9nkvG3CkuyybbzP/43f6Tv8dV1P/+XoLcD2YU9lk/OGMJhNztsmLMmu+vDBKyfKetr+yGWWf9f19F+W3gJsH/ZUNjlvCIPZ5LxtwqLsoo8tzv7qv/lUv3NWJgtDu6Wn//L0FmB7sKeyyXlDGMwm520TlmUXfWDuRROFPU0/eNbC8MIf9uf+XdfTf5l6C7A92FPZ5LwhDGaT87YJy7Jrfu7Cl830g36aV/wffoPlX4Oe/svVW4Ctw57KJucNYTCbnLdNWJhd8+NnXDJR2tP0la+w/GvQ03/ZeguwddhT2eS8IQxmk/O2CQuzS876d/5vfeHCRFFoN/X0X77eAmwN9lQ2OW8Ig9nkvG3C0uyKjy1eO9OP+f3AvoXh/Lsmi0K7p+/61w29Bdga7Klsct4QBrPJeduExdkVZ/lJf7984qHhS2726r8WPf13R28BNg97KpucN4TBbHLeNmFxdsHm9H/3SbP7tb+brvX3/WvR03+39BZg87Cnssl5QxjMJudtE5ZnF/xU//KJ0p6W7zu4MOzfPlkU2k09/XdPbwE2B3sqm5w3hMFsct42YXmWbvN+/3eftDhR3NOwufq/7I1e/deip/9u6i3A5mBPZZPzhjCYTc7bJizQ0n2wd9lEcU/LN36H");
    imageData.append("V/816em/u3oLcHzYU9nkvCEMZpPztgkLtGSPnv5n86Y/P9VbGB64bbIktJt6+u+23gIcH/ZUNjlvCIPZ5LxtwhIt2QfnZnf6f9n1Xv3XpKf/7ustwLFhT2WT84YwmE3O2yYs0VJtXvl/z4w+8OfOi3zDn5r09F+H3gIcG/ZUNjlvCIPZ5LxtwiIt1Yf2v2SiuKfhL550aHjJWzz916Sn/3r0FiCGPZVNzhvCYDY5b5uwSEv1vtOWJ8p7Gv7gS33hX016+q9LbwFi2FPZ5LwhDGaT87YJi7REHz545URxT8OPnLEwPO/WyZLQ7urpvz69BdgY9lQ2OW8Ig9nkvG3CMi3R+/fM5hP/bni5V/816em/Tr0F2Bj2VDY5bwiD2eS8bcIyLc3PXXj18GMnTpb3Tv3IGYeGB/2wn6r09F+v3gJMwp7KJucNYTCbnLdNWKilOas3/nndv/Bn/zXp6b9uvQWYhD2VTc4bwmA2OW+bsFBL895Tpv+Rvx86yzf9qU1P/+otwFNhT2WT84YwmE3O2yYs1JJ8eP6qifKehjd+p6f/mvT0r43eAjwV9lQ2OW8Ig9nkvG3CUi3JT5z5/Iny3qk/f+qh4Xm3+uK/mvT0r2O9BXgC9lQ2OW8Ig9nkvG3CUi3FxxavGd594vQ/9e9tV3j6r0lP//pkvQV4AvZUNjnvTPitW5413IzMSXkcfv/hZ4xK4TdZEtpdPf0r9RZg57AfI5lLBweOZE7KY1QIL2BBaHf19K8b6S3AzmE/RjKXDg4cyZyUx9zq4MMsCe2unv410luAncF+jGQuHRw4kjkpi30rg+eMSuFxloR2U0//eiy9BdgZ7MdI5tLBgSOZk7Lory4fYUlod/X0r8fTW4Dtw36MZC4dHDiSOSmII0eePiqF/8GS0G7q6V83o7cA24f9GMlcOjhwJHNSDv215XNZEtpdPf3rZvUWYHuwHyOZSwcHjmROyqG3srTGktBu6ulft6K3ANuD/RjJXDo4");
    imageData.append("cCRzUghHr/9/n0Wh3dTTv25VbwG2Dvsxkrl0cOBI5qQM+quD81kS2k09/et29BZg67AfI5lLBweOZE7KwOv/evT0r9vVW4CtwX6MZC4dHDiSOSmDUTH8BotCu6enf92J3gJsDfZjJHPp4MCRzEl+zl5b/mcsCu2mnv51p3oLsHnYj5HMpYMDRzIn+emtLr+KRaHd09O/TkNvATYP+zGSuXRw4EjmJD+9laWPsCy0e3r612npLcDmYD9GMpcODhzJnORm/sj8M0fl8CWWhXZLT/86Tb0F2Bzsx0jm0sGBI5mT3PTvWDqLZaHd09O/TltvAY4P+zGSuXRw4EjmJDe9tcGrWRbaLT396yz0FuD4sB8jmUsHB45kTnIz+gbgJ1kY2i09/eus9Bbg2LAfI5lLBweOZE5yMyqI32VhaHf09K+z1FuAY8N+jGQuHRw4kjnJy1l3LP9DFoZ2S0//Omu9BYhhP0Yylw4OHMmc5KW/MlhgYWh39PSvbegtQAz7MZK5dHDgSOYkL6NvAF7L0tDu6Olf29JbgI1hP0Yylw4OHMmc5GVUEj/G0tBu6Olf29RbgI1hP0Yylw4OHMmc5GVUFA+yOLQbevrXtvUWYBL2YyRz6eDAkcxJXkZF8UUWh5avp3/dDb0FmIT9GMlcOjhwJHOSk7PXLng2i0O7oad/3S29BXgq7MdI5tLBgSOZk5zsu/2ivSwOLV9P/7qbegvwVNiPkcylgwNHMic56a8MLmd5aPl6+tfd1luAJ2A/RjKXDg4cyZzkxF8B7J6e/jWD3gI8Afsxkrl0cOBI5iQno8J4JwtEy9bTv2bRW4CjsB8jmUsHB45kTnLSX1t+LwtEy9XTv2bSW4CjsB8jmUsHB45kTnLSWxt8kCWi5erpX7PpLUCHepMDRzInORmVxn0sES1TT/+aUW8BOtSbHDiSOclJb23waywSLVNP/5rV2m8B2I+RzKWDA0cyJzkZFcfvski0PD39a2ZrvwVgP0Yy");
    imageData.append("lw4OHMmc5GRUHn/IMtHy9PSv2a35FoD9GMlcOjhwJHOSk1F5fIFlomXp6V9LsOZbAPZjJHPp4MCRzElORgXyZywULUtP/1qKtd4CsB8jmUsHB45kTnIyKpDHWShajp7+tSRrvQVgP0Yylw4OHMmc5KTnNwBF6+lfS7PGWwD2YyRz6eDAkcxJTnr+CKBYPf1ridZ4C8B+jGQuHRw4kjnJSc8XARarp38t1dpuAdiPkcylgwNHMic56flrgEXq6V9LtrZbAPZjJHPp4MCRzElOer4RUJF6+tfSrekWgP0YyVw6OHAkc5IT3wq4PD39axes6RaA/RjJXDo4cCRzkpPe2tK9LBjN7ek3nTtR3NPQ07+2bS23AOzHSObSwYEjmZOc9FcHP82C0bx6+tcuWcstAPsxkrl0cOBI5iQnc6uDf8eS0bz6s3/tmjXcArAfI5lLBweOZE5y0ltb/mGWjObU07920RpuAdiPkcylgwNHMic56a8MXsui0Zx6+teu2vVbAPZjJHPp4MCRzElO+qvLl7FoNJ+e/rXLdv0WgP0YyVw6OHAkc5KTfbdftJdlo/n09K9dt8u3AOzHSObSwYEjmZOc9N61+PdZNppLT/9ag12+BWA/RjKXDg4cyZzkpefnAaTW07/WYldvAdiPkcylgwNHMid56a8NHmDpaA49/WtNdvUWgP0YyVw6OHAkc5KX/trye1k8mkNP/1qbXbwFYD9GMpcODhzJnORlbm35NSwe3X09/WuNdvEWgP0YyVw6OHAkc5KXuZXFC1k+uvt6+tda7dotAPsxkrl0cOBI5iQvB1YG/4Dlo7urp3+t2a7dArAfI5lLBweOZE5yMyqd/8US0t3T07/WbpduAdiPkcylgwNHMie56a0s/SeWkO6Onv5Vu3ULwH6MZC4dHDiSOclNf2XplSwi3R09/asetSu3AOzHSObSwYEjmZPc+JbAOfT0r/qEXbkFYD9GMpcODhzJnORm/sj8M0cF9CUW");
    imageData.append("krarp3/Vp9qFWwD2YyRz6eDAkcxJfkYF9LMsJG1PT/+qk3bhFoD9GMlcOjhwJHOSH18HsLueftO5E8U9DT39a+mWfgvAfoxkLh0cOJI5yc++2y9+HktJ29HTv2ps6bcA7MdI5tLBgSOZkzIYldFvsJx09vqzf9VjW/ItAPsxkrl0cOBI5qQMRmW0ynLS2erpX/X4lnwLwH6MZC4dHDiSOSmDudWleRaUztZZnf51a+590/w13A8i04D9GMlcOjhwJHNSCEeOPH1USr/HktLZOMvTv27eU17Tf/yEw4efwe0gMg3Yj5HMpYMDRzIn5dBfHaywqHQ2zuqV/7o1T3v9gQe5D0SmBfsxkrl0cOBI5qQc9t2xtJ9FpdPX038e97zp/JdxH4hMC/ZjJHPp4MCRzElBHP0xwO+wsHS6+rP/HJ7yuv6fnzA84WncBiLTgv0YyVw6OHAkc1IWvbXBLSwsnZ6e/vN4+s0HP8T1LzJN2I+RzKWDA0cyJ2Wxb2XwnFFRPc7i0uno6T+LveGZb+2fzPUvMk3Yj5HMpYMDRzIn5TG3Ovgwi0t3rqf/PJ52w4Hf47oXmTbsx0jm0sGBI5mT8uivLT+f5aU711f+5/H0W+bfyHUvMm3Yj5HMpYMDRzIn5XH4/Yef0fOtgaeqp/88nvLa/l/svWvvV3Ddi0wb9mMkc+ngwJHMSZn4CYHT1Z/953HPzQd/nOtdZBawHyOZSwcHjmROyuTUdy581ai4Ps8i063r6T+PJ7+m91envH3/13O9i8wC9mMkc+ngwJHMSbn0VpffzjLTrevpP4+j0//Pc52LzAr2YyRz6eDAkcxJuRy4bfGbRwX2Zyw03bye/vN48qt6f73vzYeex3UuMivYj5HMpYMDRzInZdNbXX4XS003r6/8z+Nprz9wP9e3yCxhP0Yylw4OHMmclM3euy75ht7a4I9ZbHp8Pf0n8tVzf33mm8/751zfIrOE/RjJXDo4cCRzUj5zK4MfYrnp");
    imageData.append("8fVn/3k87eZz/yvXtcisYT9GMpcODhzJnJTP2WsXPHtUaF9gwWmsp/88nvyv+n914K2L38x1LTJr2I+RzKWDA0cyJ92gvzJ4LUtOYz3953HPzef+BNezSBuwHyOZSwcHjmROusFJRw4/q786+HUWnU66712e/rN4ymv7f773yN6v5HoWaQP2YyRz6eDAkcxJd5hbGVzCslPN7NzqYMB1LNIW7MdI5tLBgSOZk27RXx18lA9Z1Yw2n2rJ9SvSJuzHSObSwYEjmZNuse/2i5/X882BNL9/2l8ZfBvXr0ibsB8jmUsHB45kTrpHb235xg0euKppbF60ynUr0jbsx0jm0sGBI5mT7jF/ZP6Zo4fsg3zoqmZwbnX5IT/uVzLAfoxkLh0cOJI56SbnrC6fOXrYPs6Hr+ou+5e9lcEerleR3YD9GMlcOjhwJHPSXUYP2jdt8ABW3U3fwHUqsluwHyOZSwcHjmROusvf/Cjgvg0ewqq74T2H33/4GVynIrsF+zGSuXRw4EjmpNvsv/Oibx09eL+4wcNYtU2/MHfb0rdwfYrsJuzHSObSwYEjmZPuM7e2dM0GD2TVFl2+iutSZLdhP0Yylw4OHMmc1EF/ZenfTD6UVWdvf2VwJ9ejSAbYj5HMpYMDRzIndTBYGfyd3srgE3w4q87Y+5u1x/UokgH2YyRz6eDAkcxJPZx1x8I/GT2Q/3CDh7TqLPyDfSuD53AdimSB/RjJXDo4cCRzUhe9taULes3vYk8+rFWn6V/MrS7Nc/2JZIL9GMlcOjhwJHNSH73VpZdv8MBWnZ4rS/+S604kG+zHSObSwYEjmZM6GX0T8LaJh7bqNFwZvInrTSQj7MdI5tLBgSOZk0oZnvC0udXl/zDx8Fbdgf3VwU80a4vLTSQj7MdI5tLBgSOZk3qZf+/83x2d1n6BD3HV7Tgq/4/6in8pCfZjJHPp4MCRzEnd7L3rkq8cPbx/hQ9z1S163/wd83+P60skM+zHSObS");
    imageData.append("wYEjmRPZtzL4mtED/JMbPNRVN+On99950ddzXYlkh/0YyVw6OHAkcyINe++65BtGD/JHNni4qx7Lh89eu+DZXE8iJcB+jGQuHRw4kjmRMc0pbvRAv3+Dh7zqRj7YfOPIdSRSCuzHSObSwYEjmRN5MnvvuvBrRw/2ezZ42Kv+rf2Vwd3NWuH6ESkJ9mMkc+ngwJHMiZC/eWHgf+FDX7Vxbm3pF33Bn3QB9mMkc+ngwJHMiWzESUcOP8v3CdBJl9/f/Poo14tIibAfI5lLBweOZE4kZHjC0/qry0cmS0BrdG5t+Xbf5Ee6BPsxkrl0cOBI5kSOx+ibgOtGBfAXLAStxr/0vf2li7AfI5lLBweOZE5kM/RXB+f3/CjhGv0DP9VPugr7MZK5dHDgSOZENkvv3Rf/47nVwa9uUBLaQftrgwf6a8vP5ToQ6Qrsx0jm0sGBI5kT2QrNe703PwtmWWjnvKt5ISj//kW6BPsxkrl0cOBI5kS2w+hk+LJRSXxxg+LQsv1Cb3X5Kv59i3QR9mMkc+ngwJHMiWyX5np4VBYf26BEtECbH+/0Vwbfxr9nka7CfoxkLh0cOJI5kZ0wf2T+mXOrS2/sNa8U36BUtAibv7s3HH7/4Wfw71eky7AfI5lLBweOZE5kGuy7c+nU3srgExuUiyZ2bnX5oXNWl8/k36dIDbAfI5lLBweOZE5kWjS3Ab3V5VeNiuVLLBpN55/11wbXN39n/HsUqQX2YyRz6eDAkcyJTJvm58i9laWPbFA6msC51cGH99950bfy702kNtiPkcylgwNHMicyK+ZWFi8cFc5nWUC6O/ZXB7/eW1u+mH9PIrXCfoxkLh0cOJI5kVmy9669XzG3tvyaUQH9PxaStuYfNT+aaf4u+PcjUjPsx0jm0sGBI5kTaYNz3nHpVzc/c+6t/575REHpbPzS3Mrgh/bfedHX8+9DRDrUmxw4kjmRNjl77YJnN6U0Kqc/3aCwdDr+afNujft+9NJv");
    imageData.append("4tdfRJ6A/RjJXDo4cCRzIrtBU0791cFbRmX1fzcoMN2en59bW3pz/90L38ivt4hMwn6MZC4dHDiSOZHdpPlsgd7K4Ore2uDXNig03ZTLv9X8jP/Udy58Fb++IhLDfoxkLh0cOJI5kQw070I3tzK4ZPSNwAdHpfb4ZMkp/Mv+6uCnm6+Z7+Ansj3Yj5HMpYMDRzInko3mY4f7K0s3Hz3ZThRf7f7m3OrgpnNWD/0jft1EZGuwHyOZSwcHjmROJDPnrC2e1F9dPtIU3wZlWIu/u/6ivjuW9p8wPOFp/BqJyPZgP0Yylw4OHMmcSBEcOfL0c1YWD4zK8EfX39BmsiS75fprIpbftV76o//f+eUQkZ3DfoxkLh0cOJI5kRJp3sq2v7r0PaOy/NCoLP94okDL84vN6x/m1gbfffbqwj/l/78iMn3Yj5HMpYMDRzInUjrNi+D6dyyf3lsZfO/o1Py+/urgf25QsKk8OuPy+5qZ968snuYL+UTah/0YyVw6OHAkcyJdZO9dl3xDb23pgtGp+tWjov23o9L9ZG/9LXEny3jG/tHRj0luZlh+1aj4z29m47wi0j7sx0jm0sGBI5kTqYn5217wdeu3BWtLL2y+ORgV8jtG//M9vZWl/9xfGdw9KuxHe0dfcPj59fJ+6kcbN/9788+a/1vz7zy6nhllmz/jb/6sVzd/dvPf2HvXhV/L/76I5IH9GMlcOjhwJHMiIiI1wn6MZC4dHDiSORERkRphP0Yylw4OHMmciIhIjbAfI5lLBweOZE5ERKRG2I+RzKWDA0cyJyIiUiPsx0jm0sGBI5kTERGpEfZjJHPp4MCRzImIiNQI+zGSuXRw4EjmREREaoT9GMlcOjhwJHMiIiI1wn6MZC4dHDiSORERkRphP0Yylw4OHMmciIhIjbAfI5lLBweOZE5ERKRG2I+RzKWDA0cyJyIiUiPsx0jm0sGBI5kTERGpEfZjJHPp4MCRzImIiNQI+zGSuXRw4Ejm");
    imageData.append("REREaoT9GMlcOjhwJHMiIiI1wn6MZC4dHDiSORERkRphP0Yylw4OHMmciIhIjbAfI5lLBweOZE5ERKRG2I+RzKWDA0cyJyIiUiPsx0jm0sGBI5kTERGpEfZjJHPp4MCRzImIiNQI+zGSuXRw4EjmREREaoT9GMlcOjhwJHMiIiI1wn6MZC4dHDiSORERkRphP0Yylw4OHMmciIhIjbAfI5lLBweOZE5ERKRG2I+RzKWDA0cyJyIiUiPsx0jm0sGBI5kTERGpEfZjJHPp4MCRzImIiNQI+zGSuXRw4EjmREREaoT9GMlcOjhwJHMiIiI1wn6MZC4dHDiSORERkRphP0Yylw4OHMmciIhIjbAfI5lLBweOZE5ERKRG2I+RzKWDA0cyJyIiUiPsx0jm0sGBI5kTERGpEfZjJHPp4MCRzImIiNQI+zGSuXRw4EjmREREaoT9GMlcOjhwJHMiIiI1wn6MZC4dHDiSORERkRphP0Yylw4OHMmciIhIjbAfI5lLBweOZE5ERKRG2I+RzKWDA0cyJyIiUiPsx0jm0sGBI5kTERGpEfZjJHPp4MCRzImIiNQI+zGSuXRw4EjmREREaoT9GMlcOjhwJHMiIiI1wn6MZC4dHDiSORERkRphP0Yylw4OHMmciIhIjbAfI5mbCV9+93OHmeW8IrXAvZBNzitSC9wL2eS8IQxmk/OK1AL3QjY5r0gtcC9kk/OGMJhNzitSC9wL2eS8IrXAvZBNzhvCYDY5r0gtcC9kk/OK1AL3QjY5bwiD2eS8IrXAvZBNzitSC9wL2eS8IQxmk/OK1AL3QjY5r0gtcC9kk/OGMJhNzitSC9wL2eS8IrXAvZBNzhvCYDY5r0gtcC9kk/OK1AL3QjY5bwiD2eS8IrXAvZBNzitSC9wL2eS8IQxmk/OK1AL3QjY5r0gtcC9kk/OGMJhNzitSC9wL2eS8IrXAvZBNzhvCYDY5r0gtcC9kk/OK1AL3QjY5bwiD2eS8IrXA");
    imageData.append("vZBNzitSC9wL2eS8IQxmk/OK1AL3QjY5r0gtcC9kk/OGMJhNzitSC9wL2eS8IrXAvZBNzhvCYDb5Gcmqtci9kE3Oq1qL3AvZZM+HMJhNfuFVa5F7IZucV7UWuReyyZ4PYTCb/MKr1iL3QjY5r2otci9kkz0fwmA2+YVXrUXuhWxyXtVa5F7IJns+hMFs8guvWovcC9nkvKq1yL2QTfZ8CIPZ5BdetRa5F7LJeVVrkXshm+z5EAazyS+8ai1yL2ST86rWIvdCNtnzIQxmk1941VrkXsgm51WtRe6FbLLnQxjMJr/wqrXIvZBNzqtai9wL2WTPhzCYTX7hVWuReyGbnFe1FrkXssmeD2Ewm5xXpBa4F7LJeUVqgXshm5w3hMFscl6RWuBeyCbnFakF7oVsct4QBrPJeUVqgXshm5xXpBa4F7LJeUMYzCbnFakF7oVscl6RWuBeyCbnDWEwm5xXpBa4F7LJeUVqgXshm5w3hMFscl6RWuBeyCbnFakF7oVsct4QBrPJeUVqgXshm5xXpBa4F7LJeUMYzCbnFakF7oVscl6RWuBeyCbnDWEwm5xXpBa4F7LJeUVqgXshm5w3hMFscl6RWuBeyCbnFakF7oVsct4QBrPJeUVqgXshm5xXpBa4F7LJeUMYzCbnFakF7oVscl6RWuBeyCbnDWEwm5xXpBa4F7LJeUVqgXshm5w3hMFscl6RWuBeyCbnFakF7oVsct4QBrPJeUVqgXshm5xXpBa4F7LJeUVERERERERERERERERERERERESkYP4/yKWYzB1FEGwAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef3333adcb5a2e38029fb3d0033adf6ef = new WeakReference<>(result);
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
BufferedImage imagef3333adcb5a2e38029fb3d0033adf6ef=getImagef3333adcb5a2e38029fb3d0033adf6ef();
if (imagef3333adcb5a2e38029fb3d0033adf6ef != null) {
    g.drawImage(imagef3333adcb5a2e38029fb3d0033adf6ef, 0, 0, null);
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
	private editShape() {
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
       editShape base = new editShape();
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
       editShape base = new editShape();
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
        return editShape::new;
    }
}

