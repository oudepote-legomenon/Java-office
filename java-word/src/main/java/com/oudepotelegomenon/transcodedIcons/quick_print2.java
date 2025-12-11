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
public class quick_print2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image2caa44ec51ea67859d312cd4da2d8297;
private static BufferedImage getImage2caa44ec51ea67859d312cd4da2d8297() {
    BufferedImage result = (image2caa44ec51ea67859d312cd4da2d8297 != null)
        ? image2caa44ec51ea67859d312cd4da2d8297.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(9328);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAZ0AAAGLCAYAAAAcUE8kAAAbG0lEQVR4Xu3dzXnbONuGYXYwJUwJU4JLSAkuISW4hOy8dQkpQSVk561KmBLmG7ywvnhA2pbIBwQInddxXItEMglSFG7hh+A0AcCReH59+td/OvX0rz/+9VtZbADAEek7dN57nnJZ/ygPAQBwFI4TOhf/nrR8AOCgHC90Lr6UhwIA6J3jhk5S8ADAoTh26CQFDwAchuOHTtIYDwAcgjFC51weFgCgR8YIneRjeWgAgN4YJ3R+locGAOiNcULn7/LQAAC9MU7o/FMeGgCgN4QOAGA3hA4AYDfSPS5l5X1UAQCd8/z656zyPqoAgAOQn1szr8SPJgDgAKQbK8sK/IgCAA7CCK0dAMBByGM76QFp88r8KAIADsTz61/TkYMHAHAwjhw8AIADkrvaTrNKvXcBAAcm3zj6a1a59yoAYAByl9uPqfcAAgAMSA6hh3/9Pqv4t/uwWgDAwOTKPgVFnAAALCJ0AAC7IXQAALshdAAAuyF0AAC7IXQAALshdAAAuyF0AAC7IXQAALshdG7n+fWPKS+m+lf5EgDgM2otgzMqOXAu69elx0cIHgD4D7mifPjXp399mfZ75EGqlE9TXmg0hduxw+i/gfP+GAUPgDsmP0vnccoBU1aSPZjKlILocUplPQLLgXNR8AC4M/Jzc17+9bxQKfbuJYS+lYfVBZ8HzkXBA2BgckX4+K8/FyrAI5sq75eplwC6LnDel13wABiI3y2assIb0UsAtanIbwuc92VuU14ACCGP0TxNx+w6i/I85ckIf5SnpwrrAuei4AFwQPKMs5eFSu2evbR+6k1A2BY478speAAcgBw2p4WKjP/1ZYqu2GMC56LgAdAxwmatpymi5RMbOBcFD4DOEDZRvkxbw6dOd6bgAdABeYLAy0IlxW0+TVsmHNT5TAQPgIbkijFVRGXlxBjTuV1/r4/gATAEuSstetyAH3ua");
    imageData.append("1na5CR4AhyUPUv9YqIRY31TRfy8/kqsQPAAOR6pg7vvGzl48Tbe2evJnV24nQsEDoAJ57KascNjO68d6cuDUHHcTPACC+P10ybKiYR/+KD+y/1A/cJJCB0AA+1RYEaYynqY81vQ05cVEH/7ntVzen1e8Ttt4edtmua8e/TUtdbft8/kJHAAB5Mq3rGB68TTlYHiYttzHci35PqQUZGmfad9leXrwv5W/wAFwGPqbnZZ+yT9Nt7RcapMDL52n80J5W/o4CRwAhyCP37wsVDAtTEHzfVrqNuqN3BJKZU1lLo+jhQIHQOfUWSTyVs9TbtH0HzQfkVsZqQVUu+KP9rTwf0sKHAAbaR84pyl1C43E78dwnxeOtzfzuf+6lStwAGykbeCcpprjNLnVkfbxtTXpe/Xtl6KsLwvvSQocABtpFzinqWbYXMiVfbnvZfegv/D5b+BcmAePwAGwkTaBc5r2CJsLvYXOhTz9+jwrw74uB86F38EjcABsZP/ASRXX/mM2vYbOhXaPhfg8cC7kCRECB8AG9g+cVHHVv4Fzid5DJ5GnW/+claee57IIAFCPeX99Lc/Tnl1pSxwhdC7kLre9Wj37tzoB3CH7rTSQfrm3ad2850ihk8itntOsbHUUPAAqss9aam3Gbj7iaKFzYZ/HSJggAKAS+X6VstKJ9jz1VokdNXQSuey1u9vOUw8tUgADkScO1K68TlOPldeRQyeRu9tqT/o4lbsFgPXUHyO4bvptC44eOon8o6H27LancrcAcDv1xwa+l7vsihFC50L9WYdtZxoCODj1x3H6mTDwESOFTqJu8KQu2P66SAEcgNwlc16oWKLsP3ASo4VOom7r9We5OwD4mrr34xwjcBIjhk6i7uf7rdwdAHzMLRXt7R4ncBK3nIujUa+rTTcbgBuoN8X2eDOcRg6dRL3g6XdGIoCOqNfff8xKaPTQSdSbEm82G4BPyDcS1rgJ9FTu6jDcR+ikSSM1WrfnclcA8Js6");
    imageData.append("XS3n6cj9+/cQOok8Pb7GD46+78MC0IhbKtfrTZVYX2up3cot5+Xo5EcjzI9rmyYVAFigTr/+8X/l3lPoJOpMpT7eBBIAFbmlYr3eMW4SvOXcjEL8+E5q7fxZ7gbAvRLfyhmnS+U+Q+fPt89wfozrPebsRQDB3FKpXu84d6Tfcn5GInWNlse3Xa0d4O6Jb+WM0a124V5DJxF/bRjbAe6a+FWkx+lWu3DfodPg+sgnnGRraxB/X87xZ6uV5PNfHueyIxI/m+2La2T+ByT3N77LKg8Wl/vZ4ph3n+fz9HSVIxL/qPIvrpP5H5Dc38fyq7mZ+DXW6rTG0J74SQWfTDSZv5nk/n7RD76C2Ae0ncrNYzBir5dPWu7zN5Pc10++oCuJX+5EK2d0Umt7/rlv8YPp0/M3ktzXGl1rLwv7WatWzr0Q29r5YELB/I0k9/WDX4QriR8Y1sq5F2JbOx9MKJi/keR+/iq/kpvZpeLAkMT/YPmr3IXQIdv6o/xKbiaNEc33s9b4rj/0Teysx4Xre/4mkvsZ33UV90v1irvLMRyx93cttOTnbyK5l9HEzlp7KTePOyG2tVyMWc7fQHIf42eFxS5pstAfj7sgdlywmMU2fwPJfVzo795I3JRXEwjunbhu2uI+tPkbSO7jJ0uFrCC2Lz4+EHEs4u71+rvccPkGkvsYfX/O48I+1qpr7d6JHR98dz3NXyRZ3+LXXwBxv0x1rSEzvzbW+m5cZ/4iyfrWmETwa2E/a9S1hkzcLLZ34zrzF0nW9+n3lzCI+T7WGjvWhOMS98iDd63n+Ysk6xt7p/8tT7/8WjeEIhP7OOu362r+Asn6xq5EEPeL9Fe56bvi9+PDn97M/75n4qZOv53H+QskaxtN3E2h9zWekxe4TIF9zXhYGt94/N/f3BNp/HF+Ltb41qU8f4FkXWvMXDst7GeNsd1+vZLD5mla9ys+/c272ViDE7cA6NuySvMXSNa1xsy1NZXnkuPfn5PHKc4L");
    imageData.append("x36rqXUUe69Vj8Tdr/N23c9fIFnXd9NHg5jvY52jE3sDbTKF/dhBHbfSxVsLf/4CybrGTpeOm2E09iSC+MC5eA/BUx7zOkM3RvJao0PnYWEfa4zv9uuFHMxRXZBLpm2PO8HguokW1/in0CH3N3YKbtwv+Ngw7ImYMZyvHDm0TwvHu8YHoUPub3ToPC3sY41jhk7c+bnGMVdziDuHQodsYK+hM16FmadG1+xWKz2XRVjN7xtV9/Lj7sG4a+xJ6JD7+/GXew1xN4bGhmEPxHU93mLMpIL5dmv78ecft+KF0CF3N5rQ/vbBiFsl+RZjVnWYb7e2H3/+uSVUvn+NQofc3WjiQufPctOHZ9+utYsxU8/n262t0CGHNJqo0BmNuJsabzeCcpv1FTrkkEYjdJaJqyjXuH3cbr7N2godckijETrLxFWUa/y4Ar+W+TZr+3GZ487lzxYHRt630QidZeIqyjV+XIFfy3ybtf24zHHnUuiQuxuN0FkmrqK83QjKbdZ3j9DRvUbubjRCZ5l8Y+j8OPcwgnKb9RU65JBGExU6UTc19sQ+a66VnspirGK+3doKHXJIo4kLnY8rnaOSnlY5P87afi+LcXiEDnlgo4lbF2vE0HlYOM7a/lkW4/DEXWNCh9zdaOIqhMdy00MQ1xK8xpdy90MQeo3N/5NkXWPHTuIqhKdy00Owb2tnvFZOIq6b8kHokPsb242VHkkw38caYxaq7JF9Fv4cM7QTca1FoUM2MDp0Hhb2scZTuelhyNOnox65vOS45y4RNwvwD6FD7m/s2EncwpbnctNDkc/TeeG4t5rCbPtaaz0zP+Z1hm6M5LXGd8PM97HW0SvP6BbPaRr/nD0sHPca3x75MH+BZF3jx07iKtLYrr8eycET8bTV+B8PPRL39NW3Lsj5CyTrGt//HzfQO96NjR+RZhGum2DwMo06S22JmIBOvoX0/AWSdY15suR74qZN/yw3PTx5rOf7/459ecwn/V967XEa");
    imageData.append("vSttibhW9NtY5vwFkrWNJq4LZOzJBLid+TWy1reu2/kLJOsb2z2Tu4rKfaw1tmw4LnGTCN790CpfILmH8QP2832s9a0bBHdP3HjOuy7l+Ysk6xs/8yluMsH9jetgmbjxnJf3Gz2R3N341kTcZIK/y03jDom76TgZf70DaExk/3tazw33TZ7RV14XazVOCAxH7OOZ33WH4C6J61ozIxIYltx1V37p16iL7Z6J7VrzAwYYlrhxnaR++HsltmvNdQQMS+z9Omax3SvLKzOs9f5WcQDuitgKwwDwvRE7IeVUbh7AaMTd0JeMXxEbfbNuEdSPvJ8FZIG7JbaL7e9J98j9EDuBIKmlDNwFsV1sfq3eC/mxDeXnv1Zda8DdENvF5j6LeyD2Pq+kWWvA3RDfTaICGZ3Y6fa6ZYG7I+5G0eR5UomMS/yPlE9uCM3pRrKlNYh7sNvFOuVEe2LHcpJ/lbv4zfzNJPf3ky/pBnI3R7mvteoyGZHY2Y7Jd8/OWWL+ByT3t879MLklVe5ri590m+CQxHbDJr8Y/5v/Acn9rTNDLH5GUvKh3A0OSnwX7BXX8fyPSLaxVhfby8K+tnhFxYLuyT9IIrtfk1eM+83/iGQb63Rdxc9MSl5RuaBrYpe7SV455jf/Q5JtrPcMm/jWTlI321FJT4adf55bvfKHyPwPSbbzi0HYldRp7Zynq37ZoivytRDdrXZlKycx/2OS7TyVX9EwYpfGufiz3A06J+4x1O+9YX2++R+TbGutCQU1Bo6TN1Q4aEqdHx43TiyZb4BkW+tMKEjE37dzsU5QIo746dEXv5W7+pz5Bki298r+8RXEPvbgYmpB/VnuCp0Qv+rAxRXdwfONkGzvlTOBVhD7OOL3prGCemGJdeTAqdGtmlzxQ2O+EZLtvWE20Ari79G4KHh6Io/j1Zg4kFz5w2i+IZJ9uPJLfQX1JhUkzWjrgbqB86vc3fXMN0ayD2u3dr4t7DPKepMh8DV1Aye54cbg");
    imageData.append("+cZI9mO91k6iXjdbUvC0oH7gbLwm5xsk2Y+1Wzs1u9mSp6lm+fFf6gfOhm61C/ONkuzLjb8sv6DebLaLqRIUPLXJs9RqBk76cRJwP9Z8wyT7sm5rJ1HvptGLqTIMqLCwSN1p0ReD1gWcb5hkf9YfH4l/gmRpqhQ3DEBjkXorDbw38Pqbb5xkn9ZtKeTxgPPCfqOt2114T9R5ZEVpwDjOe+Y7INmnK5YcuZF9ummSp6l2l+HI5McT1By/uViha3e+E5L9GtSv/gl17995b6rQvpW7xxekVb33+WEQNHGgZL4jkv1a4ZfnAvuME1z8Me1xTEcnt25+Lpy/Wlb6QTDfEcm+/Vl+jatQ59krH6nV8xn7tW4uVmxRz3dGsn/3qaD3Gah+72latXLxoOR7qPYYu3lvxcBJzHdIsn/36WZL7B88yZdpr+PrkdyVls5BeV5q+6MsSjzznZI8hvt0syXaVIApWJ+mewqfdmGTDLwX5zPmOyZ5HPfpZku0qwxT+LxMI3e7tQ2b5I73Ts13TvI4pgp5v8q4bcWYfJlGWtUgT08/LRznnlYewymZF4DksfxVfq2rUn+dtms8T3lG136BG0W+ATfNDEzHUB7X3u4cOIl5IUgezx0GgN+x7308X5lmd/UdQDlont7KWpa/hQ2nqM8LQ/KY7vurNU/n3fPekWs8T7kVkbqt2k1AyGM0j1PuDkxlKsvZ0vNUZaWBa5kXiOQxTQGwb2VS/xkuW01le5lyS+hhqhFEOWDStp+mvGLAeaEcvZjOR/w5uIl5oUge1/O0d6WSV6dOlW1Zlp49vZlaRU9vPk45PJZMr13el/4m/W3PYbvkvl2wHzIvGMlju+/Eggu5NVGWhe1NLeBG4zdLzAtI8vjudKNfQe5uOy+Uh21MrbHOJljMC0lyDNt0p+TuttQFVZaH+7rjDZ+3MC8oyXHcd0bbe/JYyHmhTKxrat3sO6HkJuYFJjmWLYNHq2c/09hNp62b98wLTnI8");
    imageData.append("2wVPIo/1nBbKxRjT7MHOxm4+Yl54kmPaNngSeerxeaFsXGfqSjvYWnTzgyA5ru2DJ5Hvd0ndQWX5eJ3nqZfP8mbmB0NybPuorPJ4z9MkfG7xPPXy+a1mflAkx7efiut3+JwXysnseerpM9vE/OBI3of9VWJ5zCeNU5RlvVdPU1erCUQwP0iS92ObG0i/Is92e5nus+stHXOaZn6Q2Wi3Mj9gkvflS1ktdEPuenucjreg6BrTMQ7WqllifuAk78/UpbXv6tS3Ml4ApRZNOpbHqfdzH8r8RJC8T89T18unvCMH0Lepn8c+X2sK91Tmg91bE8n8pJC8X9Ov7/4mGHxFfpDaJYROC8fVwnQuT1OemZfKdketmc+YnyiS7Hec51ryZIRU2T/973hyAKQgKI91q+cpb/tlyvt6mIadBBDB/ASSZDJ1BR2ju+1Wfj9iOnkJpmu8/E1Sy2UV8wuNJC+mlsH3stoA1jO/yEiy9Ofklz1CmF9cJLlkavXcwX0kqMv8wiLJz0ytHgPlWMn8giLJrzTWc0TypIlz+d/7Mr+YSPJa0wy3O77R8SDk2Xqn///cmjK/iEjyVnW59UheueHH7PNqSlkYklxvquDMcmvNVw/Ia0pZGJLcZqronibh04a8gOhy2FxsSlkYkoxR+OxFbtl8n65d/LQpZWFIMtYUPi+TMZ94vupG+8imlIUhyXqmCQdmu23l95NVy/N7nU0pC0OS9T1PuTtI19u1/H6I3WnhfN5mU8rCkOS+ptaP5XU+Iq9o/TLd2oX2mU0pC0OSbbyM/Qig3H32Y7p2YsCtNqUsDEm29xJAj9O9dMHt+fjtppSFIcn+/DVdHqI2Crk1k8a1Uvdiebx1bUpZGJLs39OUQyi1Dvqfip0nATy8lTmVPW58Zo1NKQtDksczVeKnKXdPpdbDw9SqWy7v+3H6HTDnhfK2tSllYUhyLFPX3GnKgfT0ZmohPbzzr7Jq/H/yCs3v35u8bCdtM207mfZ1");
    imageData.append("DJtSFoYkObZNKQtDkhzbppSFIUmObVPKwpAkx7YpZWFIkmPblLIwJMmxbUpZGJLk2DalLAxJcmybUhaGJDm2TSkLQ5Ic26aUhSFJjm1TysKQJMe2KWVhSJJj25SyMIz26RMvS7CT9+7jNP9+vPc8zb9bXGtTysIwVgDbOdqjA3q3KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1KWVhGCuA7QidWJtSFoaxAtiO0Im1Kc+vf88KxDgBbEfoxNoUH2ZdW/H8+mPKny0Z5Y/yMtuNvP9/GGRTcuU0LxRjbIUvKeM9lZfZbrieY23K8+vjrECMsxW+pIxX6IxiU55f/5wViHG2wpeU8QqdUWzO8+uvWaEYYyt8SRmv0BnF5jy/fp8VijG2wpeU8QqdUWzO8+sfk6nTdWyFLynjFTqj2AXPry+zgnG7rfAlZbxCZxS7wISCOrbCl5TxCp1R7Ibn16dZ4bjNVviSMl6hM4rdkMd2zrMCcr2t8CVlvEJnFLvi+fVhVkCutxW+pIxX6Ixid5hCHWcrfEkZr9AZxS4xmy3GVviSMl6hM4rdIni22wpfUsYrdEaxawTPNlvhS8p4hc4odo/HH6y3Fb6kjFfo");
    imageData.append("jOIheH79Nlkq53Zb4UvKeIXOKB6GvGrBz9kB8GNb8fz615Snv5NR/lVeZrshdGI9HPkCPM0OhHMBbEd9E+thyeGj5fOZALYjdGI9PHn5nMcpB5Bxn/cC2I7QiXU48tjPw5RXNng6gC9T+aFECWA79ULnNM3rg/FFY3JA/lNFANupFzoqYDRA6AB9I3QwFEIH6Buhg6EQOkDfCB0MhdAB+kboYCiEDtA3QgdDIXSAvhE6GAqhA/SN0MFQCB2gb4QOhkLoAH0jdDAUQgfoG6GDoRA6QN8IHQyF0AH6RuhgKIQO0DdCB0MhdIC+EToYCqED9I3QwVAIHaBvhA6GQugAfSN0MBRCB+gboYOhEDpA3wgdDIXQAfpG6GAoRgyd59cfU/6iklH+KC+z3cj7/6eCQgcNGDN0TrOykNs8lZfZbtS7noUOGiB0yGsUOkAIQoe8RqEDhCB0yGsUOkAIQoe8RqEDhCB0yGsUOkAIQoe8RqEDhCB0yGsUOkAIQoe8RqEDhCB0yGsUOkAIQoe8RqEDhCB0yGsUOkAIQoe8RqEDhCB0yGsUOkAIQoe8RqEDhCB0yGsUOkAIQoe8RqEDhDBi6AAjIXQwFEIH6Buhg6EQOkDfCB0MhdAB+kboYCiEDtA3QgdDIXSAvhE6GAqhA/SN0MFQCB2gb4QOhkLoAH0jdDAUQgfoG6GDoRA6QN8IHQyF0AH6RuhgKIQO0DdCB0MhdIC+EToYCqED9I3QwVAIHaBvhA6GQugAfSN0MBRCB+gboYOhEDpA3wgdDIXQAfpG6GAohA7QN0IHQyF0gL4ROhgKoQP0jdDBUAgdoG+EDoZC6AB9I3QwFEIH6Buhg6EQOkDfCB0MhdAB+kboYCiEDtA3QgdDIXSAvhE6GAqhA/SN0MFQCB2gb4QOhqJm6Dy/Ppa7A3AjQgdD8fz618LFGOXfU9o+gPUIHQzH/GKMNAXP05RaVABuR+hgOJ5fzwsXJMmxFTpoxPPrz4ULkuTY");
    imageData.append("Ch004vn1+8IFSXJshQ4a8fz658IFSXJshQ4a8vz6a+GiJDmuQgcN0cVG3ptCBw15fv1jytObywuT5JgKHTQm309TXpgkx1TooDFaO+Q9KXTQAcZ2yHtR6KAT6i27QbIfhQ46Id+3o5uNHFuhg454fv22cJGSHEehg85Iz8OZX6gkx1DooEMEDzmqQgedInjIERU66Jj8WGuTC8hxFDronHzzqGfvkGModHAQ8sy288JFTPI4Ch0cjDzWc164mEn2r9DBQcktn5fJmA95JIUOBiBPOHia8tiPB8OR/Sp0dub/AM2Sqw3YzDtGAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image2caa44ec51ea67859d312cd4da2d8297 = new WeakReference<>(result);
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
BufferedImage image2caa44ec51ea67859d312cd4da2d8297=getImage2caa44ec51ea67859d312cd4da2d8297();
if (image2caa44ec51ea67859d312cd4da2d8297 != null) {
    g.drawImage(image2caa44ec51ea67859d312cd4da2d8297, 0, 0, null);
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
		return 413.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 395.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private quick_print2() {
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
       quick_print2 base = new quick_print2();
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
       quick_print2 base = new quick_print2();
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
        return quick_print2::new;
    }
}

