package day00_basicQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class StringReverse {

	public static void main(String[] args) {
		
//		String str = "inspired";
		
//		String result = "";
//		
//		for(int i = str.length()-1; i >= 0; i--) {
//			result += str.charAt(i);
//		}
//		
//		System.out.println(result);
		
//		StringBuffer buffer = new StringBuffer(str);
//		
//		System.out.println(buffer.reverse());
		
		ArrayList<String> arr = new ArrayList<String>(); 
		
			arr.add("Apple");         
	        arr.add("Amazon");        
	        arr.add("Facebook");
	        arr.add("Google");
	        arr.add("IBM");         
	        arr.add("Tesla");
	        
	        System.out.println(arr);
	        
	        System.out.println("=========================================");
	        
	        Collections.reverse(arr);
	        
	        System.out.println(arr);
	}
}
