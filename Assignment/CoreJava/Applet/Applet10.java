package CoreJava.Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet10 extends Applet {
    Button b1,b2;
    TextField t1;

    public void init(){
        add(b1 = new Button("Click"));
        add(t1 = new TextField(20));
        add(b2 = new Button("Clear"));
        b1.addActionListener(new A(this));
        b2.addActionListener(new B(this));

    }
}

class A implements ActionListener{
    Applet10 a10;
    public A(Applet10 a10){
        this.a10 = a10;
    }
    public void actionPerformed(ActionEvent e){
        a10.t1.setText("Hello");
    }
}

class B implements ActionListener{
    Applet10 a10;
    public B(Applet10 a10){
        this.a10 = a10;
    }
    public void actionPerformed(ActionEvent e){
        a10.t1.setText(" ");
    }
}
/*
   <applet code = "CoreJava.Applet.Applet10.java" width = 300 height = 300>
   </applet>
 */