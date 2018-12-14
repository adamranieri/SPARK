package collectionsfun;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExIterator {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		Person adam = new Person("Adam",19,120);
		Person darryl = new Person("Darryl",29,150);
		Person mark = new Person("Mark",15,90);
		Person john = new Person("John",41,170);
		
		// A list can have multiple of the same object
		// The order is still preserved
		people.add(john);
		people.add(mark);
		people.add(adam);
		people.add(darryl);
		people.add(adam);
		


		// You cannot have duplicates and the order is not preserved
		Set<Person> peeps = new TreeSet<Person>();
		
//		peeps.add(mark);
//		peeps.add(mark);
//		peeps.add(darryl);
//		peeps.add(john);
		peeps.addAll(people);
		
		System.out.println(peeps);
		
		
//		System.out.println(people);
		
		// You do not have the [] like an array 
		// you use the get method
		Person adam2 =people.get(2);
		
//		System.out.println(people.indexOf(adam));		
		Iterator<Person> iter = people.iterator();
		
		//This is like a for loop where you check the length
		//Here we check to see if there is another element before
		//executing the code again
		
//		while(iter.hasNext()) {
//			
//			Person p = iter.next();
//			p.sayHello();
//			
//		}

		// enhanced for loop
		for(Person p : people) {
			p.sayHello();
		}
		
		
	}

}
