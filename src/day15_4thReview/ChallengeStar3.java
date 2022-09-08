package day15_4thReview;

public class ChallengeStar3 {

	public static void main(String[] args) {
		
		/*
		 *****
		 -*****
		 --*****
		 ---*****
		 ----*****
		 */
		
		 char star = '*';
	      char space = ' ';
	      int n = 5;

	      for (int i = 0; i < n; i++) { // run 5 times
	         // space loop                 
	         for (int j = 0; j < i; j++) {
	            System.out.print(space);
	         }
	      // star loop
	         for (int j = 0; j < n; j++) { // run 5 times
	            System.out.print(star); // print 5 stars
	         }

	         System.out.println();
	      }
	}

}
