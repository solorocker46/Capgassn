package march12;
class Class1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i == 3)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Class1: "+i);
		}
	}
}
class Class2 extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println("Class2: "+i);
		}
	}
}
class Class3 extends Thread
{
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			System.out.println("Class3: "+i);
		}
	}
}
public class Multitasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		Class3 class3 = new Class3();
		Thread c = new Thread()
		{
			public void run()
			{
				for(int i=90;i<100;i++)
				{
					System.out.println("C: "+i);
				}
			}
		};
		System.out.println("===========Using run, output is normal===============");
		class1.run();
		class2.run();
		class3.run();
		c.run();
		System.out.println("===========Using start, parallel execution will happen===========");
		class1.start();
		class2.start();
		class3.start();
		c.start();
		
	}

}
