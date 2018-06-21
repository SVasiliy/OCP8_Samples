package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupByDemo2 {

	public static void main( String args[]) {
	
		List<String> names = Arrays.asList( "greg", "dave", "don", "ed", "fred");
		Map<Integer, Long> data = names.stream().collect( Collectors.groupingBy ( String::length, Collectors.counting()) );
		System.out.println(data.values());
		
	}
	
}
