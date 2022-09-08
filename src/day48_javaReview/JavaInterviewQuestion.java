package day48_javaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaInterviewQuestion {
	
	
//	Write a function that can find the maximum number from an int Array
	public int maxValue(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
		
	}
	
	
//	Write a function that can find the minimum number from an int Array
	public int minValue(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
		
	}
	
	
//	Write a program that can find the first duplicated element from the array
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7};
		
		printFirstRepeating(nums);
		
		JavaInterviewQuestion j = new JavaInterviewQuestion();
		int[] arr = j.reverseArr(nums);
		
		System.out.println(Arrays.toString(arr));
	} 
	
	  static void printFirstRepeating(int arr[])
	    {
	        // Initialize index of first repeating element
	        int index = -1;
	 
	        // Creates an empty hashset
	        HashSet<Integer> set = new HashSet<>();
	 
	        // Traverse the input array from right to left
	        for (int i=arr.length-1; i>=0; i--)
	        {
	            // If element is already in hash set, update min
	            if (set.contains(arr[i]))
	                index = i;
	 
	            else   // Else add element to hash set
	                set.add(arr[i]);
	        }
	 
	        // Print the result
	        if (index != -1)
	          System.out.println("The first repeating element is " + arr[index]);
	        else
	          System.out.println("There are no repeating elements");
	    }
	  
	  
//	  Write a program that can remove the duplicated element from the array
	    public static Integer[] getUniqueValue(Integer[] nums) {
	        
	        Set<Integer> uniqueValues = new HashSet<>();
	        
	        for(Integer a : nums) {
	            uniqueValues.add(a);
	        }
	        
	        Integer[] b = new Integer[uniqueValues.size()];
	        
	        int index = 0;
	        
	        for(Integer a : uniqueValues) {
	            b[index] = a;
	            index++;
	        }
	        
	        return b;
	        
	    }  
	
//	Write a return method that can concat two arrays
	   public int[] combine2Array(Integer[]a ,Integer[]b) {
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        list.addAll(Arrays.asList(a));
	        list.addAll(Arrays.asList(b));
	        
	        int index = 0;
	        int[] arr = new int[list.size()];
	        
	        for (Integer num : list) {
	            arr[index++] = num;
	        }
	        
	        return arr;
	        
	    }
	   
	   
//	   Write a function that can reverse an array
	   public int[] reverseArr(int[] a) {
		   
		   int[] reverse = new int[a.length];
		   
		   int index = 0;
		   
		   for (int i = a.length-1; i >= 0; i--) {
			reverse[index++] = a[i];
		}
		   
		   return reverse;
	   }
	   
	   
//	   Count vowels and consonants in a String
	   String str = "TechCircle";
	   String vowels = "aeiou";
	   
	   public static void main1(String[] args) {
		
	  String str = "TechCircle";
	   
	  int vCount = 0, cCount = 0;
	   str = str.toLowerCase();
	   
	   for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
			vCount++;
		}
		  else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') { 
			  cCount++;
		  }
	}
	   
			   System.out.println("Vowel: " + vCount); 
			   System.out.println("Consonant: " + cCount); 
			    
	   }
}
