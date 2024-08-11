package CoreJava.Collections;

import java.util.*;

public class TreeSetDemo {
	public static void main(String args[]) {
		Employee e1 = new Employee(1,"John",10000);
		Employee e2 = new Employee(2,"Sam",5000);
		TreeSet ts = new TreeSet();
		ts.add(e1);
		ts.add(e2);
		System.out.println(ts);
		TreeSet ts1 = new TreeSet(new EmployeeComparator());
		ts1.add(e1);
		ts1.add(e2);
		System.out.println(ts1);
	}
};