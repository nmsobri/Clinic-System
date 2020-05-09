package frame;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JLabel labelEmail;
    private JLabel labelPassword;
    private JTextField textFieldEmail;
    private JTextField textFieldPassword;
    private JButton buttonLogin;

    public Login() {
        super();

        this.setTitle("Slinic");
        this.setSize(300, 200);

        this.layoutComponents();
        this.setEventsListener();
        this.setVisible(true);
    }

    private void layoutComponents() {
        this.labelEmail = new JLabel("Email:");
        this.textFieldEmail = new JTextField(15);

        this.labelPassword = new JLabel("Password:");
        this.textFieldPassword = new JTextField(15);

        this.buttonLogin = new JButton("Login");

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        gbc.insets = new Insets(5, 5, 5, 5);
        this.add(labelEmail, gbc);

        gbc.gridx++;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        this.add(textFieldEmail, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        this.add(labelPassword, gbc);

        gbc.gridx++;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        this.add(textFieldPassword, gbc);

        gbc.gridy++;
        gbc.gridx = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        this.add(buttonLogin, gbc);
    }

    private void setEventsListener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.buttonLogin.addActionListener(e -> {
            this.dispose();
            new Application();
        });
    }
}
