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
public class pageNumber implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imageae881c8855d310028f030e05bac32aac;
private static BufferedImage getImageae881c8855d310028f030e05bac32aac() {
    BufferedImage result = (imageae881c8855d310028f030e05bac32aac != null)
        ? imageae881c8855d310028f030e05bac32aac.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(18452);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAA12ElEQVR4Xu3de7D1d1Xf8fUkAQJBKDhyCSHhImoRrSgoKGogyGVaLygdUKyCXBVaGGdQhlFAZZQEEBjFOvVSREQZIYBQFKFQdVSkFQmEUKDK8YIClihITIiAXSvPV9KstYCzT876fvfe6/2def2zSJ6znv377O98eM5zduSf//mfBfX0nKbOU09Q56sXqterd6hLlf1DAPr6hHqQvzuAKmGA46PnDPVt6pfV3yVveAD4/12p7uvvEqBCGODa03Mf9Rvq8uQNDgCfyUfV3fy9Ahy3MMDR6bmzel3yhgaATXxI3dHfMcBxCgNsTs9t1K+oTyZvZAA4ir9S5/j7BjguYYDD03NCPU19LHnzAsC19S71ef7uAY5DGOBw5ORf8LswecMCwHH6Y/U5/g4Crq0wwGen52z11uSNCgAV3qCu5+8i4NoIA3xmeu6u3p+8QQGgkv2J46n+TgKOKgzw6ek5V12RvDEBYIZf8PcScFRhgJye26n/m7whAWCm8/39BBxFGCDS8znq4uSNCAArPNHfU8CmwgDXpOcU9arkDQgAKz3M31fAJsIA16TnGckbDwBW+7j6Zn9nAYcVBrianPxoXz7dD8C2sv/eyNf7uws4jDDA1YTP9Qew/T6s7uzvL+CzCQOcpOe+yRsNALbRB9Qd/D0GfCZhAHsvXfUX/y5K3mQAsK3eq8709xnw6YQB7H0k3528uQBg29mPK9/E32lAJgxg7yF5Z/LGAoBd8AfqBv5eA7ww6E7PFyVvKADYJb+pruPvN+D/Fwbd6XlS8mYCgF3zYnXC33HAvwiD7vS8KXkjAcAu+ml/xwH/Igw603Om8ME/APbLU/1dB5gw6EzPY5I3DwDsusf6+w4Ig870vDB54wDArvuEerC/89BbGHQm8z/6177dYF/z6eqhAHbO4yW+r7fVlep+/t5DX2HQmZz8EA3/pqnyF+o8");
    imageData.append("vwOA3aHnFsl7e5tdpu7mfx/oKQw603Np8oapYE38y/3XB7BbZPcKgPmQ+mL/e0E/YdCVntOTN0qV5/mvD2D3yG4WAPM+dRv/+0EvYdCVntsmb5IqD/RfH8Dukd0tAObd6mb+94Q+wqArPXdN3iBV7uS/PoDdI7tdAMxb1I387ws9hEFXeu6WvDmqfJH/+gB2j+x+ATBvVKf73xv2Xxh0JRQAABuS/SgA5uXqVP/7w34Lg66EAgBgQ7I/BcD8ov/9Yb+FQVdCAQCwIdmvAmAu8L9H7K8w6EooAAA2JPtXAMwP+N8n9lMYdCUUAAAbkv0sAOZ7/O8V+ycMuhIKAIANyf4WgI+rb/G/X+yXMOhKKAAANiT7WwDMFepc/3vG/giDroQCAGBDst8FwHxY+O+W7K0w6EooAAA2JPtfAMwH1R387x27Lwy6EgoAgA1JjwJgDtSt/O8fuy0MuhIKAIANSZ8CYC5WN/WvAXZXGHQlFAAAG5JeBcD8oTrDvw7YTWHQlVAAAGxI+hUA81vqOv61wO4Jg66EAgBgQ9KzAJhfVaf41wO7JQy6EgoAgA3J3ALwHHVlMl/l+f71wG4Jg66EAgBgQzK3ANxPPVh9IvnfVnmaf02wO8KgK6EAANiQTC4A42s+NvnfVnqcf12wG8KgK6EAANiQLCgA4+s+NfnfV/mk+nb/2mD7hUFXQgEAsCFZVADG1/6p5J9Zxf5uwjX2w/YLg66EAgBgQ7K2AJxQL07+uVUuU3f3rxG2Vxh0JRQAABuShQVgfP3rqN9M/tlVLlV38ntiO4VBV0IBALAhWVwAxg43UH+Q/POrvE/dxu+J7RMGXQkFAMCGZAsKwNjjJnLys/r9v7PKe9TN/J7YLmHQlVAAAGxItqQAjF3OVO9N/r1V3qJu5PfE9giDroQCAGBDskUFYOxzB/WB5N9d5X+o0/2e2A5h0JVQAABsSLasAIyd7qw+nPz7q7xCner3xHph0JVQAABsSLawAIy9");
    imageData.append("zlWXJ7/GKv9VnfB7Yq0w6EooAAA2JFtaAMZu36I+nvw6qzzT74i1wqAroQAA2JBscQEY+z0s+XVW+kG/I9YJg66EAgBgQ7LlBWDs+MTk11rp4X5HrBEGXQkFAMCGZAcKwNjzguTXW8W+LfEAvyPmC4OuhAIAYEOyIwVg7PoLya+5yhXqnn5HzBUGXQkFAMCGZLcKwKnq5cmvu8pH1Ff4PTFPGHQlFAAAG5IdKgBj3+upNya/9iofVF/g98QcYdCVUAAAbEh2rAAYPTdSf5z8+qscqFv5PVEvDLoSCgCADckOFgCj52bq3cnXWOUd6qZ+T9QKg66EAgBgQ7KjBcDoOUf9VfJ1VnmTOsPviTph0JVQAABsSHa4ABg9X6w+lHytVV6rruv3RI0w6EooAAA2JDteAIycvPsuS77eKr+mTvF74viFQVdCAQCwIdmDAmDs11ZXJl9zlZ/xO+L4hUFXQgEAsCHZkwJg9DxYfSL5uqv8qN8RxysMuhIKAIANyR4VAKPnscnXXek/+h1xfMKgK6EAANiQ7FkBMHqemnztVT6pvsPviOMRBl0JBQDAhmQPC4DR89PJ11/F/m7C/f2OuPbCoCuhAADYkOxvATihXpzssIr9lMJX+z1x7YRBV0IBALAh2dMCYPRcR/1msscql6ov8Xvi6MKgK6EAANiQ7HEBMHpuoP4g2WWVv1a39XviaMKgK6EAANiQ7HkBMHpuqi5O9lnlPermfk9sLgy6EgoAgA1JgwJg9Jyp3pvstMqfqBv7PbGZMOhKKAAANiRNCoDRcwf1gWSvVX5Hne73xOGFQVdCAQCwIWlUAIyeL1cfTnZb5ZXqNL8nDicMuhIKAIANSbMCYPScqy5P9lvlBeqE3xOfXRh0JRQAABuShgXA6PkW9fFkx1We5XfEZxcGXQkFAMCGpGkBMHq+J9lxpSf5HfGZhUFXQgEAsCFpXACMnicme670CL8jPr0w6EooAAA2JM0LgNFzQbLrKvZt");
    imageData.append("iW/1OyIXBl0JBQDAhmRuAfhZ9YQt9T6J+65yhbqXf1aIwqAroQAA2JDMLQA4vI+or/DPC9cUBl0JBQDAhoQCsM0+qL7QPzNcLQy6EgoAgA0JBWDb/bk6yz83nBQGXQkFAMCGhAKwCy5Rn+ufHfSl8YOuhAIAYENCAdgVf6TO8M+vuzDoSigAADYkFIBd8tvquv4ZdhYGXQkFAMCGhAKwa16iTvHPsasw6EooAAA2JBSAXfSV/jl2FQZdCQUAwIaEArCL7uafY1dh0JWFIglKFQoAsAeEArCLKABDGHRloUiCUoUCAOwBoQDsIgrAEAZdWSiSoFShAAB7QCgAu4gCMIRBVxaKJChVKADAHtBz8+T9je1GARjCoCsLRRKUKhQAYA/ouW7y/sZ2owAMYdCVhSIJShUKALAn9HwoeY9je1EAhjDoykKRBKUKBQDYE3renLzHsb2+yj/DrsKgK6EAADgCPU9J3uPYXvwJwBAGXVkokqBUoQAAe0LPlyTvcWwvCsAQBl1ZKJKgVKEAAHtEzy8n73NsJwrAEAZdWSiSoFShAAB7RM9N1PuS9zq2DwVgCIOuLBRJUKpQAIA9o+f+yXsd24cCMIRBVxaKJChVKADAHtLz88n7HduFAjCEQVcWiiQoVSgAwB7Scz11vvp48r7HdqAADGHQlYUiCUoVCgCwx/TcXb0ree9jPQrAEAZdWSiSoFShAAB7Ts/11XPUlckdgHUoAEMYdGWhSIJShQIANKHnRupBcvLvB7xevVP9jXo/PuVvJd6TVfgkwCEMuhIKAAAsYXdick9W4U8AhjDoykKRBKUKBQAABrsTk3uyCgVgCIOuLBRJUKpQAABgsDsxuSerUACGMOjKQpEEpQoFAAAGuxOTe7IKBWAIg64sFElQqlAAAGCwOzG5J6tQAIYw6MpCkQSlCgUAAAa7E5N7sgoFYAiDriwUSVCqUAAAYLA7Mbknq1AAhjDoykKRBKUKBQAABrsTk3uyCgVg");
    imageData.append("CIOuLBRJUKpQAABgsDsxuSerUACGMOjKQpEEpQoFAAAGuxOTe7IKBWAIg64sFElQqlAAAGCwOzG5J6tQAIYw6MpCkQSlCgUAAAa7E5N7sgoFYAiDriwUSVCqUAAAYLA7Mbknq1AAhjDoykKRBKUKBQAABrsTk3uyCgVgCIOuLBRJUKpQAABgsDsxuSerUACGMOjKQpEEpQoFAAAGuxOTe7IKBWAIg64sFElQqlAAAGCwOzG5J6tQAIYw6MpCkQSlCgUAAAa7E5N7sgoFYAiDriwUSVCqUAAAYLA7Mbknq1AAhjDoykKRBKUKBQAABrsTk3uyCgVgCIOuLBRJUKpQAABgsDsxuSerUACGMOjKQpEEpQoFAAAGuxOTe7IKBWAIg64sFElQqlAAAGCwOzG5J6tQAIYw6MpCkQSlCgUAAAa7E5N7sgoFYAiDriwUSVCqUAAAYLA7Mbknq1AAhjDoykKRBKUKBQAABrsTk3uyCgVgCIOuLBRJUKpQAABgsDsxuSerUACGMOjKQpEEpQoFAAAGuxOTe7IKBWAIg64sFElQqlAAAGCwOzG5J6tQAIYw6MpCkQSlCgUAAAa7E5N7sgoFYAiDriwUSVCqUAAAYLA7Mbknq1AAhjDoykKRBKUKBQAABrsTk3uyCgVgCIOuLBRJUKpQAABgsDsxuSerUACGMOjKQpEEpQoFAAAGuxOTe7IKBWAIg64sFElQqlAAAGCwOzG5J6tQAIYw6MpCkQSlCgUAAAa7E5N7sgoFYAiDriwUSVCqUAAAYLA7Mbknq1AAhjDoykKRBKUKBQAABrsTk3uyCgVgCIOuLBRJUKpQAABgsDsxuSerUACGMOjKQpEEpQoFAAAGuxOTe7IKBWAIg64sFElQqlAAAGCwOzG5J6tQAIYw6MpCkQSlCgUAAAa7E5N7sgoFYAiDriwUSVCqUAAAYLA7Mbknq1AAhjDoykKRBKUKBQAABrsTk3uyCgVgCIOuLBRJUKpQAABg");
    imageData.append("sDsxuSerUACGMOjKQpEEpQoFAAAGuxOTe7IKBWAIg64sFElQqlAA8Cl6HqL+fpG/Vaf6nWbS89xkr1le6/fBfEIBWCIMurJQJEGpQgHAp+h5epKRWd7j95lNzxuSvWb5Jb8P5hMKwBJh0JWFIglKFQoAPkXPS5KMzPIav89set6X7DXLk/0+mE8oAEuEQVcWiiQoVSgA+BQ9b0kyMsvz/D4z6blhstNMD/Q7YT6hACwRBl1ZKJKgVKEA4FP0fCTJyCyP8/vMpOfOyU4zfanfCfMJBWCJMOjKQpEEpQoFAFfRc4skHzPd1+80k54HJTvN8kl1fb8T5hMKwBJh0JWFIglKFQoArqLnHkk+Zrq932kmPU9Jdprlz/0+WEMoAEuEQVcWiiQoVSgAuIqehyX5mOVKWf8jgC9K9prldX4frCEUgCXCoCsLRRKUKhQAXEXPjyf5mOVdfp/Z9Lw52WuW5/t9sIZQAJYIg64sFElQqlAAcBU9v57kY5ZX+31mk5MfxuP3muXxfh+sIRSAJcKgKwtFEpQqFABcRc9bk3zM8hy/z0x6bp7sNNP9/E5YQygAS4RBVxaKJChVKAC4ip6PJvmY5bF+n5n0fG2y00y38zthDaEALBEGXVkokqBUoQBAYyC3TLIx0338TjPpeXiy0ywfk8V/ARJXEwrAEmHQlYUiCUoVCgA0BvJ1STZmuq3faSY95yc7zXKJ3wfrCAVgiTDoykKRBKUKBQAag97/D1jPy5O9ZnmF3wfrCAVgiTDoykKRBKUKBQAaA3lGko1Z3un3mU3PJcles5zv98E6QgFYIgy6slAkQalCAYDGQF6aZGOWV/l9ZtJzqpz8Uwi/1ywP9zthHaEALBEGXVkokqBUoQBAYyAXJdmY5Sf9PjPpuV2y00xf63fCOkIBWCIMurJQJEGpQgFoTs8JdVmSjVm+1+80k577JTvNdHO/E9YRCsASYdCVhSIJShUKQHN6bpXkYqZ7+51m0vP4ZKdZ");
    imageData.append("/t7vg7WEArBEGHRloUiCUoUC0Jyec5NczHSO32kmPc9PdprlzX4frCUUgCXCoCsLRRKUKhSA5vQ8IsnFLFeoU/xOM+l5XbLXLC/y+2AtoQAsEQZdWSiSoFShADQnzT8ER8+fJ3vN8hS/D9YSCsASYdCVhSIJShUKQHN6LkxyMcsr/T4z6bm++mSy1ywP8jthLaEALBEGXVkokqBUoQA0p+ftSS5meZbfZyY9X5rsNNOd/U5YSygAS4RBVxaKJChVKACNyckfAfzHJBezPMbvNJOeByY7zXRDvxPWEgrAEmHQlYUiCUoVCkBjes5KMjHTeX6nmfQ8Odlplvf5fbCeUACWCIOuLBRJUKpQABrTc88kEzOd7XeaSc8Lkp1meaPfB+sJBWCJMOjKQpEEpQoFoDE9j0oyMcvl6oTfaSY9f5jsNcvP+n2wnlAAlgiDriwUSVCqUAAa0/PMJBOzXOz3mU3Ph5K9Zvl+vw/WEwrAEmHQlYUiCUoVCkBjel6eZGKWV/h9ZtLzuclOM/07vxPWEwrAEmHQlYUiCUoVCkBjei5OMjHLM/0+M+m5e7LTTF/gd8J6QgFYIgy6slAkQalCAWhKTv4IoH0f3mdilkf5nWbS89Bkp1n+SZ3md8J6QgFYIgy6slAkQalCAWhKz9lJHma6p99pJj0/nuw0y7v8PtgOQgFYIgy6slAkQalCAWhKz3lJHmY6y+80k56XJjvN8iq/D7aDUACWCIOuLBRJUKpQAJrS8+gkD7PYpw+u/hHAtyV7zfJsvw+2g1AAlgiDriwUSVCqUACa0vOsJA+zvN3vM5M0//sP+PSEArBEGHRloUiCUoUC0JSeVyZ5mOVCv89Mes5JdprpXL8TtoNQAJYIg64sFElQqlAAmtJzSZKHWc73+8yk5xuSnWY60++E7SAUgCXCoCsLRRKUKhSAhvScoq5I8jDLI/xOM+l5bLLTLP/g98H2EArAEmHQlYUiCUoVCkBD0vyPwPU8L9lp");
    imageData.append("lrf4fbA9hAKwRBh0ZaFIglKFAtCQnnsnWZjpVn6nmfT8VrLTLL/q98H2EArAEmHQlYUiCUoVCkBDer43ycIsl8n6HwH8s2SvWX7E74PtIRSAJcKgKwtFEpQqFICG9PxkkoVZLvL7zKTneuoTyV6zPMTvhO0hFIAlwqArC0USlCoUgIb0vCrJwiwv9fvMpOeOyU4z3dXvhO0hFIAlwqArC0USlCoUgIb0vDPJwizP8PvMpOcByU4z3djvhO0hFIAlwqArC0USlCoUgGb0nKo+lmRhlof7nWbS84PJTrO83++D7SIUgCXCoCsLRRKUKhSAZvTcNsnBTF/nd5pJzy8kO83yu34fbBehACwRBl1ZKJKgVKEANKPnPkkOZrql32kmPb+X7DTLz/t9sF2EArBEGHRloUiCUoUC0Iys/RS8j/p9ZtPzwWSvWZ7o98F2EQrAEmHQlYUiCUoVCkAzep6T5GCWt/p9ZtLzr5KdZvpmvxO2i1AAlgiDriwUSVCqUACa0fPqJAez/LrfZyY9X5nsNNO/9jthuwgFYIkw6MpCkQSlCgWgGT3vSnIwy4/7fWbS853JTrN8XF3X74TtIhSAJcKgKwtFEpQqFIBG5OSPAF6Z5GCWh/mdZtLzo8lOs/yp3wfbRygAS4RBVxaKJChVKACN6Ll9koGZ7uF3mknPS5KdZnmN3wfbRygAS4RBVxaKJChVKACN6LlvkoGZbuF3mknPnyQ7zfJcvw+2j1AAlgiDriwUSVCqUAAa0fO4JAOzfMTvM5uejyZ7zfJ9fh9sH6EALBEGXVkokqBUoQA0oud5SQZmeYvfZyY9t0p2munefidsH6EALBEGXVkokqBUoQA0ouc1SQZmeYnfZyY990p2munWfidsH6EALBEGXVkokqBUoQA0ouc9SQZmebrfZyY9j0l2muUf1Qm/E7aPUACWCIOuLBRJUKpQAJrQc5r6pyQDszzU7zSTnp9MdprlIr8PtpNQAJYIg64sFElQ");
    imageData.append("qlAAiul5wZZY+SNw5rcl7jTTeyXuNMtfSdyn0rN8DnE4QgFYIgy6slAkQalCASiWvOZAtQOfQxyOUACWCIOuLBRJUKpQAIolrzlQ7cDnEIcjFIAlwqArC0USlCoUgGLJaw5UO/A5xOEIBWCJMOjKQpEEpQoFoFjymgPVDnwOcThCAVgiDLqyUCRBqUIBKJa85kC1A59DHI5QAJYIg64sFElQqlAAiiWvOVDtwOcQhyMUgCXCoCsLRRKUKhSAYslrDlQ78DnE4QgFYIkw6MpCkQSlCgWgWPKaA9UOfA5xOEIBWCIMurJQJEGpQgEolrzmQLUDn0McjlAAlgiDriwUSVCqUACKJa85UO3A5xCHIxSAJcKgKwtFEpQqFIBiyWsOVDvwOcThCAVgiTDoykKRBKUKBaBY8poD1Q58DnE4QgFYIgy6slAkQalCASiWvOZAtQOfQxyOUACWCIOuLBRJUKpQAIolrzlQ7cDnEIcjFIAlwqArC0USlCoUgGLJaw5UO/A5xOEIBWCJMOjKQpEEpQoFoFjymgPVDnwOcThCAVgiDLqyUCRBqUIBKJa85kC1A59DHI5QAJYIg64sFElQqlAAiiWvOVDtwOcQhyMUgCXCoCsLRRKUKhSAYslrDlQ78DnE4QgFYIkw6MpCkQSlCgWgWPKaA9UOfA5xOEIBWCIMurJQJEGpQgEolrzmQLUDn0McjlAAlgiDriwUSVCqUACKJa85UO3A5xCHIxSAJcKgKwtFEpQqFIBiyWsOVDvwOcThCAVgiTDoykKRBKUKBaBY8poD1Q58DnE4QgFYIgy6slAkQalCASiWvOZAtQOfQxyOUACWCIOuLBRJUKpQAIolrzlQ7cDnEIcjFIAlwqArC0USlCoUgGLJaw5UO/A5xOEIBWCJMOjKQpEEpQoFoFjymgPVDnwOcThCAVgiDLqyUCRBqUIBKJa85kC1A59DHI5QAJYIg64sFElQqlAAiiWvOVDtwOcQhyMUgCXC");
    imageData.append("oCsLRRKUKhSAYslrDlQ78DnE4QgFYIkw6MpCkQSlCgWgWPKaA9UOfA5xOEIBWCIMurJQJEGpQgEopuc2C3yNxGc903fJyYt0lddL3GmW10p8HrOd5XOIw5GT+fHPtAoFYAiDriwUSVCqUAD2kJ57Jc96prP9TjPpuSjZaZZn+32wO4QCsEQYdGWhSIJShQKwh/Q8KnnWs1yuTvE7zaTnsmSvWR7j98HuEArAEmHQlYUiCUoVCsAe0vPM5FnP8g6/z0x6zkx2munefifsDqEALBEGXVkokqBUoQDsIT0vT571LK/w+8yk5+uTnWY6x++E3SEUgCXCoCsLRRKUKhSAPaTn4uRZz/JMv89Meh6R7DTLFbL42x+4doQCsEQYdGWhSIJShQKwZ/ScUP+YPOtZHu13mknPM5KdZrnE74PdIhSAJcKgKwtFEpQqFIA9o+fWyXOe6V5+p5n0vCzZaZZX+n2wW4QCsEQYdGWhSIJShQKwZ/TcM3nOM93a7zSTnrclO83yLL8PdotQAJYIg64sFElQqlAA9oys/xHAE36nWexrCz8CiGtBKABLhEFXFookKFUoAHtGzwXJc57lYr/PTHpulew003l+J+wWoQAsEQZdWSiSoFShAOwZWfsjgC/3+8yk59xkp5mWfgIirj2hACwRBl1ZKJKgVKEA7Bk9b0+e8ywX+H1m0vPIZKdZln8CIq49oQAsEQZdWSiSoFShAOwRWf8jgI/yO82k5/xkp1mWfgIijodQAJYIg64sFElQqlAA9oies5JnPNM9/U4z6bkw2WmWpZ+AiOMhFIAlwqArC0USlCoUgD0i678HvvQ/Qytrv/2x9BMQcTyEArBEGHRloUiCUoUCsEdk7ffA7VsPq38EcOW3P5Z+AiKOh1AAlgiDriwUSVCqUAD2iKz9Hvjb/T4zyfpvfyz9BEQcD6EALBEGXVkokqBUoQDsEVn7PfAL/T4zSfNPQMTxEArAEmHQlYUiCUoVCsAekbUf");
    imageData.append("g3u+32cmafwJiDg+QgFYIgy6slAkQalCAdgTsv574I/0O80kjT8BEcdHKABLhEFXFookKFUoAHtC1n8M7rl+p5mk8Scg4vgIBWCJMOjKQpEEpQoFYE/I+h8BvJXfaSY9Fyc7zcKPAO4JoQAsEQZdWSiSoFShAOwJPY9Inu8s9l/gW/Y9cPvacvL78H6vWZZ+AiKOj1AAlgiDriwUSVCqUAD2hKz9EcC3+X1m0nPrZKeZln4CIo6PUACWCIOuLBRJUKpQAPaEnpclz3eWl/l9ZtJzr2SnmfgRwD0hFIAlwqArC0USlCoUgD0ha38E8Bl+n5n0PDrZaZaln4CI4yUUgCXCoCsLRRKUKhSAPSAnvwdu34f3z3eWR/idZtLzzGSnWZZ+AiKOl1AAlgiDriwUSVCqUAD2gKz/EcCv9zvNpOcVyU6zLP0ERBwvoQAsEQZdWSiSoFShAOwBPV+fPNuZzvQ7zaTnHclOs1zg98HuEgrAEmHQlYUiCUoVCsAekLU/AvhRv89Mek6RtT8CuPQTEHG8hAKwRBh0ZaFIglKFArAH9DwjebazXOT3mUnP2clOM53rd8LuEgrAEmHQlYUiCUoVCsAekLU/AvhSv89Mes5LdprpLL8TdpdQAJYIg64sFElQqlAA9oCei5JnO8tP+H1m0vOYZKdZ+BHAPSMUgCXCoCsLRRKUKhSAPSBrfwTw4X6fmfQ8K9lplqWfgIjjJxSAJcKgKwtFEpQqFIAdp+fM5LnO9HV+p5n0vDLZaRZ+BHDPCAVgiTDoykKRBKUKBWDHyfofAbyl32kmPZckO81yvt8Hu00oAEuEQVcWiiQoVSgAO07Pw5PnOss2/AjgFclesyz9BEQcP6EALBEGXVkokqBUoQDsOFn7I4Bv9fvMpOecZKeZzvU7YbcJBWCJMOjKQpEEpQoF4Ij0PERO/g301d4s8bnOYv8BIr/PTCv/AqD5IYk7Vbu9zyKOj1AAlgiDriwUSVCqUACOSM9B");
    imageData.append("8noC1R7ss4jjIxSAJcKgKwtFEpQqFIAjEgoA1qAAFBIKwBJh0JWFIglKFQrAEQkFAGtQAAoJBWCJMOjKQpEEpQoF4IiEAoA1KACFhAKwRBh0ZaFIglKFAnBEQgHAGhSAQkIBWCIMurJQJEGpQgE4IqEAYA0KQCGhACwRBl1ZKJKgVKEAHJFQALAGBaCQUACWCIOuLBRJUKpQAI5IKABYgwJQSCgAS4RBVxaKJChVKABHJBQArEEBKCQUgCXCoCsLRRKUKhSAIxIKANagABQSCsASYdCVhSIJShUKwBEJBQBrUAAKCQVgiTDoykKRBKUKBeCIhAKANSgAhYQCsEQYdGWhSIJShQJwREIBwBoUgEJCAVgiDLqyUCRBqUIBOCKhAGANCkAhoQAsEQZdWSiSoFShAByRUACwBgWgkFAAlgiDriwUSVCqUACOSCgAWIMCUEgoAEuEQVcWiiQoVSgARyQUAKxBASgkFIAlwqArC0USlCoUgCMSCgDWoAAUEgrAEmHQlYUiCUoVCsARCQUAa1AACgkFYIkw6MpCkQSlCgXgiIQCgDUoAIWEArBEGHRloUiCUoUCcERCAcAaFIBCQgFYIgy6slAkQalCATgioQBgDQpAIaEALBEGXVkokqBUoQAckVAAsAYFoJBQAJYIg64sFElQqlAAjkgoAFiDAlBIKABLhEFXFookKFUoAEckFACsQQEoJBSAJcKgKwtFEpQqFIAjEgoA1qAAFBIKwBJh0JWFIglKFQrAEQkFAGtQAAoJBWCJMOjKQpEEpQoF4IiEAoA1KACFhAKwRBh0ZaFIglKFAnBEQgHAGhSAQkIBWCIMurJQJEGpQgE4IqEAYA0KQCGhACwRBl1ZKJKgVKEAHJFQALAGBaCQUACWCIOuLBRJUKpQAI5IKABYgwJQSCgAS4RBVxaKJChVKAA7Qs/3JM9vlsv8PjPpOaEuT/aa5Q1+J+wnoQAsEQZdWSiSoFShAOwIPT+RPL9Z3ub3");
    imageData.append("mUnPrZOdZvovfifsJ6EALBEGXVkokqBUoQDsCD0vTZ7fLBf6fWbSc89kp5l+wO+E/SQUgCXCoCsLRRKUKhSAHaHnbcnzm+UCv89Meh6Z7DTTt/qdsJ+EArBEGHRloUiCUoUCsAPk5PfAL0ue3yyP9jvNpOcZyU4z/Ru/E/aTUACWCIOuLBRJUKpQAHaAnrOSZzfTeX6nmWTttz/MGX4n7CehACwRBl1ZKJKgVKEA7ABZ/z3wc/xOM+l5a7LTLH/j98H+EgrAEmHQlYUiCUoVCsAO0POo5NnN8jF1it9pJj3/kOw1y+/5fbC/hAKwRBh0ZaFIglKFArAD9DwzeXaz/G+/z0x6bp7sNNML/E7YX0IBWCIMurJQJEGpQgHYAXpekTy7WV7t95lJz9ckO830Q34n7C+hACwRBl1ZKJKgVKEA7AA9lyTPbpbn+n1m0vPdyU4z8dG7jQgFYIkw6MpCkQSlCgVgy+k5RV2RPLtZHud3mknPjyU7zXQXvxP2l1AAlgiDriwUSVCqUAC2nJ7bJM9tpvv7nWbS8+Jkp5lu4nfC/hIKwBJh0JWFIglKFQrAltPzDclzm+kOfqeZ9Lw52WmWD/l9sN+EArBEGHRloUiCUoUCsOX0fF/y3Gb5uLqO32kmPZcme83yR34f7DehACwRBl1ZKJKgVKEAbDk9z0me2yx/6veZSc9Nk51m+hW/E/abUACWCIOuLBRJUKpQALacnlcnz22W3/b7zKTnrslOM/2o3wn7TSgAS4RBVxaKJChVKABbTs+7k+c2y8/4fWbS8+3JTjN9l98J+00oAEuEQVcWiiQoVSgAW0zPaerK5LnN8v1+p5n0/HCy00xf7XfCfhMKwBJh0JWFIglKFQrAFtPz+ckzm+mb/E4z6fmlZKeZbuZ3wn4TCsASYdCVhSIJShUKwBbTc//kmc10R7/TTHp+P9lplo/4fbD/hAKwRBh0ZaFIglKFArDF9Pyn5JnN8kl1ut9pJj3vT/aa");
    imageData.append("5U/8Pth/QgFYIgy6slAkQalCAdhien4qeWaz/KXfZyY9N0x2munX/U7Yf0IBWCIMurJQJEGpQgHYYnpemzyzWd7o95lJz5clO830E34n7D+hACwRBl1ZKJKgVKEAbDE9f5Y8s1l+zu8zk54HJjvN9HC/E/afUACWCIOuLBRJUKpQALaUnuvKyY/i9c9slif5nWbS84PJTjOd63fC/hMKwBJh0JWFIglKFQrAlrJnkzyvmR7od5pJz88lO810lt8J+0/mvu8oAEMYdGWhSIJShQKwpfR8Y/K8Zvoyv9NMet6Y7DTL5eqE3wn7TygAS4RBVxaKJChVKABbSs/3J89rps/xO82k5y+TnWa52O+DHoQCsEQYdGWhSIJShQKwpfT85+R5zfIBv89Mek6Xk59D4Pea5ZV+J/QgFIAlwqArC0USlCoUgC2l578nz2uW3/f7zKTnjslOMz3b74QehAKwRBh0ZaFIglKFArCl9PxF8rxm+SW/z0x6vinZaabv9TuhB6EALBEGXVkokqBUoQBsIT3Xl7V/BP7DfqeZZP3ff/gGvxN6EArAEmHQlYUiCUoVCsAW0nOn5FnN9B1+p5n0PD/Zaabb+Z3Qg1AAlgiDriwUSVCqUAC2kJ4HJM9qpq/0O80kaz8C+Up1qt8JPQgFYIkw6MpCkQSlCgVgC+n5geRZzXRTv9NMev402WmWd/t90IdQAJYIg64sFElQqlAAtpCen0+e1SyX+n1m0nMdWfsRyK/xO6EPoQAsEQZdWSiSoFShAGwhPb+TPKtZ/qffZyY9n5/sNNNP+Z3Qh1AAlgiDriwUSVCqUAC2kJ6/Tp7VLL/q95lJz/2SnWZ6vN8JfQgFYIkw6MpCkQSlCgVgy+i5YfKcZvoxv9NMeh6X7DTTv/U7oQ+hACwRBl1ZKJKgVKEAbBk9X5Y8p5m+2+80k57nJjvN9IV+J/QhFIAlwqArC0USlCoUgC2j598nz2mme/idZtLzqmSnWT6hrut3");
    imageData.append("Qh9CAVgiDLqyUCRBqUIB2DJ6npw8p5lu4XeaSc87k51mOfD7oBehACwRBl1ZKJKgVKEAbBk9L0ie0ywf9fvMpOcUdUWy1yyv9zuhF6EALBEGXVkokqBUoQBsGT2/nzynWd7q95lJzznJTjP9rN8JvQgFYIkw6MpCkQSlCgVgy+j5YPKcZnmZ32cmPfdKdprpiX4n9CIUgCXCoCsLRRKUKhSALaLnxskzmul8v9NMeh6V7DTTA/xO6EUoAEuEQVcWiiQoVSgAW0TPXZJnNNMj/U4z6bkg2WmmL/E7oRehACwRBl1ZKJKgVKEAbBE93548o5nu6XeaSc+FyU4z3cDvhF6EArBEGHRloUiCUoUCsEX0PCV5RjOd7XeaSc9FyU6z/LXfB/0IBWCJMOjKQpEEpQoFYIvoeVHyjGaxH787xe80k56PJnvN8rt+H/QjFIAlwqArC0USlCoUgC2i54+SZzTLJX6fmfTcMtlppl/0O6EfoQAsEQZdWSiSoFShAGwRPZcmz2iW3/D7zKTna5OdZnqy3wn9CAVgiTDoykKRBKUKBWBL6Pnc5PnM9By/00x6HprsNNOD/E7oRygAS4RBVxaKJChVKABbQuY+98xj/U4z6Xl6stNMX+F3Qj9CAVgiDLqyUCRBqUIB2BJ6/kPyfGa6r99pJj2/luw00439TuhHKABLhEFXFookKFUoAFtCz48lz2em2/udZtLzv5KdZvlbvw96EgrAEmHQlYUiCUoVCsCWkLX/D/if1Gl+p5n0/F2y1yxv8vugJ6EALBEGXVkokqBUoQBsCT1/nDyfWf6P32cmWf8XIF/kd0JPQgFYIgy6slAkQalCAdgSej6SPJ9ZfsvvM5Oer0p2mulpfif0JBSAJcKgKwtFEpQqFIAtoOfmybOZ6af9TjPpeUiy00zf6XdCT0IBWCIMurJQJEGpQgHYAnrukTybmZ7gd5pJz1OTnWbiIsZVhAKwRBh0ZaFIglKFArAF9DwseTYz");
    imageData.append("faPfaSY9L0x2munz/E7oSSgAS4RBVxaKJChVKABbQM8Z6hYLXcfvNJOemyQ7TeP3QV9CAVgiDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSA");
    imageData.append("IQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCA");
    imageData.append("we7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy6slAkQalCAQCAwe7E5J6sQgEYwqArC0USlCoUAAAY7E5M7skqFIAhDLqyUCRBqUIBAIDB7sTknqxCARjCoCsLRRKUKhQAABjsTkzuySoUgCEMurJQJEGpQgEAgMHuxOSerEIBGMKgKwtFEpQqFAAAGOxOTO7JKhSAIQy60nPXJChV7uS/PgB0ZXdick9Wuav/+l2FQVd6bpsEpcoD/dcHgK7sTkzuySq39V+/qzDoSs/pSVCqPM9/fQDoyu7E5J6scrr/+l2FQWd6Lk3CUuFK9eX+6wNAN3YXjjvR35MVLvVfv7Mw6EzPxUlgqvyFOtfvAABd2B047kJ/P1a52O/QWRh0pud1SWAqfVL9N/Uj6qEA0ITdeXb32R3o78VKr/P3fmdh0JmeFyaBAQDshxf6e7+zMOhMz2OSwAAA9sNj/L3fWRh0pudMmf9HUgCAena3n+nv/c7CoDs9b0qCAwDYbW/y9313YdCdniclwQEA7LYn+fu+uzDoTuZ+JjUAYA7+GyxOGMByIu9MwgMA2E3v9Pc89GXxA1hWrvo5VR8gAMBueqi/56Evix/AsiKnqLclIQIA7Ba7y0/x9zz0pfEDnKTn/kmQAAC75f7+fsdJYYCr6XlDEiYAwG54g7/XcbUwwNX03EX4YCAA2EV2d9/F3+u4WhjgmvQ8OwkWAGC7Pdvf");
    imageData.append("57imMMA16TlVvSYJFwBgO9mdfaq/z3FNYYBIz43UJUnIAADbxe7qG/l7HFEYIKfn9upDSdgAANvB7ujb+/sbuTDAp6fnXHVFEjoAwFp2N5/r7218emGAz0zP3dX7k/ABANawO/nu/r7GZxYG+Oz0nK3emoQQADCX3cVn+3san10Y4HD0nKEuTMIIAJjD7uAz/P2MwwkDHJ6eE+pp6mNJMAEANezOfZo64e9lHF4YYHN6bqN+RfjUQACoZHes3bW38fcwNhcGODo9d1avS0ILALh27G69s793cXRhgGtPz33Ub6jLkxADAA7H7lC7S+/j71lce2GA4yMn/6Lgt6lfVn+XhBsAcE12V9qdaXcnf8GvUBighp7T1HnqCep89UL1evUOdal7AwDAPrM7z+4+uwPtLrQ70e5GuyNP8/cnavw/QmaaKyGfPpgAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imageae881c8855d310028f030e05bac32aac = new WeakReference<>(result);
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
BufferedImage imageae881c8855d310028f030e05bac32aac=getImageae881c8855d310028f030e05bac32aac();
if (imageae881c8855d310028f030e05bac32aac != null) {
    g.drawImage(imageae881c8855d310028f030e05bac32aac, 0, 0, null);
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
	private pageNumber() {
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
       pageNumber base = new pageNumber();
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
       pageNumber base = new pageNumber();
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
        return pageNumber::new;
    }
}

