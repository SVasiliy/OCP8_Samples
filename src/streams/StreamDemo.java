package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		// Stream with terminal Collect method
		Stream<String> stream = Stream.of("w","o","l","f");
		
		//The specification does not differentiate between sequential and parallel streams. 
		// For that reason, you should assume, that the combiner might be used. (c)stackoverflow
		StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		
		System.out.println("word: " + word);

		
		/////////////////////////////////////////////////////////////////
		// pre-defined collector example
		
		stream = Stream.of("w","o","l","f");
		List<String> word2 = stream.collect(Collectors.toList());
		System.out.println("word2: " + word2);
		
		
	}

}
