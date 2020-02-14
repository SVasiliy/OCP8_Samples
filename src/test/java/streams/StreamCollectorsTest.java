package streams;

import beans.BeanFactory;
import beans.Product;
import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class StreamCollectorsTest {

    @Test
    public void run(){

        List<Product> list = BeanFactory.getProducts();

        List<Product> filteredList = list.stream()
                                            .filter(x -> x.getName().indexOf("B") == 0)
                                            .collect(Collectors.toList());

        String products = list.stream()
                .filter(x -> x.getName().indexOf("B") == 0)
                .map(Product::getName)
                .collect(Collectors.joining(","));

        assertEquals("B1,B2", products);
    }
}
