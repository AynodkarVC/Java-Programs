package CoreJava.Exceptions;


import java.awt.*;
import java.awt.event.*;

public class InputForm extends Frame{
    Panel1 p1;
    Panel2 p2;

    public InputForm()
    {
        add(p1 = new Panel1(),BorderLayout.CENTER);
        add(p2 = new Panel2(),BorderLayout.SOUTH);
        p2.b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String name = p1.t1.getText();
                int day = Integer.parseInt(p1.t2.getText());
                int month = Integer.parseInt(p1.t3.getText());
                int year = Integer.parseInt(p1.t4.getText());

                try {
                    new Person(name,day,month,year);
                } catch (DateException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[]){
        new InputForm();
    }
}

class ErrorDialog extends Dialog{
    public ErrorDialog(Frame owner,String title,boolean modal){
        super(owner,title,modal);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(200,100);
        setVisible(true);

    }
}
class Panel1 extends Panel{

    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;

    public Panel1(){

        setLayout(new GridLayout(4,4));
        add(l1 = new Label("Name"));
        add(t1 = new TextField(15));
        add(l2 = new Label("Day"));
        add(t2 = new TextField(15));
        add(l3 = new Label("Month"));
        add(t3 = new TextField(15));
        add(l4 = new Label("Year"));
        add(t4 = new TextField(15));
    }
}
class Panel2 extends Panel{
    Button b;

    public Panel2(){
        add(b = new Button("Submit"));
    }
}