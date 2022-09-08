package day08_control_flow;

public class HomeworkReview {

	public static void main(String[] args) {
		
		// Biggest Number
		// n1 = 4.5, n2 = -3, n3 = 10;
		
		double n1 = 4.5;
		double n2 = -3;
		double n3 = 10;
		
		//	if(condition) {
		//  your statement
		//	}
		
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("n1 <"+n1+"> is bigger");
			}
		}
		
		if (n2 > n1) {
			if (n2 > n3) {
				System.out.println("n2 <"+n2+"> is bigger");
			}
		}
		
		if (n3 > n1) {
			if (n3 > n2) {
				System.out.println("n3 <"+n3+"> is bigger");
			}
		}
		
		// Logical && AND
		
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("n1 <"+n1+"> is bigger");
		}
		
		if (n2 > n1 && n2 > n3) {
			System.out.println("n2 <"+n2+"> is bigger");
		}
		
		if (n3 > n1 && n3 > n2) {
			System.out.println("n3 <"+n3+"> is bigger");
		}
		
		
		
		

	}

}
