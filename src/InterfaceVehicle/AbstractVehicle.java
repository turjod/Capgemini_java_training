package InterfaceVehicle;

public abstract class AbstractVehicle implements Vehicle{
	protected String name;
	protected int speed=0;
	protected abstract void displayDetails();
	public AbstractVehicle(String name,int speed) {
		this.name=name;
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void accelerate (int increment) {
		speed=++increment;
	}
	public void brake (int decrement) {
		speed=--decrement;
	}
}
