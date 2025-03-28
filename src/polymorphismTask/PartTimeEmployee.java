package polymorphismTask;

public class PartTimeEmployee extends Employee {
	private int workingHours;
	public PartTimeEmployee(String name,double salary,int workingHours) {
		super(name,salary);
		this.workingHours=workingHours;
	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println(" "+this.workingHours);
	}
	public void jobRole() {
		System.out.println("the job role of part time enginner is cloud engineer");
	}
	public void designitaion() {
		System.out.println("Associate");
	}
}
