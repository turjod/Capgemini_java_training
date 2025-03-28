package student_management;
import java.util.Scanner;

public class Student {
	private String email="turjodas@gmail.com";
	private String password="turjodas";
	private String name="Turjo Das";
	private String gender="male";
	private int age=20;
	private String branch="CSE";
	
	Scanner sc= new Scanner(System.in);

	public void setPassword(String password) {
		System.out.println("Enter old password:");
		String checkPass=sc.nextLine(); 
		if(checkPass==this.password) {
			this.password = checkPass;
			System.out.println("Password Changes!");
		}
		else {
			System.out.println("Wrong Password");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
