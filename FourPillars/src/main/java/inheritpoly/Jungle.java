package inheritpoly;

public class Jungle {
	
	
	public static void main(String[] args) {
		
		// Made an animal and called it an animal
		Animal a = new Animal();		
		a.eat();
		
		// Made a lion and called it a lion
		Lion l = new Lion();
		l.eat();
//		l.roar();
		
		// Made a Lion and called it an animal
		Animal l2 = new Lion();
		l2.eat();
//		l2.roar();
		
		// Does not work
//		Lion a2 = new Animal();
		Animal m = new Mouse();
		m.eat("Cheese");		
		// the object's method is what is always used regardless of what it labeled		
	}

}
