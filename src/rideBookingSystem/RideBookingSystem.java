package rideBookingSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RideBookingSystem {
	public List <Customer> customers;
	public List <Driver> drivers;
	public List<Ride> rides;
	public void registerCustomer(Customer customer) {
		this.customers.add(customer);
	}
	public void registerDriver(Driver driver) {
		this.drivers.add(driver);
	}
	Ride bookRide(Customer customer) throws InvalidRideException {
		List<Driver> AvailableDrivers =drivers.stream().filter(driver -> driver.isAvailable()).toList();
		
		if(AvailableDrivers.isEmpty()) {
			throw new InvalidRideException("No driver is available");
		}
		else {
			rides.add(new Ride(customer, AvailableDrivers.getFirst(),"Booked"));
			AvailableDrivers.getFirst().setAvailable(false);
			System.out.println("Ride is Booked!");
		}
		return new Ride(customer, AvailableDrivers.getFirst(),"Unavailable");
	}
	
	void saveRides() throws IOException {
		try
		{
			BufferedWriter bis= new BufferedWriter(new FileWriter("rides.txt"));
			for(Ride ride:rides) {
				bis.write(ride.rideDetails());
				bis.newLine();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		
	}
	void loadDriversFromFile() {
		
	}
	
}
