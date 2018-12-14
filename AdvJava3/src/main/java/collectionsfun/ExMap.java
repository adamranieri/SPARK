package collectionsfun;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExMap {

	public static void main(String[] args) {
		
		Person adam = new Person("Adam",19,120);
		Person darryl = new Person("Darryl",29,150);
		Person mark = new Person("Mark",15,90);
		Person john = new Person("John",41,170);
		
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
		
		String tarek = "Tarek";
		String mcdonald = "Mcdonalds";
		Integer t_num = 555666;
		Integer m_num = 111222;
		// Maps store objects as key value pairs
		// You cannot iterate over a map
		phoneBook.put(tarek, t_num);
		phoneBook.put(mcdonald, m_num);
		
		
		// the tree makes it ordered
		Map<Person,String> description = new TreeMap<Person,String>(); 
		
		description.put(john, "John is a cool guy");
		description.put(mark, "Mark is a cooler guy");
		description.put(darryl, "The coolest cat in the club");
		
		
		
		
		System.out.println(description);
		
		//These are not at all related to map
		
		// Queue which does not allow you to remove middle elements
		// You must add elements in a FIFO fashion
		// This really just a line
		
		// Stack removes the last element added
		// LIFO Last in first out
		
		
		
		
		
	}

}
