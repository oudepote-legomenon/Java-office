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
public class selection_pane2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image2b41099965818844b42c0eeb0ea564aa;
private static BufferedImage getImage2b41099965818844b42c0eeb0ea564aa() {
    BufferedImage result = (image2b41099965818844b42c0eeb0ea564aa != null)
        ? image2b41099965818844b42c0eeb0ea564aa.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(20736);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAA8iElEQVR4Xu3dCZQc1Z3ne+zxeNweP7efp6fdnj7dtk+f7tfPdrvd43PGY7syVYDAwgzQYPZNRgIjBAYkJIFY7MJ7ex40NmCUmUKlBe0qbaUqlTbkHdrTGGxJXuRFZGZVqfYsLUiWVKp4cUuSkX+ZKuXNjIiKyPh+zvkdOKD6V0To3oibN+NGnHMOAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADwXTKV/4dkJv/NRDq3081BN84Yx2zDzrp0/on6ubkP6vYC8A79H4ihi7716/+UyOS+7Xa24yU6YVgyVJfKPfWBFbverNsPoHL0fyCmTOevS2efL9HhQpr8Nk4CgDfo/0CMuZ3qmeJOFvo8qfsBwF6C/g/Ek/nOLxHuab8zZegT6ewHdH8AlI/+D8TYyRt+tHNFJY/r/gAoH/0fiDG3E+0q0bEikbpUbofuD4DyJej/QHy5HemAdqzoJLtf9wdA+RL0fyC+ijtVtKL7A6B82p+iFt0fABa0Q0Utuj8Ayqf9KWrR/QFgQTtU1KL7A6B82p+iFt0fABa0Q0Utuj8Ayqf9KWrR/QFgQTtU1KL7A6B82p+iFt0fABa0Q0Utuj8Ayqf9KWrR/QFgQTtU1KL7A6B82p+iFt0fABa0Q0Utuj8Ayqf9KWrR/QFgQTuUbbSeLa3nQ3x7n/jHHs//STKTuzORyW9NZHJ7E8E/U73HzXcS6fzn6p/ueZtuXzXM29bq0rlJbv02N50lfrfPyXa7//yBe2xn1jfueYduXzWSmVffV5fJfy2Zzr7s/o7B4t/ta46PtBW3zbjHd6ppQ7p91TDP9j/5eN+diRNtX3+/p9Hfb0vr2UbrAbCgHco2Ws+W1vM5nr1PfFwme0EynWsv8TvGKh2J1KsX63ZWYtyc9o+59X5d4neMTTK5Pvef1+p2Wmtw");
    imageData.append("3ugOLB51ax0p+h1jl3xiTvZ83VRb5pW+7nH6diLgQahuhy2tZxutB8CCdijbaD1bWi+YVPc+cbfGtW6OFdcd8wzVZbI36/bacGt80s2hErXHOsOJVG6abm/ZHOcNdZnc4hJ1w5BjyXT2at3kcpmLf106+3yJur5Ht8WW1rON1gNgQTuUbbSeLa0XYCp6n3gik/+Q+7OHS9QLS36fSL3633W7y1H/zJ73uj9fKFEzLDnuXujG63aXI5nKPlCiXphyqNKvqNyffaZEvUCi22JL69lG6wGwoB3KNlrPltYLMBW9T9z9uU0laoUq5tOgbnc5Eun8Qq0Vtoy8Aa7BeaNu+2g+mvnduxJReOlNJrdRt/1szHf+iYCn/U+Pbo8trWcbrQfAgnYo22g9W1ov4Fi9T/zkJ2StEcrUpdv/Trd/NONTv/3TRLi+Gz9jxmVyCd3+0SRTufu0RlhjblDU7R/NyRv+iuoEFd0eW1rPNloPgAXtULbRera0XpCxfZ+4+wn5Nq0R1pg7zHX7R1M3J3uJ1ghtMrkv6vaPJpnOtRbVCGncC/pk3f7RuD+zS2sEGd0eW1rPNloPgAXtULbRera0XrCxe5+4e1H9UnGNcCaZzn9dt380I8sZS9QJZTK5+br9o0mM8UXSLtlHdftHkxjjrzZ0e2xpPdtoPQAWtEPZRuvZ0noBZ59uz2hOLiHTGqGMWeeu2z8aM2OgNUKcRt3+0ZiZnhI1QplkKtug2z8aM4jVGkFGt8eW1rON1gNgQTuUbbSeLa0XZKy/Akjlb9UaYU1NfwVg+Sk5Sl8BmIcv6faPJjHGsxu6Pba0nm20HgAL2qFso/Vsab2A85huz2g+Pvd370mY9ejFdUKX5Jz83+r2j+aj3/r12xMRuQkwMTf7Cd3+0ZjnBxTVCGeGk/M6/kq3fzTmCZcl6gQW3R5bWs82Wg+ABe1QttF6trRegBlKzMm+X7fnbBInHo2rtUKW/Dbd7nKY79aLa4UuP6vZ");
    imageData.append("ZYDpbItu+9mYZwckTFsuqhVMdHtsaT3baD0AFrRD2Ubr2dJ6QcUsn9JtKcfJdddhfFLeqRz+eLr9w7rd5ahLdf61+/MDJWqGJUPJzKvn6XaXw7xToES9MOW1Sgakhnm8dYl6gUS3xZbWs43WA2BBO5RttJ4trRdQtnwk9e//UbelXOaxrYlwPgr4mHuhu1G314Z5x0EinAOcYfe436PbWzbHeUMilV1Uom4YcjSRyV6pm1wu81jrkRdSFdf1PbottrSebbQeAAvaoWyj9WxpPZ8zZD75V3PxP8W8wCWRyuVK/I6xSt7NJ3U7K5GYm/8f7sXylyV+x1ilty6VvUq309rIICD3SMI8Lrn4d4xVsnWZfL1uqq2RQUA692Qi4K8DdDtsaT3baD0AFrRD2Ubr2dJ6PuTAyWVgj1U6xXom5lWubt0pdenc5sSJV+YG/EhW88rc/DZzx/+FC7v+s25fNcwgKZnKTjTfSyfMmwaLfre/cfepy833zFP8zFMKdfuqMXIzZyr3lUQq/5NE8O8+MG2k07QZ9/jeXt+45y26fdUwj7d26z9+ss37ft+D/n5bWs82Wg+ABe1QUYvuD4DyaX+KWnR/AFjQDhW16P4AKJ/2p6hF9weABe1QUYvuD4DyaX+KWnR/AFjQDhW16P4AKJ/2p6hF9weABe1QUYvuD4DyaX+KWnR/AFjQDhW16P4AKJ/2p6hF9weABe1QUYvuD4DyaX+KWnR/AFjQDhW16P4AKJ/2p6hF9weAhbF+n3iV2af7A6B89H8gxhJj/D7xamKedqb7A6B8Cfo/EF9j/T7xKvOY7g+A8tH/gRgb6/eJV5Ehr5/tD8QN/R+IubF8n3ilMW/10/0AYI/+D8TYWL5PvMJs8eKVvgDo/0DsjdX7xC0zZEb+dH7AW/R/AIG/T7yMHDi5LY/xnR/gL/o/gLKV6LBW0XoAokP7s220HoAI0Q5tG60HIDq0P9tG6wGIEO3QttF6AKJD+7NttB6A");
    imageData.append("CNEObRutByA6tD/bRusBiBDt0LbRegCiQ/uzbbQegAjRDm0brQcgOrQ/20brAYgQ7dC20XoAokP7s220HoAI0Q5tG60HIDq0P9tG6wGIkOreJ57dr/UARIfbjw8X9+uyc1jrAYiQRBXvE+d93kC0JVK532q/tshvtB6ACKnyfeK8zxuIsGQ6t6BEvy4vqdw8rQcgQqp4nzjv8wYiri6dHV+ib5eVZObV87QegIip5H3ivM8bqA1uf27T/n32ZFu0DoAIquB94rzPG6gRH3/mN3/u9uk9Jfr5mfK7+lTnn2kdABFV5vvEeZ83UIM+8WzuvyXTuRdK9HlJ/oeJ1Kvv1p8HUANKvE+c93kDcdDgvDGZyk4cucinc8dPu/AfN/+tLpO92fwZ/TEAAFAjPvFs7/9lBvwm5t/1/wMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACoWv0ze96bSOdvS6Szj44klb/143N/9x79cwAAoAYkMvkPJdK5TcVvADuZTG5jMpX/B/05AAAQUe4F/lo3h4su+sU5lExnr9afBwAAETMuk73AvbAfK3GxP1OOJeZkz9c6AKItkXr1v9elc3PcPv4bN0dOxvz7M8m5r/6T/nkAEfaxx/N/kkzn2ktc5EdPKpczP6v1AESP6ctun57n9u3hor7+eoYTmWymvnHPW/TnAUSQO9qfWqKjl5spWg9AtIxc/NO5H5To3yXjnjO+xyAAqAGJTH6rdvBy454INms9ANHi9uO52rfPFvM1gdYBEDGJTG6vdm6LdGo9ANFhvvN3+/HxEn37bDleN6f9H7UegAipsPOfypDWAxAdyXTu6RL9usxkv6X1AERIcae2i9YDEB116fwvtE9bZJfWAxAhJTq1VbQegOhIlPfsjzPlsNYDECElOrVVtB6A6ND+bButByBCtEPbRusBiA7tz7bRegAiRDu0bbQeSmto2/fO6a2Fe+9Y17du4oruPVcu2Xvg0kWdRy5q");
    imageData.append("7Dj+ycb245cu7Dxq/tuNK7o7p6zp2+b+2Ucebt73t1oH8JL2Z9toPQARoh3aNloPr2to7X/7tOaBb9y8ojt73rz8aE9YK5lkJudcuXjvwdvX9n5vZsvgrQ27nDfr7wCqoW3ONloPQIRoh7aN1sM550zd3vO2uzf0LbpofseQHq9qcsG89uGbVvbkTe0HthR4Ljuqpm3MNloPQIRoh7aN1ou7ezf0/6uZ1tfj5HXM7MCnT8wOfJfZAVRK25VttB6ACNEObRutF1ezW/vff9OKnrwen6ByQSOzA7Cn7cg2Wg9AhGiHto3Wi6NZGwtXeD3dX20uW9T5+9vX9r1wX+vArIbmzrfqNgOGthvbaD0AEaId2jZaL27MBXb8vHbrG/yCDLMDOBNtK7bRegAiRDu0bbRenJilevWZfNExCXP+6N6B1sIk7h2IN20fttF6ACJEO7RttF5c3N82cH0lS/vCFmYH4k3bg220HoAI0Q5tG60XB+ZCGcSd/kHn1HMHpqzp/Y6ZHajf7rxJ9x21RduAbbQegAjRDm0brRcH5ml9ehxqMcwO1D79O7eN1gMQIdqhbaP1at3dG/pTegziEDM7cMVze1/7w8qCRuctemwQPfr3bButByBCtEPbRuvVsgfbXnu3eW6/HoM4xhyHm1d177mneeDbDdv3/70eK0SD/r3aRusBiBDt0LbRerXsjrV9bbr/hNmBKNO/S9toPQARoh3aNlqvVt23ff+fTeDTf1k5/d6BB1sKH9ZjifDQvzvbaD0AEaId2jZar1bdvb5/ru47OXtGVhYs2Xvg9rV922e1FG5hZUG46N+XbbQegAjRDm0brVerrlvW1aP7XmluWN7tPP79g87Knx1zNv1q2Nm8e9hZ+spR52vbDziTmnqc856N1sOFbGLuHZi4sjs7o6Uw9+ttBz6gxxnB0r8f22g9ABGiHdo2Wq8WPbCx8F4vnvg3YX6Hk/nxYWfbr51RYwYFqX877MxoLTj//Fxn");
    imageData.append("UZ1aiZkduGrJ3oNT1/d//6Et++5qWMFTCYOmfye20XoAIkQ7tG20Xi2atmHg67rftrlwXvvIJ3692JcT83NxmR34zKruV5kdCI7+HdhG6wGIEO3QttF6teiza3q/r/ttk6Sbp390qOjCXknM7ICZRZjdNuhcs7Sr6HfVSlhZEAw97rbRegAiRDu0bbReLar2+//JTb1FF3Kv0rTjmPMv3z3gTFnb54yv4dkBVhb4Q4+zbbQegAjRDm0brVeLLl3UcUT32yZPv+DNp/+zpe2Xw07qxcPOzNaCc1mN3ztwcmXB87M2FiaysqByemxto/UARIh2aNtovVpU7fr/ll8cL7pYB5G43Ttw38ZC5v9rPfB+/fvDmemxtI3WAxAhbicuaKe2yIDWq0XVrAAw0/J6YR6LxPLegY0DU5kdGJ0eP9toPQARkkxnX9ZObZGXtF6tMRcQcxNfiX0vKxc2thddjMMQMzvw1RjMDpjZm8+s6vntPc0DTz7cvO9v9e837vR42UbrAYgQtxN/VTt1uXE/bX1Z69Wi8fPah3Xfy40ZPGwYo68Ayk2c7h24avHeg1PX9X9vdtvgbcwOMAAAYq3+mT3vdTvy77Vjl5HDdanOv9Z6tejihZ3HSux/2XkqoJsAvUqcZgduWdUb63sH9JjYRusBiJhEOv957dhnTSb3oNapVVcu2bu/aP8tcs+G/qKLbFRyanZgRuuAc9mi2p4dMCsLpqzp2zarrXBTXGYH3H2vZnB7TOsBiBrHeUMilV1UooOXTDKdW2B+RsvUqslNPTv0GNjk4gUdztYSF9co5tTswC0xmR2YubGQ+ZctB/5fbRO1wu3L7brvFslrPQBR5F7Q3ZPBjEQ6O8qn3ez+unRuepwu/ob7Cb7qNwEueflo0cU06jGzA3NiMjsw8s6Cdf3fe6Bt8NZamh1IpnLrdX8tslbrAYiwjz/zmz9PprP3JNL5DXWp3A4T8+8j/23e3v+qfz4O7m8duKTEyc8q");
    imageData.append("j27bV3QBrbWs/Gl8Zgc+s6rnN/duGPjWzNbBv9H2EiV1mezNun9lJ5O/UesBQG1xnDdcNL9jqOgEaJGbVnQXXTBrOXGbHbgrorMD9Q3Om+rS+V/ofpWRnVetcP6D1gOAmuN+4vtViZNg2TEPE2oN+XJAP7MqJu8sME8l/MM7CzYOfEjbURh9PN3+YXfbD+q+jJJDdZnsR7QOANSk+1oGvlHiRGiVqC0H9CunZgfui8PswNKuA2Z2YPbWwclhnh1Izskl3W3u1X0okZ5xmVxCfx4Aata05r6/rOaRwCZRXg7oZ8y9A1/Zvj8G9w50HHf3cY9ZWfDVH+3/e21jYy2RevXddencHHdbX9NtP/nfnql/es9f6M8BQM27ZklXNe9NqKnlgH4lrrMDVznh+T79I6nOt47LZC9IZvKT3QHBJPPvH3s8/yf65wAgNu5Y19uqJ3LbLK3B5YB+5vR7B86v4dmBKN47AACxMWvT4JV64rZNHJYD+hUzO3DqjYZXLN5bdGxrJbzREABC6FMsBwxN4jc70J+K+nMHACCyblnV80s9QdtknPvpLs7LAf0KswMAAF9Na2Y5YBTC7AAAwFMsB4xemB0AgDKYx3sm0vlxdencl8xb/0xG/n1OLsmjP09gOWC0s2LknQX7nVtW9Tjnzq1uMBfmTJh/4rkD7mDgqYc3Db5P2zEA/IF70vikm116IjktO82aYP25uLljXX/VywFr8e2AUYyZHXjmxUPO9JYB59KFtf3cgauXdB24a33/dx/cUpgUpucOABhjJ14FnDuuJ44SOZ5I5abpz8fJA22Dny5xXKzCcsBwxswOjDyVkNkBAHGQTOdvcE8Kw3qSGCXmz16rdWKDtwPGInGaHbjGPJWQ2QEgXuob97zDPQn060mhjAx8bG7+nVovLlgOGL/EcWUBswNADUuk8rP0BFBuzNcGWi8uvFgO+OSPWA4Y1ZyaHbivxmcHzED11OzA57cVbmlwnDdqXwAQUW4n");
    imageData.append("/4F2+nJTl859T+vFhRfLAe9uZjlgrWT5z07cO/CZGr934KL5HccnmXsHWgaeatheeK/2CwARksjk+rSTl59st9aLk2qXA35qPssBazGnP3fg8ufi89wBZgeAiEnY3fynGdZ6cTJ1bX9LiWNilcUsB6z5MDsAIJS0E9tG68XJrI2FK/R42IblgPEKswMAQkM7rm20XtxcvLDjmB4Tm7AcMN45tbJgclNvTc8OsLIACCHtqLbRenHjxXLAFpYDkl/Hb3Zgypre78zYOHAjswPAGNHOaRutFzcsByR+hdkBAL7SzmgbrRc3D7a99m6WAxK/w+wAAM9pB7SN1osjlgOSoBOX2YEJzA4A/tEOZxutF0deLAfk7YCk0jA7AKAi2slso/XiiOWAJExhdgBAWbRT2UbrxRXLAUkYw+wAgDPSjmQbrRdXt6zq+YUeG5uwHJAEkTjODjy0rfAe7a8AzmEA4JVprQNf12NjG5YDkiDD7AAQc9pZbKP14orlgCTqOX12oJ7ZAaD2aeewjdaLM5YDkloJswNADGiHsI3WizMvlgPydkASxjA7ANQg7QC20XpxNntT4Z/1+Njm0a0sByThDrMDQI3QRm8brRd31S4HvJHlgCRiYXYAiCht5LbRenHHckAS55yaHZjZWnAuWdhZ1L5rJcwOoCZow7aN1os7lgMS8nriNDvwmVU9v71nQ//jzA4gMrQh20brxR3LAQkpHWYHgJDRxmsbrYdzzrlm2d4BPU42YTkgiUOYHQDGmDZW22g9nHPO1HX9G/Q42YblgCROYXYAGAPaQG2j9cByQEKqzbJXjjpf3rbfmbiqx6n2K7Uw56L5HUPmxuH7Wvvvq9/uvEnPJYCvtEHaRuvhhE+5HVuPlU1YDkjIiWz85bDz9AuHnHs3DNT07MDFCzuPmZmBBzcOfEjPJ4AvtBHaRuvhBJYDEuJPav3egfPcfbp9bd8L05r7/lLPK4CntPHZRuvhhHuaB76mx8o2T/7o");
    imageData.append("taKTHyHk9Zw+O/C/FnYU9aEo56LGjuPTWwe+rOcWwDPa6Gyj9XDCV7YefFe1n07uYTkgIVaptdmBpJvJq3tfmbq95216jgGq5jayYW10FhnWenjdNUu7WQ5IyBhlZHbgR7UxO3D1kq59LCGE59zG1aONrdzUpXNdWg+vYzkgIeFJ1GcHLn9u76GZrYN/o+cZoGJuw/q+NrSyk8l9V+vhdfe3FS4rOmaWaWA5ICGe59TswLSIzQ5cuXjvwYc29f+VnmuAiiQy+ZnayMpNMpW7T+vhj1X7dsAblrMckBC/s/SVo86Xtu13bl4Z/ucO3LSyu5MHCMET9Y173uF+ku/TRlZGesenfvunWg9/bNKq3p+XOHZlh+WAhASbKDyV8K41fU16rgEq4jaoaxN2NwMO16WyV2kdFGM5ICHRjpkd+OLz4ZodMNsxa9PglXq+ASqSSOWmuQ3ruDa0EhlKprP36M+jtIaWg39R7UmD5YCEhCOtp907cPGCsb134Lql3QN6vgEqVpfOjq9L5XZoQzstP0tmXj1Pfw6jYzkgIbWZsZ4dmNZa+Lyeb4DKNThvHJfJJRLp7KPJdG6Bifn3ulS2zvw//eM4uzvX9zVrx7XNcywHJCTUMbMDTwU8O3DF4s5Der4BECIsByQkfjHPHfjq9v3ORDM74ONzB2ZtLEzUcw6AEGE5ICHxjZ+zA7c09e7U8w2AEJm0uneXdlybsByQkNrI1t2OM/fHh53r3UG99vNKcv689mHeFQCE2PSNA1/Vjmubb/2Q5YCE1ErMQODhzYNF/bySzGwtTNJzDoCQ8GI54N3rWQ5ISK3lwU3VDwLuXN+3Vs85AEKE5YCEEI2ZCbh6yd6i/m6TG1d0t+v5BkCIsByQEFIqT71wqKiv2+TyRZ2H9XwDIERYDkgIKZXNu4ed856t/CvCixo7juv5BkDIsByQEFIq1y/rKurv5cbcX8QbAoGQYzkgIaRUbmnqKervNmnYXniHnm8AhMj0");
    imageData.append("FpYDEkKKU81zAcwMgJ5rAGsfzfzuXXXp3PRkOtfqNqydJ5JtMW8LNP9P/zzsNGw68OcsBySEnJ4tux1nfBX3AHyysZ17AFAFx3lDMpV9wG1MB7VxnZYDiUx+pvmz+uMo37XLuvpLHNuyw3JAQmorc148XNTPbXLpws6jep4BytPgvLEuk1usjeqMSWUXMQio3J3rql8OuPjlI0UnEUJI9GIG89VM/5vcsLx7r55ngLKY1/1qgzprUrlHtA7KM3tj4dKi42kZlgMSUhv54rb9Rf3bNnes7dui5xngrJKZV9/nNqAj2qDKyOGPz/3de7QeynPxgs7qlgOuYDkgIVHPV7bvd5Il+rdtpm8YeEjPMcBZ1WXyX9PGVHZSua9oPZSH5YCExDfrdw05U9b2FfXrSnLu3LzzYNtr79ZzDHBWyXT2ZW1QFnlJ66E8LAckJJ755g9ecyY0thf150pz04qenJ5fgLK4DWifNiiLFLQeyjOyHHBu5ct+TFgOSEh0ss791H/7mt6iflxtpjX3f0nPL0BZtDHZRuuhfCwHJCQeeez7B50L53n3qf9UzKPFp27veZueW4CyaIOyjdZD+Xg7ICG1nbXup/7bfPjUfyp3N/fP0/MKUDZtULbReijf/a0Dl+jxtA3LAQkJZ8w9On586j+VSxd1HGlodN6i5xWgbNqobKP1YIflgITUVpp2HHMmrqzuxT5ni1k6OL21wLNYUB1tWLbRerBT7XLAZCbnbGA5ICFjHnM/zr9890BVz/QvN5Obel7RcwlgTRuWbbQe7LAckJDox3zqv9nnT/2nctmizt83tO17p55LAGvauGyj9WCH5YCERDenPvWfH8CnfpNPLegYmr25ME7PI0BFtIHZRuvBXrXLAS9awHJAQoLOyp8dc25aUd1LfGxiXvlrbhzW8wdQMW1kttF6sHfn2r71elxtw9sBCQkmW3c7zhef3++cF9CnfpOL5ncMzdo0eKWeO4CqaEOzjdaDPZYD");
    imageData.append("EhKNLH3lqHPt0q6i/udnrl7aNfjgxoEP6XkDqJo2NttoPVSG5YCEhDebdw87X9iyz6n2fh2bmBU+t63p/TfW+sM32uhso/VQmUmrWA5ISBiz9GX3U/+yYD/1X7Kw8+iMjYW79TwBeEobnm20HiozvXXgy3psbcNyQEK8i/nU/+g291N/JrhP/eY135NX975iVgfpOQLwnDZA22g9VIblgISEJ4vdT/1XLQn2U79Z3z+rpXCLnhsA32gjtI3WQ+VYDkjI2GbTr4adRzYPBv6p//a1fS80tPa/Xc8JgK+0MdpG66FyLAckZOwy/6UjzuXP7S3qU37m8uc6D89qK9yk5wIgENogbaP1UDmWAxISfNp+OezMbhscuZFW+5NfMTMM5lP/1O09b9PzABAYbZi20XqozsULWQ5ISFCZ/++/dy5f1FnUj/zM5Ys7D83cOHCd9n0gcNo4baP1UB2WAxLif8biU/+5c/POlDW932lo7nyr9ntgTGgjtY3WQ3VYDkiIv2l0P/Vf9lywn/qvXLL3wP1tAxdrfwfGlDZU22g9VMeL5YCfYzkgIUVp/cVxZ2ZrIfBP/Xes621t2OW8Wfs6MOa0wdpG66F6LAckxNuk/u2w878WdhT1FT9z9ZKufQ+07Zug/RsIDW20ttF6qB7LAQnxJuZT/7QNA06yRB/xK+ed/NRfv915k/ZtIFS08dpG66F65rtCPc62YTkgiXvmvHjYuXhBsJ/6r1raNTirZfAC7dNAKGkDto3WgzcuWdB5VI+1TVgOSOKalpOf+rVP+Jnx89qH71zXt5pP/YgUbci20XrwxuTVvTv1WNvEPF50w89ZDkjilWdePORMmB/sp/7rl3X1ztqy739qHwZCTxuzbbQevMFyQELKz5bdzsgz/IO8w/9891P/3Rv6FjU4zhu1/wKR4Dbk49qwLTKk9eANlgMSUl7afjXsTFzZU9T+/cwNy7u7Hnl+8CPab4FISWRye7VxW6RT68E7LAck");
    imageData.append("ZPSY7/uvWx7ca3svbGwfntFSmKt9FYgkt1Fv0UZukU1aD965Y13fuhLH3CrP/YTlgKQ2s3n3sHPTiu6iNu9Xbl7Z03l/W+EftZ8CkVWXzk3Vhm6RKVoP3vFiOeAXtrAckNRm7l7fX9Te/ciExo7j97b0P6b9E4i8+sY9b3EbeVYbfRnJf+zx/J9oPXir6uWAy1kOSGovj33/YFFb9yM3rezJN2zd/3faL4GakZyTS7qN/Yg2/lFydFyq/VytA+9NbqpuOSBvByS1lrW7hsx38UVt3ctMmN9xfFrzwDe0PwI1KZnOXu02/EPaEUrktUQme6X+PPwxrbn/SyX+DqzCckBSS5mytq+ojXuZW5p69jzcOvg32heBmlY/N/fBZDrXqh3i9WRbEnOy79efg3+8WA54VzPLAUltxNzU6tdz/T+1oGNoZlvhUe2DQKzUpTr/OpnJT3Yv+I8mU9mGunRukvlv+ucQDJYDEnIitzb1FrXvamMGFJObenc3bBngHAcgXFgOSIjjrNk55PmT/i5e2HnsvtaBWdrnACAUWA5IiON83m3D2q4rjRlI3NrUu/MbLQf/QvsbAISK+aSiJzGbsByQRD1XLdlb1K4rySULO4/O3FD4nPYxAAglT5YD8nZAEtGsM9P/Jdq1bcz9NA9vGnyf9i8ACC2WA5I4x7Rdbc+2uXxR5+HZW/f/F+1bABBqLAckcc7DmweL2rNNzAzY/W2Fy7RfAUAkXLu0q09PbDZhOSCJaqp9+M+Ny7s7tD8BQGTcua5vrZ7YbLOI5YAkgrl+eXVv/btnw8DT2p8AIDJmbxz4lJ7YbPOFrSwHJNHLp6tcAWD6jvYnAIgUlgOSOObShZ1FbdkmD7Xt+x/alwAgUiY39ezQk5tNeDsgiWI+vZgZAMB3yVT+H5KZ/DfdTmPWnR88mZ116fwT5mVB+ucRrOkb+r+oJzfbsByQRC03rKj2HoD+OdqXAJx00bd+/Z8Smdy33c5yXDvPaRmq");
    imageData.append("S+We+sCKXW/Wn0cwWA5I4pjPrq7uJUCsAgDOwFz869LZ57XTnDn5bQwCxs51y6tbDjhhPssBSbTixXMAZm8q/LP2JSD23A7yjHaYMvKk1kEwWA5I4hYvngR42aLO339jOy//Af7AfOefGH3a/0wZ+kQ6+wGtB/+xHJDELSOvAi7Rjm1z3bKunobW/rdrnwJi6eQNf0Udpcw8rvUQjEsWdB4t8fdRdlgOSKKWq6t8FsCpuIOA3obthXdonwJix+0Qu7SDlJu6VG6H1kMwWA5I4pZq7wM4Pdcv7+75+paBP9V+BcSK2xkOaOcoP9n9Wg/BmNba/2jx34ddWA5IopTVO4ZGBq7ajisNMwGIPe0UttF6CIZZDnguywFJzHJrU3XLATXMBCDWtEPYRushONW+HXDC/HZn6+7ikywhYc3Cnxzx5GbA08NMAGJLO4NttB6Cw3JAEsdU+2rgUmEQgFjSjmAbrYfg3L9p30X692EblgOSqKVpxzFn/Lz2orZcbfg6ALGjncA2Wg/BumRhdcsBzXvW9QRLSNjz+PcOFrVlL8JMAGJFO4BttB6CNYnlgCSmmbrO+68CTJgJQGxo47eN1kOwWA5I4prNu4ediSt7itqzF2EmALGgDd82Wg/Bmt164L9Wuxzwc+tZDkiimZZfHPfsCYEaZgIQOebZ/icf77vTzUFt1GMQsw0769L5J+rn5j6o24vqefJ2QJYDkohmw88ZBCDmzCt9E5nctxOVvdgnqAzVpXJP8Sphb921vm9NiWNtlYUvsRyQRDcMAhBb5uJfl84+rw03vMlvYxDgnQfa9k0oPsZ2YTkgiXoYBCCW3Ab6jDbYCORJ3Q9Urtq3A7IckNRCGAQgVsx3/olwT/ufKUOfSGc/oPuDyrAckJATYRCA2Dh5w19RQ41IHtf9QWW8WA74zR+wHJDURszqgGuXdRW1cS/CEkGEhtsgd2kDjUrqUrkduj+ozOyt+/8LywEJeT3MBKDmuY3xgDbO");
    imageData.append("6CS7X/cHlat6OWAjbwcktRVmAlDTtFFGLbo/qJwXywF5OyCptTAIQM3SBhm16P6gciwHJKR0GASgJmljjFp0f1Ad3g5ISOkwCEDN0YYYtej+oDqTVvX8TI+xTUaWA/6c5YCkNsMgADVFG2HUovuD6sxo7m/QY2wblgOSWg6DANQMbYBRi+4PqtPQtu+dLAckZPQwCEBN0MYXtej+oHosByTk7GEQgMjThhe16P6geiwHJKS8MAhApGmjs43Ws6X1fMhBNzvr0vkn6ufmPqi/3xOO8wa3/uXJTH5FIpXLub/vSIntCCLH3HQkU7n1dZnszfUNzpt0U8vx4MZ9nyxR2yqf38JyQBKP8MRARJY2ONtoPVtaz+cM1aVyT3n5KuGPp3J/49b9cYnfNeZxByW/SM599Z90m8tR7XLA65Z3FZ0oCanVMAhAJGljs43Ws6X1gkl+mxeDAPM2wkQmV9X35QHkoLu/43Tbz+bW1SwHJMQmDAIQOdrQbKP1bGm9APOkbouNCxd2/edEKvfbEnXDmN5E6tV36z6MxovlgE/8kOWAJF5hEIBI0UZmG61nS+sFmCHzCV63p1zJdO7hEjVDm2Qqn9J9GI0Xbwe8i+WAJIZhEIDI0AZmG61nS+sFnMd1e8riOG84ebOf1gtzDplZC92V0Zi7kEvUKTssByRxDasDEAnauGyj9WxpvSBTl8rt0O0pR31qz99rrShkXCZ7ge7LaO5c17daa9hm4UssByTxDDMBCD1tWLbRera0XrDJ7tftKUcylbuwuFb4k8zkJ+u+jOaBzYNV7yfLAUmcw0wAQk0blW20ni2tF3D26faUw3ySLlEr9KlL5ybpvpwNywEJqS4MAhBa2qBso/Vsab0gU+lXAJ94tuP/0VpRiO1XAAbLAQmpPnwdgFDSxmQbrWdL6wWcx3R7yuX+7J4S9cKc1z6S6nyr7sfZeLEckLcDEsJMAEJIG5JttJ4trRdghhJzsu/X7SlXXSr3UIma");
    imageData.append("Yc4zug/lYDkgId6FmQCEijYi22g9W1ovqCQz+W/qttgYeRBQOvdrrRvS9NQ/vecvdB/Kdd3yKpcDzmc5ICGnwiAAoaENyDZaz5bWCyhbPpL69/+o22LLzCAkzFP2iuuHKQfHZXIJ3XYbd63raypR1yqLWA5IyB/CIAChoI3HNlrPltbzOUPmk78XF/9TkplX35dM514o8bvCkJ11c9r/UbfZFssBCfE+fg4CrlvexSAAZ6cNxzZaz5bW8yEHzN3+7j8fq+Y7/1GZJwNmcpclUrll7u/JJsbwdcDuYKTd/efaRCZ/41UrnP+gm1qpapcDXr+M5YCEaBgEYExpo4ladH/gj8lNPT/VY28TlgMSUjqsDsCY0QYTtej+wB/TWwpf0GNvG94OSEjpMAjAmNDGErXo/sAfDW373slyQEL8C4MABE4bStSi+wP/8HZAQvwNgwAEShtJ1KL7A//wdkBC/A+DAARGG0jUovsD/8xqGaz6JUgsByTk7GEQgEBo44hadH/gr2qXA/J2QELKC4MA+E4bRtSi+wN/sRyQkODCIAC+SqSz+7VhRCj7dH/gL5YDEhJsGATAN24j2KWNIioxT/jT/YG/WA5ISPDhiYHwRV06/4Q2iAjlMd0f+I/lgIQEH2YC4Ln6ubkPug1gSBtEBDLk27P9Maq71vB2QELGIswEwHN1qdxT2hjCHvNWP90PBIPlgISMXRgEwFMfWLHrzYlMfqs2hhBni5ev9IW9apcD8nZAQioPgwB4amQQkM49mQj31wFD5pM/F/+xd6sHywGbWQ5ISMVhEADPfSKd/YDbAB43d9i7/zygDWMMcuDktjzGd/7hMa218PkSf1dWeeIHLAckpJowCAAQOLMc8DyWAxIy5mF1AIDAsRyQkHCEQQCAQLEckJDwhEEAgMCwHJCQcIVBAIDAsByQkHCFQQCAQExu6nlFTxI2McsB17MckBBPwyAAgO+mtxYe0ROEbVgOSIj3YRAAwFdeLAe8");
    imageData.append("c11f0cmLEFJ9GAQA8FW1ywE/yXJAQnwLgwAAvmE5ICHhDoMAAL6YvbkwTk8KtmE5ICH+hkEAAF9cWuVywOtYDliUVveE/fQLh5yGrftG7pO4cUW3c83SLsc91s6nF+91blje7dza1OvMbhscuZFy5c+OFdUg5PTw7gAAnrttdW/VywF5O6B7gnYv+l/dvt+5wb3Yj8sUH6ez5fJFnc79bQVn+U+PFtUmxIRBAABP3ddSeFhPBraJ83LAVTuOOXc19zvnVrmi4lSSbm5a2e2k/+1w0e8ihEEAAM+Y5YDVXrziuBzQTPPPaB1w6jPVHbvRMnFlj7PkZWYEyB+HQQAAz1zvdno9EdgkbssBMz8+7Fy8oKPoOPgRM8B4ZPNgrI4vOXu4MRCAJ+5s7l+pJwHbLPxJ7S8H3OrGXIzNNL3uv9+ZuKpn5KSv20TiG2YCAFRtVlvhXD0B2OaRGl8OuHn38MhXHbrfQcasIFi9Y6ho20h8wyAAQNVYDnjmmOn3KWvH9uJ/KuarB5YNktPDIABAVSazHPCMuXdDf9H+jmUYBBANgwAAFZvWzHLAUvmX7x4o2s8whEEA0XBjIICKPLBh8P+udjng1BpbDmiW4FV7TPwMgwCiYSYAQEVYDvh6trj7cdUSfz5NeRkGAUTDTAAAaywHfD3mJUe6b2ENgwCiYRAAwIoXbwesheWA5nn8YZ76LxUGAUTDIACAlbgvBzRfYVy/vLtov6IQBgFEwyAAQNm8WA64fld0H1bz5ef3F+1TlMIggGgYBAAoS5yXA5oL53nPejv1f/XSrsHPret7bubGgevMVywPbB688N6W/ic+s6rnN369SIhBANH4ujpgWVdPQ2v/2/VcAiBizNsBz6vy++8oLgc0z/k3r+HVfak0n1rQMTRzY2GaHt/Tzdqy739es6SroD/rRRgEEA2DAABnZTqzdnCbTIjgckAvH/hz6aLOI7Nb+9+vx7WUhkbnLZNW9f5ca3gRBgFEwyAA");
    imageData.append("wKjuau5foZ3bNgteis5ywDU7h5zx89qL9qGSnD+vfXhWy+AFekxH0+A4b5zc1LtTa3kRBgFEwyAAwBnd31JIase2TZSWA962urdo+yvN3c398/V4luPEIKDnp1rPizAIIBpuDARwRnFZDvivP3itaNsrzTXL9g6YC7key3IxCCBBhkEAgJLisBzQvL1wwnxvpv7NjZOz2grn6nG0xSCABBkGAQCKxGE54JS1fUXbXGnuWtPXpMewUgwCSJBhEADgj5hOW8vLAZ958VDR9laaK5fsPdCwy3mzHsNqMAggQYZBAIA/Uu1ywLC+HbDVPdmZi6BubyWpdwdJ97cVLtNj5wUGASTIMAgA8AdeLAcM49sB717fX7SdlWbKur7Nety8xCCABBkGAQBG1OJywLk/PuwkS2xnJbl8ceehhubOt+px8xqDABJkGAQAGFFLywHbfjnsXLaos2gbK8m4TM6ZsXHgRj1efmEQQIIMgwAA59y6uvdl7cA2CdNywBmtA0XbV2k+u6bvh3qs/MYggAQZBgFAzN3XOvCgdl7bhGE54PyXjowMRnTbKsmlCzuOjNXJi0EACTIMAoAYq4XlgJt/NexcsdibZ5+bQcR9Gwem6nEKEoMAEmQYBAAxFvXlgLM3DRZtU6UxX4no8RkLDAJIkGEQAMSUF8sBx+rtgItfPurUZ6qbwTiVixd0HvvK1oPv0uMzVhgEkCDDIACIIU+WA24eLDqh+J0tux3nmqXenLDM0sEZLQOz9diMNQYBJMgwCABi6NJFHUe0w9rk2qXBLwf8wpZ9RdtRaT6zqudXekzCgkEACTIMAoCYidpywOXuRevcKm9ePJWLGjuOP7xp8H16TMKEQQAJMgwCgBiJ0nJAc8PhDSu6i35/pZnWOvB1PR5hxCCABBkGAUBMRGk54Fe27y/63ZXm5hXdWT0WYcYggAQZBgFATFy/ortbO6lNglgO2LTjmHP+s9UNVE7lgsb24dmt/e/X4xB2DAJI");
    imageData.append("kGEQAMTA59b3L9cOahs/lwNudTNxZU/R76w09zYPPKXHICoYBJAgwyAAqHFhXw74v797sOj3VRrz8CPd/6hhEECCDIMAoMaFdTng2l1DzoWN7UW/r5KMn9c+PHvTvo/qvkcRgwASZBgEADUsrMsBb1vTW/S7Ks3nmgcW6n5HGYMAEmQYBAA1yovlgP/q8XLAJ374WtHvqDTXLOkqmAum7nfUMQggQYZBAFCDGlr7337evPywdkqbeLkcsPnnx50J872Z+jfLHB/cPHi+7nOtYBBAggyDAKAGhWk54NS1fUX1K81d6/vW6L7WGgYBJMgwCABqTFiWAz7z4qGiupXmyiV7DzTsct6s+1qLGASQIMMgAKghYVgO2OqeVMzFRutWEvO64PvbCpfpftYyBgEkyDAIAGrIZQurWw541ZLqlgPeu6G/qGalmbKmb6vuXxyYQcAtq3p26PHwIgwCiGbDz487Vy/ZW9RWvMh1y7t6vr5l4E+1jQPwwa1NvT/RTmib514+WnSSKCdzf3zYSZaoV0mueK7zcENz51t1/+KCQQAJMgwCgBowo2VgtnZA25jH9prH9+pJYrSYqf9LF3YW1aok4zI5Z1Zb4Sbdt7hhEECCDIMAIOLudzvZec9WtxzQ5GGLewG27Hac21Z798Cf21f3vaD7FVcMAkiQYRAARNwNy7q7tPNVkhmtBWfzr4aLThKnx6z3n9Tk3Yt+Ll3YcYQbh/6YGQRMWtW7S4+VF2EQQDS+DgKWdfWYZ5ZoGwfgkWkt/d/UjldpzLT+175zYOSZ/qefJJb/9KjzyJZ9nj3n38Q8jnh6y8Cduj9gJoAEG18HAcwEAP4xn6AvaGyv+msAzQT3Ym8GBOPneXfRPz1m+ZvuC17HIIAEGQYBQES5F1NfLhR+5eIFnce+svXgu3Q/8Mf4OoAEGV8HAXwdAPjDPBSofm6+qNOFNeZlRroPKI2HBZEgw8OCgAi6dU3v/9EOF8bcsqpnt247Rscg");
    imageData.append("gAQZBgFAxDy8afB9F8zz/l4AL3NRY8dxs5267Tg7vg4gQYavA4CImb5h4H9rZwtLzF3/05oLD+s2o3wMAkiQYRAARMzkpp5XtLOFIVPW9G3TbYU9vg4gQYavA4AImbq9521XLu7ar51tLHPD8u6u+u3Om3RbURlmAkiQYSYAiJBpzX1/eeWSvQe0s41Frl7WVWDJn/eYCSBBhpkAIELCMAi4frk7um/b907dNniDQQAJMgwCgAi5b/v+P5u4quc32tmCyOSm3p3m6wjdJniLrwNIkOHrACBi7t7QnzovoAcFjZ/XPnxvS/8Tug3wDzMBJMgwEwBEzEMbB+puXtn9arJEp/MiZpnfxFU9v35gS+Gf9HfDf8wEkCDDTAAQQbM2Fiaa7+bNBVs7XiUxdW5Y3t1xf+vAJfq7ECwGASTIMAgAImr2pn0fnbK2b8ulizqPaOcrJ1cs3vvaHev61j3YUviw1sbYYRBAgoyfg4CbVvTkWD4M+GzGpoEP3tM88LXPru198cYV3e3XLOkqXP5c5+FLFnQevWJx56Frlu0dMP/99rW9353R3N8wu7X//VoD4cEggAQZPwcBt63ufUnbNwBgFNwYSIKMnzcG3rth4FvavgEAo2AmgAQZv2YCzMoi85Wltm8AwCiYCSBBxq+ZAHM/gLZtAMBZMBNAgoxfMwEzNhbu1rYNADgLZgJIkPFjJsCt16/tGgBQBmYCSJDxYyZgxsaBG7VdAwDKwEwACTJezwSYtqttGgBQJmYCSJDxciZgQmPH8YZdzpu1TQMAysRMAAkyXs4EzGop3KLtGQBgwQwCblnVs0NPsF6EQQDRrP/5ceeShZ1FbcU2U9f1b9C2DACwxNcBJMgsfOnIyAvEtK3YxDyWXNsxAKACzASQIHPHur6idmKTyxd1HtY2DACoEDMBJKjMefFwURuxyfnz8sPafgEAVWAmgASRjb8cLmoftmElAAB4jJkAEkTGz2svah82eWhT/19p2wUA");
    imageData.append("VIklgsTPbHVTn8kXtQ2bNLTte6e2WwCAB/g6gPiVph3HitqETcwqgnMc5w3aZgEAHuHrAOJHvvadA0XtwSYXNXYc17YKAPDYiUFAz8/0JOxFGATEL1t3O87lz1X3WOCrl3YNajsFAPiAmQDiVT6/ZV9RG7DNpNW9u7SNAgB8MjIIaOKeAFJ5nvzRa1U/BdDkng0DT2v7BAD4iJkAUmmeeuFQ1Xf+myTdPLBp8CPaNgEAPuOeAGIbry7+Jlcu7tqvbRIAEBBmAki58fLib3Jnc/9KbY8AgAAxE0DOFq8v/uPntQ8/tK3wHm2LAICAMRNAzhSvL/4mt6/te0HbIABgjDATQDR+XPwvcD/9N2zd/3fa/gAAY4hBADkVPy7+Jnet61+q7Q4AEAIMAohfF/+rl3UVeP0vAIQY9wTEN35d/Cc0th9/sKXwYW1rAICQYSYgfvHr4n/u3Lwzq21girYxAEBIMRMQn/h18R+XyTnTWwa+qm0LABByzATUfvy6+Jv3BdzTPPBtbVMAgIhgEFC74eIPABgVg4DaCxd/AEBZGATUTrj4AwCsMAiIfrj4AwAqwiAguuHiDwCoCoOA6IWLPwDAEwwCohMu/gAATzEICH+4+AMAfMEgILzh4g8A8BWDgPCFiz8AIBAMAsITLv4AgEAxCBj7cPEHAIwJBgFjFy7+AIAxxSAg+Ph58b+3eeAp/TsGAKAkBgHBhYs/ACBUGAT4Hy7+AIBQYhDgX7j4AwBCjUGA9+HiDwCIBAYB3oWLPwAgUhgEVB8u/gCASGIQUHm4+AMAIo1BgH24+AMAagKDgPLDxR8AUFMYBJw9XPwBADWJQcCZw8UfAFDTGAQUh4s/ACAWGAS8Hi7+AIBYYRDAxR8AEFNxHgRw8QcAxFocBwFc/AEAOCdegwAu/gAAnCYOgwAu/gAAlFDLgwAu/gAAjKIWBwFc/AEAKEMtDQK4+AMAYKEWBgFc/AEAqECUBwFc/AEAqEIUBwFc/AEA");
    imageData.append("8ECUBgFc/AEA8FAUBgFc/AEA8EGYBwFc/AEA8FEYBwFc/AEACMDIIKCpZ4deML3IyCDgp+UPAr71w9d8ufiPcy/+05v7v6n7DgBArPk5CLiwsd35tvupXi/2p2fzr4adhzcPOskSP19tuPgDADAKPwcBJjet6HYe+/5Bp2nHMWfz7mGnzb3oL375qPPFbfudSxZ2Fv15L8LFHwCAMvh5T0DQ4Tt/AAAs1MIggIs/AAAViPIggIs/AABViOIggIs/AAAeiNIggIs/AAAeisIggIs/AAA+CPMggIs/AAA+CuMggIs/AAABCNMggIs/AAABMoOAKWt6v6MX5CBz3ty8M621/1HdNgAA4LO71vQ1mUft6sXZ70yY33F8Zsvgrbo9AAAgILM2FiZesqDzqF6k/cq1y7r6H2wpfFi3AwAABGxac99f3ra699/9eI3vqUxo7Dh+d3P/s+brB/39AABgDM3eOPCpz6zq+Y2XA4FPNrYfv31t3/MPber/K/19AAAgRGZv2vfRKWv7tly2qPP3ekEvJ+bu/uuWd/WZT/z3bd//Z1ofAACE3P0theTd6/szk1b37jLf31+8sPPYBY3tw+YiXz8371wwr33YDBRuWNbd9dm1vS9Oa+7/0kPbCu/ROgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEH4/wEkpkOfHQmOngAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image2b41099965818844b42c0eeb0ea564aa = new WeakReference<>(result);
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
BufferedImage image2b41099965818844b42c0eeb0ea564aa=getImage2b41099965818844b42c0eeb0ea564aa();
if (image2b41099965818844b42c0eeb0ea564aa != null) {
    g.drawImage(image2b41099965818844b42c0eeb0ea564aa, 0, 0, null);
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
	private selection_pane2() {
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
       selection_pane2 base = new selection_pane2();
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
       selection_pane2 base = new selection_pane2();
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
        return selection_pane2::new;
    }
}

