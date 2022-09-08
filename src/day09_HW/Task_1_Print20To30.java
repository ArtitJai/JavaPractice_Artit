package day09_HW;

public class Task_1_Print20To30 {

	public static void main(String[] args) {
	
	
	// Write a program to print number Between 20 to 30.
	
		int i = 20;
	
		while (i<31) {
			System.out.println(i);
			
			i++;
		}
		
	System.out.println("===========================");
	
	System.out.println("Do while loop");
//	Assign i = 20 because if not i gonna be number 31 
//	after run from above "while" loop
	i = 20;
	
	do {
		System.out.println(i);
		i++;
	}while(i<=30);
	
	
	System.out.println("===========================");
	System.out.println("For loop");

	for(int a = 20; a <= 30; a++) {
		System.out.println(a);
	}
	
	
	
	
	
	}
}
