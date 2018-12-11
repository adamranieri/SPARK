package garbage;

public class Library {
	
	public static void main(String[] args) {
		
		// Literally the most generic thing a thing can be
		Object o = new Object();
		// b returns the overridden toString method
		Object b = new Book("Farenheit 451", 200);
		Object b2 = new Book("Heart Of Darkness", 130);
		Object b3 = new Book("Frankenstein", 300);
		
		System.out.println(b2);
			
		
	}

}
