package Applet;

import javax.swing.plaf.basic.BasicBorders;
import java.applet.Applet;
import java.awt.*;

public class Applet3 extends Applet{
    Button b1,b2;
    TextField t1;

    public void init(){
        b1 = new Button("Click");
        add(b1);
        add(t1 = new TextField(15));
        add(b2 = new Button("Clear"));
    }

    public boolean action(Event e, Object o){
        if(e.target.equals(b1)){
            t1.setText("Hello");
        }
        if(e.target.equals(b2)){
            t1.setText("");
        }
        return true;
    }
}
/*
<Applet code = Applet.Applet3.class height = 300 width = 300>
</applet>
 */
