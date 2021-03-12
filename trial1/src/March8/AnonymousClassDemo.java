package March8;
class Bank3
{
	void rateOfInterest()
	{
		System.out.println("4%");
	}
}
public class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank3 bank = new Bank3()
		{
			void rateOfInterest()
			{
				System.out.println("7%");
			}
		};
		bank.rateOfInterest();
	}

}
