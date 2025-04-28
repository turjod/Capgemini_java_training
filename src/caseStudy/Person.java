package caseStudy;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		setName(name);
		setAge(age);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String s) {
		this.name=s;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int n) {
		this.age=n;
	}
	
	public void displayInfo() {
		System.out.print("Name: "+name+" "+"Age: "+age+" ");
	}
}
