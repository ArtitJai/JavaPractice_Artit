package day46_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CombineArrays {

	public static void main(String[] args) {
//		Input:
//		arr1 = {30, 10, 20}; 
//		arr2 = {15, 40, 25, 35}; 
//		arr3 = {8, 9, 17, 5, 4, 1} 
		
		Integer[] arr1 = {30, 10, 20};
		Integer[] arr2 = {15, 40, 25, 35};
		Integer[] arr3 = {8, 9, 17, 5, 4, 1};
		
		Collection<Integer>list = new ArrayList<>();
		
		list.addAll(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		list.addAll(Arrays.asList(arr3));
		
		System.out.println(list);
		
		System.out.println("===================================================");
		
		int[] arr4 = new int[list.size()];
		
		int i = 0;
		for(Integer num : list) {
			arr4[i] = num;
			i++;
		}
		
		System.out.println(Arrays.toString(arr4));
		
		
		
		
		
	}

}
