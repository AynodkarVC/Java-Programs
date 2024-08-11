package CoreJava.Beans;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JRoundButton extends JComponent {
    Boolean entered, down;
    String text;
    int cx = 28, cy = 28, radius = 25;

    public JRoundButton(){
        text = "";
        init();
    }

    public JRoundButton(String text){
        this.text = text;
        init();
    }

    public void setText(String text){
        this.text = text;
        repaint();
    }

    public void init(){
        setSize(56,56);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                down = true;
                repaint();
            }
            @Override
            public void mouseReleased(MouseEvent e){
                down = false;
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                int dx = cx-x;
                int dy = cy-y;
                int dist = (int) Math.sqrt(dx * dx + dy * dy);
                if (dist <= radius) entered = true;
                else entered = false; repaint();
            }
        });
    }

    public void paint(Graphics g){
        if(!entered){
            g.setColor(Color.WHITE);
            g.fillOval(3,3,50,50);
            g.setColor(Color.GRAY);
            g.fillOval(5,5,50,50);
            g.setColor(getBackground());
            g.fillOval(4,4,50,50);
            g.setColor(Color.BLACK);
            g.drawString(text,22,32);
        }
        else {
            if (!down){
                g.setColor(Color.WHITE);
                g.fillOval(3,3,50,50);
                g.setColor(Color.GRAY);
                g.fillOval(5,5,50,50);
                g.setColor(getBackground());
                g.fillOval(4,4,50,50);
                g.setColor(Color.WHITE);
                g.drawString(text,22,32);
            }
            if (down){
                g.setColor(Color.GRAY);
                g.fillOval(3,3,50,50);
                g.setColor(Color.WHITE);
                g.fillOval(5,5,50,50);
                g.setColor(getBackground());
                g.fillOval(4,4,50,50);
                g.setColor(Color.BLACK);
                g.drawString(text,22,35);
            }
        }
    }
}
