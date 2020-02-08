package optionals;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalFlatMapTest {

    @Test
    public void runOptionalFlatMapTest() {

        assertEquals(
            Optional.of(Optional.of("STRING")),
            Optional.of("string").map(s -> Optional.of("STRING")));

        assertEquals(
                Optional.of("STRING"),
                Optional.of("string").flatMap(s -> Optional.of("STRING")));


    }
}
