package day15_4thReview;

public class ContinueStatement {

	public static void main(String[] args) {

		// Continue, take java back to the beginning of the loop
		
		int n = 10;
//		for(int i = 0; i < n; i ++) {
//			if(i % 2 != 0) { // check odd number
//				continue; // go back to line 11, (not execute line 14)
//			}
//			System.out.print(i+" "); // print even number from 0 - n
//		}
		
		for(int i = 0; i < n; i ++) {
			if(i % 2 == 0) { // check even number
				System.out.print(i+" ");
			}
		}
		
		
	}

}
