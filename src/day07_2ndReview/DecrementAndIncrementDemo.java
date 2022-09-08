package day07_2ndReview;

public class DecrementAndIncrementDemo {

	public static void main(String[] args) {
		
		// Prefix and Postfix
		// ++ , --

		int x = 1;
		int y = x++; // assign x => y, then increment x
		
		System.out.println(x + " = " + y);

		int i = 1;
		int j = ++i; // increment i , then assign i => j
		
		System.out.println(i + " = " + j);
		
		
		// Decrement And Increment with Character
		
		char a = 'a';
		a++; // a ++ 1; => a = a + 1 => b
		a += 2;
		System.out.println(a);
		
		char ch = 'c'; // 100
		
	    ch -= 'b'; // ch = ch - 'b'
		ch += 'c'; // ch = ch - 'c'
		
		System.out.println(ch);
		
		
		
		
	}
}
