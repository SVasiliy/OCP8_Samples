package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MyClass {
	
	public String name;
	
	public MyClass(String name) {
		this.name = name;
	}
	
	public void doPrint() {
		System.out.println( this.name);
	}
	
};

public class MethodReferenceDemo {
	
	
	public static void printName(String s) {System.out.println(s);};
	
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Bob Hope", "Bob Dole", "Bob Brown");
		list.stream().collect( Collectors.toList()).forEach(MethodReferenceDemo::printName); // static method reference
		

		List<MyClass> myList = Arrays.asList( new MyClass("Bob Hope"), new MyClass("Bob Dole"), new MyClass("Bob Brown"));
		// note here that even though the forEach() expects a method with an argument
		// in this case an argument is the MyClass object itself, where the compiler is looking for 
		// a doPrint() method which doesn't have any arguments
		myList.stream().collect( Collectors.toList()).forEach(MyClass::doPrint); // instance method reference
		
				
	}
}

