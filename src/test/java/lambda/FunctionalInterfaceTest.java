package lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FunctionalInterfaceTest {

    interface FunctionalInterface {

        default int getDefaultValue (List<String> things) {
            return 100;
        }

        int getValue(List<String> things);
    }

    static class FunctionalInterfaceImpl implements FunctionalInterface {

        static int getSomeValue (List<String> things) {
            return 200;
        }

        public int getValue(List<String> things) {
            return things.size();
        }

    }

    public static Integer processList( List<String> list,
                                    FunctionalInterface func){
        return func.getValue(list);
    }

    public static int getSizeDoubled(List<String> list) {
        return list.size() * 2;
    }

    @Test
    public void run() {
        List<String> list = Arrays.asList("a", "b", "c");

        // static way
        processList( list, FunctionalInterfaceTest::getSizeDoubled);
        processList( list, FunctionalInterfaceImpl::getSomeValue);

        // non-static way
        assertEquals(
                processList( list, new FunctionalInterfaceImpl())
                ,3,0);

        assertEquals(
                processList(list, new FunctionalInterfaceImpl()::getValue)
                ,3,0);

        assertEquals(
                processList( list, new FunctionalInterfaceImpl()::getDefaultValue)
                ,100,0);

    }
}
