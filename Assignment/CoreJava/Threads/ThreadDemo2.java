package CoreJava.Threads;

import java.applet.Applet;
import java.awt.*;

public class ThreadDemo2 extends Applet implements Runnable
{
    TextField t1,t2;
    int i,j;
    Thread th1;
    A a;

    public void init()
    {
        add(t1 = new TextField(15));
        add(t2 = new TextField(15));
        th1 = new Thread(this);
        a = new A();
        th1.start();
        a.start();
    }
    public void run()
    {
        while(true)
        {
            t1.setText(String.valueOf(i));
            if(i == 5000)
                i = 0;
            else
                i++;
            try
            {
                Thread.sleep(50);
            }
            catch(Exception e)
            {
            }
        }
    }
    class A extends Thread
    {
        public void run()
        {
            while(true)
            {
                t2.setText(String.valueOf(j));
                if(j == 5000)
                    j = 0;
                else
                    j++;
                try
                {
                    Thread.sleep(50);
                }
                catch(Exception e)
                {
                }
            }
        }
    };
};
/*
<applet code="CoreJava.Threads.ThreadDemo2.class" width=300 height=300>
</applet>
*/
