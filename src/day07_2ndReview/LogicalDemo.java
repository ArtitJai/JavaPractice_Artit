package day07_2ndReview;

public class LogicalDemo {

	public static void main(String[] args) {

		/*
		 * Logical Operator = Boolean expression
		 * result always be 'true' or 'false'
		 * 
		 * NOT => ! = Unary Operator
		 */

		boolean istall = true;
		System.out.println(!istall);
		
		// AND - && => Binary Operator
		// All of operands need to be ' true', then result == ' true'
		
		// OR - ||
		// At least one of operand is 'true', then result == 'true'
		
		
		boolean isHandsome = true;
		boolean isRich = true;
		boolean isMyType = isHandsome && isRich;
		System.out.println(isMyType);
		
		
		// Precedence of logical operator
		/*
		 * 1. ()
		 * 2. !
		 * 3. && , ||
		 */
		
		boolean b = true && !false;
		System.out.println(b);
		
		boolean b10 = (false || true) && !false;
		System.out.println(b10);
		
		
		
	}

}
