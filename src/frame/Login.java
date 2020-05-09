package frame;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        super();

        this.setPreferredSize(new Dimension(300, 300));
        this.setTitle("Clinic System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
