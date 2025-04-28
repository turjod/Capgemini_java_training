package caseStudy;

public class Driver {
	public static void main(String[] args) {
		University u=new University(2);
		Student s=new Student("Turjo",24,1);
		Professor p=new Professor("Kanchan",24,"Zoo");
		Professor p1=new Professor("Kanchan mallick",24,"Zoo");
		u.addPerson(s);
		u.addPerson(p);
		u.addPerson(p1);

		u.showPeople();
	}
}
