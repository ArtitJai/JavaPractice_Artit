package day22_HW;

import java.util.Arrays;
import java.util.Collections;

public class Task04_ReverseChar {

	public static void main(String[] args) {
	
//		4. create string array, and store the names of your  class mates (10)
//        reverse each students names and print them in separate lines
//        	ex:
//        		arr = {java, python, c#}
//
//    		output:
//    			avaJ
//    			nohtyp
//    			#c

		String[] names = {"Luke", "Chelsea", "Tom", "Tim", "Mary", "Doraemon", "Nobita", "Shizuka", "Giant", "Dekizugi"};
		
		
		
		
//		for(int i = 0; i < reverse.length ; i++) {
//			System.out.println(names[i]);
//	}
		
		for(int a = 0; a < names.length; a++) {
			String reverse = "";
			for(int b = names[a].length()-1; b >= 0; b--) {
				reverse += names[a].charAt(b);
					
		}
			
			System.out.println(reverse);
		}
		
	}

}
