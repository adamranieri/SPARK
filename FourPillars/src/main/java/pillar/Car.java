package pillar;

public class Car {
	
	// fields
	String name;
	int mpg;
	int hp;
	
	// odometer
	double miles;
	private double tank;
	boolean ismoving;
	
	// constructor builds an instance of the class aka an object
	
	public Car(String nameParam, int mpgParam, int hpParam) {
		
		this.name = nameParam;
		this.mpg = mpgParam;
		this.hp = hpParam;
		
	}
	
	// default constructor 
	public Car() {
		
	}
	
	public void drive() {	

		// 
		setTank(getTank()-5);
		
		if(getTank()>0) {
			this.ismoving = true;
			System.out.println(this.name + " is driving");	
		}else {
			this.ismoving = false;
			System.out.println("Out of gas");
		}
					
	}
	
	public void drive(double distance) {
		this.miles = this.miles +distance;
		double gasused = this.miles/this.mpg;
		this.tank = this.tank -gasused;
		setTank(this.tank);
		
	}

	
	public void stop() {
		this.ismoving = false;
		System.out.println("The car is stopped");
	}
	
	public void setTank(double num) {		
		
		if(num<0) {
			this.tank = 0;
		}else {
			this.tank = num;
		}
		
	}
	
	public double getTank() {
		return this.tank;
	}
	
	
	

}
