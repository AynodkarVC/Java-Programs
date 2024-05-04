package Collections;

import java.util.*;

class IntegerComparator implements Comparator<Integer> {
	public int compare(Integer i, Integer j) {
		return j - i;
	}
};
public class  ArrayListDemo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Sunil",6000));
		employees.add(new Employee(2,"Deepak",8500));
		employees.add(new GreatEmployee(3,"Bharat",6000));
		

		System.out.println(employees.size());
		employees.remove(new Employee(1,"Sunil",6000));
		System.out.println(employees.size());

		employees.add(new Employee(1,"Sunil",6000));
		System.out.println("Unsorted "+employees);

		Collections.sort(employees);
		System.out.println("Sorted "+employees);
	
		
		Collections.sort(employees,new EmployeeComparator());
		System.out.println("Sorted by Comparator "+employees);
	
	}
}
