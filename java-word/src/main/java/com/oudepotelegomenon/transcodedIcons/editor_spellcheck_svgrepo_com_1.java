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
public class editor_spellcheck_svgrepo_com_1 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image31bcafc10bab8a12d3f16a91e1eb7493;
private static BufferedImage getImage31bcafc10bab8a12d3f16a91e1eb7493() {
    BufferedImage result = (image31bcafc10bab8a12d3f16a91e1eb7493 != null)
        ? image31bcafc10bab8a12d3f16a91e1eb7493.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(12156);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAYAAAAGACAYAAACkx7W/AAAjZElEQVR4Xu2dCbQsRXnHPxAjIvgAUVQgHkGjCZpgXFERjEvcQYOomJMgGA0uyAFEXFBEVGIILkFcUTQQTSIKRmNQMS9x3+KCASOKBBdEUBFZjFEqVa/u49371dy53dNV1V93/36/853zztyZ7urqfvO/t6amWsQhIuIkTR5ARMRpmDyAiIjTMHkAERGnYfIAIiJOw+QBRESchskDiIg4DZMHEBFxGiYPICLiNEwemO1bKIqiqEHV2iYPzPYtAgAAw4AAAACYKAQAAMBEIQAAACYKAQAAMFEIAACAiUIAAABMFAIAAGCiEAAAABOFAAAAmCgEAADARCEAAAAmCgEAADBRCAAAgIlCAAAATBQCAABgohAAAAAThQAAgMHi5C6+HuJrf18H+zrc10t9nbTh/cjJe3x92Nd5vs7xdYavU339la+X+Hre0uvC6//Y1+/rXYwaAiAzTm7lax8DtYtuWq+k7bNee/raw9fv+NrZ1/a+ttSHBZVwcgdfj/T1Al9/5+vLot998voZiW+Oh/p6gK+b6yaNAgIgM05OTHqlH8/RTesV3bphe42vy31d7Osbvj7v61yJ/5mOlvjb5B/6uqXuBmiIk90kvtl/0tcvNvR6/37L1/t9HSVj+UuBAMhMfGOw4q1183pDt2w6XunrU77eLXHI4Um+7qq7ByRcI7v7epmvryS9aNPLfL1L4jndTh/OICAAMuLkEUmP9OsRuom9oVuGl/p6h6+n+rqN7q7JEIfZTvB1YdJDw/LXEoeNwucP9/G1uT5UkxAAGXHy3qRH+vVC3cTe0C1D7ad9PdvXDrrrRoeTzXwdIOXH8fs0BPwxEj47sgwBkAkn65LesOEeuqm9oFuF8wyfJzxFd+EocPJMiZ+dTMm3+bq77goTEACZiBe2RV+vm9oLulXYxG9LnIUy7BkoTraW+OH4D5MjnJbhA+0n+tpC");
    imageData.append("d1FvEACZiB/0WfRK3dRe0K3CNl7h6zDdpYPAyXG+rk6OaNr+wNeLJUwZ7xsCIANO7pj0hC33002ujm4RLmL4oHRv3bUmiTN6whRZXN0wnTh8Ia2/zwkIgAzEWQyWPUs3uTq6RdjF8EWorXUXmyHOhMHmXu/rZOlj2jYBkAEn3096wp79/rmpW4NdvUTCl80s4eROvr6QtBTb+DpfO+quLQYB0BEnD016wabP1U2vim4N5vJw3dW94OTIpGXYxbBeUfkP/wmAjsTFpYbgl3XTq6Jbgzl9m+7uqoQhRt0i7OpFupuLQAB0IE5vC+N3Q3F3fQjV0C3B3J6uu7w48foPq2xifp+tu7sIBEAHnByS9IBtT9KHUA3dEixhWPq4zhzzuOrtfyYtwBxe62sr3eVFIAA64OTfkx6w7eX6EKqhW4KlPEV3fXbi0sxhZUws42t1lxeDAFgQ+3P/V/NR+lCqoFuBJX2q7v5sxPn9U/9Gb2nvpLu9GATAgjh5eXL0w/Af9KFUQbcCS3qdlFiv3sl9ff0s2Rvm9J91txeFAFgQJ99Njn44bqsPpzi6BVjar+tT0Il468XwzVUs68N11xeFAFiAeMvAIXuoPqTi6BZgDfN89yPO9vlmsnXMbf3l2wmABQhT7vSRD8vP6UMqjm4B1jAswtZ9eYEwLKG3jCV8lu764hAALYm/DYUx1qFb97aEeu9Yy7frU9GKeBtLLG/4bOUWuvuLQwC0xMmfJkc9TE/Uh1YUvXes6R306WiEvVucjtmTdfdXgQBoyXi++Vj3OwF671jTV+rTsSZOdvX182RLWMpd9SmoAgHQAie/nRzxsH2YPsRi6D1jTX+sT8dcwlCEk/OTrWApz9GnoBoEQAucHJsc8bA9Ux9iMfSesbZP0adkVcKSIfrVWNKH6FNQDQKgBU6+kxzxsA0L2a3Th1kEvWes7fv1KZlJHPrBel6gT0FVCICGOHlgcrTj8On6UIug94q1vUqfkpmEoNCv");
    imageData.append("xJI+Q5+CqhAADQnT6fTRjsNP6UMtgt4r9uG99WlZgZO9kldgScPUz/I3fZkHAdCAcJLil2rGavnFp/QesQ9foE/LCsJNg/QrsKSv0aegOgRAA8LqivpIx+UJ+pCzo/eIffg+fVpuxMlBybOxtL+tT0N1CIAGOPlYcqTj8ge+NtOHnRW9R+zD2QvEhZuPhKmi+tlY0rP1aegFAmANnOyUHOU43Ucfelb03rAPr9enZQNOXpg8E0u7jz4NvUAArMF0/nO8Sx96VvTesC/TYQdu8FLb8/Up6A0CYA2cfDs5yvG6jT78bOg9YV/eT52XJybPGL4/kTC/3sknJN4n+bW+XiXhlxwn5/r6qq8fqdfU9C9WnIM+IQDmEP6z6CMctwfpLsiG3pMdw32d169SX/T1374uk/HcDGXlDUficQ7dsDrv2b7+TNp+sdHJ/X0dLXHJ6xp3Owvh1O/Uz+UQAHNw8ubkCMftet0F2dB7smJbnOwgYdpsmFPv5ABfp8qwbpD+J8uO5W7JT4flR3w9ZtnZ6U64laaTF0n4wFzvLY91V+FdCwJgFZxs6esXyRGO3zvqrsiC3osVcxFvmRiGGayvoPm0ZW0e6i84F/l69LLeL4OT3/V1vOQN+PQzmD4hAFbByZOTo5uGx+muyILeixVz4+RByT5sedhSO9fJ8G5sdK2vI1WP18HJH0lYtVO3qJ2rfw+jLwiAVXDyoeTopuF3dVdkQe/FiiVw8u5kP3Z8/lIbD0t+YtvLpfZd7Gbh5Hd8vUniQoptfZDeXO8QADNwcpvkyKblXrpLOqP3YMUSOHlesh87xhko4b7Q+id2tfHmvxwnt5J4u8wwQaCJX9ObMAEBMIM4K2DKvkN3SWf0HqxYAidPSPZjx9C27ZNH7XqFhLF4yzg5ROK003keol9mAgJgBk4uTI5sWoYPv7fU3dIJvQcrlsDJM5P92HFvGc7nW2GYxfab/3LCjCQnH0+OIkz9tAoBoIjT+zDMqc6J");
    imageData.append("3rodt9BN7UxYXE/vxY67+3pn8qhNj9BdOwic/J7EL539auk4Xq2fYgYCQOHklOSopunHddd0Qm/diiWI//mtuqMMY+mHL+tuHRxObi9hyeewnphVCIBlOLmp1Pk24BC8QcIFnAu9dTvm/QvAyW5i+/sjeySP2PQeumuhAATAMpzsnxzRtH2J7qKF0Vu2Yk7iFMGcXxrKbVjXaggTHE7SXQuFIACWEdcDwU1+R3fRwugtW7Er8SbqYUmItyXbtme4rWlYIM262+luhkIQAEsw938176+7aiH0Vu0Yvup/XIsKzz9D4kJxlod6ZvmM5BF7nqkvHSgIAbBEmHGgjwaDb9VdtRB6q9iHT0oeseeD9aUDBSEAlgg3adBHg8E83wnQW8XahmWtwxeWLHuRvmygMASAhGO7R3IkuNwDdZe1Rm8RaxtWKg1TEi17tL5soDAEgIRje31yJLjcc3WXtUZvEWsapvTuIt1XsyzpbySsrwN1IQAkHNuVyZGgttt3AvTWsKYfWjoH30x+YsfPqisGajD5AHCyX3IUOMtjdNe1Qm8Na/qoAZyD16srBmpAAMgHkqPAWV6ou64VemtYy0uW+v/OyU9smXftKWjGpANgWMviWvBeugsbo7eEtXzhUv8/OvmJLX9PXTFQg4kHwHOTI8B5vlF3YWP0lrCG4WYl2yz1/5HJT+14vbpaoBYTD4AvJUdgw6uTR2z4U92FjdFbwho+bln/n5T81I7/sexKgZpMNgDCLeZ06+14YPKIHffXXdkIvRUs7cobkDf9j96Pr1vRVqhH0+sieWC2QwoAq78Rxd+yw9x7/RMbflj1ZDP0VrCkV0lY939l/5+ZPMuOh61oK9RjwgEQbjRt0Tcvte+g5Cd2XPnm0gS9BSxpev9Z218CYwZQX0wyAOK9O62691Ib1yU/seNRqkfXRm8BSzn7/6DtZaD31c2FSkw0AN6XtNyG31ft/GDyDBuev6KdTdBbwBKeobv9Rpx8IXm2");
    imageData.append("HR+kmwuVmFwAONk2abUdT1Zttfxh8B4r2roW+tVYyvgXpMbJBckz7fj7urlQiQkGwKFJq+14H9XWrZNn2LHdV/f1q7GUYfnuP9Td7x+7NHmmHe+gmwuVmGAAfD5ptQ0v1k3dgJN/Sp5pwyt1U+eiX40lvULC/YlX9n+YGWTVdSvaCvWYVADYnvt/gm7uBmzfqH4/3dxV0a/E0v6Pr50G0f/QHxMLgBOTFmMXz9ZdvCr6lVjD8JfArc33P/THxALA6tz/IRvfYNZCvwpr+cGl/rd7A3voj8kEgJNHJq3FHB6uu3om+lVY02dI/GvAqjvoywUqMaEAeG/SWszhf+qunol+Fdb0Wl/XJI/a8Y76coFKTCIAbH+rdgzurrs8Qb8CcZN305cLVGIiAfD0pKWY05N0lyfoVyBuck99uUAlJhIAn05aijn9se7yBP0KxE0+XF8uUInRB4D9e6GOxcforl+BfjbiJp+gLxeoxAQC4FVJK7GEZ+muX4F+NuImD9KXC1RiAgHw/aSVWMrtdfffiH4m4iZfqi8XqMSoA8DJQ5MWYkmfo0/BjehnIm7y/fpygUqMPADOSFqIJf2iPgU3op+JuMnv6ssFKjHaAHByS1/XJy3E0t5Vn4oN6GchrpQVQftgxAFwSNI6rOFr9KnYgH4W4kq5K1gfjDgA/j1pHdbwcn0qNqCfZcdwnaxfo8JzviphqMLJT298Jeb0MH3JQAVGGQBOdk1ahjV9hD4lyTOsuChObu9rL19/LuFeDk4+mWwb2/gO3cVQgZEGwHFJy7Cm79WnJHmGFXPj5LESPgzX+8G1/KHuSqjASAPge0nLsLbbqnNi01I4eXKyL1zL9C9HKMvoAsDJg5NWYR/+pTovVt1iRTtz4uSIZG84z/QvRyjLCAPg9KRV2IefVufFpqVx8tFknzjP7XQXQkFGFQBObiHM/bfkpht96J/YsdxfAAEnT0r2iPN8tu5CKMjIAuCgpEXYp69adm6sWjoA");
    imageData.append("uBVpO8PaXVvrboRCjCwAzktahH36vWXnxqalcfLAZJ+4lq/X3QiFGE0AxHnZNyQtwr592NL5sWrpvwBYkHAx76u7EgowogA4NmkNWvCMpfNj09I4OSDZJzbxv3RXjo54r/Kb64erMqIA+E7SGrRg+FB+6+RRK5bGyYuSfWJTj9XdOXic7CBxnbKNs8PupJ9SlVEEAOOs1rW8MF/pIaAPJnvENq5+j4mh4GRnX8+TuKbUb9TxEQCdcfL2pCVoyf9IHrFjuQCIv+1dl+wR23qU7lrzONnN1wt8fSE5mpUSAJ0IY2hOrk5agtjEkjh5Z7I/XNTjdPeaw8k9fR3v6+tJ61eXAOiEkz9NWoHY1BI42UrC6pZ6X9jVMG4++4ZDfRDuge3kQIkjEFckrW0mAdAJJ+cmrUBsak7iX6NPlbCypd4P5vQUX7fS3V+csE8nj/b1Sl9fSlq1mATAwjjZKWkBYhu74OTuvvaVOAX5Y8m2sbT/4utQCe8DuYnLyoSFJY/x9QFflyZ7zyMBsDBOXpi0ALGdTe4IFirc8OV8iUuN/2LptUP3w8kjwzXcg+E4iTMCb6/fKlYlLFvu5AG+nu7rbySGyiVq2yUlABbGyUVJCxCxiVfJuL+lHL5/cqHEN/Q3SliXKn4u8yFfn/F1sa9r1Gv6kABYCCf3S/aOiE09b+n/0Q+Sn2BNd1PvbHUZcAC8Odm7LcOHRfv0UOH+tIhrGb9lG+bY659gTfkLoDVOthQbf76t5id0k6sRxzQR13KvpeslzFz6WfJTrCV/AbTG/v1WD9FNroqTs5IWIW7yOnW9hJku2I/8BdCa+MGOZVfeEL02Th6ftAhxk+9T10tYrO/K5FlYQwKgFU52TPZqy7N1k3vByU+TliFG99WXi3/sJcmzsIYEQCviAkuWfbJuci84eWvSMsQ43n9TfblI/Cyg1JedcHUJgFY4uSDZqx3Dyo/93uBhIyyRjbN9g75UbsTJ45JnY2kJgMY4uU+y");
    imageData.append("R1ueqZvcK/EG24jLvbe+TFZg//O1sUkANCZ+o8+yj9ZN7pW4aBXiRj+rL5EEJ7sI9zCoKQHQiDBuaXu+cvjQ9Sa62b3iZNeklThl76EvkZk4OTJ5JZaSAGiEk/2TvdnyzbrJJsi3bC0O2/foS2NVnGzu61PJFrCEBEAjnPxzsjdbxm9WWiPeixSnbVj4rfkKmQEnt/X1o2RLmFsCYE2c3DrZky0v1U02g/2+w/IeqC+LRjjZO9kS5pYAWBMnhyd7suVrdJNNMa5137GdZ+nLoRXcc6O0BMCatLvJch/uoZtsCidPSVqMU/ByXzvoy6E1Tv412TLmkgCYS3hz1Xux5YW6yeaI3/Icy12ssJnhhij315fCQjjZztfXkj1gDgmAuTh5XbIXW8Z11a3j5PSk5Thm0/V+uhBviE4I5JcAmIv9VQp31U02iZOHJS3HsXqwPv1ZiCFgfTh2aBIAq+Jkv2QPtvyCbrJpnFyWHAGOzWfp056VGALfSPaKi0oArEpYWlnvwZaH6yabxslJyRHgmFxsumdb4tRiQiCPBMBM4q0Nf5PswY43+LqNbrZpwlIA+ihwDP7S18P16S6Kk3XCwnE5JABm4uS5ydZt2d99f7vg5L+SI8Ehe7Gv++nTXA0nL0pahG0kAGZifw2bMh+0lcb+DXWwuSfq09sLTh4q9idrWJUASHBy12TLtvyVhPuoDhEnO0kcvsLhGm6KZOvLh2E4NCw4p1uKa0kAJDg5OdmyLc/RTR4UTv4tOSIcguEXj5fLrFs6WiF8FuHkkqTluJoEQEL8CrtlD9BNHhROnpYcEVo3DIneTZ9Kk8Rvnp+YHAFqw7fzd9LdVxVzAeDksclWbRm+Yr+lbvagCMNX8bdJtG2YBReWQX+Ur830aTSPkzv6Ok241pb7v74+IPH+JjfTXVYdgwHwvmSrtjxDN3mQOPnH5MjQiuELe6+QcHvGMeBkZ1+nSpyuOkXDZ27rff2FhOmzljAVAHHuv/Xf");
    imageData.append("Fmzd93dRnDwuOTLs0/Am8XGJvxluoU/XKHCyo6/X+ro2OfrxGUYKwjLsz5DwxTmrGAuAZydbtKW9+/4uiv17LI/d/5OwlEic8PAECUssTAUnt/T15xLfIK3/wtfGKyQuuvh4X1vpwzaJsQD4XLJFW56qmzxonJySHCGW8jqJv+G/zNcfSfigFMI1GL5RfLCvjyY9NizDFyxvoQ/PPGYCwMnvJluz5wN1sweNkz2TI8RchplsZ/k6wte9ddfDDJxsI3EaaZjqGsLymqRX+/Wrvt4g8fOZWa6XoU0QMRQAt/O1j+kaI/oYqSb1IF/3lXizovCLy64Sv2AXVsoc5hcEreLknr4O8/W3EheHDNNhS92sPgTOhRL/Gnm7hHt9xCnTD5aN59XJM5NXrTQE13BCwEwAAAC0IU4zfYCvR0gcdz/Q1yG+nuPr+b5e6uslS/8OIRLevA+SeIvU8PwwvTYE+h/42l5vfgVheMfJ34t+x5vtcEKAAAAAmIOTu/v6VvJuN9/zZAghQAAAAKxCnLsfpnQuov0QIAAAABRxyOfM5B2uvSEEfktv3gwEAADAMhYb8pnnR8RqCBAAAABLdBvymafNECAAAGDy5Bvymae9ECAAAGDS5B/ymaetECAAAGCyxMXaamvnhlIEAABMjjpDPvM8Ryys+koAAMCkqDvkM8/+Q4AAAIDJ4OTpEldmtWK/IUAAAMDo6X/IZ54hBPq5zwgBAACjxs6Qzzz/SfoIAQIAAEaLvSGfedYPAQIAAEZHu+WbLfkP+lCKQgAAwKiIQz4XJe9Ow7FeCBAAADAa4g1hhjLkM88wHLS5PrzsEAAAMHhsz/JZ1DOkdAgQAAAwaOJ9ma3P8lnUsiFAAADAYImzfEos32zJ0/VhZ4MAAIDBEYd8/i55Bxqv79JdkAUCAAAGxbiHfOYZhoM2093RCQIAAAbDeGb5LOppkjMECAAAMM84Z/ksar4QIAAAwDTTHfKZZ54QIAAAwCxODpZp");
    imageData.append("D/nM8zTdXa0hAADAHHHI593JOwxqT9Fd1woCAABM4eRuMuy1fGq7n+7CxhAAAGAGhnzaeIOvo3UXtoIAAIDeYZZPW3/l64m6G1tDAABArzDLp61X+9pbd+NCEAAA0BsM+bT1Ml+7625cGAIAAKrDkM8iftPXzrorO0EAAEBVwm+wTi5M3j1wnp/yta3uys4QAABQDSdP83Vt8s6B8zzb1810V2aBAACA4ji5uTDks4inSo4lH1aDAACAosRZPhck7xY4zzDH//m6K7NDAABAMRjyWcQ8c/ybQAAAQHYY8lnUfHP8m0AAAEBWGPJZ1Lxz/JtAAABANhjyWdT8c/ybQAAAQGcY8uniZ3yt011aBQIAADrBkE8Xy83xbwIBAAAL4+QgYchnUcvO8W8CAQAArWHIp4thjv+Rukt7gQAAgFYw5NPFenP8m0AAAEBjGPLpYt05/k0gAABgTRjy6Wr9Of5NIAAAYC4M+XS1nzn+TSAAAGBVGPLpan9z/JtAAABAAkM+Oex3jn8TCAAAWAFDPjnsf45/EwiAAVDiVnAAs3DyZ8KQT1eP0N1qFgLAME5u4us9vi71dU/9Y4BsxCGfdyb/o7GNv/S1r+5a0xAARolv/u9f1rfhCyQ2vj0I44Ihnxxe5WtP3bXmIQAMkr75L/dcsTyrAIaFkwN9XZdcZdjG7/m6i+7aQUAAGGP+m/9GGRKCbjDkk8tv+Lqt7t7BQAAYotmb/0b/z9dRehMAa8KQTy7X+9pGd++gIACM0O7Nf7lhSGg7vTmAmTDkk8t/9HVT3b2DgwAwwOJv/hv9oTAkBPNgyCenJ+nuHSwEQM90f/PfaBgSer7ePIAw5JPLsI7/obp7Bw0B0CNOtpA8b/7LZUgINsGQTy6HN8e/CQRAT8Q3/w8lPZjHMCR0P71LmBBxyOcdyZWBizjMOf5NIAB6oOyb/0bDkNDRetcwARjyyelw5/g3gQCoTJ03/+UyJDQlGPLJ6bDn+DeBAKhM");
    imageData.append("XCK2tuFuRPfXTYEREYd8Tk/OPC7qv8nQ5/g3gQCoRP3f/LVhSOgFulkwAhjyye045vg3gQCoQP9v/stlSGhMMOST27/WXTxqCIDC2Hrz3yizhIYOs3xyO745/k0gAAoS/oy09+a/0TAkdIwM4a5FsBKGfHI7zjn+TSAAChHf/D+a9JA9PyEMCQ0HhnxyO945/k0gAAownDf/jTIkZJ045HNacuawi+Oe498EAqAATj6c9MwwfLE+FDCAkzv7Oj85W9jFr8nY5/g3gQDIyPB+859lGBLaQR8a9EQc8rkmOUvYxfUyhTn+TSAAMjGON/+N/kgYEuoXhnxKOZ05/k0gADIwrjf/jf5awpAQs4TqE4d8mOWT37/SXT15CICOjPPNf7kMCdWEIZ8STnOOfxMIgA442dLXR5JeGJ9hltBe+vAhI3HI5+1Jz2MOH6+7G5YgADrg5GNJD4zbl+ougAwwy6eUPxcWQZwPAbAATm4mcbXAKcqQUE4Y8iklc/ybQAC0ZNpv/hsNs4QeqLsGWsCQT0nHv45/LgiAFvDmv9wwS+hYYZZQe5jlU9L1whz/5hAADeHNfzUZEmoDQz4lZY5/WwiABvDmv5YMCa0FQz6lfbXucmgAAdAAJ69KjhRnySyhWYQPI518PektzOWzdJdDQwiABjjZytdnk6PFWX5SGBLaBEM+Jb1eprqOfy4IgIY42drXl5IjxlkyJMSQT2l/4uteutuhJQRAC5ysk7iMLK7tb3y9zNfmuhtHD7N8SnuJr910t8MCEAAtcbK98J+7jdMaEmLIp7Rf8XVr3e2wIATAAoQL0Mm3kqPH1Rz/kFCcKfa25Mgxp2Hpla1010MHCIAFcXI7XxcnPYCrGYaEjpMxDgnFIR9m+ZT1DF830V0PHSEAOuBkFyEE2nqerx11Vw4WJ0/x9YvkKDGnr9DdDpkgADriZCeJH0phc6+QoQ8JMeRTw/BX48G66yEjBEAGCIFFDP+5Xy5DHBJiyKeG");
    imageData.append("YY7/I3XXQ2YIgEwQAosaZgkNZ0iIWT41ZI5/LQiAjBACixqGhB6su9MUDPnUMvz/YY5/LQiAzBACixqGhI4Xi0NCDPnUkjn+tSEACkAIdNHWkBBDPrVkjn8fEACFIAS62P+QUBzyeWvSMiwhc/z7ggAoCCHQxTAk9ArpY0iIIZ+anqC7HypCABSGEOhq3SEhhnxqyRx/CxAAFSAEulp+SIghn5oyx98KBEAlCIGu3iBhuKDEWDFDPjVljr8lCICKEAI5DHdmyzckxJBPTcO1zxx/SxAAlSEEcth9SIghn9oyx98iBEAPxBD4TtJ72MYwJPRKWWRIiCGf2jLH3yoEQE+EYQxCIIdhSOh2untXhSGf2jLH3zIEQI8QArn8qaw1JBSHfJpd7JjL4/VpAGM0/T+RPDBbAqAthEAuw5DQq2XWb5sM+dSWOf5DgQAwACGQ05VDQk72F4Z8asoc/yFBABgh3mOYG83n8Upfj/P1puQnWNLQ7/fWlzYYhgAwBH8J4HC9RJjjPzwIAGMQAjg8meM/VAgAgxACOByZ4z9kCACjEAJoX+b4Dx0CwDB8MIx2ZY7/GCAAjMNfAmhL5viPCQJgABACaEPm+I8NAmAgEALYr6zjP0YIgAFBCGA/fluY4z9OCICBQQhgXb/oa3t9GcJIIAAGCCGAdfwXX1vqyw9GBAEwUAgBLOtpvjbXlx2MDAJgwBACWMaX6UsNRgoBMHAIAcznr309VV9iMGIIgBFACGB3r/X1UH1pwcghAEYCIYCL+2Nfe+hLCiYAATAiCAFsb5jjfwd9KcFEIABGRgyBbyZnBjGVOf5ThwAYIU52EEIA58scfyAARgshgKvLHH+IEAAjhhDA1GP1ZQIThgAYOYQARpnjDykEwAQgBKYuc/xhNgTARCAEpipz/GF1CIAJQQhMTeb4w3wIgIlBCExF5vjD2hAAE4QQGLvM8YdmEAAThRAYq8zxh+YQABOGEBibL9anGGAuBMDEIQTG");
    imageData.append("IHP8YTEIABBCYMgyxx8WhwCADRACQ5Q5/tANAgBuhBAYkszxh+4QALACQmAIMscf8kAAQAIhYFnm+EM+CACYCSFgUeb4Q14IAFgVQsCSL9KnB6AzBADMhRDoW+b4QzkIAFgTQqAvmeMPZSEAoBGEQG2Z4w/lIQCgMTEEvpGcdcwtc/yhDgQAtMLJdkIIlJQ5/lAPAgBaQwiU8mxhjj/UhACAhSAEcnuqr810NwMUhQCAhSEEcniDr2N01wJUgQCAThACXfyVryfqLgWoBgEAnSEEFvFqX3vrrgSoCgEAWSAE2niZr911FwJUhwCAbBACTQxfpttZdx1ALxAAkBVCYJ6f8bVOdxlAbxAAkB1CYJZhjv/NdFcB9AoBAEUgBJbLHH+wCQEAxSAEwhz/o3W3AJiBAICiTDcEmOMP9iEAoDjTCwHm+MMwIACgCtMJAeb4w3AgAKAaMQS+mlw14/ECX7vowwYwCwEAVRnvXwLM8YfhQQBAdcYXAszxh2FCAEAvjCcEmOMPw4UAgN4YdgiEOf5H6UMCGBQEAPTKMEOAOf4wDggA6J0YAl9Jriab/tzXPvoQAAYJAQAmGEYIMMcfxgUBAGZwckuxGwKs4w/jgwAAU9gMAeb4wzghAMActkKAOf4wXggAMImNEGCOP4wbAgDM0l8IhDn+R+rmAIwOAgBM42RbX19OrrSyHqCbATBKCAAwT72/BFjHH6YFAQCDoHwIMMcfpgcBAIOhXAgwxx+mCQEAgyJ/CDDHH6YLAQCDI18IMMcfpg0BAIOkewicLMzxh6lDAMBgWSwEwhz/Q/WmACYJAQCDpl0I/NLXvnoTAJOFAIDB0ywErvK1p34pwKQhAGAUzA+B7/m6i34JwOQhAGA0zA6BcLvJ2+qnAoAQADAyVobAel/b6KcAwBIEAIyO8MUuJyfohwFAQQAAAEwUAgAAYKIQAAAAE4UAAACYKAQAAMBEIQAAACYKAQAAMFEIAACAiUIAAABMFAIA");
    imageData.append("AGCiEAAAABOFAAAAmCgEAADARCEAAAAmCgEAADBRsgcARVEUNaRa2+QBRESchskDiIg4DZMHEBFxGiYPICLiNEweQETEaZg8gIiI0zB5ABERp2HyACIiTsPkAUREnIT/D1dHiu9x/mCKAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image31bcafc10bab8a12d3f16a91e1eb7493 = new WeakReference<>(result);
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
BufferedImage image31bcafc10bab8a12d3f16a91e1eb7493=getImage31bcafc10bab8a12d3f16a91e1eb7493();
if (image31bcafc10bab8a12d3f16a91e1eb7493 != null) {
    g.drawImage(image31bcafc10bab8a12d3f16a91e1eb7493, 0, 0, null);
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
		return 384.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 384.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private editor_spellcheck_svgrepo_com_1() {
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
       editor_spellcheck_svgrepo_com_1 base = new editor_spellcheck_svgrepo_com_1();
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
       editor_spellcheck_svgrepo_com_1 base = new editor_spellcheck_svgrepo_com_1();
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
        return editor_spellcheck_svgrepo_com_1::new;
    }
}

