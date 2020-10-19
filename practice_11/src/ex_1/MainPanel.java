package ex_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MainPanel extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200,100);
    }


    private Random _rand;
    private String _num;
    private int _tries;

    public MainPanel(){
        _rand = new Random();
        _num = String.valueOf( _rand.nextInt(20));
        _tries = 3;
    }

    public void InitComponents(){
        JButton btn = new JButton("TRY!");
        JTextArea txt = new JTextArea(1,6);
        JTextField counts = new JTextField("Tries: " + _tries);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt.getText().equals(_num)){
                    JOptionPane.showMessageDialog(null, "U guess it!");
                    System.exit(1);
                }
                else{
                    if(_tries>1){
                        _tries--;
                        counts.setText("Tries: "+ _tries );
                        repaint();
                        JOptionPane.showMessageDialog(null, "Number is " + (Integer.parseInt(_num)>Integer.parseInt(txt.getText()) ? "bigger" : "less"));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "U have 0 tries, try next time!");
                        System.exit(0);
                    }
                }
                repaint();
            }
        });

        this.add(btn);
        this.add(txt);
        this.add(counts);

    }

}