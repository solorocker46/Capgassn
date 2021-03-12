package optional;
import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the choice of light");
		System.out.println("1. Red\t2. Yellow\t3. Green");
		int choice = scanner.nextInt();
		if(choice == 1)
		{
			System.out.println("Stop!");
		}
		else if(choice == 2)
		{
			System.out.println("Ready!");
		}
		else if(choice == 3)
		{
			System.out.println("Go!");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
