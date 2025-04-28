package genericsFlightPractice;

public class Driver {
	public static void main(String[] args) {
		Flight flight1=new Flight("A123");
		Passenger p=new Passenger("Turjo");
		Passenger p2=new Passenger("Kanchan");
		flight1.addPassenger(p);
		flight1.addPassenger(p2);
		Flight flight2=new Flight("B456");
		Passenger p3=new VipPassenger("Alice");
		flight2.addPassenger(p3);
		flight1.showPassengers();
		flight2.showPassengers();
	}
}
