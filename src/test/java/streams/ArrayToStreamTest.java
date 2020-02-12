package streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
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
}
