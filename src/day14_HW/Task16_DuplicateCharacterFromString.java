package day14_HW;

public class Task16_DuplicateCharacterFromString {

	public static void main(String[] args) {
		
		/*
		 * ## Task16
`
Write a program to extract distinct character from a string
     input: abcabcabcabc
     output:abc
     */ 

		
		String str = "abcabcabcabce";
		
		String output = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(!output.contains(str.substring(i,i+1))) {
				output += str.charAt(i);	
			}
		}
		System.out.println(output);
		
		
		
		
	}

}

//					String str = "abcabcabcabcdef";

//					for (int i = 0; i < str.length(); i++){
//					int extract = 0;
//					
//					for (int j = 0; j < str.length(); j++){
//					
// 					checking if two characters are equal
//					if (str.charAt(i) == str.charAt(j) && i != j){
//					
//					extract = 1;
//					break;
//					}
//					}
//
//					if (extract == 0)
//					System.out.print(str.charAt(i));
//					}



