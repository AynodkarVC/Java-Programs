package AdvancedJava.JDBC;

import java.sql.*;

public class JdbcUpdate {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcExamples","root","1806");
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate("Update employee set salary=40000 where id=4");
            System.out.println("No. of rows affected : " + i);
            stmt.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
