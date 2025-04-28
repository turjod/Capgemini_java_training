package Practice;

public class Student extends Person {
	private int studentId;
	public Student(String name,int age,int studentId ) {
		super(name,age);
		this.studentId=studentId;
	}
	public void displayStudentDetails() {
		super.displayPersonDetails();
		System.out.println(studentId);
	}
}
