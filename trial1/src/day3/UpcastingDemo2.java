package day3;
class Account
{
	void minBalance()
	{
		System.out.println("No minimum balance set");
	}
}
class SavingsAccount extends Account
{
	void minBalance()
	{
		System.out.println("Minimum balance = 10000");
	}
	void people()
	{
		System.out.println("Number of people = 1");
	}
}
class CurrentAccount extends Account
{
	void minBalance()
	{
		System.out.println("Minimum balance = 25000");
	}
	void people()
	{
		System.out.println("Number of people = 2");
	}
}
public class UpcastingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new SavingsAccount();
		account.minBalance();
		Account account1 = new CurrentAccount();
		account1.minBalance();
		CurrentAccount currentacc = new CurrentAccount();
		currentacc.people();
	}

}
