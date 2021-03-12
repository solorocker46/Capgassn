package mandatory;
import java.util.*;
class Calculate
{
	int calculateDifference(int n)
	{
		int sum1 = (n * (n + 1)) / 2;
		int sum2 = (n * (n + 1) * ((2 * n) + 1)) / 6;
		int difference = sum2 - sum1;
		return difference;
	}
}
public class SquaresAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Calculate calculate = new Calculate();
		int result = calculate.calculateDifference(number);
		System.out.println(result);
	}

}
