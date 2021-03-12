package day4;

abstract class Calculate
{
	int a = 10;
	void display()
	{
		System.out.println("This is normal method");
	}
	abstract int doOperation(int a, int b);
	abstract void message();
}
abstract class Add extends Calculate
{
	int doOperation(int a, int b)
	{
		return a + b;
	}
}
class nextClass extends Add
{
	void message()
	{
		System.out.println("Message implemented");
	}
}
class Subtraction extends Calculate
{
	int doOperation(int a, int b)
	{
		return a - b;
	}
	void message()
	{
		System.out.println("Message implemented");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c = new nextClass();
		int result = c.doOperation(2, 3);
		c.message();
		System.out.println(result);
	}

}
