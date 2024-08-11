package CoreJava.Collections;

import java.util.*;

public class HashDemo {
	public static void main(String args[]) {
		Employee e1 = new Employee(1,"John",10000);
		Employee e2 = new Employee(1,"John",10000);
		Vector v = new Vector();
		HashSet hs = new HashSet();
		v.add(e1);
		hs.add(e1);
		System.out.println(v.contains(e2));
		System.out.println(hs.contains(e2));
	}
};