package ex_2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MainPanel extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800,800);
    }

    public void InitComponents() {
        this.setLayout(new BorderLayout());
        Border blackline = BorderFactory.createLineBorder(Color.black);
        JLabel[] labels = new JLabel[]{new JLabel("North"), new JLabel("West"), new JLabel("East"), new JLabel("South"), new JLabel("Center")};

        for (var l:labels) {
            l.setBorder(blackline);
            l.setHorizontalAlignment(JLabel.CENTER);
            l.setPreferredSize(new Dimension(150,150));
            l.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    JOptionPane.showMessageDialog(l, "Welcome to " + l.getText());
                }
            });
            add(l, l.getText());
        }
    }
}