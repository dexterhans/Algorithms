import java.util.HashSet;



 class Bike{
	int fuelCapacity;
	int speed;
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String toString()// used when we print a object of this class
	{
		return "fuel capacity is "+ fuelCapacity+" and speed is "+ speed;
	}
	public boolean equals(Object o1) //compares if two object are equal
	{
		if(this==o1)
			return true;
		if(o1==null)
			return false;
		if(this.getClass()!=o1.getClass())
			return false;
		Bike other=(Bike)o1;
		if(this.fuelCapacity!=other.fuelCapacity)
			return false;
		if(this.speed!=other.speed)
			return false;
		return true;
	}
	public int hashCode(){  // it's used in collections which used hashing like hashset and hashmap, and whenever you use 
		final int prime=31; // override equals it's a safe option to override hashCode
		int result=1;
		result=result*prime+fuelCapacity;
		result=result*prime+speed;
		return result;
	}
}
public class EqualsAndHashSet{
public static void main(String[] args)
{
	Bike b1=new Bike();
	b1.setFuelCapacity(100);
	b1.setSpeed(200);
	Bike b2=new Bike();
	b2.setFuelCapacity(200);
	b2.setSpeed(200);
	System.out.println(b1.equals(b2));
	HashSet<Bike> bikes=new HashSet<Bike>();
	bikes.add(b1);
	bikes.add(b2);
	System.out.println(bikes.size());
	System.out.println(b1);
	System.out.println(b2);
}
}

