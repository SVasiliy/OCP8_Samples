package collections;

import java.util.ArrayList;
import java.util.List;

class Shape {}
class ShapeExtender extends Shape {}

public class GenericsBoundariesTests {

	public List<Shape> m3(ArrayList<? extends Shape> strList){
		List<? extends Shape> list = new ArrayList<ShapeExtender>();
	//	list.addAll(strList); // doesn't compile, because unbounded and upper-bounded generics
		                      // are immutable
		
	//	return list;  // doesn't compile, because List<String> cannot be assigned to List<Object>! 
		return new ArrayList<Shape>(); //just to keep the method uncommented
	}
    	
	
	public static void main(String[] args) {
		
		// does nothing...

	}

}
