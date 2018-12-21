package lambdas;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		String name = "bob";
		
        // method 1
		Supplier<String> supplier = () -> name.toUpperCase();
		System.out.println(supplier.get());
		
		// method 2
		Supplier<String> supplier2 = name::toUpperCase;
		System.out.println(supplier2.get());
	}

}
