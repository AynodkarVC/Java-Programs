package CoreJava.Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Applet17 extends Applet implements ItemListener{
    Choice c1,c2,c3;
    Checkbox ch1,ch2;
    String fontName, fontColor;
    int fontSize, fontType, r, gr, b;
    
    public void init(){

        add(c1 = new Choice());
        add(ch1 = new Checkbox("Bold"));
        add(ch2 = new Checkbox("Italic"));
        add(c2 = new Choice());
        add(c3 = new Choice());

        c1.add("Times New Roman");
        c1.add("Arial");
        c1.add("Montserrat");
        
        c2.add("20");
        c2.add("25");
        c2.add("30");
        
        c3.add("Black");
        c3.add("Red");
        c3.add("Blue");
        c3.add("Green");


        fontName = "Times new Roman";
        fontType = 0;
        fontSize = 20;
        fontColor = "";

        c1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                fontName = c1.getSelectedItem();
                repaint();
            }
        });
        
        c2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                fontSize = Integer.parseInt(c2.getSelectedItem());
                repaint();
            }
        });
        
        c3.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                fontColor = c3.getSelectedItem();
                if(fontColor.equals("Black")) r = 0; gr = 0; b = 0;
                if(fontColor.equals("Red")) r = 255; gr = 0; b = 0;
                if(fontColor.equals("Blue")) r = 0; gr = 0; b = 255;
                if(fontColor.equals("Green")) r = 0; gr = 255; b = 0;
                repaint();
            }
        });

        ch1.addItemListener(this);
        ch2.addItemListener(this);
        
    }
    
    public void itemStateChanged(ItemEvent e){
        if (ch1.getState() && ch2.getState()) fontType =3;
        else if(!ch1.getState() && ch2.getState()) fontType = 2;
        else if(ch1.getState() && !ch2.getState()) fontType = 1;
        else fontType = 0;
        repaint();
    }
    
    public void paint(Graphics g){
        g.setColor(new Color(r,gr,b));
        g.setFont(new Font(fontName,fontType,fontSize));
        g.drawString("Mikado Solutions",50,200);
    }
}

/*
<applet code = "CoreJava.Applet.Applet17.java" width = 300 height = 300>
</applet>
*/