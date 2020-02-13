package lambdas;

import java.util.List;
import java.util.function.Predicate;

import beans.BeanFactory;
import beans.Category;
import beans.Product;


class ProductPredicate implements Predicate<Product> {
	public boolean test(Product product) {
		return product.getCategory() == Category.B;
	}
}

class ProductPredicate2 {
	public static boolean testProduct (Product product) {
		return product.getCategory() == Category.B;
	}
}

public class PredicateTester {
	

	public static void main(String[] args) {

		
		List<Product> lst = BeanFactory.getProducts();
		
		System.out.println(lst);
		
		// filter category B products
		lst.stream().filter(new ProductPredicate()).forEach(System.out::println);
		
		// filter category B products (method 2)
		lst.stream().filter(ProductPredicate2::testProduct).forEach(System.out::println);

		// filter category B products (method 3)
		lst.stream().filter(x -> ProductPredicate2.testProduct(x)).forEach(System.out::println);

		// filter category B products (method 4)
		lst.stream().filter(x -> new ProductPredicate().test(x)).forEach(System.out::println);
		
		
	}

}
