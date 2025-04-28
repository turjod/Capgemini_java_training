package doublyLinkedList;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter\n1. to insert\n2. Display\n3.To Update\n4. To insert node at any position\n5. To exit");
				int choice= sc.nextInt();
				switch(choice) {
					case 1:{
						System.out.println("Enter Data:");
						int data=sc.nextInt();
						list.insert(data);
						break;
					}
					case 2:{
						list.display();
						break;
					}
		//			case 3:{
		//				System.out.println("Enter Position To Update:");
		//				int pos=sc.nextInt();
		//				System.out.println("Enter Updated Data:");
		//				int data=sc.nextInt();
		//				list.update(pos,data);
		//				break;
		//			}
					
					case 5:{
						flag=false;
						break;
					}
					default:
						System.out.println("Invalid Choise!");
				}
			}
		}
}
