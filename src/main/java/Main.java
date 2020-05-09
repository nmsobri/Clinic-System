import com.formdev.flatlaf.FlatLightLaf;
import frame.Login;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlatLightLaf.install();
            new Login();
        });
    }
}

