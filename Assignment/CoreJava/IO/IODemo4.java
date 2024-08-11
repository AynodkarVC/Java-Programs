package CoreJava.IO;

import java.io.DataInputStream;

public class IODemo4 {
    public static void main(String[] args) {
        System.out.println("Enter Yout Name");
        DataInputStream dis = new DataInputStream(System.in);
        try {
            String s = dis.readLine();
            System.out.println("Hi " + s);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
