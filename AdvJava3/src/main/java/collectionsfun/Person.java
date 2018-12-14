package collectionsfun;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	int height;
	
	public Person(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
	public void sayHello() {
		System.out.println("Hello my name is "+ this.name);
	}


	public int compareTo(Person p) {
		
		if(this.age<p.age) {
			return -1;
		}	
		
		if(this.age>p.age) {
			return 1;
		}
			
		return 0;
		

	}



	
	

}
