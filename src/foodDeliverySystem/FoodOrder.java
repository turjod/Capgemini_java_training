package foodDeliverySystem;
import java.util.*;
import java.util.Map.Entry;

public class FoodOrder {
	private List<Resturent> resturents;
	private List<Customer> customers;
	private HashMap<Resturent,Customer>order;
	public FoodOrder() {
		this.resturents=new ArrayList<Resturent>();
		this.customers=new ArrayList<Customer>();
		this.order= new HashMap<Resturent,Customer>();

	}
	public void addOrder(Resturent r,Customer c,String food) throws MaximumOrerLimitException {
		order.put(r, c);
		if(c.getOrderCount()<=5) {
			c.addFood(r,food);
		}
		else {
			throw new MaximumOrerLimitException ("Maximum order limit");
		}
	}
	public void showOrders() {
		for(Entry<Resturent, Customer> e:order.entrySet()) {
			Resturent r= e.getKey();
			Customer c= e.getValue();
			System.out.print(r.getName()+" ");
			System.out.print(c.getName()+" ");
			System.out.println(c.getOrderedFood());
		}
	}
}
