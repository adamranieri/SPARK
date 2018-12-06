package inheritpoly;

// parent class
public class Animal {
	
	// the eat method is OVERLOADED in this class
	// The same method name but different parameters
	
	public void eat() {
		
		System.out.println("The animal is eating");
	}
	
	public void eat(String food) {		
		System.out.println("The animal is eating " + food);
	}
	

}
