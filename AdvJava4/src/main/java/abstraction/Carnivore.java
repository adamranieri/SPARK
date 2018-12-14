package abstraction;

public interface Carnivore {
	
	public void eatMeat();

	// default allows me to put a concrete method in my interface
	// It can still be overridden
	public default void chaseAnimal() {
		System.out.println("Chase down an animal");
	}
}
