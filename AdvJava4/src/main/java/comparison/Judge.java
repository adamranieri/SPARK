package comparison;

public class Judge {

	public static void main(String[] args) {
		
		Object orange = new Orange();
		
		
//		System.out.println(orange instanceof Fruit);
//		System.out.println(orange instanceof Orange);
//		
//		// We can cast an object to be another object but 
//		// we run the risk of making a mistake
//		Orange orange2 = (Orange) orange;
//		
//		//the exact same object
//		System.out.println(orange);
//		System.out.println(orange2);
		
//		orange2.makeOrangeJuice();
		
		Apple a = new Apple();
		a.mass = 130;
		
		Orange o = new Orange();
		o.mass =130;
		
		System.out.println(a.hashCode());	
		
		// returns true because we overrode the equals method
		System.out.println(a.equals(o));
		
		
		
	}

}
