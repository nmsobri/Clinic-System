package frame;

import javax.swing.*;

public class Application extends JFrame {
    public Application() {
        super();

        this.setTitle("Slinic");
        this.setSize(500, 500);
        this.layoutComponents();
        this.setupEventListener();
        this.setVisible(true);
    }

    private void layoutComponents() {

    }

    private void setupEventListener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
