package streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ArrayToStreamTest {

    @Test
    public void run(){

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                      11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        assertEquals( 210,    Arrays.stream(arr).sum() );
        assertEquals( 10.5,   Arrays.stream(arr).average().getAsDouble(), 0.0);

        int[] arr2 = { };

        assertThrows( NoSuchElementException.class, () ->

                Arrays.stream(arr2).average().getAsDouble()
        );

        assertEquals( 0,   Arrays.stream(arr2).average().orElse(0d), 0d);
    }


    @Test
    public void runFlat(){

        Integer[][] arr = { {1, 2, 3}, {1, 2, 3}, {5, 6, 7}, {8, 9, 10, 1, 2} };

        Stream<Integer[]> stream = Arrays.stream(arr);

        assertEquals( 60, stream.flatMap(x -> Arrays.stream(x)).mapToInt( Integer::intValue).sum() );

        assertEquals( 4.5,

                Arrays.stream(arr).flatMap(Arrays::stream)
                                  .mapToInt( Integer::intValue)
                                  .average()
                                  .orElse(0.0)
                , 0.5);
    }



}
