package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
		
		
		/////////////////////////////////////////////////////////////////
		// flatMap() example
		
		List<String> l1 = Arrays.asList("a","b");
		List<String> l2 = Arrays.asList("1","2");
		
		Stream.of(l1, l2).flatMap(x -> x.stream()).forEach(System.out::print);
		System.out.println();
		Stream.of(l1, l2).flatMap(x -> Stream.of(x)).forEach(System.out::print); // note the difference!

		
		/////////////////////////////////////////////////////////////////
		// toMap() with binary operator merge function example
		// mergeFunction - used to resolve collisions between values associated with the same key
		Stream<String> s = Stream.of("lion","tiger","bear","monkey");
		Map<Integer, Object> map = s.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "; " + s2));
		System.out.println();
		System.out.println(map);
		
		
	}

}
