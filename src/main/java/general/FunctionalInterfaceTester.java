package general;
import java.util.Arrays;
import java.util.List;

interface FunctionalInterface {

	default int getSomeInt (List<String> things) {
		System.out.println("print from getSomeInt()");
		return things.size() * 100;
	}

	int getInt(List<String> things);
}

class FunctionalInterfaceImpl implements FunctionalInterface {
	
	public int getInt(List<String> things) {
		System.out.println("print from getInt() implementation");
		return things.size() * 200;
	}

	static int getSomeStaticInt (List<String> things) {
		System.out.println("print from getSomeStaticInt()");
		return things.size() * 100;
	}
	
}

public class FunctionalInterfaceTester {

	public static int getSize(List<String> names) {
		System.out.println("print from getSize() static method");
		return names.size() * 2;
	}

	public static void process (List<String> list, FunctionalInterface c) {
		c.getInt(list);
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");
		FunctionalInterfaceImpl impl = new FunctionalInterfaceImpl();
		
		// test what can be passed
		process(list, FunctionalInterfaceTester::getSize);
		process(list, impl);
		process(list, impl::getSomeInt);
		process(list, impl::getInt);
		process(list, FunctionalInterfaceImpl::getSomeStaticInt);
		
	
	}
}