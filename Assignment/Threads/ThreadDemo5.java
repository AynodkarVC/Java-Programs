package Threads;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo5 extends Frame{
    TextField t1,t2;
    Thread th1,th2;
    int i,j;

    public ThreadDemo5() {
        setLayout(new FlowLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        setSize(300, 300);
        setVisible(true);
        add(t1 = new TextField(15));
        add(t2 = new TextField(15));
        th1 = new Thread(new Runnable(){
            public void run(){
                while (true){
                    t1.setText(String.valueOf(i));
                    if (i==5000) i = 0;
                    else i++;
                    try {
                        Thread.sleep(50);
                    }
                    catch (Exception e){

                    }
                }
            }
        });
        th2 = new Thread(new Runnable(){
            public void run(){
                while (true){
                    t2.setText(String.valueOf(j));
                    if (j==5000) j = 0;
                    else j++;
                    try {
                        Thread.sleep(50);
                    }
                    catch (Exception e){

                    }
                }
            }
        });
        th1.start();
        th2.start();
    }

    public static void main(String[] args) {
        new ThreadDemo5();
    }
}
