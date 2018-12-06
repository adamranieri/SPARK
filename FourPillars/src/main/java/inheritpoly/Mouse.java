package inheritpoly;

public class Mouse extends Animal{
	
	// When you override you keep the method exactly the same except for the implementaion
	// The method signature is exactly the same
	public void eat(String food) {	
		System.out.println("The mouse is eating " + food);
	}

	
}
