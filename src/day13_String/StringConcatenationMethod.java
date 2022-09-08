package day13_String;

public class StringConcatenationMethod {

	public static void main(String[] args) {
		
		String word1 = "re";
		String word2 = "think";
		String word3 = "ing";
		
		String result = word1 + word2 + word3;
		System.out.println(result);// rethinking
		
		String result2 = word1.concat(word2).concat(word3);
		System.out.println(result2);
		
		
		String result3 = "";
		result3 += word1;
		
		System.out.println(result3);
		
		result3 += word2;
		
		System.out.println(result3);
		
		result3 += word3;
		
		System.out.println(result3);
		
	}

}
