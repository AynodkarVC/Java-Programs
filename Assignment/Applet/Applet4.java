package Applet;

import java.applet.Applet;

import java.awt.*;

public class Applet4 extends Applet{
    TextField t1,t2,t3;
    Label l1;
    Button b1;

    public void init(){
        add(t1 = new TextField(15));
        add(l1 = new Label("+"));
        add(t2 = new TextField(15));
        add(b1 = new Button("="));
        add(t3 = new TextField(15));
    }

    public boolean action(Event e, Object o){
        int i = Integer.parseInt(t1.getText());
        int j = Integer.parseInt(t2.getText());

        if(e.target.equals(b1)){
            int sum = i + j;
            t3.setText(String.valueOf(sum));
        }
        return true;
    }
}
/*
<Applet code = Applet.Applet4.class height = 300 width = 300>
</applet>
 */