package March8;
interface Bank2
{
	void rateOfInterest();
	int workingDays = 27;
}
interface Loan2 extends Bank2
{
	void creditLimit();
}
class SBI2 implements Loan2
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
public class InterfaceInterfaceExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan2 loan = new SBI2();
		loan.rateOfInterest();
		loan.creditLimit();
	}

}
