package AdvancedJava.JDBC;
import java.sql.*;

public class PreparedInsert {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcExamples","root","1806");
            PreparedStatement pstmt = con.prepareStatement("Insert into employee values(?,?,?)");
            pstmt.setInt(1,1);
            pstmt.setString(2,"Vishal");
            pstmt.setDouble(3,300000);
            int i = pstmt.executeUpdate();
            System.out.println("no. of rows afected = " + i);
            pstmt.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
