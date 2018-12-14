package abstraction;

// the abstract means I cannot build an instance of this class
// you can have only concrete methods in an abstract class
public abstract class Animal {
	
	String name;
	int age;
	boolean alive =true;
	
	// We make the method abstract so that it must be overridden in the sub class 
	public abstract void makeSound();
	
	public void isAlive() {
		if(alive==true) {
			System.out.println("I am existing");
		}	
	}
}
