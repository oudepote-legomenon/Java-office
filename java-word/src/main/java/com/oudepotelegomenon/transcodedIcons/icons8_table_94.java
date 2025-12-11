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
public class icons8_table_94 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagea8cd21a94b94a6ea2b21ce7b3ff033a7;
private static BufferedImage getImagea8cd21a94b94a6ea2b21ce7b3ff033a7() {
    BufferedImage result = (imagea8cd21a94b94a6ea2b21ce7b3ff033a7 != null)
        ? imagea8cd21a94b94a6ea2b21ce7b3ff033a7.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(18752);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAF4AAABeCAYAAACq0qNuAAA2uElEQVR4Xu2dB3RcZ5n3b5CAOHbc1K3qnh4SYJcFArvLEthNQiiBZVkSCGT5FhYWlqUlMYQkpMe9yk3uli3JkiXLTXKVe5FVR5re+6i42zPOPN//ed97Z+6M5KxC+M7Z853MOb/z3LkzcyX97nOf93nfO04U5YPHB48PHh88/vc86k6ScuoIKURx5cYNju+PG2qsBp3gOfBH8MJfgN+DP4F/B/ghyi1q/H/Bh27ERfz4kavKYydb07X9+Y8fqz+g/hTEt6jS8MM4vh/+vxPfclX5yqlzymFsf4Vfez+Pw1dI+WmclMevk1IVeCejMRLL3HM5lrn7UlRy8QaIZu7SsVNlh44GUH8hmrkd1IIaUK2y7nw0c/1gNHMZWAqWgAVg/uD1zLkD1zPfBm+A18Cr4OX+65l/BH8AvwfPR65n/i5yLfM3fdcyf4X4y/C1zJ8j/jx0LfM/wFPgSfBd8K/gX4LXMr8NvhW4kvlN8ITKN/xXM78euCb4mo+5kvm4ylcY75XMxzQ8VzIfdV8FHC9nPoL4ddOlzKd7ghkrw6R8C+LfDlxP1znyx0Uc4L8vvnPLd+iacgDb++iGsvsSuBKTXH4Hz2PKLh07VRp01F+OKXWItRdjSg3YCraAzdhXfSGmbDofU6pA5Xm5jZOhrAGrB6NKOcDJUBYCnBBlzkBUeRO8Bl4BL/ddV/4AZoFnI9eV34BfgV+GQBD7EH8NfsXPwS+w7z8h5aeBq8p/+K8qP1b5P75ryo/8UcG/ea8rz3ivKj8EPwBPM56ryvdVvue6pjwluAquKE868DqO97uQvAoed1265dd9pMzY9R4z/2s915TvQvKLl9+5pSr2jvLKoasfrr8S/6c9V278Ghn//O7LsVmCS++A2Kxdl6IJdqrsUGkA9WD7xeisOrANVIOqi7FZOAGzIHvWxsHYrPWIa0EFWHE+Oqv8/PVZ");
    imageData.append("uAJmQfis+WAOmA3eGIjOehW8DF7sj856oe/6rOfBc+C3keuzIH3WL8F/ha7P+jn4GfgJ+DH4d/Cj4PVZzwSvzfpB4OosyJr1fZWnfFdnPRm4/jzzXR9z9fnvgH8B3/ZK/lnDffX5bwmuCL7puvL8d5yXf/Uz++Uv07lTmauQUD/suHLLnTtI+btKS7re4R//1EjKk21XlUUUu2UODrD4Wqy0+vKNgzuu3qD66zeoDrFWxzYdNaD6imQr2AIqwWaw8fIN2gDWgbWXbtAasAqsvHiDysFSsBgsvHCD5oE552/QW+B18OrgDXoZ/BH8fuAGPQd+OxCjX/fH6Jfg55EY/RT8GPwoHKNnwNOhGD0F/jUYo++Ab4NvBmL0DX+MvgoeB4/5YvQI+EdvjL7sidHD4IvuGH2BcUXp78Dfgs87o/Q5R5QeAp+1R+kzjC1Kn7ZG6W/Ap9T4kPkaPdF7uXlx7/niN7suKt88Sbc8trpHeWDp2XTNQx/PvUHKb45fUU7TOeUZQ/+Y7/XFTiIj6BHThRtfNF+ICUwXYv+A+A+m84IvaBglf6/yd0zv+djnVT6n8lAPMxj7rMpnDIOxTzPdg7G/QfwU4l93DQj+qnMg9kmVT3QMxD4u6I892C55oE3ysXN9sfuZ1r7YfSr3no3E7j0Tid0D7j7NhGN3nwrH7gJ3nlQ5EYrdwRwPxWYyx4KxGcxRyfQjoCUgmMYcBof8sakHdRzwCSbv9964+/gAfeVo5OicqvbblNJ65TcHjiov7v99uubUR5GLlAJ7XPmC81rGtzzXlMfd1374KZz9ezsHog8azsc/bjhPQxlM0i15UE+X5AGVj3UyA4L7sX1/x0CS9gG6j2nrp3sFA3TPuX7B3UxrP93V2kd3nZXceUYjQnecjtBM5pRkxskwzTghmc4cZ0I07Rg4KpnKHAnS1JYgTREEaMrhAE0+pHIQHAhQ2QF/kv0+Kt3H+Km0GbHZS6VNYK8gXrjDGb1vV4C+");
    imageData.append("uNvz5N/vHVS+uKs342tV25RvVm1J15362NJwXSlyXMqcbLyg/FX3xfn3m6/SJ5GBn4DkTxgG45/oPg84gq7B+CdVeFvj40znQIIHNToG4g/o+Fh7kvvbgBrvOzcQv/dcv6S1P35Pa1/8nrOSu8/0xe8SROJ3nY7E72ROReJ3qMw8GZacCMdnHE8y/VgIIB4NxacxR4ICSI9PPcwE4lMOqRyUTD7gl+xnfPGyfSrNKk3eeGmTL166l/HGS/Z4qWSXJzZ9u4fu3mqdfXelVblztS2z7Mpguuahj68c8Ck51ksZeYYLyn1n+lbf03OJMzamZm5c0I2T0HNB8HE9BkZeCQ/qIr9f4wGmS4vI+DaZ4ZBN9wpkhovMx1XAWS8yX2S/RMt+cQWcVTnTL7P/tOQOBpkP2SBE04+GZaYjw6cdCYkrYAZfBce0/dgHprXgKmAOB5McAsj+KcwBDT9N5qzf66OSPT6WHi8V4t2xqdtcNHV977I71vUqZSvsmQWbDemahz4e3WlXcuxXMvKMV5R7T/dV3N19kctClEvDAx2DcS4VfClP2O6kMVU2Glttp9t18HNtH7/O3K4yZquEt0dvsdL4ehfNhCwWfg8kanAJGLvFRqM2mmn0Zovgtk06sP+2DUlGrTdJ1qmsNdJHV/fS7ZutVAZxQvoRFiqll6BEjMH7PrLcQLeu6qGPMisN9JEVKss1uukj5SrLuunDy7row0u76CMgc3En3bqyhwp3ukkK98RLdyM2umNTapw0ZW3P8pmbjUpZsyMzf3ZHuuahj0e3OyD+akae6apy78n+iru6LnLtjd7fPsgx/jFka8EONz2y4Ay9scdKL+600Eu7GCu9hO2XVXhbg9/z4k4zvdiI5+CPjWZ6DTxdaaApyECR0ajZKCN0D35OHk7KE/OP02v4zAsNJvqjwChjvZFeYLZL/rC9l16o66U/6Hi+toderuuhbyw+RQWQMeNERGTuND4JxyKUvcFIj7yxn16q");
    imageData.append("NdDzNQaaVdMteL5ao4uer5I8x2ztTPDslk76bWUnvbClg55Y1kr5cFGGrC+F+BL8rOKE+N7yKZuMSlGjI3PK/M50zUMfj9Y7lCzz5YycrkvKPccjFXd2XEQpGIjexyUBtZfLQ/EePzWc8hDRVXrn6iWi6xqXddtpXNO4iM9ganbjErW5kO2nMFBypkP63di+u22QipDtR9tc8viXLyDg/Vc5qlxJEr9ynuKXk7wDohcHiWIXaB+OwTLuOBlBmYB4LhlHI1Sw3ki7WnqI3rlE1y4M0I2LAxQT9ONj/RQF17V4vo+ugeuDiIMRwaX+MNHlCLW0OWnqbh+VNaHcNEL8Tg8V74D4KhdNWdNTPnWjFD95/kgyHuInGC9lTOy4qNx1NFwxs/0C19yoWg54AMRIH6bqtjBFL12gQN8gRQbO6xikMNN/MwbI3zdAlwYG6LA1Qved5trcL6TfBe5EvZ5c56KmDh9dvnieAuEBCuH9wb5+CkaSBJgw0yfwM6GIwBOI0Pn+Pqo/5aSynV6aiYyfckDW6imHw1SC0lV31EwXBgfI5Q+TN6ARwmeBH/iC5FZxeQMSD0c/2Vx+CgUDtPOkjaY3clfjo+IGiMd2cQPEb3XS5Iqe8mnrjUrxDkdm4YjF91zKyDoH8UfCFTPaLtDdZ/ujd58d4MgdB03eH6aa9hCy7YIQPTiocZ4GIV9ElQHsHxjQGKAByI+A6+cH6Yg1TPee5IEQgyPincjMO3ASJte6aF+HHxfKBQpDej9OVj/Ec+xDFEQ49lEEMRLhyEQozCcC8q8gQxtOOai00YNBNIKBkAdEiD8UouKNFtp+xISLB0kQDENimIIhEAyBMAUQA4EgBXAC/Ih+f4D8OAE+RJ/PjxPgp4FwgHZB/LQdEL+HxbvjJTuQ8fXu2GSIL1vdUz4D4ksbHJnZIxU/vudCxoTW88qdLaGKGa0XkJEDUe4aAFq7AfSyISGeL2vOYiGYhbPcFNGS/gEpj6XzNsu8");
    imageData.append("dn6AjlhCdM+JPprJ0pGVdxznfryPytAV7Gtn8Th+RBWuSmfRfUKyFB5mwoyUzjEAeZcHpHiWMeOoFD91P/fnEI8BmcVfOd9PPmQ4S+fPBAMsXMoW0a/JDpDXJ6VzdLohPhSg3Sy+AQMqyk3xdohv8FDRdlesbIsqfp1RKWmwZ+aMqMY3QHz3xYwJZyD+cKhi+tnz3J5F7zqFknAK4lEKSpshvi1EN1g8JKaKhmSOnKWq8HRCEHgV4lvMIbr7WB8GP2Q9Br2ZDMpNWbWLmtt9QnxIZDYkaySyWxMuZYeYkIycxZcGIlR/0s4lAG1imCY3IeP38YQoREXrzFTXIsVzeeFMl1muivdzlkukdClcRJQap9tH/RC/64SVpqJnL90lxRfXQ3ydKza5EuJX9ZbPWGtWSuqdEH8uXfPQx6NVDmWc4ULG+NZB5Y6DwYppp89jcOqL3nGyn2P8bpSFkr0hqm4NYnw8L+qvEDys5H6RqYmM5eeQxzKvDvbTYVOI7kI2zjgO8YgzIYizv7TKSc3nvBiHByGyT810md0yJrNbk82RMzcEOIsvsvgTNiqqd9P0ljA6D0hvBvtV8YeNdJnF+5PCAyw7wFkeTCktQrqXpfukeBfEB/208zjE13nQSvogHOJxEopqIX4zavwqA8Q7Id4H8c3pmoc+Hl3rUMai1Iw7B/H7ghVTT57H4ATxXBKOY8aIjCzeHaSqswGKXRrEQKeJVWtvCrqanMjaPnymT5SCw8Yg3dkSwTQe0iFnBoOfU4JLtanVgxqM44f02c3CJUK4QMrm2iwJSfH9Edp+3E6FdW60kRCPTmzyXkz594WocI0qHuMAD6KyjmsEEuVFZLsQ7icP4/EJHC4v9bH4YxaaUodSgwG8aBvE4yQUbUOp2eSgspWG8ukVDqW4zgvx+9I1D308ut6h3N51PmPsmQFlZlOwYsqJQR6cojO4JBzD9BwZWbQzSFvPsHh0G+Gk1KRkmaUJ2bryEIHAYFiK");
    imageData.append("P9QbpJmHIf4Ish5ypjM4CcWVDtrb6haDXxByZYZrwlm0TnhCulougBcCL/SFId5GhbUQj7peutsv5Jc1QXyFibYd6kU5UsXrarmEs1wKF9JV4W6d+EjAJ8RPrkXGY4AtqoF4/KyiGojf6KTSFYbyaasgvnaE4h+D+DGd5zNuPwXxeyH++CBmfn3RGUf7UCv74negLBTtCNKWU370ywOilROSebBLiE6rxUI4C5RlIoAsvoyMPNgToJkHw5hRQvghzC6xPR0noRgZs/esG236gOhQEsLVKESndyFaJ4Js9/pYfIi2H7PSJJ6+H4T4nZDO8vcGqXA1xB/sEeXIDdGaeJbt88qBND3LWbrb7RXYnR4hvpHF17gxjrB4VxxZT0VVEL8B4pcj4zXx80Yg/vMQn9U+mJF7ok+ZsSdQMfnoAE1riUSnoyRMPxyJz0TmFzYEaMsJn5hksBi94AS6spAO99qa+BloTbm3no5BbxrTghO7wU57TrvF4MfdRig8NLtTB0QWrpYM4IG485EQenUrFWCgnoq6XtoI6bv8aP2CNGmViWoO9Ihy5PamdS1ppUUv3KUixPu91Ii5QFkVxNd7qbAK4nESCoV4tLHlhvKpKxxKURXELxiB+L+F+AnnBjKyj0L8Log/MoDpdjg6jTPycDg+E4PgpO0BqlTF+4MRUT7Sa3BKPdZQS4QfXEIpOGjw0/R9EI9MnwY5U1F/px2KUNF6iD/lQg3G8dV2T1/DkxkupafWaIiHzMFIkOqOWKiAZ5E4bskOTOsbAcanSStZvAHiw2JCpC8rqaWFhevEuzwCm8NNYVV8KcQXsfitEF8N8VudsdJ1aGOXQfxKiH9phOK/AvGjzwxkjD4UUWY0+ivKDg9ATCQ69WAEl2w4PgOZX1Drp83HPGIq7QtqpUDrMGR26utwIltVgWLwQ0bu7/bRNLSmPBOeBjlTm3kVMEyFa23okZ10CYOfEK9r9YaXnToguiFvEBOc2hYL5WOg");
    imageData.append("noyfUdIA6Sx/V5AKlhupZr+BLrB4t+xUPF4pWyKFc3brhTNOl5tsdjeFfB7agblA6VaIr1PF4yQUVkrxpUshHi6LXoX4F0Yg/vPrkPGn+zOyDoSV6Tt8FWUH+zHjC0cBTdkfjqPcUME2H206gq6DxUPEcHL1GSrQBPLgh+0LLL4L4tGaTmbpTZhVMgciGPxs6JEdohfn1m4kshMDojazRJ+9rcVM+ZUudDNBKkFWljbwmkqACsqNVL3PQOcxDnBPnhSezO6hwoHTLbDaXRDvph2YC5RUotRggC2shPgtEL8Z4tci4yF+ynKHUvgCxC8agfjPbnAoE0/0Z2Q3h5VpDf6K0gP9LCbKlytinAfAgmqIb4H4wYjog8WUWxOsk5wkmDJBEV1HOEj7Or00dU9ItHhTIGcy6i9OLk1aDfHHHWLw44FSSOdpuyp8WOm6UsFZPBDy07bDZsrjnhrHLa6D9HqwA+KXGamquRvjQFAnPik8VTrLltIdThc5UWasNoj3uqT4zcj4bRC/2RUv3OKS4tc4qJjFL4P430P8shGIf6icM74vI/tQSJm+3VdRsq+fyppD0cnNYW7F4tOQ+flVPlp/2KXWSJYREpmpwWLTnwt8El5wGggGqKkD4lFzS9HiTYGcydiegp9TsMpKO47ZaRDjAC9M8cDHdTuJX5QTt0dmtwviBKI8+DD4cbvnp5pDEL8Js0gcF90FlWwHaAzylxppS1O3mH3a8F4n2kNuER0QzPDgaYdghus5lxYbspwznaWbrE7yud20/bCJije70NGweGccWU+TNjpjJRXI+CUQv/S9iF+AmevZvowJLSFlai3EN2MK3xSMToacsr0Qj4zMrfTSlhY3vXOZ63uYBvp0RDiGEEPUfxNCoRBdGwjRoS4vTcacoBTZPmV3gMp2YmbZhBO7wkJNJ+x0/SKOj/f24erQiISYQIJwUINXDCV+vx9dk5/qj5gpGx1GGep6MbKypI5XDyF+cS/V7evG");
    imageData.append("FYuE8fko6E8SwKAZ8En8Xo/Ap+FxC1wuFxLHTbuPmqhoI8RXe1h4HFmfEF+82FA+ebVTKeTB9eWmdM1DHw8tgvhTEH8A4rf5KoqbIH5PMAo4xnkALGkM0+xmNxm67XTsnJ1OtTM2SZuKfjuN4+ds1NFhpc3HXTSjOYIpN4RDeinq7xSUnqKNblreZKeubhudaLXSqXNJTornFjrJtFroVCtHM508m+TYGTO1t5upvLGXJm/jQdWPrIT0bV5RcgpxRS1sMFBXl5WOnzbRyTOSEyIaEVVOG/F6r+RUkiMne6m1tYfW7DTQzBocj2v7BojfBPEbnLHi1Q4qhPiSlVYl/0VXZu5rR9M1D32w+LHHIxnjmwPKlGpvRfGePm7BoqW7kfG7Q/ESZM+DR/vpyZMD9G/NPvoheEaFtwVNPvpBGk+D7+/10vfAU3vl9ncxWbrvUJ8Y8MoakfkMavCd+yP0ZbSV397tpW/u9tAT4Bu7PPR18LWdHvoq+Eqjhx5DfBTxEfBPjW76xx1u+jJ4uMFNX6x306N7A/RJXKEFmnScBC4LU+r99AD+js9ud9Nna130mVonfXqbk/5G5VMqf13jpL+qlnyy2kGfrHLQJ1Q+vtVBn9ruo/vwu+djwlS4ETUe2T9pvSNWvMpORQshfjnEv+CG+JZ0zUMfQvyxSMa4vRBf5a0o2s0ZCfFcEnYG4yWIXDNn4g+682DfEO7Qc0AlsR0RzNwvmYaywlnOsjVKGjDRwb7p6Ham42qYhprP79OYulcyhdnD8PgAkBiTmV1IEA2cyCIhm2eWoJrxiO2S7X5RdhLUq2COUoTXiuokhUytBrIbx5vEcKZXeamAZUM8iIu4zhEr0cQvNSn5v3dk5r19Ol3z0MdDi5zK2CPhjHG7IH4LxO/CFL4xEC3BH1GyMxBnUYhUvONm8B/0P1AvKWEa0mEBeJ3FoCwwRWosrtWQGVykoYlNCPaoJIUX4rmgimeZiFvwugBdSaWEB0eu");
    imageData.append("04JNOjZyRqtwdjPrIZkR0l1UsB7i8bxgLTJ+pZ0KIb54iVHJm2XPzJs7gmXhhxZ1KWMPD2SMa+xTplS6KwobWXxQim9ExnNUs5Mzalj4tR0cte1hgOBS7SQkMo6fc9b5RUaWplOnAxlYwi1ibRrIxmJkYwkoZuEsWSe8iONWRFDMz9VtcRIqdSeC20SNTVp0icGUS0rhBpnpBSx7PZeYpPiiFRC/wFBetBjin2fxI/je/EOL2pQxhwczxu7oVyZvdlUU7ghzJkc5E0GcJQn5uJQLEZMEhm5DPK/rFEK0iILk/hJEkeGc3Rqi35YnoxAnoXA7X+4BmiTwS2o1fAIuAeLyF/hFGZjEmc5lhrNeFV60NSmd9xdgf8FWFYgvqGTcSTZL8plNKpAucaODAZBesE6UmPgkxII1aeJFxo9U/CGIb5DiJzWEqajeH1XLgxCfh0tx3GwD5c4D8yV5KuK5br/YHo65BpowvwdTek9CuCgp2ObBatxbXZQzp3sYsH+2+hpHAbbf7koh961OGvdmF+VBhpblXF445q2x07jXOyn7jU7KeVNGSYfk9TRe09MuebWdxr7aQTkrrKLkINMh3gHx9ljRclX8oveS8QstypgDoYyxdT5l8kZkfD3au/pAlEsABp146c4QjZ7dQ88uP0vtliAdwiToKKb+zJEUvJLOofBnzvb6aGEj+mz0vEVcXrh2i9YvSGPwB766vo1azQE62O6hFnympcMjOJxOu4abDgGOB8656bTBS69t6qDbFxhxbFwFm7mGu0UZuh0yn1t5ms70eGn/ORcdbAMcdRxgWp0p7D/rEDSddtDxDhe9Xd1F4xeZkPkuzvR4wVqcgAp7rJjFz4f4hRD/3EjFL25XRjf3Z4ypiShlG5wVk7aHWHhUHenjZehqJpbbacteE9H1AUyIIpja99GFFCKp9Cc5D/r7IhTD5Og45JRgFszlo6RW9tolKEVZcwzUhMnJO1cHcfwwPgP6JDybTRKi");
    imageData.append("QUzItAmbBk+yrl8IY4JjoYnLrVTEHQkPmFy78fOycZXUNXfSjct9YvLVj4lZPz7ThwlZAuyPYDLGhAMaPoHf66VLmKDtO2GBaKcUX+GI56viRcbP7ykvfk8Z/wbEHxrIGLOjTylb76woqEMtr/NFuQyglsa588iucNG6ZgddGoxg+s935eXttgRiCUFFey7uYapLBqA/HKJmZGpJtU+sdsoe2yvaudyFJqpvsYqT5PamLjfwWrtAWz4Qq5EBsXygLSM43H4hb9tBM01Ah8G1vnATL2ChJqPO587rQeJ0i5NkdyWXGnjdhu+n8hKCWEZwSuQSQnIpwWxzY2brofrDJipY7RQtZT7EI+spf7UtVgjxkxb0iBqfO+IavwDi9yHjt0Wk+NoQD2RRkTW1fiE+q8JN6w846cpgWNw60y+AJW9MaDGJ/NqElMfr5ftZfBWL505Etn1C/CIzNR614Wrh42uLY/IukVggSyyOaTcxhlkkCweo7jCLt+GE4qqCeC43k7Z4KQfiq/Z2DVmdHHLTI2VlMm110u+hHSx+lUMVb1fF22OFqAiTUGoKkfG5Iy41c7jU9KHUhJWytY6Kgm1B7hai6sQhzoOsEL/fSZchhjNSf/dnCKo0uaIotz34zCCvTrZhYEUG8jIzZ3shi0fZ4YzfccQm1ss5q1NuPutvz6nCedHMy/LUdXXt6xe1hyB+hY0KWTxPdLjcqOK3QjyffF4cS117l8I540UUq5K8eMYROORCWZDX4yE+XxVfsDopvujPEv8SlxqI3wHxaxwV+Zp42aLFizFNzlrtgnheLw+JyzyxTHszhDT5HRVxowLwenmzKj6/RrZ9os+uVcVzqUFGculIX/ZNuT0nbmCk3shgaf28LHzQRBNQ4wtxUidh8jOJJ0OVED8XpWZPp7hZwqUkVXh6hkO6Qwq3A962QHzA66aGw0bKXwnx3M+z+Ir3k/Fc4/dHMsbUBSHeXlFQHaCCGl+U++JJ1RCPWp+1");
    imageData.append("yknr9tnpYn+QnEJMMiNvRiJD1RsVnJHN6D6KtrB42WtP4v4a4nMWmPBHWYR4fu/wstNuYOjKBMvsC/po2wEjjS+3iiupgCc8nPXo1bPRylbu7hTlyObUlROdcJndEhYusEvMVicFPC6qP9QL8XbKRzuZv8oez2fxq2x/pvjZEN8E8VVSfH4VxFd7o5N4EKzyxotQjyeudNLaJpsU75bipVhNshScQCsHArl2zl8Iamp1idlivprtk7jPxgQoZ74RA5dFlAKu1/LGs164V71xkVaXOWvdchDkbwGw+AksntdUeKLDJWEzxGMOULm7Q67HO1Lrt164yHKIttmdSWxOMlkc5GfxB3spb4UjIT6vwv4+xL/crtx2IJwxentAKa2wSfFVLB6//FaI3+alifhha/Za6UKfvIOjz8YhmanKEjVYKwVcgyFm71lMbiAiT53gCPEoO9nze5FNZnQdQVE2Ehmtk5w6CKbepuMOhL8FULO/l8Yvs9AkTTyvqbB4TLg272LxfgyUetlcSlKzW5PNWG0ORAeZzA7yuZ20/WAPxOsyfrWd8lZC/DIbxPe8R/GvQPy+cMZttX6ldDXEb8VMEuJ5ep2/1SPET1gO8XsgPoIa6UqVqr/0k8+lPG2/A+I5I1l8oSYe0ifxQhXKTvbcXvxRZlEKWLwmOEW2EJ5+T1RmrvYtABY/bqlFlDCxpsILWps8lAXxm3a1i3LEHcpw5USf4VZVutUqMZrtUvwBiF9uo3zMWFFyVPFWIb5AFZ8zYvF/gvhmZPw2iF9lq8hj8VshngfBLZ44i5lQ7qCK3ajBEb+4zaa/X+lJI70cMHb+JhbE7D3jFP11Hme7uj7C9TgL4usOmERGaoOfmwW7hxGt3hNNdB0sXtyM9lD1vh5VvFesp4hBcLMqfmebOPk8UGrC+XNJ4Q4pWyfcIrCT0WQnr8shxOeiZ8/HsfNX2uLIepHxk1Txk96z+L0QX4VSsxLit/hZeJQXkTTx4yF+");
    imageData.append("9S4zugIW7xly+Q8pBYy+FOAzYZ+X9mDqzQtNuWq284IUl7SsORC/34hJkDx+imwhXNbj1Josy0Si3UPXUd0M8UvMooQJ8Zz1ONFZb3fTxsY2zEK9YqDUZ3dCeEK2nSwWiVlEG/WabORx2mn7fgPllrN4znhV/Arr+xC/J5Rx21Zk/AqIr4T4SneUF7MQ47zEOn6ZnVbtNNFgCJeqIylGk6N/LhDy+F6lfJ07Cc7I3acgfoMqnlcCeZKDspM1u4e2oUxwKeCZoiZ42MEvrUTYIdACmSy+qtlA4xabxaojT+e5FhfgRGe91UUbdkA8JkEmK9dtfSmxJzJbky2xkdks6TFaye2wIzm6Id5GeWsdEG6L571/8cGM27b4IN5akbvZR3mVnmg+fvm8ze44ixm31EGrGk3oxb1icJJfgZC4dNkoSLyWbNOskBaCmN2n7GJZNbdSFc/tHo4/kcXv66VI0Cvu8GsTl5uJTslYRDPEcbu3tblbJ94hSgKLnyjEnxPfjeEOJUW4Lrs12SYNE0cr9fRaIN5GtfsgfplO/EoWP7TU5I9U/Chk/CiILxHivSw8ms+D4CZV/BI7rWw00kCQxbtERuvl3hTOXi4FXIO9LtrF4tdBvMh2uc7NY8kEiK9BmYigFNhsyRLiYNEOp5CtoS8RGmbR7jlpaxPEL1LF86xyLc8yIf7NLlrf0CrFY6CU0rWSYhMkM9wK4akYdOJzlkI8jo1BFuJtlIuMLxDiZTvJ4nNGKv7WXcGMUZu9Skk5xG/SxLuleAyE45bYaPkOo3qpaoOSRHz35H/ABJk+t4saT9qE+JxNqnhu9zChmvB2D1U19WB2yMdH6bClwnWZszoBRHPmmiCO6cXg53Y5qXKvKp5vZGjiN0jxa+tbxe9gwHuNEMxw7U6AcsIlRcNgtAjhTKfBTHarFWNI11DxyyEe+wrmGcpzFxqVic/aM6eMVPyonYGMUZs8EG+pyN3opdxN7mgexOTxnfStbrp9");
    imageData.append("kZ1W1/fSlbALZx6zOLRWfvyhgXeBX/e7kYnoBjxOB533OajplBVCXHx8UWby+BYaxI9/w0D1kHYx5CavQ37G77KTHwOaz8nRIbbFcwdjS8Fts9Ggz061eztpDGbBLD6PZ5UsH+LHv95FldtP08WAk1wQ6LNbyQs8NkSbReCxMuYEbsYicZhMFHGaace+DspaYhU3VvKWW+MoMyni8xZI8WUjFX9rI8RvgPhlqviNrmgedx8b3XHOzOKaAP2k2k4VO7tocX0XLW0YyhJdlHQmthfhMyvx/Pl6CxXV+Clvg8z2PNF18K00N/1HpRFXVSfNr+ukhds7aD5Tl8o8jdp2mqtj9rZ2fKadfrGhi4q5ROK4LF5kJg+yK6z09JoOWoBjvlHTRm/WnJNUt9Eb1ecSvJ6glV6vSvLq1lZ6u6aVfrG+k6ZgXpCzyibFo6fPLbdAvFWIL1jYq2RDfMFIxY+C+Ns2uIX4nA2ehHgQz4GgsjoffbwpTA/UB+mBhncBr3+M31MfQGSCdL8gIOK9jUFxWy6XxbB4kIsBkG9U37kzTHfVBSS1Abqzzk931EpmghnMNj9NB9NUpuIkTlEpq/LTnfgZk3H8HCHdKcTnVtjFzetiHHPSFp9YK+IVS4avNkGlD1cJev9Kr4j5zCZuLnick+RslEvaJbhSs5dbxeCaq4lfwhnfUz5hoUkZC/EPjFj8Dn/GbetdSslSc0XOeojfAPEsZYMrzjEHcrK5G8ElLNikRrHNpSMVLlPp+wSY0LBocWw+Hk6AiMhKvleax+VHQz0xeRv4/U5xXzYBT9nT4J49F6JzeDbJwjnbIZ0zPxf7eJZZwDWfWaPHzneRhjCJ358GWkfKLrdiQBUlJp4jxKPULJEZPxEZP+5ZW+b9IxV/G4tf51ZKIT5XEy+y0hmXUZYFlvZ+EHJV4eK4GGg1xHtwAnLXMFLcEFjicKyWCNFqlgu0far83JXpcFeSSg6zXMIZnYPsFpTLKN4j94uM");
    imageData.append("zxEZrxdvfw/iG/wZo1n8EmT8Og9neFTNyLiMsvXjWSe3Zwl4AqR97WEE8KJVbkI0R6eowRzFugqvoYsvDOngAXg41vHYoH3VAp/n2SRL158E3UnhJVxxc5qznLeHyfL0DBegnmtwF6NmOU+kIB4nY5klli9KDYs3SvGzRyh+VL0/Y9QalBoWv9YtxOdw27fOFefI2TgOP3T0MguNARw1+Ll+n/Y8HX5tPE841Mxm4bm47HMhjJ+Pw2U8eineq7FEwzwso5nFkjEc0UaO54yEQC43Uji2V/G2Xaxajl5kojELTTR6oYwpLEjHKON8o2D0PCONx8+RWS6ugDifgJylqvgFhvIJcyD+NxC/ZgTiP8MZv92bMbrCrpQuNibEs+yctTLjx83toeJnT9AnXjtLD7x6lh58NRk1HnhF7tOT2A8+/soZKp11Unw9QtR2rXysk9/ZKXv2uHjPx/50hh5IwJ/VP5evf+xPpwUPqNz/8ml6ELHwv1to3JweUa5YuJCOEzEev3/Jc8fpgZdO0f0v4bOIw3G/xovMSTVKHgCFvzpC497qluVmmUWKFxkvS82EBb0YXFHj541A/MMQ/2GIz9TEr3Gz8ChnY84aR5xLzJjXDbRmezeF/AFMWHha7yOrjWeZvMzKYEbL2zaO6dte8Zmg108r0SqOwWQpl9drNPHYnvBKJ1XvNpDP48d7PZhVegFHiVmLeM1s5uhGVMF2j5EnaD56c2ULfeRPnaJV5Vqdi/LAY8D4Vzvx+3eQFzNtA95rNDnJaAQmFyZP6navk3pBD2Pk6EjQ2Y0JGmbSCzaeoVGYc/AaDTJdzXhzLH+xKn6hKn7OCMQ/BvG31HozlJUQv9BYkV2hiXdyWya6mgnzMHlo4TtE/O/6PeT1eiWe4fAkokfF4fLQYNhLNQfVy5XHDW75QDbX6Lm9dOCEmSJBvn+Kz7h5BdSdAq8PucXCm/yHAozTKSMvJfQFPbS85iSNersXXQ6LR8sH8dlc");
    imageData.append("ct4yUOOhHor4eQnZSQ6HHgc57BK7hs2OpErC6zZBr4PWNbTT2HkmcVwWL0rOkmHEj2RwfRTiP7TNk6GsgPgFyPgK9KlrHNEcvlxZPP6ICQustO2QFRmPTLTJlULtn66k/BOWNOzin7TI76Xw6uTmfb00brFFlBfZkdgpe60Uv+eoGRnP2a0uRdhS4aUDvkEhlhF4WUEsI3CUNyr8Hjct3qIXb0uIz8NVVrffQF4XstrMywzqcgNv6zCabAL9UoLRaKWuHqtYFl657RzdPjcpPntZasa/p3ZSindDvA3ieyuyV7v4a3YQ7+AYZ0kTF1qp7rBFrNVYtNXDdHjZVosJ5GKXBSL5s5UsHoNgDg+soutQxc/rpb3HzOT3yn/opd0RGrISmbglp1vWtfGtObtYFl6iiefGgCc5aAiyV+EEQ/z2Awbyu53iJKWuSKqYh65MGtVFsu4eC8qUnVbVnqOxEM8lLHsJMl4Vn/eXFQ8pq+1xHmQ542sPQTyylu/gpCzXpmNPX8aVd+l5ZbCS7xBp4kXnYacsbvGQ8XuR8Zy1nMlDJafeikveHZLbnKW8LLyk8gTdCvHcroq2D11UQvz+bvJxxpt4JXIY0UK2FM3CBUaOFuo2WJDxNlrFGT/HJPp/TXw2Sk3eIqtYnXzv4msgvhzi56PGr1LFc/1l8RhkJyywiK/HsTyWqJc6HIksVRHivS7azHeIFkrx3PJx15HFfTWXmiMmsXrIK4962ZpcIVtkaupNC469RpvIZiH+rR4hXpthZvFECTW+bl8XxGOwZPEJ2VYRtcxOyDZaBL0qXQYzeRwsvlUVb5fi0fZmL5YZnz+/Zxk6NmXscyOcQAnx1a4MZZkF4pHxq5wsPJqD2pi9isU7afx8M9UcMIubGSbL0Es/BfW1xP1LLgWQFURGbm4ySPG6do/F58/ppd0tRvJCnhCvy2itLAisw9wh4ltzkMVSF28+LsXjd84ut/BauRCfA/G1EM/lgpd8pWQp");
    imageData.append("XC9bE93by5jR0ZhF7Oo2kdtupZU1rTRmtprxi81/IfHlLL6nInulk4VHeVAS4iFp/DwLxJtQR11CYsqN4XR0GaphhKiAx0mb9kL8Ap14/AFZPItE7737cK8Y/Lhep8hOiE6WB32JELfmICoh/k3D8OKbu5C1drSTN89svXBBj6QT4l12C8SfhXijuJIS4rnUJMQbldvfk/gqXcZDfBaLh5jslbLUjJ9rpur9JiGPByfttlkyJpFlQJetVr7xAPFuB23c201jMRvkMsbSOXNYfP7sHtoF8bxuz5mYkKxGTbC4FSfKQjJbxR0idfBbtOlYUjxmqjylz1rB4rtpW3OnKBd8YyMhWxWdIlzINuGYSTq6jOS0WWhF9Rm6/W2d+CUy43N5cIX4CYuNytjn7Zn3jWTJICF+KcTPQ8avcHKWQDzXR1ucu5vxGMmrmnvFjQ0enPR34ocjpRxwKcBnfC47bdwD8fN14vEHZOHKysfgt/OQQdxQNhrTBjyuw6rgIQOfmrGGHlmDF208Sh/lCc6aNPFvdlNNUweyVnYoUrYus1XhCdkGSbfBiGik9s5eclrNtLzqDCaA6eJNsVwMrpMW9CwbM8ekjP61PfNza0cqfgvEL4b4uRC/nMXbosh2/NIQD0njIH4rxPPlzAOZRc3AdyORpWZ5l57Fb9jdJSYgXMbEKuAKnfgDUjzX6xTBQrIUnFIWVHhfNySx+IU68aLVK8fxl0P8G91UvRfibXKgHC6rNdEpdEvaOnrJYTElxHOrmrXIHM9m8Yuk+AKIH/u2SRnzK3vmX29+z+J7K7KWO1i4FL9cFY+RfEtTj5AnBqe0LExhmNe4rnohZv2uTog3polHP48avAPinXZZr4cTrGXpkEwFXQY5+C3YAPGvd4vJWTbqL88s8TdQNsRX7WkX5aKTszmR1UNFd3X3JumSsa2jh+wWIy3feprGvNU7jHiLyPhbIf5WiP/yphGJPwLxfoh3Q7whKX6FTjxG8koM");
    imageData.append("jF6nrJFDMjIdXYaKUoDPeBxWiO/ABMQoemt1TZvHE8pFXW5An+20yXqdrL3DiFYHPM5YjU4I42xesOFIQnzWUjOvldNEIb4L4tvIYeWBUpaP9KweIhx0dvUg9tC59h6ymY1UvvWUKt4mxWMWnqUTfxvEj4L4h0cm/pByS2UgQ1nkUUrmQHy5g4VDPF+mOvGozzyJ4BqZLja9DKRnbDfXYEhdtxPi0TqKgRvSmSycBCEe7Z7DipPEpeAmotNLg0ZnF9dgiF/fQh99TSd+WVL81t1tolzwQPk/yU7QKWltM5DN1EvlW07RaH3GLzZT9sJkjR+lZvyX3p94vkytcZ7ojHvbRJt2dYmWimvkkCwcIik1I7kUuCBmbWN7qnguBSLju2k7ug67RfbMWhkYUgoSGdorYGH8vANyHPjsvHWH6aOvdou1+Kwlqniu87gKtuxsJbtJDpScxYxeLtPRaaCOjnS66ey5brIae2hZ5Uka82avLGELk+Jz1BqfED+yGo9SU4lSs8illLL4ZQ7+l3NRro1Z5dZ4thBvpE17DORADe4wcOngL/nIL/oko6Q7gTlBB06WAxm/didq/Bwjt6lCOjNxpSp+fxdZLVbx3q4exiQxaJjF91u4RkuMEpyotk4j2SwWmo9ScyuLX5UqPvt1/n58O5oCM51DxrcjsyW8LWnDCWmD/HNAbKOunwMcTyPjTUYjLeManxBvimfpMx7t5G2YQI1CH/+lEffxlY4MZaEJ4nsg3o5fVoqfuExm/O2c8Q3tFLL2kKmrm2wGA1lT6E5g020zFmDs7qagxUDrt/PMTyd+mZzgZKM8NOw6Rz4z/sBOfKab6UqCn2np4sh0ptFFve0dFLB004LV++nD+ozHAJsF8RNfQ42vP0U+E97b0UHmTsBRQzxvJ1O7Djw3treRqa2NulvbyGfsoOUbjtFtbyTFZy8yU9YCZPxCWWpumw/xv4X45SMS36Z8aLMzQ1lgVkpnQ/xSVTz/wsh4");
    imageData.append("lBvxbayvLuuiny85Tv+++Bj9RGPRUURGv+8Y/XixDjznz/x8yTF6bNEZmsgzYs5Cls6LTDh+PuQ/vrBVHO9HCzWOJPg3jQUt9MyCI/TMQhV1+wfY/3/wmYdfPyY6JnFSueNgllopDyfgy/NO4r0t9L35LfT9ecxh+p7gkIr2/DA9hedPzU3y5JxD9IP5h+lLb5wi/sdnaqYPFb8A4n8H8UtHIP4RzvhNLN6UFL8M4llMuS0+kb+ss95J02oDNLXK/97Z6qcpW2Usqw7IgY+Fc9YwKAd8o7q0JkBlW/wJSnWUqBQzlZKiBD4qBJM2+2gK//stTPgmLpbCszjjIYm/XFqA9+Rt9FH+RhnzNnoFuRuS5DDrhydrnZcK8TMKMCZNxOwb0uNZQrwR4tWuRi01X1wwAvGPv4I3bYH4eWalZLZh1cQlQnyMpXCp4To/EX/ABNEhWN8zfMUIxPEsApYtYDE4CXx8fq7V/ZvBx9C2+XKX2xZRy0U9R3mZCNHc0XCpYSYi63lfjlp63hV+z03I5eMtMgnp3NFgO1380o++3aN89L/tmV/d0Jaueejj5eeqlVEvODNHvW1VSl7vmi/EL7XEICQOSYIsAU7CUosksW8Y0l/XPiP2q8dcOpSspbrjD8eSkWIWTOSIaT2ki5i12CK2E8iMFTEVUyoLkyTen9iHY8yH+AU8uBpn5y22K9mvtGemOx76+MZWRfmXaqXgv45mTHuhXSn93ekfZM210YRyC5caKVtkpywJMqZv/7mkH0/3XJQJhq8KLXImq1eJ2E57LjLcopLM+FTU13niIzAPA2e0HnMaJm4lZVfDLDBGs+dZqfCNru9Ont+r5L/cmvHh7+9VlCf3pttOezzUpJR8u1bh/y/jgw+/Nib7NyeOj33TSOPmGW+Mn28C5lgS0zDbHG/Gu71Pvy/5MyZwnKduz5OMn2dCZOT2u8HvGz/33Zmgfz6HMYo4QcQRMJvpvTHurZ4b417roazfn225");
    imageData.append("/yerRrHD4mdDirJyJP+Xyx8tVSb+cIWS+6Mtt5R8p0YpemJtyfintx+4/Sf74rf/5yG6/eeA43Dwa3rS9/3n4aGfuSnv5b3vws906Pelv36zz9zs88Pxk+b4+Gd27C38YXVhyW93Klm/2HDLxDfrFeWVEfxX+PiR9ZNNSv6fDiilzzTcMv0f5yiPKUpm/pde+1L2I3N/mf3Y3OeyHp37XLZg3nM5j8rnObpt3i9J39ae6/e/23v5ePJ51qNzxLb2szkmfw/9sVOPJz73SNqxH5mjbnNUf4Z4j7aft2dj/2zsT4Pfw58Xx+Bj8/45z+XATf6X3/jiE4qSUfb1FqXop023ZL3SqEz4/Qj+bwkpjw5Ssl8gZeI3Vt7C/3PYos+/pOQ+/Ccl50uvKjkPvyojyNXFPHX7L88rQP3ZN4N/J93vlfLZh/nz+ufa36E7Jr+Hn4vj8PbL6vM0+PdI3wfYTfHfviT+R7rj/3nZLRN/dVBRdo2gmxnuMf6XB5Uxn/u2MuVbjysTvzr/QzgJmROfWJU5gSPgmKWL2rZ437CsGmbfzdDeq8UVN//8EzfZ5vcnnvO27lhim495s5/B22l8fej2hMRzfO5rCz5U8rVnlVGf/oIy9r/mput8j49Hf6Yo8xGfXq8ov7uhKH/EQPGHuKLgavgAki7Yye/egaMKuHoKzv4h3eL7eHx/zQfihyMh/oZ09MHjg8cHjw8e/3se/xdgJH5GfCu0NAAAAABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagea8cd21a94b94a6ea2b21ce7b3ff033a7 = new WeakReference<>(result);
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
BufferedImage imagea8cd21a94b94a6ea2b21ce7b3ff033a7=getImagea8cd21a94b94a6ea2b21ce7b3ff033a7();
if (imagea8cd21a94b94a6ea2b21ce7b3ff033a7 != null) {
    g.drawImage(imagea8cd21a94b94a6ea2b21ce7b3ff033a7, 0, 0, null);
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
	private icons8_table_94() {
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
       icons8_table_94 base = new icons8_table_94();
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
       icons8_table_94 base = new icons8_table_94();
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
        return icons8_table_94::new;
    }
}

