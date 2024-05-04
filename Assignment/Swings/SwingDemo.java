package Swings;

import javax.swing.*;
import java.awt.event.*;

public class SwingDemo extends JFrame {
    JButton jb1, jb2, jb3;
    JTextField jtf;

    public SwingDemo(){
        super("MyFrame");
        setLayout(null);
        setSize(430,300);
        setLocation(100,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb1 = new JButton("Click");
        jb1.setBounds(20,50,100,50);
        add(jb1);

        jtf = new JTextField();
        jtf.setBounds(140,50,150,50);
        add(jtf);

        jb2 = new JButton("Clear");
        jb2.setBounds(310,50,100,50);
        add(jb2);

        jb3 = new JButton(new ImageIcon("red.jpg"));
        jb3.setBounds(140,150,150,50);
        add(jb3);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jb3.setEnabled(false);
                jtf.setText("Hello");
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jb3.setEnabled(true);
                jtf.setText("");
            }
        });

        jb1.setMnemonic('k');
        jb2.setMnemonic('r');
        jb1.setToolTipText("Click Button");
        jb2.setToolTipText("Clear Button");
        jb3.setRolloverIcon(new ImageIcon("blue.jpg"));
        jb3.setPressedIcon(new ImageIcon("green.jpg"));
        jb3.setDisabledIcon(new ImageIcon("gray.jpg"));
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
