package day46_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test_Linkedlist {

	public static void main(String[] args) {
		
//		ArrayList<String>names = new ArrayList<>();
//		LinkedList<String>names = new LinkedList<>();
//		List<String>names = new LinkedList<>();
		Collection<String> names = new ArrayList<>();
		
		names.add("Luke");
		names.addAll(Arrays.asList("Dekizugi", "Nobita"));
		
		names.add("Giant");
		names.add("Shizuka");
		
		System.out.println(names);
		
//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		} ==> can't use get message on collection
		
		for (String name : names) {
			System.out.println(name);
		}
		
		Iterator i = names.iterator();
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		i.next();
//		i.next();
//		i.next();
//		
//		System.out.println(i.next());
//		
//		System.out.println(i.hasNext());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
