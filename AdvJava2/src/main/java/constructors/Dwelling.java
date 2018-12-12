package constructors;

public class Dwelling {

	// instance variables - fields
	int area;
	String name;
	
	// This is the no args constructor
	public Dwelling() {
		// the this keyword will use a constructor of the same class
		this(100,"Something place");
		System.out.println("I made my own default values and passed them ");
		
	
	}

	// you can overload to your heart's content
	public Dwelling(int area, String name) {
		System.out.println("Building a dwelling with instructions");
		
		if(area <0) {
			area = 50;
		}
		this.area = area;
		this.name = name;
	}
	
	public Dwelling(boolean b) {
		
		if(b == true) {
			this.area = 200;
			this.name = "Another place";
		}else {
			System.out.println("Building  a dwelling with no instructions");
		}
		
	}
	
	
	
}
