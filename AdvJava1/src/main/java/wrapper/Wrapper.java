package wrapper;
// naming convention to have package be lowercase and the class uppercase
public class Wrapper {

	public static void main(String[] args) {
		
		// Primitive variable it lives in the stack
		int x = 100;
		
		//Wrapper class. It is an object that holds a primitive value
		Integer y = 100;
		
		// int Integer
		//byte Byte
		//short Short
		//long Long
		//float Float
		//double Double
		//char Character
		// boolean Boolean
		
		// You just have to know in Java that whenever you compare an primitive to a wrapper
		// It compares the value. The wrapper class is unboxed
		System.out.println(x==y);
		
		// One of the most esoteric rules of Java
		// If you compare wrapper classes it look for memory address
		// unless the values of the wrapper objects are within byte range
		Integer i = 1000;
		Integer I = 1000;	
		System.out.println(i==I);
		
		// This works because we are unboxing the wrapper objects
		add(I,I);
		
		//This works because of auto-boxing turning primitives into objects
		minus(x,x);
		sort(i);
		
		//Wrappers are objects which have there own static and non static methods
		int k = Integer.parseInt("90");
	}
	
	
	public static void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	public static void minus(Integer num1,Integer num2) {
		System.out.println(num1-num2);
	}
	
	// overloaded method
	public static void sort(int num) {
		System.out.println("in the int");
	}
	
	public static void sort(Integer num) {
		System.out.println("in the Integer");
	}
	

}
