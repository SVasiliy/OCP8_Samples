package streams;

import java.util.*;

public class StreamAggregateDemo {


	public static void main(String[] args) {

		List<Double> list = Arrays.asList( 1.0, 2.0, 3.0, 4.0, 5.0);

		double sum = list.stream().mapToDouble( x -> x).sum();
		double sum2 = list.stream().reduce(0.0, ( a, b) -> a + b);
		
		System.out.println("sum: " + sum + ", sum2: " + sum2);
		
		
		// test non-final variable compilation error
		/* uncomment to test
		double sum3 = 0;
		list.stream().forEach( x -> { sum3 = sum3 + x;});
		System.out.println("sum3: " + sum3);
		*/

		
	}

}
