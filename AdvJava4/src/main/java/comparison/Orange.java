package comparison;

public class Orange implements Fruit{
	
	int mass;
	
	public void makeOrangeJuice() {
		System.out.println("The orange is turned into juice");
	}

	@Override
	public int hashCode() {
		int result = 1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orange other = (Orange) obj;
		if (mass != other.mass)
			return false;
		return true;
	}
	
	
	

}
