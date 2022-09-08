package day07_HW;

import java.util.Scanner;

public class Solution_E {

	public static void main(String[] args) {
		/*
		## Task E - Lucky Number

		A four-digit number `ABCD` is called lucky if `A` + `B` = `C` + `D`

		Write a program that asks the user to enter a four-digit number and tell if the number is a lucky
		number or not. if it's a lucky number print `Yay, <number> is a lucky number`, otherwise
		print `Nah, <number> is not a lucky number`

		**Example 1:**

		```text
		Please enter 4 digits number:
		>3719
		Yay, 3719 is a lucky number
		```

		**Example 2:**

		```text
		Please enter 4 digits number:
		>3521
		Nah, 3521 is not a lucky number
		```	
	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert your lucky number");
		int num1 = sc.nextInt();
		
		System.out.println("Please, insert your lucky number");
		int num2 = sc.nextInt();
		
		System.out.println("Please, insert your lucky number");
		int num3 = sc.nextInt();
		
		System.out.println("Please, insert your lucky number");
		int num4 = sc.nextInt();
		
		System.out.println();
		
		
		if((num1+num2) == (num3+num4)) {
			System.out.println("YAY! "+num1+", "+num2+", "+num3+", "+num4+" is a lucky number");
		}else {
			System.out.println("NAH! "+num1+", "+num2+", "+num3+", "+num4+" is not a lucky number");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
