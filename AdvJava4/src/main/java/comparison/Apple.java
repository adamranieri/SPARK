package comparison;

public class Apple implements Fruit {

	int mass;
	String company;



	// hashing is usually a pretty good way to determine if an object's values are unique
	// We are not comparing memory addresses
	// Objects with same hash number but are not the values  hash collision
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + mass;
		return result;
	}



	@Override
	public boolean equals(Object obj) {

		Orange o = (Orange) obj;
		if(o.mass == this.mass) {
			return true;
		}
		
		return false;
	}
	
	
	
}
