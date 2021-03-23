package march17;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate startDate = LocalDate.of(2021, 03, 01);
		Period p = Period.between(startDate, today);
		System.out.println(p.getYears()+" year "+p.getMonths()+" month "+p.getDays()+" days");
	}

}
