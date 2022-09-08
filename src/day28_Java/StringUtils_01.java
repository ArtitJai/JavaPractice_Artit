package day28_Java;

public class StringUtils_01 {

	public static void main(String[] args) {
		
//		3. write a program that can count how many palindromes in an array of string
//      Ex:
//          {"anna", "level", "Java"};
//          output:
//              2
		
		int palindromeCount = 0;
		
		String[] words = {"anna", "level", "Java"};
		
		for(String naga : words) {
			if(StringUtils.isPalindrome(naga)) {
				palindromeCount++;
			}
		}
		System.out.println(palindromeCount);

	}

}
