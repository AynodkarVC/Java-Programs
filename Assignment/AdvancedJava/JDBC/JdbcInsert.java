package AdvancedJava.JDBC;

import java.sql.*;

public class JdbcInsert {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcExamples","root","1806");
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate("insert into employee values(4,'Vivaan',30000)");
            System.out.println("No. of rows affected : " + i);
            stmt.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
