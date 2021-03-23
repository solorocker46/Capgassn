package march15;
@FunctionalInterface
interface Demo
{
	void add(int a, int b);
	default void display()
	{
		System.out.println("Hiee");
	}
}
@FunctionalInterface
interface Demo2 
{
	int mul(int a, int b);
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = (a,b)->{System.out.println(a+b);};
		//System.out.println(d.add(2, 3));
		d.add(2, 4);
		Demo2 d2 = (a, b) -> 
		{ 
			int res = a * b;
			return res;
		};
		System.out.println(d2.mul(2, 3));
	}

}
