package polymorphismTask;

public class Driver {
	public static void main(String[] args) {
		Employee a=new PartTimeEmployee("Turjo",100.0,9);
		Employee b=new FullTimeEmployee("Kanchan",200.0,100);
		a.employeeInfo();
		b.employeeInfo();
		((FullTimeEmployee)b).jobRole();
		
	}
	public static void details(Employee e) {
		
	}
}
