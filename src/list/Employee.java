package list;

public class Employee implements Comparable<Employee>{
	String name;
	int id;
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
	}
	
}
