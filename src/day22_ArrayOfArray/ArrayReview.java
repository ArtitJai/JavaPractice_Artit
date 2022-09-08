package day22_ArrayOfArray;

public class ArrayReview {

	public static void main(String[] args) {
		
		//
		
		int[] numbers = {3, 2, 1, 3, 2, 1, 3, 2, 1, 1};
		
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("\n------------------------------\n");
		
		for(int stas : numbers) {
			System.out.println(stas);
		}
		
		System.out.println("\n------------------------------\n");
		
		int index = 0;
		
		do {
			System.out.println(numbers[index]);
			index++;
		}while(index < numbers.length);
		
		//while loop
		
		System.out.println("This is the value of index "+ index); //0
		
		System.out.println("This is the value of index "+index);//10
		index = 0;
		System.out.println("This is the value of index "+index);//0
		
		
		System.out.println("\n------------------------------\n");
		
		while(index < numbers.length) {
			System.out.println(numbers[index]);
			index++;
			
		}
		
		
		
	}

}
