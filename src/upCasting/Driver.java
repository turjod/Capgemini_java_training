package upCasting;

public class Driver {
	public static void main(String[] args) {
		Animal e=new Dog();
		Dog d= (Dog)e;
		d.sound1();
	}
}
