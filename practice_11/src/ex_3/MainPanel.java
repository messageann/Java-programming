package ex_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800,800);
    }

    private Color color;
    private Font font;

    public MainPanel(){
        super();
        color = Color.BLACK;
        font = new Font("Times New Roman", Font.BOLD, 15);
    }

    public void InitComponents() {
        JTextField txt = new JTextField("Text"){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                this.setForeground(color);
                this.setFont(font);
            }
        };
        txt.setPreferredSize(new Dimension(400,100));
        this.add(txt);
    }
    public JMenu createColorMenu(){
        JMenu c = new JMenu("Text Color");
        JCheckBoxMenuItem[] colors = new JCheckBoxMenuItem[]{new JCheckBoxMenuItem("Red"),new JCheckBoxMenuItem("Black", true), new JCheckBoxMenuItem("Blue")};
        ButtonGroup g = new ButtonGroup();
        for (var cl:colors
        ) {
            g.add(cl);
            c.add(cl);
            cl.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (((JCheckBoxMenuItem)e.getSource()).getText()){
                        case "Red":
                            color = Color.RED;
                            break;
                        case "Black":
                            color = Color.BLACK;
                            break;
                        case "Blue":
                            color = Color.BLUE;
                            break;
                    }
                    System.out.println(color.toString());
                }
            });
        }
        return c;
    }

    public JMenu createFontMenu(){
        JMenu c = new JMenu("Text Font");
        JCheckBoxMenuItem[] fonts = new JCheckBoxMenuItem[]{new JCheckBoxMenuItem("Times New Roman", true),new JCheckBoxMenuItem("MS Sans Serif"), new JCheckBoxMenuItem("Courier New")};
        ButtonGroup g = new ButtonGroup();
        for (var fn : fonts
        ) {
            g.add(fn);
            c.add(fn);
            fn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    font = new Font(((JCheckBoxMenuItem)e.getSource()).getText(), Font.BOLD, 15);
                    System.out.println(font.toString());
                }
            });
        }
        return c;
    }
}