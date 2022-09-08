package day13_String;

public class StringEqualMethod {

	public static void main(String[] args) {
		
		String word1 = "Hello";
		String word2 = "hello";
		
		System.out.println(word1.equals(word2)); // false
		System.out.println(word1.equalsIgnoreCase(word2)); // true
		
		if(word1.equals(word2)) {
			System.out.println("They are equal");
		}else {
			System.out.println("not equal");
		}
		
		
		boolean b = word1.equals(word2);
			// returns true if the String word1 is equal to word2
			System.out.println(b);
				b = word1.equalsIgnoreCase(word2);
			// returns true if the String word1 matches word2, case-blind
				
				
		b = "Raiders".equals("Raiders"); // true
		b = "Raiders".equals("raiders"); // false
		b = "Raiders".equalsIgnoreCase("Raiders"); // true
		
		System.out.println(b);
		
//		if(team.equalsIgnoreCase("raiders")) 
//			System.out.println("Go You "+ team);
		
				
				
				
	}

}
