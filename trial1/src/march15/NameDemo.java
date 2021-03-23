package march15;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=10;i<15;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class NameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name of main thread = "+Thread.currentThread().getName());
		A t1 = new A();
		B t2 = new B();
		t1.setName("A thread: ");
		t2.setName("B thread: ");
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();
	}

}
