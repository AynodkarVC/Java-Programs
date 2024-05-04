package Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet9 extends Applet {
   Button b1,b2;
   TextField t1;
    public void init(){
        add(b1 = new Button("Click"));
        add(t1 = new TextField(15));
        add(b2 = new Button("Clear"));
        b1.addActionListener(new A());
        b2.addActionListener(new B());
    }

    class A implements ActionListener {
        public void actionPerformed(ActionEvent e){
            t1.setText("Hello");
        }
    }

    class B implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(" ");
        }
    }
}
/*
   <applet code = "Applet.Applet9.java" width = 300 height = 300>
   </applet>
 */
