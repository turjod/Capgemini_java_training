package InterfaceVehicle;

public class Car extends AbstractVehicle{
	public void displayDetails() {
		System.out.println(getSpeed());
		System.out.println(name);
	}
	public Car(String name,int speed) {
		super(name,speed);
	}
	public void start() {
		System.out.println("Car is started");
	}
	public void stop() {
		System.out.println("Car is stoppeed");
	}
	
}
