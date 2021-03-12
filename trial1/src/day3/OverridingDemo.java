package day3;
class Parent2
{
	void breakfast()
	{
		System.out.println("Idly");
	}
	void vehicle()
	{
		System.out.println("Mercedes Benz");
	}
}
class Child2 extends Parent2
{
	void breakfast()
	{
		super.breakfast();
		System.out.println("Maggi");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 child2 = new Child2();
		child2.breakfast();
		child2.vehicle();
	}

}
