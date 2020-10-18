package ex_3;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Main {
    private static void createAndShowGui(Image[] img) {
        MainPanel mainPanel = new MainPanel(img);
        JFrame frame = new JFrame("Slideshow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        mainPanel.SlideShow(1000);
    }
    public static void main(String[] args) {
        ArrayList<String> fPaths = new ArrayList<>();
        if(args.length<1) return;
        for (final File fileEntry : new File(args[0]).listFiles()) {
            if (fileEntry.isFile()) {
                fPaths.add(fileEntry.getAbsolutePath());
            }
        }
        Image[] img = new Image[fPaths.size()];
        for (int i = 0; i < fPaths.size(); i++) {
            img[i] = new ImageIcon(fPaths.get(i)).getImage();
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui(img);
            }
        });
    }
}

