package day22_HW;

import java.util.Arrays;

import day26_method_returnValue.StringUtils;



public class Task19_FindPalinDromeInArrayIrfan1 {

	public static void main(String[] args) {
		
        String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};
        
//      StringUtils.isPalindrome();
      
      int count = 0;
      for (String name : names) {
          if (StringUtils.isPalindrome(name)) {
//              System.out.println(name);
              count++;
          }
      }
      
      String names2[] = new String[count]; 
      
      int index = 0;
      
      for (String name : names) {
          if (StringUtils.isPalindrome(name)) {
//              
              names2[index++] = name;
          }
      }
      
      System.out.println(Arrays.toString(names2));

	}

}
