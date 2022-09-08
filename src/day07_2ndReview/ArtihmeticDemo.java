package day07_2ndReview;

public class ArtihmeticDemo {

	public static void main(String[] args) {
		
		// + , - , *(Asterisk)
		/*
		          /(Division)
		 */
		
		
		
	
	int result = 5/2; //2.5 => 2
	
	double result2 = 5.0/2.0; // no decimal going to get result => 2.0
	System.out.println(result2);
	
	int result3 = 9%10; // if behind bigger than, get the first number =>9
	System.out.println(result3);
	
	// precedence of Arithmetic Operator
			/*
			 *1. ()
			 *2. * , / , % (if same class in line calculate left to right)
			 *3. + , -
			 */
	int result4 = 9 % (10 + 2) * 3; // 12 * 3 = 36, 9 % 36=>27
	System.out.println(result4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
