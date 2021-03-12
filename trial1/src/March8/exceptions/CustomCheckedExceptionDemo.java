package March8.exceptions;

class LateException extends Exception
{
	public LateException(String msg)
	{
		super(msg);
	}
}
class Employee
{
	public void login(int time) throws LateException
	{
		if(time <= 9)
		{
			System.out.println("You are present");
		}
		else
		{
			throw new LateException("You are absent");
		}
	}
}
public class CustomCheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		try
		{
			emp.login(12);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
