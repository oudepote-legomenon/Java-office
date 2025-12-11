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
public class recent2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image60d61ebf0f6b88c08ee65388f38b237c;
private static BufferedImage getImage60d61ebf0f6b88c08ee65388f38b237c() {
    BufferedImage result = (image60d61ebf0f6b88c08ee65388f38b237c != null)
        ? image60d61ebf0f6b88c08ee65388f38b237c.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(24200);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AABGr0lEQVR4Xu3dCZwcZZ3/8ciNoC6CoOiq6y2sx4r3sd6uonji6u7LVf/rfSBeGG+D7rrouighM/XUBIjG1dVR8EC8UKOAMZmq6pDgKDrJTD3VQxIiqFwh9/yfZ6YTwq+eSff0VHc/Vf35vl7vV5SZfqqm6qmqX3dXPc+CBYSQ0mZ4dPSwYO3644dWTz5sMNGnhLF++lCknxck6SvM/351mOi3WkGUvlvFemEr7O9OvybRb5luI85ebtu0bdtl2GXZZdply/UhhBBCSBtZtmLiCLWm/tDBJHuGivTpjQv32eaCrMy/3zUX5V+bf0eDWF9n/r3NmOqx2xrrMtpYt+8agZpe5/RdZv1fZQuHgaT+kMVjY4fLv5cQQgjpiwyMbjla1cYfM31hTNKzzIVysbm4f8/8mxjXOy6wVbPZFASxssVMrM9TcfpBlaSvHEzqjw7jjXeV24sQQggpTRZNTR0UxtmDVaJPUzMfqy8zrjA2OS6I2M/0pwmR/lWYZBcGkf5QGKcvXro6/bupqam7yO1MCCGE9CwX1Tbdy1zsX6DshT7SX1Uz7+S3ygsb5u1W+8lBmOjltjCw9yQsWT15rNwfhBBCSOEx70bvo6LsZeZidLa52H/f/Ft3XKjQVZm2X6GYomDRYJS9dGBk4t5yvxFCCCEtJ4zjQ+0d7+Yic6Z912n+Hc1ffOCpjcaltiiwnxScu7J+pNy/hBBCyHTszXnTj8+Zi0aQ6MvNBWSb48KCctppvz6wNx3axxoH1+lj5P4nhBDSJ7EXfHuDWZik5zbuSt/luHCgmnaaIm8kiLMvDEXpi3j6gBBCKhx7Z37jI/2FvMOHMP0Jgfn3HPsp0KIVU4fI/kMIIaREsXeJq0S/TkX6G+bk/mfHiR9w+VMQZ18Louy1fF1ACCElyWCkH2RO4Gc23uXvcJzcgbnYNX3/gH3KINGnyP5GCCGk");
    imageData.append("hxka0SfbE7Q5Wf/ecQIHijTeuJnw6QxORAghXc7M9/nTY+V/0T4H7jhJA90wbm8kVLX0KRQDhBDSwez3Tn/ccTIGeqm+95MB2W8JIYS0kTDecH9zcj3TWOM46QI+GrWFqp0BUfZnQgghB4gduc0O2NK4kW+P4wQLlEJj/oK32nEnZD8nhBDSyPRz+pEOzYnzFnkiBUrOThA1bMcZ4H4BQghZMDObnp3dzZwc1ztOmkAVXavi7P0XrKzfUx4PhBBS+ez3bp+pc9Gv7GiU058KyOODEEIqleVrNx9l3vm83Zz01jlOhkA/qwWJfgszFxJCKpUwTu/TeHzvBseJD8Ad/jrzOOGG+8vjiBBCShP7MX+Y6OXmpLbTcaIDMDs7O+WlpnB+mjyuCCHEy9hR+lSSvlLF6SrHSQ3A3F0ZJPolPD1ACPEyw6Ojh6lIvz6M9e8cJzAA83fNzDEWHyqPP0II6XrsACdhnH7AnJwmHScsAAUzRXZqvIcbBgkhPcnMHf3TQ/RukicoAJ0XxOkW8+/CMN54V3l8EkJI4bHv+BUXfsAbthCwT9ksXjV2d3m8EkLIvNN4x/8RxaN8gK+ut1/HLVsxcYQ8fgkhZM6xNxzZyUzMyWWj44QDwD91e8wuWjF1iDyeCSGkaezjfHZGPmPMcYIB4L+J6ULAHMvy+CaEEGdUlJ6q7CNH+RMKgPKpqZp+rjzOCSFkX8xJ4iRzsviB4wQCoOSCRF8exvVHyeOeENLHOb+WndiYmc8OP5o7cQCojN12eO6lq8ZPkOcBQkgfxd4tHMbpJ8xJ4VbHiQJAdd0UJulZdgRPeV4ghFQ8KtGnmZPABseJAUD/+KO950eeHwghFcxAUn+I4nt+AHd26WCkHyTPF4SQCsSOG24O8s8a2x0HPwBsDRP9Kb4WIKRCCWP9dHNw/95xwAOA9McgmniWPI8QQkqUMN5wjyDW55kDerfjIAeA2eyxTwYxvwAhJUzjJr+648AGgJaYNxDX");
    imageData.append("BUn6Cnl+IYR4mIGRiXubA3dYHsgAMA/Dwdr1x8vzDSHEg0xNTd1FRfr1itn6AHTGX+zcAvZcI88/hJAexT6+Y4f5dBywAFCoIEl/ObR68mHyPEQI6WJsJR5E6bvNQblVHqQA0EG3mjcdb5HnJEJIF2K/jzMH4aWOAxMAuiT9ThhvPE6enwghHUoYZy8wB9/G/MEIAF23meGECelw7OQ9jef69zgOQgDolT323LR4bOxwed4ihMwzQyP65DBO1zoOPADwxW9Vbfwx8vxFCGkj04/3xfpMY5vjYAMA39xuLFw0NXWQPJ8RQlrM0lXjJwRJ9kPHAQYAvvvp+bXsRHleI4Q0yVCUvkgxqA+Acrs+jNNny/MbIcSRxkf+CxUT+ACohl3GQkYQJOQAufCqa++mouxixwEEAKUWJvp7doZSed4jpO8TxhOPCGP9O3nQAECFXKtq+iR5/iOkbxNE2WvNgXGr42ABgKq5WUX6dHkeJKSvsmjF1CHmYDhHMbAPgP5iz3nnDA9PHSzPi4RUPnb8bFMF/8xxYABAn8hW2HlN5PmRkMpmMJl4sun8k/mDAQD6zkQYp4+T50lCKpcgSl+lmL4XAPZ3m4qyl8nzJSGViZoZ0pfn+wEgb08Q6UXyvElIqWNvdFFxOuDo8ACA/UU6tDdIy/MoIaXLwOiWo02n/kGukwMA3KL0R3ZgNHk+JaQ0sRNhmM6c5Do3AKCJ7OqlqybvJ8+rhHifMK4/ynTiLN+pAQAtmlS18cfI8ysh3kZF+vmm497k6MwAgLm5WSX1F8rzLCHeJYj020yH3enoxACA9mwPY/0Geb4lxJuomWl8ZccFAMzfHhVn75fnXUJ6Hvv8qqPDAgCKdY48/xLSk0xNTd0lTNJzHZ0UANABYaI/J8/FhHQ1i6amDgpivVR2TgBAxwX2HCzPy4R0PHZ0P3Px/7KjUwIAuuN/GTWQdDXDo6OHqSi72NEZAQDd9c0wjg+V52lCCk8Yb7yr6XA/");
    imageData.append("dnRCAEBvXHbuyvqR8nxNSGFZvnbzUaaj/dzR+QAAPRQk6S+ZP4B0JLZjqThdJTsdAMAbV9o3avL8TUjbsR8tqThb4ehsAACfRPpny1ZMHCHP44TMOdM3/MX6slwnAwD46seLx8YOl+dzQlqOfdTPdKRhR+cCAPgsyi7mEUHSVmYG+cm+lutUAICy+AqDBZE5ZWZ4X60cnQkAUCZRtkSe4wmZNSrO/jvXiQAA5RTpL8rzPCG5BFH6n7nOAwAoufTj8nxPyL7YuabznQYAUAVhkp4lz/uEmHf++m2yswAAKmWPivTr5fmf9HFUUn+h6Rg7HZ0FAFAtO4Yi/Tx5HSB9mCDK/t50iL86OgkAoJpuCuP6o+T1gPRRzq9lJ5qOkDk6BwCg2iaWrho/QV4XSB9kZnIfvcbRKQAAfSCMdczkQX2W6SF+I/192RkAAH3nB/aaIK8TpKJRcTrg6AQAgH7EQEH9EbOzF+Z2PgCgr4Wxfo+8XpAKxVR5p5sdvVvueABA39sdxtnL5XWDVCBhXH+S2cG3O3Y6AADWrUGU/oO8fpASJ1i7/nizY+uOnQ0AwH4yHcYbj5PXEVLCLFoxdYjZoSvyOxkAAIdI/4wnAyqQMEnPze1cAAAOwFw7/kNeT0iJEiTpK5Sd/MGxcwEAOIA9QZS+Sl5XSAkSxhOPMDvwJsdOBQCgFTcPJOkj5fWFeBw7zG8Y6985diYAAHNx7eJVY3eX1xniYaampu6iouxix04EAKAN2SX22iKvN8SzhHH6ifzOAwBgPrL3y+sN8ShDkX6e2VG78jsOAIB52RlEE8+S1x3iQc6vZSeaHXSDY6cBAFCETRfVNt1LXn9ID2O/mwmS7IeOnQUAQGHstYb7ATxKGKcfkDsJAIBOCOPsHfI6RHqQIMr+XjHJDwCge24P4/qj5PWIdDHLVkwcYXbEOsfOAQCgk66x1yB5XSJdioqyJY6dAgBAF2T/La9LpAsJ4/TFinH+2xLE+joV6a+G");
    imageData.append("SfouVdPPHUjqDzHb8z6D6/Qx6B/B1fX7qlr2eBWlbzL9YrFxleIxWmAudtvHz+X1iXQwS1eNn2A2/PWOnYHZbTeWDSbZM7iDlcwW+zjtzE212dWOPgQgb3LJ6slj5bFEOpDpoX5jfZljJ8BttzG0dNXk/eS2JORAGYyyl5q+c62jTwG4k+wSefyQDiSI0nfnNz5cwliPqVr6FLkNCWk1YRwfavrSGcZW2b8A3CGM0zfL44cUGPtdteJE1KLsEmawIkXFnNweZ/qUzvczAA23BGsmHiiPHVJAGh/9/8Kx0SGEiVbDw1MHy21IyHxih0BVkf6V7G8AGqL0R/K4IQXEfryS29jIi/RXucmPdCqLx8YOt58u5fodgBmJfp08bsg8Yh9RMxv2z7kNDSFbsWjF1CFy+xFSZOx9AUGcfS3f/wAYf2LCoAITJvrbjo2M/QRxusU+wiW3HSGdyKKpqYNMvwtkPwQw7X/lMUPaSJDolzg2LoQw1m+Q246QTieI9CLZFwFo+1XAafJ4IXNIGG+4x/SodXLDQlrN9/6kVzHF54cVo3ICd2KOi3RgdMvR8nghLUZFOpQbFQ5UmqTHUXH2djUz6FS+fwL960vyWCEtZGik/kzFu4pWbODdP/EhYZz+q+mPOxx9FOhXu8K4/iR5rJADZGaa3/QPjo2JvLPl9ptLLrzq2rupJHtNmKT/Mf2JCw7k82Z7n1MWZp+eJfd3p2M/jTLLvl3l+ynQr64ZHh09TB4rZJZMX4zyGxEOQyPZE+T2azVBlP67aeMG2SYqY73c591IGKfPNsu+2bE+QF8Kouxj8jghjqg19YeaDbZNbkA4/bXdEf/CJPuooz1US08KABtbmCqKS2Cv28J4w/3lcUJEFDP9tSxI9K/l9mslQaSfpri/oh/0rACwGRrRJ/MUD7DPt+QxQvZL4/tDudEwu2VyG7YS87ofONpC9bRVAKik/kL539rNYKQfZNZj3LFuQP+p6efKY4Qs2Hvj");
    imageData.append("n16f22CYVRBnX5DbsVnsUMGKr1j6RXsFQJyuMq89R/73dmNHqDTtjTrWD+g3o3YobXmM9H3sTRKOjYUDsKOwye3YLMHV9fvKdlBZ8ykA7OsDO+Sv/Hk7WbJ68lgV6cixjkBfMde698njo6+zdNX4CYq7hucsjNNPyG3ZLEtXp38n20FlzbcAsJ8yfa2odyx2VLQg0Zc71hPoJ38J443HyeOjb6Pi7ALHRkITFABoYt4FQMOl566sHyl/r50wnTAwbbE8Nvoyg0n90WZj7HJsIDRBAYAmiioApoIk/eXiVWN3l7/bTux9KEGsvyyXAfSRnaqmT5LHRt/FbIifODYOWkABgCYKKwCmRToq6qNLO3y1KQLOyy0D6BNhor8nj4u+ylCUvkhuFLSOAgBNFFsAzBi1N5LK17QTWwSYk+DnHMsA+sJQpJ8nj4u+iL272GyAdXKDoHUUAGiiEwWANR7G2YPl69qNae8jjmUAlRfGOu7LydxUol8nNwbmhgIATXSqALA2hnH9UfK17YbphNG3In26PB4qHftYkWLQn3mjAEATnSwArBuLnOpURdm/KKYTRt9J/2BvjJXHQ2UTJum78hsBc0UBgCY6XQBYtxT5PWaQ6JeYNrc6lgNUlp2ZVR4LlYx9ntj8wZNyA2DuKADQRDcKAGtbGGcvl+20m6GR+jNNmzc5lgNUVKbtGBnyWKhczB+7MP/Hox0UAGiiWwWAtTOM9RtkW+0miOpPNG3e6FgOUFVnyuOgUlm+dvNRQZxucfzhaAMFAJroZgFg7Q4T/VbZXrsZSNJHKj4tRP/YFMYb7yqPg8rEvEP4sOOPRpsoANBEtwsAa08Q6Q/JNttNsGbigea8MeZYDlBF1fwUwL77N3/c9Y4/GG2iAEATvSgA9ipsOuGBkYl7K8YMQX/YVNS8G17Fvitw/LGYBwoANNHLAsAqbDrhwXX6GBVnv3EsA6iUMNbvkf2/1OHdf2dQAKCJXhcAhU8nrCL9M7kM");
    imageData.append("oGI2VupTgCDK3uf4IzFPFABooucFQENh0wk3HiO+zLEMoEKyd8q+X8rMjPqX6fwfiPmiAEATvhQAhU8nbNr8ilwGUCHjlRgd0I5w5PjjUAAKADThTQEwrcDphIeHpw42bQ7llgFUhDm//6vs96WKneXI/CGj8g9DMSgA0IRfBcCMQqcTNkXF5x3LAErPnN/XlnqmwCBJXyH/KBSHAgBN+FgAWEVPJ8zooqikoSh9kezvpYmpzlfKPwjFoQBAE74WAFah0wk3JhhjOmFUTLZC9vVSZGgkfWr+j0GRKADQhM8FgFXodML2O1PFdMKomKGR7Amyr3sfs+LflH8IikUBgCZ8LwCsW1RNP1euQ7tpTCd8u2M5QCmFiV4u+7nXsTf5KCrxjqMAQBNlKACsQqcTDqKJZ5k2b3YsByijHUXdONuVmIrlc44/AgWjAEATZSkArJ0q0q+X69JuVC17vGnzT47lAKUTxNmnZR/3MnY6Q7PCN8g/AMWjAEATZSoArF1FTiesavokxXTCqIAgTrcUNZpmRxNE+m1y5dEZFABoomwFgFXodMIDSf0hps0Jx3KAUrGD6sn+7V3MitbkiqMzKADQRBkLgL0Km07YHCf3UUwnjPKryb7tVXj0r7soANBEmQsAq7DphC9YWb+nR38X0J5a9njZt72JivRXcyuMjqEAQBNlLwCYThi4k+wC2a+9yJLVk8cqnr/tKgoANFH6AqChsOmEF4+NHW7+vu84lgGUwdbBdfoY2a97njBJz3KsLDqIAgBNVKUAKHQ64eHR0cMUA5WhvM6Qfbqnacz690fHiqKDKADQRGUKgGkFTyccxHppbhmA/34r+3NPM5hkz3CsJDqMAgBNVKsAmMF0wuh7QVR/ouzPPYuK0ovkCqLzKADQRBULAIvphNHvAtmPe5LlazcfpRh3uycoANBEVQsAq9jphOPsHYrphFEef7Wj7sp+3PWoJPt/jpVDF1AAoIkqFwAW0wmjb9n+Kvtw");
    imageData.append("12NW5Aq5YugOCgA0UfUCwCp0OmGV6NMUjzOjBIJEXy77b1fTuJjskSuG7qAAQBP9UABYhU4nPBTp5ylbWOSXA/hk99JVk/eT/bdrCaLsY46VQpdQAKCJfikArEKnEx4ayZ6gmNUU3ks/KPtu12JW4Lf5FUK3UACgiX4qAKxdQaLfIv+edmOnEw5ifZ1jOYAvEtlvu5KhkYnHOlYGXUQBgCb6rQCw9thRSeXf1G4ax8t6x3IAP5hCVfbbjocBNHqPAgBN9GMBsFfR0wlf41gG4IOzZZ/taOwIWmGsU8eKoIsoANBEPxcAU0GcDjKdMPrAentNln22YzEX/6c7VgJdRgGAJvq6ALAKn0441j+XywB6bTDRp8j+2rGESXquXAF0HwUAmuj7AqChsOmE7ehrKkp/5FgG0EuflX21YzELG3esALqMAgBNUAA0MJ0wKu6Psp92JKqWPd6xcPQABQCaoADYX8HTCas4uyC3DKBHipwbY9YEsf4vuWD0BgUAmqAAyCt6OuHQsQyg64JIL5J9tPCYk8Mf5ILRGxQAaIICwK2w6YQbnwRc4lgG0G2/lf2z0NgBBxwLRY9QAKAJCoDZFTadcOPpgFHHMoDuWlN/qOyfhcWOsJVbIHqGAgBNbJD7v5WYd7S/cbRVRX8q6vEp245pb5djGUDXhIl+r+ybhUVF+ldygegdCgA0sVHu/1ZiXneZo62qKmw6YXN+/KKjfaBrOjZF8MxIWHqnXCB6hwIATdwi938rCeLs0462qqyQ6YQb58ibHe0D3bK9qMdd7xRzsflXx8LQQxQAaGbJ6sljZR9oloGk/hDz2h2yrYrboZLsNXJbzDU8JYWei/Tpsl/OOypOv55bEHqKAgDNBJF+muwDrcS89mzZVh+Y93TCg5F+kGlnj6NtoFuWyX45r9gJNUyjNzgWhB6iAEAzpgD4kOwDrcQe83065Le5eKcflNtjLjFtXOloF+iWTYVODjQ0kj3BsRD0GAUAWvAT");
    imageData.append("2QfmksEke4aKsotNOzc62q4sU/z8h9wWrSZMso/K9oBuGkzqj5b9su3Qof1EAYAW7Fy6avwE2Q/aiZ1QZ3CdPqZftPsuajCZeLJjPwBdY64NH5D9su2oOFshF4DeowBAK9r9GoC0l+VrNx+luA8AvfVj2S/bSqMzb3MsAD1GAYAWbVy2YuII2RdI52K2ed2xH4Bu2VrIMT8UpS9yNA4PUABgDhbKvkA6F7O91zj2AdA9RQxwFcTZF3INwwsUAJiDW5fUxh8g+wPpTBg1FR74rOyXc46dQ9vRMDxAAYC5SVeFcXyo7BOk+Jjt/fP89ge66irZL+eUC6+69m6K4X+9RQGAuUsHZJ8gxUdRAKD3tofxxrvKvtlyVFJ/oaNReIICAO0IIr1I9gtSbBQFADwQJOlzZN9sOaaBz8oG4Q8KALQt0l+0o/3J/kGKiaIAgAfmVewHif61bBD+oADAPP18YGTi3rKPkPnHblvH9ga67Reyb7YU+wyhefF2R4PwBAUACnB9GOs3tDvqHXFHUQDAD1vbuvF3aCR9qqMxeIQCAAWq2WlEh4enDpZ9hsw9igIAvqhlj5f9s2mCKHtfriF4hQIAHbDJ+JK9AdiOAir7D2ktigIAngii9N2yfzaNeTfwDdkQ/EIBgA7bZWwwfmoMG0PmvBD2lTj7b3kMtRJFAQBfRPqrsn82TRjrNNcQvEIBAHTcJnkMtRJFAQBPmGv5mOyfB0ywdv3xshH4hwIA6DgKAJTdnotqm+4l++isGYyylzoagWcoAICOowBA+UXpqbKPzho7eECuAXiHAgDoOAoAVED6cdlHZ02Y6O/lG4BvKACAjqMAQPlF2cWyj84a84J6rgF4hwIA6DgKAFTBuOyjzixZPXms48XwEAUA0HEUAKiCPYPr9DGyn+aiIv18x4vhIQoAoOMoAFAJQTTxLNlPcwmT9Cz5QviJAgDoOAoAVIId3Vf201zML35FvhB+ogAAOo4CAJUQJtmFsp/m");
    imageData.append("EsY6li+EnygAgI6jAEBFZL+R/fROWTQ1dZD5xVvzL4SPKACAjqMAQFXcdMBpv7k4lAsFANBxFACojKWrJu8n++q+mAvKi+UL4C8KAKDjKABQGUGS/ZPsq/vCEwDlQgEAdBwFACrjgE8CqDi7QL4A/qIAADqOAgDVEelQ9tV9CZL0l7kXwFsUAEDHUQCgOiL9M9lX98X8wmTuBfAWBQDQcRQAqJIJ2VenE8Yb72p+uMfxAniKAgDoOAoAVMnuxWNjh8v+agqA+qMcvwyPUQAAHUcBgEoZjMYfLvur/f7/FfIX4TcKAKDjKABQKfZxf9lf7RgAH5C/CL9RAAAdRwGASglj/R7ZXxcEsT5P/iL8RgEAdBwFAColiLMvyP5qxwC4RP4i/EYBAHQcBQCq5puyvy5QkY4cvwiPUQAAHUcBgIpxzApofrA5/4vwGQUA0HEUAKiayTt1VvtcoGIMgNKhAAA6jgIAVbMrjOND93XWwUg/yPFL8BwFANBxFAConCW18Qfs66xBpJ8mfwH+owAAOo4CANVTS59yR2dN0lfmfgHeowAAOm6rPIZaiXldzdEW4Icoe9l+nTV7e+4X4D0KAKDz7vRxaQsZHh09zLzuJtkO4Isw0W/d12HN//mU/AX4jwIA6Dw7Sqo8jg6UINEvkW0Afkk/fkeHjdPB/C/AdxQAQFdsHlynj5HHkiv27mrz+2scbQDeCJPs/H2dVkXZxfIX4D8KAKA7zLv6y89dWT9SHk/7Z3h46mBzYr1Qvhbw0PC+jmv+zxWOX4DnKACA7gljHQ8m+hR5TNkMJPWHmN/5sXwN4Kdsxb7Oa/7DuvwvwHcUAEDX7QkS/esgSv/T/O8zjbONnxo7Hb8LeCq7et9FwfyHev4X4DsKAADAXIWxTvddFMx/uEX+AvxHAQAAaMNfpy8Ii1ZMHaKYB6CUKAAAAG3YY29aXbBk9eSxjh+iBCgAgI7ZGsb6d0GS/dD876+ESXpuEGUfM/++yw6i");
    imageData.append("YqlEv27v/zY/e18Q6UX28SoVp19Xkf6VijNtXrvL0TbQc9OPtoZx9mD5A5QDBQBQiN8re5GP0w8MRfp55t/7yOOm3dhxAYZWTz7MFASnm4LgM+bf75tl/cmxDkBX2WvBAlUbf4z8AcqBAgBoR/qHINbnDUbZS8N443HyGOl0pqam7hLGE48wx++bzfoMG3/JryPQWWFcf9QCOyuQ/AHKgQIAaMkec9FfZd6Bv99+4imPiV5n+j6sWvaPtigxrnOsP1A4UwA8aUGQpM+RP0A5UAAAs7OPOtljJFgz8UB5HPiaRVNTBw2N1J9p1v8rxlb5NwFFCaKJZzFxRYlRAAA59ommy4ai9EX2Yir7f5mybM3E35i/5QxTyIw5/k5gfqL0VFsA/HPuBygFCgBgn+1BrJeqmj5J9vmyxxYyKklfqeLsN46/G2hPpE83BUD2xtwPUAoUAIDebQz7+N1+J2KfUjBv2kYc2wGYkyDS/7bAVJVvlz9AOVAAoL+l31Fr6g+VfbzqsU8RBFH6KrMNNuS3CdAaO37FAjuwhfwByoECAH3qGlXTz5V9u9+ybMXEEWZbfMS41bGNgAMK4+wddh4AO6NV7ofwHwUA+swO45zh0dHDZL/u59inHBRTEWPuzlhgh7B0/AAlQAGA/pGusoPnyP5M7oiK9OvNtropv+2AvDDR77VfAZwlf4ByoABAH9htB8jhXX9rmfk0wA56lNuOgJB+cEEY6w/nf4AyoABAxW20I+TJPtyL2NH67OQp9gI7NKJPtqOo2UHUBhN9ih3r//xadmIYb7iHfF0vYu8NCOJ00LE9gf0tXGCqgI87foASoABAhV1V5KQ8rSa4un7f6TkCkvSs6XEFYn2Fcb1j/WZjZ/9bb2cRnJlBUL/Njri2fO3mo+SyOh1ToLxCMc8AZmFnt7T3AHxM/gDlQAGAilpmZ9GTfbcTuai26V5hrF9tv2Yw/8ZqZiRBuT5F2NVo/xz7LL99ly7XpROZnomQ");
    imageData.append("xwXhMF0A8BVAeVEAoGrshbjTQ/jaj/Knxz+J9ErVuQt+M1tVnH7dDlk8PDx1sFzHIrN01fgJZnk1xzqgvy3kJsASowBAhewJIv0h2V+Lysxwuvo0s5xvGdscy++ljUGcfcHeWyDXu6gMjG452iznp45lo0+Z68cH7EiA75c/QDlQAKAidqkofZPsq0XEfpXQGO78Wsdy25Bdbc+Zg0n2jCBK/8G+g7cXb/OzG/K/O2d7VKS/Pz1NaweyeGzscLOMbzqWiz408xhgrN8jf4ByoABABWwz/fjFsp/ONzOj5GXvtFMCO5bZju22vdm+npiZuS/9uuN1bQkSffn0dK0Fx37dECbZhXJ56Et2IKD03Y4foAQoAFBy9sa4V8s+Ot9M38Vf3IXf2m1n45PLkbFj9JvfXeZ4/Xz8YDDSD5LLmk9sERPE2dccy0IfmR4K2D6mIn+AcqAAQIntVlH2L7J/zifTg+BE+vuOZc1PpEO5rNliP3kouPiwttpj3X6EL5fXbuy4Bqbd7zqWhT4RJPot9iuAN8gfoBwoAFBW0zcgFZTpG/xivdC4TS6nCPaYkcs8UMxrzpBtFOSPQyP1Z8rltZtzV9aPbDwJIZeDfpDo1y0wVcA/536AUqAAQBnZAXZkv2w39hE3+325XEaBRuUym8V+ZO9opyh2oKFPznYvwlwTxhuPM28CxxzLQcXZKaVtAfAS+QOUAwUASifSv7IfP8t+2U7sULymzU25ZRTIjugnl9ssjY/Xd8u2ChXpn9niRy67ndjHD02bt+SWgWqL0lMX2Hm1cz9AKVAAoEyCON1ih9qVfbKdNIYwt++Gc8spVJRdLJfdSsxrb8+1VbxN9nFEuex20hg2uFeDIqEHpp8yGUwmnix/gHKgAECJ7FZJ/YWyP8419jE201bgaL8z/C4ArG1FPUmhIv1FR/uoqCCqP3GBqo0/Rv4A5UABgBL5rOyLc01PBrLxvwCwdtmnueQ6zDWN7cuQwX0iiLK/");
    imageData.append("XxDG2YPlD1AOFAAoiSvn+73/4lVjd1dxtsLRdmeVowBoSD8u12OuGUjSR6oOPU0Bv0w/3bJk9eSx8gcoBwoAlMAtS2rjD5D9cC5pPK72K0fbnVeqAmDaR+S6zDV2iFhHu6gYOynW3u/UuPmjhCgA4Ds71Ljsg3PJzNC1+tuy3a4pXwGwZ77zKkyPq8D4AFW3e9+jpOb/3Oz4BXiOAgB+y34zn+fV7dC6dsyAfLtdVL4CwNrVytDFB8pgUn+0aWeHo21Uw1/27WxzoGrHL8BzFADw2O6hkewJsv/NJUGcfdrRbneVswCwttonvOR6zSWmjS852kU1jO/b0eZCstbxC/AcBQC8FaUXyb43l9hpdpUPX02WtwCw6nakP7lurcZ+R2za+JOjXZRfbd+O7tkNNpgXCgB46rbza9mJsu+1mqWrJu+nfLnwlLsAmB7J0H6VItev1TBbbGX9Yt9O7ulNNmgbBQB8ZM4nn5P9rtU0htG9QrbZMyUvAKwwSc+S69dqwjg+1LQxLttEyUX6G/t2sorTgdwvwHsUAPDQLcHa9cfLftdqVJx9xtFm71SgADB2hHH9SXIdW405z7zZ0SZKLIj1eft2sPkPn5S/AP9RAMA35sTyX7LPtRpV0ycp3+48r0YBYK2z7+blerYS+7ow1qmjTZRUEGUf27eD7TCS8hfgPwoAeGa76ZP3kX2u1ZjX/8LRZm9VpwCwX828V65nq2FwoGqxn+rcsXPj7OXyF+A/CgB4ZR53/ps3If+Wa88HFSoAjJvbnY1x+drNR5nX3+BoE2WU6NP27dyhkfSpuV+A9ygA4JMgSv9B9rdWEsYb7mFev1m254VqFQB3vvlrjgni7Au59lBKdxojIlgz8UD5C/AfBQC8EelI9rVWEyb6U7n2fFG1AiCePm88Tq5vKwnjiUcoH8ZmwLyZovv+++3Y6Uc9dstfgt8oAOCLINFvkX2tlTQ+WvbjmX+XChYAxjfl+rYa89orHe2hXHbl");
    imageData.append("Zuc0/3Gj4xfhMQoAeOJ2O12v7GutxD6j7mjPH9UsAHYPjeiT5Tq3EjvRkKM9lEsm96vtsKsdvwiPUQDAD9klsp+1ksVjY4cHsb4u355HqlkAWF+R69xKGsMDb3e0h/K4Su5XRgMsIQoA+CCIstfKftZKSjHATHULgJ12yGW53q3EvPYyR3soiTBJ/0/uUzsfwBflL8JvFADwwPYLr7r2brKftRLz2qsc7fmlugWAtVCudyvha4CSi/Tn5T5dYKr49+V+EV6jAIAHfi77WCsJ4+zBqgx3lFe7ABiV691K7FgCqgz7Dk52gie5T01Vl71M/iL8RgGA3ks/KPtYKwkivSjfloeqXQBMDSb6FLnurSRkCvnSslNty/25dxzu3C/DXxQA6LWhkYnHyj7WLHZ6WvPa9bItL1W8ADC+JNe9lTAoUHkNrZ58mNyfC5atmDhCMRZAqVAAoMduGh6eOlj2sWaxA9E42vJT9QuAulz3VsLw8aW1a3h09DC5P6djfpg5XgBPUQCgx34i+1crsV8bONryU/ULAPc7wiYJ443HKe4DKKNxuS/3Rfk4GxdmRQGAHjtb9q9Wosr0GFkfFAAqzt4u17+VhLEey7cFnwWJvlzux30xvzAkXwB/UQCgp5L0lbJ/NYsdgtS89qZcW77qiwKgvaGBGTumlAK5H/fFXFA+4HgBPEUBgF6yj/LJ/tUsqpY+Rbbjtf4oAG5YNDV1kPwbmsXrSZwwmzPlftwX+3iA4wXwFAUAeujWdi4a5nVnOtryV38UAG0Vc0GUvkq2A89F+vlyP+7Lktr4A3IvgLcoANBD18i+1UqCOB10tOWvPikAVJSeKv+GZrGPgObagdfOr2Unyv24L43nc2+WL4KfKADQQ5fKvtVKzOt+7mjLX+0XAOW5zyGens/hffJvaJYw3nAP2Q689le5D3NRzApYGhQA6JkoWyL7Visxr53MteWzNguAMNbvMa//vbGhaKbt1Py7Vcl1nYcw0Ur+");
    imageData.append("Da3EvPbPsi34KUj0r+X+y8X84jL5QviJAgC9Yt4xfkz2rWYZGN1ytCrbs+NtFgCdThjHhwZJ9k8qzlbk1rkt2Qq5jFZiipHf5duCj4JYL5X7LxeeBCgPCgD0Shhn75B9q1lKOdy4pwXA/gmT9Cw1/8Jq9gFiDhDzuiscbcFPsz8BsDdBkj7H8UJ4iAIAPRPp02XfapYwrj8p147vSlAA2Jgi4D9y6z43N8g2W4mK0+842oKHBpPsGXL/5XLByvo91fyrSXQBBQB6xX78LPtWswxF+nmyHe+VpACw47ub9R3PrX/rtss2W0kQ6y872oJ/9tibNuX+c8b88oSjAXiGAgC9EkQTz5J9q1mCJH2FbMd7JSkAbOz5ILf+c7B4bOxw2WazKEaPLQU7bLPcd7NGxdklsgH4hwIAvTI0kj5V9q1mUZF+vWzHeyUqAGxRllv/Obiotuless1mCZPsfNkOvDQs992smW8lie6gAECvDI1kT5B9q1mCSL9NtuO9UhUA2d/n1n8O7EBwss1mUXH6P7Id+McUah+V+27WmAvLi2UD8A8FAHqFTwD8Sy8+ATCvWyzbgYeS+gvlvps1tiPkGoB3KADQK9wD4F/m+8kt9wBU1p4lqyePlfvugFEzo07JhuARCgD0Ck8B+JXGUwDzOWfzFEBlpX+Q+61pgjj7Wr4h+IQCAL0SxvrVsm81C+MAdC7mfP3p3LrPTZvjAOjvOtqCR2yRJvdb0zTGss41Bn9QAKBX+mYkwDi7RP4dvsVO5KPmP3ZLuyMBXuloCx5p51gtZ7XeZygA0Dvpx2XfapZSzgUQ6w3L124+Sv4tvc7w8NTBdtTWINGXO9a5De3NBaBmJjxytAdfBFH6D3K/NY29IcS8eJtsDP6gAEDPtD8bYD3Xlv/+FMY69oidgOdWx3q2jdkAK+vWRSumDpH7raUoJnrwGgUAeuhS2bdaiXndzx1tocfs1whyXzWLHVpWtgO/2E+I5H5rOQVMMIEO");
    imageData.append("ogBAD10j+1YrCeJ00NEWei1KT5X7qlmGRiYem2sHvvmk3G8tR0X6+Y4G4QkKAPTQbYumpg6S/atZzOvOdLSFHgvj7MFyXzVLEKWvku3AL+2M17EvjZt2dshG4QcKAPTSQFJ/iOxfzaJq6VNkO+i5G9op5oJIL3K0BX9sO3dl/Ui53+YUFaerHA3DAxQA6CX7DlD2r2axNySZ194k20JPfVPup1bCpHHeu0LuszknTPTnHA3DAxQA6LGzZf9qJeZ1lznaQs9kb5f7qJWEsR7LtwVf2Hv45D6bc+yQn7Jh+IECAD32U9m/WomK0w862kKPDK2efJjcR83SmC+mbGM69BVzfXi23G9zjv0OwTS2VTaO3qMAQI/dbAekkX2sWUy/fZyjLfRGXe6fVqKS9JWOtuCP29qZ3MmZ4kabQpEoANBr7YwyNjU1dRc1v4lrUJwvyf3TSlSc/o+jLXgiSLIfyn3WdkyDC+UC0HsUAOi1MEnPkn2slZjXni3bQvcNJvoUuW9aiXntOtkW/BEm+r1yn7UdPrLzEwUAPPAL2cdaiX2EUPEdcq+Nyv3SSpaumryfYt95bWhEnyz3W9uxz4gGcbpFLgS9RQEAD2y/8Kpr7yb7WSsJEv1rR3vonoVyn7QSFaVvcrQFTwSxvs5+zSb327wSJnq5XBB6iwIAXoiyf5H9rJWYAuAtubbQLTvtO3m5T1qJ/X7Z0R48YQqApXKfzTsqyV4jF4TeogCAH9LvyH7WSpatmDjCvlvJt4cu+IrcH61kcJ0+xrx2u6M9eCKMs5fL/TbvNGZ+Ylhgj1AAwBO3L141dnfZ11qJvYnQ0R46a3e73xHz8b/3ttkh/OV+KySKqTy9QgEAX9iP82VfayXL124+yrz+T7I9dFRbQ//amNde6WgP/vix3GeFRcXZ+x0LRI9QAMAXpgAYkX2t1ZjXf1K2h47ZY5/qkvuglQxG4w+3r3e0CX+cIfdbYbFDRjoWiB6hAIBP2hkUyKbx");
    imageData.append("9eJm2R6KFybp/8nt32qCOPuCbA9+GYz0g+R+KzRmIaNyoegNCgB4Zpnsb60miPS/OdpDsW4Orq7fV277VtL4quYGR5vwRna13G+Fx1SBn84vGL1AAQDP7Gj30bLG8MC/cLSJgsxndLggyt4n24Nf2rkezDlDIxOPlQtGb7SzwykA0ElBrP9L9rlWo2r6JMWTRp1yTRjHh8pt3krs68JYp4424ZF2n+yYc5gH2g8UAPDQLcHa9cfLftdq7BzmjjYxPzsHk4kny23dahiwqRSulfutYwkT/TnHCqDLKADgI3t+kP2u1SxaMXWI4lGzorU15K/N8OjoYeb144424RH71bzcdx1LGNefJFcA3UcBAE/ddn4tO1H2vVbTmGyGsQEKYIfttXO5yG3caoIofbdsE/6xX83LfdexNG7YoSrsMQoA+CqI9Zdl35tLVJSeqnjmfL7qYbzxOLltW01j2F8KMf/9Xu67jsdUhv/pWBF0EQUAPLYniOpPlP1vLuF+gHnZOjSSPlVu07nEtLHY0S7880m57zoee8ehY0XQRRQA8Fu6anh46mDZB1vNzCeN2QX5dtHELvMG7VVye84lg0n90aadnY624Zs19YfK/deVmAvQ2tzKoGsoAFACZ8o+OJfYAkJF2cWOduFmh/p9s9yOc4m9Z0BFeqWjbfhntdx/XUsQ6Q85VghdQgGAErhlSW38AbIfziXnrqwfadq5wtE2hCDKPia331xjBwyS7cJPdoAmuf+6loGR6/7WrMRuuVLoDgoAlMSV9vE+2RfnkmVrJv7GvCv9laNtNJg3ZIvkdptrBpL0kaat22Tb8NKu+TxtU0gUUwT3DAUASuSzsi/ONYvHxg437XzL0Xa/2xXG2Tvk9pprGtu35mgfPorSH8l92PWoRL8ut2LoCgoAlMhuldRfKPvjXDNzT4AOHe33q21Bov9Zbqd2YrbrFx3tw1NF7fd5pfH93F/kyqHzKABQJkGcbml3Nrr90xiH5JOK");
    imageData.append("rx83q1r2j3L7tJMgSV+hGHehTG5ctmLiCLkfexIq8t6gAEDpRPpX870fYG9M/3+2aXNjbhl9wFywf1nU97+NR7pvkcuAx6JsidyPPYuqpU/JrSA6jgIAZRQmerl9Fy/7ZjuxEw+ZNn8il1Fh9l36OfMZX2H/2CLCtDfhWA48Zs79j5P7sqcJY/07uZLoLAoAlNi8bwrcG3sxDJPso6bNrY7lVMl6+6mH/PvbzfSTFbFe51gOPGbH35H7sufh2dHuowBAmRX9DPNgpB9k2v2BXE4FbDfOKfI7X8ZWKLPsnXJ/9jyNapLnR7uIAgAltyeM9RtkH51vVKJPU9X5WPvnYTzxCPk3ziczn5jobzuWBf/dsnjV2N3lPvUiYZJd6FhhdAgFACpgu+nHL5b9dL6xz7Sbi9xbTfuZY5llcJUtZOTfNd80vi7hPF1WkQ7lPvUmdvav3AqjYygAUBE7gyj9d9lXi0gYx4eak+brzTKudSzXR1cFSfoc+XcUkeHR0cPMtviGY5koCe9u/pMJYx3LlUZnUACgQvbYuUVkfy0q9tHDxrPu31Uz36nL5ffS9UGsz1O18cfI9S4qA6Nbjlb99bREBaWr5H71LipK35RfcXQCBQCqJkz054p6RHC2hPHG44IofbdZ3mq5/C663RgOEv0S+ymFXMciMzAycW+zrDWOdUCJBEn2RrlvvYu9u9SO+CVXHsWjAEAVmXfDX7YfV8u+24nYcQTCWL+6MZjZqFyXAu1qfDp6jv1uv1s3cg2tnnyYWeYGx/qgXDbb+1rk/vUyKs4+4/gDUDAKAFRWpKMw3nB/2X87HXt8BFH6KrMOH7GFiP3Y1fzvP+fWb3Z7zPlPm39/akdrs580hHH2gm5d8PdP4ysPhmmvgDDRn5L719s0Rpfy7Xu2yqEAQMVtGhqpP1P24V4kjDfe1X5aYMcaGEz0KXa9hiL9vKGR9KmDSf3R0/99nT6m0x/ntxI7XoDZdoFje6Kcti1dNX6C");
    imageData.append("3M9ex6z0/zr+EBSIAgB9YI+9Qa5bXwmUPWpN/aGK7/urJUovkvvZ+wyNZE/I/SEoFAUA+sjqgSR9pOzP5I7YQZXMdrrZse1QZh18OqSjsTN/5f4YFIYCAH1mm/FJPg24cxrH9E8d2wslFyT6crm/SxM7wpf8g1AcCgD0qVHz5uL5sm/3W2bG808/rhiCvbrK3M/t87zmIrU290ehEBQA6Gdhor9nH3OTfbzqmTmv6ler6sx3AAf72Kjc96WLSvTr5B+GYlAAAHq3MTyQ1B8i+3oVY588sI9IOrYDKsYWeXL/ly52CE5FpdoRFADAPjvs3dJDI/pk2efLHjuBj7non656O3Ihushc/Mfsfpd9oZRpDLuZ+yMxPxQAQM6eIMl+aIqBU8t+Ap0ZV0C/x/xN6x1/JyrMzmQp+0NpM3Ozit4o/0jMDwUAcEB2KuCzy/T1gC1apj/mnxlHxc4XIP8mVF9WmmF/W42paN7r+EMxDxQAQMsSO9ugjzcN2tEDzbH8bBWnA2Y9NzvWHX0le6fsI6VP41OATfk/Fu2iAADassFebO1Y+b0YYtXexW/vVTAn+rcblygG78Ed6pV79783prO/3/EHo00UAEAh/qgi/VX7CUGQZP80MHLd3xY1JbE9mU9f7JPsNUGU/qdZ1g+MGx3rAEyFSfou2YcqEzuhhuIjrsJQAAAds03F6R/Mvz8OE73cFAhftIPu2K8y7Q1alikY/m3v/zYn7rOCOPv09Mf4kf6Ged2VxqSanh0w1zbgMlnZd/97E0TZ+xx/ONpAAQAAVVHB7/5lZqaqnJ4v27EBMBcUAABQCRN9M8eFuXC92bEBMEcUAEBPbDNvYn5jhyJWMx/13+L4HaBl9uskea6ubBqjA14rNwLmhgIA6Kq/2K8wL7zq2rvtf0zZTzUbU/Ha7/zla4Bmrlk0NXXQ/n2q8gkS/c+ODYE5oAAAumai2RgCwdr1xzNOP+YqjLOXy75U+djHbMwfn8iNgdZR");
    imageData.append("AABdsS2M64+Sx5IrAyMT91Y86YSWZb8p6pHT0iVI0ufkNwhaRQEAdMWX5HF0oNi7uR1tADlhrJ8u+09fxWyES+VGQWsoAIDOGxqZeKw8jg6UMN5wD/O67bIdQBiWfafvMhiNP1zZqTzzGwdNUAAAHbejnRu0zOt+62gL2Gt7mSap6mgak2DIDYQmKACAjrteHkOtRMXZCkdbQEP6P7LP9G0uqm26l9kof81vJBwIBQDQcZvkMdRKzOt+7mgLsP58wcr6PWWf6euYiuiDjg2FAwgivUhux2Y5v5adKNsB4BbGOpXHUCtRkf6VbAuwKj3hT7uxc2KbjfN7ubEwuyDOviC3Y7M0BmG6XbYFIC9I0l/KY6iVmNfWZFuAirOrh4enDpb9hSyYrpqfn99gmE0Q6y/LbdhKzHb+vmwLgNNCefy0EvO6zNEW+tseVcv+UfYVsl9MhXSJY8PBJdIr5fZrJYPJxJPN63fn2gOwTxCnW+wjffL4aZbGtOdMA4w7CeLsa7KvEJFgzcQDzcbaKjcenG6yH+nLbdhKzGsXOtoDMGObqunnyuOmlTQKbNke+tstwdX1+8q+Qhyxd7c7NiAcgqj+RLn9Wo2K9OvtuxzZJtDnfmsv4vJ4aTVhkn3U0Sb6WJikZ8l+QmaJnRdZMZBGi7LPyO03lyxfu/koUwicHsTZp82/IdCX4nTAvvGww5PP9yYt097K/HGKPlZr95Pavo2qpU9RfE/diol2RiojhBQfO7qb4vt/3GHnYKJPkf2EtBCz8RY7NiiEvpxOkhAPEybZ+fL4RB+L9OdlHyEt5sKrrr2bijOd26i4kzDWcd9OKUmIJ2kMssUNzNhrg30iRPYTMocMRemLHBsWUpS+SW47Qkj3ouL067njEv0r0s+XfYS0EQ6sltywdNXk/eS2I4R0PmGcvthxTKJ/LZN9hLSZYO36480GvcGxkXFnV9ohleX2I4R0LmG84f6K8xPusJnJfgpOGOs3ODY0ctKv");
    imageData.append("81QAId2JHSnQvPtfmz8O0beS7DWyn5ACYjbuT3IbGw7ZBfN9lpkQcuCE8cbjgkSP5I8/9LFLZT8hBaUxl/2tjo0OKdLfX7Zm4m/kNiSEzD8DSfpIc5xdmzvu0M9uGhi57m9lXyEFJkz0Wx0bHm4bgkg/TW5DQkh7sY/b2iduFG9EIARJ9kbZX0gHouL0O3LjY1Z7zAnroiW18QfI7UgIaT2NSX6udBxjwDdlfyEdyvR3b7G+zrETMLsdYaKXB9HEs7hJkJDWcu7K+pFBlL1WRfpnjmMKsLLBdfoY2XdIBxPG2QsUY263a3NjbIUz7GAVQ6snH2ZHMbOdGOhX04/z1fRJKspeFsb6w0GS/dAcI7c4jh9gr91DI/VnyusT6ULCJD3XsUMAAOiGz8rrEulSFo+NHa7i7GrHTgEAoGPsHCx26np5XSJdzPRHdkzAAQDonlsHo/GHy+sR6UGU/S47v4MAAChcGKdvltch0qNMP5sb60vlTgIAoFjpd+Q1iPQ4S1eNn2B2zvX5nQUAQCEml6yePFZef4gHCeP02WYH7XTsNAAA5mPHYJI9Q153iEcJk/Qsx44DAKBt5tryLnm9IZ6lcT/AN+XOAwCgHUGcfU1ea4inGRjdcrTZab+VOxEAgLkI43RtGG+8q7zOEI9jh7c1O++vcmcCANCiP4dx9mB5fSElyGCUvVQxXwAAYO52qyg9VV5XSIliduJnHTsWAIAD+aS8npCSxU59a6q4Hzl2LgAALpcybXpFcsHK+j3NDt3g2MkAAOxvgsF+KpYwTh9nduxtjp0NAIB182BSf7S8fpAKxBQBLzY7eJdjpwMA+tsue+O4vG6QCiVM9HsdOx4A0McY6a9PEsT6PLnzAQD9ybwx/Jy8TpCKZvrJgDj9juwEAIC+8y3u+O+znLuyfqQpAlY5OgMAoA8EiR5hmN8+zcDIxL3DWKeyUwAAKm88WLv+eHldIH0UVdMnmY7wZ0fnAABU042D0fjD5fWA");
    imageData.append("9GGGRurPNB1iu6OTAACqZXsYp8+W1wHSxwmS7I2KiYMAoMp2B1H2Wnn+J2RBGOv3ODoMAKACzMX/ffK8T8i+hIn+lOw0AIByM2/wPizP94TkYjrLObLzAABK62x5nifEmampqbuoOB1wdCIAQInYkV/lOZ6QA8YWAabjLJWdCQBQGsvsuVye3wlpmuHhqYPDJP0/R6cCAPjtW/YcLs/rhLScMI4PNR3pUkfnAgD46buLVkwdIs/nhMw5w6Ojh5kO9WNHJwMAeCRI9OXLVkwcIc/jhLSdgdEtR5vOdZXsbAAAPwRJ+ksm9yEdyfK1m48yneynstMBAHruF/aNmjxvE1JYFo+NHa7i9DuOzgcA6I1L+difdCWNGwOHHZ0QANBF9kkte06W52lCOpaZRwSzC2VnBAB0zdCiqamD5PmZkI5nZsRA/SVHpwQAdFKULWGQH9LzmM54dq5zAgA65Rx5HiakZzEdcqGjkwIAChTG6Sfk+ZeQnidM0neZDrpHdlgAwLzZc+uZ8rxLiDcJkuyNppPucHReAEB7tgVR9lp5viXEuwRJ+hzTYf/i6MQAgLm5cWik/kx5niXE2wyN6JNNx51wdGYAQGs2hPHEI+T5lRDvMzAycW8V6cjRqQEAB5SuCtauP16eVwkpTez8AWGiv5fv3AAApyi7+NyV9SPl+ZSQ0sWOGhjE+rxcJwcA3Ik9VzK6H6lcTOc+09gtOzwAQO+yj1LL8yYhlUkYZy83Hf02R+cHgH51S5Dol8jzJSGVy2CiTwljnToOAgDoN+sHk/qj5XmSkMpmyerJY03H/4njYACAfnHZ4Dp9jDw/ElL5TN8cGOlFivsCAPQXO6zvOdzsR/o+KtGnKUYOBNAfbrL3QsnzICF9G7Wm/lBzYFzjOFgAoCKyq83F/8Hy/EdI32dgdMvR5iD5Zv6gAYByC+Lsa3ZgNHneI4TslzDRb1XMKAigGnYaC+V5jhAySxozCl7vOJgAoCwmg0g/TZ7f");
    imageData.append("CCFNclFt071UpL/vOKgAwHPZJfZxZ3leI4S0mKmpqbs0vhJg9EAAZbDVOFOeywghbWYgSR9pDqqa42ADAD9EOhpaPfkwef4ihMwzi8fGDjcH2TmKgYMA+GWPncVveHT0MHneIoQUGFXTzzUH3KTjIASAbsuCaOJZ8jxFCOlQwnjjcebA+67jYASArggT/e0LVtbvKc9PhJAuJIj02xQ3CALorpuDJHujPB8RQrqcpavTv1OR/pnjIAWAol22pDb+AHkeIoT0KPs9Lniz44AFgPm60Z5j5LmHEOJJzq9lJzJ4EICCDdv7juT5hhDiWeynASrJ/p85aG9wHMgA0Kpx84bi+fIcQwjxPIPr9DHm4A3NQbzHcWADwGx223OHnaFUnlcIISWKqmX/GMb6d46DHACkdUFUf6I8jxBCSpplKyaOCCK9SM2M0y0PeAC41bxR+HAYx4fK8wchpAJZumryfmGilzsOfgD961Ie7SOkTxIk6XPMQf9bx4kAQP+4NoyzF8jzAyGk4rETdwSR/pA5CdzkODEAqK4bjTMWrZg6RJ4XCCF9lCWrJ4+1M3mZE8JOx4kCQHXssHf3X1TbdC95HiCE9HEGo/GHmxPEsOOkAaDkgkRfPjSiT5bHPSGE7Isd+MOcMNbIEwiAUlptHwWWxzkhhDgzPbdArF+t4vQPjhMKAP/93h7D9liWxzchhDSNvUlIRfr15mQy4TjBAPBPZift4QY/QkghOXdl/cgwTj9gTi7XO044AHosiPV15t8z7NM98vglhJB5Z/nazUeZk8yZxkZ5AgLQE7YoX2iLdHm8EkJI4Vk8Nna4/Zix8a5DnpAAdB4XfkJI7xLGG+8axvo9Ks604wQFoHgbwjh7hy3C5fFICCFdj51ApHGz4DWOExaAeQrjdK09xri5jxDiZewjRyrRp5kT1lXyBAagLb8Ikuyf5LFGCCHeZjDRpzRmHtzhOKkBmN12Y3gwmXiyPK4IIaQ0GRiZuHcQ6UXm");
    imageData.append("hPYnx4kOQEMQp1vMv+fYabvlcUQIIaXN9A2DiX6rYphh4E7CWMcqSt+0bMXEEfK4IYSQSsV+PWBnJTMnv9vkyRDoE7cbw0ORfp48PgghpPK5YGX9nirO3m9OhNc6TpBAFf3WOGPZmom/kccDIYT0ZeynAkGszzMnxxsdJ02gzP5qb4jl3T4hhBwg9ntQO4uZnb/cnDj3OE6mQBnsNq6y973YIbRlPyeEEHKADIxc97dqZu4BxhVAWYzap14GI/0g2Z8JIYS0EVXTJ9kTaxjrMcdJF+gZ0ydT+/XV0MjEY2W/JYQQUlDsaINhXH+SivTnzcl3gzwZA13yR3PR/y9774rso4QQQrqQoRF9cmOgoVHHSRoo0gb7Tt+843+67IeEEEJ6GPu9a2OwoUvVzHCq8gQOzMUuNXP/yUL7FZTsb4QQQjyMfc5aJdlrVKS/2hhiVZ7cAZfN5l3+l02/OX3xqrG7y35FCCGkZLGfDpiT+5mNxwvtKGzyxI/+tLXRJxba7/PtPSay7xBCCKlI7LwEdorVmRsJs9+Yk/9Ox4UB1bTDXPB/bW/gM/v/+Yy/TwghfZyB0S1H24uBKQY+Yy4QVxjbHBcOlJN5h5/+0vx7tqrp59riT+5/QgghZDqLVkwdYp8usDcU2iFc1cwTBoxKWA4b1cxNoAvt3fq8wyeEEDKvLF01foJK9GmmIPiUubh81w7+4rj4oLsmVJxdEsbpJ4JEv+Si2qZ7yf1GCCGEFB47m6Gd4EXF6Qcbd45H5qJ0i+NChfm52VitovQic7H/QJCkzxlcp4+R+4MQQgjpWexd5MGaiQeai9WpYZKeZd6hXmCsMBewTPE1woHsNttJm39/YQzZokol9RcuqY0/QG5jQgghpFSx30fbewsGo+ylYaLfqyL9RfPvt5V9dzvz3XWVCwT7t5m/MV1l/v2W/duVnegp0acNJOkjF4+NHS63FyGEENIXGR4dPcyOVxBE+mlBkr7CvCN+5/Q9B1G2");
    imageData.append("xH7XrWaeUFinZj5NsB+Ly4tst9l1sOti1+kKs54X23W16xzG2TuMl9u/Zenq9O/s3yb/XkIIIYS0Efu0QhhvPM5caB9sB7EZTCaePH1Pgr1ZMdavDqL03xtPMrx15usIvfBA7O/s/f3p15o2bFu2Tdu2XYZdll3m8PDUwXJ9CCHlyf8HqzjHZPzXwLAAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image60d61ebf0f6b88c08ee65388f38b237c = new WeakReference<>(result);
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
BufferedImage image60d61ebf0f6b88c08ee65388f38b237c=getImage60d61ebf0f6b88c08ee65388f38b237c();
if (image60d61ebf0f6b88c08ee65388f38b237c != null) {
    g.drawImage(image60d61ebf0f6b88c08ee65388f38b237c, 0, 0, null);
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
	private recent2() {
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
       recent2 base = new recent2();
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
       recent2 base = new recent2();
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
        return recent2::new;
    }
}

