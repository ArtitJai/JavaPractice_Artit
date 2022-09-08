package day22_HW;

import java.util.Arrays;

public class Task14_ShortestWord {

	public static void main(String[] args) {
		
//		Write a program that will find out the shortest words in the given string str. 
//		If there are few words that are evenly short, print them all. 
//		Use the split method in order to split the str string variable and create an array of strings. 
//		Print array with Arrays.toString() method. Sort array before printing. 
//		Sample Output: 
//			input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray 
//			output: [cat, old, ray]

		
		String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String arr[] = str.split(",");

        Arrays.sort(arr);

        int min = arr[0].length();

        String temp = "";

        for (int i = 0; i < arr.length; i++) {

            if (min == arr[i].length()) {
                temp += arr[i];
            }

        }

        temp = temp.trim();

        String arr2[] = temp.split(" ");

        System.out.println(Arrays.toString(arr2));

	}

}

//			String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray ";
//			
//			String[] arr = str.split(", ");
//			
//			int charCount  = arr[0].length();
//			
//			for (String word : arr) {
//			//    System.out.println(word);
//			    
//			    if (word.length() < charCount) {
//			        charCount = word.length();
//			    }
//			    
//			}
//			
//			int elementCount = 0;
//			
//			for (String word : arr) {
//			    
//			    word = word.trim();
//			    
//			    if (word.length() == charCount) {
//			        elementCount++;
//			    }
//			}
//			
//			
//			String[] shortWords = new String[elementCount];
//			
//			int index = 0;
//			
//			for (String word : arr) {
//			    
//			    word = word.trim();
//			    
//			    if (word.length() == charCount) {
//			        shortWords[index] = word;
//			        index++;
//			    }
//			}
//			
//			System.out.println(Arrays.toString(shortWords));
//			
//			
