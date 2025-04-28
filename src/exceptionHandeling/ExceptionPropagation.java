package exceptionHandeling;

public class ExceptionPropagation {
	public static void main(String[] args) {
		alpha();
	}
	public static void alpha() {
		System.out.println("Alpha");
		beta();
	}
	
	public static void beta() {
		System.out.println("Beta");
		gama();
	}
	
	public static void gama() {
	System.out.println("Gama");
	System.out.println(10/0);
	}

}
