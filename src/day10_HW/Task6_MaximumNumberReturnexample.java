package day10_HW;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task6_MaximumNumberReturnexample {

	public static void main(String[] args) {
	
		int[] myArray = new int[5];  //Array to hold user input of 5 integers

        //Buffered reader is wrapped around the input stream reader to read user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Loop to get user input, 5 times
        for (int i=1;i<=5;i++){
            System.out.println("Enter a number: ");
            try{
                myArray[i-1] = Integer.parseInt(reader.readLine());  //String to integer the user input
                }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        minmax(myArray);            
    }

static void minmax(int[] array){
    int max, min;
    max = min = array[0];
    for (int i=1;i<array.length;i++){
        if (array[i] > max)
            max = array[i];
        else if(array[i] < min)
            min = array[i];
    }
    System.out.println("The min is:" + min + " and the max, is: " + max);
    
    
  
    
}
	}


