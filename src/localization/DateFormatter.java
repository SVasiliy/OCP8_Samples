package localization;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateFormatter {

	public static void main(String[] args) {

		// Java 7
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance( DateFormat.LONG);
        
        String s = df.format(d);          
        System.out.println(s);
        

        // Java 8
        LocalDate l = LocalDate.now();
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDate( FormatStyle.LONG);
        s = df2.format(l);
        System.out.println(s);

        
        //  DateFormat can't be used to format LocalDate, even though it compiles with no issues
        //  this below will throw IllegalArgumentException
        s = df.format(l);
        System.out.println(s);
        
        
	}

}
