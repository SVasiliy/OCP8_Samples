package enhancements;


// You cannot have a class that implements two interfaces where both the interfaces contain a default method 
// with the same signature unless the class provides an implementation for that method itself. 

// For example, in the following code, class C1 will not compile: 

interface I1 {
	public default void m1(){
		System.out.println("in I1.m1");
	} 
} 

interface I2 {
	public default void m1(){
		System.out.println("in I2.m1");
	} 
}  

// This class will not compile.
// class C1 implements I1, I2 { } 

class C2 implements I1, I2 { //This class will compile because it provides its own implementation of m1.   
	public void m1(){ 
		System.out.println("in C2.m1");
	} 
}  

// You can have a class inherit a method with the same signature from an interface and a superclass though. 
// This is allowed because the superclass's version always overrides the interface's version. 
// The class doesn't get two implementations. It gets only the version from super class.

