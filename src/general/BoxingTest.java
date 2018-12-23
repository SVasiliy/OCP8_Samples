package general;

public class BoxingTest {

	public static void main(String[] args) {

		int i = 0;
		double d = 10.0;
		
		d = i; // ok
		// i = d; - won't compile
		
		// unboxing Integer to double
		d = new Integer(10);
        		
		
		// autoboxing int to Double - won't compile
		Double myDouble = d;
		//myDouble = i; - won't compile 
		
	}

}
