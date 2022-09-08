package day28_Java;

public class StringUtils {

	public static void main(String[] args) {
		
		// compare with original string
		System.out.println(isPalindrome("civic"));

	}
	protected static boolean isPalindrome(String str) {
		
		String reverse = reverseString(str);
		return str.equalsIgnoreCase(reverse);
	}
	protected static String reverseString(String str) {
		
		// reverse the string
		
		String reverseStr ="";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}
}
 
