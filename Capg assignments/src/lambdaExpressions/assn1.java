package lambdaExpressions;
import java.util.*;
@FunctionalInterface
interface Lambda1
{
	int power(int x, int y);
}
public class assn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		Lambda1 lambda = (a, b)->
		{
			return (int)Math.pow(a, b);
		};
		int res = lambda.power(x, y);
		System.out.println(res);
	}

}
