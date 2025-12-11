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
public class Outline2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image1db00510e4cfa7527f1e40e907d9ac3a;
private static BufferedImage getImage1db00510e4cfa7527f1e40e907d9ac3a() {
    BufferedImage result = (image1db00510e4cfa7527f1e40e907d9ac3a != null)
        ? image1db00510e4cfa7527f1e40e907d9ac3a.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(14600);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAALcAAAC3CAYAAABQbs+fAAAqjklEQVR4Xu2dB3gU1drHvxAQQu9Veq8J/YIFEJDeI4QeWuhdEUQEpINykSJNQAIKUpQmnYAiSJcuJQ1CaAnpbUN2z/f+d+eEydnd7CZwrzt7zz7P79mdM++p898zZ06b/2OM/Z9E4oyYOUgkzoKZw2uSRa/XuyUnJxfQ6XSFkpKSJBIzoA3SSKGUlJQCBoMhJ3RjQUuvjZlDJslCCc0ZERFR+sKFC63XrVs3ecGCBZ9/+eWXMyQSNXPmzJmxZMmSGWvXrp2xb9++SYGBgR1J6GVIQ26EiwVtZRozh0yQJTExseDp06c/nDZt2vxWrVody507d6yLi4vh/yh4icQS0EfevHmj27Zte3rnzp2zo6KiWpCWCkJPFjSWKcwcMogL3WYK/Prrr90+/PDDIzly5EgUMyGR2KJEiRKRCxcu3B0TE9ONNJXXgs4yhZlDRqD2dY6LFy8269ix4/4sWbLoCVa8eHHWpk0bff/+/eNGjRr1dOzYsQ/BmDFjQkaPHh1Kbo/pG4SS26N0wHkjsOWo3UU/FE+ICLkDMWyLtpKMYa1s0ylf6ODhoEGDQpo3b/48T548SVzgZcqUid20adMuat42Im1lE7WWGcwcMoAL/dOKU9t6KiUyxtXVlVWqVEk/b968eH9//yCq0Q+TzUJiEjGR+ISYTswiviA+Iz4lpijfIlOJaQqwBfgNdw7sEO7HCpOtABvEA7g9T5c1cN6WzevC43ideOBXndfXCcteeJwoR0tlazUdVCFOjIuL+/jatWv/psrqMjVNEngTtmXLlk+pDT6P7IqzN9D+NnOwF3rKzX716tV3OnXqtA8JK1q0KJs5c2YCfS7S+dnEh0Qx9iqRrgSejHHbyU3kYKZ/qJq3BLIrwJaDY34efrIyU9hoqwHEpwZuOA87Do5fu/DeEG8iHTyfbyIse0mvbG21m11JP6UfPXo02tvb");
    imageData.append("+0/enMVdf/369ZfpfDP2BmpvMwd7odtHni1btgwpVKhQOBLWtGnTlDt37gTTublESdFeIhGhWrwwNWvHlitXLggacnNzY+PHjw+lczOIAqJ9RjFzsJeXL1/mW758+Xi0tZGwLl26xCUnJx9gpn+dmb1EYomIiIgGjRs3PoemCZ7ZevTooSP3fUQp0TajmDnYC8S9bNmy8by95OXlFUbui4g8oq1EYo3o6GiPDz744ES2bNmSoaMOHToYyN2PKC3aZhQzB3sRxd2nT5+nzHQ7MbOVSKwRGxtbg2rrXTlz5oyHjtq3b0/O7BRzBHHzZokUtyQzxMXFVenfv78vetwcStzffPPNOCluyetA4q48aNCgjfny5YtyOHG7urqmSHFLMkt8fHzF4cOHrylQoEDE/4S4DQZD1qSkpML0sFGNnqbdQWRkZB2itgJ+8+M6dB4Y7RRbuNfCt+JWB2HpdLrCzEIfLMXnmpycnI/afxVV4cO/MQwlDoTjIcRjtIuKiqqO8Om7Bo8T7omJiW8zU7+vOj6XlJSUHFRjlSO7ui9evKiLbyFs/E4TF8HzjPhqID6AYx4flRl6GDAOkCZ/FJ9bTExMJR4u0ogwlPTyPHLU+U51I1t1ebrDL5UnxjHMyjMjJCQklBs/fvwy3qVM4sYD5SnmhOLOQhes4Pnz5xutXr16xNChQ9d37959d7du3X7GQ8dHH320o2fPnj/h29PTcye+Ac7BBsAeNl5eXtt69eq1HefAsGHD1u3evXs4FWYNppq/QBcox927d6ts3bq178SJE5fy8OG/d+/eP/IwEHbXrl1/UccDO8r3D97e3puGDBny3cCBA7+HPc7D/8aNGz+n+NzZK8G50B8or5+fXwtMMsO0hQ4dOhzAQBgPG98cdVxIA/KMNCEelM3gwYM34BjnkQ7KwxQSeF1mGuwy5o9qxlwnTpz4YOzYscu7dOmyp3PnznuRxwEDBmwG8M/zjLTjmJcd3Lkbwud5Q9qQ");
    imageData.append("hj179ozR6/WVmWlATbyWdkHlU2by5MlfFS5cOMxpxE21ZTb69xd79OhRbapZcEGqUU1X4/Dhw31RqDVq1LiFWWNZs2Z9CdBV9NZbb+k46mP85nYAbhj1yp49exLOAYRFF+1aYGDgSorrAyIbpeEtf3//2tOnT59br169y0WKFHkOP/CPb3UYCBd5Bep43NzcEjALEuHjG/Y4B78kpuCHDx+up7g8eJ6vXr3aBOIoWbJkKHqaODxcHocYF88vws2VK1cc4sNDGI5xHumga3A7LCwMg2jllXJ2uXfvXi0IE+JBeHhGQjgIA8A/L0eeZ55vtRvC53lDOBR3HNW4V5lpNLouibwI/XHLElUpnyWYnYKnP1/50aNHryxYsOALpxA3hu5DQkJqLF++fCz9a7edPXt2L7mvJqEvmDBhwiE8XPwnpsw2bNgw5fLly4HMNE8lH/2p8v/6668D3d3dr/4n4mvUqBG7devWA4prLPJNAsi5b9++Abxn4E3TrFkzHZXrMYqroVLOWf/8888PatasefNN548Ez+jOgQGXq3S3mEN/okELFy6ct2jRojUPHjzA3JJ6zDTdwuz6q0FvSb9+/baoeku0LW5qepRavHjxtDp16lyjtlYc3eKS6PZ09/nz55t30Gfq1KnX6bYbTZlO6du3r6F///4psKGn6nhAzYAEwI+JBDqfSOjIPRFuVPCxBMLWIRwK4+XcuXNf0MU/TWkYQeQhseW7efNmz/nz5x/z8fGJIDs9oNt1Mg8H3zhWeKn6bQThI37ER02TGPghdx3OLViw4MXTp09PUFx9kG8SW46///67A/KH/FDeGPKH9PGweDxIr/JbB1ueHsRBD2DhmHE5cuTIZziGLcKgMg2ju+H3FBeaXihrVxJaI+QP/nl8sOdh4pv7Rzkr6cA5Y55QLogH0DWJQhphN2LEiES6VA+pgjhKd7/VdPfb+fbbb4fQHSmCKqhb1D7/muKvI157EXoWqImmEp9fomlx");
    imageData.append("Y5os1SbN27Ztewi3WhI3mzJlShwJ/iCd70G8QwwlfAkI4xRxnMDQ/m6FXxR+Vh1jyBY2+N5FbCd2EL8q/jFLcR3Rl8DKDz7hB78hvu+YKT4A2z3MFDbuKkgb3CyB8BE/4vuRmeKG/SFmiq8bM00gQ/7x8IUZb4OYKdzfid+YaUSOhwV/RxWOMFNYyBfskV/EsZZYSiwjflDskG40gdoy08Q0XuZFCR9mKhceH2r3/cyUR8SJuFBGcEc6cA552sZM5fINsZzYzExpgS38zqPr2fHJkycd6HllAx+IKV++/Msff/wRE6A8mQUNqCFx12nTps1hNIFU4j7JtChuqqFLUA06vUyZMg9wa6MHKnb//v0AOjeKQG8GBIdJM9WJBsx0i8U32uWoCQAe0oD6GO1a2OAbbrWI2oob/OM2WYXIx9KmCYLLT1RV7LgtD5+HCzdL4BxsEV9NxQ8/h/jUQgOYTYf44AdzlwHyyMPCd30VcFPnC3Eg3AoKOIYd0o085GJp48OfuIjin8cHWxwjDQib+8c34leXIcJEPBWZ6Zrw8oRfVAw5qfYuQk3LIR4eHjegBaq0GD3A3qc71UBmY6aiU4mbbpuV6da3GQ8npUqVYsuWLUtippqgKXvNbiXJP0ZWepB0HzdunC9vk1PTJSA5OXkws3FNSdy10GMkNEtOMi2K+8WLF1XR7YSn9ho1arCjR48+IveZTE6T1TQ6ne7tFStWfM310Lt370C6Sw9jpjuxmT2H/hQ10Xvk5uZmbNI4zMSpTIq7Ghe3u7s7O3fu3A1y78jewOR0yT8H6aGEr6/vbN7r0atXr6C4uLiRzMKgkhpMnELfOW+vO5W4z58//xe5NxftJNqC2t2F9u/fP6pixYr+iriDSdzoAk23O5D3lqAfXYpb4pDo9frcZ86c6fruu++ehh569uz5gGrlCcz8gToNJO7a7dq1O4hnMJW4TzApbomjgJ3Grl692gIPhxgwomv8kMSNwRyxdyoN");
    imageData.append("0dHR7tjrRlisAHFjXo6ZfUYwc7AXKW6JGgxQXb9+/X3Mk1GJGyvi0a1rZs+xshJHilviOCjibsZ3Q/D09AwhcWPrjYKirRqIu0WLFn6YsyLFLXFIIO4bN268h4dD6EGpubGPia2au26zZs1OOYu4U/u5pbidB0yGu337dhNMv1XEjQfKSczG9mgWxK1nUtwSRwLTee/du9cAc77R5lZ6SyYyG7shQNzvv//+b1xHirgxYq1NcWO+thS3c6GIuz4WOigPlPbW3PXQfSjFLXFY0Cy5detWUzRLIO4ePXo8iomJwd6QmAxnZs+BuN95550/BHFjdqI2xS2bJc6HXq/PdeHChXYtW7Y8Dj107dr1WVRUFOZ0Y0ahmT2HbOo1bdr0DN9FQevilr0lTkhKSko+Pz+/PliuBz20b98+KiIiAnPPMT3WzJ7jbOKWNbcTAnEfP368n4eHx1/QQ5s2beLCw8OxsOF90VYNb5Y4hbixxcCMGTM2NmzYMMHT09Nw48YNvmWtma1EO2B96JUrV1ph4YFSc0dTzb2dKes5rQFxv/fee79zHXXs2DGFmVYGaU/cWLXh7+8/9siRI3foNpZAtyUsq0q3ACSaIEtYWFhl0sSqdu3a6WbPnh0SHx8/i9mYp4+uQIib93Mr4sayOe2Jm5mWPWGpEtY33mKm3fixrlC0k2gMqr0LRkZGDgkKCjr79OlTP4PB0I3ZWInDxS3U3JoVNyhNfM5MC2ixpk88L9EmqLhQU3cnvJlp3aVokwaxK1Dz4ia/Rak9NpgeLqfTvx0LXNNdRCrRFLiW/PUh4jkzqFlav0mTJmf5A6Wm29yEy5MnTyr5+vou3rx580/0gNmOqbb/kmgaF6qsspM2CtCzFUYm010/CSDuf/3rX3/yTYM03VtC/nIePHiwHeYTtGzZ8sndu3f/zey4fUkcH51O53br1q26u3btGnz+/PmPSOg2BepU4o6NjS05a9asmaVKlXrk4eGhv0AfZqMv");
    imageData.append("VKIJstBDZDm8Artq1ap3Jk6ceDwxMRELv9NtnnBxO0U/N7W1K2NvOGzCogziYDPFFqKdRFtgJ7Fr1641x8610INqPjc2IDKz50DcFkYojzMtitvCCKUUtxNA4s5z+vTpHng4hB4wtyQ6Ovor9mrHWYtYGaHUrrjlrEDnAyOUly9fbs1HKLt16/aEhLuQmbZcM7PnOOWUV/iT4nYesF1yQECAO5qcqmbJx8xGs0QcxNF0m1uK22lxefz4sfH9Nuj58PLyCoyLixvObGxC71RzS2SzxGlxQW/JqFGjVkHcvXv3DoiPjx/CbPSWiM0STY9QWniglOJ2DjItbmH4/SUz7REuxS1xGDDyXH7kyJHfKs0Su8TNFysI4sZMUSluicOANneFESNGrFaJG2/ISHcIXuzn7tSpE8SNt0mUEm0zipmDvUhxSwSyhIaGVlI9UGZW3MnM9CoTKW6Jw5Dl0aNHlfG+zzcgbixPk+KWOAwQdxUubnsfKK2IGy+ckuKWOAxpam5F3DbfiSOufpfiljgixja3j4/PWkXc/iRuvJIw3YUoELd6bolslkgcERf1A6Uibm+4W7BNRRzEkeKWOCLGZklGa25x+F2KW+JwGAwG1+Dg4BqDBg3amJE2t7i1g+wKlDgcJO637ty50wjXNoMTp0Rxy0EciWOB+dwXL15si5c3QdwZ2Z/bgri1O/wuZwU6H+Kr+jw9PbGF8WfMji2MhSmv2p04RRmuMHv27LWNGzeOU/YKvMjkAmHNo35VnyJue99mZmnKqzbFjTfNBgQEjDh69OjtU6dORVLmfMm9lmgn0RxZwsPDK61atWoZNS1iFyxYcC8xMRHD7+m2uXk/tyBubc7nZqa5BvWJLcy0Vg77yaX7CmWJNqDaOz/dmbuHhoZuIaGvpYdMm3dkKztOaVbcoASBf/UYZmPnfYmmQLdfPqIKUYnIZcEmDeKmPJpeZqb4LUKZ6kZtMk/6d8sdXp0LDNpA5On2b3NIBw3o");
    imageData.append("+escF7emFwijsz8kJKS6r6/vol27dn0bHx+PvbnTnRYp0Q5YBU/PVXnwjhxmY3QSOJW4k5KS8m/ZsqVf/fr1L7Vv3z4wKChoOrOxQblEGyQnJ2OvwHo7duwYdu7cuV527hVoSdx4FrPp1xZmDvaSWXFTZspjEWnevHmj69Wrl3zp0qXfyb2paCfRHFmwzOyTTz5ZXLx48Sc+Pj4XExISvJiNu7LY5ta0uDGIg7fMwp8yiHOFyUEczcN3nGrbtu0hCNXT0zPEnkEcK+LWZrNEjlA6J9TOzn/s2LEBderUuQY9dO7cOYyEu4rOVRNt1XBx865AzYtbqLmluJ0ASxthRtn3klVL/dza7AqEuPF+cEyUkeJ2HvB67Nu3bzfp0aPHLt4siY2N/ZTZGH63Im5tDuJwccua2+lwffDgQfXBgwdvUE15HcFsD79bErc255bIZonTkmb1e0a2dhDErd1ZgfKB0mnJEhISUmXo0KHr34C4MZ9bm4sVpLidEoi7qkrcgSRuH3LPZsE2FVHcml+JI8XtlBhrblWzxK5lZhbELddQShwOca9Au8WtHsSRq98ljgi2MK6g2sKYi9tms0SKW+LwYPP50aNHr1SJ2642txS3xOF59uxZWbW46YFyGLOjt0SKW+LwqF8bohK3rLlFO4nmEF8bYndXoHrilBS3xBExvqpP9doQu9vcsitQ4uhktivQ0v7cmhV3NSlupyTNLq+9evUKInGPJnc3C7apQNzC/tyaHqGU4nZCsPBbPSvwNXac4nNLtDlxSorb+cCq98DAwDr9+/f3hbi7d+/+mIQ7l9mogUVxa3ojzJiYmIpffPHFd40aNYqnW1fy7du3T5F7E9FOoi0g7qCgoNoDBgzYDHF369btCQl3Pp0rLdqqcSpxp6SkFPH39x9z4sSJi3/++ectapfh311etJNoDuwVWHHlypXL27dvnzBv3ryAxMTECcy0A5Vomwp6S9QPlJqez81MXUM1icnENGba");
    imageData.append("NzC7BTuJxtDr9YUjIyOHBQcH+z1//nw31eZtmY2dp8RBHE0vM1PAEzQWjqLGzmHhvESboNsPewR2Idox056Qok0aooRNeTS9QBhgL2edTleOwijDpLidDdTUqLzsuq6iuDt06ABxH2P/tLiXLVs2nreV7BU3HjxCQ0OrHjhwYPzJkyc/pnaZO7PR0S/RBugOTE5OLhgfH1+ZvlFrp/v2YGBB3HqmVXEnJCQUWr9+/VC0szw9Pa/RE/bnzMYTtUQTuJCoC5w4caLzkiVLFvv5+Q23c69Ax9xxKjPipgeOCliKlDt37tgGDRrorly5cpzc/yXaSbQF1drZAgIC3DH8XqJEiccTJkzwo7tyB2Zjp1dx4pTD7BWYGXFjhJJq7J34p6oGcVqIdhJtIe44lYG5JWkmTjmjuJuLdhJtgb0Cjx8/3s/Dw+Mv6EF5VR/6udN9VZ84cUrr4pbD704Idnm9dOlSm9atWx9VxB1MNfc4ZuPVIXziFO9103SbW4rbOUEvGNrc/fr126JarGBzmRmG36W4JY6Occor37ekd+/e/iRubwt2aRDF7TCDOFLcEhVYrJA6n1sR90ALdmkQ29wOM/wuxS1R4frw4cNqfD63Iu5BzI65Jc4kbrlYwQlRz+eGHjK7hlKKW+JwYBDH39+/LungB1VvyVhm4+3QUtwSh0cRt0ffvn23Qg90jbHMDNOa84q2asThdyluicOhNEtq82Vmirg/ZnYsVrAg7n9+sYIUt4SDGYHBwcE1Bw4c+L0iboxQTmKZq7mluCWOgyjuDAy/S3FLHBuIOygoqJZK3Hz4Pbdoq8aKuGWbW+I48Jrb29t7E4Taq1cviHsMs6O3RD3lVeviloM4zonxnThDhgz5ThE3dpwayWwsN3O2rkD5ThznJM3wu+o9lOnubOCw4sYCYSluiYKx5uYTpzIw5dUxh98zs/pdNkucEz7lFYM4ELey49QCOocdDszsOVLcEoeHxJ3jxo0b73bp0mUP");
    imageData.append("9NCuXbtoutY76Fxj0VaNQzdLMipu+jdXnjZtmm/9+vWT6Nb18tatW2fI/V3RTqItIO7r16+/37lz573QQ5s2beLCw8Oxz3Yz0VaNFXH/8/O5MyNu8lf8zp07Uw8fPnz/9OnTGKL9mpl2nzKzlWiKrE+fPq21ZMmSjSTslzNnznxCbe5/k3tlC7apiP3cDrMpT2bEzUxTIOsRy4g1zLRXYLrL/yXaICUlpTjV1lP9/f3vktBPUG3emdnYmCfKUTflyaS4QUHiQ6KV8ls8L9EmGLBBE/NzAts6lLZgkwZnE7cL+S1Kbe+OdNtqT//uwhZsJNoEq24KEe7M1NS0eUe2Iu7jTIvipltXjtu3b7+3evXqddu3b98QHx/flNlYrSHRBlRRvUUVVvUnT554xcTEtGQ25pUAK+I+wbQobnqALDl79uwv3n777ZBWrVo9CggImMVsvFpCog3o2hbesWOHj7e394nv6JOcnIxuQFtrKEVxG5hWxS30cyefPXv2FLmj9jazlWgHZRCn1qBBgzZmzZr1pTJxCitxbC1WEMWt3Zo7IiIidTs1qr2Zr6/vdXLHhomyaaJhoIc9e/b0btCgwUVc265du0ZQk3MDnasj2qpxKnHTg6Rxbgn85ciRg9E/PSQ8PBz+Soq2Es3gGhYWVnn8+PHL3NzcErJlywY9xJJG9tC5dyzYpyIO4mj6gTIhIaH8lClTVuXNmzca/ooXL65btGjRb5GRkR9ilEu0zyB4OkcbD32rNp/U3wCIA9uFgf9GfA4H5nHTw2PJbdu2DYJIUQPTNWVLly6FHr5iNl7mxXeccgpxp6SkFDx16tQwDw+Pm/AHypUr93zx4sVr7t2714za5BWJChxqxqT+BvRPL08PKkVZWjG56HS6XPD77NmzGkRNuhtUVvvLBEhHJSr8cpRX9MWn7nmHC0p/0vw4HxoaWu/x48ceVHNVsRBGhqH4yqKM1PlDe5Zu8YWoLMqL9q8L8qfEp75G2cm9");
    imageData.append("pGgrQmVcAZOlNmzYMByv28uePXsSgXklKXfv3r1BYQ1gNpqbEPd77733O9eR1vu5s9JTtceCBQt+KFy4cBwXOP0O69Sp0z7MB8YG5pwRI0asBvx4+vTpq65evYr9MIrxMJOSknIfPny4Dc5jJQjehTh06ND1OEZ4IurwrQE7TN+cM2fOv+/fv9+PqV5eRA9KBXfs2PHRuHHjvvHy8tpGef8Bk/TFeDISH2fevHlLSTD9KZ4iiAvCfv78ebnvvvtuyMiRI7+1FGZm44L9/PnzlwUHB2NnKJSnq16vz0WVTGP0aIn2avg1wcaX9erVu0xNkWQ0M5s2barftWvXcwprM9FQuPZmkLjrQtx4CHUGcYMCVNP1nTt37snKlSvHc4HjlmYLquVfbt26FQ+hfZmpdnOhmrNm9+7dd/O08LD4b0uI4Ypwu+rVqyccOnQI7yJHj46xW4tq6xo9evTYlStXrtQ/py3E8K1Ru3bt+KNHj56keDB07UJiy3f27NneDRs2vMDzZymdmYkLuLu7J/r5+V2guAYT+aiiqLNmzZrVxYoVeyraWoPSZShSpAimuabs37//GdX8+ygsT2ZjcTDg4naWmhtAlIWoBu9P//JDVEMGtWrVKoaaKvpq1aqxqlWrpoJjNc2bN2dUayKuWcwkNpeQkJCmXbp0uUrnDen5zSgIo3Xr1inHjx/HxW/NlHkS9GeqS3eHkzVr1ky2FVd65yxBt/SXJLZbFM8I5A3vdvzjjz/GtmzZMpD+aPqMhmcL9CtTM5G3j0tQc6vFihUrjpHoE6zljbvVqlULNbWB/uhJ1Kx8+vfff2P6MnpIuhPFlWudLqK4HWZWYGaWmamAwAvSbbc1tSenUMH8Qhf1Cv3zb+zbt++mChyncuzYsRsk5l/I7wdKGGhvl7p+/frn5Pfa3r17b1nzmwlunjx58iI1C1ZQPLWV+NAMKkNNoy8PHjx4DvGp4hT9G8Ow4GYVEtp5assup3jqKuWUgx7Y");
    imageData.append("mpw/f37VgQMH/qK4bivxmfnNDJS/v+guuo2Z5vrkoT9TGfrz+tAf+vA+6+V4k8r65pEjR25cvnz5GpXPb+QXZYS7KSbFpbv6Rg3E3axZs1O8WaLprR0sgNoX80veJXoQPW3wETPNEVb3rCAMrPjAud6ElwV/9oIwAD/uykwzF9W3WMRdjZmaDrigiFMMx17UcYEuzDQ3Q71pO97riD8XbvWIr4/gx17EvAGUOV64xd9dY7yrMlPlgfO9BHsRpAkvVEV5pPv+G0uQuN3prnQcbXboSHn3+0H2BkatzRzs5Q2K+03CuwL/W91yiAdNlXSHmN8g/+34wH+0LCFuapIeU4k7mdyxyEGKW6JtSNweLVq08OPNEllzS5wG9HOjj1x4oHSaNrfkfxhx+N1hekuWL1+eKm4vL6+nKSkpUtySDBEZGZm6hpJgXbp0cYx+7tWrV6eKm9pKzyihX7JMPDFL/nd59uxZg0aNGp2HuDF07+3trSN3DAK99kQ6Mwd7oVo63w8//JAqbnd396iTJ0/6GgyGGqKtRGKN+/fvN8DoK8RdpEgRtnDhQgzdL2Km7kgz+4xg5mAver0+72+//TYKUxwhbvp+SU2Tv/39/T/BqJpoL5GIYE7Qzp07vapVq/Y3xF27dm125swZTK1Av3m6ewzag5lDBsgZGhraqVWrVpcgbpAvX774AQMGnD537tyYsLCwBnFxcWWSk5PzUBMmF31j3kLhxMTEYgkJCRjmBSUVitO5IjqdrgC3pzuDG9ZbitAfJzuRTSGr8v0W7MlfbsSDcBQKAgq7kEJhfCvu+ck2L/wgPiKn8o0w8iIcBaQnpxJ/dsQDN4RBeSlKFMe3Ei7izK9QgMeJPCt23LawOg0KiAdpSQXuSljIA9KuTj+PK01eVccIG+k3hq2Ch4n0IdzU8qG0FUEacW2QZiWd+ZAW5BvlrGAsc+VaAPzOitmSRBZ8wwblhjRReKVIC+VAbGxs2YiIiCpUYzf66aef");
    imageData.append("+rRr1+4g5ugQjLRjiImJOU3aqsreQP+6mUMGcKXEl//555+X5M2b19iNgyZK7ty5YytXrnyvffv2v3722Wfzvv/++4Fbt27ti1ltmIuyaNGiKfPnz582b968z+bOnTsd0K3o06VLl06kNvyITZs2ecN++/btvTDzDtC/2xPs2rWrx+7du7vv2bOny759+zrt37+/I74pDd1gv3nz5gGIZ82aNcMR1rfffjty1apVo1asWDGGHn7HcuC+bt26YRs3bhzk6+vbH/H9+OOPvamZ1QfHcF+/fv1QhEXpH7Bt2zYvHjddkJ7IE8L96quvJiM/+Ea4iBPhrl271ge/V65cORo9SkuWLPkYeeS2KAeehg0bNgxGfAgT6Uf8AL/hjrAQF8JHWPjGMcJHPsW8cneEjfQjDJQpB/EhTNgjfRyE+/XXX0/i1wffSCfC2bJlSz/kG+WMsge//PJLVxxzN1yLgwcPtjt06FBbfO/du7czyhRp+vLLL2dMmTJlEZg6deoCzChs06bN4Zo1a96EXrC4oUmTJuzEiRMRpKvVzM55KbYwc8ggeeghstenn356vVixYqkz1iByNFcws6xChQoBlSpVul++fPnAMmXKPChVqtSjkiVLhqqBW+nSpR+WK1cuiNvjD6KmSpUqdzm4jampWrXqHdhUrFjRH/EgHFC2bNlgDuLm4Bh2iAt+EB8Hx3DHeYBjdfw8HoSBRc5IO74RLo+Xp4HHy+14PsU0cBCuGrhROIGW0s/jEvOqdhPD5/niYYrlg7TxdPI8qcsA5WwNXIfq1avf5uAY5YmwS5Qo8bho0aLPOAUKFIjA3G9FJ6xx48aM/twJdHdA//Z77A11Spg5ZBAMA5eMiopCLXG0W7dugZT41GmnEok1MPcbMwv79u2rP3DgQDi1AtBDgsUN+S3oLFOYOWQCCDw//esaPnz4cBLd2vfSbe3YjBkzzk+ePPnu6NGjQ318fF4MHTo0atiwYZH0OwLH+IbbkCFD");
    imageData.append("YgYPHhwL8JtsooYPH/5i5MiRz8jvY/hXwO/HY8aMCR07duzD8ePHB02cONGf4rgHJk2aBO6TW8CECRMCcZ4IHjdu3AMAPxzuRgTDBrbwg/AQjhLefXILwHn4oXgfIf5Ro0Y9obQ9RfrwjWOkD+cVm1DF5hndfp8rhFGewhXCcAx3IQx1XlPzjHOEMT5VeNyvJVLDQ3qQTyV/AcgfygfHSp6MaUX4Csa80LkQlA38oBx4WSAshEl2j3l6kB8FY/5wbfGN8wiflzXCRb5xHmmbM2fOjaNHj/o9f/58P+lnKdEEOlL0JGosU5g5vAaYxVaAKEvUItoQeD3yF8yU+FXESmbaIxAbJH6juK0l1hPfKb9hA3vs7TybmKkwSwHhTSPwGji8cwXzngFeUTGawIbnEwlsK/AJMYX4VPHDwTHccR7AFm/ewgofhIPwRhHjCbxL8TNmihfpmUPMZ6b0zVOOZzLTFmIYxMJv9PfDZiGxmFjCTPOlOXDDOXUYyBv8qoEbwpqr2MIPuskA94941KjDQ5qmMlP+kBfkD984RjkgTzx8gN8zienMVD68TFDO+A03hMnzh3Qgbzx/uG4Am5sibQgfZQ1mMlO+ce1Rjn2ZaVpvOaIos7EcLTOYObwh8O9DVw6miULw6BrEsimA3+pjZAxLnPANuA3W9cGvJfAPx34YeMch4uDgGOCcGtiLiDbWwuP+ES/SxEE/LLCUTtHGFpbCsBafPajDU5eVunws5Sk9f+pytJQmfl05cOPh8Li4Hfxizne6m2S+LmYOEomzYObADCyLXs9y6lNYHoPB7FbhgvOEq/H7VV8k3F0NevaW4je3Qi46diP3HDhH4YFsCuJv8XzWdHAFqelIC3dPRbC3iD02CmJ86cUppjtN+tXYiEM8L9qJ7uJ5e8Ky5Ec8Zy3dqfZCvsVrabJVVlCZac9+svCw0wsnzUFcpKHIrd+Tu57fm+RzZmfSuMuHdAOun9R5cq6d0PW8ekzX+69j");
    imageData.append("uj5Xj+u8rvnpel73032kuPe5dFDnfW5P0vCzu5NGgz9/SRqJsC7sTxpy6VfdIApvIMJUEH9zBlw5rOt/5YiuH/jriK4v/53qdlTXl+hjTAelh/BSvo0Yz/0neBWfGWa2SKOSduNvc0T7dOOwZWfrfLq26fgxsxGxlA7kG9eQo1xHnIPNteO6XtCNWlsiN9THsOX20Bv5V3Qy4NGdlx1Ju1VEYacRN/5V5LHNxHovHg4rHx43tFx4Ar6HVQiPTQXHaiy4k794NcM4ol/J/zZqXQn4mIjBt5Vzxt/DK4fHbpoSG8hMD65mNXjqj5SXLO/xTYmjhpQNTxxQLIxJJP8oxcMMRkR31TnvkmGGlT7RiaRfLHA2e1Nx6o/kJEOxn5fEzxpcOkxnFphE4oCQuNnKYdFJpN+dzNSbY1ncL3WGInuXxn8+uHR4khiIROKIGMXtYxT3D8xCt+IrcSezgodWJ0waUkaKW6INFHGjWbJFFHYacVObO4+fb+JwErdsc0s0gd3i1qcwtzM7k/rTA2WCGIhE4ojYLW6DnmU/tyep51ApbolGyIi4s108oOshxS3RCvaL28CyXjqo6ybFLdEKGRL35UO6LlLcEq2QEXG7Xjms6yzFLdEKGRP3EV0nKW6JVsiIuGWzRKIp7Be37C2RaAy7xa1PYTnO7ErqK2cFSrSC3eJOSWb5jm1IHCOH3yVawW5xJycZSuxaED9XzgqUaAW7xa1LMJT1nRa7YvDbcj63RBvYLW7U3DuNNbcUt0QbQNzfjoiOY6Z9b6yLG6vWb/+R3HvlsJjHiz6KMoAlvaN1ywdHh60eGRO8ZnRMoJFRMUGE6ffomAAVOMfPB63mkF8VD74dYeShQojqt+l4+CtWmXhkxEeBfqttjKQNwxoPED9Ph4W02MJov1pECUsIMw2ineqcGAcHebI3Xw/NyiO9srFWvgpW/b1CzAt3N/fDw/eJCQUrfWIeQ19q+LnUa6uKB/5hs2JIzLPlg6LD");
    imageData.append("v/GOjlg2MDpy2YDoKPwmm0cntyaeZ6ZNmKyLm3B5qTNUi3yqX/ssOOU6cSPsof40Ha+JfaGfEhthmKAwmZiE33GRhnHEWHwr5+CO8+Bj4pPYF4YpRv8v9J8S02Je6KfHhOtnEF9YYSYxS2E28WV0mH4OB8eq87AF8Icwweeq3yb3F+SGeCl+SsNUgN+KG+zVfiwB/zyMzyyAsDg4hp0atZ36vJhWa5in51Wa1WWG8gLq8lGHYWYbrS5fU9nCXe3vlX+hHJW8IB2W0orfsyhMhD2PWEAstADccX6uEvcXqfHAP9lEPdMvJx2ui3ii3xzxWP8jsZ1+fw+/1Jzux0zvwExX3AAv83Rnr16u2YGZtkbDTkHirkN8d6bcyre4sxPfzUjckYjvMIVtakVKKOCVEQCvawN4PwoHx/w8t1eHgbDF8HGs3s1K3O1KtBfhNnxXLBEenhim6MeajRifLUS/vMx4eanLR/Qr2qrLlpevJX88XjG/6aUf8SBMvAC3LDNtnSYCd5wvzV7FzeOBf9hgv268ZLYe0YhozExbscGv+mW76YpbInEazBwkEmfh/wEEmGfq9PDgQwAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image1db00510e4cfa7527f1e40e907d9ac3a = new WeakReference<>(result);
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
BufferedImage image1db00510e4cfa7527f1e40e907d9ac3a=getImage1db00510e4cfa7527f1e40e907d9ac3a();
if (image1db00510e4cfa7527f1e40e907d9ac3a != null) {
    g.drawImage(image1db00510e4cfa7527f1e40e907d9ac3a, 0, 0, null);
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
		return 183.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 183.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Outline2() {
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
       Outline2 base = new Outline2();
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
       Outline2 base = new Outline2();
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
        return Outline2::new;
    }
}

