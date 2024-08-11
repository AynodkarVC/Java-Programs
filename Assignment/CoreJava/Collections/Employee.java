package CoreJava.Collections;

import java.io.*;
public class Employee implements Serializable,Comparable<Employee> {
	int id;
	String name;
	double salary;

	public Employee(int id, String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			return ((Employee)o).id == id;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return id;
	}
	
	public int compareTo(Employee o) {
		return id-o.id;
	}
	public String toString()
	{
		return "id = "+id+" name = "+name+" salary = "+salary;
	}
};