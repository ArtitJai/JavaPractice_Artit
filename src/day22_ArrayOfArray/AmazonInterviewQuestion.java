package day22_ArrayOfArray;

import java.util.Arrays;
import java.util.Collections;

public class AmazonInterviewQuestion {

	public static void main(String[] args) {
		
		String str = "My name is Artit J";
		
//		expected String J Artit is name my
		
		String newStr = "";
//		
//		for(int i = str.length()-1; i >= 0; i--) {  ==> NOT WORK
//			System.out.println(i);				   ==> NOT WORK
//			System.out.print(str.charAt(i));	   ==> NOT WORK
//		}										   ==> NOT WORK
		
		
		
		String[] arr = str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
//		String[] arr2 = new String[arr.length];
//		
//		System.out.println(Arrays.toString(arr2));
		
		for(int i = arr.length-1; i >= 0; i--) {
//			System.out.print(arr[i].concat(" ")); this way is okay too
			
			newStr += arr[i].concat(" ");
		}
		
		newStr = newStr.trim();
		System.out.println(newStr);
		
	}

}
