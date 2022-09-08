package day04_operators;

public class ArthmeticOperator {
	
	public static void main(String[] args) {
		
	// + , - , * , / , % , ++ , --
		
	int a = 10;
	int b = 20;
	
	System.out.println(a+b); // 30
	
	System.out.println(b-a); // 10
	
	System.out.println(a*b); // 200
	
	System.out.println(b/a); // 2
	
	System.out.println(a/b); // 0 can not hold decimal
	
	System.out.println(10/3); // 3 can not hold decimal
	
	System.out.println(a-b); // -10
	
	
	double result = a / b;
	
	System.out.println(result);
	
	double valueA = a;
	double valueB = b;
	
	double result2 = valueA/valueB;
	
	System.out.println(result2);
	
	
	// ++
	
	int valueC = 1;
	System.out.println(valueC);
	
	valueC = valueC +1;
	valueC = valueC +1;
	System.out.println(valueC); // 3
	valueC++; //valueC = valueC +1;
	
	System.out.println(valueC); // 4
	
	valueC++;
	valueC++;
	valueC++;
	valueC++;
	
	System.out.println(valueC); // 8
	
	valueC = valueC -1;
	System.out.println(valueC); // 7
	
	valueC--;
	System.out.println(valueC); // 6
	
	valueC--;
	valueC--;
	valueC--;
	valueC--;
	valueC--;
	valueC--;
	System.out.println(valueC); // 0
	
	valueC--;
	valueC--;
	valueC--;
	valueC--;
	valueC--;
	valueC--;
	System.out.println(valueC); // -6
	
	
	// %
	
	int A = 10;
	int B = 3;
	
	System.out.println(A/B);
	
	System.out.println(A%B); // (3 , 3 , 3 , 1)
	
	System.out.println(10%4); // (4 , 4 , 2)
	
	System.out.println(10%5); // (5 , 5)
	
	System.out.println(10%2);
	System.out.println(11%2);
	
	System.out.println(99 % 2 == 1); // true
	
	System.out.println(500%2 == 1); // false
	System.out.println(500%2 == 0);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
