package day23_6thReview;

import java.util.Arrays;

public class SortLogic {

	public static void main(String[] args) {
		
//		lowest to highest
		
		int[] numbers = { 0, 6, -10, 34, -20 };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    
                    int x = numbers[i];
                    int y = numbers[j];
                    
                    
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    
                }

            }
        }
        System.out.println(Arrays.toString(numbers));
		
		
	}

}
