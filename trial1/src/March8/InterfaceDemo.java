package March8;

interface Bank
{
	void rateOfInterest();
	int workingDays = 27;
}
class SBI implements Bank
{
	@Override
	public void rateOfInterest()
	{
		System.out.println("4%");
		System.out.println("Number of working days = "+workingDays);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new SBI();
		bank.rateOfInterest();
	}

}
