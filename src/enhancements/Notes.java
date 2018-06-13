package enhancements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Notes {

	public static void main(String[] args) {

        //////////////////////// forEach /////////////////////////////////
        List<Integer> values = Arrays.asList(1,2,3);
        System.out.println("values: " + values);

        // The expression x -> x = x + 1; doesn't actually change the elements in the list.
        // You can think of x as a temporary local variable and changing the value of this x does not affect the actual element in the list.
        
        // Also, do not confuse forEach() on a List with the forEach() on a Stream.
        values.forEach(x -> x = x + 1);
        System.out.println("values: " + values);

		
        //
        // stream example
        //
        Stream<Integer> stream_values = values.stream();
        stream_values.map(x -> "stream value: " + x.toString()).forEach(System.out::println);

	
        //
        // another stream example
        // note that Stream<Double> can't be used because it doesn't have the sum() method
        // this is why mayToDouble is needed
        Stream<Integer> stream_values2 = values.stream();
        stream_values2.mapToDouble(x -> x.doubleValue()).sum();
	
	
	}

}
