package beans;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

	public static List<Product> getProductList() {
		
		List<Product> list = new ArrayList<>();

		list.add( new Product( 1, Category.A, "A1", 100));
		list.add( new Product( 2, Category.B, "B1", 90));
		list.add( new Product( 3, Category.B, "B2", 80));
		list.add( new Product( 4, Category.C, "C1", 70));
		list.add( new Product( 5, Category.C, "C2", 60));
		list.add( new Product( 6, Category.C, "C3", 50));
		
		return list;
	}

}
