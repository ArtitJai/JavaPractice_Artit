package day46_collections;

import java.util.Collection;
import java.util.HashSet;

public class Test_Hashset {

	public static void main(String[] args) {
		
		Collection<Integer>uniqueValue = new HashSet<>();
		
		uniqueValue.add(1);
		uniqueValue.add(1);
		uniqueValue.add(1);
		uniqueValue.add(1);
		uniqueValue.add(1);
		uniqueValue.add(1);
		uniqueValue.add(1);
		uniqueValue.add(1);
		uniqueValue.add(2);
		uniqueValue.add(2);
		uniqueValue.add(2);
		uniqueValue.add(4);
		uniqueValue.add(4);
		uniqueValue.add(4);
		uniqueValue.add(3);
		
		System.out.println(uniqueValue);

	}

}
