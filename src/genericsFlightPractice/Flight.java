package genericsFlightPractice;
import java.util.*;

public class Flight<Passenger> {
	private String flightNumber;
	private List<Passenger> passengers;
	
	public Flight(String flightNumber) {
		this.flightNumber=flightNumber;
		this.passengers= new ArrayList<Passenger>();
	}
	
	public void addPassenger(Passenger p) {
		this.passengers.add(p);
	}
	
	public void showPassengers() {
	
			System.out.println(this.passengers);

	}
}
