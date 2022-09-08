package day09_control_flow_loop;

public class SwitchStatementWithoutBreak {

	public static void main(String[] args) {
		

		char grade = 'D';
		
		
			switch(grade) 
			{
			case 'A':
			case 'B':
			case 'C':
			case 'D':
		System.out.println("Pass");
		break;
			case 'W':
		System.out.println("Withdraw");
		break;
			case 'I':
		System.out.println("Incomplete");
		break;	
			default:
		System.out.println("Failed");
		
			}
			
		
	
		
		if (grade == 'A') {
			System.out.println("Pass");
		}
		else if (grade == 'A') {
			System.out.println("Pass");
		}
		else if (grade == 'B') {
			System.out.println("Pass");
		}
		else if (grade == 'C') {
			System.out.println("Pass");
		}
		else if (grade == 'D') {
			System.out.println("Pass");
		}
		else if (grade == 'W') {
			System.out.println("Withdraw");
		}
		else if (grade == 'I') {
			System.out.println("Incomplete");
		}
		else {
			System.out.println("Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
