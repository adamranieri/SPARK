package pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	// 1 for small 2 for medium 3 for large
	int size;
	List<Topping> toppings = new ArrayList<Topping>();
	
	
	double cost;
	
	public Pizza(int size, List<Topping> toppings) {
		
		this.size = size;
		this.toppings = toppings;	
		this.cost = toppingsCost() + sizeCost();
			
	} 
	
	private double toppingsCost() {
		
		double sum = 0;
		for(Topping t :toppings) {
			sum = sum + t.price;			
		}		
		return sum;
	}
	
	private double sizeCost() {
		
		if(size == 1) {
			return 12;
		}
		if(size == 2) {
			return 16;
		}
		else {
			return 20;
		}
		
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", toppings=" + toppings + ", cost=" + cost + "]";
	}
	
	
	

}
