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
public class Editor2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageaf5df3201cef1baadaa0ed502fbe6908;
private static BufferedImage getImageaf5df3201cef1baadaa0ed502fbe6908() {
    BufferedImage result = (imageaf5df3201cef1baadaa0ed502fbe6908 != null)
        ? imageaf5df3201cef1baadaa0ed502fbe6908.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(16472);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAwCUlEQVR4Xu3dCXRc9X3o8TRpmtf2nfOWtE3fmrYhTV94TSH2aCwvmhlJ1oKNvEle5T0YE2Jjg0dzZyTbwrsxtrHBG9jmEQKEELayGDBLQiAPQ0LYQiAGwp5QsrxCXl8a0v7f/Y+kQf7/70j3ztz5z4z+3+85nwMHrBnp6s78frNI/shHiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIhoJBSP9/7bhmjmU+Mjzl8BAOwjZ4CcBep8oBFS/aiez8RrnC/V1WQOxGrSD8Qi6bfcfwoAAAZ50/WAnBV1NemlckFQ5wlVQXWjnTPrIund7jfzNY9vMgAAfrwqZ0k8kjlDnTNUQcXjvb/vbm4L3G/Y0x7fRAAAivFULJqeL2eNOn+obPV+tC7qLHG/Oa94fMMAAAjTy3U16YXu8Pk9dRqRwRI1qb+L1TiPenyDAAAopSdiESeiziUqeb0fdQ9+xvWBxzfFl8SE9aK+fqNobNkGALCQnAGJ8eu0+RDAB/FI2vkIzwaYacKZ6T91D/q9Ht8Ib9Fu0TRtt5hy0U1i1p5HxPzrfyiW3PuWWHr/TwEAyM6E+dc9l50RclbImRGPZvR5kt+x+KiL/kSdVxRi8THOX7gH+kWPg6+ZOGmHmLH+LrHw1pPaNxsAgKEsuuUlMX3dne4suUSbL96cF+rHdn9anVsUQolI6nQ/P8Pf");
    imageData.append("NHWXmO1ucUuOv619QwEACELOktl7viOapuzU5o3GnVFyVqnzi4pI/kIG9+C+rR3sQRKx9WLGhmNi6XGe3gcAhEsuAjN3PCTqExu0+aN4py7a81l1jlEByV/V6B7Qkx4HOadl1j6x8NaXtG8YAABhki8NtMy6QptDp3J+PHbsmj9T5xkFqKOj42N1Nelv6Qf3Q1PXfJNH/QAAc9yZI98sqM4jxYNyhqlzjXxWF01v9DiofaKZ7Jv8tG8MAAAGtG+8Z8ifFojXZHrVuUY+SoxOj3MP4L+oB3SAPPDqNwMAAJPke8/U+TSInGG16nyjIZK/azk2xO/0n5a6RfsmAABQDlOTt2hzapAf8FJAgOLR9CqPg5jV2nmQH/EDAFQMOZNa5x3Q5tWHMivUOUceNX1hzR+7B+wf9AOYFvUNm8Si21/RDn5QS+5+Xcz/+o/E3MPfF7Mu+46YtfthAIBN3Pt+OQPkLJAzQZ0TQS28/eXsrxZW51a/n9XWrv5Ddd6RkrsprfY4eFkzd35LO+h+yR/dkG8abO7YO+SbNgAAlol2u7Ph8qJ/e6z8PQHaZQ+IpFeq844GJV8ncQ/UG9qBq+n7WX/1YPux+K7XxLT0bSI+bq12mQAADJZwZ8XU5M1i8R2vafNkWMffFi0zL9cus99rvBdgiOIRp8XjoGXNvep7+sEexvxrnxGNTVu0ywIAYCj1jZtE5zVPa3NlOHMOPa5dVk40M1Gde9Sfe4Cu1w6YSz5trx7k4cze+2h2k1MvCwAAP+Lj14nZlz+qzZfhNM/Yo11Wv6+qc4/cTj+99w/cg/NrjwMmOi55UDvAQ5FbG8MfAFCs+Nge0Xn1D7Q5M5SO7Q9ol9PvvVGjln1cnX/WVxdJ1XkcrOwGtjjAOzQX3fqSaGjYpF2OqsN1fsQRmdGO6DbJvc7uhGsiACCr2TXVNc2cjOvLZzmiPeZo80HV0LA5+y5/dd7kI997lu9BaF2ke6w6/6yvrsZZrx4o6ayF");
    imageData.append("h7WDO5S286/TLmNAwnWxO4Sf+2JS/PqMMjjTNcu1BABwii+7trq2mfdsukv0tqdEIqrPjQFtK67X5s1QWucf0i5DikfSPer8sz73wNylHiip/eJj2oHNZ/4Nz4v4mG7tMqSWSFo89MUufSib1JbUT3oAQJ8Lk9pwNunBC7pEy1h9fmQHd21P9ncGqHMnnxm9d2uX0e8Odf5Zn3tQXvI4UGLe/3pKO7D5TFl9o/bxknzkX/bhP8a1OKmf8ACAPktdG5LaYDbp4Qu7RH2eZwLk3wCozp185PsG1I/v4/xYnX9W13raik+4B+Z32oGKZrKvpagHNp/Glm0eBzstdo1K6QPZNB79A8DwVie1oWzajtkpbY5Ija3btLmTj5xd6sf3+0C+6V2dg9ZWV9Pzlx4HKfvGC/Wg5iOfmlE/XpKP/l8/o8yP/qUFSf1EBwCcalmybO8FGPBabzLv+wEW3Oj/ZQD56+vVj5fqx3Z/Wp2D1jYhmvmCeoCkprad2gHNZ87BE9rHS8sjjj6MTZNP/6snOQDA24akNpRNW9bs/dMBc91Zo86ffCaefan28VIikjpdnYPWJn8sQj1AUkuAXwA0c/uD2sdLG0dXwNP/E5L6CQ4A8LY+qQ1k0za0e78MEOT30jS379U+vl+tOgetra7Gqfc4QKJ1zn7tgOYjf1pA/XipIl7/TyT1ExwA4K0nqQ1k03bN9V4Agvxkmpxh6sdLcuapc9DaEpFMg3qApJYAC8CMPAvA7kpYAOJJ/QQHAHirgAVgd54FQM4adf7kI2eY+vGSnHnqHLQ2FgAAQA4LgD2xAAAAclgA7IkFAACQwwJgTywAAIAcFgB7YgEAAOSwANgTCwAAIIcFwJ5YAAAAOSwA9sQCAADIYQGwJxYAAEAOC4A9sQAAAHJYAOyJBQAAkMMCYE8sAACAHBYAe2IBAADksADYEwsAACCHBcCeWAAAADksAPbEAgAAyGEBsCcWgMK9uygpnp7TJZ4CAEPk");
    imageData.append("fY6871Hvj0LDAmBPLACFOTQpJeqj+tcMAKUm73sOTk5p90uhYAGwJxaA4I63d2lfKwCYJu+L1PunorEA2BMLQHDbmh3tawUA07a2lOBZABYAe2IBCK5novfJCQAmdU90tPunorEA2BMLQHAsAAAqAQtAfiwAPmIBCC7fAjC7aaX4UttyAAiVvG9R728kFoD8WAB8xAIQXL4F4N4tcfGbWz8DAKGS9y3q/Y3EApAfC4CPWACCYwEAYBILQB8WgJBjAQiOBQCASSwAfVgAQo4FIDgWAAAmsQD0YQEIORaA4FgAAJjEAtCHBSDkWACCYwEAYBILQB8WgJBjAQiOBQCASSwAfVgAQo4FIDgWAAAmsQD0YQEIORaA4FgAAJjEAtCHBSDkWACCYwEAYBILQB8WgJBjAQiOBQCASSwAfVgAQo4FIDgWAAAmsQD0YQEIORaA4FgAAJjEAtCHBSDkWACCYwEAYBILQB8WgJBjAQiOBQCASSwAfVgAQo4FIDgWAAAmsQD0YQEIORaA4FgAAJjEAtCHBSDkWACCYwEAYBILQB8WgJBjAQiOBQCASSwAfVgAQo4FIDgWAAAmsQD0YQEIORaA4FgAAJjEAtCHBSDkWACCYwEAYBILQB8WgJBjAQiOBQCASSwAfVgAQo4FIDgWAAAmVdIC8FJPl7jtvJS4dE5KXHi2I+Y2OKI95ohJ49JiyoS0mJ1Ii+UtjtjQnhJXL06Jx5NJ8avN+uUMhQXAUCwAwbEAADCp3AvA85mk2DffEbMSjvY5+NFUmxaZaY64b0WX+NUW/fJVLACGYgEIjgUAgEnlWgAevbBLrJ5c2NDPZ3qdI65ZmhLvbvrwelQsAIZiAQiOBQCASaYXgJNrk2JNm/f9XFim1qXFTcu7xHtbkywA5YoFIDgWAAAmmVoA3nddtyAlGmv16yqVlZMd8XpvFwtAOWIBCI4FAIBJJhaAf1jUJZIN4T7d75d886B8uYEFwHAsAMGxAAAwqdQL");
    imageData.append("wBsLkmJJzP/wn3ZWrzh38TaRTu4WO7YfEHsuO5Sz69KDYn3PXrHq/EtFZ8cmUV+b0T7eS+OYtLjz/BQLgMlYAIJjAQBgUikXgJ/M7xKzxg8//Ftia8WXz9meHfBHjx717dDBw6I7tUfMnLJBu0xVPJoWNy/vYgEwFQtAcCwAAEwq1QIgh//s8frlDpYYk3EH/yXi0KHD2nAP6uL1l4u2pvXadZxyfe4SsGii/t8lFoCQYwEIjgUAgEmlWAD8DP+Gcd1i56UHtEFejMOHj4hVX7k0+2hfvb7hsACEHAtAcCwAAEwKewHwM/wHLJi9WRw5og/yYm3ZdIWYOKFbu76hsACEHAtAcCwAAEwKcwEIMvwHlGoJkM8uNMd6tOvLhwUg5FgAgmMBAGBSWAtAIcN/QKmWgEu27RcNY/39pAALQMixAATHAgDApDAWAD/Dv6Fpi/bfBivVEtCT3qNdlxcWgJBjAQiOBQCAScUuAH6G/7T0bWLJ3a+Llln7tP83WKmWgMXzhl4+JBaAkGMBCI4FAIBJxSwAfof/wP15uZaAffuuFI3jh35TIAtAyLEABMcCAMCkQhcAP7/kZ2ryZu0+ffGxN0RrngE6YP6szdkf6VMHeTFWnrdDu57BWABCjgUgOBYAACYVsgAEfeSvKsczAfv3XTXk7wdgAQg5FoDgWAAAmBR0ASj0kb+qHM8EzJmxUbuOASwAIccCEBwLAACTgiwAYQ3/AaaXgEzqMu3yB7AAhBwLQHAsAABM8rsAFPu0fz4mXw6QLwOolz2ABSDkWACCYwEAYJKfBSDsR/4qk88ENNV5/3ZAFoCQYwEIjgUAgEnDLQClHv4DTC0BHW3ef3UwC0DIsQAExwIAwKShFoBSPe2fj3w5oHnWFdp1DFbsywFLOrdqlymxAIQcC0BwLAAATMq3ACyPO0aH/4BSLwGLO71/KyALQMixAATHAgDApHwLwHDCeNo/n1K+HLBoLguAkVgAgmMBAGBSIQtA");
    imageData.append("KR75q0r1TIBcHNTLkVgAQo4FIDgWAAAmBV0ASvnIX1WKZwKmNK/XLkNiAQg5FoDgWAAAmBRkATA5/AeEuQQcvupI3l8HzAIQciwAwbEAADDJ7wJg4mn/fMJ6OWDHdu/BLbEAhBwLQHAsAABMumdLQru/UZVz+A8IYwlYsTz/3wjIAhByLADBsQAAMOWNa/5WzG5eod3fDFaOp/3zKeblALkYTGpYp/35ASwAIccCEBwLAAATssO/aaV2XzNYJTzyVxX6TMDmDUN/DAtAyLEABMcCAKDUqu2Rv6qQZwJmT8v/VwFLLAAhxwIQHAsAgFKq1kf+qiDPBFy8/nLt/6lYAEKOBSA4FgAApTJShv8AP0uAfCagNbFW++8qFoCQYwEIjgUAQClU+9P++fh5OcAPFoCQYwEIjgUAQNhG6vAfEMYSwAIQciwAwbEAAAjTSB/+A4pdAlgAQo4FIDgWAABhsWX4DyhmCWABCDkWgOBYAACEodxv+Ft0x6ti6fG3tf9ealMv+ob2dQ6W4O8CMBMLQHAsAACKVc5H/nOv+p5obN2evY76WK/ouORB7c+UyrTULdrXOdiCRkds7PC+j2UBCDkWgOBYAAAUo5yP/Ofse0zEx/accl3xaEbMu/op7c+GTS406tc52Nx6R7ze2yV2z/W+j2UBCDkWgOBYAAAUqpyP/L2Gf6mvc8Bwj/znuMP/NXf4/3pbkgXAVCwAwbEAAChEWYf/gRN5h780vefvtY8JS5DhzwJgMBaA4FgAAARVycM/MWG9WHjzSe3jwhB0+LMAGIwFIDgWAABBVPLwj49bK+YePKF9XBgKGf4sAAZjAQiOBQCAXwx/b/mGPwuAwVgAgmMBAOAHw9/bUMOfBcBgLADBsQAAGA7D39tww58FwGAsAMGxAAAYCsPfm5/hzwJgMBaA4FgAAOTD8Pfmd/izABiMBSA4FgAAXhj+3oIMfxYAg7EABMcCAEDF8PcWdPizABiMBSA4FgAAgzH8");
    imageData.append("vRUy/FkADMYCEBwLAIABDH9vhQ5/FgCDsQAExwIAQGL4eytm+LMAGIwFIDgWAAAMf2/FDn8WAIOxAATHAgDYjeHvLYzhzwJgMBaA4FgAAHsx/L2FNfwlFgBDsQAExwIA2Inh7y3M4S+xABiKBSA4FgDAPgx/b2EPf4kFwFAsAMGxAAB2Yfh7K8Xwl1gADMUCEBwLAGAPhr+3Ug1/iQXAUCwAwbEAAHZg+Hsr5fCXWAAMxQIQHAsAMPIx/L2VevhLLACGYgEILt8CcE3XZPHsgdEAqtxT+2rE7KaV2m18sGnp27T7wjCUc/jLhUa9vsHmZod/UhvYYWMBMBQLQHD5FgAAduCRf2mxABiKBSA4FgDAXgz/0mMBMBQLQHBrJzra1wpg5ONpfzNYAAzFAhDc/kneJyeAkYvhbw4LgKFYAIJ7pTMpWmv1rxfAyMTwN4sFwFAsAIU56S4BW5pTYlnMEUsBVKWZ4/T7LRXD3zwWAEOxAACw0U/md4lZ44d+P4+Vb/iLm33DnxcWAEOxAACwDcPf2xz3mLyWLO/wl1gADMUCAMAmDH9v2eG/wB3+PUltIJvGAmAoFgAAtmD4e8sNf3mcWADsiQUAgA0Y/t5OGf4SC4A9sQAAGOkY/t604S+xANgTCwCAkYzh781z+EssAPbEAgBgpGL4e8s7/CUWAHtiAQAwEjH8vQ05/CUWAHtiAQAw0jD8vQ07/CUWAHtiAQAwkjD8vfka/hILgD2xAAAYKRj+3nwPf4kFwJ5YAACMBAx/b4GGv8QCYE8sAACqHcPfW+DhL7EA2BMLAIBqxvD3VtDwl1gA7IkFAEC1Yvh7K3j4SywA9sQCAKAaMfy9FTX8JRYAe2IBAFBtGP7eih7+EguAPbEAAKgmDH9voQx/iQXAnlgAAFQLhr+30Ia/xAJgTywAAKoBw99bqMNfYgGwJxYAAJWO4e8t9OEvsQDYEwtA4d5dlBRPz+kSTwFVTJ7D8lxWz+9KwfD3VpLh");
    imageData.append("L7EA2BMLQGEOTUqJ+qj+NQPVSJ7L8pxWz/NyY/h7K9nwl1gA7IkFILjj7V3a1wqMBPd3lGioFIDh762kw19iAbAnFoDgtrd4n5xAtZPntnq+lwPD31vJh7/EAmBPLADB7Z/kfXIC1e5ABbwMwPD3ZmT4SywA9sQCENwrnUnRWqt/vUA1k+e0PLfV890khr83Y8NfYgGwJxaAwpx07yi3NKfEspgjlgJVTJ7D8lyW57R6npvE8PdmdPhLLAD2xAIAoNwY/t6MD3+JBcCeWAAAlBPD31tZhr/EAmBPLAAAyoXh761sw19iAbAnFgAA5cDw91bW4S+xANgTCwAA0xj+3so+/CUWAHtiAQBgUjmHf+e1zzL8h8MCYE8sAABMKefwl85aeJV2fQMY/v1YAOyJBQCACeUe/tLEKbu065QY/oOwANgTCwCAUquE4S+1rbxBu16Gv4IFwJ5YAACU0nuLk2JJbOjhPy19m3a/UgqL7nhVNM+4LHe9DQ2bxNwrn9D+XBjkQqN+nYPNnSCHv368yo4FwJ5YAACU0mOzhv7rs00N/5zjb4l5h5/M/jTA4rte0/9/CKp2+EssAPbEAlC4dxclxdNzusRTQBWT57A8l9XzOyyHhvrbM6PdYvbeR7X7lGpW1cNfYgGwJxaAwsg7tfqo/jUD1Uiey/KcVs/zMKysH/rp/3htj5i95xHtfqUaVeVr/ioWAHtiAQjuePvQT2kC1er+jnCH03uu1jFDLwDSSFgCRsTwl1gA7IkFILjtLd4nJ1Dt5Lmtnu/FeGau/2W5mpeAETP8JRYAe2IBCG7/UK9pAlXsQMgvA9w4xf8CIFXjEjCihr/EAmBPLADBvdKZFK21+tcLVDN5TstzWz3fi9Hb5H1HPpRqWgJG3PCXWADsiQWgMCfdO8otzSmxLOaIpUAVk+ewPJflOa2e58XK98t/VizfIRrGZrT/PiC7BFT4TwdU/bv982EBsCcWAACl8KY7/NT7BCkezYgD");
    imageData.append("Bw6LbZv3icZx3dr/z/25Cn4mYEQ+8h/AAmBPLAAASuG+PD8tM6WlVxw9ejSrGpeAET38JRYAe2IBAFAKe8/yvhM/Z9G23AJQbUvAiB/+EguAPbEAACiF5Qnv1/8zqctOWQCqZQmwYvhLLAD2xAIAIGy/WpQUE/P8pszLdh3SFoBKXwKsGf4SC4A9sQAACNsTs71f/2+q6xFHjhzRhn8lLwFWDX+JBcCeWAAAhO3aNu878Hkdm7Shr6qkJcC64S+xANgTCwCAsGUavV//X/WVS7WB76USlgArh7/EAmBPLAAAwjZ9rPcCsGXTFdqwz6ecS4C1w19iAbAnFgAAYXp5fr5fAJQWV16Z//V/L+VYAqwe/hILgD2xAAAI053Tve+8p0+6WBvwfphcAqwf/hILgD2xABTu3UVJ8fScLvEUUMXkOSzPZfX8LtSOVu+n/5cv3a4Nd79MLAEM/34sAPbEAlCYQ5NSoj7PzzkD1Uaey/KcVs/zQsi/YEi9fGltZo822IMo5RLA8B+EBcCeWACCO57nd5wD1e7+juKG3M8XJfMuxnv3eP8CoCBKsQQw/BUsAPbEAhDc9hbvkxOodvLcVs/3IL47y3s5bo2v1YZ5ocJcAhj+HlgA7IkFILj9k7xPTqDaHSjyZYDDZ3vfNhbM3qwN8mKEsQQw/PNgAbAnFoDgXulMitZa/esFqpk8p+W5rZ7vQaxp8L7jvuiCndoQL1YxSwDDfwgsAPbEAlCYk+4d5ZbmlFgWc7JvegKqlTyH5bksz2n1PA/ifdfZY/X7AWn71v3aAA9DIUsAw38YLAD2xAIAIAwvzPN+/T9RmxGHrwr2C4CCCLIEMPx9YAGwJxYAAGG4dbr3AtDRVtgvAApi6+Z9omFsRrvuAXIJmLT4sPbfB5s7QQ5//euyDguAPbEAAAjDlmbvn///8jmF/wKgIIZ7JmAoPPIfhAXAnlgAAIRh/gTvBaB37V5tWJdKIUsAw1/BAmBPLAAAivXO");
    imageData.append("wi6RyPMLgPZdcZU2qMN05ZWHsy8BrF5xqejs2CQax/tfAHja3wMLgD2xAAAo1rc6vO+wJzeu0wZ2sa644kpx8brLxVfO3SE6pmzIvslQvV4/eOSfBwuAPbEAACjWwcned9iLO7doAzyII0eOil2XHhBOcrdY0rlVTGler11HIRj+Q2ABsCcWAADFuqDe+/X/rot2a0N9KPv3XSUuXt/36H6m++i+Yaz/p/P94mn/YbAA2BMLAIBivOdqGaPf/qUdlxzQhvwA+eh+p/voPrVmt1g6f6toawrn0X0+HePT4opJTvb9CurXgEFYAOyJBQBAMZ6Z6/3z/w3jurNDfmDgX3nlEbFtS9+b9eZ1bBJNE8J/dD9A/o2E8qcStjU74vbpKfFSJ0PfNxYAe2IBAFCMb0z1vrOe2rJedDt7xLJF29x/7xXxPD8lEIYpY9PCaXTENW0p8fjspPjlYv3zhE8sAPbEAlC4dxclxdNzusRTQBWT57A8l9Xz26/eJu8761JJ1PQ9ur+4yRE3TesSz8/t+3sI1M8LBWIBsCcWgMIcmpTKPs2ofs1ANZLnsjyn1fPcj9nj9csLk3x/wfKEk339/oH2lPjZQv1zQIhYAOyJBSC44+3er3kC1e7+jmCvlb+5IKldRrHkQiEf3V83JZV9huI9ns43iwXAnlgAgtve4n1yAtVOntvq+T6UR2cWtww3u4/uv+I+ut8/KSUedJePn/LovvxYAOyJBSA4eWelfq3ASHAg4MsA+X4CIJ+OcY5Y35QSN/Q/uv9HHt1XHhYAe2IBCO6VzqRordW/XqCayXNantvq+T6c1Xl+CVBjNC2Wxx2xuzUl7mvv4pfvVAsWAHtiASjMyU7515+mxLKYI5YCVUyew/Jclue0ep778atFSXH47JRY6S4C6UZHfLUtJZ6Y1cWP4lUrFgB7YgEAAOSwANgTCwAAIIcFwJ5YAAAAOSwA9sQCAADIYQGwJxYAAEAOC4A9sQAAAHJYAOyJ");
    imageData.append("BQAAkMMCYE8sAACAHBYAe2IBAADksADYEwsAACCHBcCeWAAAADksAPbEAgAAyGEBsCcWAABADguAPbEAAAByWADsiQUAAJDDAmBPLAAAgBwWAHtiAQAA5LAA2BMLAAAghwXAnlgAAAA5LAD2FMYC0J5nAdhVCQtAIqmf4AAAbxWwAOzKswDIWaPOn3xYAHwUxgIwc8dD2sdLG0ZXwAIwIamf4AAAb+uT2kA2rbfdewGQs0adP/mwAPgojAVg7sET2sdLy0Y7+kA2bUxSP8EBAN42JrWBbNo5zY42T6S5hx7X5k8+LAA+CmMBWHDjC9rHZw+067Uzu/ShbNKZrgVJ/SQHAJzqnKQ2jE37yfouEY/q80Ra8I0XtPmTDwuAj8JYAKSJZ23XLkPaXgkvA7Ql9RMdAHCq1UltIJu2dZb30/+Nk7Zrc2coLAA+CmsBmLrmm9plZA+264EvlnkJkC8DLE7qJzsA4EMbktpANulbq1IikefR/9TkzdrcGQoLgI/CWgDkywDx2m7tcqRm131fLPNLAZOT+skOAOhzYVIbyCbds6JLNNfq80OSsyXI0/8SC4CPwloApLYLvq5dTu4b6EqPdsT3z+wS76vD2QT5XoCZSf2kBwDLvX+++8+tSW0ol9r77nV+P9Ul0tO83/Q3YMqqG7V5MxwWAB+FuQAsuv0V0di0RbssVZvr3IgjLjCtxhVz1QMAsia6Jrkmm3VuiyPOnqDPB1WDO1MW//1PtHkzHBYAH4W5AEid1z4r4uPXaZcHAEAQ8XFrRec1T2tzxg8WAB+FvQBIc/Y/JhIT1muXCQCAH3KGzDlwQpsvfrEA+KgUC4A0/7rnRGPLNu1yAQAYSmPrNjH/+h9qcyUIFgAflWoBkBYfe0NMX3uHSNT1apcPAMBg8uVj+eN+i+96TZsnQbEA+KiUC8CAhbe/LNo33iNa5h4Q8doe7boAAHaSM6HVnQ0zNt2bfSO5Oj8KxQLgIxMLwGBL7n1TLLz5");
    imageData.append("pJh39Q+yf4cAAMA+cgbIWSBngjonwsAC4CPTCwAAAKXGAuAjFgAAwEjDAuAjFgAAwEjDAuAjFgAAwEjDAuAjFgDAnMV3v579+eaBN0LJf5f/Tf1zAIrDAuAjFgCgtJYce0O0b7o3e5uKj9H/xkz5Y1Dy/7Vvvi/7Z9WPBxAcC4CPWACA0um45EHRMHGzdvvKR/7ZmTse0i4HQDAsAD5iAQDCt+Tet8TZ512r3a78Ovv867KXoV4uAH9YAHzEAgCE7PhbonX+Qe02FdRZ8w9lL0u7fADDYgHwUV2NU68eIKmVBQAoSNvqG7XbU6GmXvQN7fIBDE/OMPX2JMmZp85Ba6uLdI9VD5DU0rFXO6AAhjb38Pe125JqesMqsWrWkiz57+r/V807/KR2PQCG1jxjj3ZbkuLR7jHqHLS2utrU36oHSGpq26kdUABDOP62aG7fq92WBixtO0+cuKxW/L9bPiN+c2sf+e+Puf9tydnnaX9+QDPLOBDYxLMv1W5LUiKSOl2dg9YWH+P8hXqApIaGTdoBBZDfvKuf0m5HA5JzFol/vOmvc4NfJf/fGvfPqB83oPOap7XrA5Bfff1G7XYkjR+V+u/qHLS200/v/QP3oHygHiQpjL+TGbDF1K5btNuQNKNhlfjljZ/Thr7qF1//GzG9frX28dLU1C3a9QHwtviO17TbUL8PRo1a9nF1Dlqde1BOehyo7CMa9cAC8CbfN6PehqQbulu1YZ/P9elW7eMlXgYA/JN/1bB6G+r3ojr/rM89KHd4HCgxo/du7cAC8NbYtEW7DUk/Ofp32qDP5+WjZ2gfLzW4l61eHwBvM9bfpd2GsiLp29X5Z32xiLNWO1CusxZcqR1YAN7iY3u025D0/k2f1QZ9PvLPqh8vyctWrw+At9bOvL+HI6POP+tLjE6P8zhQIj5urVh856vawQWgq09s0G5D0jvXfV4b9Pn8zP2z6sdLDYmN2vUB0MmZJWeXehuSEmPSUXX+WZ98");
    imageData.append("U4R7cN5TD5bUsf1+7QAD0E2csku7/UgPXTJBG/T53L8tpn281DR1l3Z9AHQdW49rt59+/yce7/19df7RR7LvA/iqxwETzTMu0w4wAN3kc6/Rbj+S/IU/6qDP54KOpdrHS5PP+6p2fQB0zdMv024/WVHnanXuUX+xaGaidsD6yb+3XD3IAE41a88j2m1nwM3rmrRhr7qpp0n7uAGz9z6qXR+AU805cEK77eREMwl17lGu3o+6B+lV7aDV9P9a4ONvawcbwIeW3P163vcBJKKOOJqcLH5982na4H//m58VRy46O/tn1I+T5Ov/i4+9oV0fgEHkb+LM8+t/Xa/IGadOPRpUvMb5iseBy5q5/UH9gAM4xYwNx7Tbzim3o4krxb6V08SdGxqy5L93NK7U/txg7Rvv0a4HwKk6tt2v3XZyIunz1HlHSvF4779xD9ZPtYPnko9sFt76knbQAXxoyb1viaYpO7XbT6Hkm/+W3Pumdj0APrTw1pN5n31zh/9braet+IQ678ijWMT5snYA+7XM3sffTw4MY8E3f5z395AHIS9j4c0ntcsHMIg7k5pnXaHdfnKizjJ1zlGeOjo6PuYetCe0g9hvyoX8/eTAcDqvfVY0TNys3X78kr9VcP61z2iXC+BUbatv1G4/OdH0CV77D1gs4kRief6CIEn+mkX1mwDgVItue1m0zj2g3X6G0zrvgFh4+8va5QE41fR1d2q3n0E+iNd0j1bnG/morsbp9jigfaIZMS19m/bNAKCbs/8x0dy+N3u70W5Lg25T8qdt5I8xqR8PQDd97R3D3KactDrXyHfZHwu8Vzuog7Rd8HXeoAT4JN+oJH9L2dTkLdlfGiTJf5f/Tf4/9c8D0Mk32ratvEGbR4pjPPVfZA016U+6B/KHHgc3R/7c5cJv/lj7JgEAEKaFN70omvL/rP+AH9bW9v5HdZ5RAdXXdv+XWJ5fEDQgMW5t9iUBuZmp3zAAAIqx5L63sr9jIzFhvTZ/");
    imageData.append("FG/Wj+3+tDrHqIjG16T/erglQJo4aYeYueNb2W+W+g0EACAIOUtm7nhINE7ars0bD68mRvd8Tp1fFEL9zwQ863HQNY3NW7PPCCy48QXtGwoAwFAW3Pij7AxpcGeJOl88RdLPyBmlzi0KsfgZvf8+VpO5RTv4Q5DPCkxZeUP2mYHOa57O/l3N6jcbAGAnORPkbJAzQr65b+KkS7Q5MrTMLY2jUv9OnVdUmn6vLpq5wD3wv9G/Ef7Vx3oBABZT50JAv3Ef+a+UM0kdUlTi4rXOaXU16Xs8vikAAJROJP3QhGj68+pcIsPVRTIzYzWZ57VvEAAA4XouHk23q3OIylrvR+U3pa4m/ZjHNwwAgCI4/zsRdWbwy30qvPio9N/EazKbeFYAAFCEH9ZF0xv50b4qbcKozH+qizjz3G/kzljUudv950uu/+vxjQYA2EnOBDkb7nLtrKvJzI1Hkn+uzhMaMfV+dPx45z/ATu5Wv9XjTkDsmzZNvLvif5TXRtcNI8wDrhPltW/9NO37LclzQT0/YA+e0ieyrLoaZ706CKTDM9rEb1Z9pry2uW4dYb7rera8Dm9q077f2QXAPRfU84OIiEZoLACGsQAQEVElxAJgGAsAERFVQiwAhrEAEBFRJcQCYBgLABERVUIsAIaxABARUSXEAmAYCwAREVVCLACGsQAQEVElxAJgGAsAERFVQiwAhrEAEBFRJcQCYBgLABERVUIsAIaxABARUSXEAmAYCwAREVVCLACGsQAQEVElxAJgGAsAERFVQiwAhrEAEBFRJcQCYBgLABERVUIsAIaxABARUSXEAmAYCwAREVVCLACGsQAQEVElxAJgGAsAERFVQiwAhrEAEBFRJcQCYBgLABERVUIsAIaxABARUSXEAmAYCwAREVVCLACGsQAQEVElxAJgGAsAERFVQiwAhrEAEBFRJcQCYBgLABERVUIsAIaxABARUSXEAmAYCwAREQ0uXuucFo+m18Qi6RvcO+OH");
    imageData.append("XS+6XjbglzGPYTC59iIxu25leSVcTSNMq2tSeU2OX6R9v/vJc0E9P0pBntsPy3O9LpK5qH5Uz2fU2wMR0YivLuo0uXeGj8f0O2PAHtH0iXjEaVRvH0REI674qIv+JBZ17tbuCAGL1dU4dzbUpD+p3l6IiEZEiUjq9FjfU6HaHSCA9EsTounPq7cbIqKqrn5s96fdO7ifedzpAfjQz+oi3f9Nvf0QEVVlTV9Y88fuHdtTHnd2AHRPjhrV+0fq7YiIqOqK12R6Pe7kcprqHDGnPSm+tORCsfzc1eK85WZt3rRT7LnsECxy9Mj14r57HxbH7/uOMfcc+7a46cZ7xbaNXxPTz9qk3Q5OEU2vU29HRERVVTyS/HP3Du197Q6u3+wZSbFy5SqxalV5bN26VRw9ehQWOnbsmHjyySfL4vHHvyc2X3ytiEcz2m2i33tjx675M/X2RERUNcUizlqPO7esztlrtIFsUjKZFIcPH9YGA+xw9dVXixMnTmjD2aS9u2/SbhcD6mqcbvX2RERUNbl3ZN9T79ikqWd1aQPZtO3bt2tDAXa58847taFs2opz92m3j36Pq7cnIqKqqCGa+ZR7J/avHnds2df61YFs2sGDB7WBALt87Wtf0wayaXff+ZB2++j3rxPOTP+persiIqr4JozurvG4UxPNMUcbxqatWbNGGwawU7lfBpA62rZot5OsiBNRb1dERBVfrMaZpt2huaa0prSBbFomk9EGAez0yCOPaAPZtPPPuUK7nUiJaGqKersiIqr46mrSC9U7NGn65PK//t/T06MNAtjp29/+tjaQTUtecEi7nUjyNqTeroiIKr54JLNIvUOTpk1OagPZNBYADHj44Ye1gWxacpX3AiBvQ+rtioio4mMBQDVgASAiCjkWAFQDFgAiopBjAUA1YAEgIgo5FgBUAxYAIqKQYwFANWABICIKORYAVAMWACKikGMBQDVgASAiCjkWAFQDFgAiopBjAUA1YAEgIgo5");
    imageData.append("FgBUAxYAIqKQYwFANWABICIKORYAVAMWACKikGMBQDVgASAiCjkWAFQDFgAiopBjAUA1YAEgIgo5FgBUAxYAogLr6Oj4WDySdtyT9SX15A3ot64n4hGnRb2OoCUi6Zh7Wd91/cbjegAA8EPOkO/KmaLOmaDJ2eZe1hOxvlmnXk8QJ+XMlbNXvQ7juZ9Ml8cnWIzf1o12zlSvx2+J0T2fcy/jnzwuFwCAQvyTnC3qvPHbhDGZL7qX8YHH5RajS70e48Wi6R95fGLF2qlej9/iNZlej8sDAKBw0fQ6dd74LVbj7NIur2iZ59XrMZ77ibyof2LFcnap1+O3WCR9sX55AAAUTj64VOeN3+IR5zL18ormPvhWr8d4civSPrHi/C4xJh1Vr8dv8dGZ/+lexj97XC4AAIX4Zzlb1Hnjt3i0e4x7Gb/zuNzCRZy16vUYb9SoZR+PRTJb3E/oHe0TDOZf3Uf+L8Sj6Xb1OoJWF02f5V7ec65/8bgeAAD8kDPkOTlT1DkTNDnb5IyLZWeddj1BvCNnrpy96nUQERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERERUbmKRdOL66LpR2I16ZcrS+b5eE36cEM08yn1cw67CdH0593jcHOsxvmx/nkAAIrj3re697Hyvla9/w07OTPk7JAzRP88yis7a92Zq37OZamuJn2u+0mJCvds62krPqF+7mE1blzXf3av4xce1wsACNcv5H2uej8cVnJWuNfxnMf1VhQ5e9XP3XixSPoZ9ROrSNHMRPVzD6t4NL1Guz4AQKlcqN4Ph1WiJtPscX2V6Gn1czderO9pCfUTq0DONPVzD6tYNL1Ovz4AQEm497nq/XBYyVmhXV9leln93I1XF0nv8PjEKs3PG2rSn1Q/97CqG+2c6V7HBx7XCwAI1wfxSOYM9X44rOSscK/j5x7XW1Hk7FU/");
    imageData.append("d+ONGtX7R7FI+qj7Cf1W/QQrxIvxaGq8+nmHnbs1znGv6x2P6wcAhOMdeV+r3v+GnZwZ7nW96HH9lcCdtc6R2trVf6h+3mVLvnFifMT5q0pi4t3/avFo139VPw8AQHHkfat6f1vq5AxRP49yK+Ub2omIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIiIqrz/DzlRJ/hvITcFAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageaf5df3201cef1baadaa0ed502fbe6908 = new WeakReference<>(result);
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
g.transform(new AffineTransform(26.4609375f, 0.0f, 0.0f, 26.4609375f, 3726.0f, 8076.0f));
// _0_1_0_0_0_0_0_0_1_0
BufferedImage imageaf5df3201cef1baadaa0ed502fbe6908=getImageaf5df3201cef1baadaa0ed502fbe6908();
if (imageaf5df3201cef1baadaa0ed502fbe6908 != null) {
    g.drawImage(imageaf5df3201cef1baadaa0ed502fbe6908, 0, 0, null);
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
        return 140.8251953125;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 305.23468017578125;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 512.0504150390625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 512.0504150390625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Editor2() {
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
       Editor2 base = new Editor2();
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
       Editor2 base = new Editor2();
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
        return Editor2::new;
    }
}

