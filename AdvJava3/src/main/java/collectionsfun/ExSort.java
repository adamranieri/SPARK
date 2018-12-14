package collectionsfun;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExSort {

	
	public static void main(String[] args) {
		
		String apple = "Apple";
		String orange = "Orange";
		String grape = "Grape";
		String zucchini = "Zucchini";
		
		List<String> fruits =  new ArrayList<String>();
		
		fruits.add(zucchini);
		fruits.add(orange);
		fruits.add(apple);
		fruits.add(grape);
		
		System.out.println(fruits);
		
		// The TreeSet makes the elements in the collection ordered
		Set<String> fruitset = new TreeSet<String>(); 
		fruitset.addAll(fruits);
		
		System.out.println(fruitset);

	}

}
