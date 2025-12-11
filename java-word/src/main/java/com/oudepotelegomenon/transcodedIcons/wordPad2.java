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
public class wordPad2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image590635329ee9fb43bfc6549623f1845d;
private static BufferedImage getImage590635329ee9fb43bfc6549623f1845d() {
    BufferedImage result = (image590635329ee9fb43bfc6549623f1845d != null)
        ? image590635329ee9fb43bfc6549623f1845d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(8480);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAQAAAAEACAYAAABccqhmAAAYn0lEQVR4Xu2dyXMcR3rF58/xyeGLHXb44INPvvngmBgf7JPDEZqDPbYnZGsfbZ4ZS9wkSiSHWjhcREriIhLcF3ERSXARxU1cAVLiToIbAO5AA2VkA0U135fVXdmVWVmV+V7ELxrVrEo0u/O9ykpkf/WzpAIaHRtPBh42kgv3RpMf7o2RWjGaXLzXSK48GE1uPRpLHo6OJ2Pj4/gRUxXVz/CJsjU6lkwYv6HpWKS2DE+GgQp2qtryHgA3HtL8wTLcSO48HpsYEeCnTlVF3gPgwn0GQOhcmfiMORqoprwHAHYWEiZqfudR46cQGBsba6KT7t/S51qfx+fw36nOYgCQ0jg9OJpceSBN3Crdv2Xto9sXf6baiwFASmXn9ZHkzEQQ4Nk7FW7rnmMA2BMDgJTOrFOPk5ODepPqjIyG1j2f9TPVXgwAUjon7jaSv9v+IPn+zkimmdHE6XO4X6efqfZiABAvvHvqSfLXm+8nx+7SrD7FACBeOHy7kfzZhgfNEDhyp4HdgipJDADijV/seZT8yTqGgE8xAIg3Zp5+0gyANASO8nKgdDEAiDdWXxp9GgAcCfgRA4B4Y9eNxjMBkIbAYYZAaWIAEG8cuyMDgCFQrhgAXbDjxA/J/8yY3zU7Tvwo2owVND9DoFwxALrgw+UbhalNUMdjm7GCxmcIlCsGgCHHrw8nr8z+VJjahJff/zQ5fm1YtB0jaHqEIeBWDABDevYfF4buhjX7jom2YwQNr4Mh4E4MAEOmL14lzNwN0xatEm3HCJo9C4aAGzEADDj444AwchEOnL8hfkdsoNHb0QyB2wwBm2IAGPDZ1l5h4iIs3rxH/I7YQJN3giMBu2IA5KTv7pPk7flLhYmL8NYfPkvO3nksfldMoMHzwBCwJwZATnaduigMbIPY1wSgufPCELAjBkBO5q3aIsxrg9jXBKCxTVAh8B3nBAqJ");
    imageData.append("AZCDEwP3k1dnLxDmtUHsawLQ1KYwBIqJAZCD9QdPCuPapGffcfE7YwEN3Q0Mge7FAMjBjM9WC9PaJOY1AWjmbmEIdCcGQAcOXbiVvDDzI2Fa28S6JgCNXASGgLkYAB34fPsBYVYXLNm8V/zuGEATF4UhYCYGQBv6B0eS3378uTCrC96aH+eaADSwDRgC+cUAaMPuM5eEUV2y42R8awLQvLZgCOQTA6ANH63ZJkzqkjkrNonXEDpoXJs0Q4CLhdqKAZDBqZsPk1c/+KMwqUteef/T5Pvrca0JQNPahiHQXgyADDZ9d0YYtAxiWxOAhnUBQyBbDIAMZi3rEebMyzsLV4jn8vLuwpXitYQMmtUVDAG9GAAajl4ZFMbMy0vvfZLs7bvafMR/y8uhCzfFawoVNKpLODEoxQDQsHzXt8KUeZm1tKfZxnvL1op/y0tMawLQpK7hSOBZMQCAc0Ojye8XfClMmZe1B75vtlPk+wMx1QlAg5YBQ+AnMQCAvWevCEPm5cX3Pk6OXh1stnP82lChy4CdkawJQHOWBUNgUgwA4NN1O4QZ8zJzavifUuQyYM6KOOoEoDHLRIXAocjnBBgALZy+9TD5zZxFwox56dk/OfxP2fDtKbFPXl6ZvSCKNQFoyrKJPQQYAC1sPdonjJiXF2f9NPxPUTcRebnAZcBaCJQQQUP6IOYQYAC08P4X64QJ8zJr6RrRXrPNz7tvU92DANsLDTSjL2L9EyEDYIojV+4WmrRTdwzCNhUbD50W+5pw8IcB0WZIoBF9EmMIMACmWLX7sDBfXprD/4kAwTYV31+/16z7h8fkRd2LANsMCTShb2ILAQbABOeHG8k7f+x++e7MjOF/yuwv1otj8vLW/KVBrwlAA1aBmEKAATDBvv5rwngmdPoCT9EvFu08eUG0GQpovqoQSwgwACZYuOEbYbq8qOG/mj/ANlv5/kaxy4C5AdcJQONViRj+OhB9AJy9/Th5Y94SYbq8zPys/fA/");
    imageData.append("5YMvu78MCHlNAJquaoQeAtEHwNfHzwvDmbBm3zHRpo7Nh8+KY00IdU0AGq6KhBwC0QfAB19uEGbLS3P4f7n98D/lxI37zTM5tpGX6Yu/Em2GAJqtqoQaAlEHwLFrQ4WuzdUNQ7DNdhQJG0WIawLQaFUmxBCIOgDW9B4TJjNBHY9ttmPLkWKXASGuCUCTVZ3QQiDqAHh30UphsrxMDv/viDbbcXLgQaHLgOaagLtPRLt1Bg1WB0IKgWgDQN2KCw1mwowlZsP/lA8LXgaEtiYAzVUXQgmBaANgyeY9wlwmrO49KtrMw5YjfaItE+auDGtNABqrToQQAlEGgFpaq27FhebKixr+HzYc/qeculnsMqC5JuDGPdFuXUFT1Y26h0CUAaDKbaGxTOh2+J/y4fKNok0TQloTgIaqI3UOgSgDQN2CC01lwuq93Q3/U7Yd6xdtmhDSmoC/2fZQGKqO1DUEogsANXwuMgR/YeZHyeFL3Q3/U5q3HSvwGhShrAn41wOPhJnqigqBI3fGsItXWtEFgCrbjWYyYcYSO2dfVfQT2zYhlDUB+281kj/fJM1UV+oWAtEFgDIwmsmE1XuPiDa7Ydvxc6JtE96evzTpC2RNwN6bjeSXBx8lf7VZGqqO/GWNQiCqAPj2x4HmEB7NlBcbw/8UVYG46N2HdwW2JsA2305ck6++NOqU5T+OJAvOjSSzTj9Jnj/8OPn7XQ+TP93wIPmLTfeTY3erPycQVQAs27ZPmMgE25Nvc1YWm4ycu3KzaJNMcmLCfGs0hi2DzydC4cUjj5O/3fYgOTlY7ZFANAGghstq2IwmMuE3Hy5slg6zxRtzF4vfYYJaj6CWF+P/NXb6hhrJ+svSmGWz/MJo8urRR8nZ4eqGQDQB8M3pi8JAIZDei5BMcm7CbNuuSTP6ZPH5J8mlB9UMgWgCYP5XW4V5QmC6pb9KhMKeAWnASnBxJLn1eBy7v3dFEQBqmFx0wq2yzJyfHPwxjDUBRVEL");
    imageData.append("cYTxKsSGKyPJ/ZFqhUAUAVDkHn11IJQ1AUVQk35rK3Dd34mvr44kjxvVCYEoAkDV7UfThERIawK64exQY+LsKs1WVY56uC352NhYE1TwAXDo4q1Cf/uvC7GuCVCTftuvV3voj/RcepIMl3QpkGX8VMEHwBc7DgqzhEisawJ6qzrp14GDt0bRCtbVzviptAGQpkan9LAh/EBt0j84kvzuky+EWUJEfcHpREB1AvJw+La/xT5FWXtpJHlSwlxAJ/+KAOh0gG3hh2qTPWcuC6OEzLoDJ8R7ECqnBusx6deOK47XBuTxctAB8HHP18IkIRPLmoD+4UaysUaTflkcvFnOZUA7T4sAUArhEkB92ea1DxcKk4TMCxGsCTg/PJbsuC7NVEe2Xx1BOzhTlpdFAOh2cin8gG1R9FZcdWXptn3ivQiJfTfrNePfjo2XywuALAUbALOW9QhzmLJw465kyZY9paK+4IOvw4Q3/7Bk4iw5Kt6PEFB/P6/rpJ+OnovlBYDRCABxKfyQbaAq9hY10rsLV4p2y6BowVDFrlMXRbt15/RgI1lX80k/Ha7VycMiAMoWftA2WLHrkDCFKcsn2sB2y2Dr0WIFQxXzvgprTUD/xHX/5qvSPCHgUu2Mn0obAGWd/ZXwwy7KuaHR5P8WLBemMOXbCzdF22Vgo2BoSGsCzk+w64Y0Tii4VicPiwDAA3DbtvADL0pv31VhCFPUPQOx3TIpWrZcEcqagAMBTfrpcKk83g0uABas3ynMYMqKb74T7ZbJ18fPi9dkiq3qxT45dqeR9GhMExKu1WkkH1QAnLn9KHl9ziJhBhPUF4cOXbgl2i6T07ceFa5foP4fqggqtl0XzgyFOemHlKWsIBABoFTXOYBtx4qV2lZMW7RKtOuDeas2i9dmytKt9VwToFb6bQl00g/xLW0AlCn88Isw+8v1wgSmrNztd/ifsv37H8RrM+Xtj5bVsk7A7oAn/ZCylHVC1wZAuqPuANvCD79b");
    imageData.append("jl4dTF567xNhAhPUsPm7i36H/ynqcua1OcWXMu86VaxOALbnmuden5b8w7+9WBvQ0Ka4VpbxU4kAwJ1x27aww3XLV3uOiM5kyvSKDP9T5q8uXshUXUpguyZgey7599++n/z8Vy8Jk1UZNLQpLpXHu0EEwPmJa8Z3Fq4QHcqUVbsPi7Z9UvQ25orJNQH3Rdt5wfZc8et35iS/+M9XhcGqDhraFNfq5F8RAEp1mwTcd+666FCmTA7/b4u2fXLm9uPk9bnF/qqhWHew+zUB2JYLnp82L/nn/35TmKsOoKFNcak8/tUGQJnCDtcNizbuFp3KlOmLqzX8T7FR02DGktWi3bxgWy74l1d+L4xVF9DQprhWpxN5xwBod7ANYYcz5eydx8mb85aITmXKqt127vprGzWJh6/VlOaagC6XNmNbtvnlG9OFqeoEGtqUspQVBB0DwLWww5my40TxP5c1h/+XqjX8T1EB94aFgFv2dXdrArAdm/zH72YnP//Vy8JUdQINbYpL6QyP0gZAa1rkaaSIsMOZYuPrs7bv+mubT9ftEK/ZlP/tck0AtmOLX787N/nH/3pNGKpuoKFN8S0RAGj8qgcAqR/NWv4Vu4GnL3yLAUBKpzfwb/iZ4FLpSL6V9PlUIgCU8ACXws5BwqbOtfxd4FvaAChT2EFIuIRQy982rtXpZK4NAN1QwZWwk5Aw6RtqJJsi+YafCS6F/sVtJREAuBNu2xZ2FBIeqpb/zkBq+dvGpdC7uK3EACDO2c9Jv0xcq9NoXgSAUqfrBpvCzkLCIrRa/rbxLW0AlCnsMCQcQq3lbxPX6nQy1wZA60FZB9oSdhoSBn1D4dbyt4lLoXdxW0kEgG4nl8KOQ+qPmvQLuZa/TVwKvYzbSgwAYp0DtzjplxeXQi/jtpI2ABCXws5D6k2zlj+v+3PjWp18LAKgbGEHIvUlllr+NvEtbQC0JkZWctgSdiJST1Qt/638hp8xLoUjeZ2XRQCg8XUH2RR2");
    imageData.append("JFJPYqrlb5MypfNy7QMAC02Q8qlbLX+boKFNKVM6L4sAUGo3ZLAtNLQp2BlJudSxlr9N0NCmuFSn4b+SNgDKFBraFOyQpDzqWsvfJmhoU3zraQC0DvkRl0JDm4KdkpRDnWv52wQNbYprdfIxRwCkK+pcy98maGhTXKr1pN762CoRALqdXAoNbQp2TOKeutfytwka2hSXQuPrvM0AiJNxDbiPlhBq+dsEDW2KS7UaP8vXIgCUsnZ2ITS0KdhBSUeyzJ71/FNCqeVvEzS0Kb4lAqB10qBdctgSGpo4Z7zlMaX1eS3NWv4s62Udl2r1b5aXRQCULexoxDlZhsftZ+gd4Df8XFCGdMZPpQ0ATA6Xwo5GnGM8AmAtf3eUoXYeFgGAxm93sA1hZyPOyTK69nnW8neLS+GJXOdlBkCctJ79W0cBz6DKem26IjstsYdviQBQStPCtfmVsNORaqDKeu3gpJ9zXKjVvwhKGwBlCjseKYzumr7ddb/2uf03G+NTnVQ9tiI6Mekel0LD47aSNgDaJYZttXRSYgc0Nz6n2/eZfaZq+bcGgOi4xA4uhf7FbSURALgTbtsWdEhSHAwAXRDgvk9/Pj3UGF93+RnTcwTgENfqdDJnAIQHmj13APRP1vJvd+bXPUcK4FvaAMjChaBDkuLozI5hILbPD4+NT9XyxwDgCMAhrtXJvyIAylZLJyUeOcAbeHrBpVLT42OrRAC0pkW75LAl7IjEKq1nfBz+P2Wqlj+e3XGbOMCl0Pg6L4sASKXb2YWwMxKrZJo+paWWPxoet4kDXCrPiZwBEDZ4rd/683j/cGN86zXttb5umzjAt0QA8BIgKFpHAK0B0HycquXfavh2j8QBLpX6txWUCICypem0RmDRCvIMuqo/zcfnXp82PlXUovUxBZ8XhTDIJGhoU8qSzvxK2gDAUYBLoaFN0XR60oHYa/nbBA1tSpnSeVkEABpfd5BNoaFNwc5N2sNa/nZBQ5tSpnReZgBE");
    imageData.append("BGv52wcNbYpviQBQajdpYFtoaFOwk5NsWMvfPmhoU1yq1cetfm71tTYAyhQa2hTs5EQPa/m7AQ1tim9pA0CXGq6EhjYFOzqRsJa/O9DQprhWJx+LAMja0ZXQ0KZgZyfPwlr+bkFDm+JSOOTXebv2AUCyOTfcYC3/iuNSaHydt7UBgLgUdlpij15+w6/yuFSr8bN8LAKgbGGnJXZgLf964FvaACjr7K+EHZcUh7X864NL4Uhe52cRALgTbtsWdl5SDNbyrxdlSudlBkBAnB9uJDuv87q/TpQpnZcZAAGxn5N+tcOlOg3/lUQAKHU6yKawE5PumKrlLzoYqTa+pQ2AMoUdmZhzevBpWS9SM1yr08lcGwDpzlkH2RR2ZmJG/3Czlr/oWKQeuBT6F7eVRADgTrhtW9ihSX7UpN83k2W9SE1xKfQubisxAGrMgVuc9Ks7rtVpNC8CQKnTdYNNYacm+Th2t1nLX3QoUi98SxsAZQo7NunMmaGxZD3NHwSu1elk/jQAWocKiEth5ybt6Z+47t96TXYkUk9cCof/Oi9zBFAzpmr5k0BwKTR+kAGABTBC5rnXp4mCFMQvaGhTXApH9Tp1DICsA20JDW0KmiRUWMu/mqChTfEtEQDt0sKF0NCmoFFChLX8qwsa2hSXyuNjEQCpygoCNLQpaJbQYC3/aoOGNsW3MgMglesQQEObgoYJDdbyrzZoaFNcKz2RZ/m4bQBkHWRTaGhT0DAhwVr+1QcNbYpLoX9xW6ltACjpDrIpNLQpaJpQYC3/eoCGNsWl0Lu4rZQZAO2GDTaFhjYFjRMCrOVfH9DQprhW6uEsL4sAKMv4qdDQsaNq+e9gLf9o8C0RAGULDRA7vQOyk5BwcS3jScB2O7sQGiBmWMs/PlwKfYzbSiIAUpUVBGiCWFG1/FnWKz5cCv2L20qZAZBKd5BNoRFipG+YtfxjxaXQu7it1DYAdAfYFpohNs5PmH8nJ/2ixbWM5wBQWQfaEhoi");
    imageData.append("NljLP258KzMA2qWGTaEhYoK1/IlLtZ79s/wsAiBrR1dCU8QCa/kTRZnS+VoEQNlCY8QAa/mTlDKVKwA4AnCLmvRjLX+S4lKdhv9KIgBStTvIptAgocNa/qSVMqXzc2YApNIdZFNokJA5fqeR9Gg6AYmXMqXzctsA0B1gW2iSUDkz1GAtfyJwqUKXAKmyDrQlNEqITNby59CfSHwrMwDapYZNoVlChLX8SRa+JQKgLOOnQrOYgsU0qgZr+YcNGtoU3xIBULbQ0Kag4aoEa/mHDxraFN9iADiCtfzjAA1tim8xABzAWv7xgIY2xbcYAA5gLf94QEOb4lsMAMuwln9coKFN8S0GgEVYyz8+0NCm+BYDwBKs5R8naGhTfKv2AVAFzg2PJdtZ1ot0gW8xACzQy7JepEt8iwFQkCOs5U8K4FsMgAKwlj8pim8xALqEtfyJDXyLAdAFrOVPbOFbDIAuYC1/YgvfYgAYwlr+xCa+xQAw4PQQJ/2IXXyLAZATVct/C2v5E8v4FgMgB6zlT1zhWwyAHBxkLX/iCN9iAHSAtfyJS3yLAdCGZi1/LvYhDvEtBkAGatKPtfyJa3yLAZABa/mTMvCt2gcAFuawAWv5k7ygoU3xLQYAwFr+xAQ0tCm+xQBogbX8iSloaFN8iwEwBWv5k25AQ5viWwyAKVjLn3QDGtoU32IAzGAtf9I9aGhTfCv6AGAtf1IENLQpvhV1ALCWPykKGtoU36p9AHSLquW/g2W9iGd8K9oA6B3gMl/iH9+KMgBYy59UBd+KLgBYy59UCd+KKgD6hhrJJpb1IhXCt6IJgGYtf37Dj1QM34omAFjLn1QR34oiAFjLn1QV3wo+AFRZL076kariW0EHQP+QquXPoT+pLr4VbACcv8da/qT6+FawAcBa/qQO+FaQAdCs5c/rflIDfCu4AGAtf1InfCuoAOgfbrCWP6kVvhVUAOzhpB+pGb5V+wBIi3uwln+YoGFCw7eCCIDJWv4s");
    imageData.append("6xUiaJjQ8K3aBwBr+YcNGiY0fKvWAaDKev3T82+ITkPCAQ0TGr5V6wDYO9AQHYaEBRomNHyrtgHw3e3JP/dhhyFhgYYJDd+qZQCcHGwka6dW+mGHIWGBhgkN36pdAKiyXhtbVvphhyFhgYYJDd+qVQCwlj8JDd+qVQDsY1kvEhi+VZsAYC1/EiK+VYsAYC1/Eiq+VfkA6BsaYy1/Eiy+VekAUGW9WMufhIxvVToAWMufhI5vVTYAVC3/Hs0bRkhI+FYlA4C1/Eks+FblAqB/WNXyl28UISHiW5ULANbyJzHhW5UKANbyJ7HhW94D4OK9RtP8zVr+mjeIkFDZcPkJ2qF0eQ+AGw8byVlVy5+TfiQyegdG0A6ly3sAjI6NJ9uvjYg3h5CQWXtpJBkeGUc7lC7vAaB0b+KN2D+RhusmhkT4RhESEusuPWme+YeejKENvOj/Aaxh2XSAtKNeAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image590635329ee9fb43bfc6549623f1845d = new WeakReference<>(result);
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
BufferedImage image590635329ee9fb43bfc6549623f1845d=getImage590635329ee9fb43bfc6549623f1845d();
if (image590635329ee9fb43bfc6549623f1845d != null) {
    g.drawImage(image590635329ee9fb43bfc6549623f1845d, 0, 0, null);
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
		return 256.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 256.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private wordPad2() {
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
       wordPad2 base = new wordPad2();
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
       wordPad2 base = new wordPad2();
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
        return wordPad2::new;
    }
}

