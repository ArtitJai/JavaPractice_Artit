package day07_HW;

import java.util.Scanner;

public class Solution_G {

	public static void main(String[] args) {
		
		
		/*
		## Task G - Weird Number

		Given an integer `n` , perform the following conditional actions:

		- If `n` is odd, print `Weird`
		- If `n` is even and in the inclusive range of `2` to `5` , print `Not Weird`
		- If `n` is even and in the inclusive range of `6` to `20` , print `Weird`
		- If `n` is even and greater than `20`, print `Not Weird`

		### Input Format

		A single line containing a positive integer `n` .

		### Constraints

		- 1 <= `n` <= 100

		### Output Format

		Print `Weird` if the number is weird; otherwise, print `Not Weird`.

		Sample Input 0
		> 3

		Sample Output 0
		> Weird

		Sample Input 1
		> 24

		Sample Output 1
		> Not Weird
*/
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please, input number:\n");
	
	int n = sc.nextInt();
	
	System.out.println();
	
	
	if(n>=6 && n<= 20 && n%2 == 0 && n>=-1 && n<=100) {
		System.out.println("Weird");
	}
	
	else if(n%2 == 0 && n>=-1 && n<=100){
		System.out.println("Not Weird");	
	}
	
	else if(n%2 == 1 && n>=-1 && n<=100) { // n%2 != 0
		System.out.println("Weird");
	}
	
	else {
		System.out.println("Invalid number");
	}
	
	
	
	sc.close();
	
	 // given integer 'n'
//    int n = 44;
//
//    if (n % 2 != 0) { // if n is odd
//       System.out.println("Weird");
//    } else { // if n is even
//       if (n >= 2 && n <= 5)  // inclusive range of 2 to 5
//          System.out.println("Not Weird");
//       else if (n <= 20)  // inclusive range of 6 to 20
//          System.out.println("Weird");
//       else  // greater than 20
//          System.out.println("Not Weird");
//    }
//    
	
	
	
    // 20
    // 2 3 4 5                 true      false
//    if (n >= 2 && n <= 5) // n <= 5 != n >= 6 // opposite
//    // 6 7 ... 20
//    else if (n <= 20)
//    // 21 22 ... 100
//    else // greater 20
	
	

	
	}

}
