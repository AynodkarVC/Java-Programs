package Applet;

import java.applet.Applet;
import java.awt.*;

public class Applet13 extends Applet {
   public void paint(Graphics g){
       g.drawLine(10,10,100,100);
       g.setColor(new Color(50,100,200));
       g.fillRect(100,100,50,50);
       g.setColor(Color.RED);
       g.fillOval(50,150,20,20);
   }
}


/*
<applet code = "Applet.Applet13.java" width = 300 height = 300>
</applet>
*/