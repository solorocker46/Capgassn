package march15;
class Account
{
	int balance = 5000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Withdraw has started");
		if(balance < amount)
		{
			System.out.println("There's no sufficient funds");
			try {
				System.out.println("Waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdraw completed");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Deposit started");
		balance += amount;
		notify();
		System.out.println("Deposit completed");
	}
}
public class InterthreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		Thread withdraw = new Thread()
		{
			public void run()
			{
				acc.withdraw(7000);
			}
		};
		withdraw.setName("Withdraw");
		withdraw.start();
		Thread deposit = new Thread()
		{
			public void run()
			{
				acc.deposit(10000);
			}
		};
		deposit.setName("Deposit");
		deposit.start();
	}

}
