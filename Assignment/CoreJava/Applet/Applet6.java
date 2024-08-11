package CoreJava.Applet;

import  java.applet.Applet;
import  java.awt.*;

public class Applet6 extends Applet{
    Panel1 pl1;
    Panel2 pl2;
    GridLayout gl1;
    public void init(){
        gl1 = new GridLayout(1,2);
        setLayout(gl1);

        pl1 = new Panel1();
        add(pl1);

        pl2 = new Panel2();
        add(pl2);

        pl2.t1.setEditable(false);

        pl2.ch1.setState(true);
        pl2.ch2.setState(true);
        pl2.ch3.setState(false);
        pl2.t1.setText("5000");

    }

    public boolean action(Event e, Object o){
        if(e.target.equals(pl1.c1)){
            pl2.ch1.setState(true);
            pl2.ch2.setState(true);
            pl2.ch3.setState(false);
            pl2.t1.setText("5000");
        }
        if(e.target.equals(pl1.c2)){
            pl2.ch1.setState(false);
            pl2.ch2.setState(true);
            pl2.ch3.setState(true);
            pl2.t1.setText("10000");
        }
        if(e.target.equals(pl1.c3)){
            pl2.ch1.setState(true);
            pl2.ch2.setState(true);
            pl2.ch3.setState(true);
            pl2.t1.setText("15000");
        }
        return true;
    }
}

class Panel1 extends Panel{
    GridLayout gl;
    CheckboxGroup cg;
    Checkbox c1,c2,c3;
    public Panel1(){
        gl = new GridLayout(3,1);
        setLayout(gl);
        cg = new CheckboxGroup();
        add(c1 = new Checkbox("Tour 1",cg,true));
        add(c2 = new Checkbox("Tour 2",cg,false));
        add(c3 = new Checkbox("Tour 3",cg,false));

    }

}

class Panel2 extends Panel{
    GridLayout gl2;
    Checkbox ch1,ch2,ch3;
    TextField t1;

    public Panel2(){
        gl2 = new GridLayout(4,1);
        setLayout(gl2);
        add(ch1 = new Checkbox("Shimla"));
        add(ch2 = new Checkbox("Manali"));
        add(ch3 = new Checkbox("Dalhousie"));
        add(t1 = new TextField(20));
    }
}

/*
   <applet code = "CoreJava.Applet.Applet6.java" width = 300 height = 300>
   </applet>
 */