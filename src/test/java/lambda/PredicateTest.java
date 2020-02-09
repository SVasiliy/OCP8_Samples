package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class PredicateTest {

    class SomeData {
        int value;
        SomeData(int x) {this.value = x;}
        public String toString(){
            return "" + value;
        }
    }

    class LegacyFilter {
        public boolean test(SomeData d) {
            return d.value == 2;
        }
    }

    public static void doFilter( ArrayList<SomeData> dataList,
                                 Predicate<SomeData> filter) {
        Iterator<SomeData> i = dataList.iterator();
        while(i.hasNext()) {
            if(filter.test(i.next())) {
                i.remove();
            }
        }
    }

    public static void doFilterLegacy( ArrayList<SomeData> dataList,
                                       LegacyFilter f) {
        Iterator<SomeData> i = dataList.iterator();
        while(i.hasNext()) {
            if(f.test(i.next())) {
                i.remove();
            }
        }
    }

    @Test
    public void run() {
        ArrayList<SomeData> list = new ArrayList<>();
        list.add(new SomeData(1));
        list.add(new SomeData(2));
        list.add(new SomeData(3));

        assertThat( list.size(), is(3));

        doFilter( list, x -> x.value == 3);
        assertThat( list.size(), is(2));

        doFilterLegacy( list, new LegacyFilter());
        assertThat( list.size(), is(1));
    }
}
