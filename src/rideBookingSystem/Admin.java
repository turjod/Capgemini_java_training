package rideBookingSystem;

import java.util.*;

@SecurityCheck(role="Admin")
public class Admin extends User{
	
	public Admin(String id,String name) {
		super(id,name);
	}
	
	Class<SecurityCheck> c =SecurityCheck.class;
	SecurityCheck s= c.getDeclaredAnnotation(SecurityCheck.class);
	
	public void showProfile() {
		System.out.println("Name: "+this.name+" Role: "+s.role());
	}
	public void removeDriver(List <Driver>drivers,String driverId) {
		try
		{
			boolean removedDriver=false;
			if(s.role().equals("Admin")) {
				Iterator<Driver>itr =drivers.iterator();
				while(itr.hasNext()) {
					Driver driver=itr.next();
					if(driver.id.equals(driverId)) {
						itr.remove();
						removedDriver=true;
						System.out.println("Driver: "+driver.name+" with driverId: "+driver.id+" is removed");
						break;
					}
					if(!removedDriver){
						System.out.println("Invalid Driver ID");
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Security Error!");
		}
	}
}
