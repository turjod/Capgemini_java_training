package lamdaExpression;

public class Employee implements Comparable<Employee>{
	String name;
	int id;
	public Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String ToString(){
		return name+" "+id;	
	}

	public int compareTo(Object e) {
		
		return this.id-e.id;
	}
	
}
