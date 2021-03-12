package optional;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int count = 0;
		for(int i=2;i<=number;i++)
		{
			for(int j=2;j<=(i/2);j++)
			{
				if(i % j == 0)
				{
					count = 1;
					break;
				}
			}
			if(count == 0)
			{
				System.out.print(i+" ");
			}
			else
				count = 0;
		}
	}

}
