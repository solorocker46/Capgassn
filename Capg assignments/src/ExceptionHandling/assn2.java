package ExceptionHandling;
import java.util.*;
class NameException extends RuntimeException
{
	public NameException(String msg)
	{
		super(msg);
	}
}
class ValidateName
{
	void validate(String fname, String lname)
	{
		if(fname.isBlank() && lname.isBlank())
		{
			throw new NameException("First name and last name cannot be blank");
		}
		else if(lname.isBlank())
		{
			throw new NameException("Last name cannot be blank");
		}
		else if(fname.isBlank())
		{
			throw new NameException("First name cannot be blank");
		}
		else
		{
			System.out.println("First name: "+fname+"\nLast name: "+lname);
		}
	}
}
public class assn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String fname = scanner.nextLine();
		String lname = scanner.nextLine();
		ValidateName validatename = new ValidateName();
		validatename.validate(fname, lname);
	}

}
