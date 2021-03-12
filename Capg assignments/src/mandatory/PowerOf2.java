package mandatory;
import java.util.*;
class Check2
{
	boolean checkNumber(int n)
	{
		int rem;
		if(n == 0 || n == 1)
			return false;
		while(n != 1)
		{
			rem = n % 2;
			if(rem == 1)
				return false;
			n /= 2;
		}
		return true;
	}
}
public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Check2 check = new Check2();
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
