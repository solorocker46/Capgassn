package day3;
import java.util.*;
public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of passengers");
		int size = scanner.nextInt();
		int passengerAge[] = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter age for passenger: "+(i+1));
			passengerAge[i] = scanner.nextInt();
		}
		int countChild = 0, countAdult = 0, countSeniorCitizen = 0;
		for(int i=0;i<size;i++)
		{
			if(passengerAge[i] < 18)
			{
				countChild++;
			}
			else if(passengerAge[i] >= 18 && passengerAge[i] < 55)
			{
				countAdult++;
			}
			else
			{
				countSeniorCitizen++;
			}
		}
		System.out.println("Number of children = "+countChild);
		System.out.println("Number of adult = "+countAdult);
		System.out.println("Number of senior citizens = "+countSeniorCitizen);
	}

}
