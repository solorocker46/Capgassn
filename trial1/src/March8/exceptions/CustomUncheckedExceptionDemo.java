package March8.exceptions;
class LateException1 extends RuntimeException
{
	public LateException1(String msg)
	{
		super(msg);
	}
}
class Employee1
{
	public void login(int time)
	{
		if(time <= 9)
		{
			System.out.println("You are present");
		}
		else
		{
			throw new LateException1("You are absent");
		}
	}
}
public class CustomUncheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1();
		emp.login(9);
	}

}
