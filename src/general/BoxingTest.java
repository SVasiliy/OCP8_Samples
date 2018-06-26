package general;

public class BoxingTest {

	public static void main(String[] args) {

		double d = new Integer(10);          // possible
		
		int i = 10;
		double d2 = i;                       // possible
		
		Double d3 = d2;

		//	Double d4 = i;                   // not possible
		//	Double d5 = new Integer(10);     // not possible
		double d6 = new Integer(10);         // possible!!!
	}

}
