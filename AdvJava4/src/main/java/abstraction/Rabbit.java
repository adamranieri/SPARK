package abstraction;

//any time you make an object all of its methods must be defined
public class Rabbit extends Animal implements Herbivore,Petable{

	@Override
	public void makeSound() {
		System.out.println("Rabbits are pretty quiet");
		
	}

	public void eatPlants() {
		System.out.println("A rabbit eats carrots");		
	}

}
