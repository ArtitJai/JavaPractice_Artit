package day30_ArrayListReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
//		Create arraylist of char and add 10 elements
		
		ArrayList<Character>charac = new ArrayList<>();
		
		charac.add('a');
		charac.add('b');
		charac.add('c');
		charac.add('d');
		charac.add('e');
		charac.add('f');
		charac.add('g');
		charac.add('h');
		charac.add('i');
		charac.add('j');
		
		String str = "chCircle";
		
		for (int i = 0; i < str.length(); i++) {
			charac.add(str.charAt(i));
		}
		System.out.println(charac);
		
		ArrayList<Character>list = new ArrayList<>(Arrays.asList('s','w','x','y','z'));
		
		System.out.println(list);
		
		Iterator i = charac.iterator();
		
		System.out.println(i.hasNext());
		System.out.println(i.next());
		i.next();
		i.next();
		i.next();
		System.out.println(i.next());
		System.out.println(i.next());
		
		Iterator nat = list.iterator();
		
		while(nat.hasNext()) {
			System.out.println(nat.next());
		}
		
	}

}
