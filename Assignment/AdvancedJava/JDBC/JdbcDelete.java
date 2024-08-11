package AdvancedJava.JDBC;
import java.sql.*;

public class JdbcDelete {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcExamples","root","1806");
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate("delete from employee where id=4");
            System.out.println("no. of columns affected " + i);
            stmt.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
