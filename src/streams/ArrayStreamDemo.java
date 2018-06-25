package streams;

import java.util.Arrays;

public class ArrayStreamDemo {

	public static void main(String args[]) {
	
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
	            11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		///////////////////////// old way /////////////////////////////////
		int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // System.out.println("sum: " + sum);
        }
        System.out.println("Average using iteration :" + (sum / arr.length));
		
        
        ///////////////////////// new way /////////////////////////////////
        sum = Arrays.stream(arr) // Step 1
                  .sum(); // Step 2
        System.out.println("Average using streams : " +
                                   (sum / arr.length));
        
        ///////////////////////// another way /////////////////////////////
        sum = (int)Arrays.stream(arr).average().getAsDouble(); 
        System.out.println("Average using streams : " + sum);
        
        
        
	}
}

