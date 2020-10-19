import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainPanel extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);
    }

    public void InitComponents() {
        this.setLayout(new GridLayout(4, 2));
        this.add(new JLabel("Planet: "));
        JComboBox g = new JComboBox(Planets.values());
        JLabel jlM = new JLabel();
        JLabel jlR = new JLabel();
        JLabel jlG = new JLabel();
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var p = ((Planets) g.getSelectedItem());
                jlM.setText(
                        String.valueOf(p.getMass())
                );
                jlR.setText(
                        String.valueOf(p.getRadius())
                );
                jlG.setText(
                        String.valueOf(p.getGravity())
                );

            }
        });
        this.add(g);
        this.add(new JLabel("Mass(kg): "));
        this.add(jlM);
        this.add(new JLabel("Radius(km): "));
        this.add(jlR);
        this.add(new JLabel("Gravity(m/s^2): "));
        this.add(jlG);
        g.setSelectedIndex(0);
    }
}
