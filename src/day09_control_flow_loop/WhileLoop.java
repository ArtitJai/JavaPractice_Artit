package day09_control_flow_loop;

public class WhileLoop {

	public static void main(String[] args) {

		
		/*		
int i = 0;

while(i < 5) {
	System.out.println(i);
	break;
}


while (i<5) {
	System.out.println(i);
	
	i=6;
}


while (i<5) {
	System.out.println(i);
	
	i++;
}
*/

		
		int x = 10;
		int y = 20;
		
		while(x < y) {
		System.out.println("Value of x is "+x);	
		x++;
		}

		
		// if(condition) {your statement}
		// while(condition) {your statement}
		
		if(true) {
			System.out.println("Hello cohort 11");
		}
		
		System.out.println("------------------------");
		
		// while(true) {
		//System.out.println("Hello cohort 11");
		//}
		
		int count = 1;
		
		while(true) {
			System.out.println("Hello cohort 11");
			
			if (count == 5) {
				break;
			}
			count++;
		}
		
		
		
		
		
		
	}

}
