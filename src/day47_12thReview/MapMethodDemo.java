package day47_12thReview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDemo {

	public static void main(String[] args) {
		// .put()
		// .get()
		
		Map<Integer, String>map = new HashMap<>();
		map.put(101, "Luke");
		map.put(102, "Jane");
		map.put(103, "Tom");
		System.out.println(map);
		
		System.out.println("\n=======================\n");
		// what happen when you put existing key?
		map.put(101, "Mona");
		System.out.println(map);
		
		System.out.println("\n=======================\n");
		// get key that not exist in the map. will return null
		System.out.println(map.get(105)); // null
		String unknow = map.getOrDefault(103, "Unkonwn");
		
		System.out.println(unknow);
		
		System.out.println("\n=======================\n");
		// containsKey()
		System.out.println(map.containsValue(108));
		
		System.out.println("\n=======================\n");
		// replace()
		String value = map.replace(103, "Superman"); // return old value before update
		System.out.println(map);
		System.out.println(value); // Tom
		
		
		System.out.println("\n=======================\n");
		// Map cannot iterated
		// but we have some method to help us do that
		// .keySet() -> return set of the keys
		
		Set<Integer>keys = map.keySet(); // return Set of keys
		
		for(Integer key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("\n=======================\n");
		Collection<String>values = map.values(); // return collection of values
		System.out.println(values);
		
		System.out.println("\n=======================\n");
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
