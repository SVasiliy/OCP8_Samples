package collections;

import java.util.Optional;

public class OptionalTest {
	
	public static Double getPrice(String id) {
		
		if (id == "1")
			return 10.0;
		else if (id == "2")
			return 20.0;
		else 
			return null;
		
	}

	public static void main(String[] args) {

		// Optional.empty
		Optional<Double> price = Optional.ofNullable(getPrice("10"));

		Double x = price.orElse(getPrice("2"));
		Double y = price.orElseGet(() -> 20.0);

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		Double z = price.orElseThrow(() -> new RuntimeException("Bad code!"));
	}

}