package stringfun;

import garbage.Book;

public class MemAddress {

	public static void main(String[] args) {
		
		Book b1 = new Book("Frankenstetin", 100);// These books are in seperate memory locations
		Book b2 = new Book("Frankenstetin", 100);// The new keyword means its a *new* object
		// an object that never existed before. It allocates *new memory* and another location

		int x = 10;
		int y = 10;
		
		// == with primitives checks the value of variable
		System.out.println(x==y);
		
		// == with objects compares not value but the location (memory address) of the object
		System.out.println(b1==b2);

	}

}
