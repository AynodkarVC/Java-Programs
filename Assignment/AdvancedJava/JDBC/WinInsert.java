package AdvancedJava.JDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class WinInsert extends JFrame {
    Container c;
    JTextField jtf1,jtf2,jtf3,jtf4;
    JButton jbtn1;
    JLabel jl1,jl2,jl3,jl4;
    Connection con;
    PreparedStatement pstmt;

    public WinInsert(){
        setResizable(false);
        setSize(250,265);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);

        jl1 = new JLabel("Id");
        jl1.setBounds(5,20,100,25);
        c.add(jl1);

        jtf1 = new JTextField();
        jtf1.setBounds(125,20,100,25);
        c.add(jtf1);

        jl2 = new JLabel("Name");
        jl2.setBounds(5,65,100,25);
        c.add(jl2);

        jtf2 = new JTextField();
        jtf2.setBounds(125,65,100,25);
        c.add(jtf2);

        jl3 = new JLabel("Salary");
        jl3.setBounds(5,110,100,25);
        c.add(jl3);

        jtf3 = new JTextField();
        jtf3.setBounds(125,110,100,25);
        c.add(jtf3);

        jbtn1 = new JButton("Submit");
        jbtn1.setBounds(50,155,100,25);
        c.add(jbtn1);

        jl4 = new JLabel("Rows Affected");
        jl4.setBounds(5,200,100,25);
        c.add(jl4);

        jtf4 = new JTextField();
        jtf4.setBounds(125,200,100,25);
        c.add(jtf4);

        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                        pstmt.setInt(1,Integer.parseInt(jtf1.getText()));
                        pstmt.setString(2,jtf2.getText());
                        pstmt.setDouble(3,Double.parseDouble(jtf3.getText()));
                        int i = pstmt.executeUpdate();
                        jtf4.setText(String.valueOf(i));
                }catch (Exception e1){
                    System.out.println(e1);
                }
            }
        });

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcExamples","root","1806");
            pstmt = con.prepareStatement("Insert into employee values (?,?,?)");
        }catch (Exception e){
            System.out.println(e);
        }

        setVisible(true);
    }

    public static void main(String[] args){
        new WinInsert();
    }
}
