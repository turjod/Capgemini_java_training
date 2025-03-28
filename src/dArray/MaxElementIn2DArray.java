package dArray;
import java.util.Scanner;
public class MaxElementIn2DArray {
	public static void main(String[] args) {
		int[][]arr=new int[3][3];
		
		arr=inputArray();
		checkSymmetry(arr);
	}
	public static int[][] inputArray(){
		int[][]arr=new int[3][3];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr array elements:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	
	public static void checkSymmetry(int[][] arr) {
		int flag=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]!=arr[j][i]) {
					System.out.println("Not Symmetric");
					flag=1;
					break;
				}
			}
		}
		
		if(flag==0) {
			System.out.println("Symmetric");
		}
		
	}
	
}
