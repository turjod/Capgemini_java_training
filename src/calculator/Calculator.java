package calculator;
import java.util.Scanner;

public class Calculator {
	public static void addMenu() {
		System.out.println("1.Addition of Two number \n2.Addition of three number \n3.Addition of Four number \nEnter Your Choise:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Enter First number:");
				Scanner sc1=new Scanner(System.in);
				double num1=sc1.nextDouble();
				
				System.out.println("Enter Second number: ");
				Scanner sc2=new Scanner(System.in);
				double num2=sc2.nextDouble();
				double sum=num1+num2;
				System.out.println("Sum="+sum);
				break;
			}
			case 2:{
				System.out.println("Enter First number:");
				Scanner sc1=new Scanner(System.in);
				double num1=sc1.nextDouble();
				
				System.out.println("Enter Second number: ");
				Scanner sc2=new Scanner(System.in);
				double num2=sc2.nextDouble();
				
				System.out.println("Enter third number: ");
				Scanner sc3=new Scanner(System.in);
				double num3=sc3.nextDouble();
				
				double sum=num1+num2+num3;
				System.out.println("Sum="+sum);
				break;
			}
			case 3:{
				System.out.println("Enter First number:");
				Scanner sc1=new Scanner(System.in);
				double num1=sc1.nextDouble();
				
				System.out.println("Enter Second number: ");
				Scanner sc2=new Scanner(System.in);
				double num2=sc2.nextDouble();
				
				System.out.println("Enter third number: ");
				Scanner sc3=new Scanner(System.in);
				double num3=sc3.nextDouble();
				
				System.out.println("Enter fourth number: ");
				Scanner sc4=new Scanner(System.in);
				double num4=sc4.nextDouble();
				
				double sum=num1+num2+num3+num4;
				System.out.println("Sum="+sum);
				break;
			}
			default:{
				System.out.println("Invalid Choise");
				break;
			}
		}
	}
	
	public static void addMenu() {
		System.out.println("1.Addition of Two number \n2.Addition of three number \n3.Addition of Four number \nEnter Your Choise:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Enter First number:");
				Scanner sc1=new Scanner(System.in);
				double num1=sc1.nextDouble();
				
				System.out.println("Enter Second number: ");
				Scanner sc2=new Scanner(System.in);
				double num2=sc2.nextDouble();
				double sum=num1+num2;
				System.out.println("Sum="+sum);
				break;
			}
			case 2:{
				System.out.println("Enter First number:");
				Scanner sc1=new Scanner(System.in);
				double num1=sc1.nextDouble();
				
				System.out.println("Enter Second number: ");
				Scanner sc2=new Scanner(System.in);
				double num2=sc2.nextDouble();
				
				System.out.println("Enter third number: ");
				Scanner sc3=new Scanner(System.in);
				double num3=sc3.nextDouble();
				
				double sum=num1+num2+num3;
				System.out.println("Sum="+sum);
				break;
			}
			case 3:{
				System.out.println("Enter First number:");
				Scanner sc1=new Scanner(System.in);
				double num1=sc1.nextDouble();
				
				System.out.println("Enter Second number: ");
				Scanner sc2=new Scanner(System.in);
				double num2=sc2.nextDouble();
				
				System.out.println("Enter third number: ");
				Scanner sc3=new Scanner(System.in);
				double num3=sc3.nextDouble();
				
				System.out.println("Enter fourth number: ");
				Scanner sc4=new Scanner(System.in);
				double num4=sc4.nextDouble();
				
				double sum=num1+num2+num3+num4;
				System.out.println("Sum="+sum);
				break;
			}
			default:{
				System.out.println("Invalid Choise");
				break;
			}
		}
	}
	
	
}
