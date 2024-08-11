package CoreJava.Threads;

import java.applet.Applet;
import java.awt.*;

public class ThreadDemo7 extends Applet {
    int x,y;
    Thread t1,t2;


    public void init() {
        x = 0;
        y = 150;
        repaint();
        t1 = new Thread(new Runnable() {
            public void run() {
               while(true){
                   if (y<300){
                       for (int i=0; i<=300; i++){
                           for (int j=150; j<=300; j+=2){
                               x=i;
                               y=j;
                           }
                       }
                   }else {
                       for (int i=0; i<=300; i++){
                           for (int j=300; j>=150; j-=2){
                               x=i;
                               y=j;
                           }
                       }
                   }
               }
            }
        });
        t1.start();

    }

    public void paint(Graphics g) {
        System.out.println("Drawing oval at: (" + x + ", " + y + ")");
        g.setColor(Color.RED);
        g.fillOval(x,y,10, 10);
    }
}
/*
<applet code = "threads.ThreadDemo7.class" width = 310 height = 310>
</applet>
*/