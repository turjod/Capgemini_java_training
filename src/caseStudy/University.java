package caseStudy;

public class University {
	private Person[] people;
	int index=0;
	public University(int numberOfPerson) {
			people=new Person[numberOfPerson];
	}
	public void addPerson(Person p) {
		if(index<people.length) {
			people[index++]=p;

		}
		else {
			System.out.println("University is full");
		}
	}
	
	public void showPeople() {
		for(Person e:people) {
			if(e instanceof Student) {
				((Student)e).displayStudentInfo();
			}
			else if(e instanceof Professor) {
				((Professor)e).displayProfessorInfo();
			}
		}
	}
	
}
