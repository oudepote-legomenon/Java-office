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
public class Outline_stroke2 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    private static WeakReference<BufferedImage> imagefc9ae799604a22c5503a33e682596cbe;
private static BufferedImage getImagefc9ae799604a22c5503a33e682596cbe() {
    BufferedImage result = (imagefc9ae799604a22c5503a33e682596cbe != null)
        ? imagefc9ae799604a22c5503a33e682596cbe.get() : null;
    if (result != null) {
        return result;
    }
    StringBuilder imageData = new StringBuilder(12812);
    imageData.append("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAlUElEQVR4Xu3d7avt+X3W8dM0QgJWoVaj1hTUJ0WpDyxFnwQUpTe0TUbNiSE3M3vtDkNJZu+dSaEFBd1SBREpFgUF7U3a3JjxgZQxe+1ppkysGJ9YFRRsCyF4G6itxNgmsUkc15rEaeY9k8xcs+Za8/mueV/w+gt+vw/v3zlnn3Pu3HEnu+vr61fe+xfe/8fe/sZ/cvfeez74V++75wP/6O1veP+H3/b69/+7t37PT//Xt3z3T//PN3/3e35j59Nv/q6f/M03fdd7Pnf3O37i/+698dt/7AlJ0uliM9yC27z5A6/d3PPBt933hg/8yNvued/NW7/3vR/bh/3ud/z4Mx64JEl7bIkbvid/RX/P+374ba9/3z9/y/f81K+86Tt/4gt8qJIkPRf2xQ3a2dnjr3rX2fZPvf317//Zt3zve//bX/zOn/w8H6AkSS8Em+Newl1fP/7Ky/se/daLs5sfutxsP7zzmZ1nPDRJkg7FBrkj7+r+x15zdX5z7+X59uFd7P/3PvjEhyZJ0qHYI3eE7X+Vf7m5/es7/5axfzZ8aJIkHYptcqU9dN/tH939Kv96F/RfZOCfCx+aJEmHYqfci7iH7n3kG6/Obv/SxWb7Hxj1BB+aJEmHYrPcgbu+vn7Fxfntn/3Sn+l/jjF/IfjQJEk6FPvlXuDevXn0tRfnN3/j8mz73xnwQ/GhSZJ0KHbMhXvyB/rOtz+1C/VvMtwvFj40SZIOxZ6557G7dx/+2svz2zddbLYfZawb+NAkSToU2+a+yvZ/vn91tr17+QJ+kv8QfGiSJB2KjXPPsgce+Ne/7Uv/WM8vMc7HwIcmSdKh2Dr3Zdv/in8X4Pt2Ps4oHxMfmiRJh2Lz3Jf25F/le57/Ul8bH5okSYdi91722/9U/9Vm+3OM8EuJD02SpEOxfy/bPfR9t1+/C/+P7oL7BQb4pcaHJknSodjB");
    imageData.append("l92e/Mn+/Q/4bbb/g+Gdgg9NkqRDsYcvq12c3fzJi832FxjcafjQJEk6FJv4sthDdx9+9dX57d/cxfXzjO1EfGiSJB2KbTz5XZzdvu5yc/PLjOxkfGiSJB2KfTzZXbz15ndM/SG/58KHJknSodjJk9zV5kN/YhfSjzGsq+BDkyTpUGzlSW3/n/ZcnN380GXxf+o7Bj40SZIOxWaezK7u/fA37eL584zpivjQJEk6FLt5EnvX2c09V5vtJxnSVfGhSZJ0KLZz6e1/y//yfHt9ueAP+n01fGiSJB2KDV12P/DAI99webZ9lPE8BXxokiQdih1dcldn22+72Gz/M8N5KvjQJEk6FFu63C7Otn9+F8nfYDRPCR+aJEmHYk+X2uXZ7dXlif15/7PhQ5Mk6VBs6hK7vn78lZdnN3+foTxVfGiSJB2KbR2/Hzz/ma+7PN8+xkieMj40SZIOxb6O3kPfd/v1uyD+Kwby1PGhSZJ0KDZ27B48/9nff7m5+feM48sBH5okSYdiZ0fuwbNHv/mU/5rfc+FDkyTpUGztuD149qFv2UXwVxjFlxM+NEmSDsXejtr+V/67AH6CQXy54UOTJOlQbO6YGf/fwocmSdKh2N0RM/5Px4cmSdKh2N6XfBf33fzhS+P/NHxokiQdiv19Sff9b3/091yeb3+JAXy540OTJOlQbPBLtgce+PDv3MXu3zB+8gNAkvTiY4dfkj109+FX70L38wyfvogPTZKkQ7HFR9/19fUrLs5v/ymjp9/ChyZJ0qHY46Pv6mz7txg8PR0fmiRJh2KPj7qL8+0ZY6dn4kOTJOlQbPLRdnF2+7pd3D7L2OmZ+NAkSToUu3yUPXT+z/7QLmy/xtDp2fGhSZJ0KLa5vrOzx191sdn+AiOnr4wPTZKkQ7HP9V1ubn6cgdNXx4cmSdKh2OfqLs9vv59x03PjQ5Mk6VBsdG1XZ9tvu/SH/l4QPjRJkg7FTlf2jnc8/tsvNze/zLDp+eFD");
    imageData.append("kyTpUGx1ZReb2/cwanr++NAkSToUW/2i72Jz80YGTRk+NEmSDsVev6i7uP/mD1z69/0PxocmSdKh2OwXbfv/5GcXr48wZsrxoUmSdCh2+0Xb5fntOxmyCf7KL356Oe/44BPL4YsmSZqF3X5RdnXvh79pF9tPMb4TMK4rYFxXwBdNkjQL2/2i7PJ8u2V4p2BcV8C4roAvmiRpFrb74F1ubjeM7iSM6woY1xXwRZMkzcJ+H7R33vvY79pF9lcZ3UkY1xUwrivgiyZJmoUNP2hXm+0/YHCnYVxXwLiugC+aJGkWNvwF712b2z++C+znGdxpGNcVMK4r4IsmSZqFHX+Be+JrLjbbjzK2EzGuK2BcV8AXTZI0C0v+gnZxvj1jaKdiXFfAuK6AL5okaRa2PN5Ddx9+9S6s/4WhnYpxXQHjugK+aJKkWdjzeJebm7/MyE7GuK6AcV0BXzRJ0izsebQfeOCRb7jabD/JyE7GuK6AcV0BXzRJ0ixserTdr/7/DgM7HeO6AsZ1BXzRJEmzsOnPew/e/+gf3AX1swzsdIzrChjXFfBFkyTNwq4/7+1i+g8Z1xUwritgXFfAF02SNAu7/rz27s2jr93F9P8writgXFfAuK6AL5okaRa2/Xnt8mz79xjWVTCuK2BcV8AXTZI0C9v+nHvH2Yd+7y6kn2ZYV8G4roBxXQFfNEnSLOz7c+5ic/O3GdWVMK4rYFxXwBdNkjQL+/5V94PnP/N1u4j+L0Z1JYzrChjXFfBFkyTNwsZ/1V2ebd/NoK6GcV0B47oCvmiSpFnY+K+46+vrV+wC+jEGdTWM6woY1xXwRZMkzcLOf8Vdnm//HGO6IsZ1BYzrCviiSZJmYee/4nbx/AhjuiLGdQWM6wr4okmSZmHnn3UXm5s/wpCuinFdAeO6Ar5okqRZ2Ppn3ep/9e/LMa4rYFxXwBdNkjQLW/+MXV8//spdOD/BkK6KcV0B47oCvmiSpFnY+2fsVH747/9jXFfA");
    imageData.append("uK6AL5okaRb2/hm73Nw8woiujHFdAeO6Ar5okqRZ2Pun7er+x16zi+bnGNGVMa4rYFxXwBdNkjQLm/+0XW1uH2RAV8e4roBxXcHHP/HrkqTB2PynbRfMf8GAro5xXQHjugK+aJKkWdj8p/auB25/3y6YX2BAV8e4roBxXQFfNEnSLOz+U7s4v3kX43kKGNcVMK4r4IsmSZqF3X9qu1j+S8bzFDCuK2BcV8AXTZI0C7v/5C42N7/78gR/+3+PcV0B47oCvmiSpFnY/ie3C+V9DOepYFxXwLiugC+aJGkWtv/JXWxu/zHDeSoY1xUwrivgiyZJmoXtv3P37sNfuwvlrzGcp4JxXQHjugK+aJKkWdj/Oxdnt69jNE8J47oCxnUFfNEkSbOw/3euNtsfZjRPCeO6AsZ1BXzRJEmzsP8n+a//fTnGdQWM6wr4okmSZnla/M/OHn/VLpKfYTRPCeO6AsZ1BXzRJEmzPO0D4PL89k8zmKeGcV0B47oCvmiSpFnwAbC9ZjBPDeO6AsZ1BXzRJEmzPO0D4Gqz/TkG89QwritgXFfAF02SNMtT8b++vn7FLpCfYjBPDeO6AsZ1BXzRJEmzPPUB8ODZo9/MWJ4ixnUFjOsK+KJJkmZ56gPg4vzmrYzlKWJcV8C4roAvmiRplqc+AHZx/BHG8hQxritgXFfAF02SNMuXfwB8hLE8RYzrChjXFfBFkyTN8qX8P/E1V5vtJxnLU8S4roBxXQFfNEnSLE/m/6F7H/lGhvJUMa4rYFxXwBdNkjTLF3/7/77tn2EoTxXjugLGdQV80SRJszz5AXB1tn0HQ3mqGNcVMK4r4IsmSZrlix8Am+2PMpSninFdAeO6Ar5okqRZvvhHAGfbRxnKU8W4roBxXQFfNEnSLF/8ANhsP8ZQnirGdQWM6wr4okmSZrmz/yuAuzB+lqE8VYzrChjXFfBFkyTNcufq/sdew0ieMsZ1BYzrCviiSZJmuXN536PfykieMsZ1");
    imageData.append("BYzrCt747T8mSRrszuXm9g2M5CljXFfAuK6AL5okaZY7l+e372QkTxnjugLGdQV80SRJs9y52tz+NUbylDGuK2BcV8AXTZI0y52Lzc3fZSRPGeO6AsZ1BXzRJEmz7P8RoPcykqeMcV0B47oCvmiSpFn2/wjQhxjJU8a4roBxXQFfNEnSLHcuNtuPMpKnjHFdAeO6Ar5okqRZ9r8D8B8ZyVPGuK6AcV0BXzRJ0iy7D4Cb/8RInjLGdQWM6wr4okmSZtn/DsAnGMlTxriugHFdAV80SdIs+w+AX2UkTxnjugLGdQV80SRJs+w/AD7FSJ4yxnUFjOsK+KJJkmbZfwB8hpE8ZYzrChjXFfBFkyTNsv8A+AIjecoY1xUwrivgiyZJmmX/AfCMSJ4yxnUFjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmbxA2ABjOsK+KJJkmZ52X0AvFQ++ZknXrCPf+LXXzA+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe");
    imageData.append("4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cEmS9vwAOBJGPcGoJ/jAJUna8wPgSBj1BKOe4AOXJGnPD4AjYdQTjHqCD1ySpD0/AI6EUU8w6gk+cHXccc651cZQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmD");
    imageData.append("UU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g");
    imageData.append("1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcY");
    imageData.append("KnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrg");
    imageData.append("XTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LO");
    imageData.append("ufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PH");
    imageData.append("UKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIH");
    imageData.append("o55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOufFjqNTBqCcY9QRDpQ7elXPOjR9DpQ5GPcGoJxgqdfCunHNu/BgqdTDqCUY9wVCpg3flnHPjx1Cpg1FPMOoJhkodvCvnnBs/hkodjHqCUU8wVOrgXTnn3PgxVOpg1BOMeoKhUgfvyjnnxo+hUgejnmDUEwyVOnhXzjk3fgyVOhj1BKOeYKjUwbtyzrnxY6jUwagnGPUEQ6UO3pVzzo0fQ6UORj3BqCcYKnXwrpxzbvwYKnUw6glGPcFQqYN35Zxz48dQqYNRTzDqCYZKHbwr55wbP4ZKHYx6glFPMFTq4F0559z4MVTqYNQTjHqCoVIH78o558aPoVIHo55g1BMMlTp4V845N34MlToY9QSjnmCo1MG7cs658WOo1MGoJxj1BEOlDt6Vc86NH0OlDkY9wagnGCp18K6cc278GCp1MOoJRj3BUKmDd+Wcc+PHUKmDUU8w6gmGSh28K+ecGz+GSh2MeoJRTzBU6uBdOefc+DFU6mDUE4x6gqFSB+/KOefGj6FSB6OeYNQTDJU6eFfOOTd+DJU6GPUEo55gqNTBu3LOuen7f4cpmhkElstEAAAAAElFTkSuQmCC");
    try {
        result = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(imageData.toString())));
        imagefc9ae799604a22c5503a33e682596cbe = new WeakReference<>(result);
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
BufferedImage imagefc9ae799604a22c5503a33e682596cbe=getImagefc9ae799604a22c5503a33e682596cbe();
if (imagefc9ae799604a22c5503a33e682596cbe != null) {
    g.drawImage(imagefc9ae799604a22c5503a33e682596cbe, 0, 0, null);
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
	private Outline_stroke2() {
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
       Outline_stroke2 base = new Outline_stroke2();
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
       Outline_stroke2 base = new Outline_stroke2();
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
        return Outline_stroke2::new;
    }
}

