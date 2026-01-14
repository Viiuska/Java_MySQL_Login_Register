package guis;

import constants.CommonConstants;
import db.MyJDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        loginButton.setBounds(125,450,250,50);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if(MyJDBC.validateLogin(username, password)){
                    JOptionPane.showMessageDialog(LoginFormGUI.this, "Login successful");
                }else{
                    JOptionPane.showMessageDialog(LoginFormGUI.this, "Login failed");
                }
            }
        });

        add(loginButton);

        JLabel registerLabel = new JLabel("Register Here");
        registerLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerLabel.setForeground(CommonConstants.TEXT_COLOR);

        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginFormGUI.this.dispose();

                new RegisterFormGUI().setVisible(true);
            }
        });

        registerLabel.setBounds(125,520,250,30);

        add(registerLabel);
    }
}
