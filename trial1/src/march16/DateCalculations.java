package march16;

import java.time.LocalDate;

public class DateCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println("Today's date = "+today);
		System.out.println("Tomorrow = "+today.plusDays(1));
		System.out.println("Day after Tomorrow = "+today.plusDays(2));
		System.out.println("Next week = "+today.plusWeeks(1));
		System.out.println("Next year = "+today.plusYears(1));
		
		System.out.println("==========Minus===========");
		System.out.println("Yesterday = "+today.minusDays(1));
		System.out.println("Last week = "+today.minusWeeks(1));
		System.out.println("Last year = "+today.minusYears(1));
	}

}
