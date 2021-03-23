package march16;

import java.time.LocalDate;

public class DateCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate bookingDate = LocalDate.of(2021, 3, 20);
		boolean t = bookingDate.isAfter(today);
		if(t)
		{
			System.out.println("Correct booking date");
		}
		else
		{
			System.out.println("Wrong booking date");
		}
	}

}
