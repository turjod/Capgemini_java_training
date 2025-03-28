package abstractionTask;

public class PayPalPayment extends Payment {
	private double FinalPayableAmount;
	public PayPalPayment(int amount,String transactionID) {
		super(amount,transactionID);
	}
	void processPayment() {
		
	}
	
}
