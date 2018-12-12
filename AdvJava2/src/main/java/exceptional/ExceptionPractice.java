package exceptional;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		// Runtime exception Java cannot warn me that this will be a problem
		try {
		// This line throws an ArithmeticException
		 badMath();
		
		// This line also throws an ArithmeticException
//		throw new ArithmeticException();
			empty();
		
		}
		// only one catch block ever executes
		// The most specific exceptions should go first
		catch(ArithmeticException ae) {
			System.out.println("You tried to divide by 0 !!!!");		
		}catch(NullPointerException ne) {
			System.out.println("The object is null");
		}catch(Exception e) {
			System.out.println("Something went wrong");			
		}
		// regardless of anything that happens in the try 
		// the finally block will always execute
		finally {
			System.out.println("This finally block will always execute");
		}
		
	}
	
	// This will throw an exception
	// You can only catch a thrown exception once
	public static void badMath() {	
		
//		try {
//		// This threw an exception
		int x = 5/0;
//		}	
//		catch(ArithmeticException ae) {
//			//It was caught in this block
//			System.out.println("You cannot divide by 0");
//		}
	}
	
	public static void empty() {
		String s = null;
		//trying to perform an instance method on an object that does not exist
		//null pointer exception
		System.out.println(s.length());
		
		
	}
	
	
	

}
