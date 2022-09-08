package day20_Arrays;

public class IntArrays {

	public static void main(String[] args) {
		
		int age[] = {23,24,25,26};
		
		for(int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		int[] num = new int[3];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
