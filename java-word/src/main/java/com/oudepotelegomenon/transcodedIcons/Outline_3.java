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
public class Outline_3 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef8f06e0a3333f3fcb6619738ce10f616;
private static BufferedImage getImagef8f06e0a3333f3fcb6619738ce10f616() {
    BufferedImage result = (imagef8f06e0a3333f3fcb6619738ce10f616 != null)
        ? imagef8f06e0a3333f3fcb6619738ce10f616.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(11664);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAALYAAAC2CAYAAAB08HcEAAAh9UlEQVR4Xu2dB3gU1RbHn/TeBAELIChNEFGK+BSx0REE9dEEpEjvvfcqTWz03qUTpHeBQEIghIQSSCPUsJvey33nvzMXhruTZLOJMrtevu/3zcydM7Mzsz9Ozt69M/sfxth/JBJnw6pBInEGrBokEmfAqkEicQasGrKClJSUbBERESVu3LjxroeHR+0LFy7UPn/+fB0RV1fXuufOnXsfYB6IMRLn5eLFi3V8fHzq+Pv7146KinqL3CkgumQvVg2ZJTIysuiRI0c+Gzly5KxChQqFv/DCCyngP/RSEoke2bJlS65YseKNQ4cO9UpOTq5JHuUTvcooVg2ZISwsrNjMmTNH5cyZM0HKLLGHVq1a3SCX2hL5Rb8yglWDvcTExBT+8ccfh+kJzbO2zN4SWxgxYkQAOfVfIrvoma1YNdjJCydPnqyfP3/+KH5wpUqVStm9e3dKSEhIAq33Iw4Qu4m96vwxlcPEQZVD6jLnCHGUOK7Ct0E7j8E2fHvsd7/Knyr7bMBFAMeYUfZkEnF/GUE8/oyQ2j74teHXUXs9tdvxbbWx/D3g7wOP156rS3h4+IFjx455li9fPlJMeFR3/0IxLzFr12zCqsEeqPAvNmnSpIkaqdn9+/eTad0tYhXRjXiRyEHkJooRrxFliFJEcXV9CaacTEm1/WU1rixRTo3H8ivqesRhG2yLfRYlCqsUZMqHEfxJQ82WFnlV8jDl+ECuDJCTKecmgnY99GLEferBj017fHwZx24P2n3yNlwLfm1wDXEt+fVEG9+Ovz6WeWwh9vQ9AGjD/hDLzxfz2AbvV2MS/KcaNWoEa+Xu1atXCq37iMjGdJxLD6sGe6BPtu8UL148hB/U5s2bcVC3mSK0VbxEIuLl5TWmZMmSD7hDlStXpmY2lSgixtqCVYM9uLu719b+bwsNDY2j9uVinESSGsnJyUU+/fTTo9yh");
    imageData.append("ggXxB4L5ExXEWFuwarAH9Elq6yP6d5PoIMZJJGnRtGnTfdoESf+QIJG6rWLTw6rBHvAFjHBA+NCAWssqViJJjS+//HI3+rQ1HiURVcQ4W7BqsAcdsXeJMRJJerRq1Wpn9uzZkzQeoQPi+Yot/E+TYksyjBRb4pQYUmzhgKTYkgzTunXr7Tly5Eg0VI2dVWInJCTk9vX1rbJ169Zv5s+fP3jKlCnjJ0yYMHn8+PFTRMaNGzd17Nix08CYMWOmg9GjR88AfBkxAPETJ06cNHny5AlTp04dB7BvfLEk7h/LHL3X1O5TG4/9pwZeh4Nj0EMbk1YsjlsktX2ktn++H34t9ODXh58DtuHtWObnPmfOnOEHDx78Njg4uEpSUhK+eLF6X22hTZs225xObD8/v/ILFiwY1KtXr99btGix56233rpaokSJRwUKFIjMkydPbO7cueNSI1euXPEAg6+0oI3HYB958+aNwdf+2CcnX7580WjH+rQQX1O7X77vtMDrcHAMemhj0ovXnkNa+0htnbiP1EAsP37tNmjD+WNarFgxU9WqVb3xvvXs2XPxzJkzZ0VGRjZjGRzr8dVXX+0QxE5kjiw2/W9v1KFDh/WlSpW6L44ZkDgWeP8gfKNGjdzDw8MHMGX4g9V7rodOd5/jin3q1KlPvvjii0PIeuJF4heKy27v6EBxdKEkaxGvN7/mTZo0CUpMTBzEbBxf3bx5873a/TFHFZtOOiduSMCfOb4t1XSMamzsA5+II4kHKo9UHhL3iXvEXXWKZcTwdXeY8nUsBmHhW1BwnbhKXCJcidPESXV6Vm07r06xfIb4S51y0K7lnGY7cIFw0+CuQdvO110UYnibB1OO87KAJ3FFA5bFGA62x774/hCL8weYx2vhHE4wZQQlRk3ya8HPB2jPA8u4Dvza4frgte5evnw5nkqRZySHpEuXLvWh9d8ynfdfpFmzZi6C2BgZ+ny/ebRH7D179rSoWbOmB99u9erV2BYD");
    imageData.append("qH4kviG+JJpoaKpOGxONVDAPeAzmGxKfE58Sn6g0ID4mPiTeJ+oQtdVpXbWtnjrFMto5WNYDsXw7zgcZAGOOgV4bjlMEo91Afc28Xgyf5/sCfDu+LV4L51CLeE8F1wNt4vnwY8Qyv2782uF18D58RfSj+vqEVu6yZcviA+AUpvP+i+h8pR7PHFFsfKLmJUjDhnDRIvUsorQYK3EI8iclJX3SqVOnbdwFiBodHY1EheGqYvwz6GTs5z9WxB6xhw8fPoefyJw5c7Ad/sQhC1jFShyGXC4uLr21vRuPHz9ez5Tx9GLsM+iIHcscXew1a9Zgu0Esk/e6SZ4/np6ezV5//XU/7kNQUBA+h+BPslWsFp0Pj04jthzq6gTcuXPnbXw9zn3w8/MLoPbOYpwIxBa6+xy/FFHFbi/GSBwPs9n8yoABA37SiI3eqx5inIhTic1PhMTGB0cpthOAhyWhG5cnLRI7kNq/F+NEdMR23FJEiu18hIaGvjxo0KAFXGx/f398MZHueyvFlhiahw8fvtGlS5dV3IeAgAB8KdRajBPRETuGOaLYI0aMmC3Fdj6CgoJqtGzZchf3ITAwEN9O4ss2q1gtUmyJoaHSo1ajRo0OZFRsnX5sKbbEOJDINSEp94FKEW9qbyPGieiIHU1UEuNswarBHqTYEi3BwcHVcDcM94EyOAajpfsdhY7YGAQnxZYYg3v37lVp27btJu6Dn59fELOhu09H7AgmxZYYhfv371dq3779Bo3YGFr8gxgnIsWWGBqIjTuiuA+3b99+QO09xTgRHbHDmRRbYhQePHhQsWPHjuuyQOwwoqIYZwtWDfYAsYWbMKXY/2IePXpUQfsFDYmNu5rsKUXMTIotMQokdvlu3bot5z6oNXa6g6B0xDYxKbbEKISEhJTr0aPHUo3YwcyGZ6XriP2YSbElRsFkMpXB82E0Ytvb3RdCvCnG2YJVgz3ID48SLWaz+dV+/fr9rBE7gNlwo4GO2HgqgRRb");
    imageData.append("YgwwbFW40SCA2Se2zNgS4wCxBw4cuFAjNm406CLGieg8fuH594pIsSUcnVvD8ACjrmKciI7Yz78fW4ot4ejU2Dbd86gjthwEJTEOJpPptb59+/6SBWLLYasS44CMLYhtUz+2jtjyRgOJcUCN3b9//0Uase398CjFlhgHsVfEn/5ReycxTkSKLTE0YWFhpQYPHjxfIzZ+fryjGCcixZYYGog9ZMiQeRqxbbo1TIotMTQ6YuOBOe3EOBEdsWWviMQ4hIeHlxw6dOhc7kNAQMANav+fGCcixZYYGog9bNiwHzViX2PKL1RYxWqRYksMTURExEt4fJ1GbJueKyLFlhgaHbFtenafFFtiaHTE9mLKjy9ZxWqRYksMjVhjBwYG4qf7WolxIlJsiaERe0VIbPyupD1iRzEptsQoiP3YqtgtxTgRHbEdf9jq2rVr8Uu8UmwnQEfsy0yKbR0ncSwgtlCKSLHFGInjoVNj2yu249fYUmznQadXBGKn+4sGOmI7fq+IFNt5wM/h4b3ViH2JSbGt4ySOBf+dR43YHtTeXIwTkWJLDE1kZOSLo0ePnqER253am4pxIjpiO/54bCm28yCKHRQUdIHaG4txIlJsiaEhsYsLYp+n9oZinIgUW2JoxBqbxHZl/zax+XZSbOdBR+xz1P6FGCcixZYYGnHYKol9lto/F+NEpNgSQ5OFYjtud58U2/nQEfsMtX8mxolIsSWGRvzm8c6dO6ep/RMxTsSpxJa9Is6H+OGRxD5F7R+LcSJSbImhkWLLUsQp0RH7JLXXF+NEdMSWvSIS46Aj9glq/0iME5FiSwxNFootSxGJcdAR+zi1fyjGiUixJYZGR+xj1P5fMU7EKcWWj19wHjC6b9SoUTO5D8HBwUep/QMxTkSKLTE04rBVEvswtb8vxok4ldjygTnOh3ijAYl9iEmxreMkjoUUW4rtlEixpdhOCcQeM2bMdI3YssYWYySORypi1xPjRKTYEkMDsceOHTtN");
    imageData.append("ii3Fdip0MvYRJsW2jpM4FlJsKbZTkoViO/7TVqXYzoNOd58UW4yROB46GdvesSJSbIlxEMX+V47uk2I7H1FRUcW03X2q2P+u8dhSbOcjOjq66Pjx46doxD7O7LuDRpYiEuOgI/YJZt/NvFJsiXEgsYtMmDBhskZs3KX+sRgnIsWWGBodsf9i9j0JSootMQ4Qe+LEiZO4D+pjhO15KKUUW2IcYmJiCgti2/tTHVJsiXEQM3ZgYOBFam8mxolIsSWGRqyxSWxPam8lxonoiC37sSXGQRQ7ICDAh9q/FuNEpNgSQyP2Y/v7+9+k9nZinIgUW2JodMT2p/bvxDgRHbEd86GU+DkHKbbzgbEi48aNm8p98PPzu0PtXcU4ESm2xNCIo/tI7LvU3kOME5FiSwyN+Iiz27dv36f2H8Q4ESm2xNDgV8Pw+Ukj9gNq7ynGiUixJYYmPDy85NChQ+dKsaXYTkVYWFipwYMHz9eILUsRMUbieJDYpbVi04fHe0yKbR0ncSyQsYcMGTJPEFv2ikgcG/GXeWV3nxTbKZD92FJsp0QcBKWK3V2ME5FiSwxNbGxswalTp47TiB1M7d3EOBEptsTQxMfH55s5c+YojdhB1P69GCcixZYYGog9e/bsEdwHf39/P2rvKMaJSLElhiYuLq7A9OnTx3AfAgICblD7/8Q4ESm2xNBgEJT2B0xJ7KvU3kaME9ERO5ZJsSVG4cGDBxU7dOiwXiP2dWZfxpZiS4zDrVu36tWvX/8k9yETNxrEMSm2xChcu3bt05o1a3pwH0j0MGofJMaJOJXY/ERWr14txXYSrl692rBKlSo+3AdfX18IOkqME9ERO545utgTJ06UYjsJJ0+e/Kp06dL3uA9BQUH/LrG1d6lXq1YN2/Uh8ohxEsdi3bp1HXPnzh3HfQgPD39M7f3EOBEdsR2zFBk9evTMHDlyJPLtFi1atJfaq4txEschJCSk9LBhw37kCatSJTwWhJ0iGoixIk4j");
    imageData.append("9v79+weULFnyAd8OJ/Xzzz8vjIiIKJ+SkpKNx2GeyEHk5NPk5ORcRG4NuTTrswtg+yyDjumFdLA6Vx0yGm8vf/f+LdD1z0kfEiuPHDlyVrFixUxc0N9//x0l5kIiv7iNiI7YjtndFxMTU71Zs2bPnAzmu3Xrtnzp0qU9Vq1a1QVg/rfffusN6EL1wvSXX37pSxm+P4f+Q/T79ddf+2D94sWLey5ZsuQHDrbPKpYtW9YdLF++vJvIihUruhqVlStXfs/h1zUrwXvStm3bTTlz5kzg7yfV2Sw2NvYhs6EMAU4jNggLC+tcr149X74tl1tEu16SMcRrmZWg5OBgmb/mhx9+yCIjI/GV+Dpmo5w6YjtmKaJSICEhofvs2bO9eV0mcVxKlCjBKHuj/ECmXs9s+IkOjiHF1krJMiY2yEV8GxcXt+D06dOu8+fPjx4yZEjKwIEDmcT40IdFfPBPofcO3XMY8LSGGMgyKCWVpS7OJjYHgjckxhLTJQ7HRKZ8F1GaWb+36dK8efO9gkfPf3RfFokt+RfTsmXLXUJJ+/x/0UCKLcksOmJHMAOK/Y/0n0qchxYtWuwRPDJcxt5NPPmCRSKxBZ0a+/n3YwsHtIfIIcZJJGmh0yvyfAdBubu7PyN2aGjofmovLMZJJGmhFbtQoULU9Jy7+7y8vJ4R+8CBA/j5s0ZinESSFtovaN5++21qYrjz5g0xzhasGuwhMDDwmW8eK1SoEBkREfGTGCeRpEZiYmKOxo0b7+dijxqF4dtsLlFMjLUFqwZ7iI2Nfad48eIhXGwcXN26df0CAgLSfXSsRAJmzJgxGiM9udi+vr74Wr4BkV2MtQWrBjsptn379vFcbIAMXq5cOf82bdpsw88P79+/v/HBgwcbYiQYTgK/UYI7aADG7wLMjx07dhr9G7tgwYJBGJm3Zs2aThs3bmy3ZcuWbzHF9hjBx0f0YVQZ4jDiDqPvsA7tCxcuHDhv3rwhAPvi8ZhiGe1z584d");
    imageData.append("Cvg8HvKCY8PjuaZMmTIeYB7Hg+nkyZMncLTr8AwNgHm0Y/2kSZMm4rzxDDtbQTy2E8E6/LwcfomLg2XtNvx4xePCE5lmzZo1cs6cOcNxjtprkRq4dvPnzx+MKZYxWhLvw9atW7/Zu3dv88OHD39+4sSJj0+fPv3hmTNnPnB1da3r4eFR08fHp8qtW7cq+Pv7l7t9+3Z5b2/vqmfPnq23c+fOVtgPjnvgwIEL+/fvvwiPGR4wYMBP7dq124huPtxxw6Xu3bs3KcWSiBo6rtmEVYOdvJCUlNSgVq1aT+6a4JkbNxIgm1euXPka7oOD7PifiTG7RYsWNYMiRYqEAsy/+OKLj1966aWHL7/88t0yZcoEIr58+fK3qby5hSmWX3vttaBXXnklGGAecRy+DtvjYgHM83hxnZZSpUrdx7Hh9UuUKPEIYJ7D2/TW6cXgvDOK+Bradbg2WlLbRns8OB+Ac9O7FlpeffXVO/z6cPg1xnV/4403fCtVqnS9atWq3tWqVfOqXr36FVCjRo3LuHmX3n+3OnXqnKe/1q6Yvvfee+5UK3tWrFjxBvaNY6YPheGgcOHCYZjmypUrXjsykPaDoa7I1lOZnWUIsGrIBIXi4+P7ff3113HaLhuJxFZat26Noa6Q2pt4l2XiSz6rhkyCPpov6E/QspYtWz655UsiSYtWrVqxY8eOQWh072EA3Dssk/e+WjVkAfhiphRT/sc1IUYwZRjjaeIWEcKUMQD4nWx8s4RO+MRUwDqM8EJ8GGEWwL7wwz14micefOjLlGGTePIQ5xrhQ+AxW5cJD+ICcZYpx3ScOKZyQm3DOvCXunxSXQcQz+HbcY5oOKq2IQ7b4b4/cIY4p4MrcV4AbWIchx+fFrTp7Qe4Ee7EJcKLKVkR1+qmOsW1QhuuE9ZjimUOriFAHN/utgquO67zFQJdvdgWbQFMeV+w7iJTjhtT7MNfbd/GlIfp1CXQx1eEZSJTc6waspicTMniJYnXiPLE");
    imageData.append("m0z5/h+g8x1USQW+HrEVdcC+APo6KzBl/yKvayhHlFUpw5RjAq+q8GWs4/A2Pfh2aSFuo933P0VZDbgGANcjteuUHtrt+HXn11e7b6wDWC7Lnh4LX4d2DHHNx7JAZi1WDRKJM2DVIJE4A1YNWtwfhX6+P+jh937hUdUTk1Nwd4ulPYX+bHDEbSzrU1KyxScn54lJSioQlZhYOCohsUhkQmLRiISEYmHx8SVMcXEvP4yJLXs/OqbC3ejoineioioTVQIjI6sFREa87R8RUQNTLN+JiqxyLzr6zQcx0RUexsS8HhIbU8YcF/tyWHxcyYiE+OKRtM9oeo3YpMSCcUlJ+eOTk/KKJNCxPEtSnsTk5NyJKcm5noHasE6LNi4pJTknSE5JycHRayOya0it3W5SWEq2Z3n6fqSOJt6yn2Q6Hsux03kl5cK8FrRpoGtA18JCYl4NebAOMbTfJ8eFfWNdQnJCgfjk+EJEQcRr41gq7qRFMkvOobweXjcxb2xydHFzwsPqpoQHNdCujbXamFNp49EbhVfsiyi4fG9UsVUu4SVWu5hLrtlnKrnGxVR6rYup1Jq9NAV7TK+s22N6ed0u06vrdxO7TK9twPwOc5n1O4nt5rIbdhDbzOU2bgstt/GP0Nc3YbolrPwmsDmsAk0rbNoU9sZmsDH8zS3E5g3hlbZsDKu0ZUNY5a1gfViVP9aHVd22LrTadmLb2tDq28Ga0Hd2rDW/s2ONueZOsNr83q7V5nd3rjLX2gVWmmvvXmmutXuFuc4esNxc18JSc709y4il5g/2gsXmD12WEL+bP9q32PyRy2/m+n/+Zv5432/mBn+CX82f7P/V/On+X8yfHsD0Z/NnB4kDi8xfHAQ/mRseAgvNTQ4vNDU5tMDU9AhxeIGp2dH55qZH5plbHJ1vanF0nunLY/NoOtfU8jhx7EdTq+Ngjqn1CTDb1OYkmGX65hRxcobp21MziRmmtqfBNFO7v6YT00ztLUwxdfhr");
    imageData.append("KjHF9N2ZKaaOZyabOp0Fk0ydz002dT470fT9OTDB1NUVjDd1Pw/GmbpfGGvufn6MuYfbGPMPF8aYe7qB0eZe7qPNvd1HmftcJNxHmvt6EBdHmPt5gOHm/haGmQdeIjyGmgddHmoefHmoaajnUNMQz8E0HWwe6jnIPPzKIPOwKwPMI7wGmkfQdORVwqu/afRV0M80xrs/0dc0zofw7mMaf62vabxPb9PEa6CXadJ1C48n3+j1eMqNnqYpN4kbPcxTb4Lu5mk3u4VOu9k1bLpv17CFfgPxOzdd0xTb83H42wVX7IvMvnhXSvYluxjIsWQny7lkB8u1VCH3su3ENpZ3OfiD5bOwleVfsZUVWLGFFVwJNrNCqzazwqs2sSIWNrKiqzeyYqs3sBfXgPWs+Nr1rMTadRZeWruWlVy3lpVat4aVWr+alSZe3gBWsVc2rGSvEq9tBCtYmU3LWVmi3OZlFl7fvJRYwipsUXhj62Lid1bxD/Abq2ThV1Z526+syrZfWNXt4Gf21o6fWbUdi1h1sPMn9jZRY+dCVmPXQvbOrgWs5u4F7N3d8y28t2ceq0XU3jOX1d47l9XZ+yOr6wLmsPddZrN6+2azD8Cfs9h//5zJPiQ+2g9msPr7p7P6B6azBgemsQYHp7FPDk4lprDPDoHJ7PPDCl8cnsQaHp7IGh0BE1jjoxNYk6PjWdNjYBxrZmEsa3EcjGFfngCjWauTYBT7ysJI1vrUSNbm1Aj29WkwnH3z13D27V/D2P8sDGVtzwxl7c4MYe3PDrbQ4dxg1vHcIGIg+851IOvkOsBC5/P9WZfz/dj3FxS6XujLurn1Yd2Bex/Ww703+8G9F+t5EfRkvYDHD6wPuNSD9bXQnfW/DLqxAZ6gKxtIDLryPRtsoQsb4tWFDfXqzIZdBZ3YcGKE93dspHenlFHe36WM9gEd2Ohr7dkYYuz19mzc9fYp46+3S5lATPXtQn+YLL0wqYu9yTe4bb5lLjHZFu9m");
    imageData.append("2RZDalXspYrcuZcRS7ezPMvAU7nzrwBbWIGVkJukJrkLrdxEYkNuSL2J2MCKrYHcJDXJXXyNInUJVeqXLFIT60jsDZAbUqtibwSQmthIYm+G3JBaEbv8FgCpiS2L2Zt/EBq5K28DJPZ2Re63dhDbF5HYkBtSLyIgNcltkXohq7lLkfrd3ZAacitS1yap65DUdfZC6qdi19sHqVWx90NuSK2I/fEBoIjdgMT+9BABuQ8rcn/BxT4CJpLUBMnd5BjkhtDjLVI3Pz6OGMNanBjLvjw+mrU8OYa1PDFKlRtSjyJGsDYkdZtTitTfnB5mEftbVeq2JHW7s0CRusNZSP1U7O8sUqtiX1Dk7vpEbEXuHlzsi4rcvS6Cnqy3B+hBYv9gEbvfZeJSN1VuSN2N+J7EhtyQ+ns25Epni9hDvRSph1/9ziL2CO+ObJRPRxIcUhM+ithjrrUjsUFbNv5GWzb1ZidSl91NU+ztfvda51uuiE1ZmzL2TiFjI1srUitiZz5jvwTWKXKXVOVWMvYqNWOvsoiNbJ1axobYSsZGtlakflObsbelkbF3Ppux39Fk7JqWbP00Y9fSy9j75qgZe5YFyK1k7BlKxrZIrYp9gGdsyK1kbSVjT1LFTjtjN7dk66cZu+UJyK3J2KfSydgWsXnGVrJ2B5IaKFKLGbu/mrH7sq6q1JaM7dbbOmNbpP7BQh+Ppxm7n17G9kwnY19FxgaK3KMsGbuDkrFJ7LFcbGKqb+f0xT4SHPJZ/mUu0boZ21KGKHLzjJ3PkrEhNTL2ViFjQ2yesYE2YwNka8iNbP1UakvGtpQjaWRsi9xKxi4nZGzI/aYqdyXdjA2pkbEhtk7G3rmAvfMkY6McmaeKDalRjmgy9j6djL1Pk7EPQO6nYn8iZmy1HNHP2ONJbEXuZzM2ZesTkHu0IvYzGRsgY0NuZOs0MvYZtRQRMrYiNeGaTsZ202RsD8gNqRW5+16C3JBazdieqWXsLkrGvgq5rTP2");
    imageData.append("SEgtZGyIneGMfTEk7N0Cy12iILV+ja1k7L+3xuYZOytqbMhtQ41tkds6Y4s1tm7G1tbYFrn1amwlW6deY6sZ+3A6GTuzNbYmY6MUSa3GflKKZKTG9tCvsXUzdlo1trdSY1vEVjO2WGNnOGPfDo8uX3D5vkjdjJ1ejb2c19jI1qnV2BuUjL3276mxK9hSY2/PSI39NGNnVY2tlCG2ZGyxxka2VmpsZOxM19hnFKnbazJ2pyypsSE20GTszNbYEDszNfa96NjS6BX5x2tsVe5na2xNxv47a2yhV8QqY/+tNbaQsTNYYyNj21xjn8mKGrtvujW2JWNntsa21Ne8xu5gYUxmauxHsfElCi3fF6GbsTNcY2sz9t9XY4u9IjbV2MjaadbYC6wytm6NrZex06uxD9iasW2psZWM/ZW9NbZOr4huje2mk7HTq7GfZOzumhobZLDGVj84Zipjh8TGFy+0AmKnVmPLfmyrjC37sf+Wfmwla2dRjW2KSyiWasZOr8aW/dg21diyH9uOGjuzGdscl1BUydj/cI0t+7HtqrFlP7aNGdsidmoZO8M1tuzH1q2xbe4VsaXGlv3YNmXs9Gts2Y9tlbFlP7bx+7EDI2PKyH5s2Y+duRrbgP3Yrg/NdZVvHv/hGlv2Y9tVY8t+bBsz9mLvgJ55l+6N1c3YGa6xZT+2bo0t+7EzVmNnRT/2d0c91uZaujch9Rpb9mNbZWzZj238fux6O0+fy7F4T5Juxk6vxpb92DbV2LIf244aO7MZu8HuM8dzLFHE/kdrbNmPbVeNLfuxbczYP3n5Dci6Glv2Y+vW2Db3ithSY8t+7Gk3Oycz5YE9qYudmJxS5NLjsGPH74Ykn7gbwk7eDUlyfWD293wcdtjLFO5C7L9iCjtIHLhqDtvtbQ7fAWh+jxe1XXkcetTTZD5BnCROEacvPzafJVwvPTa5Ee6XH5sugkuPH3sQl1QuX7YQovL4kucTaNkU4klcuWx6dMWT5lUu");
    imageData.append("a7lienTpivlZvMyPPK6aH128an7o5h36yJU4C3wUztH8eeKCd+hDNx+FCwJuPmEP3a6FPbhAnCfOca4L3Ah/cJY4o04B2s7dDL9v4Ub4fVc+byEC3NPiCnwj7p2/GX7PTeGum2+EPrcsBF8gzluItHDh9jPcAW6EO8cv6o6bQhDnInGJuHw7KtATU39a9o8KFPEIiA50D4gOukDT84QrpoHRgW6EOyeIloOiA6gtgJb9LwVE+3sFRPt5B0b7XSOuB8aA2xyfoBg/rzsx/pcI9+CYANfg2IC/7sUGHL8XG3jkXlzAsbux/n8Fx/qfB3dj/dyCY297BsX43g6MuXGfuPsgLvAkudszTbFVPiFmErOJGUy5A7g2UZ0pz1arRdQkqrKnT2Z6iymPNnuf+JD4iKjPlOccf8aUHydtQjRTaU60IL4kWhKtNGAZ7dp1XxGtVTAPtNvw7bTbcvBaeG0cw+dMOR7whdrWWF0PMK9F295I3UYE++T7/VSdArRp4/Ba4jYcvh7gdfCaTTXw49C2a4+Lo3f8iOXXXdwf5nF9tNcZU+3149cV7xf2wV+TH6t2//w1+HuN7dsQ3xJtiXYC/1PXIw7x2Cf8+y9THn1WT13WvhaOsQvRj+jDFMee+Pt/gTIAa3HF2wwAAAAASUVORK5C");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef8f06e0a3333f3fcb6619738ce10f616 = new WeakReference<>(result);
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
BufferedImage imagef8f06e0a3333f3fcb6619738ce10f616=getImagef8f06e0a3333f3fcb6619738ce10f616();
if (imagef8f06e0a3333f3fcb6619738ce10f616 != null) {
    g.drawImage(imagef8f06e0a3333f3fcb6619738ce10f616, 0, 0, null);
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
		return 182.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 182.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Outline_3() {
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
       Outline_3 base = new Outline_3();
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
       Outline_3 base = new Outline_3();
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
        return Outline_3::new;
    }
}

