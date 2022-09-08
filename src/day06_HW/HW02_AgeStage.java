package day06_HW;

import java.util.Scanner;

public class HW02_AgeStage {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("age");
		int age = scanner.nextInt();
		
		if(age >= 1 && age <= 150) {
		}
		
		if(age >= 1 && age <= 2){
			System.out.println("Infancy"); 
		}
		
		else if(age >= 3 && age <= 4) {
			System.out.println("Toddler");
		}
		
		else if(age >= 5 && age <= 7) {
			System.out.println("Early school");
		}
		
		else if(age >= 8 && age <= 12) {
			System.out.println("Middle school");
		}
		
		else if(age >= 13 && age <= 17) {
			System.out.println("Early adolescence");
		}
		
		else if(age >= 18 && age <= 25) {
			System.out.println("Later adolescence");
		}
		
		else if(age >= 26 && age <= 30) {
			System.out.println("Early adulthood");
		}
		
		else if(age >= 31 && age <= 49) {
			System.out.println("Middle adulthood");
		}
		
		else if(age >= 50 && age <= 150) {
			System.out.println("later adulthood");
		}
		
		else {
			System.out.println("Invalid age");
		}
		
		scanner.close();

	}

}
