package stackUsingArrays;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		Stack st=new Stack(arr);
		
		while(flag==true) {
			System.out.println("Enter\n1. Push\n2. pop\n3. Show\n4. Exit:");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:{
					System.out.print("Enter value to push:");
					int value=sc.nextInt();
					st.push(value);
					break;
				}
				case 2:{
					st.pop();
					break;
				}
				case 3:{
					st.display();
					break;
				}
				case 4:{
					flag=false;
				}
			}
			
		}
	}
}
