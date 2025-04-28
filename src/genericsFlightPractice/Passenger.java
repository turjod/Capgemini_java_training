package genericsFlightPractice;

public class Passenger {
	private String name;
	public String toString() {
		return "Economy Name: "+name;
	}
	public Passenger(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
