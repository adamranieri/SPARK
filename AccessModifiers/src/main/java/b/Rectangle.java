package b;

//whenever you pull in a class from another package
//Shape class from package a
import a.Shape;

public class Rectangle extends Shape{

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		// protected variables can still be seen from inside the subclass
		int x = r.pro_number;
		int y = r.pub_number;
		
		

	}

}
