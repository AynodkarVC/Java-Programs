package CoreJava.Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet8 extends Applet implements ActionListener {
    Button b1,b2;
    TextField t1;

    public void init(){
        add(b1 = new Button("Click"));
        add(t1 = new TextField(15));
        add(b2 = new Button("Clear"));
        b1.addActionListener(this);
        b2.addActionListener(new A());

    }

    public void actionPerformed(ActionEvent e){
        t1.setText("Hello");
    }

    public class A implements ActionListener{
        public void actionPerformed(ActionEvent e){
            t1.setText(" ");
        }
    }
}
/*
   <applet code = "CoreJava.Applet.Applet8.java" width = 300 height = 300>
   </applet>
 */