package CoreJava.Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet7 extends Applet implements ActionListener {
   Button b1,b2;
   TextField t1;
    public void init(){
        add(b1 = new Button("CLICK"));
        add(t1 = new TextField(15));
        add(b2 = new Button("CLEAR"));
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object o = e.getSource();
        if(o.equals(b1)){
            t1.setText("Hello");
        }
        if (o.equals(b2)){
            t1.setText(" ");
        }
    }
}
/*
   <applet code = "CoreJava.Applet.Applet7.java" width = 300 height = 300>
   </applet>
 */