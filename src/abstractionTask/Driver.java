package abstractionTask;

public class Driver {
	public static void main(String[] args) {
		Payment obj1=new CreditCardPayment(6000,"AB1122");
		obj1.processPayment();
	
	}
}
