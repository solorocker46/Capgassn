package mandatory;
import java.util.*;
public class NaturalNumbers {

	static int calculateSum(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result = calculateSum(num);
		System.out.println(result);
	}

}
