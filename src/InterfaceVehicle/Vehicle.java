package InterfaceVehicle;

public interface Vehicle {
	public void start();
	public void stop();
	public void accelerate(int increment);
	public void brake(int decrement);
}
