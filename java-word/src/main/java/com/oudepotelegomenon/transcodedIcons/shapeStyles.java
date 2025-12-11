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
public class shapeStyles implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> image8ebb9ab962d80dc4db8bd0ad2dba5cb3;
private static BufferedImage getImage8ebb9ab962d80dc4db8bd0ad2dba5cb3() {
    BufferedImage result = (image8ebb9ab962d80dc4db8bd0ad2dba5cb3 != null)
        ? image8ebb9ab962d80dc4db8bd0ad2dba5cb3.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(27012);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AABO60lEQVR4Xu3dd5wV5fU/cFhgpYOAgAYLEguorJQrSJdgLFGsKEhoigJrjRr5GhOjRonGRM1PoyhWErugYgOBbTQVUOwoJsYYNcaoEaSze37n4UKAc57dvWXKMzOfP96vxHOXu7fMPJ/P7t6ZqUNEdQDAball1Ih1YEVsMBvGJrKr2C3sIfYUe47NYWVsCVvO3mGr2CfsX+xbtpZt2cb8fzMzt5mvMV9r/o35t+Y+zH2Z+zT3bb6H+V7me5rvbR6DeSzmMZnHZh5jI/n4AcA9agAAweGwLGSd2BA2nt3AHmbz2Qr2KVvHKGLMYzaP3TwH81zMczLPzTxH81zNcy6UrwcABEcNAMA7HHIFbD82iI1j17LprGJbQFamdHgmhXnu5jUwr4V5TcxrY14j81qZ16xAvp4A4B01AIDccGC1SaV/FX4xu48tTUXzp3dXmNfOvIbmtTSvqXlt28jXHQByowYAULNU+tf25u/do9jNbDb73BJg4A/zWpvX3Lz25j0w7wX+nACQJTUAgF2l0n+vHs3uYW+zzZZQgnCZ98S8N+Y9Mu9VJ/k+AsCu1AAgyTg46rMUuySV/sT7F5awgWgw7515D817ad7T+vL9BkgyNQBIEg6F5uwYdh0rSaUPiZNBAvFg3lvzHpv32rznzeX2AJAkagAQZ6n0p/J7p9KfOH81lexP4Sedee/NNmC2BbNN4KgDSBQ1AIgbXtjbszHsUfa1JQgADLNtmG1kDGsvtyOAuFEDgKhLpf+OP4BNYa+zKstiD1ATs82YbcdsQ2ZbwucHIHbUACCKeIFukUr/5DaDfWdZ0AHyYbYps22NYS3k9gcQRWoAEBW8EDdjI9ksttGyaAP4wWxrZpsz214zuV0CRIUaALiMF9wm7Ew2k623LM4AQTLboNkWzTbZRG6vAC5TAwDXpNJXwjuNPZHCYXrgLrNtmm3UbKu4");
    imageData.append("IiI4Tw0AXJBKH653LHuErbEstgAuM9us2XbNNozDC8FJagAQplT6evJXp9LXpZeLKkAUmW3ZbNMd5PYOECY1AAgaL4z12FD2HNtiWUAB4sBs22YbN9t6PbkfAARNDQCCwotgR3Y9+8yyWALEmdnmzbbfUe4XAEFRAwA/8YLXgJ3OXk7hBD0AZh8w+4LZJxrI/QXAT2oA4Ade3Nqk0n8H/dKyCAJAet8w+0gbuf8A+EENALzEi9kB7C62zrLgAYBm9hWzzxwg9ycAL6kBgBd48erHnk7hansAuTL7jtmH+sn9C8ALagCQq1T60/zmb5mvWBYzAMid2afMvoWjB8AzagCQrVT69LwXsr9aFi4A8M7fUul9DacdhrypAUCmeBFqnkp/aOkby0IFAP4x+5zZ95rL/RIgU2oAUJtU+if+yexry8IEAMEx+6DZF/EbAciaGgBUhxeZhuxnKRzKB+Aas0+afbOh3G8BqqMGABIvKoWsOIUz9gG4zuyjZl8tlPsxgKQGANvxIlKfjU/hwjwAUWP2WbPv1pf7NcB2agCQSl+KdxT7yLKwAEB0mH3Y7Mu4JDEoagDJxgvFILbCspAAQHSZfXqQ3N8h2dQAkimVvjLfDMvCAQDxYfZxXIEQtlIDSBZeDJqyKWyDZbEAgPgx+7rZ55vK9QCSRQ0gGXjnr8vGsi8sCwQAxJ/Z980aUFeuD5AMagDxxzt8X7bUsiAAQPKYtaCvXCcg/tQA4ot38n3Yo5YFAADArA37yHUD4ksNIH5S6av0Xc7WWnZ6AIDtzBph1gpcdTAB1ADihXfkw9kyy44OAFAds2YcLtcTiBc1gHhIpc/bfyPbbNm5AQBqY9YOs4bg+gIxpQYQfan0yXw+tOzQAADZMmvJILnOQPSpAUQX76Qt2TRWZdmJAQByZdYUs7a0lOsORJcaQDTxjnkq+9yy4wIAeMWsMafK9QeiSQ0gWnhnbM9mWnZUAAC/mDWnvVyPIFrUAKKDd8Ch");
    imageData.append("7CvLzgkA4Dez9gyV6xJEhxqA+3ina8ymWnZIAICgmbWosVynwH1qAG7jHa07W2nZCQEAwmLWpO5yvQK3qQG4iXeuAnYF22TZ+QAAwmbWJrNGFcj1C9ykBuAe3qE6sBLLDgcA4BqzVnWQ6xi4Rw3ALbwjDWPfWHYyAABXmTVrmFzPwC1qAG7gnacpe8CyYwEARMUDrKlc38ANagDh4x3mIPaeZWcCAIgas5YdJNc5CJ8aQLh4RzmZfWfZiQAAosqsaSfL9Q7CpQYQjlT6U/5TUjiPPwDEk1nbzBqHowQcoQYQPN4hWrM5lh0GACBuzFrXWq6DEDw1gGCl0if2+btlJwEAiCuz5uHEQSFTAwgO7wBj2XrLzgEAEHdm7Rsr10UIjhqA/3ijL2R3WnYIAICkMWthoVwnwX9qAP7iDb0dW2zZCQAAksqsie3kegn+UgPwD2/gndnHlo0fACDpPmad5boJ/lED8Adv2Eexby0bPQAApJk18ii5foI/1AC8xxv06BSu4gcAkAmzVo6W6yh4Tw3AW7whX2PZwAEAoGbXyPUUvKUG4I1U+pP+0y0bNQAAZMasoThCwCdqAPnjDbYlK7VszAAAkJ1S1lKus5A/NYD88IbaMYUr+QEAeMmsqR3legv5UQPIHW+gPdiXlo0XAADyY9bWHnLdhdypAeSGN8x+KVzGFwDAT2aN7SfXX8iNGkD2eIM8mq21bKwAAOAts9YeLddhyJ4aQHZ4QzyJbbBspAAA4A+z5p4k12PIjhpA5ngDHME2WzZOAADwl1l7R8h1GTKnBpAZ3vDGs0rLRgkAAMEwa/B4uT5DZtQAascb3CWsyrIxAgBAsMxafIlcp6F2agA14w3tl5YNEAAAwvVLuV5DzdQAqscb2E2WjQ4AANxwk1y3oXpqAHZmw7JsbAAA4BaUgAypAWgp/NofACBK8OeADKgB7CqV/sCf3LgAAMBt+GBgLdQAdkilD/XDp/0BAKLHrN04RLAGagBp");
    imageData.append("qfRJfnCcPwBAdJk1HCcLqoYawP9O74sz/AEARJ9Zy3HaYAs1SLpU+sI+OLc/AEB8mDUdFxAS1CDJUulL+uKqfgAA8WPWdlxKeCdqkFS8YfRIpa81LTcaAACIB7PG95Drf1KpQRLxBtGRfWnZWAAAIF7MWt9R5kASqUHS8IbQkr1n2UgAACCezJrfUuZB0qhBkvAGUMhKLRsHAADEWykrlLmQJGqQJPzmT7dsFAAAkAzTZS4kiRokBb/x11g2BgAASJZrZD4khRokAb/hoy0bAQAAJNNomRNJoAZxx2/0UWyTZQMAAIBkMplwlMyLuFODOOM3uDP71vLmAwBAspls6CxzI87UIK74jW3HPra86QAAAMbHrJ3Mj7hSgzhKpQ/3W2x5swEAAHZmsiIRhweqQRzxm3mn5U0GAACwuVPmSBypQdzwGznW8uYCAADUZKzMk7hRgzjhN7A7W295YwEAAGpisqO7zJU4UYO44DeuNfu75U0FAADIhMmQ1jJf4kIN4oDfsAI2x/JmAgAAZMNkSYHMmThQgzjgN2uK5U0EAADIxRSZM3GgBlHHb9TJrMryBgIAAOTCZMrJMm+iTg2ijN+gg9h3ljcPAAAgHyZbDpK5E2VqEFX8xjRl71neNAAAAC+YjGkq8yeq1CCq+E15wPJmAQAAeOkBmT9RpQZRxG/IMMubBAAA4IdhMoeiSA2iht+IDuwbyxsEAADgB5M5HWQeRY0aREkqfbx/ieXNAQAA8JPJnkifH0ANooRf/CssbwoAAEAQrpC5FCVqEBWp9Hn+N1nekEQYUvotPTvhWvDZ08eMoaf7nwE+umHSzdTTso0DRIDJoMheL0ANooBf8MZspeXNSIwT53xB3/UYCD6b12UgzTwY/HTfj8dTyzJCCYCoMlnUWOZUFKhBFPCLPdXyJiQKCkAwUAD8ZwpAnZcJJQCibKrMqShQA9fxCz3U8uInDgpAMFAA/Le9AKAEQMQNlXnlOjVwGb/A7dlX");
    imageData.append("lhc+cVAAgoEC4L+dCwBKAESYyab2MrdcpgYu4xd3puVFTyQUgGCgAPhPFgCUAIiwmTK3XKYGruIX9lTLi51YKADBQAHwn60AoARAhJ0q88tVauAifkFbss8tL3RioQAEAwXAf9UVAJQAiCiTVS1ljrlIDVzEL+Y0y4ucaCgAwUAB8F9NBQAlACJqmswxF6mBa/iFHMSqLC9woqEABAMFwH+1FQCUAIggk1mDZJ65Rg1cwi9gQ/ah5cVNPBSAYKAA+C+TAoASABFksquhzDWXqIFL+MW70fKiwjIUgKCgAPgv0wKAEgARdKPMNZeogSv4hTucbba8oLAMBSAoKAD+y6YAoARAxJgMO1zmmyvUwAX8gtVjyywvJmyDAhAMFAD/ZVsAUAIgYkyW1ZM55wI1cAG/WJdbXkTYCQpAMFAA/JdLAUAJgIi5XOacC9QgbPxC7cPWWl5A2AkKQDBQAPyXawFACYAIMZm2j8y7sKlB2PhFetTy4oGAAhAMFAD/5VMAUAIgQh6VeRc2NQgTv0B9LS8aWKAABAMFwH/5FgCUAIiQvjL3wqQGYeEXpi5bannBwAIFIBgoAP7zogAYKAEQASbj6sr8C4sahIVflLGWFwuqgQIQDBQA/3lVAAyUAIiAsTL/wqIGYeAXpCn7wvJCQTVQAIKBAuA/LwuAgRIAjjNZ11TmYBjUIAz8YkyxvEhQAxSAYKAA+M/rAmCgBIDjpsgcDIMaBI1fiI5sg+UFghqgAAQDBcB/fhQAAyUAHGYyr6PMw6CpQdD4RZhheXGgFigAwUAB8J9fBcBACQCHzZB5GDQ1CFIqfalf+aJABlAAgoEC4D8/C4CBEgAOGyRzMUhqEBR+4gVsheUFgQygAAQDBcB/fhcAAyUAHGUysEDmY1DUICj8pEdZXgzIEApAMFAA/BdEATBQAsBRo2Q+BkUNgsBPuD77yPJCQIZQAIKBAuC/oAqAgRIADjJZWF/mZBDUIAj8ZMdbXgTIAgpA");
    imageData.append("MFAA/BdkATBQAsBB42VOBkEN/MZPtJB9YnkBIAsoAMFAAfBf0AXAQAkAx5hMLJR56Tc18Bs/yWLLk4csoQAEAwXAf2EUAAMlABxTLPPSb2rgJ36CDdlnlicOWUIBCAYKgP/CKgAGSgA4xGRjQ5mbflIDP/GT+5nlSUMOUACCgQLgvzALgIESAA75mcxNP6mBX/iJNWFfWp4w5AAFIBgoAP4LuwAYKAHgCJORTWR++kUN/MJParLlyUKOUACCgQLgPxcKgIESAI6YLPPTL2rgB35CzdnXlicKOUIBCAYKgP9cKQAGSgA4wGRlc5mjflADP/CTudryJCEPKADBQAHwn0sFwEAJAAdcLXPUD2rgtVT6b//fWJ4g5AEFIBgoAP5zrQAYKAEQMpOZvn8WQA28xk/iQsuTgzyhAAQDBcB/LhYAAyUAQnahzFOvqYGX+AnUY3+zPDHIEwpAMFAA/OdqATBQAiBEJjvryVz1khp4iR/86ZYnBR5AAQgGCoD/XC4ABkoAhOh0mateUgMv8YN/xfKEwAMoAMFAAfCf6wXAQAmAkLwic9VLauAVfuD9LE8GPIICEAwUAP9FoQAYKAEQkn4yX72iBl7hB/205YmAR1AAgoEC4L+oFAADJQBC8LTMV6+ogRf4AR/AKi1PBDyCAhAMFAD/RakAGCgBEDCTpQfInPWCGniBH+xdlicBHkIBCAYKgP+iVgAMlAAI2F0yZ72gBvniB9qGrbM8AfAQCkAwUAD8F8UCYKAEQIBMpraReZsvNchXCqf9DQQKQDBQAPwX1QJgoARAgDw/PbAa5IMfYIMULvkbCBSAYKAA+C/KBcBACYCAmGxtIHM3H2qQjxRO/BMYFIBgoAD4L+oFwEAJgIB4emIgNcgHP7iXLQ8YfIACEAwUAP/FoQAYKAEQgJdl7uZDDXLFD6wjq7I8YPABCkAwUAD8F5cCYKAEgM9MxnaU+ZsrNcgVP6jrLQ8WfIICEAwUAP/FqQAYKAHg");
    imageData.append("s+tl/uZKDXKRSl/17zPLAwWfoAAEAwXAf3ErAAZKAPjIZK0nVwlUg1zwgxlqeZDgIxSAYKAA+C+OBcBACQAfDZU5nAs1yAU/mOcsDxB8hAIQDBQA/8W1ABgoAeCT52QO50INssUPpAPbYnmA4CMUgGCgAPgvzgXAQAkAH5jM7SDzOFtqkK0UzvwXChSAYKAA+C/uBcBACQAf5H1mQDXIBj+AAvaJ5YGBz1AAgoEC4L8kFAADJQA8ZrK3QOZyNtQgG/zNj7U8KAgACkAwUAD8l5QCYKAEgMeOlbmcDTXIBn/zRywPCAKAAhAMFAD/JakAGCgB4KFHZC5nQw0yxd+4EVtjeUAQABSAYKAA+C9pBcBACQCPmAxuJPM5U2qQKf6mp1keDAQEBSAYKAD+S2IBMFACwCOnyXzOlBpkir/pE5YHAgFBAQgGCoD/kloADJQA8MATMp8zpQaZ4G/YhK21PBAICApAMFAA/JfkAmCgBECeTBY3kTmdCTXIBH+zMy0PAgKEAhAMFAD/Jb0AGCgBkKczZU5nQg0ywd9spuUBQIBQAIJR0buPCizwFgpAGkoA5GGmzOlMqEFt+Bs1Y+stDwAChALgv7Wjiuj7Z5uowAJvoQDsgBIAOTKZ3EzmdW3UoDb8TUZavjkEDAXAZ6kBtGV+U6LFdeidy/dXoQXeQQHYFUoA5GikzOvaqEFt+JvMsnxjCBgKgL/WTz6Q6KM6WwtAZWkBPXNofxVc4A0UAA0lAHIwS+Z1bdSgJvwNWrCNlm8MAUMB8M/qAX2p6o0G/ysAVFaH/nnHHiq4wBsoAHYoAZAlk80tZG7XRA1qwnc+xvJNIQQoAP7Z+P86pMN/pwJA5XVozsBeKrwgfygA1UMJgCyNkbldEzWoCd/5DMs3hBCgAPhjzdAU0Qd1dQFg3z2FDwT6AQWgZigBkIUZMrdrogbV4Tuuz76zfEMIAQqAPzY/1WpH+IsCYCwZeYgKMMgPCkDtUAIgQyaj68v8");
    imageData.append("ro4aVIfvdIDlm0FIUAC8t3b8YbuGv6UAbHy5gQowyE9UC0Dzmd9Rh4f+QZ2mraIud7xN3f+wlI787UIadM18OvYXL9BJl82gMy58hEafdz+NP/FqOvvon9PoE35JI069nk4f8QcaevaddEzxgzTw8iep169mU9cbF1KnO96iRs9+r76XgRIAGRog87s6alAdvtMplm8EIUEB8NgRA6hyQaNaC4Cx8lf7qhCD3LlcAOq/tJn2/Mtn1O2W5XTslS/Q2PH30uSTrqdb+5xPU7ufnbHJRSPpvK5nZmQCO7/bSJrU5zwae9yVdNKY2+nIq16gve7/G+1eWoUSALWZIvO7OmpQHb7T1y3fCEKCAuCt9b/upMO/mgJQWVaXZhXhsECvuFIAGrywkTrf+S6ddPlMOv+s2+g3R/8f3dlzvArzXGRTAGoysetwOr/nGDp/8EV0zrhb6YR7XqPUa5VqfYBEe13md3XUwIbvsD2rsnwjCAkKgHdWH9WHqt6qr8O/mgJgfDGtlQoyyE1YBcD8dH/A3R/QCVc8S5eddiPdkTpPBbdXvCoANpOKRtAFgy6gcefdQcc9+KZaKyBxTFa3lzluowY2KRz+5xwUAO9svHtPHfy1FABzWOC8IT1VmEH2gioABbMrqeO9f6XjrnyeLj7j93R7r4kqqP3iZwGQig8/a+tvCMYUT6UfP7ZSrR2QCGNkjtuogQ3f2aOWbwAhQgHwxven9SBaVUcHf20FgK15ppEKM8ie3wXgB9M/pdMueZxuGnSpCuagBFkApAuOGEfjzr2dBr74hVpHILYelTluowYS31EB+9ryDSBEKADe2PJcCx36GRYAY+k5B6tAg+z4UQDMJ/R/dPUcuuqEa1QYhyHMArCd+XDhBQOK6az/e4x6L1yv1hSIFZPZBTLPJTWQ+E56W+4cQoYCkL9153fRgS/VUgA2z6+nAg2y41UBaPDiJup586t0wYjbPPvwnldcKAA7M58bKD5+Mp18W5la");
    imageData.append("WyA2ess8l9RA4ju51nLHEDIUgDz17k+VSxrqwJdqKQDGR1N+oEINMpdvAWjz2Fc0ovjPdNuR2R2aFyTXCsDOzu/+Uzr7nD9Sn4o1ap2BSLtW5rmkBhLfyauWO4aQoQDkZ8OU/XTY22RQAKrK69Lzqb4q2CAzuRaAdg9/QWPOvde5n/ZtXC4A2xUfPoLGj7qZ+pX8V603EEmvyjyX1ECEf3NWabljCBkKQO5WH92bqt4t0GFvk0EBML56qIUKNshMtgXAfKhv/NipdFePc1TQuioKBWA78+eB8868gQbM+UqtOxApJruby1zPpgAcY7lTcAAKQO42PdhWB311MiwA5rDAshO6qXCD2mVaAPa7/2806ae3Ryr4t4tSAdhuYtFwmnDar2nQc5+p9Qci4xiZ69kUgOssdwgOQAHIzfcjutV82J+UaQFga1/YTYUb1K62ArDffX+ji4bfokI1SqJYALYzZx+cNPQqHEYYTdfJXM+mAJRY7hAcgAKQg54DacucZjrka5JFATBWXHCACjioWXUFoMkza+inEx+M5E/8UpQLwHbmTwNjJ96FUw9HS4nM9YwKQCp9+d+1ljsEB6AAZG/dZQfpgK9NlgVgS2kBPdNFhxxUTxaAunOqqN8N5fSHfhepII2qOBSA7cyJhYbesUitSeAkk+HVXh5YDXYqACnLnYEjUACys7pvP6paVqgDvjZZFgDj77e0VyEH1du5AOz94Cc0+eTrVYBGXZwKwHaTjp9MA2b/W61N4JyUzPdMCsAlljsCR6AAZGfD7/fR4Z6JHApAVXkderHPkSrowM4UgEaz1tHwC/4SiUP6chHHAmCYPwuMvnAapZZWqTUKnHGJzPdMCsBTljsCR6AAZG7N8b2I3s/wsD8phwJgfPNoMxV0YDdt4Dn0uwGXqNCMk7gWgO0u6HU2/eTe5WqdAic8JfM9kwLwheWOwBEoAJnb/GgbHeyZyrEAmMMCF57eVYUd7DDj4KPowa5nqLCM");
    imageData.append("o7gXAGNC1+E0ZuKdaq2C0H0h873GAsD/oJPlTsAhKACZWTumqw71bORaANiG2YUq9CDtiS5H07Ruo1RQxlUSCsB25lLE/ebjbIKO6SRzvqYCMNpyB+AQFIAMpAZQZWkTHerZyKMAGO9esZ8Kv6R7+NAT6e7u41RIxlmSCoBhri9w4tRX1boFoRktc76mAnCP5Q7AISgAtVt/5QE60LOVZwGoLCugZw7rr0IwiWZ0PooeLErGr/ylpBUAw1x+eNx5f1JrF4TiHpnzNRWAty13AA5BAajZ6gF9qeqNBjrQs5VnATA+u7ONCsOkeaLLjxP1K38piQVgu/OPupD6zftGrWEQqLdlzlsLAH9hIdtsuQNwCApAzTbe8QMd5rnwoACYDwS+PPAIFYpJkcRf+UtJLgCG+ZPACfe8ptYxCIzJ9EKZ97v8x7YCUGT5x+AYFIDqrTkpRfRBXR3mufCiALDvZjRRwZgEfz7sFBWGSZT0AmBMKhpOp/1ujlrLIDBFMu93+Y9tBWCU5R+CY1AAqrd55u46yHPlUQEwXhl1iArIOHuo6+kqCJMKBSDNHCp41pWPq/UMAjFK5v0u/7GtANxs+YfgGBQAu7XnHapDPB8eFoBNc+urkIyjGQcPogeKzlQhmGQoADuYDweOLb5LrWngu5tl3u/yH9sKwGzLPwTHoABY9BpAlQsb6RDPh4cFwPjg13urwIwT80n/+4tGqABMOhQA7dwRv1XrGvhqtsz7Xf5jWwH43PIPwTEoANr6a/fXAZ4vjwtAVXldmtWtrwrOOHiq82C69/CRKvwABaA6k074P1xeODify7zf5T/4C9pY/hE4CAVgV6sHH0lVb9fTAZ4vjwuA8a/7dlfhGXVPdh6S6MP8aoMCUL0LBl9IvReuV2sc+KJNTQVgsOUfgINQAHa1aVp7Hd5e8KEAmMMC5x/TQ4VoVJnwv6fbGBV6sAMKQM0u6D+Rer+ySa1z4LnBNRWAiy3/AByEArDD98O6");
    imageData.append("E62qo8PbC34UAPb9s41UkEaR+bU/fvKvHQpA7c4fcgn+HOC/i2sqAPdZ/gE4CAVghy0vtNDB7RWfCoCx/LyDVKBGifnAH/7mnxkUgMyMHfor6mlZ78Az99VUAJZa/gE4CAUgbd2FnXVoe8nHArB5fj2a2UUHaxSYQ/3waf/MoQBkbvjI36ME+GeptQDwDQVsneUfgINQANiR/any1d10aHvJxwJg/O3GvVS4RgGO888OCkB2Tiq+HyXAHybjC2wFYD/LF4OjUAAG0oYb99WB7TWfC4A5LPD5I45UAesynOEveygA2TEnCxpy5dMoAf7Yz1YABlm+EByV9AKw5se9id4r0IHtNZ8LgPGfvzRXIesqnNs/NygA2ZvYdTj1ubEMJcB7g2wFYJzlC8FRSS8Am6a31WHthwAKgDkssPykw1XYusZc1U8GG2QGBSA3k4pG0CH3vocS4K1xtgJwreULwVFJLgDfjzxcB7VfgigAbN2Lu6nAdckTXX6c+Ev65gMFIHfFPcfQHi+vRwnwzrW2AjDd8oXgqMQWgJ4Dacvcpjqo/RJQATDevLiTCl4XmMP9cKx/flAA8jPmuCupZRmhBHhjuq0AVFi+EByV1AKw7ucH6ZD2U4AFYEtpAT3TRQdw2B4sOkMFGmQHBSB/R13yGEqANypsBeBTyxeCo5JYAFb360dVywt1SPspwAJg/OOP7VQAhwl/9/cGCkD+JhUNp73vWYkSkL9PdykAPChklZYvBEclsQBsvGVvHdB+C7gAVJXXodn9eqkgDsMTXY7G3/09ggLgjeLUWGrw/EaUgPyYrC/cuQB0snwROCxpBWDNCUcQrayrA9pvARcA49vHm6owDtqMg/F3fy+hAHhn9E+uojovE0pAfjrtXACGWL4AHJa0ArD58dY6nIMQQgEwFp15mArlID3YFX/39xIKgLcGXvYkSkB+huxcAMZbvgAclqQCsHZcVx3MQQmpAGyY00CFclAeOfQnKsAgPygA");
    imageData.append("3jLnB9jjz/9ECcjd+J0LwA2WLwCHJaYAHDGAKssa62AOSkgFwHj/yv1UOPvNHPJ3T7cxKsAgPygA3hs/+JKtBQAlICc37FwAHrZ8ATgsKQVg/VU/1KEcpBALQGVZAc0q6q9C2k8PdT1NhRfkDwXAH6lfz0EJyM3DOxeA+ZYvAIcloQCsHtSHqt6sr0M5SCEWAOPzqa1VSPvFnO1PBhd4AwXAH8U9Rm09KgAlIGvzdy4AKyxfAA5LQgHYeOdeOpCDFnIBMNcJmDs4pcLaD/cdfpYKLvAGCoB/hg2/+X8FACUgYyt2LgA4CVDExL0ArDm5J9GHIRz2J4VdANjqmY1VWHsNJ/zxFwqAf8xVA39w30coAdnZejKgOtsKwDrLF4DD4l4ANj/TUodxGBwoAMarY7qo0PbKU50H44N/PkMB8Fn/83cpACgBtVq3tQDw/2lkuREcF+cCsHbiITqIw+JIAdg0r74Kbq881PV0FVjgLRQA//W/4mmUgOw0MgWgg+UGcFxsC0Dv/lS5qKEO4rA4UgCMVdd1UOGdr8fxwb9AoAD4r7jbSNpt1jqUgMx1MAWgyHIDOC6uBWDDbzrqEA6TQwWgqrwuPdejrwrxfNxfNFyFFXgPBSAYQ8f+SRUAlIBqFZkCMNhyAzgujgVg9ZAjqeqdejqEw+RQATC+fKClCvFc4af/4KAABMP8FqD+i5tUAUAJsBpsCsAwyw3guDgWgE33tdMBHDbHCoA5LLD0uO4qzHPxQNGZKqjAHygAwTluwr0q/FECrIaZAjDRcgM4Lm4F4PszuhOtqqMDOGyuFQC29rmGKsyzZS71K0MK/IMCEJzi7qOoYHalCn+UAGWiKQBXWW4Ax8WqAPQcSFtebK7D1wUOFgDj9UkHqlDPxoNFuNpfkFAAgvWjix5WwY8SoFxlCsAtlhvAcXEqAOsu7qyD1xWOFoDNJfVoZhcd7Jl4sssQFVDgLxSAYBX3HKNCX0IJoFtMAXjIcgM4Li4F");
    imageData.append("YHWfflT12m46eF3haAEwPr55TxXumXiw6zAVUOAvFIDg9b9ipgp9KeEl4CFTAJ6y3ACOi0sB2PC7fXXousThAmAOC3yx15Eq4GvyZGfz0/84FVDgLxSA4E064mwV+DYJLgFPmQLwnOUGcFwcCsCaY3sRvV+gQ9clDhcA4+uHm6uQrwnO+hcOFIBw7Hy54JoktAQ8ZwrAHMsN4Lg4FIBNf9lDB65rHC8A5rDAilMOV0FvM+PgQXR3t7EqnMB/KADhGD/4EhX21UlgCZhjCkCZ5QZwXNQLwPejinTYusj1AsDWv1Sowt7mkUN+ooIJgoECEA5zpcAmM79TYV+dhJWAMlMAllhuAMdFugCYw/7mNdVh66IIFADj7Us7qcCXcNrf8KAAhOfYCferoK9JgkrAElMAlltuAMdFuQCsn3ygDlpXRaQAVJYW0DOH9lehv5255K8MJQgOCkB4Jh55rgr52iSkBCw3BeAdyw3guKgWgNX9+1LV6w100LoqIgXA+OftbVXwb/eXQ09SoQTBQQEI1173/VWFfG0SUALeMQVgleUGcFxUC8DG2zrokHVZhAqA+UDg7P69VPgb9x4+UoUSBAcFIFzDzvydCvhMxLwErDIF4BPLDeC4KBaANSemiD6oq0PWZVEqAOy/TzRV4Y/z/ocPBSBc5voAMtwzFeMS8IkpAP+y3ACOi2IB2PxkKx2wrotYATAWn3XoLgVg+mGnqkCCYKEAhO/QGxepcM9UTEvAv0wB+NZyAzguagVg7TmH6XCNgggWgI0vN9ilANzTbbQKJAgWCkD4xhx3pQr2bMSwBHxrCsBayw3guEgVgCMGUGVFYx2uURDBAmC8/8t9t4b/412OUWEEwUMBCF9xt5Eq1LMVsxKw1hSALZYbwHFRKgDrr+6kgzUqIloAKsvq0qyi/vTnw05WYQTBQwFww75T31Ohnq0YlYAtKAARFZUCsHpQH6p6s74O1qiIaAEwvrinNd1fNEKFEQQPBcAN");
    imageData.append("J5wzVQV6LmJSArYWAPwJIIKiUgA2Tt1Th2qURLgAmMMCnzgBvwFwAQqAG84ddJEK81zFoARs/RMAPgQYQVEoAN+f2oNoVR0dqlES5QLAvn22hQojCB4KgBsmHX6WCvJ8RLwEbP0QIA4DjKAoFIDNs1rqQI2aiBcAY97EQSqQIFgoAO7odPubKsjzEeESsPUwQJwIKIJcLwDrzu+iwzSKYlAANs5voAIJgoUC4I6TxtyhQjxfES0BW08EhFMBR5DTBaB3f6pc0lCHaRTFoAAYb910iAolCA4KgEMGXKAC3AsRLAFbTwWMiwFFkMsFYMMNHXWQRlVMCkBVeV16oP9PVTBBMFAA3DGpaATVnV2pAtwLESsBWy8GhMsBR5CrBWD10b2p6t16OkijKiYFwPjsz3uqYIJgoAC45aBbl6nw9kqESsDWywEvsdwAjnO1AGx6oJ0O0SiLUQEwhwXOPO1EFU7gPxQAtxw78X4V3F6KSAlYYgpAmeUGcJyLBeD74d2if9ifFKcCwNa80FSFE/gPBcAtZ518rQptr0WgBJSZAjDHcgM4zrkC0HMgbZndTAdo1MWsABgVP+ujAgr8hQLgGJ8+CCg5XgLmmALwnOUGcJxrBWDdzw7W4RkHMSwAm0vr0z09x6qQAv+gALiluMdoFdZ+cbgEPGcKwFOWG8BxLhWA1X37UdXSQh2ecRDDAmCs/OMBKqTAPygAbpnQdTgV+HQkgI2jJeApUwAestwAjnOpAGz4/T46OOMipgXAHBY4ffBwFVTgDxQA9+w7daUKaj85WAIeMgXgFssN4DhXCsCa43oRvV+ggzMuYloAjC8f30MFFfgDBcA9/a94WoW03xwrAbeYAnCV5QZwnCsFYPMjbXRoxkmMC4A5LPC5kceqsALvoQC459SRt6qADoJDJeAqUwAmWm4Ax7lQANaOKdKBGTdxLgBs7ZxGKqzAeygA7jn7xz9X4RwUR0rARFMAhlluAMeFXgBSA6iypIkO");
    imageData.append("zLiJeQEwXvlFTxVY4C0UAPdM6j1eBXOQHCgBw0wBGGy5ARwXdgFYf+UBOizjKAEFYEtZPbq312gVWuAdFAD3FHcfpUI5aCGXgMGmABRZbgDHhVkAVg/oS1VvNNBhGUcJKADGX6fup0ILvIMC4J7iw89SgRyGEEtAkSkAHSw3gOPCLAAbb/+BDsq4SkgBMB8IfPS401VwgTdQANwzsWi4CuOwhFQCOpgC0MhyAzgurAKwZmiK6IO6OijjKikFgH09c3cVXOANFAA3+XVZ4FyEUAIa8Z5PpgSss9wIDgurAGye0UqHZJwlqAAYc87+kQovyB8KgJuazPxOBXGYAiwB60z219lWAD61fAE4LIwCsPbcQ3VAxl3CCsCGebup8IL8oQC4qe1D/1AhHLaASsCnOxeAFZYvAIcFXgB6DaDKBY10QMZdwgqA8fpvuqoAg/ygALhp/z+9rQLYBQGUgBU7F4D5li8AhwVdANZfs78OxyRIYAGoLC+g+/v+VIUY5A4FwE2H3rRIha8rfC4B83cuAA9bvgAcFmQBWD24D1W9XU+HYxIksAAY/7i/gwoxyB0KgJuOuHq2Cl6X+FgCHt65ANxg+QJwWJAFYNM9e+pgTIqEFgBzWOCTQ09RQQa5QQFw08DLnlSh6xqfSsANOxeA8ZYvAIcFVQC+P60H0ao6OhiTIqkFgP13VnMVZJAbFAA3/eiih1XgusiHEjB+5wIwxPIF4LCgCsCW51voUEySBBcAo+T8ASrMIHsoAG7qN/kZFbau8rgEDNm5AHSyfAE4LIgCsO7CLjoQkybhBWBTSQMVZpA9FAA39bhungpal3lYAjrtXAAKWaXli8Bhbcr1BuKVRnPX0Scr99GBmDQJLwDGu7/vrAINsoMC4KbOv39NrX2u86AEmKwv/F8B2FYCcDKgCPKrBFy99FodhkmEAkBV5XXpwQFnqVCDzKEAuGnfqSvV2hcFeZaArScBkgWgwvKFEAFel4AOJZ/S2lWN");
    imageData.append("dRgmEQrAVp8/3F6FGmQOBcBNrR/+Qq1/UZFHCaiwFYDpli+EiPCyBDyyYoQOwqRCAUgrr0PPnHGCCjbIDAqAm3abtU6tf1GSYwmYbisA11q+ECLEixLQt2KhDsEkQwH4n+9fbKKCDTKDAuCeCUyuf1GUQwm41lYAxlm+ECImnxJQ9+UqWvZuDx2CSYYCsIuFl/dW4Qa1QwFwz6SiEWoNjKosS8A4WwEYZPlCiKBcS8C4JffrAEw6FIBdbC6tR/f0HKsCDmqGAuCe4m4j1RoYZVmUgEG2ArCf5QshorItAc3mraZ/fdBOB2DSoQAoH97+QxVwUDMUAPcU9xit1sGoy7AE7GcrAAVsneWLIaKyKQE3LbtChx+gAFiYwwL/MuRMFXJQPRQA90zoN0mtg3FQSwkwGV+gCsC2ErDU8g8gwjIpAT8sXUUbVxXq8AMUgGr8+8k2KuSgeigA7hl1wq/UWhgXNZSApTtn/v/+z7YCcJ/lH0DE1VYCnn1rqA4+SEMBqNbzPz1GBR3YoQC454Rzpqq1ME6qKQH31VQALpbhAfFQXQk4esHLOvRgBxSAaq17uZEKOrBDAXBP1K4DkAtLCbi4pgIwWAYHxIcsAfXnbqZ33jtEhx7sgAJQo9d+1V2FHWgoAO6J8lkAsyFKwOCaCkAbGRoQLzuXgAteuV0HHuwKBaBGW8oK6N7eo1Xgwa5QANwSp3MAZGKnEtCm2gKwrQR8LkMD4sWUgFbzvqavP2ylAw92hQJQq7/ds68KPNgVCoBbJh1xtgrJuOMSsF7m/S7/sa0AzJaBAfFz75vn67ADDQWgduV16NHjTlOhBzugALjlnCGXqoCMu0bz6VuZ97v8x7YCcLMMC4iXM994hyo/qqfDDjQUgIx883RLFXqwAwqAW4ad+TsVkHHXopSWy7zf5T+2FYBRMjAgXl5dOUQHHdihAGTs5XMHq+CDNBQAtwy89AkVkHG3RzlNlXm/y39sKwBFMjAgPi5/8xkd");
    imageData.append("clA9FICMbZhXqIIP0lAA3NJ2+qcqIONurwV0ssz7Xf5jWwEoZJtlcED09Vm2kT79sJMOOageCkBWVtxwmAo/QAFwSXH3USoc467eXKKDl1BDmfe7/MdOJeBtGR4Qfbe/faMOOKgZCkBWKssL6P6+P1UBmHQoAO4Ye+xkFZBx16SEvpc5X1MBuEeGB0Tbsa9/QWtXNdMBBzVDAcjaPx/aSwVg0qEAuGPwxY+qgIy7VmX0psz5mgrAaBkgEG2z3hunww1qhwKQvfI69NTJJ6kQTDIUAHe0eiQZZwDcWdty+pPM+ZoKQCcZIBBdo99YSlUf1dXhBrVDAcjJd883UyGYZCgAbijuOUaFYxLsWUFHyZyvtgBsKwFfyCCBaHpzZR8dbJAZFICclV7UTwVhUqEAuGH08VepcIy7enOpUuZ7JgXgKRkkED2/fOthHWqQORSAnG0qaUBTe+owTCIUADcMvOxJFZBx16SE/iXzPZMCcIkME4iW/svX0pcfdtChBplDAcjLe7ccpMIwiVAAwjeBNX/iaxWQcdeyjF6S+Z5JAUjJQIFomfbO1TrQIDsoAHmpKq9L0weNUIGYNCgA4StOjVPhmAR7lNN5Mt8zKQD12VoZKhANJ77+CW1Y1UgHGmQHBSBv/3q0rQrEpEEBCN+pI29V4Rh3BXOJWpdRE5nvtRaAbSWgRAYLRMPc98/QYQbZQwHIX3kdenb48SoUkwQFIFzm1/9JPP1vkxJ9BcBsCsB1MljAfeeuqNBBBrlBAfDE9y81VqGYJCgA4ZrYZ6IKxyRoVUZlMtezKQDHyHABt/VaVkkrP+imgwxygwLgmcVXHKGCMSlQAMJ19AXTVTgmQfsK+rnM9WwKQHNWKUMG3HX9W9N0iEHuUAA8s6W0Ht1zxFgVjkmAAhCeiUXDqeGstSoc464u67iI2spcz7gAbCsBr8qQATcdtfy/9M2qtjrEIHcoAJ5a9af9VTgmAQpAeM4ecrkKxyRoUkKrZZ5L");
    imageData.append("aiBxsFwrgwbc9Jd3L9MBBvlBAfCUOSzwL0efoQIy7lAAwtPz1y+rcEyCVmVULvNcUgOJg6W3DBpwz2mvf0CbP2qgAwzygwLgua+eaq0CMu5QAMJR3G0k1Z1dqcIxCfYop/NlnktqIHG4FLCvZeCAWxa+/xMdXpA/FABfvDTmaBWScYYCEI6zTvmNCsYkMH//b1xCjWWeS2pgwwHzqAwccMdFb76kgwu8gQLgi/VzG6qQjDMUgOCZY//3uu+vKhyToEkJfSZz3EYNbDhkxsjQATf0XraZPv7gYB1c4A0UAN8s/XU3FZRxhQIQvKR++M9oU073yhy3UQMbDpr2rEqGD4TvD2/fpkMLvIMC4JvKsgK6t/doFZZxhAIQLPPT/353vquCMQnMr//3XkidZY7bqEF1OGxel+ED4Tp6+Ve0elVLHVrgHRQAX/393n1UWMYRCkCwzh10kQrGpGiaweF/26lBdThwpsgAgnDNeHeiDizwFgqAv8rr0OMnnKoCM25QAIJ10K3LVTAmRbsKmi3zuzpqUB0OnAEygCA8I954kyo/qqcDC7yFAuC7b59toQIzblAAgjOhf7EKxSQ5YDGdIvO7OmpQnVT68sDfySCCcCxbeZQOK/AeCkAg5k0cpEIzTlAAgnPYbxeoUEyKpiW0hfOhvszv6qhBTfiOZ8ggguBd8eYMHVTgDxSAQGycX6hCM05QAIIxsc95KhSTpH0FvSVzuyZqUJMUDgcMXd9lG+izDzvqoAJ/oAAE5q0bD1HBGRcoAMFI6ml/tztwCV0mc7smalATDqAWbKMMJQjOne/coEMK/IMCEBhznYAH+v9UhWccoAD4b0K/ZP/tv/H8rYfqt5C5XRM1qA1/g1kylCAYx7/+Ga1d1VSHFPgHBSBQn/15TxWecYAC4K+JXYdTh2mrVCgmSbsKel/mdW3UoDYcRCNlMEEwXnhvtA4o8BcKQLDK69CM005UARp1KAD+OuOMG1UgJk2nxfRzmde1");
    imageData.append("UYPacBA1Y+tlOIG/xr3xClV9VFcHFPgLBSBwq19oqgI06lAA/FPcfRQ1eH6DCsQkaZj+9X8zmde1UYNM8DeaKQMK/HPEsip6+4NeOpzAfygAoSi/pK8K0ShDAfBPr1+9pAIxafYop5UypzOhBpngUDpThhT459dvTdfBBMFAAQjF5tL6NLWnDtKoQgHwx/gEn/J3Z/stoskypzOhBpngUGrC1sqgAu8NWP49/fvDvXQwQTBQAELz/m0HqiCNKhQA700sGk7tHvqHCsOk2W3e1l//N5E5nQk1yBR/wydkWIH37n/nFzqUIDgoAKExhwVOHzxchWkUoQB475RRt6kwTKLWZbn9+t9Qg0xxOJ0mwwq8NfT1j2njqoY6lCA4KACh+vKxPVSYRhEKgLcmpcZRwUtbVBgmUYeFdKXM50ypQaY4oBqxNTK0wDvz3z9NBxIECwUgXOV1aNaI41SgRg0KgHfMr/47TPtQBWESNZhHVYe/Ro1lPmdKDbLBIfWIDC3wxsQVpTqMIHgoAKFbO7uRCtSoQQHwzqBLn1BBmFS7l9EHMpezoQbZ4KA6VgYX5K/Xsi206oOuOowgeCgATlhyZUqFapSgAHhj9PG/UCGYZO0rcvv0/3ZqkA0OqwL2iQwwyM9v375LBxGEAwXACVvK6tE9R4xVwRoVKAD5K06NTfwJf3ZWOI8271FODWQuZ0MNssWBdbUMMMjd4OXf0rer2ugggnCgADjjo7s6qmCNChSA/EwqGk773L1ShWCStS6juTKPs6UG2eLQ6sC2yCCD3Dzy7iU6hCA8KADuKK9DjxwzTIVrFKAA5OeoSx5TAZhkBRz9+yykrjKPs6UGueDgek4GGWRv2Bvv05aP6usQgvCgADjlPzNaqXCNAhSA3I057koVgEnXspQ+lTmcCzXIBYfXUBlmkL3F7x+rAwjChQLgnNln/0gFrOtQAHIzqfd4Knx+vQrApNt7If1M5nAu1CAXHF712Gcy0CBzl7z5");
    imageData.append("vA4fCB8KgHM2zN1NBazrUACyV9xjNDV76msVfknXpIQ2cmbUkzmcCzXIFT+g62WoQWaOXLaJPvnwQB0+ED4UACe9fl2RClmXoQBkp7jbSGqL8/xb7bWAnpH5mys1yBUHWUdmLkqgAg5qduvbf9DBA25AAXBSZXkB3XvkaBW0rkIByNykohG0/5/eVsEHW8/8R4e9SgfK/M2VGuSDw+xlGW5Qsx8v/zetWdVCBw+4AQXAWZ/c30EFratQADIzsetwOuy3C1TwQVrbcvqrzN18qEE+ONBOlwEHNXv6vXN16IA7UADcVV6Hnhx6igpbF6EA1G4C63Plcyr0IK0uO2gJTZC5mw81yAcHWgP2pQw5sBv5xhtU+VGBDh1wBwqA0/47q7kKWxehANTumOIHVejBDi3LaAPnRl5n/pPUIF8pnBkwY6+vHKADB9yCAuC8+cUDVOC6BgWgZieP/n8q8GBX+y2i+2Xe5ksN8sXB1oatk2EHu/q/N5/QYQPuQQFw3qb5DVTgugYFwM782h8/+deu0Xyq5NxoI/M2X2rgBX6gd8nAgx36Ll9Pn3+4rw4bcA8KQCS8/bsuKnRdggKgmQ/84W/+mdmzgsplznpBDbzAIXcAM41FhR8QTX3nOh004CYUgEioKq9LDw44SwWvK1AAdmUO9cOn/TNTby7Rwa/kf95/GzXwCgfd0zL4gOgnr39K61c11kEDbkIBiIzP/9JeBa8rUAB2MCf5wXH+mWtdRh/JfPWKGniFw66fDD8gmv3eWTpkwF0oANFRXoeePv0EFb4uQAFIM6f3xRn+srPvQhou89UrauAlDrxXZAAm2eBl/6aZbw2nx988kx5bAVHw7itd6JNF+0COPqvYi1a/1IzWvNgkEO/dcpAKXxegAKQv7INz+2enaQl9K3PVS2rgpRRODKR0WEjqTQaIszaP/Zt+ceK1KhSTJOkFwFzSF1f1y167Cpoic9VLauClVPoqgX+TIZh0KAGQNPVf2kxn");
    imageData.append("XPiICsakSGoBmFQ0nI665DG1PUDtCufR5v0WeXviH0kNvMaBd6EMQEAJgGQ6/NbldEvfC1RAxl0SC0Bxaiztc/dKtQ1AZlqX0QyZp15TA69x2DVh38gABJQASKbWj39F/3fSb1RIxlnSCsDo439BDZ7foN57yEyDeVS5z0JqLfPUa2rghxROD1wtlABIonovbaHTL35MBWVcJaUATCwaToMufUK935CddhU0S+aoH9TADxx0zdnXMvwgDSUAkqrrH1fQH/pdqAIzbpJQACalxlGHaR+q9xiys9s82tL5FWolc9QPauAXDrrJMvhgB5QASKpmM7+jsePvVaEZJ3EuAOan/lNG3UYFL21R7y1kb88KekTmp1/UwC+p9GcBcKngGqAEQJIdcPcHdPVxv1ThGQdxLQDjB11E7XBiH880mk+bu71GTWV++kUN/MQh9zMZerArlABIMvPZgB//8iX6Y+9JKkSjLG4FoLj7KOr1q5fU+wf56bCA7pG56Sc18BMHXEP2mQw92BVKACTd7k9+TRNG36GCNKriUgDMFfzOOONGfMLfB01KaCOv/w1lbvpJDfzGT7BYBh5oKAEARIfe/hZdP2SyCtSoiUMBmNCvmDpMW6XeI/DGPgvpDzIv/aYGfuNwK2SfyMADDSUAgKj+i5tpwG9KuQhcoYI1KqJcACb2OY96/vpl9b6Ad5qX0jpe8wtlXvpNDYLAT3S8DDuwQwkASCuYXUm9b1xE1xxzlQpY10WxAEzoX0yH/XaBeh/Aex0X0bUyJ4OgBkHgYKvPPpJhB3YoAQA71J1TRd3/sJSuOuEaFbSuikoBmMDOHXQRHXTrcvW6gz92L6M1vM7XlzkZBDUICj/hUTLooHooAQDaobe/ST8/ZYoKXNe4XgBM8J895HLa78531WsM/qnLfriYfi7zMShqEBQOtQK2QgYdVA8lAMDOnENg3Phpzh4+6GoBKO42ks465Te0131/Va8p+K91Gf2H1/YCmY9B");
    imageData.append("UYMg8RMfJEMOatZhAamNCADSdnt+A/W6cTFdfMbv6a4e56ggDotLBcCcuc/8tG8+2Fd3dqV6DSEYBXO3/vR/uszFIKlB0DjUZsiQg5qhBADUbvcnv6FjrnqRfn1s+GcXDLsAmF/xT+wzkY6+YDo1nLVWvVYQvNbl9KHMw6CpQdA40DqyDTLkoGYoAQCZ2+eBv9MZFz5CU370cxXOQQijAJjQL06No1NH3kptp3+qXhMIT725Wz/5313mYdDUIAwcaFNkwEHtUAIAstfmsX9T3xsq6Oyz76abBv5MhbUfgioAxT3H0Ojjr6KBlz1JzZ/4Wj13cEPrMiqXORgGNQgDh1lT9oUMOKgdSgBAfto9/AUNvK6Ezh1zJ93c/2IV3l7wqwCYc/KPPXYyDb74UWr1yBfquYF76s+lyr0WUDuZg2FQg7BwmI2V4QaZQQkA8IY5x8Bef/4n9bppMQ29fCadx6XgV8dfTbcfMUGFejbyLQCTikbQpCPOpnOGXErDzvwdDbz0CfxaP6J2L6OHZf6FRQ3CwkFWly2V4QaZQQkA8I8pBm0e+2rrtQl+dPXLNHLSQ3Tp6TdtPSvhjYMuo9uOPL/Gow5qKgDmb/Um4M0hecU9RtOEfpNo1Am/ohPOmUo9rptHrR/GT/Zxsdt8Wsd2k/kXFjUIEwdZXxlskDmUAIDwmJJgDkNsPuO/1PaRf2394OGBU1dS1z+uoP5XzqJ+k5/ZGuidf/8a7ctzE+y7zVqn7gfiq30FnSdzL0xqEDYOskdlsEHmUAIAANzTqow+kHkXNjUIG4fYPmytDDbIHEoAAIA7CudR1YFL6GCZd2FTAxdwiF0uQw2ygxIAAOCGvRfSNJlzLlADF3CA1WPLZKhBdlACAADCtXv6fP/1ZM65QA1cwS/Y4WyzDDXIDkoAAEA46s8lOmAJDZT55go1cAkH2I0y0CB7KAEAAMH7wQJ6VuaaS9TAJRxeDdmHMtAgeygBAADBaV5K3/Pa21Dm");
    imageData.append("mkvUwDWp9CWDq2SgQfZQAgAA/Gcu9vPDxTRM5plr1MBFHF7TZJhBblACAAD8tWcFLZQ55iI1cBEHV0v2uQwzyA1KAACAP5qW0MbuS2l3mWMuUgNXcXCdKoMMcocSAADgrbps/8V0gcwvV6mByzi4Zsogg9yhBAAAeKdtBb0rc8tlauAyDq327CsZZJA7lAAAgPw1mk+bD32V9pa55TI1cB2H1lAZYpAflAAAgNyZX/3vvZAulXnlOjWIAg6tqTLEID8oAQAAudm9jN6UORUFahAFHFiN2UoZYpAflAAAgOwUzqNNey2gNjKnokANooIDqzvbJEMM8oMSAACQuTbldK7Mp6hQgyjhwLpCBhjkDyUAAKB2u5fRHJlLUaIGUcJhVcBKZIBB/lACAACq16yE/tNpsZuX+c2UGkQNh1UH9o0MMMgfSgAAgFY4jyr3W0SHyDyKGjWIIg6rYTK8wBsoAQAAO5hD/vZdSFfIHIoiNYgqDqsHZHiBN1ACAADS9lpAi2T+RJUaRBUHVVP2ngwv8AZKAAAkXasy+i+vh01l/kSVGkQZvzEHse9keIE3UAIAIKkazacth7xKRTJ3okwNoo6D6mRWJcMLvIESAABJU28uUafFNFHmTdSpQRxwUE2RwQXeQQkAgCTZeyE9KXMmDtQgDlLp8wPMkcEF3kEJAIAk2KOc/sZrXoHMmThQg7jgN6w1+7sMLvAOSgAAxFnTElrf9TVqK/MlLtQgTlLp6wWsl8EF3kEJAIA4ajCPqjotpiEyV+JEDeKGQ2qsDC3wFkoAAMSJOdnP3gvpBpkncaMGccQhdacMLfAWSgAAxEW7CloocySO1CCOOKAK2WIZWuCtH6AEAEDEtSil//B6VihzJI7UIK74DW3HPpahBd5CCQCAqNptHm3quIg6yfyIKzWIMw6ozuxbGVrgLZQAAIiagrlU1a6CTpS5EWdqEHccUEexTTK0wFsoAQAQFeZDf23L6XKZF3GnBknAATVa");
    imageData.append("BhZ4DyUAAKKgbQXdIXMiCdQgKTigrpGBBd5DCQAAl/FP/i/IfEgKNUgSDqjpMrDAeygBAOCiPcpphcyFJFGDJEmlDw8slYEF3kMJAACXtC6jf6YScrhfddQgaXgDaMnek4EF3kMJAAAXtCyj74peo1YyD5JGDZKIw6kj+1IGFngPJQAAwtS8lDZ2fY0OkDmQRGqQVBxOPdh3MrDAeygBABCGJiW05ZBXqZ9c/5NKDZKMw6kfWysDC7yHEgAAQWo4nyoPWkI/ket+kqlB0nE4Hc02yMAC76EEAEAQCudR1Q8X01lyvU86NYCtJeAktlkGFngPJQAA/FR/LlHHRXS+XOcBBaBaHE4jWKUMLPAeSgAA+KGAw3+fhfRLub5DmhrADhxO41mVDCzwHkoAAHjJnN+f15Vb5LoOO6gB7IrD6RIZVuAPlAAA8MqeFfSgXM9hV2oAGofTL2VYgT9QAgAgX23LaZZcx0FTA7DjcLpJhhX4AyUAAHLVuowWyvUb7NQAqpdCCQgMSgAAZKt1OVXIdRuqpwZQsxT+HBAYlAAAyFTbCnpWrtdQMzWA2qXSHwzE0QEBQAkAgJqYT/vjA3+5UQPITCp9iCDOExAAlAAAsDHH+XdYQH+Q6zNkRg0gc6n0yYJwxsAAoAQAwM7MGf5wkp/8qAFkJ5U+bTCuHRAAlAAAMMy5/XF63/ypAWQvlb6AEK4iGACUAIBkM1f1w4V9vKEGkJtU+lLC38nAAu+hBAAkU+MS2oJL+npHDSB3HE492JcysMB7KAEAydKshDYe8gr1l+su5E4NID8cTh3ZezKwwHsoAQDJ0KKUVh/2Kh0o11vIjxpA/jicWrJSGVjgPZQAgHjbvYw+L3qNWsl1FvKnBuANDqdCNl0GFngPJQAgnlqX09u8jxfK9RW8oQbgLd54r5GBBd5DCQCIlz3KabZcT8FbagDe44AazTbJ0AJvoQQARJ85tS+H/91yHQXvqQH4gwPqKPatDC3wFkoA");
    imageData.append("QHQVzKWqNuX0C7l+gj/UAPzDAdWZfSxDC7yFEgAQPbvNo03tKuhEuW6Cf9QA/MUB1Y4tlqEF3kIJAIiOFqX0n46LqJNcL8FfagD+S6WPELhThhZ4CyUAwG3m7/1tK2hRCp/0D4UaQHB4ox/L1svgAu+gBAC4qcE8qtp7IU2R6yIERw0gWBxS3dnfZXCBd1ACANzStITWd1pMR8v1EIKlBhA8DqnWbI4MLvAOSgCAG9qU08eHvkrt5DoIwVMDCAeHVAGbwqpkeIE3UAIAwlNvLlGHBTSD98UCuf5BONQAwsU7x8kpXFbYNygBAMFrNJ8q919MxXK9g3CpAYSPg+qgFK4o6BuUAIDg7F5G/+3yChXJdQ7CpwbgBg6qpuwBGV7gDZQAAH+ZQ/z2rKAlvL81lesbuEENwC288wxj38gAg/yhBAD4o3AeVe69EKf0dZ0agHs4rDqwEhlgkD+UAABvNSmhr/dZSF3lOgbuUQNwUyp9lMAVKVxV0HMoAQDeaFlK8/ZaQPXl+gVuUgNwWyp94qCVMsQgPygBALkrnEebWpfTeXK9ArepAbiPA6sxmypDDPKDEgCQHfNBv1ZltIL3ndZynQL3qQFEB4fWUPaVDDLIHUoAQGYazafNey+kS+W6BNGhBhAtHFrt2UwZZJA7lACA6m27gt+7h75Ke8v1CKJFDSCaOLhOZZ/LMIPcoAQAaE1KaOP+i+hCuf5ANKkBRBcHV0s2LYXrCXgCJQAgrWAuUfsKWtR9Ke0u1x2ILjWA6OPwGsQ+lIEG2UMJgKRrXkrfd1pMZ8h1BqJPDSAeOLwashvZZhlqkB2UAEii+vxT/14LaBbvAw3l+gLxoAYQL7zzHs6WyVCD7KAEQJK0LKWvf7iYjpLrCcSLGkD8cIDVY5eztTLYIHMoARB3hfOoqsMCuo+393pyHYH4UQOIL96p92GPymCDzKEEQFztXkar+Kf+znLdgPhSA4g/DrK+bKkMN8gMSgDEyW7zaH3b");
    imageData.append("CiqW6wTEnxpAMnCQ1WVj2Rcy4KB2KAEQdfXnUmWrMnp4t/m0m1wfIBnUAJKFw6wpm8I2yJCDmqEEQBTVm0vUuozK91pA7eR6AMmiBpBMHGgd2QwZclAzlACICnMyn9bl9GHHRdRd7v+QTGoAyZZKn0RohQw6qB5KALhs2xX7/vPDxXS63N8h2dQAgEOtgI1iH8mwAzuUAHBRy1Jaw8H/c95GC+R+DqAGANvxolGfjWefyMADDSUAXNG8lNZ3XETX8XZZX+7XANupAYDEi0ghK2afydCDXaEEQJjM1fr2WUi38rZYKPdjAEkNAKqTSl9f4GfsSxl8sANKAASt4XzazNvdvSmctx+yoAYAteFFpgmbzL6W4QdpKAEQhMJ5VNm+gh477FVqJvdTgNqoAUCmOOias6vZNzIAASUA/NOAg79tOT1/0BJqLfdLgEypAUC2UunfCFzI/ipDMOlQAsBL/BP/ptZlNHOvBdRW7ocA2VIDgFyl0lcdPJ29IoMwyVACIF9NS+jbdhU05eAl+FQ/eEcNALzAwdePPc0qZSAmEUoAZMucsrdVGX2070IaLvcvAC+oAYCXOPwOYHexdTIUkwYlADLRcD5Vta+gCv5pv0juTwBeUgMAP3AAtkmlPzCY6EMIUQLAxpyut2UpbeCf9h/k7aSN3H8A/KAGAH7ixa1BKv05gZdZlQzIJEAJgO3qzyVqU04fH7CEJvG20UDuLwB+UgOAoKTSVyC8PpXAMwyiBCRbo/m0qX0FPdflFTpY7hcAQVEDgKCl0kcPDGXPsS0yLOMKJSBZzK/5m5fSZ/y+m5No1ZP7AUDQ1AAgTLwwdkilPyuQiAsQoQTEX/15tGX3Mirl97q73N4BwqQGAC5IpS9JfCx7hK2RwRknKAHx02AeVXHof9i+gibvUY6/7YOb1ADANRySjdhp7Am2VgZoHKAERF8hh37rMvqgwwL6xeGvUWO5HQO4Rg0AXJZKn3b4TDaTrZdBGmUoAdFj");
    imageData.append("jtnnn/BX7ruQ/o/fwyZyewVwmRoARAUvuM3YSDaLbZSBGkUoAe5rzKHftoLe338xXcHvGa7CB5GlBgBRxAtxCzaGzWDfyWCNEpQA9zQpoS3tK+itA5fQ5fwetZDbH0AUqQFA1PECXZ8NYFPY66kInnAIJSBc5pA9Dv01/JP+nB8uplP5PcFFeCB21AAgbnjxbp9K/3bgUfa1DFtXoQQEq2AuVXHof96mnO7rsIC6yO0IIG7UACDOUunDC3uza9mrKcevVogS4B8OfPNT/netyqi0bTlNbFpCjeT2AhBnagCQJByyzdkx7DpWknLwMEOUAG+YX+s3LqFvOfDL21fQzzstpj3k9gCQJGoAkGSp9OcHUuwS9hT7QgZyGFACsldvLlXyT/hftiyl2W34J/zdy6ipfL8BkkwNAGBXHMCd2Gh2D3ubbZYBHQSUgOpt+3X+9xzyb7Utpzv3rKCj5PsIALtSAwCoGYdxIStio9jNbDb7XAa2H1AC0h/WazSf/tuilF7nn+zv3nMBnXrwEmoo3ycAqJkaAEBuOKDbsMHsYnYfW8rWyRDPV1JKQP15Wz+Vv7plKb3fuoxm7lFOk1uXUze+ra587QEge2oAAN5JpY862I8NYuNS6aMPprMK9mkqx6MQ4lIC6s+lyobzaU3TEvoHB/0i/on+/vYVdP7+i7b+hqVAvp4A4B01AIDgpNJ/TjCfMRjCxrMb2MNsPluRSpcE628RXC4B5hP3Jtwbzad1zUroq93L6AMO95K25TSNA/7SPStoEP8vTqMLECI1AAD3pNJXROyQSn/2wPyZYRib2K6CnuafnJezD1qU0t+bl9I/m5XSl/wT9dfmGPfG8+l7DuH1/FP2xsJ5tLnBPKrkYK4yH5ozIW3C2vz/ejwzgW2uXc9fs5m/duNu87b+u7VsNd/Ht3xf/+H7/Zy/x0cty2h5qzKa27qcHt2jnG7jYL+ibQWN4P/tw/P2dfBregDn/X9LdEMsLZXd7wAA");
    imageData.append("AABJRU5ErkJg");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        image8ebb9ab962d80dc4db8bd0ad2dba5cb3 = new WeakReference<>(result);
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
BufferedImage image8ebb9ab962d80dc4db8bd0ad2dba5cb3=getImage8ebb9ab962d80dc4db8bd0ad2dba5cb3();
if (image8ebb9ab962d80dc4db8bd0ad2dba5cb3 != null) {
    g.drawImage(image8ebb9ab962d80dc4db8bd0ad2dba5cb3, 0, 0, null);
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
	private shapeStyles() {
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
       shapeStyles base = new shapeStyles();
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
       shapeStyles base = new shapeStyles();
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
        return shapeStyles::new;
    }
}

