package Dummy;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		int[] arr=inputArray();
		checkPalindrome(arr);
	}

	public static int[] inputArray(){
		int size;
		System.out.println("Enter size of the array:");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	public static void checkPalindrome(int[] arr) {
		int i=0,j=arr.length-1;
		int flag=0;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				System.out.println("It is not a palindrome!");
				flag=1;
				break;
			}
			i++;
			
			j--;
		}
		if(flag==0) {
			System.out.println("Its a palindrome!");
	}
}

}