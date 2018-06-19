package collections;

import java.util.*;

public class TestDefaultMethods {

	Map<String, List<Double>> groupedValues = new HashMap<>();  

	// Java 7
	public void process( String name, Double value){
		
		List<Double> values = groupedValues.get(name);
		
		if ( values == null){
			
			values = new ArrayList<Double>();
			groupedValues.put( name, values);
		}   
		
		values.add( value); 
	}

	// Java 8
	public void process2( String name, Double value) {
		groupedValues.computeIfAbsent(name, x -> new ArrayList<>()).add(value); 
	}

	public void simpleCompute( String name, Double value) {
		groupedValues.compute( name, ( a, b) -> {b.add(value); return b;}); // try to return null. The whole mapping is removed from the list.
	}
	

	public static void main(String[] args) {

		TestDefaultMethods t = new TestDefaultMethods();
		t.process("A", 1d);
		t.process("B", 1d);
		t.process("C", 1d);
		t.process("A", 2d);
		
		System.out.println(t.groupedValues);

		t.process2("A", 3d);
		
		System.out.println("same thing again");
		System.out.println(t.groupedValues);
		
		
		t.simpleCompute("B", 4d);
		System.out.println("testing compute()");
		System.out.println(t.groupedValues);
		
		
	}

}
