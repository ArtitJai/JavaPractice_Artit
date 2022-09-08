package day23_6thReview;

public class FindMaxAndMin {

	public static void main(String[] args) {
		
		int[] numbers = { 0, 6, -10, 34, -20 };
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) max = numbers[i]; // ==> for maximum number
			if(min > numbers[i]) min = numbers[i]; // ==> for minimum number
		}
		
		System.out.println(max);
		System.out.println(min);
		
		

	}

}
