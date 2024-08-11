package CoreJava.Collections;

import java.util.*;
public class CollectionParsing
{
	public static void main(String[] ars)
	{
		Vector<Employee> v = new Vector<Employee>();
		v.add(new Employee(1,"John",10000));
		v.add(new Employee(2,"Sam",5000));
		v.add(new Employee(3,"Nick",15000));

		System.out.println("Index : ");
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		Iterator it = v.iterator();
		System.out.println("Iterator : ");
		while(it.hasNext()) {
			Employee e = (Employee) it.next();
			System.out.println(e);
		}

		System.out.println("Iterator Generics : ");
		Iterator<Employee>  it1 = v.iterator();
		while(it1.hasNext()){
			Employee e = it1.next();
			System.out.println(e);
		}

		System.out.println("Enumaration : ");
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			Employee e = (Employee)en.nextElement();
			System.out.println(e);
		}

		System.out.println("Enumatation Generics : ");
		Enumeration<Employee> en1 = v.elements();
		while(en1.hasMoreElements()){
			Employee e = en1.nextElement();
			System.out.println(e);
		}

		System.out.println("For each loop : ");
		for(Employee er : v)
			System.out.println(er);
	}
}