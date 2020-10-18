package ex_2;

import javax.swing.*;
import java.awt.*;

class MainPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img,0,0,this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000,800);
    }

    private Image img;

    MainPanel(Image img){
        this.img = img;
    }
}
