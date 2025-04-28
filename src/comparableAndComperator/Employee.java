package comparableAndComperator;

public class Employee implements Comparable {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double Salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		return this.name.compareTo(e.name);
	}
	
}
