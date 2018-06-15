package streams;

import java.util.*;
import java.util.stream.Collectors;

enum E {A, B, C}

class TestObj {
	private E val;
	public TestObj(E val) {
		this.val = val;
	}
	public E getVal() {
		return val;
	}
	
	@Override
	public String toString() {
		return this.getVal().toString();
	}
}

public class StreamGroupByDemo {

	public static void main(String[] args) {
		
		List<TestObj> tList = new ArrayList<>();
		tList.add(new TestObj(E.A));
		tList.add(new TestObj(E.A));
		tList.add(new TestObj(E.B));
		tList.add(new TestObj(E.C));
		
		Map<E,List<TestObj>> m = tList.stream().collect(Collectors.groupingBy(TestObj::getVal));
		for (List<TestObj> s : m.values()) {
			System.out.println("Next list: ");
			for (TestObj o : s)
				System.out.println(o);
		}
	}

}
