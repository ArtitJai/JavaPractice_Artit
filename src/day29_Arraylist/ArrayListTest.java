package day29_Arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String>nameList = new ArrayList<>();
		
		nameList.add("Jane");
		nameList.add("John");
		nameList.add("Luke");
		nameList.add("Steve");
		
		System.out.println(nameList);
		
		nameList.add("Jenny");
		
		System.out.println(nameList);
		
		nameList.add(0, "Dekizugi");
//											 0	      1     2     3     4      5
		System.out.println(nameList); // [Dekizugi, Jane, John, Luke, Steve, Jenny]
		
		nameList.add(2, "Shizuka");
//			 								 0	      1      2       3    4      5      6
		System.out.println(nameList); // [Dekizugi, Jane, Shizuka, John, Luke, Steve, Jenny]
		
		nameList.set(0, "Doraemon");
		
		System.out.println(nameList);
		
		nameList.remove(0);
		
		System.out.println(nameList);
		
		nameList.remove("Jane");
		
		System.out.println(nameList);
		
		ArrayList<Integer>numlist = new ArrayList<>();
		
		numlist.add(1);
		numlist.add(2);
		numlist.add(3);
		
		System.out.println(numlist);
	}

}
