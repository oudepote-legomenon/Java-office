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
public class Outline implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagec409b2c374af6440bfc799e5a6e1149d;
private static BufferedImage getImagec409b2c374af6440bfc799e5a6e1149d() {
    BufferedImage result = (imagec409b2c374af6440bfc799e5a6e1149d != null)
        ? imagec409b2c374af6440bfc799e5a6e1149d.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(18080);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAALEAAACxCAYAAACLKVzFAAA0v0lEQVR4Xu1dB3gVxdq+oVcVBaSDgBQpCqIIior0poAKekGqinTpXbCAqIAi8mMFL4hIrwEivYOEkgRCCISSQHrvyck587/v2R3c7ElyTg7elHM3z/M+ezI7831T3p39Zuab2X8JIf71X4QbUAQoqoK/GSahj1/YwDLIst1veaQs1pH+nha8X0yNe7867YG6ygBlgeLi/vTdT9ocYRPgJIqkp6eXT0tLq22xWBqFhIQ0uX79elM/P78nvb29W1+4cOF5Ly+vNpcuXXrG19f36StXrrQEWuD+U/7+/s2uXbvWNDdITk6uL5TKteo3m81Fw8LCagQEBDzhjLzsIGWlpqZWh55SQm2IjIyM4tBXHfeasXwXL160lu3q1atP6mU4CtRLS9YRrykpKXVUfffqODExsXxgYGD9y5cvP33+/PkXqJP1yDzoZTkClk2Wz2QyVWAbSl1oQ7e4uLiHWR53d/cBO3fuHPTXX3+1d7Z80NOcacGJZqGhofVRfw9q9d0vbAJyC1RAGWZu3bp1wzZu3Ph7RESE58iRI30bNGhw9fHHH/evV6/e9bp16wbwWr9+/WsSvCfBuLnBqVOn9kN3D6EQuWhQUFCjESNGfN+sWTNvZ+RlB8pq1KjRFZDrR+h5CXgAKIWHpcWoUaOWP/nkkxdRrmuybPejm+kpp3Hjxr4g6RroaQuUZB3joS23fv36fl27dt3DuNr6dFanrHuWD+03BXoelW2Kzqj0ihUrPmjbtu2J6tWr3yEee+yxG/erq2HDhv7jxo3bFx4e/h70sGPg28SGU7mFTUBugMKW3bdv36vdu3f3qFat2t0+ffokomfK6NWrl+VfEP3fwq5du9KgfxPQHHhgw4YNM2rVqnW7SJEiZn3c+4Wbm5tlz549sdCzAmgNPPHLL78srlGjRlDRokUz9PHvF9T3559/3oWehUAt1jN6sWf7");
    imageData.append("9u27uXz58vH6+PcL6vPw8AiFnq5C7R3RC1fs3bv31uLFi6fr498vhg0blopO5zT0jESP3zQpKakaeuZyUrczsAlwFOiBSx89erRrhw4dDpYqVSqFGaxatao4cOCAhSRm5RD6QvwTwOvNjDxsBJoBZfHKG9WkSZNLxYoVM/G+1J3bPGSXDvJToOd3oAPQ6qeffvqaD8396ssKKqnCoOdr4DHWNcyGtj169NhVtmzZRH18Z6DPJ+rTBD3vCNVkioqKqtqzZ8+dsnzaNM6WT6ZdsmSJKTY2Nhz8OQa9//nyyy+/OHz48CCYbI2huzT1S445CpsAB+F29+7dx/v377+xTJkySczkww8/bJk+fXoawgOBk7CFDgKHYQ+dQE9yFvDE71MIOwoc0uBwFjiiwvo/0h1HQ/rA7gwF7sI+PIk8vCoUc6IInuSqsFGn4DW/UyOX+iX4P+VRt5SrzYMWMt+nYLN7AefRW2yHnoFAFaAsbNa2KOMi6NujSZOVvkzlyAFHoe8k6ugM6wvmwyro6URdrG+Ur0pkZOS7N2/e3Iz7xxCf0JbBKkPVZa98Mr+HWK/Uh/LthZ4XhPp6xxijHF75E2Bm7GU9MJ4qU5aP9XOM95hn4LQa74SaP+ZBr/PQuXPnDsLc3IXx01qYR8dgrtytVKlSJEyNOyDyzyjn09BfQuWYw7AJcARQVhqvvN60QUngBx54wPLtt98mg0jnUQGzEaeVUHqResCTQrEn26vhjYC66n1eGUcLDtoeVyH/Z4/bB/gUmCMUe5ENLJ9aXh8GagtFppQvwf8pj7oJ/tbH0YI6nwV6AZ2BJ4CHxN82HG1V2pC1s0ir1ddAvbIcWZVVlo95agE8p15pRvABleWjXg6G6gglL4QsA0EZDcXfZZP69PnSgnGaCqV9+PveQFkor/ZHhCLvGaHUP+No64dp2Z5thGJmMR7z3kQo5dbGtwLmA68c/NeCSTi1efPmV2VvP2jQoDi8AT7E/Yoil72x");
    imageData.append("TYAjiImJqYHB20qQN44ZGD58uAW9xHVkbrJQKppTQIzLzLAB+HSx4RmeUwZ5TwsZxkplJbOArFxO9+jT2oOUo5WdHXifeeXrja9YSd7cQF8O/T19POpguXjNKo2MyzLIcuhlZKcvO1BOTvp4X07nacNlPniPeSZkPH3esgQI2xqDvC3lypVLIIcwUBW+vr40Efkw5Kp9bQIcQUhISP2OHTsekAOpX3/9NRWDvN1C6b30BTZgwAbo8MpgbPF5xYoVI9S3uTh06BAHtG+LzG8Fu7AJcAS0h1988cUj0mjHQCQQ4dOFYjPaxDdgICusXbt2XuXKlcPIIXSIHEBz1ul9gLMVNvGzg02AIyCJ27Vrd1SS+OjRo55CsXmlGWHAgF2sW7fuo0cffTRU8kiddfpA5BWJ2RPL6ZZjx45x3o+2jE1cAwayw/r162dXrVo1WPJIJfFIYZDYQGHBhg0bZnKRTENiizBIbKAwYePGjdO58plvJH7ppZcOGyQ2cD/YvHnzFK27gEuQmN5TkF3n0KFDr+FVMxKj1/HE77//Pk4Cg4Gxf/zxx2jYUyOBUfh/DMLHIl6m+2oY047ds2fP29HR0Y9Dvn41yC08PLza4cOHezHNb7/99qFMQzm8qnr5/xgV98I1eWE+rPoog/du377dHvroMHRPH73t6L23ZcuW4WvWrJnAuKrOcRJafZQt9fI36wQN/97WrVuHb9q06X2GI/141kVwcHBr6LOu8GlBfdu3bx/CvDGPSP8u/4eMYZSF3nAEZBHv4/cH2jqVeZF1KfPL9JGRkc2hj3PoNu3oKLZt2zaBjkWFncRy4r5oXFxczR07drw5duzYb9u0aXOydu3at6pUqRJC0PgnaD/Ro4qvID7BNWvWDOT/8j4h7zOuTENvMzTO90lJSf2FsmBCQhX38/NrOm/evLn01qIsjpSpT+rhVUJ6c+nDqEvmg2kpg/e+//77PQkJCSOE6h2GBi+Kh6XLoEGD/kPvM8aT");
    imageData.append("0OZf5plyJbRlpvcaPcLY+FInw1euXLkpJSWlq1CXqomzZ88+P2zYsF/oqSbLxfT8n95l9IarU6fOTcoi+Ftbp9qyyrIRDRs29Nu1a9cvaWlpXPrnSqa+XR0CScw85BuJX3755UPOkhjpG4BUgzw9PWekpqbOQNjY/fv3f9mjR4+TnPwuUaJEmiyYdBy5H3Bpc8aMGdHodekj0AUoExsbW++LL76YT0KVLFkylfHkVI8+vaPQpp88eXJyaGjoBeh6GSiSnJxcEWG/PPzww1F67ze9nOzAOiGYnlepk7+nTZsWj45gHnRVYx3joSmybNmymSSm1lFJppcy9NDrlNDml2nx0ESgTDugawjas8fevXuHotcfajKZuOBl80bICngjTWL+Ch2Jg4KCms2ePfsr9o4dOnQIO3fuXAjCfVasWMHeIYYVpK9AZ6Gt+A8//NASEhJyEbreBOjg0mL06NHr5NJ5VoTKLtweGH/8+PHizp07kdDVDSiCt0Dl4cOHb9e6N+rTOQNN+cwxMTFfCsVP10rihQsX3lsRy05fTvf00NYHOiHw1RSA9tyO9tzTsmVLn86dO19Cx/Qb3nL0OclkSmUFmDDT2PNL2XlO4izMCTqB5LhmnpGRURK23XAQ2Iu9bdmyZS2rVq0y4zW4D6/eeei5FtDbycfHJ+rixYsmIN3b2zteeq8hPAyIVBEBhKu/o3hV491R40Z5eXklqzJiIiIijqBy6dtB55Ri+F0ZvfHAGzdubGdaxMsgmAbxYwn8TgRSVCSr/xNJ6v8J1EN9ly9fvs38yHsoyxWUd6FQnF9IqpLoKftdv359H8t04cIFi6qPshOkLoSlAamUg3hxAMsWDh3B0HELvd0Vetf5+vr64140y8c0KN9hlKk3dJWX9Z2YmNiJnnY6fclqfUWoZWR+mQfqi2dd8R70BVEXvQ8J6LvGdEyDYF88lKugY7KHh8fH4MJ5uuOiTU1vvvlmBPixVJY7J3B2Ij9J3EA3");
    imageData.append("xXZGKN5MOZLY39//mYEDB66tUKFCNNO+8847Ao3qjQZmxul1Re8teo3RlpwITABGA8OBocC76j2Cy5MS8n8Zj2DYOICeUVwFoly+aulcwnzSx6MS8KKadpJQdDLNKBVj1P+JsRrIMN6nHuobDLynuU/7m2XSOkPRE62DUMrEB4r6xgtFjtTF/DKMcpgH5p1yhwGDhCK3r1B8DHiPdcQ0LB/tfY4xZJ2T0B3F3/pYRupgnimT9S7zyyvjMYz1MUQoul5T8W81He/zbcYNCZXQETSDWbaINjO5gI7JfOLEifVoU3qz5cgHmBOTOfbJN3MiCxLb7Yn37dv3Fs0I2mgwHcTu3bst6K1+EYqrH8nFBuCIl68iNjjB32wMCf4vkdX/2nhaGZSrbWCC/9O7jvE5QNHG16bPDlq9rHhe5T3ahXpnKNaPLJ9en162Xr7UQbly86Y2XVbl0+uTOrV1l5M+qYugbnmf4bIzKIVe/nUMxn0kH9DD7oGp8byw4xu8ffv28RxoyjFCnpIYT9/jixcvPvzBBx9YRowYIWACOGQTI5ODObJmYfHaYTraw+wdKuvjGig0cIMp8wx4sF1ukFi+fPlJmIj0/+aDoI9/Dzt27BiXbySG7VUbg4gNsPto+6Wlp6dz1P+kPp4enF/kbAAzPGbMGIHB1Wah2RBpoHAiNTW16s8//2zd58i2XbBggS/GODSFrNOZ2WHr1q0T822eWCivHiq7DtwRym6LqlnEy4Rt27bdIzFH73gQvhHK7ogczRADBRvo1ErAVHyd+xz5lp0zZ85dvK3nCnW6LzuAxPk3xSYUe4gDopMAp6040LDryJwFiRcJdUrIQKGG2/Hjx7tyvEMST5s2DU0bs0QoHZQ+7j14eHi827RpUx857QgSZ4i8csXEyLN4SEjICxhdnly/fr1PUlLS68KBCW6DxK6LEydOdJEk5kJPdHT090KZnbGJKwFbusWPP/64AVxI4NjKz8/vqlD2UpbWx80J");
    imageData.append("NgGOIDk5+YG1a9cOb9u27VVkPBgDtE8RXkMfTw+DxK4LLYknTpyYFhUVxVknbii1iSvBLUrx8fFfhYWFRaJTFCaT6VuhbHTVz+rkCJsAR4AnqObQoUOtG0W5ZHvmzJmdQpk3tImrhUFi14WWxBMmTEgHiVcKOyQWylhoCnATSBfKnDeP1NLHyxE2AY4gODi4XseOHffJJWLYQyeEsn3bJq4WBoldF870xCrGAv5AnFAWU3KclssKNgGOIJtlZ7vzxJLETGeQ2LWgJfGkSZOSQeIfhHL2hE1cLTw9PWevXr36LmzjNJgWnJbjYopNvJxgE+AIslixc5jEcrHDILFrQUviKVOmJGJg93/CzsAuNjb20enTpy9v1KhRVNWqVc03btzgjnm6AuRqytUmwBE4S2Iudhgkdk1kQeLlwo4TENK8Tl9ujqs0PKKrLJfKbeJnB5sAR+CsOWGQ2HWRxRQbzYkce2L99iR3d/ckoThx/ffniQ0SG9DDmdmJdevWzZHeb3m+YucsiQ2b2HWhJTEd9CMjI9cIxXfbJq7EOtvDU/KWxM7s7DBI7LrQkhhtawGJ1wo7JP7jjz+sPbHk0c68PjzFILEBLZwhMQ9P4aZUyaNdu3bxsG/OFRdcEiPeO2+88YbvM888Y168eLE5ISHh3p4wA4UbJ0+e7NyiRYvzGpt4lbBjE2/atGmqdmCnfsaCu0oKLolTU1OfDwkJ2RwQEMADle+azWY6xHNe0CaugcIFtOdzHh4eO3799df48+fPB6Snp08Vdk5JlRtFNSTm0nPe9cTODOyEkjnu4/IElgnlVHHjJE3XQBmTydQ7JSVlO66cI35K2GlbvTmh2sR544p5HyTmSgw3lHLTYjehONfr4xgovKDfA+1gLnLYXbBYv379rHw9FdNJEnMbeavw8PD3YVq0E7nMrIFCAXmqk92lYzk7kW9TbM6QGK8aflTw3SFDhngcOXLkY7x2aPjnynfUQMEEz9FLTk5+EB1U");
    imageData.append("XbQzbWG7393I93liZ0js5eX1XP/+/f/gUU4LFy70Qa/MsxRy7T9qoOCBn9FFBzXgvffeW33w4MHp6KBoUuiPEMiEfCexM7MTu3fv/jc/G0Y/5EmTJqXFxsYuEHY2ExooFHA7d+5cu06dOv3JjRJLly49qm5Zy9GtUi47a2zigk9iw3fCZVEE5mFP+V3D6dOnR6NtFws7G0VpE+sGdnlLYmfMCYPELosiR48e7SFJ7KgDEGcneGysQWIDBQLcst+8eXMv8mHixImpIPFPws7ODpB4po7EeTvFZjjFG9BC6zsxderU+OjoaC5m5egUnw2J82axAyPRet9+++2eUaNGpfM8tuvXr/MQFbsbRQ0Suy60JFZtYrZtLX08LWAT598nwCwWS+WEhIRPwsLCgkNDQ+PT09N/E8rHrG3iaqEjsQUF/UoYJHYJ6Egc5QiJOcWWb4sdQpnI5kGA7sApYKBwYAlZS2Ke3G6Q2HWgJfG0adNiY5Rz9uro42mRr/PEKji/y+9t8IlrJuxMbBNaf2KDxK4FnU2c4IhNTC823Xfs8u4sNiI5Obmyl5fXh2fOnJkPc6KxcGCt3CCx68KZ3c43btx47auvvjo2ZsyYFJ7FdvXq1SsI5ycbSuvj5gSbAEfA77H5+vo2w8Dut379+u2DbcxTMe0+PQaJXRc6ErMntkti8KhqXFzccvAnKiQkxGwymb4TihdcrvxpbAIcQWJi4kPffffdaH4LrVKlSuHe3t48KCPHOUHCILHrwpkpNqGQdQxwCfARyndI8uYYKzw5tenIw+Pt+f2NkydPHkR4C308PQwSuy50A7s4kNjuwE5FD6FMEEhHerveb3rYBDiC4ODg+u3btz8ot5UcO3aMMxR2FzsMErsudFNsaFr7vhOEv7//gK1btx7ft2/futTUVM545fixmqxgE+AInF2xM0jsuiCJn3rqqQts2xkzZnCemG2b4zxxUlLSQwsWLJjfokWLoJYtWwaCV4NFXpkT");
    imageData.append("zvpOGCR2XcCk1JI4Em37hbBD4osXL3bs0qXLXmmWnj9/ngeu5NqksAlwBAaJDeihJfHMmTMj0LYLEV5TH08L/XfsYFIEIfwt4cD3X7SwCXAEBokN6OFMT6w/ASjPD08xSGxAiyyWnb8WdgZ2xoGCBgoUtCSePHlykiOHbGfhxZZ3y87Obk8ySOy6kCQmHyZNmpQSFRX1o7CzALZhw4YZusNT8taccIbER44cGdy3b9+rrVq1sixZsiQjISGBxr+xUdQFoJ1ic9SfuFCSmAemBAcHbwsICEiIjY09YLFYugsHPuJooOAjPj6+IYi8fM2aNRE+Pj6nTSbTm8LObucs9tjl3c4OZ0kMPAzwCzkbhGLA83vQdl04DRQKlM7IyHg2PT19Aq5DhNIL5+jIk4VNnHc7O+6DxCRsS6CnULyVcr3EaKDAgq64pYDKQEXhwIKFfootz2cnnCSxW2JiYmuMXPvidWOQ2DVBMtv1LSfydWeHsyQGeav88MMP0wYOHHjw9OnTE81m86P6OAYKL/jN78jIyNppaWk0G3M0JYhCSWIesMH55XLlyiV88cUXXuiVhwjjLDaXQHh4ePXvvvvuw759+7p7eHh8DLs4x5kJolCSeMeOHYMaNmzox3STJk1KjY2NnS+MKTaXgKen50vsoEqXLp28aNGiv9BBcfPwQ/p4WhTKs9i42CE/UG4sO7sOLBZL0cOHD7/atGlTH7ato/7EhZrETGes2LkOQOIiIHEvSWJHV+wK5RSbcXiK60J7Fpu6UZSbPnPcY5ffix367Um5JrFhTrgWtA5AM2fODEfbfi7s+BNncxZb3vTEMNqrr127dsWECROi1bPYTggHz2LjDmmDxK4HLYlnz54djEH7J8JO22bRE+edTQwUT0tLex52z6GwsLC76iefcrR/CKMndl1oSTxr1qxQkPgzhNfQx9MiXw/ZVsENfV2B8ULZrm939c0gsetCZ05we5LdnR35OjuhgkuL3AvFtXKu");
    imageData.append("mevv28DY2eG6yGLLvt2dHXpzIk+/KEpwbjA1NbVCUlJSVfw2SPw/Dt0JQDw85Vth5/AUHx+fkXPnzr0ycuRIk+Ystj4iL85i47xgUFBQrZ9++mn84sWLP0pISGgu7HwClTDMCdeFM8dYYSxFZ7BtoaGhCSEhIRn4X9rRuXLPtQlwBDyLbcWKFR9wXpBbrv38/D4Wdox4wiCx60K7s8NREgtlQ8SXQDgQCgwReXV4Cp6aur169dpRokSJNPUstgPCgbPYDBK7LrRb9lUS2zUnhDKumg7cAnYDLwIls4iXI2wCHAFX7HiMFY1xY7HDAKEjMW3ipcIOiWGWFj979uzc1atX38V46VhycnJn4eAkgRY2AY5AkliOKg0SG3CGxLCFHx83btyvDRo0iIVZGh8YGDha2PF8ywo2AY7A2XMnDBK7Lpwh8f79+wczTfHixdOZ7uLFiz8h/AnhwCSBFjYBjsBZEhtTbK4LZ0is951Qz2LrL/LqLDZnvNgMErsunBnY6Xd25PlZbE6Q2A0kHmr4E7smtCRWj7FaIewcY6Un8c6CfowVV/g2b978HueVmcYgsWtBS2JHP1CehVM8SVxwe2JOp2zcuHFE3bp1AwwSux50JDaBxP9B+OP6eFroj7Eq8OYEe+KDBw+++9prr13nWWzLli2LSUxMnI17xrZ9FwBI3LlFixbnNTax3RU7kFjvFF+wzQkiJSWlY3Bw8M5bt27djIuL2whidxHGWWwuAbxVW6CT+n316tVR3t7eniaTabCwcxxDFuZEnm5PcorEQjneiF5KE4FOQjmbLVfOHgYKJtAhPQji9kxNTV2UkZHBRYs6ws4BKll8oDzvtifdB4lJWJ6USDJzLtAgsOuAfhD8SH1tobSv3QWLLGYn8s4p/j5I/C88pRXS09Or4MkliR06s8tAoQE7JZLXoc6pUJI4Pj7+EXd3935Lliz57MqVK6+bzeZKwiCySwCmRMk7d+409fX17ZCQkMD5Ybvb");
    imageData.append("1Qolif/666/2ffr02cIR6bJlyw4nJSW9KewcxGygcODmzZuNZ8yYsah37957jxw5MhFvXJ49bRNPi0JJYmTyncaNG/vyvIrJkyenqDti7RbWQMEG1wB4jFWrVq3O8iy2H3/8cQcGeC8IO77B+bpR1EkSu23dunWYsWLneoBZWHrPnj1vN2rU6ArbdsGCBb4wKThV9og+rhaFkcR0ALL6Thgkdi2wJz5w4ECfJk2aXGLbzp49O8SRw1Py9dyJ+yUx0xkkdim4gQPd5FlsIDEPT/lU2Nl3mcViR56SuL6TJDYOFHRRaL9j99FHH90BiecKO2dP5+s3OxITE6vBnlk+ceLEqNycxWacT+y60G7ZnzNnzl2QeJ6w07b5OjvBw1Iw+uwWGRl5Kjw8/LbJZLL76iAMErsudMdYOfSB8nwlsVAWKHh8FY+0/xB4SjgwuW2Q2HWhJfGUKVMSo6Ojlws7Xmz5TWKC3ymjzcPVGXqi2V15M0jsutCSGGZmWlRU1C/CjlN8vpM4PT29bFhY2LOhoaFtzGYzHT9s4uhhkNh1oSUx2jbDEad4T0/PGdOmTbvDcRXPYvPDn8irs9hA4JLHjx9v//777/+BDKwDGdsIB74gaZDYdaEjsRnjpdXCDokxlmoPs2MPOsKkkJAQgf/JhzrCQQciCZsARxAREVFzyJAhqypUqBBdsWLFCPW8gBwzTBgkdl040xMLxW9mHnATOCeUXjjXmyRsAhxBcHCwdZ6YPhAECnAU4U/r4+lhkNh1oSWxusfuV2GfxBxH0QnsT4DnGTcVDrzR9bAJcARcsWvXrt1RaZDnZrHDILFrQkdih3Y7E5cvXx6xYcOGi7t27dqTkpLyiijoZ7EZJHZdODM7gfavOmvWrG+bNGkSDl7EBQUFcadzrl1zbQIcAUns7DFWBoldE1oS85PHIDHHSTl+jMjDw+NdfsBRnsV2/PjxYwjvKOy4cOphE+AIDBIb0ENH4uTo6OgfhJ0TgPS+");
    imageData.append("E+7u7skIf1fkxTzx/ZJYHcEaJHYhaE+KhznBnvhnYacnXrdu3dx8W+y4D1fMez2x4YrpWtCeAOToPHG+kzi3PTFPANq0adP7xjFWrgmtOUE3W5B4LcIb6ONpka/Lzs6Q2Gw2l4INNPqxxx67oZLYMCdcB25Hjx7tIZ3i2UE5QmK9TVzgSYyeuNiBAwfek2exLV26NCkhIYFfXTI2ihZ+ZNrZwRU7R8yJ/N7ZkWsSA27Jycl9g4KCTgcEBCTGxcVtArG5IzbXk9sGCh7Cw8Pbg4THVq5cmXru3LlbaWlpPCzS3s6O/CWxMwM7oRRqGrBTKJnliZh2XTgNFHygQ6qSnp4+Hh3VAZPJxCXkZsLOUVbSnMg3m9hJEvOAuZeBYUL57p3RC7sO2LZ1gHZCWamzu2CR7wM7Z0iMwV2Z6OjoN5D+I3WdPNceSwYKNHjKKRc4+Bkvu+6UhZLE/v7+raZMmfLrK6+8cg2DvIUZGRncvmK3sAYKPrhJguew7d27d3JwcHBXHvWqj6NHYSSxm7u7+wAesFG0aNGMpUuXHof9RP/RXH/L10DBw7Vr15784IMPVj7xxBM3165duw4Du+eEnX2XhY7EeDKLbNmy5V15jNXIkSO5mXAe7lXRxzVQuAAzkScAvdqyZctz7KA+/fTTwPj4+JnCzvRpoSMx4LZjx457Z7E999xzllu3bi0XyiDAMCkKMWJjY2t9/vnnn/G0U7btggULkkFiOgDZ853I38UOJ0hM17tBDRs29GO60qVLi19++eVIampqL5HLTBsoOOA5bGfOnOnSrl274yVKlEgjH3777bcw2MjzhZ2zSAoliWH4d+vZs+fBUqVKpTBd7dq1Ezds2PB9UlLSk8KJbSkG8hc0I27fvt1ozpw5C+SnvOrXr285f/48t6uxc8px9ilfDxTE6LNep06d/qT9kxsSo9et+c033yzUTnA3bdr09vz585ccOnSo1+XLl5/GAKEZ0PTGjRuNYW40CAgI");
    imageData.append("eOLSpUvPAK3i4uIepSORViZtbcY5ceJEV56RC/TiOv7p06c7enp6vgS8ePbs2Zd5wDevBMNQ0e0uXrzY1sfH51k8XC39/Pyeoh6moTMLepcOYWFh9SA/03xnRkZGcebx+PHj3aS+I0eO9OSyK/PAtLjHq/U3P41FaMNPnTrVCflgftrzN9J2530Q4ikQI1MDYoBUmvXA/Kh6rHE1MrsxTMW9PMg4rAfqOXfunLUeGCZl8GR3Tnvq6zMoKKge0lEfyybL151pkY9XCPzfFaTrN3369K/4di1WrJiJ7Tlz5sykmJgYbk1qJOwsZOXrih16ziqbNm36avLkyeHjxo1LROVvEMrX0W3i6lAMD0DP4cOH7y9TpkwyM87CP/LII5F043vttde2DRgw4LeBAweuGTp06EqMdlcMHjz41x49euzq1avXjlWrVs2Bbu0iiRuI3wryfubh3ejZb9apU+cm3T35TbW2bdueeP7554/D/j7VunXr0wR/M4zbqzp06LC/W7duu3l6/RtvvLERb4mdbdq0OckZlKefftrz66+/XpaQkPC80JyDAMK3GjZs2C88ixf6blEfPfPYkBiZXyaYF14pp1mzZt4Ef8v79PaS+eHvBg0aXOV99GgboqKiBghlZbMoXsmPkESjRo1azvxwPCHjUiZ3RTAfDCOYB61u3me9Us8LL7xwjGWnf4PMKwZgqyMiIrjw1BAoiwemKh+CMWPGLOMgjc5aBMtH+ZTHg7QJpmfZ2XbcmQGI0aNHm9H5eOFBoGM754z17Z8J+UpioAQquA0M+v/gqduEp/ktYeebZRIoYIWQkJDBeIKPV6pUyUpkSWYQO6lcuXIJ5cuXj3/ggQfiHnzwwVj+5unjBEgWERgY+J1QBwx0Klq8ePESyAnnrmvKYYUQlEcbjVAr+R4YVrJkyVSaNZRLvWXLlk3kb97jG4bpu3fvHoXeaoFQz0KAvhIrV66cQfJKfVIn/2c6uQNc/q+FDKNsmRdt");
    imageData.append("eOfOnRPwRjgplOPBHkXdvjJ+/PhdJArTaPVoZeqhvS91yXrQ6uvSpUs83kS3oOtLgN8Y/AAP6PGHHnooRuqT0Oad4P+SfLVq1bLgbZqBziwAXKBTF9snx89/EfnqxaaCG/raAuypKgnHZxjcQIZHExMTB6KX2YWnNwJPeAYHepIU2QGDB4FX+R6hnP1GOcW+++67+Tz7Qh/3nwB6azMa5nuhuBQW4Ynoy5cvn1+5cuUwWfH/JKDPApPmqlA+SFgDJO6MXvhPPlz6uP8EWJ8wq7gliJs6++KBnYw30mWSVR9XDzxYAm80nkVsgekRFh8fvxftMUUovXqOPhMS69evn6X7omiek5hPGpXxVesogSUYvzzsyw4o/LzQ0NAfQZY/rl+/vv/q1at/AadB1oOwdfeoYWfQQ53HgNLdZDK9J5TDDCnHLSUl5RmEL8Zr3s/LyyvR29s7+sqVK5eQzgOvti03b97cjOt2yNqlyvMA9uK3O8K34f4m4A/Ynb/jugH3/oQub8gLQKMeVr+MKY/tL4KHrxfyuhr3r0NfEnqyKOTPE7J2IP166oPs3cw/cIjyqJu6mB81T9S5kWn8/f2PQ9Y1mEU3oe8Q3nA8YbQpUAKkqIFxwBDkbR31oWyxIHkw60LK5RV6jkLOCVyPqOXerupYz3IBvxFq+Q6gfi4Dfqi33TAhOM3ZAaiIh7R+dHT0ZMRdy3ZAHF/IPanKW8+8I/0+6kOcPRgzrIW59TPSfYT0LwqlM3OIwMSOHTvG0fSTD82ePXviED5E2BkQ6mET4CDcMEirgNfPi+Hh4a1Q2bl6cjSgbcsP99EG5ECA/hRvCOUkGO56patme+B1gCYLV4EYX/uq4sCrDkByfwF8IpSKoCMKZz0IHuzSWijyGM4rZTGc3lbUzd6Wdv1LwCBgDNBVKJ52Wn0sK+3y0UJ5Dc8D+gnlfObGQHOhvKE6AZ2FIk/q4huE+aFOEpVpegql9xkH8DPBnJaSK13Uy+Xb");
    imageData.append("lsAogB/qmS6UunhJKHJ57SaU2QDml+WjXOpgfujTS38GguUjYWkHs76YT+pjR8RBGPXRlmV9sB1o274m/i4b8/+yUPTxDUzZbDs+5GyHHAdyeuAhemnZsmXuHFfxLDY8KO5CkZvjSp8eNgGOIDk5+YEtW7b8G/bT5qlTp65Ab8FC3u8UGSuQpOZTSPA3K0aGkTwsXFYVxZ6d5g17ApKcS9lMy16BYN6YlmES/J/hvE/dlMEr7zE9nViye8swHe9THxuQeWMY01MeZTPfTK/XpQXDODtAotrTxzgsG0lGfVIur0xHOVKfvlwSso5ZV0R29cl4rHPGoVxt2aQ+ps0qrw6D/hXoyeeiI7yFXj0Gb+YJQiljVnnKFjYBjgAKa7/11lvrOPDiIAevN/Z+OU5sGzCQBUhWvrE2qeCbWM48OQybAEegXezgiPfUqVP7hPKqsYlrwIAd0HRZIhSzjOaOwza1hE2AIyCJdcdYnRIOLHYYMKAHBoi93N3dd+/cudMDZiptbZoqNvFygk2AI8CA7vH27dvf22Pn4eFxGvaNQWIDuUJ0dHS1jz/++KsWLVoENW3aNB6EniEUr8Y8sYkf79q16z0S//DDD2fS09M5Us6VcgP/29i3b18/riJy0al69eoWLy+vHQjnge3//dmJmJiY+v379z8oV61eeOGFwGvXrs1Eb5yj/6gBAxImk6nk559/PlcudnTr1k1cv36dZimnJXM1uLMJcATIQPVFixb9H0+KJ4nLlCmT+u677x64c+dOJxA5Vxkw8D8Jt/3793fv0KHDAS75Fy1aVCxevFgkJSXx/LYmIpeDO5sAB1Ha19f31Xbt2nmTxHySqlSpEj5gwIDdK1asmE2nnNTU1NIZGRnFIiIiqp49e/YlenwFBAQ04UlAenl4KIpfuHDh+Q0bNozcvXv32/RKS0xMLJ+WllYqLi6uAgaSdRhGzzY8KI+Fh4dXi4yMrBIaGloDdlRDeqExPT3VDh069Nq2");
    imageData.append("bduGbd68+b3Tp093gmwbnw7KvXnzZkN6ZdGzi7+ZT8pDb9CEsuj9pfVAoyfXn3/++eauXbsGcpvVwYMHe9NZhg46/B/5/jfzh/JxHlVfX26xsbEP0xvt9u3bj8Mcq67mvyZ103vv3Llz7aiTXmmUiUbui7FGP34zGeV65cqVKy38/f2bsYz80PuaNWsmIN6rdNoROj8F1iflMr88dYl1wfzSkw2v7OdYZrYHPyq+ffv2IVu2bBkOmcNZNnrCXb169UnksQbzyHqnVyDveXp6vgzZnKe2MRujoqIqo+5fXbVq1bSff/555u+//z6WslkGpqfuM2fOtEd+3v/oo48WYkx1iD4afJu3bt1aoC7N6ACniryaJwbcYAM3Xrhw4S70xqkkMpcO6UTDeeMuXbrspRcaeuefYHb8gQwfpO3Tp0+fHWjEEUI5uso6UU6iowJ705OMHln0PqPHGr3XKIMeba+//vomhr366qvb+/btu5kyOU/95ptvbqDnG+zzPfRI47QfPbbobUUvK+g9CoIvEpozEPBQVEQFv025PO2eaSiDMimPnmyUxXv0/JJXerfRk4xeZ1rPMIbzf+YbedsOos0VykqWtXwYcZdbtmzZmHfeeWc19fTu3Xtrv3791uvzzzqiLnrYUeYzzzzzF/U9++yzZ3hQDb3t6M3H3ywfl2sR/6S3tzd7r1eF4oBVDA/EC3Pnzp3HeqK3Gb3PWBeUQx10oWWZ2R7Ms/SwI1gOev51797dnXljHlnvDOO9jh07HoI+njs8VCgrmVZXUZC03fjx47+hTLZ/zZo1A/n5Y8qmNxzLQ93MO/NC3xP6g5DANWrUEGvXrrWkpKRsE8oKYladQI6wCcgFysfHx7+1ZMmS48hIshzkkcw01KU3GonN/+lF9eCDDybhST8vlOVMq6teYGDgEyQ791pJjysWkOkog1e+cqQnG3+ruBdO+QQ906hHelpBfyp6B3+hfDDS6m9BfXxAWJGMT2jlSnny");
    imageData.append("noTeG056wslwWT70nLeFsgRsXcGkvs6dO3uwLLoyZMq/Vo/W+07vcccrw1k+yExFbxsFPXRS4rJ2XRBiHjsD1puMJz36pBxtvuV9rbeb1rOPVxmf9YmeNQZ6Dghlibssyzd69OjvwIEgxtF60mllyvJJ7zhyBR0Cd4FYEhISjkBWX6GsWuaqFyZsAnIBKnsET2J7Pz+/WVOnTr0MImZy39N7PqEwAq9AX6Gs21tJjNdQtXHjxi2VnmhMp3UnlC5/WsiK0urRxyFQaWaVxP2F6lSCQWnlr776ajL9ZLNyXdS6GDoCvT6U75JQ/D6sPT8e9EdQN1/woZH6tNDq0srKTodOnwUj/DDomS+UvYoPwdzoyV6bD41eVnbys4JeF8PQfpa9e/cmQc8uocwiFIfJUf2zzz6bVatWrdvZpdXnAT20BSYFd4CEwOzkA8hVO5oRTi1j2wTkEiRySdgy1ZCZV0CQgbClpgcFBS2nJxTsqZ30SKMHFl5zN2CnbYUZQueTekLtqZC2OF65LYODg+fTWwo271JUzPuQ1R94Mzo6+t+wV8eEhITMBT6G/Kn8HxgLm3IW4n9LLy+mpVcYvbikRxfysQL66Jxz77gsum/iwasDs6IHHqBBkD9Qo+st6B6BvHwGs+c/qvfbXnp+USYeVi96t126dCkI5QkEbtOrzMfHJ5JX9Eo/w2ak8xJ9KmSPUgR10xD6erIs1EdA92CUYSTKMAdl+AZpv2d+gWXA/6n6t1A/veLwe6vqRbYf9rEP8uGP+tyCstB5iIMhq98FbPIKGCC1ho4BKMcCesuxHejNpuqg7NWQtZNedijXKbTRWeAcQa811qHqAbeGnnL06mOZcc8TZZknFCcga69JH2uE1Ue9vcf6Z1szPn5vIw8IyPqDHoS8j7IuQ12PQZq3kbaHUByv6J/hFIEJmwAnwQzQlmFvR8KQpKxYenvRzuGaOL2n6MFFhxn2UtrXBucFawtl6bqu+NsZRjq2sNem");
    imageData.append("txRtacqnDIIT44xPXZTN9Hytcs6aXmu0TenEoq8gDoQom440zLNWF3XTD6Sx+FseF3Iok+6GLAengdh7sMftIhSvLl4bCkWmXh/LywEt5UsHJ8ajHcuB2WNCySt7U9Ydr9QvPfDoxcbf9JCjsxXz0V4NYw/GDkHWJ6/8n/JrCmU8wHKwjqQOLu+ybZ4VSo9KzzF69mm9++hlxzwwHvWxvIzHumFZtO3H+mR7UA/bmvGZN1kWymIZeJ9hbE/WBeVkGpQ6A5uAfwAsnPR4IlihJCmhJ68WbHjeZ1p9HP7P+wR/S/B/rS6pTyIrWfaQlVwpT5ZDepDJ3xK51afVlRW05cptfRKyTiX0crV1pYU2Pq9SH+/pH1BtWbRxs9Inw3LKc65hE2DAQGFDpn9iw8x1r5019QX6RASZmyXHWyoBFRkedjOj5d2rGS8EX8toExFobhYbbn4sIdpSPT7SXDPyjrnJ7UumDr7H09+54JE29sKfaWN9j6UPuult6hISkPFs2K2MFiHXM1oHXja9ctPL1PWWj6lzoK+pPcF0CG8P+U8nRJlrmNIsZSwW5WnnNcMkSqSnWMqlJlke0uDBlATLw4kxlqrIR92ou+bG0cHmhglRluq8b0oTpU3polRasuWB5DhLJYTXQD5rxUWYawN1+JvhVl1ma89gLT/0uZmh7146lI9pUP56lB8ZZG4afivjKQI6G7HsSYjHuIzHOgu9kdEK16ZWHQmWipSVnmopm5EuSpoVXfd6IepmPq3lS7Y8mJpoqZCSaHmY6SD3UeivxjpBOash7JG0FEt5ymKcGOSJbcH6C/bPaMP8sT5QL48QjE95lA3dpViPQEmWmXliHOpgGpZTh2qJsZYqSQDLEX4740m0W7fLaNMrJ9IHBPlmvExOIB8V2BaI92hMqLk+eRAdYm5AGWwf6HmQuu4B+ad+5sVa7xalLljv/N+cIYoBxVHGMuSdte7RvrJczFNEYEbzO34ZL7JNkM46HXeP");
    imageData.append("wDuWJs+e/1rsyRkvRvsT87rGnP/s1dhTCDv1SY/Ys3O7xFyc0zHG56NOMd64d4Fhn/aKPfNpz9i/GHf2KzGXpz0fHTD52ejAya2jA/l7VvsYX8T3YlpeGQdhV2a9EuM7u0PMJSv4G+GMQ3kL+sQeX/hG7JEvAF4/fz32GMPm9449mQnI62e9Yk9/0iPm7MfdYs593D3mnDV979gTn/eNPUbw92fIv8wn8Yl6ZdmkLp2+o/p00OFJ+Swn80lQp5TDOpL1MLdzjBev/J/hlEU9zM9CyJa6rPrwvzWfuM94slxMR7mq/jMsp1VWH0UW47HcbAvWHa/InyfSWONpcFLq1kDRper4jDqyAGURarkuzHo55grbdNoL0dfZbtTPfFjrCvE+gf553WLO80qZVt1K2U9Yr+pv6rfWhVrfmcD6eF3Jo6xT8kwt/0nqYV7IQ967fs60Dg9CcyuB8RTVW/R23O5hNSNTB1eNMBNDqkZkDKmmgr//Ds98T70v0w2uEmGxInN8K+7FyQI2Mh2FkjcF+nv/FLQ6squDv+Nlfe+fhqbO/+s6te2bXXv9t9tAQs0LfpvO7U0LQW/cy0riW96mTuhd/mKEQY9GCAMGCgPOuqfFwgwZoZDYx9RRJbFZH9GAgYIKT/e0GPTEb1lJfBcDA9gYJ4ye2EBhgufutCiQuKuVxBh9NoPRfYg2hz6iAQMFFSqJO92bWvuyX6yHQWIDhQmZSJwYbam6+N9x7hzx6SMaMFBQkYnEnFhe8k7cDoPEBgoTMpGYq1xfD4rbbpDYQGFCJhKnJVvKLx0St3VIdYPEBgoPMpGY6/FLh8ZtMUhsoDAhE4lNaZbS3w6N22yQ2EBhgp7EZQwSGyhs0NvED3xj2MQGChkykZj+oEsGxu0yZicMFCZkInHkHXPjha/HHjBW7AwUJmQi8c2Lpi5zO8ecNRyADBQmZCKxz6H0YVPbRl+ls7E+ogEDBRUqibspJD6cPnTa89F+BokNFCaA");
    imageData.append("xNEgcQ8riYOvZTz3aa/Y4/dsYrnFCNAnNGCgIIAd7sV9aQEg8cv/D8J+mjao8hlDAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagec409b2c374af6440bfc799e5a6e1149d = new WeakReference<>(result);
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
BufferedImage imagec409b2c374af6440bfc799e5a6e1149d=getImagec409b2c374af6440bfc799e5a6e1149d();
if (imagec409b2c374af6440bfc799e5a6e1149d != null) {
    g.drawImage(imagec409b2c374af6440bfc799e5a6e1149d, 0, 0, null);
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
		return 177.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 177.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Outline() {
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
       Outline base = new Outline();
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
       Outline base = new Outline();
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
        return Outline::new;
    }
}

