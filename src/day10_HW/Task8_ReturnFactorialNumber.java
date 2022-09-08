package day10_HW;

public class Task8_ReturnFactorialNumber {

	public static void main(String[] args) {
		
//		int num = 5;
//		int fact = 1;
//		
//		for(int i = 1; i <= num; i++) {
//			fact = fact * i;
//			System.out.printf("%d * %d = %d \n",num,i,fact);
//		}
			
		
		
		int num = 5;
        int fact = 1;
        int i = 1;
        
        while(i<=num)
        {
            fact *= i;
            i++;
            System.out.println("Factorial of "+num+" is: "+fact);
        }
        
			
		
		
		
		
			}
	}


//## Task8
//`
//Write a program that can return the factorial number of any given number
//            Ex:
//                input: 5
//                output: 120
//                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
