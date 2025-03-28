package inheritance_task;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;

	public void rentVehicle() {
		if(this.isAvailable) {
			System.out.print("Is Available");
		}
	}
	
	public Vehicle(String vehicleNumber,String brand,String model,double rentalPricePerDay,boolean isAvailable) {
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rentalPricePerDay=rentalPricePerDay;
		this.isAvailable=isAvailable;
	}
	
	public void dispalayDetails() {
		System.out.print(this.vehicleNumber);
		System.out.print(this.brand);
		System.out.print(this.model);
		System.out.print(this.rentalPricePerDay);
	}
}
