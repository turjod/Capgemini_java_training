package calculator;
import java.util.Scanner;
public class CalculatorApp {
	public static void main(String[] args) {
		int choice=0;
		while(choice!=5) {
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Divission\n5.Exit\nEnter Your Choise:");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice){
				case 1:{
					Calculator.addMenu();
					break;
				}
				case 5:{
					System.out.println("Thank you for using calculator!");
					break;
				}
				default:{
					System.out.println("Invalid Choise");
					break;
				}
			}
		}
		
	}
}
