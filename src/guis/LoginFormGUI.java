package guis;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class LoginFormGUI extends Form{
    public LoginFormGUI(){
        super("Login");
        addGUIComponent();


    }

    private void addGUIComponent(){
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(0,25,520,100);
        loginLabel.setForeground(CommonConstants.TEXT_COLOR);
        loginLabel.setFont(new Font("Helvetica", Font.BOLD, 40));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(loginLabel);

        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(30,150,400,25);
        usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Helvetica", Font.PLAIN, 18 ));

        JTextField usernameField = new JTextField();
        usernameField.setBounds(30,180,450,55);
        usernameField.setBackground(CommonConstants.SECONDARY_COLOR);
        usernameField.setForeground(CommonConstants.TEXT_COLOR);
        usernameField.setFont(new Font("Helvetica", Font.PLAIN, 24 ));

        add(usernameLabel);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(30,250,450,55);
        passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
        passwordLabel.setFont(new Font("Helvetica", Font.PLAIN, 18 ));

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(30,295,450,55);
        passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
        passwordField.setForeground(CommonConstants.TEXT_COLOR);
        passwordField.setFont(new Font("Helvetica", Font.PLAIN, 24 ));

        add(passwordLabel);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Helvetica", Font.BOLD, 18));

        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.setBackground(CommonConstants.TEXT_COLOR);
        loginButton.setBounds(125,520,250,50);

        add(loginButton);
    }
}
