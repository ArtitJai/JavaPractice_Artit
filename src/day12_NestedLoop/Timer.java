package day12_NestedLoop;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 1 ; i >= 0 ; i--) {
//			System.out.println(i);
			for ( int j = 59 ; j >= 0 ; j--) {
				System.out.println(i+":"+j);
				Thread.sleep(1000);
			}
			
		}
		
		
		
		
		
		
//		for ( int j = 59 ; j >= 0 ; j--) {
//			System.out.println(j);
//		}
		
		
		
		
		
		

	}

}
