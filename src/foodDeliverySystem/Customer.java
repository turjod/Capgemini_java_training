package foodDeliverySystem;
import java.util.*;
public class Customer {
	private String name;
	private List<String>orderedFood;
	private boolean isLogin;
	private int orderCount=1;
	
	public Customer(String name,String user,String pass) {
		this.name=name;
		this.isLogin=isLogin(user,pass);
		this.orderedFood=new ArrayList<String>();
	}
	
	public boolean isLogin(String user,String pass) {
		
		if(user=="turjo"&&pass=="turjo") {
			return true;
		}
		else {
			return false;
		}
	}
	public String getName() {
		return this.name;
	}
	public boolean getIsLogin() {
		return this.isLogin;
	}
	public void addFood(Resturent r,String food) {
			if(r.isFoodAvailable(food)) {
				this.orderedFood.add(food);
				++this.orderCount;
			}
			else {
				System.out.println("Food Not avilable");
				return;
			}
	}
	public List getOrderedFood() {
		return this.orderedFood;
	}
	public int getOrderCount() {
		return this.orderCount;
	}
}
