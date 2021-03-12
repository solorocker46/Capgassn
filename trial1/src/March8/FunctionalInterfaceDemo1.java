package March8;

@FunctionalInterface
interface Test
{
	void display();
	static void display1()
	{
		System.out.println("Heya!");
	}
	default void display2()
	{
		System.out.println("Wassup??");
	}
}
@FunctionalInterface
interface Test2
{
	
	void anotherDisplay(int m);
}
@FunctionalInterface
interface Test3
{
	
	int add(int a, int b);
}
public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = ()->
		{
			System.out.println("Welcome!");
			System.out.println("Good morning");
		};
		t1.display();
		Test.display1();
		t1.display2();
		
		Test2 t2 = (m)->
		{
			System.out.println("Value of m = "+m);
		};
		t2.anotherDisplay(20);
		Test3 t3 = (a, b)-> a + b;
		int res = t3.add(20, 30);
		System.out.println(res);
	}

}
