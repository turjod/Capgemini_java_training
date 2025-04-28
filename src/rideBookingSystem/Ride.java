package rideBookingSystem;

public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;
	public Ride(Customer customer,Driver driver, String string) {
		setCustomer(customer);
		setDriver(driver);
		this.status="Booked";
	}
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public void setDriver(Driver driver) {
		this.driver=driver;
	}
	public void completeRide() {
		this.status="Completed";
	}
	public String getStatus() {
		return this.status;
	}
	public String rideDetails() {
		return "customer name: "+customer.name+" Driver Name: "+driver.name+" Status: "+this.status;
	}
}
