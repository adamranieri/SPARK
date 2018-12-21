package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

	List<Pizza> pizzas = new ArrayList<Pizza>();
	
	
	public Pizza makePizza() {
		
	
		List<Topping> toppings = new ArrayList<Topping>();
		
		System.out.println("You have chosen to make a new pizza");
		System.out.println("What do you want on your pizza");

		
		while(true) {
			
		System.out.println("1 for Pepperoni, 2 for Meatball, 3 for anchovies");
		int choice = BowserPizza.scan.nextInt();
		BowserPizza.scan.nextLine();
			
		
		switch(choice) {
		
		case 1: toppings.add(new Topping("Pepperoni", 2.00));break;
		case 2: toppings.add(new Topping("Meatball", 1.00));break;
		case 3: toppings.add(new Topping("Anchovies", 2.50));break;
		
		}
		
		System.out.println("Are you finished press 0 to complete order");
		try {
			choice = BowserPizza.scan.nextInt();
		}catch(Exception e) {
			System.out.println("You did not put in valid input");
			System.out.println("shame on you!!");
			
		}
		
		BowserPizza.scan.nextLine();
		
		if(choice == 0) {
			int size = sizeChoice();
			Pizza p = new Pizza(size,toppings);
			pizzas.add(p);
			return p;
		}
		
		
	}
	
	}
	
	
	public int sizeChoice() {		
		System.out.println("What size pizza do you want?");
		System.out.println("1 for small, 2 for medium, 3 for large");
		
		int choice = BowserPizza.scan.nextInt();
		BowserPizza.scan.nextLine();

		
		return choice;
	}
	
}
