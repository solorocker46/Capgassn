package march15;
class Engagement extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class Marriage extends Thread
{
	public void run()
	{
		for(int i=10;i<15;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Engagement engagement = new Engagement();
		Marriage marriage = new Marriage();
		engagement.setName("Engagement");
		marriage.setName("Marriage");
		engagement.start();
		engagement.join();
		marriage.start();
	}

}
