package ex_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static void createAndShowGui() {
        MainPanel mainPanel = new MainPanel();
        mainPanel.InitComponents();
        JFrame frame = new JFrame("Guess number");

        var menuBar = new JMenuBar();
        menuBar.add(mainPanel.createColorMenu());
        menuBar.add(mainPanel.createFontMenu());
        frame.setJMenuBar(menuBar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGui(); }
        });
    }
}
