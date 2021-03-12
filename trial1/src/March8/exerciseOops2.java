package March8;

class SavingsAccount
{
	private int balance;
	private int interest;
	SavingsAccount(int balance, int interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	public void withdraw(int amount)
	{
		balance -= amount;
	}
	public void deposit(int amount)
	{
		balance += amount;
	}
	public int returnInterest()
	{
		balance = balance + ((balance*interest)/100);
		return balance;
	}
}
public class exerciseOops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount acc = new SavingsAccount(1000, 10);
		System.out.println("Balance = "+acc.returnInterest());
		acc.deposit(1000);
		System.out.println("Balance = "+acc.returnInterest());
		acc.withdraw(2000);
		System.out.println("Balance = "+acc.returnInterest());
	}

}
