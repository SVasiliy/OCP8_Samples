package datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DayLightSavingDemo {

	public static void main(String[] args) {

	// 2 AM becomes 1 AM
	LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
	ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
	LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
	ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
	System.out.println(ld1);
	System.out.println(ld2);
	System.out.println(zd1);
	System.out.println(zd2);

	long x = ChronoUnit.HOURS.between(zd1, zd2);
	System.out.println(x);                                 // -2

	// 2 AM becomes 3 AM
	LocalDateTime lod1 = LocalDateTime.of(2015, Month.MARCH, 8, 3, 0);    
	ZonedDateTime zod1 = ZonedDateTime.of(lod1, ZoneId.of("US/Eastern"));
	LocalDateTime lod2 = LocalDateTime.of(2015, Month.MARCH, 8, 2, 0);    
	ZonedDateTime zod2 = ZonedDateTime.of(lod1, ZoneId.of("US/Eastern"));  	
	System.out.println(lod1);
	System.out.println(lod2);
	System.out.println(zod1);
	System.out.println(zod2);
	
	long z = ChronoUnit.HOURS.between(zod1, zod2);
	System.out.println(z);                                 // 0
	
	}

}
