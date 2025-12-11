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
public class selection_pane3 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image1a7cdbfadba717676be8f600190c203d;
private static BufferedImage getImage1a7cdbfadba717676be8f600190c203d() {
    BufferedImage result = (image1a7cdbfadba717676be8f600190c203d != null)
        ? image1a7cdbfadba717676be8f600190c203d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(19420);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIVCAYAAACnY0fSAAA4rElEQVR4Xu3dCZRdRb3v8YR5MoRB9F4RCCgIyBhRmSEzKkiGhiTQnRCgE5J0JpJ0Zk46Y6czD5AmxIQw2rreul4cQUUcLqj3qdcZ9N6rTDL7BEP67H3OqfevZlD+Z9N0smt3733q+1nrt3Al3bt2Ve2u+p+TOm23bgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIP1yZq9uF5je3c4zk7qda5bJf7dIdmQkW96857q2Pti+AEBXu8AcI+tStSQna9TGiLUrnTnfbJf7XS3/nS3/HST/fZ/uGirBJWYfmfBayTMSUyGxfbmxrW8A0NnON5+WNeiRiLUpq8lLIbBB/nuU7iqy6lPmA93PMz+SmArNj2wfdbcBIBlmr73ONUtl7SlFrEeVkJelEOire42s+ZQ5uvv55s8SU+H5s+2r7j4AuGW673WeuTdiDaq0hN3ON1fp3iMrepuDZBL/M2JiKzX/KVXrgXoYAMCVvS4wuYi1p1LzuhQBn9BjgAzw7EFtizysC/Q4AIAT55rTZJ0p6HWnonOB+aX9Jw89FEizC8379zrfvCYxnuXVbpeYI/VwAEBc3c8zD0SsORWfvc8z1+qxQIrJpI3b6wKZPA+z9wWmVo8HAMRynjlK1peCXm98SPcLzEN6OJBiMmFf1ZPoS6TvD+jxAIA49r7QjNZrjUcJun3K9NBjgpSSV8H/LbGvhv3LheYPejwAII59LjDLy9Yaj7LveeZMPSZIKZmwnXoCPcpOPR4AEIesK3dGrDX+5HzzGT0mSKmyyfMsejwAIA5ZV1r0OuNZqvSYIKX2vtDYt8K9jR4PAIhj74ukAIhYa7wJBUB27CMT5nP0eABAHPtKAaDXGZ9CAZAhevJ8ix4PAIiDAoACIDP05PkWPR4AEAcFAAVAZsjDanyOHg8AiEPWlRa9zviU/S6mAMgMPXm+RY8HAMSxLwUABUBW");
    imageData.append("6MnzLXo8ACCOfSkAKACyQk+eb9HjAQBx7EsBQAGQFfvZCfM4ejwAIA5ZV1r0OuNVKACyQybLTpjbXGT+bb9LzHKnsdfU7TiIHo/M6mcO3f8iM0Aq8FHSr5kyXvVZyL4Xm/Fy31fs38ecoLuE3cD8p4aMf4teZxzkd2VroouUt+MiFABZETF5LuL8AbDXjGgndnQ7WXPARaaPLKTflL7kdd8ymF/JZjC526lmP91PRGP+02e/ZAqAFt2OCxHtuIjz9R8J2V8mzHWSeADsNXU7LqLbyYxzzeFy//+u+1Mh+Z8DLzXn6y7jnzD/qXWAbNYRfYoVe03djgu6HRdJYv1HQvTkuUgSDwAFwD/Yt0vl3v+g+1JhaZVXttfovoP5TzsKAPfrPxKiJ89FkngAKADe9CnTQ+7717ofFZrQvsWth8BrzH/qUQC4X/+RkP0vkUlznP0SeADsNXU7LqLbSbsDLjX36j5UeF7odonpqcfBV8x/+skctUT0I1bsNXU7Luh2XGS/BNZ/JOQAmTDXOTCBB8BeU7fjIrqdNDvoYnOO3HNJ98GDLNNj4SPmPxvsZh3Rh3hJqAAoa8dBklj/kRA9eS6SxANAAdC2sOzQ9+9FLjZ/61aV7ZPhLjD/2UAB4H79R0L05LlIEg+A9wXAJWYfud9X9P37kv37mAF6SLzC/Gdm/ikA3K//SMiBl8qEuU4f9w+AvWZZOw6i20mr/S4yJ+t79ymyAM7XY+IT5j878y/326Lv30ESKQAi2omfBNZ/JKRs8lwkgQfA9wJAKut++t59imwAm/WY+IT5z878H0gB4Hz9R0LKJs9FEngAfC8ADrrEfE7fu0856FJzpx4TnzD/2Zn/AykAnK//SEjZ5LlIAg+A9wXApaa3vnevkrGT4K4x/9mZ/wMpAJyv/0iILCy2unaaJB4Ae03djovodtLq0AvMYXK/BX3/HmWMHhOfMP/Zmf+DZbOOuP9YsdfU7big23GRJNZ/JOSgPjJp");
    imageData.append("jpPEA9BWAES0FTe6nTQ7uI95RN+/JykefIn5oB4P3zD/2SDz1BLRh1ix19TtuKDbcZEk1n8kRE+eiyTxAFAAtM3Vjfr+PcmDeix8dBDznwkUAO7XfyRET56LJPEAUAB0a/ssuNzzb3UfKjylgy4xn9BD4SXmPxMoANyv/0iIPFj24XKaQxJ4AOw1dTsuottJu0MuNRfLfQe6HxWc1XoMfMb8p5/cc0tEP+ImkQIgop3YSWL9R0L05LlIEg8ABcA/SJV9o9x7SfelAvO1blVmb91/3zH/6XYwBYDz9R8JObivTJrjJPEAtBUAEW3FjW4nKw7pZ4bK/f9d96dSckhf05yl3//e2Zj/9Dq4nxQAEX2KlX4JFQC6HQdJYv1HQg6xE+Y6CTwA9ppl7TiIbidLDu1njpeN4F7pR0n3K8P5pbzCvUz3FeWY/3SSOWmJ6Fe8JFQAlLXjIgms/0hI2eS5yQS7OLmMvWZEO7GjxyOLDuhjjpUFok768yXJjyR/lPx3RvIzedXwwMF9zLIe/cynu+XMXrp/aB/zny5JFADv62u+rtdEF9HtOAkFQHYc0rdkfI4eDwCI45B+pRa9zngVCoDskIfV+Bw9HgAQxyG2AIhYa7xJfwqAzHifTJjP0eMBAHH0kAJArzM+hQIgQ/Tk+RY9HgAQBwUABUBm6MnzLXo8ACAOCgAKgMyQh9X4HD0eABCHrCstep3xKYdSAGRHj/4yaR5HjwcAxCHrSoteZ3wKBUCG6MnzLXo8ACCOHhQAFABZoSfPt+jxAIA4elAAUABkxaFtE+Zv9HgAQByyrrTodcavUABkhkxYoXwCvUlBjwcAxHFo/+J9EWuNN+nZzwzRY4KU6jmg9OyhA2Ti/MzTejwAII6eA4rrItYab/K+AeY8PSZIKSkAfiwxPkYe1kf1eABAHIcOMDP0WuNTDh9gPqzHBCl16IDiUj2B/qS4SI8HAMTRs585q3yt8SZP6PFAikm12jtiEr3IoQPN");
    imageData.append("2Xo8ACAe013Wl//W640PkReUy/RoIOUOHVD6Ws+BMoF+5QE9DgDgQs9BZnTEmlPpee3gvuYDeiyQcocPNKceNrC0U2I8yc4j+pmT9TgAgBNVZm9ZZx6LWHsqNocPMNP1MCAjpAgYKpNY0pNagSkdNsgM1/0HAJeOHGj+RdabpyLWoIqLvPr/sv2nDz0GyJCeA02NTGarntwKyi7pY7XuNwAk4chB5iTZHB+PWIsqJwOKdx13iTlA9x0ZdMRA88nDB5Z+LDEVlseOGGTO0f0FgCQd+llz2OEDinfIGlSIWJcymyMGll44bKAZp/uLzDPdpXK94ohBxbsPH1R6WWIympdtH2xfeHsKQFc6/DJzyuGDiitkXfp9xFqVlQSHDSp99/CBZrL0p4fuIyqQnWj78B45wPTOQtp+0Hg4AaTVZWb/noPMcXrtSmt6DjRnvP8z5oO8kAIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAwAfHjTYHHHu56WVj/7f+ewDAbsiZvY4dYv7lQ4PNicddaXrqvwa61DFDzakfHlxsOmZI6Q/HDC4ZlSeOGVxccexgc7L+PgBAuY9cZnocM8RMOXZw6XuyhhbUmvrXD19ZvOfDQ8wV3bqZ7vp7gU5xdJU5XDb+rREPaFTka4pbqGAB4N2Y7vJiaYKsly9GrKFR+bEUAufoqwCJOm6o+dhx8upeKlSzm3m81xXmJH09APBZ2z+fyiv7iDXzvbLrmCGmWl8PSIT996hjh5Sekpg9zLMfGmKO1tcFAD/JK/8hxfsi1sqOpnTcYDNcXxVwq8rsfcyQ0o8jHsDdzWP2cIu+PAD45rihZlbEGrm72XlMlTlFXxtw5tihZsxx8rA5yVAz");
    imageData.append("Sl8fAHxywmBzlKyHr5atj3uQXkNKX9XXBxwx3eUh+x/90MXIH3ULAOCT44YUGyPWxj3OsUPM2boNILZjqkzv44bKQ+YyVeZM3Q4A+ELWwSfK1sUY6TW0uFi3AcTWa6iZoR+2uJFq9WbdDgD4oNcQc6xeEx3kMd0OEFuvYcX1vYbaCtNdjh9aXKvbAQAf9BpmLtRrYuwMKz2j2wFiO35I8b6yhy1m7DV1OwDgg+OHmSF6TXSQgm4HiE0erJaIhy1uWnQ7AOCDXsNMVcSaGDu6HSC2E4aVWo4fJq/aHcZeU7cDAD6wBYBeE11EtwPERgEAAO5QACAzKAAAwB0KAGQGBQAAuEMBgMw44apSywlVsmm7zFUUAAD89BEpAMrWRAfR7QCxUQAAgDsUAMgMCgAAcIcCAJnxEdmsPyIPl9NQAADwlC0AytZEB9HtALFRAACAOxQAyIy2AuCqonEbCgAAfvrI1YWq8jUxfnQ7QGwUAADgDgUAMuNE2aw/Kg+Xy9hr6nYAwAe2ANBroovodoDYKAAAwB0KAGQGBQAAuEMBgMw48epSy4lXy6btNBQAAPx0khQA5Wti/Oh2gNgoAADAHQoAZAYFAAC4QwGAzKAAAAB3KACQGSeNKLWcNLxonGYEBQAAP9kCoGxNdBDdDhAbBQAAuEMBgMygAAAAdygAkBkUAADgDgUAMuNk2aw/Jg+Xy9hr6nYAwAe2ANBroovodoDY2gqAEfKAOQwFAABfnTRSCoCIdTFudDtAbBQAAOAOBQAyw27WJ4+wm7bLUAAA8NMpUgCUr4nxo9sBYqMAAAB3KACQGRQAAOAOBQAy4+SRUgCMlAfMaSgAAPiprQAoWxPjR7cDxHaKbNanyMPlNhQAAPxkC4DyNTF+dDtAbBQAAOAOBQAygwIAANyhAEBmfPzaUsup1xSNy9hr6nYAwAe2ANBroovodoDYKAAAwB0KAGQGBQAAuEMBgMygAAAAdygAkBl2s/64PFxOQwEA");
    imageData.append("wFOnSQFQtiY6iG4HiK2tALhWHjCnoQAA4KfTqqUAKFsT40e3A8RGAQAA7lAAIDNOk836NHm43IYCAICfbAFQvibGj24HiI0CAADcoQBAZsiDtV0/aA6yXbcDAD74+LWFz0asiXGzU7cDxHZadXGZxLjMx6uLi3U7AOCDM2rMWXpNdJDHdTtAbKfXFEadLg+Yy5xRXajW7QCADz51jekh62Cg18VYqSl9RbcDxPaxGnOEPGBh2QO35yn0HmGO1O0AgC9Ory49FLE27nmuLdyg2wCcsNVl2QO3xyn9m74+APjkjJrCteVr457ltOri3+wLNd0G4MRpo83HzqgphhITM4UzRplT9fUBwCs5s5eshz+LWCN3O2dWF+fqywNOnVFdXKAfvD3IfH1dAPDRaaNMb1kTd0askx1PdeEnx402B+hrA46Z7lIE3F32AHY08r32GvqqAOCr02sKw2R9DMrWy47lf8+oMR/S1wQS0lYELJIHrxTxML5bSvZ72PwBoNzp1WGf02uKL0Wsne+eUYXvn15tjtLXAhInVecnz6wuPXymPIjtRr7Gfq3+fgDAP5x1nXm/bOzrZd3Ml62j78xTZ1UXrq+qMnvrawCdqvcoc8IZo4pTzxxd3H7W6NI3bez/tn9m/05/PQDg3fWuNYeeNbowXNbRTWeOKn1F8l1ZT+87c1Rx6VmjzEVs/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH1RVmb0vqTNHXzoh+JRNn3HmQ/bP9NcBADrmklpzZL+J+dP61oUX");
    imageData.append("9p1gTjx3qjlQfw3QZeyDeenEwvY+dYWXJEblRcm2SyeG5+vvAwCU6z/R/OuldeGSPnXhbyLW1KDPpMKDfScWru9da/bV3wt0ij5TzYfkYfz3iAc0Mn3rCv9mH2x9HQDAG++i9pkU5mS93KnXz+iET/SdEPbX1wES1XdycI5s6M/0fWNj73gmFp7uPzH4hL4eAPjssjrTQ9bIb5Stme+dQr+Jxan6ekAiBkw0veShezHiQexoXu4/yXxUXxcAfGRf+febWPhaxFrZ4fSZWBynrws4VZUz+/WtC3+jH77dT/HX/PsVAHTr1ndiuLR8jdztBLy7ikTJxj2p36SCcZH+k4oT9PUBwCd9JphjZT1s1evjnqTvpMIj+vqAE7mc2Usesmf0Q7en6T+p8FS3bqa7bgcAfNF/crhOr41x0mdSeJ5uA4it75TwXP2wxU2fuuCTuh0A8IPp3q+u8KReF+MlbNKtALH1m1ycVf6wxUv/umK9bgcAfNCnzpyg18TYmVz4qW4HiK3/pMLG/pNl03aYAVMK63U7AOCD/nXhxXpNjJsBkwt/0e0AsUlleb9+2OLGXlO3AwA+kPVvqF4THaSo2wFikwerJeJhi5sW3Q4A+EDWv6qINTF2dDtAbANlsx4wue0tJmex19TtAIAPZLOu0muii+h2gNgoAADAHQoAZMbAqVIATCnYg3vOYq+p2wEAH7QVABHrYtzodoDYKAAAwB0KAGSG3awHysPlNBQAADw1SAqAsjXRQXQ7QGwUAADgDgUAMoMCAADcoQBAZgySzVpiHIcCAICXBk0rVEWsibGj2wFiG0QBAADOUAAgMwZRAACAMxQAyIxBFAAA4AwFADLjM9MKLZdNKxiXsdfU7QCAD2wBoNdEF9HtALFRAACAOxQAyAwKAABwhwIAmWE3a4ndtF2GAgCAlz4rBUDEmhg7uh0gts9QAACAMxQAyIzPTJcC4GZ5wFxmOgUAAD+1FQB6TXQQ3Q4QGwUAALhD");
    imageData.append("AYDM+Kxs1p+Vh8tpKAAAeMoWAGVrooPodoDYKAAAwB0KAGQGBQAAuEMBgMy4XDbrz00vGJex19TtAIAPPjujUKXXRBfR7QCxUQAAgDsUAMgMCgAAcIcCAJlBAQAA7lAAIDMun1FokRjHoQAA4KUrpACIWBNjR7cDxHY5BQAAOEMBgMy4nAIAAJyhAEBmXE4BAADOUAAgM+RhbZEYx6EAAOAlWf+qItbE2NHtALFdUS8FwEx5wFymngIAQLlczuz1uenhuZfPLE6RTW2jrBfNn58ZLpf/PebyenOM/vosusIWAHpNdBDdDhAbBQCApF1WZ/Zv2/RnFp4sWy/eme9ePiMcoL8/SygAkBlXymb9eXm4XMZeU7cDwE+DZ5qTP18f/kavE+3lypmFBwfXB2foa2WBLQB0f1xEtwPERgEAIClXzgw+KWvC/9NrRAdTlHzhc1PNh/R104wCAJlBAQAgCUNuNsfKevCKXh/2IDuvmBk2VOXMIbqNNKIAQGa0FQD18oA5DAUAAFkLHtZrQ8z85cpZxdqqKrO3bitNrpglBUD5vceObgeIzW7WErtpuwwFAOAxWQMui1gXnOTz9eHvBssmq9tMC3tv+p5dRLcDxHYlBQAAx66cVXggYl1wnW9fMSs4S7fd1SgAkBlXUgAAcKhqqjnw8/WFXRHrQhIpSrZ9bm56DgpSACAz5GFtkRjHoQAAPDVkTnB2xJqQdHYOnhUuvyxneuj76WxyL1UR9xc7uh0gtsEUAAAcklf/l0esCZ2V54bUF8dekjP76PvqLIMpAJAVQ2YVtukHLXbqC1/Q7QDww5DZhSvK1oROT/ibobMLn9H31hmurC9cVn4/sfOabgeIbfDscEnEwxYrV84KG3Q7APwwZFZwjl4TujDfGdrJBwXtbzCMuI+YCX+n2wFiGzqrMGKIPGAuM7i+MFy3A8AP9hf2yDoQ6HWhC1OUTXT7kJnmaH2vSaiebg6WNndF3EecfFm3A8RWVW8O");
    imageData.append("HTK7kJcYRwmuzJmeuh0A/hg8u/CtiLWhq/P60Dnhcrvm6ft1Tdr6WkT7cVKt2wCckIfrvogHbo8iP/j36usD8MvgOYUavTakKC8NnVOcnORBQVkHh0S0u6d5qTOKFniqap7pNXR2oVViYiZ/5Txzgr4+AL/Y3wUg68HLEWtEejIr/P2wBH+j4NBZhR+VtbkHGTK7OEVfG3Bq6OziJP3g7XZmFSfq6wLw09DZ4bqyNSKFGTa78B37uwv0/cclL6xOkuv/Vbe3m/l+Vc7sp68NOBfnB1Z+iNbr6wHw1+CZ5mRZG0p6rUhpSkPnFFqunGWO0/2IY9iscIBce2dEex1I8deDZ5sj9DWBxNh/G5MfhEBiOpjAfo++DgDI+vDDiDUjzXF+ULBqVtBbrvtkRFvvmmFzCl+5JgW/1RAeunq2OVEewC9JCsPeeBijYv+uxX6t/n4AsGSNqIlYO7KQl6ocHhS0Hw0cNqc4X67714i2/pHZxV8Om1v4vP5+oNPZt5+qZheqh80JVw6bXbi7LXPDJvtnvDUF4L3Yw4Cysb1cttFlJuHvZUN2dlCwttbsO3Re2E+um5Prb5V8UbK+am5xWtVsc4r+egAAMmvY7HCdbHh2M81uZoeJHBQEAKBiXT0vf3LV3LAkMRlP6aq5YUvVvF29dB8BAECEqnnhDyM21KwmP2xuuM7lQUEAACrSsDmFmoiNNOt56ao5YT2f0wcA4F3Yw4CyYb4csYlWQpweFAQAoKJcPSdce5VsmBWbeeF/VM0Oz9X9BgDAa/YwoGySJYndLCs1pavmc1AQAIB3kA3yBxGbZiUmL4UABwUBALCq5haqIzbLSs5LEg4KAgD8NjpnDrh6XviyxHiV+eHjV3NQEADgM9kQ15ZtkJ5k+LzwP4bPDc/TYwIAQMUbkct/TF4RlyT2lbGPsX3noCAAwD/D54ffl5iEUor4szTm9RHzw2UcFAQAeGP4gkJ1xIboKMEXhy8Il8v/3lX+d6nM");
    imageData.append("S8M5KAgA8IE9DCgb38sRm6GLvHZNzvQYPtd8ePi8YMfw7Lwj8PjVCzgoCACocCMWhGvllbpJJPOD2rfauXp+cI609UjZ16Q3jw7PcVAQAFCh7GFA2ZhLEpNAfq7bG5kL+8mf/zria9MYOy4t1RwUBABUItnkfhCx+TnJyPlBb91eba3ZV/68Vv7+ef31KU1+5C3hutE501P3BQCAzLKHASM2PScZfkuhWbf3lqqcOWTkgjAnX7dLf19K87Lcb/1ldWZ/3RcAADLHHgYc+cbmZhJI22FA3eY/swcFR0qhIF9bjPj+NObxkRwUBABUghG3hGtG3iKbWxLJ/eMwYHuG54JPjMyF3yv7/vSGg4IAgGyzhwFl8y1FbHKxMyIX/kK31x57UFDya32dVMaOWS5sGZlrPV73AwCATJCN+vtlG5yrRBwGbE/bQcFcUCvf+3zZtdIZDgoCALLpmlzh2mtkM0si17ZzGLA99qDgtbkwJ9fYpa+Z0nBQEACQLXbTkg3sxYhNzUXe8zBge+xBQVtEyHWKEddOX3LhE28cFDTddV8AAEgd2bjWSOwG5jwdPQzYnupc8Ilrc+H39LVTnEevaQjP1/0AACBV7GFA2WBLEpNAduswYHtqcmE/ud6vItpIY+x4clAQAJBusll9P2ITc5KRDbt3GLA9tc1m3+pcUCvXfU63k9Lkr8lxUBAAkFL2MGDE5uUoe3YYsD1vHRSUvF7eXvpSnQtfvnZhWF+3noOCAIAUsRuTbFAvSkwCiXUYsD1y3aNtgSFtFCPaTWOeqF5YqOpmOCgIAEgJeZW6plo2qSRSszAYq9tzaVRD0Lu6IXxYt5viPDaKg4KV4bql5v32pKpUdpfb6i4judzes7133R8A/hmdy39MNqZSxGblIs4OA7bHHhSUtn4V0X4aY8eag4JZVJszB8nk3Sz5yZsTqSc3K7H3bvtws+2T7icAf8g68P2INcJN5AWHbi8Jl+TMPtUNQa20+VzZPaQz");
    imageData.append("+WoOCmaHfQVdszB8RmIqLM/U5ArDdH8B+KGmoXBtxLrgKIXbdXtJsgcFpd2c5PXye0llXq7hoGC6yQQ11DSEJYmp0JRsH3W/AVQ+u/nIGvBCxLrgIokdBmyPPShY3VBolvaLEfeUxnBQMI2qG8KZEZNVkRnVEE7X/QdQ+aoXhqv1euAsi5I9DNietw4Klt1TevNYzeLwAt0PdIFrG8ILa7JTQbpIgYcP8I89DFiT3LucnXIYsD01i8J+kl9F3Fta88CoRa0n6H6gsxjTfdTC8FF5VWxfGfuTheGPeRsK8I/87D9Sth44SvXizjkM2B57UHBUQ1Ar9/Ocvr+UJhjVUGgekTNH6r4gYdctCvuMWiST4GFGLwov0eMBoLKNWly4Rq8FrlKzqHMPA7anuskcLGtcTu7rdX2fKc3LNYs4KNip5IdhQ8REeBH54VirxwNAZbMbjPz8v6DXA0fpksOA7bEHBWWdb5Z7K0Tcb+pSsyj406iGQg3v0HYCGfCf6wnwKD/T4wGg8snP/uqI9cBJuvIwYHuuWxKcPWpx+F19v2mNvEDjoGDSZKBfHP3GYPuY5/V4AKh8Yxa1niQ//6WINcFFuvwwYHvGLAr7yT3+MuK+UxnZozgomJTRyf0QZCFFPR4A/CA//49ErAlOMiYFhwHbk3vzoKDc61/0vac0wXWLC838enfHRi+WwfU4ejwA+MEeBtTrgbuk5zBge946KCj3/Hp5H1KZV0Yv4aCgM9fJoPocPR4A/GA3EVkDXtBrgqOk7jBge2oWmw+1vcJeHBYi+pK+LAr+PGYJBwVjKxtYz6LHA4A/rlsSrtZrgquMWRyM0+2l3aiG/Kly71/TfUlrRi8Ofzx6aXih7gc6SA+ob9HjAcAf9jCgrAMlvS44SqoPA7bHHhSU+/9lRJ/SGg4K7omIgfQqejwA+EVeRT6i1wVXGd0QnKPby4pczuxl32aXfvxF9yul4aDg7hqzJDQ+R48HAL+MWVy4Rq8L");
    imageData.append("zpKRw4DtsQcFr18S1kt/XivrXzrzir1fDgp2QMTgeRU9HgD8YjcKWQte0GuDo2TqMGB77EHBMUsKzdKnQkQ/U5frlnBQ8D3pQfMtejwA+GfM0nCVXhucJYOHAdtz3dL8KdcvDr9W1s/0hoOC7+Z6GSCfo8cDgH/sYUBZD0p6fXCSDB8GbI89KCj9+6+y/qY0YxaHD9RyUPCdrl8qg+Nx9HgA8NMNS8Pv6fXBVW5clt3DgO1566Cg9PEvus8pTWD/GYODgm+KGKD4WVao0u3EZa9Z1o6D6HYyx5juUt32vX5pYYP05xeS53QfU56/j1ka/k768GW7kFTKv5d2mgqZf8mXpA/VYxrN+3QXO8v1SwojI+7PTZYUtuj2KknbQcFlYb309dWyvqczr9j7HZ0zB+i+eCViYOKHAqBTXLc0vFj68FPdp0xnSfji9UuCyfZ3lev+4p0qcv6X2sN4QV1Vi9lb9zdpVTmzn20/4p5c5O8+FLdvHRSU/hYixiCF8fyg4A0yCK6TVAGg23ER3U5W3CibpNx/UfengvLgTcvMYbrfeEOlz/+NS8NvdcX8y6awSt+Lq9y4rLIOA7bHHhS8cVn4VT0GKc5PbvDxoGDEQMQOBUCy5L6X6H5UaH5u31rU/ffdDf7M/886e/7tYUBptxRxLy7yX7q9SidFQD/b74ixSGseuH5Z60d0PyrWDcuk046TWAEQ0Vbc6HbS7oZlhavlvku6HxWb5eGX9Bj4zLf5lw2kRY9B0qTd7+n7cJVKPQzYHntQ8IblhRrp/7N6PFKaQH7O/DgoKD9g9ofMaWoTKADsNXU7LqLbSbPxOXOIPJx/0X2o+CwPB+qx8JGv81+7LBygxyJJtcsLI/U9uIpsLBV9GLA99t0cGYN6yat6XFKaV26s9IOCEZ2OHQqAZNQuDWfq+/chNywNf6rHwke+zr/kJ3oskmQPA0qbL0Tch4v8vc6Dw4DtGdNo/lXW82YZi0LE+KQwwZ/tOxgV");
    imageData.append("eVCwvLPxQwGQDHkl9DN9/75k7IrWj+rx8I3P8z9mWevxejySdOPycJW+B1epXR7cpNvz0dg3Dwrq8UlxfjJ2eXiR7kemRXQydigA3LthifmA3G9J378vuWF5MEGPiU+Y/86d/zGNrSfdmNx4e3cYsD0yHv0kv4gYp7Smcg4K1i63FanjJFQAlLXjILqdtLqhMfi0vnev0hiu1GPiE+a/8+e/dln4vbL7cBQfDwO2xx4UHLu8UCNj86weq5QmqG0sNI9rMkfpvmRKRMfihwLAuRsbC1foe/crwV16THzC/Hf+/NvDgOX34SiN/h4GbI89KDh2WVgvY/Rq2ZilM6/Y+83sQcGIDsUPBYBzN64IL9b37lWWFTboMfEJ89/5828PA0rbL5Tdi5t4fxiwPW0HBeUVtoxTIWLs0pfG4En7DkbmDgqOlZt3naQKAN2Oi+h20soegtP37lPkh2yWHhOfMP9dM//jGsOV+l5chcOA7218Y/5keYX9gB67tGbc8owdFBzbKDfuOLUrEigA5Jq6HRfR7aSWVJZyv0/p+/cmTeG5eki8wvx3yfzf1Nh6krRfKrsfB6lt5DBgR93YFPaTMfuFHsMU54HxWTgoGHHjsUMBkIyxjYVN+v49yXP2kJAeD98w/11j7Irw4Yh7cpJxjcEndXuI1nZQcEWhRsbtWT2OKU0wNu0HBSNuOnYoAJJxQ9OuXnLPed2His/ycJoeCx8x/11DNp0RZffkLIU7dHtoX23OHCRjVy95tXw8U5m/StJ5UHBco61C3eamBAoAe03djovodtJu3PJwte5DheeJuvVmfz0OvmL+O589DCj38ULEvbnIzilrTE/dJt7bxEbzr22vsBvDQsS4pjDBk/YdjFQdFCy/yfihAEhObbPZd9yK8GHdjwrNq+Oa8h/XY+Az5r9ryL2sjLg/N+EwYCz2oKCM4wNl45rWrEjRQUG5GXtDTpNYARDRVtzodrJgwlJzhNz793VfKiwvjV2Z");
    imageData.append("kh+SlGH+O9+Nq1pPlHsqRdyni3AY0IGbmsJ+45rCX0SMb1rz0ITl+VN1PzpVxE3FDgVA8uzbkjc1hqukD3ndpwrIwzd18u9+zxrmv/PZ+4q4VzfhMKAT9qDgG3tF8OeyMU5ngrEruvCg4E0r7IbtOskUAOXtxI9uJ2tqV7SeML6psOGmFcGTum8Zy9/Hrwj/j/wwfEb3Ee+O+e8841cURkTct5twGNApe1BQCuR6Gdu/lY11GtMUvja+Mcx1+kHBshtxEPlB/g/5b4vLvHnNsrbiRo9Hlk1s2tVr/PLwgnErCkPfKJjSn7GNYf+xK/OndPqDX4GY/2S1veuyInxBryGOwmHABNSuNEfKxrpOxrcQMeYpjC3kg9pO+9hr+Q34FT0eAPBu5IXISr2GuMq4FRwGTIo9KHjTGy8my8Y9jZHn7Kfy34t1P5wb3ySNeRw9HgDwbura/sklLOl1xFE4DJgwe1BQxvnnEWOf1iR7UDCiQa+ixwMA2iObyMN6HXEVDgMm762DguObgj/p8U9pgglJHRSMaMyr6PEAgPaMX1kYodcRd+EwYGdpOyjYFNbLuP+tfB5Smdckbg8KRjTiVfR4AEB77GFAWTue12uJo3AYsJO1HRRsCtdJwoj5SGGCJ29a6eig4ISVofE5ejwA4L3IQtyk1xJXGb8yGK/bQ/Imrsx/TMa/Rc9HatMU/vSm1TEPCpZd1LPo8QCA92IPA8r6UdLriaNwGLALTVgV9pU5+HnEvKQy41eGD01YvYcHBfXFfIseDwDoCFk/vqvXE2dpCj6l20PnsW+vT1xVqJqwMvhT2dykM8GElYXmyWvNB3Rf2jVRvtnn6PEAgI6Y0FQYrtcTV5HFfKtuD53PHhSc0BTWy5z8Tc9RSvPaxKYwN3W1OVD3JVLEBbyKHg8A6Ah5lbifrCHP6zXFUV7nMGB62IOCE1aF62Rewoi5SmOemtiRg4ITVgWvTlwVGE/z//R4AEBHTVyVb4pYV9xk");
    imageData.append("NYcB08YeFJy4Kmwpm6v05j8nNoWX6H68bcLK4PcR3+RLfqvHAwA6asKq1hNlHSlFrC0u8gvdHtKhbk3YT15h/zxizlKa8MtT1ph/0f3oNkmqmTr5Ak9zvx4PANgddauD70SsLa7yad0e0sG+vS7zM1o216cj5i2NeXnyyvCid3SibmX+mogv9CMr8yPeMRgAsJsmrspfXba2OMqklcEXdHtIl9pmc1Dd6nCezNerev5SmF1yrxe+ffPjN5lD5A+fi/jCSs9ztu//NI8AsNvsYUBZT16IWGNc5O+1y82huk2kj/0InszXZkkYMY9pyovjV5gPvn3jk9YEEyatlmrTo8gg8H+9CcCJyavzK/Qa4yyyPuv2kF51K/OnyPPw1bJ5TFfuefuG7b9lTFod/nvEF1Vo8t+oajF7/9OcAcAem7Su9aOytpTK1xon4TcDZtCkVWFfmbufRcxnGlKwz+zbN1u33vSYtCr4ScQXVlp+bPv6T/MEALHJ2vLdiPXGSSav5TcDZpIx3SevylfJHP6vntOuTt3qcME77tX+9iApAu7WX1hB2dHh35AEALtBFvqrI9YcV+EwYIbZg4KTVoVzZR5fjZjbrsmq4BF9n23kRi+dvCb4gaQkMRmP7cMPpqxp55chAEBM9jCgrDUvRKxBLrKznsOAmWafjylrgikyl8WI+e2KPKfv8R3q1r9+tNzwDZPW5BfLf7dPXhO2ZCFt97o6v2jy2uB62wfdLwBIgj0MGLHQOskUDgNm0vQmc9TktWG9zOGTek67OK/rewUA7CF7sGpycu+cchgwQ+QF6DmTVwd3yby1RsxlGvJXfc8AgBjklfp3JPYVu/NM4zcDptobb/PnR8jm/6ieuxTm/+r7BwDEMHlt/uqIxdZJZGPhMGAKvfU2v8zRk3rOUpw1uh8AgBjaXgWuDZ6XmATCYcAUsW/zT10b3CXz0hoxV+nOmvB83R8AQExT1+ZXlC24rsJhwC5lC7yp6/Ij297m");
    imageData.append("13OTkdh71/0CADhgDwPKK8OSxCQQDgN2Afu7/qeuDRdIcfdsxJxkKaF950L3DwDgiCy0345YfJ1k2noOA3aWt97ml+T1PGQx09YEU3QfAQAOTV2Xv0ovvg7DYcAEvfU2v4zzYxFjn9WUpq4N5+i+AgAca9tE1gbPT10ni6/77JyyxvTUbSKeGZvMB6euDxfI5v9sxJhnOOFTUzYULtP9BQAkZNq6fOM0WYCTiBQXE3V72DM3rw3OkTG9S5LX45zx/HHa+mBSbps5QPcZAJCgGetbT5BFuBSxMLvIL3V76Dj7Ds20tfmqm9cFD0WMbbazNvih7Rv/t/cA0IXklfp3yhZoV+Ew4G6zp/mnrQ/rZeyeLBvPbOe1qeuC5unr8h/XfQYAdIFpG/JX37w+MIlkHYcBO0rGqvfNG4JmGbfXy8Yx2/njdClopq42h+s+AwC6kH2rWRbp5yMWbhd5fdat5jDdJt7Q9jb/hnyVjNNDEWOX6UxbH/zQ9o23+QEgxW5el2/UC7irTF/PYUDNvs1vXxXL+Dypxyvjec2+izF1Y/5U3WcAQArZw4CyeBcjFnQX4TDgm3ibHwCQOjPWB9+WV+v2Fbv7bAzP1e35wr7NP2NDvkrG4aGyccl+fmj7xtv8AJBh0zfmr5q+QRb1ZOLdYcC2t/k3hvXTN4RPRYxHdrMxeHXGhqC5nrf5AaAy2FeqssA/X7bgu4k3hwHt2/x2g7R9jhiHLOePtqDxZR4BwCszNuQbZfMySWRmBR8GfOttfunnQ7rfGU9pRlufeJsfACrarFtbj5cFvxixEbhIxR0GnLPWfGCmvCqesSF8KqK/2Q1v8wOAf2Yk+Cq2Ug4DztwQfEI2ybulT3ndx4znienrg0l1600P3WcAQIVreyt7Y2BfBSaRbbq9LGl7h2Rj+GXpRymib1mN9CX/jZs3FC7L5cxeus8AAE/Yf8+euTF4XmISSGYPA87cGPaX+38lok9ZzauS5pvX50/RfQUA");
    imageData.append("eGrmxvzyiA3DSWZsCOp0e2n35uYf6r5kNI/bOeBtfgBAGfubAWWjKEVsHi6SqcOA0zfs6jUz+6/8izM35b8+Y1M4qJsx3XUfAQB4W/2m4NsSk0RmZ+gwYP2m8Ev6/jOUtrf5Z2/mbX4AQAfNujVfFbGhOMmsjcF23V4azdgYnC33W9L3n4E8PnNTMHHmVvM+3ScAANpV22z2rd+UfzZic3GRTBwGnHVrsCPi3tOaouQhW7jxS3sAALHYw4ARG42b3Jruw4Cz15v3y33uKrvv9IW3+QEAbtnPvc+SV5YSk0B+q9tLk/pbwwUR95ym/GHWrWF9bo3pqe8dAIDYZt1q31aWDSeBzN6czsOA9p8/ZHN9Wt9vClKUPFS/qfVyTvMDABJl/005YiNyk9vS+ZsB62/Njyy7167Nq5LmmZvyJ+t7BQAgEfbV8Oxb88/Olo0ogaTyMKBsto9G3GtXhLf5AQBdZ86t+eURm5OTzEnZYcA5G4Oz9T12coqSh+byNj8AoKvZw4Bvbkx6s4odKQBSdRhQ7mmHvsdOyqtzeJsfAJA2s28LHpKYJDJ3U3iebq8rTL/NHCX3s0vfX5KZdVvwBG/zAwBSa+6t+ao5smElkbm3peM3A87eHC7Q95ZQirL5PzR3M2/zAwBSzh4GnHNb/tmIzcxFuvww4Bv9C5+OuDeX+duczUHzPN7mBwBkydzb8ssiNjUnmXtbMEm315nmbs6P0PfkMC/M3RyMz20yh+h2AQBIPXsYUF7BFiXGeZq79jCg3MOjZffkKLM3h9N1ewAAZMrctn+7llfsSeT2rjkMKMXH2WX34i47c3eYw3WbAABkytzmfFXEJucmXXQYcG5zsKPsXhxFiovNuj0AADLHHpabuzn/rN7oHKXTDwPmbjNHSbu7Iu7FSebcmj9dtwkAQCbNvy2/bJ5sbgmlU38z4NzN4YKIe3ASKQC+rdsDACCzcre2Hj+vOShKTALptMOA9t2Mec3h0xH34CRz");
    imageData.append("N+c/r9sEACDT5t4ePKg3PFfprMOA85vzI3XbDvOnqhazt24TAIBMm7c5Pyxi03OV7bq9JMzbHDwa0baTSBHDR/8AAJUnlzP7yCvoZ+fLZpdAXk/6o3O55uDsiHZdhY/+AQAq1/wt+WXzb5cNL4k0J/ubAefdHuwoa9NRFtzOR/8AABVs3pZdvWTDK+oN0FF+m9T/UY796J9cf1dEm06S28JH/wAAFU5e7T4osa96nWf+HeH5uj0XFmwJb9FtOcsWPvoHAPCAvNodVrYJOsottwd36vbish/9W3B7+LRuy1m28NE/AIAH7GFA2VCfKdsI3cT5YUD70b+IdlyFj/4BAPyx4Pb80gVbAvv2t/PM3+L2MKBc81HdhruEN+v2AACoWPYw4C1bgqLEuE5ui7vDgFJM9NbXdxg++gcA8I9s1A9GbIpO4uowoFzrLn1th7lNtwcAQMWzhwEjNkVXiX0Y0H70T66zK+LaTjK/OX+abhMAgIpnDwPmtoTP5La0vW3vOrEPAy7cEt4ScV1X4aN/AAB/5e7IL83dIRtiEolxGLC52ewrxcnTZdd0lIV89A8A4LNFW3b1kg2xqDdIR/mt2cPDgFKYjIy4nqv8qYWP/gEAfCeb7bciNkknadjDw4DyvY/qa7nKQj76BwBAt24Lt+aHLrQbYwLJ7cFhwIYtQW99HYfho38AAFj2MODCreEzC7fKBuk+u30YUF6l3xVxHSfJbeWjfwAAvG3hF/JL9WbpLHcEk3V77ya3wxwl37Or7BqO0rCNj/4BAPA2exiwYWtQbLCbpPt0+DDgoq3hLRHf7yoP6fYAAPBew9b8tyI2TSdZvDW8QLen2Y/+NWwNn9bf6yqLtrZeodsEAMB79jCg3jQd5j0PAzbckR8Z8X2uwkf/AACIYg8DNnwhfKbhC7Jhus97HgZc+IXg0Yjvc5JFW/noHwAA76pha37JIrthJpFt734YsGF70Lvs692Fj/4BANAeexhQNsxixCbq");
    imageData.append("Iu96GFD+7q6Ir3eSxdv46B8AAO9p0bb8t/Qm6ipRhwHtR//k71r117oKH/0DAKADFm/ND10sG2ci2Rrs0O0t2RbeUvZ17sJH/wAA6Ah7GFA25WcWbwvs2+eus+uf/z3efvRv8bbw6Yivc5JF2/noHwAAHbZ4W36JxCSRRdta3z4MuHh7/hr99w7DR/8AANgdi3bs6iUbaDFiU3WR3711GHDJtvxjEX/vJEu2t/LRPwAAdpdszt9cYjfSBGIPAy7bHvTWf+4wfPQPAIA9sXRbfsiS7bKZJpDFd+Z3yH/v0n/uLq236v4AAIAOsAf0ZDN9tnxzdZJdktaIP3eRUsP2/Km6PwAAoIMWb8svidhgU52l2/noHwAAsSzfseuYpdvzhaVtG2tWwkf/AACIbem2/DfLN9nU5n/56B8AAA4s3ZEfsvRO2VwzkdZp+v4BAMAeyD1s9ll2Z/4ZiUl5dq7mo38AALizbHt+ccSGm6os3cFH/wAAcMoeBpRNtqA33TRlOf+vfwAAuLf0zvw39aablizdHjyo7xcAADjQuCM/ZPkOeaWdyrReru8XAAA4YA8DLr8z/0z55tvl4aN/AAAkadmO/OKIDbhrw0f/AABIlj0M2LgjX5CYlISP/gEA0Bka78p/Q2LSkBV38dE/AAA6RdPd+cF6I+6qLL+bj/4BANAp7GFA2Xyf0Ztx54eP/gEA0Kkad+QXr7jLvgXfdWnio38AAHQuexhQNuGC3pQ7LXfz0T8AALqEbMLfkNjNuNPTdBcf/QMAoEvYw4BNdjPu/Oxc3cJH/wAA6BL2MKBsxk9HbNAJp3WTvhcAANCJVtydX1S+QSecHfmP6/sAAACdyB4GlE25ULZJJ5QV9/DRPwAAUkE25m+svCdvOiNN9/LRPwAAUkEKgMF6o04ofPQPAIC0sIcBV96bfzpiw3ac1qm6bQAA0IVkg160SjbpBLNz2T3mMN0uAADoQutadh2z6t58QWKSyMp7+egfAACp");
    imageData.append("tPqe/Nf1xu0qTffz0T8AAFJp5b35K/XG7ST35L+l2wIAAClhDwOuvjf/tMS4zKq7Wz+n2wIAACmy+p78Ir2Bxwwf/QMAIO3W3/360avvy7dKjIusuq91km4DAACk0Or7WzfpjXwP8+fcNnOAvj4AAEih9XebHmvuy/9JYmKkuOaLrf30tQEAQIqtvjt/mmzir0Rs7B3KWt76BwAgm94sAv6oN/f2sva+/K419wVj9LUAAECGNH7FvG/N/fnGtffnX5eYdlJa98X8V9e35E/R1wAAABm1/uumx/r789esu691o2z235T8aO39rd9d+8X8XWvub52y/v7WE/T3AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAeOf/AyBtkM2NqgMVAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image1a7cdbfadba717676be8f600190c203d = new WeakReference<>(result);
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
BufferedImage image1a7cdbfadba717676be8f600190c203d=getImage1a7cdbfadba717676be8f600190c203d();
if (image1a7cdbfadba717676be8f600190c203d != null) {
    g.drawImage(image1a7cdbfadba717676be8f600190c203d, 0, 0, null);
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
		return 533.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private selection_pane3() {
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
       selection_pane3 base = new selection_pane3();
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
       selection_pane3 base = new selection_pane3();
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
        return selection_pane3::new;
    }
}

