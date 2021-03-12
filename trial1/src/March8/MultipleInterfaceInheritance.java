package March8;
interface Bank1
{
	void rateOfInterest();
	int workingDays = 27;
}
interface Loan
{
	void creditLimit();
}
class SBI1 implements Bank1, Loan
{
	@Override
	public void rateOfInterest()
	{
		System.out.println("4%");
		System.out.println("Number of working days = "+workingDays);
	}
	public void creditLimit()
	{
		System.out.println("Upto 1 cr.");
	}
}

public class MultipleInterfaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI1 sbi = new SBI1();
		sbi.rateOfInterest();
		sbi.creditLimit();
	}

}
