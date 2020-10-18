package ex_2;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static void createAndShowGui(Image img) {
        MainPanel mainPanel = new MainPanel(img);
        JFrame frame = new JFrame("DrawRect");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui(new ImageIcon(args[0]).getImage());
            }
        });
    }
}
