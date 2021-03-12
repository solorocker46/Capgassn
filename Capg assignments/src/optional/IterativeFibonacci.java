package optional;
import java.util.Scanner;

public class IterativeFibonacci {

	static int fibonacci(int nValue)
	{
		int fib1 = 1, fib2 = 1, fibn = 0;
		if(nValue == 1 || nValue == 2)
			return 1;
		else
		{
			for(int i=3;i<=nValue;i++)
			{
				fibn = fib1 + fib2;
				fib1 = fib2;
				fib2 = fibn;
				//System.out.print(fibn+" ");
			}
			return fibn;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n value");
		int nValue = scanner.nextInt();
		int result = fibonacci(nValue);
		System.out.println("nth fibonacci value = "+result);
	}

}
