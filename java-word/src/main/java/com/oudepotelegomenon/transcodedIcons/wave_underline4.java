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
public class wave_underline4 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagef08b6180839507b1f7c7abfa8b7ed998;
private static BufferedImage getImagef08b6180839507b1f7c7abfa8b7ed998() {
    BufferedImage result = (imagef08b6180839507b1f7c7abfa8b7ed998 != null)
        ? imagef08b6180839507b1f7c7abfa8b7ed998.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(10948);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAVsAAAFECAYAAACJT52jAAAf2klEQVR4Xu3dCZBVxdn/cWEA2WURFBwCBjBCqcgrFaISKBUlkQgqQYyoiEaogAGNorhjRJRFhGGIQVmMEECSoHl98e/yggsiKgrCG6CAKAi+COg4MAvMfv7dMuM7Ps8gs3Tfe8+5X6s+ldRv7pzue6b6oe+5ffqcEATBCQAAv1QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQAA91QAAHBPBQi3r776qtWyZcsGp6enj541a9Zt1rRp0+584IEHHh09enT6rbfe+oz93/vuu++xyZMn3z1z5swxZa+znnnmmdFvvfXWr7Ozs1vJYyernJycJqtXr+41f/784eXPq5WWlvb7qVOn3jVhwoSH77333knWI4888pDN7M/KXmf+Jr/dvXv32SUlJbXl8ZEcVIBwMYO31muvvXZZ8+bNv6lVq1bJCeZP6oo9Xq9evbYWFBQ0k+1G3a5du9p37tx5u+tzarVt2/bLPXv2dJNtItpUgPCwMy0zcP9XDmbX6tWrV2hmZc/K9qPKfgqoXbt2sTwPrpkZ71rTXjvZPqJJBQiH/Pz8+nLw+jRu3DjTbPAT2Y+oyczMbNGyZcuv5fv3oX379qbJ4FLZB0STChAOW7Zs");
    imageData.append("+Q85eH0aNmyYaTZYIPsRNX/961+H1qlTp1C+fx8aNWpkmgymyT4gmlSAcNi0aVNPOXh9Ki22L8h+RM3s2bNH+7hOW5HSYrtK9gHRpAKEw86dO38iB69PyVJs09PTb4txsd0g+4BoUgHCISMjo7UcvD6VFtslsh9RE4diu1H2AdGkAoRDTk5OUzl4fSottktlP6Jm1qxZv49xsd0i+4BoUgHC4fDhw43k4PWJYuteabHdIfuAaFIBwuHIkSMN5eD1KVmKbVpa2pgYF9vtsg+IJhUgHPLy8hrIwesTxda90mK7VfYB0aQChAOXEfyIQ7HdLPuAaFIBwsFujiIHr0/JsvQrDsX2X7IPiCYVIBwotn7E4Quy/5F9QDSpAOEQp6VfFFuHWGebXFSAcGBm60cciu0nsg+IJhUgHHJzcxvLwesTxdY9im1yUQHCgWLrRxyKLZcRkoQKEA5xWvpFsXWotNhukn1ANKkA4cDM1g+KLXxRAcKBYutHHIot62yThAoQDlxG8CMOxZY7yJKEChAOFFs/4lBs2RshSagA4UCx9YNiC19UgHCg2PpBsYUvKkA4UGz9oNjCFxUgHFiN4AfFFr6oAOHA3gh+UGzhiwoQDhRbP+JQbFn6lSRUgHBgi0U/4lBsuakhSagA4UCx9SMOxZbNw5OEChAO2dnZJ8nB6xPF1j32RkguKkA4MLP1g2ILX1SAcOALMj/iUGy5ZpskVIBwYJ2tHxRb+KIChAPF1o84FFuWfiUJFSAcKLZ+UGzhiwoQDhRbPyi28EUFCAeKrR9xKLZcs00SKkA4sBrBD4otfFEBwoF1tn7EodhukX1ANKkA4UCx9SMOxZZdv5KEChAOFFs/KLbwRQUIB4qtHxRb+KIChAPF1g+KLXxRAcKBYusHxRa+qADhwBaLfsSh2LIaIUmoAOFAsfUjDsWWO8iShAoQDhRbPyi28EUFCAeKrR8UW/iiAoQDX5D5QbGFLypAOFBs/aDYwhcVIBwo");
    imageData.append("tn6kpaWNiXGxZelXklABwoFi6wfFFr6oAOHAF2R+xOEyAsU2SagA4RCnYrtU9iNq4lBsuWabJFSAcKDY+kGxhS8qQDjE6Zotxdah0mLLkxqShAoQDsxs/aDYwhcVIBwotn7Eodhukn1ANKkA4cBlBD8otvBFBQiHOD1dl2LrUGmx3Sj7gGhSAcIhNze3sRy8PlFs3Ssttp/IPiCaVIBwoNj6QbGFLypAOFBs/YhDsd0g+4BoUgHCgWu2fsSh2DKzTRIqQDiwGsGPOBRbviBLEipAOLDO1o84FFuWfiUJFSAcKLZ+xKHY/o/sA6JJBQgHiq0fcSi23K6bJFSAcKDY+kGxhS8qQDjEqdgukf2Imjg8qYFrtklCBQgHiq0fcSi2LP1KEipAOGRlZTWTg9en0mK7WPYjauJQbLmpIUmoAOFw6NCh5nLw+kSxda+02H4s+4BoUgHCgWLrRxy+IFsn+4BoUgHCgWLrB8UWvqgA4RCna7Z/lf2IGootfFEBwoFi60cciu162QdEkwoQDnG6jLBI9iNq0tPTb4txsWXpV5JQAcKBYutHHIotNzUkCRUgHCi2fsSh2HK7bpJQAcIhMzOzpRy8PlFs3aPYJhcVIBxMsT1ZDl6fkuULMootfFEBwiFOM9vIr7ONQ7FlP9skoQKEQ6yv2Q4dOtQ0G/2NaOJQbHksTpJQAcIh1utsBw0aZJqN/n62sSy2jRs3Nk2yN0KyUAHCIdYPfOzfv79pNnhB9iNqZs2aFbNi27p1a9Nk8K7sA6JJBQiHw4cPN5KD16eLL77YNBv9YpuWlhazO8jat29vmgz+U/YB0aQChENBQcGJcvD6dO6555pmg2WyH1Ezc+bMmG2x2KVLF9Nk8LTsA6JJBQiH4uLiFDl4fWrVqpVplmLr0nnnnWeaDO6XfUA0qQDhIQevb4WFhZEvtjNmzBgbq2Lbq1cv02Rws+wDokkFCA85eH3bv3//30y7tWQ/omTq1Kl3yffty2WX");
    imageData.append("XWaaDK6UfUA0qQDhIQevb++99947pt0msh9RMnz48Pnyffti2jJNBpfIPiCaVIDwkIPXtylTpmSbdrvKfkRJmzZt9sr37cuECRNMk0Ef2QdEkwoQHrVr1y6WA9inwYMHm2YDuyxB9SUqYnW91po/f35JQLFNGipAeMRyFmalpqaaZoMLZT+iori4uLZ8zz69+eabh027PWU/EE0qQHiMGzduihzAvu3ZsyeyO3/ZGxrk+/Vp9+7dG0y7J8t+IJpUgPDYu3dvGzmAfZs+fXqh7EdUNGvWLFO+X19SUlKCgoKC12QfEF0qQHgUFhbWkYPYt9K1oT+TfQm7zMzM5g0aNDgs368v3bp1M80Gr8p+ILpUgPAoKiqqE8svdMp88cUXr8i+hN3s2bNHxfILx1tvvdU0G7wk+4HoUgHCw96y26FDh51yIPs2derUbab9drI/Yfbwww9PiOU/XM8++6xpNvi17AeiSwUIl1GjRs2WA9m3k08+OTCz6ktlX8LKrkJo0aJFhnyfPm3caPcMj/bdePg+FSBcHnnkkYfkQI6FOXPmbJV9Cavbb7/9qVjOahs2bGj3mSiQ/UC0qQDhMnPmzLtjWSjKNG/e3BaMPrI/YbNjx45O8r359otf/MI0HUyWfUG0qQDhsmXLlvPr1q1bIAd0LDzxxBNrTB/qyj6Fyd133z1Zvi/fzKcC03TQQ/YF0aYChEtJSUlK/fr1j8gBHQt2Rr1z5867ZJ/Cws5q69Wrly/fl0/mnNnd0zJN+3bncNUnRJcKED49evRYJwd1rLRt2zYoLi4+RfYp0eXm5jaM5VKvMqXrlO2jcFJknxBtKkD4mJlSOzmoY2nAgAGfmhn26bJfiaqgoKDe9ddfv1C+j1h48sknTReCBbJPiD4VIJxiefeTZC8nTJ482e6Z0Ej2KxHNmTNnhHwPsWBm0sHnn39uuhC0lX1C9KkA4XTHHXdMl4M71saMGfOOmeEmdMF98MEH/xiP1RvWoEGD");
    imageData.append("TBeCj2SfkBxUgHBatWrVdfFalVDGFrHx48cvNgU3IVco/PGPf3wwJSWlSPY7VlavXl1k+nGm7BeSgwoQXq1atTogB3is2YKbmpqakZOTkzC389o7xAYOHPhSvGa0Vvfu3QPzj5D9YuxE2T8kBxUgvBYvXjxaDvJ4adiwYW56evqTRUVFTWU/Y2np0qVD+vTp81Y8C6313HPPme4E02T/kDxUgHBr0qRJlhzo8dS0adOsPXv2dDVFt7Hsqy9mBllr165d7UeMGDEn3kXWOv3004O8vLxi07eYnQMkHhUg3GbOnHmvHOyJoFu3bp88//zzd8r+umb3+O3fv/9/mSJ/SPYhXv7xj3+YrgW3yL4iuagA4Xbw4MEzTz755K/kgE8Utgjax8+sXLlywGeffdbDzHhrdA3TFNe6a9eu/dlLL7008MYbb/xLPG5U+CF9+vSx12rXm77G9XIK4k8FCL9FixbdJQd9orEf7+11XfvQytTU1D3XXHPNC9u2bfuJfC+SKc4pGzduPGfw4MHL2rVrt7tt27b/a9cYJ8LlAsnemrt+va2zwWj5PpB8VIBoOOecczbKwR8WtnAei3xtIit9GsNn8m+D5KQCRMO6det+Hc81pcmuU6dOQVZWVn7Al2IopQJERt3rrrvudVkE4F/dunWDjz/+2PwJgnEBT2NAKRUgWjp37vypLAbw66mnnjKnPlgt/xZIbipAtOzZs6d3Ii2DirorrrjCrj5YFTCjhaACRM/ChQsflUUB7p1//vlBTk6OvU4bmYdhwh0VIJJq3X777StkcYA7Z599dvDNN9+YUx2cWsH5B05QAaKpuLi4zeDBg0O7HCyRdezYMdi3b98Rc56vlecdKKMCRFqtXr167ZPFAtXXuXPnYOfOnYXm3KZXcL6B76gA0WZmuC2vu+66tbJooOrsrbgZGRn2Gu198jwDkgqQFFLuvffe1bJ4oPJuvvnmID8//2tzLsdWcH4BRQVIGvUWL168XBYR");
    imageData.append("/LCUlJRgypQpdnnXLnMOz6ngvAIVUgGSy4YNG55q167dQVlUoNkVB+vXr88z580+3JJHkaNKVIDkU1hY2HXIkCH5YdvoJVbsbPbBBx8syc/Pt1+EXSjPH1AZKkDSqv+vf/3ribZt26pik8x69uxZts/BOwGPIEcNqABJr3ZaWtrHTZs2TahNuGOtW7duwcsvv1x2bfbyCs4TUCUqAIwTCwsLL0xPT99kiq4qRFF25plnBsuWLQuKi4s/NefhV0arCs4PUGUqAMrLy8u7a968eWs7dOgQ2ZlunTp1gquvvjp45ZVXgqKiou3mfU+U5wGoKRUAFbDPCTt13bp1H954441Bo0aNVMEKI3v31+TJk4Mvv/zSvL3gcHD0y69GFbx/oMZUABxHi/z8/PvMLPCDa6+9NmjVqpUqYomqdu3awQUXXBBMnDjRfulVYv57ybyf+40OFbxPwCkVAFXQwhSslzdv3rx/1qxZ2f379y9p1qyZKnLxYotrly5dAjsbX7JkSWFGRoa94+sL40GjbgXvB/BGBUA1dTIGG9dlZmbOfOONN/Y99thjJUOGDPm24DVo0EAVQ1fsU2zbtGnz7TKtESNGBE8//XTw/vvvlxw+fPgr058/GUOMfsHRyyGy30BMqABwrJ5xrZkB/zM7O/vtXbt2vf3RRx+9/eqrr747b968jY8//vjee+655/Do0aNLbrnllpKhQ4eW2C+r7BMPrrnmmmDYsGElI0eOLBk7dmzJ+PHjSyZMmFDy1FNPlfz9738v/Pjjjz/fv3//msLCwrdNG9YLwdEVBBRVJBwVADFSOzj6ZdRpxk+Ms4yzjW5G7+Do0w76GD8tzezPyutqnBJw2yxCQgWIlvfee6/X3Llzb5kzZ86IBQsWjHjllVduysnJsQVOvTbqioqK6qxcubLvM888c6tlzset77zzzrVmZswKBHinAkSD+Zjezz7osXbt2sXl9zyw/79OnTqFvXr1+sh8tE+KWWFxcXHt");
    imageData.append("G2+88S/169c/UnY+yqtXr17+bbfdttCcDzvbVr8PuKAChNu77757Ye/evd+WXyJVpEOHDjtXrFjhfePrI0eONJw4ceL9d95557Qy48aNm7Z8+fLRPgucKbIp6enpo0899dQvK7PJjv1HaPbs2VNNnxrKYwE1pQKEk/koXHfRokVDZQE5HluETEGaGni49rl79+72119//cIfKnT2Z2PGjPlLbm5uauDw8d9ZWVlNb7jhhudle5Vx9tlnF9pntsljAjWhAoSTncHZmZksHJVhC960adNWBA4Lrr1G3KhRo5wfKrTlNWvWLHPhwoXT5HGqIy8vr/6AAQP+Wdm2KzJw4MAdZobbWh67Or766qvOgcNzi3BSAcLn7bff7l2TwmLZ31+1atXT8tjVsWDBgpuq25+JEyf+lzlGc3nMqpg0adK91W2/vNmzZy8zx6sjj19Z2dnZJ7Vu3Xq/7Yv538I9e/ZcVJPjIdxUgHA5ePDgSY0bN86WhaI6mjRpUnTkyJE+so2quPvuuyfXpNDZL7DMrHiePG5lmVnkydWd4Uv2faxfv362bKOy0tLSfm/fT9nxTjzxxLxBgwa9L1+H5KAChIf5mFtr5MiRf65JcZMuueSS4uDoGlbV3vGYwtTdXjqQx6yODz/80O5ZUKVruOYfnuZnnHHGNnmsmmjXrl1eUVHRBbKtyjjW9erOnTtvX7JkyV3B0bXG6vcQTSpAeJiPqY3lQHZh69atVb52WlBQULeiwlJdZhZYnJGRcb1s54c8//zzN8jjuDB58uQC2dbxVOZ8NG/e/JsdO3b8LKDoJgUVIDxOO+20L+QAdqFXr172oYZNZHs/xM6w5XFqql+/fnZvg0pf4zSz0N3yGC7YzXXy8vKq9Mjy7t27r5fHqYgtyIMGDfrn7t27e8pjIFpUgHBYvnz5VXLguvSe+U+2eSxbtmzp4uq6sbRixYoPg0pcTnj99dcvlb/r0rx581YFldxzYdWqVRcdb1Zbkd69");
    imageData.append("e2/6+uuv7a3J6pgIPxUg8dlrtaNGjZotB6tLPXv2LDFtnSfbrshVV121XP6+Kx06dDhcWFjYX7Ypub5WK7Vo0SLP9MPu06DaLs/+bcaOHTujOsXWMu83x7QzSh4X4acCJL5vvvmmeYMGDQ7Lgerapk2b5gbHuZ64Zs2aC+TvufbCCy8skO2WZybh59tbk+XvuTZ37tzNsm1p//79revWrVsgf7ey7JMjzH/vyuMi/FSAxHfLLbfMlYPUh379+uWb9o65sN/eavvLX/7yFfl7rtWvX98+VaGxbL+MXWJV3ZlkVfzoRz+yT9sdKtsvryZF38yeg6ysLHOYb3czU8dGuKkAic3elhuLwlLmiy++SJd9KPP+++/3tJu4yN/x4YEHHtgbHONLO1/Xiyvy1ltvrQ6OcTeYvYtPvr4qHn30UXOY4JjnG+GmAiS26dOn3yEHqU833XSTaTZoIPth3X///RPl632xs9vs7Oxxsg/2bjH5Wp8uvfRS+2BIu9/u9/px+PDhRueff/578vWVddJJJwWHDh3KCI7u36vONcJPBUhc9mP78OHD58uB6pOZudqPto/LvlixmtWWMTO/HbIPrVq1OiBf55P9VLF///47ZT82b97ctSafOB566CFzmMCueFDnGdGgAiSuL7/8so3dsEUOVN/mz5//34F4xPdzzz03rCbFpTrM7Naud7WPvfm2Dz6XnP2Q3/72t+omh9TU1D3ydZVl1/FmZmba1R/HvC6N8FMBEtf27ds7y4EaC61bty42s+qO5fty0UUXrZKvi4Xx48cfKuuDvUZafu+BWDnxxBOD4uLiH5X1Y/Xq1b1q8g9P6bXaSfLvjWhRARLXxRdfvFIO1Fh58cUXPyjrh5lhn9qlS5ct8jWx0KhRoyIzu7VPyj3h9ttvf6q6Ra5p06Yqq4olS5a8Yvtg19XWZHVIy5Ytg+zs7H3mWOfIvzeiRQVIXHKgVpZ9lLh9cm11C5PVtavdm+boHVR2bW11");
    imageData.append("P77bx42b2Wi1+2ENHDjwwDXXXPNCdd9P7969SxYsWFBY3d+3zjjjjK+2bdt2nv2Hp1OnTjvkzytrypQp9rzabSXV3xvRogIkpqVLlw6RA7WyJk2aFOzbty/tD3/4w3T5s6rYvHnzTPs8L/sAyeoWqg8++CD3ySef/HuTJk2y5M9i5bnnnssqKiq63PTlQvtcMvnzyrJfztVkP4ZTTjklyM3NtWuZ7ePe1d8c0aICJCa7XZ8crJW1ZcsWu21iPft02ZoUF1sghw4duqi6d6+dc8459qaARUYdM6MbV92CXRP2S7ZDhw7tMeejljkf9fr16/eqfE2szJgxw34pdqv8WyOaVIDEY3f8v/DCC9+Vg7UyOnbsaAvchrJj2euc8jWxMnu23Yc7+LXth/n43alNmzZ75Wt8+81vfmP78FHZ+bjnnnumyNfEwmmnnWZXVnxm+vBj+fdGNKkAiWfr1q1nVvfpA6a4mkMEA8uOtX379nOre6yaaNiwYXDw4EE7k/tuy8Ru3bp9Il/n22uvvWbPR6+yPqxfv/5y+ZpYmDNnju2HfdCm+nsjmlSAxFOTzV5WrlxpC9z5ZccyH50b9O3b9w35Ot9uvvlm03ywpfz7MoXuF/J1PtnZpHn/9nyUP7+1Yr187Kc//antR1FQhb16EX4qQOLp0aPHOjlgK8PeAlpYWLjNHMM+Jvy745mP8/fL1/r2/vv20VtBJ/ne7AMR5Wt9GT9+vO3Ds7IP5pNDj1hdPzaFPTD/yNiC/93NGUgOKkBisd/+ywFbWUOGDDGHCF6Wx7Rqsg1gVZV+MbY/qOAOKVOEr4zFzNIU0+Df//63vfPr22vGQq3KPlmhpu644w7TXLAyEHfkIfpUgMRil1nJAVtZCxcuNIcI0uQxS487Sr7el/R0u5FVYBeUqn6YT9Mtunbt6v0Giauvvtr2wc7yK1xm9be//e0O37Pb1NTUsi0U+8j2EX0qQGK58sorX5SDtjLsx9Wvv/7aHCJo");
    imageData.append("Ko9pZWZmnh6Lta72vv9Dh+wdtkF32Ycy27Zt6yN/z7WjT/kJ1K5hZczMu67PfSfq1KkTrFmzxl6n/b1sG8lBBUgcpiC2rO712p///OfmEMHn8pjlpIwcOXKp/D3XHn74YdsPezuqbP97Bg0a9P/k77pywQX2SeSBvXlAtVveZ599dq78XVdmzpxp+/BicIyZNaJPBUgcNdngpPQ20D7ymOXt3r27r/w9lxo3bhxkZGQUmrZayLal/fv3/0eLFi0y5DFcWL58uf1CaoRssyLmk4TzlRp2ba+ZOR8wxz9JtofkoQIkjsGDBy+TA7eySu8aO0seUxo6dOh/y991pfTb/2myzWP53e9+t0Ieo6Z69+5tC52d4X9v17Jj2bt3b/+a3GUndevWLcjJybHFvr1sC8lFBUgcM2bMWGK385MD+Hh+/OMf2wKzLqjEjDI/P795x44d/y2PUVP2JoYDBw7Yj+7f3UBQCbXMzNLZM83q1q1r/9Exhw1uqaCtY1q7dq2TZ5rZ9bRmZm/bv1a2geSjAiSUlrm5uf+5dOnS3X379rW7VKkBXZExY8aYXw0WV3C8Ci1cuPBReYyamj59uu3Dx7Kt48nMzDyrefPm38jjVccTTzxhZ5QrZBuVsWrVqjtrcqfd5ZdfbrdOtN8MXiaPjeSkAiQkuz71YvNxdNicOXM+Peuss9TgLu/11183Lw/sNzLyOBUys+D6Xbt23SePU112G8WioiK7FKKhbKsydu7ceYk8ZlXZZ6eZ92WntW3k8SupgZnhPmAfCySP/UPsbNr+Q1NcXHwkYI9alKMChEJD+9TbSZMm7UxNTf3ex137pVReXp55SdWuEZri2Ngcq8YF1z6Oe/v27bYDV8k2qmLDhg0jq3vt9IorrggKCgp2Bg4enmhm2qNGjBiRlZKSotopz25GPnbsWPve7fKuSn+qQPJQAUKlpZm99XvzzTfzhg8f/u2AL128b2eV8rXHtXXr1j/IIlIVdvvCNWvW");
    imageData.append("2PYfM2rJ41dRysaNG2e0bt1atXMs9jrx008/bWe0GwN3u2nZ93GaKbqL//SnP5UMGDAgsJ8s2rZtG3Tv3j0YNmxYsGDBAnvJwF6y+MToELDnASqgAoTWJWY292RGRobdx/C0Cn5eKR9++OHjpmhW+fZZW+hXrFhhC84/5DFrwrynqxctWrTWbiIj2yxjb+Do16+fvR3X3p5lt9PydSusXSNr92icHBxdZWHZNXY3lP5Mvh74jgqAAwcOjO7du3elH1Pet29fW+jsx+dqfRlVSaesX79+12OPPVZgH/EzePDgYNy4ccHcuXPto8XtqoedQelje4BEpAKgVLdPPvnkmV/96leFFV2vtEvS7CWLlSvtnirBpuA4N1A4ZL90uik4upzLGhZUsJsYkGhUAEjZ2dkz3nnnnU1//vOfDxnFb7zxRkFWVtan5mfvGj3l6wFoKgCOwX7pYx+x+zOjR1CJGyYA/B8VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwD0VAADcUwEAwL3/DyIT9Cr34tg7AAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagef08b6180839507b1f7c7abfa8b7ed998 = new WeakReference<>(result);
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
BufferedImage imagef08b6180839507b1f7c7abfa8b7ed998=getImagef08b6180839507b1f7c7abfa8b7ed998();
if (imagef08b6180839507b1f7c7abfa8b7ed998 != null) {
    g.drawImage(imagef08b6180839507b1f7c7abfa8b7ed998, 0, 0, null);
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
		return 347.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 324.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private wave_underline4() {
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
       wave_underline4 base = new wave_underline4();
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
       wave_underline4 base = new wave_underline4();
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
        return wave_underline4::new;
    }
}

