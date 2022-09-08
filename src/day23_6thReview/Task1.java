package day23_6thReview;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		

//		String sentence = "is a sequence of characters that specifies a search pattern in text. "
//				 "Usually such patterns are used by string -searching algorithms for find or find and replace  "
//				 "operations on strings";
		
//		Order the sentence by the length of the word in ascending order without special character.
		
		String str = "is a sequence of characters that specifies a search pattern in text. Usually such patterns are used by string -searching algorithms for find or find and replace operations on strings";

		// Expected:
		// a a is of in are ... algorithms operation
		
		// remove special char
		
		String newStr = str.replace(".", "").replace("-", "");
		
		// put to array
		String[] words = newStr.split(" ");
		System.out.println(Arrays.toString(words)); // before sorted
		
		for(int i = 0; i < words.length; i++) {
			for(int j = i + 1; j < words.length; j++) {
				if(words[i].length() > words[j].length()) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(words)); // after sorted
	}

}
