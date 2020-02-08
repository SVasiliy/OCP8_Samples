package general;

class Inner { int value; }

public class OuterInnerAnonymous {
	
	// here, inner is an anonymous class which extends Inner,
	// but the doA() method cannot be invoked via this reference
	public Inner inner = new Inner(){
		public void doA(){
			System.out.println("doing A");
		}
	};
	
	// this is ok
	public void doA() { inner.value = 5; } 

	// this will fail to compile
	// public void doA() { inner.doA(); } 

}

