package day15_HW;

public class Task07_RepeatSeparator {

	public static void main(String[] args) {
		
		/*
		 * ## Task - Repeat Separator

Given two strings, word and a separator sep, return a big string made of count occurrences of the
word, separated by the separator string.

```text
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
*/ 
		
		
		String word = "word";
		String sep = "x";
		 int max = 3;
		
		String nWord = "";
		
		for(int i = 0; i < max; i ++) {
			if(i < max - 1)
				nWord += word + sep;
			else
				nWord += word;
		}
		
		System.out.println(nWord);
		
		

	}

}
