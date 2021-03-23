package march15;
class MyTask1 extends Thread
{
	public void run()
	{
		System.out.println("This is my task");
	}
}
public class MultitaskingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTask1 t1 = new MyTask1();
		t1.start();
	}

}
