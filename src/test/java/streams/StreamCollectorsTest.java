package streams;

import beans.BeanFactory;
import beans.Category;
import beans.Product;
import org.junit.Test;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

    @Test
    public void runGroupBy(){

        List<Product> list = BeanFactory.getProducts();

        Map<Category, List<Product>> collectionA = list.stream()
                .sorted(Comparator.comparing(Product::getCategory))
                .collect(Collectors.groupingBy(x -> x.getCategory()));

        assertEquals("{C=[C1, C2, C3], B=[B1, B2], A=[A1]}", collectionA.toString());

        Map<Category, List<Double>> collectionB = list.stream()
                .sorted(Comparator.comparing(Product::getCategory))
                .collect(Collectors.groupingBy(Product::getCategory
                                                    , Collectors.mapping(Product::getPrice, Collectors.toList())
                                                ));

        assertEquals("{C=[70.0, 60.0, 50.0], B=[90.0, 80.0], A=[100.0]}", collectionB.toString());
    }



}
