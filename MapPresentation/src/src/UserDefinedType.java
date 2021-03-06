package src;
import java.util.*;
class Car
{
	private int id;
	private String company;
	private String color;
	public Car(int id, String company, String color) {
		super();
		this.id = id;
		this.company = company;
		this.color = color;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + id;
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
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", color=" + color + "]";
	}
}
public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Car, Double> map = new HashMap<>();
		map.put(new Car(1, "Mercedes Benz", "Black"), 6278000.00);
		map.put(new Car(2, "Audi", "Red"), 3500000.00);
		map.put(new Car(3, "Renault Duster", "Orange"), 849000.00);
		map.put(new Car(3, "Renault Duster", "Orange"), 900000.00);
		System.out.println(map);
		System.out.println("=========================To access keys using keySet()==================================");
		for(Car key : map.keySet())
		{
			System.out.println(key);
		}
		System.out.println("=========================To get values using values()==================================");
		for(Double value : map.values())
		{
			System.out.println(value);
		}
		System.out.println("=========================Using entrySet()==================================");
		for(Map.Entry<Car, Double> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("To print details of the car which is black colored");
		for(Car key : map.keySet())
		{
			if(key.getColor().equalsIgnoreCase("black"))
			{
				System.out.println("Car name = "+key.getCompany()+" and car color = "+key.getColor());
			}
		}
		for(Map.Entry<Car, Double> entry : map.entrySet())
		{
			if(entry.getKey().getCompany().equalsIgnoreCase("Renault Duster"))
			{
				entry.setValue(entry.getValue() * 1.1);
				System.out.println("New price of renault duster = "+entry.getValue());
			}
		}
	}

}
