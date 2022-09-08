package day26_HW;

import java.util.Arrays;

public class Task09_AddString {

//		9. create a return method called addString that can add a String after the last index of a String array

	private static String[] arr(String[] array, String input) {
		
	     String[] result = Arrays.copyOf(array, array.length + 1);
	     result[result.length - 1] = input;
	     return result;
	}

   public static void main(String[] args){
	   
       String[] names = { "Luke", "John", "Nobita", "Shizuka", "Doraemon", "Doraeme", "Giant", "Suneo" };

       names = arr(names, "Dekizugi");    
       System.out.println(Arrays.toString(names));
   }
}
