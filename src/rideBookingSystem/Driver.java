package rideBookingSystem;

public class Driver extends User{
	private boolean available=true;
	public Driver(String id,String name) {
		super(id,name);
		this.available=true;
	}
	public boolean isAvailable() {
		return this.available;
	}
	public void setAvailable(boolean available) {
		this.available=available;
	}
	public void showProfile() {
		System.out.println("id: "+this.id+" "+"Name: "+this.name+" "+"Availablity: "+this.isAvailable());
	}
	
}
