package lambdas;

import java.util.*;
import java.util.function.Predicate;

public class PredicateExp {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(2, 4, 6, 9); 

		Predicate<Integer> check = (Integer i) -> {
		    System.out.println("Checking");
		    return i == 4; 
		};
		
		Predicate even = i -> (Integer) i % 2 == 0;  
		
		System.out.println( values.stream().filter(check).filter(even).count());
		
	}

}
