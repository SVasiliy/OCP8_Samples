package lambdas;

import java.util.Arrays;
import java.util.List;

public class ArithmeticTest {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
		System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a>b?a:b)); 
		System.out.println(ls.stream().max(Integer::max).get()); 
		System.out.println(ls.stream().max(Integer::compare).get()); 
		System.out.println(ls.stream().max((a, b)->a>b?a:b)); 

		
		System.out.println("USING Integer.max()");
        System.out.println(ls.stream().max((o1, o2) -> {System.out.print(o1 + "..");
                                                        System.out.print(o2 + "~");
                                                        int max = Integer.max(o1, o2);
                                                        System.out.print(max);
                                                        System.out.print("\t");
                                                        return max;})
                                      .get());
        
        System.out.println("USING Integer.compare()");
        System.out.println(ls.stream().max((o1, o2) -> {System.out.print(o1 + "..");
                                                        System.out.print(o2 + "~");
                                                        int max = Integer.compare(o1, o2);
                                                        System.out.print(max);
                                                        System.out.print("\t");
                                                        return max;})
                                      .get());		
		
	}

}
