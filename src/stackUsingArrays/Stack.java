package stackUsingArrays;
import java.util.*;


public class Stack {
	static int top=-1;
	int arr[];
	public Stack(int[] arr) {
		this.arr=arr;
	}
	public void push(int value) {
		if(top==arr.length-1) {
			System.out.println("Stack over Flow!");
			return;
		}
		else {
			top++;
			arr[top]=value;
			System.out.println("Push done!");
		}
		
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return;
		}
		else {
			top--;
			System.out.println("popped successfully");
			return;
		}
		
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty!");
			return;
		}
		else {
			for(int i=0;i<=top;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		
		}
	}	
}
