package inheritanceAndPolymorphism;
import java.util.*;
class Person
{
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
class Account
{
	private long accNum;
	private double balance;
	private Person person;
	Account()
	{
		balance = 500;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance1() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	public double getBalance()
	{
		return balance;
	}
}
class SavingsAccount extends Account
{
	final double minimumBalance = 500;
	public void withdraw(double amount)
	{
		double balance = getBalance();
		if(balance - amount < 500)
		{
			System.out.println("Cannot withdraw");
		}
		else
		{
			balance -= amount;
			setBalance(balance);
		}
	}
}
class CurrentAccount extends Account
{
	double overDraftLimit = 1000;
	public void withdraw(double amount)
	{
		if(amount > overDraftLimit)
		{
			System.out.println("Cannot withdraw, you have reached your overdraft limit!");
		}
		else
		{
			double balance = getBalance();
			balance -= amount;
			setBalance(balance);
		}
	}
}
public class InAndPoly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith = new Person();
		smith.setName("Smith");
		Account accSmith = new SavingsAccount();
		accSmith.setBalance(2000);
		Person kathy = new Person();
		kathy.setName("Kathy");
		Account accKathy = new CurrentAccount();
		accKathy.setBalance(3000);
		accSmith.deposit(2000);
		accKathy.withdraw(2000);
		System.out.println("Smith's balance = "+accSmith.getBalance());
		System.out.println("Kathy's balance = "+accKathy.getBalance());
	}

}
