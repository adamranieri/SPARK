package pizzeria;

public class Topping {

	String name;
	double price;
	
	
	public Topping(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Topping [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
