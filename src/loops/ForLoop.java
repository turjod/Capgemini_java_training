package loops;

public class ForLoop {
	public static void main(String[] args) {
		int num=291;
		int flag=0;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				System.out.println("Non prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Its a Prime");
		}
	}
}
