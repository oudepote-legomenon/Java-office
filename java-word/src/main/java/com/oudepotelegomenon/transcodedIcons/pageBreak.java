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
public class pageBreak implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image8179a643b2fe55aafba9b51fbfa64b69;
private static BufferedImage getImage8179a643b2fe55aafba9b51fbfa64b69() {
    BufferedImage result = (image8179a643b2fe55aafba9b51fbfa64b69 != null)
        ? image8179a643b2fe55aafba9b51fbfa64b69.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(13904);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAog0lEQVR4Xu3d65PkZ3mf8eUgC4EQsGx3q4RwOAjisiQnHBysSDu7RRnMJiY4OMN2z2pBiFiJX/mFyy/yIq4FXNruXgGFYgtWgO0iDtj6G+yyCSCBzFECY6iCckSETo4B67Q73UPn+e2OQLr6t6uZnZlvn65P1VXCGHbu4el67tnumZ5duzQTdt88uqjVH3YaveHHGv3hnc3e8MHS6noPrv97t7a6w/ae3uj5/O9LkmbTGw4dumhfp9MpfWyp3b5zqdN5sLS63oPVv7e307l178pK++rrr/f+nxd7bhy9uiz1T5Tl/mhptMEeLV8ofLzRH72Kf54kaTZcc/Dgq8uC/8TSysqj5Z+jDVX9Z9vtj5d/ev/Pqks/OLqg2RvcVJb5oGbBb7TV8mf0X3Zk9Bz++ZKk6XTV8vIFZZnfVBqMLfiNt7qv0+nvv+467/9ZUv3Nvdlbu7tmoZ9rd5Q/82J+HEnSdKn+5l6W9901C/3carfv2L+87P0/CxpHV1/TPP36Ppf4Vvt+q3vySn48SdJ0KMv6NUunX98fX+Rb6/tLhw55/0+z03/z35Hlf6pGb3iPzwRI0vRZ/5v/Tiz/J7rHZwKmVPU6fbO39jUu7R3o9stuHp3Pjy9Jmozqdfp9nc7Xapb2dnf7gQMHvP+nzfo3/HFZ70zdwXv58SVJk7F0+hv+uKx3pL2djvf/NKl+1K+5te/232wP+1KAJE3e+o/6beW7/Tfbw74UMEXWf86fS3pn6w9v4RySpKyl6uf8x5f0jra33fb+nwbVO/w1N/cmP9vVI75joCRNTvUOf5t6k5/t6xHfMXAKVG/vW7OcI5WPfZDzSJIyqrf3rVnOmdpt7/9Jq97bn4s52HHOI0nKOPXe/lzMqdpt7/9JW/8lPlzMqe7gPJKkjPVf7DO+nBO1297/k1aW8EM1iznVA5xHkpRRFvFDY4s5l/f/");
    imageData.append("pJUlfLJmMac6wXkkSRllCZ+sWcypvP8nrWYpR+M8kqSMmqUcjfMojAs5HeeRJGVwIafjPArjQk7HeSRJGVzI6TiPwriQ03EeSVIGF3I6zqMwLuR0nEeSlMGFnI7zKIwLOR3nkSRlcCGn4zwK40JOx3kkSRlcyOk4j8K4kNNxHklSBhdyOs6jMC7kdJxHkpTBhZyO8yiMCzkd55EkZXAhp+M8CuNCTsd5JEkZXMjpOI/CuJDTcR5JUgYXcjrOozAu5HScR5KUwYWcjvMojAs5HeeRJGVwIafjPArjQk7HeSRJGVzI6TiPwriQ03EeSVIGF3I6zqMwLuR0nEeSlMGFnI7zKIwLOR3nkSRlcCGn4zwK40JOx3kkSRlcyOk4j8K4kNNxHklSBhdyOs6jMC7kdJxHkpTBhZyO8yiMCzkd55EkZXAhp+M8CuNCTsd5JEkZXMjpOI/CuJDTcR5JUgYXcjrOozAu5HScR5KUwYWcjvMojAs5HeeRJGVwIafjPArjQk7HeSRJGVzI6TiPwriQ03EeSVIGF3I6zqMwLuR0nEeSlMGFnI7zKIwLOR3nkSRlcCGn4zwK40JOx3kkSRlcyOk4j8K4kNNxHklSBhdyOs6jMC7kdJxHkpTBhZyO8yiMCzkd55EkZXAhp+M8CuNCTsd5JEkZXMjpOI/CuJDTcR5JUgYXcjrOozAu5HScR5KUwYWcjvMojAs5HeeRJGVwIafjPArjQk7HeSRJGVzI6TiPwriQ03EeSVIGF3I6zqMwLuR0nEeSlMGFnI7zKIwLOR3nkSRlcCGn4zwK40JOx3kkSRlcyOk4j8K4kNNxHklSBhdyOs6jMC7kdJxHkpTBhZyO8yiMCzkd55EkZXAhp+M8CuNCTsd5JEkZXMjpOI/CuJDTcR5JUgYXcjrOozAu5HScR5KUwYWcjvMojAs5HeeRJGVwIafjPArjQk7HeSRJGVzI6TiPwriQ03EeSVIGF3I6zqMwLuR0nEeSlMGF");
    imageData.append("nI7zKIwLOR3nkSRlcCGn4zwK40JOx3kkSRlcyOk4j8K4kNNxHklSBhdyOs6jMC7kdJxHkpTBhZyO8yiMCzkd55EkZXAhp+M8CuNCTsd5JEkZXMjpOI/CuJDTcR5JUgYXcjrOozAu5HScR5KUwYWcjvMojAs5HeeRJGVwIafjPArjQk7HeSRJGVzI6TiPwriQ03EeSVIGF3I6zqMwLuR0nEeSlMGFnI7zKIwLOR3nkSRlcCGn4zwK40JOx3kkSRlcyOk4j8K4kNNxHklSBhdyOs6jMC7kdJxHkpTBhZyO8yiMCzkd55EkZXAhp+M8CuNCTsd5JEkZXMjpOI/CuJDTcR5JUgYXcjrOozAu5HScR5KUwYWcjvMojAs5HeeRJGVwIafjPArjQk7HeSRJGVzI6TiPwriQ03EeSVIGF3I6zqMwLuR0nEeSlMGFnI7zKIwLOR3nkSRlcCGn4zwK40JOx3kkSRlcyOk4j8K4kNNxHklSBhdyOs6jMC7kdJxHkpTBhZyO8yiMCzkd55EkZXAhp+M8CuNCTsd5JEkZXMjpOI/CuJDTcR5JUgYXcjrOozAu5HScR5KUwYWcjvMojAs5HeeRJGVwIafjPArjQk7HeSRJGVzI6TiPwriQ03EeSVIGF3I6zqMwLuR0nEeSlMGFnI7zKIwLOR3nkSRlcCGn4zwK40JOx3kkSRlcyOk4j8K4kNNxHklSBhdyOs6jMC7kdJxHkpTBhZyO8yiMCzkd55EkZXAhp+M8CuNCTsd5JEkZXMjpOI/CuJDTcR5JUgYXcjrOozAu5HScR5KUUZbwSS7lYCc4j8K4kNNxHklSRlnCD9Us5lQPcB6FcSGn4zySpIyldvvOmsWcqd2+g/MojAs5HeeRJGXs7XRuHVvMuT7KeRTGhZyO80iSMvaurLRrFnOkfSsry5xHYVzI6TiPJClj//LyhWUZP8zlHOiR6mNzHoVxIafjPJKknKV2++M1C3pna7ePcw5NABdyOs4j");
    imageData.append("ScpZWll5VVnKq2NLeuc6ec3Kyis4hyaACzkd55EkZe3rdPo1i3pHKh/rRn58TQgXcjrOI0nK2n/ddc+pfiyPy3oH+vyBAwfO58fXhHAhp+M8kqS8/cvLF5cFfU/N0t6u7r263b6EH1cTxIWcjvNIkiZj6dChK8ui/n7N8t5q9+w/ePAKfjxNGBdyOs4jSZqc/Z3OnrKwP1OzxM+126tnF/hxNAW4kNNxHknSZFWv0+/tdN5blvcjNQt9o52svuHP1/ynGBdyOs4jSZoO1d/c97bbt2zyC4FHqp/zXzp8+OX88zRluJDTcR5J0nQ59Y6B7fbBstw/WvpC6YHqb/jrVf/6C0srKx8p/3yH7/A3Q7iQ03EeSZIUwIWcjvNIkqQALuR0nEeSJAVwIafjPJIkKYALOR3nkSRJAVzI6TiPJEkK4EJOx3kkSVIAF3I6ziNJkgK4kNNxHkmSFMCFnI7zSJKkAC7kdJxHkiQFcCGn4zySJCmACzkd55EkSQFcyOk4jyRJCuBCTsd5JElSABdyOs4jSZICuJDTcR5JkhTAhZyO80iSpAAu5HScR5IkBXAhp+M8kiQpgAs5HeeRJEkBXMjpOI8kSQrgQk7HeSRJUgAXcjrOI0mSAriQ03EeSZIUwIWcjvNIkqQALuR0nEeSJAVwIafjPJIkKYALOR3nkSRJAVzI6TiPJEkK4EJOx3kkSVIAF3I6ziNJkgK4kNNxHknSdNl98+iiVn/YafSGH2v0h3eWu/vB0up6D67/e7e2usP2nt7o+fzva0pxIafjPJKk6bDnxtGry1L/RLmrH+XdfZYeLV8ofLzRH72Kf56mTM3hReM8kqTJuvSDowuavcFN5Y4e8M7eRKvlz+i/7MjoOfzzNSVqDi0a55EkTU71N/dmb+1u3tVb6I7yZ17Mj6MpUHNY0TiPJGkyGkdXX9M8/fr+2F29xb7f6p68kh9PE1ZzUNE4jyQp7/Tf/Hdk+Z+q0Rve4zMBU4aHlI7z");
    imageData.append("SJKyqtfpm721r/F+3oFuv+zm0fn8+JqQmgOKxnkkSVnr3/A3dj/vSN3Be/nxNSFjhxOO80iScqof9Wtu7bv9N9vDvhQwJWoOJxrnkSTlrP+c/9jdvKP1h7dwDk3A2MGE4zySpIzqHf6am3uTn+3qEd8xcArUHEw0ziNJyqje3pd3cqrysQ9yHoXxUNJxHklSRvXe/ryTgx3nPAqrOZRonEeSlLH+S3zG7uVQd3AehdUcSjTOI0nKKHfwQ7yTgz3AeRRWcyjROI8kKaPcwSd5Jwc7wXkU1pzsA2B0+ZHRz3EmSdLOqt6Rj/dxOL8AmLRyCP9YczCxLrlptIczSZJ2VuvYqMn7ONxDnElh5RD+oeZgYl18dPWXOZMkaWe1equ/wvs43Pc4k8KavbW7ag4mVqs7/C3OJEnaWc3u2n/hfZxt7eucSWHlID4/fjC5Gr3hpzmTJGlntXrD23gfh/ssZ1JYeRD8Rc3BJHu4cWR0IeeSJO2M1rHR86q7t+Y+TvYpzqWwZm/wvpqDiVa+CHkP55Ik7YxWf+0G3sP5Bkc4l8LKQRwaP5h0g+/sOj46j7NJkrZX9aPX5d797vg9nK36PQScTWF7equv58FMprXf42ySpO3V6K39t/H7N9+e/uprOZvCql/JWA5jjYczgR6vfiyF80mStkezO/i35a49UXP/plvze7+mRPnb91drDmgS3bf7A6OXcj5J0taUv+xdUu7Ye2vu3Xit/tqXOJ8mpNkbfIAHNLnW7trdG13KGSVJ56b6i1W5W+8ev28n1aDPGTUhrf7w18cPaKI91OgOljinJGlzmscGV5U79b6ae3ZiNfqDt3BOTcj69wEMeEgT7kSzv/b71c+rcl5J0tlV3+2//g1/0/Ca/5Nb9fX/KdPoD/+65qCmofua3bXf9gsBSXp61V25/nP+36u5T6ehv+TMmrDyBcD1NQc1TT3c6A3/vHr/6tax1TdUv8nKXyUsaZFVd2B1F1Z3YrO39l/X");
    imageData.append("39l10u/wd9bKPf4ufh5P6w2HDl20t93+T6VbljqdL5R+UBotraw8Wv75wFK7fcfeTufW6j9z9fXXP5//fZ3d7ptHF5XDeZSHZWZmtk09Wr3kzP1zRm88ePCVZcH/UemfTy38jfV4+cLgI/uvvfYy/nk6s3I4n6o5MDMzs63XH/5P7p1aVy0vX1AW+R+cWubjC36jrZb+4MCBA+fzz9e4Znfwa2MHZmZmti0N3sS9M+aNKyv/oizur9Qs9HNqX6fzjas7ncv5cQSj0TOavbUvjx+amZnZVlr7arVjuHaeYv/Bg1eUpf0gl/iWW1l5dO/KynX8eHqqVn94cPzgzMzMtlB/+JvcN0+x/nr/6W/u27n+9M2HD/sjZWdy2+hZzd7g78cOz8zM7Bxq9AZ/t+vI6JlcNz/1uhtuOG+p3b6zZmHvRN9aOnToSs6g0xr94XU8QDMzs3PsEPfMU5SlfLRmUe9cviRwZuUrtXJgX6w5RDMzsw3X6g3/9qx/+1//pr8TY0s6UPki4JO+JDBuT2/19c3p+DXBZmY2m61d3Fv9N9wvT1G9gQ8Xc7hv+lMC45r94UdrDtTMzOzp6w//kHvlKdZ/3v9HNUs5XfXmQb/D+RbZpR8c7S6H+MDYoZqZmZ29+1/4odELuVeeoized9Qs40nmTwk8SaM7PND0pQAzM9t4a9Uby3GfjCl/6/7DmiU86fwpgSdp9QbdmgM2MzMbq9EdvJ97pFZZtl+sWcCTz58S+Jkjo2eXQ/0sD9nMzAx9ptoZXCO1lnb+jX+2lD8lcNru3ujScrA/qDlsMzOzqnv39EaXcH+c0dLWftlPKl8SKFrdk1e2esN/qjl0MzNb7H7U6K/+a+6Ns6pZttOaPyVQ7OkP9pWDfrzm8M3MbDF7vNEf7OW+eFo1i3aq8yWBXbvKYb+9NKx5EJiZ2WJV7YLf4J7YEC7YGWnhXxJodYdvK4f+WM2DwczMFqMTjf5wmfthw2qW66y08C8JrL8c");
    imageData.append("8KOaB4WZmc13P2x0B0vcC5tSs1hnqkV/SaB17OQVze7w/9Y8OMzMbD77waa/4a8OF+qMttAvCaz/iOD/rnmQmJnZfPWZF39w9BLugXNSs0xntcV+SeDUmwUNjjR922Azs3nsJ63e4MO7jo/O4/V/zmoW6Uy36C8JrP/uAH+BkJnZ/HT/ht7bf7O4QOekhX5JoPoNUNVXik1/VNDMbJarntH95EtuHL2Y9/y2qFme89JivyRQNI6uvqY8eO6oeVCZmdlUt/bl1rHVN/Be31Y1i3OuWvSXBHYdGT2zPJgON3qDvxt/gJmZ2VTVHXyz/PNQdXfzOt92XJhz2kK/JHBKeTC1usO3tnrDvx17wJmZ2YRbu6vZHb5z122jZ/H63jE1y3JeW/iXBE4ZjZ7R7A/e3OwP/1d50D06/iA0M7NQ1R38Z83e4E3V3czresfVLMq5buFfEniSPb3R8xu94bvLFwN/VR6Eg5oHp5mZbW+rpb8sd++7qjuY93IUF+SC5EsCcMmR0XNbxwa/2uoNuuXB+bmmXxCYmW1Ha+uv6x+v3rf/Rd3RC3j/TkzNclyUfEngLBpHRhfu6a++ttUfdqo3GCpfrX66eeoLg7WvlX9+t/T/SidrHuxmZotSdQdWd+F31+/Gz56+KwdHWt1hu7pDq7uU9+vUqFmMC5UvCUiSFhIX4oLmSwKSpMVSswwXNV8SkCQtjppFuND5koAkaSFwAdqpfElAkjTfapafnc6XBCRJ86tm8dmT8iUBSdJc4sKz2nxJQJI0X2qWndXnSwKSpPlRs+jsLPmSgCRpLnDB2YbyJQFJ0myrWW62sXxJQJI0u2oWm20iXxKQJM0kLjQ7p3xJQJI0W2qWmZ1bviQgSZodNYvMtpAvCUiSZgIXWLyVlXeWfz4y9u/Pdr4kIEmabjXLK1o1w/5O5xfKv76L/78Zz5cEJEnTq2ZxRXtijv3XXfecsjA/zP//rOdLApKkqcSFla5mnnctzd9LAncv");
    imageData.append("HT78cn6ukiRNTM2yisZ5KnsPHfrFfZ3ON/ifnfEevObgwX/Fz1WSpImoWVTROM8TXvfWtz53X7v9J/zPz3j377/22sv4uUqSFFezpKJxHipfBBxemq+XBO66ann5An6ekiRF1SyoaJynzry9JLC30+nxc5QkKYrLKR3nOZPqJYGyOP+Y//0Z7cQbDx58JT9HSZJiapZTNM7zdNZfEniYf87MtbLyEX5ukiTFjC2mcJxnI+bkJYFHrr7++ufzc5MkKaJmMUXjPBs1F28ctLLydn5ekiRFjC2lcJxns2b6dwn4MoAkaVLGllI4znMurr722n9Z/qyv88+egW7n5yJJUkTNUorGec7VjP6UwP38PCRJiqhZStE4z1bN2E8JnOD8kiRF1CylaJxnq2bsC4DHOL8kSRE1Syka5zlXvgQgSdIm1CylaJznXMzsNwG225/j5yJJUsTYUgrHeTbLHwOUJOkcjC2lcJxno+bhjYD2djq/wc9LkqQILqV0nGcj5uStgB/ev7x8IT83SZIiahZTNM7zdGbsu/zP1h/xc5MkKaZmMUXjPGcyo9/lf6ZOXLOy8gp+jpIkxdQsp2icp86cPOX/08rnciM/R0mSoric0nEeWn/Kfza/y7++u65aXr6An6ckSVE1Cyoa53lC9ZR/Wf5/wv/8jHffGw8efCU/V0mS4mqWVDTOU5m3p/zXu39vp/NL/FwlSZqImkUVrWaedy3N11P+VXfvb7dfxs9VkqSJqVlW0Z6YYx7e2KeuvSsrn3zz4cPPe/L/5pIkTRwXVrpqhv2dzi+Uf30X/38z3uPlC5rf4f/ekiRNhZrFFa38Dfm6pfl7yv+bV3c6l/N/a0mSpkbN8rIt5FP+kqSZwAVm55xP+UuSZkfNIrPN962lQ4eu5P+2kiRNrZplZpvIp/wlSTOJC802nE/5S5JmV81is6fPp/wlSbOtZrnZWfIpf0nSXOCCszPmU/6SpPlRs+hsPJ/ylyTNl5plZ0/K");
    imageData.append("p/wlSXOJC89+mk/5S5LmV83iM5/ylyTNu5rlt9D5lL8kaSFwAS5wPuUvSVocNYtwEfMpf0nSYqlZhguVT/lLkhYSF+IC5VP+Z7H75tFFe3qrr2/2hoca3cH7W73hX5R/fXuzt3ZX+ed3y//9T+WfJ0sjM7MF7eT6Xfjdcjd+vfzz9tN35eB9re5wpbpDq7uU9+vUqFmMi5BP+UPr2Oh5rWODX231Bt1Wf+1L5YG8VvNgNzOzzVe+QBgeb/SHyy/80OiFvH8npmY5znU+5f8zL+qOXlC+Wn1P6W/Kg3NQ86A1M7PtbVC+EPjr0vUTf3aAC3KO8yn/ymj0jEZ/8JZGb/jp8kB8rObBaWZmmao7+FPN7uDXqruZ1/WOq1mU85hP+R8ZPbPVHb51/el9PgjNzGyird3d7A7fWe7qZ/P63jE1y3KuWvin/G8bPav8bf/dzd7gO+MPODMzm64Gf9/oD6+r7m5e59uOC3OOWvin/PccXX1deUB9cfwBZmZm093aV5vHBlfxXt9WNYtzHlrop/xfcHT0olZv8OHyIBqOP6jMzGxG+knpk5fcNNrDe35b1CzPmW7Rn/Lf0x3++/KAebDmgWRmZrPZA43u8ADv+y3jAp3hFvsp/yOjZzd7gyNNf37fzGwe+0n1zO6u46PzeP2fs5pFOost9FP+uz8weml5cHyu5gFjZmbz1RcvPjp6GffAOalZpjPVoj/l3zp28orygLi35kFiZmbz2X2No6uv4T7YNC7UGWqxn/IvLj462F8eCD+qeXCYmdl893CzN3gT98Km1CzWWWihn/KvtLrDt5UHwOM1DwozM1uMTjS6w3dwP2xYzXKd6hb9Kf9Ksz/8zaY/4mdmZqd3wdu5JzaEC3aKW/in/CvrT/v7N38zM3uik+f0csCpxTq+bKethX/Kv9I8dvKXykH/sObwzcxskesOf7zpbwwsy/XemoU7NfmU/2mXdEc/Xw75/rFDNzMzO90PdvdGl3J/nFFZ");
    imageData.append("sl/k0p2KVlYeLcv/Os67kE69yY8/529mZk/bHRt+s6Cldvt/jC3fyedT/k/S7A+O1RyymZnZWK3e4EbukVr7VlaWaxbwJPtTn/L/mUZ/+O+ap38hxNghm5mZ1fSTVm/4H7hPxly1vHxBWbo/qlnE6fwuf3jJjaMXN/3FPmZmtvkeqH4zLPfKmKV2+3jNQk72zas7ncs516IrB3hrzaGamZk9ff3hLdwrY964vPySsoQfq1nMO57f5V/v4qOrv9z0N/uZmdm5t9Y6tvoG7pcx+zqdG7mcdzS/y//Mbhs9q9lb+0rNYZqZmW24Vn/tS9VO4Zp5itfdcMN5S7kfCfS7/M+i0Ru+m4doZmZ2jh3mnhlzzcrKK5Z2/o2B/C7/szn1t//Bt2sO0MzMbNO1+oNv7ToyeibXzZi9hw79YlnSD9Qs7q3lU/4b0uoPOzw8MzOzrdToD5e5b2pds7z882Vhf3lsiZ9j+zqdb/hd/hswGj2j2Vu7iwdnZma2tda+Vu0Yrp1ap94fYGXl/Utb+2VBj5e/9f/3y5eXf45/vsY1+oO3jB+amZnZNtQfvJl756yq7wvY227fUpb5wzUL/kz9sPShpcOHX84/T2fW6A0/PXZgZmZm29Ofce9sSPWNe/va7f946ouBdvtzZcHfV/0Nv3ptv/R/yr/+/L6VlQ+Wv/G/zW/y27zdN48uKofzaM2BmZmZbUePvag7egH3jyas1R/+55rDmp66wx+Xf36qmrN6k6KLbxw1NvwbpyRpHpU7sLoLqzux1R3+1vqzuP88dn9OUdWPmfPT0IS1esO/4UFNR4NvN/rD6y85MnouZ5YkPVV1V5b7/D3l7vzO+H06BfWHf8WZNUHrT/8Pxg5qsj3W7K397q4jo2dzXknS0zg+Oq/cob9X7tLHa+7XSbbaODK6kONqQlr94a/XHNIEG3yndezkFZxTkrQ5rd7qr5R79b7xe3ZyNbrDA5xTE9LsDj7IA5pca1859fq+JGlb");
    imageData.append("7O6NLp2q93jpD45xRk1IeWB8deyAJtLgOy5/Sdp+uz8wemlzap4JWPsy59MErL/+Pw2/9vcxn/aXpJ3TPDa4qty1J2ru33Rrfh/AFNjTW319zeFMoLXf5WySpO3V7K/9/vj9m29Pf/W1nE1h5SAO8WDyDb7td/tL0s6r/ubdnIKXAqpfPMfZFFaW7/t4MOmqn/PnXJKkndHsrv027+F8gyOcS2Gt3vC28YMJ1h3+2Df5kaSc1rHR85oTfsfA6l0LOZfCykF8ngcT7lOcSZK0s8oC/vOa+zjZ5ziTwib9s6HVe/tzJknSzmr1127gfZxt7eucSWHlIP5h/GByVb/EgjNJknbW+jsEjt3Jwb7HmRRWDuEfaw4m1iU3jfZwJknSzmodGzV5H4d7iDMprBzCyZqDiXX5kdHPcSZJ0s667ObR+byPw53gTAqrOZRonEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZ");
    imageData.append("vI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgP");
    imageData.append("JB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv");
    imageData.append("43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYTyQdJxHkpTB+zgd51EYDyQd55EkZfA+Tsd5FMYDScd5JEkZvI/TcR6F8UDScR5JUgbv43ScR2E8kHScR5KUwfs4HedRGA8kHeeRJGXwPk7HeRTGA0nHeSRJGbyP03EehfFA0nEeSVIG7+N0nEdhPJB0nEeSlMH7OB3nURgPJB3nkSRl8D5Ox3kUxgNJx3kkSRm8j9NxHoXxQNJxHklSBu/jdJxHYeUQTvJQgp3gPJKkjKb3/2Irh/BQzcGkeoDzSJIymt7/i63RH95ZczCp7uA8kqQM7/8FVw7h1pqDydQffpTzSJIymt7/i63VHbbHDiZU+epzmfNIkjK8/xdc48jownIYD/NwAj1SfWzOI0nK8P7XrkZv+PGaA9rpjnMOSVKW9/+Ca/RHryoHslpzSDvVydbR0Ss4hyQpy/tfu5q9Qb/moHakVm9wIz++JGkyvP8X3MuOjJ5TDucOHtYO9PnLbh6dz48vSZoM739VTwVd3OgN76k5tO3q3j290SX8uJKkyfL+165W9+SV5aC+X3N4W6p6YLWOnbyCH0+SNB28/7XrkptGe8qhfYaHuIVur7665MeRJE0X73/tql6naXYH7y2H90jNgW60k9U3fPiajyTNDu9/nVJ95dbsD2/Z5AOh+s8ebx0bvZx/niRpNnj/65TqXZta/eHB6v2bm93hF8oBP9A8/askqx5Y//c+0ugO3+E7PEnS/Nip+///Aw0d5vgBy0lOAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image8179a643b2fe55aafba9b51fbfa64b69 = new WeakReference<>(result);
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
BufferedImage image8179a643b2fe55aafba9b51fbfa64b69=getImage8179a643b2fe55aafba9b51fbfa64b69();
if (image8179a643b2fe55aafba9b51fbfa64b69 != null) {
    g.drawImage(image8179a643b2fe55aafba9b51fbfa64b69, 0, 0, null);
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
	private pageBreak() {
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
       pageBreak base = new pageBreak();
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
       pageBreak base = new pageBreak();
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
        return pageBreak::new;
    }
}

