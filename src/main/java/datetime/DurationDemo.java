package datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DurationDemo {

	public static void main(String[] args) {

		LocalDateTime ldt1 = LocalDateTime.of(2018, Month.JUNE, 28, 10, 0);
		LocalDateTime ldt2 = LocalDateTime.of(2018, Month.JUNE, 28, 8, 0);
		
		Duration d = Duration.between(ldt1, ldt2); 
		
		System.out.println(d); // PT-2H
		
	}

}
