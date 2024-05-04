package Collections;

import java.util.Vector;
import java.awt.*;


public class GenDemo {
    public static void main(String[] args){
        Vector v = new Vector();
        Employee emp = new Employee(1,"John",10000);
        v.add(emp);
        String s = new String ("Vishal");
        v.add(s);
        Button b = new Button();
        v.add(b);
        v.add(new TextField());
        Employee e = (Employee)v.get(0);
        String str = (String)v.get(1);
        System.out.println(str);
        System.out.println(e);

        Vector<Employee> v1 = new Vector<Employee>();
        v1.add(new Employee());
        Employee e1 = v1.get(0);
    }
}