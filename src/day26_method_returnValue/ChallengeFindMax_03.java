package day26_method_returnValue;

public class ChallengeFindMax_03 {

	public static int findMax(int[] arr) {
		
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}
}
