package genericsFlightPractice;

public class VipPassenger extends Passenger{
	public VipPassenger(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Vip name: "+getName();
	}
	
}
