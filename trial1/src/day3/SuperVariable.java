package day3;
class A1
{
	int a = 10;
}
class B1 extends A1
{
	int a = 20;
	void display()
	{
		int res1 = a + a;
		int res2 = a + super.a;
		int res3 = super.a + super.a;
		System.out.println("Result1 = "+res1+" Result2 = "+res2+" Result3 = "+res3);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1 = new B1();
		b1.display();
	}

}
