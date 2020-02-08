package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalWithParallelStream {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Peter", "Paul", null, null, "Pascal");
		System.out.println(names); 

		Optional<String> ops = names.stream()
				.parallel()
				.filter(name -> name != null && name.length() > 6)
				.findAny()
				;

		// Optional.empty
		System.out.println(ops); 
		
		Optional<String> ops2 = names.stream()
				.parallel()
				.filter(name -> name != null && name.length() > 5)
				.findAny()
				;

		// Optional[Pascal]
		System.out.println(ops2); 
		
	}

};