package Applet;

import java.applet.Applet;
import java.awt.Button;

public class Applet2 extends Applet{
    Button  b;
    public void init(){
        b = new Button("Click");
        add(b);
    }
}

/*
<Applet code = Applet.Applet2.class height = 300 width = 300>
</applet>
 */