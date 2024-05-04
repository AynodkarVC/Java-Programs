package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class IODemo5 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("IODemo4.java");
            DataInputStream dis = new DataInputStream(fis);
            String s = "";
            while ((s = dis.readLine())!=null){
                System.out.println(s);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
