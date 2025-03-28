package abstractionTask;

public abstract class Payment {
	private int amount;
	private String transactionID;
	public Payment(int amount,String transactionID){
		this.amount=amount;
		this.transactionID=transactionID;
		
	}
	abstract void processPayment();

	public int getAmount() {
		return amount;
	}
	public String getTransactionID() {
		return transactionID;
	}
	
}
