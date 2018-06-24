package streams;

import java.util.List;
import java.util.stream.Collectors;

import beans.Product;
import beans.ProductList;

public class CollectorsJoiningDemo {

	public static void main(String[] args) {

		List<Product> list = ProductList.getProductList();
		
		System.out.println("List products starting with B: ");
        list.stream().filter( x -> x.getName().indexOf( "B") == 0).forEach( System.out::println);;
        
        System.out.println("List products starting with B and using joining(): ");
        
        String s = list.stream().filter( x -> x.getName().indexOf( "B") == 0)
        	.map(x -> x.getName())
        	.collect(Collectors.joining("; "));
        
        System.out.println(s);
        
        
	}

}