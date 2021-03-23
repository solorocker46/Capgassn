package march15;
class Waterbottle
{
	void drink(int time)
	{
		synchronized(this)
		{
			for(int i=1;i<=time;i++)
			{
				System.out.println(Thread.currentThread().getName()+" is eating"+i);
			}
		}
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is drinking"+i);
		}
	}
}
class Drinkwater extends Thread
{
	Waterbottle w = new Waterbottle();
	public void run()
	{
		w.drink(5);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drinkwater d = new Drinkwater();
		Thread sachin = new Thread(d);
		Thread rahul = new Thread(d);
		sachin.setName("Sachin");
		rahul.setName("Rahul");
		sachin.start();
		rahul.start();
	}

}
