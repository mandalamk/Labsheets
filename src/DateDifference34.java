import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateDifference34 {

	public DateDifference34() {
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int yr1 = s.nextInt();
		int month1 = s.nextInt();
		int day1 = s.nextInt();
		int yr2 = s.nextInt();
		int month2 = s.nextInt();
		int day2 = s.nextInt();
		int add_month = s.nextInt();
		int add_year = s.nextInt();
		
		
		/*
 	Another way to take date as input.
 		Instant current = Instant.now();
		String dateStr="";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate myDate = LocalDate.parse(dateStr, format);
	*/
		
		LocalDate d1 = LocalDate.of(yr1,month1,day1);
		LocalDate d2 = LocalDate.of(yr2, month2, day2);
		
		Period diff = Period.between(d2, d1);
		Period to_add = Period.of(add_year,add_month,0);
		
		
		d1 = d1.plus(to_add);
		System.out.println(diff.getYears()+" "+diff.getMonths()+" "+diff.getDays());
		System.out.println(d1.getYear()+" "+d1.getMonth()+" "+d1.getDayOfMonth());
		s.close();
	}

}
