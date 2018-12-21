package singleton;

public class Playground {

	public static void main(String[] args) {
		
		//Making the constructor private means I cannot make a new car
//		Car c = new Car("Ben's car", 20);
//		Car d = new Car("Richard's car", 20);
//		Car e = new Car("Steves's car", 20);
//		

		// I am not directly the constructor
		// I am calling a method that calls the constructor
		Car aaron = Car.getCar("Aaron's Car", 100);
		

		// this does not actually make a car because the method does not allow it
		Car jim = Car.getCar("jim's Car", 50);
		
		
		System.out.println(aaron);
		System.out.println(jim);
	}

}
