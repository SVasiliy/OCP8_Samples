package streams;

import org.junit.Test;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamToOptionalDouble {

    @Test
    public void run(){

        Stream<Double> s = Stream.of( 1d, 2d, 3d);
        OptionalDouble d = s.mapToDouble(x -> x).average();

        assert( d.orElse(0.0) == 2.0);

    }
}
