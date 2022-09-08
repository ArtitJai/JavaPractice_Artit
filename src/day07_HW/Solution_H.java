package day07_HW;

import java.util.Scanner;

public class Solution_H {

	public static void main(String[] args) {
		/*
		## Task H: Stylist Date Night

		You and your date are trying to get a table at a restaurant.

		The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the
		stylishness of your date's clothes.

		**Rule for getting a table**

		- Write program that take 2 input from user in one line. 1st value is your stylishness & 2nd value
		  is your date's stylishness
		- If either of you is very stylish, 8 or more, then the result
		  is `Yes, you both will definitely get a table`
		- With the exception that if either of you has style of 2 or less, then the result is
		  `Sorry, but no table for both of you`.
		- Otherwise, the result is  `Ahh, you maybe lucky tonight`.

		**Example:**

		```text
		What are you and your date stylishness?
		> 5 10
		Yes, you both will definitely get a table

		What are you and your date stylishness?
		> 2 8
		Sorry, but no table for both of you

		What are you and your date stylishness?
		> 5 5
		Ahh, you maybe lucky tonight
		```
*/
		
		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What are your date stylishness 0-10?");
		int stylishness_Me = sc.nextInt();
		
		System.out.println("What are your date stylishness 0-10?");
		int stylishness_Date = sc.nextInt();


	
		sc.close();
		
		

	      if (stylishness_Me <= 2 || stylishness_Date <= 2) {
	         System.out.println("Sorry, but no table for both of you.");
	      }
	      else if (stylishness_Me >= 8 || stylishness_Date >= 8 ) {
	         System.out.println("Yes, you both will definitely get a table");
	      }
	      else {
	         System.out.println("Ahh, you maybe lucky tonight");
	      }
		
		
		
		
		
		
		
		
		
//		
//		if((date1 >= 8 && date1 <= 10 ) || (date2 >= 8 && date2 <= 10) && (date1 > 2 && date2 > 2)) 
//		{
//			System.out.println("Yes, you both will definitely get a table");
//		}
//		else if(date1 <= 2 && date1 >= 0 || date2 <= 2 && date2 >= 0 )
//		{
//			System.out.println("Sorry, but no table for both of you");
//		}
//		else {
//			System.out.println("Ahh, you maybe lucky tonight");
//		}
				

		
		
//		if ((date1 > 10 && date1 <= 1) || (date2 > 10 && date2 <= 1)) {
//			System.out.println("Ahh, you maybe lucky tonight");
//		}
//		
//		else if(date1 == 2 || date2 == 2) {
//			System.out.println("Sorry, but no table for both of you");
//		}
//		
//		else if((date1 >= 8 && date1 <= 10) || (date2 >= 8 && date2 <= 10)) {
//			System.out.println("Yes, you both will definitely get a table");
//		}
		
		
	}

}
