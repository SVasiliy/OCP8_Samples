package general;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import static java.time.temporal.ChronoUnit.MILLIS;;

public class ListTest {

	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.now();
		
		List<String> list = new ArrayList<>(1000000);
		for (int i = 0; i < 10000000; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("MILLIS to populate: " + MILLIS.between(localTime, LocalTime.now()));
		System.out.println("List size: " + list.size());
		
		System.out.println("value at 10: " + list.get(10));
		System.out.println("value at 11: " + list.get(11));
		System.out.println("value at 12: " + list.get(12));
		
		// ArrayList.add(0, element) takes linear time, 
		// but the constant is very low, because it can use the blazing fast System.arraycopy.
		// see below
		
		localTime = LocalTime.now();
		list.add(10, "test");
		System.out.println("MILLIS to insert at index: " + MILLIS.between(localTime, LocalTime.now()));
		
		System.out.println("value at 10: " + list.get(10));
		System.out.println("value at 11: " + list.get(11));
		System.out.println("value at 12: " + list.get(12));

	}

}
