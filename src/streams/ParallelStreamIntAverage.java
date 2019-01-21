package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ParallelStreamIntAverage {

	public static void main(String[] args) {

		int[] iArr = {0, 1, 2, 3, 4, 5, 8, 90, 189};
        IntStream is = Arrays.stream(iArr);		
        OptionalDouble res = is.parallel().average();
        
        // 1
        res.ifPresent(System.out::println);
        
        // 2
        System.out.println(res.getAsDouble());

        // 3
        System.out.println(res.orElse(0.0));

	}

}
