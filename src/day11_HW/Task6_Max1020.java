package day11_HW;

public class Task6_Max1020 {

	public static void main(String[] args) {
		
		int a = 22;
		int b = 11;
		
		
		 	if (((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) && a > b) {
		      System.out.println(a);
		    }

		 	else if (b > a) {
		        System.out.println(b);
		    } else {
		    	 System.out.println("0");
		    }
	
	
	
	}
			
	}
		

//## Task - max1020
//
//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or
//return 0 if neither is in that range.
//
//Example:
//```text
//11 19
//19
//
//19 11
//19
//
//11 9
//11
//```	
//

