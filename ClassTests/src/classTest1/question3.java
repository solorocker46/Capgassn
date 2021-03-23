package classTest1;
import java.util.*;
class MinimumCharacterException extends RuntimeException
{
	public MinimumCharacterException(String msg)
	{
		super(msg);
	}
}
class Employee
{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	void validation()
	{
		if((firstName.isEmpty() && lastName.isEmpty()) || (firstName.isEmpty()) || (lastName.isEmpty()))
		{
			throw new NullPointerException("Entry missing");
		}
		else if(firstName.length() < 3 || lastName.length() < 3)
		{
			throw new MinimumCharacterException("Name should have minimum 3 characters");
		}
		else
		{
			System.out.println("First name = "+firstName+" and Last name = "+lastName);
		}
	}
}
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Employee emp = new Employee(scanner.nextLine(), scanner.nextLine());
		emp.validation();
	}

}
