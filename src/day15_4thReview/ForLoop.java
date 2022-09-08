package day15_4thReview;

public class ForLoop {

	public static void main(String[] args) {
		
		
		 // to access multi-dimension structure int[][], table.

	      for (int row = 1; row <= 8; row++) { // row
	         for (int column = 0; column < 5; column++) { // column
	            System.out.print(column+" ");
	         }
	         System.out.println();
	      }
	      
	      
	      for (int i = 1; i <= 8; i++) { // row
	    	  System.out.println(i);
	    	  if(i == 5) break; // This will break out of the loop
	      }
	
	
	
	
	
	
	}

}
