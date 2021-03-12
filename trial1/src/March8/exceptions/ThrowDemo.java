package March8.exceptions;

public class ThrowDemo {
	void checkEligibility(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("You can't vote");
		}
		else
		{
			System.out.println("You can vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		ThrowDemo td = new ThrowDemo();
		td.checkEligibility(19);
		//throw new ArithmeticException("I have thrown an exception");
	}

}
