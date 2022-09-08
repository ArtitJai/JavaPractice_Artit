package day00_basicQuestion;

import java.util.HashMap;
import java.util.Map;

public class JavaInterviewQuestion {

	public static void main(String[] args) {
		
	
	  int[] given = { 1, 2, 5, 5, 6, 6, 7, 2 };
      
      Map<Integer, Integer> map = new HashMap<>();
      
      for (int num: given) {
          if (!map.containsKey(num)) {
              map.put(num, 1);
          }else {
              //type this in line number 16
              map.put(   num     , map.get(num) +1);
          }
      }
      
      for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
          
          if (entry.getValue() > 1) {
              System.out.println(entry.getKey() + ":" + entry.getValue());
          }
          
      }
	}
  }

