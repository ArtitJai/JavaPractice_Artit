package day27_7thReview;

public class JavaReturn {

	public static void main(String[] args) {
		
		// Return -> use when return type of that method is NOT valid
		String newWord = prefixWord("Hi");
		
//		String anotherWord = printPrefixWord("Hi"); -> this not will work
		System.out.println(newWord);
		
		
		int[] nums = {1, 2, 3, 4};
		int[] numarr = {2, 4, 6, 8, 12, 100};
		System.out.println(isContainOddNumber(nums));
		System.out.println(isContainOddNumber(numarr));
		
	}
	public static String prefixWord(String word) {
		
		return "!!" + word;
	}
	public static String printPrefixWord(String word) {
		
		return "!!" + word;
		
//		return; use to break out from the method, it's unnecessary with this example
	}
/*
 * 	Point to remember
 * 	- use to exit from the method
 * 	- the value passed with return keyword must match with return type of the method
 */
	
/**	
 * this is JSDOC
 * 	This will check if integer array have odd number or not.
 * 	@param nums this will be aray
 * 	@return
 **/
	public static boolean isContainOddNumber(int[] nums) {
		
		for(int num : nums) {
			if(num%2 != 0)
				return true;
		}
		return false;
	}
}


