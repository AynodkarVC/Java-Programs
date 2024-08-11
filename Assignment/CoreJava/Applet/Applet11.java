package CoreJava.Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet11 extends Applet {
    Button b1,b2;
    TextField t1;

    public void init(){
        add(b1 = new Button("Click"));
        add(t1 = new TextField(20));
        add(b2 = new Button("Click"));

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("Hello");
            }
        });

        b2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
               t1.setText("");
           }
        });
    }
}
/*
   <applet code = "CoreJava.Applet.Applet11.java" width = 300 height = 300>
   </applet>
 */