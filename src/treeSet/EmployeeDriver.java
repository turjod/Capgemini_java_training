package treeSet;

import java.util.TreeSet;

public class EmployeeDriver {
	public static void main(String[] args) {
		TreeSet<Employee> tr=new TreeSet<>();
		tr.add(new Employee("Turjo",2));
		tr.add(new Employee("Kanchan",1));
		tr.add(new Employee("Aritra",3));
		
		System.out.println(tr);
	}
}
