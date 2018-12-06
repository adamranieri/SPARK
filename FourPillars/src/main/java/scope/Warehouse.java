package scope;

public class Warehouse {
	
	public static void main(String [] args) {
		
		// Static is known as the class scope!!!
		// not having the static makes the variable instance scoped
		
		Box a = new Box();
		a.value = 1000;
		
		Box b = new Box();
		b.value = 2000;
		
		a.printValue();
		b.printValue();
		
		// always shared because it is the static value
		a.static_value = 20;
		Box.static_value = 40000;
		
		// These two lines are the same as
		a.printStaticValue();
		b.printStaticValue();
		
		//This one
		Box.printStaticValue();
		
	}
	
	public static void hello() {
		
		//It is initialized  in a method  therefore it is method scope
		//It cannot leave this method
		String name = "Michelle";
		
		// Java also has block scope
		// There is no special keyword like js and let
		
		if(true) {	
			// local can only be used between these two brackets
			int blocko = 10;
		}
		
//		blocko=20; // cannot use this variable
		
		
	}
	
	

}
