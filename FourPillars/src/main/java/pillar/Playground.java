package pillar;

public class Playground {
	
	public static void main(String[] args) {
		
		Car steves = new Car("Steve's Car",30,150);
		Car jims = new Car("Jim's Car",20, 110);
		
		Car empty = new Car();
		
		System.out.println(empty.hp);
		
		jims.setTank(100);

//     how would I prevent?		


		for(int i =0;i <100; i++) {
			jims.drive();
		}
	
		System.out.println("Is the car moving ?" + jims.ismoving );
		
		
		
		
	}

}
