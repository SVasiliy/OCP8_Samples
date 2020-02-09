package optionals;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class OptionalTest {

    private static Double getPrice(String id) {

        if (id.equals("1"))
            return 10.0;
        else if (id.equals("2"))
            return 20.0;
        else
            return null;

    }

    @Test
    public void run() {

        Optional<Double> price = Optional.ofNullable( getPrice("10"));

        assertEquals( Optional.empty(), price);

        assertThrows( NoSuchElementException.class, () -> price.get());

        assertEquals(20.0, price.orElse( getPrice("2")), 0.0);

        // public T orElseGet(Supplier<? extends T> supplier)
        // https://stackoverflow.com/a/33170142/7426774 - why it may be useful
        assertEquals(20.0, price.orElseGet( () -> 20.0), 0.0);

        assertThrows(
                RuntimeException.class,
                () -> price.orElseThrow( () -> new RuntimeException("Bad code!"))
        );
    }
}
