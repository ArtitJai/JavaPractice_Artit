package day26_HW;

import java.util.Arrays;

public class Task08_AddDouble {

//	8. create a return method called addDouble that can add a double after the last index of a double array
	
	private static double[] append(double[] array, double value) {
		
	     double[] result = Arrays.copyOf(array, array.length + 1);
	     result[result.length - 1] = value;
	     return result;
	}

   public static void main(String[] args)
   {
       double[] nums = { 1.1, 2.35, 3.69, 4.87 };

       nums = append(nums, 5.78);    
       System.out.println(Arrays.toString(nums));
   }
	
}
