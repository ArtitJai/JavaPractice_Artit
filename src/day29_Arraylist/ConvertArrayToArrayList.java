package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Pear", "Banana"};
		
		System.out.println(fruits.length);
		
		ArrayList<String>list = new ArrayList<>(Arrays.asList(fruits));
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
//		System.out.println(list.get(5));
		
		String[] fruit2 = {"Mango", "Orange", "Grapes"};
		
		ArrayList<String>list2 = new ArrayList<>(Arrays.asList(fruit2));
		
		System.out.println(list2);
		
		list2.addAll(list);
		
		System.out.println(list2);
		
		list.addAll(list2);
		
		System.out.println(list);
		
		Integer[] nums = {1, 2, 3};
		Integer[] nums2 = {4, 5, 6};
		// {1, 2, 3, 4, 5, 6}
		
		ArrayList<Integer>list3 = new ArrayList<>(Arrays.asList(nums));
		
		ArrayList<Integer>list4 = new ArrayList<>(Arrays.asList(nums2));
		
		list3.addAll(list4);
		
		System.out.println(list3);
		
		
		
	}

}
