package day47_12thReview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// only contain unique element, no duplicate element
		// order not guarantee
		
//		HashSet<String>set = new HashSet<>(); // can also do this
		
		Set<String> set = new HashSet<>();
		
		Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
		Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
		
		// Union Operation - .addAll();
		
		set1.addAll(set2);
		System.out.println(set1);
		
		for(String e : set1) {
			System.out.println(e);
		}
		
		// Intersection - .retainAll()
        set1.retainAll(set2);
        System.out.println(set1);
		
		/*
		 before :
		 set1 = a, b, c
		 set2 = b, c, d
		 
		 after :
		 set1 = b, c
		 */
		
		
		// Different - .removeAll();
		
		set1.removeAll(set2);
		System.out.println(set1); // a
	}

}
