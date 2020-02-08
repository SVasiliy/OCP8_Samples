package collections;

class PlaceHolder<K, V> {
	private K k;
	private V v;
	
	public PlaceHolder(K k, V v){
		this.k = k;
		this.v = v;
	}
	
	public K getK() { return k; }
	public V getV() { return v; }

	// <X, Y, Z> is the declaration of types for the method parameter list
	public static <X, Y, Z> PlaceHolder<X, Z> getDuplicateHolder(X x, Y y, Z z){
		return new PlaceHolder<X, Z>(x, z);     
	} 
}

public class GenericsHowTo {

	public static void main(String[] args) {

		PlaceHolder<String, Integer> ph = new PlaceHolder("A", 1);
		PlaceHolder<String, Integer> ph2 = PlaceHolder.getDuplicateHolder("B","S", 2);
		
		System.out.println(ph2.getK() + " " + ph2.getV());

	}

}
