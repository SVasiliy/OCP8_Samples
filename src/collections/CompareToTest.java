package collections;

import java.util.Arrays;
import java.util.List;

public class CompareToTest {

	public static void main(String[] args) {

		List<String> al = Arrays.asList("aa", "aaa", "b", "cc", "ccc", "ddd", "a");

		long count = al.stream().filter(str -> str.compareTo("c") < 0).count();
		
		System.out.println(count);	
	}

}
