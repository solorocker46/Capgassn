package mandatory;
import java.util.*;
class CheckNum
{
	boolean checkNumber(int number)
	{
		int rem, next = Integer.MAX_VALUE;
		while(number != 0)
		{
			rem = number % 10;
			if(rem > next)
			{
				return false;
			}
			next = rem;
			number = number / 10;
		}
		return true;
	}
}
public class IncreasingNumber {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		CheckNum check = new CheckNum();
		boolean result = check.checkNumber(number);
		if(result == true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}
