package InterfaceVehicle;

public class Vehicletest {
	public static void main(String[] args) {
		Vehicle v=new Car("bmw",200);
		v.accelerate(((AbstractVehicle)v).getSpeed());
		((AbstractVehicle)v).displayDetails();
	}
}
