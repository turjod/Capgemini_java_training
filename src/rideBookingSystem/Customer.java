package rideBookingSystem;

public class Customer extends User{
	public Customer(String id,String name) {
		super(id,name);
	}
	public void showProfile() {
		System.out.println("id: "+this.id+" "+this.name);
	}
	
}
