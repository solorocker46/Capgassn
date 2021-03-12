package march12;

class A extends Thread
{
	public void run()
	{
		System.out.println("This is my task -- creating thread by extending");
	}
}
class B implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Creating thread by implementing");
	}
	
}
public class CreateThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.start();
		B b = new B();
		Thread t = new Thread(b);
		t.start();
	}

}
