package Collections;

import java.util.*;

public class VectorDemo
{
	public static void main(String args[])
	{
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		String s1 = new String("Sanjay");
		String s2 = new String("Sanjay");
		Employee e1 = new Employee(1,"John",10000);
		Employee e2 = new Employee(1,"John",10000);
		v1.add(s1);
		v2.add(e1);
		System.out.println(v1.contains(s2));
		System.out.println(v2.contains(e2));
	}
};