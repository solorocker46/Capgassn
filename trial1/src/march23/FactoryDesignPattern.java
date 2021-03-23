package march23;
interface Car
{
	void capacity();
}
class hatchBack implements Car
{

	@Override
	public void capacity() {
		// TODO Auto-generated method stub
		System.out.println("4 max");
	}
	
}
class Jeep implements Car
{

	@Override
	public void capacity() {
		// TODO Auto-generated method stub
		System.out.println("4 people");
	}
	
}
class SUV implements Car
{

	@Override
	public void capacity() {
		// TODO Auto-generated method stub
		System.out.println("6 people");
	}
	
}
class CarFactory
{
	Car getCar(String type)
	{
		if(type.equalsIgnoreCase("hatchBack"))
		{
			return new hatchBack();
		}
		else if(type.equalsIgnoreCase("Jeep"))
		{
			return new Jeep();
		}
		else
		{
			return new SUV();
		}
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory cf = new CarFactory();
		cf.getCar("SUV").capacity();
	}

}
