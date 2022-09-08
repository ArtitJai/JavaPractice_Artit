package day23_6thReview;

public class SwapVariable {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		
		// x = 2, y = 1
		
//		x = y; // x = 2, y = 2;
//		
//		y = x; //
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + "y:"+ y);
		

	}

}
