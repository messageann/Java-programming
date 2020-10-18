package ex_3;

import javax.swing.*;
import java.awt.*;

class MainPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img[currentImgIndex], 0, 0, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000,800);
    }

    public void SlideShow(int delay) {
        Timer timer = new Timer( delay, e -> {
            if(currentImgIndex==img.length-1) currentImgIndex=0;
            else currentImgIndex++;
            this.repaint();
        } );
        timer.setRepeats( true );
        timer.start();
    }

    private Image[] img;
    private int currentImgIndex;

    MainPanel(Image[] img){
        this.img = img;
        currentImgIndex = 0;
    }
}
