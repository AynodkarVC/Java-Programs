package CoreJava.Collections;

import java.util.*;

public class EmployeeComparator implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.salary - o2.salary);
	}
};