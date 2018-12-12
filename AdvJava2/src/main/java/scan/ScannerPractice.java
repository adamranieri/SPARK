package scan;

import java.util.Scanner;

public class ScannerPractice {
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello what is your name?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Hello, " + name);

		
	}

}
