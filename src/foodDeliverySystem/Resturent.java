package foodDeliverySystem;
import java.util.*;

public class Resturent {
	private List<String> menue;
	private String name;
	
	public Resturent(String name, List<String> food) {
		this.name=name;
		this.menue=food;
	}

	public List<String> getFood() {
		return menue;
	}

	public void setFood(List<String> food) {
		this.menue = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean isFoodAvailable(String food) {
		if(menue.contains(food)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
