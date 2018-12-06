package inheritpoly;

// child class
public class Lion extends Animal {
	
	// the eat method was inherited without me having to define it 
	// in this class
	
	public void roar() {
		System.out.println("RoaAar!!!");
	}
	
	// this method has the same signature as the parent method
	// Therefore this method has been OVERRIDDEN in the sub class
	public void eat() {		
		System.out.println("The Lion is eating a big zebra");
	}

}
