package march17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy MMM dd");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy MMM dd, E W M w");
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		LocalDate today = LocalDate.now();
		System.out.println("Date = "+today);
		String date1 = today.format(dtf);
		System.out.println(date1);
		String date2 = today.format(dtf1);
		System.out.println(date2);
		String date3 = today.format(dtf2);
		System.out.println(date3);
		String date4 = today.format(dtf3);
		System.out.println(date4);
		String date5 = today.format(f1);
		System.out.println(date5);
		String date6 = today.format(f2);
		System.out.println(date6);
		String date7 = today.format(f3);
		System.out.println(date7);
		String date8 = today.format(f4);
		System.out.println(date8);
	}

}
