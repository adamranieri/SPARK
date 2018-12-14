package abstraction;

// You can use multiple interfaces for a single class
public class Dog extends Animal implements Herbivore,Carnivore,Petable {

	@Override
	public void makeSound() {
		System.out.println("Bark Bark Woof, bow wow");
	}

	public void eatMeat() {
		System.out.println("The dog tears at it with its canines");
		
	}

	public void eatPlants() {
		System.out.println("The dog gnaws on some plants");
		
	}
}
