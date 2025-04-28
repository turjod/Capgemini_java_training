package Practice;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void displayPersonDetails() {
		System.out.print(name+" "+age+" ");
	}
}
