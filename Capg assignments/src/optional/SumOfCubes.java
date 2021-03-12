package optional;
import java.util.*;
public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number");
		int number = scanner.nextInt();
		int sum = 0, rem;
		while(number != 0)
		{
			rem = number % 10;
			sum += Math.pow(rem, 3);
			number = number / 10;
		}
		System.out.println("Sum of cubes of digits = "+sum);
	}

}
