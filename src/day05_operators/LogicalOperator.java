package day05_operators;

public class LogicalOperator {

	public static void main(String args[]) {
		
	
		//  && , || , !
		
		
		// && AND
		
		/*
		 * ConditionA  ConditionB  Result
		 *    True        True      True
		 *   False        True     False
		 *    True		 False     False 
		 *   False       False     False
		 */
		
		
		int a = 10;
		int b = 5;
		int c = 15;
		
		boolean conditionA = a+b == c;
		boolean conditionB = c-b == a;
		
		System.out.println(conditionA && conditionB);
		
		System.out.println((a+b == c) && (c-b == a));
		
		
		conditionA = c / b >= 3;
		conditionB = a+b > c;
		
		boolean result = conditionA && conditionB;
		
		System.out.println(result);
		
		
		
		String userName = "techcircle";
		String password = "abc123";
		
		
		System.out.println(userName == "techcircle" && password == "abc123");
		
		System.out.println(userName == "hello" && password == "abc123");
		
		System.out.println(userName == "techcircle" && password == "abc124");
		
		System.out.println(userName == "techcircl" && password == "abc124");
		
		
			
		
		// ||  OR
		
				/*
				 * ConditionA  ConditionB  Result
				 *    True        True      True
				 *   False        True      True
				 *    True		 False      True
				 *   False       False     False
				 */
		
		
		System.out.println(true || true); // True
		System.out.println(true || false); // True
		System.out.println(false || true); // True
		System.out.println(false || false); // False
		
		a = 1;
		b = 2;
		c = 3;
	//               1+2 == 3	
		conditionA = a+b == c; // True
		conditionB = a-b >  c; // False
		
		System.out.println(conditionA || conditionB);
		
		System.out.println(conditionA || c/a==3); 
		
		System.out.println(c+a > b+a || a < 5);
		
		System.out.println(c+a < b+a || a < 5);
		
		
		
		// Logical not !
		
		/*
		   !true == false
		   !false == true
		 */
		
		
		conditionA = true;
		conditionB = false;
		
		System.out.println(!conditionA);
		System.out.println(!conditionB);
		
		
		
		

	}

}
