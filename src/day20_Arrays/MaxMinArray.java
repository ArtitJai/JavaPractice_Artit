package day20_Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int age[] = {23,2,25,26};
		int max = age[0];
		int min = age[0];
		
		for(int i =0; i < age.length; i++) {
			if(age[i] > max) {
				max = age[i];
			}else if(age[i] < min) {
				min = age[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);

	}

}
