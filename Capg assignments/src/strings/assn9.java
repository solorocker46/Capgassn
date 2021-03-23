package strings;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class assn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date in yyyy-mm-dd format");
		String date = scanner.next();
		LocalDate userDate = LocalDate.parse(date);
		Period period = Period.between(userDate, LocalDate.now());
		System.out.println("Days = "+period.getDays()+" Months = "+period.getMonths()+" Years = "+period.getYears());
	}

}
