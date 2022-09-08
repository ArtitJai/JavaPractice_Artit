package day09_control_flow_loop;

public class ForLoop {

	public static void main(String[] args) {
		
		
	int count = 1;
	
	while (count <= 10) {
		System.out.println(count);
		count++;
	}
		
	System.out.println("========================");
//	if () {}	
	
	for(int i = 1; i <= 10; i++) {
		System.out.println("Hello");
	}
		
	for(int i = 1; i <= 10; i++) {
		System.out.println(i);
	}	
	
	System.out.println("========================");
	
	for(int i = 1; i < 101; i++) {
		System.out.println(i);
	}	
		
		
	System.out.println("========================");
	
//	Create a for that can print from 10 30
	
	
	for(int a = 10; a <= 30; a++) {
		System.out.println(a);
	}	
		
	System.out.println("========================");	
	

	for(int b = 50; b >= 25; b--) {
		System.out.println(b);
	}	
	
	
	
	

	}

}
