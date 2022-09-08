package day26_HW;

import java.util.Arrays;

public class Task07_AddInteger {

//		7. create a return method called addInteger that can add an Integer  after the  last index of an integer array

	private static int[] append(int[] array, int value) {
		
	     int[] result = Arrays.copyOf(array, array.length + 1);
	     result[result.length - 1] = value;
	     return result;
	}
 
    public static void main(String[] args)
    {
        int[] nums = { 1, 2, 3, 4 };
 
        nums = append(nums, 5);    
        System.out.println(Arrays.toString(nums));
    }
}
//			private static Integer[] append(Integer[] arr, int element)
//			{
//			    List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//			    list.add(element);
//			
//			    return list.toArray(new Integer[0]);
//			}
//			
//			public static void main(String[] args)
//			{
//			    Integer[] nums = { 1, 2, 3, 4 };
//			
//			    nums = append(nums, 5);    // add 5 to `nums[]`
//			    System.out.println(Arrays.toString(nums));
//			}



