package streams;

import java.util.*;
import java.util.stream.Collectors;

enum E {A, B, C}

class TestObj {
	
	private E group;
	private int value;
	
	public TestObj(E group, int value) {
		this.group = group;
		this.value = value;
	}
	
	public E getGroup() {
		return group;
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.getGroup().toString() + " - " + value;
	}
}

public class StreamGroupByDemo {

	public static void main( String[] args) {
		
		List<TestObj> tList = new ArrayList<>();
		
		tList.add( new TestObj( E.A, 1));
		tList.add( new TestObj( E.A, 2));
		tList.add( new TestObj( E.B, 1));
		tList.add( new TestObj( E.C, 1));
		
		Map<E, List<TestObj>> m = tList.stream()
									  	.collect( 
													Collectors.groupingBy( TestObj::getGroup)
												);
		
		// EXAMPLE 1
		System.out.println("EXAMPLE 1");

		// outer loop
		for (Map.Entry<E, List<TestObj>> s : m.entrySet()) {
			
			System.out.println("Next list (" + s.getKey() + "): ");
			
			// inner loop
			for ( TestObj o : s.getValue())
				System.out.println(o);
		}

	
		// EXAMPLE 2
		System.out.println("EXAMPLE 2");
		System.out.println(m);
		

		// EXAMPLE 3 - complex example with cascade collector
		System.out.println("EXAMPLE 3");
		Map<E, List<Integer>> m2 = tList.stream()
			  	.collect( 
							Collectors.groupingBy( TestObj::getGroup,
												   Collectors.mapping( TestObj::getValue, 
														   			   Collectors.toList()
														   			 )
												 )
						);

		
		System.out.println(m2);
		
		
		
	}

}
