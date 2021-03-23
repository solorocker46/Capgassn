package march17;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		System.out.println("Enter date of birth");
		String dob = scanner.nextLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate birthDate = LocalDate.parse(dob, dtf);
		Period p = Period.between(birthDate, today);
		System.out.println("Number of years = "+p.getYears());
	}

}
