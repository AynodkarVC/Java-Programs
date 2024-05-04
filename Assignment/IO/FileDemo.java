package IO;

import javax.xml.crypto.Data;
import java.io.File;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("IODemo5");
        System.out.println("Name : " + f.getName());
        System.out.println("Parent : " + f.getParent());
        System.out.println("Path : " + f.getPath());
        System.out.println("Can Read : " + f.canRead());
        System.out.println("Can Write : "+ f.canWrite());
        System.out.println("is File : " + f.isDirectory());
        System.out.println("is Directory : " + f.isDirectory());
        System.out.println("Length : " + f.length());
        System.out.println("Exists : " + f.exists());
        System.out.println("Last Modified : "+ new Date(f.lastModified()));
        System.out.println("Rename To : " + f.renameTo(new File("F.java")));
    }
}
