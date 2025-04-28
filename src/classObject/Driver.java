package classObject;

public class Driver {
	public static void main(String[] args) {
		Employee obj=new Employee("turjo",1120);
		System.out.println(obj);
		Object o =obj.clone();
	}
}
