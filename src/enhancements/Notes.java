package enhancements;

import java.util.Arrays;
import java.util.List;

public class Notes {

	public static void main(String[] args) {

        //////////////////////// forEach /////////////////////////////////
        List<Integer> values = Arrays.asList(1,2,3);
        System.out.println("values: " + values);

        // The expression x -> x = x + 1; doesn't actually change the elements in the list.
        // You can think of x as a temporary local variable and changing the value of this x does not affect the actual element in the list.
        
        // Also, do not confuse forEach() on a List with the forEach() on a Stream.
        values.forEach(x -> x = x + 1);
        System.out.println("values: " + values);

		
	}

}
