package collections;

import java.util.HashMap;

public class MapIterator {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1,"One");
		hashMap.put(2,"Two");
		hashMap.put(3,"Three");
		
		// bi-consumer is used in the Map's forEach() method, not consumer
		hashMap.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));
		
	}

}
