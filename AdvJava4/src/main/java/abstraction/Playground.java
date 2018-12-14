package abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Playground {

	public static void main(String[] args) {
		
//		Animal animal = new Animal();
		Animal lion = new Lion();
		Animal dog = new Dog();
		Rabbit rabbit = new Rabbit();
		Petable rabbit2 = rabbit;
		StuffedAnimal teddy = new StuffedAnimal();
		
		// This marker interfaces is another viable label
		Petable fluffy = new Dog();
		
		List<Petable> pets = new ArrayList<Petable>();
		pets.add(fluffy);
		pets.add(rabbit);
		pets.add(teddy);
		// I cannot add dog because its listed as an animal which is not petable
			
		// the carnivore methods cannot be seen and neither can the animal
		Herbivore herb = new Dog();
		herb.eatPlants();
		
		lion.makeSound();
		dog.makeSound();
		
	}

}
