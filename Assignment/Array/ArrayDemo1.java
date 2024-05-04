package Array;

import java.awt.*;
import java.awt.event.*;
public class ArrayDemo1 extends Frame {
    
    int[] arr1, arr2;
    
    public ArrayDemo1(){
        
        arr1 = new int[10];
        arr2 = new int[10];
        
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(400 * Math.random());
            arr2[i] = (int)(400 * Math.random());
        }
        
        addWindowListener(new WindowAdapter(){
            
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
           
        setVisible(true);
        setSize(500,500);
        
    }
    
    public void paint(Graphics g){
        g.drawPolygon(arr1,arr2,10);
    }
    
    public static void main(String args[]){
        new ArrayDemo1();
    }
}