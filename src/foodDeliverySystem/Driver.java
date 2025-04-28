package foodDeliverySystem;
import java.util.*;

public class Driver {
	public static void main(String[] args) throws MaximumOrerLimitException {
		List<String> menue= Arrays.asList("rice","dal","allu","veg","Egg","chicken");
		Resturent resturent1=new Resturent("Dhaba",menue);
		Customer customer1=new Customer("Turjo","turjo","turjo");
		Customer customer2=new Customer("Kanchan","turjo","turjo");
		FoodOrder order1=new FoodOrder();
		FoodOrder order2=new FoodOrder();
		if(customer1.getIsLogin()) {
			order1.addOrder(resturent1,customer1,"rice");
			order1.addOrder(resturent1,customer1,"dal");
			order1.addOrder(resturent1,customer1,"allu");
			order1.addOrder(resturent1,customer1,"veg");
			order1.addOrder(resturent1,customer1,"Egg");
			order1.addOrder(resturent1,customer1,"Egg");
			order2.addOrder(resturent1,customer2,"rice");
		}

		order1.showOrders();
		order2.showOrders();
	}
}

