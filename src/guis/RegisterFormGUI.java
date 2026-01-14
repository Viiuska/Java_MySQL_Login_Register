package guis;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class RegisterFormGUI extends Form{
    public RegisterFormGUI(){
        super("Register");
        addGUIComponent();
    }

    private void addGUIComponent(){
        JLabel registerLabel = new JLabel("Register");
        registerLabel.setBounds(0,25,520,100);
        registerLabel.setForeground(CommonConstants.TEXT_COLOR);
        registerLabel.setFont(new Font("Helvetica", Font.BOLD, 40));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(registerLabel);

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
        passwordLabel.setBounds(30,235,450,55);
        passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
        passwordLabel.setFont(new Font("Helvetica", Font.PLAIN, 18 ));

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(30,280,450,55);
        passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
        passwordField.setForeground(CommonConstants.TEXT_COLOR);
        passwordField.setFont(new Font("Helvetica", Font.PLAIN, 24 ));

        add(passwordLabel);
        add(passwordField);

        JLabel passwordAgainLabel = new JLabel("Re-enter Password: ");
        passwordAgainLabel.setBounds(30,325,450,55);
        passwordAgainLabel.setForeground(CommonConstants.TEXT_COLOR);
        passwordAgainLabel.setFont(new Font("Helvetica", Font.PLAIN, 18 ));

        JPasswordField passwordAgainField = new JPasswordField();
        passwordAgainField.setBounds(30,370,450,55);
        passwordAgainField.setBackground(CommonConstants.SECONDARY_COLOR);
        passwordAgainField.setForeground(CommonConstants.TEXT_COLOR);
        passwordAgainField.setFont(new Font("Helvetica", Font.PLAIN, 24 ));

        add(passwordAgainLabel);
        add(passwordAgainField);

        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Helvetica", Font.BOLD, 18));

        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerButton.setBackground(CommonConstants.TEXT_COLOR);
        registerButton.setBounds(125,460,250,50);

        add(registerButton);

        JLabel loginLabel = new JLabel("Have an account? Login Here");
        loginLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginLabel.setForeground(CommonConstants.TEXT_COLOR);
        loginLabel.setBounds(125,520,260,30);

        add(loginLabel);
    }
}
