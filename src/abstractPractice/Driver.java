package abstractPractice;

public class Driver {
	public static void main(String[] args) {
		BasicCalci b=new CalciVer1();
		System.out.println(b.add(2, 2));	
		System.out.println(((CalciVer1)b).power(2, 2));	
		CalciVer1A c=new CalciVer1();
		System.out.println(c.power(1, 2));	
	}
}
