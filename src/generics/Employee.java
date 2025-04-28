package generics;

public class Employee implements Comparable<Employee>{
	String name;
	int id;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
