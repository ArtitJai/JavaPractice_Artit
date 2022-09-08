package day26_HW;

import java.util.Arrays;

public class Task10_AddChar {

//	10. create a return method called addChar that can add a char after last index of a char array
	
	private static char[] arr(char[] array, char input) {
		
	     char[] result = Arrays.copyOf(array, array.length + 1);
	     result[result.length - 1] = input;
	     return result;
	}

  public static void main(String[] args){
	  
      char[] alphabet = { 'a', 'b', 'c', 'd'};

      alphabet = arr(alphabet, 'e');    
      System.out.println(Arrays.toString(alphabet));
  }
}
