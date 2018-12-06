package scope;

public class Box {
	
	// 'this' variable is attached to one an only one object 
	// instance scope because it belongs to one object aka one instance
	int value =0;
	
	// The static value belongs to the class and therefore to every object of this class
	// static (class) scope because it is shared by every object or in other words is belongs
	// the class
	static int static_value = 100;
	
	
	public void printValue() {
		System.out.println("The value of the box is " + this.value);
	}
	
	public static void printStaticValue() {
		System.out.println("The static value of the box is"+ Box.static_value);
	}
	

}
