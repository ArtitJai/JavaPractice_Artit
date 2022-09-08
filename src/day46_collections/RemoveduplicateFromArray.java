package day46_collections;

import java.util.Collection;
import java.util.HashSet;

public class RemoveduplicateFromArray {

	public static void main(String[] args) {
		
		String str = "aaaaabbbccccdeeeef";
//	    output : [a,b,c,d,e,f]
		 
		 Collection<Character>list = new HashSet<>();
		 
		 for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			list.add(str.charAt(i));
		}
		 
		 System.out.println(list);

	}

}
