package collections;

import java.util.*;

public class GenericsTests {

	public static void main(String[] args) {

		
		// List<> list = new ArrayList<>(); // first diamond cannot be empty
		ArrayList<String> alist = new ArrayList<>();
		
		List<String> alist2 = new ArrayList<>(10); // just indicates the INITIAL size of the list.. it is still empty
		
		///////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////

		String[] names = {"Alex", "Bob", "Charlie"};
	//	List<?> listNames = new ArrayList<?>(Arrays.asList(names)); // instantiation with a ? is not possible

		///////////////////////////////////////////////////////////////////
		
		System.out.println("The end.");
		
	}

}
