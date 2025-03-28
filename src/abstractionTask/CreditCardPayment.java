package abstractionTask;

public class CreditCardPayment extends Payment {
	private double finalAmount;
	private double discount;
	public CreditCardPayment(int amount,String transactionID) {
		super(amount,transactionID);
	}

	void processPayment() {
		
		if(super.getAmount()>500) {
			discount=0.1*super.getAmount();
			finalAmount=(super.getAmount()-discount+0.02*super.getAmount());
		}
		else {
			finalAmount=(super.getAmount()+0.02*super.getAmount());
			discount=0;
		}
		System.out.println("Transaction ID:"+super.getTransactionID());
		System.out.println("Original Amount:"+super.getAmount());
		System.out.println("Discount Applied:"+discount);
		System.out.println("Transaction Fees:"+0.02*super.getAmount());
		System.out.println("Final Payable Amount:"+finalAmount);
	}
}
