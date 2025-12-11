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
public class icons8_language_94 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image17fa8167502be972fe81e7f1a1eca3b1;
private static BufferedImage getImage17fa8167502be972fe81e7f1a1eca3b1() {
    BufferedImage result = (image17fa8167502be972fe81e7f1a1eca3b1 != null)
        ? image17fa8167502be972fe81e7f1a1eca3b1.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(18996);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAF4AAABeCAYAAACq0qNuAAA3cElEQVR4Xu2cB3QUR7a/e9jd997auwbLoJlRzjmNcs4kgUAgcs7RILIBkzFgMEkkkXNOImcQCIQkJKIQQkgCaZQjwRibMH3/v+rukYTs9Vq7753/O+dR53x7q6t7ujVf3blVbe8xx31qn9qn9ql9ap/ap/apfWqf2qf2qX1qn9qn9qn9++0yEZfwP8AVnueuIdZv7PjKb1z7vwHt33WJPv6b/1sb4eZqUCI9qOEf8d8B+yJM9ElMwArEcun4f614/J0sMh97QDYYCk7Rf9NE8LgRgc0/EVej4WX3f6Emt3+uxzvwVuqzc+inSefSwS0tb1nkhX7qm98mGdzFPe4TybJ43IcwTmK8VQ/teMrvkCxxk8GLMUnDN7nxgT7mPXgnkvhPuAauMt7yTa7+wsZ4oc/OlWh4boKGuCNwlfnvyK/6wHME2XSP54qIb7K4mpqwCaAP4B3OvUN8K04K8VKfndP22XntNSyy696zY3z2DeLPiD+zCH4R+ZmNSRP9FLwE1cQLsT6vQI1wToT1tTyXqJSOKyTYMfsVlUBOKS9SxsDfXI5nl4HCtyJFEsX1KMF3KAJqBr5DEf7uyg8aruq9+Ddzc3lu4itqsvw5L+PkzwWHu4s1Daz+gSYIucNzN5B9hC8/kskiUrz+QC7V7/g6eKCR+u95F/wqXCrRr0Eff5RLOfpl73hVGc+rKt7zKhyrSn8BbzFWj3KAL+SOZxmDZnk82eUSOWYT74IIWBTJA08AO8diQ3LAY6mfJfRJIAtkasjlkRYe4PtkvUV8Ry4ZEg9/g8z3iOABA98hA5/J+sA7Zb0nh1INb0ak+csMONtUw3Ndakh28PIb7mXu+4Zaf7/FoX5RFXGJpBFm8yfifY+84o/OLuWLJ1Tz1eOq+Jpx1XxNDKOqjrESY+rxNaOyjtEVdYxilEuU8TXDy+nlwKe8ev+LD09OEV+9");
    imageData.append("V8NX7eGpZjfP1+xCZOzUiGwH2yS2gi0CfM1msAlslFgP4rR84GvWgTUSqz9QzSpERixYCVaA5Yz3fM0yiR/eiSwBi9+KLPqFr1n4M1+94Ce+ak4NXz63kh7GvqD1p1/yHl3gzIYl7NMPHFf2rqHe326ooRxqJHcb5YVlOsS3vfKBfhlaSNQdKdPjEVHX36ELClxXCdav5SFRdH0yJB4QdQadQBccB6Z8oI53fqGlb3haAL77iWjeTzzNfU0050ee5rziaRaYwXjJ07dgOuMFT1Of8/QNmFIjMrmap0kSE6t4mgDGV/I0rkIkBoxF/RkDvi4jGl0qMgq7iJFgRLHI8CIJOBgGhqsRBXgaUsDToHyigej3K+FpTBH/fmMx9Z6ZreGGlmmazHij4eayUvTP2oKKCm56eQkXUEIy8yLiNhTxZ7tlaCji+vu3XZLea6Kuv+M7Xn8LfpFiQ9g4SEQ/kcVf+A6Maw24yviZ75AgEnnlDR+ZAK681rgfqvow4NkHzUQU+AmVPD+xgucngPHlIuPKiI8p5fmxpSQwpoT4r4uJH83AgjQKjCwkfgRDLTK8gPhh+SJDnxE/5KnI4DyeH8TI5fmBYEAOz/fP0fD9n4BsDd+P8VjD9wX9shAZjyQyPwj0efhB0yfzg6bzvbdvw9LfUt9bbx/ejn/+H8Rt57JuvxHXgH/WjuXkcBcyirAAPuGo5OF/uu6tyTDe9yM57Xuusd1VQ7Y7q3mbnVW8zS6J+n1gK43ZsnGBSt5mRz22Myp4m211WG9hlPNWm8t4u53l5BiXT2EXX/ADIK7vM57vB1H9IKk/ins/yOkrQHwfSOrzhOd7MbJFej7m+R5ZDA3fA3K6g26Qw+j68APfJQM8eM9Hg873Je694zvdfctH3X3HR91Bwtz+RSQdyZH2Cx/JwJaM0T4VpLzh2zGSRSJuvqEIbMlaJ73m/c+9JK/9lc87bC0ydZuRzfU4Uy37torn5lT+nvyZMzluxgzO");
    imageData.append("e/ERGa0h7tsfEptarFDnmWyqJKtNZRrrjaUEeJESst4EWGzYr88GRrGA1XpERpyWIrJaVwtvtbaQLOMKeds1T3mPLfl878dvqXc2MuqJhvo8FumdBbAy9sKq2CvzA/V8yHhPPTJEuj94R91A1/uMt9TlHrjL+IWiUcI6M7DX7ZT+BvxMUWlvBDreekMdUn8Cr6lDyk8UmfKa2if/SO1v/kjtksANkQjG9VcUkfiK2l57xQNqc+0l3/rqKz7s8gve53gVee6q/NF/Za6jy7x0LnR9aZPO+4jrtO/3xM+eLeA8e5/s3OACrvfk+C/NluQWGK0vY9I0VnFMHgStL2LxH1AoEteAdVrUApZrJdYwCshytYjFqnyyQcbbL8+mDjefU6/st9QT245eWe8g+x31zJR4+Bai31J3gV8gG+Alo+v9n6nrvZ8h/A1kv6Fo0PkOuP0TdWKkv4ZoLT9C+I+QDVJeQTZIfgXhLyH8JYSLRNx4AdmM5xD+nNoyrj2nNldFWicI8GGXqnmfY+XkubPix8Dl2S7uc9O4sLiiJl0PEsf4x00SbzP9gGxbxxKu4+gTXxovyFYbri0hi3VFGss1hUwWbwFhIgX/mDX1UYtxdX4DnkE0iAUrRcxXPMUEQP6ybPI/rKaeT95Qt8w3WNR/oR6Zv1B3xkNIzvhZoOuDNwJd7v8E2T9RNOMu4zV1Bp3uMH6kqNuQnM54RR3SwC2Q+pIiJdqnvKB2jGQIxoRHJEncqKG218GNampzHSSCa9XU+iqjilolgKvVPCP0UiXvfayMPHaWvw74IVvlOvMWF7q2sBHip+2SxbW/y7UfuV/HeH6W2jC2iMxXqTUWqyAvtoA3R1aar/4YJlIYl84JYlk/VoxMrjkTK0kW+iufCqLNl9eLy56S2bI8slmRS05rH1Pn+y+wQ/oJsAmA6Icg441AFyb8wU+C9GjQ+d5rgU53fxRlC7yijrdfCcJF6RDNuPWC2jNSJeEpzyFdJCIJ");
    imageData.append("om+CJEjWCgetr1dR60RwDbIZTLwkv2VCFR9ysZL3OlZK7hDvs/SRq+OsZC54bcEfF2/9zR7ZiohMLmL4IR3DOVlq/eWFZLayQGO+AiJXPOMBi3+M5WIWC1K1MLlLRcFmS0XMWfxBYkkuWS6H/MWZ1PJyCXXNeo0t6GtsSSGZCQfREM7oLAnvpAXSoxha4RKR6ZJwIAgH7Zj01OeC9IjkGgFBuFZ6UhXEV4nCJVolVkJ6JbVkXAUJlRQuUMUHX6zgveJLIL7stc/yRyrHeRAf1xjxU3fKVkamcu1G7tExnPlIrf+DGpLyNWZLnzFhvCBNi5Ch9Y/rZIpjUp8JlaLpEiZXFCywmJFDZt8jfp9DpotyyBzXWS3MIs/duRT96BV1znhdhyS8E2Kn+6LwqHsoI3clIL0DiGTCb78UpLcH7dIk4YJ0yGak1Ai0FaRDtkTrJAZkQ3yr65AN6S0TGUx6hSS+AsIrKOxKJYUlVPJBF8t5T0F8qSDeaW5jxU/aIVsVlsK1G7xbx3DGQ7Xe9wVkuvipBiDm8WaLIQ+ymMBa2FhtP/cf8309FomSTRfWY8ETARNguegJ2S/NpHbpVRSVgfIBoh5AtETUfVE4y3AmvMNdUXiHesIj0yGbAelMfMSt5yKQ3pYJB22Sq0WY8JtVgvBWTLgABAvSkdWS9HAmXAuyPexKhSS+gvdg4neVvvb9V8Sbj98hm+eXyoX136tjMC1Drbcgn0wW5WlMFuYi5vC1whbhWBhjURLH+jhXy0IJqc+uEY4XMCD4u19jOj+bjOdmkxk+Yzk3gwJPqykqEyXjPngAyfchG3SszfJXgvTIOy9FBOla4WKmt0sThbdlpNYItGHSQevkj4W3hOxWSZViH9kuSodkJl0Asq8y2YLwWvGByHiPY/XEN7bUmE3YIZsThBV54F4d/W8y1Mp5zyAkV2M8H7K+y+EbijL+DXnasY/OzRcxhlgTLfMk5j6uY85jMp4N5j0hizmPyHlD");
    imageData.append("FnV48Jwi70EwhHdg8Z4YIyE+8g5DlN4e2d7+NistyG5kfATL8jQm/AVkswjZiIJwSXqrJFG2wHWIRWTUHjPpkB/GgHSW6WFXyymUAfmhEB8iiK/g3ZHxbrvL/nXxc4NTudBBe3T0Jt9Xy2c/RQbmaIznQtrcJ7wUhawUkOSxKI6J502k80Kcoz0n9WuRJAtkkfEsxFmIM7PIaOZjMsf11vPvQ0IZ5EMok82kswwXyguTLspuB+ntWIT0dpDeFtLbaqUj09uwLId0JrxNCoRDesskMZtFiUxmmSiaCRdgwisE6aHI9jAGxAvC2fVMOmo84AOY+KOS+FiIXwDx6xsjfvxO2dyQW1zYoL06ygn31PKZeWQ0+4nGeFY2Gc16zItysusJEzGq7f/6HPuMEcQazWJCpSjwWDgWRSPOeERG39Zhgs9afHufvA/lUYcMSL0ryYfw9ky4IF0ULmS4ABMuyhaFQ3aqmOGtJOGtUM/DkenhNyAOYoMulwqEQDyTH5YIqWxCWIRsAQgPwQSFJEhcYZGJr6BgJv5CBe+mzfgVED+/0Rm/TTYnLJELHbxTRzn+rlr321xIydYYz4CkGVm8kRhFgbU8rs3S3zrHxkyA2SwtKCk4Z8iu/ZYB0dPrMU3EEH2z6Q/JYcVDanuniiLuvhDkt4NwRoQgnUVkuCBcynRkeZtbovBWgvAaaskynAlHPQ9DGQmD9KBzReS+6hG5YxF3XZRB7mszKeRSEQRjEq6VgXJRdj3hwYwrZZJ4NgGieP8G4p2Z+EZl/NjNsnmeZ7iwPpt1lGPvqHWn5kDGY43RtMdkOC2LN5yeJQipjxHGtIjn6yPKVHzzkP4+/j59MfGBEOU4NoZwQyZ4KiNT5BswJZOMpoh9U3zWYsZdCoKQCLxQtb2Dus2kS+JFRPFt0pjwF9Qa0lul1pPNsjuJyQbXWeZCXGIpeex4QkadL5FZu0tk2vI0GXc+TV67n1DI5SIKxjtE0JVSiTKRyyLB");
    imageData.append("AmwCGJhAQXx5nXhWahZC/IbGiP96i2yOy3kutOcWHcXo22rdyU/IYGqWxvCbR0wEL4gBBvVFMZg8IdbBrjGalknySQ/Ie8FDWnq+hJZdKKGVF4up5Q+Z1AKTYDyNiX4oMllLBhlOyiADYIR7mk26R66QFHEPpeM2kw/RTDZoky6BbG+dViedZXYoajQrGaycsOwNRhYHJZRS4MUiUEiucRmkH3GGjEKOk1HgQTJsuZ/sF6WR37E8CjinJv8LRSLni2sJAIH4DoGX2CSUA614ZDx2Na4Q7wfxzhAf0ijxYzbL5rqf48J6Q/yodHWLidlkMPmRxnDyI4jI5A0mSXIgyoBRK0srT8xY4TzGjKci00ek0o7LaiL6QO/e/Iz4ns4kF1HzUamYrIdkxD7L7jsxQ8CAxQkPyHD8A6FviomzXnCfwlMrqM0dJl8r/FWddGR6KwbeRFmmh2A7GIjMDLhUQgGYaFFgIfmeLSCfU0/J98QTUq1II8M2pyH9MBkG7MEE7CDLsWfJed1d8j7yhLyP55HPiWfkc5yRD/DZk4Xkf5bJZ+sCE19OgVcqeL+LYsa77imH+Mcq1cJbEN+If1Zj9jXEeyDj+0D8iDR18/GP8eUzNYAMJjzkDSY+FGQIcuqJEsG5Sey8eI0RhOnG3CWbicmUU1BFNdUvqbCoisrKqulpQSV5T7lJzcfcwXX47ATARGsZJ6Ifc5+McU+zibfxpfOpzV1kNCsryPzW6SzLmfSXgvSWWEhbYgFltdd12SNynZVBrrPBzAfkOuM+uX57j1TT75DL1HRymXKLnMfcJFOIN/TdC3aQWdh+sulxiuyHXSWnmJvkND4FpIJbEmnkMCaZXGPxfnEB8i/i13MJ4i9X8L7IeFcp431is1BqUlFq1H9cvDHET4Z4f4iXD4P4mCzSH/dQYzAOP8txD3hBBpNST5L+eJwTYj1wjQlKyd+GptCAVXfop1c/QngNlZZWkbqwnF4+f07j1t6mvw+6");
    imageData.append("SUYTpHvGiKINGGNF9Mcg4tmmY++SAxa/1ndRt9NqBPmtIL4VyktLiG+Z+oLCk8US43+qkIy6JJBxyAUyDgUh58g4+Cw4Q8ZBqOVBp8g48CQy/TgZ+u0jI5/tZOizlYz8dpJJwH4yDjiE/hEy8j0q4gO8cexzmAxUu8ms/wXyPVpAgaz0oOQEXmLiy3kVE7+HlZpMlcvCm40sNRD/nccFLrzPVh35kFvq5mMekf7YDI3BGGTk2Ae8/tgHohAtgihRmlZYrbyYe9Rs0HXafSmPfnn1igoLK0AZPcsvperqaopPyCHdAQnCdfpjJL7+GAOgN/oeGeN+Ft/epmAsiq3SkdnYo9dKR7aHo8SEYSENwyLqj5Jg3OkiGQUch+B4cAQyDwtCjf0Pgv0QuxfshtgdEArpvsBnmzAJRt6YCC/GTvQBi1LfQLWRTLodJ9XmJ8IEByDrAy6XC+JdUWpUKDUBsdkqt4VpXGijSg1q/Dzf81xYP2T84FT1V6MySe/rBxr90Q+YCF7/6/uCED1JjJ5W2BgxO7XnDcbcpebD8fMcd51y8iuoqqIamV6GjK+kAnWp0M99Vko+MQn01bBbEHwXgu+S/igRPSkK/ZF3cb/7ZDImjdz351IrlJtwtmuB+HChxLygMIgPhfhQ7FwCTqrJoF086bluJQOPLaTvvglsIH239WAdxteCNWAV6alWSqwgPZeVpK+KJQO3tWTkuYmMPDYLGLpvJH3n1Ti/ihS2S8is5xFyWZ9NngefYd0oIf9L5bwPy3hJvH9sjsp10R2Ib8S/CDEbtUU23/USF9Zrm47uQIgf8RASIH4k5I68x+uNulcrRYz36mDiRovjhhD5t343aMSqdPrp5QsqQHlRQ3hq8m3KzSugvGclVFlRSZPW3qLPe10jIyZ+xB1IviPGeugPZ+P3yGjEbbJdcp/CbmEvDvFh2MGEQXwYxIfWEx+KraD9d1i4uyPbO2HR7LiFjCLjyDBiJRm0WkoG4YtI");
    imageData.append("P2wBGbRZRAZtv8f49+jjOHwuKdzHQvBcMmZZj8kyYhPmuowMQpeTceRGlLC9ZDv9OsRj/78Hi/RpLNxYWH3Ol/Mukni/2CcoNbdRaholfoNsvuoYF95rg45uvxS1zlCIH35fozccwkfc5ZUjmCBJkoD2uG5cCUH6I9NJp08CHb6aSy+rxbqe9SiP2nUeQddupGORraDi4lI6kZBNuj0ukHJ4Op5zm5TD7giI/dukN1SEjRkMv0smWOB8LxRSOOp8KMSHYkFl4oWMR40X5F/H1hFbRtWWR+S0NI2cFieR44IEcph9juymHiObCfvIbtIBsp8RT/bzTpDD/JNkPzuebCfuJMtuy8kybDcZeqDkeGwiA+dYMo2KI4cZp8lpYSI5LUsn57UPyGVTFrnvw27nZDH5nS8TxGszPgDi3SC+URlvNCJONtHpAOfXY42Obp9k9VeDM0g59J5GOfQu4h1eEDNUkiNJqkUa14c0nQHJ5B5zjZ6pxUwvK6ukI8cS6K8mHWjjjhNUVl5JOXmFABkz5hI17ZNEhkz2kHTAIoSz/mAWcTw4Xch8wyHYaWx9TGHpEIysZ+JDtRmf/JxCID4YdZ69efqeyifVzsfksiWDnOPukP2SG2Q75TzZ9T9F1qOOk8Piy+S48jo5xl4nh6UJZDPlENlFHyYTnwPI9q1k6BJHBn6xZDv1JDktTyYnbAZcNj4g1dYs3DeX3A/mk/eJYvI9V8Z7M/HH/g3xhsPXy8bbHOR8u67V0e11U60z8AG+9F2N3mCIHnyb12MiBjMRWjkfRybIcFg6/bXrVZqwLp1eIdtzcouopKSMxk7bSJzRQBo2ZYOQ7Y+y86mstIymrE6mz6Mvk8FQZP2gNNwfwgcx0B8o9oWIZxoMTCPz2Vhkk/FSlFJDIZAfAukhKS8oBOKDkfXBTD5KTiBe/b1PF5DnUUja8ZCcp98kh26XyTzgJFm0PkyO311G5qaSatMtyE8gp+GnySLwGBm6YiHF");
    imageData.append("+qDvtILMB++F9CRyWnebVNsykeVPyPNQHnkcxn2PFZL3qRLyOVfOe5/TlpoKiM/5V8THySbYH+L8uq/TadHzpvrL/vdJOfCORjkQUgem80pJBEMhxY+5hetSqXn3i3QqMYcqy8rp6bMiunsPWdJmDn3mNpfcO/1A9zKyKTtXjV9DMR2//IgUXc+Son8KBLPPp5FywK9R9E8j/UG38ctIJs9TBRSKchPE5EvSRfHgJuQnVVHQ9QryR733u1RILuvuk3nYCTL2jCcD131k4raXrHufwPhNct50k1TTLpNtyzPYtewlY7cdZOCABTZiA9kvuCpkuvPWh1jYc8gz/hl5YfH2OlWESS0h7zNlxMqM17kKiC8ll39H/HinQ5xvD4jvkaTW6XsPX/iORtE/nX1xnn15RQMZDLGP3QnEN+1+nfyxW8kvKKGnTwupuKiUtuw8R01dZpCy9SZqHrycDhxPQt0voazH+ZSdU0ABo85T027XSH9AKilxH2U/EXZPBYt9RZQD0smgXzLZrXlIoek1FIi31OAUJvwFhL+oFR+UVE1BeHsNuFqOXUcReR3MwUIbT4YO28nEYw+yeheZeqDWjzyNF6zL5NDuIhmqsNVk2e60kQy8YlF6TpFTLNYIVl72ZJPHUVG695ki8jmLTD9bxrId4ivqxO+F+FUoNYv+HfHdbqi/7H0XX/i2RtkXcvve4pXsyzMRErWCBDmpgri/Rl2k6RvS6HllBT1GOVGrC6n3qDj6TIUdRIf99FnQJpr8/TFMSBE9eJhHJUXFNG3VDfos8jzp908lRZ9U4V6CaPTruEVyoI++6eRb5J9YhoyvhnyIhvAgiA+6iZiECWHcqKaARDHr/c+ryWUVfjG+28jYeSuyGoJddpIFXpRYphu7YZ+PY3ZO3xElZtBuclyGt9e4u+SyHQspyovnCUg/jUw/B+nnsYacF7KdfC5UiuKPSeJZjf9XxE9yRqlh4rtcVzfreYcUvdM0APEWL0iR");
    imageData.append("kP+qn0y6vW6gbJyj80lPqLSoBFvHQrqVlkF2ofNJN2gDGXc+Rs3aHqDWQ3fRk5w8ysp+Rs+eqenklYekiDpB8l5JeE4yyXunIKZKSP1eIso+aaj1KA8H8yj4Vg0FJDH5ovjApOciNzDOxF/Hmyyy3u9iIfmeyCXrbzC5znFkwuSrtkP2LjJy3o0+pLtg32+7CtvGtWSH+u+4Op2ctjwk130oMcfyyQvSvZDp3ufx/nEB0i+UY4dVQT4XK3nP85W887EylJpKsdT8K+LHuxzmfHtCfPR19Zfd70AGxPdEtvVM5eU9U3AsoqjXl/dKJr1eN+mLqMsUFnOR1AXFlA2pbBFdvOIgNTGbRE0DtlDTNkfor22Okk7wOjp14RYVFBTRo6yn9PhJPoWNPEN/73iZ9Jn4noyUj+khouh1i/R63iSrJfcoMAUvTFhMA1BeApHtgbXyRfH+EO93rYJ8ryBLzzwjz90PyKTXLtJ3gHzVDkG2sQt+BS7YPtrjBctnAVmNw1ZzSRI5rLtDLjuR7Ueekier62eKa6V7X2SZLkgHVbwXxDvF1xO/sJEvUCYQP1N1mAtm4jslqpt1vY0ve0uj6I6s7p7Ci18+WUISwfrdb5J+zyT6rM1pmr85larKSykzM48KUcdnL9lHLu2XUPDQIxQ0+iwFjj1PvkP20/ELt6lQXUQPM3MxUYU0e+0N+murU6SPCZT3uEmK7uJzWBRJkcZSSIloNPomeaN+B6bUiQ+A+ACID0DG+9cXj3LjfbYAu5FMcplxkSz9D5GRI8Q74eVKwthpM5m3iiOrCYfJlu39190l1z2PyQMLqufpQvI6x7Id0i+I0r0vMiD+kiheyPi9EL8apWYxMn5jI8QbQ/xU18NcYK84neadrqmbRaeTvFuqRtENkrsl84puEKBFK6QbJHW7QS2ir5JBpxN0LfUJFSGTHz9+StnI5GcFpVRQVE6FxZVUXFKJrWUllZZWC//c5gl+FY/wYpWXl09n");
    imageData.append("EjJIPzKemkcnQmwSybuKz5Hj/gLsGMi7sknBDqhHIjluf0yBqRCcJMoXpAN/iPe7Xk1+iRCfwEQVk/upp+QRe5dU0dfI1BVvtU5YaCGcYeS4iYwdt5GF2z6yijxMNtMvkSPqu2rXY3LHoup5qpA8UWa8pGyvlX6xShDvwTJeK35tnsrth3tc6OaSPy7eDOLnuR/iwnqt02ne8aq6WWeI75KiUXTBl+5yk5d3gYBakiRukH6368j2c9R+wnkhi1mZeZz9FLuWPExAHuXgOBeTkIcdDCM3J1+YmKysPAFWbrJwfetRp+nzNhdIj4kX7n2TPZcU0aj90do+mwRkffQNMpuVRv43K8gP20d/ZLw/Sow/E3+9RpDum8DKQSmk55PHMrxItU+E4ONk5LCHTBxR4+02kpHNWjJ13IxjTID9NjJzxFYz/DjZf3OdnLF3dz2I94B47NtPF5MXy3iI97okihcQxFdJ4qteB6x5CvEPuNBNjRE/LE62AOLDe0N8ZIK6acc0kkenaOSd8WU7J/GAdBnRWm5g/Dopu1yjv4Yeo+U7Uqm8GHX7US5k5lLeU3GvXpBfhHpe/BFsPCc3HyUphzIycnBNAc1dk0ifhx7H/dh9k34TBf4W3U5JEH8Ti2wipGI7im2lH6T7QbqfNtuvVZH35XJyP6YmzzkZ5Bh6FWKPQ/xeSMZiao1to8si0vObSfp2P5CJ7UaMo95DvontbrL0OEp2g66S8zossIefkfsJZP250gbiq9CvE+/8b4n3OALxKDXtIb4DFtVOyRp5lPBleXknCIkCLOLL6yIqOyfSV+0vkVlUPCWlZVP+0wJBZnZ2Hp05nUDrNx6kzVuP0KbNh2nTFhaPCMfrNx6gs+euCb+K+w+yKSfnKZ29cp8M2x2h5h2uis/As3QZnVhkz0sSnitn/c5Y0FE2bNdmUEAqshv7dkE+xPsmVpPv1UryPFJIHuPuka33JTKyiycTh/0AOxmr9dirrySLYVvI");
    imageData.append("dgomotc60nP5AePIfntRvrHNTjKzO0A24WfJceYdcjucL9Z5Vmo+El8tiHc8Vi6JZ6Xm/r8g3vOoKL7dFXXT9qmk2/GmRt4BX7TjDV7e8TridWJR7CeSXqdr9FnoKeoy6RwWSTU9wmLJysj162lk7TWM/tNkAH1hPYL+biVhOZyaWg+n/zDqRa7BIygt/YHwC2Hysx7nUtsRJ+lv4edI2Un7rBsfoSvFFpCvxHmTCVhkr5VCfLUIst0nAbX3WiU5xKSQhS2y3CGeTB32QSqkW8aRQcA6spx8jOyXJpLD8hvksOQqWYw7RPoBq8jQciWZ2qD02GOnY4t1wHo3meIXYD8nDcJLhXLjBekiEH+xmnevL34ty/j7jazxw9ZA/HYuvM9KneZtL6ubRqSQbmSSRt4eEiITeXlkIjF0pSiPvErKDlfo88DDFLsjmYpQLtLTM/HG+ozmLd5Df7WeTHr+sST3iSWF32pS+K4Bq0npi2OfpfSFbQxt3HZCyPbUW5mU8ySP5q+5Sp8FHCW9KDyn/bWPnifG6wK6QryB9SCBnPfnkt9NJptRjRLDFr5ysl98D6//u8jMfg+Z2u0kQ4u1ZNhqK1ljZ+Ow4ha2jLfJYeM9ctp0DyXlNtnOvUJGnXeg9KwkE8t1mKitEL+ZDJ03kfWcdNR6lJszJeSJFyfsZEAVg3c/C/FHIX43xK96qnL/HuI3NkY8FtcFfig1/ZDxrS+pm7bBS1HEDY08Al+63TVeHoES0E5EFyjaJ5BOqwtkF32MMrA7KVKrKTcXO5XMRxTYcRH93el7iN5Aut6bSNdni8RmHG8kpR/eZm3nUr+v11J+/lOhND17lk+JKZlk0T6evmpzGfcXnyNvd00C/Yhr7G8RwWKpaHeZLBbeJp/r+OknMFhtR0Q99oIo8yGXyNAEmWy7Di9wByAXGb7iDjnEoe5veUTOO7NJtfeJsHV0wQuTw7JbZD7yJOn7bSBD85VkZLyMzHqdJPuVuHYH");
    imageData.append("dkYnIP5MOXmcQSk7U4XdTjXvdrqKdzgE8TuZ+DyV+yKI39AY8UPWyhaq9nMte6zRad7qorppS5SYNokaeVsIaJvAy9smkMgVHF8hRdvLpIOy4NT5MM1buIdmzd1EcxdspoGjYknXZS7pesWR3G8nyf33kK7/PpIHAP+96O8hRcBO+sprA5n6fU/jp22kWfO30Mx5W2nK7B1kHbGPdFqeJ0UEe472mQz2d1wVotDHJCjaYBs7+Bq5s9d5iPe6zOouy0Zk5cliUm3JJeMeJ8h00HmyWwThKx9A+iNIfwJReaTa/wyLZz65HQEHn5IKE+G05gHZzE4m4+5HyajDfrKddwdvso/JcTOuPVRMHich/lSlCKS7nYT4A+XktA3iY5HxC7C4rm+U+FVYXDejxi/XaRF+Xt00DD/pVlc18lYJiFd4eesrJG91Gf3LJG/N4kWStzlPzYMO0WdWc+lz8/H0Gfib1UzSdV9Nct8dpBt4kHSDjpA8OJ50BY6hfxRjhxEPUnPfLfS5DT5rMZn+Bj63nEPNvXbgOefE+7PnsOfWQ7c1JqE1+5sSBPHKyAtkvz6LvK9AxAVIv4BMPM8yEvX4OOTvKiCHNU/IAfIc4p6Q46Y8SH8G6WqILCLXo8XkFo+9fnwRFlGM7X1KLpuzBdn2K7LIYRWIy4X4fGwZ2bVl5H68UuREFe8aX8Xb74X4zRC/HOLnQXxcI8SbD1slWxKwlWvdf4VOi9Bz6qYhKDHhCRp5OL5s+CVe3vISycMvCuiy2PIC6SIz5WEnUTp2ktJrPSm944Qo90JZ8T9A8iAm+gQ4SfKQUwK6QjyJeBzxKCkDduNzm0jpgxLkvRlrAn4hoWfwHHZ/PFPgch3hdei2vEJ6+DtMJyULWe5xroKwy8DWj5UByD+F46Ml5Lwd8jc+E7LWZaca5aWIVAeLyfVIKbkdxV4fMt2wJRT+H2FHMBmYFJcd+ZCZR44bnpIjPuu0DWN7SrC3x3VHIT2eAfFH");
    imageData.append("IH4XxG+C+B9Qamah1KxphHhriN8A8R36r9RpEXJG3TQIdTT0ikYeeol0wy7y8tALkPwxumEQH3oaslBGPLeCLULU9d5N8kCW2SeQ5Uz0aYkzOIZUBo6Fc/7Ifq9dAJnuCbxRjthECffHBANt1KIbhskAuvjblOGXyKD7JXLZVyBkOqu/HmeqWRlAOQDHKyCrFDW6CNIhHFmrOlCKbC+D+HJIBPHl5Mo4yoDYwzi/v5hcdheR0/ZCctpSiInA5/awcZw/VIlrqjBJVbzqEMTvgPi4qteBi5Hx30L86saKD9wmiNcNOq1uGoCfc/AljTwYXzT4PC8POY8shWiBc0LUFSIk+qOceEO+9x5RnO9BiEe2B0Fs8GlBtCj8rICuENkYzgXiF+F7CJ/bL6Drg/IUcEJ8BiZbl014iBiFvhAxASH4uwBLDIPW58hq0X1kOoScQCaeqib3k+AEOF6FV/9KckUdVu0rQ4mB8IOQfagC8jApR0TcjgIWGVgsWWaza1V7S8llVwkmrZRUu/FZlBXX/fjMAdzzYBXvsr+Kt9sC8WshfhHET0OpiW2k+PWB27kOAyA+4JS6mR9+yoEXNfJA1NvAs7xuEGT9CsgD8gCUDd8jgkBdX2Sw31FMBrI9EOIDzwjXsciu/fg+bJxl/XHxM364h188jk9K10I+0MY6zgsogG7QBdJn/8elYYlC6WC1143JPlYtEg+OVAlZ6nqgAtnOpLFfAQNjLHslWF8cl67bh8mCaNWeMsgvxy+A9SF+D87trcREQvyeKt52UznWBIhfAPFTIH5lY8WHQPxAiPc7oW7mg5+z/3mN3B+CAs7wAJl4+iPkgYD1mSi/YwDSfAHrQ7zc/1S960X5wgQI9wKB0jnh88cxaficL6LfSfZMXHuWTboQf0UA45yAAslhEHmO7LEIuh+DvCMQebQa2VsDEA+Bg9XIVMhqgOv+qlpUAkwoxvdB/t4K9u9SkemQvgsRiBHX7MK1uyGe/acE");
    imageData.append("1kP8Coifhxo/HqVmeWPED2U1HuL7x+rIfY+pm3nhZ+13VqPwhVy/UzxgUchGAfR1mVihz8oFy3omjk0Ay+CTwnkmX+S0gEKI7F7isS47Zvf1PSnd44TwWfE8K2MSbCIQFdpj7Xk/du4s6WNdMJ96WywfhxgQzWQfrEGGg/3VEIrjvVW/QlWfPVogd3clRCPuhPAdYLsUd2B8RxWDd94G8esgflnV6+C5eSrvmPtc+LJGiLcatEoW576di+wF8T7x6mae+Dn7nNHIfSDB5wQP8MbJBIvoSlEEwnwYx6SoHWcyT+JFSkTsn6rDT9vXXnOiHuz6etfUXluf0wK6kK+HyTTqeRk7GCyCqMFi9kqyBeE1kIkJ2I0xAZax9fq7qsUshmhksYggF8fbwbZKct4K6VsrBZy34tzWat55M8SvhvglVa9DZuepfMZA/NJGiLdDqdkXvpPrOmiVjtz7iLqZO37K3qc0Cm8I9D7OK7yPEUNeiyhbwUSjrz0nXieOi5wQJ0I7cQJsMrXUnRcnTQu7vv51v43CB78Wb2xpMQEG4SfJZtFjiIYcZKtqD5NZI0h1ZWJ3or+Dgb4gtRpSqySk/jYGE6ulipy3YGwzA8ebtGB8E8RvhPiVEL8I4mch40dD/JJGiHcYFiuLD9/B9RwUq6PwOqz+0g3Z5HVCI/eEUM94Xu6Fxc/zKClqicd5nAMKL9R1nBcjg43H106Q9jrxWm2E3Fq05+sf152vf+1v9fF3Ygt7kgywtpiMTBZKgzMrCTurJblgG6OGZWkdTOiWaohlQORmxM0sMqkMSfJGsIGBsfWMShZ55/XVPLaRvO3ycnJYAPHf5qi8h9/hwr8vbtL1AMQf+D3xs2YLOI+IlaV32M4NHrHyS6XHwfwvVfgpux/XyN0h3P0IL/c4QgrA4sccFVAIkV1Td1w7Qb/Lsd8Y047/c+QeiB5YkIEeJtow8izZrypEyZGyVZBcI8h1EcSCTTUsWyW5YKOWanJi");
    imageData.append("cusJhlgJ9NeBtYwqCYhfXcXbLIH4uRU/hk/PdQ4YcodrxcQfgvhDvyd+/nSO+2465zZmhYw6H+bGxqxspu+x/9mXzsgkt3iN3A1y3Q7zCrdDOD5IQnQ//Bsc+QccFdFOxm8S/xvHv4F7PXAsdxdhx3J3NgEQH3CULL7JgGyIYZnKBG+E6A2IG1isIaf16K9HP666FkHuOka1GJnYNYxKcmRxdRW2jOivQlwlRN5xVTXvuBLiF0H8rPIfw6c9cQwYcotrubC4SefdxDH+cRu5huOGx3KBYzdwdHM+t2bV2r8beu7N+dIJX0h1RKNQ4eVGdZBXqA7U4XqwAYf+AWzCBKheZBMpxF9zRIBNtrZfD75exL3rkLseRTzK67rF8/qeh3nj3td4x3XlvNP6SsDKQQ0PoSIsS2vB+Joa3nGNmLmOAtUiTGosjmMrRVZKrJBYXsU7rKgih2WVvNX8MnKYVvSqw/Rcm/C5aVzU5DLZoGHEDRz2e+LRvuSImzDsR/TYf+4wuoml9870r5zwJVWHPshdDpDcZX8dqvoc+A0Ofgwmhk2c3BUTKKGQqN//eOywgLwOvl7U9kVUjCMirkdJDxNo2BKL7IJ8oTw4InMd11Yja5Hpq2uQtfVYVV1HrMRKyNTCxGpZziSDpfXAsf2SCo3lnDJymqxWf7Mou9n8zZe43pPKuKhOf+A/gxgSsIGLbLuBs/dZ30TutI9zC4xboXTcTnLHPT8rnXd9AJpaXLTsxvFuMQrsqcdeLTwghcs+/FL282xiFPUmSeyjfEmTxKK2X++Yrx+V+AzggUbARctBHB/U6GFMz22PxnTM/Q8Oq8s19ivLQIXGfkWFxmFFpcZ+uRaMLfsYu6W4/oc67JbUY7GI/feI35cBFsvfW39X+rPl9Arymli4rtkkZHivx03+NGonZzpvS0PNv25yuT73l//gOHPbEbKQ8Klcz55zDKyc597TNf+OvrJYQs0tliIuAyxq+8vrsUJipYhl");
    imageData.append("rEBzq9UauV2cRumwmfScdvBKpz2kcMYkOO9jkeTO+xH318aGfRFMnNMeXuG4k5QO23ldu80fmltv0HxlFYdnABa1sGObjaRjuoyahx0lsxnFZDazCJSgXyryLZjeEJyfhjiNRTBV4hstxXVMYRSJcWIhmY0tIOex+Sldxl1XdB2RyNl1zZNxXDXH/amqoebfbl99tQv/e5prplzSxNFjCNexdXc9e6dRy82sRz80sRpVaWI1+nkdX9dhMwaMlYgRsRbRMxtHX5nMILnVMl7PfgPhV8QrHXeT0onJhHjAYl0f444iSkfIdtjFK+y38wq7TSS3WfdBx2yZpoX5PDKwnsab2E59LvFCjNMYL0zsvn1ubDPplZlqTo5V39vPrAY9+NFqUOYrq0GPQNYra8Ci1UD0gdUAjA/IZPwo0P/hx/ST6Av6ZCBmvAIvrPpmFtn0z77m3O/u7Db9TrfwiU7mzGc/acIt+on7fNYflF7XZnH/1XQWZ2wxpUm/6HY4nsh1adNRJzww2iAkINow3L+rYZhAN4muhuFBjG4S3UUCuhv5eXVVhgT29DWzHp6jaz6X9OzWahQO20iQ6cAyeA9KGZPMYl1f6YCJsd/JhJPCbguvtIkjueXK9zomC8jU9pv3nt4xse3bjnJuGTzAIDRokFF40CDDsGAQNFCI7DgocLBR+9AuLfwitss9Op008oo+a+TV+Ty4YOSN6N35HMYuGPl0RL8j+h3PikSxeOZjOtSj3Wkjr8jTRp6Rpw192p9Qdg5Z9lnTHo84t6C1nO/Mh02cFuRyRgv5hlL/aMP28i8TOXf3sU2+0I/50+TBrbgQvyguyLcTF+LbmQsGIb7RiF1ANBfiz+gi0RXrRVcuyKcL16VtW87WfjDn4Tl4ir7VbJLbrv/AZMrtd/Fy+92kkMAxIoMJR7TbAbbyCtuNkL6WdM2Xvm9uMptsHCeVR7UbE/E35Rz8bYO5IP8+XEjgADxPS38x+g/gAvwHcZ1C");
    imageData.append("/LmgDnGce8dTnGenc5xH1AVwkfNC9GT9TuhHoh95nvNgdDgnEnn2Y9prwbm2ZziPdmc494iznE+HYxy15Di7EcV/ChmWLGs26TH3+TR1Q5mNbbvBai4s4BvO13eozNF5IBgkc3IaLERHZxaHyBxx7OSCqBqKiOuAs+tQmaX1GJmX78A/29nHcCFBIyINrGZSC9Rlud0OXm4niBai0LdD7ZZQ2KEU2W4hpfUGXs96NemaLXnX3HgWObhMzBncc4yDp9d4Tt9y8J99AsY0sXGMkTm5xuDZwHUcwLFqHMbGy+xdxspcfUbKXPqclzn0vilz7JMqc+iThn46+mkyx97o90mXOfVCvyf6vW4hpsoctbFHihRB9xQhOrDYNVnm2C1Z5tAtBZ9NlrUcmsIpwxZyV6djS76uoKHEf721b9+V+/zzLg2Hf7eNH79QILzVt01sbQZybcLH+OpbziIdiw28rs12Xm7LBKOU2CKzbbeTErCosN3GK2w2Q/p6Xs9qFckl6Y4uE7NH9xln2SpwNOekGvLnzxXtuImjB3MDBgxq+OgGje2h/8k++t9s/xWQyo2e+qrh8P+vJn5hM8vtsuDAXly3qHF2hlZz3jczhXjrbbzcBsIxAYCUNtvAVhyjlltv4pVWcbwedkNys8XvWhjNJCdIH9F/jHmroDGcynXEX7gmQdzf9IK4nt36Nnzop9akSXsBC+sYWXhIDNez8wQzQ+t5b5uabKAWVhBvhezGBCisWUnZgv5mCN9ESst1vJ4Fk/79u+ZMuvPEvDF9x1q19B/DeXoM//PnLTpxXn5tGj7uU2vYTC16QPx0LjoixsjA+rufvjCGeMutvNwSOxtLZLjlJkRkueVGUlrECdIVpt+/b2E4kxycJhYP6TnOsU1QDBbS4X82tezLGVpGN3zEp/Zx+5OAqUU/WcuwaVzPqBgDA6sFr74w2ki6Fls1CsutyO5NvMICuxaL9ZC+ltczZ9IXv29uMIPs7CdU9o0e");
    imageData.append("5x7qF8M5q0b+mft7e87UpnHrzP/pZmrRH+JncT2iJhgYWH7/8gtDiDffAuEoK1hoBenmTPpKUjLp+jPI1nb8jz2iYoIDfSZxTs6D/sxx7pyrb2jDW39qv9eMzQfKgoPncV06TDHQt1jyqqkh3j7NN2uU5htIYRbHK80g3Wwl6Zku/sCkW9lMeB/ddlwHD9VQztxyHKTH4C7jGt72U/tnzdh8kCwoeCHXqd23hvoWS183g3il+UYe0klptobXM42F9CWQPpMsrCZQ+5YxfZzsR3G6BpP+TNQfq/RCbkivng1v+6n946YrYGQ+WuYTsJCLiJhhrGex4mcdQ+zRTdfzSpO1iJBusoRvoT+LN7eYRG1DYkZ6u0/hmvzniD8RLcXn+3I+fgsb3vhT+/0m7uMNzQ7I3LyncG1azzNVmq96+5URE7+OVxqvgvSlkD7ng4nZJAoLiJlqbz8DnxnUJO/idO7Kzulct7ZDGt70U/vnjf1DIp4zMDsoc/b4lmvZdpGFwmzNuxZYXPWMV/P6Jst4Xf15742MJ1Gwb8yCr3Qn4Pqhsj6d+8mGdLPg/DzbNrzhp/bH2lsBA9ODMnvXuVxYq+W2CpPV73UN1/H6xst5uf537w2MJpO/59dxHDeYY7+OgZ0XytqFjmx4o0+tcU0sNcZmx2TObnO41q1ibQ1MY98rDVdqFAYL3+kbTCVP1zG7tdf16Bgji474jgv0HdHwRp9a41oU6MCZmk2VhQQv46KililNzRc8by6fQ3r635Cb05iD2LX8iS6N51oFDm3SJWoY17H9mIY3+dT+tTaZG9BnitA7vnvKn+xsJu41MBhLKoeRGyh37F/2zv6aaxsyuImvd2+uZ4+BDT77qf3bzcCwlczWZgDXMWCgItRvoD+bkB1Lh3HOduOamBp/zZmYftq9/A80R87IuC/nYj+Tm9krnGsbySQHNgkMieK++HIQp6f8v/ePdv8fEB5Rp31qFXwAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image17fa8167502be972fe81e7f1a1eca3b1 = new WeakReference<>(result);
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
BufferedImage image17fa8167502be972fe81e7f1a1eca3b1=getImage17fa8167502be972fe81e7f1a1eca3b1();
if (image17fa8167502be972fe81e7f1a1eca3b1 != null) {
    g.drawImage(image17fa8167502be972fe81e7f1a1eca3b1, 0, 0, null);
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
		return 94.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 94.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private icons8_language_94() {
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
       icons8_language_94 base = new icons8_language_94();
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
       icons8_language_94 base = new icons8_language_94();
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
        return icons8_language_94::new;
    }
}

