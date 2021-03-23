package march16;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current date = "+LocalDate.now());
		System.out.println("Joining date = "+LocalDate.of(2019, 4, 7));
		System.out.println("Date with time = "+LocalDateTime.now());
		System.out.println("Date with time to set = "+LocalDateTime.of(2019, 5, 6, 6, 45));
		LocalDate today = LocalDate.now();
		System.out.println("Today's date = "+today);
		System.out.println("Day of the month = "+today.getDayOfMonth());
		System.out.println("Day of the year = "+today.getDayOfYear());
		System.out.println("Day of the week = "+today.getDayOfWeek());
		System.out.println("Month = "+today.getMonth());
		System.out.println("Month value = "+today.getMonthValue());
	}

}
