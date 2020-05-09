package lib;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class Utility {

    public static Font loadFont(String path, float size) {
        InputStream is = Utility.class.getResourceAsStream(path);
        Font font = null;

        try {
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        font = font.deriveFont(Font.PLAIN, size);
        return font;
    }

    public static ImageIcon loadIcon(String path) {
        return new ImageIcon(Utility.class.getResource(path));
    }


}
