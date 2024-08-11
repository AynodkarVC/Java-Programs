package CoreJava.Collections;

class A {};
public class HashCodeDemo {
	public static void main(String args[]) {
		A a,a1;
		a = new A();
		a1 = a;
		System.out.println(a.equals(a1));
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		Employee e1 = new Employee(1,"John",10000);
		Employee e2 = new Employee(1,"John",10000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
};