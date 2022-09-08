package day24_ArrayOfArray;

import java.util.Arrays;

public class TwoD_Array {

	public static void main(String[] args) {
		
		String[] companies = {"Alfreds Futterkiste", 
						"Centro comercial Moctezuma", 
						"Ernst Handel", 
						"Island Trading", 
						"Laughing Bacchus Winecellars",
						"Magazzini Alimentari Riuniti"};
		
//		System.out.println(Arrays.toString(companies));
//		System.out.println();
		
		String[] contact = {"Maria Anders",
							"Francisco Chang",
							"Roland Mendel",
							"Helen Bennett",
							"Yoshi Tannamuri",
							"Giovanni Rovelli"};
		
		String[] countries = {"Germany", "Mexico", "Austria", "UK" , "Canada", "Italy"};
		
		System.out.println(companies[0] + " contact with " + contact[0] + " from " + countries[0]);
		System.out.println();
		
		
	 //                         0         1          2	
		String[][] table = {companies, contact, countries};
		
		System.out.println(table[0][2]); // Ernst Handel
		
		System.out.println(table[1][4]); // Yoshi Tannamuri
		
		System.out.println(table[2][1]); // Mexico

		
//		for(int i = 0; i < table.length; i++) {
//			System.out.println(Arrays.toString(table[i]));
//			System.out.println();
//			
//			for(int j = 0; j < table[i].length; j++) {
//				System.out.println(table[i][j]);
//			}
//		}
	
		System.out.println();
		
		System.out.println(table[0][0] + " " + table[1][0] + " " + table[2][0]);
		
		System.out.println();
		
		for(int i = 0;  i < table.length; i++) {
//			System.out.println(Arrays.toString(table[i]));
			System.out.println(table[0][i] + "\t" + table[1][i] + "\t" + table[2][i]);
		}
	}
	
	
	
	
	

}
