package march15;
interface Test
{
	void display();
	
}
class myDemo
{
	void method1()
	{
		System.out.println("This is method1");
	}
}
class mydemo2
{
	static void method()
	{
		System.out.println("This is static method");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = () -> System.out.println("Hello");
		myDemo d = new myDemo();
		Test t2 = d::method1;
		t.display();
		t2.display();
		Test t3 = mydemo2::method;
		t3.display();
	}

}
