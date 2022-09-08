package day15_HW;

public class Task06_MixString {

	public static void main(String[] args) {
		/*
		 * ## Task - Mix String

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the
result.

Example:

```text
Input   : abc xyz
Output  : axbycz

Input   : Hi There
Output  : HTihere

Input   : xxxx There
Output  : xTxhxexre
*/ 

		String a = "Hi";
		String b = "There";
		
		
		int max = a.length()+b.length();
		
		String word = "";
		
		for(int i = 0; i < max; i++) {
			if(i <= a.length()-1)
				word += a.substring(i, i + 1);
			if (i <= b.length()-1)
				word += b.substring(i, i + 1);
		}
		
			System.out.println(word);
			
		
	}

}
