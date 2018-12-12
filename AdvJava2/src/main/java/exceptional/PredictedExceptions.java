package exceptional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PredictedExceptions {

	public static void main(String[] args) {
		
		File stuff = new File("Sea:\\Unicorns\\Spaghetios\\Documents\\JavaReview.Docx");
		System.out.println(stuff.exists());
		
		// in a checked exception Java forces me to handle situations in which 
		// The unhappy path occurs
		try {
			FileReader reader = new FileReader(stuff);
		} catch (FileNotFoundException e) {
			System.err.println("Hello");
		}
		
		try {
			readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	// If you use this method be careful. This exception might occur and it is your
	// Responsibility to handle it becuase thise method does not have a try catch
	// throws = ducks
	public static void readFile() throws FileNotFoundException {
		
		File stuff = new File("Sea:\\Unicorns\\Spaghetios\\Documents\\JavaReview.Docx");
		System.out.println(stuff.exists());
		
		// you do not have to handle immediately the exception
		// You can pass along that responsiblity to another piece of the code
			FileReader reader = new FileReader(stuff);

		
		
	}
	
	

}
