package ExceptionHandling;
import java.util.*;
class AgeException extends RuntimeException
{
	public AgeException(String msg)
	{
		super(msg);
	}
}
class ValidateAge
{
	void validate(int age)
	{
		if(age > 15)
		{
			System.out.println("You are eligible");
		}
		else
		{
			throw new AgeException("You are not eligible");
		}
	}
}
public class assn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		ValidateAge validateage = new ValidateAge();
		validateage.validate(age);
	}

}
