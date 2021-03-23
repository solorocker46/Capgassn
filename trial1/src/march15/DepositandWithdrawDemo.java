package march15;
class Bank
{
	synchronized void doTransaction(int time)
	{
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ");
		}
	}
}
class Transaction extends Thread
{
	Bank b = new Bank();
	public void run()
	{
		b.doTransaction(4);
	}
}
public class DepositandWithdrawDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction t = new Transaction();
		Thread withdraw = new Thread(t);
		Thread deposit = new Thread(t);
		withdraw.setName("Withdraw");
		deposit.setName("Deposit");
		withdraw.start();
		deposit.start();
	}

}
