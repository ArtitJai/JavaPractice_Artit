package day26_HW;

public class Task14_FizzBuzz {

//	14.     - Write a program that returns a list of strings between two numbers
//    but
//    for multiples of 3 insert "Fizz" instead of number
//    for multiples of 5 insert "Buzz" instead of number
//    for multiples of 3 and 5 insert "FizzBuzz" instead of number
//    - You will also need to create a divisibleBy method that accepts two integer number and return a boolean.
//    Input: fizzBuzzGenerator(1,15);
//    Output: ["1","2","Fizz","4","Buzz",...,"FizzBuzz"]


protected static void FizzBuzz(int num) {

		
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.print(" FizzBuzz ");
		}
		else if(num % 3 == 0) {
			System.out.print(" Fizz ");
		}
		else if(num % 5 == 0) {
			System.out.print(" Buzz ");
		}
		else {
			System.out.print(" "+num+" ");
		}

		}

public static void main(String[] args) {
		
		for(int num = 1; num <= 100; num++ ) {
			FizzBuzz(num);
		}
	
}

}
