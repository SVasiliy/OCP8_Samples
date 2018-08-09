package collections;

import java.util.HashMap;
import java.util.Map;

public class MapMergeTest {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("A", "a");
		map.put("", "b");
		map.put(null, null);
		map.put("X", "null");
		map.put("Y", "");
		map.put("Z", null);

		map.forEach((a, b) -> System.out.println(a + "=" + b));
		System.out.println("map size: " + map.size() );
		
		System.out.println();
		System.out.println("value of \"\" is " + map.get(""));
		
		
		map.merge("A", "sdfg", (a, b) -> null);
		map.merge("Y", "sdfg", (a, b) -> "test");
		map.forEach((a, b) -> System.out.println(a + "=" + b));
		
		System.out.println();
		System.out.println();
		
	}

}



