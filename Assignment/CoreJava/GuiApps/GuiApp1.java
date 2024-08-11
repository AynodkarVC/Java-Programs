package CoreJava.GuiApps;

import java.awt.*;
import java.awt.event.*;

public class GuiApp1 extends Frame {
    Button b1, b2;
    TextField t1;

    public GuiApp1() {
        setLayout(new FlowLayout());
        add(b1 = new Button("Click"));
        add(t1 = new TextField(20));
        add(b2 = new Button("Clear"));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("Hello World");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(" ");
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GuiApp1();
    }
}