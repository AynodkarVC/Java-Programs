package CoreJava.Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Applet16 extends Applet {

    Button b1;
    boolean flag;

    public void init(){
        add(b1 = new Button("Click"));
        flag = true;
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                flag = !flag;
                repaint();
            } 
        });

    }

    
    
    
    public void paint(Graphics g){
        if(flag){g.setColor(Color.BLUE); g.fillRect(100,100,100,100);}
        else g.fillOval(100,100,100,100);
    }
}

/*
<applet code = "CoreJava.Applet.Applet16.java" width = 300 height = 300>
</applet>
*/