package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopingArrayList {

	public static void main(String[] args) {
		
	String[] fruits = {"Apple", "Pear", "Banana", "Mango", "Orange", "Grapes"};
		
		System.out.println(fruits.length);
		
		ArrayList<String>list = new ArrayList<>(Arrays.asList(fruits));
		
		System.out.println(fruits);
		System.out.println(Arrays.toString(fruits));
		System.out.println(list);
		
		// for loop
		System.out.println("\n---------------------------------------\n");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // fruits[i] --> for array	
		}
		
		System.out.println("\n---------------------------------------\n");
		
		int index = 0;
		
		do {
			System.out.println(list.get(index));
			index++;
		}while(index < list.size());
		
		System.out.println("this is my index :"+index);
		
			index = 0;
			
		System.out.println("\n---------------------------------------\n");
		
		while(index < list.size()){
			System.out.println(list.get(index));
			index++;
		}
		
		System.out.println("\n---------------------------------------\n");
		
	    for (String fruit : list) {
            System.out.println(fruit);
        }
        
		
	}

}
