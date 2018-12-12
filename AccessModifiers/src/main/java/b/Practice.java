package b;

import a.Shape;

public class Practice {
	
	public static void main(String[] args) {
		Shape s = new Shape();
		// the public variable is available anywhere even another package
		int x = s.pub_number;
		
	 
		
		System.out.println("Practice class");
		System.out.println(s);
	}

}
