package garbage;

public class Clean {
	
	public static void main(String[] args) {
		
		// Garbage collection
		// Once an object is no longer reachable or referenced in the code
		// It is marked as eligible for garbage collection aka deletion
		// objects have a finalize method that is called when an item is garbage collected
	
		Book w = new Book("Wuthering Height",270);
		//w rather than pointing to a book now points to nothing
	
		//w = null;
		destroy(w);
		
		// System.gc() 'requests' that all objects marked for collection be collected
		System.gc();
		
	}
	
	// In Java you cannot destroy objects
	public static void destroy(Book b) {
		 b= null;
	}
	

}
