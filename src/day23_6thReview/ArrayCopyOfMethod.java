package day23_6thReview;

import java.util.Arrays;

public class ArrayCopyOfMethod {

	public static void main(String[] args) {
		
			// copyOf() ->		
			String[] list1 = { "Orange", " Mango", "Banana" };
			String[] list2 = list1;
			list1[0] = "Apple";
				
			System.out.println(Arrays.toString(list1));
			System.out.println(Arrays.toString(list2));
			
			System.out.println("\n====================\n");
			
			String[] list3 = { "Orange", " Mango", "Banana" };
			String[] list4 = Arrays.copyOf(list3, list3.length);
			list3[0] = "Apple";
			
			System.out.println(Arrays.toString(list3));
			System.out.println(Arrays.toString(list4));
			
			String[] list5 = Arrays.copyOf(list3, list3.length-1); // [Orange, Mango]
	}

}
