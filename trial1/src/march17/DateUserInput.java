package march17;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date: ");
		String joiningDate = scanner.nextLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		LocalDate ld = LocalDate.parse(joiningDate, dtf);
		System.out.println(ld);
	}

}
