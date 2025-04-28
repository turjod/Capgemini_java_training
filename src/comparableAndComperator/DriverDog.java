package comparableAndComperator;

import java.util.Arrays;

public class DriverDog {
	public static void main(String[] args) {
		Dog obj[]=new Dog[3];
		obj[0]=new Dog("A",3);
		obj[1]=new Dog("B",4);
		obj[2]=new Dog("C",5);
		
		Arrays.sort(obj);
		
		for(Dog i:obj) {
			System.out.println(i);
		}
		
	}
}
