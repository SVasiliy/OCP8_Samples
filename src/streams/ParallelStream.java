package streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {

		List<String> vals = Arrays.asList("a", "b");
		String join = vals.parallelStream().reduce("_", (a, b) -> a.concat(b));
		
		// will return either _a_b or _ab, here is why:
		// 1) reduce maintains the order
		// 2) parallelStream() does not guarantee parallel execution - for instance, on a single core machine

		System.out.println(join);

	}

}
