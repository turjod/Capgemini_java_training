package inheritance;

public class Student extends Person {
	private int studentId;
	public Student(String name,int age,int studentID) {
		super(name,age);
		this.studentId=studentID;
	}
	public void displayStudentDetails(){
		displayPersonDetails();
		System.out.print(" "+this.studentId);
	}
}
