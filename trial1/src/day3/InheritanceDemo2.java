package day3;
class A
{
	void display1()
	{
		System.out.println("A class");
	}
}
class B extends A
{
	void display2()
	{
		System.out.println("B class");
	}
}
class C extends B
{
	void display3()
	{
		System.out.println("C class");
	}
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.display1();
		c.display2();
		c.display3();
	}

}
