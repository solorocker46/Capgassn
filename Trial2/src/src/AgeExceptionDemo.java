package src;
class AgeException extends Exception
{
	public AgeException(String msg)
	{
		super(msg);
	}
}
class Employee1
{
	void  validateAge(int age) throws AgeException
	{
		if(age > 18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			throw new AgeException("You are not eligible to vote");
		}
	}
}
public class AgeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1();
		try
		{
			emp.validateAge(12);
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}

}
