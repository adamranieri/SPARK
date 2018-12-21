package singleton;

// There should only ever be one car
// The Singleton design pattern is to ensure there is ever only one object of a class
public class Car {
	
	String name;
	int tank;
	
	// The class has a car c=object that is null
	// static means it belongs to the class not
	// This is just adding an object to a class
	public static Car car = null;
	
	// A private constructor for the object
	private Car(String name, int tank) {		
		this.name = name;
		this.tank = tank;
	}
	
	// Guarantees that a car will be returned
	// either an existing car or a new one
	// Fancy getter
	public static Car getCar(String name, int tank) {
		
		if(Car.car == null) {
			 Car.car = new Car(name,tank);
		}
		
		return car;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", tank=" + tank + "]";
	}
	
	

}
