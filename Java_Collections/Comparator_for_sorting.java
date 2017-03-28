import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Car{
	int cost;
	int mileage;
	String clas;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clas == null) ? 0 : clas.hashCode());
		result = prime * result + cost;
		result = prime * result + mileage;
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
		Car other = (Car) obj;
		if (clas == null) {
			if (other.clas != null)
				return false;
		} else if (!clas.equals(other.clas))
			return false;
		if (cost != other.cost)
			return false;
		if (mileage != other.mileage)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [cost=" + cost + ", mileage=" + mileage + ", clas=" + clas
				+ "]";
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	
}
public class Comparator_for_sorting{
public static void main(String[] args)
{
	Car car=new Car();
	Car car2=new Car();
	Car car3=new Car();
	Car car4=new Car();
	car.setClas("A");
	car.setCost(23);
	car.setMileage(234);
	
	car2.setClas("B");
	car2.setCost(22);
	car2.setMileage(214);
	
	car3.setClas("B");
	car3.setCost(34);
	car3.setMileage(224);
	
	car4.setClas("A");
	car4.setCost(23);
	car4.setMileage(216);
	
	List<Car> list=new ArrayList<Car>();
	list.add(car);
	list.add(car2);
	list.add(car3);
	list.add(car4);
	Collections.sort(list,new Comparator<Car>() {
		public int compare(Car c1,Car c2)
		{
			if(c1.getClas().compareTo(c2.getClas())!=0)
				return c1.getClas().compareTo(c2.getClas());
			else
			{
				if(c1.getCost()<c2.getCost())
					return 1;
				else
				if(c1.getCost()>c2.getCost())
					return -1;
				else
				{
					if(c1.getMileage()<c2.getMileage())
						return 1;
					else
						if(c1.getMileage()>c2.getMileage())
							return -1;
						else
							return 0;
				}
					
			}
			
		}
	});
	System.out.println(list);
	for(Car c:list)
	{
		System.out.println(c.getMileage());
	}
	
}
}

