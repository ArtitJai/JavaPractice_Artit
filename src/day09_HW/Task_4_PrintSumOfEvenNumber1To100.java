package day09_HW;

public class Task_4_PrintSumOfEvenNumber1To100 {

	public static void main(String[] args) {
		
	// Write a java program to print sum of even number between 1 to 100.


//	int num = 0;
//	
//	for(int i = 1 ; i <= 100; i++) {
//		if (i % 2 == 0) {
//			num += i;
//			// num = num + i;
//		}
//	}
//		System.out.println("SUM = "+num);
//		
		
		int total = 0;
		
		int count = 1;
		
		while(count < 101) {
			if(count % 2 == 0) {	
			total += count; // total = total + count
		}
			count++;
		}
		System.out.println(total);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
