package March8.exceptions;
import java.util.*;
public class ExceptionDemoUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int res = 0;
		try
		{
			System.out.println("Input a value");
			int a = scanner.nextInt();
			System.out.println("Input b value");
			int b = scanner.nextInt();
			res = a / b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero "+e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers");
		}
		finally
		{
			System.out.println("Exit statements");
		}
		System.out.println("Result = "+res);
	}

}
