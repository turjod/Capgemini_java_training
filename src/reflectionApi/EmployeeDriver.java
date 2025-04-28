package reflectionApi;

import java.lang.reflect.Field;

public class EmployeeDriver {
	public static void main(String[] args) throws Exception{
		Class <Employee> employee=Employee.class;
		// fetching all the field names of a class
		Field[] fields = employee.getDeclaredFields();
		for(Field field : fields) {
		System.out.println(field.getName());
		}
		// changing the value of a field of a particular object
		Employee e= new Employee(1,"Rohit");
		Field f = employee.getDeclaredField("name");
		f.setAccessible(true);
		f.set(e, "Ram");
		System.out.println(f.get(e));
		
		}
	
}
