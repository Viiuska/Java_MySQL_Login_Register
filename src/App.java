import guis.LoginFormGUI;

import javax.swing.*;

public class App {
    static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFormGUI().setVisible(true);
            }
        });
    }
}
