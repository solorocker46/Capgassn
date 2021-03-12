package day4;
class Bank
{
	void rateOfInterest()
	{
		System.out.println("1%");
	}
	static void display()
	{
		System.out.println("This is in parent");
	}
}
class SBI extends Bank
{
	void rateOfInterest()
	{
		System.out.println("5%");
	}
	static void display()
	{
		System.out.println("This is in SBI child");
	}
}
class Kotak extends Bank
{
	void rateOfInterest()
	{
		System.out.println("6%");
	}
}
public class StaticOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new SBI();
		bank.rateOfInterest();
		bank.display();
	}

}
