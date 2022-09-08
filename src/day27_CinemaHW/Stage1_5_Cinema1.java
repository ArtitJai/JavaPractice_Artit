package day27_CinemaHW;

public class Stage1_5_Cinema1 {

	public static void main(String[] args) {
		
	final char [][] field = new char [7][8];
		
		System.out.println("  1 2 3 4 5 6 7 8");
		for (int k = 0; k < 7; k++) {
			System.out.print(k + 1 + " ");
			for (int l = 0; l <8; l++ ) {
				field[k][l] = 'S';
				System.out.print(field[k][l]+ " ");
			}
			System.out.println();
		}
				
		
	}
		
}
	

	

