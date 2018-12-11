package stringfun;

public class StringFun {

	public static void main(String[] args) {
		
		//To make a string you did not have to use the new keyword
		String s1 = "Hello";
		String s2 = "Hello";
		//These two string are exactly the same
		
		//This always compares the memory address for objects
		// These strings have the same address
		System.out.println(s1==s2);
		//This property of two string of value having the same address
		// is called the String pool
		
		// Java can recognize when you make strings of exactly the same value
		// That they can share the same memory address 
		// It saves memory
		
		// We can force Java to make new memory for out Strings with the new keyword
		String s3 = new String("World");
		String s4 = new String("World");
		
		System.out.println(s3 == s4);
		
		//The .equals method will check the value not the memory address
		System.out.println(s3.equals(s4));
		
		//Strings are immutable objects.
		//They cannot be changed once created
		System.out.println(s1);
		System.out.println(s1.concat(" Everyone"));
		System.out.println(s1);
		
		//StringBuilder is a mutable version of string
		StringBuilder sb = new StringBuilder("Timothy");
		System.out.println(sb.reverse());
		System.out.println(sb.append(" James"));
		System.out.println(sb);

		// We use StrinBuilder when we anticipate changing the string often
		// We use String to save memory in the application
		
		 s1 = s1+ " Florida ";
		 

		
		
	}
}
