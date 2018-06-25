package enhancements;

// 1) Default methods can be overriden in implementing class, while static cannot.
// 2) Static method belongs only to Interface class, so you can only invoke static method on Interface class, 
//    not on class implementing this Interface.
// 3) Both class and interface can have static methods with same names, and neither overrides the other.


/* Example from Collections framework which explains the purpose of default methods.
 * forEach was added and nothing was broken in the existing code
 
    public interface Iterable<T> {
       default void forEach(Consumer<? super T> action);
    }
*/


interface MyInterface {
	public void regularMethod();
	
	public default void defaultMethod() {            // doesn't have to be implemented
		System.out.println("test default method");
	};
}

class MyInterfaceClass implements MyInterface {
	public void regularMethod() {
		System.out.println("test regular method");
	}
}

interface MyInterfaceWithDefault {
	public void regularMethod();
}

public class DefaultMethodsTopic {

	public static void main(String[] args) {
		
		System.out.println("test default methods");
		
		MyInterface test = new MyInterfaceClass();
		test.regularMethod();
		test.defaultMethod();
		
	}

}
