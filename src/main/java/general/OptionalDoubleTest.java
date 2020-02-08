package general;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class OptionalDoubleTest {

	public static void main ( String args[]) {
	
		Stream<Double> s = Stream.of( 1d, 2d, 3d);
		
		OptionalDouble d = s.mapToDouble( x -> x).average();
		
		System.out.println( "result: " + d.orElse(0.0));
	
	}
	
}
