package day2;
import java.util.*;
public class elseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int chooseNext = 1;
		int choice;
		while(chooseNext == 1)
		{
			System.out.println("1. Withdraw\t 2. Deposit\t 3. Checking Balance");
			System.out.println("Input choice: ");
			choice = scanner.nextInt();
			if(choice == 1)
			{
				System.out.println("You are withdrawing");
			}
			else if(choice == 2)
			{
				System.out.println("You are depositing");
			}
			else if(choice == 3)
			{
				System.out.println("You are checking balance");
			}
			else
			{
				System.out.println("Invalid");
			}
			System.out.println("Press 1 to continue-----");
			chooseNext = scanner.nextInt();
		}
		System.out.println("End-----");
	}

}
