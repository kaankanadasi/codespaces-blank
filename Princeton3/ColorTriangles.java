package Princeton3;

import java.awt.Color;

public class ColorTriangles {

    public static void main(String[] args) {
        int THRESHOLD = 180;
        String filename = args[0];
        Picture pic = new Picture(filename);
        pic.show();
        for (int i = 0; i < pic.width(); i++) {
            for (int j = 0; j < pic.height(); j++) {
                Color color = pic.get(i, j);
                double lum = Luminance.intensity(color);
                if (lum >= THRESHOLD) pic.set(i, j, Color.WHITE);
                else                  pic.set(i, j, Color.BLACK);
            }
        }
        pic.show();
    }
}
