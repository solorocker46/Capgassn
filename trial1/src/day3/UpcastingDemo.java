package day3;
class Bank
{
	void rateOfInterest()
	{
		System.out.println("Not yet assigned");
	}
}
class Sbi extends Bank
{
	void rateOfInterest()
	{
		System.out.println("4%");
	}
}
class Axis extends Bank
{
	void rateOfInterest()
	{
		System.out.println("6%");
	}
}
public class UpcastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbi = new Sbi();
		sbi.rateOfInterest();
		Bank axis = new Axis();
		axis.rateOfInterest();
	}

}
