package optional;
import java.util.*;
public class RecursiveFibonacci {

	static int fibonacci(int nValue)
	{
		if(nValue == 1 || nValue == 2)
			return 1;
		else
			return (fibonacci(nValue-1) + fibonacci(nValue-2));
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
