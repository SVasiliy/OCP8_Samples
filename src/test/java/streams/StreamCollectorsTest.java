package streams;

import beans.BeanFactory;
import beans.Category;
import beans.Product;
import org.junit.Test;

import java.util.*;
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
                .collect(Collectors.groupingBy(Product::getCategory));

        TreeMap<Category, List<Product>> sortedMapA = new TreeMap<>(collectionA);
        assertEquals("{A=[A1], B=[B1, B2], C=[C1, C2, C3]}", sortedMapA.toString());

        Map<Category, List<Double>> collectionB = list.stream()
                .sorted(Comparator.comparing(Product::getCategory))
                .collect(Collectors.groupingBy(Product::getCategory
                                                    , Collectors.mapping(Product::getPrice, Collectors.toList())
                                                ));

        TreeMap<Category, List<Double>> sortedMapB = new TreeMap<>(collectionB);
        assertEquals("{A=[100.0], B=[90.0, 80.0], C=[70.0, 60.0, 50.0]}", sortedMapB.toString());
    }

    @Test
    public void runGroupByWithCount() {

        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred");
        Map<Integer, Long> data = names.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        assertEquals("{2=1, 3=1, 4=3}", data.toString());
    }

}
