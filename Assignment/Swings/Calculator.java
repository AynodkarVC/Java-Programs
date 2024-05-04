package Swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame {
    JButton BtnPlus, BtnMinus, BtnMul, BtnDiv, BtnEquals;
    JTextField TfNum1, TfNum2, TfResult;
    char sign='0';
    public Calculator(String title) {
        super(title);
        setLayout(null);
        setSize(240,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TfNum1 =new JTextField();
        TfNum1.setHorizontalAlignment(JTextField.RIGHT);
        TfNum1.setBounds(5,5,215,30);
        add(TfNum1);

        BtnPlus =new JButton("+");
        BtnPlus.setBounds(5,40,50,30);
        add(BtnPlus);

        BtnMinus =new JButton("-");
        BtnMinus.setBounds(60,40,50,30);
        add(BtnMinus);

        BtnMul =new JButton("X");
        BtnMul.setBounds(115,40,50,30);
        add(BtnMul);

        BtnDiv =new JButton("/");
        BtnDiv.setBounds(170,40,50,30);
        add(BtnDiv);

        TfNum2 =new JTextField();
        TfNum2.setHorizontalAlignment(JTextField.RIGHT);
        TfNum2.setBounds(5,75,215,30);
        add(TfNum2);

        BtnEquals =new JButton("=");
        BtnEquals.setBounds(90,110,50,30);
        add(BtnEquals);

        TfResult =new JTextField();
        TfResult.setHorizontalAlignment(JTextField.RIGHT);
        TfResult.setBounds(5,145,215,30);
        add(TfResult);

        BtnPlus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                sign='+';
            }
        });

        BtnMinus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                sign='-';
            }
        });

        BtnMul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                sign='X';
            }
        });

        BtnDiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                sign='/';
            }
        });
        BtnEquals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                double n1,n2,result=0;
                String s1= TfNum1.getText();
                String s2= TfNum2.getText();
                if(s1.equals("") || s2.equals("") || sign=='0') {
                    if(s1.equals("")) {
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(Calculator.this,"Enter 1st number","Error",JOptionPane.ERROR_MESSAGE);
                        TfNum1.requestFocus();
                        return;
                    }
                    if(s2.equals("")) {
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(Calculator.this,"Enter 2nd number","Error",JOptionPane.ERROR_MESSAGE);
                        TfNum2.requestFocus();
                        return;
                    }
                    if(sign=='0') {
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(Calculator.this,"Select an operation","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                else {
                    n1=Double.parseDouble(s1);
                    n2=Double.parseDouble(s2);

                    switch(sign) {
                        case '+':result=n1+n2;break;
                        case '-':result=n1-n2;break;
                        case 'X': result=n1*n2;break;
                        case '/': result=n1/n2;break;
                    }
                    TfResult.setText(String.valueOf(result));
                    sign='0';
                }
            }
        });
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Calculator("Calculator");
    }
}
