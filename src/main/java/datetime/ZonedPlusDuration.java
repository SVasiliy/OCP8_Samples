package datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedPlusDuration {

	public static void main(String[] args) {

		LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
		ZonedDateTime zd = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		
		System.out.println(zd);   // 2015-10-31T10:00-04:00[US/Eastern]
		
		zd = zd.plus(Duration.ofDays(1));
		System.out.println(zd);   // 2015-11-01T09:00-05:00[US/Eastern]
		
		System.out.println( ld.format( java.time.format.DateTimeFormatter.ISO_DATE_TIME));
	}

}
