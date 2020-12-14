package ex_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public static void main(String []args){
        new GUI();
    }

    public GUI(){
        super("Создание");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(500,500);
        setVisible(true);
    }

    public JMenu createFileMenu(){
        JMenu file = new JMenu("File");
        JMenu nw = new JMenu("New");
        JMenu open = new JMenu("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem textdocnew = new JMenuItem("TextDocument");
        JMenuItem textdocopen = new JMenuItem("TextDocument");
        JMenuItem imgdocnew = new JMenuItem("ImageDocument");
        JMenuItem musdocnew = new JMenuItem("MusicDocument");
        JMenuItem imgdocopen = new JMenuItem("ImageDocument");
        JMenuItem musdocopen = new JMenuItem("MusicDocument");
        file.add(nw);
        file.add(open);
        file.add(save);
        file.add(exit);
        nw.add(textdocnew);
        nw.add(imgdocnew);
        nw.add(musdocnew);
        open.add(textdocopen);
        open.add(imgdocopen);
        open.add(musdocopen);

        textdocnew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ICreateDocument newDocument = new CreateDocument();
                newDocument.CreateNew();
                System.out.println("Файл создан");
            }
        });

        textdocopen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateDocument newDocument = new CreateDocument();
                newDocument.CreateOpen();
                System.out.println("Открыт файл");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
        return file;
    }
}