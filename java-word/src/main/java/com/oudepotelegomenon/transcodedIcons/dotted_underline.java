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
public class dotted_underline implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image3d916d3ed9490a02873ce46d78113c00;
private static BufferedImage getImage3d916d3ed9490a02873ce46d78113c00() {
    BufferedImage result = (image3d916d3ed9490a02873ce46d78113c00 != null)
        ? image3d916d3ed9490a02873ce46d78113c00.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(9284);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAScAAAEeCAYAAADIL9MkAAAa/ElEQVR4Xu3dC3RV1ZkHcAkQaqAoj1Gx2lZQiu1oK1ZHUB52tBRKGSwiaLWADq/wqBQQpQtwIghrwFrQFEFRQB4SeQoCgiKhPhARC8NjRZYP5KEQQoEAIQk3e/YmlzXO96XezT7fudkn93/W+i1df2V/93459+Ock3PvvUApdQEAgG9YAADgAxYAAPiABQAAPmABAIAPWAAA4AMWAAD4gAUAAD5gAQCAD1gAAOADFgAA+IAFAAA+YAEAgA9YAADgAxYAAPiABQAAPmABAIAPWAAA4AMWAAD4gAUAAD5gAQCAD1gAAOADFgAA+IAFAAA+YAEAgA9YAADgAxYAAPiABQAAPmABAIAPWAAA4AMWAAD4gAUAAD5gAQCAD1gAAOADFgAA+IAFAAA+YAEkXywWSztz5kx1moOfysrKqhk0B1ksAFkHDhz4XmZmZnaPHj1mduzYcXmdOnUKq1WrVnaBbv0/Y/670bBhw/x77rlnwZAhQ17YuXNnO7o2yMvPz7900KBBU8zPq3v37vOvueaaT9LS0mI2P7PatWufaN++/coBAwa8tGvXrrZ0bTg/LAAZBQUFDdu1a7ea7sRB3Hjjjcf139iNaS0ITh+9Vh85cuQ42vMgmjZtmn/y5MmOtBbYYQHIMH/r0p1VQk5OTkyvX4PWg2DWrVt3O+21hKFDh57Q69ek9SAxFoAMc/pGd1QJ48aN08urLrQeBGNO3WivJejTPL28GkbrQWIsABmJrlG4euKJJ/TyahCtB4FUo32Wok/t9fLq/QpqQgIsABkhD6c/0HoQSNjDaV0FNSEBFoCMkIfTYFoPgqF9lhIfTq/QepAYC0BGyMMJp3XCaJ+lxIfTAloPEmMByAh5OA2g9SAY2mcp8eG0jNaDxFgAMkIeTpm0HgRD+ywFw8kdC0AGhlO00D5LiQ+nxbQeJMYCkBHycMJpnTDaZykY");
    imageData.append("Tu5YADJCHk64IC6M9llKfDi9RutBYiwAGRhO0UL7LCU+nFbQepAYC0AGhlO00D5LwZGTOxaADAynaKF9loIjJ3csABkYTtFC+ywlPpzeoPUgMRaADAynaKF9loL31rljAcjAcIoW2mcp8eGUS+tBYiwAGSEPJ7zxVxjts5T4cHqH1oPEWAAyMJyihfZZSnw4vUfrQWIsABkhDyd8npMw2mcp8eH0Pq0HibEAZGA4RQvtsxQMJ3csABkYTtFC+ywFp3XuWAAyQh5OuOYkjPZZSnw4/Y3Wg8RYADIwnKKF9lkKhpM7FoAMDKdooX2WguHkjgUgI+ThhJswhdE+S8FwcscCkIHhFC20z1Jwh7g7FoCMkIcTTuuE0T5LwXByxwKQgeEULbTPUnBa544FIAPDKVpon6XgyMkdC0AGhlO00D5LiQ+n9bQeJMYCkBHycMId4sJon6XgyMkdC0AGhlO00D5LwUemuGMByMBwihbaZykYTu5YADIwnKKF9lkKhpM7FoAMDKdooX2WguHkjgUgA8MpWmifpeDznNyxAGSEPJxwK4Ew2mcpGE7uWAAyMJyihfZZCoaTOxaADAynaKF9loLh5I4FIAPDKVpon6VgOLljAcjAcIoW2mcpGE7uWAAyQh5O+G2dMNpnKfHhtJHWg8RYADIwnKKF9llKfDjh21ccsABkYDhFC+2zFNyE6Y4FIAPDKVpon6XgyMkdC0AGhlO00D5LwQVxdywAGRhO0UL7LAXDyR0LQAaGU7TQPkvBcHLHApCB4RQttM9ScM3JHQtARsjDCTdhCqN9loLh5I4FIAPDKVpon6VgOLljAcjAcIoW2mcpGE7uWAAyMJyihfZZCi6Iu2MByAh5OOGCuDDaZyl4b507FoAMDKdooX2WguHkjgUgA8MpWmifpWA4uWMByMBwihbaZykYTu5YADJCHk64IC6M9lkKhpM7FoCMkIcTjpyE0T5LwW/r3LEAZGA4RQvtsxQMJ3csABkh");
    imageData.append("Dyec1gmjfZaC4eSOBSADwylaaJ+lYDi5YwHIwHCKFtpnKRhO7lgAMjCcooX2WQqGkzsWgAwMp2ihfZaC4eSOBSADwylaaJ+lYDi5YwHIwHCKFtpnKRhO7lgAMjCcooX2WQruEHfHApCB4RQttM9ScOTkjgUgA8MpWmifpWA4uWMByMBwihbaZykYTu5YADIwnKKF9lkKrjm5YwHICHk4DaL1IBjaZykYTu5YADIwnKKF9llKfDh9QOtBYiwAGRhO0UL7LCU+nDbRepAYC0AGhlO00D5LiQ+nD2k9SIwFIAPDKVpon6VgOLljAcjAcIoW2mcp8eG0mdaDxFgAMjCcooX2WUp8OH1E60FiLAAZGE7RQvssBcPJHQtABoZTtNA+S8FwcscCkIHhFC20z1IwnNyxAGSEPJzw9hVhtM9ScEHcHQtABoZTtNA+S8FNmO5YADIwnKKF9llKfDi9R+tBYiwAGRhO0UL7LCU+nP5G60FiLAAZIQ8nXBAXRvssJT6ccmk9SIwFIAPDKVpon6XEh9M7tB4kxgKQEfJwGkjrQTC0z1JwzckdC0AGhlO00D5LwZGTOxaADAynaKF9loJrTu5YADIwnKKF9lkKhpM7FoAMDKdooX2WEh9OG2g9SIwFIAPDKVpon6XgPid3LAAZGE7RQvssBcPJHQtARsjDaQCtB8HQPkvBcHLHApAR8nDKpPUgGNpnKRhO7lgAMjCcooX2WQouiLtjAcgIeTj1o/UgGNpnKbiVwB0LQAaGU7TQPkuJD6f1tB4kxgKQEfJw6kvrQTC0z1Jw5OSOBSAj5OHUh9aDYGifpeC9de5YADJCHk69aT0IhvZZSnw4vU/rQWIsABkhD6f/pPUgGNpnKRhO7lgAMjCcooX2WUp8OG2k9SAxFoCMsIZTVlaWXh4XxKXRPkvBcHLHApAR1nAaPXq0Xh5vX5FG+ywFF8TdsQBkhDWchg8frpdXf6D1IBjaZymdOnXSy6vltB4kxgKQ");
    imageData.append("EdZwGjTIfLeB+iOtB8HQPkvp1q2bXl49S+tBYiwAGWlpaTG6o0ro3dvcRaCG0noQDO2zlF69eunl1UO0HiTGApCRnp5eTHdUCQ888IBeHsNJUllZWRrts5TMTPMebfWvtCYkxgKQcdFFFx2lO6qELl266OUxnCSVlpbWon2WMnSo+VGpurQmJMYCkNG4ceNP6Y4qoVWrVnp5DCdJp06dupj2WcqoUaN0CZVGa0JiLAAZLVu2fJfuqBKuvvpqvbwaRuuBu0OHDv2A9lnKk08+qUtgOLlgAcjo0KHD63RHlZCRkaGXV3+i9cDdrl27fk77LGXKlCllCsPJCQtAxt133/0q3VGlFBUVPUXrgbvc3Nx2tMdSli1bdkrXqEZrQmIsABn33XffXLqjStmzZ886Wg/cLV269C7aYyk7duzYSeuBHRaAjB49esykO6qU1atXn6D1wF1OTk5X2mMpR48eXU/rgR0WgIyePXu+RHdUKfGLrKwmuFmwYME9tMcSzPXBsrKyt2g9sMMCkDFw4MC/0p1VSvwtEZfQmuBm4sSJw2iPJVx77bV6eYXh5IgFIGPu3Ll96c4qpVmzZrqEmkJrgpt69eodoT2WEP9EAgwnRywAGfv3729Md1YpaWlpqri4eCWtCW5of6X06WM+6l29RuuBHRaAjDDfr2Vs27btbVoTzt/27duvo72Vkp2drUvgyyhcsQDkhPXJBEZWVlYRrQfnb/DgwZNpb6Vs3rxZl1DVaU2wwwKQc9VVV31Gd1gpt9xyiy6hGtCacH70qdc02lsJtWrVMqfexbQe2GMByBk7duyf6E4rxVx3Onbs2Be0JpyfSy+99GvaWwnxvzxepPXAHgtAzsKFC++nO62kxYsXlyi8b8tZLBZLC+sTS/Xpoi6hRtKaYI8FIGfLli2/ojutpO7du8d0nZ/SumDn0UcfHU97KmXOnDm6hOpHa4I9FoCckpKSDLrTSkpPTzfXNX5H60JiZWVl1cK8Jrh7");
    imageData.append("925dRl1M64I9FoCsGjVqlNIdV1J2drY5tWN14dvt2bPn+9WrVz9D+ymhadOm5m0ruBgeEAtA1tSpUzPpzivphhtu0GWUeT8Lqw3/3FNPPfVH2kspI0aM0CUUjmgDYgHIOnz48OVhXXQ9Jy8vL4fWhX+uqKgoI8yfycaNG821QPO3BqsN9lgAskpKSr7boEGDw3QHltS+fXvzaYv1aG2o2LRp0/rQHkpp1KiRisVi5iNtvkPrwvlhAci77rrrttGdWNrOnTvX07pQsfr16xfQ/knp37+/LqH205pw/lgA8lasWNGD7sTSOnfufFLhb+uE5s2bdy/tnaQ1a9boMsp8CwWrDeeHBSDPvAk4zGsc5/z9739fRWvD/9e2bdu3ad+kXH755Uqfxh+kNcENCyAcYX1V1Dc1btzYXO+4idaGcrNnz34gzL8kxo4dq8soc/clqw3njwUQDv3CeIzuzGEYM2bMIV2vJq2f6o4dO3ZR3bp1j9F+STFv9D106JD5xQS+3VcICyA8Yd30903mDcFffPHFM7R2qhs9evR/0V5J6tmzpy6jNtC64I4FEB599NSP7tRhaNKkSfGZM2ea0PqpKuyL4MZHH32kS6metDa4YwGE5+uvv/4Z3anD0qFDh8MKpxgXFBQU1L/kkksO0v5Iuu2223QpZd5GVIPWB3csgHA1b958O925wzJ+/Pi/6ZoX0seQSn784x/voH2RtnLlSnOt6Ze0NgTDAghXcXFxRthvBv6mFStWTKCPIRWcOnUqI+wjJuPOO+80b/LN1zVr08cAwbAAwnf77beHflvBN7388ssz6GOo6tq0abOe9kFatWrV1NatW81R0120PgTHAghffn5+M7qjh8nc2zN58uSl9HFUVfpoZg3tQRgeeughXQ6/oQsLCyA59I69mO7sYTID6rHHHlsUi8Wq7BuES0pKaibjGpNhvmp8/37zFjrVij4OkMECSI7CwsIfJuO+J+rmm2/OO3LkyK308UTd");
    imageData.append("9u3bf5LMfmZlZemy6nn6OEAOCyB51q5d2zXMt1N8m02bNt2vH0Mt+piixnzc7qhRo7Lo8wvTTTfdZN5Dd0bX/wF9PCCHBZA8+oWVrk8Pkvabu28yQ/HKK6888Y9//KMZfVxRUVRU9J2mTZvmJXPA165dW33yySe6vLqOPh6QxQJIroMHDzanL4BkMt9KnJmZuZo+Lt/17dv3ufT09GL6fML2/PPmTE6Z+8fwlVwhYwEk39ixYxfRF0GyxS+YT9NHUt5+FtGJEydqm/fI1atX7wh9/MnQuXNnc0/T/9DHBeFgAVSO1q1bJ+W3TImYIdWlS5flGzdu/G1paWkd+jgrQ25ubuuhQ4dOoo81ma644gqVn5+Pe5qSiAVQOY4dO/bzmjVrVsr1p28zaNCgqfpFeWVRUVF9+pjDUlhYeNHnn3/+w+HDh/+3Oe2kjynZLr74YrV9+3b90NQ99LFCeFgAlWf//v1tk3lx15Z5TBkZGScvu+yyr1q0aLExLy/vevNbMvr4g3jzzTf//ZZbbnm/UaNGB+rUqVPoSx/M5zRt2GDus1R/VbjOlFQsgMq1c+fOu+kLxFdmgJgPcNOnpLmdOnVapk8HF/bp02daVlbWqPnz53dfv359GzN0Zs2a9ftx48aN1EdhU7p27Zpj/t9f/OIXb5lhZ46MfBlElHl7yqJFi/SPRb2tMJiSjgVQ+VavXj2KvlAg+bKzs/WPQ+XSnw8kBwvAD88///wM+mKB5Jk0aZL+MaitCt9oU2lYAP549NFHk3qDIVygatasqebNm2d+K2c+rA+DqRKxALxSY/bs2RvoCwjCUbduXfXWW2/ptqt3teoV/DwgiVgA/snLyxucnp7OXkwgx3zn3Nat5ixOvaSJ/iYS3LAA/HTkyJFfNWzYEKd4IWjdurX68ssvzRt5n6Z9h8rDAvBXLBa7qHv37vvoiwvcmOtLEyZMUGfOnDHXl9rTfkPlYgH4b9WqVa9mZGTgKCqAZs2ama9z");
    imageData.append("Mhe+P6b9BT+wAKKhsLDwty1atGAvOvh25sbKgQMHqpMnT5qvcmqncHOlt1gAkVJ/8eLFaxs0aMBehMC1b9/+3EXvN7WrKugneIQFED0lJSXdpk6duql27do41atA8+bN1ZtvmnmkdmudaP/ATyyA6NKnKv1HjBhxqEaNGuwFmoqaNGmi5s6dq2KxWIHC531HDgsg8mocPXp0xCOPPKIaNmzIXrBVnbmm1LFjR/MtvGYo6XaovqYnFfQJPMcCqDLq6hdn24ULFx5q1aoVexFXNea6mz5qVJ999pl+6uoLVf6VTXj7SYSxAKqk+/bt2zdz2LBhZ8ypDn1hR1X9+vXV/fffr3JyclRRUdFp/TzNV6/jfqUqggVQ5XXdu3fv4kmTJp2+7bbbzBccsBe9z5o2bar0kFW5ubllpaWlx/XzWaj1UnjLSZXDAkgpdx45cmTHkiVL9g8ZMiR26623nv0mWzoQKsuFF16oWrZsqQYPHqxmz55dtnv37iJVfsr2vnZNBc8HqhAWQEoyF4wbaFfFYrHJO3bsOPHiiy+qzMxMdccdd6gf/ehHZwcFHR5S6tWrp66//vqzF7LNDZIzZsw4ez+SPjIyd3Dv0n6jXaJdrHCElDJYABBnhsBPtQ5a37KysiUFBQVfbNmy5bQ+0lLPPPOMGj9+vBo9erQaPny4GjBggHrwwQfVvffeq+666y7VrVs31bNnT9W/f3+lj8rUyJEj1RNPPHH2Q9ymT5+uVq1apfQQVMePHzd3an+t5Wg94/Xu1K6o4DFBCmEBgCVztGW+4+7XWh/tEW2UNqYCo+P/3VwbaqlwBAQWWAAA4AMWAAD4gAUAAD5gAQCAD1gAAOADFgAA+IAFAAA+YAEAgA9YAADgAxYAAPiABQAAPmABAIAPWAAA4AMWAAD4gAUAAD5gAQCAD1gAAOADFgAA+IAFAAA+YAEAgA9YAADgAxYAAPiABQAAPmABAIAPWAAA4AMWAAD4gAUAAD5gQSoZ");
    imageData.append("N27cyCeffPKx3bt3X/3ll19e+fHHH//snXfeufXDDz/8+caNG/9t1apVv1qwYME9S5cu/Y/ly5d3nD59eu+pU6f2o+ucj7KysmpPP/30w2PGjHl83bp1t3/wwQc3v/766x1ycnK6rlix4tcrV65sP3PmzB5TpkwZNHv27AdeffXVu//85z8PMfSfr0bXs/Xcc8/17dev39S//OUvf9iwYUMr89xeeeWVbqauqTFr1qzfT548efCzzz47IDs7O3PUqFFZ06ZN66P/bBpdy1ZpaWmNxx9/fEzv3r2nm+fz7rvvtnzvvfdamPrmub/xxhu/NH01z3fGjBkPvvDCCw+ZupMmTRqq/3w6Xc/WxIkThz388MNPm+eRm5vbetOmTTeZ2ubnaqxdu/aO1atXt9u1a1ezzz///IemFwsXLuyi/2x1utb5MM8hKytrlNlftmzZcsO2bduuM7Zv3/4Ts2+9/fbbbRcvXnyX6fv8+fO7m5+Fec76z9aga0EKD6edO3dee4F++i70dpquZ+urr766jK5nS2+H6Ho2Fi1a9Fu6li29Lafr2TIDka5nS2+v0vVsmKFP17Klt3foerbmzZt3L13Plt4+puuBOtuZlGT+tqY7iS29nVGORzGbN2++ka5nS2/5dD0bAZ/rXrqeLXOESNez5Vq3V69eL9K1bMU3tqYNcxRE17MV39iaqY4FqeLTTz9tTHcSW6p8OLE1bRw+fLgBXc+WchxO5vSQrmVLb6/T9WyZ0yq6ni29baDr2VizZs2ddC1beovR9Wzt27fve3Q9W3oro+uBOtuZlFRSUlKT7iS2VIDhdPLkyQy6ni3leFoX8JRjBl3P1pw5c35H17Olt/l0PRuHDh36F7qWLb0V0fVsnT59uhZdz5YKsD9VZSxIFRhOdvT2Il3Plrn4S9ezpRyvOeXn5zeka9nSWwldz9aJEydq0/VsKRw5VYgFqaKoqOg7dCexpbdSup6tyhhOc+fOvY+uZUtvM+l6");
    imageData.append("tsxv4uh6tvS2mK5nI+DplfPPtaCgoD5dz5bCcKoQC1IFhpMdvb1E17NlbpGg69lSjkdOe/fuvYKuZUsFOHI6ePDgJXQ9WyrAta6qjAWpIuBwct6JK2M4Bbz2M4uuZ8vc70PXs6W3hXQ9G3v27Pk+XcuWCvBzPXDgQCO6ni0V4DJBVcaCVBHwAmZlHTk5/bbu5Zdfvp+uZUtvs+l6tswNrHQ9W8rxtC7gb2Gdh1PAoYjhVAEWpIri4uJ0upPYUhEbTpV15BRwODmd1uXl5TWla9nSWzFdz1bAoYjhVAEWpIrKOnIK+Fsdp9O6gNecnIeTeUsIXc+W3l6h69kIeOe/860E5q0wdD1bCsOpQixIFadOnbqQ7iS2VIDhVFhYWIeuZ0s5DifzPi66li29zaHr2VqyZElnup4t5Xifk3kfG13Llt5O0fVsbd269Xq6ni0VYH+qyliQKiJ65HSQrmcj4HCaR9eztWzZsk50PVt6y6Hr2TBv4qZr2dLbSbqerYBHbDhyqgALUoV5xzzdSWypAMMp4DUnp+EU8CZM5yOngG84dvptXcBrP87DyXy6AV3PlsKtBBViQao4fvz4d+lOYksF+Jsu4HvrnE7rAr63bi5dz5b5CBG6ni29raDr2Xjttdd+Q9eypQJ82oT56Bu6ni2FmzArxIJUEXAndv5UAvM5QnQ9W8rxt3UBP5XA+SNTAr5T/126no0uXbospGvZUgGOYDIzM7PperbiG1sz1bEgVUyYMGEE3UlsqfKduBZd00bAe46OuNQNOJycP+Mo4EemOH3GUevWrXPpWrZUgCOYNm3arKfr2QpStypjQQoxnz5ojkTMZobNce2YKr/X5RxzhGR2HPPfzXUm8+9mW6T4erYytBOqfDPrmoHzqSo/ZSuI/9M8DnNDoKl/7jGYzfUU6ypV/nzMZtYyz8X8Zuqw9rUqr2tOaUwt85jO1TPbRMXXs3W1Kq91bjNrm+s6+7T9qrz+UVX+WMyv8b/5");
    imageData.append("/45UfD0b16jyOuc287xMP00N8zM2TG/NczTMv597zsMVX8/W5er/enzu51oYz8xzM8xjMfXM8zS9NpupG+jTVasqFkDSOJ0WghXTW/Q34lgAAOADFgAA+IAFAAA+YAEAgA9YAADgAxYAAPiABQAAPmABAIAPWAAA4AMWAAD4gAUAAD5gAQCAD1gAAOADFgAA+IAFAAA+YAEAgA9YAADgAxYAAPiABQAAPmABAIAPWAAA4AMWAAD4gAUAAD5gAQCAD/4XOXmRkLLeFq4AAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image3d916d3ed9490a02873ce46d78113c00 = new WeakReference<>(result);
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
g.transform(new AffineTransform(26.461017608642578f, 0.0f, 0.0f, 26.461538314819336f, 6597.0f, 11066.0f));
// _0_1_0_0_0_0_0_0_1_0
BufferedImage image3d916d3ed9490a02873ce46d78113c00=getImage3d916d3ed9490a02873ce46d78113c00();
if (image3d916d3ed9490a02873ce46d78113c00 != null) {
    g.drawImage(image3d916d3ed9490a02873ce46d78113c00, 0, 0, null);
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
        return 249.33543395996094;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 418.2425537109375;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 295.0299072265625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 286.0346374511719;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private dotted_underline() {
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
       dotted_underline base = new dotted_underline();
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
       dotted_underline base = new dotted_underline();
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
        return dotted_underline::new;
    }
}

