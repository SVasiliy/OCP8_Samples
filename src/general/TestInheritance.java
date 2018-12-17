package general;

class A {
	
	int i;
	int x;
	
	public A() {
		this.i = 10;
	}
	
	public A(int x) {
		this.x = 20;
	}
	
	final class IA {   // can be public, default, abstract, private and final
		void printIt() {
			System.out.println("x: " + x);
		}
	}
}

class B extends A {
	
	public B() {
		super(5);
	}
	
	void print() {
		System.out.println("i: " + i);
		System.out.println("x: " + x);
	}
	
};


public class TestInheritance {
	
	public static void main (String args[]) {
		
		B b = new B();
		b.print();
		
		b.new IA().printIt();
	}
	
}
