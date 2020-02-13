package streams;

import beans.BeanFactory;
import beans.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlatMapTest {

    @Test
    public void run(){

        List<Product> listOne = BeanFactory.getProducts();
        List<Product> listTwo = BeanFactory.getProducts();

        List<List<Product>> list = new ArrayList<>();
        list.add(listOne);
        list.add(listTwo);

        long i = list.stream().flatMap(Collection::stream).count();
        assertEquals(12d, i, 0d);
    }
}
