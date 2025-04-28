package getterAndSetters;

public class Driver {
	public static void main(String[] args) {
		Employee e= new Employee();
		e.setName("turjo");
		System.out.println(e.getName());
		Employee e2=new Employee();
		System.out.println(e2.getName());	
		}
}
